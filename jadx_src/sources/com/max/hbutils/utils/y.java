package com.max.hbutils.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ViewUtilsNew.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class y {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final int a(@dl.d Context context, float f10) {
        DisplayMetrics displayMetrics;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, null, changeQuickRedirect, true, bb.c.k.Uv, new Class[]{Context.class, Float.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(context, "context");
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return 0;
        }
        return (int) ((f10 * displayMetrics.density) + 0.5f);
    }
}
