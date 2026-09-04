package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.RestrictTo;
import androidx.annotation.i1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: ShapeAppearancePathProvider.java */
/* JADX INFO: loaded from: classes7.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r[] f55150a = new r[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix[] f55151b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix[] f55152c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PointF f55153d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Path f55154e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Path f55155f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r f55156g = new r();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f55157h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f55158i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f55159j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Path f55160k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f55161l = true;

    /* JADX INFO: compiled from: ShapeAppearancePathProvider.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final q f55162a = new q();

        private a() {
        }
    }

    /* JADX INFO: compiled from: ShapeAppearancePathProvider.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface b {
        void a(r rVar, Matrix matrix, int i10);

        void b(r rVar, Matrix matrix, int i10);
    }

    /* JADX INFO: compiled from: ShapeAppearancePathProvider.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        public final p f55163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @n0
        public final Path f55164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @n0
        public final RectF f55165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        public final b f55166d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f55167e;

        c(@n0 p pVar, float f10, RectF rectF, @p0 b bVar, Path path) {
            this.f55166d = bVar;
            this.f55163a = pVar;
            this.f55167e = f10;
            this.f55165c = rectF;
            this.f55164b = path;
        }
    }

    public q() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f55150a[i10] = new r();
            this.f55151b[i10] = new Matrix();
            this.f55152c[i10] = new Matrix();
        }
    }

    private float a(int i10) {
        return ((i10 + 1) % 4) * 90;
    }

    private void b(@n0 c cVar, int i10) {
        this.f55157h[0] = this.f55150a[i10].l();
        this.f55157h[1] = this.f55150a[i10].m();
        this.f55151b[i10].mapPoints(this.f55157h);
        if (i10 == 0) {
            Path path = cVar.f55164b;
            float[] fArr = this.f55157h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f55164b;
            float[] fArr2 = this.f55157h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f55150a[i10].d(this.f55151b[i10], cVar.f55164b);
        b bVar = cVar.f55166d;
        if (bVar != null) {
            bVar.a(this.f55150a[i10], this.f55151b[i10], i10);
        }
    }

    private void c(@n0 c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f55157h[0] = this.f55150a[i10].j();
        this.f55157h[1] = this.f55150a[i10].k();
        this.f55151b[i10].mapPoints(this.f55157h);
        this.f55158i[0] = this.f55150a[i11].l();
        this.f55158i[1] = this.f55150a[i11].m();
        this.f55151b[i11].mapPoints(this.f55158i);
        float[] fArr = this.f55157h;
        float f10 = fArr[0];
        float[] fArr2 = this.f55158i;
        float fMax = Math.max(((float) Math.hypot(f10 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float fI = i(cVar.f55165c, i10);
        this.f55156g.q(0.0f, 0.0f);
        h hVarJ = j(i10, cVar.f55163a);
        hVarJ.b(fMax, fI, cVar.f55167e, this.f55156g);
        this.f55159j.reset();
        this.f55156g.d(this.f55152c[i10], this.f55159j);
        if (this.f55161l && (hVarJ.a() || l(this.f55159j, i10) || l(this.f55159j, i11))) {
            Path path = this.f55159j;
            path.op(path, this.f55155f, Path.Op.DIFFERENCE);
            this.f55157h[0] = this.f55156g.l();
            this.f55157h[1] = this.f55156g.m();
            this.f55152c[i10].mapPoints(this.f55157h);
            Path path2 = this.f55154e;
            float[] fArr3 = this.f55157h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f55156g.d(this.f55152c[i10], this.f55154e);
        } else {
            this.f55156g.d(this.f55152c[i10], cVar.f55164b);
        }
        b bVar = cVar.f55166d;
        if (bVar != null) {
            bVar.b(this.f55156g, this.f55152c[i10], i10);
        }
    }

    private void f(int i10, @n0 RectF rectF, @n0 PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private e g(int i10, @n0 p pVar) {
        if (i10 == 1) {
            return pVar.l();
        }
        if (i10 != 2) {
            return i10 != 3 ? pVar.t() : pVar.r();
        }
        return pVar.j();
    }

    private f h(int i10, @n0 p pVar) {
        if (i10 == 1) {
            return pVar.k();
        }
        if (i10 != 2) {
            return i10 != 3 ? pVar.s() : pVar.q();
        }
        return pVar.i();
    }

    private float i(@n0 RectF rectF, int i10) {
        float[] fArr = this.f55157h;
        r rVar = this.f55150a[i10];
        fArr[0] = rVar.f55172c;
        fArr[1] = rVar.f55173d;
        this.f55151b[i10].mapPoints(fArr);
        return (i10 == 1 || i10 == 3) ? Math.abs(rectF.centerX() - this.f55157h[0]) : Math.abs(rectF.centerY() - this.f55157h[1]);
    }

    private h j(int i10, @n0 p pVar) {
        if (i10 == 1) {
            return pVar.h();
        }
        if (i10 != 2) {
            return i10 != 3 ? pVar.o() : pVar.p();
        }
        return pVar.n();
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @i1
    public static q k() {
        return a.f55162a;
    }

    @w0(19)
    private boolean l(Path path, int i10) {
        this.f55160k.reset();
        this.f55150a[i10].d(this.f55151b[i10], this.f55160k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f55160k.computeBounds(rectF, true);
        path.op(this.f55160k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void m(@n0 c cVar, int i10) {
        h(i10, cVar.f55163a).c(this.f55150a[i10], 90.0f, cVar.f55167e, cVar.f55165c, g(i10, cVar.f55163a));
        float fA = a(i10);
        this.f55151b[i10].reset();
        f(i10, cVar.f55165c, this.f55153d);
        Matrix matrix = this.f55151b[i10];
        PointF pointF = this.f55153d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f55151b[i10].preRotate(fA);
    }

    private void o(int i10) {
        this.f55157h[0] = this.f55150a[i10].j();
        this.f55157h[1] = this.f55150a[i10].k();
        this.f55151b[i10].mapPoints(this.f55157h);
        float fA = a(i10);
        this.f55152c[i10].reset();
        Matrix matrix = this.f55152c[i10];
        float[] fArr = this.f55157h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f55152c[i10].preRotate(fA);
    }

    public void d(p pVar, float f10, RectF rectF, @n0 Path path) {
        e(pVar, f10, rectF, null, path);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void e(p pVar, float f10, RectF rectF, b bVar, @n0 Path path) {
        path.rewind();
        this.f55154e.rewind();
        this.f55155f.rewind();
        this.f55155f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(pVar, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m(cVar, i10);
            o(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f55154e.close();
        if (this.f55154e.isEmpty()) {
            return;
        }
        path.op(this.f55154e, Path.Op.UNION);
    }

    void n(boolean z10) {
        this.f55161l = z10;
    }
}
