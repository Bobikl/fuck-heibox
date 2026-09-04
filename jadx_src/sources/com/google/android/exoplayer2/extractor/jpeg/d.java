package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.extractor.b0;
import com.google.android.exoplayer2.extractor.c0;
import com.google.android.exoplayer2.extractor.e0;
import com.google.android.exoplayer2.extractor.m;

/* JADX INFO: compiled from: StartOffsetExtractorOutput.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f45072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f45073c;

    /* JADX INFO: compiled from: StartOffsetExtractorOutput.java */
    public class a implements b0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b0 f45074d;

        a(b0 b0Var) {
            this.f45074d = b0Var;
        }

        @Override // com.google.android.exoplayer2.extractor.b0
        public b0.a d(long j10) {
            b0.a aVarD = this.f45074d.d(j10);
            c0 c0Var = aVarD.f44847a;
            c0 c0Var2 = new c0(c0Var.f44855a, c0Var.f44856b + d.this.f45072b);
            c0 c0Var3 = aVarD.f44848b;
            return new b0.a(c0Var2, new c0(c0Var3.f44855a, c0Var3.f44856b + d.this.f45072b));
        }

        @Override // com.google.android.exoplayer2.extractor.b0
        public boolean e() {
            return this.f45074d.e();
        }

        @Override // com.google.android.exoplayer2.extractor.b0
        public long i() {
            return this.f45074d.i();
        }
    }

    public d(long j10, m mVar) {
        this.f45072b = j10;
        this.f45073c = mVar;
    }

    @Override // com.google.android.exoplayer2.extractor.m
    public e0 b(int i10, int i11) {
        return this.f45073c.b(i10, i11);
    }

    @Override // com.google.android.exoplayer2.extractor.m
    public void n() {
        this.f45073c.n();
    }

    @Override // com.google.android.exoplayer2.extractor.m
    public void t(b0 b0Var) {
        this.f45073c.t(new a(b0Var));
    }
}
