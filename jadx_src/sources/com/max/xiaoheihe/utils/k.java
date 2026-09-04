package com.max.xiaoheihe.utils;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.max.xiaoheihe.bean.game.recommend.GradientColorObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: compiled from: GradientColorUtil.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final k f95676a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f95677b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private k() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    @dl.e
    public final Drawable a(@dl.e GradientColorObj gradientColorObj, int i10, float f10) {
        GradientDrawable.Orientation orientation;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gradientColorObj, new Integer(i10), new Float(f10)}, this, changeQuickRedirect, false, 48735, new Class[]{GradientColorObj.class, Integer.TYPE, Float.TYPE}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        if (gradientColorObj == null) {
            return null;
        }
        String direction = gradientColorObj.getDirection();
        if (direction != null) {
            switch (direction) {
                case "b_t":
                    orientation = GradientDrawable.Orientation.BOTTOM_TOP;
                    break;
                case "l_r":
                    orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                    break;
                case "r_l":
                    orientation = GradientDrawable.Orientation.RIGHT_LEFT;
                    break;
                case "t_b":
                    orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                    break;
                case "lb_rt":
                    orientation = GradientDrawable.Orientation.BL_TR;
                    break;
                case "lt_rb":
                    orientation = GradientDrawable.Orientation.TL_BR;
                    break;
                case "rb_lt":
                    orientation = GradientDrawable.Orientation.BR_TL;
                    break;
                case "rt_lb":
                    orientation = GradientDrawable.Orientation.TR_BL;
                    break;
                default:
                    orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                    break;
            }
        } else {
            orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, ArraysKt___ArraysKt.dz(new Integer[]{Integer.valueOf(Color.parseColor(gradientColorObj.getStart_color())), Integer.valueOf(Color.parseColor(gradientColorObj.getEnd_color()))}));
        gradientDrawable.setShape(i10);
        if (i10 == 0) {
            gradientDrawable.setCornerRadius(f10);
        }
        return gradientDrawable;
    }

    @dl.e
    public final Drawable b(@dl.e GradientColorObj gradientColorObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gradientColorObj}, this, changeQuickRedirect, false, 48736, new Class[]{GradientColorObj.class}, Drawable.class);
        return patchProxyResultProxy.isSupported ? (Drawable) patchProxyResultProxy.result : a(gradientColorObj, 1, 0.0f);
    }

    @dl.e
    public final Drawable c(@dl.e GradientColorObj gradientColorObj, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gradientColorObj, new Float(f10)}, this, changeQuickRedirect, false, 48737, new Class[]{GradientColorObj.class, Float.TYPE}, Drawable.class);
        return patchProxyResultProxy.isSupported ? (Drawable) patchProxyResultProxy.result : a(gradientColorObj, 0, f10);
    }
}
