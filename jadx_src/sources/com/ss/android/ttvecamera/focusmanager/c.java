package com.ss.android.ttvecamera.focusmanager;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.view.Surface;
import androidx.annotation.n0;
import androidx.annotation.w0;
import com.ss.android.ttvecamera.TEFocusSettings;
import com.ss.android.ttvecamera.o;
import com.ss.android.ttvecamera.p;
import com.ss.android.ttvecamera.q;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: TEFocusAndMeterStrategy.java */
/* JADX INFO: loaded from: classes9.dex */
@w0(api = 21)
public class c extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f97418h = "TEFocusAndMeterStrategy";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.ss.android.ttvecamera.focusmanager.b.a f97419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AtomicBoolean f97420g;

    /* JADX INFO: compiled from: TEFocusAndMeterStrategy.java */
    public class a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f97421a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f97422b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f97423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CaptureRequest.Builder f97424d;

        a(boolean z10, CaptureRequest.Builder builder) {
            this.f97423c = z10;
            this.f97424d = builder;
        }

        private void a() {
            if (c.this.f97420g != null) {
                c.this.f97420g.set(false);
            }
        }

        private void b(CameraCaptureSession cameraCaptureSession) {
            if (this.f97423c) {
                this.f97424d.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                c.this.f97419f.u(cameraCaptureSession, this.f97424d);
            }
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 Surface surface, long j10) {
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j10);
            q.e(c.f97418h, "Manual Focus capture buffer lost , session: " + cameraCaptureSession);
            TEFocusSettings tEFocusSettings = c.this.f97437c;
            if (tEFocusSettings != null) {
                tEFocusSettings.g().a(o.f97674f0, c.this.f97437c.h(), "Manual Focus capture buffer lost ");
            }
            b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 TotalCaptureResult totalCaptureResult) {
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num == null) {
                q.u(c.f97418h, "Focus failed.");
                a();
                return;
            }
            boolean z10 = false;
            if (this.f97421a != num.intValue()) {
                q.k(c.f97418h, "Focus onCaptureCompleted! afState = " + num);
                z10 = true;
            }
            this.f97421a = num.intValue();
            if (z10 && (num.intValue() == 4 || num.intValue() == 5)) {
                if (this.f97423c) {
                    c.this.f97419f.u(cameraCaptureSession, this.f97424d);
                } else {
                    c.this.f97419f.b();
                }
                if (!this.f97422b) {
                    this.f97422b = true;
                    TEFocusSettings tEFocusSettings = c.this.f97437c;
                    if (tEFocusSettings != null) {
                        tEFocusSettings.g().a(c.this.f97437c.h(), c.this.f97438d.f97080d, "Done");
                    }
                }
                a();
                q.k(c.f97418h, "Focus done, isLock = " + this.f97423c + ", afState = " + num);
            }
            if (this.f97422b && num.intValue() != 4 && num.intValue() != 5) {
                q.e(c.f97418h, "afState error!!!, may be re-auto-focus in some device, switch to caf");
                c.this.f97419f.b();
            }
            c cVar = c.this;
            if (cVar.f97439e) {
                cVar.f97439e = p.n(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            q.e(c.f97418h, "Manual Focus Failed: " + captureFailure + ", session: " + cameraCaptureSession);
            TEFocusSettings tEFocusSettings = c.this.f97437c;
            if (tEFocusSettings != null) {
                tEFocusSettings.g().a(o.f97674f0, c.this.f97438d.f97080d, captureFailure.toString());
            }
            b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 CaptureResult captureResult) {
            super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            q.b(c.f97418h, "Focus onCaptureProgressed!");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(@n0 CameraCaptureSession cameraCaptureSession, int i10) {
            super.onCaptureSequenceAborted(cameraCaptureSession, i10);
            q.e(c.f97418h, "Manual Focus capture abort ");
            TEFocusSettings tEFocusSettings = c.this.f97437c;
            if (tEFocusSettings != null) {
                tEFocusSettings.g().a(o.G0, c.this.f97438d.f97080d, "Manual Focus capture abort ");
            }
            b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(@n0 CameraCaptureSession cameraCaptureSession, int i10, long j10) {
            super.onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
            q.b(c.f97418h, "Focus onCaptureSequenceCompleted!");
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, long j10, long j11) {
            super.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
            q.b(c.f97418h, "Focus onCaptureStarted!");
        }
    }

    /* JADX INFO: compiled from: TEFocusAndMeterStrategy.java */
    public class b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f97426a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f97427b;

        b(boolean z10) {
            this.f97427b = z10;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 TotalCaptureResult totalCaptureResult) {
            TEFocusSettings tEFocusSettings;
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num == null) {
                q.u(c.f97418h, "metering failed.");
                return;
            }
            if (num.intValue() == 3 || num.intValue() == 2) {
                if (!this.f97427b && (tEFocusSettings = c.this.f97437c) != null && !this.f97426a) {
                    tEFocusSettings.g().a(c.this.f97437c.h(), c.this.f97438d.f97080d, "Done");
                    this.f97426a = true;
                }
                c.this.f97419f.X();
            }
            c cVar = c.this;
            if (cVar.f97439e) {
                cVar.f97439e = p.n(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 CaptureFailure captureFailure) {
            TEFocusSettings tEFocusSettings;
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            if (!this.f97427b && (tEFocusSettings = c.this.f97437c) != null) {
                tEFocusSettings.g().a(o.f97674f0, c.this.f97438d.f97080d, captureFailure.toString());
            }
            q.e(c.f97418h, "Manual Metering Failed: " + captureFailure);
        }
    }

    public c(@n0 com.ss.android.ttvecamera.focusmanager.b.a aVar) {
        this.f97419f = aVar;
    }

    @Override // com.ss.android.ttvecamera.focusmanager.b
    public int a() {
        return this.f97419f.b();
    }

    @Override // com.ss.android.ttvecamera.focusmanager.b
    public void b(@n0 CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
    }

    @Override // com.ss.android.ttvecamera.focusmanager.b
    public CameraCaptureSession.CaptureCallback c(@n0 CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z10) {
        this.f97420g = atomicBoolean;
        return new a(z10, builder);
    }

    @Override // com.ss.android.ttvecamera.focusmanager.e, com.ss.android.ttvecamera.focusmanager.b
    public void d(@n0 CaptureRequest.Builder builder, @n0 Rect rect) {
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
    }

    @Override // com.ss.android.ttvecamera.focusmanager.b
    public CameraCaptureSession.CaptureCallback e(@n0 CaptureRequest.Builder builder, boolean z10) {
        return new b(z10);
    }

    @Override // com.ss.android.ttvecamera.focusmanager.e, com.ss.android.ttvecamera.focusmanager.b
    public void f(@n0 CaptureRequest.Builder builder, @n0 Rect rect) {
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
    }
}
