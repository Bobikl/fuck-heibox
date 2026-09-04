package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.j1;

/* JADX INFO: compiled from: AppCompatCheckedTextViewHelper.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CheckedTextView f2752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f2753b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f2754c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2755d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2756e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f2757f;

    d(@androidx.annotation.n0 CheckedTextView checkedTextView) {
        this.f2752a = checkedTextView;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f2752a);
        if (drawableA != null) {
            if (this.f2755d || this.f2756e) {
                Drawable drawableMutate = androidx.core.graphics.drawable.d.r(drawableA).mutate();
                if (this.f2755d) {
                    androidx.core.graphics.drawable.d.o(drawableMutate, this.f2753b);
                }
                if (this.f2756e) {
                    androidx.core.graphics.drawable.d.p(drawableMutate, this.f2754c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f2752a.getDrawableState());
                }
                this.f2752a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f2753b;
    }

    PorterDuff.Mode c() {
        return this.f2754c;
    }

    void d(@androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        boolean z10;
        int iU;
        int iU2;
        Context context = this.f2752a.getContext();
        int[] iArr = R.styleable.f1582o;
        x0 x0VarG = x0.G(context, attributeSet, iArr, i10, 0);
        CheckedTextView checkedTextView = this.f2752a;
        j1.z1(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, x0VarG.B(), i10, 0);
        try {
            int i11 = R.styleable.CheckedTextView_checkMarkCompat;
            if (!x0VarG.C(i11) || (iU2 = x0VarG.u(i11, 0)) == 0) {
                z10 = false;
            } else {
                try {
                    CheckedTextView checkedTextView2 = this.f2752a;
                    checkedTextView2.setCheckMarkDrawable(b0.a.b(checkedTextView2.getContext(), iU2));
                    z10 = true;
                } catch (Resources.NotFoundException unused) {
                    z10 = false;
                }
            }
            if (!z10) {
                int i12 = R.styleable.CheckedTextView_android_checkMark;
                if (x0VarG.C(i12) && (iU = x0VarG.u(i12, 0)) != 0) {
                    CheckedTextView checkedTextView3 = this.f2752a;
                    checkedTextView3.setCheckMarkDrawable(b0.a.b(checkedTextView3.getContext(), iU));
                }
            }
            int i13 = R.styleable.CheckedTextView_checkMarkTint;
            if (x0VarG.C(i13)) {
                androidx.core.widget.c.d(this.f2752a, x0VarG.d(i13));
            }
            int i14 = R.styleable.CheckedTextView_checkMarkTintMode;
            if (x0VarG.C(i14)) {
                androidx.core.widget.c.e(this.f2752a, b0.e(x0VarG.o(i14, -1), null));
            }
        } finally {
            x0VarG.I();
        }
    }

    void e() {
        if (this.f2757f) {
            this.f2757f = false;
        } else {
            this.f2757f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f2753b = colorStateList;
        this.f2755d = true;
        a();
    }

    void g(@androidx.annotation.p0 PorterDuff.Mode mode) {
        this.f2754c = mode;
        this.f2756e = true;
        a();
    }
}
