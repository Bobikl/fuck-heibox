package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.RestrictTo;
import androidx.annotation.b0;
import androidx.annotation.k1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.graphics.d1;
import androidx.core.os.e0;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: FontRequestEmojiCompatConfig.java */
/* JADX INFO: loaded from: classes6.dex */
public class l extends f.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final b f23141j = new b();

    /* JADX INFO: compiled from: FontRequestEmojiCompatConfig.java */
    public static class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f23142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f23143b;

        public a(long j10) {
            this.f23142a = j10;
        }

        @Override // androidx.emoji2.text.l.d
        public long a() {
            if (this.f23143b == 0) {
                this.f23143b = SystemClock.uptimeMillis();
                return 0L;
            }
            long jUptimeMillis = SystemClock.uptimeMillis() - this.f23143b;
            if (jUptimeMillis > this.f23142a) {
                return -1L;
            }
            return Math.min(Math.max(jUptimeMillis, 1000L), this.f23142a - jUptimeMillis);
        }
    }

    /* JADX INFO: compiled from: FontRequestEmojiCompatConfig.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class b {
        @p0
        public Typeface a(@n0 Context context, @n0 androidx.core.provider.j.c cVar) throws PackageManager.NameNotFoundException {
            return androidx.core.provider.j.a(context, null, new androidx.core.provider.j.c[]{cVar});
        }

        @n0
        public androidx.core.provider.j.b b(@n0 Context context, @n0 androidx.core.provider.h hVar) throws PackageManager.NameNotFoundException {
            return androidx.core.provider.j.b(context, null, hVar);
        }

        public void c(@n0 Context context, @n0 Uri uri, @n0 ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        public void d(@n0 Context context, @n0 ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: compiled from: FontRequestEmojiCompatConfig.java */
    public static class c implements f.i {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f23144l = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        private final Context f23145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @n0
        private final androidx.core.provider.h f23146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @n0
        private final b f23147c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @n0
        private final Object f23148d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @b0("mLock")
        @p0
        private Handler f23149e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @b0("mLock")
        @p0
        private Executor f23150f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @b0("mLock")
        @p0
        private ThreadPoolExecutor f23151g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @b0("mLock")
        @p0
        private d f23152h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @b0("mLock")
        @p0
        f.j f23153i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @b0("mLock")
        @p0
        private ContentObserver f23154j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @b0("mLock")
        @p0
        private Runnable f23155k;

        /* JADX INFO: compiled from: FontRequestEmojiCompatConfig.java */
        public class a extends ContentObserver {
            a(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z10, Uri uri) {
                c.this.d();
            }
        }

        c(@n0 Context context, @n0 androidx.core.provider.h hVar, @n0 b bVar) {
            androidx.core.util.o.m(context, "Context cannot be null");
            androidx.core.util.o.m(hVar, "FontRequest cannot be null");
            this.f23145a = context.getApplicationContext();
            this.f23146b = hVar;
            this.f23147c = bVar;
        }

        private void b() {
            synchronized (this.f23148d) {
                this.f23153i = null;
                ContentObserver contentObserver = this.f23154j;
                if (contentObserver != null) {
                    this.f23147c.d(this.f23145a, contentObserver);
                    this.f23154j = null;
                }
                Handler handler = this.f23149e;
                if (handler != null) {
                    handler.removeCallbacks(this.f23155k);
                }
                this.f23149e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f23151g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f23150f = null;
                this.f23151g = null;
            }
        }

        @k1
        private androidx.core.provider.j.c e() {
            try {
                androidx.core.provider.j.b bVarB = this.f23147c.b(this.f23145a, this.f23146b);
                if (bVarB.c() == 0) {
                    androidx.core.provider.j.c[] cVarArrB = bVarB.b();
                    if (cVarArrB == null || cVarArrB.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return cVarArrB[0];
                }
                throw new RuntimeException("fetchFonts failed (" + bVarB.c() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        @k1
        @w0(19)
        private void f(Uri uri, long j10) {
            synchronized (this.f23148d) {
                Handler handlerE = this.f23149e;
                if (handlerE == null) {
                    handlerE = androidx.emoji2.text.c.e();
                    this.f23149e = handlerE;
                }
                if (this.f23154j == null) {
                    a aVar = new a(handlerE);
                    this.f23154j = aVar;
                    this.f23147c.c(this.f23145a, uri, aVar);
                }
                if (this.f23155k == null) {
                    this.f23155k = new Runnable() { // from class: androidx.emoji2.text.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f23158b.d();
                        }
                    };
                }
                handlerE.postDelayed(this.f23155k, j10);
            }
        }

        @Override // androidx.emoji2.text.f.i
        @w0(19)
        public void a(@n0 f.j jVar) {
            androidx.core.util.o.m(jVar, "LoaderCallback cannot be null");
            synchronized (this.f23148d) {
                this.f23153i = jVar;
            }
            d();
        }

        @k1
        @w0(19)
        void c() {
            synchronized (this.f23148d) {
                if (this.f23153i == null) {
                    return;
                }
                try {
                    androidx.core.provider.j.c cVarE = e();
                    int iB = cVarE.b();
                    if (iB == 2) {
                        synchronized (this.f23148d) {
                            d dVar = this.f23152h;
                            if (dVar != null) {
                                long jA = dVar.a();
                                if (jA >= 0) {
                                    f(cVarE.d(), jA);
                                    return;
                                }
                            }
                        }
                    }
                    if (iB != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                    }
                    try {
                        e0.b(f23144l);
                        Typeface typefaceA = this.f23147c.a(this.f23145a, cVarE);
                        ByteBuffer byteBufferF = d1.f(this.f23145a, null, cVarE.d());
                        if (byteBufferF == null || typefaceA == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        p pVarE = p.e(typefaceA, byteBufferF);
                        e0.d();
                        synchronized (this.f23148d) {
                            f.j jVar = this.f23153i;
                            if (jVar != null) {
                                jVar.b(pVarE);
                            }
                        }
                        b();
                    } catch (Throwable th2) {
                        e0.d();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    synchronized (this.f23148d) {
                        f.j jVar2 = this.f23153i;
                        if (jVar2 != null) {
                            jVar2.a(th3);
                        }
                        b();
                    }
                }
            }
        }

        @w0(19)
        void d() {
            synchronized (this.f23148d) {
                if (this.f23153i == null) {
                    return;
                }
                if (this.f23150f == null) {
                    ThreadPoolExecutor threadPoolExecutorC = androidx.emoji2.text.c.c("emojiCompat");
                    this.f23151g = threadPoolExecutorC;
                    this.f23150f = threadPoolExecutorC;
                }
                this.f23150f.execute(new Runnable() { // from class: androidx.emoji2.text.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23157b.c();
                    }
                });
            }
        }

        public void g(@n0 Executor executor) {
            synchronized (this.f23148d) {
                this.f23150f = executor;
            }
        }

        public void h(@p0 d dVar) {
            synchronized (this.f23148d) {
                this.f23152h = dVar;
            }
        }
    }

    /* JADX INFO: compiled from: FontRequestEmojiCompatConfig.java */
    public static abstract class d {
        public abstract long a();
    }

    public l(@n0 Context context, @n0 androidx.core.provider.h hVar) {
        super(new c(context, hVar, f23141j));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public l(@n0 Context context, @n0 androidx.core.provider.h hVar, @n0 b bVar) {
        super(new c(context, hVar, bVar));
    }

    @n0
    @Deprecated
    public l k(@p0 Handler handler) {
        if (handler == null) {
            return this;
        }
        l(androidx.emoji2.text.c.b(handler));
        return this;
    }

    @n0
    public l l(@n0 Executor executor) {
        ((c) a()).g(executor);
        return this;
    }

    @n0
    public l m(@p0 d dVar) {
        ((c) a()).h(dVar);
        return this;
    }
}
