package com.google.android.exoplayer2.extractor.flac;

import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.r;
import com.google.android.exoplayer2.extractor.u;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: FlacBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b extends com.google.android.exoplayer2.extractor.a {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.flac.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FlacBinarySearchSeeker.java */
    public static final class C0375b implements com.google.android.exoplayer2.extractor.a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u f44892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f44893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final r.a f44894c;

        private C0375b(u uVar, int i10) {
            this.f44892a = uVar;
            this.f44893b = i10;
            this.f44894c = new r.a();
        }

        private long c(l lVar) throws IOException {
            while (lVar.q() < lVar.getLength() - 6 && !r.h(lVar, this.f44892a, this.f44893b, this.f44894c)) {
                lVar.s(1);
            }
            if (lVar.q() < lVar.getLength() - 6) {
                return this.f44894c.f45684a;
            }
            lVar.s((int) (lVar.getLength() - lVar.q()));
            return this.f44892a.f46202j;
        }

        @Override // com.google.android.exoplayer2.extractor.a.f
        public com.google.android.exoplayer2.extractor.a.e a(l lVar, long j10) throws IOException {
            long position = lVar.getPosition();
            long jC = c(lVar);
            long jQ = lVar.q();
            lVar.s(Math.max(6, this.f44892a.f46195c));
            long jC2 = c(lVar);
            long jQ2 = lVar.q();
            if (jC > j10 || jC2 <= j10) {
                return jC2 <= j10 ? com.google.android.exoplayer2.extractor.a.e.f(jC2, jQ2) : com.google.android.exoplayer2.extractor.a.e.d(jC, position);
            }
            return com.google.android.exoplayer2.extractor.a.e.e(jQ);
        }

        @Override // com.google.android.exoplayer2.extractor.a.f
        public /* synthetic */ void b() {
            com.google.android.exoplayer2.extractor.b.a(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final u uVar, int i10, long j10, long j11) {
        super(new com.google.android.exoplayer2.extractor.a.d() { // from class: com.google.android.exoplayer2.extractor.flac.a
            @Override // com.google.android.exoplayer2.extractor.a.d
            public final long a(long j12) {
                return uVar.l(j12);
            }
        }, new C0375b(uVar, i10), uVar.h(), 0L, uVar.f46202j, j10, j11, uVar.e(), Math.max(6, uVar.f46195c));
        Objects.requireNonNull(uVar);
    }
}
