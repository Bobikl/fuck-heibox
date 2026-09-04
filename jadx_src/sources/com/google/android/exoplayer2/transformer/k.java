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
import com.google.android.exoplayer2.z3;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: compiled from: TranscodingTransformer.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(18)
public final class k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f50252k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f50253l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f50254m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f50255n = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f50256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p0 f50257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.transformer.d.a f50258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f50259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Looper f50260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e f50261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f50262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.transformer.e f50263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.t f50264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f50265j;

    /* JADX INFO: compiled from: TranscodingTransformer.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f50266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p0 f50267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.google.android.exoplayer2.transformer.d.a f50268c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f50269d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f50270e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f50271f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f50272g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @androidx.annotation.p0
        private String f50273h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @androidx.annotation.p0
        private String f50274i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private c f50275j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Looper f50276k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private com.google.android.exoplayer2.util.e f50277l;

        /* JADX INFO: compiled from: TranscodingTransformer.java */
        public class a implements c {
            a(b bVar) {
            }

            @Override // com.google.android.exoplayer2.transformer.k.c
            public /* synthetic */ void a(i2 i2Var, Exception exc) {
                l.b(this, i2Var, exc);
            }

            @Override // com.google.android.exoplayer2.transformer.k.c
            public /* synthetic */ void b(i2 i2Var) {
                l.a(this, i2Var);
            }
        }

        public b() {
            this.f50268c = new com.google.android.exoplayer2.transformer.b.C0400b();
            this.f50272g = "video/mp4";
            this.f50275j = new a(this);
            this.f50276k = u0.X();
            this.f50277l = com.google.android.exoplayer2.util.e.f51387a;
        }

        private b(k kVar) {
            this.f50266a = kVar.f50256a;
            this.f50267b = kVar.f50257b;
            this.f50268c = kVar.f50258c;
            this.f50269d = kVar.f50259d.f50285a;
            this.f50270e = kVar.f50259d.f50286b;
            this.f50271f = kVar.f50259d.f50287c;
            this.f50272g = kVar.f50259d.f50288d;
            this.f50273h = kVar.f50259d.f50289e;
            this.f50274i = kVar.f50259d.f50290f;
            this.f50275j = kVar.f50262g;
            this.f50276k = kVar.f50260e;
            this.f50277l = kVar.f50261f;
        }

        private void b(String str) {
            boolean zC = this.f50268c.c(str, this.f50272g);
            String str2 = this.f50272g;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 54 + String.valueOf(str2).length());
            sb2.append("Unsupported sample MIME type ");
            sb2.append(str);
            sb2.append(" for container MIME type ");
            sb2.append(str2);
            com.google.android.exoplayer2.util.a.j(zC, sb2.toString());
        }

        public k a() {
            com.google.android.exoplayer2.util.a.k(this.f50266a);
            if (this.f50267b == null) {
                com.google.android.exoplayer2.extractor.h hVar = new com.google.android.exoplayer2.extractor.h();
                if (this.f50271f) {
                    hVar.l(4);
                }
                this.f50267b = new com.google.android.exoplayer2.source.l(this.f50266a, hVar);
            }
            boolean zB = this.f50268c.b(this.f50272g);
            String strValueOf = String.valueOf(this.f50272g);
            com.google.android.exoplayer2.util.a.j(zB, strValueOf.length() != 0 ? "Unsupported output MIME type: ".concat(strValueOf) : new String("Unsupported output MIME type: "));
            String str = this.f50273h;
            if (str != null) {
                b(str);
            }
            String str2 = this.f50274i;
            if (str2 != null) {
                b(str2);
            }
            return new k(this.f50266a, this.f50267b, this.f50268c, new m(this.f50269d, this.f50270e, this.f50271f, this.f50272g, this.f50273h, this.f50274i), this.f50275j, this.f50276k, this.f50277l);
        }

        public b c(String str) {
            this.f50273h = str;
            return this;
        }

        @j1
        b d(com.google.android.exoplayer2.util.e eVar) {
            this.f50277l = eVar;
            return this;
        }

        public b e(Context context) {
            this.f50266a = context.getApplicationContext();
            return this;
        }

        public b f(boolean z10) {
            this.f50271f = z10;
            return this;
        }

        public b g(c cVar) {
            this.f50275j = cVar;
            return this;
        }

        public b h(Looper looper) {
            this.f50276k = looper;
            return this;
        }

        public b i(p0 p0Var) {
            this.f50267b = p0Var;
            return this;
        }

        @j1
        b j(com.google.android.exoplayer2.transformer.d.a aVar) {
            this.f50268c = aVar;
            return this;
        }

        public b k(String str) {
            this.f50272g = str;
            return this;
        }

        public b l(boolean z10) {
            this.f50269d = z10;
            return this;
        }

        public b m(boolean z10) {
            this.f50270e = z10;
            return this;
        }

        public b n(String str) {
            this.f50274i = str;
            return this;
        }
    }

    /* JADX INFO: compiled from: TranscodingTransformer.java */
    public interface c {
        void a(i2 i2Var, Exception exc);

        void b(i2 i2Var);
    }

    /* JADX INFO: compiled from: TranscodingTransformer.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* JADX INFO: compiled from: TranscodingTransformer.java */
    public final class e implements c3.h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i2 f50278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.google.android.exoplayer2.transformer.e f50279c;

        public e(i2 i2Var, com.google.android.exoplayer2.transformer.e eVar) {
            this.f50278b = i2Var;
            this.f50279c = eVar;
        }

        private void s(@androidx.annotation.p0 Exception exc) {
            try {
                k.this.p(false);
            } catch (IllegalStateException e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
            if (exc == null) {
                k.this.f50262g.b(this.f50278b);
            } else {
                k.this.f50262g.a(this.f50278b, exc);
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
            if (k.this.f50265j != 0) {
                return;
            }
            z3.d dVar = new z3.d();
            z3Var.u(0, dVar);
            if (dVar.f52123m) {
                return;
            }
            long j10 = dVar.f52125o;
            k.this.f50265j = (j10 <= 0 || j10 == com.google.android.exoplayer2.j.f46377b) ? 2 : 1;
            ((com.google.android.exoplayer2.t) com.google.android.exoplayer2.util.a.g(k.this.f50264i)).play();
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
            if (this.f50279c.d() == 0) {
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

    /* JADX INFO: compiled from: TranscodingTransformer.java */
    public static final class f implements q3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f50281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.android.exoplayer2.transformer.e f50282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final s f50283c = new s();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final m f50284d;

        public f(Context context, com.google.android.exoplayer2.transformer.e eVar, m mVar) {
            this.f50281a = context;
            this.f50282b = eVar;
            this.f50284d = mVar;
        }

        @Override // com.google.android.exoplayer2.q3
        public m3[] a(Handler handler, y yVar, com.google.android.exoplayer2.audio.t tVar, com.google.android.exoplayer2.text.m mVar, com.google.android.exoplayer2.metadata.e eVar) {
            m mVar2 = this.f50284d;
            boolean z10 = mVar2.f50285a;
            char c10 = 1;
            m3[] m3VarArr = new m3[(z10 || mVar2.f50286b) ? 1 : 2];
            if (z10) {
                c10 = 0;
            } else {
                m3VarArr[0] = new p(this.f50282b, this.f50283c, mVar2);
            }
            if (!this.f50284d.f50286b) {
                m3VarArr[c10] = new v(this.f50281a, this.f50282b, this.f50283c, this.f50284d);
            }
            return m3VarArr;
        }
    }

    private k(Context context, p0 p0Var, com.google.android.exoplayer2.transformer.d.a aVar, m mVar, c cVar, Looper looper, com.google.android.exoplayer2.util.e eVar) {
        com.google.android.exoplayer2.util.a.j((mVar.f50285a && mVar.f50286b) ? false : true, "Audio and video cannot both be removed.");
        this.f50256a = context;
        this.f50257b = p0Var;
        this.f50258c = aVar;
        this.f50259d = mVar;
        this.f50262g = cVar;
        this.f50260e = looper;
        this.f50261f = eVar;
        this.f50265j = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(boolean z10) {
        u();
        com.google.android.exoplayer2.t tVar = this.f50264i;
        if (tVar != null) {
            tVar.release();
            this.f50264i = null;
        }
        com.google.android.exoplayer2.transformer.e eVar = this.f50263h;
        if (eVar != null) {
            eVar.f(z10);
            this.f50263h = null;
        }
        this.f50265j = 4;
    }

    private void s(i2 i2Var, com.google.android.exoplayer2.transformer.d dVar) {
        u();
        if (this.f50264i != null) {
            throw new IllegalStateException("There is already a transformation in progress.");
        }
        com.google.android.exoplayer2.transformer.e eVar = new com.google.android.exoplayer2.transformer.e(dVar, this.f50258c, this.f50259d.f50288d);
        this.f50263h = eVar;
        com.google.android.exoplayer2.trackselection.f fVar = new com.google.android.exoplayer2.trackselection.f(this.f50256a);
        fVar.h(new com.google.android.exoplayer2.trackselection.f.e(this.f50256a).F(true).y());
        com.google.android.exoplayer2.l lVarA = new com.google.android.exoplayer2.l.a().e(50000, 50000, 250, 500).a();
        Context context = this.f50256a;
        com.google.android.exoplayer2.t tVarX = new com.google.android.exoplayer2.t.c(context, new f(context, eVar, this.f50259d)).g0(this.f50257b).p0(fVar).e0(lVarA).f0(this.f50260e).a0(this.f50261f).x();
        this.f50264i = tVarX;
        tVarX.F1(i2Var);
        this.f50264i.S1(new e(i2Var, eVar));
        this.f50264i.prepare();
        this.f50265j = 0;
    }

    private void u() {
        if (Looper.myLooper() != this.f50260e) {
            throw new IllegalStateException("Transcoding Transformer is accessed on the wrong thread.");
        }
    }

    public b l() {
        return new b();
    }

    public void m() {
        p(true);
    }

    public Looper n() {
        return this.f50260e;
    }

    public int o(com.google.android.exoplayer2.transformer.f fVar) {
        u();
        if (this.f50265j == 1) {
            c3 c3Var = (c3) com.google.android.exoplayer2.util.a.g(this.f50264i);
            fVar.f50227a = Math.min((int) ((c3Var.getCurrentPosition() * 100) / c3Var.getDuration()), 99);
        }
        return this.f50265j;
    }

    public void q(c cVar) {
        u();
        this.f50262g = cVar;
    }

    @w0(26)
    public void r(i2 i2Var, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        s(i2Var, this.f50258c.a(parcelFileDescriptor, this.f50259d.f50288d));
    }

    public void t(i2 i2Var, String str) throws IOException {
        s(i2Var, this.f50258c.d(str, this.f50259d.f50288d));
    }
}
