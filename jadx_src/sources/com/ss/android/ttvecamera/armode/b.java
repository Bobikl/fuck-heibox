package com.ss.android.ttvecamera.armode;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import androidx.annotation.n0;
import com.ss.android.ttvecamera.framework.TECameraModeBase;
import com.ss.android.ttvecamera.h;
import com.ss.android.ttvecamera.o;
import com.ss.android.ttvecamera.provider.c;
import com.ss.android.ttvecamera.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: TEARVideoMode.java */
/* JADX INFO: loaded from: classes8.dex */
@TargetApi(21)
public class b extends TECameraModeBase {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f97315c0 = "b";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f97316d0 = 0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f97317e0 = 1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f97318f0 = 3;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f97319g0 = 4;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f97320h0 = 0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f97321i0 = 1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f97322j0 = 3;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f97323k0 = 4;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f97324l0 = 5;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f97325m0 = 6;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f97326n0 = 7;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private a f97327b0;

    public b(@n0 h hVar, @n0 Context context, @n0 CameraManager cameraManager, Handler handler) {
        super(hVar, context, handler);
        this.f97327b0 = null;
        this.f97467g = cameraManager;
        this.f97471k = new com.ss.android.ttvecamera.focusmanager.h(this);
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void C(int i10) {
        CaptureRequest.Builder builder = this.f97465e;
        if (builder == null) {
            String str = f97315c0;
            q.e(str, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: mCaptureRequestBuilder is null");
            q.e(str, "switchFlashMode: CaptureRequest.Builder is null");
            this.f97468h.c(this.f97470j.f97076b, -100, "switchFlashMode:CaptureRequest.Builder is null", this.f97472l);
            return;
        }
        if (i10 == 0) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f97465e.set(CaptureRequest.FLASH_MODE, 0);
        } else {
            if (i10 != 2) {
                q.u(f97315c0, "Video Mode not support this mode : " + i10);
                return;
            }
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f97465e.set(CaptureRequest.FLASH_MODE, 2);
        }
        this.f97470j.f97081d0 = i10;
        TECameraModeBase.f fVarC0 = C0(this.f97465e);
        if (fVarC0.c()) {
            return;
        }
        q.e(f97315c0, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -418. Reason: " + fVarC0.a());
        this.f97468h.e(o.f97688m0, o.f97688m0, "switch flash failed." + fVarC0.a(), this.f97472l);
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase, com.ss.android.ttvecamera.framework.a
    public int F() throws Exception {
        c cVarL = this.f97469i.L();
        if (this.f97472l == null || cVarL == null) {
            q.b(f97315c0, "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int iN = super.n();
        if (iN != 0) {
            return iN;
        }
        this.f97465e = this.f97472l.createCaptureRequest(3);
        ArrayList arrayList = new ArrayList();
        if (cVarL.f().j() == 8) {
            arrayList.addAll(Arrays.asList(cVarL.e()));
        } else {
            arrayList.add(cVarL.d());
        }
        Iterator<Surface> it = arrayList.iterator();
        while (it.hasNext()) {
            this.f97465e.addTarget(it.next());
        }
        this.f97465e.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, i0(new Range<>(Integer.valueOf(this.E.f97203b / this.f97470j.f97078c.f97205d), Integer.valueOf(this.E.f97204c / this.f97470j.f97078c.f97205d))));
        this.J = false;
        this.K = System.currentTimeMillis();
        Handler handlerQ0 = this.f97470j.f97094k ? q0() : this.f97473m;
        this.f97466f = null;
        l0(arrayList, this.Y, handlerQ0);
        if (this.f97466f == null) {
            G0();
        }
        return 0;
    }

    public void H0() {
        q.b(f97315c0, "closeARSession not supported");
    }

    public CameraDevice.StateCallback I0() {
        a aVar = this.f97327b0;
        if (aVar == null) {
            return null;
        }
        return aVar.a();
    }

    public void J0(Context context, Handler handler) {
        if (this.f97464d.m()) {
            a aVarB = a.b();
            this.f97327b0 = aVarB;
            aVarB.c(context, null);
            this.f97327b0.d(handler);
        }
    }

    public void K0(CameraDevice cameraDevice, int i10, int i11) {
    }

    public void L0(CameraCaptureSession cameraCaptureSession, int i10, Object obj) {
    }

    public CameraDevice.StateCallback M0(CameraDevice.StateCallback stateCallback, Handler handler) {
        q.b(f97315c0, "wrapDeviceStateCallback not supported");
        return null;
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase, com.ss.android.ttvecamera.focusmanager.b.a
    public int X() {
        if (this.f97465e == null) {
            this.f97468h.c(this.f97470j.f97076b, -100, "rollbackNormalSessionRequest : param is null.", this.f97472l);
            return -100;
        }
        F0(this.B);
        this.f97465e.set(CaptureRequest.CONTROL_AE_MODE, 1);
        C0(this.f97465e);
        return 0;
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase, com.ss.android.ttvecamera.focusmanager.b.a
    public int b() {
        CaptureRequest.Builder builder = this.f97465e;
        if (builder == null) {
            this.f97468h.c(this.f97470j.f97076b, -100, "rollbackNormalSessionRequest : param is null.", this.f97472l);
            return -100;
        }
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        this.f97465e.set(CaptureRequest.CONTROL_AF_MODE, 3);
        this.f97465e.set(CaptureRequest.CONTROL_AE_MODE, 1);
        C0(this.f97465e);
        return 0;
    }
}
