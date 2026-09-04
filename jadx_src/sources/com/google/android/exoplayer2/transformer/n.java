package com.google.android.exoplayer2.transformer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import androidx.annotation.j1;
import androidx.annotation.w0;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.b3;
import com.google.android.exoplayer2.c3;
import com.google.android.exoplayer2.e3;
import com.google.android.exoplayer2.e4;
import com.google.android.exoplayer2.f3;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.m3;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.q3;
import com.google.android.exoplayer2.source.p0;
import com.google.android.exoplayer2.source.p1;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.video.a0;
import com.google.android.exoplayer2.video.y;
import com.google.android.exoplayer2.y1;
import com.google.android.exoplayer2.z3;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: compiled from: Transformer.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(18)
public final class n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f50291k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f50292l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f50293m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f50294n = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f50295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p0 f50296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.transformer.d.a f50297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f50298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Looper f50299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e f50300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f50301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.transformer.e f50302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.t f50303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f50304j;

    /* JADX INFO: compiled from: Transformer.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f50305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p0 f50306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.google.android.exoplayer2.transformer.d.a f50307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f50308d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f50309e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f50310f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f50311g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private c f50312h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Looper f50313i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private com.google.android.exoplayer2.util.e f50314j;

        /* JADX INFO: compiled from: Transformer.java */
        public class a implements c {
            a(b bVar) {
            }

            @Override // com.google.android.exoplayer2.transformer.n.c
            public /* synthetic */ void a(i2 i2Var, Exception exc) {
                o.b(this, i2Var, exc);
            }

            @Override // com.google.android.exoplayer2.transformer.n.c
            public /* synthetic */ void b(i2 i2Var) {
                o.a(this, i2Var);
            }
        }

        public b() {
            this.f50307c = new com.google.android.exoplayer2.transformer.b.C0400b();
            this.f50311g = "video/mp4";
            this.f50312h = new a(this);
            this.f50313i = u0.X();
            this.f50314j = com.google.android.exoplayer2.util.e.f51387a;
        }

        private b(n nVar) {
            this.f50305a = nVar.f50295a;
            this.f50306b = nVar.f50296b;
            this.f50307c = nVar.f50297c;
            this.f50308d = nVar.f50298d.f50285a;
            this.f50309e = nVar.f50298d.f50286b;
            this.f50310f = nVar.f50298d.f50287c;
            this.f50311g = nVar.f50298d.f50288d;
            this.f50312h = nVar.f50301g;
            this.f50313i = nVar.f50299e;
            this.f50314j = nVar.f50300f;
        }

        public n a() {
            com.google.android.exoplayer2.util.a.k(this.f50305a);
            if (this.f50306b == null) {
                com.google.android.exoplayer2.extractor.h hVar = new com.google.android.exoplayer2.extractor.h();
                if (this.f50310f) {
                    hVar.l(4);
                }
                this.f50306b = new com.google.android.exoplayer2.source.l(this.f50305a, hVar);
            }
            boolean zB = this.f50307c.b(this.f50311g);
            String strValueOf = String.valueOf(this.f50311g);
            com.google.android.exoplayer2.util.a.j(zB, strValueOf.length() != 0 ? "Unsupported output MIME type: ".concat(strValueOf) : new String("Unsupported output MIME type: "));
            return new n(this.f50305a, this.f50306b, this.f50307c, new m(this.f50308d, this.f50309e, this.f50310f, this.f50311g, null, null), this.f50312h, this.f50313i, this.f50314j);
        }

        @j1
        b b(com.google.android.exoplayer2.util.e eVar) {
            this.f50314j = eVar;
            return this;
        }

        public b c(Context context) {
            this.f50305a = context.getApplicationContext();
            return this;
        }

        public b d(boolean z10) {
            this.f50310f = z10;
            return this;
        }

        public b e(c cVar) {
            this.f50312h = cVar;
            return this;
        }

        public b f(Looper looper) {
            this.f50313i = looper;
            return this;
        }

        public b g(p0 p0Var) {
            this.f50306b = p0Var;
            return this;
        }

        @j1
        b h(com.google.android.exoplayer2.transformer.d.a aVar) {
            this.f50307c = aVar;
            return this;
        }

        public b i(String str) {
            this.f50311g = str;
            return this;
        }

        public b j(boolean z10) {
            this.f50308d = z10;
            return this;
        }

        public b k(boolean z10) {
            this.f50309e = z10;
            return this;
        }
    }

    /* JADX INFO: compiled from: Transformer.java */
    public interface c {
        void a(i2 i2Var, Exception exc);

        void b(i2 i2Var);
    }

    /* JADX INFO: compiled from: Transformer.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* JADX INFO: compiled from: Transformer.java */
    public final class e implements c3.h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i2 f50315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.google.android.exoplayer2.transformer.e f50316c;

        public e(i2 i2Var, com.google.android.exoplayer2.transformer.e eVar) {
            this.f50315b = i2Var;
            this.f50316c = eVar;
        }

        private void s(@androidx.annotation.p0 Exception exc) {
            try {
                n.this.p(false);
            } catch (IllegalStateException e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
            if (exc == null) {
                n.this.f50301g.b(this.f50315b);
            } else {
                n.this.f50301g.a(this.f50315b, exc);
            }
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void B(int i10) {
            f3.b(this, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void F(int i10, boolean z10) {
            f3.f(this, i10, z10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void H() {
            e3.v(this);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void K(com.google.android.exoplayer2.audio.f fVar) {
            f3.a(this, fVar);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void V(com.google.android.exoplayer2.p pVar) {
            f3.e(this, pVar);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void X() {
            f3.u(this);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.audio.t
        public /* synthetic */ void a(boolean z10) {
            f3.z(this, z10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void b(b3 b3Var) {
            f3.n(this, b3Var);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void c(c3.l lVar, c3.l lVar2, int i10) {
            f3.t(this, lVar, lVar2, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public void d(z3 z3Var, int i10) {
            if (n.this.f50304j != 0) {
                return;
            }
            z3.d dVar = new z3.d();
            z3Var.u(0, dVar);
            if (dVar.f52123m) {
                return;
            }
            long j10 = dVar.f52125o;
            n.this.f50304j = (j10 <= 0 || j10 == com.google.android.exoplayer2.j.f46377b) ? 2 : 1;
            ((com.google.android.exoplayer2.t) com.google.android.exoplayer2.util.a.g(n.this.f50303i)).play();
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void d0(p1 p1Var, com.google.android.exoplayer2.trackselection.p pVar) {
            e3.z(this, p1Var, pVar);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void e(m2 m2Var) {
            f3.k(this, m2Var);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void f(boolean z10) {
            f3.y(this, z10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void f0(com.google.android.exoplayer2.trackselection.u uVar) {
            e3.y(this, uVar);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.video.y
        public /* synthetic */ void g(a0 a0Var) {
            f3.D(this, a0Var);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void g0(int i10, int i11) {
            f3.A(this, i10, i11);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void h(PlaybackException playbackException) {
            f3.r(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void h0(int i10) {
            e3.q(this, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public void i(PlaybackException playbackException) {
            s(playbackException);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void j(long j10) {
            f3.x(this, j10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void k(boolean z10, int i10) {
            f3.m(this, z10, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void k0(float f10) {
            f3.E(this, f10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void l(boolean z10) {
            f3.i(this, z10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void l0(boolean z10, int i10) {
            e3.o(this, z10, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void m(int i10) {
            f3.p(this, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public void n(e4 e4Var) {
            if (this.f50316c.d() == 0) {
                s(new IllegalStateException("The output does not contain any tracks. Check that at least one of the input sample formats is supported."));
            }
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void o(c3.c cVar) {
            f3.c(this, cVar);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void onRepeatModeChanged(int i10) {
            f3.v(this, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public void p(int i10) {
            if (i10 == 4) {
                s(null);
            }
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void p0(long j10) {
            e3.f(this, j10);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void q(Metadata metadata) {
            f3.l(this, metadata);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void r(long j10) {
            f3.w(this, j10);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void t(List list) {
            f3.d(this, list);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void u(boolean z10) {
            f3.h(this, z10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void v(c3 c3Var, c3.g gVar) {
            f3.g(this, c3Var, gVar);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void w(i2 i2Var, int i10) {
            f3.j(this, i2Var, i10);
        }

        @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
        public /* synthetic */ void x(m2 m2Var) {
            f3.s(this, m2Var);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void y(boolean z10) {
            e3.e(this, z10);
        }
    }

    /* JADX INFO: compiled from: Transformer.java */
    public static final class f implements q3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.android.exoplayer2.transformer.e f50318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s f50319b = new s();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final m f50320c;

        public f(com.google.android.exoplayer2.transformer.e eVar, m mVar) {
            this.f50318a = eVar;
            this.f50320c = mVar;
        }

        @Override // com.google.android.exoplayer2.q3
        public m3[] a(Handler handler, y yVar, com.google.android.exoplayer2.audio.t tVar, com.google.android.exoplayer2.text.m mVar, com.google.android.exoplayer2.metadata.e eVar) {
            m mVar2 = this.f50320c;
            boolean z10 = mVar2.f50285a;
            char c10 = 1;
            m3[] m3VarArr = new m3[(z10 || mVar2.f50286b) ? 1 : 2];
            if (z10) {
                c10 = 0;
            } else {
                m3VarArr[0] = new p(this.f50318a, this.f50319b, mVar2);
            }
            m mVar3 = this.f50320c;
            if (!mVar3.f50286b) {
                m3VarArr[c10] = new t(this.f50318a, this.f50319b, mVar3);
            }
            return m3VarArr;
        }
    }

    static {
        y1.a("goog.exo.transformer");
    }

    private n(Context context, p0 p0Var, com.google.android.exoplayer2.transformer.d.a aVar, m mVar, c cVar, Looper looper, com.google.android.exoplayer2.util.e eVar) {
        com.google.android.exoplayer2.util.a.j((mVar.f50285a && mVar.f50286b) ? false : true, "Audio and video cannot both be removed.");
        this.f50295a = context;
        this.f50296b = p0Var;
        this.f50297c = aVar;
        this.f50298d = mVar;
        this.f50301g = cVar;
        this.f50299e = looper;
        this.f50300f = eVar;
        this.f50304j = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(boolean z10) {
        u();
        com.google.android.exoplayer2.t tVar = this.f50303i;
        if (tVar != null) {
            tVar.release();
            this.f50303i = null;
        }
        com.google.android.exoplayer2.transformer.e eVar = this.f50302h;
        if (eVar != null) {
            eVar.f(z10);
            this.f50302h = null;
        }
        this.f50304j = 4;
    }

    private void s(i2 i2Var, com.google.android.exoplayer2.transformer.d dVar) {
        u();
        if (this.f50303i != null) {
            throw new IllegalStateException("There is already a transformation in progress.");
        }
        com.google.android.exoplayer2.transformer.e eVar = new com.google.android.exoplayer2.transformer.e(dVar, this.f50297c, this.f50298d.f50288d);
        this.f50302h = eVar;
        com.google.android.exoplayer2.trackselection.f fVar = new com.google.android.exoplayer2.trackselection.f(this.f50295a);
        fVar.h(new com.google.android.exoplayer2.trackselection.f.e(this.f50295a).F(true).y());
        com.google.android.exoplayer2.t tVarX = new com.google.android.exoplayer2.t.c(this.f50295a, new f(eVar, this.f50298d)).g0(this.f50296b).p0(fVar).e0(new com.google.android.exoplayer2.l.a().e(50000, 50000, 250, 500).a()).f0(this.f50299e).a0(this.f50300f).x();
        this.f50303i = tVarX;
        tVarX.F1(i2Var);
        this.f50303i.S1(new e(i2Var, eVar));
        this.f50303i.prepare();
        this.f50304j = 0;
    }

    private void u() {
        if (Looper.myLooper() != this.f50299e) {
            throw new IllegalStateException("Transformer is accessed on the wrong thread.");
        }
    }

    public b l() {
        return new b();
    }

    public void m() {
        p(true);
    }

    public Looper n() {
        return this.f50299e;
    }

    public int o(com.google.android.exoplayer2.transformer.f fVar) {
        u();
        if (this.f50304j == 1) {
            c3 c3Var = (c3) com.google.android.exoplayer2.util.a.g(this.f50303i);
            fVar.f50227a = Math.min((int) ((c3Var.getCurrentPosition() * 100) / c3Var.getDuration()), 99);
        }
        return this.f50304j;
    }

    public void q(c cVar) {
        u();
        this.f50301g = cVar;
    }

    @w0(26)
    public void r(i2 i2Var, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        s(i2Var, this.f50297c.a(parcelFileDescriptor, this.f50298d.f50288d));
    }

    public void t(i2 i2Var, String str) throws IOException {
        s(i2Var, this.f50297c.d(str, this.f50298d.f50288d));
    }
}
