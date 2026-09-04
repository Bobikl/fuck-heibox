package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.b0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.util.u0;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: AsynchronousMediaCodecCallback.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(23)
public final class h extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f46753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f46754c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @b0("lock")
    @p0
    private MediaFormat f46759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @b0("lock")
    @p0
    private MediaFormat f46760i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @b0("lock")
    @p0
    private MediaCodec.CodecException f46761j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @b0("lock")
    private long f46762k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @b0("lock")
    private boolean f46763l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @b0("lock")
    @p0
    private IllegalStateException f46764m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f46752a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @b0("lock")
    private final l f46755d = new l();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b0("lock")
    private final l f46756e = new l();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @b0("lock")
    private final ArrayDeque<MediaCodec.BufferInfo> f46757f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @b0("lock")
    private final ArrayDeque<MediaFormat> f46758g = new ArrayDeque<>();

    h(HandlerThread handlerThread) {
        this.f46753b = handlerThread;
    }

    @b0("lock")
    private void b(MediaFormat mediaFormat) {
        this.f46756e.a(-2);
        this.f46758g.add(mediaFormat);
    }

    @b0("lock")
    private void f() {
        if (!this.f46758g.isEmpty()) {
            this.f46760i = this.f46758g.getLast();
        }
        this.f46755d.c();
        this.f46756e.c();
        this.f46757f.clear();
        this.f46758g.clear();
        this.f46761j = null;
    }

    @b0("lock")
    private boolean i() {
        return this.f46762k > 0 || this.f46763l;
    }

    @b0("lock")
    private void k() {
        l();
        m();
    }

    @b0("lock")
    private void l() {
        IllegalStateException illegalStateException = this.f46764m;
        if (illegalStateException == null) {
            return;
        }
        this.f46764m = null;
        throw illegalStateException;
    }

    @b0("lock")
    private void m() {
        MediaCodec.CodecException codecException = this.f46761j;
        if (codecException == null) {
            return;
        }
        this.f46761j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(Runnable runnable) {
        synchronized (this.f46752a) {
            o(runnable);
        }
    }

    @b0("lock")
    private void o(Runnable runnable) {
        if (this.f46763l) {
            return;
        }
        long j10 = this.f46762k - 1;
        this.f46762k = j10;
        if (j10 > 0) {
            return;
        }
        if (j10 < 0) {
            p(new IllegalStateException());
            return;
        }
        f();
        try {
            runnable.run();
        } catch (IllegalStateException e10) {
            p(e10);
        } catch (Exception e11) {
            p(new IllegalStateException(e11));
        }
    }

    private void p(IllegalStateException illegalStateException) {
        synchronized (this.f46752a) {
            this.f46764m = illegalStateException;
        }
    }

    public int c() {
        synchronized (this.f46752a) {
            int iF = -1;
            if (i()) {
                return -1;
            }
            k();
            if (!this.f46755d.e()) {
                iF = this.f46755d.f();
            }
            return iF;
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f46752a) {
            if (i()) {
                return -1;
            }
            k();
            if (this.f46756e.e()) {
                return -1;
            }
            int iF = this.f46756e.f();
            if (iF >= 0) {
                com.google.android.exoplayer2.util.a.k(this.f46759h);
                MediaCodec.BufferInfo bufferInfoRemove = this.f46757f.remove();
                bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
            } else if (iF == -2) {
                this.f46759h = this.f46758g.remove();
            }
            return iF;
        }
    }

    public void e(final Runnable runnable) {
        synchronized (this.f46752a) {
            this.f46762k++;
            ((Handler) u0.k(this.f46754c)).post(new Runnable() { // from class: com.google.android.exoplayer2.mediacodec.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46750b.j(runnable);
                }
            });
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f46752a) {
            mediaFormat = this.f46759h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        com.google.android.exoplayer2.util.a.i(this.f46754c == null);
        this.f46753b.start();
        Handler handler = new Handler(this.f46753b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f46754c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f46752a) {
            this.f46761j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f46752a) {
            this.f46755d.a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f46752a) {
            MediaFormat mediaFormat = this.f46760i;
            if (mediaFormat != null) {
                b(mediaFormat);
                this.f46760i = null;
            }
            this.f46756e.a(i10);
            this.f46757f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f46752a) {
            b(mediaFormat);
            this.f46760i = null;
        }
    }

    public void q() {
        synchronized (this.f46752a) {
            this.f46763l = true;
            this.f46753b.quit();
            f();
        }
    }
}
