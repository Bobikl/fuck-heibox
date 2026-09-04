package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import androidx.annotation.x;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ShapeData.java */
/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.a> f37562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PointF f37563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37564c;

    public i() {
        this.f37562a = new ArrayList();
    }

    public i(PointF pointF, boolean z10, List<com.airbnb.lottie.model.a> list) {
        this.f37563b = pointF;
        this.f37564c = z10;
        this.f37562a = new ArrayList(list);
    }

    private void e(float f10, float f11) {
        if (this.f37563b == null) {
            this.f37563b = new PointF();
        }
        this.f37563b.set(f10, f11);
    }

    public List<com.airbnb.lottie.model.a> a() {
        return this.f37562a;
    }

    public PointF b() {
        return this.f37563b;
    }

    public void c(i iVar, i iVar2, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        if (this.f37563b == null) {
            this.f37563b = new PointF();
        }
        this.f37564c = iVar.d() || iVar2.d();
        if (iVar.a().size() != iVar2.a().size()) {
            com.airbnb.lottie.utils.f.e("Curves must have the same number of control points. Shape 1: " + iVar.a().size() + "\tShape 2: " + iVar2.a().size());
        }
        int iMin = Math.min(iVar.a().size(), iVar2.a().size());
        if (this.f37562a.size() < iMin) {
            for (int size = this.f37562a.size(); size < iMin; size++) {
                this.f37562a.add(new com.airbnb.lottie.model.a());
            }
        } else if (this.f37562a.size() > iMin) {
            for (int size2 = this.f37562a.size() - 1; size2 >= iMin; size2--) {
                List<com.airbnb.lottie.model.a> list = this.f37562a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFB = iVar.b();
        PointF pointFB2 = iVar2.b();
        e(com.airbnb.lottie.utils.i.k(pointFB.x, pointFB2.x, f10), com.airbnb.lottie.utils.i.k(pointFB.y, pointFB2.y, f10));
        for (int size3 = this.f37562a.size() - 1; size3 >= 0; size3--) {
            com.airbnb.lottie.model.a aVar = iVar.a().get(size3);
            com.airbnb.lottie.model.a aVar2 = iVar2.a().get(size3);
            PointF pointFA = aVar.a();
            PointF pointFB3 = aVar.b();
            PointF pointFC = aVar.c();
            PointF pointFA2 = aVar2.a();
            PointF pointFB4 = aVar2.b();
            PointF pointFC2 = aVar2.c();
            this.f37562a.get(size3).d(com.airbnb.lottie.utils.i.k(pointFA.x, pointFA2.x, f10), com.airbnb.lottie.utils.i.k(pointFA.y, pointFA2.y, f10));
            this.f37562a.get(size3).e(com.airbnb.lottie.utils.i.k(pointFB3.x, pointFB4.x, f10), com.airbnb.lottie.utils.i.k(pointFB3.y, pointFB4.y, f10));
            this.f37562a.get(size3).f(com.airbnb.lottie.utils.i.k(pointFC.x, pointFC2.x, f10), com.airbnb.lottie.utils.i.k(pointFC.y, pointFC2.y, f10));
        }
    }

    public boolean d() {
        return this.f37564c;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f37562a.size() + "closed=" + this.f37564c + '}';
    }
}
