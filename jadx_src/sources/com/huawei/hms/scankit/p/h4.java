package com.huawei.hms.scankit.p;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.hmsscankit.DetailRect;
import com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate;
import com.huawei.hms.scankit.util.OpencvJNI;

/* JADX INFO: compiled from: IRemoteFrameDecoderDelegateImpl.java */
/* JADX INFO: loaded from: classes7.dex */
public class h4 extends IRemoteFrameDecoderDelegate.Stub {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile h4 f61885d = new h4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Point f61886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f61887b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Rect f61888c;

    private h4() {
    }

    private e6 a(byte[] bArr, int i10, int i11, int i12) {
        if (i12 == 0) {
            byte[] bArr2 = new byte[bArr.length];
            for (int i13 = 0; i13 < i11; i13++) {
                for (int i14 = 0; i14 < i10; i14++) {
                    bArr2[(((i14 * i11) + i11) - i13) - 1] = bArr[(i13 * i10) + i14];
                }
            }
            return a(bArr2, i11, i10);
        }
        if (i12 == 2) {
            byte[] bArr3 = new byte[bArr.length];
            for (int i15 = 0; i15 < i11; i15++) {
                for (int i16 = 0; i16 < i10; i16++) {
                    bArr3[(((i10 - 1) - i16) * i11) + i15] = bArr[(i15 * i10) + i16];
                }
            }
            return a(bArr3, i11, i10);
        }
        if (i12 != 3) {
            return a(bArr, i10, i11);
        }
        byte[] bArr4 = new byte[bArr.length];
        for (int i17 = 0; i17 < i11; i17++) {
            for (int i18 = 0; i18 < i10; i18++) {
                bArr4[(((((i11 - 1) - i17) * i10) + i10) - 1) - i18] = bArr[(i17 * i10) + i18];
            }
        }
        return a(bArr4, i10, i11);
    }

    public static h4 a() {
        return f61885d;
    }

    public synchronized Rect a(int i10, int i11) {
        int iMin;
        int i12;
        int i13;
        iMin = Math.min(i10, i11);
        i12 = (i10 - iMin) / 2;
        i13 = (i11 - iMin) / 2;
        return new Rect(i12, i13, i12 + iMin, iMin + i13);
    }

    public e6 a(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if (b(i10, i11) == null) {
            return null;
        }
        int iMin = (int) (((double) Math.min(i10, i11)) * 0.8d);
        int i20 = (i10 - iMin) / 2;
        int i21 = (i11 - iMin) / 2;
        Rect rect = this.f61888c;
        if (rect == null) {
            i12 = i20;
            i13 = iMin;
        } else {
            if (rect.left == -1 && rect.right == -1 && rect.top == -1 && rect.bottom == -1) {
                iMin = (int) (((double) i10) * 0.85d);
                i20 = (i10 - iMin) / 2;
                double d10 = i11;
                i19 = (int) (0.8d * d10);
                i21 = (int) (d10 * 0.1d);
            } else {
                iMin = (int) (((double) Math.min(i10, i11)) * 0.9d);
                i20 = (i10 - iMin) / 2;
                Rect rect2 = this.f61888c;
                Rect rect3 = new Rect(rect2.left, rect2.top, rect2.right, rect2.bottom);
                int iMax = Math.max(i10, i11);
                Point point = this.f61886a;
                if (point != null) {
                    i18 = point.x;
                    i17 = point.y;
                } else {
                    i17 = iMax;
                    i18 = i17;
                }
                float fMax = iMax / Math.max(i18, i17);
                Rect rect4 = this.f61888c;
                int i22 = (int) (rect4.top * fMax);
                rect3.top = i22;
                int i23 = (int) (rect4.bottom * fMax);
                rect3.bottom = i23;
                float f10 = i11 / 14.0f;
                if (i22 > f10) {
                    i22 -= (int) f10;
                }
                i21 = i22 < 0 ? 0 : i22;
                i19 = i23 - i21;
                if (i21 + i19 > i11) {
                    i21 = (i11 - iMin) / 2;
                    i12 = i20;
                    i13 = iMin;
                }
            }
            int i24 = i20;
            i13 = iMin;
            iMin = i19;
            i12 = i24;
        }
        o4.a("ScanSize", "top:" + i21 + "scanSizeHeight" + iMin + "mHeight:" + i11);
        if (i11 < i21 + iMin) {
            i14 = i11;
            i15 = 0;
        } else {
            i14 = iMin;
            i15 = i21;
        }
        if (i10 < i12 + i13) {
            i16 = i10;
            i12 = 0;
        } else {
            i16 = i13;
        }
        return new e6(bArr, i10, i11, i12, i15, i16, i14, false);
    }

    public synchronized Rect b(int i10, int i11) {
        Rect rect = new Rect(a(i10, i11));
        Point point = new Point(i10, i11);
        Point point2 = this.f61886a;
        if (point2 == null) {
            return null;
        }
        int i12 = point2.x;
        int i13 = point2.y;
        if (i12 < i13) {
            int i14 = rect.left;
            int i15 = point.y;
            rect.left = (i14 * i15) / i12;
            rect.right = (rect.right * i15) / i12;
            int i16 = rect.top;
            int i17 = point.x;
            rect.top = (i16 * i17) / i13;
            rect.bottom = (rect.bottom * i17) / i13;
        } else {
            int i18 = rect.top;
            int i19 = point.y;
            rect.top = (i18 * i19) / i13;
            rect.bottom = (rect.bottom * i19) / i13;
            int i20 = rect.left;
            int i21 = point.x;
            rect.left = (i20 * i21) / i12;
            rect.right = (rect.right * i21) / i12;
        }
        return rect;
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate
    public s6[] decode(byte[] bArr, int i10, int i11, int i12, int i13, IObjectWrapper iObjectWrapper) throws RemoteException {
        boolean z10;
        boolean z11;
        boolean z12;
        if (!r3.A) {
            OpencvJNI.init();
        }
        if (iObjectWrapper == null || !(ObjectWrapper.unwrap(iObjectWrapper) instanceof Bundle)) {
            z10 = true;
            z11 = false;
            z12 = false;
        } else {
            Bundle bundle = (Bundle) ObjectWrapper.unwrap(iObjectWrapper);
            this.f61886a = (Point) bundle.getParcelable("Screen");
            this.f61888c = (Rect) bundle.getParcelable("Rect");
            z11 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper)).getBoolean(DetailRect.USE_APK, false);
            z12 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper)).getBoolean(DetailRect.SUPPORT_ROLLBACK, false);
            z10 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper)).getBoolean(DetailRect.PARSE_RESULT, true);
        }
        r3.f62280f = z10;
        if (z12 && !r3.f62275a && z11) {
            return new s6[]{r6.c()};
        }
        if (this.f61888c == null) {
            this.f61888c = new Rect(-1, -1, -1, -1);
        }
        if (this.f61886a == null) {
            this.f61886a = new Point(1080, 1920);
        }
        e6 e6VarA = a(bArr, i10, i11, i12);
        byte[] bArrB = e6VarA.b();
        x6 x6Var = new x6(e6VarA.c(), e6VarA.a(), i13);
        int i14 = this.f61887b;
        this.f61887b = i14 + 1;
        return m1.c(bArrB, x6Var.a(i14));
    }
}
