package com.max.hbcommon.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class EncryptionParamsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -7556754465538979129L;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private String f66936p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private String f66937p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private String f66938p3;

    public String getP1() {
        return this.f66936p1;
    }

    public String getP2() {
        return this.f66937p2;
    }

    public String getP3() {
        return this.f66938p3;
    }

    public void setP1(String str) {
        this.f66936p1 = str;
    }

    public void setP2(String str) {
        this.f66937p2 = str;
    }

    public void setP3(String str) {
        this.f66938p3 = str;
    }
}
