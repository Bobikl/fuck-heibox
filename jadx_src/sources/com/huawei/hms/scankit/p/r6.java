package com.huawei.hms.scankit.p;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.text.TextUtils;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanBase;
import com.huawei.hms.ml.scan.HmsScanResult;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.ss.bytertc.engine.type.ErrorCode;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: RemoteDecoderWork.java */
/* JADX INFO: loaded from: classes7.dex */
public class r6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile r6 f62302a;

    public static r6 a() {
        if (f62302a == null) {
            synchronized (r6.class) {
                if (f62302a == null) {
                    f62302a = new r6();
                }
            }
        }
        return f62302a;
    }

    public static HmsScan b() {
        return new HmsScan("", HmsScanBase.FORMAT_UNKNOWN, "", HmsScan.PURE_TEXT_FORM, null, new Point[]{new Point(-2, -2), new Point(-2, -2), new Point(-2, -2), new Point(-2, -2)}, null, null).setZoomValue(1.0d);
    }

    public static s6 c() {
        return new s6("", null, new u6[]{new u6(-2.0f, -2.0f), new u6(-2.0f, -2.0f), new u6(-2.0f, -2.0f), new u6(-2.0f, -2.0f)}, BarcodeFormat.NONE);
    }

    public HmsScanResult a(byte[] bArr, int i10, int i11, int i12, boolean z10, boolean z11, w3 w3Var) {
        w3.c cVarA;
        if (w3Var != null) {
            w3Var.a(FilterGroup.TYPE_SINGLE);
            cVarA = w3Var.a(z10, i11 * i10);
            if (i11 < 30 || i10 < 30) {
                cVarA.a(ErrorCode.ERROR_CODE_APP_ID_NULL);
            }
        } else {
            cVarA = null;
        }
        w3.c cVar = cVarA;
        o4.d("Scankit", "start decodeSingleCode");
        s6[] s6VarArrC = m1.c(bArr, new x6(i10, i11, i12, true, z10));
        o4.d("Scankit", "start totalParseResult");
        HmsScan[] hmsScanArrA = y6.a(s6VarArrC);
        o4.d("Scankit", "end totalParseResult");
        if (w3Var != null) {
            w3Var.a(hmsScanArrA, cVar);
        }
        if (!z11) {
            o4.d("Scankit", "start hmsResultTrans");
            hmsScanArrA = w7.a(hmsScanArrA);
            o4.d("Scankit", "end hmsResultTrans");
        }
        int i13 = i12 == 0 ? 8191 : i12;
        if (r3.f62278d) {
            return new HmsScanResult(4099, hmsScanArrA);
        }
        if (r3.f62279e) {
            return new HmsScanResult(4100, hmsScanArrA);
        }
        if (r3.f62282h && hmsScanArrA.length == 0) {
            int i14 = HmsScanBase.QRCODE_SCAN_TYPE;
            if ((i13 & i14) == i14) {
                return new HmsScanResult(4097, hmsScanArrA);
            }
        }
        if (hmsScanArrA.length == 0) {
            return new HmsScanResult(4096, hmsScanArrA);
        }
        if (hmsScanArrA.length <= 0 || TextUtils.isEmpty(hmsScanArrA[0].getOriginalValue())) {
            return (hmsScanArrA.length <= 0 || hmsScanArrA[0].getZoomValue() <= 1.0d) ? new HmsScanResult(4096, new HmsScan[0]) : new HmsScanResult(4098, hmsScanArrA);
        }
        return new HmsScanResult(0, hmsScanArrA);
    }

    public HmsScan[] a(Bitmap bitmap, int i10, boolean z10, w3 w3Var) {
        w3.c cVarA;
        o4.d("Scankit", "start decodeWithBitmapWorkMulti");
        if (w3Var != null) {
            w3Var.a(FilterGroup.TYPE_MULTI);
            cVarA = w3Var.a(z10, bitmap.getHeight() * bitmap.getWidth());
            if (bitmap.getHeight() < 30 || bitmap.getWidth() < 30) {
                cVarA.a(ErrorCode.ERROR_CODE_APP_ID_NULL);
            }
        } else {
            cVarA = null;
        }
        o4.d("Scankit", "end decodeWithBitmapWorkMulti");
        s6[] s6VarArrA = m1.a(bitmap, new x6(i10, z10));
        o4.d("Scankit", "start totalParseResult");
        HmsScan[] hmsScanArrA = y6.a(s6VarArrA);
        o4.d("Scankit", "end totalParseResult");
        if (w3Var != null) {
            w3Var.a(hmsScanArrA, cVarA);
        }
        return hmsScanArrA;
    }

    public HmsScan[] a(ByteBuffer byteBuffer, int i10, int i11, int i12, boolean z10, w3 w3Var) {
        w3.c cVarA;
        if (w3Var != null) {
            w3Var.a(FilterGroup.TYPE_MULTI);
            int i13 = i11 * i10;
            cVarA = w3Var.a(z10, i13);
            if (i10 < 30 || i11 < 30) {
                cVarA.a(ErrorCode.ERROR_CODE_ROOM_ID_ILLEGAL);
            } else if (byteBuffer.array().length < i13) {
                cVarA.a(-1008);
            }
        } else {
            cVarA = null;
        }
        HmsScan[] hmsScanArrA = y6.a(m1.a(byteBuffer, new x6(i10, i11, i12, true, z10)));
        if (w3Var != null) {
            w3Var.a(hmsScanArrA, cVarA);
        }
        return hmsScanArrA;
    }

    public HmsScan[] b(Bitmap bitmap, int i10, boolean z10, w3 w3Var) {
        w3.c cVarA;
        if (w3Var != null) {
            w3Var.a(FilterGroup.TYPE_SINGLE);
            cVarA = w3Var.a(z10, bitmap.getHeight() * bitmap.getWidth());
            if (bitmap.getHeight() < 30 || bitmap.getWidth() < 30) {
                cVarA.a(ErrorCode.ERROR_CODE_APP_ID_NULL);
            }
        } else {
            cVarA = null;
        }
        s6[] s6VarArrB = m1.b(bitmap, new x6(i10, z10));
        o4.d("Scankit", "start totalParseResult");
        HmsScan[] hmsScanArrA = y6.a(s6VarArrB);
        if (w3Var != null) {
            w3Var.a(hmsScanArrA, cVarA);
        }
        return hmsScanArrA;
    }
}
