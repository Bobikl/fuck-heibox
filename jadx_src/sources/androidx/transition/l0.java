package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.j1;

/* JADX INFO: compiled from: ViewUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final x0 f27883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f27884b = "ViewUtils";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Property<View, Float> f27885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Property<View, Rect> f27886d;

    /* JADX INFO: compiled from: ViewUtils.java */
    public class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(l0.c(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            l0.h(view, f10.floatValue());
        }
    }

    /* JADX INFO: compiled from: ViewUtils.java */
    public class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return j1.P(view);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            j1.M1(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f27883a = new w0();
        } else {
            f27883a = new v0();
        }
        f27885c = new a(Float.class, "translationAlpha");
        f27886d = new b(Rect.class, "clipBounds");
    }

    private l0() {
    }

    static void a(@androidx.annotation.n0 View view) {
        f27883a.a(view);
    }

    static k0 b(@androidx.annotation.n0 View view) {
        return new j0(view);
    }

    static float c(@androidx.annotation.n0 View view) {
        return f27883a.c(view);
    }

    static b1 d(@androidx.annotation.n0 View view) {
        return new a1(view);
    }

    static void e(@androidx.annotation.n0 View view) {
        f27883a.d(view);
    }

    static void f(@androidx.annotation.n0 View view, @androidx.annotation.p0 Matrix matrix) {
        f27883a.e(view, matrix);
    }

    static void g(@androidx.annotation.n0 View view, int i10, int i11, int i12, int i13) {
        f27883a.f(view, i10, i11, i12, i13);
    }

    static void h(@androidx.annotation.n0 View view, float f10) {
        f27883a.g(view, f10);
    }

    static void i(@androidx.annotation.n0 View view, int i10) {
        f27883a.h(view, i10);
    }

    static void j(@androidx.annotation.n0 View view, @androidx.annotation.n0 Matrix matrix) {
        f27883a.i(view, matrix);
    }

    static void k(@androidx.annotation.n0 View view, @androidx.annotation.n0 Matrix matrix) {
        f27883a.j(view, matrix);
    }
}
