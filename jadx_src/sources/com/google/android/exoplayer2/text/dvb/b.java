package com.google.android.exoplayer2.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.p0;
import androidx.core.view.j1;
import com.google.android.exoplayer2.util.d0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: DvbParser.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f49544h = "DvbParser";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f49545i = 16;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f49546j = 17;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f49547k = 18;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f49548l = 19;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f49549m = 20;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f49550n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f49551o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f49552p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f49553q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f49554r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f49555s = 16;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f49556t = 17;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f49557u = 18;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f49558v = 32;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f49559w = 33;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f49560x = 34;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f49561y = 240;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f49563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f49564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Canvas f49565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0394b f49566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f49567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f49568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f49569g;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final byte[] f49562z = {0, 7, 8, 15};
    private static final byte[] A = {0, 119, -120, -1};
    private static final byte[] B = {0, 17, 34, org.apache.tools.tar.c.I, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f49571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f49572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f49573d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f49570a = i10;
            this.f49571b = iArr;
            this.f49572c = iArr2;
            this.f49573d = iArr3;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.dvb.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DvbParser.java */
    public static final class C0394b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f49576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f49577d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f49578e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f49579f;

        public C0394b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f49574a = i10;
            this.f49575b = i11;
            this.f49576c = i12;
            this.f49577d = i13;
            this.f49578e = i14;
            this.f49579f = i15;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f49581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f49582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f49583d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f49580a = i10;
            this.f49581b = z10;
            this.f49582c = bArr;
            this.f49583d = bArr2;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f49586c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<e> f49587d;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f49584a = i10;
            this.f49585b = i11;
            this.f49586c = i12;
            this.f49587d = sparseArray;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49589b;

        public e(int i10, int i11) {
            this.f49588a = i10;
            this.f49589b = i11;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f49591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f49592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f49593d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f49594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f49595f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f49596g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f49597h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f49598i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f49599j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final SparseArray<g> f49600k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f49590a = i10;
            this.f49591b = z10;
            this.f49592c = i11;
            this.f49593d = i12;
            this.f49594e = i13;
            this.f49595f = i14;
            this.f49596g = i15;
            this.f49597h = i16;
            this.f49598i = i17;
            this.f49599j = i18;
            this.f49600k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f49600k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f49600k.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f49603c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f49604d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f49605e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f49606f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f49601a = i10;
            this.f49602b = i11;
            this.f49603c = i12;
            this.f49604d = i13;
            this.f49605e = i14;
            this.f49606f = i15;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f49609c = new SparseArray<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<a> f49610d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f49611e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SparseArray<a> f49612f = new SparseArray<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f49613g = new SparseArray<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @p0
        public C0394b f49614h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @p0
        public d f49615i;

        public h(int i10, int i11) {
            this.f49607a = i10;
            this.f49608b = i11;
        }

        public void a() {
            this.f49609c.clear();
            this.f49610d.clear();
            this.f49611e.clear();
            this.f49612f.clear();
            this.f49613g.clear();
            this.f49614h = null;
            this.f49615i = null;
        }
    }

    public b(int i10, int i11) {
        Paint paint = new Paint();
        this.f49563a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f49564b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f49565c = new Canvas();
        this.f49566d = new C0394b(719, bb.c.b.f30583d8, 0, 719, 0, bb.c.b.f30583d8);
        this.f49567e = new a(0, c(), d(), e());
        this.f49568f = new h(i10, i11);
    }

    private static byte[] a(int i10, int i11, d0 d0Var) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) d0Var.h(i11);
        }
        return bArr;
    }

    private static int[] c() {
        return new int[]{0, -1, j1.f21601t, -8421505};
    }

    private static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] e() {
        int i10;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            if (i11 < 8) {
                iArr[i11] = f(63, (i11 & 1) != 0 ? 255 : 0, (i11 & 2) != 0 ? 255 : 0, (i11 & 4) == 0 ? 0 : 255);
            } else {
                int i12 = i11 & 136;
                int i13 = bb.c.b.f30828o0;
                if (i12 == 0) {
                    int i14 = ((i11 & 1) != 0 ? 85 : 0) + ((i11 & 16) != 0 ? 170 : 0);
                    int i15 = ((i11 & 2) != 0 ? 85 : 0) + ((i11 & 32) != 0 ? 170 : 0);
                    i10 = (i11 & 4) == 0 ? 0 : 85;
                    if ((i11 & 64) == 0) {
                        i13 = 0;
                    }
                    iArr[i11] = f(255, i14, i15, i10 + i13);
                } else if (i12 == 8) {
                    int i16 = ((i11 & 1) != 0 ? 85 : 0) + ((i11 & 16) != 0 ? 170 : 0);
                    int i17 = ((i11 & 2) != 0 ? 85 : 0) + ((i11 & 32) != 0 ? 170 : 0);
                    i10 = (i11 & 4) == 0 ? 0 : 85;
                    if ((i11 & 64) == 0) {
                        i13 = 0;
                    }
                    iArr[i11] = f(127, i16, i17, i10 + i13);
                } else if (i12 == 128) {
                    iArr[i11] = f(255, ((i11 & 1) != 0 ? 43 : 0) + 127 + ((i11 & 16) != 0 ? 85 : 0), ((i11 & 2) != 0 ? 43 : 0) + 127 + ((i11 & 32) != 0 ? 85 : 0), ((i11 & 4) == 0 ? 0 : 43) + 127 + ((i11 & 64) == 0 ? 0 : 85));
                } else if (i12 == 136) {
                    iArr[i11] = f(255, ((i11 & 1) != 0 ? 43 : 0) + ((i11 & 16) != 0 ? 85 : 0), ((i11 & 2) != 0 ? 43 : 0) + ((i11 & 32) != 0 ? 85 : 0), ((i11 & 4) == 0 ? 0 : 43) + ((i11 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int f(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static int g(d0 d0Var, int[] iArr, @p0 byte[] bArr, int i10, int i11, @p0 Paint paint, Canvas canvas) {
        int i12;
        int iH;
        int iH2;
        int i13 = i10;
        boolean z10 = false;
        while (true) {
            int iH3 = d0Var.h(2);
            if (iH3 != 0) {
                z10 = z10;
                i12 = 1;
            } else {
                if (d0Var.g()) {
                    iH = d0Var.h(3) + 3;
                    iH2 = d0Var.h(2);
                } else {
                    if (d0Var.g()) {
                        i12 = 1;
                    } else {
                        int iH4 = d0Var.h(2);
                        if (iH4 == 0) {
                            z10 = true;
                        } else if (iH4 == 1) {
                            i12 = 2;
                        } else if (iH4 == 2) {
                            iH = d0Var.h(4) + 12;
                            iH2 = d0Var.h(2);
                        } else if (iH4 != 3) {
                            z10 = z10;
                        } else {
                            iH = d0Var.h(8) + 29;
                            iH2 = d0Var.h(2);
                        }
                        iH3 = 0;
                        i12 = 0;
                    }
                    iH3 = 0;
                }
                z10 = z10;
                i12 = iH;
                iH3 = iH2;
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    iH3 = bArr[iH3];
                }
                paint.setColor(iArr[iH3]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z10 = z10;
        }
    }

    private static int h(d0 d0Var, int[] iArr, @p0 byte[] bArr, int i10, int i11, @p0 Paint paint, Canvas canvas) {
        int i12;
        int iH;
        int i13 = i10;
        boolean z10 = false;
        while (true) {
            int iH2 = d0Var.h(4);
            int i14 = 2;
            if (iH2 != 0) {
                z10 = z10;
                i12 = 1;
            } else if (d0Var.g()) {
                if (d0Var.g()) {
                    int iH3 = d0Var.h(2);
                    if (iH3 != 0) {
                        if (iH3 != 1) {
                            if (iH3 == 2) {
                                iH = d0Var.h(4) + 9;
                                iH2 = d0Var.h(4);
                            } else if (iH3 != 3) {
                                z10 = z10;
                                iH2 = 0;
                                i12 = 0;
                            } else {
                                iH = d0Var.h(8) + 25;
                                iH2 = d0Var.h(4);
                            }
                        }
                        i12 = i14;
                    } else {
                        i12 = 1;
                    }
                    iH2 = 0;
                } else {
                    iH = d0Var.h(2) + 4;
                    iH2 = d0Var.h(4);
                }
                z10 = z10;
                i12 = iH;
            } else {
                int iH4 = d0Var.h(3);
                if (iH4 != 0) {
                    i14 = iH4 + 2;
                    i12 = i14;
                    iH2 = 0;
                } else {
                    z10 = true;
                    iH2 = 0;
                    i12 = 0;
                }
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    iH2 = bArr[iH2];
                }
                paint.setColor(iArr[iH2]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z10 = z10;
        }
    }

    private static int i(d0 d0Var, int[] iArr, @p0 byte[] bArr, int i10, int i11, @p0 Paint paint, Canvas canvas) {
        boolean z10;
        int iH;
        int i12 = i10;
        boolean z11 = false;
        while (true) {
            int iH2 = d0Var.h(8);
            if (iH2 != 0) {
                z10 = z11;
                iH = 1;
            } else if (d0Var.g()) {
                z10 = z11;
                iH = d0Var.h(7);
                iH2 = d0Var.h(8);
            } else {
                int iH3 = d0Var.h(7);
                if (iH3 != 0) {
                    z10 = z11;
                    iH = iH3;
                    iH2 = 0;
                } else {
                    z10 = true;
                    iH2 = 0;
                    iH = 0;
                }
            }
            if (iH != 0 && paint != null) {
                if (bArr != null) {
                    iH2 = bArr[iH2];
                }
                paint.setColor(iArr[iH2]);
                canvas.drawRect(i12, i11, i12 + iH, i11 + 1, paint);
            }
            i12 += iH;
            if (z10) {
                return i12;
            }
            z11 = z10;
        }
    }

    private static void j(byte[] bArr, int[] iArr, int i10, int i11, int i12, @p0 Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        d0 d0Var = new d0(bArr);
        int iG = i11;
        int i13 = i12;
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        byte[] bArrA3 = null;
        while (d0Var.b() != 0) {
            int iH = d0Var.h(8);
            if (iH != 240) {
                switch (iH) {
                    case 16:
                        if (i10 != 3) {
                            if (i10 == 2) {
                                bArr3 = bArrA3 == null ? f49562z : bArrA3;
                            } else {
                                bArr2 = null;
                            }
                            iG = g(d0Var, iArr, bArr2, iG, i13, paint, canvas);
                            d0Var.c();
                        } else {
                            bArr3 = bArrA == null ? A : bArrA;
                        }
                        bArr2 = bArr3;
                        iG = g(d0Var, iArr, bArr2, iG, i13, paint, canvas);
                        d0Var.c();
                        break;
                    case 17:
                        iG = h(d0Var, iArr, i10 == 3 ? bArrA2 == null ? B : bArrA2 : null, iG, i13, paint, canvas);
                        d0Var.c();
                        break;
                    case 18:
                        iG = i(d0Var, iArr, null, iG, i13, paint, canvas);
                        break;
                    default:
                        switch (iH) {
                            case 32:
                                bArrA3 = a(4, 4, d0Var);
                                break;
                            case 33:
                                bArrA = a(4, 8, d0Var);
                                break;
                            case 34:
                                bArrA2 = a(16, 8, d0Var);
                                break;
                        }
                        break;
                }
            } else {
                i13 += 2;
                iG = i11;
            }
        }
    }

    private static void k(c cVar, a aVar, int i10, int i11, int i12, @p0 Paint paint, Canvas canvas) {
        int[] iArr;
        if (i10 == 3) {
            iArr = aVar.f49573d;
        } else {
            iArr = i10 == 2 ? aVar.f49572c : aVar.f49571b;
        }
        int[] iArr2 = iArr;
        j(cVar.f49582c, iArr2, i10, i11, i12, paint, canvas);
        j(cVar.f49583d, iArr2, i10, i11, i12 + 1, paint, canvas);
    }

    private static a l(d0 d0Var, int i10) {
        int[] iArr;
        int iH;
        int i11;
        int iH2;
        int iH3;
        int iH4;
        int i12 = 8;
        int iH5 = d0Var.h(8);
        d0Var.s(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int[] iArrC = c();
        int[] iArrD = d();
        int[] iArrE = e();
        while (i14 > 0) {
            int iH6 = d0Var.h(i12);
            int iH7 = d0Var.h(i12);
            int i15 = i14 - 2;
            if ((iH7 & 128) != 0) {
                iArr = iArrC;
            } else {
                iArr = (iH7 & 64) != 0 ? iArrD : iArrE;
            }
            if ((iH7 & 1) != 0) {
                iH3 = d0Var.h(i12);
                iH4 = d0Var.h(i12);
                iH = d0Var.h(i12);
                iH2 = d0Var.h(i12);
                i11 = i15 - 4;
            } else {
                int iH8 = d0Var.h(6) << i13;
                int iH9 = d0Var.h(4) << 4;
                iH = d0Var.h(4) << 4;
                i11 = i15 - 2;
                iH2 = d0Var.h(i13) << 6;
                iH3 = iH8;
                iH4 = iH9;
            }
            if (iH3 == 0) {
                iH2 = 255;
                iH4 = 0;
                iH = 0;
            }
            double d10 = iH3;
            double d11 = iH4 + n5.a.f132012g;
            double d12 = iH + n5.a.f132012g;
            iArr[iH6] = f((byte) (255 - (iH2 & 255)), u0.s((int) (d10 + (1.402d * d11)), 0, 255), u0.s((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), u0.s((int) (d10 + (d12 * 1.772d)), 0, 255));
            i14 = i11;
            iH5 = iH5;
            i12 = 8;
            i13 = 2;
        }
        return new a(iH5, iArrC, iArrD, iArrE);
    }

    private static C0394b m(d0 d0Var) {
        int i10;
        int i11;
        int i12;
        int iH;
        d0Var.s(4);
        boolean zG = d0Var.g();
        d0Var.s(3);
        int iH2 = d0Var.h(16);
        int iH3 = d0Var.h(16);
        if (zG) {
            int iH4 = d0Var.h(16);
            int iH5 = d0Var.h(16);
            int iH6 = d0Var.h(16);
            iH = d0Var.h(16);
            i12 = iH5;
            i11 = iH6;
            i10 = iH4;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = iH2;
            iH = iH3;
        }
        return new C0394b(iH2, iH3, i10, i12, i11, iH);
    }

    private static c n(d0 d0Var) {
        byte[] bArr;
        int iH = d0Var.h(16);
        d0Var.s(4);
        int iH2 = d0Var.h(2);
        boolean zG = d0Var.g();
        d0Var.s(1);
        byte[] bArr2 = u0.f51541f;
        if (iH2 != 1) {
            if (iH2 == 0) {
                int iH3 = d0Var.h(16);
                int iH4 = d0Var.h(16);
                if (iH3 > 0) {
                    bArr2 = new byte[iH3];
                    d0Var.k(bArr2, 0, iH3);
                }
                if (iH4 > 0) {
                    bArr = new byte[iH4];
                    d0Var.k(bArr, 0, iH4);
                }
            }
            return new c(iH, zG, bArr2, bArr);
        }
        d0Var.s(d0Var.h(8) * 16);
        bArr = bArr2;
        return new c(iH, zG, bArr2, bArr);
    }

    private static d o(d0 d0Var, int i10) {
        int iH = d0Var.h(8);
        int iH2 = d0Var.h(4);
        int iH3 = d0Var.h(2);
        d0Var.s(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int iH4 = d0Var.h(8);
            d0Var.s(8);
            i11 -= 6;
            sparseArray.put(iH4, new e(d0Var.h(16), d0Var.h(16)));
        }
        return new d(iH, iH2, iH3, sparseArray);
    }

    private static f p(d0 d0Var, int i10) {
        int iH;
        int iH2;
        int iH3 = d0Var.h(8);
        d0Var.s(4);
        boolean zG = d0Var.g();
        d0Var.s(3);
        int i11 = 16;
        int iH4 = d0Var.h(16);
        int iH5 = d0Var.h(16);
        int iH6 = d0Var.h(3);
        int iH7 = d0Var.h(3);
        int i12 = 2;
        d0Var.s(2);
        int iH8 = d0Var.h(8);
        int iH9 = d0Var.h(8);
        int iH10 = d0Var.h(4);
        int iH11 = d0Var.h(2);
        d0Var.s(2);
        int i13 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i13 > 0) {
            int iH12 = d0Var.h(i11);
            int iH13 = d0Var.h(i12);
            int iH14 = d0Var.h(i12);
            int iH15 = d0Var.h(12);
            int i14 = iH11;
            d0Var.s(4);
            int iH16 = d0Var.h(12);
            i13 -= 6;
            if (iH13 == 1 || iH13 == 2) {
                i13 -= 2;
                iH = d0Var.h(8);
                iH2 = d0Var.h(8);
            } else {
                iH = 0;
                iH2 = 0;
            }
            sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH, iH2));
            iH11 = i14;
            i12 = 2;
            i11 = 16;
        }
        return new f(iH3, zG, iH4, iH5, iH6, iH7, iH8, iH9, iH10, iH11, sparseArray);
    }

    private static void q(d0 d0Var, h hVar) {
        f fVar;
        int iH = d0Var.h(8);
        int iH2 = d0Var.h(16);
        int iH3 = d0Var.h(16);
        int iD = d0Var.d() + iH3;
        if (iH3 * 8 > d0Var.b()) {
            u.m(f49544h, "Data field length exceeds limit");
            d0Var.s(d0Var.b());
            return;
        }
        switch (iH) {
            case 16:
                if (iH2 == hVar.f49607a) {
                    d dVar = hVar.f49615i;
                    d dVarO = o(d0Var, iH3);
                    if (dVarO.f49586c != 0) {
                        hVar.f49615i = dVarO;
                        hVar.f49609c.clear();
                        hVar.f49610d.clear();
                        hVar.f49611e.clear();
                    } else if (dVar != null && dVar.f49585b != dVarO.f49585b) {
                        hVar.f49615i = dVarO;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f49615i;
                if (iH2 == hVar.f49607a && dVar2 != null) {
                    f fVarP = p(d0Var, iH3);
                    if (dVar2.f49586c == 0 && (fVar = hVar.f49609c.get(fVarP.f49590a)) != null) {
                        fVarP.a(fVar);
                    }
                    hVar.f49609c.put(fVarP.f49590a, fVarP);
                }
                break;
            case 18:
                if (iH2 == hVar.f49607a) {
                    a aVarL = l(d0Var, iH3);
                    hVar.f49610d.put(aVarL.f49570a, aVarL);
                } else if (iH2 == hVar.f49608b) {
                    a aVarL2 = l(d0Var, iH3);
                    hVar.f49612f.put(aVarL2.f49570a, aVarL2);
                }
                break;
            case 19:
                if (iH2 == hVar.f49607a) {
                    c cVarN = n(d0Var);
                    hVar.f49611e.put(cVarN.f49580a, cVarN);
                } else if (iH2 == hVar.f49608b) {
                    c cVarN2 = n(d0Var);
                    hVar.f49613g.put(cVarN2.f49580a, cVarN2);
                }
                break;
            case 20:
                if (iH2 == hVar.f49607a) {
                    hVar.f49614h = m(d0Var);
                }
                break;
        }
        d0Var.t(iD - d0Var.d());
    }

    public List<com.google.android.exoplayer2.text.b> b(byte[] bArr, int i10) {
        d0 d0Var = new d0(bArr, i10);
        while (d0Var.b() >= 48 && d0Var.h(8) == 15) {
            q(d0Var, this.f49568f);
        }
        h hVar = this.f49568f;
        d dVar = hVar.f49615i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C0394b c0394b = hVar.f49614h;
        if (c0394b == null) {
            c0394b = this.f49566d;
        }
        Bitmap bitmap = this.f49569g;
        if (bitmap == null || c0394b.f49574a + 1 != bitmap.getWidth() || c0394b.f49575b + 1 != this.f49569g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c0394b.f49574a + 1, c0394b.f49575b + 1, Bitmap.Config.ARGB_8888);
            this.f49569g = bitmapCreateBitmap;
            this.f49565c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray = dVar.f49587d;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            this.f49565c.save();
            e eVarValueAt = sparseArray.valueAt(i11);
            f fVar = this.f49568f.f49609c.get(sparseArray.keyAt(i11));
            int i12 = eVarValueAt.f49588a + c0394b.f49576c;
            int i13 = eVarValueAt.f49589b + c0394b.f49578e;
            this.f49565c.clipRect(i12, i13, Math.min(fVar.f49592c + i12, c0394b.f49577d), Math.min(fVar.f49593d + i13, c0394b.f49579f));
            a aVar = this.f49568f.f49610d.get(fVar.f49596g);
            if (aVar == null && (aVar = this.f49568f.f49612f.get(fVar.f49596g)) == null) {
                aVar = this.f49567e;
            }
            int i14 = 0;
            for (SparseArray<g> sparseArray2 = fVar.f49600k; i14 < sparseArray2.size(); sparseArray2 = sparseArray2) {
                int iKeyAt = sparseArray2.keyAt(i14);
                g gVarValueAt = sparseArray2.valueAt(i14);
                c cVar = this.f49568f.f49611e.get(iKeyAt);
                c cVar2 = cVar == null ? this.f49568f.f49613g.get(iKeyAt) : cVar;
                if (cVar2 != null) {
                    k(cVar2, aVar, fVar.f49595f, gVarValueAt.f49603c + i12, i13 + gVarValueAt.f49604d, cVar2.f49581b ? null : this.f49563a, this.f49565c);
                }
                i14++;
            }
            if (fVar.f49591b) {
                int i15 = fVar.f49595f;
                this.f49564b.setColor(i15 == 3 ? aVar.f49573d[fVar.f49597h] : i15 == 2 ? aVar.f49572c[fVar.f49598i] : aVar.f49571b[fVar.f49599j]);
                this.f49565c.drawRect(i12, i13, fVar.f49592c + i12, fVar.f49593d + i13, this.f49564b);
            }
            arrayList.add(new com.google.android.exoplayer2.text.b.c().r(Bitmap.createBitmap(this.f49569g, i12, i13, fVar.f49592c, fVar.f49593d)).w(i12 / c0394b.f49574a).x(0).t(i13 / c0394b.f49575b, 0).u(0).z(fVar.f49592c / c0394b.f49574a).s(fVar.f49593d / c0394b.f49575b).a());
            this.f49565c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f49565c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f49568f.a();
    }
}
