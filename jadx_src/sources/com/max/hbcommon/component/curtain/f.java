package com.max.hbcommon.component.curtain;

import android.graphics.Rect;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: HollowInfo.java */
/* JADX INFO: loaded from: classes9.dex */
public class f {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f67552g = 29;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f67553h = 1610612736;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f67554i = 536870912;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f67555j = 1073741824;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f67556k = 1610612736;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f67557a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f67558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f67559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Rect f67560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f67561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public hb.c f67562f;

    /* JADX INFO: compiled from: HollowInfo.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public f(View view) {
        this.f67559c = view;
    }

    public int a(int i10) {
        int i11 = this.f67558b;
        if ((1610612736 & i11) == i10) {
            return (-1610612737) & i11;
        }
        return 0;
    }

    public boolean b() {
        return this.f67557a;
    }

    public void c(boolean z10) {
        this.f67557a = z10;
    }

    public void d(int i10, int i11) {
        this.f67558b = (i10 & (-1610612737)) | (i11 & 1610612736);
    }

    public void e(hb.c cVar) {
        this.f67562f = cVar;
    }

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.d.np, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (obj instanceof f) {
            return ((f) obj).f67559c == this.f67559c;
        }
        return super.equals(obj);
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.op, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : super.hashCode();
    }
}
