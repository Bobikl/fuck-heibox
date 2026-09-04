package com.max.hbcustomview.seekbar;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: SeekBarState.java */
/* JADX INFO: loaded from: classes10.dex */
public class g {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f69374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f69375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f69376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f69377d;

    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.gp, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "indicatorText: " + this.f69374a + " ,isMin: " + this.f69376c + " ,isMax: " + this.f69377d;
    }
}
