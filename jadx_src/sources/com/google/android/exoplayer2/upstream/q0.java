package com.google.android.exoplayer2.upstream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: SlidingPercentile.java */
/* JADX INFO: loaded from: classes7.dex */
public class q0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator<b> f51171h = new Comparator() { // from class: com.google.android.exoplayer2.upstream.o0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return q0.g((q0.b) obj, (q0.b) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator<b> f51172i = new Comparator() { // from class: com.google.android.exoplayer2.upstream.p0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return q0.h((q0.b) obj, (q0.b) obj2);
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f51173j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f51174k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f51175l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f51176m = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f51177a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f51181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f51182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f51183g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b[] f51179c = new b[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<b> f51178b = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f51180d = -1;

    /* JADX INFO: compiled from: SlidingPercentile.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f51185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f51186c;

        private b() {
        }
    }

    public q0(int i10) {
        this.f51177a = i10;
    }

    private void d() {
        if (this.f51180d != 1) {
            Collections.sort(this.f51178b, f51171h);
            this.f51180d = 1;
        }
    }

    private void e() {
        if (this.f51180d != 0) {
            Collections.sort(this.f51178b, f51172i);
            this.f51180d = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(b bVar, b bVar2) {
        return bVar.f51184a - bVar2.f51184a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int h(b bVar, b bVar2) {
        return Float.compare(bVar.f51186c, bVar2.f51186c);
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f51183g;
        if (i11 > 0) {
            b[] bVarArr = this.f51179c;
            int i12 = i11 - 1;
            this.f51183g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f51181e;
        this.f51181e = i13 + 1;
        bVar.f51184a = i13;
        bVar.f51185b = i10;
        bVar.f51186c = f10;
        this.f51178b.add(bVar);
        this.f51182f += i10;
        while (true) {
            int i14 = this.f51182f;
            int i15 = this.f51177a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            b bVar2 = this.f51178b.get(0);
            int i17 = bVar2.f51185b;
            if (i17 <= i16) {
                this.f51182f -= i17;
                this.f51178b.remove(0);
                int i18 = this.f51183g;
                if (i18 < 5) {
                    b[] bVarArr2 = this.f51179c;
                    this.f51183g = i18 + 1;
                    bVarArr2[i18] = bVar2;
                }
            } else {
                bVar2.f51185b = i17 - i16;
                this.f51182f -= i16;
            }
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * this.f51182f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f51178b.size(); i11++) {
            b bVar = this.f51178b.get(i11);
            i10 += bVar.f51185b;
            if (i10 >= f11) {
                return bVar.f51186c;
            }
        }
        if (this.f51178b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.f51178b;
        return arrayList.get(arrayList.size() - 1).f51186c;
    }

    public void i() {
        this.f51178b.clear();
        this.f51180d = -1;
        this.f51181e = 0;
        this.f51182f = 0;
    }
}
