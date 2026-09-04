package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.n0;
import androidx.annotation.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ShapePath.java */
/* JADX INFO: loaded from: classes7.dex */
public class r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f55168j = 270.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected static final float f55169k = 180.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f55170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f55171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f55172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f55173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f55174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f55175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<h> f55176g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<j> f55177h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f55178i;

    /* JADX INFO: compiled from: ShapePath.java */
    public class a extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f55179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Matrix f55180d;

        a(List list, Matrix matrix) {
            this.f55179c = list;
            this.f55180d = matrix;
        }

        @Override // com.google.android.material.shape.r.j
        public void a(Matrix matrix, com.google.android.material.shadow.b bVar, int i10, Canvas canvas) {
            Iterator it = this.f55179c.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a(this.f55180d, bVar, i10, canvas);
            }
        }
    }

    /* JADX INFO: compiled from: ShapePath.java */
    public static class b extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f55182c;

        public b(e eVar) {
            this.f55182c = eVar;
        }

        @Override // com.google.android.material.shape.r.j
        public void a(Matrix matrix, @n0 com.google.android.material.shadow.b bVar, int i10, @n0 Canvas canvas) {
            bVar.a(canvas, matrix, new RectF(this.f55182c.k(), this.f55182c.o(), this.f55182c.l(), this.f55182c.j()), i10, this.f55182c.m(), this.f55182c.n());
        }
    }

    /* JADX INFO: compiled from: ShapePath.java */
    public static class c extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g f55183c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final g f55184d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f55185e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f55186f;

        public c(g gVar, g gVar2, float f10, float f11) {
            this.f55183c = gVar;
            this.f55184d = gVar2;
            this.f55185e = f10;
            this.f55186f = f11;
        }

        @Override // com.google.android.material.shape.r.j
        public void a(Matrix matrix, com.google.android.material.shadow.b bVar, int i10, Canvas canvas) {
            com.google.android.material.shadow.b bVar2;
            float fE = e();
            if (fE > 0.0f) {
                return;
            }
            double dHypot = Math.hypot(this.f55183c.f55203b - this.f55185e, this.f55183c.f55204c - this.f55186f);
            double dHypot2 = Math.hypot(this.f55184d.f55203b - this.f55183c.f55203b, this.f55184d.f55204c - this.f55183c.f55204c);
            float fMin = (float) Math.min(i10, Math.min(dHypot, dHypot2));
            double d10 = fMin;
            double dTan = Math.tan(Math.toRadians((-fE) / 2.0f)) * d10;
            if (dHypot > dTan) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) (dHypot - dTan), 0.0f);
                this.f55211a.set(matrix);
                this.f55211a.preTranslate(this.f55185e, this.f55186f);
                this.f55211a.preRotate(d());
                bVar2 = bVar;
                bVar2.b(canvas, this.f55211a, rectF, i10);
            } else {
                bVar2 = bVar;
            }
            float f10 = 2.0f * fMin;
            RectF rectF2 = new RectF(0.0f, 0.0f, f10, f10);
            this.f55211a.set(matrix);
            this.f55211a.preTranslate(this.f55183c.f55203b, this.f55183c.f55204c);
            this.f55211a.preRotate(d());
            this.f55211a.preTranslate((float) ((-dTan) - d10), (-2.0f) * fMin);
            bVar.c(canvas, this.f55211a, rectF2, (int) fMin, 450.0f, fE, new float[]{(float) (d10 + dTan), f10});
            if (dHypot2 > dTan) {
                RectF rectF3 = new RectF(0.0f, 0.0f, (float) (dHypot2 - dTan), 0.0f);
                this.f55211a.set(matrix);
                this.f55211a.preTranslate(this.f55183c.f55203b, this.f55183c.f55204c);
                this.f55211a.preRotate(c());
                this.f55211a.preTranslate((float) dTan, 0.0f);
                bVar2.b(canvas, this.f55211a, rectF3, i10);
            }
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f55184d.f55204c - this.f55183c.f55204c) / (this.f55184d.f55203b - this.f55183c.f55203b)));
        }

        float d() {
            return (float) Math.toDegrees(Math.atan((this.f55183c.f55204c - this.f55186f) / (this.f55183c.f55203b - this.f55185e)));
        }

        float e() {
            float fC = ((c() - d()) + 360.0f) % 360.0f;
            return fC <= r.f55169k ? fC : fC - 360.0f;
        }
    }

    /* JADX INFO: compiled from: ShapePath.java */
    public static class d extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g f55187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f55188d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f55189e;

        public d(g gVar, float f10, float f11) {
            this.f55187c = gVar;
            this.f55188d = f10;
            this.f55189e = f11;
        }

        @Override // com.google.android.material.shape.r.j
        public void a(Matrix matrix, @n0 com.google.android.material.shadow.b bVar, int i10, @n0 Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f55187c.f55204c - this.f55189e, this.f55187c.f55203b - this.f55188d), 0.0f);
            this.f55211a.set(matrix);
            this.f55211a.preTranslate(this.f55188d, this.f55189e);
            this.f55211a.preRotate(c());
            bVar.b(canvas, this.f55211a, rectF, i10);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f55187c.f55204c - this.f55189e) / (this.f55187c.f55203b - this.f55188d)));
        }
    }

    /* JADX INFO: compiled from: ShapePath.java */
    public static class e extends h {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final RectF f55190h = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f55191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f55192c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f55193d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f55194e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f55195f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f55196g;

        public e(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f55194e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f55191b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f55193d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f55195f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f55196g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f55192c;
        }

        private void p(float f10) {
            this.f55194e = f10;
        }

        private void q(float f10) {
            this.f55191b = f10;
        }

        private void r(float f10) {
            this.f55193d = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f10) {
            this.f55195f = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f10) {
            this.f55196g = f10;
        }

        private void u(float f10) {
            this.f55192c = f10;
        }

        @Override // com.google.android.material.shape.r.h
        public void a(@n0 Matrix matrix, @n0 Path path) {
            Matrix matrix2 = this.f55205a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f55190h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: ShapePath.java */
    public static class f extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f55197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f55198c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f55199d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f55200e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f55201f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f55202g;

        public f(float f10, float f11, float f12, float f13, float f14, float f15) {
            h(f10);
            j(f11);
            i(f12);
            k(f13);
            l(f14);
            m(f15);
        }

        private float b() {
            return this.f55197b;
        }

        private float c() {
            return this.f55199d;
        }

        private float d() {
            return this.f55198c;
        }

        private float e() {
            return this.f55198c;
        }

        private float f() {
            return this.f55201f;
        }

        private float g() {
            return this.f55202g;
        }

        private void h(float f10) {
            this.f55197b = f10;
        }

        private void i(float f10) {
            this.f55199d = f10;
        }

        private void j(float f10) {
            this.f55198c = f10;
        }

        private void k(float f10) {
            this.f55200e = f10;
        }

        private void l(float f10) {
            this.f55201f = f10;
        }

        private void m(float f10) {
            this.f55202g = f10;
        }

        @Override // com.google.android.material.shape.r.h
        public void a(@n0 Matrix matrix, @n0 Path path) {
            Matrix matrix2 = this.f55205a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.f55197b, this.f55198c, this.f55199d, this.f55200e, this.f55201f, this.f55202g);
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: ShapePath.java */
    public static class g extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f55203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f55204c;

        @Override // com.google.android.material.shape.r.h
        public void a(@n0 Matrix matrix, @n0 Path path) {
            Matrix matrix2 = this.f55205a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f55203b, this.f55204c);
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: ShapePath.java */
    public static abstract class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Matrix f55205a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* JADX INFO: compiled from: ShapePath.java */
    public static class i extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f55206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f55207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f55208d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f55209e;

        private float f() {
            return this.f55206b;
        }

        private float g() {
            return this.f55207c;
        }

        private float h() {
            return this.f55208d;
        }

        private float i() {
            return this.f55209e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(float f10) {
            this.f55206b = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(float f10) {
            this.f55207c = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(float f10) {
            this.f55208d = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(float f10) {
            this.f55209e = f10;
        }

        @Override // com.google.android.material.shape.r.h
        public void a(@n0 Matrix matrix, @n0 Path path) {
            Matrix matrix2 = this.f55205a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(f(), g(), h(), i());
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: ShapePath.java */
    public static abstract class j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Matrix f55210b = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f55211a = new Matrix();

        j() {
        }

        public abstract void a(Matrix matrix, com.google.android.material.shadow.b bVar, int i10, Canvas canvas);

        public final void b(com.google.android.material.shadow.b bVar, int i10, Canvas canvas) {
            a(f55210b, bVar, i10, canvas);
        }
    }

    public r() {
        q(0.0f, 0.0f);
    }

    public r(float f10, float f11) {
        q(f10, f11);
    }

    private void b(float f10) {
        if (h() == f10) {
            return;
        }
        float fH = ((f10 - h()) + 360.0f) % 360.0f;
        if (fH > f55169k) {
            return;
        }
        e eVar = new e(j(), k(), j(), k());
        eVar.s(h());
        eVar.t(fH);
        this.f55177h.add(new b(eVar));
        s(f10);
    }

    private void c(j jVar, float f10, float f11) {
        b(f10);
        this.f55177h.add(jVar);
        s(f11);
    }

    private float h() {
        return this.f55174e;
    }

    private float i() {
        return this.f55175f;
    }

    private void s(float f10) {
        this.f55174e = f10;
    }

    private void t(float f10) {
        this.f55175f = f10;
    }

    private void u(float f10) {
        this.f55172c = f10;
    }

    private void v(float f10) {
        this.f55173d = f10;
    }

    private void w(float f10) {
        this.f55170a = f10;
    }

    private void x(float f10) {
        this.f55171b = f10;
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        e eVar = new e(f10, f11, f12, f13);
        eVar.s(f14);
        eVar.t(f15);
        this.f55176g.add(eVar);
        b bVar = new b(eVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + f55169k) % 360.0f;
        }
        c(bVar, f14, z10 ? (f55169k + f16) % 360.0f : f16);
        double d10 = f16;
        u(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        v(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f55176g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f55176g.get(i10).a(matrix, path);
        }
    }

    boolean e() {
        return this.f55178i;
    }

    @n0
    j f(Matrix matrix) {
        b(i());
        return new a(new ArrayList(this.f55177h), new Matrix(matrix));
    }

    @w0(21)
    public void g(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f55176g.add(new f(f10, f11, f12, f13, f14, f15));
        this.f55178i = true;
        u(f14);
        v(f15);
    }

    float j() {
        return this.f55172c;
    }

    float k() {
        return this.f55173d;
    }

    float l() {
        return this.f55170a;
    }

    float m() {
        return this.f55171b;
    }

    public void n(float f10, float f11) {
        g gVar = new g();
        gVar.f55203b = f10;
        gVar.f55204c = f11;
        this.f55176g.add(gVar);
        d dVar = new d(gVar, j(), k());
        c(dVar, dVar.c() + f55168j, dVar.c() + f55168j);
        u(f10);
        v(f11);
    }

    public void o(float f10, float f11, float f12, float f13) {
        if ((Math.abs(f10 - j()) < 0.001f && Math.abs(f11 - k()) < 0.001f) || (Math.abs(f10 - f12) < 0.001f && Math.abs(f11 - f13) < 0.001f)) {
            n(f12, f13);
            return;
        }
        g gVar = new g();
        gVar.f55203b = f10;
        gVar.f55204c = f11;
        this.f55176g.add(gVar);
        g gVar2 = new g();
        gVar2.f55203b = f12;
        gVar2.f55204c = f13;
        this.f55176g.add(gVar2);
        c cVar = new c(gVar, gVar2, j(), k());
        if (cVar.e() > 0.0f) {
            n(f10, f11);
            n(f12, f13);
        } else {
            c(cVar, cVar.d() + f55168j, cVar.c() + f55168j);
            u(f12);
            v(f13);
        }
    }

    @w0(21)
    public void p(float f10, float f11, float f12, float f13) {
        i iVar = new i();
        iVar.j(f10);
        iVar.k(f11);
        iVar.l(f12);
        iVar.m(f13);
        this.f55176g.add(iVar);
        this.f55178i = true;
        u(f12);
        v(f13);
    }

    public void q(float f10, float f11) {
        r(f10, f11, f55168j, 0.0f);
    }

    public void r(float f10, float f11, float f12, float f13) {
        w(f10);
        x(f11);
        u(f10);
        v(f11);
        s(f12);
        t((f12 + f13) % 360.0f);
        this.f55176g.clear();
        this.f55177h.clear();
        this.f55178i = false;
    }
}
