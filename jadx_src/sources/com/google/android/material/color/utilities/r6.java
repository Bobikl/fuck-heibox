package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Score.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class r6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f53914a = 15.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final double f53915b = 0.01d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final double f53916c = 10.0d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final double f53917d = 48.0d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final double f53918e = 0.7d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final double f53919f = 0.3d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final double f53920g = 0.1d;

    /* JADX INFO: compiled from: Score.java */
    public static class a implements Comparator<Map.Entry<Integer, Double>> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry<Integer, Double> entry, Map.Entry<Integer, Double> entry2) {
            return -entry.getValue().compareTo(entry2.getValue());
        }
    }

    private r6() {
    }

    private static List<Integer> a(Map<Integer, Double> map, Map<Integer, b> map2) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, b> entry : map2.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            b value = entry.getValue();
            double dDoubleValue = map.get(Integer.valueOf(iIntValue)).doubleValue();
            if (value.k() >= f53914a && c.o(iIntValue) >= f53916c && dDoubleValue >= f53915b) {
                arrayList.add(Integer.valueOf(iIntValue));
            }
        }
        return arrayList;
    }

    public static List<Integer> b(Map<Integer, Integer> map) {
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        double dIntValue = 0.0d;
        while (it.hasNext()) {
            dIntValue += (double) it.next().getValue().intValue();
        }
        HashMap map2 = new HashMap();
        double[] dArr = new double[bb.c.b.X3];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            double dIntValue2 = ((double) entry.getValue().intValue()) / dIntValue;
            b bVarB = b.b(iIntValue);
            map2.put(Integer.valueOf(iIntValue), bVarB);
            int iRound = (int) Math.round(bVarB.l());
            dArr[iRound] = dArr[iRound] + dIntValue2;
        }
        HashMap map3 = new HashMap();
        for (Map.Entry entry2 : map2.entrySet()) {
            int iIntValue2 = ((Integer) entry2.getKey()).intValue();
            int iRound2 = (int) Math.round(((b) entry2.getValue()).l());
            double d10 = 0.0d;
            for (int i10 = iRound2 - 15; i10 < iRound2 + 15; i10++) {
                d10 += dArr[b6.h(i10)];
            }
            map3.put(Integer.valueOf(iIntValue2), Double.valueOf(d10));
        }
        HashMap map4 = new HashMap();
        for (Map.Entry entry3 : map2.entrySet()) {
            int iIntValue3 = ((Integer) entry3.getKey()).intValue();
            b bVar = (b) entry3.getValue();
            map4.put(Integer.valueOf(iIntValue3), Double.valueOf((((Double) map3.get(Integer.valueOf(iIntValue3))).doubleValue() * 100.0d * f53918e) + ((bVar.k() - f53917d) * (bVar.k() < f53917d ? f53920g : f53919f))));
        }
        List<Integer> listA = a(map3, map2);
        HashMap map5 = new HashMap();
        Iterator<Integer> it2 = listA.iterator();
        while (it2.hasNext()) {
            int iIntValue4 = it2.next().intValue();
            map5.put(Integer.valueOf(iIntValue4), (Double) map4.get(Integer.valueOf(iIntValue4)));
        }
        ArrayList<Map.Entry> arrayList = new ArrayList(map5.entrySet());
        Collections.sort(arrayList, new a());
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry4 : arrayList) {
            b bVar2 = (b) map2.get(Integer.valueOf(((Integer) entry4.getKey()).intValue()));
            boolean z10 = false;
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (b6.c(bVar2.l(), ((b) map2.get((Integer) it3.next())).l()) < f53914a) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                arrayList2.add((Integer) entry4.getKey());
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(-12417548);
        }
        return arrayList2;
    }
}
