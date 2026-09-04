package com.ss.android.ttvecamera.camera2;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import androidx.annotation.w0;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.focusmanager.i;
import com.ss.android.ttvecamera.framework.TECameraModeBase;
import com.ss.android.ttvecamera.h;
import com.ss.android.ttvecamera.o;
import com.ss.android.ttvecamera.q;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: TEVideo2Mode.java */
/* JADX INFO: loaded from: classes8.dex */
@TargetApi(21)
public class f extends TECameraModeBase {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f97383b0 = "f";

    /* JADX INFO: compiled from: TEVideo2Mode.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f97384b;

        a(int i10) {
            this.f97384b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((TECameraModeBase) f.this).f97468h.c(((TECameraModeBase) f.this).f97470j.f97076b, this.f97384b, "updateCapture : something wrong.", ((TECameraModeBase) f.this).f97472l);
        }
    }

    public f(h hVar, Context context, CameraManager cameraManager, Handler handler) {
        super(hVar, context, handler);
        this.f97467g = cameraManager;
        if (this.f97470j.f97098m) {
            this.f97471k = new i(this);
        } else {
            this.f97471k = new com.ss.android.ttvecamera.focusmanager.h(this);
        }
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase, com.ss.android.ttvecamera.framework.a
    public int A() {
        return super.A();
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void C(int i10) {
        CaptureRequest.Builder builder = this.f97465e;
        if (builder == null) {
            String str = f97383b0;
            q.e(str, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: mCaptureRequestBuilder is null");
            q.e(str, "switchFlashMode: CaptureRequest.Builder is null");
            this.f97468h.c(this.f97470j.f97076b, -100, "switchFlashMode:CaptureRequest.Builder is null", this.f97472l);
            this.f97468h.g(this.f97470j.f97076b, -100, i10 == 0 ? 0 : 1, "switchFlashMode:CaptureRequest.Builder is null", this.f97472l);
            return;
        }
        if (i10 == 0) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f97465e.set(CaptureRequest.FLASH_MODE, 0);
        } else {
            if (i10 != 2) {
                String str2 = f97383b0;
                q.e(str2, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: not support flash mode " + i10);
                q.u(str2, "Video Mode not support this mode : " + i10);
                this.f97468h.g(this.f97470j.f97076b, -100, -1, "Video Mode not support this mode : " + i10, this.f97472l);
                return;
            }
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f97465e.set(CaptureRequest.FLASH_MODE, 2);
        }
        this.f97470j.f97081d0 = i10;
        this.f97468h.e(104, 0, "camera2 will change flash mode " + i10, null);
        TECameraModeBase.f fVarC0 = C0(this.f97465e);
        this.f97468h.e(105, 0, "camera2 did change flash mode " + i10, null);
        if (fVarC0.c()) {
            this.f97468h.h(this.f97470j.f97076b, 0, i10 != 0 ? 1 : 0, "torch success", this.f97472l);
            return;
        }
        q.e(f97383b0, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -418. Reason: " + fVarC0.a());
        this.f97468h.e(o.f97688m0, o.f97688m0, "switch flash failed." + fVarC0.a(), this.f97472l);
        this.f97468h.g(this.f97470j.f97076b, o.f97688m0, i10 == 0 ? 0 : 1, "switch flash failed." + fVarC0.a(), this.f97472l);
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase, com.ss.android.ttvecamera.framework.a
    @w0(api = 28)
    public int F() throws Exception {
        com.ss.android.ttvecamera.provider.c cVarL = this.f97469i.L();
        if (this.f97472l == null || cVarL == null) {
            q.b(f97383b0, "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int iN = super.n();
        if (iN != 0) {
            return iN;
        }
        TECameraSettings tECameraSettings = this.f97470j;
        if (!tECameraSettings.f97103o0 || this.f97465e == null) {
            if (tECameraSettings.E.getBoolean("enablePreviewTemplate")) {
                this.f97465e = this.f97472l.createCaptureRequest(1);
            } else {
                this.f97465e = this.f97472l.createCaptureRequest(3);
            }
        }
        ArrayList arrayList = new ArrayList();
        if (cVarL.f().j() == 8) {
            arrayList.addAll(Arrays.asList(cVarL.e()));
        } else if (cVarL.f().j() == 16) {
            arrayList.add(cVarL.d());
            arrayList.add(cVarL.f().d());
        } else {
            arrayList.add(cVarL.d());
        }
        boolean z10 = false;
        for (Surface surface : arrayList) {
            this.f97465e.addTarget(surface);
            if (!surface.isValid()) {
                z10 = true;
            }
        }
        this.f97465e.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, i0(new Range<>(Integer.valueOf(this.E.f97203b / this.f97470j.f97078c.f97205d), Integer.valueOf(this.E.f97204c / this.f97470j.f97078c.f97205d))));
        if (z10) {
            q.e(f97383b0, "start preview may be failed, surface invalid...");
        }
        this.J = false;
        this.K = System.currentTimeMillis();
        Handler handlerQ0 = this.f97470j.f97094k ? q0() : this.f97473m;
        if (this.f97470j.f97103o0) {
            if (!this.V.isEmpty() && !this.U) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    this.V.get(i10).addSurface(arrayList.get(i10));
                    this.U = true;
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && this.f97466f != null) {
                this.f97466f.finalizeOutputConfigurations(this.V);
                this.T = true;
                q.b(f97383b0, "finalizeOutputConfigurations in startPreview");
                try {
                    int iP = P();
                    if (iP != 0) {
                        u0();
                        a aVar = new a(iP);
                        if (this.f97470j.f97094k) {
                            this.f97473m.post(aVar);
                        } else {
                            aVar.run();
                        }
                    }
                } catch (Exception e10) {
                    u0();
                    e10.printStackTrace();
                }
            }
        } else {
            this.f97466f = null;
            l0(arrayList, this.Y, handlerQ0);
        }
        if (this.f97466f == null) {
            G0();
        }
        return 0;
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase, com.ss.android.ttvecamera.framework.a
    public int c() {
        return super.c();
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase
    protected int r0() {
        return 3;
    }
}
