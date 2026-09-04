package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;

/* JADX INFO: compiled from: EAN13Reader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class o2 extends q7 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f62187j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f62189i = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f62188h = new int[4];

    private static void a(StringBuilder sb2, int i10) throws a {
        for (int i11 = 0; i11 < 10; i11++) {
            if (i10 == f62187j[i11]) {
                sb2.insert(0, (char) (i11 + 48));
                return;
            }
        }
        throw a.a();
    }

    private static boolean a(StringBuilder sb2) {
        int iCharAt = sb2.charAt(sb2.length() - 1) - '0';
        int iCharAt2 = 0;
        for (int i10 = 0; i10 < sb2.length() - 1; i10++) {
            iCharAt2 += i10 % 2 == 0 ? sb2.charAt(i10) - '0' : (sb2.charAt(i10) - '0') * 3;
        }
        return (iCharAt2 + iCharAt) % 10 == 0;
    }

    @Override // com.huawei.hms.scankit.p.q7
    protected int a(r rVar, int[] iArr, StringBuilder sb2) throws a {
        int[] iArr2 = this.f62188h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iE = rVar.e();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 6 && i10 < iE; i12++) {
            int iA = q7.a(rVar, iArr2, i10, q7.f62266g);
            sb2.append((char) ((iA % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (iA >= 10) {
                i11 |= 1 << (5 - i12);
            }
        }
        a(sb2, i11);
        this.f62189i = sb2.substring(0, 1);
        int i14 = q7.a(rVar, i10, true, q7.f62263d)[1];
        for (int i15 = 0; i15 < 6 && i14 < iE; i15++) {
            sb2.append((char) (q7.a(rVar, iArr2, i14, q7.f62265f) + 48));
            for (int i16 : iArr2) {
                i14 += i16;
            }
        }
        if (a(sb2)) {
            return i14;
        }
        throw a.a();
    }

    @Override // com.huawei.hms.scankit.p.q7
    BarcodeFormat a() {
        return BarcodeFormat.EAN_13;
    }

    @Override // com.huawei.hms.scankit.p.q7
    boolean a(int i10, int i11, r rVar) {
        return rVar.a(i11, (i11 - i10) + i11, false, false);
    }

    @Override // com.huawei.hms.scankit.p.q7
    boolean a(int[] iArr, int[] iArr2) throws a {
        int i10 = iArr2[1];
        int i11 = i10 - iArr2[0];
        int i12 = iArr[1];
        int i13 = iArr[0];
        int iRound = (int) Math.round(((double) (i10 - i13)) / (((double) (i11 + (i12 - i13))) / 6.0d));
        if (this.f62189i.equals("0")) {
            return ((double) Math.abs(iRound + (-95))) <= 18.05d || ((double) Math.abs(iRound + com.ss.android.ttvecamera.o.f97695q)) <= 21.47d;
        }
        return ((double) Math.abs(iRound + (-95))) <= 18.05d;
    }
}
