package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.j1;
import com.google.android.exoplayer2.audio.v0;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: compiled from: RtpPacketReorderingQueue.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @j1
    static final int f48779e = 1000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f48780f = 65535;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f48781g = 5000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private final TreeSet<a> f48782a = new TreeSet<>(new Comparator() { // from class: com.google.android.exoplayer2.source.rtsp.i
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return j.d((j.a) obj, (j.a) obj2);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private int f48783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private int f48784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private boolean f48785d;

    /* JADX INFO: compiled from: RtpPacketReorderingQueue.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f48786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f48787b;

        public a(h hVar, long j10) {
            this.f48786a = hVar;
            this.f48787b = j10;
        }
    }

    public j() {
        i();
    }

    private synchronized void b(a aVar) {
        this.f48783b = aVar.f48786a.f48757g;
        this.f48782a.add(aVar);
    }

    private static int c(int i10, int i11) {
        int iMin;
        int i12 = i10 - i11;
        if (Math.abs(i12) <= 1000 || (iMin = (Math.min(i10, i11) - Math.max(i10, i11)) + 65535) >= 1000) {
            return i12;
        }
        return i10 < i11 ? iMin : -iMin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int d(a aVar, a aVar2) {
        return c(aVar.f48786a.f48757g, aVar2.f48786a.f48757g);
    }

    private static int e(int i10) {
        return (i10 + 1) % 65535;
    }

    private static int h(int i10) {
        return i10 == 0 ? v0.f44322j : (i10 - 1) % 65535;
    }

    public synchronized boolean f(h hVar, long j10) {
        if (this.f48782a.size() >= 5000) {
            throw new IllegalStateException("Queue size limit of 5000 reached.");
        }
        int i10 = hVar.f48757g;
        if (!this.f48785d) {
            i();
            this.f48784c = h(i10);
            this.f48785d = true;
            b(new a(hVar, j10));
            return true;
        }
        if (Math.abs(c(i10, e(this.f48783b))) < 1000) {
            if (c(i10, this.f48784c) <= 0) {
                return false;
            }
            b(new a(hVar, j10));
            return true;
        }
        this.f48784c = h(i10);
        this.f48782a.clear();
        b(new a(hVar, j10));
        return true;
    }

    @androidx.annotation.p0
    public synchronized h g(long j10) {
        if (this.f48782a.isEmpty()) {
            return null;
        }
        a aVarFirst = this.f48782a.first();
        int i10 = aVarFirst.f48786a.f48757g;
        if (i10 != e(this.f48784c) && j10 < aVarFirst.f48787b) {
            return null;
        }
        this.f48782a.pollFirst();
        this.f48784c = i10;
        return aVarFirst.f48786a;
    }

    public synchronized void i() {
        this.f48782a.clear();
        this.f48785d = false;
        this.f48784c = -1;
        this.f48783b = -1;
    }
}
