package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.extractor.e0;
import com.google.android.exoplayer2.source.c1;
import com.google.android.exoplayer2.util.u;

/* JADX INFO: compiled from: BaseMediaChunkOutput.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements g.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f47626c = "BaseMediaChunkOutput";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f47627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c1[] f47628b;

    public c(int[] iArr, c1[] c1VarArr) {
        this.f47627a = iArr;
        this.f47628b = c1VarArr;
    }

    public int[] a() {
        int[] iArr = new int[this.f47628b.length];
        int i10 = 0;
        while (true) {
            c1[] c1VarArr = this.f47628b;
            if (i10 >= c1VarArr.length) {
                return iArr;
            }
            iArr[i10] = c1VarArr[i10].H();
            i10++;
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.g.b
    public e0 b(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f47627a;
            if (i12 >= iArr.length) {
                StringBuilder sb2 = new StringBuilder(36);
                sb2.append("Unmatched track of type: ");
                sb2.append(i11);
                u.d(f47626c, sb2.toString());
                return new com.google.android.exoplayer2.extractor.j();
            }
            if (i11 == iArr[i12]) {
                return this.f47628b[i12];
            }
            i12++;
        }
    }

    public void c(long j10) {
        for (c1 c1Var : this.f47628b) {
            c1Var.b0(j10);
        }
    }
}
