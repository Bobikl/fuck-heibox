package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.p0;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: compiled from: CachedContent.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f51018f = "CachedContent";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TreeSet<u> f51021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<a> f51022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o f51023e;

    /* JADX INFO: compiled from: CachedContent.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f51024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f51025b;

        public a(long j10, long j11) {
            this.f51024a = j10;
            this.f51025b = j11;
        }

        public boolean a(long j10, long j11) {
            long j12 = this.f51025b;
            if (j12 == -1) {
                return j10 >= this.f51024a;
            }
            if (j11 == -1) {
                return false;
            }
            long j13 = this.f51024a;
            return j13 <= j10 && j10 + j11 <= j13 + j12;
        }

        public boolean b(long j10, long j11) {
            long j12 = this.f51024a;
            if (j12 > j10) {
                return j11 == -1 || j10 + j11 > j12;
            }
            long j13 = this.f51025b;
            return j13 == -1 || j12 + j13 > j10;
        }
    }

    public j(int i10, String str) {
        this(i10, str, o.f51064f);
    }

    public j(int i10, String str, o oVar) {
        this.f51019a = i10;
        this.f51020b = str;
        this.f51023e = oVar;
        this.f51021c = new TreeSet<>();
        this.f51022d = new ArrayList<>();
    }

    public void a(u uVar) {
        this.f51021c.add(uVar);
    }

    public boolean b(n nVar) {
        o oVar = this.f51023e;
        o oVarF = oVar.f(nVar);
        this.f51023e = oVarF;
        return !oVarF.equals(oVar);
    }

    public long c(long j10, long j11) {
        com.google.android.exoplayer2.util.a.a(j10 >= 0);
        com.google.android.exoplayer2.util.a.a(j11 >= 0);
        u uVarE = e(j10, j11);
        if (uVarE.b()) {
            return -Math.min(uVarE.c() ? Long.MAX_VALUE : uVarE.f51003d, j11);
        }
        long j12 = j10 + j11;
        long j13 = j12 >= 0 ? j12 : Long.MAX_VALUE;
        long jMax = uVarE.f51002c + uVarE.f51003d;
        if (jMax < j13) {
            for (u uVar : this.f51021c.tailSet(uVarE, false)) {
                long j14 = uVar.f51002c;
                if (j14 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j14 + uVar.f51003d);
                if (jMax >= j13) {
                    break;
                }
            }
        }
        return Math.min(jMax - j10, j11);
    }

    public o d() {
        return this.f51023e;
    }

    public u e(long j10, long j11) {
        u uVarH = u.h(this.f51020b, j10);
        u uVarFloor = this.f51021c.floor(uVarH);
        if (uVarFloor != null && uVarFloor.f51002c + uVarFloor.f51003d > j10) {
            return uVarFloor;
        }
        u uVarCeiling = this.f51021c.ceiling(uVarH);
        if (uVarCeiling != null) {
            long j12 = uVarCeiling.f51002c - j10;
            j11 = j11 == -1 ? j12 : Math.min(j12, j11);
        }
        return u.g(this.f51020b, j10, j11);
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f51019a == jVar.f51019a && this.f51020b.equals(jVar.f51020b) && this.f51021c.equals(jVar.f51021c) && this.f51023e.equals(jVar.f51023e);
    }

    public TreeSet<u> f() {
        return this.f51021c;
    }

    public boolean g() {
        return this.f51021c.isEmpty();
    }

    public boolean h(long j10, long j11) {
        for (int i10 = 0; i10 < this.f51022d.size(); i10++) {
            if (this.f51022d.get(i10).a(j10, j11)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f51019a * 31) + this.f51020b.hashCode()) * 31) + this.f51023e.hashCode();
    }

    public boolean i() {
        return this.f51022d.isEmpty();
    }

    public boolean j(long j10, long j11) {
        for (int i10 = 0; i10 < this.f51022d.size(); i10++) {
            if (this.f51022d.get(i10).b(j10, j11)) {
                return false;
            }
        }
        this.f51022d.add(new a(j10, j11));
        return true;
    }

    public boolean k(h hVar) {
        if (!this.f51021c.remove(hVar)) {
            return false;
        }
        File file = hVar.f51005f;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public u l(u uVar, long j10, boolean z10) {
        com.google.android.exoplayer2.util.a.i(this.f51021c.remove(uVar));
        File file = (File) com.google.android.exoplayer2.util.a.g(uVar.f51005f);
        if (z10) {
            File fileI = u.i((File) com.google.android.exoplayer2.util.a.g(file.getParentFile()), this.f51019a, uVar.f51002c, j10);
            if (file.renameTo(fileI)) {
                file = fileI;
            } else {
                String strValueOf = String.valueOf(file);
                String strValueOf2 = String.valueOf(fileI);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 21 + strValueOf2.length());
                sb2.append("Failed to rename ");
                sb2.append(strValueOf);
                sb2.append(" to ");
                sb2.append(strValueOf2);
                com.google.android.exoplayer2.util.u.m(f51018f, sb2.toString());
            }
        }
        u uVarD = uVar.d(file, j10);
        this.f51021c.add(uVarD);
        return uVarD;
    }

    public void m(long j10) {
        for (int i10 = 0; i10 < this.f51022d.size(); i10++) {
            if (this.f51022d.get(i10).f51024a == j10) {
                this.f51022d.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }
}
