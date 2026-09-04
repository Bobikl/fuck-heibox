package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GamePurchaseConditionObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -606757741382002245L;
    private String agreement_title;
    private String coin;
    private String hbalance;
    private String pay_type;
    private String pay_url;
    private String service_agreement;
    private String valid;

    public String getAgreement_title() {
        return this.agreement_title;
    }

    public String getCoin() {
        return this.coin;
    }

    public String getHbalance() {
        return this.hbalance;
    }

    public String getPay_type() {
        return this.pay_type;
    }

    public String getPay_url() {
        return this.pay_url;
    }

    public String getService_agreement() {
        return this.service_agreement;
    }

    public String getValid() {
        return this.valid;
    }

    public void setAgreement_title(String str) {
        this.agreement_title = str;
    }

    public void setCoin(String str) {
        this.coin = str;
    }

    public void setHbalance(String str) {
        this.hbalance = str;
    }

    public void setPay_type(String str) {
        this.pay_type = str;
    }

    public void setPay_url(String str) {
        this.pay_url = str;
    }

    public void setService_agreement(String str) {
        this.service_agreement = str;
    }

    public void setValid(String str) {
        this.valid = str;
    }
}
