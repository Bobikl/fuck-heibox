package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: LoadErrorHandlingPolicy.java */
/* JADX INFO: loaded from: classes7.dex */
public interface g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f51111a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f51112b = 2;

    /* JADX INFO: compiled from: LoadErrorHandlingPolicy.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f51113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f51114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f51115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f51116d;

        public a(int i10, int i11, int i12, int i13) {
            this.f51113a = i10;
            this.f51114b = i11;
            this.f51115c = i12;
            this.f51116d = i13;
        }

        public boolean a(int i10) {
            if (i10 == 1) {
                if (this.f51113a - this.f51114b <= 1) {
                    return false;
                }
            } else if (this.f51115c - this.f51116d <= 1) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: LoadErrorHandlingPolicy.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f51117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f51118b;

        public b(int i10, long j10) {
            com.google.android.exoplayer2.util.a.a(j10 >= 0);
            this.f51117a = i10;
            this.f51118b = j10;
        }
    }

    /* JADX INFO: compiled from: LoadErrorHandlingPolicy.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* JADX INFO: compiled from: LoadErrorHandlingPolicy.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.u f51119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.y f51120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IOException f51121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f51122d;

        public d(com.google.android.exoplayer2.source.u uVar, com.google.android.exoplayer2.source.y yVar, IOException iOException, int i10) {
            this.f51119a = uVar;
            this.f51120b = yVar;
            this.f51121c = iOException;
            this.f51122d = i10;
        }
    }

    long a(d dVar);

    @androidx.annotation.p0
    b b(a aVar, d dVar);

    void c(long j10);

    int d(int i10);
}
