package com.heytap.openid.bean;

/* JADX INFO: loaded from: classes7.dex */
public final class OpenIDInfo {
    public static int Type_AAID = 2;
    public static int Type_OAID = 8;
    public static int Type_VAID = 4;
    public final String AAID;
    public final String OAID;
    public final boolean OAIDStatus;
    public final String VAID;

    public OpenIDInfo(String str, boolean z10, String str2, String str3) {
        this.OAID = str;
        this.OAIDStatus = z10;
        this.VAID = str2;
        this.AAID = str3;
    }

    public String getAAID() {
        return this.AAID;
    }

    public String getOAID() {
        return this.OAID;
    }

    public boolean getOAIDStatus() {
        return this.OAIDStatus;
    }

    public String getVAID() {
        return this.VAID;
    }
}
