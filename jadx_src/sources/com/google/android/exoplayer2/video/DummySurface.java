package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import com.google.android.exoplayer2.util.GlUtil;

/* JADX INFO: loaded from: classes7.dex */
@w0(17)
public final class DummySurface extends Surface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f51663e = "DummySurface";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f51664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f51665g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f51666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f51667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f51668d;

    public static class b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f51669g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f51670h = 2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private EGLSurfaceTexture f51671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f51672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private Error f51673d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private RuntimeException f51674e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private DummySurface f51675f;

        public b() {
            super("ExoPlayer:DummySurface");
        }

        private void b(int i10) {
            com.google.android.exoplayer2.util.a.g(this.f51671b);
            this.f51671b.h(i10);
            this.f51675f = new DummySurface(this, this.f51671b.g(), i10 != 0);
        }

        private void d() {
            com.google.android.exoplayer2.util.a.g(this.f51671b);
            this.f51671b.i();
        }

        public DummySurface a(int i10) {
            boolean z10;
            start();
            this.f51672c = new Handler(getLooper(), this);
            this.f51671b = new EGLSurfaceTexture(this.f51672c);
            synchronized (this) {
                z10 = false;
                this.f51672c.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f51675f == null && this.f51674e == null && this.f51673d == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f51674e;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f51673d;
            if (error == null) {
                return (DummySurface) com.google.android.exoplayer2.util.a.g(this.f51675f);
            }
            throw error;
        }

        public void c() {
            com.google.android.exoplayer2.util.a.g(this.f51672c);
            this.f51672c.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } catch (Throwable th2) {
                        try {
                            com.google.android.exoplayer2.util.u.e(DummySurface.f51663e, "Failed to release dummy surface", th2);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    com.google.android.exoplayer2.util.u.e(DummySurface.f51663e, "Failed to initialize dummy surface", e10);
                    this.f51673d = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    com.google.android.exoplayer2.util.u.e(DummySurface.f51663e, "Failed to initialize dummy surface", e11);
                    this.f51674e = e11;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th3) {
                synchronized (this) {
                    notify();
                    throw th3;
                }
            }
        }
    }

    private DummySurface(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f51667c = bVar;
        this.f51666b = z10;
    }

    private static int a(Context context) {
        if (GlUtil.o(context)) {
            return GlUtil.p() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        if (!f51665g) {
            f51664f = a(context);
            f51665g = true;
        }
        return f51664f != 0;
    }

    public static DummySurface c(Context context, boolean z10) {
        com.google.android.exoplayer2.util.a.i(!z10 || b(context));
        return new b().a(z10 ? f51664f : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f51667c) {
            if (!this.f51668d) {
                this.f51667c.c();
                this.f51668d = true;
            }
        }
    }
}
