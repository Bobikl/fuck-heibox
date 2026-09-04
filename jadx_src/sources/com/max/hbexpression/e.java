package com.max.hbexpression;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ExpressionKeyboardManager.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final String f70194a = "hide_img_pack";
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    public static final q a(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.g.f32742b, new Class[]{Boolean.TYPE}, q.class);
        if (patchProxyResultProxy.isSupported) {
            return (q) patchProxyResultProxy.result;
        }
        if (!ad.a.a(ad.a.A, false)) {
            return ExpressionShowFragmentV2.f69986o.a(z10);
        }
        n nVarW3 = n.W3(z10);
        f0.m(nVarW3);
        return nVarW3;
    }

    public static /* synthetic */ q b(boolean z10, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.g.f32762c, new Class[]{Boolean.TYPE, Integer.TYPE, Object.class}, q.class);
        if (patchProxyResultProxy.isSupported) {
            return (q) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }
}
