package com.max.xiaoheihe.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class CropRectObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 9103283378333403869L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f76935h;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f76936w;

    public String getH() {
        return this.f76935h;
    }

    public String getW() {
        return this.f76936w;
    }

    public void setH(String str) {
        this.f76935h = str;
    }

    public void setW(String str) {
        this.f76936w = str;
    }
}
