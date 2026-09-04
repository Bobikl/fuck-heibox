package com.huawei.hms.scankit;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.hmsscankit.DetailRect;
import com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.r3;
import com.huawei.hms.scankit.p.r6;
import com.huawei.hms.scankit.p.w3;
import com.huawei.hms.scankit.p.w7;
import com.huawei.hms.scankit.p.y3;
import com.huawei.hms.scankit.util.OpencvJNI;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: IRemoteHmsDecoderDelegateImpl.java */
/* JADX INFO: loaded from: classes7.dex */
public class g extends IRemoteHmsDecoderDelegate.Stub {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile g f61492b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile w3 f61493a = null;

    private Bundle a(IObjectWrapper iObjectWrapper) {
        return (iObjectWrapper == null || !(ObjectWrapper.unwrap(iObjectWrapper) instanceof Bundle)) ? new Bundle() : (Bundle) ObjectWrapper.unwrap(iObjectWrapper);
    }

    static g a() {
        return f61492b;
    }

    private HmsScan[] a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        boolean z10;
        boolean z11;
        int iB;
        boolean z12;
        o4.d("Scankit", "start getHmsMLVisionScanResultByBitmap");
        if (iObjectWrapper == null) {
            o4.b("ScankitRemote", "bitmap is null");
            return new HmsScan[0];
        }
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        boolean z13 = true;
        if (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) {
            z10 = false;
            z11 = false;
            iB = 0;
            z12 = false;
        } else {
            z11 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.PHOTO_MODE, false);
            r3.f62277c = z11;
            iB = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.FORMAT_FLAG);
            boolean z14 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.PARSE_RESULT, true);
            z12 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.PARSE_RESULT, false);
            int i10 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.TYPE_TRANS, 0);
            DetailRect.HMSSCAN_SDK_VALUE = i10;
            z13 = i10 >= 2;
            if (z13) {
                iB = w7.b(iB);
            }
            z10 = z13;
            z13 = z14;
        }
        r3.f62280f = z13;
        r3.f62281g = z12;
        if (!(objUnwrap instanceof Bitmap)) {
            return new HmsScan[0];
        }
        o4.d("Scankit", "end getHmsMLVisionScanResultByBitmap");
        HmsScan[] hmsScanArrA = r6.a().a((Bitmap) objUnwrap, iB, z11, this.f61493a);
        return !z10 ? w7.a(hmsScanArrA) : hmsScanArrA;
    }

    private HmsScan[] a(DetailRect detailRect, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        if (iObjectWrapper == null) {
            o4.b("ScankitRemoteS", "bytebuffer is null");
            return new HmsScan[0];
        }
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        boolean z13 = true;
        if (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) {
            z10 = false;
            z11 = false;
            i10 = 0;
            z12 = false;
        } else {
            int iB = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.FORMAT_FLAG);
            boolean z14 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.PHOTO_MODE, false);
            int i11 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.TYPE_TRANS, 0);
            DetailRect.HMSSCAN_SDK_VALUE = i11;
            boolean z15 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.PARSE_RESULT, true);
            z10 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.NEW_VERSION, false);
            z13 = i11 >= 2;
            if (z13) {
                iB = w7.b(iB);
            }
            i10 = iB;
            z12 = z14;
            z11 = z13;
            z13 = z15;
        }
        r3.f62280f = z13;
        r3.f62281g = z10;
        if (!(objUnwrap instanceof ByteBuffer)) {
            return new HmsScan[0];
        }
        HmsScan[] hmsScanArrA = r6.a().a((ByteBuffer) objUnwrap, detailRect == null ? 1000 : detailRect.width, detailRect == null ? 1000 : detailRect.height, i10, z12, this.f61493a);
        return !z11 ? w7.a(hmsScanArrA) : hmsScanArrA;
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate
    public HmsScan[] decodeInBitmap(DetailRect detailRect, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        boolean z10;
        boolean z11;
        if (!r3.A) {
            OpencvJNI.init();
        }
        o4.d("Scankit", "start decodeInBitmap");
        Bundle bundleA = a(iObjectWrapper2);
        String string = "";
        if (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) {
            z10 = false;
            z11 = false;
        } else {
            string = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getString(DetailRect.CP_PACKAGE, "");
            z10 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.USE_APK, false);
            z11 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.SUPPORT_ROLLBACK, false);
        }
        if (z11 && !r3.f62275a && z10) {
            return new HmsScan[]{r6.b()};
        }
        if (this.f61493a == null && y3.a(string, y3.a())) {
            try {
                this.f61493a = new w3(bundleA, "MultiProcessor");
            } catch (RuntimeException unused) {
                o4.b("IRemoteDecoderDelegateImpl", "Ha error");
            } catch (Exception unused2) {
                o4.b("IRemoteDecoderDelegateImpl", "Ha error");
            }
        }
        o4.d("scankit mul", "end decodeInBitmap");
        return a(iObjectWrapper, iObjectWrapper2);
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate
    public HmsScan[] detectWithByteBuffer(DetailRect detailRect, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        boolean z10;
        boolean z11;
        if (!r3.A) {
            OpencvJNI.init();
        }
        Bundle bundleA = a(iObjectWrapper2);
        String string = "";
        if (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) {
            z10 = false;
            z11 = false;
        } else {
            string = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getString(DetailRect.CP_PACKAGE, "");
            z10 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.USE_APK, false);
            z11 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.SUPPORT_ROLLBACK, false);
        }
        if (z11 && !r3.f62275a && z10) {
            return new HmsScan[]{r6.b()};
        }
        if (this.f61493a == null && y3.a(string, y3.a())) {
            try {
                this.f61493a = new w3(bundleA, "MultiProcessor");
            } catch (RuntimeException unused) {
                o4.b("IRemoteDecoderDelegateImpl", "Ha error");
            } catch (Exception unused2) {
                o4.b("IRemoteDecoderDelegateImpl", "Ha error");
            }
        }
        return a(detailRect, iObjectWrapper, iObjectWrapper2);
    }
}
