package com.google.android.material.carousel;

import androidx.annotation.n0;
import androidx.annotation.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: KeylineState.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f53488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<C0419c> f53489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f53490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f53491d;

    /* JADX INFO: compiled from: KeylineState.java */
    public static final class b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f53492h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final float f53493i = Float.MIN_VALUE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f53494a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C0419c f53496c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private C0419c f53497d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<C0419c> f53495b = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f53498e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f53499f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f53500g = 0.0f;

        b(float f10) {
            this.f53494a = f10;
        }

        private static float f(float f10, float f11, int i10, int i11) {
            return (f10 - (i10 * f11)) + (i11 * f11);
        }

        @s9.a
        @n0
        b a(float f10, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f11, float f12) {
            return b(f10, f11, f12, false);
        }

        @s9.a
        @n0
        b b(float f10, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f11, float f12, boolean z10) {
            if (f12 <= 0.0f) {
                return this;
            }
            C0419c c0419c = new C0419c(Float.MIN_VALUE, f10, f11, f12);
            if (z10) {
                if (this.f53496c == null) {
                    this.f53496c = c0419c;
                    this.f53498e = this.f53495b.size();
                }
                if (this.f53499f != -1 && this.f53495b.size() - this.f53499f > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f53496c.f53504d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f53497d = c0419c;
                this.f53499f = this.f53495b.size();
            } else {
                if (this.f53496c == null && c0419c.f53504d < this.f53500g) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f53497d != null && c0419c.f53504d > this.f53500g) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f53500g = c0419c.f53504d;
            this.f53495b.add(c0419c);
            return this;
        }

        @s9.a
        @n0
        b c(float f10, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f11, float f12, int i10) {
            return d(f10, f11, f12, i10, false);
        }

        @s9.a
        @n0
        b d(float f10, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f11, float f12, int i10, boolean z10) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    b((i11 * f12) + f10, f11, f12, z10);
                }
            }
            return this;
        }

        @n0
        c e() {
            if (this.f53496c == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f53495b.size(); i10++) {
                C0419c c0419c = this.f53495b.get(i10);
                arrayList.add(new C0419c(f(this.f53496c.f53502b, this.f53494a, this.f53498e, i10), c0419c.f53502b, c0419c.f53503c, c0419c.f53504d));
            }
            return new c(this.f53494a, arrayList, this.f53498e, this.f53499f);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: KeylineState.java */
    public static final class C0419c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f53501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f53502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f53503c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final float f53504d;

        C0419c(float f10, float f11, float f12, float f13) {
            this.f53501a = f10;
            this.f53502b = f11;
            this.f53503c = f12;
            this.f53504d = f13;
        }

        static C0419c a(C0419c c0419c, C0419c c0419c2, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
            return new C0419c(com.google.android.material.animation.b.a(c0419c.f53501a, c0419c2.f53501a, f10), com.google.android.material.animation.b.a(c0419c.f53502b, c0419c2.f53502b, f10), com.google.android.material.animation.b.a(c0419c.f53503c, c0419c2.f53503c, f10), com.google.android.material.animation.b.a(c0419c.f53504d, c0419c2.f53504d, f10));
        }
    }

    private c(float f10, List<C0419c> list, int i10, int i11) {
        this.f53488a = f10;
        this.f53489b = Collections.unmodifiableList(list);
        this.f53490c = i10;
        this.f53491d = i11;
    }

    static c i(c cVar, c cVar2, float f10) {
        if (cVar.d() != cVar2.d()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<C0419c> listE = cVar.e();
        List<C0419c> listE2 = cVar2.e();
        if (listE.size() != listE2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < cVar.e().size(); i10++) {
            arrayList.add(C0419c.a(listE.get(i10), listE2.get(i10), f10));
        }
        return new c(cVar.d(), arrayList, com.google.android.material.animation.b.c(cVar.b(), cVar2.b(), f10), com.google.android.material.animation.b.c(cVar.g(), cVar2.g(), f10));
    }

    static c j(c cVar) {
        b bVar = new b(cVar.d());
        float f10 = cVar.c().f53502b - (cVar.c().f53504d / 2.0f);
        int size = cVar.e().size() - 1;
        while (size >= 0) {
            C0419c c0419c = cVar.e().get(size);
            bVar.b((c0419c.f53504d / 2.0f) + f10, c0419c.f53503c, c0419c.f53504d, size >= cVar.b() && size <= cVar.g());
            f10 += c0419c.f53504d;
            size--;
        }
        return bVar.e();
    }

    C0419c a() {
        return this.f53489b.get(this.f53490c);
    }

    int b() {
        return this.f53490c;
    }

    C0419c c() {
        return this.f53489b.get(0);
    }

    float d() {
        return this.f53488a;
    }

    List<C0419c> e() {
        return this.f53489b;
    }

    C0419c f() {
        return this.f53489b.get(this.f53491d);
    }

    int g() {
        return this.f53491d;
    }

    C0419c h() {
        List<C0419c> list = this.f53489b;
        return list.get(list.size() - 1);
    }
}
