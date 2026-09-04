package com.google.android.exoplayer2.ui;

/* JADX INFO: compiled from: TimeBar.java */
/* JADX INFO: loaded from: classes7.dex */
public interface u0 {

    /* JADX INFO: compiled from: TimeBar.java */
    public interface a {
        void A(u0 u0Var, long j10);

        void s(u0 u0Var, long j10, boolean z10);

        void z(u0 u0Var, long j10);
    }

    void a(a aVar);

    void b(a aVar);

    long getPreferredUpdateDelay();

    void setAdGroupTimesMs(@androidx.annotation.p0 long[] jArr, @androidx.annotation.p0 boolean[] zArr, int i10);

    void setBufferedPosition(long j10);

    void setDuration(long j10);

    void setEnabled(boolean z10);

    void setKeyCountIncrement(int i10);

    void setKeyTimeIncrement(long j10);

    void setPosition(long j10);
}
