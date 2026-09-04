package com.ss.android.ttvecamera;

import android.annotation.SuppressLint;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.bytedance.bpea.basics.BPEAException;
import com.bytedance.bpea.basics.Cert;

/* JADX INFO: compiled from: TECamera2PolicyAdapter.java */
/* JADX INFO: loaded from: classes8.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f97551a = "TECamera2PolicyAdapter";

    public static boolean a(Cert cert, boolean z10) {
        boolean z11 = true;
        if (cert == null) {
            q.k(f97551a, "privacyCert is null.");
            return true;
        }
        try {
            if (z10) {
                c7.b.C0266b.b(cert);
            } else {
                c7.b.C0266b.a(cert);
            }
        } catch (BPEAException e10) {
            z11 = false;
            q.e(f97551a, "error:" + e10.getErrorMsg() + " errorCode:" + e10.getCom.taobao.accs.common.Constants.KEY_ERROR_CODE java.lang.String());
        }
        q.k(f97551a, "check privacy:" + z11 + ", open:" + z10);
        return z11;
    }

    @w0(api = 21)
    public static void b(Cert cert, @n0 CameraDevice cameraDevice) {
        s.a("TECamera2PolicyAdapter-closeCamera");
        if (a(cert, false)) {
            cameraDevice.close();
        }
        s.b();
    }

    @w0(api = 21)
    @SuppressLint({"MissingPermission"})
    public static void c(Cert cert, CameraManager cameraManager, @n0 String str, @n0 CameraDevice.StateCallback stateCallback, @p0 Handler handler) throws CameraAccessException {
        s.a("TECamera2PolicyAdapter-openCamera");
        if (a(cert, true)) {
            cameraManager.openCamera(str, stateCallback, handler);
        }
        s.b();
    }
}
