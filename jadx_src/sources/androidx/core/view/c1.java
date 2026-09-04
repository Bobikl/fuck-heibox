package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: OneShotPreDrawListener.java */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f21475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewTreeObserver f21476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f21477d;

    private c1(View view, Runnable runnable) {
        this.f21475b = view;
        this.f21476c = view.getViewTreeObserver();
        this.f21477d = runnable;
    }

    @androidx.annotation.n0
    public static c1 a(@androidx.annotation.n0 View view, @androidx.annotation.n0 Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        c1 c1Var = new c1(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(c1Var);
        view.addOnAttachStateChangeListener(c1Var);
        return c1Var;
    }

    public void b() {
        if (this.f21476c.isAlive()) {
            this.f21476c.removeOnPreDrawListener(this);
        } else {
            this.f21475b.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f21475b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f21477d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@androidx.annotation.n0 View view) {
        this.f21476c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@androidx.annotation.n0 View view) {
        b();
    }
}
