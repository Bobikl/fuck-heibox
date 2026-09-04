package org.apache.tools.ant.util;

/* JADX INFO: compiled from: Native2AsciiUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f136739a = 127;

    public static String a(String str) {
        int iC;
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\\' || i10 >= length - 5) {
                sb2.append(cCharAt);
            } else {
                i10++;
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 != 'u' || (iC = c(str, i10 + 1)) < 0) {
                    sb2.append(cCharAt);
                    sb2.append(cCharAt2);
                } else {
                    sb2.append((char) iC);
                    i10 += 4;
                }
            }
            i10++;
        }
        return sb2.toString();
    }

    public static String b(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (char c10 : str.toCharArray()) {
            if (c10 <= 127) {
                sb2.append(c10);
            } else {
                sb2.append(String.format("\\u%04x", Integer.valueOf(c10)));
            }
        }
        return sb2.toString();
    }

    private static int c(String str, int i10) {
        try {
            return Integer.parseInt(str.substring(i10, i10 + 4), 16);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
