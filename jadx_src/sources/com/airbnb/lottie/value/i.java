package com.airbnb.lottie.value;

import android.graphics.PointF;
import androidx.annotation.n0;

/* JADX INFO: compiled from: LottieRelativePointValueCallback.java */
/* JADX INFO: loaded from: classes6.dex */
public class i extends j<PointF> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PointF f37880d;

    public i() {
        this.f37880d = new PointF();
    }

    public i(@n0 PointF pointF) {
        super(pointF);
        this.f37880d = new PointF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PointF e(b<PointF> bVar) {
        T t10 = this.f37883c;
        if (t10 != 0) {
            return (PointF) t10;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    @Override // com.airbnb.lottie.value.j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final PointF a(b<PointF> bVar) {
        this.f37880d.set(com.airbnb.lottie.utils.i.k(bVar.g().x, bVar.b().x, bVar.c()), com.airbnb.lottie.utils.i.k(bVar.g().y, bVar.b().y, bVar.c()));
        PointF pointFE = e(bVar);
        this.f37880d.offset(pointFE.x, pointFE.y);
        return this.f37880d;
    }
}
