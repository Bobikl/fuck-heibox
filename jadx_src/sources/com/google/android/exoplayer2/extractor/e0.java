package com.google.android.exoplayer2.extractor;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: compiled from: TrackOutput.java */
/* JADX INFO: loaded from: classes7.dex */
public interface e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f44870a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f44871b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f44872c = 2;

    /* JADX INFO: compiled from: TrackOutput.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f44874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f44875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f44876d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f44873a = i10;
            this.f44874b = bArr;
            this.f44875c = i11;
            this.f44876d = i12;
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f44873a == aVar.f44873a && this.f44875c == aVar.f44875c && this.f44876d == aVar.f44876d && Arrays.equals(this.f44874b, aVar.f44874b);
        }

        public int hashCode() {
            return (((((this.f44873a * 31) + Arrays.hashCode(this.f44874b)) * 31) + this.f44875c) * 31) + this.f44876d;
        }
    }

    /* JADX INFO: compiled from: TrackOutput.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    int a(com.google.android.exoplayer2.upstream.k kVar, int i10, boolean z10, int i11) throws IOException;

    int b(com.google.android.exoplayer2.upstream.k kVar, int i10, boolean z10) throws IOException;

    void c(com.google.android.exoplayer2.util.e0 e0Var, int i10);

    void d(a2 a2Var);

    void e(long j10, int i10, int i11, int i12, @p0 a aVar);

    void f(com.google.android.exoplayer2.util.e0 e0Var, int i10, int i11);
}
