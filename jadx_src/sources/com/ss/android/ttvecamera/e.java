package com.ss.android.ttvecamera;

import android.hardware.Camera;
import androidx.annotation.n0;
import com.bytedance.bpea.basics.BPEAException;
import com.bytedance.bpea.basics.Cert;

/* JADX INFO: compiled from: TECamera1PolicyAdapter.java */
/* JADX INFO: loaded from: classes8.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f97404a = "TECamera1PolicyAdapter";

    private static boolean a(Cert cert, boolean z10) {
        boolean z11;
        try {
            if (z10) {
                c7.b.C0266b.b(cert);
            } else {
                c7.b.C0266b.a(cert);
            }
            z11 = true;
        } catch (BPEAException e10) {
            q.e(f97404a, "error:" + e10.getErrorMsg() + " errorCode:" + e10.getCom.taobao.accs.common.Constants.KEY_ERROR_CODE java.lang.String());
            z11 = false;
        }
        q.k(f97404a, "check privacy:" + z11 + ", open:" + z10);
        return z11;
    }

    public static void b(Cert cert, @n0 Camera camera) {
        if (a(cert, false)) {
            camera.release();
        }
    }

    public static Camera c(Cert cert, int i10) {
        if (a(cert, true)) {
            return i10 >= 0 ? Camera.open(i10) : Camera.open();
        }
        return null;
    }
}
