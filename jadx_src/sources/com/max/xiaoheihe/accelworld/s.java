package com.max.xiaoheihe.accelworld;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: AccelWorldView.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class s {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: AccelWorldView.kt */
    public static final class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f76774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f76775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f76776d;

        a(View view, int i10, View view2) {
            this.f76774b = view;
            this.f76775c = i10;
            this.f76776d = view2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Sy, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Rect rect = new Rect();
            this.f76774b.getHitRect(rect);
            int i10 = rect.left;
            int i11 = this.f76775c;
            rect.left = i10 - i11;
            rect.top -= i11;
            rect.right += i11;
            rect.bottom += i11;
            this.f76776d.setTouchDelegate(new TouchDelegate(rect, this.f76774b));
        }
    }

    /* JADX INFO: compiled from: AccelWorldView.kt */
    @t0({"SMAP\nAccelWorldView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccelWorldView.kt\ncom/max/xiaoheihe/accelworld/AccelWorldViewKt$hideWithAlphaAnimator$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,66:1\n262#2,2:67\n*S KotlinDebug\n*F\n+ 1 AccelWorldView.kt\ncom/max/xiaoheihe/accelworld/AccelWorldViewKt$hideWithAlphaAnimator$1$1\n*L\n21#1:67,2\n*E\n"})
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WeakReference<View> f76777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ValueAnimator f76778c;

        b(WeakReference<View> weakReference, ValueAnimator valueAnimator) {
            this.f76777b = weakReference;
            this.f76778c = valueAnimator;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, bb.c.m.Ty, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            View view = this.f76777b.get();
            if (view != null) {
                Object animatedValue = this.f76778c.getAnimatedValue();
                f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                view.setAlpha(((Float) animatedValue).floatValue());
                if (view.getAlpha() <= 0.05f) {
                    view.setVisibility(8);
                }
            }
        }
    }

    /* JADX INFO: compiled from: AccelWorldView.kt */
    public static final class c implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WeakReference<View> f76779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ValueAnimator f76780c;

        c(WeakReference<View> weakReference, ValueAnimator valueAnimator) {
            this.f76779b = weakReference;
            this.f76780c = valueAnimator;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, bb.c.m.Uy, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            View view = this.f76779b.get();
            if (view != null) {
                Object animatedValue = this.f76780c.getAnimatedValue();
                f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue = ((Float) animatedValue).floatValue();
                Context context = view.getContext();
                f0.o(context, "context");
                view.setTranslationY(com.max.accelworld.c.a(fFloatValue, context));
            }
        }
    }

    public static final void a(@dl.e View view, float f10) {
        if (PatchProxy.proxy(new Object[]{view, new Float(f10)}, null, changeQuickRedirect, true, bb.c.m.Ry, new Class[]{View.class, Float.TYPE}, Void.TYPE).isSupported || view == null) {
            return;
        }
        int iU = fi.u.u(ViewUtils.f(view.getContext(), f10), 0);
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.post(new a(view, iU, view2));
        }
    }

    public static final void b(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.m.Py, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<this>");
        WeakReference weakReference = new WeakReference(view);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(view.getAlpha(), 0.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new b(weakReference, valueAnimatorOfFloat));
        valueAnimatorOfFloat.start();
    }

    public static final void c(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.m.Qy, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<this>");
        WeakReference weakReference = new WeakReference(view);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -8.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(1800L);
        valueAnimatorOfFloat.addUpdateListener(new c(weakReference, valueAnimatorOfFloat));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.start();
    }
}
