package com.max.xiaoheihe.utils;

import android.animation.ObjectAnimator;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: PostBtnAnimatorProxy.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class u {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f95753g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private com.max.hbcommon.base.a f95754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private View f95755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f95756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private ObjectAnimator f95757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private ObjectAnimator f95758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f95759f;

    public u(@dl.d com.max.hbcommon.base.a context, @dl.d View postView, int i10) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(postView, "postView");
        this.f95754a = context;
        this.f95755b = postView;
        this.f95756c = i10;
        this.f95759f = true;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(postView, "translationX", i10 + 0.0f, 0.0f);
        kotlin.jvm.internal.f0.o(objectAnimatorOfFloat, "ofFloat(\n            pos…ationX + 0f, 0f\n        )");
        this.f95757d = objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f95755b, "translationX", 0.0f, this.f95756c + 0.0f);
        kotlin.jvm.internal.f0.o(objectAnimatorOfFloat2, "ofFloat(\n            pos…anslationX + 0f\n        )");
        this.f95758e = objectAnimatorOfFloat2;
        this.f95754a.addValueAnimator(this.f95757d);
        this.f95754a.addValueAnimator(this.f95758e);
    }

    @dl.d
    public final com.max.hbcommon.base.a a() {
        return this.f95754a;
    }

    @dl.d
    public final View b() {
        return this.f95755b;
    }

    public final int c() {
        return this.f95756c;
    }

    public final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48794, new Class[0], Void.TYPE).isSupported || !this.f95759f || this.f95758e.isRunning()) {
            return;
        }
        this.f95758e.start();
        this.f95759f = false;
    }

    public final void e(@dl.d com.max.hbcommon.base.a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 48790, new Class[]{com.max.hbcommon.base.a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(aVar, "<set-?>");
        this.f95754a = aVar;
    }

    public final void f(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 48792, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f95759f = z10;
        this.f95755b.setVisibility(z10 ? 0 : 8);
    }

    public final void g(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48791, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "<set-?>");
        this.f95755b = view;
    }

    public final void h(int i10) {
        this.f95756c = i10;
    }

    public final void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48793, new Class[0], Void.TYPE).isSupported || this.f95759f || this.f95757d.isRunning()) {
            return;
        }
        this.f95757d.start();
        this.f95759f = true;
    }
}
