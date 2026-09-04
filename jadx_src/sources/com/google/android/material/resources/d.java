package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.e1;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.y;
import androidx.core.content.res.i;
import com.google.android.material.R;

/* JADX INFO: compiled from: TextAppearance.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f54845r = "TextAppearance";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f54846s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f54847t = 2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f54848u = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    public final ColorStateList f54849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final ColorStateList f54850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final ColorStateList f54851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final String f54852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f54853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f54854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f54855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f54856h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f54857i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f54858j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f54859k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f54860l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private ColorStateList f54861m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f54862n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @y
    private final int f54863o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f54864p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Typeface f54865q;

    /* JADX INFO: compiled from: TextAppearance.java */
    public class a extends i.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f54866a;

        a(f fVar) {
            this.f54866a = fVar;
        }

        @Override // androidx.core.content.res.i.g
        /* JADX INFO: renamed from: h */
        public void f(int i10) {
            d.this.f54864p = true;
            this.f54866a.a(i10);
        }

        @Override // androidx.core.content.res.i.g
        /* JADX INFO: renamed from: i */
        public void g(@n0 Typeface typeface) {
            d dVar = d.this;
            dVar.f54865q = Typeface.create(typeface, dVar.f54853e);
            d.this.f54864p = true;
            this.f54866a.b(d.this.f54865q, false);
        }
    }

    /* JADX INFO: compiled from: TextAppearance.java */
    public class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f54868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextPaint f54869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f54870c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f54868a = context;
            this.f54869b = textPaint;
            this.f54870c = fVar;
        }

        @Override // com.google.android.material.resources.f
        public void a(int i10) {
            this.f54870c.a(i10);
        }

        @Override // com.google.android.material.resources.f
        public void b(@n0 Typeface typeface, boolean z10) {
            d.this.p(this.f54868a, this.f54869b, typeface);
            this.f54870c.b(typeface, z10);
        }
    }

    public d(@n0 Context context, @e1 int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, R.styleable.f52895z1);
        l(typedArrayObtainStyledAttributes.getDimension(R.styleable.TextAppearance_android_textSize, 0.0f));
        k(c.a(context, typedArrayObtainStyledAttributes, R.styleable.TextAppearance_android_textColor));
        this.f54849a = c.a(context, typedArrayObtainStyledAttributes, R.styleable.TextAppearance_android_textColorHint);
        this.f54850b = c.a(context, typedArrayObtainStyledAttributes, R.styleable.TextAppearance_android_textColorLink);
        this.f54853e = typedArrayObtainStyledAttributes.getInt(R.styleable.TextAppearance_android_textStyle, 0);
        this.f54854f = typedArrayObtainStyledAttributes.getInt(R.styleable.TextAppearance_android_typeface, 1);
        int iF = c.f(typedArrayObtainStyledAttributes, R.styleable.TextAppearance_fontFamily, R.styleable.TextAppearance_android_fontFamily);
        this.f54863o = typedArrayObtainStyledAttributes.getResourceId(iF, 0);
        this.f54852d = typedArrayObtainStyledAttributes.getString(iF);
        this.f54855g = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
        this.f54851c = c.a(context, typedArrayObtainStyledAttributes, R.styleable.TextAppearance_android_shadowColor);
        this.f54856h = typedArrayObtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.f54857i = typedArrayObtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.f54858j = typedArrayObtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, R.styleable.G0);
        int i11 = R.styleable.MaterialTextAppearance_android_letterSpacing;
        this.f54859k = typedArrayObtainStyledAttributes2.hasValue(i11);
        this.f54860l = typedArrayObtainStyledAttributes2.getFloat(i11, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f54865q == null && (str = this.f54852d) != null) {
            this.f54865q = Typeface.create(str, this.f54853e);
        }
        if (this.f54865q == null) {
            int i10 = this.f54854f;
            if (i10 == 1) {
                this.f54865q = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f54865q = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f54865q = Typeface.DEFAULT;
            } else {
                this.f54865q = Typeface.MONOSPACE;
            }
            this.f54865q = Typeface.create(this.f54865q, this.f54853e);
        }
    }

    private boolean m(Context context) {
        if (e.b()) {
            return true;
        }
        int i10 = this.f54863o;
        return (i10 != 0 ? i.d(context, i10) : null) != null;
    }

    public Typeface e() {
        d();
        return this.f54865q;
    }

    @j1
    @n0
    public Typeface f(@n0 Context context) {
        if (this.f54864p) {
            return this.f54865q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = i.j(context, this.f54863o);
                this.f54865q = typefaceJ;
                if (typefaceJ != null) {
                    this.f54865q = Typeface.create(typefaceJ, this.f54853e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d(f54845r, "Error loading font " + this.f54852d, e10);
            }
        }
        d();
        this.f54864p = true;
        return this.f54865q;
    }

    public void g(@n0 Context context, @n0 TextPaint textPaint, @n0 f fVar) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, fVar));
    }

    public void h(@n0 Context context, @n0 f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f54863o;
        if (i10 == 0) {
            this.f54864p = true;
        }
        if (this.f54864p) {
            fVar.b(this.f54865q, true);
            return;
        }
        try {
            i.l(context, i10, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f54864p = true;
            fVar.a(1);
        } catch (Exception e10) {
            Log.d(f54845r, "Error loading font " + this.f54852d, e10);
            this.f54864p = true;
            fVar.a(-3);
        }
    }

    @p0
    public ColorStateList i() {
        return this.f54861m;
    }

    public float j() {
        return this.f54862n;
    }

    public void k(@p0 ColorStateList colorStateList) {
        this.f54861m = colorStateList;
    }

    public void l(float f10) {
        this.f54862n = f10;
    }

    public void n(@n0 Context context, @n0 TextPaint textPaint, @n0 f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f54861m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : androidx.core.view.j1.f21601t);
        float f10 = this.f54858j;
        float f11 = this.f54856h;
        float f12 = this.f54857i;
        ColorStateList colorStateList2 = this.f54851c;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(@n0 Context context, @n0 TextPaint textPaint, @n0 f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void p(@n0 Context context, @n0 TextPaint textPaint, @n0 Typeface typeface) {
        Typeface typefaceA = h.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f54853e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f54862n);
        if (this.f54859k) {
            textPaint.setLetterSpacing(this.f54860l);
        }
    }
}
