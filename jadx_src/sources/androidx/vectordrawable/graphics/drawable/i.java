package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.RestrictTo;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.core.content.res.q;
import androidx.core.graphics.m0;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: VectorDrawableCompat.java */
/* JADX INFO: loaded from: classes6.dex */
public class i extends androidx.vectordrawable.graphics.drawable.h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f28077l = "VectorDrawableCompat";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final PorterDuff.Mode f28078m = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f28079n = "clip-path";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f28080o = "group";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f28081p = "path";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f28082q = "vector";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f28083r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f28084s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f28085t = 2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f28086u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f28087v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f28088w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f28089x = 2048;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final boolean f28090y = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f28091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private PorterDuffColorFilter f28092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ColorFilter f28093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f28094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f28095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Drawable.ConstantState f28096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f28097i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Matrix f28098j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f28099k;

    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static class b extends f {
        b() {
        }

        b(b bVar) {
            super(bVar);
        }

        private void j(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f28127b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f28126a = m0.d(string2);
            }
            this.f28128c = q.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.f
        public boolean e() {
            return true;
        }

        public void i(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (q.r(xmlPullParser, "pathData")) {
                TypedArray typedArrayS = q.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.I);
                j(typedArrayS, xmlPullParser);
                typedArrayS.recycle();
            }
        }
    }

    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static class c extends f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int[] f28100f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        androidx.core.content.res.d f28101g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float f28102h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        androidx.core.content.res.d f28103i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f28104j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f28105k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f28106l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f28107m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float f28108n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Paint.Cap f28109o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Paint.Join f28110p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        float f28111q;

        c() {
            this.f28102h = 0.0f;
            this.f28104j = 1.0f;
            this.f28105k = 1.0f;
            this.f28106l = 0.0f;
            this.f28107m = 1.0f;
            this.f28108n = 0.0f;
            this.f28109o = Paint.Cap.BUTT;
            this.f28110p = Paint.Join.MITER;
            this.f28111q = 4.0f;
        }

        c(c cVar) {
            super(cVar);
            this.f28102h = 0.0f;
            this.f28104j = 1.0f;
            this.f28105k = 1.0f;
            this.f28106l = 0.0f;
            this.f28107m = 1.0f;
            this.f28108n = 0.0f;
            this.f28109o = Paint.Cap.BUTT;
            this.f28110p = Paint.Join.MITER;
            this.f28111q = 4.0f;
            this.f28100f = cVar.f28100f;
            this.f28101g = cVar.f28101g;
            this.f28102h = cVar.f28102h;
            this.f28104j = cVar.f28104j;
            this.f28103i = cVar.f28103i;
            this.f28128c = cVar.f28128c;
            this.f28105k = cVar.f28105k;
            this.f28106l = cVar.f28106l;
            this.f28107m = cVar.f28107m;
            this.f28108n = cVar.f28108n;
            this.f28109o = cVar.f28109o;
            this.f28110p = cVar.f28110p;
            this.f28111q = cVar.f28111q;
        }

        private Paint.Cap i(int i10, Paint.Cap cap) {
            if (i10 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i10 != 1) {
                return i10 != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        private Paint.Join j(int i10, Paint.Join join) {
            if (i10 == 0) {
                return Paint.Join.MITER;
            }
            if (i10 != 1) {
                return i10 != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        private void l(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f28100f = null;
            if (q.r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f28127b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f28126a = m0.d(string2);
                }
                this.f28103i = q.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f28105k = q.j(typedArray, xmlPullParser, "fillAlpha", 12, this.f28105k);
                this.f28109o = i(q.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f28109o);
                this.f28110p = j(q.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f28110p);
                this.f28111q = q.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f28111q);
                this.f28101g = q.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f28104j = q.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f28104j);
                this.f28102h = q.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f28102h);
                this.f28107m = q.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f28107m);
                this.f28108n = q.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f28108n);
                this.f28106l = q.j(typedArray, xmlPullParser, "trimPathStart", 5, this.f28106l);
                this.f28128c = q.k(typedArray, xmlPullParser, "fillType", 13, this.f28128c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean a() {
            return this.f28103i.i() || this.f28101g.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean b(int[] iArr) {
            return this.f28101g.j(iArr) | this.f28103i.j(iArr);
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.f
        public void c(Resources.Theme theme) {
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.f
        public boolean d() {
            return this.f28100f != null;
        }

        float getFillAlpha() {
            return this.f28105k;
        }

        @l
        int getFillColor() {
            return this.f28103i.e();
        }

        float getStrokeAlpha() {
            return this.f28104j;
        }

        @l
        int getStrokeColor() {
            return this.f28101g.e();
        }

        float getStrokeWidth() {
            return this.f28102h;
        }

        float getTrimPathEnd() {
            return this.f28107m;
        }

        float getTrimPathOffset() {
            return this.f28108n;
        }

        float getTrimPathStart() {
            return this.f28106l;
        }

        public void k(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayS = q.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f28025t);
            l(typedArrayS, xmlPullParser, theme);
            typedArrayS.recycle();
        }

        void setFillAlpha(float f10) {
            this.f28105k = f10;
        }

        void setFillColor(int i10) {
            this.f28103i.k(i10);
        }

        void setStrokeAlpha(float f10) {
            this.f28104j = f10;
        }

        void setStrokeColor(int i10) {
            this.f28101g.k(i10);
        }

        void setStrokeWidth(float f10) {
            this.f28102h = f10;
        }

        void setTrimPathEnd(float f10) {
            this.f28107m = f10;
        }

        void setTrimPathOffset(float f10) {
            this.f28108n = f10;
        }

        void setTrimPathStart(float f10) {
            this.f28106l = f10;
        }
    }

    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f28112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList<e> f28113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f28114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f28115d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f28116e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f28117f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f28118g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f28119h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f28120i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final Matrix f28121j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f28122k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int[] f28123l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f28124m;

        public d() {
            super();
            this.f28112a = new Matrix();
            this.f28113b = new ArrayList<>();
            this.f28114c = 0.0f;
            this.f28115d = 0.0f;
            this.f28116e = 0.0f;
            this.f28117f = 1.0f;
            this.f28118g = 1.0f;
            this.f28119h = 0.0f;
            this.f28120i = 0.0f;
            this.f28121j = new Matrix();
            this.f28124m = null;
        }

        public d(d dVar, androidx.collection.a<String, Object> aVar) {
            f bVar;
            super();
            this.f28112a = new Matrix();
            this.f28113b = new ArrayList<>();
            this.f28114c = 0.0f;
            this.f28115d = 0.0f;
            this.f28116e = 0.0f;
            this.f28117f = 1.0f;
            this.f28118g = 1.0f;
            this.f28119h = 0.0f;
            this.f28120i = 0.0f;
            Matrix matrix = new Matrix();
            this.f28121j = matrix;
            this.f28124m = null;
            this.f28114c = dVar.f28114c;
            this.f28115d = dVar.f28115d;
            this.f28116e = dVar.f28116e;
            this.f28117f = dVar.f28117f;
            this.f28118g = dVar.f28118g;
            this.f28119h = dVar.f28119h;
            this.f28120i = dVar.f28120i;
            this.f28123l = dVar.f28123l;
            String str = dVar.f28124m;
            this.f28124m = str;
            this.f28122k = dVar.f28122k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f28121j);
            ArrayList<e> arrayList = dVar.f28113b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f28113b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f28113b.add(bVar);
                    String str2 = bVar.f28127b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f28121j.reset();
            this.f28121j.postTranslate(-this.f28115d, -this.f28116e);
            this.f28121j.postScale(this.f28117f, this.f28118g);
            this.f28121j.postRotate(this.f28114c, 0.0f, 0.0f);
            this.f28121j.postTranslate(this.f28119h + this.f28115d, this.f28120i + this.f28116e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f28123l = null;
            this.f28114c = q.j(typedArray, xmlPullParser, androidx.constraintlayout.motion.widget.f.f18721i, 5, this.f28114c);
            this.f28115d = typedArray.getFloat(1, this.f28115d);
            this.f28116e = typedArray.getFloat(2, this.f28116e);
            this.f28117f = q.j(typedArray, xmlPullParser, "scaleX", 3, this.f28117f);
            this.f28118g = q.j(typedArray, xmlPullParser, "scaleY", 4, this.f28118g);
            this.f28119h = q.j(typedArray, xmlPullParser, "translateX", 6, this.f28119h);
            this.f28120i = q.j(typedArray, xmlPullParser, "translateY", 7, this.f28120i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f28124m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f28113b.size(); i10++) {
                if (this.f28113b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i10 = 0; i10 < this.f28113b.size(); i10++) {
                zB |= this.f28113b.get(i10).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayS = q.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f28007k);
            e(typedArrayS, xmlPullParser);
            typedArrayS.recycle();
        }

        public String getGroupName() {
            return this.f28124m;
        }

        public Matrix getLocalMatrix() {
            return this.f28121j;
        }

        public float getPivotX() {
            return this.f28115d;
        }

        public float getPivotY() {
            return this.f28116e;
        }

        public float getRotation() {
            return this.f28114c;
        }

        public float getScaleX() {
            return this.f28117f;
        }

        public float getScaleY() {
            return this.f28118g;
        }

        public float getTranslateX() {
            return this.f28119h;
        }

        public float getTranslateY() {
            return this.f28120i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f28115d) {
                this.f28115d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f28116e) {
                this.f28116e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f28114c) {
                this.f28114c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f28117f) {
                this.f28117f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f28118g) {
                this.f28118g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f28119h) {
                this.f28119h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f28120i) {
                this.f28120i = f10;
                d();
            }
        }
    }

    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static abstract class f extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected static final int f28125e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected m0.b[] f28126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f28127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f28128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f28129d;

        public f() {
            super();
            this.f28126a = null;
            this.f28128c = 0;
        }

        public f(f fVar) {
            super();
            this.f28126a = null;
            this.f28128c = 0;
            this.f28127b = fVar.f28127b;
            this.f28129d = fVar.f28129d;
            this.f28126a = m0.f(fVar.f28126a);
        }

        public void c(Resources.Theme theme) {
        }

        public boolean d() {
            return false;
        }

        public boolean e() {
            return false;
        }

        public String f(m0.b[] bVarArr) {
            String str = " ";
            for (int i10 = 0; i10 < bVarArr.length; i10++) {
                str = str + bVarArr[i10].f20752a + ":";
                for (float f10 : bVarArr[i10].f20753b) {
                    str = str + f10 + Constants.ACCEPT_TIME_SEPARATOR_SP;
                }
            }
            return str;
        }

        public void g(int i10) {
            String str = "";
            for (int i11 = 0; i11 < i10; i11++) {
                str = str + "    ";
            }
            Log.v(i.f28077l, str + "current path is :" + this.f28127b + " pathData is " + f(this.f28126a));
        }

        public m0.b[] getPathData() {
            return this.f28126a;
        }

        public String getPathName() {
            return this.f28127b;
        }

        public void h(Path path) {
            path.reset();
            m0.b[] bVarArr = this.f28126a;
            if (bVarArr != null) {
                m0.b.e(bVarArr, path);
            }
        }

        public void setPathData(m0.b[] bVarArr) {
            if (m0.b(this.f28126a, bVarArr)) {
                m0.k(this.f28126a, bVarArr);
            } else {
                this.f28126a = m0.f(bVarArr);
            }
        }
    }

    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static class g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final Matrix f28130q = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Path f28131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Path f28132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Matrix f28133c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Paint f28134d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Paint f28135e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private PathMeasure f28136f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f28137g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final d f28138h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f28139i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f28140j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f28141k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f28142l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f28143m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f28144n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Boolean f28145o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final androidx.collection.a<String, Object> f28146p;

        public g() {
            this.f28133c = new Matrix();
            this.f28139i = 0.0f;
            this.f28140j = 0.0f;
            this.f28141k = 0.0f;
            this.f28142l = 0.0f;
            this.f28143m = 255;
            this.f28144n = null;
            this.f28145o = null;
            this.f28146p = new androidx.collection.a<>();
            this.f28138h = new d();
            this.f28131a = new Path();
            this.f28132b = new Path();
        }

        public g(g gVar) {
            this.f28133c = new Matrix();
            this.f28139i = 0.0f;
            this.f28140j = 0.0f;
            this.f28141k = 0.0f;
            this.f28142l = 0.0f;
            this.f28143m = 255;
            this.f28144n = null;
            this.f28145o = null;
            androidx.collection.a<String, Object> aVar = new androidx.collection.a<>();
            this.f28146p = aVar;
            this.f28138h = new d(gVar.f28138h, aVar);
            this.f28131a = new Path(gVar.f28131a);
            this.f28132b = new Path(gVar.f28132b);
            this.f28139i = gVar.f28139i;
            this.f28140j = gVar.f28140j;
            this.f28141k = gVar.f28141k;
            this.f28142l = gVar.f28142l;
            this.f28137g = gVar.f28137g;
            this.f28143m = gVar.f28143m;
            this.f28144n = gVar.f28144n;
            String str = gVar.f28144n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f28145o = gVar.f28145o;
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            dVar.f28112a.set(matrix);
            dVar.f28112a.preConcat(dVar.f28121j);
            canvas.save();
            for (int i12 = 0; i12 < dVar.f28113b.size(); i12++) {
                e eVar = dVar.f28113b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f28112a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i10, i11, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f28141k;
            float f11 = i11 / this.f28142l;
            float fMin = Math.min(f10, f11);
            Matrix matrix = dVar.f28112a;
            this.f28133c.set(matrix);
            this.f28133c.postScale(f10, f11);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            fVar.h(this.f28131a);
            Path path = this.f28131a;
            this.f28132b.reset();
            if (fVar.e()) {
                this.f28132b.setFillType(fVar.f28128c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f28132b.addPath(path, this.f28133c);
                canvas.clipPath(this.f28132b);
                return;
            }
            c cVar = (c) fVar;
            float f12 = cVar.f28106l;
            if (f12 != 0.0f || cVar.f28107m != 1.0f) {
                float f13 = cVar.f28108n;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f28107m + f13) % 1.0f;
                if (this.f28136f == null) {
                    this.f28136f = new PathMeasure();
                }
                this.f28136f.setPath(this.f28131a, false);
                float length = this.f28136f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f28136f.getSegment(f16, length, path, true);
                    this.f28136f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f28136f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f28132b.addPath(path, this.f28133c);
            if (cVar.f28103i.l()) {
                androidx.core.content.res.d dVar2 = cVar.f28103i;
                if (this.f28135e == null) {
                    Paint paint = new Paint(1);
                    this.f28135e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f28135e;
                if (dVar2.h()) {
                    Shader shaderF = dVar2.f();
                    shaderF.setLocalMatrix(this.f28133c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f28105k * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(i.a(dVar2.e(), cVar.f28105k));
                }
                paint2.setColorFilter(colorFilter);
                this.f28132b.setFillType(cVar.f28128c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f28132b, paint2);
            }
            if (cVar.f28101g.l()) {
                androidx.core.content.res.d dVar3 = cVar.f28101g;
                if (this.f28134d == null) {
                    Paint paint3 = new Paint(1);
                    this.f28134d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f28134d;
                Paint.Join join = cVar.f28110p;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f28109o;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f28111q);
                if (dVar3.h()) {
                    Shader shaderF2 = dVar3.f();
                    shaderF2.setLocalMatrix(this.f28133c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f28104j * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(i.a(dVar3.e(), cVar.f28104j));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f28102h * fMin * fE);
                canvas.drawPath(this.f28132b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f28138h, f28130q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f28145o == null) {
                this.f28145o = Boolean.valueOf(this.f28138h.a());
            }
            return this.f28145o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f28138h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f28143m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f28143m = i10;
        }
    }

    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f28148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ColorStateList f28149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f28150d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f28151e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Bitmap f28152f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int[] f28153g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ColorStateList f28154h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        PorterDuff.Mode f28155i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f28156j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f28157k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f28158l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Paint f28159m;

        public h() {
            this.f28149c = null;
            this.f28150d = i.f28078m;
            this.f28148b = new g();
        }

        public h(h hVar) {
            this.f28149c = null;
            this.f28150d = i.f28078m;
            if (hVar != null) {
                this.f28147a = hVar.f28147a;
                g gVar = new g(hVar.f28148b);
                this.f28148b = gVar;
                if (hVar.f28148b.f28135e != null) {
                    gVar.f28135e = new Paint(hVar.f28148b.f28135e);
                }
                if (hVar.f28148b.f28134d != null) {
                    this.f28148b.f28134d = new Paint(hVar.f28148b.f28134d);
                }
                this.f28149c = hVar.f28149c;
                this.f28150d = hVar.f28150d;
                this.f28151e = hVar.f28151e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f28152f.getWidth() && i11 == this.f28152f.getHeight();
        }

        public boolean b() {
            return !this.f28158l && this.f28154h == this.f28149c && this.f28155i == this.f28150d && this.f28157k == this.f28151e && this.f28156j == this.f28148b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f28152f == null || !a(i10, i11)) {
                this.f28152f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f28158l = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f28152f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f28159m == null) {
                Paint paint = new Paint();
                this.f28159m = paint;
                paint.setFilterBitmap(true);
            }
            this.f28159m.setAlpha(this.f28148b.getRootAlpha());
            this.f28159m.setColorFilter(colorFilter);
            return this.f28159m;
        }

        public boolean f() {
            return this.f28148b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f28148b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f28147a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f28148b.g(iArr);
            this.f28158l |= zG;
            return zG;
        }

        public void i() {
            this.f28154h = this.f28149c;
            this.f28155i = this.f28150d;
            this.f28156j = this.f28148b.getRootAlpha();
            this.f28157k = this.f28151e;
            this.f28158l = false;
        }

        public void j(int i10, int i11) {
            this.f28152f.eraseColor(0);
            this.f28148b.b(new Canvas(this.f28152f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @n0
        public Drawable newDrawable() {
            return new i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @n0
        public Drawable newDrawable(Resources resources) {
            return new i(this);
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.i$i, reason: collision with other inner class name */
    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    @w0(24)
    public static class C0225i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f28160a;

        public C0225i(Drawable.ConstantState constantState) {
            this.f28160a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f28160a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f28160a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            i iVar = new i();
            iVar.f28076b = (VectorDrawable) this.f28160a.newDrawable();
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f28076b = (VectorDrawable) this.f28160a.newDrawable(resources);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f28076b = (VectorDrawable) this.f28160a.newDrawable(resources, theme);
            return iVar;
        }
    }

    i() {
        this.f28095g = true;
        this.f28097i = new float[9];
        this.f28098j = new Matrix();
        this.f28099k = new Rect();
        this.f28091c = new h();
    }

    i(@n0 h hVar) {
        this.f28095g = true;
        this.f28097i = new float[9];
        this.f28098j = new Matrix();
        this.f28099k = new Rect();
        this.f28091c = hVar;
        this.f28092d = n(this.f28092d, hVar.f28149c, hVar.f28150d);
    }

    static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    @p0
    public static i d(@n0 Resources resources, @v int i10, @p0 Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            i iVar = new i();
            iVar.f28076b = androidx.core.content.res.i.g(resources, i10, theme);
            iVar.f28096h = new C0225i(iVar.f28076b.getConstantState());
            return iVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i10);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return e(resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e10) {
            Log.e(f28077l, "parser error", e10);
            return null;
        } catch (XmlPullParserException e11) {
            Log.e(f28077l, "parser error", e11);
            return null;
        }
    }

    public static i e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        i iVar = new i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    private void h(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f28091c;
        g gVar = hVar.f28148b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f28138h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.k(resources, attributeSet, theme, xmlPullParser);
                    dVar.f28113b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f28146p.put(cVar.getPathName(), cVar);
                    }
                    z10 = false;
                    hVar.f28147a = cVar.f28129d | hVar.f28147a;
                } else if (f28079n.equals(name)) {
                    b bVar = new b();
                    bVar.i(resources, attributeSet, theme, xmlPullParser);
                    dVar.f28113b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f28146p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f28147a = bVar.f28129d | hVar.f28147a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f28113b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f28146p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f28147a = dVar2.f28122k | hVar.f28147a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean i() {
        return isAutoMirrored() && androidx.core.graphics.drawable.d.f(this) == 1;
    }

    private static PorterDuff.Mode j(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void k(d dVar, int i10) {
        String str = "";
        for (int i11 = 0; i11 < i10; i11++) {
            str = str + "    ";
        }
        Log.v(f28077l, str + "current group is :" + dVar.getGroupName() + " rotation is " + dVar.f28114c);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("matrix is :");
        sb2.append(dVar.getLocalMatrix().toString());
        Log.v(f28077l, sb2.toString());
        for (int i12 = 0; i12 < dVar.f28113b.size(); i12++) {
            e eVar = dVar.f28113b.get(i12);
            if (eVar instanceof d) {
                k((d) eVar, i10 + 1);
            } else {
                ((f) eVar).g(i10 + 1);
            }
        }
    }

    private void m(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f28091c;
        g gVar = hVar.f28148b;
        hVar.f28150d = j(q.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListG = q.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListG != null) {
            hVar.f28149c = colorStateListG;
        }
        hVar.f28151e = q.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f28151e);
        gVar.f28141k = q.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f28141k);
        float fJ = q.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f28142l);
        gVar.f28142l = fJ;
        if (gVar.f28141k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fJ <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f28139i = typedArray.getDimension(3, gVar.f28139i);
        float dimension = typedArray.getDimension(2, gVar.f28140j);
        gVar.f28140j = dimension;
        if (gVar.f28139i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(q.j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f28144n = string;
            gVar.f28146p.put(string, gVar);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f28076b;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.d.b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f28099k);
        if (this.f28099k.width() <= 0 || this.f28099k.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f28093e;
        if (colorFilter == null) {
            colorFilter = this.f28092d;
        }
        canvas.getMatrix(this.f28098j);
        this.f28098j.getValues(this.f28097i);
        float fAbs = Math.abs(this.f28097i[0]);
        float fAbs2 = Math.abs(this.f28097i[4]);
        float fAbs3 = Math.abs(this.f28097i[1]);
        float fAbs4 = Math.abs(this.f28097i[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.f28099k.width() * fAbs);
        int iHeight = (int) (this.f28099k.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f28099k;
        canvas.translate(rect.left, rect.top);
        if (i()) {
            canvas.translate(this.f28099k.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f28099k.offsetTo(0, 0);
        this.f28091c.c(iMin, iMin2);
        if (!this.f28095g) {
            this.f28091c.j(iMin, iMin2);
        } else if (!this.f28091c.b()) {
            this.f28091c.j(iMin, iMin2);
            this.f28091c.i();
        }
        this.f28091c.d(canvas, colorFilter, this.f28099k);
        canvas.restoreToCount(iSave);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public float f() {
        g gVar;
        h hVar = this.f28091c;
        if (hVar == null || (gVar = hVar.f28148b) == null) {
            return 1.0f;
        }
        float f10 = gVar.f28139i;
        if (f10 == 0.0f) {
            return 1.0f;
        }
        float f11 = gVar.f28140j;
        if (f11 == 0.0f) {
            return 1.0f;
        }
        float f12 = gVar.f28142l;
        if (f12 == 0.0f) {
            return 1.0f;
        }
        float f13 = gVar.f28141k;
        if (f13 == 0.0f) {
            return 1.0f;
        }
        return Math.min(f13 / f10, f12 / f11);
    }

    Object g(String str) {
        return this.f28091c.f28148b.f28146p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f28076b;
        return drawable != null ? androidx.core.graphics.drawable.d.d(drawable) : this.f28091c.f28148b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f28076b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f28091c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f28076b;
        return drawable != null ? androidx.core.graphics.drawable.d.e(drawable) : this.f28093e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f28076b != null && Build.VERSION.SDK_INT >= 24) {
            return new C0225i(this.f28076b.getConstantState());
        }
        this.f28091c.f28147a = getChangingConfigurations();
        return this.f28091c;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f28076b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f28091c.f28148b.f28140j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f28076b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f28091c.f28148b.f28139i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f28091c;
        hVar.f28148b = new g();
        TypedArray typedArrayS = q.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f27987a);
        m(typedArrayS, xmlPullParser, theme);
        typedArrayS.recycle();
        hVar.f28147a = getChangingConfigurations();
        hVar.f28158l = true;
        h(resources, xmlPullParser, attributeSet, theme);
        this.f28092d = n(this.f28092d, hVar.f28149c, hVar.f28150d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f28076b;
        return drawable != null ? androidx.core.graphics.drawable.d.h(drawable) : this.f28091c.f28151e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((hVar = this.f28091c) != null && (hVar.g() || ((colorStateList = this.f28091c.f28149c) != null && colorStateList.isStateful())));
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    void l(boolean z10) {
        this.f28095g = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f28094f && super.mutate() == this) {
            this.f28091c = new h(this.f28091c);
            this.f28094f = true;
        }
        return this;
    }

    PorterDuffColorFilter n(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z10 = false;
        h hVar = this.f28091c;
        ColorStateList colorStateList = hVar.f28149c;
        if (colorStateList != null && (mode = hVar.f28150d) != null) {
            this.f28092d = n(this.f28092d, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f28091c.f28148b.getRootAlpha() != i10) {
            this.f28091c.f28148b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.j(drawable, z10);
        } else {
            this.f28091c.f28151e = z10;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f28093e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTint(int i10) {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f28091c;
        if (hVar.f28149c != colorStateList) {
            hVar.f28149c = colorStateList;
            this.f28092d = n(this.f28092d, colorStateList, hVar.f28150d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.p(drawable, mode);
            return;
        }
        h hVar = this.f28091c;
        if (hVar.f28150d != mode) {
            hVar.f28150d = mode;
            this.f28092d = n(this.f28092d, hVar.f28149c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f28076b;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
