package com.bumptech.glide.gifdecoder;

import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.j1;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: GifHeaderParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f40708e = "GifHeaderParser";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f40709f = 255;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f40710g = 44;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f40711h = 33;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f40712i = 59;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f40713j = 249;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f40714k = 255;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f40715l = 254;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f40716m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f40717n = 28;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f40718o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f40719p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f40720q = 128;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f40721r = 64;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f40722s = 7;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f40723t = 128;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f40724u = 7;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final int f40725v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final int f40726w = 10;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f40727x = 256;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f40729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f40730c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f40728a = new byte[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f40731d = 0;

    private boolean b() {
        return this.f40730c.f40696b != 0;
    }

    private int e() {
        try {
            return this.f40729b.get() & 255;
        } catch (Exception unused) {
            this.f40730c.f40696b = 1;
            return 0;
        }
    }

    private void f() {
        this.f40730c.f40698d.f40682a = o();
        this.f40730c.f40698d.f40683b = o();
        this.f40730c.f40698d.f40684c = o();
        this.f40730c.f40698d.f40685d = o();
        int iE = e();
        boolean z10 = (iE & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iE & 7) + 1);
        b bVar = this.f40730c.f40698d;
        bVar.f40686e = (iE & 64) != 0;
        if (z10) {
            bVar.f40692k = h(iPow);
        } else {
            bVar.f40692k = null;
        }
        this.f40730c.f40698d.f40691j = this.f40729b.position();
        t();
        if (b()) {
            return;
        }
        c cVar = this.f40730c;
        cVar.f40697c++;
        cVar.f40699e.add(cVar.f40698d);
    }

    private void g() {
        int iE = e();
        this.f40731d = iE;
        if (iE <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                int i12 = this.f40731d;
                if (i10 >= i12) {
                    return;
                }
                i11 = i12 - i10;
                this.f40729b.get(this.f40728a, i10, i11);
                i10 += i11;
            } catch (Exception e10) {
                if (Log.isLoggable(f40708e, 3)) {
                    Log.d(f40708e, "Error Reading Block n: " + i10 + " count: " + i11 + " blockSize: " + this.f40731d, e10);
                }
                this.f40730c.f40696b = 1;
                return;
            }
        }
    }

    @p0
    private int[] h(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f40729b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                int i16 = i11 + 1;
                iArr[i11] = ((bArr[i12] & 255) << 16) | j1.f21601t | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
                i12 = i15;
                i11 = i16;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable(f40708e, 3)) {
                Log.d(f40708e, "Format Error Reading Color Table", e10);
            }
            this.f40730c.f40696b = 1;
        }
        return iArr;
    }

    private void i() {
        j(Integer.MAX_VALUE);
    }

    private void j(int i10) {
        boolean z10 = false;
        while (!z10 && !b() && this.f40730c.f40697c <= i10) {
            int iE = e();
            if (iE == 33) {
                int iE2 = e();
                if (iE2 == 1) {
                    s();
                } else if (iE2 == 249) {
                    this.f40730c.f40698d = new b();
                    k();
                } else if (iE2 == 254) {
                    s();
                } else if (iE2 != 255) {
                    s();
                } else {
                    g();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < 11; i11++) {
                        sb2.append((char) this.f40728a[i11]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        n();
                    } else {
                        s();
                    }
                }
            } else if (iE == 44) {
                c cVar = this.f40730c;
                if (cVar.f40698d == null) {
                    cVar.f40698d = new b();
                }
                f();
            } else if (iE != 59) {
                this.f40730c.f40696b = 1;
            } else {
                z10 = true;
            }
        }
    }

    private void k() {
        e();
        int iE = e();
        b bVar = this.f40730c.f40698d;
        int i10 = (iE & 28) >> 2;
        bVar.f40688g = i10;
        if (i10 == 0) {
            bVar.f40688g = 1;
        }
        bVar.f40687f = (iE & 1) != 0;
        int iO = o();
        if (iO < 2) {
            iO = 10;
        }
        b bVar2 = this.f40730c.f40698d;
        bVar2.f40690i = iO * 10;
        bVar2.f40689h = e();
        e();
    }

    private void l() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) e());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f40730c.f40696b = 1;
            return;
        }
        m();
        if (!this.f40730c.f40702h || b()) {
            return;
        }
        c cVar = this.f40730c;
        cVar.f40695a = h(cVar.f40703i);
        c cVar2 = this.f40730c;
        cVar2.f40706l = cVar2.f40695a[cVar2.f40704j];
    }

    private void m() {
        this.f40730c.f40700f = o();
        this.f40730c.f40701g = o();
        int iE = e();
        c cVar = this.f40730c;
        cVar.f40702h = (iE & 128) != 0;
        cVar.f40703i = (int) Math.pow(2.0d, (iE & 7) + 1);
        this.f40730c.f40704j = e();
        this.f40730c.f40705k = e();
    }

    private void n() {
        do {
            g();
            byte[] bArr = this.f40728a;
            if (bArr[0] == 1) {
                this.f40730c.f40707m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f40731d <= 0) {
                return;
            }
        } while (!b());
    }

    private int o() {
        return this.f40729b.getShort();
    }

    private void p() {
        this.f40729b = null;
        Arrays.fill(this.f40728a, (byte) 0);
        this.f40730c = new c();
        this.f40731d = 0;
    }

    private void s() {
        int iE;
        do {
            iE = e();
            this.f40729b.position(Math.min(this.f40729b.position() + iE, this.f40729b.limit()));
        } while (iE > 0);
    }

    private void t() {
        e();
        s();
    }

    public void a() {
        this.f40729b = null;
        this.f40730c = null;
    }

    public boolean c() {
        l();
        if (!b()) {
            j(2);
        }
        return this.f40730c.f40697c > 1;
    }

    @n0
    public c d() {
        if (this.f40729b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f40730c;
        }
        l();
        if (!b()) {
            i();
            c cVar = this.f40730c;
            if (cVar.f40697c < 0) {
                cVar.f40696b = 1;
            }
        }
        return this.f40730c;
    }

    public d q(@n0 ByteBuffer byteBuffer) {
        p();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f40729b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f40729b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public d r(@p0 byte[] bArr) {
        if (bArr != null) {
            q(ByteBuffer.wrap(bArr));
        } else {
            this.f40729b = null;
            this.f40730c.f40696b = 2;
        }
        return this;
    }
}
