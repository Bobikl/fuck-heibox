package com.ss.android.ttvecamera.focusmanager;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.n0;
import com.ss.android.ttvecamera.TEFocusSettings;
import com.ss.android.ttvecamera.o;
import com.ss.android.ttvecamera.p;
import com.ss.android.ttvecamera.q;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: TEImageFocus.java */
/* JADX INFO: loaded from: classes9.dex */
@TargetApi(21)
public class f extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f97440i = "TEImageFocus";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AtomicBoolean f97441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected com.ss.android.ttvecamera.focusmanager.b.a f97442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f97443h = true;

    /* JADX INFO: compiled from: TEImageFocus.java */
    public class a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f97444a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f97445b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f97446c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CaptureRequest.Builder f97447d;

        a(boolean z10, CaptureRequest.Builder builder) {
            this.f97446c = z10;
            this.f97447d = builder;
        }

        private void a() {
            if (f.this.f97441f != null) {
                f.this.f97441f.set(false);
            }
        }

        private void b(CameraCaptureSession cameraCaptureSession) {
            if (this.f97446c) {
                this.f97447d.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                f.this.f97442g.u(cameraCaptureSession, this.f97447d);
            }
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 Surface surface, long j10) {
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j10);
            q.e(f.f97440i, "Manual Focus capture buffer lost ");
            TEFocusSettings tEFocusSettings = f.this.f97437c;
            if (tEFocusSettings != null) {
                tEFocusSettings.g().a(o.f97674f0, f.this.f97438d.f97080d, "Manual Focus capture buffer lost ");
            }
            b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 TotalCaptureResult totalCaptureResult) {
            if (captureRequest == null || !com.ss.android.ttvecamera.focusmanager.b.f97416a.equals(captureRequest.getTag())) {
                q.u(f.f97440i, "Not focus request!");
                return;
            }
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num == null) {
                q.u(f.f97440i, "Focus failed.");
                a();
                return;
            }
            if (this.f97444a != num.intValue() && (num.intValue() == 4 || num.intValue() == 5)) {
                if (this.f97446c) {
                    this.f97447d.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    f.this.f97442g.u(cameraCaptureSession, this.f97447d);
                } else {
                    f fVar = f.this;
                    if (!fVar.f97438d.f97100n) {
                        fVar.f97442g.b();
                    }
                }
                if (!this.f97445b) {
                    this.f97445b = true;
                    TEFocusSettings tEFocusSettings = f.this.f97437c;
                    if (tEFocusSettings != null) {
                        tEFocusSettings.g().a(f.this.f97437c.h(), f.this.f97438d.f97080d, "Done");
                    }
                }
                a();
                q.k(f.f97440i, "Focus done, isLock = " + this.f97446c + ", afState = " + num);
            }
            if (this.f97445b && num.intValue() != 4 && num.intValue() != 5) {
                q.e(f.f97440i, "afState error!!!, may be re-auto-focus in some device, switch to caf");
                f fVar2 = f.this;
                if (!fVar2.f97438d.f97100n) {
                    fVar2.f97442g.b();
                }
            }
            this.f97444a = num.intValue();
            if (f.this.f97443h) {
                f.this.f97443h = p.n(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            q.e(f.f97440i, "Manual Focus Failed: " + captureFailure);
            TEFocusSettings tEFocusSettings = f.this.f97437c;
            if (tEFocusSettings != null) {
                tEFocusSettings.g().a(o.f97674f0, f.this.f97438d.f97080d, captureFailure.toString());
            }
            b(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(@n0 CameraCaptureSession cameraCaptureSession, int i10) {
            super.onCaptureSequenceAborted(cameraCaptureSession, i10);
            q.e(f.f97440i, "Manual Focus capture abort ");
            TEFocusSettings tEFocusSettings = f.this.f97437c;
            if (tEFocusSettings != null) {
                tEFocusSettings.g().a(o.G0, f.this.f97438d.f97080d, "Manual Focus capture abort ");
            }
            b(cameraCaptureSession);
        }
    }

    /* JADX INFO: compiled from: TEImageFocus.java */
    public class b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f97449a;

        b(boolean z10) {
            this.f97449a = z10;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 TotalCaptureResult totalCaptureResult) {
            TEFocusSettings tEFocusSettings;
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num == null) {
                q.u(f.f97440i, "metering failed.");
                return;
            }
            if (num.intValue() == 3 || num.intValue() == 2) {
                if (!this.f97449a && (tEFocusSettings = f.this.f97437c) != null) {
                    tEFocusSettings.g().a(f.this.f97437c.h(), f.this.f97438d.f97080d, "Done");
                }
                f fVar = f.this;
                if (!fVar.f97438d.f97100n) {
                    fVar.f97442g.X();
                }
            }
            if (f.this.f97443h) {
                f.this.f97443h = p.n(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 CaptureFailure captureFailure) {
            TEFocusSettings tEFocusSettings;
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            if (!this.f97449a && (tEFocusSettings = f.this.f97437c) != null) {
                tEFocusSettings.g().a(o.f97674f0, f.this.f97438d.f97080d, captureFailure.toString());
            }
            q.e(f.f97440i, "Manual Metering Failed: " + captureFailure);
        }
    }

    public f(@n0 com.ss.android.ttvecamera.focusmanager.b.a aVar) {
        this.f97442g = aVar;
    }

    @Override // com.ss.android.ttvecamera.focusmanager.b
    public int a() {
        return this.f97442g.b();
    }

    @Override // com.ss.android.ttvecamera.focusmanager.b
    public void b(@n0 CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
    }

    @Override // com.ss.android.ttvecamera.focusmanager.b
    public CameraCaptureSession.CaptureCallback c(@n0 CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z10) {
        this.f97441f = atomicBoolean;
        return new a(z10, builder);
    }

    @Override // com.ss.android.ttvecamera.focusmanager.e, com.ss.android.ttvecamera.focusmanager.b
    public void d(@n0 CaptureRequest.Builder builder, @n0 Rect rect) {
        builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        super.d(builder, rect);
    }

    @Override // com.ss.android.ttvecamera.focusmanager.b
    public CameraCaptureSession.CaptureCallback e(@n0 CaptureRequest.Builder builder, boolean z10) {
        return new b(z10);
    }
}
