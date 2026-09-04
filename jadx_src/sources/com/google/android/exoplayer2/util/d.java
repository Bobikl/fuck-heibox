package com.google.android.exoplayer2.util;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: BundleableUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d {
    private d() {
    }

    public static void a(@androidx.annotation.p0 Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) u0.k(d.class.getClassLoader()));
        }
    }

    public static <T extends com.google.android.exoplayer2.i> ImmutableList<T> b(com.google.android.exoplayer2.i.a<T> aVar, List<Bundle> list) {
        ImmutableList.a aVarQ = ImmutableList.q();
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarQ.a(aVar.a((Bundle) a.g(list.get(i10))));
        }
        return aVarQ.e();
    }

    public static <T extends com.google.android.exoplayer2.i> List<T> c(com.google.android.exoplayer2.i.a<T> aVar, @androidx.annotation.p0 List<Bundle> list, List<T> list2) {
        return list == null ? list2 : b(aVar, list);
    }

    public static <T extends com.google.android.exoplayer2.i> SparseArray<T> d(com.google.android.exoplayer2.i.a<T> aVar, @androidx.annotation.p0 SparseArray<Bundle> sparseArray, SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2;
        }
        com.xiaomi.push.service.h hVar = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            hVar.put(sparseArray.keyAt(i10), aVar.a(sparseArray.valueAt(i10)));
        }
        return hVar;
    }

    @androidx.annotation.p0
    public static <T extends com.google.android.exoplayer2.i> T e(com.google.android.exoplayer2.i.a<T> aVar, @androidx.annotation.p0 Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return (T) aVar.a(bundle);
    }

    public static <T extends com.google.android.exoplayer2.i> T f(com.google.android.exoplayer2.i.a<T> aVar, @androidx.annotation.p0 Bundle bundle, T t10) {
        return bundle == null ? t10 : (T) aVar.a(bundle);
    }

    public static <T extends com.google.android.exoplayer2.i> ArrayList<Bundle> g(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        return arrayList;
    }

    public static <T extends com.google.android.exoplayer2.i> ImmutableList<Bundle> h(List<T> list) {
        ImmutableList.a aVarQ = ImmutableList.q();
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarQ.a(list.get(i10).a());
        }
        return aVarQ.e();
    }

    public static <T extends com.google.android.exoplayer2.i> SparseArray<Bundle> i(SparseArray<T> sparseArray) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10).a());
        }
        return sparseArray2;
    }

    @androidx.annotation.p0
    public static Bundle j(@androidx.annotation.p0 com.google.android.exoplayer2.i iVar) {
        if (iVar == null) {
            return null;
        }
        return iVar.a();
    }
}
