package com.google.android.exoplayer2.source.dash.manifest;

import java.util.Locale;

/* JADX INFO: compiled from: UrlTemplate.java */
/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f47957e = "RepresentationID";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f47958f = "Number";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f47959g = "Bandwidth";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f47960h = "Time";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f47961i = "$$";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f47962j = "%01d";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f47963k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f47964l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f47965m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f47966n = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f47967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f47968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f47969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f47970d;

    private n(String[] strArr, int[] iArr, String[] strArr2, int i10) {
        this.f47967a = strArr;
        this.f47968b = iArr;
        this.f47969c = strArr2;
        this.f47970d = i10;
    }

    public static n b(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new n(strArr, iArr, strArr2, c(str, strArr, iArr, strArr2));
    }

    private static int c(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String strSubstring;
        strArr[0] = "";
        int length = 0;
        int i10 = 0;
        while (length < str.length()) {
            int iIndexOf = str.indexOf("$", length);
            if (iIndexOf == -1) {
                String strValueOf = String.valueOf(strArr[i10]);
                String strValueOf2 = String.valueOf(str.substring(length));
                strArr[i10] = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                length = str.length();
            } else if (iIndexOf != length) {
                String strValueOf3 = String.valueOf(strArr[i10]);
                String strValueOf4 = String.valueOf(str.substring(length, iIndexOf));
                strArr[i10] = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                length = iIndexOf;
            } else if (str.startsWith(f47961i, length)) {
                strArr[i10] = String.valueOf(strArr[i10]).concat("$");
                length += 2;
            } else {
                int i11 = length + 1;
                int iIndexOf2 = str.indexOf("$", i11);
                String strSubstring2 = str.substring(i11, iIndexOf2);
                if (strSubstring2.equals(f47957e)) {
                    iArr[i10] = 1;
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x")) {
                            strSubstring = strSubstring.concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = f47962j;
                    }
                    strSubstring2.hashCode();
                    switch (strSubstring2) {
                        case "Number":
                            iArr[i10] = 2;
                            break;
                        case "Time":
                            iArr[i10] = 4;
                            break;
                        case "Bandwidth":
                            iArr[i10] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException(str.length() != 0 ? "Invalid template: ".concat(str) : new String("Invalid template: "));
                    }
                    strArr2[i10] = strSubstring;
                }
                i10++;
                strArr[i10] = "";
                length = iIndexOf2 + 1;
            }
        }
        return i10;
    }

    public String a(String str, long j10, int i10, long j11) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            int i12 = this.f47970d;
            if (i11 >= i12) {
                sb2.append(this.f47967a[i12]);
                return sb2.toString();
            }
            sb2.append(this.f47967a[i11]);
            int i13 = this.f47968b[i11];
            if (i13 == 1) {
                sb2.append(str);
            } else if (i13 == 2) {
                sb2.append(String.format(Locale.US, this.f47969c[i11], Long.valueOf(j10)));
            } else if (i13 == 3) {
                sb2.append(String.format(Locale.US, this.f47969c[i11], Integer.valueOf(i10)));
            } else if (i13 == 4) {
                sb2.append(String.format(Locale.US, this.f47969c[i11], Long.valueOf(j11)));
            }
            i11++;
        }
    }
}
