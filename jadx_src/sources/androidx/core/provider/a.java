package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.annotation.n0;

/* JADX INFO: compiled from: CallbackWithHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final j.d f20996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final Handler f20997b;

    /* JADX INFO: renamed from: androidx.core.provider.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CallbackWithHandler.java */
    public class RunnableC0136a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j.d f20998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Typeface f20999c;

        RunnableC0136a(j.d dVar, Typeface typeface) {
            this.f20998b = dVar;
            this.f20999c = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20998b.b(this.f20999c);
        }
    }

    /* JADX INFO: compiled from: CallbackWithHandler.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j.d f21001b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21002c;

        b(j.d dVar, int i10) {
            this.f21001b = dVar;
            this.f21002c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21001b.a(this.f21002c);
        }
    }

    a(@n0 j.d dVar) {
        this.f20996a = dVar;
        this.f20997b = androidx.core.provider.b.a();
    }

    a(@n0 j.d dVar, @n0 Handler handler) {
        this.f20996a = dVar;
        this.f20997b = handler;
    }

    private void a(int i10) {
        this.f20997b.post(new b(this.f20996a, i10));
    }

    private void c(@n0 Typeface typeface) {
        this.f20997b.post(new RunnableC0136a(this.f20996a, typeface));
    }

    void b(@n0 i.e eVar) {
        if (eVar.a()) {
            c(eVar.f21027a);
        } else {
            a(eVar.f21028b);
        }
    }
}
