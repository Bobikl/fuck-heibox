package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R;
import androidx.core.view.j1;

/* JADX INFO: compiled from: AppCompatBackgroundHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final View f2745a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v0 f2748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private v0 f2749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private v0 f2750f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2747c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f2746b = f.b();

    c(@androidx.annotation.n0 View view) {
        this.f2745a = view;
    }

    private boolean a(@androidx.annotation.n0 Drawable drawable) {
        if (this.f2750f == null) {
            this.f2750f = new v0();
        }
        v0 v0Var = this.f2750f;
        v0Var.a();
        ColorStateList colorStateListN = j1.N(this.f2745a);
        if (colorStateListN != null) {
            v0Var.f2943d = true;
            v0Var.f2940a = colorStateListN;
        }
        PorterDuff.Mode modeO = j1.O(this.f2745a);
        if (modeO != null) {
            v0Var.f2942c = true;
            v0Var.f2941b = modeO;
        }
        if (!v0Var.f2943d && !v0Var.f2942c) {
            return false;
        }
        f.j(drawable, v0Var, this.f2745a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f2748d != null;
    }

    void b() {
        Drawable background = this.f2745a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            v0 v0Var = this.f2749e;
            if (v0Var != null) {
                f.j(background, v0Var, this.f2745a.getDrawableState());
                return;
            }
            v0 v0Var2 = this.f2748d;
            if (v0Var2 != null) {
                f.j(background, v0Var2, this.f2745a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        v0 v0Var = this.f2749e;
        if (v0Var != null) {
            return v0Var.f2940a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        v0 v0Var = this.f2749e;
        if (v0Var != null) {
            return v0Var.f2941b;
        }
        return null;
    }

    void e(@androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        Context context = this.f2745a.getContext();
        int[] iArr = R.styleable.G;
        x0 x0VarG = x0.G(context, attributeSet, iArr, i10, 0);
        View view = this.f2745a;
        j1.z1(view, view.getContext(), iArr, attributeSet, x0VarG.B(), i10, 0);
        try {
            int i11 = R.styleable.ViewBackgroundHelper_android_background;
            if (x0VarG.C(i11)) {
                this.f2747c = x0VarG.u(i11, -1);
                ColorStateList colorStateListF = this.f2746b.f(this.f2745a.getContext(), this.f2747c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            int i12 = R.styleable.ViewBackgroundHelper_backgroundTint;
            if (x0VarG.C(i12)) {
                j1.J1(this.f2745a, x0VarG.d(i12));
            }
            int i13 = R.styleable.ViewBackgroundHelper_backgroundTintMode;
            if (x0VarG.C(i13)) {
                j1.K1(this.f2745a, b0.e(x0VarG.o(i13, -1), null));
            }
        } finally {
            x0VarG.I();
        }
    }

    void f(Drawable drawable) {
        this.f2747c = -1;
        h(null);
        b();
    }

    void g(int i10) {
        this.f2747c = i10;
        f fVar = this.f2746b;
        h(fVar != null ? fVar.f(this.f2745a.getContext(), i10) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2748d == null) {
                this.f2748d = new v0();
            }
            v0 v0Var = this.f2748d;
            v0Var.f2940a = colorStateList;
            v0Var.f2943d = true;
        } else {
            this.f2748d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f2749e == null) {
            this.f2749e = new v0();
        }
        v0 v0Var = this.f2749e;
        v0Var.f2940a = colorStateList;
        v0Var.f2943d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f2749e == null) {
            this.f2749e = new v0();
        }
        v0 v0Var = this.f2749e;
        v0Var.f2941b = mode;
        v0Var.f2942c = true;
        b();
    }
}
