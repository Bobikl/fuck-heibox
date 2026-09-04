package androidx.transition;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ViewGroupUtilsApi14.java */
/* JADX INFO: loaded from: classes6.dex */
public class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f27871a = "ViewGroupUtilsApi14";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f27872b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static LayoutTransition f27873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Field f27874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f27875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Method f27876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f27877g;

    /* JADX INFO: compiled from: ViewGroupUtilsApi14.java */
    public class a extends LayoutTransition {
        a() {
        }

        @Override // android.animation.LayoutTransition
        public boolean isChangingLayout() {
            return true;
        }
    }

    private i0() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    private static void a(LayoutTransition layoutTransition) {
        if (!f27877g) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f27876f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i(f27871a, "Failed to access cancel method by reflection");
            }
            f27877g = true;
        }
        Method method = f27876f;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i(f27871a, "Failed to access cancel method by reflection");
            } catch (InvocationTargetException unused3) {
                Log.i(f27871a, "Failed to invoke cancel method by reflection");
            }
        }
    }

    static void b(@androidx.annotation.n0 ViewGroup viewGroup, boolean z10) {
        boolean z11 = false;
        if (f27873c == null) {
            a aVar = new a();
            f27873c = aVar;
            aVar.setAnimator(2, null);
            f27873c.setAnimator(0, null);
            f27873c.setAnimator(1, null);
            f27873c.setAnimator(3, null);
            f27873c.setAnimator(4, null);
        }
        if (z10) {
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    a(layoutTransition);
                }
                if (layoutTransition != f27873c) {
                    viewGroup.setTag(R.id.transition_layout_save, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(f27873c);
            return;
        }
        viewGroup.setLayoutTransition(null);
        if (!f27875e) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                f27874d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i(f27871a, "Failed to access mLayoutSuppressed field by reflection");
            }
            f27875e = true;
        }
        Field field = f27874d;
        if (field != null) {
            try {
                boolean z12 = field.getBoolean(viewGroup);
                if (z12) {
                    try {
                        f27874d.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused2) {
                        z11 = z12;
                        Log.i(f27871a, "Failed to get mLayoutSuppressed field by reflection");
                    }
                }
                z11 = z12;
            } catch (IllegalAccessException unused3) {
            }
        }
        if (z11) {
            viewGroup.requestLayout();
        }
        int i10 = R.id.transition_layout_save;
        LayoutTransition layoutTransition2 = (LayoutTransition) viewGroup.getTag(i10);
        if (layoutTransition2 != null) {
            viewGroup.setTag(i10, null);
            viewGroup.setLayoutTransition(layoutTransition2);
        }
    }
}
