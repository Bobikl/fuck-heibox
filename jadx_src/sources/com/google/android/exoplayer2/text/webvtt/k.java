package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.util.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: WebvttSubtitle.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k implements com.google.android.exoplayer2.text.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<e> f50005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f50006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f50007d;

    public k(List<e> list) {
        this.f50005b = Collections.unmodifiableList(new ArrayList(list));
        this.f50006c = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f50006c;
            jArr[i11] = eVar.f49946b;
            jArr[i11 + 1] = eVar.f49947c;
        }
        long[] jArr2 = this.f50006c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f50007d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int f(e eVar, e eVar2) {
        return Long.compare(eVar.f49946b, eVar2.f49946b);
    }

    @Override // com.google.android.exoplayer2.text.g
    public long a(int i10) {
        com.google.android.exoplayer2.util.a.a(i10 >= 0);
        com.google.android.exoplayer2.util.a.a(i10 < this.f50007d.length);
        return this.f50007d[i10];
    }

    @Override // com.google.android.exoplayer2.text.g
    public int b() {
        return this.f50007d.length;
    }

    @Override // com.google.android.exoplayer2.text.g
    public int c(long j10) {
        int iF = u0.f(this.f50007d, j10, false, false);
        if (iF < this.f50007d.length) {
            return iF;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.g
    public List<com.google.android.exoplayer2.text.b> d(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f50005b.size(); i10++) {
            long[] jArr = this.f50006c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e eVar = this.f50005b.get(i10);
                com.google.android.exoplayer2.text.b bVar = eVar.f49945a;
                if (bVar.f49377f == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.google.android.exoplayer2.text.webvtt.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return k.f((e) obj, (e) obj2);
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((e) arrayList2.get(i12)).f49945a.c().t((-1) - i12, 1).a());
        }
        return arrayList;
    }
}
