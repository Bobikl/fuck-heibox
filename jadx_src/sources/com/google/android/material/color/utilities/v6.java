package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: compiled from: TemperatureCache.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class v6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f53929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b0 f53930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<b0> f53931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<b0> f53932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<b0, Double> f53933e;

    private v6() {
        throw new UnsupportedOperationException();
    }

    public v6(b0 b0Var) {
        this.f53929a = b0Var;
    }

    private b0 d() {
        return g().get(0);
    }

    private List<b0> f() {
        List<b0> list = this.f53932d;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (double d10 = 0.0d; d10 <= 360.0d; d10 += 1.0d) {
            arrayList.add(b0.a(d10, this.f53929a.c(), this.f53929a.e()));
        }
        List<b0> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.f53932d = listUnmodifiableList;
        return listUnmodifiableList;
    }

    private List<b0> g() {
        List<b0> list = this.f53931c;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(f());
        arrayList.add(this.f53929a);
        Collections.sort(arrayList, Comparator.comparing(new Function() { // from class: com.google.android.material.color.utilities.t6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f53925a.l((b0) obj);
            }
        }, new Comparator() { // from class: com.google.android.material.color.utilities.u6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Double) obj).compareTo((Double) obj2);
            }
        }));
        this.f53931c = arrayList;
        return arrayList;
    }

    private Map<b0, Double> i() {
        Map<b0, Double> map = this.f53933e;
        if (map != null) {
            return map;
        }
        ArrayList<b0> arrayList = new ArrayList(f());
        arrayList.add(this.f53929a);
        HashMap map2 = new HashMap();
        for (b0 b0Var : arrayList) {
            map2.put(b0Var, Double.valueOf(m(b0Var)));
        }
        this.f53933e = map2;
        return map2;
    }

    private b0 j() {
        return g().get(g().size() - 1);
    }

    private static boolean k(double d10, double d11, double d12) {
        if (d11 < d12) {
            return d11 <= d10 && d10 <= d12;
        }
        return d11 <= d10 || d10 <= d12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double l(b0 b0Var) {
        return i().get(b0Var);
    }

    public static double m(b0 b0Var) {
        double[] dArrL = c.l(b0Var.k());
        return ((Math.pow(Math.hypot(dArrL[1], dArrL[2]), 1.07d) * 0.02d) * Math.cos(Math.toRadians(b6.g(b6.g(Math.toDegrees(Math.atan2(dArrL[2], dArrL[1]))) - 50.0d)))) - 0.5d;
    }

    public List<b0> b() {
        return c(5, 12);
    }

    public List<b0> c(int i10, int i11) {
        int iRound = (int) Math.round(this.f53929a.d());
        b0 b0Var = f().get(iRound);
        double dH = h(b0Var);
        ArrayList arrayList = new ArrayList();
        arrayList.add(b0Var);
        double dAbs = 0.0d;
        double dAbs2 = 0.0d;
        int i12 = 0;
        while (i12 < 360) {
            double dH2 = h(f().get(b6.h(iRound + i12)));
            dAbs2 += Math.abs(dH2 - dH);
            i12++;
            dH = dH2;
        }
        double d10 = dAbs2 / ((double) i11);
        double dH3 = h(b0Var);
        int i13 = 1;
        while (arrayList.size() < i11) {
            b0 b0Var2 = f().get(b6.h(iRound + i13));
            double dH4 = h(b0Var2);
            dAbs += Math.abs(dH4 - dH3);
            boolean z10 = dAbs >= ((double) arrayList.size()) * d10;
            int i14 = 1;
            while (z10 && arrayList.size() < i11) {
                arrayList.add(b0Var2);
                z10 = dAbs >= ((double) (arrayList.size() + i14)) * d10;
                i14++;
            }
            i13++;
            if (i13 > 360) {
                while (arrayList.size() < i11) {
                    arrayList.add(b0Var2);
                }
                break;
            }
            dH3 = dH4;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f53929a);
        int iFloor = (int) Math.floor((((double) i10) - 1.0d) / 2.0d);
        for (int i15 = 1; i15 < iFloor + 1; i15++) {
            int size = 0 - i15;
            while (size < 0) {
                size += arrayList.size();
            }
            if (size >= arrayList.size()) {
                size %= arrayList.size();
            }
            arrayList2.add(0, (b0) arrayList.get(size));
        }
        int i16 = (i10 - iFloor) - 1;
        for (int i17 = 1; i17 < i16 + 1; i17++) {
            int size2 = i17;
            while (size2 < 0) {
                size2 += arrayList.size();
            }
            if (size2 >= arrayList.size()) {
                size2 %= arrayList.size();
            }
            arrayList2.add((b0) arrayList.get(size2));
        }
        return arrayList2;
    }

    public b0 e() {
        b0 b0Var = this.f53930b;
        if (b0Var != null) {
            return b0Var;
        }
        double d10 = d().d();
        double dDoubleValue = i().get(d()).doubleValue();
        double d11 = j().d();
        double dDoubleValue2 = i().get(j()).doubleValue() - dDoubleValue;
        boolean zK = k(this.f53929a.d(), d10, d11);
        double d12 = zK ? d11 : d10;
        if (!zK) {
            d10 = d11;
        }
        b0 b0Var2 = f().get((int) Math.round(this.f53929a.d()));
        double dH = 1.0d - h(this.f53929a);
        double d13 = 1000.0d;
        b0 b0Var3 = b0Var2;
        for (double d14 = 0.0d; d14 <= 360.0d; d14 += 1.0d) {
            double dG = b6.g(d12 + (1.0d * d14));
            if (k(dG, d12, d10)) {
                b0 b0Var4 = f().get((int) Math.round(dG));
                double dAbs = Math.abs(dH - ((i().get(b0Var4).doubleValue() - dDoubleValue) / dDoubleValue2));
                if (dAbs < d13) {
                    b0Var3 = b0Var4;
                    d13 = dAbs;
                }
            }
        }
        this.f53930b = b0Var3;
        return b0Var3;
    }

    public double h(b0 b0Var) {
        double dDoubleValue = i().get(j()).doubleValue() - i().get(d()).doubleValue();
        double dDoubleValue2 = i().get(b0Var).doubleValue() - i().get(d()).doubleValue();
        if (dDoubleValue == 0.0d) {
            return 0.5d;
        }
        return dDoubleValue2 / dDoubleValue;
    }
}
