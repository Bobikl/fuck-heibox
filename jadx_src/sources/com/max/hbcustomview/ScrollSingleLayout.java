package com.max.hbcustomview;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes10.dex */
public class ScrollSingleLayout extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f68799k = "ScrollSingleLayout";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f68800l = 500;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f68801m = 3000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f68802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f68803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f68804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f68805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f68806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f68807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ValueAnimator f68808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f68809i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Timer f68810j;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.f32645wa, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            for (int i10 = 0; i10 < ScrollSingleLayout.this.getChildCount(); i10++) {
                ScrollSingleLayout.this.getChildAt(i10).setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * ScrollSingleLayout.this.getHeight());
            }
        }
    }

    public class b implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.f32711za, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            ScrollSingleLayout.this.f68805e = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.f32689ya, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            ScrollSingleLayout.this.f68805e = false;
            ScrollSingleLayout.b(ScrollSingleLayout.this);
            ScrollSingleLayout.c(ScrollSingleLayout.this);
            ScrollSingleLayout.this.d();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.f32667xa, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            ScrollSingleLayout.this.f68805e = true;
        }
    }

    public static abstract class c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ScrollSingleLayout f68813a;

        public abstract int a();

        public void b() {
            ScrollSingleLayout scrollSingleLayout;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Aa, new Class[0], Void.TYPE).isSupported || (scrollSingleLayout = this.f68813a) == null) {
                return;
            }
            ScrollSingleLayout.c(scrollSingleLayout);
        }

        public abstract void c(View view, int i10);

        public abstract View d(Context context);

        public void e(ScrollSingleLayout scrollSingleLayout) {
            this.f68813a = scrollSingleLayout;
        }
    }

    public static class d implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<ScrollSingleLayout> f68814b;

        private d(ScrollSingleLayout scrollSingleLayout) {
            this.f68814b = new WeakReference<>(scrollSingleLayout);
        }

        /* synthetic */ d(ScrollSingleLayout scrollSingleLayout, a aVar) {
            this(scrollSingleLayout);
        }

        @Override // java.lang.Runnable
        public void run() {
            ScrollSingleLayout scrollSingleLayout;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Ba, new Class[0], Void.TYPE).isSupported || (scrollSingleLayout = this.f68814b.get()) == null) {
                return;
            }
            scrollSingleLayout.h();
        }
    }

    public static class e extends TimerTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<Handler> f68815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Runnable f68816c;

        private e(Handler handler, Runnable runnable) {
            this.f68815b = new WeakReference<>(handler);
            this.f68816c = runnable;
        }

        /* synthetic */ e(Handler handler, Runnable runnable, a aVar) {
            this(handler, runnable);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Handler handler;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Ca, new Class[0], Void.TYPE).isSupported || (handler = this.f68815b.get()) == null || handler.getLooper() == null || handler.getLooper() != Looper.getMainLooper()) {
                return;
            }
            handler.post(this.f68816c);
        }
    }

    public ScrollSingleLayout(Context context) {
        this(context, null);
    }

    public ScrollSingleLayout(Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrollSingleLayout(Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f68803c = 0;
        this.f68805e = false;
        this.f68806f = true;
        this.f68807g = false;
        g(context);
    }

    static /* synthetic */ int b(ScrollSingleLayout scrollSingleLayout) {
        int i10 = scrollSingleLayout.f68803c;
        scrollSingleLayout.f68803c = i10 + 1;
        return i10;
    }

    static /* synthetic */ void c(ScrollSingleLayout scrollSingleLayout) {
        if (PatchProxy.proxy(new Object[]{scrollSingleLayout}, null, changeQuickRedirect, true, bb.c.f.f32623va, new Class[]{ScrollSingleLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        scrollSingleLayout.e();
    }

    private void e() {
        c cVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32398la, new Class[0], Void.TYPE).isSupported || (cVar = this.f68802b) == null) {
            return;
        }
        int i10 = this.f68803c;
        if (i10 >= 0 && i10 < cVar.a() && getChildCount() >= 0) {
            this.f68802b.c(getChildAt(0), this.f68803c);
        }
        int i11 = this.f68803c + 1;
        if (i11 < 0 || i11 >= this.f68802b.a() || getChildCount() < 1) {
            return;
        }
        this.f68802b.c(getChildAt(1), i11);
    }

    private boolean f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32421ma, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        c cVar = this.f68802b;
        return cVar != null && cVar.a() >= 2 && this.f68803c < this.f68802b.a() - 1 && !this.f68805e;
    }

    private void g(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.f.f32352ja, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        setOrientation(1);
        this.f68809i = new d(this, null);
        this.f68804d = new Handler(Looper.getMainLooper());
    }

    public void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32467oa, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            getChildAt(i10).setTranslationY(0.0f);
        }
    }

    public void h() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32444na, new Class[0], Void.TYPE).isSupported && f()) {
            if (this.f68808h == null) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f68808h = valueAnimatorOfFloat;
                valueAnimatorOfFloat.setDuration(500L);
                this.f68808h.addUpdateListener(new a());
                this.f68808h.addListener(new b());
            }
            this.f68808h.start();
        }
    }

    public void i() {
        c cVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32513qa, new Class[0], Void.TYPE).isSupported || this.f68807g || (cVar = this.f68802b) == null || cVar.a() <= 1) {
            return;
        }
        try {
            Timer timer = this.f68810j;
            a aVar = null;
            if (timer != null) {
                timer.cancel();
                this.f68810j = null;
            }
            Timer timer2 = new Timer();
            this.f68810j = timer2;
            timer2.schedule(new e(this.f68804d, this.f68809i, aVar), 3000L, 3000L);
            this.f68807g = true;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32535ra, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f68807g = false;
        Timer timer = this.f68810j;
        if (timer != null) {
            timer.cancel();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32557sa, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32579ta, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        j();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32375ka, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i11);
        if (this.f68802b == null) {
            return;
        }
        if (getChildCount() == 0) {
            removeAllViews();
            for (int i12 = 0; i12 < 2; i12++) {
                View viewD = this.f68802b.d(getContext());
                if (viewD == null) {
                    throw new NullPointerException("onCreateViewHolder() can not return null");
                }
                addView(viewD);
            }
        }
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i13).getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = size;
            getChildAt(i13).setLayoutParams(layoutParams);
        }
        if (this.f68806f) {
            e();
        }
        this.f68806f = false;
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.f32601ua, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.onVisibilityAggregated(z10);
        if (z10) {
            i();
        } else {
            j();
        }
    }

    public void setAdapter(c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.f.f32490pa, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f68802b = cVar;
        if (cVar != null) {
            cVar.e(this);
            i();
        }
    }
}
