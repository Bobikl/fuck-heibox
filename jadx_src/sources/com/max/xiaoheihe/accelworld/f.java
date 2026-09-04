package com.max.xiaoheihe.accelworld;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: AccelWorldColor.kt */
/* JADX INFO: loaded from: classes3.dex */
@t0({"SMAP\nAccelWorldColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccelWorldColor.kt\ncom/max/xiaoheihe/accelworld/AccelWorldColorKt\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,54:1\n28#2:55\n*S KotlinDebug\n*F\n+ 1 AccelWorldColor.kt\ncom/max/xiaoheihe/accelworld/AccelWorldColorKt\n*L\n9#1:55\n*E\n"})
public final class f {
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    public static final ColorDrawable a(@dl.d String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.Lv, new Class[]{String.class}, ColorDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (ColorDrawable) patchProxyResultProxy.result;
        }
        f0.p(str, "<this>");
        return new ColorDrawable(com.max.hbutils.utils.a.d(str));
    }

    @dl.d
    public static final ColorDrawable b(@dl.d String hexString) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hexString}, null, changeQuickRedirect, true, bb.c.m.Mv, new Class[]{String.class}, ColorDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (ColorDrawable) patchProxyResultProxy.result;
        }
        f0.p(hexString, "hexString");
        return a(hexString);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @dl.d
    public static final GradientDrawable.Orientation c(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.Nv, new Class[]{String.class}, GradientDrawable.Orientation.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable.Orientation) patchProxyResultProxy.result;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case 97239:
                    if (str.equals("b_t")) {
                        return GradientDrawable.Orientation.BOTTOM_TOP;
                    }
                    break;
                case 106847:
                    if (str.equals("l_r")) {
                        return GradientDrawable.Orientation.LEFT_RIGHT;
                    }
                    break;
                case 112607:
                    if (str.equals("r_l")) {
                        return GradientDrawable.Orientation.RIGHT_LEFT;
                    }
                    break;
                case 114519:
                    if (str.equals("t_b")) {
                        return GradientDrawable.Orientation.TOP_BOTTOM;
                    }
                    break;
                case 102754731:
                    if (str.equals("lb_rt")) {
                        return GradientDrawable.Orientation.BL_TR;
                    }
                    break;
                case 103290951:
                    if (str.equals("lt_rb")) {
                        return GradientDrawable.Orientation.TL_BR;
                    }
                    break;
                case 108295671:
                    if (str.equals("rb_lt")) {
                        return GradientDrawable.Orientation.BR_TL;
                    }
                    break;
                case 108831891:
                    if (str.equals("rt_lb")) {
                        return GradientDrawable.Orientation.TR_BL;
                    }
                    break;
            }
        }
        return GradientDrawable.Orientation.BL_TR;
    }
}
