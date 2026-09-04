package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.p0;
import androidx.annotation.x;
import androidx.collection.x0;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.j;
import com.airbnb.lottie.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: CompositionLayer.java */
/* JADX INFO: loaded from: classes6.dex */
public class b extends com.airbnb.lottie.model.layer.a {

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> F;
    private final List<com.airbnb.lottie.model.layer.a> G;
    private final RectF H;
    private final RectF I;
    private final Paint J;

    @p0
    private Boolean K;

    @p0
    private Boolean L;

    /* JADX INFO: compiled from: CompositionLayer.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37642a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f37642a = iArr;
            try {
                iArr[Layer.MatteType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37642a[Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(j jVar, Layer layer, List<Layer> list, com.airbnb.lottie.g gVar) {
        int i10;
        com.airbnb.lottie.model.layer.a aVar;
        super(jVar, layer);
        this.G = new ArrayList();
        this.H = new RectF();
        this.I = new RectF();
        this.J = new Paint();
        com.airbnb.lottie.model.animatable.b bVarU = layer.u();
        if (bVarU != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarQ = bVarU.q();
            this.F = aVarQ;
            i(aVarQ);
            this.F.a(this);
        } else {
            this.F = null;
        }
        x0 x0Var = new x0(gVar.k().size());
        int size = list.size() - 1;
        com.airbnb.lottie.model.layer.a aVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            com.airbnb.lottie.model.layer.a aVarU = com.airbnb.lottie.model.layer.a.u(this, layer2, jVar, gVar);
            if (aVarU != null) {
                x0Var.m(aVarU.y().d(), aVarU);
                if (aVar2 != null) {
                    aVar2.H(aVarU);
                    aVar2 = null;
                } else {
                    this.G.add(0, aVarU);
                    int i11 = a.f37642a[layer2.h().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        aVar2 = aVarU;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < x0Var.v(); i10++) {
            com.airbnb.lottie.model.layer.a aVar3 = (com.airbnb.lottie.model.layer.a) x0Var.g(x0Var.l(i10));
            if (aVar3 != null && (aVar = (com.airbnb.lottie.model.layer.a) x0Var.g(aVar3.y().j())) != null) {
                aVar3.J(aVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    protected void G(com.airbnb.lottie.model.d dVar, int i10, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        for (int i11 = 0; i11 < this.G.size(); i11++) {
            this.G.get(i11).g(dVar, i10, list, dVar2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void I(boolean z10) {
        super.I(z10);
        Iterator<com.airbnb.lottie.model.layer.a> it = this.G.iterator();
        while (it.hasNext()) {
            it.next().I(z10);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void K(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        super.K(f10);
        if (this.F != null) {
            f10 = ((this.F.h().floatValue() * this.f37627o.b().i()) - this.f37627o.b().r()) / (this.f37626n.x().e() + 0.01f);
        }
        if (this.F == null) {
            f10 -= this.f37627o.r();
        }
        if (this.f37627o.v() != 0.0f && !"__container".equals(this.f37627o.i())) {
            f10 /= this.f37627o.v();
        }
        for (int size = this.G.size() - 1; size >= 0; size--) {
            this.G.get(size).K(f10);
        }
    }

    public boolean N() {
        if (this.L == null) {
            for (int size = this.G.size() - 1; size >= 0; size--) {
                com.airbnb.lottie.model.layer.a aVar = this.G.get(size);
                if (aVar instanceof e) {
                    if (aVar.z()) {
                        this.L = Boolean.TRUE;
                        return true;
                    }
                } else if ((aVar instanceof b) && ((b) aVar).N()) {
                    this.L = Boolean.TRUE;
                    return true;
                }
            }
            this.L = Boolean.FALSE;
        }
        return this.L.booleanValue();
    }

    public boolean O() {
        if (this.K == null) {
            if (A()) {
                this.K = Boolean.TRUE;
                return true;
            }
            for (int size = this.G.size() - 1; size >= 0; size--) {
                if (this.G.get(size).A()) {
                    this.K = Boolean.TRUE;
                    return true;
                }
            }
            this.K = Boolean.FALSE;
        }
        return this.K.booleanValue();
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.animation.content.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        for (int size = this.G.size() - 1; size >= 0; size--) {
            this.H.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.G.get(size).a(this.H, this.f37625m, true);
            rectF.union(this.H);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.model.e
    public <T> void f(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        super.f(t10, jVar);
        if (t10 == o.E) {
            if (jVar == null) {
                com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar = this.F;
                if (aVar != null) {
                    aVar.n(null);
                    return;
                }
                return;
            }
            q qVar = new q(jVar);
            this.F = qVar;
            qVar.a(this);
            i(this.F);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    void t(Canvas canvas, Matrix matrix, int i10) {
        com.airbnb.lottie.e.a("CompositionLayer#draw");
        this.I.set(0.0f, 0.0f, this.f37627o.l(), this.f37627o.k());
        matrix.mapRect(this.I);
        boolean z10 = this.f37626n.S() && this.G.size() > 1 && i10 != 255;
        if (z10) {
            this.J.setAlpha(i10);
            com.airbnb.lottie.utils.j.n(canvas, this.I, this.J);
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.G.size() - 1; size >= 0; size--) {
            if (!this.I.isEmpty() ? canvas.clipRect(this.I) : true) {
                this.G.get(size).c(canvas, matrix, i10);
            }
        }
        canvas.restore();
        com.airbnb.lottie.e.b("CompositionLayer#draw");
    }
}
