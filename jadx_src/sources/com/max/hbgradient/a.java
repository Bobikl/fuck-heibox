package com.max.hbgradient;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.jvm.internal.f0;
import qc.b;

/* JADX INFO: compiled from: GradientDrawableBuild.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    private static final Shader a(Context context, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, c.g.f33046q4, new Class[]{Context.class, Boolean.TYPE}, Shader.class);
        if (patchProxyResultProxy.isSupported) {
            return (Shader) patchProxyResultProxy.result;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i10 = displayMetrics.heightPixels;
        float fApplyDimension = TypedValue.applyDimension(1, 190.0f, displayMetrics);
        int color = z10 ? context.getColor(R.color.mask_max_login_top_bottom_day) : context.getColor(R.color.background_layer_2_color_alpha30_day_night);
        float f10 = i10;
        return new LinearGradient(0.0f, 0.0f, 0.0f, f10, new int[]{color, z10 ? context.getColor(R.color.mask_max_login_center_day) : context.getColor(R.color.background_layer_2_color_alpha90_day_night), color}, new float[]{0.0f, fApplyDimension / f10, 1.0f}, Shader.TileMode.CLAMP);
    }

    @d
    public static final Drawable b(@d Context context, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, c.g.f33026p4, new Class[]{Context.class, Boolean.TYPE}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        return new b(a(context, z10));
    }
}
