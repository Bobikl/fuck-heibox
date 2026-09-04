package com.max.xiaoheihe.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class SwitchProxyObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4707683894894301061L;
    private boolean can_activite;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private String f76939p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private String f76940p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private String f76941p3;

    public String getP1() {
        return this.f76939p1;
    }

    public String getP2() {
        return this.f76940p2;
    }

    public String getP3() {
        return this.f76941p3;
    }

    public boolean isCan_activite() {
        return this.can_activite;
    }

    public void setCan_activite(boolean z10) {
        this.can_activite = z10;
    }

    public void setP1(String str) {
        this.f76939p1 = str;
    }

    public void setP2(String str) {
        this.f76940p2 = str;
    }

    public void setP3(String str) {
        this.f76941p3 = str;
    }
}
