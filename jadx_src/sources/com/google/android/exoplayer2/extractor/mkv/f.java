package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.util.e0;
import java.io.IOException;

/* JADX INFO: compiled from: Sniffer.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f45247c = 1024;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f45248d = 440786851;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f45249a = new e0(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45250b;

    private long a(l lVar) throws IOException {
        int i10 = 0;
        lVar.l(this.f45249a.d(), 0, 1);
        int i11 = this.f45249a.d()[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        lVar.l(this.f45249a.d(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f45249a.d()[i10] & 255) + (i14 << 8);
        }
        this.f45250b += i13 + 1;
        return i14;
    }

    public boolean b(l lVar) throws IOException {
        long length = lVar.getLength();
        long j10 = 1024;
        if (length != -1 && length <= 1024) {
            j10 = length;
        }
        int i10 = (int) j10;
        lVar.l(this.f45249a.d(), 0, 4);
        long jI = this.f45249a.I();
        this.f45250b = 4;
        while (jI != 440786851) {
            int i11 = this.f45250b + 1;
            this.f45250b = i11;
            if (i11 == i10) {
                return false;
            }
            lVar.l(this.f45249a.d(), 0, 1);
            jI = ((jI << 8) & (-256)) | ((long) (this.f45249a.d()[0] & 255));
        }
        long jA = a(lVar);
        long j11 = this.f45250b;
        if (jA == Long.MIN_VALUE) {
            return false;
        }
        if (length != -1 && j11 + jA >= length) {
            return false;
        }
        while (true) {
            int i12 = this.f45250b;
            long j12 = j11 + jA;
            if (i12 >= j12) {
                return ((long) i12) == j12;
            }
            if (a(lVar) == Long.MIN_VALUE) {
                return false;
            }
            long jA2 = a(lVar);
            if (jA2 < 0 || jA2 > 2147483647L) {
                return false;
            }
            if (jA2 != 0) {
                int i13 = (int) jA2;
                lVar.s(i13);
                this.f45250b += i13;
            }
        }
    }
}
