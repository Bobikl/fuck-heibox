package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ViewUtilsBase.java */
/* JADX INFO: loaded from: classes6.dex */
public class x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f27956b = "ViewUtilsBase";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f27957c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f27958d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Field f27959e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f27960f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f27961g = 12;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f27962a;

    x0() {
    }

    @SuppressLint({"PrivateApi", "SoonBlockedPrivateApi"})
    private void b() {
        if (f27958d) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            f27957c = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e10) {
            Log.i(f27956b, "Failed to retrieve setFrame method", e10);
        }
        f27958d = true;
    }

    public void a(@androidx.annotation.n0 View view) {
        if (view.getVisibility() == 0) {
            view.setTag(R.id.save_non_transition_alpha, null);
        }
    }

    public float c(@androidx.annotation.n0 View view) {
        Float f10 = (Float) view.getTag(R.id.save_non_transition_alpha);
        return f10 != null ? view.getAlpha() / f10.floatValue() : view.getAlpha();
    }

    public void d(@androidx.annotation.n0 View view) {
        int i10 = R.id.save_non_transition_alpha;
        if (view.getTag(i10) == null) {
            view.setTag(i10, Float.valueOf(view.getAlpha()));
        }
    }

    public void e(@androidx.annotation.n0 View view, @androidx.annotation.p0 Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX(view.getWidth() / 2);
            view.setPivotY(view.getHeight() / 2);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.f27962a;
        if (fArr == null) {
            fArr = new float[9];
            this.f27962a = fArr;
        }
        matrix.getValues(fArr);
        float f10 = fArr[3];
        float fSqrt = ((float) Math.sqrt(1.0f - (f10 * f10))) * (fArr[0] < 0.0f ? -1 : 1);
        float degrees = (float) Math.toDegrees(Math.atan2(f10, fSqrt));
        float f11 = fArr[0] / fSqrt;
        float f12 = fArr[4] / fSqrt;
        float f13 = fArr[2];
        float f14 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f13);
        view.setTranslationY(f14);
        view.setRotation(degrees);
        view.setScaleX(f11);
        view.setScaleY(f12);
    }

    public void f(@androidx.annotation.n0 View view, int i10, int i11, int i12, int i13) {
        b();
        Method method = f27957c;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
    }

    public void g(@androidx.annotation.n0 View view, float f10) {
        Float f11 = (Float) view.getTag(R.id.save_non_transition_alpha);
        if (f11 != null) {
            view.setAlpha(f11.floatValue() * f10);
        } else {
            view.setAlpha(f10);
        }
    }

    public void h(@androidx.annotation.n0 View view, int i10) {
        if (!f27960f) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f27959e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i(f27956b, "fetchViewFlagsField: ");
            }
            f27960f = true;
        }
        Field field = f27959e;
        if (field != null) {
            try {
                f27959e.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void i(@androidx.annotation.n0 View view, @androidx.annotation.n0 Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            i(view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    public void j(@androidx.annotation.n0 View view, @androidx.annotation.n0 Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            j(view2, matrix);
            matrix.postTranslate(view2.getScrollX(), view2.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }
}
