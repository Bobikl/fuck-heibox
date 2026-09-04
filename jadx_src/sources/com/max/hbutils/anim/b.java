package com.max.hbutils.anim;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: AnimationUtils.java */
/* JADX INFO: loaded from: classes13.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeInterpolator f73420a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TimeInterpolator f73421b = new androidx.interpolator.view.animation.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TimeInterpolator f73422c = new androidx.interpolator.view.animation.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TimeInterpolator f73423d = new androidx.interpolator.view.animation.c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TimeInterpolator f73424e = new DecelerateInterpolator();

    /* JADX INFO: compiled from: AnimationUtils.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f73425b;

        a(View view) {
            this.f73425b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.k.Hm, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = this.f73425b;
            if (view != null) {
                view.setAlpha(fFloatValue);
            }
        }
    }

    /* JADX INFO: renamed from: com.max.hbutils.anim.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AnimationUtils.java */
    public class C0588b implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f73426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f73427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f73428d;

        C0588b(boolean z10, View view, c cVar) {
            this.f73426b = z10;
            this.f73427c = view;
            this.f73428d = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.k.Jm, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!this.f73426b) {
                this.f73427c.setVisibility(8);
            }
            c cVar = this.f73428d;
            if (cVar != null) {
                cVar.a();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.k.Im, new Class[]{Animator.class}, Void.TYPE).isSupported && this.f73426b) {
                this.f73427c.setVisibility(0);
            }
        }
    }

    /* JADX INFO: compiled from: AnimationUtils.java */
    public interface c {
        void a();
    }

    public static float a(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    public static int b(int i10, int i11, float f10) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Em, new Class[]{cls, cls, Float.TYPE}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : i10 + Math.round(f10 * (i11 - i10));
    }

    public static void c(View view, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.Fm, new Class[]{View.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        d(view, i10, z10, null);
    }

    public static void d(View view, int i10, boolean z10, c cVar) {
        ValueAnimator valueAnimatorOfFloat;
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, null, changeQuickRedirect, true, bb.c.k.Gm, new Class[]{View.class, Integer.TYPE, Boolean.TYPE, c.class}, Void.TYPE).isSupported || view == null) {
            return;
        }
        float[] fArr = {1.0f, 0.0f};
        if (z10) {
            // fill-array-data instruction
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        } else {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        }
        valueAnimatorOfFloat.setDuration(i10 > 0 ? i10 : 100L);
        valueAnimatorOfFloat.addUpdateListener(new a(view));
        valueAnimatorOfFloat.addListener(new C0588b(z10, view, cVar));
        valueAnimatorOfFloat.start();
    }
}
