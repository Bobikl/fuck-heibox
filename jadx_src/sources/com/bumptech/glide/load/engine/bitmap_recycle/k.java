package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: LruBitmapPool.java */
/* JADX INFO: loaded from: classes6.dex */
public class k implements e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f41000k = "LruBitmapPool";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Bitmap.Config f41001l = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f41002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Bitmap.Config> f41003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f41004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f41005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f41006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f41007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f41008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f41009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f41010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f41011j;

    /* JADX INFO: compiled from: LruBitmapPool.java */
    public interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    /* JADX INFO: compiled from: LruBitmapPool.java */
    public static final class b implements a {
        b() {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.k.a
        public void a(Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.k.a
        public void b(Bitmap bitmap) {
        }
    }

    /* JADX INFO: compiled from: LruBitmapPool.java */
    public static class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<Bitmap> f41012a = Collections.synchronizedSet(new HashSet());

        private c() {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.k.a
        public void a(Bitmap bitmap) {
            if (!this.f41012a.contains(bitmap)) {
                this.f41012a.add(bitmap);
                return;
            }
            throw new IllegalStateException("Can't add already added bitmap: " + bitmap + " [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "]");
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.k.a
        public void b(Bitmap bitmap) {
            if (!this.f41012a.contains(bitmap)) {
                throw new IllegalStateException("Cannot remove bitmap not in tracker");
            }
            this.f41012a.remove(bitmap);
        }
    }

    public k(long j10) {
        this(j10, o(), n());
    }

    k(long j10, l lVar, Set<Bitmap.Config> set) {
        this.f41004c = j10;
        this.f41006e = j10;
        this.f41002a = lVar;
        this.f41003b = set;
        this.f41005d = new b();
    }

    public k(long j10, Set<Bitmap.Config> set) {
        this(j10, o(), set);
    }

    @TargetApi(26)
    private static void g(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    @n0
    private static Bitmap h(int i10, int i11, @p0 Bitmap.Config config) {
        if (config == null) {
            config = f41001l;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    private void i() {
        if (Log.isLoggable(f41000k, 2)) {
            j();
        }
    }

    private void j() {
        Log.v(f41000k, "Hits=" + this.f41008g + ", misses=" + this.f41009h + ", puts=" + this.f41010i + ", evictions=" + this.f41011j + ", currentSize=" + this.f41007f + ", maxSize=" + this.f41006e + "\nStrategy=" + this.f41002a);
    }

    private void k() {
        u(this.f41006e);
    }

    @TargetApi(26)
    private static Set<Bitmap.Config> n() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static l o() {
        return new n();
    }

    @p0
    private synchronized Bitmap p(int i10, int i11, @p0 Bitmap.Config config) {
        Bitmap bitmapE;
        g(config);
        bitmapE = this.f41002a.e(i10, i11, config != null ? config : f41001l);
        if (bitmapE == null) {
            if (Log.isLoggable(f41000k, 3)) {
                Log.d(f41000k, "Missing bitmap=" + this.f41002a.a(i10, i11, config));
            }
            this.f41009h++;
        } else {
            this.f41008g++;
            this.f41007f -= (long) this.f41002a.b(bitmapE);
            this.f41005d.b(bitmapE);
            t(bitmapE);
        }
        if (Log.isLoggable(f41000k, 2)) {
            Log.v(f41000k, "Get bitmap=" + this.f41002a.a(i10, i11, config));
        }
        i();
        return bitmapE;
    }

    @TargetApi(19)
    private static void r(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void t(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        r(bitmap);
    }

    private synchronized void u(long j10) {
        while (this.f41007f > j10) {
            Bitmap bitmapRemoveLast = this.f41002a.removeLast();
            if (bitmapRemoveLast == null) {
                if (Log.isLoggable(f41000k, 5)) {
                    Log.w(f41000k, "Size mismatch, resetting");
                    j();
                }
                this.f41007f = 0L;
                return;
            }
            this.f41005d.b(bitmapRemoveLast);
            this.f41007f -= (long) this.f41002a.b(bitmapRemoveLast);
            this.f41011j++;
            if (Log.isLoggable(f41000k, 3)) {
                Log.d(f41000k, "Evicting bitmap=" + this.f41002a.c(bitmapRemoveLast));
            }
            i();
            bitmapRemoveLast.recycle();
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        if (Log.isLoggable(f41000k, 3)) {
            Log.d(f41000k, "trimMemory, level=" + i10);
        }
        if (i10 >= 40 || i10 >= 20) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            u(getMaxSize() / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void b() {
        if (Log.isLoggable(f41000k, 3)) {
            Log.d(f41000k, "clearMemory");
        }
        u(0L);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public synchronized void c(float f10) {
        this.f41006e = Math.round(this.f41004c * f10);
        k();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f41002a.b(bitmap) <= this.f41006e && this.f41003b.contains(bitmap.getConfig())) {
                int iB = this.f41002a.b(bitmap);
                this.f41002a.d(bitmap);
                this.f41005d.a(bitmap);
                this.f41010i++;
                this.f41007f += (long) iB;
                if (Log.isLoggable(f41000k, 2)) {
                    Log.v(f41000k, "Put bitmap in pool=" + this.f41002a.c(bitmap));
                }
                i();
                k();
                return;
            }
            if (Log.isLoggable(f41000k, 2)) {
                Log.v(f41000k, "Reject bitmap from pool, bitmap: " + this.f41002a.c(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f41003b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @n0
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapP = p(i10, i11, config);
        if (bitmapP == null) {
            return h(i10, i11, config);
        }
        bitmapP.eraseColor(0);
        return bitmapP;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @n0
    public Bitmap f(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapP = p(i10, i11, config);
        return bitmapP == null ? h(i10, i11, config) : bitmapP;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public long getMaxSize() {
        return this.f41006e;
    }

    public long l() {
        return this.f41011j;
    }

    public long m() {
        return this.f41007f;
    }

    public long q() {
        return this.f41008g;
    }

    public long s() {
        return this.f41009h;
    }
}
