package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.annotation.d0;
import androidx.annotation.e1;
import androidx.annotation.i0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.g1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: compiled from: AppCompatDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final boolean f1785b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f1786c = "AppCompatDelegate";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f1787d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f1788e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f1789f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f1790g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f1791h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f1792i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f1793j = -100;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f1794k = -100;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final androidx.collection.c<WeakReference<e>> f1795l = new androidx.collection.c<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f1796m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f1797n = 108;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f1798o = 109;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f1799p = 10;

    /* JADX INFO: compiled from: AppCompatDelegate.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    e() {
    }

    static void G(@n0 e eVar) {
        synchronized (f1796m) {
            H(eVar);
        }
    }

    private static void H(@n0 e eVar) {
        synchronized (f1796m) {
            Iterator<WeakReference<e>> it = f1795l.iterator();
            while (it.hasNext()) {
                e eVar2 = it.next().get();
                if (eVar2 == eVar || eVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public static void J(boolean z10) {
        g1.c(z10);
    }

    public static void N(int i10) {
        if (i10 != -1 && i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            Log.d(f1786c, "setDefaultNightMode() called with an unknown mode");
        } else if (f1794k != i10) {
            f1794k = i10;
            f();
        }
    }

    static void c(@n0 e eVar) {
        synchronized (f1796m) {
            H(eVar);
            f1795l.add(new WeakReference<>(eVar));
        }
    }

    private static void f() {
        synchronized (f1796m) {
            Iterator<WeakReference<e>> it = f1795l.iterator();
            while (it.hasNext()) {
                e eVar = it.next().get();
                if (eVar != null) {
                    eVar.e();
                }
            }
        }
    }

    @n0
    public static e i(@n0 Activity activity, @p0 d dVar) {
        return new AppCompatDelegateImpl(activity, dVar);
    }

    @n0
    public static e j(@n0 Dialog dialog, @p0 d dVar) {
        return new AppCompatDelegateImpl(dialog, dVar);
    }

    @n0
    public static e k(@n0 Context context, @n0 Activity activity, @p0 d dVar) {
        return new AppCompatDelegateImpl(context, activity, dVar);
    }

    @n0
    public static e l(@n0 Context context, @n0 Window window, @p0 d dVar) {
        return new AppCompatDelegateImpl(context, window, dVar);
    }

    public static int o() {
        return f1794k;
    }

    public static boolean w() {
        return g1.b();
    }

    public abstract void A();

    public abstract void B(Bundle bundle);

    public abstract void C();

    public abstract void D(Bundle bundle);

    public abstract void E();

    public abstract void F();

    public abstract boolean I(int i10);

    public abstract void K(@i0 int i10);

    public abstract void L(View view);

    public abstract void M(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void O(boolean z10);

    @w0(17)
    public abstract void P(int i10);

    public abstract void Q(@p0 Toolbar toolbar);

    public void R(@e1 int i10) {
    }

    public abstract void S(@p0 CharSequence charSequence);

    @p0
    public abstract androidx.appcompat.view.b T(@n0 androidx.appcompat.view.b.a aVar);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean e();

    @Deprecated
    public void g(Context context) {
    }

    @androidx.annotation.i
    @n0
    public Context h(@n0 Context context) {
        g(context);
        return context;
    }

    public abstract View m(@p0 View view, String str, @n0 Context context, @n0 AttributeSet attributeSet);

    @p0
    public abstract <T extends View> T n(@d0 int i10);

    @p0
    public abstract androidx.appcompat.app.a.b p();

    public int q() {
        return -100;
    }

    public abstract MenuInflater r();

    @p0
    public abstract ActionBar s();

    public abstract boolean t(int i10);

    public abstract void u();

    public abstract void v();

    public abstract boolean x();

    public abstract void y(Configuration configuration);

    public abstract void z(Bundle bundle);
}
