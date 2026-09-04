package org.apache.tools.ant.util;

import com.meituan.robust.Constants;
import com.tencent.qcloud.core.util.IOUtils;

/* JADX INFO: compiled from: Base64Converter.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f136722a = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f136723b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f136724c = 255;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f136725d = 63;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f136726e = 4032;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f136727f = 6;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f136728g = 258048;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f136729h = 12;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f136730i = 16515072;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f136731j = 18;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final char[] f136732k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char[] f136733l;

    static {
        char[] cArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Constants.OBJECT_TYPE, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', IOUtils.DIR_SEPARATOR_UNIX};
        f136732k = cArr;
        f136733l = cArr;
    }

    public String a(String str) {
        return b(str.getBytes());
    }

    public String b(byte[] bArr) {
        char[] cArr = new char[(((bArr.length - 1) / 3) + 1) * 4];
        int i10 = 0;
        int i11 = 0;
        while (i10 + 3 <= bArr.length) {
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & 255) << 16) | ((bArr[i12] & 255) << 8);
            int i15 = i13 + 1;
            int i16 = i14 | (bArr[i13] & 255);
            int i17 = (i16 & f136730i) >> 18;
            int i18 = i11 + 1;
            char[] cArr2 = f136732k;
            cArr[i11] = cArr2[i17];
            int i19 = i18 + 1;
            cArr[i18] = cArr2[(i16 & f136728g) >> 12];
            int i20 = i19 + 1;
            cArr[i19] = cArr2[(i16 & 4032) >> 6];
            i11 = i20 + 1;
            cArr[i20] = cArr2[i16 & 63];
            i10 = i15;
        }
        if (bArr.length - i10 == 2) {
            int i21 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16);
            int i22 = (i21 & f136730i) >> 18;
            int i23 = i11 + 1;
            char[] cArr3 = f136732k;
            cArr[i11] = cArr3[i22];
            int i24 = i23 + 1;
            cArr[i23] = cArr3[(i21 & f136728g) >> 12];
            cArr[i24] = cArr3[(i21 & 4032) >> 6];
            cArr[i24 + 1] = n5.a.f132013h;
        } else if (bArr.length - i10 == 1) {
            int i25 = (bArr[i10] & 255) << 16;
            int i26 = (i25 & f136730i) >> 18;
            int i27 = i11 + 1;
            char[] cArr4 = f136732k;
            cArr[i11] = cArr4[i26];
            int i28 = i27 + 1;
            cArr[i27] = cArr4[(i25 & f136728g) >> 12];
            cArr[i28] = n5.a.f132013h;
            cArr[i28 + 1] = n5.a.f132013h;
        }
        return new String(cArr);
    }
}
