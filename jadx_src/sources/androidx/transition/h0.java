package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ViewGroupUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f27868a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f27869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f27870c;

    private h0() {
    }

    static int a(@androidx.annotation.n0 ViewGroup viewGroup, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i10);
        }
        if (!f27870c) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                f27869b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f27870c = true;
        }
        Method method = f27869b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i10))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i10;
    }

    static e0 b(@androidx.annotation.n0 ViewGroup viewGroup) {
        return new d0(viewGroup);
    }

    @androidx.annotation.w0(18)
    @SuppressLint({"NewApi"})
    private static void c(@androidx.annotation.n0 ViewGroup viewGroup, boolean z10) {
        if (f27868a) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f27868a = false;
            }
        }
    }

    static void d(@androidx.annotation.n0 ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z10);
        } else {
            c(viewGroup, z10);
        }
    }
}
