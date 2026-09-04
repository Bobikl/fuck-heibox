package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: SnackbarManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f55407e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f55408f = 1500;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f55409g = 2750;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static c f55410h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final Object f55411a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final Handler f55412b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private C0431c f55413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private C0431c f55414d;

    /* JADX INFO: compiled from: SnackbarManager.java */
    public class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@n0 Message message) {
            if (message.what != 0) {
                return false;
            }
            c.this.d((C0431c) message.obj);
            return true;
        }
    }

    /* JADX INFO: compiled from: SnackbarManager.java */
    public interface b {
        void a(int i10);

        void show();
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SnackbarManager.java */
    public static class C0431c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        final WeakReference<b> f55416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f55417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f55418c;

        C0431c(int i10, b bVar) {
            this.f55416a = new WeakReference<>(bVar);
            this.f55417b = i10;
        }

        boolean a(@p0 b bVar) {
            return bVar != null && this.f55416a.get() == bVar;
        }
    }

    private c() {
    }

    private boolean a(@n0 C0431c c0431c, int i10) {
        b bVar = c0431c.f55416a.get();
        if (bVar == null) {
            return false;
        }
        this.f55412b.removeCallbacksAndMessages(c0431c);
        bVar.a(i10);
        return true;
    }

    static c c() {
        if (f55410h == null) {
            f55410h = new c();
        }
        return f55410h;
    }

    private boolean g(b bVar) {
        C0431c c0431c = this.f55413c;
        return c0431c != null && c0431c.a(bVar);
    }

    private boolean h(b bVar) {
        C0431c c0431c = this.f55414d;
        return c0431c != null && c0431c.a(bVar);
    }

    private void m(@n0 C0431c c0431c) {
        int i10 = c0431c.f55417b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        this.f55412b.removeCallbacksAndMessages(c0431c);
        Handler handler = this.f55412b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c0431c), i10);
    }

    private void o() {
        C0431c c0431c = this.f55414d;
        if (c0431c != null) {
            this.f55413c = c0431c;
            this.f55414d = null;
            b bVar = c0431c.f55416a.get();
            if (bVar != null) {
                bVar.show();
            } else {
                this.f55413c = null;
            }
        }
    }

    public void b(b bVar, int i10) {
        synchronized (this.f55411a) {
            if (g(bVar)) {
                a(this.f55413c, i10);
            } else if (h(bVar)) {
                a(this.f55414d, i10);
            }
        }
    }

    void d(@n0 C0431c c0431c) {
        synchronized (this.f55411a) {
            if (this.f55413c == c0431c || this.f55414d == c0431c) {
                a(c0431c, 2);
            }
        }
    }

    public boolean e(b bVar) {
        boolean zG;
        synchronized (this.f55411a) {
            zG = g(bVar);
        }
        return zG;
    }

    public boolean f(b bVar) {
        boolean z10;
        synchronized (this.f55411a) {
            z10 = g(bVar) || h(bVar);
        }
        return z10;
    }

    public void i(b bVar) {
        synchronized (this.f55411a) {
            if (g(bVar)) {
                this.f55413c = null;
                if (this.f55414d != null) {
                    o();
                }
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f55411a) {
            if (g(bVar)) {
                m(this.f55413c);
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f55411a) {
            if (g(bVar)) {
                C0431c c0431c = this.f55413c;
                if (!c0431c.f55418c) {
                    c0431c.f55418c = true;
                    this.f55412b.removeCallbacksAndMessages(c0431c);
                }
            }
        }
    }

    public void l(b bVar) {
        synchronized (this.f55411a) {
            if (g(bVar)) {
                C0431c c0431c = this.f55413c;
                if (c0431c.f55418c) {
                    c0431c.f55418c = false;
                    m(c0431c);
                }
            }
        }
    }

    public void n(int i10, b bVar) {
        synchronized (this.f55411a) {
            if (g(bVar)) {
                C0431c c0431c = this.f55413c;
                c0431c.f55417b = i10;
                this.f55412b.removeCallbacksAndMessages(c0431c);
                m(this.f55413c);
                return;
            }
            if (h(bVar)) {
                this.f55414d.f55417b = i10;
            } else {
                this.f55414d = new C0431c(i10, bVar);
            }
            C0431c c0431c2 = this.f55413c;
            if (c0431c2 == null || !a(c0431c2, 4)) {
                this.f55413c = null;
                o();
            }
        }
    }
}
