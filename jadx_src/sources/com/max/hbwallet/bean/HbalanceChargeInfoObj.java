package com.max.hbwallet.bean;

import com.max.hbpay.bean.PayTypeInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class HbalanceChargeInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5276961808076498197L;
    private WalletBalanceObj hbalance;
    private List<PayTypeInfoObj> payment_list;
    private List<String> recommend_charge_list;
    private String tips;
    private WalletUserObj user_profile;

    public WalletBalanceObj getHbalance() {
        return this.hbalance;
    }

    public List<PayTypeInfoObj> getPayment_list() {
        return this.payment_list;
    }

    public List<String> getRecommend_charge_list() {
        return this.recommend_charge_list;
    }

    public String getTips() {
        return this.tips;
    }

    public WalletUserObj getUser_profile() {
        return this.user_profile;
    }

    public void setHbalance(WalletBalanceObj walletBalanceObj) {
        this.hbalance = walletBalanceObj;
    }

    public void setPayment_list(List<PayTypeInfoObj> list) {
        this.payment_list = list;
    }

    public void setRecommend_charge_list(List<String> list) {
        this.recommend_charge_list = list;
    }

    public void setTips(String str) {
        this.tips = str;
    }

    public void setUser_profile(WalletUserObj walletUserObj) {
        this.user_profile = walletUserObj;
    }
}
