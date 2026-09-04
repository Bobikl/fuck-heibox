package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: KeylineStateList.java */
/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f53505h = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f53506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f53507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<c> f53508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f53509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f53510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f53511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f53512g;

    private d(c cVar, List<c> list, List<c> list2) {
        this.f53506a = cVar;
        this.f53507b = Collections.unmodifiableList(list);
        this.f53508c = Collections.unmodifiableList(list2);
        float f10 = list.get(list.size() - 1).c().f53501a - cVar.c().f53501a;
        this.f53511f = f10;
        float f11 = cVar.h().f53501a - list2.get(list2.size() - 1).h().f53501a;
        this.f53512g = f11;
        this.f53509d = j(f10, list, true);
        this.f53510e = j(f11, list2, false);
    }

    private static int a(c cVar) {
        for (int i10 = 0; i10 < cVar.e().size(); i10++) {
            if (cVar.e().get(i10).f53502b >= 0.0f) {
                return i10;
            }
        }
        return -1;
    }

    private static int b(c cVar, float f10) {
        for (int iG = cVar.g(); iG < cVar.e().size(); iG++) {
            if (f10 == cVar.e().get(iG).f53503c) {
                return iG;
            }
        }
        return cVar.e().size() - 1;
    }

    private static int c(a aVar, c cVar) {
        for (int size = cVar.e().size() - 1; size >= 0; size--) {
            if (cVar.e().get(size).f53502b <= aVar.g()) {
                return size;
            }
        }
        return -1;
    }

    private static int d(c cVar, float f10) {
        for (int iB = cVar.b() - 1; iB >= 0; iB--) {
            if (f10 == cVar.e().get(iB).f53503c) {
                return iB;
            }
        }
        return 0;
    }

    static d e(a aVar, c cVar) {
        return new d(cVar, k(cVar), l(aVar, cVar));
    }

    private static float[] j(float f10, List<c> list, boolean z10) {
        int size = list.size();
        float[] fArr = new float[size];
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            c cVar = list.get(i11);
            c cVar2 = list.get(i10);
            fArr[i10] = i10 == size + (-1) ? 1.0f : fArr[i11] + ((z10 ? cVar2.c().f53501a - cVar.c().f53501a : cVar.h().f53501a - cVar2.h().f53501a) / f10);
            i10++;
        }
        return fArr;
    }

    private static List<c> k(c cVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        int iA = a(cVar);
        if (!m(cVar) && iA != -1) {
            int iB = (cVar.b() - 1) - iA;
            float f10 = cVar.c().f53502b - (cVar.c().f53504d / 2.0f);
            for (int i10 = 0; i10 <= iB; i10++) {
                c cVar2 = (c) arrayList.get(arrayList.size() - 1);
                int size = cVar.e().size() - 1;
                int i11 = (iA + i10) - 1;
                if (i11 >= 0) {
                    size = b(cVar2, cVar.e().get(i11).f53503c) - 1;
                }
                arrayList.add(p(cVar2, iA, size, f10, (cVar.b() - i10) - 1, (cVar.g() - i10) - 1));
            }
        }
        return arrayList;
    }

    private static List<c> l(a aVar, c cVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        int iC = c(aVar, cVar);
        if (!n(aVar, cVar) && iC != -1) {
            int iG = iC - cVar.g();
            float f10 = cVar.c().f53502b - (cVar.c().f53504d / 2.0f);
            for (int i10 = 0; i10 < iG; i10++) {
                c cVar2 = (c) arrayList.get(arrayList.size() - 1);
                int i11 = (iC - i10) + 1;
                arrayList.add(p(cVar2, iC, i11 < cVar.e().size() ? d(cVar2, cVar.e().get(i11).f53503c) + 1 : 0, f10, cVar.b() + i10 + 1, cVar.g() + i10 + 1));
            }
        }
        return arrayList;
    }

    private static boolean m(c cVar) {
        return cVar.a().f53502b - (cVar.a().f53504d / 2.0f) <= 0.0f || cVar.a() == cVar.c();
    }

    private static boolean n(a aVar, c cVar) {
        return cVar.f().f53502b + (cVar.f().f53504d / 2.0f) >= ((float) aVar.g()) || cVar.f() == cVar.h();
    }

    private static c o(List<c> list, float f10, float[] fArr) {
        int size = list.size();
        float f11 = fArr[0];
        int i10 = 1;
        while (i10 < size) {
            float f12 = fArr[i10];
            if (f10 <= f12) {
                return c.i(list.get(i10 - 1), list.get(i10), com.google.android.material.animation.b.b(0.0f, 1.0f, f11, f12, f10));
            }
            i10++;
            f11 = f12;
        }
        return list.get(0);
    }

    private static c p(c cVar, int i10, int i11, float f10, int i12, int i13) {
        ArrayList arrayList = new ArrayList(cVar.e());
        arrayList.add(i11, (c.C0419c) arrayList.remove(i10));
        c.b bVar = new c.b(cVar.d());
        int i14 = 0;
        while (i14 < arrayList.size()) {
            c.C0419c c0419c = (c.C0419c) arrayList.get(i14);
            float f11 = c0419c.f53504d;
            bVar.b((f11 / 2.0f) + f10, c0419c.f53503c, f11, i14 >= i12 && i14 <= i13);
            f10 += c0419c.f53504d;
            i14++;
        }
        return bVar.e();
    }

    c f() {
        return this.f53506a;
    }

    c g() {
        List<c> list = this.f53507b;
        return list.get(list.size() - 1);
    }

    c h() {
        List<c> list = this.f53508c;
        return list.get(list.size() - 1);
    }

    public c i(float f10, float f11, float f12) {
        float f13 = this.f53511f + f11;
        float f14 = f12 - this.f53512g;
        if (f10 < f13) {
            return o(this.f53507b, com.google.android.material.animation.b.b(1.0f, 0.0f, f11, f13, f10), this.f53509d);
        }
        if (f10 <= f14) {
            return this.f53506a;
        }
        return o(this.f53508c, com.google.android.material.animation.b.b(0.0f, 1.0f, f14, f12, f10), this.f53510e);
    }
}
