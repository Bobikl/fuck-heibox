package androidx.dynamicanimation.animation;

import androidx.annotation.x;

/* JADX INFO: compiled from: FlingAnimation.java */
/* JADX INFO: loaded from: classes6.dex */
public final class c extends b<c> {
    private final a G;

    /* JADX INFO: compiled from: FlingAnimation.java */
    public static final class a implements f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final float f22901d = -4.2f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final float f22902e = 62.5f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f22904b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f22903a = f22901d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b.p f22905c = new b.p();

        a() {
        }

        @Override // androidx.dynamicanimation.animation.f
        public float a(float f10, float f11) {
            return f11 * this.f22903a;
        }

        @Override // androidx.dynamicanimation.animation.f
        public boolean b(float f10, float f11) {
            return Math.abs(f11) < this.f22904b;
        }

        float c() {
            return this.f22903a / f22901d;
        }

        void d(float f10) {
            this.f22903a = f10 * f22901d;
        }

        void e(float f10) {
            this.f22904b = f10 * f22902e;
        }

        b.p f(float f10, float f11, long j10) {
            float f12 = j10;
            this.f22905c.f22900b = (float) (((double) f11) * Math.exp((f12 / 1000.0f) * this.f22903a));
            b.p pVar = this.f22905c;
            float f13 = this.f22903a;
            pVar.f22899a = (float) (((double) (f10 - (f11 / f13))) + (((double) (f11 / f13)) * Math.exp((f13 * f12) / 1000.0f)));
            b.p pVar2 = this.f22905c;
            if (b(pVar2.f22899a, pVar2.f22900b)) {
                this.f22905c.f22900b = 0.0f;
            }
            return this.f22905c;
        }
    }

    public c(e eVar) {
        super(eVar);
        a aVar = new a();
        this.G = aVar;
        aVar.e(i());
    }

    public <K> c(K k10, d<K> dVar) {
        super(k10, dVar);
        a aVar = new a();
        this.G = aVar;
        aVar.e(i());
    }

    public c A(@x(from = 0.0d, fromInclusive = false) float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Friction must be positive");
        }
        this.G.d(f10);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public c p(float f10) {
        super.p(f10);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public c q(float f10) {
        super.q(f10);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public c u(float f10) {
        super.u(f10);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    float f(float f10, float f11) {
        return this.G.a(f10, f11);
    }

    @Override // androidx.dynamicanimation.animation.b
    boolean j(float f10, float f11) {
        return f10 >= this.f22891g || f10 <= this.f22892h || this.G.b(f10, f11);
    }

    @Override // androidx.dynamicanimation.animation.b
    void v(float f10) {
        this.G.e(f10);
    }

    @Override // androidx.dynamicanimation.animation.b
    boolean y(long j10) {
        b.p pVarF = this.G.f(this.f22886b, this.f22885a, j10);
        float f10 = pVarF.f22899a;
        this.f22886b = f10;
        float f11 = pVarF.f22900b;
        this.f22885a = f11;
        float f12 = this.f22892h;
        if (f10 < f12) {
            this.f22886b = f12;
            return true;
        }
        float f13 = this.f22891g;
        if (f10 <= f13) {
            return j(f10, f11);
        }
        this.f22886b = f13;
        return true;
    }

    public float z() {
        return this.G.c();
    }
}
