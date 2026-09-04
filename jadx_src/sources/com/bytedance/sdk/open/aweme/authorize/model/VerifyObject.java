package com.bytedance.sdk.open.aweme.authorize.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class VerifyObject {

    @SerializedName("verify_openid")
    public String verifyOpenId;

    @SerializedName("verify_scope")
    public String verifyScope;

    @SerializedName("verify_tic")
    public String verifyTic;

    public VerifyObject(String str, String str2, String str3) {
        this.verifyScope = str;
        this.verifyTic = str2;
        this.verifyOpenId = str3;
    }
}
