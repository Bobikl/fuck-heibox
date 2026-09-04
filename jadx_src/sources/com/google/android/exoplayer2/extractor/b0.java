package com.google.android.exoplayer2.extractor;

import androidx.annotation.p0;
import com.meituan.robust.Constants;

/* JADX INFO: compiled from: SeekMap.java */
/* JADX INFO: loaded from: classes7.dex */
public interface b0 {

    /* JADX INFO: compiled from: SeekMap.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0 f44847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c0 f44848b;

        public a(c0 c0Var) {
            this(c0Var, c0Var);
        }

        public a(c0 c0Var, c0 c0Var2) {
            this.f44847a = (c0) com.google.android.exoplayer2.util.a.g(c0Var);
            this.f44848b = (c0) com.google.android.exoplayer2.util.a.g(c0Var2);
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f44847a.equals(aVar.f44847a) && this.f44848b.equals(aVar.f44848b);
        }

        public int hashCode() {
            return (this.f44847a.hashCode() * 31) + this.f44848b.hashCode();
        }

        public String toString() {
            String string;
            String strValueOf = String.valueOf(this.f44847a);
            if (this.f44847a.equals(this.f44848b)) {
                string = "";
            } else {
                String strValueOf2 = String.valueOf(this.f44848b);
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 2);
                sb2.append(", ");
                sb2.append(strValueOf2);
                string = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 2 + String.valueOf(string).length());
            sb3.append(Constants.ARRAY_TYPE);
            sb3.append(strValueOf);
            sb3.append(string);
            sb3.append("]");
            return sb3.toString();
        }
    }

    /* JADX INFO: compiled from: SeekMap.java */
    public static class b implements b0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f44849d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final a f44850e;

        public b(long j10) {
            this(j10, 0L);
        }

        public b(long j10, long j11) {
            this.f44849d = j10;
            this.f44850e = new a(j11 == 0 ? c0.f44854c : new c0(0L, j11));
        }

        @Override // com.google.android.exoplayer2.extractor.b0
        public a d(long j10) {
            return this.f44850e;
        }

        @Override // com.google.android.exoplayer2.extractor.b0
        public boolean e() {
            return false;
        }

        @Override // com.google.android.exoplayer2.extractor.b0
        public long i() {
            return this.f44849d;
        }
    }

    a d(long j10);

    boolean e();

    long i();
}
