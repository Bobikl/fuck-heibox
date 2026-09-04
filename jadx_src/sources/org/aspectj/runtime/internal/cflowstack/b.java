package org.aspectj.runtime.internal.cflowstack;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

/* JADX INFO: compiled from: ThreadCounterImpl11.java */
/* JADX INFO: loaded from: classes5.dex */
public class b implements org.aspectj.runtime.internal.cflowstack.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f137701e = 20000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f137702f = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Thread f137704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f137705c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Hashtable f137703a = new Hashtable();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f137706d = 0;

    /* JADX INFO: compiled from: ThreadCounterImpl11.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected int f137707a = 0;

        a() {
        }
    }

    private synchronized a e() {
        if (Thread.currentThread() != this.f137704b) {
            Thread threadCurrentThread = Thread.currentThread();
            this.f137704b = threadCurrentThread;
            a aVar = (a) this.f137703a.get(threadCurrentThread);
            this.f137705c = aVar;
            if (aVar == null) {
                a aVar2 = new a();
                this.f137705c = aVar2;
                this.f137703a.put(this.f137704b, aVar2);
            }
            this.f137706d++;
            if (this.f137706d > Math.max(100, 20000 / Math.max(1, this.f137703a.size()))) {
                ArrayList arrayList = new ArrayList();
                Enumeration enumerationKeys = this.f137703a.keys();
                while (enumerationKeys.hasMoreElements()) {
                    Thread thread = (Thread) enumerationKeys.nextElement();
                    if (!thread.isAlive()) {
                        arrayList.add(thread);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.f137703a.remove((Thread) it.next());
                }
                this.f137706d = 0;
            }
        }
        return this.f137705c;
    }

    @Override // org.aspectj.runtime.internal.cflowstack.a
    public void a() {
        e().f137707a--;
    }

    @Override // org.aspectj.runtime.internal.cflowstack.a
    public void b() {
    }

    @Override // org.aspectj.runtime.internal.cflowstack.a
    public void c() {
        e().f137707a++;
    }

    @Override // org.aspectj.runtime.internal.cflowstack.a
    public boolean d() {
        return e().f137707a != 0;
    }
}
