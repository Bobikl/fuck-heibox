package com.igexin.push.extension.distribution.basic.g;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class c {
    public static int a(String str, String str2) {
        try {
            Pattern patternCompile = Pattern.compile("([a-zA-Z_-])*");
            String[] strArrSplit = str.split("\\.");
            String[] strArrSplit2 = str2.split("\\.");
            if (strArrSplit.length < 4 || strArrSplit2.length < 4) {
                return -1;
            }
            strArrSplit[3] = patternCompile.matcher(strArrSplit[3]).replaceAll("");
            strArrSplit2[3] = patternCompile.matcher(strArrSplit2[3]).replaceAll("");
            long j10 = 0;
            int i10 = 0;
            long j11 = 0;
            while (true) {
                long j12 = 1;
                if (i10 >= 4) {
                    break;
                }
                for (int i11 = 0; i11 < 3 - i10; i11++) {
                    j12 *= 100;
                }
                long j13 = Long.parseLong(strArrSplit[i10]);
                Long.signum(j13);
                j11 += j13 * j12;
                i10++;
            }
            for (int i12 = 0; i12 < 4; i12++) {
                long j14 = 1;
                for (int i13 = 0; i13 < 3 - i12; i13++) {
                    j14 *= 100;
                }
                j10 += Long.parseLong(strArrSplit2[i12]) * j14;
            }
            if (j11 > j10) {
                return 1;
            }
            return j11 == j10 ? 0 : -1;
        } catch (Exception unused) {
            return -1;
        }
    }
}
