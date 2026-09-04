package com.huawei.hms.scankit.p;

import com.tencent.qcloud.core.util.IOUtils;

/* JADX INFO: compiled from: CodaBarWriter.java */
/* JADX INFO: loaded from: classes7.dex */
public final class q0 extends h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f62234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f62235b = {'T', 'N', '*', 'E'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f62236c = {IOUtils.DIR_SEPARATOR_UNIX, ':', '+', lg.a.f131414g};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char f62237d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f62234a = cArr;
        f62237d = cArr[0];
    }

    @Override // com.huawei.hms.scankit.p.h5
    public boolean[] a(String str) {
        int i10;
        if (str.length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            char c10 = f62237d;
            sb2.append(c10);
            sb2.append(str);
            sb2.append(c10);
            str = sb2.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f62234a;
            boolean zA = p0.a(cArr, upperCase);
            boolean zA2 = p0.a(cArr, upperCase2);
            char[] cArr2 = f62235b;
            boolean zA3 = p0.a(cArr2, upperCase);
            boolean zA4 = p0.a(cArr2, upperCase2);
            if (zA) {
                if (!zA2) {
                    throw new IllegalArgumentException("Invalid start/end guards: error contents");
                }
            } else if (!zA3) {
                if (zA2 || zA4) {
                    throw new IllegalArgumentException("Invalid start/end guards: error contents");
                }
                StringBuilder sb3 = new StringBuilder();
                char c11 = f62237d;
                sb3.append(c11);
                sb3.append(str);
                sb3.append(c11);
                str = sb3.toString();
            } else if (!zA4) {
                throw new IllegalArgumentException("Invalid start/end guards: error contents");
            }
        }
        int i11 = 20;
        for (int i12 = 1; i12 < str.length() - 1; i12++) {
            if (Character.isDigit(str.charAt(i12)) || str.charAt(i12) == '-' || str.charAt(i12) == '$') {
                i11 += 9;
            } else {
                if (!p0.a(f62236c, str.charAt(i12))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i12) + '\'');
                }
                i11 += 10;
            }
        }
        boolean[] zArr = new boolean[i11 + (str.length() - 1)];
        int i13 = 0;
        for (int i14 = 0; i14 < str.length(); i14++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i14));
            if (i14 == 0 || i14 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i15 = 0;
            while (true) {
                char[] cArr3 = p0.f62213e;
                if (i15 >= cArr3.length) {
                    i10 = 0;
                    break;
                }
                if (upperCase3 == cArr3[i15]) {
                    i10 = p0.f62214f[i15];
                    break;
                }
                i15++;
            }
            int i16 = 0;
            int i17 = 0;
            boolean z10 = true;
            while (i16 < 7) {
                zArr[i13] = z10;
                i13++;
                if (((i10 >> (6 - i16)) & 1) == 0 || i17 == 1) {
                    z10 = !z10;
                    i16++;
                    i17 = 0;
                } else {
                    i17++;
                }
            }
            if (i14 < str.length() - 1) {
                zArr[i13] = false;
                i13++;
            }
        }
        return zArr;
    }
}
