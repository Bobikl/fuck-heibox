package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.r;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.b3;
import com.google.android.exoplayer2.c3;
import com.google.android.exoplayer2.e3;
import com.google.android.exoplayer2.e4;
import com.google.android.exoplayer2.f3;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.p1;
import com.google.android.exoplayer2.z3;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class SubtitleView extends FrameLayout implements c3.h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f50652l = 0.0533f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f50653m = 0.08f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f50654n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f50655o = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<com.google.android.exoplayer2.text.b> f50656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f50657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f50659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f50660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f50661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f50662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f50663i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f50664j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f50665k;

    public interface a {
        void a(List<com.google.android.exoplayer2.text.b> list, e eVar, float f10, int i10, float f11);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    public SubtitleView(Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50656b = Collections.emptyList();
        this.f50657c = e.f50717m;
        this.f50658d = 0;
        this.f50659e = 0.0533f;
        this.f50660f = 0.08f;
        this.f50661g = true;
        this.f50662h = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context);
        this.f50664j = canvasSubtitleOutput;
        this.f50665k = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.f50663i = 1;
    }

    private void A() {
        this.f50664j.a(getCuesWithStylingPreferencesApplied(), this.f50657c, this.f50659e, this.f50658d, this.f50660f);
    }

    private List<com.google.android.exoplayer2.text.b> getCuesWithStylingPreferencesApplied() {
        if (this.f50661g && this.f50662h) {
            return this.f50656b;
        }
        ArrayList arrayList = new ArrayList(this.f50656b.size());
        for (int i10 = 0; i10 < this.f50656b.size(); i10++) {
            arrayList.add(s(this.f50656b.get(i10)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (com.google.android.exoplayer2.util.u0.f51536a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private e getUserCaptionStyle() {
        if (com.google.android.exoplayer2.util.u0.f51536a < 19 || isInEditMode()) {
            return e.f50717m;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? e.f50717m : e.a(captioningManager.getUserStyle());
    }

    private com.google.android.exoplayer2.text.b s(com.google.android.exoplayer2.text.b bVar) {
        com.google.android.exoplayer2.text.b.c cVarC = bVar.c();
        if (!this.f50661g) {
            t0.e(cVarC);
        } else if (!this.f50662h) {
            t0.f(cVarC);
        }
        return cVarC.a();
    }

    private <T extends View & a> void setView(T t10) {
        removeView(this.f50665k);
        View view = this.f50665k;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).g();
        }
        this.f50665k = t10;
        this.f50664j = t10;
        addView(t10);
    }

    private void z(int i10, float f10) {
        this.f50658d = i10;
        this.f50659e = f10;
        A();
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
    public /* synthetic */ void d(z3 z3Var, int i10) {
        f3.B(this, z3Var, i10);
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
    public /* synthetic */ void g(com.google.android.exoplayer2.video.a0 a0Var) {
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

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f50662h = z10;
        A();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f50661g = z10;
        A();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f50660f = f10;
        A();
    }

    public void setCues(@androidx.annotation.p0 List<com.google.android.exoplayer2.text.b> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f50656b = list;
        A();
    }

    public void setFixedTextSize(@r int i10, float f10) {
        Context context = getContext();
        z(2, TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public void setFractionalTextSize(float f10) {
        setFractionalTextSize(f10, false);
    }

    public void setFractionalTextSize(float f10, boolean z10) {
        z(z10 ? 1 : 0, f10);
    }

    public void setStyle(e eVar) {
        this.f50657c = eVar;
        A();
    }

    public void setUserDefaultStyle() {
        setStyle(getUserCaptionStyle());
    }

    public void setUserDefaultTextSize() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setViewType(int i10) {
        if (this.f50663i == i10) {
            return;
        }
        if (i10 == 1) {
            setView(new CanvasSubtitleOutput(getContext()));
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new WebViewSubtitleOutput(getContext()));
        }
        this.f50663i = i10;
    }

    @Override // com.google.android.exoplayer2.c3.h
    public void t(List<com.google.android.exoplayer2.text.b> list) {
        setCues(list);
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
