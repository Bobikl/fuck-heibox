package com.tencent.liteav.videobase.frame;

import android.os.SystemClock;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.frame.j;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a<T extends j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f100352a = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<InterfaceC0965a, Deque<T>> f100354c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f100355d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.tencent.liteav.base.b.a f100356e = new com.tencent.liteav.base.b.a(f100352a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g<T> f100357f = new g(this) { // from class: com.tencent.liteav.videobase.frame.b

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f100358a;

        {
            this.f100358a = this;
        }

        @Override // com.tencent.liteav.videobase.frame.g
        public final void a(j jVar) {
            a.a(this.f100358a, jVar);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f100353b = null;

    /* JADX INFO: renamed from: com.tencent.liteav.videobase.frame.a$a, reason: collision with other inner class name */
    public interface InterfaceC0965a {
    }

    protected a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void a(a aVar, j jVar) {
        if (jVar == 0) {
            return;
        }
        synchronized (aVar.f100354c) {
            if (aVar.f100355d) {
                aVar.a(jVar);
                return;
            }
            Deque<T> dequeB = aVar.b(aVar.b(jVar));
            jVar.updateLastUsedTimestamp(SystemClock.elapsedRealtime());
            dequeB.addFirst(jVar);
            aVar.c();
        }
    }

    private Deque<T> b(InterfaceC0965a interfaceC0965a) {
        Deque<T> deque = this.f100354c.get(interfaceC0965a);
        if (deque != null) {
            return deque;
        }
        LinkedList linkedList = new LinkedList();
        this.f100354c.put(interfaceC0965a, linkedList);
        return linkedList;
    }

    private void c() {
        T tPeekLast;
        if (this.f100356e.a()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ArrayList arrayList = new ArrayList();
            synchronized (this.f100354c) {
                for (Deque<T> deque : this.f100354c.values()) {
                    while (!deque.isEmpty() && ((tPeekLast = deque.peekLast()) == null || jElapsedRealtime - tPeekLast.getLastUsedTimestamp() >= f100352a)) {
                        deque.pollLast();
                        arrayList.add(tPeekLast);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((j) it.next());
            }
        }
    }

    protected final T a(InterfaceC0965a interfaceC0965a) {
        T tRemoveFirst;
        synchronized (this.f100354c) {
            Deque<T> dequeB = b(interfaceC0965a);
            tRemoveFirst = !dequeB.isEmpty() ? dequeB.removeFirst() : null;
        }
        c();
        if (tRemoveFirst == null) {
            tRemoveFirst = (T) a(this.f100357f, interfaceC0965a);
        }
        if (tRemoveFirst.retain() != 1) {
            LiteavLog.e("FramePool", "invalid reference count for %s", tRemoveFirst);
        }
        return tRemoveFirst;
    }

    protected abstract T a(g<T> gVar, InterfaceC0965a interfaceC0965a);

    public void a() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f100354c) {
            Iterator<Deque<T>> it = this.f100354c.values().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next());
            }
            this.f100354c.clear();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a((j) it2.next());
        }
    }

    protected abstract void a(T t10);

    protected abstract InterfaceC0965a b(T t10);

    public void b() {
        this.f100355d = true;
        a();
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.f100355d) {
            return;
        }
        LiteavLog.e("FramePool", "%s must call destroy() before finalize()!\n%s", getClass().getName(), this.f100353b);
    }
}
