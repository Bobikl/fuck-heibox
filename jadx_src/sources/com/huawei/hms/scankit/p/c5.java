package com.huawei.hms.scankit.p;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.ml.scan.HmsBuildBitmapOption;
import com.huawei.hms.ml.scan.HmsScanBase;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.ss.bytertc.engine.type.ErrorCode;
import java.util.Hashtable;
import java.util.Map;

/* JADX INFO: compiled from: MultiFormatWriter.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c5 implements l8 {

    /* JADX INFO: compiled from: MultiFormatWriter.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f61632a;

        static {
            int[] iArr = new int[BarcodeFormat.values().length];
            f61632a = iArr;
            try {
                iArr[BarcodeFormat.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f61632a[BarcodeFormat.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f61632a[BarcodeFormat.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f61632a[BarcodeFormat.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f61632a[BarcodeFormat.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f61632a[BarcodeFormat.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f61632a[BarcodeFormat.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f61632a[BarcodeFormat.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f61632a[BarcodeFormat.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f61632a[BarcodeFormat.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f61632a[BarcodeFormat.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f61632a[BarcodeFormat.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f61632a[BarcodeFormat.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x01f6 A[Catch: Exception -> 0x0287, IllegalArgumentException -> 0x0289, OutOfMemoryError -> 0x02b7, TryCatch #0 {OutOfMemoryError -> 0x02b7, blocks: (B:104:0x0126, B:107:0x012c, B:109:0x0130, B:111:0x014d, B:114:0x0154, B:118:0x01a7, B:120:0x01ab, B:122:0x01af, B:124:0x01b3, B:126:0x01b7, B:131:0x01d9, B:127:0x01c8, B:129:0x01ce, B:130:0x01d4, B:132:0x01dc, B:133:0x01df, B:134:0x01f6, B:137:0x0209, B:141:0x021b, B:143:0x0221, B:145:0x022c, B:144:0x0227, B:146:0x022f, B:147:0x0232, B:155:0x0264, B:157:0x026c, B:158:0x0273), top: B:184:0x0126 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0208 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:137:0x0209 A[Catch: Exception -> 0x0287, IllegalArgumentException -> 0x0289, OutOfMemoryError -> 0x02b7, TryCatch #0 {OutOfMemoryError -> 0x02b7, blocks: (B:104:0x0126, B:107:0x012c, B:109:0x0130, B:111:0x014d, B:114:0x0154, B:118:0x01a7, B:120:0x01ab, B:122:0x01af, B:124:0x01b3, B:126:0x01b7, B:131:0x01d9, B:127:0x01c8, B:129:0x01ce, B:130:0x01d4, B:132:0x01dc, B:133:0x01df, B:134:0x01f6, B:137:0x0209, B:141:0x021b, B:143:0x0221, B:145:0x022c, B:144:0x0227, B:146:0x022f, B:147:0x0232, B:155:0x0264, B:157:0x026c, B:158:0x0273), top: B:184:0x0126 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0218  */
    /* JADX WARN: Code duplicated, block: B:141:0x021b A[Catch: Exception -> 0x0287, IllegalArgumentException -> 0x0289, OutOfMemoryError -> 0x02b7, TryCatch #0 {OutOfMemoryError -> 0x02b7, blocks: (B:104:0x0126, B:107:0x012c, B:109:0x0130, B:111:0x014d, B:114:0x0154, B:118:0x01a7, B:120:0x01ab, B:122:0x01af, B:124:0x01b3, B:126:0x01b7, B:131:0x01d9, B:127:0x01c8, B:129:0x01ce, B:130:0x01d4, B:132:0x01dc, B:133:0x01df, B:134:0x01f6, B:137:0x0209, B:141:0x021b, B:143:0x0221, B:145:0x022c, B:144:0x0227, B:146:0x022f, B:147:0x0232, B:155:0x0264, B:157:0x026c, B:158:0x0273), top: B:184:0x0126 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0221 A[Catch: Exception -> 0x0287, IllegalArgumentException -> 0x0289, OutOfMemoryError -> 0x02b7, TryCatch #0 {OutOfMemoryError -> 0x02b7, blocks: (B:104:0x0126, B:107:0x012c, B:109:0x0130, B:111:0x014d, B:114:0x0154, B:118:0x01a7, B:120:0x01ab, B:122:0x01af, B:124:0x01b3, B:126:0x01b7, B:131:0x01d9, B:127:0x01c8, B:129:0x01ce, B:130:0x01d4, B:132:0x01dc, B:133:0x01df, B:134:0x01f6, B:137:0x0209, B:141:0x021b, B:143:0x0221, B:145:0x022c, B:144:0x0227, B:146:0x022f, B:147:0x0232, B:155:0x0264, B:157:0x026c, B:158:0x0273), top: B:184:0x0126 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0227 A[Catch: Exception -> 0x0287, IllegalArgumentException -> 0x0289, OutOfMemoryError -> 0x02b7, TryCatch #0 {OutOfMemoryError -> 0x02b7, blocks: (B:104:0x0126, B:107:0x012c, B:109:0x0130, B:111:0x014d, B:114:0x0154, B:118:0x01a7, B:120:0x01ab, B:122:0x01af, B:124:0x01b3, B:126:0x01b7, B:131:0x01d9, B:127:0x01c8, B:129:0x01ce, B:130:0x01d4, B:132:0x01dc, B:133:0x01df, B:134:0x01f6, B:137:0x0209, B:141:0x021b, B:143:0x0221, B:145:0x022c, B:144:0x0227, B:146:0x022f, B:147:0x0232, B:155:0x0264, B:157:0x026c, B:158:0x0273), top: B:184:0x0126 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0259  */
    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0273 A[Catch: Exception -> 0x0287, IllegalArgumentException -> 0x0289, OutOfMemoryError -> 0x02b7, TRY_LEAVE, TryCatch #0 {OutOfMemoryError -> 0x02b7, blocks: (B:104:0x0126, B:107:0x012c, B:109:0x0130, B:111:0x014d, B:114:0x0154, B:118:0x01a7, B:120:0x01ab, B:122:0x01af, B:124:0x01b3, B:126:0x01b7, B:131:0x01d9, B:127:0x01c8, B:129:0x01ce, B:130:0x01d4, B:132:0x01dc, B:133:0x01df, B:134:0x01f6, B:137:0x0209, B:141:0x021b, B:143:0x0221, B:145:0x022c, B:144:0x0227, B:146:0x022f, B:147:0x0232, B:155:0x0264, B:157:0x026c, B:158:0x0273), top: B:184:0x0126 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x027c  */
    /* JADX WARN: Code duplicated, block: B:161:0x0281  */
    public Bitmap a(String str, int i10, int i11, int i12, HmsBuildBitmapOption hmsBuildBitmapOption) throws WriterException {
        int i13;
        BarcodeFormat barcodeFormat;
        BarcodeFormat barcodeFormat2;
        BarcodeFormat barcodeFormat3;
        boolean z10;
        BarcodeFormat barcodeFormat4;
        BarcodeFormat barcodeFormat5;
        s sVarA;
        int iE;
        int iC;
        int[] iArr;
        int i14;
        Bitmap bitmapCreateBitmap;
        float f10;
        int i15;
        Bundle bundleA = com.huawei.hms.hmsscankit.f.a(str, i10, i11, i12, hmsBuildBitmapOption);
        if (i11 <= 0 || i12 <= 0 || i11 > 5120 || i12 > 5120) {
            com.huawei.hms.hmsscankit.f.a(ErrorCode.ERROR_CODE_UPDATE_TOKEN_WITH_INVALID_TOKEN, (Bitmap) null, bundleA);
            throw new WriterException("IllegalArgumentException:width & height should >0 & <5120");
        }
        if (TextUtils.isEmpty(str)) {
            com.huawei.hms.hmsscankit.f.a(ErrorCode.ERROR_CODE_ROOM_DISMISS, (Bitmap) null, bundleA);
            throw new WriterException("Content is empty");
        }
        if (str.length() > 2953) {
            com.huawei.hms.hmsscankit.f.a(ErrorCode.ERROR_CODE_JOIN_ROOM_WITHOUT_LICENSE_AUTHENTICATE_SDK, (Bitmap) null, bundleA);
            throw new WriterException("IllegalArgumentException:contents.length > 2953");
        }
        int i16 = HmsScanBase.QRCODE_SCAN_TYPE;
        if (i10 == i16) {
            i13 = 1;
        } else if (i10 == HmsScanBase.PDF417_SCAN_TYPE) {
            i13 = i11 / 30;
        } else if (i10 == HmsScanBase.EAN13_SCAN_TYPE || i10 == HmsScanBase.EAN8_SCAN_TYPE || i10 == HmsScanBase.CODE39_SCAN_TYPE || i10 == HmsScanBase.CODE93_SCAN_TYPE || i10 == HmsScanBase.CODE128_SCAN_TYPE || i10 == HmsScanBase.CODABAR_SCAN_TYPE || i10 == HmsScanBase.ITF14_SCAN_TYPE || i10 == HmsScanBase.UPCCODE_A_SCAN_TYPE || i10 == HmsScanBase.UPCCODE_E_SCAN_TYPE) {
            i13 = 6;
        } else {
            i13 = 1;
        }
        int i17 = androidx.core.view.j1.f21601t;
        int i18 = -197381;
        b3 b3Var = b3.L;
        String string = b3Var.toString();
        if (hmsBuildBitmapOption != null) {
            int i19 = hmsBuildBitmapOption.margin;
            if (i19 != 1) {
                i13 = i19;
            }
            int i20 = hmsBuildBitmapOption.bimapColor;
            if (i20 != -1) {
                i17 = i20;
            }
            int i21 = hmsBuildBitmapOption.bitmapBackgroundColor;
            i18 = i21 != -1 ? i21 : -197381;
            HmsBuildBitmapOption.ErrorCorrectionLevel errorCorrectionLevel = hmsBuildBitmapOption.QRErrorCorrection;
            string = errorCorrectionLevel == null ? b3Var.toString() : errorCorrectionLevel.value;
        }
        int i22 = i13;
        int i23 = i18;
        String str2 = string;
        int i24 = i17;
        Hashtable hashtable = new Hashtable();
        hashtable.put(u2.CHARACTER_SET, "utf-8");
        hashtable.put(u2.MARGIN, Integer.valueOf(i22));
        try {
            try {
                try {
                    if (i10 == HmsScanBase.AZTEC_SCAN_TYPE) {
                        barcodeFormat = BarcodeFormat.AZTEC;
                    } else {
                        if (i10 != HmsScanBase.DATAMATRIX_SCAN_TYPE) {
                            if (i10 == HmsScanBase.PDF417_SCAN_TYPE) {
                                barcodeFormat2 = BarcodeFormat.PDF_417;
                                hashtable.put(u2.ERROR_CORRECTION, 2);
                            } else if (i10 == i16) {
                                barcodeFormat = BarcodeFormat.QR_CODE;
                                hashtable.put(u2.ERROR_CORRECTION, str2);
                            } else if (i10 == HmsScanBase.CODABAR_SCAN_TYPE) {
                                barcodeFormat2 = BarcodeFormat.CODABAR;
                            } else if (i10 == HmsScanBase.CODE39_SCAN_TYPE) {
                                barcodeFormat2 = BarcodeFormat.CODE_39;
                            } else if (i10 == HmsScanBase.CODE93_SCAN_TYPE) {
                                barcodeFormat2 = BarcodeFormat.CODE_93;
                            } else if (i10 == HmsScanBase.CODE128_SCAN_TYPE) {
                                barcodeFormat2 = BarcodeFormat.CODE_128;
                            } else if (i10 == HmsScanBase.EAN8_SCAN_TYPE) {
                                barcodeFormat2 = BarcodeFormat.EAN_8;
                            } else if (i10 == HmsScanBase.EAN13_SCAN_TYPE) {
                                barcodeFormat2 = BarcodeFormat.EAN_13;
                            } else if (i10 == HmsScanBase.ITF14_SCAN_TYPE) {
                                barcodeFormat2 = BarcodeFormat.ITF;
                            } else if (i10 == HmsScanBase.UPCCODE_A_SCAN_TYPE) {
                                barcodeFormat2 = BarcodeFormat.UPC_A;
                            } else if (i10 == HmsScanBase.UPCCODE_E_SCAN_TYPE) {
                                barcodeFormat2 = BarcodeFormat.UPC_E;
                            } else {
                                barcodeFormat = BarcodeFormat.QR_CODE;
                                hashtable.put(u2.ERROR_CORRECTION, str2);
                            }
                            barcodeFormat3 = barcodeFormat2;
                            z10 = true;
                            if (hmsBuildBitmapOption == null && hmsBuildBitmapOption.logoBitmap != null && barcodeFormat3 != BarcodeFormat.QR_CODE) {
                                throw new WriterException("Non-QR code should not contains logos");
                            }
                            if (barcodeFormat3 == BarcodeFormat.QR_CODE || hmsBuildBitmapOption == null || hmsBuildBitmapOption.logoBitmap == null) {
                                sVarA = a(str, barcodeFormat3, i11, i12, hashtable);
                                if (sVarA == null) {
                                    return null;
                                }
                                iE = sVarA.e();
                                iC = sVarA.c();
                                iArr = new int[iE * iC];
                                for (i14 = 0; i14 < iC; i14++) {
                                    for (i15 = 0; i15 < iE; i15++) {
                                        if (sVarA.b(i15, i14)) {
                                            iArr[(i14 * iE) + i15] = i24;
                                        } else {
                                            iArr[(i14 * iE) + i15] = i23;
                                        }
                                    }
                                }
                                bitmapCreateBitmap = Bitmap.createBitmap(iE, iC, Bitmap.Config.ARGB_8888);
                                bitmapCreateBitmap.setPixels(iArr, 0, iE, 0, 0, iE, iC);
                                float f11 = iE;
                                f10 = f11 / i11;
                                float f12 = iC;
                                float f13 = f12 / i12;
                                if (f10 == 1.0f && f13 != 1.0f && z10) {
                                    bitmapCreateBitmap = f10 > f13 ? w7.a(bitmapCreateBitmap, i11, (int) (f12 / f10)) : w7.a(bitmapCreateBitmap, (int) (f11 / f13), i12);
                                } else {
                                    o4.a("MultiFormatWriter", "wMultiple == 1f || hMultiple == 1f || !reFormFlag");
                                }
                            } else {
                                hashtable.put(u2.ERROR_CORRECTION, b3.H.toString());
                                hashtable.put(u2.LOGO, Boolean.TRUE);
                                s sVarA2 = a(str, barcodeFormat3, i11, i12, hashtable);
                                if (sVarA2 == null) {
                                    return null;
                                }
                                int iE2 = (sVarA2.e() - (i22 * 2)) / 8;
                                int iE3 = sVarA2.e() / 2;
                                int iC2 = sVarA2.c() / 2;
                                Matrix matrix = new Matrix();
                                float f14 = iE2 * 2.0f;
                                matrix.setScale(f14 / hmsBuildBitmapOption.logoBitmap.getWidth(), f14 / hmsBuildBitmapOption.logoBitmap.getHeight());
                                Bitmap bitmap = hmsBuildBitmapOption.logoBitmap;
                                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), hmsBuildBitmapOption.logoBitmap.getHeight(), matrix, false);
                                int[] iArr2 = new int[i11 * i11];
                                for (int i25 = 0; i25 < i11; i25++) {
                                    for (int i26 = 0; i26 < i11; i26++) {
                                        if (i26 > iE3 - iE2 && i26 < iE3 + iE2 && i25 > iC2 - iE2 && i25 < iC2 + iE2) {
                                            iArr2[(i25 * i11) + i26] = bitmapCreateBitmap2.getPixel((i26 - iE3) + iE2, (i25 - iC2) + iE2);
                                        } else if (sVarA2.b(i26, i25)) {
                                            iArr2[(i25 * i11) + i26] = i24;
                                        } else {
                                            iArr2[(i25 * i11) + i26] = i23;
                                        }
                                    }
                                }
                                bitmapCreateBitmap = Bitmap.createBitmap(i11, i11, Bitmap.Config.ARGB_8888);
                                bitmapCreateBitmap.setPixels(iArr2, 0, i11, 0, 0, i11, i11);
                            }
                            if (bitmapCreateBitmap != null) {
                                com.huawei.hms.hmsscankit.f.a(0, bitmapCreateBitmap, bundleA);
                            } else {
                                com.huawei.hms.hmsscankit.f.a(-1015, bitmapCreateBitmap, bundleA);
                            }
                            return bitmapCreateBitmap;
                        }
                        barcodeFormat = BarcodeFormat.DATA_MATRIX;
                    }
                    if (barcodeFormat3 == BarcodeFormat.QR_CODE) {
                        sVarA = a(str, barcodeFormat3, i11, i12, hashtable);
                        if (sVarA == null) {
                            return null;
                        }
                        iE = sVarA.e();
                        iC = sVarA.c();
                        iArr = new int[iE * iC];
                        while (i14 < iC) {
                            while (i15 < iE) {
                                if (sVarA.b(i15, i14)) {
                                    iArr[(i14 * iE) + i15] = i24;
                                } else {
                                    iArr[(i14 * iE) + i15] = i23;
                                }
                            }
                        }
                        bitmapCreateBitmap = Bitmap.createBitmap(iE, iC, Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap.setPixels(iArr, 0, iE, 0, 0, iE, iC);
                        float f15 = iE;
                        f10 = f15 / i11;
                        float f16 = iC;
                        float f17 = f16 / i12;
                        if (f10 == 1.0f) {
                            o4.a("MultiFormatWriter", "wMultiple == 1f || hMultiple == 1f || !reFormFlag");
                        } else {
                            o4.a("MultiFormatWriter", "wMultiple == 1f || hMultiple == 1f || !reFormFlag");
                        }
                    } else {
                        sVarA = a(str, barcodeFormat3, i11, i12, hashtable);
                        if (sVarA == null) {
                            return null;
                        }
                        iE = sVarA.e();
                        iC = sVarA.c();
                        iArr = new int[iE * iC];
                        while (i14 < iC) {
                            while (i15 < iE) {
                                if (sVarA.b(i15, i14)) {
                                    iArr[(i14 * iE) + i15] = i24;
                                } else {
                                    iArr[(i14 * iE) + i15] = i23;
                                }
                            }
                        }
                        bitmapCreateBitmap = Bitmap.createBitmap(iE, iC, Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap.setPixels(iArr, 0, iE, 0, 0, iE, iC);
                        float f18 = iE;
                        f10 = f18 / i11;
                        float f19 = iC;
                        float f110 = f19 / i12;
                        if (f10 == 1.0f) {
                            o4.a("MultiFormatWriter", "wMultiple == 1f || hMultiple == 1f || !reFormFlag");
                        } else {
                            o4.a("MultiFormatWriter", "wMultiple == 1f || hMultiple == 1f || !reFormFlag");
                        }
                    }
                    if (bitmapCreateBitmap != null) {
                        com.huawei.hms.hmsscankit.f.a(0, bitmapCreateBitmap, bundleA);
                    } else {
                        com.huawei.hms.hmsscankit.f.a(-1015, bitmapCreateBitmap, bundleA);
                    }
                    return bitmapCreateBitmap;
                } catch (IllegalArgumentException e10) {
                    e = e10;
                    com.huawei.hms.hmsscankit.f.a(-1016, (Bitmap) null, bundleA);
                    throw new WriterException(e.getMessage(), barcodeFormat5.toString());
                } catch (Exception e11) {
                    e = e11;
                    com.huawei.hms.hmsscankit.f.a(ErrorCode.ERROR_CODE_ROOM_ALREADY_EXIST, (Bitmap) null, bundleA);
                    throw new WriterException(e.getMessage(), barcodeFormat4.toString());
                }
            } catch (OutOfMemoryError e12) {
                com.huawei.hms.hmsscankit.f.a(ErrorCode.ERROR_CODE_USER_ID_DIFFERENT, (Bitmap) null, bundleA);
                throw new WriterException(e12.getMessage());
            }
        } catch (IllegalArgumentException e13) {
            e = e13;
            barcodeFormat5 = barcodeFormat3;
        } catch (Exception e14) {
            e = e14;
            barcodeFormat4 = barcodeFormat3;
        }
        barcodeFormat3 = barcodeFormat;
        z10 = false;
        if (hmsBuildBitmapOption == null) {
        }
    }

    @Override // com.huawei.hms.scankit.p.l8
    public s a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<u2, ?> map) throws WriterException {
        l8 r2Var;
        switch (a.f61632a[barcodeFormat.ordinal()]) {
            case 1:
                r2Var = new r2();
                break;
            case 2:
                r2Var = new t7();
                break;
            case 3:
                r2Var = new p2();
                break;
            case 4:
                r2Var = new m7();
                break;
            case 5:
                r2Var = new k6();
                break;
            case 6:
                r2Var = new u0();
                break;
            case 7:
                r2Var = new w0();
                break;
            case 8:
                r2Var = new s0();
                break;
            case 9:
                r2Var = new k4();
                break;
            case 10:
                r2Var = new u5();
                break;
            case 11:
                r2Var = new q0();
                break;
            case 12:
                r2Var = new j1();
                break;
            case 13:
                r2Var = new i();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format " + barcodeFormat);
        }
        return r2Var.a(str, barcodeFormat, i10, i11, map);
    }
}
