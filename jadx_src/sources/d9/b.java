package d9;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.annotation.d1;
import androidx.annotation.e;
import androidx.annotation.e1;
import androidx.annotation.f;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.t0;
import androidx.annotation.v;
import androidx.appcompat.view.d;
import androidx.core.view.j1;
import com.google.android.material.R;
import com.google.android.material.color.m;
import com.google.android.material.shape.k;

/* JADX INFO: compiled from: MaterialAlertDialogBuilder.java */
/* JADX INFO: loaded from: classes7.dex */
public class b extends androidx.appcompat.app.c.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @f
    private static final int f108168e = R.attr.alertDialogStyle;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e1
    private static final int f108169f = R.style.MaterialAlertDialog_MaterialComponents;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @f
    private static final int f108170g = R.attr.materialAlertDialogTheme;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private Drawable f108171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    @r
    private final Rect f108172d;

    public b(@n0 Context context) {
        this(context, 0);
    }

    public b(@n0 Context context, int i10) {
        super(J(context), M(context, i10));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i11 = f108168e;
        int i12 = f108169f;
        this.f108172d = c.a(context2, i11, i12);
        int iC = m.c(context2, R.attr.colorSurface, getClass().getCanonicalName());
        k kVar = new k(context2, null, i11, i12);
        kVar.Z(context2);
        kVar.o0(ColorStateList.valueOf(iC));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                kVar.k0(dimension);
            }
        }
        this.f108171c = kVar;
    }

    private static Context J(@n0 Context context) {
        int iL = L(context);
        Context contextC = j9.a.c(context, null, f108168e, f108169f);
        return iL == 0 ? contextC : new d(contextC, iL);
    }

    private static int L(@n0 Context context) {
        TypedValue typedValueA = com.google.android.material.resources.b.a(context, f108170g);
        if (typedValueA == null) {
            return 0;
        }
        return typedValueA.data;
    }

    private static int M(@n0 Context context, int i10) {
        return i10 == 0 ? L(context) : i10;
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public b setView(@p0 View view) {
        return (b) super.setView(view);
    }

    @p0
    public Drawable K() {
        return this.f108171c;
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public b a(@p0 ListAdapter listAdapter, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.a(listAdapter, onClickListener);
    }

    @s9.a
    @n0
    public b O(@p0 Drawable drawable) {
        this.f108171c = drawable;
        return this;
    }

    @s9.a
    @n0
    public b P(@t0 int i10) {
        this.f108172d.bottom = i10;
        return this;
    }

    @s9.a
    @n0
    public b Q(@t0 int i10) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f108172d.left = i10;
        } else {
            this.f108172d.right = i10;
        }
        return this;
    }

    @s9.a
    @n0
    public b R(@t0 int i10) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f108172d.right = i10;
        } else {
            this.f108172d.left = i10;
        }
        return this;
    }

    @s9.a
    @n0
    public b S(@t0 int i10) {
        this.f108172d.top = i10;
        return this;
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public b b(boolean z10) {
        return (b) super.b(z10);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public b c(@p0 Cursor cursor, @p0 DialogInterface.OnClickListener onClickListener, @n0 String str) {
        return (b) super.c(cursor, onClickListener, str);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public b d(@p0 View view) {
        return (b) super.d(view);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public b e(@v int i10) {
        return (b) super.e(i10);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public b f(@p0 Drawable drawable) {
        return (b) super.f(drawable);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public b g(@f int i10) {
        return (b) super.g(i10);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public b i(@e int i10, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.i(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public b j(@p0 CharSequence[] charSequenceArr, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.j(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public b k(@d1 int i10) {
        return (b) super.k(i10);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public b l(@p0 CharSequence charSequence) {
        return (b) super.l(charSequence);
    }

    @Override // androidx.appcompat.app.c.a
    @n0
    public androidx.appcompat.app.c create() {
        androidx.appcompat.app.c cVarCreate = super.create();
        Window window = cVarCreate.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f108171c;
        if (drawable instanceof k) {
            ((k) drawable).n0(j1.R(decorView));
        }
        window.setBackgroundDrawable(c.b(this.f108171c, this.f108172d));
        decorView.setOnTouchListener(new a(cVarCreate, this.f108172d));
        return cVarCreate;
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public b m(@e int i10, @p0 boolean[] zArr, @p0 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.m(i10, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public b n(@p0 Cursor cursor, @n0 String str, @n0 String str2, @p0 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.n(cursor, str, str2, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public b o(@p0 CharSequence[] charSequenceArr, @p0 boolean[] zArr, @p0 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.o(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public b setNegativeButton(@d1 int i10, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.setNegativeButton(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public b p(@p0 CharSequence charSequence, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.p(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public b q(@p0 Drawable drawable) {
        return (b) super.q(drawable);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public b r(@d1 int i10, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.r(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public b s(@p0 CharSequence charSequence, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.s(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public b t(@p0 Drawable drawable) {
        return (b) super.t(drawable);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public b u(@p0 DialogInterface.OnCancelListener onCancelListener) {
        return (b) super.u(onCancelListener);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public b v(@p0 DialogInterface.OnDismissListener onDismissListener) {
        return (b) super.v(onDismissListener);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public b w(@p0 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (b) super.w(onItemSelectedListener);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public b x(@p0 DialogInterface.OnKeyListener onKeyListener) {
        return (b) super.x(onKeyListener);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public b setPositiveButton(@d1 int i10, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.setPositiveButton(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public b y(@p0 CharSequence charSequence, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.y(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public b z(@p0 Drawable drawable) {
        return (b) super.z(drawable);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public b B(@e int i10, int i11, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.B(i10, i11, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public b C(@p0 Cursor cursor, int i10, @n0 String str, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.C(cursor, i10, str, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public b D(@p0 ListAdapter listAdapter, int i10, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.D(listAdapter, i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public b E(@p0 CharSequence[] charSequenceArr, int i10, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.E(charSequenceArr, i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public b F(@d1 int i10) {
        return (b) super.F(i10);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public b setTitle(@p0 CharSequence charSequence) {
        return (b) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.c.a
    @s9.a
    @n0
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public b G(int i10) {
        return (b) super.G(i10);
    }
}
