package com.airbnb.lottie;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PerformanceTracker.java */
/* JADX INFO: loaded from: classes6.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f37819a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<b> f37820b = new androidx.collection.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, com.airbnb.lottie.utils.h> f37821c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Comparator<androidx.core.util.k<String, Float>> f37822d = new a();

    /* JADX INFO: compiled from: PerformanceTracker.java */
    public class a implements Comparator<androidx.core.util.k<String, Float>> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(androidx.core.util.k<String, Float> kVar, androidx.core.util.k<String, Float> kVar2) {
            float fFloatValue = kVar.f21264b.floatValue();
            float fFloatValue2 = kVar2.f21264b.floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    /* JADX INFO: compiled from: PerformanceTracker.java */
    public interface b {
        void a(float f10);
    }

    public void a(b bVar) {
        this.f37820b.add(bVar);
    }

    public void b() {
        this.f37821c.clear();
    }

    public List<androidx.core.util.k<String, Float>> c() {
        if (!this.f37819a) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.f37821c.size());
        for (Map.Entry<String, com.airbnb.lottie.utils.h> entry : this.f37821c.entrySet()) {
            arrayList.add(new androidx.core.util.k(entry.getKey(), Float.valueOf(entry.getValue().b())));
        }
        Collections.sort(arrayList, this.f37822d);
        return arrayList;
    }

    public void d() {
        if (this.f37819a) {
            List<androidx.core.util.k<String, Float>> listC = c();
            Log.d(e.f37312b, "Render times:");
            for (int i10 = 0; i10 < listC.size(); i10++) {
                androidx.core.util.k<String, Float> kVar = listC.get(i10);
                Log.d(e.f37312b, String.format("\t\t%30s:%.2f", kVar.f21263a, kVar.f21264b));
            }
        }
    }

    public void e(String str, float f10) {
        if (this.f37819a) {
            com.airbnb.lottie.utils.h hVar = this.f37821c.get(str);
            if (hVar == null) {
                hVar = new com.airbnb.lottie.utils.h();
                this.f37821c.put(str, hVar);
            }
            hVar.a(f10);
            if (str.equals("__container")) {
                Iterator<b> it = this.f37820b.iterator();
                while (it.hasNext()) {
                    it.next().a(f10);
                }
            }
        }
    }

    public void f(b bVar) {
        this.f37820b.remove(bVar);
    }

    void g(boolean z10) {
        this.f37819a = z10;
    }
}
