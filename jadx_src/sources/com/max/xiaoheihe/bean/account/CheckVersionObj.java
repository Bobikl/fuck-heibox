package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class CheckVersionObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2364817906943509185L;
    private String address;
    private BetaTestInfo beta_test;
    private String force_push;
    private String md5;
    private String msg;
    private String need_update;
    private String version;

    public String getAddress() {
        return this.address;
    }

    public BetaTestInfo getBeta_test() {
        return this.beta_test;
    }

    public String getForce_push() {
        return this.force_push;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getNeed_update() {
        return this.need_update;
    }

    public String getVersion() {
        return this.version;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setBeta_test(BetaTestInfo betaTestInfo) {
        this.beta_test = betaTestInfo;
    }

    public void setForce_push(String str) {
        this.force_push = str;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setNeed_update(String str) {
        this.need_update = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
