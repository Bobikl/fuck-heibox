package xyz.mylib.creator.encoder;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: AnimatedGifEncoder.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f141411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f141412b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f141416f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected OutputStream f141420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected Bitmap f141421k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected byte[] f141422l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected byte[] f141423m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f141424n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected byte[] f141425o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f141413c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f141414d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f141415e = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f141417g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f141418h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f141419i = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected boolean[] f141426p = new boolean[256];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected int f141427q = 7;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected int f141428r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f141429s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f141430t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f141431u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected int f141432v = 10;

    public boolean a(Bitmap bitmap) {
        if (bitmap == null || !this.f141419i) {
            return false;
        }
        try {
            if (!this.f141431u) {
                m(bitmap.getWidth(), bitmap.getHeight());
            }
            this.f141421k = bitmap;
            f();
            b();
            if (this.f141430t) {
                r();
                t();
                if (this.f141417g >= 0) {
                    s();
                }
            }
            p();
            q();
            if (!this.f141430t) {
                t();
            }
            u();
            this.f141430t = false;
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    protected void b() {
        byte[] bArr = this.f141422l;
        int length = bArr.length;
        int i10 = length / 3;
        this.f141423m = new byte[i10];
        e eVar = new e(bArr, length, this.f141432v);
        this.f141425o = eVar.h();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr2 = this.f141425o;
            if (i12 >= bArr2.length) {
                break;
            }
            byte b10 = bArr2[i12];
            int i13 = i12 + 2;
            bArr2[i12] = bArr2[i13];
            bArr2[i13] = b10;
            this.f141426p[i12 / 3] = false;
            i12 += 3;
        }
        int i14 = 0;
        while (i11 < i10) {
            byte[] bArr3 = this.f141422l;
            int i15 = i14 + 1;
            int i16 = i15 + 1;
            int iG = eVar.g(bArr3[i14] & 255, bArr3[i15] & 255, bArr3[i16] & 255);
            this.f141426p[iG] = true;
            this.f141423m[i11] = (byte) iG;
            i11++;
            i14 = i16 + 1;
        }
        this.f141422l = null;
        this.f141424n = 8;
        this.f141427q = 7;
        int i17 = this.f141415e;
        if (i17 != -1) {
            this.f141416f = c(i17);
        }
    }

    protected int c(int i10) {
        byte[] bArr = this.f141425o;
        if (bArr == null) {
            return -1;
        }
        int i11 = (i10 >> 16) & 255;
        int i12 = (i10 >> 8) & 255;
        int i13 = 0;
        int i14 = (i10 >> 0) & 255;
        int length = bArr.length;
        int i15 = 16777216;
        int i16 = 0;
        while (i13 < length) {
            byte[] bArr2 = this.f141425o;
            int i17 = i13 + 1;
            int i18 = i11 - (bArr2[i13] & 255);
            int i19 = i17 + 1;
            int i20 = i12 - (bArr2[i17] & 255);
            int i21 = i14 - (bArr2[i19] & 255);
            int i22 = (i18 * i18) + (i20 * i20) + (i21 * i21);
            int i23 = i19 / 3;
            if (this.f141426p[i23] && i22 < i15) {
                i15 = i22;
                i16 = i23;
            }
            i13 = i19 + 1;
        }
        return i16;
    }

    public boolean d() {
        boolean z10;
        if (!this.f141419i) {
            return false;
        }
        this.f141419i = false;
        try {
            this.f141420j.write(59);
            this.f141420j.flush();
            if (this.f141429s) {
                this.f141420j.close();
            }
            z10 = true;
        } catch (IOException unused) {
            z10 = false;
        }
        this.f141416f = 0;
        this.f141420j = null;
        this.f141421k = null;
        this.f141422l = null;
        this.f141423m = null;
        this.f141425o = null;
        this.f141429s = false;
        this.f141430t = true;
        return z10;
    }

    protected int[] e(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return iArr;
    }

    protected void f() {
        int width = this.f141421k.getWidth();
        int height = this.f141421k.getHeight();
        int i10 = this.f141411a;
        if (width != i10 || height != this.f141412b) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, this.f141412b, Bitmap.Config.RGB_565);
            new Canvas(bitmapCreateBitmap).drawBitmap(this.f141421k, 0.0f, 0.0f, new Paint());
            this.f141421k = bitmapCreateBitmap;
        }
        int[] iArrE = e(this.f141421k);
        this.f141422l = new byte[iArrE.length * 3];
        for (int i11 = 0; i11 < iArrE.length; i11++) {
            int i12 = iArrE[i11];
            int i13 = i11 * 3;
            byte[] bArr = this.f141422l;
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i12 >> 0) & 255);
            bArr[i14] = (byte) ((i12 >> 8) & 255);
            bArr[i14 + 1] = (byte) ((i12 >> 16) & 255);
        }
    }

    public void g(int i10) {
        this.f141418h = i10 / 10;
    }

    public void h(int i10) {
        if (i10 >= 0) {
            this.f141428r = i10;
        }
    }

    public void i(float f10) {
        if (f10 != 0.0f) {
            this.f141418h = (int) (100.0f / f10);
        }
    }

    public void j(int i10, int i11) {
        this.f141413c = i10;
        this.f141414d = i11;
    }

    public void k(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        this.f141432v = i10;
    }

    public void l(int i10) {
        if (i10 >= 0) {
            this.f141417g = i10;
        }
    }

    public void m(int i10, int i11) {
        this.f141411a = i10;
        this.f141412b = i11;
        if (i10 < 1) {
            this.f141411a = bb.c.b.f30693i3;
        }
        if (i11 < 1) {
            this.f141412b = 240;
        }
        this.f141431u = true;
    }

    public void n(int i10) {
        this.f141415e = i10;
    }

    public boolean o(OutputStream outputStream) {
        boolean z10 = false;
        if (outputStream == null) {
            return false;
        }
        this.f141429s = false;
        this.f141420j = outputStream;
        try {
            w("GIF89a");
            z10 = true;
        } catch (IOException unused) {
        }
        this.f141419i = z10;
        return z10;
    }

    protected void p() throws IOException {
        int i10;
        int i11;
        this.f141420j.write(33);
        this.f141420j.write(bb.c.b.P1);
        this.f141420j.write(4);
        if (this.f141415e == -1) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = 1;
            i11 = 2;
        }
        int i12 = this.f141428r;
        if (i12 >= 0) {
            i11 = i12 & 7;
        }
        this.f141420j.write(i10 | (i11 << 2) | 0 | 0);
        v(this.f141418h);
        this.f141420j.write(this.f141416f);
        this.f141420j.write(0);
    }

    protected void q() throws IOException {
        this.f141420j.write(44);
        v(this.f141413c);
        v(this.f141414d);
        v(this.f141411a);
        v(this.f141412b);
        if (this.f141430t) {
            this.f141420j.write(0);
        } else {
            this.f141420j.write(this.f141427q | 128);
        }
    }

    protected void r() throws IOException {
        v(this.f141411a);
        v(this.f141412b);
        this.f141420j.write(this.f141427q | 240);
        this.f141420j.write(0);
        this.f141420j.write(0);
    }

    protected void s() throws IOException {
        this.f141420j.write(33);
        this.f141420j.write(255);
        this.f141420j.write(11);
        w("NETSCAPE2.0");
        this.f141420j.write(3);
        this.f141420j.write(1);
        v(this.f141417g);
        this.f141420j.write(0);
    }

    protected void t() throws IOException {
        OutputStream outputStream = this.f141420j;
        byte[] bArr = this.f141425o;
        outputStream.write(bArr, 0, bArr.length);
        int length = 768 - this.f141425o.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f141420j.write(0);
        }
    }

    protected void u() throws IOException {
        new d(this.f141411a, this.f141412b, this.f141423m, this.f141424n).f(this.f141420j);
    }

    protected void v(int i10) throws IOException {
        this.f141420j.write(i10 & 255);
        this.f141420j.write((i10 >> 8) & 255);
    }

    protected void w(String str) throws IOException {
        for (int i10 = 0; i10 < str.length(); i10++) {
            this.f141420j.write((byte) str.charAt(i10));
        }
    }
}
