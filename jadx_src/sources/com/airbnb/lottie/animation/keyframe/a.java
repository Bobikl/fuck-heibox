package com.airbnb.lottie.animation.keyframe;

import android.view.animation.Interpolator;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.x;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: BaseKeyframeAnimation.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a<K, A> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d<K> f37253c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    protected com.airbnb.lottie.value.j<A> f37255e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<b> f37251a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f37252b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected float f37254d = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private A f37256f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f37257g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f37258h = -1.0f;

    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public interface b {
        void d();
    }

    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public static final class c<T> implements d<T> {
        private c() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public com.airbnb.lottie.value.a<T> a() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float b() {
            return 0.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean c(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean d(float f10) {
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float e() {
            return 1.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public interface d<T> {
        com.airbnb.lottie.value.a<T> a();

        @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
        float b();

        boolean c(float f10);

        boolean d(float f10);

        @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
        float e();

        boolean isEmpty();
    }

    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public static final class e<T> implements d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<? extends com.airbnb.lottie.value.a<T>> f37259a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.airbnb.lottie.value.a<T> f37261c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f37262d = -1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @n0
        private com.airbnb.lottie.value.a<T> f37260b = f(0.0f);

        e(List<? extends com.airbnb.lottie.value.a<T>> list) {
            this.f37259a = list;
        }

        private com.airbnb.lottie.value.a<T> f(float f10) {
            List<? extends com.airbnb.lottie.value.a<T>> list = this.f37259a;
            com.airbnb.lottie.value.a<T> aVar = list.get(list.size() - 1);
            if (f10 >= aVar.e()) {
                return aVar;
            }
            for (int size = this.f37259a.size() - 2; size >= 1; size--) {
                com.airbnb.lottie.value.a<T> aVar2 = this.f37259a.get(size);
                if (this.f37260b != aVar2 && aVar2.a(f10)) {
                    return aVar2;
                }
            }
            return this.f37259a.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        @n0
        public com.airbnb.lottie.value.a<T> a() {
            return this.f37260b;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float b() {
            return this.f37259a.get(0).e();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean c(float f10) {
            com.airbnb.lottie.value.a<T> aVar = this.f37261c;
            com.airbnb.lottie.value.a<T> aVar2 = this.f37260b;
            if (aVar == aVar2 && this.f37262d == f10) {
                return true;
            }
            this.f37261c = aVar2;
            this.f37262d = f10;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean d(float f10) {
            if (this.f37260b.a(f10)) {
                return !this.f37260b.h();
            }
            this.f37260b = f(f10);
            return true;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float e() {
            List<? extends com.airbnb.lottie.value.a<T>> list = this.f37259a;
            return list.get(list.size() - 1).b();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public static final class f<T> implements d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        private final com.airbnb.lottie.value.a<T> f37263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f37264b = -1.0f;

        f(List<? extends com.airbnb.lottie.value.a<T>> list) {
            this.f37263a = list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public com.airbnb.lottie.value.a<T> a() {
            return this.f37263a;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float b() {
            return this.f37263a.e();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean c(float f10) {
            if (this.f37264b == f10) {
                return true;
            }
            this.f37264b = f10;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean d(float f10) {
            return !this.f37263a.h();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float e() {
            return this.f37263a.b();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    a(List<? extends com.airbnb.lottie.value.a<K>> list) {
        this.f37253c = o(list);
    }

    @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
    private float g() {
        if (this.f37257g == -1.0f) {
            this.f37257g = this.f37253c.b();
        }
        return this.f37257g;
    }

    private static <T> d<T> o(List<? extends com.airbnb.lottie.value.a<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        return list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.f37251a.add(bVar);
    }

    protected com.airbnb.lottie.value.a<K> b() {
        com.airbnb.lottie.e.a("BaseKeyframeAnimation#getCurrentKeyframe");
        com.airbnb.lottie.value.a<K> aVarA = this.f37253c.a();
        com.airbnb.lottie.e.b("BaseKeyframeAnimation#getCurrentKeyframe");
        return aVarA;
    }

    @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
    float c() {
        if (this.f37258h == -1.0f) {
            this.f37258h = this.f37253c.e();
        }
        return this.f37258h;
    }

    protected float d() {
        com.airbnb.lottie.value.a<K> aVarB = b();
        if (aVarB.h()) {
            return 0.0f;
        }
        return aVarB.f37856d.getInterpolation(e());
    }

    float e() {
        if (this.f37252b) {
            return 0.0f;
        }
        com.airbnb.lottie.value.a<K> aVarB = b();
        if (aVarB.h()) {
            return 0.0f;
        }
        return (this.f37254d - aVarB.e()) / (aVarB.b() - aVarB.e());
    }

    public float f() {
        return this.f37254d;
    }

    public A h() {
        float fE = e();
        if (this.f37255e == null && this.f37253c.c(fE)) {
            return this.f37256f;
        }
        com.airbnb.lottie.value.a<K> aVarB = b();
        Interpolator interpolator = aVarB.f37857e;
        A aI = (interpolator == null || aVarB.f37858f == null) ? i(aVarB, d()) : j(aVarB, fE, interpolator.getInterpolation(fE), aVarB.f37858f.getInterpolation(fE));
        this.f37256f = aI;
        return aI;
    }

    abstract A i(com.airbnb.lottie.value.a<K> aVar, float f10);

    protected A j(com.airbnb.lottie.value.a<K> aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void k() {
        for (int i10 = 0; i10 < this.f37251a.size(); i10++) {
            this.f37251a.get(i10).d();
        }
    }

    public void l() {
        this.f37252b = true;
    }

    public void m(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        if (this.f37253c.isEmpty()) {
            return;
        }
        if (f10 < g()) {
            f10 = g();
        } else if (f10 > c()) {
            f10 = c();
        }
        if (f10 == this.f37254d) {
            return;
        }
        this.f37254d = f10;
        if (this.f37253c.d(f10)) {
            k();
        }
    }

    public void n(@p0 com.airbnb.lottie.value.j<A> jVar) {
        com.airbnb.lottie.value.j<A> jVar2 = this.f37255e;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f37255e = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }
}
