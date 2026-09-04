package com.alipay.face.camera.utils;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;

/* JADX INFO: compiled from: DisplayUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {
    public static int a(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static Point b(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static float c(Context context) {
        Point pointB = b(context);
        return pointB.y / pointB.x;
    }

    public static int d(Context context, float f10) {
        return (int) ((f10 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
