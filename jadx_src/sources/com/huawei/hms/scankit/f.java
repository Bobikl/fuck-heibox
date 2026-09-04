package com.huawei.hms.scankit;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import com.bumptech.glide.Registry;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.hmsscankit.DetailRect;
import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate;
import com.huawei.hms.ml.scan.HmsBuildBitmapOption;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanResult;
import com.huawei.hms.scankit.p.c5;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.r3;
import com.huawei.hms.scankit.p.r6;
import com.huawei.hms.scankit.p.w3;
import com.huawei.hms.scankit.p.w7;
import com.huawei.hms.scankit.p.x3;
import com.huawei.hms.scankit.p.y3;
import com.huawei.hms.scankit.util.OpencvJNI;

/* JADX INFO: compiled from: IRemoteDecoderDelegateImpl.java */
/* JADX INFO: loaded from: classes7.dex */
public class f extends IRemoteDecoderDelegate.Stub {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile f f61489c = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile w3 f61490a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile x3 f61491b = null;

    static f a() {
        return f61489c;
    }

    private HmsScan[] a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        boolean z10;
        int iB;
        boolean z11;
        if (iObjectWrapper == null) {
            o4.b("IRemoteDecoder", "bitmap is null");
            return new HmsScan[0];
        }
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        boolean z12 = true;
        if (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) {
            z10 = false;
            iB = 0;
            z11 = true;
        } else {
            iB = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.FORMAT_FLAG);
            z11 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.PHOTO_MODE, false);
            int i10 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.TYPE_TRANS, 0);
            boolean z13 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.PARSE_RESULT, true);
            DetailRect.HMSSCAN_SDK_VALUE = i10;
            z12 = i10 >= 2;
            if (z12) {
                iB = w7.b(iB);
            }
            boolean z14 = z12;
            z12 = z13;
            z10 = z14;
        }
        r3.f62280f = z12;
        if (!(objUnwrap instanceof Bitmap)) {
            return new HmsScan[0];
        }
        HmsScan[] hmsScanArrB = r6.a().b((Bitmap) objUnwrap, iB, z11, this.f61490a);
        return !z10 ? w7.a(hmsScanArrB) : hmsScanArrB;
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
    public IObjectWrapper buildBitmap(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (iObjectWrapper == null || !(ObjectWrapper.unwrap(iObjectWrapper) instanceof Bundle)) {
            throw new RemoteException("Bundle is Null");
        }
        Bundle bundle = (Bundle) ObjectWrapper.unwrap(iObjectWrapper);
        String string = bundle.getString(HmsBuildBitmapOption.TYPE_BUILD_BITMAP_CONTENT);
        int i10 = bundle.getInt(HmsBuildBitmapOption.TYPE_BUILD_BITMAP_FOTMAT);
        int i11 = bundle.getInt(HmsBuildBitmapOption.TYPE_BUILD_BITMAP_WIDTH);
        int i12 = bundle.getInt(HmsBuildBitmapOption.TYPE_BUILD_BITMAP_HEIGHT);
        int i13 = bundle.getInt(HmsBuildBitmapOption.TYPE_BUILD_BITMAP_MARGIN, 1);
        int i14 = bundle.getInt(HmsBuildBitmapOption.TYPE_BUILD_BITMAP_COLOR, -1);
        try {
            Bitmap bitmapA = new c5().a(string, i10, i11, i12, new HmsBuildBitmapOption.Creator().setBitmapMargin(i13).setBitmapColor(i14).setBitmapBackgroundColor(bundle.getInt(HmsBuildBitmapOption.TYPE_BUILD_BITMAP_BACKCOLOR, -1)).create());
            if (bitmapA != null) {
                return ObjectWrapper.wrap(bitmapA);
            }
            throw new RemoteException("Bitmap is Null");
        } catch (WriterException e10) {
            throw new RemoteException(e10.getMessage());
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
    public void buildBitmapLog(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null || !(ObjectWrapper.unwrap(iObjectWrapper) instanceof Bundle)) {
            return;
        }
        Bundle bundle = (Bundle) ObjectWrapper.unwrap(iObjectWrapper);
        if (this.f61491b == null) {
            try {
                this.f61491b = new x3();
                this.f61491b.c(bundle);
            } catch (RuntimeException unused) {
                o4.b("IRemoteDecoderDelegateImpl", "buildBitmapLog RuntimeException");
            } catch (Exception unused2) {
                o4.b("IRemoteDecoderDelegateImpl", "buildBitmapLog Exception");
            }
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
    public HmsScan[] decodeWithBitmap(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        boolean z10;
        boolean z11;
        boolean z12;
        if (!r3.A) {
            OpencvJNI.init();
        }
        Bundle bundle = (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) ? new Bundle() : (Bundle) ObjectWrapper.unwrap(iObjectWrapper2);
        String string = "";
        if (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) {
            z10 = true;
            z11 = false;
            z12 = false;
        } else {
            string = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getString(DetailRect.CP_PACKAGE, "");
            z11 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.USE_APK, false);
            z12 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.SUPPORT_ROLLBACK, false);
            z10 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.PARSE_RESULT, true);
        }
        r3.f62280f = z10;
        if (z12 && !r3.f62275a && z11) {
            return new HmsScan[]{r6.b()};
        }
        if (this.f61490a == null && y3.a(string, y3.a())) {
            try {
                this.f61490a = new w3(bundle, Registry.f40559m);
            } catch (RuntimeException unused) {
                o4.b("IRemoteDecoderDelegateImpl", "Ha error");
            } catch (Exception unused2) {
                o4.b("IRemoteDecoderDelegateImpl", "Ha error");
            }
        }
        return a(iObjectWrapper, iObjectWrapper2);
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
    public HmsScanResult decodeWithBuffer(byte[] bArr, int i10, int i11, IObjectWrapper iObjectWrapper) throws RemoteException {
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (bArr == null) {
            o4.b("IRemoteDecoder", "buffer is null");
            return new HmsScanResult(4096, new HmsScan[0]);
        }
        if (!r3.A) {
            OpencvJNI.init();
        }
        if (iObjectWrapper == null || !(ObjectWrapper.unwrap(iObjectWrapper) instanceof Bundle)) {
            i12 = 0;
            z10 = false;
            z11 = true;
            z12 = true;
        } else {
            int iB = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper)).getInt(DetailRect.FORMAT_FLAG);
            boolean z15 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper)).getBoolean(DetailRect.PHOTO_MODE, false);
            r3.f62277c = z15;
            int i13 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper)).getInt(DetailRect.TYPE_TRANS, 0);
            boolean z16 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper)).getBoolean(DetailRect.PARSE_RESULT, true);
            DetailRect.HMSSCAN_SDK_VALUE = i13;
            boolean z17 = i13 >= 2;
            if (z17) {
                iB = w7.b(iB);
            }
            z12 = z15;
            z10 = z17;
            i12 = iB;
            z11 = z16;
        }
        Bundle bundle = (iObjectWrapper == null || !(ObjectWrapper.unwrap(iObjectWrapper) instanceof Bundle)) ? new Bundle() : (Bundle) ObjectWrapper.unwrap(iObjectWrapper);
        String string = "";
        if (iObjectWrapper == null || !(ObjectWrapper.unwrap(iObjectWrapper) instanceof Bundle)) {
            z13 = false;
            z14 = false;
        } else {
            string = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper)).getString(DetailRect.CP_PACKAGE, "");
            z13 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper)).getBoolean(DetailRect.USE_APK, false);
            z14 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper)).getBoolean(DetailRect.SUPPORT_ROLLBACK, false);
        }
        if (z14 && !r3.f62275a && z13) {
            return new HmsScanResult(4096, new HmsScan[]{r6.b()});
        }
        if (this.f61490a == null && y3.a(string, y3.a())) {
            try {
                this.f61490a = new w3(bundle, Registry.f40559m);
            } catch (RuntimeException unused) {
                o4.b("IRemoteDecoderDelegateImpl", "Ha error");
            } catch (Exception unused2) {
                o4.b("IRemoteDecoderDelegateImpl", "Ha error");
            }
        }
        r3.f62280f = z11;
        return r6.a().a(bArr, i10, i11, i12, z12, z10, this.f61490a);
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
    public IObjectWrapper queryDeepLinkInfo(IObjectWrapper iObjectWrapper) throws RemoteException {
        return null;
    }
}
