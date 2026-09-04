package com.huawei.hms.scankit.p;

import android.graphics.Rect;

/* JADX INFO: compiled from: Zoom.java */
/* JADX INFO: loaded from: classes7.dex */
public class o8 {
    public static float a(int i10, int i11, u6[] u6VarArr) {
        float fAbs;
        float fAbs2;
        float f10 = 1.0f;
        if (u6VarArr.length < 3) {
            return 1.0f;
        }
        int i12 = 0;
        for (u6 u6Var : u6VarArr) {
            if (u6Var.d()) {
                i12++;
            }
        }
        if (r3.f62275a && !r3.f62276b && i12 < 2) {
            return 1.0f;
        }
        float fB = u6VarArr[0].b();
        float fB2 = u6VarArr[1].b();
        float fB3 = u6VarArr[2].b();
        float fC = u6VarArr[0].c();
        float fC2 = u6VarArr[1].c();
        float fC3 = u6VarArr[2].c();
        u6 u6VarA = a(fB, fC, fB2, fC2, fB3, fC3);
        float fB4 = u6VarA.b();
        float fC4 = u6VarA.c();
        float fMax = Math.max(Math.max(Math.max(fB, fB2), fB3), fB4);
        float fMin = Math.min(Math.min(Math.min(fB, fB2), fB3), fB4);
        float fMax2 = Math.max(Math.max(Math.max(fC, fC2), fC3), fC4);
        float fMin2 = Math.min(Math.min(Math.min(fC, fC2), fC3), fC4);
        int iMin = (int) (Math.min(i11, i10) * 0.85f);
        int i13 = (i10 - iMin) / 2;
        int i14 = (i11 - iMin) / 2;
        Rect rect = new Rect(i13, i14, iMin + i13, iMin + i14);
        if (fMin < rect.left && fMin2 < rect.top && fMax > rect.right && fMax2 > rect.bottom) {
            return 1.0f;
        }
        float fAbs3 = Math.abs(fMin2 - rect.top);
        float fAbs4 = Math.abs(fMin - rect.left);
        float fAbs5 = Math.abs(fMax - rect.right);
        float fAbs6 = Math.abs(fMax2 - rect.bottom);
        float f11 = (rect.left + rect.right) / 2.0f;
        float f12 = (rect.top + rect.bottom) / 2.0f;
        float fMin3 = Math.min(Math.min(Math.min(fAbs4, fAbs5), fAbs3), fAbs6);
        if (0.01f > Math.abs(fAbs4 - fMin3)) {
            fAbs = Math.abs(f11 - rect.left) * 1.0f;
            fAbs2 = Math.abs(f11 - fMin);
        } else if (0.01f > Math.abs(fAbs5 - fMin3)) {
            fAbs = Math.abs(f11 - rect.right) * 1.0f;
            fAbs2 = Math.abs(f11 - fMax);
        } else {
            if (0.01f <= Math.abs(fAbs3 - fMin3)) {
                if (0.01f > Math.abs(fAbs6 - fMin3)) {
                    fAbs = Math.abs(f12 - rect.bottom) * 1.0f;
                    fAbs2 = Math.abs(f12 - fMax2);
                }
                return Math.min(f10, 2.0f) * 0.9f;
            }
            fAbs = Math.abs(f12 - rect.top) * 1.0f;
            fAbs2 = Math.abs(f12 - fMin2);
        }
        f10 = fAbs / fAbs2;
        return Math.min(f10, 2.0f) * 0.9f;
    }

    private static u6 a(float f10, float f11, float f12, float f13, float f14, float f15) {
        return new u6((f10 + f14) - f12, (f11 + f15) - f13);
    }

    public static float b(int i10, int i11, u6[] u6VarArr) {
        float fAbs;
        float fAbs2;
        float f10 = 1.0f;
        if (u6VarArr.length < 3) {
            return 1.0f;
        }
        float fB = u6VarArr[0].b();
        float fB2 = u6VarArr[1].b();
        float fB3 = u6VarArr[2].b();
        float fC = u6VarArr[0].c();
        float fC2 = u6VarArr[1].c();
        float fC3 = u6VarArr[2].c();
        float fMax = Math.max(Math.max(fB, fB2), fB3);
        float fMin = Math.min(Math.min(fB, fB2), fB3);
        float fMax2 = Math.max(Math.max(fC, fC2), fC3);
        float fMin2 = Math.min(Math.min(fC, fC2), fC3);
        int iMin = (int) (Math.min(i11, i10) * 0.1f);
        Rect rect = new Rect(iMin, iMin, i10 - iMin, i11 - iMin);
        if (fMin < rect.left && fMin2 < rect.top && fMax > rect.right && fMax2 > rect.bottom) {
            return 1.0f;
        }
        float fAbs3 = Math.abs(fMax - rect.right);
        float fAbs4 = Math.abs(fMax2 - rect.bottom);
        float fAbs5 = Math.abs(fMin2 - rect.top);
        float fAbs6 = Math.abs(fMin - rect.left);
        float f11 = (rect.left + rect.right) / 2.0f;
        float f12 = (rect.top + rect.bottom) / 2.0f;
        float fMin3 = Math.min(Math.min(Math.min(fAbs6, fAbs3), fAbs5), fAbs4);
        if (0.01f > Math.abs(fAbs6 - fMin3)) {
            fAbs = Math.abs(f11 - rect.left);
            fAbs2 = Math.abs(f11 - fMin);
        } else if (0.01f > Math.abs(fAbs3 - fMin3)) {
            fAbs = Math.abs(f11 - rect.right);
            fAbs2 = Math.abs(f11 - fMax);
        } else {
            if (0.01f <= Math.abs(fAbs5 - fMin3)) {
                if (0.01f > Math.abs(fAbs4 - fMin3)) {
                    fAbs = Math.abs(f12 - rect.bottom);
                    fAbs2 = Math.abs(f12 - fMax2);
                }
                return Math.min(f10, 2.0f) * 0.9f;
            }
            fAbs = Math.abs(f12 - rect.top);
            fAbs2 = Math.abs(f12 - fMin2);
        }
        f10 = fAbs / fAbs2;
        return Math.min(f10, 2.0f) * 0.9f;
    }
}
