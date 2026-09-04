package com.bumptech.glide.load.engine.cache;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.j1;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;

/* JADX INFO: compiled from: MemorySizeCalculator.java */
/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f41064e = "MemorySizeCalculator";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @j1
    static final int f41065f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f41066g = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f41069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f41070d;

    /* JADX INFO: compiled from: MemorySizeCalculator.java */
    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @j1
        static final int f41071i = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f41072j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final float f41073k = 0.4f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final float f41074l = 0.33f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final int f41075m = 4194304;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f41076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ActivityManager f41077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c f41078c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f41080e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f41079d = 2.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f41081f = 0.4f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f41082g = f41074l;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f41083h = 4194304;

        static {
            f41072j = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f41080e = f41072j;
            this.f41076a = context;
            this.f41077b = (ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
            this.f41078c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !l.e(this.f41077b)) {
                return;
            }
            this.f41080e = 0.0f;
        }

        public l a() {
            return new l(this);
        }

        @j1
        a b(ActivityManager activityManager) {
            this.f41077b = activityManager;
            return this;
        }

        public a c(int i10) {
            this.f41083h = i10;
            return this;
        }

        public a d(float f10) {
            com.bumptech.glide.util.m.b(f10 >= 0.0f, "Bitmap pool screens must be greater than or equal to 0");
            this.f41080e = f10;
            return this;
        }

        public a e(float f10) {
            com.bumptech.glide.util.m.b(f10 >= 0.0f && f10 <= 1.0f, "Low memory max size multiplier must be between 0 and 1");
            this.f41082g = f10;
            return this;
        }

        public a f(float f10) {
            com.bumptech.glide.util.m.b(f10 >= 0.0f && f10 <= 1.0f, "Size multiplier must be between 0 and 1");
            this.f41081f = f10;
            return this;
        }

        public a g(float f10) {
            com.bumptech.glide.util.m.b(f10 >= 0.0f, "Memory cache screens must be greater than or equal to 0");
            this.f41079d = f10;
            return this;
        }

        @j1
        a h(c cVar) {
            this.f41078c = cVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: MemorySizeCalculator.java */
    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayMetrics f41084a;

        b(DisplayMetrics displayMetrics) {
            this.f41084a = displayMetrics;
        }

        @Override // com.bumptech.glide.load.engine.cache.l.c
        public int a() {
            return this.f41084a.heightPixels;
        }

        @Override // com.bumptech.glide.load.engine.cache.l.c
        public int b() {
            return this.f41084a.widthPixels;
        }
    }

    /* JADX INFO: compiled from: MemorySizeCalculator.java */
    public interface c {
        int a();

        int b();
    }

    l(a aVar) {
        this.f41069c = aVar.f41076a;
        int i10 = e(aVar.f41077b) ? aVar.f41083h / 2 : aVar.f41083h;
        this.f41070d = i10;
        int iC = c(aVar.f41077b, aVar.f41081f, aVar.f41082g);
        float fB = aVar.f41078c.b() * aVar.f41078c.a() * 4;
        int iRound = Math.round(aVar.f41080e * fB);
        int iRound2 = Math.round(fB * aVar.f41079d);
        int i11 = iC - i10;
        int i12 = iRound2 + iRound;
        if (i12 <= i11) {
            this.f41068b = iRound2;
            this.f41067a = iRound;
        } else {
            float f10 = i11;
            float f11 = aVar.f41080e;
            float f12 = aVar.f41079d;
            float f13 = f10 / (f11 + f12);
            this.f41068b = Math.round(f12 * f13);
            this.f41067a = Math.round(f13 * aVar.f41080e);
        }
        if (Log.isLoggable(f41064e, 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculation complete, Calculated memory cache size: ");
            sb2.append(f(this.f41068b));
            sb2.append(", pool size: ");
            sb2.append(f(this.f41067a));
            sb2.append(", byte array size: ");
            sb2.append(f(i10));
            sb2.append(", memory class limited? ");
            sb2.append(i12 > iC);
            sb2.append(", max size: ");
            sb2.append(f(iC));
            sb2.append(", memoryClass: ");
            sb2.append(aVar.f41077b.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(e(aVar.f41077b));
            Log.d(f41064e, sb2.toString());
        }
    }

    private static int c(ActivityManager activityManager, float f10, float f11) {
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (e(activityManager)) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    @TargetApi(19)
    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i10) {
        return Formatter.formatFileSize(this.f41069c, i10);
    }

    public int a() {
        return this.f41070d;
    }

    public int b() {
        return this.f41067a;
    }

    public int d() {
        return this.f41068b;
    }
}
