package com.previewlibrary.view;

import android.content.Context;
import com.previewlibrary.R;

/* JADX INFO: compiled from: ImageUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {
    public static int a(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.yms_dimens_50_0_px);
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : dimensionPixelSize;
    }

    public static boolean b(float f10, float f11, float f12, float f13, long j10, long j11, long j12) {
        return Math.abs(f12 - f10) <= 10.0f && Math.abs(f13 - f11) <= 10.0f && j11 - j10 >= j12;
    }
}
