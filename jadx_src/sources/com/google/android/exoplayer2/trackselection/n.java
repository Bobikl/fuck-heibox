package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import androidx.annotation.p0;
import com.google.android.exoplayer2.source.f0;
import com.google.android.exoplayer2.source.n1;
import com.google.android.exoplayer2.z3;
import java.util.List;
import java.util.Random;

/* JADX INFO: compiled from: RandomTrackSelection.java */
/* JADX INFO: loaded from: classes7.dex */
public final class n extends c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Random f50120j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f50121k;

    /* JADX INFO: compiled from: RandomTrackSelection.java */
    public static final class a implements j.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Random f50122a;

        public a() {
            this.f50122a = new Random();
        }

        public a(int i10) {
            this.f50122a = new Random(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ j c(j.a aVar) {
            return new n(aVar.f50102a, aVar.f50103b, aVar.f50104c, this.f50122a);
        }

        @Override // com.google.android.exoplayer2.trackselection.j.b
        public j[] a(j.a[] aVarArr, com.google.android.exoplayer2.upstream.e eVar, f0.a aVar, z3 z3Var) {
            return v.b(aVarArr, new v.a() { // from class: com.google.android.exoplayer2.trackselection.m
                @Override // com.google.android.exoplayer2.trackselection.v.a
                public final j a(j.a aVar2) {
                    return this.f50119a.c(aVar2);
                }
            });
        }
    }

    public n(n1 n1Var, int[] iArr, int i10, Random random) {
        super(n1Var, iArr, i10);
        this.f50120j = random;
        this.f50121k = random.nextInt(this.f50036d);
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    public int a() {
        return this.f50121k;
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    public void k(long j10, long j11, long j12, List<? extends com.google.android.exoplayer2.source.chunk.n> list, com.google.android.exoplayer2.source.chunk.o[] oVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = 0;
        for (int i11 = 0; i11 < this.f50036d; i11++) {
            if (!b(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        this.f50121k = this.f50120j.nextInt(i10);
        if (i10 != this.f50036d) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.f50036d; i13++) {
                if (!b(i13, jElapsedRealtime)) {
                    int i14 = i12 + 1;
                    if (this.f50121k == i12) {
                        this.f50121k = i13;
                        return;
                    }
                    i12 = i14;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    @p0
    public Object r() {
        return null;
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    public int u() {
        return 3;
    }
}
