package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: TrimPathContent.java */
/* JADX INFO: loaded from: classes6.dex */
public class t implements c, com.airbnb.lottie.animation.keyframe.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f37245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<com.airbnb.lottie.animation.keyframe.a.b> f37246c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ShapeTrimPath.Type f37247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f37248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f37249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f37250g;

    public t(com.airbnb.lottie.model.layer.a aVar, ShapeTrimPath shapeTrimPath) {
        this.f37244a = shapeTrimPath.c();
        this.f37245b = shapeTrimPath.g();
        this.f37247d = shapeTrimPath.f();
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarQ = shapeTrimPath.e().q();
        this.f37248e = aVarQ;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarQ2 = shapeTrimPath.b().q();
        this.f37249f = aVarQ2;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarQ3 = shapeTrimPath.d().q();
        this.f37250g = aVarQ3;
        aVar.i(aVarQ);
        aVar.i(aVarQ2);
        aVar.i(aVarQ3);
        aVarQ.a(this);
        aVarQ2.a(this);
        aVarQ3.a(this);
    }

    void b(com.airbnb.lottie.animation.keyframe.a.b bVar) {
        this.f37246c.add(bVar);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void d() {
        for (int i10 = 0; i10 < this.f37246c.size(); i10++) {
            this.f37246c.get(i10).d();
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void e(List<c> list, List<c> list2) {
    }

    public com.airbnb.lottie.animation.keyframe.a<?, Float> f() {
        return this.f37249f;
    }

    public com.airbnb.lottie.animation.keyframe.a<?, Float> g() {
        return this.f37250g;
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f37244a;
    }

    public com.airbnb.lottie.animation.keyframe.a<?, Float> h() {
        return this.f37248e;
    }

    ShapeTrimPath.Type i() {
        return this.f37247d;
    }

    public boolean j() {
        return this.f37245b;
    }
}
