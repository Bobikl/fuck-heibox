package com.huawei.hms.scankit.p;

import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: Code128Writer.java */
/* JADX INFO: loaded from: classes7.dex */
public final class s0 extends h5 {

    /* JADX INFO: compiled from: Code128Writer.java */
    public enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    private static int a(CharSequence charSequence, int i10, int i11) {
        a aVar;
        a aVarA;
        a aVarA2;
        a aVarA3 = a(charSequence, i10);
        a aVar2 = a.UNCODABLE;
        if (aVarA3 != aVar2 && aVarA3 != (aVar = a.ONE_DIGIT)) {
            if (i11 == 99) {
                return 99;
            }
            if (i11 == 100) {
                a aVar3 = a.FNC_1;
                if (aVarA3 == aVar3 || (aVarA = a(charSequence, i10 + 2)) == aVar2 || aVarA == aVar) {
                    return 100;
                }
                if (aVarA == aVar3) {
                    return a(charSequence, i10 + 3) == a.TWO_DIGITS ? 99 : 100;
                }
                int i12 = i10 + 4;
                while (true) {
                    aVarA2 = a(charSequence, i12);
                    if (aVarA2 != a.TWO_DIGITS) {
                        break;
                    }
                    i12 += 2;
                }
                return aVarA2 == a.ONE_DIGIT ? 100 : 99;
            }
            if (aVarA3 == a.FNC_1) {
                aVarA3 = a(charSequence, i10 + 1);
            }
            if (aVarA3 == a.TWO_DIGITS) {
                return 99;
            }
        }
        return 100;
    }

    private static a a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        if (i10 >= length) {
            return a.UNCODABLE;
        }
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt == 241) {
            return a.FNC_1;
        }
        if (cCharAt < '0' || cCharAt > '9') {
            return a.UNCODABLE;
        }
        int i11 = i10 + 1;
        if (i11 >= length) {
            return a.ONE_DIGIT;
        }
        char cCharAt2 = charSequence.charAt(i11);
        return (cCharAt2 < '0' || cCharAt2 > '9') ? a.ONE_DIGIT : a.TWO_DIGITS;
    }

    @Override // com.huawei.hms.scankit.p.h5, com.huawei.hms.scankit.p.l8
    public s a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<u2, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.a(str, barcodeFormat, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got " + barcodeFormat);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.huawei.hms.scankit.p.h5
    public boolean[] a(String str) {
        int length = str.length();
        if (length < 1 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got " + length);
        }
        int iA = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < ' ' || cCharAt > '~') {
                switch (cCharAt) {
                    case bb.c.b.H1 /* 241 */:
                    case bb.c.b.I1 /* 242 */:
                    case bb.c.b.J1 /* 243 */:
                    case 244:
                        break;
                    default:
                        throw new IllegalArgumentException("Bad character in input: " + cCharAt);
                }
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < length) {
            int iA2 = a(str, i12, i14);
            int iCharAt = 100;
            if (iA2 == i14) {
                switch (str.charAt(i12)) {
                    case bb.c.b.H1 /* 241 */:
                        iCharAt = 102;
                        i12++;
                        break;
                    case bb.c.b.I1 /* 242 */:
                        iCharAt = 97;
                        i12++;
                        break;
                    case bb.c.b.J1 /* 243 */:
                        iCharAt = 96;
                        i12++;
                        break;
                    case 244:
                        i12++;
                        break;
                    default:
                        if (i14 == 100) {
                            iCharAt = str.charAt(i12) - ' ';
                        } else {
                            try {
                                iCharAt = Integer.parseInt(str.substring(i12, i12 + 2));
                                i12++;
                            } catch (NumberFormatException unused) {
                                throw new IllegalArgumentException("contents substring can not format integer");
                            }
                        }
                        i12++;
                        break;
                }
            } else {
                iCharAt = i14 == 0 ? iA2 == 100 ? 104 : 105 : iA2;
                i14 = iA2;
            }
            arrayList.add(r0.f62272a[iCharAt]);
            i13 += iCharAt * i11;
            if (i12 != 0) {
                i11++;
            }
        }
        int[][] iArr = r0.f62272a;
        arrayList.add(iArr[i13 % 103]);
        arrayList.add(iArr[106]);
        int i15 = 0;
        for (int[] iArr2 : arrayList) {
            for (int i16 : iArr2) {
                i15 += i16;
            }
        }
        boolean[] zArr = new boolean[i15];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iA += h5.a(zArr, iA, (int[]) it.next(), true);
        }
        return zArr;
    }
}
