package com.max.video.ui.widget;

import af.i;
import af.j;
import af.o;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AlphaAnimation;
import com.max.video.ui.CenterPanel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BasicCenterPanel.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class BasicCenterPanel extends CenterPanel implements i, o, af.e, j {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final xd.b f76101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f76102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f76103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final AlphaAnimation f76104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final AlphaAnimation f76105f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicCenterPanel(@dl.d Context context) {
        super(context);
        f0.p(context, "context");
        xd.b bVarD = xd.b.d(LayoutInflater.from(getContext()), this, true);
        f0.o(bVarD, "inflate(...)");
        this.f76101b = bVarD;
        this.f76102c = -1;
        this.f76104e = new AlphaAnimation(0.4f, 1.0f);
        this.f76105f = new AlphaAnimation(1.0f, 0.4f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicCenterPanel(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        super(context, attributeSet);
        f0.p(context, "context");
        xd.b bVarD = xd.b.d(LayoutInflater.from(getContext()), this, true);
        f0.o(bVarD, "inflate(...)");
        this.f76101b = bVarD;
        this.f76102c = -1;
        this.f76104e = new AlphaAnimation(0.4f, 1.0f);
        this.f76105f = new AlphaAnimation(1.0f, 0.4f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicCenterPanel(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        xd.b bVarD = xd.b.d(LayoutInflater.from(getContext()), this, true);
        f0.o(bVarD, "inflate(...)");
        this.f76101b = bVarD;
        this.f76102c = -1;
        this.f76104e = new AlphaAnimation(0.4f, 1.0f);
        this.f76105f = new AlphaAnimation(1.0f, 0.4f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicCenterPanel(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        f0.p(context, "context");
        xd.b bVarD = xd.b.d(LayoutInflater.from(getContext()), this, true);
        f0.o(bVarD, "inflate(...)");
        this.f76101b = bVarD;
        this.f76102c = -1;
        this.f76104e = new AlphaAnimation(0.4f, 1.0f);
        this.f76105f = new AlphaAnimation(1.0f, 0.4f);
    }

    private final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.yq, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f76104e.setDuration(300L);
        this.f76105f.setDuration(300L);
        this.f76104e.setRepeatCount(-1);
        this.f76105f.setRepeatCount(-1);
        this.f76104e.setFillAfter(false);
        this.f76105f.setFillAfter(false);
        this.f76104e.setRepeatMode(2);
        this.f76105f.setRepeatMode(2);
        this.f76103d = true;
    }

    @Override // af.o
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.vq, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f76101b.f141262k.setVisibility(0);
    }

    @Override // af.i
    public void b() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.uq, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f76101b.f141260i.setVisibility(8);
        AnimationDrawable animationDrawable = (AnimationDrawable) this.f76101b.f141253b.getDrawable();
        if (animationDrawable != null && animationDrawable.isRunning()) {
            z10 = true;
        }
        if (z10) {
            animationDrawable.stop();
        }
    }

    @Override // af.e
    public void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.sq, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f76101b.f141259h.setVisibility(8);
        this.f76101b.f141254c.clearAnimation();
        this.f76101b.f141255d.clearAnimation();
    }

    @Override // af.j
    public void d(int i10) {
        this.f76102c = i10;
    }

    @Override // af.o
    public void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.xq, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f76101b.f141262k.setVisibility(8);
    }

    @Override // af.o
    public void f(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.wq, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        ye.c cVar = ye.c.f141793a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cVar.c(i10));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-30720), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " / ").append((CharSequence) cVar.c(i11));
        this.f76101b.f141258g.setText(spannableStringBuilder);
    }

    @Override // af.e
    public void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.rq, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!this.f76103d) {
            h();
        }
        this.f76101b.f141259h.setVisibility(0);
        this.f76101b.f141254c.startAnimation(this.f76104e);
        this.f76101b.f141255d.startAnimation(this.f76105f);
    }

    @Override // af.i
    public void showLoading() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.tq, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f76102c >= 0) {
            this.f76101b.f141257f.setVisibility(0);
            this.f76101b.f141256e.setVisibility(8);
            this.f76101b.f141257f.setText(ye.c.f141793a.a(this.f76102c));
        } else {
            this.f76101b.f141257f.setVisibility(8);
            this.f76101b.f141256e.setVisibility(0);
        }
        this.f76101b.f141260i.setVisibility(0);
        Drawable drawable = this.f76101b.f141253b.getDrawable();
        f0.n(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        if (animationDrawable.isRunning()) {
            return;
        }
        animationDrawable.start();
    }
}
