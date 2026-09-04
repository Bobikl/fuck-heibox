package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: StandardGifDecoder.java */
/* JADX INFO: loaded from: classes6.dex */
public class f implements a {
    private static final String A = "f";
    private static final int B = 4096;
    private static final int C = -1;
    private static final int D = -1;
    private static final int E = 4;
    private static final int F = 255;

    @l
    private static final int G = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l
    private int[] f40732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @l
    private final int[] f40733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a.InterfaceC0323a f40734h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ByteBuffer f40735i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte[] f40736j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private d f40737k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short[] f40738l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f40739m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f40740n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private byte[] f40741o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @l
    private int[] f40742p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f40743q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private c f40744r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Bitmap f40745s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f40746t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f40747u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f40748v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f40749w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f40750x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @p0
    private Boolean f40751y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @n0
    private Bitmap.Config f40752z;

    public f(@n0 a.InterfaceC0323a interfaceC0323a) {
        this.f40733g = new int[256];
        this.f40752z = Bitmap.Config.ARGB_8888;
        this.f40734h = interfaceC0323a;
        this.f40744r = new c();
    }

    public f(@n0 a.InterfaceC0323a interfaceC0323a, c cVar, ByteBuffer byteBuffer) {
        this(interfaceC0323a, cVar, byteBuffer, 1);
    }

    public f(@n0 a.InterfaceC0323a interfaceC0323a, c cVar, ByteBuffer byteBuffer, int i10) {
        this(interfaceC0323a);
        p(cVar, byteBuffer, i10);
    }

    @l
    private int r(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f40748v + i10; i18++) {
            byte[] bArr = this.f40741o;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f40732f[bArr[i18] & 255];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f40748v + i20; i21++) {
            byte[] bArr2 = this.f40741o;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f40732f[bArr2[i21] & 255];
            if (i22 != 0) {
                i13 += (i22 >> 24) & 255;
                i14 += (i22 >> 16) & 255;
                i15 += (i22 >> 8) & 255;
                i16 += i22 & 255;
                i17++;
            }
        }
        if (i17 == 0) {
            return 0;
        }
        return ((i13 / i17) << 24) | ((i14 / i17) << 16) | ((i15 / i17) << 8) | (i16 / i17);
    }

    private void s(b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = this.f40742p;
        int i15 = bVar.f40685d;
        int i16 = this.f40748v;
        int i17 = i15 / i16;
        int i18 = bVar.f40683b / i16;
        int i19 = bVar.f40684c / i16;
        int i20 = bVar.f40682a / i16;
        boolean z10 = this.f40743q == 0;
        int i21 = this.f40750x;
        int i22 = this.f40749w;
        byte[] bArr = this.f40741o;
        int[] iArr2 = this.f40732f;
        Boolean bool = this.f40751y;
        int i23 = 8;
        int i24 = 0;
        int i25 = 0;
        int i26 = 1;
        while (i24 < i17) {
            Boolean bool2 = bool;
            if (bVar.f40686e) {
                if (i25 >= i17) {
                    i10 = i17;
                    int i27 = i26 + 1;
                    if (i27 == 2) {
                        i26 = i27;
                        i25 = 4;
                    } else if (i27 == 3) {
                        i26 = i27;
                        i23 = 4;
                        i25 = 2;
                    } else if (i27 != 4) {
                        i26 = i27;
                    } else {
                        i26 = i27;
                        i25 = 1;
                        i23 = 2;
                    }
                } else {
                    i10 = i17;
                }
                i11 = i25 + i23;
            } else {
                i10 = i17;
                i11 = i25;
                i25 = i24;
            }
            int i28 = i25 + i18;
            boolean z11 = i16 == 1;
            if (i28 < i22) {
                int i29 = i28 * i21;
                int i30 = i29 + i20;
                int i31 = i30 + i19;
                int i32 = i29 + i21;
                if (i32 < i31) {
                    i31 = i32;
                }
                i12 = i11;
                int i33 = i24 * i16 * bVar.f40684c;
                if (z11) {
                    int i34 = i30;
                    while (i34 < i31) {
                        int i35 = i18;
                        int i36 = iArr2[bArr[i33] & 255];
                        if (i36 != 0) {
                            iArr[i34] = i36;
                        } else if (z10 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i33 += i16;
                        i34++;
                        i18 = i35;
                    }
                } else {
                    i14 = i18;
                    int i37 = ((i31 - i30) * i16) + i33;
                    int i38 = i30;
                    while (true) {
                        i13 = i19;
                        if (i38 < i31) {
                            int iR = r(i33, i37, bVar.f40684c);
                            if (iR != 0) {
                                iArr[i38] = iR;
                            } else if (z10 && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i33 += i16;
                            i38++;
                            i19 = i13;
                        }
                    }
                }
                bool = bool2;
                i24++;
                i18 = i14;
                i19 = i13;
                i17 = i10;
                i25 = i12;
            } else {
                i12 = i11;
            }
            i14 = i18;
            i13 = i19;
            bool = bool2;
            i24++;
            i18 = i14;
            i19 = i13;
            i17 = i10;
            i25 = i12;
        }
        Boolean bool3 = bool;
        if (this.f40751y == null) {
            this.f40751y = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    private void t(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f40742p;
        int i10 = bVar2.f40685d;
        int i11 = bVar2.f40683b;
        int i12 = bVar2.f40684c;
        int i13 = bVar2.f40682a;
        boolean z10 = this.f40743q == 0;
        int i14 = this.f40750x;
        byte[] bArr = this.f40741o;
        int[] iArr2 = this.f40732f;
        int i15 = 0;
        byte b10 = -1;
        while (i15 < i10) {
            int i16 = (i15 + i11) * i14;
            int i17 = i16 + i13;
            int i18 = i17 + i12;
            int i19 = i16 + i14;
            if (i19 < i18) {
                i18 = i19;
            }
            int i20 = bVar2.f40684c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int i22 = i10;
                int i23 = b11 & 255;
                if (i23 != b10) {
                    int i24 = iArr2[i23];
                    if (i24 != 0) {
                        iArr[i21] = i24;
                    } else {
                        b10 = b11;
                    }
                }
                i20++;
                i21++;
                i10 = i22;
            }
            i15++;
            bVar2 = bVar;
        }
        Boolean bool = this.f40751y;
        this.f40751y = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f40751y == null && z10 && b10 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    private void u(b bVar) {
        int i10;
        int i11;
        short s10;
        this = this;
        if (bVar != null) {
            this.f40735i.position(bVar.f40691j);
        }
        if (bVar == null) {
            c cVar = this.f40744r;
            i10 = cVar.f40700f;
            i11 = cVar.f40701g;
        } else {
            i10 = bVar.f40684c;
            i11 = bVar.f40685d;
        }
        int i12 = i10 * i11;
        byte[] bArr = this.f40741o;
        if (bArr == null || bArr.length < i12) {
            this.f40741o = this.f40734h.a(i12);
        }
        byte[] bArr2 = this.f40741o;
        if (this.f40738l == null) {
            this.f40738l = new short[4096];
        }
        short[] sArr = this.f40738l;
        if (this.f40739m == null) {
            this.f40739m = new byte[4096];
        }
        byte[] bArr3 = this.f40739m;
        if (this.f40740n == null) {
            this.f40740n = new byte[4097];
        }
        byte[] bArr4 = this.f40740n;
        int iY = y();
        int i13 = 1 << iY;
        int i14 = i13 + 1;
        int i15 = i13 + 2;
        int i16 = iY + 1;
        int i17 = (1 << i16) - 1;
        int i18 = 0;
        for (int i19 = 0; i19 < i13; i19++) {
            sArr[i19] = 0;
            bArr3[i19] = (byte) i19;
        }
        byte[] bArr5 = this.f40736j;
        int i20 = i16;
        int i21 = i15;
        int i22 = i17;
        int iX = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = -1;
        while (i18 < i12) {
            if (iX == 0) {
                iX = x();
                if (iX <= 0) {
                    this.f40747u = 3;
                    break;
                }
                i23 = 0;
            }
            i25 += (bArr5[i23] & 255) << i24;
            i23++;
            iX--;
            int i30 = i24 + 8;
            i21 = i21;
            i20 = i20;
            i29 = i29;
            i16 = i16;
            i27 = i27;
            while (true) {
                if (i30 < i20) {
                    i24 = i30;
                    break;
                }
                int i31 = i15;
                int i32 = i25 & i22;
                i25 >>= i20;
                i30 -= i20;
                if (i32 == i13) {
                    i22 = i17;
                    i20 = i16;
                    i21 = i31;
                    i15 = i21;
                    i29 = -1;
                } else {
                    if (i32 == i14) {
                        i24 = i30;
                        i15 = i31;
                        break;
                    }
                    if (i29 == -1) {
                        bArr2[i26] = bArr3[i32];
                        i26++;
                        i18++;
                        i29 = i32;
                        i27 = i29;
                        i15 = i31;
                        i30 = i30;
                    } else {
                        if (i32 >= i21) {
                            bArr4[i28] = (byte) i27;
                            i28++;
                            s10 = i29;
                        } else {
                            s10 = i32;
                        }
                        while (s10 >= i13) {
                            bArr4[i28] = bArr3[s10];
                            i28++;
                            s10 = sArr[s10];
                        }
                        i27 = bArr3[s10] & 255;
                        byte b10 = (byte) i27;
                        bArr2[i26] = b10;
                        while (true) {
                            i26++;
                            i18++;
                            if (i28 <= 0) {
                                break;
                            }
                            i28--;
                            bArr2[i26] = bArr4[i28];
                        }
                        byte[] bArr6 = bArr4;
                        if (i21 < 4096) {
                            sArr[i21] = (short) i29;
                            bArr3[i21] = b10;
                            i21++;
                            if ((i21 & i22) == 0 && i21 < 4096) {
                                i20++;
                                i22 += i21;
                            }
                        }
                        i29 = i32;
                        i15 = i31;
                        i30 = i30;
                        bArr4 = bArr6;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i26, i12, (byte) 0);
    }

    @n0
    private d v() {
        if (this.f40737k == null) {
            this.f40737k = new d();
        }
        return this.f40737k;
    }

    private Bitmap w() {
        Boolean bool = this.f40751y;
        Bitmap bitmapB = this.f40734h.b(this.f40750x, this.f40749w, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f40752z);
        bitmapB.setHasAlpha(true);
        return bitmapB;
    }

    private int x() {
        int iY = y();
        if (iY <= 0) {
            return iY;
        }
        ByteBuffer byteBuffer = this.f40735i;
        byteBuffer.get(this.f40736j, 0, Math.min(iY, byteBuffer.remaining()));
        return iY;
    }

    private int y() {
        return this.f40735i.get() & 255;
    }

    private Bitmap z(b bVar, b bVar2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f40742p;
        int i12 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f40745s;
            if (bitmap2 != null) {
                this.f40734h.c(bitmap2);
            }
            this.f40745s = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f40688g == 3 && this.f40745s == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i11 = bVar2.f40688g) > 0) {
            if (i11 == 2) {
                if (!bVar.f40687f) {
                    c cVar = this.f40744r;
                    int i13 = cVar.f40706l;
                    if (bVar.f40692k == null || cVar.f40704j != bVar.f40689h) {
                        i12 = i13;
                    }
                }
                int i14 = bVar2.f40685d;
                int i15 = this.f40748v;
                int i16 = i14 / i15;
                int i17 = bVar2.f40683b / i15;
                int i18 = bVar2.f40684c / i15;
                int i19 = bVar2.f40682a / i15;
                int i20 = this.f40750x;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f40750x;
                }
            } else if (i11 == 3 && (bitmap = this.f40745s) != null) {
                int i25 = this.f40750x;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f40749w);
            }
        }
        u(bVar);
        if (bVar.f40686e || this.f40748v != 1) {
            s(bVar);
        } else {
            t(bVar);
        }
        if (this.f40746t && ((i10 = bVar.f40688g) == 0 || i10 == 1)) {
            if (this.f40745s == null) {
                this.f40745s = w();
            }
            Bitmap bitmap3 = this.f40745s;
            int i26 = this.f40750x;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f40749w);
        }
        Bitmap bitmapW = w();
        int i27 = this.f40750x;
        bitmapW.setPixels(iArr, 0, i27, 0, 0, i27, this.f40749w);
        return bitmapW;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int a() {
        return this.f40747u;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void b(@n0 Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f40752z = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    @Override // com.bumptech.glide.gifdecoder.a
    @Deprecated
    public int c() {
        int i10 = this.f40744r.f40707m;
        if (i10 == -1) {
            return 1;
        }
        return i10;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void clear() {
        this.f40744r = null;
        byte[] bArr = this.f40741o;
        if (bArr != null) {
            this.f40734h.e(bArr);
        }
        int[] iArr = this.f40742p;
        if (iArr != null) {
            this.f40734h.f(iArr);
        }
        Bitmap bitmap = this.f40745s;
        if (bitmap != null) {
            this.f40734h.c(bitmap);
        }
        this.f40745s = null;
        this.f40735i = null;
        this.f40751y = null;
        byte[] bArr2 = this.f40736j;
        if (bArr2 != null) {
            this.f40734h.e(bArr2);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public synchronized void d(@n0 c cVar, @n0 byte[] bArr) {
        o(cVar, ByteBuffer.wrap(bArr));
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void e() {
        this.f40743q = -1;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int f() {
        return this.f40743q;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int g(@p0 InputStream inputStream, int i10) {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i10 > 0 ? i10 + 4096 : 16384);
                byte[] bArr = new byte[16384];
                while (true) {
                    int i11 = inputStream.read(bArr, 0, 16384);
                    if (i11 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i11);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException e10) {
                Log.w(A, "Error reading data from stream", e10);
            }
        } else {
            this.f40747u = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e11) {
                Log.w(A, "Error closing stream", e11);
            }
        }
        return this.f40747u;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    @n0
    public ByteBuffer getData() {
        return this.f40735i;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int getHeight() {
        return this.f40744r.f40701g;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int getWidth() {
        return this.f40744r.f40700f;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int h() {
        return this.f40735i.limit() + this.f40741o.length + (this.f40742p.length * 4);
    }

    @Override // com.bumptech.glide.gifdecoder.a
    @p0
    public synchronized Bitmap i() {
        if (this.f40744r.f40697c <= 0 || this.f40743q < 0) {
            String str = A;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.f40744r.f40697c + ", framePointer=" + this.f40743q);
            }
            this.f40747u = 1;
        }
        int i10 = this.f40747u;
        if (i10 != 1 && i10 != 2) {
            this.f40747u = 0;
            if (this.f40736j == null) {
                this.f40736j = this.f40734h.a(255);
            }
            b bVar = this.f40744r.f40699e.get(this.f40743q);
            int i11 = this.f40743q - 1;
            b bVar2 = i11 >= 0 ? this.f40744r.f40699e.get(i11) : null;
            int[] iArr = bVar.f40692k;
            if (iArr == null) {
                iArr = this.f40744r.f40695a;
            }
            this.f40732f = iArr;
            if (iArr == null) {
                String str2 = A;
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "No valid color table found for frame #" + this.f40743q);
                }
                this.f40747u = 1;
                return null;
            }
            if (bVar.f40687f) {
                System.arraycopy(iArr, 0, this.f40733g, 0, iArr.length);
                int[] iArr2 = this.f40733g;
                this.f40732f = iArr2;
                iArr2[bVar.f40689h] = 0;
                if (bVar.f40688g == 2 && this.f40743q == 0) {
                    this.f40751y = Boolean.TRUE;
                }
            }
            return z(bVar, bVar2);
        }
        String str3 = A;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.f40747u);
        }
        return null;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void j() {
        this.f40743q = (this.f40743q + 1) % this.f40744r.f40697c;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int k() {
        return this.f40744r.f40697c;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int l(int i10) {
        if (i10 >= 0) {
            c cVar = this.f40744r;
            if (i10 < cVar.f40697c) {
                return cVar.f40699e.get(i10).f40690i;
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int m() {
        int i10 = this.f40744r.f40707m;
        if (i10 == -1) {
            return 1;
        }
        if (i10 == 0) {
            return 0;
        }
        return i10 + 1;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int n() {
        int i10;
        if (this.f40744r.f40697c <= 0 || (i10 = this.f40743q) < 0) {
            return 0;
        }
        return l(i10);
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public synchronized void o(@n0 c cVar, @n0 ByteBuffer byteBuffer) {
        p(cVar, byteBuffer, 1);
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public synchronized void p(@n0 c cVar, @n0 ByteBuffer byteBuffer, int i10) {
        try {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
            int iHighestOneBit = Integer.highestOneBit(i10);
            this.f40747u = 0;
            this.f40744r = cVar;
            this.f40743q = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f40735i = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f40735i.order(ByteOrder.LITTLE_ENDIAN);
            this.f40746t = false;
            Iterator<b> it = cVar.f40699e.iterator();
            while (it.hasNext()) {
                if (it.next().f40688g == 3) {
                    this.f40746t = true;
                    break;
                }
            }
            this.f40748v = iHighestOneBit;
            int i11 = cVar.f40700f;
            this.f40750x = i11 / iHighestOneBit;
            int i12 = cVar.f40701g;
            this.f40749w = i12 / iHighestOneBit;
            this.f40741o = this.f40734h.a(i11 * i12);
            this.f40742p = this.f40734h.d(this.f40750x * this.f40749w);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int q() {
        return this.f40744r.f40707m;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public synchronized int read(@p0 byte[] bArr) {
        c cVarD = v().r(bArr).d();
        this.f40744r = cVarD;
        if (bArr != null) {
            d(cVarD, bArr);
        }
        return this.f40747u;
    }
}
