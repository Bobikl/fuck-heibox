package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.p0;
import androidx.annotation.x;
import androidx.core.view.j1;
import com.airbnb.lottie.animation.keyframe.p;
import com.airbnb.lottie.j;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: BaseLayer.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a implements com.airbnb.lottie.animation.content.e, com.airbnb.lottie.animation.keyframe.a.b, com.airbnb.lottie.model.e {
    private static final int B = 2;
    private static final int C = 16;
    private static final int D = 1;
    private static final int E = 19;

    @p0
    BlurMaskFilter A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f37613a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix f37614b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f37615c = new z3.a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f37616d = new z3.a(1, PorterDuff.Mode.DST_IN);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f37617e = new z3.a(1, PorterDuff.Mode.DST_OUT);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f37618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f37619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RectF f37620h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f37621i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final RectF f37622j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final RectF f37623k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f37624l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final Matrix f37625m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final j f37626n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final Layer f37627o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.h f37628p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.d f37629q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private a f37630r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private a f37631s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<a> f37632t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final List<com.airbnb.lottie.animation.keyframe.a<?, ?>> f37633u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final p f37634v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f37635w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f37636x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @p0
    private Paint f37637y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    float f37638z;

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseLayer.java */
    public class C0287a implements com.airbnb.lottie.animation.keyframe.a.b {
        C0287a() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.b
        public void d() {
            a aVar = a.this;
            aVar.L(aVar.f37629q.p() == 1.0f);
        }
    }

    /* JADX INFO: compiled from: BaseLayer.java */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f37641b;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            f37641b = iArr;
            try {
                iArr[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37641b[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37641b[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37641b[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            f37640a = iArr2;
            try {
                iArr2[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37640a[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37640a[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37640a[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37640a[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37640a[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37640a[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    a(j jVar, Layer layer) {
        z3.a aVar = new z3.a(1);
        this.f37618f = aVar;
        this.f37619g = new z3.a(PorterDuff.Mode.CLEAR);
        this.f37620h = new RectF();
        this.f37621i = new RectF();
        this.f37622j = new RectF();
        this.f37623k = new RectF();
        this.f37625m = new Matrix();
        this.f37633u = new ArrayList();
        this.f37635w = true;
        this.f37638z = 0.0f;
        this.f37626n = jVar;
        this.f37627o = layer;
        this.f37624l = layer.i() + "#draw";
        if (layer.h() == Layer.MatteType.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        p pVarB = layer.w().b();
        this.f37634v = pVarB;
        pVarB.b(this);
        if (layer.g() != null && !layer.g().isEmpty()) {
            com.airbnb.lottie.animation.keyframe.h hVar = new com.airbnb.lottie.animation.keyframe.h(layer.g());
            this.f37628p = hVar;
            Iterator<com.airbnb.lottie.animation.keyframe.a<i, Path>> it = hVar.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            for (com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2 : this.f37628p.c()) {
                i(aVar2);
                aVar2.a(this);
            }
        }
        M();
    }

    private void B(RectF rectF, Matrix matrix) {
        this.f37621i.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (z()) {
            int size = this.f37628p.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                Mask mask = this.f37628p.b().get(i10);
                this.f37613a.set(this.f37628p.a().get(i10).h());
                this.f37613a.transform(matrix);
                int i11 = b.f37641b[mask.a().ordinal()];
                if (i11 == 1 || i11 == 2) {
                    return;
                }
                if ((i11 == 3 || i11 == 4) && mask.d()) {
                    return;
                }
                this.f37613a.computeBounds(this.f37623k, false);
                if (i10 == 0) {
                    this.f37621i.set(this.f37623k);
                } else {
                    RectF rectF2 = this.f37621i;
                    rectF2.set(Math.min(rectF2.left, this.f37623k.left), Math.min(this.f37621i.top, this.f37623k.top), Math.max(this.f37621i.right, this.f37623k.right), Math.max(this.f37621i.bottom, this.f37623k.bottom));
                }
            }
            if (rectF.intersect(this.f37621i)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void C(RectF rectF, Matrix matrix) {
        if (A() && this.f37627o.h() != Layer.MatteType.INVERT) {
            this.f37622j.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f37630r.a(this.f37622j, matrix, true);
            if (rectF.intersect(this.f37622j)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void D() {
        this.f37626n.invalidateSelf();
    }

    private void E(float f10) {
        this.f37626n.x().o().e(this.f37627o.i(), f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(boolean z10) {
        if (z10 != this.f37635w) {
            this.f37635w = z10;
            D();
        }
    }

    private void M() {
        if (this.f37627o.e().isEmpty()) {
            L(true);
            return;
        }
        com.airbnb.lottie.animation.keyframe.d dVar = new com.airbnb.lottie.animation.keyframe.d(this.f37627o.e());
        this.f37629q = dVar;
        dVar.l();
        this.f37629q.a(new C0287a());
        L(this.f37629q.h().floatValue() == 1.0f);
        i(this.f37629q);
    }

    private void j(Canvas canvas, Matrix matrix, Mask mask, com.airbnb.lottie.animation.keyframe.a<i, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        this.f37613a.set(aVar.h());
        this.f37613a.transform(matrix);
        this.f37615c.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f37613a, this.f37615c);
    }

    private void k(Canvas canvas, Matrix matrix, Mask mask, com.airbnb.lottie.animation.keyframe.a<i, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        com.airbnb.lottie.utils.j.n(canvas, this.f37620h, this.f37616d);
        this.f37613a.set(aVar.h());
        this.f37613a.transform(matrix);
        this.f37615c.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f37613a, this.f37615c);
        canvas.restore();
    }

    private void l(Canvas canvas, Matrix matrix, Mask mask, com.airbnb.lottie.animation.keyframe.a<i, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        com.airbnb.lottie.utils.j.n(canvas, this.f37620h, this.f37615c);
        canvas.drawRect(this.f37620h, this.f37615c);
        this.f37613a.set(aVar.h());
        this.f37613a.transform(matrix);
        this.f37615c.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f37613a, this.f37617e);
        canvas.restore();
    }

    private void m(Canvas canvas, Matrix matrix, Mask mask, com.airbnb.lottie.animation.keyframe.a<i, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        com.airbnb.lottie.utils.j.n(canvas, this.f37620h, this.f37616d);
        canvas.drawRect(this.f37620h, this.f37615c);
        this.f37617e.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f37613a.set(aVar.h());
        this.f37613a.transform(matrix);
        canvas.drawPath(this.f37613a, this.f37617e);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix, Mask mask, com.airbnb.lottie.animation.keyframe.a<i, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        com.airbnb.lottie.utils.j.n(canvas, this.f37620h, this.f37617e);
        canvas.drawRect(this.f37620h, this.f37615c);
        this.f37617e.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f37613a.set(aVar.h());
        this.f37613a.transform(matrix);
        canvas.drawPath(this.f37613a, this.f37617e);
        canvas.restore();
    }

    private void o(Canvas canvas, Matrix matrix) {
        com.airbnb.lottie.e.a("Layer#saveLayer");
        com.airbnb.lottie.utils.j.o(canvas, this.f37620h, this.f37616d, 19);
        if (Build.VERSION.SDK_INT < 28) {
            s(canvas);
        }
        com.airbnb.lottie.e.b("Layer#saveLayer");
        for (int i10 = 0; i10 < this.f37628p.b().size(); i10++) {
            Mask mask = this.f37628p.b().get(i10);
            com.airbnb.lottie.animation.keyframe.a<i, Path> aVar = this.f37628p.a().get(i10);
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2 = this.f37628p.c().get(i10);
            int i11 = b.f37641b[mask.a().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.f37615c.setColor(j1.f21601t);
                        this.f37615c.setAlpha(255);
                        canvas.drawRect(this.f37620h, this.f37615c);
                    }
                    if (mask.d()) {
                        n(canvas, matrix, mask, aVar, aVar2);
                    } else {
                        p(canvas, matrix, mask, aVar, aVar2);
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (mask.d()) {
                            l(canvas, matrix, mask, aVar, aVar2);
                        } else {
                            j(canvas, matrix, mask, aVar, aVar2);
                        }
                    }
                } else if (mask.d()) {
                    m(canvas, matrix, mask, aVar, aVar2);
                } else {
                    k(canvas, matrix, mask, aVar, aVar2);
                }
            } else if (q()) {
                this.f37615c.setAlpha(255);
                canvas.drawRect(this.f37620h, this.f37615c);
            }
        }
        com.airbnb.lottie.e.a("Layer#restoreLayer");
        canvas.restore();
        com.airbnb.lottie.e.b("Layer#restoreLayer");
    }

    private void p(Canvas canvas, Matrix matrix, Mask mask, com.airbnb.lottie.animation.keyframe.a<i, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        this.f37613a.set(aVar.h());
        this.f37613a.transform(matrix);
        canvas.drawPath(this.f37613a, this.f37617e);
    }

    private boolean q() {
        if (this.f37628p.a().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f37628p.b().size(); i10++) {
            if (this.f37628p.b().get(i10).a() != Mask.MaskMode.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void r() {
        if (this.f37632t != null) {
            return;
        }
        if (this.f37631s == null) {
            this.f37632t = Collections.emptyList();
            return;
        }
        this.f37632t = new ArrayList();
        for (a aVar = this.f37631s; aVar != null; aVar = aVar.f37631s) {
            this.f37632t.add(aVar);
        }
    }

    private void s(Canvas canvas) {
        com.airbnb.lottie.e.a("Layer#clearLayer");
        RectF rectF = this.f37620h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f37619g);
        com.airbnb.lottie.e.b("Layer#clearLayer");
    }

    @p0
    static a u(com.airbnb.lottie.model.layer.b bVar, Layer layer, j jVar, com.airbnb.lottie.g gVar) {
        switch (b.f37640a[layer.f().ordinal()]) {
            case 1:
                return new e(jVar, layer, bVar);
            case 2:
                return new com.airbnb.lottie.model.layer.b(jVar, layer, gVar.p(layer.m()), gVar);
            case 3:
                return new f(jVar, layer);
            case 4:
                return new c(jVar, layer);
            case 5:
                return new d(jVar, layer);
            case 6:
                return new g(jVar, layer);
            default:
                com.airbnb.lottie.utils.f.e("Unknown layer type " + layer.f());
                return null;
        }
    }

    boolean A() {
        return this.f37630r != null;
    }

    public void F(com.airbnb.lottie.animation.keyframe.a<?, ?> aVar) {
        this.f37633u.remove(aVar);
    }

    void G(com.airbnb.lottie.model.d dVar, int i10, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
    }

    void H(@p0 a aVar) {
        this.f37630r = aVar;
    }

    void I(boolean z10) {
        if (z10 && this.f37637y == null) {
            this.f37637y = new z3.a();
        }
        this.f37636x = z10;
    }

    void J(@p0 a aVar) {
        this.f37631s = aVar;
    }

    void K(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        this.f37634v.j(f10);
        if (this.f37628p != null) {
            for (int i10 = 0; i10 < this.f37628p.a().size(); i10++) {
                this.f37628p.a().get(i10).m(f10);
            }
        }
        com.airbnb.lottie.animation.keyframe.d dVar = this.f37629q;
        if (dVar != null) {
            dVar.m(f10);
        }
        a aVar = this.f37630r;
        if (aVar != null) {
            aVar.K(f10);
        }
        for (int i11 = 0; i11 < this.f37633u.size(); i11++) {
            this.f37633u.get(i11).m(f10);
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    @androidx.annotation.i
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        this.f37620h.set(0.0f, 0.0f, 0.0f, 0.0f);
        r();
        this.f37625m.set(matrix);
        if (z10) {
            List<a> list = this.f37632t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f37625m.preConcat(this.f37632t.get(size).f37634v.f());
                }
            } else {
                a aVar = this.f37631s;
                if (aVar != null) {
                    this.f37625m.preConcat(aVar.f37634v.f());
                }
            }
        }
        this.f37625m.preConcat(this.f37634v.f());
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void c(Canvas canvas, Matrix matrix, int i10) {
        Paint paint;
        com.airbnb.lottie.e.a(this.f37624l);
        if (!this.f37635w || this.f37627o.x()) {
            com.airbnb.lottie.e.b(this.f37624l);
            return;
        }
        r();
        com.airbnb.lottie.e.a("Layer#parentMatrix");
        this.f37614b.reset();
        this.f37614b.set(matrix);
        for (int size = this.f37632t.size() - 1; size >= 0; size--) {
            this.f37614b.preConcat(this.f37632t.get(size).f37634v.f());
        }
        com.airbnb.lottie.e.b("Layer#parentMatrix");
        int iIntValue = (int) ((((i10 / 255.0f) * (this.f37634v.h() == null ? 100 : this.f37634v.h().h().intValue())) / 100.0f) * 255.0f);
        if (!A() && !z()) {
            this.f37614b.preConcat(this.f37634v.f());
            com.airbnb.lottie.e.a("Layer#drawLayer");
            t(canvas, this.f37614b, iIntValue);
            com.airbnb.lottie.e.b("Layer#drawLayer");
            E(com.airbnb.lottie.e.b(this.f37624l));
            return;
        }
        com.airbnb.lottie.e.a("Layer#computeBounds");
        a(this.f37620h, this.f37614b, false);
        C(this.f37620h, matrix);
        this.f37614b.preConcat(this.f37634v.f());
        B(this.f37620h, this.f37614b);
        if (!this.f37620h.intersect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight())) {
            this.f37620h.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        com.airbnb.lottie.e.b("Layer#computeBounds");
        if (this.f37620h.width() >= 1.0f && this.f37620h.height() >= 1.0f) {
            com.airbnb.lottie.e.a("Layer#saveLayer");
            this.f37615c.setAlpha(255);
            com.airbnb.lottie.utils.j.n(canvas, this.f37620h, this.f37615c);
            com.airbnb.lottie.e.b("Layer#saveLayer");
            s(canvas);
            com.airbnb.lottie.e.a("Layer#drawLayer");
            t(canvas, this.f37614b, iIntValue);
            com.airbnb.lottie.e.b("Layer#drawLayer");
            if (z()) {
                o(canvas, this.f37614b);
            }
            if (A()) {
                com.airbnb.lottie.e.a("Layer#drawMatte");
                com.airbnb.lottie.e.a("Layer#saveLayer");
                com.airbnb.lottie.utils.j.o(canvas, this.f37620h, this.f37618f, 19);
                com.airbnb.lottie.e.b("Layer#saveLayer");
                s(canvas);
                this.f37630r.c(canvas, matrix, iIntValue);
                com.airbnb.lottie.e.a("Layer#restoreLayer");
                canvas.restore();
                com.airbnb.lottie.e.b("Layer#restoreLayer");
                com.airbnb.lottie.e.b("Layer#drawMatte");
            }
            com.airbnb.lottie.e.a("Layer#restoreLayer");
            canvas.restore();
            com.airbnb.lottie.e.b("Layer#restoreLayer");
        }
        if (this.f37636x && (paint = this.f37637y) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.f37637y.setColor(-251901);
            this.f37637y.setStrokeWidth(4.0f);
            canvas.drawRect(this.f37620h, this.f37637y);
            this.f37637y.setStyle(Paint.Style.FILL);
            this.f37637y.setColor(1357638635);
            canvas.drawRect(this.f37620h, this.f37637y);
        }
        E(com.airbnb.lottie.e.b(this.f37624l));
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void d() {
        D();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void e(List<com.airbnb.lottie.animation.content.c> list, List<com.airbnb.lottie.animation.content.c> list2) {
    }

    @Override // com.airbnb.lottie.model.e
    @androidx.annotation.i
    public <T> void f(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        this.f37634v.c(t10, jVar);
    }

    @Override // com.airbnb.lottie.model.e
    public void g(com.airbnb.lottie.model.d dVar, int i10, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        a aVar = this.f37630r;
        if (aVar != null) {
            com.airbnb.lottie.model.d dVarA = dVar2.a(aVar.getName());
            if (dVar.c(this.f37630r.getName(), i10)) {
                list.add(dVarA.j(this.f37630r));
            }
            if (dVar.i(getName(), i10)) {
                this.f37630r.G(dVar, dVar.e(this.f37630r.getName(), i10) + i10, list, dVarA);
            }
        }
        if (dVar.h(getName(), i10)) {
            if (!"__container".equals(getName())) {
                dVar2 = dVar2.a(getName());
                if (dVar.c(getName(), i10)) {
                    list.add(dVar2.j(this));
                }
            }
            if (dVar.i(getName(), i10)) {
                G(dVar, i10 + dVar.e(getName(), i10), list, dVar2);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f37627o.i();
    }

    public void i(@p0 com.airbnb.lottie.animation.keyframe.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f37633u.add(aVar);
    }

    abstract void t(Canvas canvas, Matrix matrix, int i10);

    @p0
    public com.airbnb.lottie.model.content.a v() {
        return this.f37627o.a();
    }

    public BlurMaskFilter w(float f10) {
        if (this.f37638z == f10) {
            return this.A;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.A = blurMaskFilter;
        this.f37638z = f10;
        return blurMaskFilter;
    }

    @p0
    public com.airbnb.lottie.parser.j x() {
        return this.f37627o.c();
    }

    Layer y() {
        return this.f37627o;
    }

    boolean z() {
        com.airbnb.lottie.animation.keyframe.h hVar = this.f37628p;
        return (hVar == null || hVar.a().isEmpty()) ? false : true;
    }
}
