package com.ss.android.ttvecamera.camera2;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.n0;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.TEFocusSettings;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.framework.TECameraModeBase;
import com.ss.android.ttvecamera.n;
import com.ss.android.ttvecamera.p;
import com.ss.android.ttvecamera.q;
import com.ss.android.ttvecamera.r;
import com.ss.android.ttvecamera.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: TEImage2Mode.java */
/* JADX INFO: loaded from: classes8.dex */
@TargetApi(21)
public class c extends TECameraModeBase {
    public static final String B0 = "TEImage2Mode";
    private static final String C0 = "CAPTURE_REQUEST_TAG_FOR_SHOT";
    private static final int D0 = 30;
    private static final int E0 = 5;
    private static final int F0 = 4096;
    private static final int G0 = 5;
    private static final long H0 = 1600;
    private static final long I0 = 800;
    private static final int J0 = 1000;
    private static final int K0 = 1001;
    private static final int L0 = 1002;
    private static final int M0 = 1003;
    private static final int N0 = 1004;
    private static final int O0 = 1005;
    private static final int P0 = 1006;
    private static final int Q0 = 1007;
    private static final int R0 = 0;
    private static final int S0 = 1;
    private static final int T0 = 2;
    private long A0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private long f97342b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final i f97343c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final Handler f97344d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    protected ImageReader f97345e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    protected ImageReader f97346f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f97347g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private TotalCaptureResult[] f97348h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private TotalCaptureResult f97349i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private volatile boolean f97350j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private List<CaptureRequest.Key<?>> f97351k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private int f97352l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private int f97353m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f97354n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f97355o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f97356p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f97357q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f97358r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f97359s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private long f97360t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private ConditionVariable f97361u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f97362v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f97363w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private TECameraSettings.r f97364x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private TECameraSettings.f f97365y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private int f97366z0;

    /* JADX INFO: compiled from: TEImage2Mode.java */
    public class a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f97367a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f97368b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f97369c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f97370d = -1;

        a() {
        }

        private void a(CaptureResult captureResult) {
            Integer num;
            int i10 = c.this.f97352l0;
            boolean z10 = true;
            if (i10 == 0) {
                Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                Integer numValueOf = Integer.valueOf(num2 != null ? num2.intValue() : -1);
                c.this.f97357q0 = numValueOf.intValue() == -1 || numValueOf.intValue() == 2 || numValueOf.intValue() == 4;
                CaptureRequest.Builder builder = ((TECameraModeBase) c.this).f97465e;
                if (builder == null || (num = (Integer) builder.get(CaptureRequest.CONTROL_AF_TRIGGER)) == null || num.intValue() != 1) {
                    return;
                }
                if (4 == numValueOf.intValue() || 5 == numValueOf.intValue() || -1 == numValueOf.intValue()) {
                    builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    if (c.this.f97343c0 != null) {
                        c.this.f97343c0.sendEmptyMessage(1004);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 != 1) {
                return;
            }
            Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
            Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num3 != null && num3.intValue() == 1) {
                c.this.f97355o0 = true;
                q.k(c.B0, "ae trigger start...");
            }
            if (c.this.f97355o0) {
                if (num4 == null || num4.intValue() == 2 || num4.intValue() == 4) {
                    c.this.f97355o0 = false;
                    q.k(c.B0, "ae converge, is shot can do");
                } else {
                    z10 = false;
                }
                if (!this.f97370d.equals(num4)) {
                    q.k(c.B0, "ae state:" + num4);
                }
                this.f97370d = num4;
            } else {
                z10 = false;
            }
            if (z10) {
                long jCurrentTimeMillis = System.currentTimeMillis() - c.this.f97342b0;
                c.this.f97352l0 = 0;
                c.this.f97355o0 = false;
                if (c.this.f97343c0 != null) {
                    c.this.f97343c0.removeMessages(1007);
                    c.this.f97343c0.sendEmptyMessage(1006);
                    c.this.f97343c0.sendEmptyMessage(1005);
                }
                q.k(c.B0, "send-capture-command consume = " + jCurrentTimeMillis);
            }
        }

        private void b(CaptureResult captureResult) {
            Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_MODE);
            Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
            Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_MODE);
            Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : -1);
            Integer numValueOf2 = Integer.valueOf(num2 != null ? num2.intValue() : -1);
            Integer numValueOf3 = Integer.valueOf(num3 != null ? num3.intValue() : -1);
            Integer numValueOf4 = Integer.valueOf(num4 != null ? num4.intValue() : -1);
            if (!this.f97367a.equals(numValueOf) || !this.f97368b.equals(numValueOf2) || !this.f97369c.equals(numValueOf3) || !this.f97370d.equals(numValueOf4)) {
                q.b(c.B0, "[afMode=" + numValueOf + ", afState=" + numValueOf2 + ",aeMode=" + numValueOf3 + ", aeState=" + numValueOf4 + "]");
            }
            this.f97367a = numValueOf;
            this.f97368b = numValueOf2;
            this.f97369c = numValueOf3;
            this.f97370d = numValueOf4;
            boolean z10 = true;
            if (c.C0.equals(captureResult.getRequest().getTag())) {
                c.this.f97356p0 = true;
                q.k(c.B0, "is shot can do");
            }
            if (!c.this.f97356p0) {
                q.b(c.B0, "discard previous callback");
                return;
            }
            if (numValueOf2.intValue() == -1 || numValueOf2.intValue() == 4 || numValueOf2.intValue() == 5 || numValueOf2.intValue() == 2) {
                if (numValueOf4.intValue() != -1 && numValueOf4.intValue() != 4 && numValueOf4.intValue() != 2) {
                    z10 = false;
                }
                if (z10) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - c.this.f97342b0;
                    c.this.f97343c0.removeMessages(1001);
                    c.this.f97343c0.sendEmptyMessage(1000);
                    c.this.f97356p0 = false;
                    q.k(c.B0, "send-capture-command consume = " + jCurrentTimeMillis);
                    n.b(n.f97657u, jCurrentTimeMillis);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 Surface surface, long j10) {
            if (c.this.f97352l0 == 2 && c.C0.equals(captureRequest.getTag())) {
                c.this.f97356p0 = true;
                q.e(c.B0, "onCaptureBufferLost: ");
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 TotalCaptureResult totalCaptureResult) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - c.this.A0 > 1000) {
                q.b(c.B0, "on frame arrived fps: " + c.this.f97366z0);
                c.this.f97366z0 = 0;
                c.this.A0 = jCurrentTimeMillis;
            } else {
                c.O1(c.this);
            }
            a(totalCaptureResult);
            if (!((TECameraModeBase) c.this).J) {
                c.this.u0();
                ((TECameraModeBase) c.this).J = true;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - ((TECameraModeBase) c.this).M;
                q.k(c.B0, "first preview frame callback arrived! consume = " + jCurrentTimeMillis2 + ", session consume: " + ((TECameraModeBase) c.this).L);
                n.b(n.f97655s, jCurrentTimeMillis2);
                q.l(n.f97655s, Long.valueOf(jCurrentTimeMillis2));
            }
            if (c.this.f97352l0 == 2) {
                b(totalCaptureResult);
            }
            c.Q0(c.this);
            if (c.this.f97359s0 != 0 && c.this.f97358r0 > c.this.f97359s0) {
                c.this.f97358r0 = 0;
                Runtime.getRuntime().gc();
            }
            c.U0(c.this);
            if (c.this.f97347g0 % 5 == 0) {
                c.this.f97347g0 = 0;
            }
            if (c.this.f97348h0 != null) {
                c.this.f97348h0[c.this.f97347g0] = totalCaptureResult;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 CaptureFailure captureFailure) {
            if (c.this.f97352l0 == 2 && c.C0.equals(captureRequest.getTag())) {
                c.this.f97356p0 = true;
                q.e(c.B0, "onCaptureFailed: ");
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 CaptureResult captureResult) {
            a(captureResult);
        }
    }

    /* JADX INFO: compiled from: TEImage2Mode.java */
    public class b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f97372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f97373b;

        b(int i10, int i11) {
            this.f97372a = i10;
            this.f97373b = i11;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 Surface surface, long j10) {
            q.k(c.B0, "capture burst buffer last...");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 TotalCaptureResult totalCaptureResult) {
            q.k(c.B0, "onCaptureCompleted, aeExposure: " + ((Integer) totalCaptureResult.get(TotalCaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION)) + ", iso: " + ((Integer) totalCaptureResult.get(TotalCaptureResult.SENSOR_SENSITIVITY)) + ", exposureTime: " + ((Long) totalCaptureResult.get(TotalCaptureResult.SENSOR_EXPOSURE_TIME)));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 CaptureFailure captureFailure) {
            String str = "capture burst failed: " + captureFailure.getReason();
            c.this.f97365y0.a(this.f97372a, this.f97373b, c.this.f97353m0 == 1 ? 270 : 90, null);
            q.k(c.B0, str);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.camera2.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TEImage2Mode.java */
    public class C0926c extends CameraCaptureSession.CaptureCallback {
        C0926c() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 TotalCaptureResult totalCaptureResult) {
            if (((TECameraModeBase) c.this).f97465e == null) {
                return;
            }
            c.this.f97349i0 = totalCaptureResult;
            Integer num = (Integer) ((TECameraModeBase) c.this).f97465e.get(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER);
            Integer num2 = (Integer) ((TECameraModeBase) c.this).f97465e.get(CaptureRequest.CONTROL_AF_TRIGGER);
            if ((num != null && num.intValue() == 1) || (num2 != null && num2.intValue() == 1)) {
                q.k(c.B0, "need cancel ae af trigger");
                ((TECameraModeBase) c.this).f97465e.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
                ((TECameraModeBase) c.this).f97465e.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                c cVar = c.this;
                TECameraModeBase.f fVarF0 = cVar.f0(((TECameraModeBase) cVar).f97465e, null, null);
                if (!fVarF0.c()) {
                    q.u(c.B0, "onCaptureSequenceCompleted: error = " + fVarF0.a());
                    return;
                }
                ((TECameraModeBase) c.this).f97465e.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
                ((TECameraModeBase) c.this).f97465e.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            }
            c cVar2 = c.this;
            cVar2.C0(((TECameraModeBase) cVar2).f97465e);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            q.e(c.B0, "captureStillPicture, capture failed");
            if (((TECameraModeBase) c.this).f97470j.f97107q0) {
                ((TECameraModeBase) c.this).f97470j.f97107q0 = false;
            }
            if (((TECameraModeBase) c.this).f97470j.f97088h) {
                ((TECameraModeBase) c.this).f97470j.f97088h = false;
            }
            c.this.f97343c0.sendMessage(c.this.f97343c0.obtainMessage(1003, new Exception("Capture failed: " + captureFailure.getReason())));
            c.this.f97343c0.sendEmptyMessage(1002);
        }
    }

    /* JADX INFO: compiled from: TEImage2Mode.java */
    public class d extends CameraCaptureSession.CaptureCallback {
        d() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 TotalCaptureResult totalCaptureResult) {
            q.b(c.B0, "onCaptureCompleted, do capture done");
            c.this.f97343c0.sendEmptyMessage(1002);
            c.this.f97349i0 = totalCaptureResult;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 CaptureFailure captureFailure) {
            q.e(c.B0, "onCaptureCompleted, do capture failed");
            if (((TECameraModeBase) c.this).f97470j.f97107q0) {
                ((TECameraModeBase) c.this).f97470j.f97107q0 = false;
            }
            if (((TECameraModeBase) c.this).f97470j.f97088h) {
                ((TECameraModeBase) c.this).f97470j.f97088h = false;
            }
            c.this.f97343c0.sendMessage(c.this.f97343c0.obtainMessage(1003, new Exception("Capture failed: " + captureFailure.getReason())));
            c.this.f97343c0.sendEmptyMessage(1002);
        }
    }

    /* JADX INFO: compiled from: TEImage2Mode.java */
    public class e implements Executor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Handler f97377b;

        e(Handler handler) {
            this.f97377b = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Handler handler = this.f97377b;
            if (handler != null) {
                handler.post(runnable);
            } else {
                q.e(c.B0, "executor run, handler is null");
            }
        }
    }

    /* JADX INFO: compiled from: TEImage2Mode.java */
    public class f implements ImageReader.OnImageAvailableListener {
        f() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            if (c.this.f97350j0) {
                c.this.f97350j0 = false;
                if (imageAcquireNextImage != null) {
                    long timestamp = imageAcquireNextImage.getTimestamp();
                    TotalCaptureResult totalCaptureResult = null;
                    for (TotalCaptureResult totalCaptureResult2 : c.this.f97348h0) {
                        Long l10 = (Long) totalCaptureResult2.get(TotalCaptureResult.SENSOR_TIMESTAMP);
                        if (l10 != null && timestamp >= l10.longValue()) {
                            totalCaptureResult = totalCaptureResult2;
                            break;
                        }
                    }
                    c.this.b2(imageAcquireNextImage, totalCaptureResult);
                } else {
                    c.this.a2(new Exception("no image data"), -1000);
                }
            }
            if (imageAcquireNextImage != null) {
                imageAcquireNextImage.close();
            }
        }
    }

    /* JADX INFO: compiled from: TEImage2Mode.java */
    public class g implements ImageReader.OnImageAvailableListener {
        g() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            if (imageAcquireNextImage == null) {
                c.this.a2(new Exception("no image data"), -1000);
                return;
            }
            c.this.b2(imageAcquireNextImage, imageAcquireNextImage.getFormat() != 256 ? c.this.f97349i0 : null);
            c.this.f97349i0 = null;
            imageAcquireNextImage.close();
        }
    }

    /* JADX INFO: compiled from: TEImage2Mode.java */
    public class h extends CameraCaptureSession.CaptureCallback {
        h() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 Surface surface, long j10) {
            c.this.f97361u0.open();
            q.e(c.B0, "set flash request abort");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 TotalCaptureResult totalCaptureResult) {
            c.this.f97361u0.open();
            q.k(c.B0, "onCaptureCompleted");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 CaptureFailure captureFailure) {
            c.this.f97361u0.open();
            q.e(c.B0, "set flash failed");
        }
    }

    /* JADX INFO: compiled from: TEImage2Mode.java */
    public class i extends Handler {
        public i(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            q.k(c.B0, "dispatch msg = " + message.what);
            switch (message.what) {
                case 1000:
                case 1001:
                    c.this.W1();
                    break;
                case 1002:
                    c.this.c2();
                    break;
                case 1003:
                    c.this.a2((Exception) message.obj, -1000);
                    break;
                case 1004:
                    c cVar = c.this;
                    cVar.C0(((TECameraModeBase) cVar).f97465e);
                    break;
                case 1005:
                    c.this.T1();
                    break;
                case 1006:
                case 1007:
                    c.this.U1();
                    break;
            }
        }
    }

    public c(com.ss.android.ttvecamera.h hVar, Context context, CameraManager cameraManager, Handler handler) {
        super(hVar, context, handler);
        this.f97342b0 = 0L;
        this.f97344d0 = new Handler(Looper.getMainLooper());
        this.f97346f0 = null;
        this.f97347g0 = -1;
        this.f97349i0 = null;
        this.f97350j0 = false;
        this.f97351k0 = null;
        this.f97352l0 = 0;
        this.f97354n0 = false;
        this.f97355o0 = false;
        this.f97356p0 = false;
        this.f97357q0 = false;
        this.f97358r0 = 0;
        this.f97359s0 = 0;
        this.f97360t0 = 0L;
        this.f97361u0 = null;
        this.f97362v0 = -1;
        this.f97363w0 = 0;
        this.f97365y0 = null;
        this.f97366z0 = 0;
        this.A0 = 0L;
        this.f97467g = cameraManager;
        if (this.f97470j.f97098m) {
            this.f97471k = new com.ss.android.ttvecamera.focusmanager.g(this);
        } else {
            this.f97471k = new com.ss.android.ttvecamera.focusmanager.f(this);
        }
        this.f97343c0 = new i(handler.getLooper());
        Z1();
    }

    static /* synthetic */ int O1(c cVar) {
        int i10 = cVar.f97366z0;
        cVar.f97366z0 = i10 + 1;
        return i10;
    }

    static /* synthetic */ int Q0(c cVar) {
        int i10 = cVar.f97358r0;
        cVar.f97358r0 = i10 + 1;
        return i10;
    }

    private void Q1() {
        CameraCharacteristics cameraCharacteristics;
        if (this.f97470j.Z && (cameraCharacteristics = this.f97463c) != null) {
            Range<Integer> rangeX1 = X1((Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
            CaptureRequest.Builder builder = this.f97465e;
            if (builder != null && rangeX1 != null) {
                builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeX1);
                C0(this.f97465e);
                q.k(B0, "apply capture scene: " + rangeX1);
            }
        }
        S1();
    }

    private void R1() {
        CameraCharacteristics cameraCharacteristics;
        if (this.f97470j.Z && (cameraCharacteristics = this.f97463c) != null) {
            Range<Integer> rangeY1 = Y1((Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
            CaptureRequest.Builder builder = this.f97465e;
            if (builder != null && rangeY1 != null) {
                builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeY1);
                C0(this.f97465e);
                q.k(B0, "apply record scene: " + rangeY1);
            }
        }
        V1();
    }

    private void S1() {
        Surface surface;
        ImageReader imageReader = this.f97346f0;
        if (imageReader == null || (surface = imageReader.getSurface()) == null || !surface.isValid()) {
            return;
        }
        CaptureRequest.Builder builder = this.f97465e;
        if (builder != null) {
            try {
                builder.removeTarget(surface);
                this.f97465e.addTarget(surface);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        C0(this.f97465e);
    }

    static /* synthetic */ int U0(c cVar) {
        int i10 = cVar.f97347g0;
        cVar.f97347g0 = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U1() {
        this.f97360t0 = System.currentTimeMillis();
        this.f97352l0 = 0;
        CaptureRequest.Builder builderK0 = k0(2);
        if (builderK0 == null) {
            a2(new Exception("capture build is null"), -1001);
            return;
        }
        ImageReader imageReader = this.f97345e0;
        if (imageReader == null) {
            a2(new Exception("image reader is null"), -1001);
            return;
        }
        builderK0.addTarget(imageReader.getSurface());
        g2(builderK0);
        TECameraModeBase.f fVarF0 = f0(builderK0, new C0926c(), this.f97473m);
        if (fVarF0.c()) {
            return;
        }
        a2(fVarF0.b(), -1001);
    }

    private void V1() {
        Surface surface;
        ImageReader imageReader = this.f97346f0;
        if (imageReader == null || (surface = imageReader.getSurface()) == null || !surface.isValid()) {
            return;
        }
        CaptureRequest.Builder builder = this.f97465e;
        if (builder != null) {
            try {
                builder.removeTarget(surface);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        C0(this.f97465e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W1() {
        this.f97360t0 = System.currentTimeMillis();
        this.f97352l0 = 0;
        CaptureRequest.Builder builderK0 = k0(2);
        if (builderK0 == null) {
            a2(new Exception("capture build is null"), -1001);
            return;
        }
        ImageReader imageReader = this.f97345e0;
        if (imageReader == null) {
            a2(new Exception("image reader is null"), -1001);
            return;
        }
        builderK0.addTarget(imageReader.getSurface());
        g2(builderK0);
        TECameraModeBase.f fVarF0 = f0(builderK0, new d(), null);
        if (fVarF0.c()) {
            return;
        }
        a2(fVarF0.b(), -1001);
    }

    private Range<Integer> X1(Range<Integer>[] rangeArr) {
        int i10;
        int i11;
        Range<Integer> range = null;
        if (rangeArr != null) {
            TECameraSettings tECameraSettings = this.f97470j;
            if (tECameraSettings == null || (i10 = tECameraSettings.Y) < 30) {
                i10 = 30;
            }
            int i12 = 0;
            int i13 = 0;
            for (Range<Integer> range2 : rangeArr) {
                q.b(B0, "fps: " + range2.toString());
                int iIntValue = ((Integer) range2.getUpper()).intValue();
                int iIntValue2 = ((Integer) range2.getLower()).intValue();
                if (iIntValue2 < 5) {
                    q.k(B0, "discard fps: " + range2.toString());
                } else {
                    if (iIntValue > i12) {
                        i12 = iIntValue;
                    }
                    if (iIntValue <= i10 && (i11 = iIntValue - iIntValue2) > i13) {
                        range = range2;
                        i13 = i11;
                    }
                }
            }
            if (i12 > 30) {
                n.b(n.f97642f, i12);
            }
        }
        return range;
    }

    private Range<Integer> Y1(Range<Integer>[] rangeArr) {
        int i10;
        Range<Integer> range = null;
        if (rangeArr != null) {
            TECameraSettings tECameraSettings = this.f97470j;
            int i11 = 30;
            if (tECameraSettings != null && (i10 = tECameraSettings.Y) >= 30) {
                i11 = i10;
            }
            int i12 = 0;
            int i13 = 0;
            for (Range<Integer> range2 : rangeArr) {
                q.b(B0, "fps: " + range2.toString());
                int iIntValue = ((Integer) range2.getUpper()).intValue();
                if (iIntValue > i12) {
                    i12 = iIntValue;
                }
                if (iIntValue <= i11 && iIntValue == ((Integer) range2.getLower()).intValue() && iIntValue > i13) {
                    range = range2;
                    i13 = iIntValue;
                }
            }
        }
        return range;
    }

    private void Z1() {
        this.Z = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a2(Exception exc, int i10) {
        if (this.f97364x0 != null) {
            com.ss.android.ttvecamera.h hVar = this.f97469i;
            if (hVar != null) {
                exc = hVar.h(exc, i10);
            }
            this.f97364x0.a(exc);
        }
        this.f97352l0 = 0;
        q.u(B0, "onCaptureFailed, err = " + exc + ", errCode = " + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b2(Image image, TotalCaptureResult totalCaptureResult) {
        int width = image.getWidth();
        int height = image.getHeight();
        int i10 = this.f97353m0 == 1 ? 270 : 90;
        q.k(B0, "on image available, consume: " + (System.currentTimeMillis() - this.f97360t0) + ", size: " + width + "x" + height + ", format: " + image.getFormat() + ", rotation: " + i10);
        if (this.f97364x0 != null) {
            TECameraFrame tECameraFrame = new TECameraFrame(new r(image.getPlanes()), image.getFormat() == 256 ? TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_JPEG : TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_YUV420, width, height, i10);
            if (image.getFormat() == 35) {
                TECameraFrame.d dVar = new TECameraFrame.d();
                dVar.f96874c = System.currentTimeMillis();
                dVar.f96875d = totalCaptureResult;
                tECameraFrame.v(dVar);
                byte[] bArr = new byte[((width * height) * 3) / 2];
                if (p.B(image, bArr)) {
                    tECameraFrame = new TECameraFrame(bArr, TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_NV21, width, height, i10);
                } else {
                    q.u(B0, "convert nv21 failed");
                }
            }
            this.f97364x0.b(tECameraFrame, this.f97469i);
        }
        if (this.f97365y0 != null) {
            byte[] bArr2 = new byte[((width * height) * 3) / 2];
            if (p.B(image, bArr2)) {
                this.f97365y0.a(width, height, i10, bArr2);
            } else {
                this.f97365y0.a(width, height, i10, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c2() {
        TECameraSettings tECameraSettings = this.f97470j;
        if (tECameraSettings.f97080d != 0) {
            return;
        }
        CaptureRequest.Builder builder = this.f97465e;
        if (builder == null) {
            q.e(B0, "resetPreviewAfterFlashCapture failed, no builder");
            return;
        }
        int i10 = tECameraSettings.f97085f0;
        if (i10 == 3) {
            if (this.O) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 3);
                this.f97465e.set(CaptureRequest.FLASH_MODE, 1);
            }
        } else if (i10 == 2 && this.f97354n0) {
            builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            f0(this.f97465e, null, null);
        }
        if (this.f97354n0) {
            this.f97465e.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        }
        this.f97465e.set(CaptureRequest.CONTROL_AF_MODE, 4);
        this.f97465e.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
        C0(this.f97465e);
    }

    private TEFrameSizei d2(int i10, int i11, int i12, int i13) {
        TECameraSettings tECameraSettings = this.f97470j;
        if (tECameraSettings.A) {
            tECameraSettings.A = false;
            return tECameraSettings.f97108r;
        }
        if (this.f97474n == null) {
            this.f97474n = (StreamConfigurationMap) this.f97463c.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        }
        StreamConfigurationMap streamConfigurationMap = this.f97474n;
        TEFrameSizei tEFrameSizeiA = null;
        if (streamConfigurationMap == null) {
            q.e(B0, "no stream configuration map...");
            return null;
        }
        if (!streamConfigurationMap.isOutputSupportedFor(i10)) {
            q.e(B0, "Output format is not supported");
            return null;
        }
        Size[] outputSizes = this.f97474n.getOutputSizes(i10);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        TECameraSettings tECameraSettings2 = this.f97470j;
        if (tECameraSettings2.f97124z) {
            return p.u(arrayList, tECameraSettings2.c(), i13, this.f97470j.f97122y);
        }
        if (this.f97483w != null) {
            if (!StreamConfigurationMap.isOutputSupportedFor(SurfaceTexture.class)) {
                q.e(B0, "Output SurfaceTexture is not supported");
                return null;
            }
            Size[] outputSizes2 = this.f97474n.getOutputSizes(SurfaceTexture.class);
            ArrayList arrayList2 = new ArrayList();
            for (Size size2 : outputSizes2) {
                arrayList2.add(new TEFrameSizei(size2.getWidth(), size2.getHeight()));
            }
            try {
                tEFrameSizeiA = this.f97483w.a(arrayList, arrayList2);
            } catch (Exception e10) {
                q.e(B0, "select pic size from client err: " + e10.getMessage());
            }
        }
        if (tEFrameSizeiA != null) {
            return tEFrameSizeiA;
        }
        TEFrameSizei tEFrameSizeiV = p.v(arrayList, this.f97470j.c(), new TEFrameSizei(i11, i12));
        q.k(B0, "select pic size is null, get closest size: " + tEFrameSizeiV);
        return tEFrameSizeiV;
    }

    private void g2(CaptureRequest.Builder builder) {
        if (builder == null) {
            q.e(B0, "syncPreviewParam failed, no capture builder");
            return;
        }
        CaptureRequest.Builder builder2 = this.f97465e;
        if (builder2 == null) {
            q.e(B0, "syncPreviewParam failed, no preview builder");
            return;
        }
        Integer num = (Integer) builder2.get(CaptureRequest.CONTROL_AF_MODE);
        if (num != null) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, num);
            q.b(B0, "sync afMode: " + num);
        }
        MeteringRectangle[] meteringRectangleArr = (MeteringRectangle[]) this.f97465e.get(CaptureRequest.CONTROL_AE_REGIONS);
        if (meteringRectangleArr != null) {
            builder.set(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr);
            q.b(B0, "sync aeRect: " + Arrays.toString(meteringRectangleArr));
        }
        MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) this.f97465e.get(CaptureRequest.CONTROL_AF_REGIONS);
        if (meteringRectangleArr != null) {
            builder.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr2);
            q.b(B0, "sync afRect: " + Arrays.toString(meteringRectangleArr2));
        }
        e2(this.f97465e, builder);
        Range range = (Range) this.f97465e.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE);
        if (range != null) {
            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
            q.b(B0, "sync fpsRange: " + range);
        }
        Rect rect = this.f97482v;
        if (rect != null) {
            builder.set(CaptureRequest.SCALER_CROP_REGION, rect);
            q.b(B0, "sync crop region: " + this.f97482v);
        }
        com.ss.android.ttvecamera.hardware.d dVar = this.f97464d;
        if (dVar != null) {
            dVar.a(this.f97463c, builder, false);
        }
        builder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f97481u));
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void C(int i10) {
        TECameraModeBase.f fVarC0;
        if (this.f97465e == null) {
            q.e(B0, "switchFlashMode failed, mode: " + i10);
            return;
        }
        boolean z10 = false;
        int i11 = this.f97362v0;
        if (i11 != -1 && i11 != 0 && i10 == 0) {
            z10 = true;
        }
        h2(i10);
        if (z10) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f97361u0 == null) {
                this.f97361u0 = new ConditionVariable();
            }
            this.f97361u0.close();
            fVarC0 = E0(this.f97465e, new h(), this.f97344d0);
            if (!this.f97361u0.block(33L)) {
                q.k(B0, "close flash: " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
            }
            C0(this.f97465e);
        } else {
            fVarC0 = C0(this.f97465e);
        }
        if (fVarC0.c()) {
            return;
        }
        q.e(B0, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: " + fVarC0.a());
        this.f97468h.e(-100, -100, fVarC0.a(), this.f97472l);
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase, com.ss.android.ttvecamera.framework.a
    public int[] D() {
        ImageReader imageReader = this.f97345e0;
        if (imageReader == null) {
            return null;
        }
        int width = imageReader.getWidth();
        int height = this.f97345e0.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        return new int[]{width, height};
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase, com.ss.android.ttvecamera.framework.a
    public int F() throws Exception {
        s.a("TEImage2Mode-startPreview");
        this.O = false;
        Float f10 = (Float) this.f97463c.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        int iIntValue = f10 == null ? 0 : f10.intValue();
        q.b(B0, "lensInfoMinFocusDistance = " + iIntValue);
        boolean z10 = true;
        this.f97354n0 = iIntValue != 0;
        com.ss.android.ttvecamera.provider.c cVarL = this.f97469i.L();
        if (this.f97472l == null || cVarL == null) {
            q.e(B0, "CameraDevice or ProviderManager is null!");
            return -100;
        }
        if (this.f97470j.f97105p0) {
            if (cVarL.f() != null) {
                cVarL.f().q();
                q.k(B0, "reallocate st...");
            } else {
                q.e(B0, "reallocate st...err");
            }
        }
        int iN = super.n();
        if (iN != 0) {
            return iN;
        }
        TEFrameSizei tEFrameSizei = this.f97470j.f97108r;
        f2(tEFrameSizei.f97206b, tEFrameSizei.f97207c);
        CaptureRequest.Builder builderCreateCaptureRequest = this.f97472l.createCaptureRequest(1);
        this.f97465e = builderCreateCaptureRequest;
        Rect rect = this.f97482v;
        if (rect != null) {
            builderCreateCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, rect);
        }
        ArrayList arrayList = new ArrayList();
        if (cVarL.f().j() == 8) {
            arrayList.addAll(Arrays.asList(cVarL.e()));
        } else {
            arrayList.add(cVarL.d());
        }
        ImageReader imageReader = this.f97346f0;
        if (imageReader != null) {
            arrayList.add(imageReader.getSurface());
        }
        Iterator<Surface> it = arrayList.iterator();
        while (it.hasNext()) {
            this.f97465e.addTarget(it.next());
        }
        ImageReader imageReader2 = this.f97345e0;
        if (imageReader2 != null) {
            arrayList.add(imageReader2.getSurface());
        }
        this.f97465e.set(CaptureRequest.CONTROL_AF_MODE, 4);
        TECameraSettings tECameraSettings = this.f97470j;
        if (tECameraSettings.Z) {
            if (Build.VERSION.SDK_INT >= 28) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                CameraCharacteristics cameraCharacteristics = this.f97463c;
                if (cameraCharacteristics != null && this.f97351k0 == null) {
                    this.f97351k0 = cameraCharacteristics.getAvailableSessionKeys();
                }
                List<CaptureRequest.Key<?>> list = this.f97351k0;
                if (list == null) {
                    z10 = false;
                    break;
                }
                Iterator<CaptureRequest.Key<?>> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z10 = false;
                        break;
                    }
                    if (CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE.getName().equals(it2.next().getName())) {
                        this.f97470j.Z = false;
                        break;
                    }
                }
                q.k(B0, "check aeTargetFpsRange is session key: " + z10 + ", consume: " + (System.currentTimeMillis() - jCurrentTimeMillis));
            } else {
                tECameraSettings.Z = false;
            }
        }
        this.A0 = 0L;
        this.f97366z0 = 0;
        this.f97358r0 = 0;
        this.f97347g0 = -1;
        int i10 = this.f97470j.X;
        this.f97359s0 = i10;
        if (i10 > 0) {
            q.k(B0, "release camera metadata threshold: " + this.f97359s0);
        }
        this.f97357q0 = false;
        this.f97352l0 = 0;
        this.K = System.currentTimeMillis();
        Handler handlerQ0 = this.f97470j.f97094k ? q0() : this.f97473m;
        this.f97466f = null;
        l0(arrayList, this.Y, handlerQ0);
        if (this.f97466f == null) {
            G0();
        }
        s.b();
        return 0;
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase, com.ss.android.ttvecamera.framework.a
    public int H(int i10, int i11) {
        TECameraSettings tECameraSettings = this.f97470j;
        tECameraSettings.A = true;
        TEFrameSizei tEFrameSizei = tECameraSettings.f97108r;
        tEFrameSizei.f97206b = i10;
        tEFrameSizei.f97207c = i11;
        p();
        try {
            return F();
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase, com.ss.android.ttvecamera.framework.a
    public int[] K() {
        ImageReader imageReader = this.f97345e0;
        if (imageReader == null) {
            return null;
        }
        return new int[]{imageReader.getWidth(), this.f97345e0.getHeight()};
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase, com.ss.android.ttvecamera.framework.a
    public int P() throws CameraAccessException {
        h2(this.f97362v0);
        return super.P();
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase, com.ss.android.ttvecamera.framework.a
    public void Q(rg.a aVar, int i10, TECameraSettings.f fVar) {
        int i11;
        int i12;
        int i13 = aVar.f139132c;
        if ((i13 != 0 && i13 != this.f97345e0.getWidth()) || ((i11 = aVar.f139133d) != 0 && i11 != this.f97345e0.getHeight())) {
            q.e(B0, "restart preview for burst capture");
            this.f97470j.f97094k = true;
            H(aVar.f139132c, aVar.f139133d);
        }
        this.f97364x0 = null;
        this.f97365y0 = fVar;
        this.f97353m0 = i10;
        this.f97360t0 = System.currentTimeMillis();
        int width = this.f97345e0.getWidth();
        int height = this.f97345e0.getHeight();
        List<Integer> list = aVar.f139131b;
        b bVar = new b(width, height);
        int i14 = aVar.f139130a;
        if (i14 == 1) {
            ArrayList arrayList = new ArrayList(list.size());
            for (Integer num : list) {
                CaptureRequest.Builder builderK0 = k0(2);
                g2(builderK0);
                builderK0.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, num);
                builderK0.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.TRUE);
                builderK0.addTarget(this.f97345e0.getSurface());
                arrayList.add(builderK0.build());
            }
            h0(arrayList, bVar, null);
            return;
        }
        if (i14 == 0) {
            if (aVar.f139135f) {
                B0();
            }
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                Integer num2 = list.get(i15);
                CaptureRequest.Builder builderK1 = k0(2);
                g2(builderK1);
                builderK1.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, num2);
                builderK1.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.TRUE);
                builderK1.addTarget(this.f97345e0.getSurface());
                g0(builderK1.build(), bVar, null);
                if (i15 > 0 && i15 < size - 1 && (i12 = aVar.f139134e) > 0) {
                    try {
                        Thread.sleep(i12);
                    } catch (InterruptedException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            if (aVar.f139135f) {
                C0(this.f97465e);
            }
        }
    }

    public void T1() {
        Integer num = (Integer) this.f97465e.get(CaptureRequest.CONTROL_AF_TRIGGER);
        if (num == null || num.intValue() != 1) {
            return;
        }
        q.k(B0, "need cancel af trigger");
        this.f97465e.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        f0(this.f97465e, null, null);
        this.f97465e.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        C0(this.f97465e);
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase, com.ss.android.ttvecamera.focusmanager.b.a
    public int X() {
        CaptureRequest.Builder builder = this.f97465e;
        if (builder == null) {
            this.f97468h.c(this.f97470j.f97076b, -100, "rollbackMeteringSessionRequest : param is null.", this.f97472l);
            return -100;
        }
        builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        return super.X();
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase, com.ss.android.ttvecamera.framework.a
    public int Z(boolean z10) {
        C(z10 ? 2 : 0);
        return 0;
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase, com.ss.android.ttvecamera.framework.a
    public void e(int i10, int i11, TECameraSettings.r rVar) {
        m(rVar, this.f97470j.f97080d);
    }

    public void e2(CaptureRequest.Builder builder, CaptureRequest.Builder builder2) {
        Integer num;
        Integer num2 = (Integer) builder.get(CaptureRequest.CONTROL_AE_MODE);
        if (num2 != null && num2.intValue() == 3) {
            builder2.set(CaptureRequest.CONTROL_AE_MODE, 3);
            builder2.set(CaptureRequest.FLASH_MODE, 1);
        } else {
            if (num2 == null || num2.intValue() != 1 || (num = (Integer) builder.get(CaptureRequest.FLASH_MODE)) == null || num.intValue() != 2) {
                return;
            }
            builder2.set(CaptureRequest.CONTROL_AE_MODE, 1);
            builder2.set(CaptureRequest.FLASH_MODE, 2);
        }
    }

    protected void f2(int i10, int i11) {
        boolean z10;
        Size size;
        TECameraSettings tECameraSettings = this.f97470j;
        int i12 = 256;
        int i13 = (tECameraSettings.f97107q0 || tECameraSettings.f97088h) ? 35 : 256;
        TEFrameSizei tEFrameSizeiD2 = d2(i13, i10, i11, tECameraSettings.f97114u);
        if (tEFrameSizeiD2 == null) {
            q.e(B0, "select picture size failed...format: " + i13);
            return;
        }
        TECameraSettings tECameraSettings2 = this.f97470j;
        tECameraSettings2.f97108r = tEFrameSizeiD2;
        int width = tEFrameSizeiD2.f97206b;
        int height = tEFrameSizeiD2.f97207c;
        int i14 = 0;
        if (tECameraSettings2.f97088h && width <= 4096 && i13 == 35) {
            this.f97348h0 = new TotalCaptureResult[5];
            ImageReader imageReaderNewInstance = ImageReader.newInstance(width, height, i13, 3);
            this.f97346f0 = imageReaderNewInstance;
            imageReaderNewInstance.setOnImageAvailableListener(new f(), this.f97344d0);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Size[] outputSizes = this.f97474n.getOutputSizes(256);
            if (outputSizes == null) {
                size = null;
                break;
            }
            int length = outputSizes.length;
            while (true) {
                if (i14 >= length) {
                    size = null;
                    break;
                }
                size = outputSizes[i14];
                if (size.getWidth() == width && size.getHeight() == height) {
                    break;
                } else {
                    i14++;
                }
            }
            if (size == null) {
                this.f97348h0 = null;
                this.f97346f0.setOnImageAvailableListener(null, null);
                this.f97346f0.close();
                this.f97346f0 = null;
                i12 = i13;
            } else {
                width = size.getWidth();
                height = size.getHeight();
            }
        } else {
            i12 = i13;
        }
        this.f97345e0 = ImageReader.newInstance(width, height, i12, 1);
        q.k(B0, "image reader width: " + this.f97345e0.getWidth() + ", height = " + this.f97345e0.getHeight() + ", format: " + i12 + ", maxWidth: " + this.f97470j.f97114u + ", hasZslYuvSurface: " + z10);
        this.f97345e0.setOnImageAvailableListener(new g(), this.f97344d0);
    }

    public void h2(int i10) {
        q.k(B0, "updateFlashModeParam: " + i10);
        this.f97362v0 = i10;
        CaptureRequest.Builder builder = this.f97465e;
        if (builder == null) {
            q.e(B0, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: mCaptureRequestBuilder is null");
            this.f97468h.c(this.f97470j.f97076b, -100, "switchFlashMode : CaptureRequest.Builder is null", this.f97472l);
            return;
        }
        Integer num = (Integer) builder.get(CaptureRequest.FLASH_MODE);
        int iIntValue = num == null ? 0 : num.intValue();
        if (i10 == 1) {
            if (this.f97470j.f97080d == 1) {
                q.e(B0, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support torch");
                q.u(B0, "flash on is not supported in front camera!");
                return;
            } else {
                this.f97465e.set(CaptureRequest.CONTROL_AE_MODE, 3);
                this.f97465e.set(CaptureRequest.FLASH_MODE, 1);
                this.O = true;
                return;
            }
        }
        if (i10 == 0) {
            this.O = false;
            if (iIntValue == 0) {
                q.k(B0, "switchFlashMode flashStatus == FLASH_MODE_OFF");
                return;
            } else {
                this.f97465e.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.f97465e.set(CaptureRequest.FLASH_MODE, 0);
                return;
            }
        }
        if (i10 == 2) {
            this.O = false;
            if (iIntValue == 2) {
                q.k(B0, "switchFlashMode flashStatus == FLASH_MODE_TORCH");
                return;
            } else {
                this.f97465e.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.f97465e.set(CaptureRequest.FLASH_MODE, 2);
                return;
            }
        }
        q.e(B0, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support flash mode " + i10);
        q.e(B0, "not support flash mode: " + i10);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase
    protected Range<Integer> i0(Range<Integer> range) {
        Range<Integer> range2;
        CameraCharacteristics cameraCharacteristics = this.f97463c;
        if (cameraCharacteristics != null && range != null && this.f97470j.f97119w0) {
            Range<Integer>[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            if (rangeArr == null) {
                return range;
            }
            Range<Integer> rangeY1 = null;
            if (this.f97485y != null) {
                ArrayList arrayList = new ArrayList(rangeArr.length);
                for (Range<Integer> range3 : rangeArr) {
                    arrayList.add(new int[]{((Integer) range3.getLower()).intValue(), ((Integer) range3.getUpper()).intValue()});
                }
                int[] iArrA = this.f97485y.a(arrayList);
                if (iArrA != null) {
                    range2 = new Range<>(Integer.valueOf(iArrA[0]), Integer.valueOf(iArrA[1]));
                } else {
                    range2 = null;
                }
            } else {
                range2 = null;
            }
            if (range2 != null) {
                q.k(B0, "select fps from user callback: " + range2);
                return range2;
            }
            if (this.f97470j.O == 4) {
                Range<Integer> range4 = new Range<>(Integer.valueOf(this.f97470j.f97078c.f97203b), Integer.valueOf(this.f97470j.f97078c.f97204c));
                for (Range<Integer> range5 : rangeArr) {
                    if (range4.equals(range5)) {
                        range2 = range4;
                        break;
                    }
                }
            }
            if (range2 != null) {
                q.k(B0, "select fps from user direct set: " + range2);
                return range2;
            }
            int i10 = this.f97363w0;
            if (i10 == 0) {
                rangeY1 = X1(rangeArr);
            } else if (i10 == 1) {
                rangeY1 = Y1(rangeArr);
            }
            if (rangeY1 != null) {
                range2 = rangeY1;
            }
            if (range2 != null) {
                range = range2;
            }
            q.k(B0, "select fps: " + range);
        }
        return range;
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase, com.ss.android.ttvecamera.framework.a
    public int k(TEFocusSettings tEFocusSettings) {
        if (this.f97352l0 == 0) {
            return super.k(tEFocusSettings);
        }
        q.e(B0, "focus action discard, state = " + this.f97352l0);
        return -108;
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase, com.ss.android.ttvecamera.framework.a
    public int l(String str, int i10) throws CameraAccessException {
        this.f97363w0 = 0;
        this.f97351k0 = null;
        if (this.f97362v0 == -1) {
            this.f97362v0 = 0;
        }
        return super.l(str, i10);
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase
    protected void l0(List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) throws CameraAccessException {
        s.a("TEImage2Mode-createSession");
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList arrayList = new ArrayList();
            Iterator<Surface> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new OutputConfiguration(it.next()));
            }
            SessionConfiguration sessionConfiguration = new SessionConfiguration(s0(list), arrayList, new e(handler), stateCallback);
            this.f97465e.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, i0(new Range<>(Integer.valueOf(this.E.f97203b / this.f97470j.f97078c.f97205d), Integer.valueOf(this.E.f97204c / this.f97470j.f97078c.f97205d))));
            h2(this.f97362v0);
            sessionConfiguration.setSessionParameters(this.f97465e.build());
            q.k(B0, "createSession by sessionConfiguration");
            this.f97472l.createCaptureSession(sessionConfiguration);
        } else {
            q.k(B0, "createSession by normally");
            this.f97472l.createCaptureSession(list, stateCallback, handler);
        }
        s.b();
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase, com.ss.android.ttvecamera.framework.a
    public void m(TECameraSettings.r rVar, int i10) {
        super.m(rVar, i10);
        this.f97364x0 = rVar;
        this.f97365y0 = null;
        this.f97353m0 = i10;
        this.f97356p0 = false;
        this.f97360t0 = System.currentTimeMillis();
        if (this.f97346f0 != null && !this.O) {
            this.f97352l0 = 1;
            this.f97350j0 = true;
            q.k(B0, "takePicture...use zsl buffer");
            return;
        }
        q.k(B0, "takePicture...flash strategy: " + this.f97470j.f97085f0);
        boolean z10 = this.O;
        long j10 = z10 ? H0 : 800L;
        TECameraSettings tECameraSettings = this.f97470j;
        if (tECameraSettings.f97080d != 0) {
            this.f97352l0 = 1;
            W1();
            return;
        }
        int i11 = tECameraSettings.f97085f0;
        if (i11 == 3) {
            if (!z10) {
                W1();
                return;
            }
            this.f97342b0 = System.currentTimeMillis();
            this.f97352l0 = 2;
            this.f97343c0.sendEmptyMessageDelayed(1001, j10);
            this.f97465e.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f97465e.set(CaptureRequest.FLASH_MODE, 2);
            if (!this.f97354n0) {
                this.f97343c0.sendEmptyMessageDelayed(1000, 300L);
                return;
            }
            this.f97465e.set(CaptureRequest.CONTROL_AF_MODE, 1);
            this.f97465e.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            this.f97465e.setTag(C0);
            e0(this.f97465e);
            this.f97465e.setTag(null);
            this.f97465e.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            this.f97465e.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
            C0(this.f97465e);
            TECameraModeBase.f fVarC0 = C0(this.f97465e);
            if (fVarC0.c()) {
                return;
            }
            i iVar = this.f97343c0;
            iVar.sendMessage(iVar.obtainMessage(1003, fVarC0.b()));
            return;
        }
        if (i11 == 2) {
            if (!z10 && this.f97357q0) {
                q.k(B0, "af converge, do capture...");
                W1();
                return;
            }
            this.f97342b0 = System.currentTimeMillis();
            this.f97352l0 = 2;
            this.f97343c0.sendEmptyMessageDelayed(1001, j10);
            if (this.f97354n0) {
                this.f97465e.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            }
            this.f97465e.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            this.f97465e.setTag(C0);
            e0(this.f97465e);
            this.f97465e.setTag(null);
            this.f97465e.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            this.f97465e.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
            TECameraModeBase.f fVarC1 = C0(this.f97465e);
            if (fVarC1.c()) {
                return;
            }
            i iVar2 = this.f97343c0;
            iVar2.sendMessage(iVar2.obtainMessage(1003, fVarC1.b()));
            return;
        }
        if (i11 != 0) {
            if (i11 != 1) {
                this.f97352l0 = 1;
                W1();
                return;
            }
            this.f97352l0 = 1;
            if (z10) {
                this.f97465e.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.f97465e.set(CaptureRequest.FLASH_MODE, 2);
            }
            U1();
            return;
        }
        if (!z10 && this.f97357q0) {
            q.k(B0, "af converge, do capture...");
            U1();
            return;
        }
        this.f97342b0 = System.currentTimeMillis();
        this.f97352l0 = 1;
        this.f97343c0.sendEmptyMessageDelayed(1007, j10);
        if (this.f97354n0) {
            this.f97465e.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        }
        this.f97465e.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        TECameraModeBase.f fVarF0 = f0(this.f97465e, this.Z, this.f97473m);
        if (fVarF0.c()) {
            return;
        }
        i iVar3 = this.f97343c0;
        iVar3.sendMessage(iVar3.obtainMessage(1003, fVarF0.b()));
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase, com.ss.android.ttvecamera.framework.a
    public void p() {
        this.f97352l0 = 0;
        this.f97343c0.removeCallbacksAndMessages(null);
        Handler handler = this.G;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f97342b0 = 0L;
        this.f97356p0 = false;
        this.f97358r0 = 0;
        this.f97362v0 = -1;
        this.f97349i0 = null;
        this.O = false;
        ImageReader imageReader = this.f97345e0;
        if (imageReader != null) {
            imageReader.close();
            this.f97345e0 = null;
        }
        ImageReader imageReader2 = this.f97346f0;
        if (imageReader2 != null) {
            imageReader2.close();
            this.f97346f0 = null;
        }
        this.f97348h0 = null;
        this.f97364x0 = null;
        this.f97365y0 = null;
        this.f97465e = null;
        super.p();
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase
    protected int r0() {
        return 4;
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase, com.ss.android.ttvecamera.framework.a
    public void v(int i10) {
        this.f97363w0 = i10;
        q.k(B0, "setSceneMode: " + i10);
        if (i10 == 0) {
            Q1();
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException("un support scene");
            }
            R1();
        }
    }

    @Override // com.ss.android.ttvecamera.framework.TECameraModeBase, com.ss.android.ttvecamera.framework.a
    public int z() {
        return this.f97362v0;
    }
}
