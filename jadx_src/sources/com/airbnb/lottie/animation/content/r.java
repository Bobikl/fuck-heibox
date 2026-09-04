package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.List;

/* JADX INFO: compiled from: ShapeContent.java */
/* JADX INFO: loaded from: classes6.dex */
public class r implements n, com.airbnb.lottie.animation.keyframe.a.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f37234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.j f37235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Path> f37236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f37237f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f37232a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f37238g = new b();

    public r(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.l lVar) {
        this.f37233b = lVar.b();
        this.f37234c = lVar.d();
        this.f37235d = jVar;
        com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.i, Path> aVarQ = lVar.c().q();
        this.f37236e = aVarQ;
        aVar.i(aVarQ);
        aVarQ.a(this);
    }

    private void b() {
        this.f37237f = false;
        this.f37235d.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void d() {
        b();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void e(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof t) {
                t tVar = (t) cVar;
                if (tVar.i() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f37238g.a(tVar);
                    tVar.b(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f37233b;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        if (this.f37237f) {
            return this.f37232a;
        }
        this.f37232a.reset();
        if (this.f37234c) {
            this.f37237f = true;
            return this.f37232a;
        }
        this.f37232a.set(this.f37236e.h());
        this.f37232a.setFillType(Path.FillType.EVEN_ODD);
        this.f37238g.b(this.f37232a);
        this.f37237f = true;
        return this.f37232a;
    }
}
