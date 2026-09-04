package androidx.compose.ui.graphics;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import com.umeng.analytics.pro.ak;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: compiled from: CanvasUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/g0;", "", "Landroid/graphics/Canvas;", "canvas", "", "enable", "Lkotlin/b2;", ak.av, "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "reorderBarrierMethod", ak.aF, "inorderBarrierMethod", "d", "Z", "orderMethodsFetched", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final g0 f13850a = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private static Method reorderBarrierMethod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private static Method inorderBarrierMethod;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static boolean orderMethodsFetched;

    private g0() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public final void a(@dl.d Canvas canvas, boolean z10) {
        Method method;
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            j0.f13873a.a(canvas, z10);
            return;
        }
        if (!orderMethodsFetched) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    reorderBarrierMethod = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    inorderBarrierMethod = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    reorderBarrierMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    inorderBarrierMethod = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = reorderBarrierMethod;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = inorderBarrierMethod;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            orderMethodsFetched = true;
        }
        if (z10) {
            try {
                Method method4 = reorderBarrierMethod;
                if (method4 != null) {
                    kotlin.jvm.internal.f0.m(method4);
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z10 || (method = inorderBarrierMethod) == null) {
            return;
        }
        kotlin.jvm.internal.f0.m(method);
        method.invoke(canvas, new Object[0]);
    }
}
