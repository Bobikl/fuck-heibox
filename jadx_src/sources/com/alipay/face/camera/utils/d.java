package com.alipay.face.camera.utils;

import android.graphics.Rect;

/* JADX INFO: compiled from: ImageUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class d {
    public static Rect a(int i10, int i11, int i12, int i13) {
        float f10 = (i10 * 1.0f) / i11;
        float f11 = (i12 * 1.0f) / i13;
        Rect rect = new Rect();
        if (f10 >= f11) {
            int i14 = (i12 * i11) / i13;
            int i15 = (i10 - i14) / 2;
            rect.left = i15;
            rect.right = i15 + i14;
            rect.top = 0;
            rect.bottom = i11;
        } else {
            rect.left = 0;
            rect.right = i10;
            int i16 = (i13 * i10) / i12;
            int i17 = (i11 - i16) / 2;
            rect.top = i17;
            rect.bottom = i17 + i16;
        }
        return rect;
    }
}
