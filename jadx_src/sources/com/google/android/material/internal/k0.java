package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.w0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: WindowUtils.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f54526a = "k0";

    /* JADX INFO: compiled from: WindowUtils.java */
    public static class a {
        private a() {
        }

        @n0
        static Rect a(@n0 WindowManager windowManager) {
            int i10;
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point pointB = b(defaultDisplay);
            Rect rect = new Rect();
            int i11 = pointB.x;
            if (i11 == 0 || (i10 = pointB.y) == 0) {
                defaultDisplay.getRectSize(rect);
            } else {
                rect.right = i11;
                rect.bottom = i10;
            }
            return rect;
        }

        private static Point b(Display display) {
            Point point = new Point();
            try {
                Method declaredMethod = Display.class.getDeclaredMethod("getRealSize", Point.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(display, point);
            } catch (IllegalAccessException e10) {
                Log.w(k0.f54526a, e10);
            } catch (NoSuchMethodException e11) {
                Log.w(k0.f54526a, e11);
            } catch (InvocationTargetException e12) {
                Log.w(k0.f54526a, e12);
            }
            return point;
        }
    }

    /* JADX INFO: compiled from: WindowUtils.java */
    @w0(api = 17)
    public static class b {
        private b() {
        }

        @n0
        static Rect a(@n0 WindowManager windowManager) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Rect rect = new Rect();
            rect.right = point.x;
            rect.bottom = point.y;
            return rect;
        }
    }

    /* JADX INFO: compiled from: WindowUtils.java */
    @w0(api = 30)
    public static class c {
        private c() {
        }

        @n0
        static Rect a(@n0 WindowManager windowManager) {
            return windowManager.getCurrentWindowMetrics().getBounds();
        }
    }

    private k0() {
    }

    @n0
    public static Rect b(@n0 Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        return Build.VERSION.SDK_INT >= 30 ? c.a(windowManager) : b.a(windowManager);
    }
}
