package com.github.mikephil.charting.utils;

import android.content.res.Resources;
import android.graphics.Color;
import bb.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ColorTemplate {
    public static final int COLOR_NONE = 1122867;
    public static final int COLOR_SKIP = 1122868;
    public static final int[] LIBERTY_COLORS = {Color.rgb(207, c.b.O1, c.b.M1), Color.rgb(148, 212, 212), Color.rgb(136, 180, 187), Color.rgb(118, c.b.f30918s0, c.b.f30940t0), Color.rgb(42, 109, 130)};
    public static final int[] JOYFUL_COLORS = {Color.rgb(217, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120), Color.rgb(106, 167, 134), Color.rgb(53, 194, 209)};
    public static final int[] PASTEL_COLORS = {Color.rgb(64, 89, 128), Color.rgb(149, 165, 124), Color.rgb(217, 184, 162), Color.rgb(c.b.J0, 134, 134), Color.rgb(c.b.f31028x0, 48, 80)};
    public static final int[] COLORFUL_COLORS = {Color.rgb(193, 37, 82), Color.rgb(255, 102, 0), Color.rgb(c.b.L1, 199, 0), Color.rgb(106, 150, 31), Color.rgb(c.b.f31028x0, 100, 53)};
    public static final int[] VORDIPLOM_COLORS = {Color.rgb(192, 255, 140), Color.rgb(255, 247, 140), Color.rgb(255, 208, 140), Color.rgb(140, c.b.A1, 255), Color.rgb(255, 140, c.b.f30528b0)};
    public static final int[] MATERIAL_COLORS = {rgb("#2ecc71"), rgb("#f1c40f"), rgb("#e74c3c"), rgb("#3498db")};

    public static int colorWithAlpha(int i10, int i11) {
        return (i10 & 16777215) | ((i11 & 255) << 24);
    }

    public static List<Integer> createColors(Resources resources, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(resources.getColor(i10)));
        }
        return arrayList;
    }

    public static List<Integer> createColors(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static int getHoloBlue() {
        return Color.rgb(51, 181, c.b.f30985v1);
    }

    public static int rgb(String str) {
        int i10 = (int) Long.parseLong(str.replace("#", ""), 16);
        return Color.rgb((i10 >> 16) & 255, (i10 >> 8) & 255, (i10 >> 0) & 255);
    }
}
