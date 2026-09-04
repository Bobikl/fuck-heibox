package com.google.android.exoplayer2.decoder;

import androidx.annotation.p0;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.h;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: SimpleDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class k<I extends DecoderInputBuffer, O extends h, E extends DecoderException> implements f<I, O, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread f44549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f44550b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f44551c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f44552d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I[] f44553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final O[] f44554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f44555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f44556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private I f44557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private E f44558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f44559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f44560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f44561m;

    /* JADX INFO: compiled from: SimpleDecoder.java */
    public class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            k.this.s();
        }
    }

    protected k(I[] iArr, O[] oArr) {
        this.f44553e = iArr;
        this.f44555g = iArr.length;
        for (int i10 = 0; i10 < this.f44555g; i10++) {
            ((I[]) this.f44553e)[i10] = f();
        }
        this.f44554f = oArr;
        this.f44556h = oArr.length;
        for (int i11 = 0; i11 < this.f44556h; i11++) {
            ((O[]) this.f44554f)[i11] = g();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f44549a = aVar;
        aVar.start();
    }

    private boolean e() {
        return !this.f44551c.isEmpty() && this.f44556h > 0;
    }

    private boolean j() throws InterruptedException {
        E e10;
        synchronized (this.f44550b) {
            while (!this.f44560l && !e()) {
                this.f44550b.wait();
            }
            if (this.f44560l) {
                return false;
            }
            I iRemoveFirst = this.f44551c.removeFirst();
            O[] oArr = this.f44554f;
            int i10 = this.f44556h - 1;
            this.f44556h = i10;
            O o10 = oArr[i10];
            boolean z10 = this.f44559k;
            this.f44559k = false;
            if (iRemoveFirst.k()) {
                o10.e(4);
            } else {
                if (iRemoveFirst.j()) {
                    o10.e(Integer.MIN_VALUE);
                }
                try {
                    e10 = (E) i(iRemoveFirst, o10, z10);
                } catch (OutOfMemoryError e11) {
                    e10 = (E) h(e11);
                } catch (RuntimeException e12) {
                    e10 = (E) h(e12);
                }
                if (e10 != null) {
                    synchronized (this.f44550b) {
                        this.f44558j = e10;
                    }
                    return false;
                }
            }
            synchronized (this.f44550b) {
                if (this.f44559k) {
                    o10.n();
                } else if (o10.j()) {
                    this.f44561m++;
                    o10.n();
                } else {
                    o10.f44524d = this.f44561m;
                    this.f44561m = 0;
                    this.f44552d.addLast(o10);
                }
                p(iRemoveFirst);
            }
            return true;
        }
    }

    private void m() {
        if (e()) {
            this.f44550b.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends com.google.android.exoplayer2.decoder.DecoderException */
    private void n() throws E, DecoderException {
        E e10 = this.f44558j;
        if (e10 != null) {
            throw e10;
        }
    }

    private void p(I i10) {
        i10.f();
        I[] iArr = this.f44553e;
        int i11 = this.f44555g;
        this.f44555g = i11 + 1;
        iArr[i11] = i10;
    }

    private void r(O o10) {
        o10.f();
        O[] oArr = this.f44554f;
        int i10 = this.f44556h;
        this.f44556h = i10 + 1;
        oArr[i10] = o10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (j());
    }

    protected abstract I f();

    @Override // com.google.android.exoplayer2.decoder.f
    public final void flush() {
        synchronized (this.f44550b) {
            this.f44559k = true;
            this.f44561m = 0;
            I i10 = this.f44557i;
            if (i10 != null) {
                p(i10);
                this.f44557i = null;
            }
            while (!this.f44551c.isEmpty()) {
                p(this.f44551c.removeFirst());
            }
            while (!this.f44552d.isEmpty()) {
                this.f44552d.removeFirst().n();
            }
        }
    }

    protected abstract O g();

    protected abstract E h(Throwable th2);

    @p0
    protected abstract E i(I i10, O o10, boolean z10);

    @Override // com.google.android.exoplayer2.decoder.f
    @p0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final I a() throws DecoderException {
        I i10;
        synchronized (this.f44550b) {
            n();
            com.google.android.exoplayer2.util.a.i(this.f44557i == null);
            int i11 = this.f44555g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f44553e;
                int i12 = i11 - 1;
                this.f44555g = i12;
                i10 = iArr[i12];
            }
            this.f44557i = i10;
        }
        return i10;
    }

    @Override // com.google.android.exoplayer2.decoder.f
    @p0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final O dequeueOutputBuffer() throws DecoderException {
        synchronized (this.f44550b) {
            n();
            if (this.f44552d.isEmpty()) {
                return null;
            }
            return this.f44552d.removeFirst();
        }
    }

    @Override // com.google.android.exoplayer2.decoder.f
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void c(I i10) throws DecoderException {
        synchronized (this.f44550b) {
            n();
            com.google.android.exoplayer2.util.a.a(i10 == this.f44557i);
            this.f44551c.addLast(i10);
            m();
            this.f44557i = null;
        }
    }

    @androidx.annotation.i
    protected void q(O o10) {
        synchronized (this.f44550b) {
            r(o10);
            m();
        }
    }

    @Override // com.google.android.exoplayer2.decoder.f
    @androidx.annotation.i
    public void release() {
        synchronized (this.f44550b) {
            this.f44560l = true;
            this.f44550b.notify();
        }
        try {
            this.f44549a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    protected final void t(int i10) {
        com.google.android.exoplayer2.util.a.i(this.f44555g == this.f44553e.length);
        for (I i11 : this.f44553e) {
            i11.o(i10);
        }
    }
}
