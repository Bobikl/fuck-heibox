package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.j1;
import androidx.annotation.n0;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.resource.bitmap.g;
import com.bumptech.glide.util.o;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: BitmapPreFillRunner.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @j1
    static final String f41235j = "PreFillRunner";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final long f41237l = 32;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final long f41238m = 40;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f41239n = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f41241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f41242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f41243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0333a f41244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<d> f41245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f41246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f41247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f41248i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final C0333a f41236k = new C0333a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final long f41240o = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.prefill.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BitmapPreFillRunner.java */
    @j1
    public static class C0333a {
        C0333a() {
        }

        long a() {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    /* JADX INFO: compiled from: BitmapPreFillRunner.java */
    public static final class b implements com.bumptech.glide.load.c {
        b() {
        }

        @Override // com.bumptech.glide.load.c
        public void b(@n0 MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    public a(e eVar, j jVar, c cVar) {
        this(eVar, jVar, cVar, f41236k, new Handler(Looper.getMainLooper()));
    }

    @j1
    a(e eVar, j jVar, c cVar, C0333a c0333a, Handler handler) {
        this.f41245f = new HashSet();
        this.f41247h = f41238m;
        this.f41241b = eVar;
        this.f41242c = jVar;
        this.f41243d = cVar;
        this.f41244e = c0333a;
        this.f41246g = handler;
    }

    private long c() {
        return this.f41242c.getMaxSize() - this.f41242c.d();
    }

    private long d() {
        long j10 = this.f41247h;
        this.f41247h = Math.min(4 * j10, f41240o);
        return j10;
    }

    private boolean e(long j10) {
        return this.f41244e.a() - j10 >= 32;
    }

    @j1
    boolean a() {
        Bitmap bitmapCreateBitmap;
        long jA = this.f41244e.a();
        while (!this.f41243d.b() && !e(jA)) {
            d dVarC = this.f41243d.c();
            if (this.f41245f.contains(dVarC)) {
                bitmapCreateBitmap = Bitmap.createBitmap(dVarC.d(), dVarC.b(), dVarC.a());
            } else {
                this.f41245f.add(dVarC);
                bitmapCreateBitmap = this.f41241b.f(dVarC.d(), dVarC.b(), dVarC.a());
            }
            int i10 = o.i(bitmapCreateBitmap);
            if (c() >= i10) {
                this.f41242c.e(new b(), g.d(bitmapCreateBitmap, this.f41241b));
            } else {
                this.f41241b.d(bitmapCreateBitmap);
            }
            if (Log.isLoggable(f41235j, 3)) {
                Log.d(f41235j, "allocated [" + dVarC.d() + "x" + dVarC.b() + "] " + dVarC.a() + " size: " + i10);
            }
        }
        return (this.f41248i || this.f41243d.b()) ? false : true;
    }

    public void b() {
        this.f41248i = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (a()) {
            this.f41246g.postDelayed(this, d());
        }
    }
}
