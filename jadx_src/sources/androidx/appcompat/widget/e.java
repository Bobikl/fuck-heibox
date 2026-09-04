package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.appcompat.R;
import androidx.core.view.j1;

/* JADX INFO: compiled from: AppCompatCompoundButtonHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CompoundButton f2759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f2760b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f2761c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2762d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2763e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f2764f;

    e(@androidx.annotation.n0 CompoundButton compoundButton) {
        this.f2759a = compoundButton;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.d.a(this.f2759a);
        if (drawableA != null) {
            if (this.f2762d || this.f2763e) {
                Drawable drawableMutate = androidx.core.graphics.drawable.d.r(drawableA).mutate();
                if (this.f2762d) {
                    androidx.core.graphics.drawable.d.o(drawableMutate, this.f2760b);
                }
                if (this.f2763e) {
                    androidx.core.graphics.drawable.d.p(drawableMutate, this.f2761c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f2759a.getDrawableState());
                }
                this.f2759a.setButtonDrawable(drawableMutate);
            }
        }
    }

    int b(int i10) {
        return i10;
    }

    ColorStateList c() {
        return this.f2760b;
    }

    PorterDuff.Mode d() {
        return this.f2761c;
    }

    void e(@androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        boolean z10;
        int iU;
        int iU2;
        Context context = this.f2759a.getContext();
        int[] iArr = R.styleable.f1583p;
        x0 x0VarG = x0.G(context, attributeSet, iArr, i10, 0);
        CompoundButton compoundButton = this.f2759a;
        j1.z1(compoundButton, compoundButton.getContext(), iArr, attributeSet, x0VarG.B(), i10, 0);
        try {
            int i11 = R.styleable.CompoundButton_buttonCompat;
            if (!x0VarG.C(i11) || (iU2 = x0VarG.u(i11, 0)) == 0) {
                z10 = false;
            } else {
                try {
                    CompoundButton compoundButton2 = this.f2759a;
                    compoundButton2.setButtonDrawable(b0.a.b(compoundButton2.getContext(), iU2));
                    z10 = true;
                } catch (Resources.NotFoundException unused) {
                    z10 = false;
                }
            }
            if (!z10) {
                int i12 = R.styleable.CompoundButton_android_button;
                if (x0VarG.C(i12) && (iU = x0VarG.u(i12, 0)) != 0) {
                    CompoundButton compoundButton3 = this.f2759a;
                    compoundButton3.setButtonDrawable(b0.a.b(compoundButton3.getContext(), iU));
                }
            }
            int i13 = R.styleable.CompoundButton_buttonTint;
            if (x0VarG.C(i13)) {
                androidx.core.widget.d.d(this.f2759a, x0VarG.d(i13));
            }
            int i14 = R.styleable.CompoundButton_buttonTintMode;
            if (x0VarG.C(i14)) {
                androidx.core.widget.d.e(this.f2759a, b0.e(x0VarG.o(i14, -1), null));
            }
        } finally {
            x0VarG.I();
        }
    }

    void f() {
        if (this.f2764f) {
            this.f2764f = false;
        } else {
            this.f2764f = true;
            a();
        }
    }

    void g(ColorStateList colorStateList) {
        this.f2760b = colorStateList;
        this.f2762d = true;
        a();
    }

    void h(@androidx.annotation.p0 PorterDuff.Mode mode) {
        this.f2761c = mode;
        this.f2763e = true;
        a();
    }
}
