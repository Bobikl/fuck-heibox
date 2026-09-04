package com.max.xiaoheihe.accelworld;

import android.graphics.Color;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AccelWordImageView.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final float a(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.kv, new Class[]{Integer.TYPE}, Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : Color.alpha(i10) / 255.0f;
    }

    public static final int b(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.lv, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Color.argb(255, Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    public static final void c(@dl.d ImageView imageView, int i10) {
        if (PatchProxy.proxy(new Object[]{imageView, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.jv, new Class[]{ImageView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<this>");
        imageView.setColorFilter(b(i10));
        imageView.setAlpha(a(i10));
    }
}
