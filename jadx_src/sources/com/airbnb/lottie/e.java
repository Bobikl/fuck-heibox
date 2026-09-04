package com.airbnb.lottie;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.core.os.e0;
import java.io.File;

/* JADX INFO: compiled from: L.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f37311a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f37312b = "LOTTIE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f37313c = 20;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f37314d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String[] f37315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long[] f37316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f37317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f37318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static com.airbnb.lottie.network.e f37319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static com.airbnb.lottie.network.d f37320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile com.airbnb.lottie.network.g f37321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile com.airbnb.lottie.network.f f37322l;

    /* JADX INFO: compiled from: L.java */
    public class a implements com.airbnb.lottie.network.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f37323a;

        a(Context context) {
            this.f37323a = context;
        }

        @Override // com.airbnb.lottie.network.d
        @n0
        public File a() {
            return new File(this.f37323a.getCacheDir(), "lottie_network_cache");
        }
    }

    private e() {
    }

    public static void a(String str) {
        if (f37314d) {
            int i10 = f37317g;
            if (i10 == 20) {
                f37318h++;
                return;
            }
            f37315e[i10] = str;
            f37316f[i10] = System.nanoTime();
            e0.b(str);
            f37317g++;
        }
    }

    public static float b(String str) {
        int i10 = f37318h;
        if (i10 > 0) {
            f37318h = i10 - 1;
            return 0.0f;
        }
        if (!f37314d) {
            return 0.0f;
        }
        int i11 = f37317g - 1;
        f37317g = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(f37315e[i11])) {
            e0.d();
            return (System.nanoTime() - f37316f[f37317g]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f37315e[f37317g] + ".");
    }

    @n0
    public static com.airbnb.lottie.network.f c(@n0 Context context) {
        Context applicationContext = context.getApplicationContext();
        com.airbnb.lottie.network.f fVar = f37322l;
        if (fVar == null) {
            synchronized (com.airbnb.lottie.network.f.class) {
                fVar = f37322l;
                if (fVar == null) {
                    com.airbnb.lottie.network.d aVar = f37320j;
                    if (aVar == null) {
                        aVar = new a(applicationContext);
                    }
                    fVar = new com.airbnb.lottie.network.f(aVar);
                    f37322l = fVar;
                }
            }
        }
        return fVar;
    }

    @n0
    public static com.airbnb.lottie.network.g d(@n0 Context context) {
        com.airbnb.lottie.network.g gVar = f37321k;
        if (gVar == null) {
            synchronized (com.airbnb.lottie.network.g.class) {
                gVar = f37321k;
                if (gVar == null) {
                    com.airbnb.lottie.network.f fVarC = c(context);
                    com.airbnb.lottie.network.e bVar = f37319i;
                    if (bVar == null) {
                        bVar = new com.airbnb.lottie.network.b();
                    }
                    gVar = new com.airbnb.lottie.network.g(fVarC, bVar);
                    f37321k = gVar;
                }
            }
        }
        return gVar;
    }

    public static void e(com.airbnb.lottie.network.d dVar) {
        f37320j = dVar;
    }

    public static void f(com.airbnb.lottie.network.e eVar) {
        f37319i = eVar;
    }

    public static void g(boolean z10) {
        if (f37314d == z10) {
            return;
        }
        f37314d = z10;
        if (z10) {
            f37315e = new String[20];
            f37316f = new long[20];
        }
    }
}
