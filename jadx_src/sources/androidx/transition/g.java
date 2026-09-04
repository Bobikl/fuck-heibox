package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: GhostViewPlatform.java */
/* JADX INFO: loaded from: classes6.dex */
@androidx.annotation.w0(21)
public class g implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f27860c = "GhostViewApi21";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Class<?> f27861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f27862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Method f27863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f27864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Method f27865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f27866i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f27867b;

    private g(@androidx.annotation.n0 View view) {
        this.f27867b = view;
    }

    static f b(View view, ViewGroup viewGroup, Matrix matrix) {
        c();
        Method method = f27863f;
        if (method != null) {
            try {
                return new g((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
        return null;
    }

    private static void c() {
        if (f27864g) {
            return;
        }
        try {
            d();
            Method declaredMethod = f27861d.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
            f27863f = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e10) {
            Log.i(f27860c, "Failed to retrieve addGhost method", e10);
        }
        f27864g = true;
    }

    private static void d() {
        if (f27862e) {
            return;
        }
        try {
            f27861d = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException e10) {
            Log.i(f27860c, "Failed to retrieve GhostView class", e10);
        }
        f27862e = true;
    }

    private static void e() {
        if (f27866i) {
            return;
        }
        try {
            d();
            Method declaredMethod = f27861d.getDeclaredMethod("removeGhost", View.class);
            f27865h = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e10) {
            Log.i(f27860c, "Failed to retrieve removeGhost method", e10);
        }
        f27866i = true;
    }

    static void f(View view) {
        e();
        Method method = f27865h;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
    }

    @Override // androidx.transition.f
    public void a(ViewGroup viewGroup, View view) {
    }

    @Override // androidx.transition.f
    public void setVisibility(int i10) {
        this.f27867b.setVisibility(i10);
    }
}
