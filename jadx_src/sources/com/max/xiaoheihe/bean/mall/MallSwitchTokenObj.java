package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class MallSwitchTokenObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2223882730227067538L;
    private String redeemable_token;

    public String getRedeemable_token() {
        return this.redeemable_token;
    }

    public void setRedeemable_token(String str) {
        this.redeemable_token = str;
    }
}
