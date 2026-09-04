package com.heybox.imageviewer.widgets.video;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.TextureView;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.analytics.p1;
import com.google.android.exoplayer2.audio.f;
import com.google.android.exoplayer2.b3;
import com.google.android.exoplayer2.c3;
import com.google.android.exoplayer2.e3;
import com.google.android.exoplayer2.e4;
import com.google.android.exoplayer2.f3;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p;
import com.google.android.exoplayer2.s3;
import com.google.android.exoplayer2.t;
import com.google.android.exoplayer2.util.m;
import com.google.android.exoplayer2.video.a0;
import com.google.android.exoplayer2.z3;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.z;
import xh.i;

/* JADX INFO: compiled from: ExoVideoView.kt */
/* JADX INFO: loaded from: classes7.dex */
@t0({"SMAP\nExoVideoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExoVideoView.kt\ncom/heybox/imageviewer/widgets/video/ExoVideoView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n1855#2,2:183\n1855#2,2:185\n*S KotlinDebug\n*F\n+ 1 ExoVideoView.kt\ncom/heybox/imageviewer/widgets/video/ExoVideoView\n*L\n80#1:183,2\n123#1:185,2\n*E\n"})
public class ExoVideoView extends TextureView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    public static final a f59845k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f59846l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f59847m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f59848n = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final z f59849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private s3 f59850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private c f59851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final List<p1> f59852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private String f59853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f59854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f59855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f59856i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final d f59857j;

    /* JADX INFO: compiled from: ExoVideoView.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: ExoVideoView.kt */
    public interface b {
        @e
        List<i2> a(@dl.d String str);
    }

    /* JADX INFO: compiled from: ExoVideoView.kt */
    public interface c {
        void a(@dl.d ExoVideoView exoVideoView);
    }

    /* JADX INFO: compiled from: ExoVideoView.kt */
    public static final class d implements c3.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
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
        public /* synthetic */ void K(f fVar) {
            f3.a(this, fVar);
        }

        @Override // com.google.android.exoplayer2.c3.h
        public /* synthetic */ void V(p pVar) {
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
        public /* synthetic */ void d(z3 z3Var, int i10) {
            f3.B(this, z3Var, i10);
        }

        @Override // com.google.android.exoplayer2.c3.f
        public /* synthetic */ void d0(com.google.android.exoplayer2.source.p1 p1Var, com.google.android.exoplayer2.trackselection.p pVar) {
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
        public void g(@dl.d a0 videoSize) {
            if (PatchProxy.proxy(new Object[]{videoSize}, this, changeQuickRedirect, false, 303, new Class[]{a0.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(videoSize, "videoSize");
            ExoVideoView.a(ExoVideoView.this, videoSize.f51712b, videoSize.f51713c);
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
        public /* synthetic */ void i(PlaybackException playbackException) {
            f3.q(this, playbackException);
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
        public /* synthetic */ void n(e4 e4Var) {
            f3.C(this, e4Var);
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
        public /* synthetic */ void p(int i10) {
            f3.o(this, i10);
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public ExoVideoView(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public ExoVideoView(@dl.d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public ExoVideoView(@dl.d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f59849b = b0.c(new yh.a<m>() { // from class: com.heybox.imageviewer.widgets.video.ExoVideoView$logger$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @d
            public final m a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 301, new Class[0], m.class);
                return patchProxyResultProxy.isSupported ? (m) patchProxyResultProxy.result : new m(null);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.exoplayer2.util.m, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ m invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 302, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f59852e = new ArrayList();
        this.f59855h = com.heybox.imageviewer.utils.a.f59777a.i();
        this.f59856i = true;
        this.f59857j = new d();
    }

    public /* synthetic */ ExoVideoView(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final /* synthetic */ void a(ExoVideoView exoVideoView, int i10, int i11) {
        Object[] objArr = {exoVideoView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 300, new Class[]{ExoVideoView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        exoVideoView.o(i10, i11);
    }

    private final void c(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.M2, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        float f10 = i10;
        float width = (getWidth() * 1.0f) / f10;
        float f11 = i11;
        float height = (getHeight() * 1.0f) / f11;
        Matrix matrix = new Matrix();
        matrix.postScale((f10 * 1.0f) / getWidth(), (1.0f * f11) / getHeight());
        matrix.postScale(Math.max(width, height), Math.max(width, height));
        matrix.postTranslate(width < height ? (getWidth() - (f10 * height)) / 2 : 0.0f, width >= height ? (getHeight() - (f11 * width)) / 2 : 0.0f);
        setTransform(matrix);
    }

    private final void d(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.L2, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        float f10 = i10;
        float width = (getWidth() * 1.0f) / f10;
        float f11 = i11;
        float height = (getHeight() * 1.0f) / f11;
        Matrix matrix = new Matrix();
        matrix.postScale((f10 * 1.0f) / getWidth(), (1.0f * f11) / getHeight());
        matrix.postScale(Math.min(width, height), Math.min(width, height));
        matrix.postTranslate(width > height ? (getWidth() - (f10 * height)) / 2 : 0.0f, width <= height ? (getHeight() - (f11 * width)) / 2 : 0.0f);
        setTransform(matrix);
    }

    private final void e(int i10, int i11) {
    }

    private final t f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.J2, new Class[0], t.class);
        if (patchProxyResultProxy.isSupported) {
            return (t) patchProxyResultProxy.result;
        }
        k();
        s3 s3VarB = new s3.b(getContext()).b();
        s3VarB.F(this);
        s3VarB.S1(this.f59857j);
        if (com.heybox.imageviewer.utils.a.f59777a.a()) {
            s3VarB.N0(getLogger());
        }
        Iterator it = CollectionsKt___CollectionsKt.Q5(this.f59852e).iterator();
        while (it.hasNext()) {
            s3VarB.N0((p1) it.next());
        }
        this.f59850c = s3VarB;
        f0.o(s3VarB, "also(...)");
        return s3VarB;
    }

    private final m getLogger() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f31074z2, new Class[0], m.class);
        return patchProxyResultProxy.isSupported ? (m) patchProxyResultProxy.result : (m) this.f59849b.getValue();
    }

    public static /* synthetic */ t i(ExoVideoView exoVideoView, b bVar, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{exoVideoView, bVar, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.b.I2, new Class[]{ExoVideoView.class, b.class, Integer.TYPE, Object.class}, t.class);
        if (patchProxyResultProxy.isSupported) {
            return (t) patchProxyResultProxy.result;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: player");
        }
        if ((i10 & 1) != 0) {
            bVar = null;
        }
        return exoVideoView.h(bVar);
    }

    public static /* synthetic */ void n(ExoVideoView exoVideoView, b bVar, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{exoVideoView, bVar, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.b.C2, new Class[]{ExoVideoView.class, b.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resume");
        }
        if ((i10 & 1) != 0) {
            bVar = null;
        }
        exoVideoView.m(bVar);
    }

    private final void o(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.K2, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        int i12 = this.f59855h;
        if (i12 == 0) {
            e(i10, i11);
        } else if (i12 == 1) {
            d(i10, i11);
        } else if (i12 == 2) {
            c(i10, i11);
        }
        invalidate();
        setAlpha(1.0f);
        c cVar = this.f59851d;
        if (cVar != null) {
            cVar.a(this);
        }
        this.f59854g = true;
    }

    public final void b(@dl.d p1 analyticsListener) {
        if (PatchProxy.proxy(new Object[]{analyticsListener}, this, changeQuickRedirect, false, bb.c.b.G2, new Class[]{p1.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(analyticsListener, "analyticsListener");
        if (this.f59852e.contains(analyticsListener)) {
            return;
        }
        this.f59852e.add(analyticsListener);
    }

    public final void g() {
        s3 s3Var;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.D2, new Class[0], Void.TYPE).isSupported || (s3Var = this.f59850c) == null) {
            return;
        }
        s3Var.n1(false);
    }

    public final boolean getAutoRelease() {
        return this.f59856i;
    }

    public final boolean getPrepared() {
        return this.f59854g;
    }

    public final int getScaleType() {
        return this.f59855h;
    }

    @e
    public final t h(@e b bVar) {
        List<i2> listK;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.b.H2, new Class[]{b.class}, t.class);
        if (patchProxyResultProxy.isSupported) {
            return (t) patchProxyResultProxy.result;
        }
        String str = this.f59853f;
        if (str == null) {
            return null;
        }
        if (this.f59850c == null) {
            this.f59854g = false;
            setAlpha(0.0f);
            f();
            s3 s3Var = this.f59850c;
            if (s3Var != null) {
                if (bVar == null || (listK = bVar.a(str)) == null) {
                    listK = s.k(i2.f(str));
                }
                s3Var.T0(listK);
            }
            s3 s3Var2 = this.f59850c;
            if (s3Var2 != null) {
                s3Var2.prepare();
            }
        }
        return this.f59850c;
    }

    public final void j(@dl.d String url) {
        if (PatchProxy.proxy(new Object[]{url}, this, changeQuickRedirect, false, bb.c.b.A2, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(url, "url");
        this.f59853f = url;
    }

    public final void k() {
        s3 s3Var;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.F2, new Class[0], Void.TYPE).isSupported || (s3Var = this.f59850c) == null) {
            return;
        }
        s3Var.n1(false);
        s3Var.F(null);
        s3Var.U(this.f59857j);
        s3Var.J1(getLogger());
        Iterator it = CollectionsKt___CollectionsKt.Q5(this.f59852e).iterator();
        while (it.hasNext()) {
            s3Var.J1((p1) it.next());
        }
        s3Var.release();
        this.f59850c = null;
    }

    public final void l() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.E2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        s3 s3Var = this.f59850c;
        if (s3Var != null) {
            s3Var.seekTo(0L);
        }
        s3 s3Var2 = this.f59850c;
        if (s3Var2 == null) {
            return;
        }
        s3Var2.n1(false);
    }

    public final void m(@e b bVar) {
        String str;
        List<i2> listK;
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.b.B2, new Class[]{b.class}, Void.TYPE).isSupported || (str = this.f59853f) == null) {
            return;
        }
        if (this.f59850c == null) {
            this.f59854g = false;
            setAlpha(0.0f);
            f();
            s3 s3Var = this.f59850c;
            if (s3Var != null) {
                if (bVar == null || (listK = bVar.a(str)) == null) {
                    listK = s.k(i2.f(str));
                }
                s3Var.T0(listK);
            }
            s3 s3Var2 = this.f59850c;
            if (s3Var2 != null) {
                s3Var2.prepare();
            }
        }
        s3 s3Var3 = this.f59850c;
        if (s3Var3 == null) {
            return;
        }
        s3Var3.n1(true);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.N2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        if (getAutoRelease()) {
            k();
        }
    }

    public final void setAutoRelease(boolean z10) {
        this.f59856i = z10;
    }

    public final void setPrepared(boolean z10) {
        this.f59854g = z10;
    }

    public final void setScaleType(int i10) {
        this.f59855h = i10;
    }

    public final void setVideoRenderedCallback(@e c cVar) {
        this.f59851d = cVar;
    }
}
