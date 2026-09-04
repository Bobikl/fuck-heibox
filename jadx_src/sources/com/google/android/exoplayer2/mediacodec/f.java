package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCodec$CryptoInfo$Pattern;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.b0;
import androidx.annotation.j1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.util.u0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(23)
public class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f46732g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f46733h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f46734i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @b0("MESSAGE_PARAMS_INSTANCE_POOL")
    private static final ArrayDeque<b> f46735j = new ArrayDeque<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f46736k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f46737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f46738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f46739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference<RuntimeException> f46740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.h f46741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f46742f;

    /* JADX INFO: compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    public class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            f.this.f(message);
        }
    }

    /* JADX INFO: compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f46745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f46746c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f46747d = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f46748e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f46749f;

        b() {
        }

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f46744a = i10;
            this.f46745b = i11;
            this.f46746c = i12;
            this.f46748e = j10;
            this.f46749f = i13;
        }
    }

    public f(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new com.google.android.exoplayer2.util.h());
    }

    @j1
    f(MediaCodec mediaCodec, HandlerThread handlerThread, com.google.android.exoplayer2.util.h hVar) {
        this.f46737a = mediaCodec;
        this.f46738b = handlerThread;
        this.f46741e = hVar;
        this.f46740d = new AtomicReference<>();
    }

    private void b() throws InterruptedException {
        this.f46741e.d();
        ((Handler) u0.k(this.f46739c)).obtainMessage(2).sendToTarget();
        this.f46741e.a();
    }

    private static void c(com.google.android.exoplayer2.decoder.d dVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = dVar.f44505f;
        cryptoInfo.numBytesOfClearData = e(dVar.f44503d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = e(dVar.f44504e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) com.google.android.exoplayer2.util.a.g(d(dVar.f44501b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) com.google.android.exoplayer2.util.a.g(d(dVar.f44500a, cryptoInfo.iv));
        cryptoInfo.mode = dVar.f44502c;
        if (u0.f51536a >= 24) {
            cryptoInfo.setPattern(new MediaCodec$CryptoInfo$Pattern(dVar.f44506g, dVar.f44507h));
        }
    }

    @p0
    private static byte[] d(@p0 byte[] bArr, @p0 byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    @p0
    private static int[] e(@p0 int[] iArr, @p0 int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Message message) {
        b bVar;
        int i10 = message.what;
        if (i10 == 0) {
            bVar = (b) message.obj;
            g(bVar.f46744a, bVar.f46745b, bVar.f46746c, bVar.f46748e, bVar.f46749f);
        } else if (i10 != 1) {
            if (i10 != 2) {
                p(new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.f46741e.f();
            }
            bVar = null;
        } else {
            bVar = (b) message.obj;
            h(bVar.f46744a, bVar.f46745b, bVar.f46747d, bVar.f46748e, bVar.f46749f);
        }
        if (bVar != null) {
            o(bVar);
        }
    }

    private void g(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f46737a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            p(e10);
        }
    }

    private void h(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f46736k) {
                this.f46737a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            p(e10);
        }
    }

    private void j() throws InterruptedException {
        ((Handler) u0.k(this.f46739c)).removeCallbacksAndMessages(null);
        b();
        l();
    }

    private static b k() {
        ArrayDeque<b> arrayDeque = f46735j;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new b();
            }
            return arrayDeque.removeFirst();
        }
    }

    private void l() {
        RuntimeException andSet = this.f46740d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    private static void o(b bVar) {
        ArrayDeque<b> arrayDeque = f46735j;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public void i() {
        if (this.f46742f) {
            try {
                j();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public void m(int i10, int i11, int i12, long j10, int i13) {
        l();
        b bVarK = k();
        bVarK.a(i10, i11, i12, j10, i13);
        ((Handler) u0.k(this.f46739c)).obtainMessage(0, bVarK).sendToTarget();
    }

    public void n(int i10, int i11, com.google.android.exoplayer2.decoder.d dVar, long j10, int i12) {
        l();
        b bVarK = k();
        bVarK.a(i10, i11, 0, j10, i12);
        c(dVar, bVarK.f46747d);
        ((Handler) u0.k(this.f46739c)).obtainMessage(1, bVarK).sendToTarget();
    }

    @j1
    void p(RuntimeException runtimeException) {
        this.f46740d.set(runtimeException);
    }

    public void q() {
        if (this.f46742f) {
            i();
            this.f46738b.quit();
        }
        this.f46742f = false;
    }

    public void r() {
        if (this.f46742f) {
            return;
        }
        this.f46738b.start();
        this.f46739c = new a(this.f46738b.getLooper());
        this.f46742f = true;
    }

    public void s() throws InterruptedException {
        b();
    }
}
