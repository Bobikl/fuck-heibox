package com.billy.android.swipe.consumer;

import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import androidx.core.view.j1;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: ShuttersConsumer.java */
/* JADX INFO: loaded from: classes6.dex */
public class g extends com.billy.android.swipe.f {
    private long G2;
    protected final Camera V;
    protected Paint W;
    protected boolean X;
    protected int Y;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected volatile boolean f40369a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    protected volatile Bitmap[] f40370b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    protected int f40371c0;
    protected int Z = 0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    protected int f40372p1 = 5;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    protected volatile boolean f40374x1 = true;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    protected boolean f40376y1 = true;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    protected int f40373p2 = 33;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private Runnable f40375x2 = new a();

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private Runnable f40377y2 = new b();

    /* JADX INFO: compiled from: ShuttersConsumer.java */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.m2();
            ((com.billy.android.swipe.f) g.this).f40407b.postInvalidate();
        }
    }

    /* JADX INFO: compiled from: ShuttersConsumer.java */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.o2();
        }
    }

    /* JADX INFO: compiled from: ShuttersConsumer.java */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.billy.android.swipe.internal.c.b(g.this.f40377y2);
        }
    }

    /* JADX INFO: compiled from: ShuttersConsumer.java */
    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f40381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f40382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f40383d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Bitmap[] f40384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        CountDownLatch f40385f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        View f40386g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f40387h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f40388i;

        d(int i10, int i11, int i12, Bitmap[] bitmapArr, CountDownLatch countDownLatch, View view, int i13, int i14) {
            this.f40381b = i10;
            this.f40382c = i11;
            this.f40383d = i12;
            this.f40384e = bitmapArr;
            this.f40385f = countDownLatch;
            this.f40386g = view;
            this.f40387h = i13;
            this.f40388i = i14;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10 = false;
            try {
                Bitmap bitmapCreateBitmap = this.f40384e[this.f40383d];
                if (bitmapCreateBitmap == null || bitmapCreateBitmap.isRecycled() || bitmapCreateBitmap.getWidth() != this.f40381b || bitmapCreateBitmap.getHeight() != this.f40382c) {
                    bitmapCreateBitmap = Bitmap.createBitmap(this.f40381b, this.f40382c, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.translate((-this.f40386g.getScrollX()) - this.f40387h, (-this.f40386g.getScrollY()) - this.f40388i);
                Drawable background = this.f40386g.getBackground();
                if (background != null) {
                    background.draw(canvas);
                }
                try {
                    this.f40386g.draw(canvas);
                    this.f40384e[this.f40383d] = bitmapCreateBitmap;
                } catch (Exception unused) {
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        z10 = true;
                        this.f40386g.post(this);
                    }
                }
                if (z10) {
                }
            } catch (Throwable th2) {
                try {
                    th2.printStackTrace();
                } finally {
                    if (!z10) {
                        this.f40385f.countDown();
                    }
                }
            }
        }
    }

    public g() {
        E1(3);
        Camera camera = new Camera();
        this.V = camera;
        camera.setLocation(0.0f, 0.0f, -20.0f);
        this.W = new Paint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m2() {
        View contentView = this.f40407b.getContentView();
        if (this.f40408c == 0 || (this.f40370b0 == null && this.f40376y1)) {
            contentView.layout(0, 0, this.D, this.E);
            contentView.setVisibility(0);
        } else if (this.f40374x1) {
            contentView.layout(-9999, -9999, this.D - 9999, this.E - 9999);
        } else {
            contentView.setVisibility(8);
        }
    }

    private void s2(boolean z10) {
        this.f40369a0 = z10;
    }

    @Override // com.billy.android.swipe.f
    protected void f1() {
        super.f1();
        n2();
        s2(false);
        m2();
    }

    @Override // com.billy.android.swipe.f
    public int g(int i10, int i11) {
        if (this.f40370b0 == null && this.f40376y1) {
            return 0;
        }
        return super.g(i10, i11);
    }

    @Override // com.billy.android.swipe.f
    public void g1() {
        super.g1();
        s2(false);
        n2();
        m2();
    }

    @Override // com.billy.android.swipe.f
    public int h(int i10, int i11) {
        if (this.f40370b0 == null && this.f40376y1) {
            return 0;
        }
        return super.h(i10, i11);
    }

    @Override // com.billy.android.swipe.f
    protected void h1(int i10, int i11, int i12, int i13) {
        if (this.f40371c0 != 0 && this.Y != 0) {
            this.W.setAlpha((int) (this.Y * (1.0f - com.billy.android.swipe.b.e(this.f40418m, 0.0f, 1.0f))));
        }
        if (this.f40374x1) {
            return;
        }
        this.f40407b.postInvalidate();
    }

    public int i2() {
        return this.f40372p1;
    }

    @Override // com.billy.android.swipe.f
    public boolean j1(boolean z10, int i10, int i11, int i12, int i13) {
        m2();
        return true;
    }

    public int j2() {
        return this.f40371c0;
    }

    public boolean k2() {
        return this.f40374x1;
    }

    public boolean l2() {
        return this.f40376y1;
    }

    @Override // com.billy.android.swipe.f
    public void n1(int i10, boolean z10, float f10, float f11) {
        if (this.Z != this.f40408c) {
            n2();
        }
        this.Z = this.f40408c;
        this.G2 = 0L;
        if (this.f40411f == 0 && this.f40412g == 0) {
            int i11 = this.D >> 1;
            int i12 = this.E >> 1;
            boolean zV0 = v0();
            this.X = zV0;
            if (!this.f40414i) {
                if (zV0) {
                    this.f40428w = i11;
                } else {
                    this.f40428w = i12;
                }
            }
        }
        super.n1(i10, z10, f10, f11);
        m2();
        if (this.f40369a0) {
            return;
        }
        s2(true);
        com.billy.android.swipe.internal.c.b(this.f40377y2);
    }

    protected void n2() {
        this.Z = 0;
        this.f40370b0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v8 */
    protected void o2() {
        Bitmap[] bitmapArr;
        boolean z10;
        CountDownLatch countDownLatch;
        Bitmap[] bitmapArr2;
        int i10;
        int i11;
        if (this.G2 == 0) {
            this.G2 = SystemClock.elapsedRealtime();
        }
        View contentView = this.f40407b.getContentView();
        int i12 = this.f40372p1;
        int i13 = this.D;
        float f10 = i13 * 1.0f;
        boolean z11 = this.X;
        int i14 = (int) ((f10 / (z11 ? i12 : 1)) + 0.5f);
        int i15 = this.E;
        int i16 = (int) (((i15 * 1.0f) / (z11 ? 1 : i12)) + 0.5f);
        int i17 = z11 ? i13 - ((i12 - 1) * i14) : i14;
        int i18 = z11 ? i16 : i15 - ((i12 - 1) * i16);
        Bitmap[] bitmapArr3 = new Bitmap[i12];
        CountDownLatch countDownLatch2 = new CountDownLatch(i12);
        boolean z12 = false;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (i21 < i12) {
            if (this.X) {
                i19 = i14 * i21;
            } else {
                i20 = i16 * i21;
            }
            int i22 = i19;
            int i23 = i20;
            if (i21 != i12 - 1) {
                countDownLatch = countDownLatch2;
                bitmapArr2 = bitmapArr3;
                i10 = i16;
                i11 = i14;
                com.billy.android.swipe.internal.c.b(new d(i11, i10, i21, bitmapArr2, countDownLatch2, contentView, i22, i23));
            } else if (i17 <= 0 || i18 <= 0) {
                countDownLatch = countDownLatch2;
                bitmapArr2 = bitmapArr3;
                i10 = i16;
                i11 = i14;
                countDownLatch.countDown();
            } else {
                countDownLatch = countDownLatch2;
                bitmapArr2 = bitmapArr3;
                i10 = i16;
                i11 = i14;
                com.billy.android.swipe.internal.c.b(new d(i17, i18, i21, bitmapArr3, countDownLatch2, contentView, i22, i23));
            }
            i21++;
            z12 = z12;
            i19 = i22;
            i20 = i23;
            countDownLatch2 = countDownLatch;
            bitmapArr3 = bitmapArr2;
            i16 = i10;
            i14 = i11;
        }
        boolean z13 = z12;
        Bitmap[] bitmapArr4 = bitmapArr3;
        try {
            countDownLatch2.await();
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        if (!this.f40419n) {
            float f11 = this.f40418m;
            if (f11 <= 0.0f || f11 >= 1.0f) {
                s2(z13);
            }
        }
        if (this.f40369a0) {
            ?? r10 = z13;
            while (true) {
                bitmapArr = bitmapArr4;
                if (r10 >= i12) {
                    z10 = z13;
                    break;
                } else if (bitmapArr[r10] == null) {
                    z10 = true;
                    break;
                } else {
                    bitmapArr4 = bitmapArr;
                    r10++;
                }
            }
            if (!z10) {
                this.f40370b0 = bitmapArr;
            }
            contentView.post(this.f40375x2);
            if (!this.f40374x1) {
                s2(z13);
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.G2;
            this.G2 = SystemClock.elapsedRealtime();
            if (jElapsedRealtime < this.f40373p2) {
                contentView.postDelayed(new c(), ((long) this.f40373p2) - jElapsedRealtime);
            } else {
                com.billy.android.swipe.internal.c.b(this.f40377y2);
            }
        }
    }

    public g p2(int i10) {
        int iF = com.billy.android.swipe.b.f(i10, 1, 100);
        if (iF != this.f40372p1) {
            this.f40372p1 = iF;
            n2();
        }
        return this;
    }

    public g q2(int i10) {
        this.f40373p2 = 1000 / com.billy.android.swipe.b.f(i10, 1, 60);
        return this;
    }

    public g r2(boolean z10) {
        this.f40374x1 = z10;
        return this;
    }

    @Override // com.billy.android.swipe.f
    public void s(Canvas canvas) {
        Bitmap[] bitmapArr = this.f40370b0;
        if (this.f40408c == 0 || bitmapArr == null || bitmapArr.length == 0) {
            return;
        }
        if (this.f40371c0 != 0 && this.Y != 0) {
            canvas.drawRect(0.0f, 0.0f, this.D, this.E, this.W);
        }
        int i10 = this.D;
        int i11 = i10 >> 1;
        int i12 = this.E;
        int i13 = i12 >> 1;
        if (!this.X) {
            i10 = i12;
        }
        int length = (int) (((i10 * 1.0f) / bitmapArr.length) + 0.5f);
        int i14 = length >> 1;
        int i15 = this.f40408c;
        int i16 = 1;
        if (i15 != 1 && i15 != 8) {
            i16 = -1;
        }
        for (int i17 = 0; i17 < bitmapArr.length; i17++) {
            Bitmap bitmap = bitmapArr[i17];
            if (bitmap != null && !bitmap.isRecycled()) {
                canvas.save();
                this.V.save();
                if (this.X) {
                    canvas.translate((length * i17) + i14, i13);
                    this.V.rotateY(i16 * 90 * this.f40418m);
                    this.V.applyToCanvas(canvas);
                    canvas.translate(-i14, 0.0f);
                    canvas.drawBitmap(bitmap, 0.0f, -i13, (Paint) null);
                } else {
                    canvas.translate(i11, (length * i17) + i14);
                    this.V.rotateX(i16 * 90 * this.f40418m);
                    this.V.applyToCanvas(canvas);
                    canvas.translate(0.0f, -i14);
                    canvas.drawBitmap(bitmap, -i11, 0.0f, (Paint) null);
                }
                this.V.restore();
                canvas.restore();
            }
        }
    }

    public g t2(int i10) {
        this.f40371c0 = i10;
        this.W.setColor(i10);
        this.Y = (this.f40371c0 & j1.f21601t) >>> 24;
        return this;
    }

    public g u2(boolean z10) {
        this.f40376y1 = z10;
        return this;
    }
}
