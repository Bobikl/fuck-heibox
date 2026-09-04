package com.ss.android.ttvecamera.focusmanager;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.n0;
import androidx.annotation.w0;
import com.ss.android.ttvecamera.TEFocusSettings;
import com.ss.android.ttvecamera.o;
import com.ss.android.ttvecamera.p;
import com.ss.android.ttvecamera.q;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: TEVideoFocus.java */
/* JADX INFO: loaded from: classes9.dex */
@w0(api = 21)
public class h extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f97451h = "TEVideoFocus";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.ss.android.ttvecamera.focusmanager.b.a f97452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AtomicBoolean f97453g;

    /* JADX INFO: compiled from: TEVideoFocus.java */
    public class a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f97454a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f97455b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f97456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CaptureRequest.Builder f97457d;

        a(boolean z10, CaptureRequest.Builder builder) {
            this.f97456c = z10;
            this.f97457d = builder;
        }

        private void a() {
            if (h.this.f97453g != null) {
                h.this.f97453g.set(false);
            }
        }

        private void b(CameraCaptureSession cameraCaptureSession) {
            if (this.f97456c) {
                this.f97457d.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                h.this.f97452f.u(cameraCaptureSession, this.f97457d);
            }
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 Surface surface, long j10) {
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j10);
            q.e(h.f97451h, "Manual Focus capture buffer lost ");
            TEFocusSettings tEFocusSettings = h.this.f97437c;
            if (tEFocusSettings != null) {
                tEFocusSettings.g().a(o.f97674f0, h.this.f97437c.h(), "Manual Focus capture buffer lost ");
            }
            b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 TotalCaptureResult totalCaptureResult) {
            if (captureRequest == null || !com.ss.android.ttvecamera.focusmanager.b.f97416a.equals(captureRequest.getTag())) {
                q.u(h.f97451h, "Not focus request!");
                a();
                return;
            }
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            q.b(h.f97451h, "Manual Focus onCaptureCompleted: afState = " + num + ", triggerState = " + ((Integer) captureRequest.get(CaptureRequest.CONTROL_AF_TRIGGER)));
            if (num == null) {
                q.u(h.f97451h, "Focus failed.");
                a();
                return;
            }
            if (this.f97454a != num.intValue() && (num.intValue() == 4 || num.intValue() == 5)) {
                if (this.f97456c) {
                    this.f97457d.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    h.this.f97452f.u(cameraCaptureSession, this.f97457d);
                } else {
                    h hVar = h.this;
                    if (!hVar.f97438d.f97100n) {
                        hVar.f97452f.b();
                    }
                }
                if (!this.f97455b) {
                    this.f97455b = true;
                    TEFocusSettings tEFocusSettings = h.this.f97437c;
                    if (tEFocusSettings != null) {
                        tEFocusSettings.g().a(h.this.f97437c.h(), h.this.f97438d.f97080d, "Done");
                    }
                }
                a();
                q.k(h.f97451h, "Focus done, isLock = " + this.f97456c + ", afState = " + num);
            }
            if (this.f97455b && num.intValue() != 4 && num.intValue() != 5) {
                q.e(h.f97451h, "afState error!!!, may be re-auto-focus in some device, switch to caf");
                h hVar2 = h.this;
                if (!hVar2.f97438d.f97100n) {
                    hVar2.f97452f.b();
                }
            }
            this.f97454a = num.intValue();
            h hVar3 = h.this;
            if (hVar3.f97439e) {
                hVar3.f97439e = p.n(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            q.e(h.f97451h, "Manual Focus Failed: " + captureFailure);
            TEFocusSettings tEFocusSettings = h.this.f97437c;
            if (tEFocusSettings != null) {
                tEFocusSettings.g().a(o.f97674f0, h.this.f97438d.f97080d, captureFailure.toString());
            }
            b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 CaptureResult captureResult) {
            super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            q.b(h.f97451h, "Focus onCaptureProgressed!");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(@n0 CameraCaptureSession cameraCaptureSession, int i10) {
            super.onCaptureSequenceAborted(cameraCaptureSession, i10);
            q.e(h.f97451h, "Manual Focus capture abort ");
            TEFocusSettings tEFocusSettings = h.this.f97437c;
            if (tEFocusSettings != null) {
                tEFocusSettings.g().a(o.G0, h.this.f97438d.f97080d, "Manual Focus capture abort ");
            }
            b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(@n0 CameraCaptureSession cameraCaptureSession, int i10, long j10) {
            super.onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
            q.b(h.f97451h, "Focus onCaptureSequenceCompleted!");
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, long j10, long j11) {
            super.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
            q.b(h.f97451h, "Focus onCaptureStarted!");
        }
    }

    /* JADX INFO: compiled from: TEVideoFocus.java */
    public class b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f97459a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f97460b;

        b(boolean z10) {
            this.f97460b = z10;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 TotalCaptureResult totalCaptureResult) {
            TEFocusSettings tEFocusSettings;
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num == null) {
                q.u(h.f97451h, "metering failed.");
                return;
            }
            if (num.intValue() == 3 || num.intValue() == 2) {
                if (!this.f97460b && (tEFocusSettings = h.this.f97437c) != null && !this.f97459a) {
                    tEFocusSettings.g().a(h.this.f97437c.h(), h.this.f97438d.f97080d, "Done");
                    this.f97459a = true;
                }
                h hVar = h.this;
                if (!hVar.f97438d.f97100n) {
                    hVar.f97452f.X();
                }
                q.b(h.f97451h, "Manual Metering success");
            }
            h hVar2 = h.this;
            if (hVar2.f97439e) {
                hVar2.f97439e = p.n(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 CaptureFailure captureFailure) {
            TEFocusSettings tEFocusSettings;
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            if (!this.f97460b && (tEFocusSettings = h.this.f97437c) != null) {
                tEFocusSettings.g().a(o.f97674f0, h.this.f97438d.f97080d, captureFailure.toString());
            }
            q.e(h.f97451h, "Manual Metering Failed: " + captureFailure);
        }
    }

    public h(@n0 com.ss.android.ttvecamera.focusmanager.b.a aVar) {
        this.f97452f = aVar;
    }

    @Override // com.ss.android.ttvecamera.focusmanager.b
    public int a() {
        return this.f97452f.b();
    }

    @Override // com.ss.android.ttvecamera.focusmanager.b
    public void b(@n0 CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
    }

    @Override // com.ss.android.ttvecamera.focusmanager.b
    public CameraCaptureSession.CaptureCallback c(@n0 CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z10) {
        this.f97453g = atomicBoolean;
        return new a(z10, builder);
    }

    @Override // com.ss.android.ttvecamera.focusmanager.b
    public CameraCaptureSession.CaptureCallback e(@n0 CaptureRequest.Builder builder, boolean z10) {
        return new b(z10);
    }
}
