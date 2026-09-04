package org.apache.tools.ant.util.regexp;

import com.umeng.analytics.pro.ak;

/* JADX INFO: compiled from: RegexpUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public class g {
    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        int iC = c(!str.contains("i"), str.contains("m"), str.contains(ak.aB));
        return str.contains("g") ? iC | 16 : iC;
    }

    public static int b(boolean z10) {
        return c(z10, false, false);
    }

    public static int c(boolean z10, boolean z11, boolean z12) {
        int i10 = !z10 ? 256 : 0;
        if (z11) {
            i10 |= 4096;
        }
        return z12 ? i10 | 65536 : i10;
    }

    public static boolean d(int i10, int i11) {
        return (i10 & i11) > 0;
    }

    public static int e(int i10, int i11) {
        return i10 & ((-1) - i11);
    }
}
