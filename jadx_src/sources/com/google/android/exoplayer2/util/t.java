package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: ListenerSet.java */
/* JADX INFO: loaded from: classes7.dex */
public final class t<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f51516h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f51517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f51518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b<T> f51519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f51520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque<Runnable> f51521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque<Runnable> f51522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f51523g;

    /* JADX INFO: compiled from: ListenerSet.java */
    public interface a<T> {
        void invoke(T t10);
    }

    /* JADX INFO: compiled from: ListenerSet.java */
    public interface b<T> {
        void a(T t10, o oVar);
    }

    /* JADX INFO: compiled from: ListenerSet.java */
    public static final class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f51524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o.b f51525b = new o.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f51526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f51527d;

        public c(T t10) {
            this.f51524a = t10;
        }

        public void a(int i10, a<T> aVar) {
            if (this.f51527d) {
                return;
            }
            if (i10 != -1) {
                this.f51525b.a(i10);
            }
            this.f51526c = true;
            aVar.invoke(this.f51524a);
        }

        public void b(b<T> bVar) {
            if (this.f51527d || !this.f51526c) {
                return;
            }
            o oVarE = this.f51525b.e();
            this.f51525b = new o.b();
            this.f51526c = false;
            bVar.a(this.f51524a, oVarE);
        }

        public void c(b<T> bVar) {
            this.f51527d = true;
            if (this.f51526c) {
                bVar.a(this.f51524a, this.f51525b.e());
            }
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f51524a.equals(((c) obj).f51524a);
        }

        public int hashCode() {
            return this.f51524a.hashCode();
        }
    }

    public t(Looper looper, e eVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, eVar, bVar);
    }

    private t(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, e eVar, b<T> bVar) {
        this.f51517a = eVar;
        this.f51520d = copyOnWriteArraySet;
        this.f51519c = bVar;
        this.f51521e = new ArrayDeque<>();
        this.f51522f = new ArrayDeque<>();
        this.f51518b = eVar.e(looper, new Handler.Callback() { // from class: com.google.android.exoplayer2.util.r
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f51512b.f(message);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f(Message message) {
        Iterator<c<T>> it = this.f51520d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f51519c);
            if (this.f51518b.d(0)) {
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    public void c(T t10) {
        if (this.f51523g) {
            return;
        }
        com.google.android.exoplayer2.util.a.g(t10);
        this.f51520d.add(new c<>(t10));
    }

    @androidx.annotation.j
    public t<T> d(Looper looper, b<T> bVar) {
        return new t<>(this.f51520d, looper, this.f51517a, bVar);
    }

    public void e() {
        if (this.f51522f.isEmpty()) {
            return;
        }
        if (!this.f51518b.d(0)) {
            p pVar = this.f51518b;
            pVar.h(pVar.c(0));
        }
        boolean z10 = !this.f51521e.isEmpty();
        this.f51521e.addAll(this.f51522f);
        this.f51522f.clear();
        if (z10) {
            return;
        }
        while (!this.f51521e.isEmpty()) {
            this.f51521e.peekFirst().run();
            this.f51521e.removeFirst();
        }
    }

    public void h(final int i10, final a<T> aVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f51520d);
        this.f51522f.add(new Runnable() { // from class: com.google.android.exoplayer2.util.s
            @Override // java.lang.Runnable
            public final void run() {
                t.g(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    public void i() {
        Iterator<c<T>> it = this.f51520d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f51519c);
        }
        this.f51520d.clear();
        this.f51523g = true;
    }

    public void j(T t10) {
        for (c<T> cVar : this.f51520d) {
            if (cVar.f51524a.equals(t10)) {
                cVar.c(this.f51519c);
                this.f51520d.remove(cVar);
            }
        }
    }

    public void k(int i10, a<T> aVar) {
        h(i10, aVar);
        e();
    }

    public int l() {
        return this.f51520d.size();
    }
}
