package androidx.appcompat.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.view.j1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ViewUtils.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f2818a = "ViewUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f2819b;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f2819b = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f2819b.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d(f2818a, "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    private h1() {
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = f2819b;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e10) {
                Log.d(f2818a, "Could not invoke computeFitSystemWindows", e10);
            }
        }
    }

    public static boolean b(View view) {
        return j1.Z(view) == 1;
    }

    public static void c(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException e10) {
            Log.d(f2818a, "Could not invoke makeOptionalFitsSystemWindows", e10);
        } catch (NoSuchMethodException unused) {
            Log.d(f2818a, "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e11) {
            Log.d(f2818a, "Could not invoke makeOptionalFitsSystemWindows", e11);
        }
    }
}
