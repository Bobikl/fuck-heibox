package androidx.dynamicanimation.animation;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.annotation.w0;
import androidx.collection.j2;
import java.util.ArrayList;

/* JADX INFO: compiled from: AnimationHandler.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f22854g = 10;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ThreadLocal<a> f22855h = new ThreadLocal<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f22859d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j2<b, Long> f22856a = new j2<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList<b> f22857b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0161a f22858c = new C0161a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f22860e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22861f = false;

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AnimationHandler.java */
    public class C0161a {
        C0161a() {
        }

        void a() {
            a.this.f22860e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f22860e);
            if (a.this.f22857b.size() > 0) {
                a.this.f().a();
            }
        }
    }

    /* JADX INFO: compiled from: AnimationHandler.java */
    public interface b {
        boolean a(long j10);
    }

    /* JADX INFO: compiled from: AnimationHandler.java */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final C0161a f22863a;

        c(C0161a c0161a) {
            this.f22863a = c0161a;
        }

        abstract void a();
    }

    /* JADX INFO: compiled from: AnimationHandler.java */
    public static class d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f22864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f22865c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f22866d;

        /* JADX INFO: renamed from: androidx.dynamicanimation.animation.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AnimationHandler.java */
        public class RunnableC0162a implements Runnable {
            RunnableC0162a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f22866d = SystemClock.uptimeMillis();
                d.this.f22863a.a();
            }
        }

        d(C0161a c0161a) {
            super(c0161a);
            this.f22866d = -1L;
            this.f22864b = new RunnableC0162a();
            this.f22865c = new Handler(Looper.myLooper());
        }

        @Override // androidx.dynamicanimation.animation.a.c
        void a() {
            this.f22865c.postDelayed(this.f22864b, Math.max(a.f22854g - (SystemClock.uptimeMillis() - this.f22866d), 0L));
        }
    }

    /* JADX INFO: compiled from: AnimationHandler.java */
    @w0(16)
    public static class e extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Choreographer f22868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Choreographer.FrameCallback f22869c;

        /* JADX INFO: renamed from: androidx.dynamicanimation.animation.a$e$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AnimationHandler.java */
        public class ChoreographerFrameCallbackC0163a implements Choreographer.FrameCallback {
            ChoreographerFrameCallbackC0163a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j10) {
                e.this.f22863a.a();
            }
        }

        e(C0161a c0161a) {
            super(c0161a);
            this.f22868b = Choreographer.getInstance();
            this.f22869c = new ChoreographerFrameCallbackC0163a();
        }

        @Override // androidx.dynamicanimation.animation.a.c
        void a() {
            this.f22868b.postFrameCallback(this.f22869c);
        }
    }

    a() {
    }

    private void b() {
        if (this.f22861f) {
            for (int size = this.f22857b.size() - 1; size >= 0; size--) {
                if (this.f22857b.get(size) == null) {
                    this.f22857b.remove(size);
                }
            }
            this.f22861f = false;
        }
    }

    public static long d() {
        ThreadLocal<a> threadLocal = f22855h;
        if (threadLocal.get() == null) {
            return 0L;
        }
        return threadLocal.get().f22860e;
    }

    public static a e() {
        ThreadLocal<a> threadLocal = f22855h;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    private boolean g(b bVar, long j10) {
        Long l10 = this.f22856a.get(bVar);
        if (l10 == null) {
            return true;
        }
        if (l10.longValue() >= j10) {
            return false;
        }
        this.f22856a.remove(bVar);
        return true;
    }

    public void a(b bVar, long j10) {
        if (this.f22857b.size() == 0) {
            f().a();
        }
        if (!this.f22857b.contains(bVar)) {
            this.f22857b.add(bVar);
        }
        if (j10 > 0) {
            this.f22856a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j10));
        }
    }

    void c(long j10) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < this.f22857b.size(); i10++) {
            b bVar = this.f22857b.get(i10);
            if (bVar != null && g(bVar, jUptimeMillis)) {
                bVar.a(j10);
            }
        }
        b();
    }

    c f() {
        if (this.f22859d == null) {
            this.f22859d = new e(this.f22858c);
        }
        return this.f22859d;
    }

    public void h(b bVar) {
        this.f22856a.remove(bVar);
        int iIndexOf = this.f22857b.indexOf(bVar);
        if (iIndexOf >= 0) {
            this.f22857b.set(iIndexOf, null);
            this.f22861f = true;
        }
    }

    public void i(c cVar) {
        this.f22859d = cVar;
    }
}
