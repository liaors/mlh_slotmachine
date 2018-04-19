package com.maoye.mlh_slotmachine.mlh.home;


import com.maoye.mlh_slotmachine.bean.HomeBean;
import com.maoye.mlh_slotmachine.mvp.BasePresenter;
import com.maoye.mlh_slotmachine.mvp.BaseView;

import java.util.List;


public class HomeContract {
    interface View extends BaseView {
    }

    interface  Presenter extends BasePresenter<View> {
         void  homedata(String deviceNo);
         void  statisticClickNum(int adId);
        List<List<HomeBean.ListBeanX>> handerGoodsData(List<HomeBean.ListBeanX> listBeanXES);
    }
}