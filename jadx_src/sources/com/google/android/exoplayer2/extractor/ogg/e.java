package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.n;
import com.google.android.exoplayer2.util.e0;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: OggPacket.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f45629a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0 f45630b = new e0(new byte[f.f45636n], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f45631c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f45632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f45633e;

    e() {
    }

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f45632d = 0;
        do {
            int i13 = this.f45632d;
            int i14 = i10 + i13;
            f fVar = this.f45629a;
            if (i14 >= fVar.f45646g) {
                break;
            }
            int[] iArr = fVar.f45649j;
            this.f45632d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f45629a;
    }

    public e0 c() {
        return this.f45630b;
    }

    public boolean d(l lVar) throws IOException {
        int i10;
        com.google.android.exoplayer2.util.a.i(lVar != null);
        if (this.f45633e) {
            this.f45633e = false;
            this.f45630b.O(0);
        }
        while (!this.f45633e) {
            if (this.f45631c < 0) {
                if (!this.f45629a.c(lVar) || !this.f45629a.a(lVar, true)) {
                    return false;
                }
                f fVar = this.f45629a;
                int iA = fVar.f45647h;
                if ((fVar.f45641b & 1) == 1 && this.f45630b.f() == 0) {
                    iA += a(0);
                    i10 = this.f45632d + 0;
                } else {
                    i10 = 0;
                }
                if (!n.e(lVar, iA)) {
                    return false;
                }
                this.f45631c = i10;
            }
            int iA2 = a(this.f45631c);
            int i11 = this.f45631c + this.f45632d;
            if (iA2 > 0) {
                e0 e0Var = this.f45630b;
                e0Var.c(e0Var.f() + iA2);
                if (!n.d(lVar, this.f45630b.d(), this.f45630b.f(), iA2)) {
                    return false;
                }
                e0 e0Var2 = this.f45630b;
                e0Var2.R(e0Var2.f() + iA2);
                this.f45633e = this.f45629a.f45649j[i11 + (-1)] != 255;
            }
            if (i11 == this.f45629a.f45646g) {
                i11 = -1;
            }
            this.f45631c = i11;
        }
        return true;
    }

    public void e() {
        this.f45629a.b();
        this.f45630b.O(0);
        this.f45631c = -1;
        this.f45633e = false;
    }

    public void f() {
        if (this.f45630b.d().length == 65025) {
            return;
        }
        e0 e0Var = this.f45630b;
        e0Var.Q(Arrays.copyOf(e0Var.d(), Math.max(f.f45636n, this.f45630b.f())), this.f45630b.f());
    }
}
