package com.maoye.mlh_slotmachine.bean;

import java.util.List;

/**
 * Created by Rs on 2018/5/16.
 */

public class QuickOrderDetialsBean {

    /**
     * saleNo : 10012018051699990005
     * shopNo : 1001
     * vipNo : null
     * vipPhone : null
     * vipName : null
     * userNo : 9999
     * terminalNo : 9999
     * count : 0
     * startDate : null
     * endDate : null
     * salePrice : 0
     * createTime : 1526438498000
     * payTime : null
     * createDateString : 20180516
     * billStatus : 0
     * isReturn : 0
     * saleNoSource : null
     * saledList : [{"id":1963,"saleNo":"10012018051699990005","barcode":"0100896301","goodsName":"暇步士","saleNum":1,"realPrice":1,"salePrice":1,"isReturn":null,"vipIntegral":0,"rowNo":1,"vipIntegralReward":0,"discAmount":0,"giveAmount":0,"promNo":"100120170520","promPolicyId":"1022","saleAmount":1,"couponAmount":0.67}]
     * salepayList : []
     * saleMac : 04
     * barcodes : null
     * haveInvoice : null
     * discountType : 4
     * saleAmount : null
     */

    private String saleNo;
    private String shopNo;
    private Object vipNo;
    private Object vipPhone;
    private Object vipName;
    private String userNo;
    private String terminalNo;
    private int count;
    private Object startDate;
    private Object endDate;
    private double salePrice;
    private long createTime;
    private Object payTime;
    private String createDateString;
    private int billStatus;
    private int isReturn;
    private Object saleNoSource;
    private String saleMac;
    private Object barcodes;
    private Object haveInvoice;
    private int discountType;
    private double saleAmount;
    private List<SaledListBean> saledList;
    private List<?> salepayList;

    public String getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(String saleNo) {
        this.saleNo = saleNo;
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    public Object getVipNo() {
        return vipNo;
    }

    public void setVipNo(Object vipNo) {
        this.vipNo = vipNo;
    }

    public Object getVipPhone() {
        return vipPhone;
    }

    public void setVipPhone(Object vipPhone) {
        this.vipPhone = vipPhone;
    }

    public Object getVipName() {
        return vipName;
    }

    public void setVipName(Object vipName) {
        this.vipName = vipName;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getTerminalNo() {
        return terminalNo;
    }

    public void setTerminalNo(String terminalNo) {
        this.terminalNo = terminalNo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getStartDate() {
        return startDate;
    }

    public void setStartDate(Object startDate) {
        this.startDate = startDate;
    }

    public Object getEndDate() {
        return endDate;
    }

    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public Object getPayTime() {
        return payTime;
    }

    public void setPayTime(Object payTime) {
        this.payTime = payTime;
    }

    public String getCreateDateString() {
        return createDateString;
    }

    public void setCreateDateString(String createDateString) {
        this.createDateString = createDateString;
    }

    public int getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(int billStatus) {
        this.billStatus = billStatus;
    }

    public int getIsReturn() {
        return isReturn;
    }

    public void setIsReturn(int isReturn) {
        this.isReturn = isReturn;
    }

    public Object getSaleNoSource() {
        return saleNoSource;
    }

    public void setSaleNoSource(Object saleNoSource) {
        this.saleNoSource = saleNoSource;
    }

    public String getSaleMac() {
        return saleMac;
    }

    public void setSaleMac(String saleMac) {
        this.saleMac = saleMac;
    }

    public Object getBarcodes() {
        return barcodes;
    }

    public void setBarcodes(Object barcodes) {
        this.barcodes = barcodes;
    }

    public Object getHaveInvoice() {
        return haveInvoice;
    }

    public void setHaveInvoice(Object haveInvoice) {
        this.haveInvoice = haveInvoice;
    }

    public int getDiscountType() {
        return discountType;
    }

    public void setDiscountType(int discountType) {
        this.discountType = discountType;
    }

    public double getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(double saleAmount) {
        this.saleAmount = saleAmount;
    }

    public List<SaledListBean> getSaledList() {
        return saledList;
    }

    public void setSaledList(List<SaledListBean> saledList) {
        this.saledList = saledList;
    }

    public List<?> getSalepayList() {
        return salepayList;
    }

    public void setSalepayList(List<?> salepayList) {
        this.salepayList = salepayList;
    }

    public static class SaledListBean {
        /**
         * id : 1963
         * saleNo : 10012018051699990005
         * barcode : 0100896301
         * goodsName : 暇步士
         * saleNum : 1
         * realPrice : 1
         * salePrice : 1
         * isReturn : null
         * vipIntegral : 0
         * rowNo : 1
         * vipIntegralReward : 0
         * discAmount : 0
         * giveAmount : 0
         * promNo : 100120170520
         * promPolicyId : 1022
         * saleAmount : 1
         * couponAmount : 0.67
         */

        private int id;
        private String saleNo;
        private String barcode;
        private String goodsName;
        private int saleNum;
        private double realPrice;
        private double salePrice;
        private Object isReturn;
        private int vipIntegral;
        private int rowNo;
        private int vipIntegralReward;
        private double discAmount;
        private double giveAmount;
        private String promNo;
        private String promPolicyId;
        private double saleAmount;
        private double couponAmount;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSaleNo() {
            return saleNo;
        }

        public void setSaleNo(String saleNo) {
            this.saleNo = saleNo;
        }

        public String getBarcode() {
            return barcode;
        }

        public void setBarcode(String barcode) {
            this.barcode = barcode;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public void setGoodsName(String goodsName) {
            this.goodsName = goodsName;
        }

        public int getSaleNum() {
            return saleNum;
        }

        public void setSaleNum(int saleNum) {
            this.saleNum = saleNum;
        }

        public double getRealPrice() {
            return realPrice;
        }

        public void setRealPrice(double realPrice) {
            this.realPrice = realPrice;
        }

        public double getSalePrice() {
            return salePrice;
        }

        public void setSalePrice(double salePrice) {
            this.salePrice = salePrice;
        }

        public Object getIsReturn() {
            return isReturn;
        }

        public void setIsReturn(Object isReturn) {
            this.isReturn = isReturn;
        }

        public int getVipIntegral() {
            return vipIntegral;
        }

        public void setVipIntegral(int vipIntegral) {
            this.vipIntegral = vipIntegral;
        }

        public int getRowNo() {
            return rowNo;
        }

        public void setRowNo(int rowNo) {
            this.rowNo = rowNo;
        }

        public int getVipIntegralReward() {
            return vipIntegralReward;
        }

        public void setVipIntegralReward(int vipIntegralReward) {
            this.vipIntegralReward = vipIntegralReward;
        }

        public double getDiscAmount() {
            return discAmount;
        }

        public void setDiscAmount(double discAmount) {
            this.discAmount = discAmount;
        }

        public double getGiveAmount() {
            return giveAmount;
        }

        public void setGiveAmount(double giveAmount) {
            this.giveAmount = giveAmount;
        }

        public String getPromNo() {
            return promNo;
        }

        public void setPromNo(String promNo) {
            this.promNo = promNo;
        }

        public String getPromPolicyId() {
            return promPolicyId;
        }

        public void setPromPolicyId(String promPolicyId) {
            this.promPolicyId = promPolicyId;
        }

        public double getSaleAmount() {
            return saleAmount;
        }

        public void setSaleAmount(double saleAmount) {
            this.saleAmount = saleAmount;
        }

        public double getCouponAmount() {
            return couponAmount;
        }

        public void setCouponAmount(double couponAmount) {
            this.couponAmount = couponAmount;
        }
    }
}
