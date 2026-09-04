package com.xiaomi.push;

import java.io.InputStream;
import java.util.Vector;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f106848a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final InputStream f206a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final byte[] f207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f106849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f106850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f106851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f106852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f106853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f106854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f106855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f106856i;

    private b(InputStream inputStream) {
        this.f106853f = Integer.MAX_VALUE;
        this.f106855h = 64;
        this.f106856i = 67108864;
        this.f207a = new byte[4096];
        this.f106848a = 0;
        this.f106850c = 0;
        this.f206a = inputStream;
    }

    private b(byte[] bArr, int i10, int i11) {
        this.f106853f = Integer.MAX_VALUE;
        this.f106855h = 64;
        this.f106856i = 67108864;
        this.f207a = bArr;
        this.f106848a = i11 + i10;
        this.f106850c = i10;
        this.f206a = null;
    }

    public static b a(InputStream inputStream) {
        return new b(inputStream);
    }

    public static b a(byte[] bArr, int i10, int i11) {
        return new b(bArr, i10, i11);
    }

    private boolean a(boolean z10) throws d {
        int i10 = this.f106850c;
        int i11 = this.f106848a;
        if (i10 < i11) {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        }
        int i12 = this.f106852e;
        if (i12 + i11 == this.f106853f) {
            if (z10) {
                throw d.a();
            }
            return false;
        }
        this.f106852e = i12 + i11;
        this.f106850c = 0;
        InputStream inputStream = this.f206a;
        int i13 = inputStream == null ? -1 : inputStream.read(this.f207a);
        this.f106848a = i13;
        if (i13 == 0 || i13 < -1) {
            throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.f106848a + "\nThe InputStream implementation is buggy.");
        }
        if (i13 == -1) {
            this.f106848a = 0;
            if (z10) {
                throw d.a();
            }
            return false;
        }
        b();
        int i14 = this.f106852e + this.f106848a + this.f106849b;
        if (i14 > this.f106856i || i14 < 0) {
            throw d.h();
        }
        return true;
    }

    private void b() {
        int i10 = this.f106848a + this.f106849b;
        this.f106848a = i10;
        int i11 = this.f106852e + i10;
        int i12 = this.f106853f;
        if (i11 <= i12) {
            this.f106849b = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f106849b = i13;
        this.f106848a = i10 - i13;
    }

    public byte a() throws d {
        if (this.f106850c == this.f106848a) {
            a(true);
        }
        byte[] bArr = this.f207a;
        int i10 = this.f106850c;
        this.f106850c = i10 + 1;
        return bArr[i10];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public int m158a() throws d {
        if (m169b()) {
            this.f106851d = 0;
            return 0;
        }
        int iD = d();
        this.f106851d = iD;
        if (iD != 0) {
            return iD;
        }
        throw d.d();
    }

    public int a(int i10) throws d {
        if (i10 < 0) {
            throw d.b();
        }
        int i11 = i10 + this.f106852e + this.f106850c;
        int i12 = this.f106853f;
        if (i11 > i12) {
            throw d.a();
        }
        this.f106853f = i11;
        b();
        return i12;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public long m159a() {
        return m170c();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public a m160a() throws d {
        int iD = d();
        int i10 = this.f106848a;
        int i11 = this.f106850c;
        if (iD > i10 - i11 || iD <= 0) {
            return a.a(m166a(iD));
        }
        a aVarA = a.a(this.f207a, i11, iD);
        this.f106850c += iD;
        return aVarA;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m161a() throws d {
        int iD = d();
        int i10 = this.f106848a;
        int i11 = this.f106850c;
        if (iD > i10 - i11 || iD <= 0) {
            return new String(m166a(iD), "UTF-8");
        }
        String str = new String(this.f207a, i11, iD, "UTF-8");
        this.f106850c += iD;
        return str;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m162a() throws d {
        int iM158a;
        do {
            iM158a = m158a();
            if (iM158a == 0) {
                return;
            }
        } while (m165a(iM158a));
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m163a(int i10) throws d {
        if (this.f106851d != i10) {
            throw d.e();
        }
    }

    public void a(e eVar) throws d {
        int iD = d();
        if (this.f106854g >= this.f106855h) {
            throw d.g();
        }
        int iA = a(iD);
        this.f106854g++;
        eVar.a(this);
        m163a(0);
        this.f106854g--;
        b(iA);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m164a() {
        return d() != 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m165a(int i10) throws d {
        int iA = f.a(i10);
        if (iA == 0) {
            m167b();
            return true;
        }
        if (iA == 1) {
            m171d();
            return true;
        }
        if (iA == 2) {
            c(d());
            return true;
        }
        if (iA == 3) {
            m162a();
            m163a(f.a(f.b(i10), 4));
            return true;
        }
        if (iA == 4) {
            return false;
        }
        if (iA != 5) {
            throw d.f();
        }
        e();
        return true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public byte[] m166a(int i10) throws d {
        if (i10 < 0) {
            throw d.b();
        }
        int i11 = this.f106852e;
        int i12 = this.f106850c;
        int i13 = i11 + i12 + i10;
        int i14 = this.f106853f;
        if (i13 > i14) {
            c((i14 - i11) - i12);
            throw d.a();
        }
        int i15 = this.f106848a;
        if (i10 <= i15 - i12) {
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f207a, i12, bArr, 0, i10);
            this.f106850c += i10;
            return bArr;
        }
        if (i10 >= 4096) {
            this.f106852e = i11 + i15;
            this.f106850c = 0;
            this.f106848a = 0;
            int length = i15 - i12;
            int i16 = i10 - length;
            Vector vector = new Vector();
            while (i16 > 0) {
                int iMin = Math.min(i16, 4096);
                byte[] bArr2 = new byte[iMin];
                int i17 = 0;
                while (i17 < iMin) {
                    InputStream inputStream = this.f206a;
                    int i18 = inputStream == null ? -1 : inputStream.read(bArr2, i17, iMin - i17);
                    if (i18 == -1) {
                        throw d.a();
                    }
                    this.f106852e += i18;
                    i17 += i18;
                }
                i16 -= iMin;
                vector.addElement(bArr2);
            }
            byte[] bArr3 = new byte[i10];
            System.arraycopy(this.f207a, i12, bArr3, 0, length);
            for (int i19 = 0; i19 < vector.size(); i19++) {
                byte[] bArr4 = (byte[]) vector.elementAt(i19);
                System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
                length += bArr4.length;
            }
            return bArr3;
        }
        byte[] bArr5 = new byte[i10];
        int i20 = i15 - i12;
        System.arraycopy(this.f207a, i12, bArr5, 0, i20);
        this.f106850c = this.f106848a;
        a(true);
        while (true) {
            int i21 = i10 - i20;
            int i22 = this.f106848a;
            if (i21 <= i22) {
                System.arraycopy(this.f207a, 0, bArr5, i20, i21);
                this.f106850c = i21;
                return bArr5;
            }
            System.arraycopy(this.f207a, 0, bArr5, i20, i22);
            int i23 = this.f106848a;
            i20 += i23;
            this.f106850c = i23;
            a(true);
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public int m167b() {
        return d();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public long m168b() {
        return m170c();
    }

    public void b(int i10) {
        this.f106853f = i10;
        b();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m169b() {
        return this.f106850c == this.f106848a && !a(false);
    }

    public int c() {
        return d();
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public long m170c() throws d {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bA = a();
            j10 |= ((long) (bA & 127)) << i10;
            if ((bA & 128) == 0) {
                return j10;
            }
        }
        throw d.c();
    }

    public void c(int i10) throws d {
        if (i10 < 0) {
            throw d.b();
        }
        int i11 = this.f106852e;
        int i12 = this.f106850c;
        int i13 = i11 + i12 + i10;
        int i14 = this.f106853f;
        if (i13 > i14) {
            c((i14 - i11) - i12);
            throw d.a();
        }
        int i15 = this.f106848a;
        if (i10 <= i15 - i12) {
            this.f106850c = i12 + i10;
            return;
        }
        int i16 = i15 - i12;
        this.f106852e = i11 + i15;
        this.f106850c = 0;
        this.f106848a = 0;
        while (i16 < i10) {
            InputStream inputStream = this.f206a;
            int iSkip = inputStream == null ? -1 : (int) inputStream.skip(i10 - i16);
            if (iSkip <= 0) {
                throw d.a();
            }
            i16 += iSkip;
            this.f106852e += iSkip;
        }
    }

    public int d() throws d {
        int i10;
        byte bA = a();
        if (bA >= 0) {
            return bA;
        }
        int i11 = bA & 127;
        byte bA2 = a();
        if (bA2 >= 0) {
            i10 = bA2 << 7;
        } else {
            i11 |= (bA2 & 127) << 7;
            byte bA3 = a();
            if (bA3 >= 0) {
                i10 = bA3 << 14;
            } else {
                i11 |= (bA3 & 127) << 14;
                byte bA4 = a();
                if (bA4 < 0) {
                    int i12 = i11 | ((bA4 & 127) << 21);
                    byte bA5 = a();
                    int i13 = i12 | (bA5 << com.google.common.base.a.F);
                    if (bA5 >= 0) {
                        return i13;
                    }
                    for (int i14 = 0; i14 < 5; i14++) {
                        if (a() >= 0) {
                            return i13;
                        }
                    }
                    throw d.c();
                }
                i10 = bA4 << com.google.common.base.a.f56672y;
            }
        }
        return i11 | i10;
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public long m171d() throws d {
        byte bA = a();
        return ((((long) a()) & 255) << 8) | (((long) bA) & 255) | ((((long) a()) & 255) << 16) | ((((long) a()) & 255) << 24) | ((((long) a()) & 255) << 32) | ((((long) a()) & 255) << 40) | ((((long) a()) & 255) << 48) | ((((long) a()) & 255) << 56);
    }

    public int e() throws d {
        return (a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24);
    }
}
