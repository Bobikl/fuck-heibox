package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: CanvasUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f27827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f27828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f27829c;

    private b() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    static void a(@androidx.annotation.n0 Canvas canvas, boolean z10) {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            if (z10) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (i10 == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!f27829c) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f27827a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                f27828b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f27829c = true;
        }
        if (z10) {
            try {
                Method method2 = f27827a;
                if (method2 != null) {
                    method2.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
        if (z10 || (method = f27828b) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }
}
