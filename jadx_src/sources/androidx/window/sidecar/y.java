package androidx.window.sidecar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.annotation.j1;
import androidx.annotation.w0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.analytics.pro.d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WindowMetricsCalculatorCompat.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0003J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/window/layout/y;", "Landroidx/window/layout/WindowMetricsCalculator;", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "Landroid/graphics/Rect;", "bounds", "Lkotlin/b2;", "j", "Landroid/content/Context;", d.R, "", RXScreenCaptureService.KEY_HEIGHT, "Landroid/view/Display;", "display", "Landroid/view/DisplayCutout;", "g", "Landroidx/window/layout/w;", ak.av, "b", "f", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "e", "d", ak.aF, "Landroid/graphics/Point;", "i", "(Landroid/view/Display;)Landroid/graphics/Point;", "", "Ljava/lang/String;", "TAG", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class y implements WindowMetricsCalculator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final y f28677b = new y();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final String TAG;

    static {
        String simpleName = y.class.getSimpleName();
        f0.o(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        TAG = simpleName;
    }

    private y() {
    }

    @w0(28)
    @SuppressLint({"BanUncheckedReflection"})
    private final DisplayCutout g(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
        } catch (ClassNotFoundException e10) {
            Log.w(TAG, e10);
        } catch (IllegalAccessException e11) {
            Log.w(TAG, e11);
        } catch (InstantiationException e12) {
            Log.w(TAG, e12);
        } catch (NoSuchFieldException e13) {
            Log.w(TAG, e13);
        } catch (NoSuchMethodException e14) {
            Log.w(TAG, e14);
        } catch (InvocationTargetException e15) {
            Log.w(TAG, e15);
        }
        return null;
    }

    private final int h(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final void j(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    @Override // androidx.window.sidecar.WindowMetricsCalculator
    @dl.d
    public w a(@dl.d Activity activity) {
        Rect rectD;
        f0.p(activity, "activity");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            rectD = e.f28622a.a(activity);
        } else if (i10 >= 29) {
            rectD = f(activity);
        } else if (i10 >= 28) {
            rectD = e(activity);
        } else {
            rectD = i10 >= 24 ? d(activity) : c(activity);
        }
        return new w(rectD);
    }

    @Override // androidx.window.sidecar.WindowMetricsCalculator
    @dl.d
    public w b(@dl.d Activity activity) {
        Rect rect;
        f0.p(activity, "activity");
        if (Build.VERSION.SDK_INT >= 30) {
            rect = e.f28622a.b(activity);
        } else {
            Display display = activity.getWindowManager().getDefaultDisplay();
            f0.o(display, "display");
            Point pointI = i(display);
            rect = new Rect(0, 0, pointI.x, pointI.y);
        }
        return new w(rect);
    }

    @dl.d
    @w0(14)
    public final Rect c(@dl.d Activity activity) {
        int i10;
        f0.p(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        f0.o(defaultDisplay, "defaultDisplay");
        Point pointI = i(defaultDisplay);
        Rect rect = new Rect();
        int i11 = pointI.x;
        if (i11 == 0 || (i10 = pointI.y) == 0) {
            defaultDisplay.getRectSize(rect);
        } else {
            rect.right = i11;
            rect.bottom = i10;
        }
        return rect;
    }

    @dl.d
    @w0(24)
    public final Rect d(@dl.d Activity activity) {
        f0.p(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!b.f28621a.a(activity)) {
            f0.o(defaultDisplay, "defaultDisplay");
            Point pointI = i(defaultDisplay);
            int iH = h(activity);
            int i10 = rect.bottom;
            if (i10 + iH == pointI.y) {
                rect.bottom = i10 + iH;
            } else {
                int i11 = rect.right;
                if (i11 + iH == pointI.x) {
                    rect.right = i11 + iH;
                }
            }
        }
        return rect;
    }

    @dl.d
    @w0(28)
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect e(@dl.d Activity activity) {
        DisplayCutout displayCutoutG;
        f0.p(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (b.f28621a.a(activity)) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException e10) {
            Log.w(TAG, e10);
            j(activity, rect);
        } catch (NoSuchFieldException e11) {
            Log.w(TAG, e11);
            j(activity, rect);
        } catch (NoSuchMethodException e12) {
            Log.w(TAG, e12);
            j(activity, rect);
        } catch (InvocationTargetException e13) {
            Log.w(TAG, e13);
            j(activity, rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        f fVar = f.f28623a;
        f0.o(currentDisplay, "currentDisplay");
        fVar.a(currentDisplay, point);
        b bVar = b.f28621a;
        if (!bVar.a(activity)) {
            int iH = h(activity);
            int i10 = rect.bottom;
            if (i10 + iH == point.y) {
                rect.bottom = i10 + iH;
            } else {
                int i11 = rect.right;
                if (i11 + iH == point.x) {
                    rect.right = i11 + iH;
                } else if (rect.left == iH) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !bVar.a(activity) && (displayCutoutG = g(currentDisplay)) != null) {
            int i12 = rect.left;
            g gVar = g.f28624a;
            if (i12 == gVar.b(displayCutoutG)) {
                rect.left = 0;
            }
            if (point.x - rect.right == gVar.c(displayCutoutG)) {
                rect.right += gVar.c(displayCutoutG);
            }
            if (rect.top == gVar.d(displayCutoutG)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == gVar.a(displayCutoutG)) {
                rect.bottom += gVar.a(displayCutoutG);
            }
        }
        return rect;
    }

    @dl.d
    @w0(29)
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect f(@dl.d Activity activity) {
        f0.p(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            if (objInvoke != null) {
                return new Rect((Rect) objInvoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException e10) {
            Log.w(TAG, e10);
            return e(activity);
        } catch (NoSuchFieldException e11) {
            Log.w(TAG, e11);
            return e(activity);
        } catch (NoSuchMethodException e12) {
            Log.w(TAG, e12);
            return e(activity);
        } catch (InvocationTargetException e13) {
            Log.w(TAG, e13);
            return e(activity);
        }
    }

    @j1
    @dl.d
    @w0(14)
    public final Point i(@dl.d Display display) {
        f0.p(display, "display");
        Point point = new Point();
        f.f28623a.a(display, point);
        return point;
    }
}
