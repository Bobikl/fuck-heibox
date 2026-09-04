package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.p0;

/* JADX INFO: compiled from: PathKeyframe.java */
/* JADX INFO: loaded from: classes6.dex */
public class i extends com.airbnb.lottie.value.a<PointF> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private Path f37279s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final com.airbnb.lottie.value.a<PointF> f37280t;

    public i(com.airbnb.lottie.g gVar, com.airbnb.lottie.value.a<PointF> aVar) {
        super(gVar, aVar.f37854b, aVar.f37855c, aVar.f37856d, aVar.f37857e, aVar.f37858f, aVar.f37859g, aVar.f37860h);
        this.f37280t = aVar;
        i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i() {
        T t10;
        T t11;
        T t12 = this.f37855c;
        boolean z10 = (t12 == 0 || (t11 = this.f37854b) == 0 || !((PointF) t11).equals(((PointF) t12).x, ((PointF) t12).y)) ? false : true;
        T t13 = this.f37854b;
        if (t13 == 0 || (t10 = this.f37855c) == 0 || z10) {
            return;
        }
        com.airbnb.lottie.value.a<PointF> aVar = this.f37280t;
        this.f37279s = com.airbnb.lottie.utils.j.d((PointF) t13, (PointF) t10, aVar.f37867o, aVar.f37868p);
    }

    @p0
    Path j() {
        return this.f37279s;
    }
}
