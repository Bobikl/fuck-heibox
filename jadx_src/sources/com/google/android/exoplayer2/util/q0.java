package com.google.android.exoplayer2.util;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.qcloud.core.util.IOUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: UriUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f51507a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f51508b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f51509c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f51510d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f51511e = 3;

    private q0() {
    }

    private static int[] a(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i10 = iIndexOf5 + 2;
        if (i10 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i10) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static boolean b(@androidx.annotation.p0 String str) {
        return (str == null || a(str)[0] == -1) ? false : true;
    }

    private static String c(StringBuilder sb2, int i10, int i11) {
        int i12;
        int iLastIndexOf;
        if (i10 >= i11) {
            return sb2.toString();
        }
        if (sb2.charAt(i10) == '/') {
            i10++;
        }
        int i13 = i10;
        int i14 = i13;
        while (i13 <= i11) {
            if (i13 == i11) {
                i12 = i13;
            } else if (sb2.charAt(i13) == '/') {
                i12 = i13 + 1;
            } else {
                i13++;
            }
            int i15 = i14 + 1;
            if (i13 == i15 && sb2.charAt(i14) == '.') {
                sb2.delete(i14, i12);
                i11 -= i12 - i14;
            } else {
                if (i13 == i14 + 2 && sb2.charAt(i14) == '.' && sb2.charAt(i15) == '.') {
                    iLastIndexOf = sb2.lastIndexOf("/", i14 - 2) + 1;
                    int i16 = iLastIndexOf > i10 ? iLastIndexOf : i10;
                    sb2.delete(i16, i12);
                    i11 -= i12 - i16;
                } else {
                    iLastIndexOf = i13 + 1;
                }
                i14 = iLastIndexOf;
            }
            i13 = i14;
        }
        return sb2.toString();
    }

    public static Uri d(Uri uri, String str) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str2 : uri.getQueryParameterNames()) {
            if (!str2.equals(str)) {
                Iterator<String> it = uri.getQueryParameters(str2).iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str2, it.next());
                }
            }
        }
        return builderBuildUpon.build();
    }

    public static String e(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrA = a(str2);
        if (iArrA[0] != -1) {
            sb2.append(str2);
            c(sb2, iArrA[1], iArrA[2]);
            return sb2.toString();
        }
        int[] iArrA2 = a(str);
        if (iArrA[3] == 0) {
            sb2.append((CharSequence) str, 0, iArrA2[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (iArrA[2] == 0) {
            sb2.append((CharSequence) str, 0, iArrA2[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i10 = iArrA[1];
        if (i10 != 0) {
            int i11 = iArrA2[0] + 1;
            sb2.append((CharSequence) str, 0, i11);
            sb2.append(str2);
            return c(sb2, iArrA[1] + i11, i11 + iArrA[2]);
        }
        if (str2.charAt(i10) == '/') {
            sb2.append((CharSequence) str, 0, iArrA2[1]);
            sb2.append(str2);
            int i12 = iArrA2[1];
            return c(sb2, i12, iArrA[2] + i12);
        }
        int i13 = iArrA2[0] + 2;
        int i14 = iArrA2[1];
        if (i13 >= i14 || i14 != iArrA2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrA2[2] - 1);
            int i15 = iLastIndexOf == -1 ? iArrA2[1] : iLastIndexOf + 1;
            sb2.append((CharSequence) str, 0, i15);
            sb2.append(str2);
            return c(sb2, iArrA2[1], i15 + iArrA[2]);
        }
        sb2.append((CharSequence) str, 0, i14);
        sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb2.append(str2);
        int i16 = iArrA2[1];
        return c(sb2, i16, iArrA[2] + i16 + 1);
    }

    public static Uri f(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2) {
        return Uri.parse(e(str, str2));
    }
}
