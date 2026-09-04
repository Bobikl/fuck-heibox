package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ContentGroup.java */
/* JADX INFO: loaded from: classes6.dex */
public class d implements e, n, com.airbnb.lottie.animation.keyframe.a.b, com.airbnb.lottie.model.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f37124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RectF f37125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f37126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Path f37127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f37128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f37129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f37130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<c> f37131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.j f37132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private List<n> f37133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.p f37134k;

    public d(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.k kVar) {
        this(jVar, aVar, kVar.c(), kVar.d(), b(jVar, aVar, kVar.b()), h(kVar.b()));
    }

    d(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar, String str, boolean z10, List<c> list, @p0 com.airbnb.lottie.model.animatable.l lVar) {
        this.f37124a = new z3.a();
        this.f37125b = new RectF();
        this.f37126c = new Matrix();
        this.f37127d = new Path();
        this.f37128e = new RectF();
        this.f37129f = str;
        this.f37132i = jVar;
        this.f37130g = z10;
        this.f37131h = list;
        if (lVar != null) {
            com.airbnb.lottie.animation.keyframe.p pVarB = lVar.b();
            this.f37134k = pVarB;
            pVarB.a(aVar);
            this.f37134k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).b(list.listIterator(list.size()));
        }
    }

    private static List<c> b(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar, List<com.airbnb.lottie.model.content.c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVarA = list.get(i10).a(jVar, aVar);
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return arrayList;
    }

    @p0
    static com.airbnb.lottie.model.animatable.l h(List<com.airbnb.lottie.model.content.c> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.airbnb.lottie.model.content.c cVar = list.get(i10);
            if (cVar instanceof com.airbnb.lottie.model.animatable.l) {
                return (com.airbnb.lottie.model.animatable.l) cVar;
            }
        }
        return null;
    }

    private boolean k() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f37131h.size(); i11++) {
            if ((this.f37131h.get(i11) instanceof e) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        this.f37126c.set(matrix);
        com.airbnb.lottie.animation.keyframe.p pVar = this.f37134k;
        if (pVar != null) {
            this.f37126c.preConcat(pVar.f());
        }
        this.f37128e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f37131h.size() - 1; size >= 0; size--) {
            c cVar = this.f37131h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).a(this.f37128e, this.f37126c, z10);
                rectF.union(this.f37128e);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void c(Canvas canvas, Matrix matrix, int i10) {
        if (this.f37130g) {
            return;
        }
        this.f37126c.set(matrix);
        com.airbnb.lottie.animation.keyframe.p pVar = this.f37134k;
        if (pVar != null) {
            this.f37126c.preConcat(pVar.f());
            i10 = (int) (((((this.f37134k.h() == null ? 100 : this.f37134k.h().h().intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z10 = this.f37132i.S() && k() && i10 != 255;
        if (z10) {
            this.f37125b.set(0.0f, 0.0f, 0.0f, 0.0f);
            a(this.f37125b, this.f37126c, true);
            this.f37124a.setAlpha(i10);
            com.airbnb.lottie.utils.j.n(canvas, this.f37125b, this.f37124a);
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.f37131h.size() - 1; size >= 0; size--) {
            c cVar = this.f37131h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).c(canvas, this.f37126c, i10);
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void d() {
        this.f37132i.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void e(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f37131h.size());
        arrayList.addAll(list);
        for (int size = this.f37131h.size() - 1; size >= 0; size--) {
            c cVar = this.f37131h.get(size);
            cVar.e(arrayList, this.f37131h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void f(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.p pVar = this.f37134k;
        if (pVar != null) {
            pVar.c(t10, jVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void g(com.airbnb.lottie.model.d dVar, int i10, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        if (dVar.h(getName(), i10) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                dVar2 = dVar2.a(getName());
                if (dVar.c(getName(), i10)) {
                    list.add(dVar2.j(this));
                }
            }
            if (dVar.i(getName(), i10)) {
                int iE = i10 + dVar.e(getName(), i10);
                for (int i11 = 0; i11 < this.f37131h.size(); i11++) {
                    c cVar = this.f37131h.get(i11);
                    if (cVar instanceof com.airbnb.lottie.model.e) {
                        ((com.airbnb.lottie.model.e) cVar).g(dVar, iE, list, dVar2);
                    }
                }
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f37129f;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        this.f37126c.reset();
        com.airbnb.lottie.animation.keyframe.p pVar = this.f37134k;
        if (pVar != null) {
            this.f37126c.set(pVar.f());
        }
        this.f37127d.reset();
        if (this.f37130g) {
            return this.f37127d;
        }
        for (int size = this.f37131h.size() - 1; size >= 0; size--) {
            c cVar = this.f37131h.get(size);
            if (cVar instanceof n) {
                this.f37127d.addPath(((n) cVar).getPath(), this.f37126c);
            }
        }
        return this.f37127d;
    }

    List<n> i() {
        if (this.f37133j == null) {
            this.f37133j = new ArrayList();
            for (int i10 = 0; i10 < this.f37131h.size(); i10++) {
                c cVar = this.f37131h.get(i10);
                if (cVar instanceof n) {
                    this.f37133j.add((n) cVar);
                }
            }
        }
        return this.f37133j;
    }

    Matrix j() {
        com.airbnb.lottie.animation.keyframe.p pVar = this.f37134k;
        if (pVar != null) {
            return pVar.f();
        }
        this.f37126c.reset();
        return this.f37126c;
    }
}
