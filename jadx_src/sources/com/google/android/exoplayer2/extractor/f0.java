package com.google.android.exoplayer2.extractor;

import androidx.annotation.p0;
import java.io.IOException;

/* JADX INFO: compiled from: TrueHdSampleRechunker.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f44884a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f44885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f44887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f44888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f44889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f44890g;

    public void a(e0 e0Var, @p0 e0.a aVar) {
        if (this.f44886c > 0) {
            e0Var.e(this.f44887d, this.f44888e, this.f44889f, this.f44890g, aVar);
            this.f44886c = 0;
        }
    }

    public void b() {
        this.f44885b = false;
        this.f44886c = 0;
    }

    public void c(e0 e0Var, long j10, int i10, int i11, int i12, @p0 e0.a aVar) {
        com.google.android.exoplayer2.util.a.j(this.f44890g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f44885b) {
            int i13 = this.f44886c;
            int i14 = i13 + 1;
            this.f44886c = i14;
            if (i13 == 0) {
                this.f44887d = j10;
                this.f44888e = i10;
                this.f44889f = 0;
            }
            this.f44889f += i11;
            this.f44890g = i12;
            if (i14 >= 16) {
                a(e0Var, aVar);
            }
        }
    }

    public void d(l lVar) throws IOException {
        if (this.f44885b) {
            return;
        }
        lVar.l(this.f44884a, 0, 10);
        lVar.o();
        if (com.google.android.exoplayer2.audio.b.i(this.f44884a) == 0) {
            return;
        }
        this.f44885b = true;
    }
}
