package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: TintTypedArray.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypedArray f2966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f2967c;

    /* JADX INFO: compiled from: TintTypedArray.java */
    @androidx.annotation.w0(21)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static int a(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @androidx.annotation.u
        static int b(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    private x0(Context context, TypedArray typedArray) {
        this.f2965a = context;
        this.f2966b = typedArray;
    }

    public static x0 E(Context context, int i10, int[] iArr) {
        return new x0(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static x0 F(Context context, AttributeSet attributeSet, int[] iArr) {
        return new x0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static x0 G(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new x0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean A(int i10, TypedValue typedValue) {
        return this.f2966b.getValue(i10, typedValue);
    }

    public TypedArray B() {
        return this.f2966b;
    }

    public boolean C(int i10) {
        return this.f2966b.hasValue(i10);
    }

    public int D() {
        return this.f2966b.length();
    }

    public TypedValue H(int i10) {
        return this.f2966b.peekValue(i10);
    }

    public void I() {
        this.f2966b.recycle();
    }

    public boolean a(int i10, boolean z10) {
        return this.f2966b.getBoolean(i10, z10);
    }

    @androidx.annotation.w0(21)
    public int b() {
        return a.a(this.f2966b);
    }

    public int c(int i10, int i11) {
        return this.f2966b.getColor(i10, i11);
    }

    public ColorStateList d(int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f2966b.hasValue(i10) || (resourceId = this.f2966b.getResourceId(i10, 0)) == 0 || (colorStateListA = b0.a.a(this.f2965a, resourceId)) == null) ? this.f2966b.getColorStateList(i10) : colorStateListA;
    }

    public float e(int i10, float f10) {
        return this.f2966b.getDimension(i10, f10);
    }

    public int f(int i10, int i11) {
        return this.f2966b.getDimensionPixelOffset(i10, i11);
    }

    public int g(int i10, int i11) {
        return this.f2966b.getDimensionPixelSize(i10, i11);
    }

    public Drawable h(int i10) {
        int resourceId;
        return (!this.f2966b.hasValue(i10) || (resourceId = this.f2966b.getResourceId(i10, 0)) == 0) ? this.f2966b.getDrawable(i10) : b0.a.b(this.f2965a, resourceId);
    }

    public Drawable i(int i10) {
        int resourceId;
        if (!this.f2966b.hasValue(i10) || (resourceId = this.f2966b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return f.b().d(this.f2965a, resourceId, true);
    }

    public float j(int i10, float f10) {
        return this.f2966b.getFloat(i10, f10);
    }

    @androidx.annotation.p0
    public Typeface k(@androidx.annotation.f1 int i10, int i11, @androidx.annotation.p0 androidx.core.content.res.i.g gVar) {
        int resourceId = this.f2966b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f2967c == null) {
            this.f2967c = new TypedValue();
        }
        return androidx.core.content.res.i.k(this.f2965a, resourceId, this.f2967c, i11, gVar);
    }

    public float l(int i10, int i11, int i12, float f10) {
        return this.f2966b.getFraction(i10, i11, i12, f10);
    }

    public int m(int i10) {
        return this.f2966b.getIndex(i10);
    }

    public int n() {
        return this.f2966b.getIndexCount();
    }

    public int o(int i10, int i11) {
        return this.f2966b.getInt(i10, i11);
    }

    public int p(int i10, int i11) {
        return this.f2966b.getInteger(i10, i11);
    }

    public int q(int i10, int i11) {
        return this.f2966b.getLayoutDimension(i10, i11);
    }

    public int r(int i10, String str) {
        return this.f2966b.getLayoutDimension(i10, str);
    }

    public String s(int i10) {
        return this.f2966b.getNonResourceString(i10);
    }

    public String t() {
        return this.f2966b.getPositionDescription();
    }

    public int u(int i10, int i11) {
        return this.f2966b.getResourceId(i10, i11);
    }

    public Resources v() {
        return this.f2966b.getResources();
    }

    public String w(int i10) {
        return this.f2966b.getString(i10);
    }

    public CharSequence x(int i10) {
        return this.f2966b.getText(i10);
    }

    public CharSequence[] y(int i10) {
        return this.f2966b.getTextArray(i10);
    }

    public int z(int i10) {
        return a.b(this.f2966b, i10);
    }
}
