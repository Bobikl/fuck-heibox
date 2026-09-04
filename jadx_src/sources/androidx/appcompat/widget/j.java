package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.j1;

/* JADX INFO: compiled from: AppCompatImageHelper.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ImageView f2820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v0 f2821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private v0 f2822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v0 f2823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2824e = 0;

    public j(@androidx.annotation.n0 ImageView imageView) {
        this.f2820a = imageView;
    }

    private boolean a(@androidx.annotation.n0 Drawable drawable) {
        if (this.f2823d == null) {
            this.f2823d = new v0();
        }
        v0 v0Var = this.f2823d;
        v0Var.a();
        ColorStateList colorStateListA = androidx.core.widget.j.a(this.f2820a);
        if (colorStateListA != null) {
            v0Var.f2943d = true;
            v0Var.f2940a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.j.b(this.f2820a);
        if (modeB != null) {
            v0Var.f2942c = true;
            v0Var.f2941b = modeB;
        }
        if (!v0Var.f2943d && !v0Var.f2942c) {
            return false;
        }
        f.j(drawable, v0Var, this.f2820a.getDrawableState());
        return true;
    }

    private boolean m() {
        return this.f2821b != null;
    }

    void b() {
        if (this.f2820a.getDrawable() != null) {
            this.f2820a.getDrawable().setLevel(this.f2824e);
        }
    }

    void c() {
        Drawable drawable = this.f2820a.getDrawable();
        if (drawable != null) {
            b0.b(drawable);
        }
        if (drawable != null) {
            if (m() && a(drawable)) {
                return;
            }
            v0 v0Var = this.f2822c;
            if (v0Var != null) {
                f.j(drawable, v0Var, this.f2820a.getDrawableState());
                return;
            }
            v0 v0Var2 = this.f2821b;
            if (v0Var2 != null) {
                f.j(drawable, v0Var2, this.f2820a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        v0 v0Var = this.f2822c;
        if (v0Var != null) {
            return v0Var.f2940a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        v0 v0Var = this.f2822c;
        if (v0Var != null) {
            return v0Var.f2941b;
        }
        return null;
    }

    boolean f() {
        return !(this.f2820a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int iU;
        Context context = this.f2820a.getContext();
        int[] iArr = R.styleable.f1576i;
        x0 x0VarG = x0.G(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f2820a;
        j1.z1(imageView, imageView.getContext(), iArr, attributeSet, x0VarG.B(), i10, 0);
        try {
            Drawable drawable = this.f2820a.getDrawable();
            if (drawable == null && (iU = x0VarG.u(R.styleable.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = b0.a.b(this.f2820a.getContext(), iU)) != null) {
                this.f2820a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                b0.b(drawable);
            }
            int i11 = R.styleable.AppCompatImageView_tint;
            if (x0VarG.C(i11)) {
                androidx.core.widget.j.c(this.f2820a, x0VarG.d(i11));
            }
            int i12 = R.styleable.AppCompatImageView_tintMode;
            if (x0VarG.C(i12)) {
                androidx.core.widget.j.d(this.f2820a, b0.e(x0VarG.o(i12, -1), null));
            }
        } finally {
            x0VarG.I();
        }
    }

    void h(@androidx.annotation.n0 Drawable drawable) {
        this.f2824e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable drawableB = b0.a.b(this.f2820a.getContext(), i10);
            if (drawableB != null) {
                b0.b(drawableB);
            }
            this.f2820a.setImageDrawable(drawableB);
        } else {
            this.f2820a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2821b == null) {
                this.f2821b = new v0();
            }
            v0 v0Var = this.f2821b;
            v0Var.f2940a = colorStateList;
            v0Var.f2943d = true;
        } else {
            this.f2821b = null;
        }
        c();
    }

    void k(ColorStateList colorStateList) {
        if (this.f2822c == null) {
            this.f2822c = new v0();
        }
        v0 v0Var = this.f2822c;
        v0Var.f2940a = colorStateList;
        v0Var.f2943d = true;
        c();
    }

    void l(PorterDuff.Mode mode) {
        if (this.f2822c == null) {
            this.f2822c = new v0();
        }
        v0 v0Var = this.f2822c;
        v0Var.f2941b = mode;
        v0Var.f2942c = true;
        c();
    }
}
