package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.Glide;
import com.bumptech.glide.util.m;
import com.bumptech.glide.util.o;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: GifFrameLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.gifdecoder.a f41687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f41688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<b> f41689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final com.bumptech.glide.j f41690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f41691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f41692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f41693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f41694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.i<Bitmap> f41695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f41696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f41697k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f41698l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Bitmap f41699m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.bumptech.glide.load.i<Bitmap> f41700n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f41701o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private d f41702p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f41703q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f41704r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f41705s;

    /* JADX INFO: compiled from: GifFrameLoader.java */
    @j1
    public static class a extends com.bumptech.glide.request.target.e<Bitmap> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f41706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f41707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f41708d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Bitmap f41709e;

        a(Handler handler, int i10, long j10) {
            this.f41706b = handler;
            this.f41707c = i10;
            this.f41708d = j10;
        }

        Bitmap a() {
            return this.f41709e;
        }

        @Override // com.bumptech.glide.request.target.p
        public void onLoadCleared(@p0 Drawable drawable) {
            this.f41709e = null;
        }

        public void onResourceReady(@n0 Bitmap bitmap, @p0 com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
            this.f41709e = bitmap;
            this.f41706b.sendMessageAtTime(this.f41706b.obtainMessage(1, this), this.f41708d);
        }

        @Override // com.bumptech.glide.request.target.p
        public /* bridge */ /* synthetic */ void onResourceReady(@n0 Object obj, @p0 com.bumptech.glide.request.transition.f fVar) {
            onResourceReady((Bitmap) obj, (com.bumptech.glide.request.transition.f<? super Bitmap>) fVar);
        }
    }

    /* JADX INFO: compiled from: GifFrameLoader.java */
    public interface b {
        void a();
    }

    /* JADX INFO: compiled from: GifFrameLoader.java */
    public class c implements Handler.Callback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f41710c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f41711d = 2;

        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                g.this.o((a) message.obj);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            g.this.f41690d.q((a) message.obj);
            return false;
        }
    }

    /* JADX INFO: compiled from: GifFrameLoader.java */
    @j1
    public interface d {
        void a();
    }

    g(Glide glide, com.bumptech.glide.gifdecoder.a aVar, int i10, int i11, com.bumptech.glide.load.i<Bitmap> iVar, Bitmap bitmap) {
        this(glide.h(), Glide.F(glide.j()), aVar, null, k(Glide.F(glide.j()), i10, i11), iVar, bitmap);
    }

    g(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.j jVar, com.bumptech.glide.gifdecoder.a aVar, Handler handler, com.bumptech.glide.i<Bitmap> iVar, com.bumptech.glide.load.i<Bitmap> iVar2, Bitmap bitmap) {
        this.f41689c = new ArrayList();
        this.f41690d = jVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f41691e = eVar;
        this.f41688b = handler;
        this.f41695i = iVar;
        this.f41687a = aVar;
        q(iVar2, bitmap);
    }

    private static com.bumptech.glide.load.c g() {
        return new com.bumptech.glide.signature.e(Double.valueOf(Math.random()));
    }

    private static com.bumptech.glide.i<Bitmap> k(com.bumptech.glide.j jVar, int i10, int i11) {
        return jVar.l().i(com.bumptech.glide.request.h.l1(com.bumptech.glide.load.engine.h.f41153b).c1(true).Q0(true).B0(i10, i11));
    }

    private void n() {
        if (!this.f41692f || this.f41693g) {
            return;
        }
        if (this.f41694h) {
            m.b(this.f41701o == null, "Pending target must be null when starting from the first frame");
            this.f41687a.e();
            this.f41694h = false;
        }
        a aVar = this.f41701o;
        if (aVar != null) {
            this.f41701o = null;
            o(aVar);
            return;
        }
        this.f41693g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.f41687a.n());
        this.f41687a.j();
        this.f41698l = new a(this.f41688b, this.f41687a.f(), jUptimeMillis);
        this.f41695i.i(com.bumptech.glide.request.h.D1(g())).d(this.f41687a).z1(this.f41698l);
    }

    private void p() {
        Bitmap bitmap = this.f41699m;
        if (bitmap != null) {
            this.f41691e.d(bitmap);
            this.f41699m = null;
        }
    }

    private void t() {
        if (this.f41692f) {
            return;
        }
        this.f41692f = true;
        this.f41697k = false;
        n();
    }

    private void u() {
        this.f41692f = false;
    }

    void a() {
        this.f41689c.clear();
        p();
        u();
        a aVar = this.f41696j;
        if (aVar != null) {
            this.f41690d.q(aVar);
            this.f41696j = null;
        }
        a aVar2 = this.f41698l;
        if (aVar2 != null) {
            this.f41690d.q(aVar2);
            this.f41698l = null;
        }
        a aVar3 = this.f41701o;
        if (aVar3 != null) {
            this.f41690d.q(aVar3);
            this.f41701o = null;
        }
        this.f41687a.clear();
        this.f41697k = true;
    }

    ByteBuffer b() {
        return this.f41687a.getData().asReadOnlyBuffer();
    }

    Bitmap c() {
        a aVar = this.f41696j;
        return aVar != null ? aVar.a() : this.f41699m;
    }

    int d() {
        a aVar = this.f41696j;
        if (aVar != null) {
            return aVar.f41707c;
        }
        return -1;
    }

    Bitmap e() {
        return this.f41699m;
    }

    int f() {
        return this.f41687a.k();
    }

    com.bumptech.glide.load.i<Bitmap> h() {
        return this.f41700n;
    }

    int i() {
        return this.f41705s;
    }

    int j() {
        return this.f41687a.m();
    }

    int l() {
        return this.f41687a.h() + this.f41703q;
    }

    int m() {
        return this.f41704r;
    }

    @j1
    void o(a aVar) {
        d dVar = this.f41702p;
        if (dVar != null) {
            dVar.a();
        }
        this.f41693g = false;
        if (this.f41697k) {
            this.f41688b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f41692f) {
            if (this.f41694h) {
                this.f41688b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f41701o = aVar;
                return;
            }
        }
        if (aVar.a() != null) {
            p();
            a aVar2 = this.f41696j;
            this.f41696j = aVar;
            for (int size = this.f41689c.size() - 1; size >= 0; size--) {
                this.f41689c.get(size).a();
            }
            if (aVar2 != null) {
                this.f41688b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        n();
    }

    void q(com.bumptech.glide.load.i<Bitmap> iVar, Bitmap bitmap) {
        this.f41700n = (com.bumptech.glide.load.i) m.e(iVar);
        this.f41699m = (Bitmap) m.e(bitmap);
        this.f41695i = this.f41695i.i(new com.bumptech.glide.request.h().T0(iVar));
        this.f41703q = o.i(bitmap);
        this.f41704r = bitmap.getWidth();
        this.f41705s = bitmap.getHeight();
    }

    void r() {
        m.b(!this.f41692f, "Can't restart a running animation");
        this.f41694h = true;
        a aVar = this.f41701o;
        if (aVar != null) {
            this.f41690d.q(aVar);
            this.f41701o = null;
        }
    }

    @j1
    void s(@p0 d dVar) {
        this.f41702p = dVar;
    }

    void v(b bVar) {
        if (this.f41697k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f41689c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f41689c.isEmpty();
        this.f41689c.add(bVar);
        if (zIsEmpty) {
            t();
        }
    }

    void w(b bVar) {
        this.f41689c.remove(bVar);
        if (this.f41689c.isEmpty()) {
            u();
        }
    }
}
