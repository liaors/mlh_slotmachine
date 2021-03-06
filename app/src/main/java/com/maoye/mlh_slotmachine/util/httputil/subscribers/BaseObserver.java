package com.maoye.mlh_slotmachine.util.httputil.subscribers;

import android.accounts.NetworkErrorException;
import android.content.Context;

import com.google.gson.JsonSyntaxException;
import com.maoye.mlh_slotmachine.util.MyContext;
import com.maoye.mlh_slotmachine.util.Toast;
import com.maoye.mlh_slotmachine.util.httputil.ApiException;
import com.maoye.mlh_slotmachine.util.httputil.progress.ProgressDialogHandler;


import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.TimeoutException;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import retrofit2.HttpException;


public abstract class BaseObserver<T>  implements Observer<T> {
    private ProgressDialogHandler mProgressDialogHandler;
    protected abstract void onBaseNext(T data);
    protected abstract void onBaseError(Throwable t);
    private Context context;

    public BaseObserver(Context context) {
        this.context = context;
        mProgressDialogHandler = new ProgressDialogHandler(context, true);
    }

    public BaseObserver(Context context, boolean isShowDialog) {
        this.context = context;
        if (isShowDialog) mProgressDialogHandler = new ProgressDialogHandler(context, true);
    }

    private void showProgressDialog() {
        if (mProgressDialogHandler != null) {
            mProgressDialogHandler.obtainMessage(ProgressDialogHandler.SHOW_PROGRESS_DIALOG).sendToTarget();
        }
    }

    private void dismissProgressDialog() {
        if (mProgressDialogHandler != null) {
            mProgressDialogHandler.obtainMessage(ProgressDialogHandler.DISMISS_PROGRESS_DIALOG).sendToTarget();
            mProgressDialogHandler = null;
        }
    }



    /**
     * 对错误进行统一处理
     * 隐藏ProgressDialog
     *
     * @param e
     */
    @Override
    public void onError(Throwable e) {
        StringBuffer sb = new StringBuffer();
        if (e instanceof NetworkErrorException || e instanceof UnknownHostException||e instanceof ConnectException) {
            sb.append("网络异常");
        } else if (e instanceof SocketTimeoutException ||e instanceof InterruptedIOException ||e instanceof TimeoutException) {
            sb.append("请求超时");
        } else if(e instanceof JsonSyntaxException){
            sb.append("请求不合法");
        }else if (e instanceof  SocketTimeoutException){
            sb.append("连接超时");
        } else if (e instanceof HttpException){
            sb.append("服务器连接失败");//HTTP 500 internal Server Error
        }else if(e instanceof ApiException){
            sb.append(((ApiException) e).getMsg());
        }
        if(sb.length()==0 ){
            sb.append(ApiException.getMsg());
        }
        Toast.getInstance().toast(MyContext.appContext,sb+"",2);
        dismissProgressDialog();
         onBaseError(e);
    }

    @Override
    public void onComplete() {
        dismissProgressDialog();
    }

    @Override
    public void onSubscribe(Disposable d) {
        showProgressDialog();
    }

    /**
     * 将onNext方法中的返回结果交给Activity或Fragment自己处理
     *
     * @param t 创建Subscriber时的泛型类型
     */
    @Override
    public void onNext(T t) {
        if (null != t) {
            onBaseNext(t);
        }
    }
}