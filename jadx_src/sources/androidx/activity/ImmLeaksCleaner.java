package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.k0;
import androidx.annotation.n0;
import androidx.annotation.w0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
@w0(19)
public final class ImmLeaksCleaner implements v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f1370c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f1371d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f1372e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f1373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Field f1374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Field f1375h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Field f1376i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Activity f1377b;

    ImmLeaksCleaner(Activity activity) {
        this.f1377b = activity;
    }

    @k0
    @SuppressLint({"SoonBlockedPrivateApi"})
    private static void b() {
        try {
            f1373f = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f1375h = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f1376i = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f1374g = declaredField3;
            declaredField3.setAccessible(true);
            f1373f = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.v
    public void d(@n0 y yVar, @n0 Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        if (f1373f == 0) {
            b();
        }
        if (f1373f == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f1377b.getSystemService("input_method");
            try {
                Object obj = f1374g.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f1375h.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f1376i.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } catch (ClassCastException unused2) {
                    } catch (IllegalAccessException unused3) {
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
