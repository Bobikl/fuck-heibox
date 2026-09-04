package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.j1;
import androidx.annotation.p0;
import com.google.android.exoplayer2.util.u0;
import com.google.common.collect.l1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: compiled from: BaseUrlExclusionList.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Long> f47779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Integer, Long> f47780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<List<Pair<String, Integer>>, com.google.android.exoplayer2.source.dash.manifest.b> f47781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Random f47782d;

    public b() {
        this(new Random());
    }

    @j1
    b(Random random) {
        this.f47781c = new HashMap();
        this.f47782d = random;
        this.f47779a = new HashMap();
        this.f47780b = new HashMap();
    }

    private static <T> void b(T t10, long j10, Map<T, Long> map) {
        if (map.containsKey(t10)) {
            j10 = Math.max(j10, ((Long) u0.k(map.get(t10))).longValue());
        }
        map.put(t10, Long.valueOf(j10));
    }

    private List<com.google.android.exoplayer2.source.dash.manifest.b> c(List<com.google.android.exoplayer2.source.dash.manifest.b> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        h(jElapsedRealtime, this.f47779a);
        h(jElapsedRealtime, this.f47780b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.google.android.exoplayer2.source.dash.manifest.b bVar = list.get(i10);
            if (!this.f47779a.containsKey(bVar.f47870b) && !this.f47780b.containsKey(Integer.valueOf(bVar.f47871c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(com.google.android.exoplayer2.source.dash.manifest.b bVar, com.google.android.exoplayer2.source.dash.manifest.b bVar2) {
        int iCompare = Integer.compare(bVar.f47871c, bVar2.f47871c);
        return iCompare != 0 ? iCompare : bVar.f47870b.compareTo(bVar2.f47870b);
    }

    public static int f(List<com.google.android.exoplayer2.source.dash.manifest.b> list) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashSet.add(Integer.valueOf(list.get(i10).f47871c));
        }
        return hashSet.size();
    }

    private static <T> void h(long j10, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<T, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    private com.google.android.exoplayer2.source.dash.manifest.b k(List<com.google.android.exoplayer2.source.dash.manifest.b> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += list.get(i11).f47872d;
        }
        int iNextInt = this.f47782d.nextInt(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            com.google.android.exoplayer2.source.dash.manifest.b bVar = list.get(i13);
            i12 += bVar.f47872d;
            if (iNextInt < i12) {
                return bVar;
            }
        }
        return (com.google.android.exoplayer2.source.dash.manifest.b) l1.w(list);
    }

    public void e(com.google.android.exoplayer2.source.dash.manifest.b bVar, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        b(bVar.f47870b, jElapsedRealtime, this.f47779a);
        b(Integer.valueOf(bVar.f47871c), jElapsedRealtime, this.f47780b);
    }

    public int g(List<com.google.android.exoplayer2.source.dash.manifest.b> list) {
        HashSet hashSet = new HashSet();
        List<com.google.android.exoplayer2.source.dash.manifest.b> listC = c(list);
        for (int i10 = 0; i10 < listC.size(); i10++) {
            hashSet.add(Integer.valueOf(listC.get(i10).f47871c));
        }
        return hashSet.size();
    }

    public void i() {
        this.f47779a.clear();
        this.f47780b.clear();
        this.f47781c.clear();
    }

    @p0
    public com.google.android.exoplayer2.source.dash.manifest.b j(List<com.google.android.exoplayer2.source.dash.manifest.b> list) {
        List<com.google.android.exoplayer2.source.dash.manifest.b> listC = c(list);
        if (listC.size() < 2) {
            return (com.google.android.exoplayer2.source.dash.manifest.b) l1.v(listC, null);
        }
        Collections.sort(listC, new Comparator() { // from class: com.google.android.exoplayer2.source.dash.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b.d((com.google.android.exoplayer2.source.dash.manifest.b) obj, (com.google.android.exoplayer2.source.dash.manifest.b) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int i10 = listC.get(0).f47871c;
        for (int i11 = 0; i11 < listC.size(); i11++) {
            com.google.android.exoplayer2.source.dash.manifest.b bVar = listC.get(i11);
            if (i10 != bVar.f47871c) {
                if (arrayList.size() != 1) {
                    break;
                }
                return listC.get(0);
            }
            arrayList.add(new Pair(bVar.f47870b, Integer.valueOf(bVar.f47872d)));
        }
        com.google.android.exoplayer2.source.dash.manifest.b bVar2 = this.f47781c.get(arrayList);
        if (bVar2 != null) {
            return bVar2;
        }
        com.google.android.exoplayer2.source.dash.manifest.b bVarK = k(listC.subList(0, arrayList.size()));
        this.f47781c.put(arrayList, bVarK);
        return bVarK;
    }
}
