package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import androidx.annotation.j1;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: HardwareConfigState.java */
/* JADX INFO: loaded from: classes6.dex */
public final class u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f41600e = "HardwareConfig";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f41601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.k(api = 28)
    public static final boolean f41602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final File f41603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f41604i = 50;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f41605j = 20000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f41606k = 500;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final int f41607l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile u f41608m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private int f41610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private boolean f41611c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f41612d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41609a = 20000;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f41601f = i10 < 29;
        f41602g = i10 >= 28;
        f41603h = new File("/proc/self/fd");
    }

    @j1
    u() {
    }

    private boolean a() {
        return f41601f && !this.f41612d.get();
    }

    public static u c() {
        if (f41608m == null) {
            synchronized (u.class) {
                if (f41608m == null) {
                    f41608m = new u();
                }
            }
        }
        return f41608m;
    }

    private int d() {
        if (f()) {
            return 500;
        }
        return this.f41609a;
    }

    private synchronized boolean e() {
        boolean z10 = true;
        int i10 = this.f41610b + 1;
        this.f41610b = i10;
        if (i10 >= 50) {
            this.f41610b = 0;
            int length = f41603h.list().length;
            long jD = d();
            if (length >= jD) {
                z10 = false;
            }
            this.f41611c = z10;
            if (!z10 && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jD);
            }
        }
        return this.f41611c;
    }

    private static boolean f() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public void b() {
        com.bumptech.glide.util.o.b();
        this.f41612d.set(false);
    }

    public boolean g(int i10, int i11, boolean z10, boolean z11) {
        if (!z10) {
            if (Log.isLoggable(f41600e, 2)) {
                Log.v(f41600e, "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f41602g) {
            if (Log.isLoggable(f41600e, 2)) {
                Log.v(f41600e, "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (a()) {
            if (Log.isLoggable(f41600e, 2)) {
                Log.v(f41600e, "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z11) {
            if (Log.isLoggable(f41600e, 2)) {
                Log.v(f41600e, "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i10 < 0 || i11 < 0) {
            if (Log.isLoggable(f41600e, 2)) {
                Log.v(f41600e, "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        if (e()) {
            return true;
        }
        if (Log.isLoggable(f41600e, 2)) {
            Log.v(f41600e, "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    @TargetApi(26)
    boolean h(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        boolean zG = g(i10, i11, z10, z11);
        if (zG) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zG;
    }

    public void i() {
        com.bumptech.glide.util.o.b();
        this.f41612d.set(true);
    }
}
