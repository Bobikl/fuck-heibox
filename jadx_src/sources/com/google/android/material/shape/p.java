package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.RestrictTo;
import androidx.annotation.e1;
import androidx.annotation.n0;
import com.google.android.material.R;

/* JADX INFO: compiled from: ShapeAppearanceModel.java */
/* JADX INFO: loaded from: classes7.dex */
public class p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f55125m = new n(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    f f55126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    f f55127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    f f55128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    f f55129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    e f55130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    e f55131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    e f55132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    e f55133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    h f55134i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    h f55135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    h f55136k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    h f55137l;

    /* JADX INFO: compiled from: ShapeAppearanceModel.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        private f f55138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @n0
        private f f55139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @n0
        private f f55140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @n0
        private f f55141d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @n0
        private e f55142e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @n0
        private e f55143f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @n0
        private e f55144g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @n0
        private e f55145h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @n0
        private h f55146i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @n0
        private h f55147j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @n0
        private h f55148k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @n0
        private h f55149l;

        public b() {
            this.f55138a = l.b();
            this.f55139b = l.b();
            this.f55140c = l.b();
            this.f55141d = l.b();
            this.f55142e = new com.google.android.material.shape.a(0.0f);
            this.f55143f = new com.google.android.material.shape.a(0.0f);
            this.f55144g = new com.google.android.material.shape.a(0.0f);
            this.f55145h = new com.google.android.material.shape.a(0.0f);
            this.f55146i = l.c();
            this.f55147j = l.c();
            this.f55148k = l.c();
            this.f55149l = l.c();
        }

        public b(@n0 p pVar) {
            this.f55138a = l.b();
            this.f55139b = l.b();
            this.f55140c = l.b();
            this.f55141d = l.b();
            this.f55142e = new com.google.android.material.shape.a(0.0f);
            this.f55143f = new com.google.android.material.shape.a(0.0f);
            this.f55144g = new com.google.android.material.shape.a(0.0f);
            this.f55145h = new com.google.android.material.shape.a(0.0f);
            this.f55146i = l.c();
            this.f55147j = l.c();
            this.f55148k = l.c();
            this.f55149l = l.c();
            this.f55138a = pVar.f55126a;
            this.f55139b = pVar.f55127b;
            this.f55140c = pVar.f55128c;
            this.f55141d = pVar.f55129d;
            this.f55142e = pVar.f55130e;
            this.f55143f = pVar.f55131f;
            this.f55144g = pVar.f55132g;
            this.f55145h = pVar.f55133h;
            this.f55146i = pVar.f55134i;
            this.f55147j = pVar.f55135j;
            this.f55148k = pVar.f55136k;
            this.f55149l = pVar.f55137l;
        }

        private static float n(f fVar) {
            if (fVar instanceof o) {
                return ((o) fVar).f55124a;
            }
            if (fVar instanceof g) {
                return ((g) fVar).f55062a;
            }
            return -1.0f;
        }

        @s9.a
        @n0
        public b A(int i10, @n0 e eVar) {
            return B(l.a(i10)).D(eVar);
        }

        @s9.a
        @n0
        public b B(@n0 f fVar) {
            this.f55140c = fVar;
            float fN = n(fVar);
            if (fN != -1.0f) {
                C(fN);
            }
            return this;
        }

        @s9.a
        @n0
        public b C(@androidx.annotation.r float f10) {
            this.f55144g = new com.google.android.material.shape.a(f10);
            return this;
        }

        @s9.a
        @n0
        public b D(@n0 e eVar) {
            this.f55144g = eVar;
            return this;
        }

        @s9.a
        @n0
        public b E(@n0 h hVar) {
            this.f55149l = hVar;
            return this;
        }

        @s9.a
        @n0
        public b F(@n0 h hVar) {
            this.f55147j = hVar;
            return this;
        }

        @s9.a
        @n0
        public b G(@n0 h hVar) {
            this.f55146i = hVar;
            return this;
        }

        @s9.a
        @n0
        public b H(int i10, @androidx.annotation.r float f10) {
            return J(l.a(i10)).K(f10);
        }

        @s9.a
        @n0
        public b I(int i10, @n0 e eVar) {
            return J(l.a(i10)).L(eVar);
        }

        @s9.a
        @n0
        public b J(@n0 f fVar) {
            this.f55138a = fVar;
            float fN = n(fVar);
            if (fN != -1.0f) {
                K(fN);
            }
            return this;
        }

        @s9.a
        @n0
        public b K(@androidx.annotation.r float f10) {
            this.f55142e = new com.google.android.material.shape.a(f10);
            return this;
        }

        @s9.a
        @n0
        public b L(@n0 e eVar) {
            this.f55142e = eVar;
            return this;
        }

        @s9.a
        @n0
        public b M(int i10, @androidx.annotation.r float f10) {
            return O(l.a(i10)).P(f10);
        }

        @s9.a
        @n0
        public b N(int i10, @n0 e eVar) {
            return O(l.a(i10)).Q(eVar);
        }

        @s9.a
        @n0
        public b O(@n0 f fVar) {
            this.f55139b = fVar;
            float fN = n(fVar);
            if (fN != -1.0f) {
                P(fN);
            }
            return this;
        }

        @s9.a
        @n0
        public b P(@androidx.annotation.r float f10) {
            this.f55143f = new com.google.android.material.shape.a(f10);
            return this;
        }

        @s9.a
        @n0
        public b Q(@n0 e eVar) {
            this.f55143f = eVar;
            return this;
        }

        @n0
        public p m() {
            return new p(this);
        }

        @s9.a
        @n0
        public b o(@androidx.annotation.r float f10) {
            return K(f10).P(f10).C(f10).x(f10);
        }

        @s9.a
        @n0
        public b p(@n0 e eVar) {
            return L(eVar).Q(eVar).D(eVar).y(eVar);
        }

        @s9.a
        @n0
        public b q(int i10, @androidx.annotation.r float f10) {
            return r(l.a(i10)).o(f10);
        }

        @s9.a
        @n0
        public b r(@n0 f fVar) {
            return J(fVar).O(fVar).B(fVar).w(fVar);
        }

        @s9.a
        @n0
        public b s(@n0 h hVar) {
            return E(hVar).G(hVar).F(hVar).t(hVar);
        }

        @s9.a
        @n0
        public b t(@n0 h hVar) {
            this.f55148k = hVar;
            return this;
        }

        @s9.a
        @n0
        public b u(int i10, @androidx.annotation.r float f10) {
            return w(l.a(i10)).x(f10);
        }

        @s9.a
        @n0
        public b v(int i10, @n0 e eVar) {
            return w(l.a(i10)).y(eVar);
        }

        @s9.a
        @n0
        public b w(@n0 f fVar) {
            this.f55141d = fVar;
            float fN = n(fVar);
            if (fN != -1.0f) {
                x(fN);
            }
            return this;
        }

        @s9.a
        @n0
        public b x(@androidx.annotation.r float f10) {
            this.f55145h = new com.google.android.material.shape.a(f10);
            return this;
        }

        @s9.a
        @n0
        public b y(@n0 e eVar) {
            this.f55145h = eVar;
            return this;
        }

        @s9.a
        @n0
        public b z(int i10, @androidx.annotation.r float f10) {
            return B(l.a(i10)).C(f10);
        }
    }

    /* JADX INFO: compiled from: ShapeAppearanceModel.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface c {
        @n0
        e a(@n0 e eVar);
    }

    public p() {
        this.f55126a = l.b();
        this.f55127b = l.b();
        this.f55128c = l.b();
        this.f55129d = l.b();
        this.f55130e = new com.google.android.material.shape.a(0.0f);
        this.f55131f = new com.google.android.material.shape.a(0.0f);
        this.f55132g = new com.google.android.material.shape.a(0.0f);
        this.f55133h = new com.google.android.material.shape.a(0.0f);
        this.f55134i = l.c();
        this.f55135j = l.c();
        this.f55136k = l.c();
        this.f55137l = l.c();
    }

    private p(@n0 b bVar) {
        this.f55126a = bVar.f55138a;
        this.f55127b = bVar.f55139b;
        this.f55128c = bVar.f55140c;
        this.f55129d = bVar.f55141d;
        this.f55130e = bVar.f55142e;
        this.f55131f = bVar.f55143f;
        this.f55132g = bVar.f55144g;
        this.f55133h = bVar.f55145h;
        this.f55134i = bVar.f55146i;
        this.f55135j = bVar.f55147j;
        this.f55136k = bVar.f55148k;
        this.f55137l = bVar.f55149l;
    }

    @n0
    public static b a() {
        return new b();
    }

    @n0
    public static b b(Context context, @e1 int i10, @e1 int i11) {
        return c(context, i10, i11, 0);
    }

    @n0
    private static b c(Context context, @e1 int i10, @e1 int i11, int i12) {
        return d(context, i10, i11, new com.google.android.material.shape.a(i12));
    }

    @n0
    private static b d(Context context, @e1 int i10, @e1 int i11, @n0 e eVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(R.styleable.f52850k1);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamily, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopLeft, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopRight, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomRight, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomLeft, i12);
            e eVarM = m(typedArrayObtainStyledAttributes, R.styleable.ShapeAppearance_cornerSize, eVar);
            e eVarM2 = m(typedArrayObtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopLeft, eVarM);
            e eVarM3 = m(typedArrayObtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopRight, eVarM);
            e eVarM4 = m(typedArrayObtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomRight, eVarM);
            return new b().I(i13, eVarM2).N(i14, eVarM3).A(i15, eVarM4).v(i16, m(typedArrayObtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomLeft, eVarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @n0
    public static b e(@n0 Context context, AttributeSet attributeSet, @androidx.annotation.f int i10, @e1 int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    @n0
    public static b f(@n0 Context context, AttributeSet attributeSet, @androidx.annotation.f int i10, @e1 int i11, int i12) {
        return g(context, attributeSet, i10, i11, new com.google.android.material.shape.a(i12));
    }

    @n0
    public static b g(@n0 Context context, AttributeSet attributeSet, @androidx.annotation.f int i10, @e1 int i11, @n0 e eVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.E0, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, eVar);
    }

    @n0
    private static e m(TypedArray typedArray, int i10, @n0 e eVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue == null) {
            return eVar;
        }
        int i11 = typedValuePeekValue.type;
        if (i11 == 5) {
            return new com.google.android.material.shape.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i11 == 6 ? new n(typedValuePeekValue.getFraction(1.0f, 1.0f)) : eVar;
    }

    @n0
    public h h() {
        return this.f55136k;
    }

    @n0
    public f i() {
        return this.f55129d;
    }

    @n0
    public e j() {
        return this.f55133h;
    }

    @n0
    public f k() {
        return this.f55128c;
    }

    @n0
    public e l() {
        return this.f55132g;
    }

    @n0
    public h n() {
        return this.f55137l;
    }

    @n0
    public h o() {
        return this.f55135j;
    }

    @n0
    public h p() {
        return this.f55134i;
    }

    @n0
    public f q() {
        return this.f55126a;
    }

    @n0
    public e r() {
        return this.f55130e;
    }

    @n0
    public f s() {
        return this.f55127b;
    }

    @n0
    public e t() {
        return this.f55131f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean u(@n0 RectF rectF) {
        boolean z10 = this.f55137l.getClass().equals(h.class) && this.f55135j.getClass().equals(h.class) && this.f55134i.getClass().equals(h.class) && this.f55136k.getClass().equals(h.class);
        float fA = this.f55130e.a(rectF);
        return z10 && ((this.f55131f.a(rectF) > fA ? 1 : (this.f55131f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f55133h.a(rectF) > fA ? 1 : (this.f55133h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f55132g.a(rectF) > fA ? 1 : (this.f55132g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f55127b instanceof o) && (this.f55126a instanceof o) && (this.f55128c instanceof o) && (this.f55129d instanceof o));
    }

    @n0
    public b v() {
        return new b(this);
    }

    @n0
    public p w(float f10) {
        return v().o(f10).m();
    }

    @n0
    public p x(@n0 e eVar) {
        return v().p(eVar).m();
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public p y(@n0 c cVar) {
        return v().L(cVar.a(r())).Q(cVar.a(t())).y(cVar.a(j())).D(cVar.a(l())).m();
    }
}
