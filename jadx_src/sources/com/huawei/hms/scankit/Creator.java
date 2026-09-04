package com.huawei.hms.scankit;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.hmsscankit.DetailRect;
import com.huawei.hms.hmsscankit.api.IRemoteCreator;
import com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate;
import com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate;
import com.huawei.hms.hmsscankit.api.IRemoteViewDelegate;
import com.huawei.hms.ml.scan.HmsScanBase;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.w7;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Creator extends IRemoteCreator.Stub {
    private static final String TAG = "Creator";
    private e iRemoteViewDelegate = null;
    private f iRemoteDecoderDelegate = null;
    private g iRemoteHmsDecoderDelegate = null;

    @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
    public IRemoteDecoderDelegate newRemoteDecoderDelegate() throws RemoteException {
        o4.d(TAG, "newRemoteDecoderDelegate()");
        f fVarA = f.a();
        this.iRemoteDecoderDelegate = fVarA;
        return fVarA;
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
    public IRemoteHmsDecoderDelegate newRemoteHmsDecoderDelegate() throws RemoteException {
        o4.d(TAG, "newRemoteHmsDecoderDelegate()");
        g gVarA = g.a();
        this.iRemoteHmsDecoderDelegate = gVarA;
        return gVarA;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d2  */
    @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
    public IRemoteViewDelegate newRemoteViewDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcelable parcelable;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (iObjectWrapper == null) {
            o4.b("ScankitRemoteS", "Context is null");
            return null;
        }
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        boolean z15 = false;
        if (iObjectWrapper2 != null) {
            Object objUnwrap2 = ObjectWrapper.unwrap(iObjectWrapper2);
            if (objUnwrap2 instanceof Bundle) {
                Bundle bundle = (Bundle) objUnwrap2;
                boolean z16 = bundle.getBoolean(DetailRect.CUSTOMED_FLAG, false);
                int iB = bundle.getInt(DetailRect.FORMAT_FLAG, 0);
                Parcelable parcelable2 = bundle.getParcelable(DetailRect.RECT_FLAG);
                int i12 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.TYPE_TRANS, 0);
                DetailRect.HMSSCAN_SDK_VALUE = i12;
                boolean z17 = i12 >= 2;
                if (z17) {
                    iB = w7.b(iB);
                }
                boolean z18 = bundle.getBoolean(DetailRect.RETURN_BITMAP, false);
                z12 = bundle.getBoolean(DetailRect.SCAN_NEW_UI, false);
                int i13 = bundle.getInt(DetailRect.SCAN_VIEWTYPE_FLAG, 0);
                z10 = bundle.getBoolean(DetailRect.SCAN_CAMERA_PERMISSION, true);
                boolean z19 = bundle.getBoolean(HmsScanBase.SCAN_GUIDE_FLAG, false);
                if (z12 && (objUnwrap instanceof Context)) {
                    try {
                        com.huawei.hms.hmsscankit.g.b((Context) objUnwrap);
                    } catch (ClassNotFoundException unused) {
                        o4.a(TAG, "ClassNotFoundException");
                    } catch (IllegalAccessException unused2) {
                        o4.a(TAG, "IllegalAccessException");
                    } catch (NoSuchMethodException unused3) {
                        o4.a(TAG, "NoSuchMethodException");
                    } catch (InvocationTargetException unused4) {
                        o4.a(TAG, "InvocationTargetException");
                    }
                }
                z14 = z19;
                z11 = z17;
                z15 = z16;
                parcelable = parcelable2;
                i10 = i13;
                i11 = iB;
                z13 = z18;
            }
            if (z15) {
                if (objUnwrap instanceof Context) {
                    this.iRemoteViewDelegate = new e((Context) objUnwrap, i11, parcelable, iObjectWrapper2, z11, z13, !z12);
                }
            } else if (objUnwrap instanceof Context) {
                if (z12) {
                    this.iRemoteViewDelegate = new h((Context) objUnwrap, i11, iObjectWrapper2, z11, false, i10, z10, z14);
                } else {
                    this.iRemoteViewDelegate = new i((Context) objUnwrap, i11, iObjectWrapper2, z11, true);
                }
            }
            return this.iRemoteViewDelegate;
        }
        iObjectWrapper2 = ObjectWrapper.wrap(new Bundle());
        parcelable = null;
        z10 = true;
        z11 = false;
        i10 = 0;
        i11 = 0;
        z12 = false;
        z13 = false;
        z14 = false;
        if (z15) {
            if (objUnwrap instanceof Context) {
                this.iRemoteViewDelegate = new e((Context) objUnwrap, i11, parcelable, iObjectWrapper2, z11, z13, !z12);
            }
        } else if (objUnwrap instanceof Context) {
            if (z12) {
                this.iRemoteViewDelegate = new h((Context) objUnwrap, i11, iObjectWrapper2, z11, false, i10, z10, z14);
            } else {
                this.iRemoteViewDelegate = new i((Context) objUnwrap, i11, iObjectWrapper2, z11, true);
            }
        }
        return this.iRemoteViewDelegate;
    }
}
