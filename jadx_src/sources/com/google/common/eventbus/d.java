package com.google.common.eventbus;

import com.google.common.base.w;
import com.google.common.collect.a2;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: Dispatcher.java */
/* JADX INFO: loaded from: classes7.dex */
@e
public abstract class d {

    /* JADX INFO: compiled from: Dispatcher.java */
    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f58274a = new b();

        private b() {
        }

        @Override // com.google.common.eventbus.d
        void a(Object obj, Iterator<j> it) {
            w.E(obj);
            while (it.hasNext()) {
                it.next().d(obj);
            }
        }
    }

    /* JADX INFO: compiled from: Dispatcher.java */
    public static final class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ConcurrentLinkedQueue<a> f58275a;

        /* JADX INFO: compiled from: Dispatcher.java */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f58276a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final j f58277b;

            private a(Object obj, j jVar) {
                this.f58276a = obj;
                this.f58277b = jVar;
            }
        }

        private c() {
            this.f58275a = a2.f();
        }

        @Override // com.google.common.eventbus.d
        void a(Object obj, Iterator<j> it) {
            w.E(obj);
            while (it.hasNext()) {
                this.f58275a.add(new a(obj, it.next()));
            }
            while (true) {
                a aVarPoll = this.f58275a.poll();
                if (aVarPoll == null) {
                    return;
                } else {
                    aVarPoll.f58277b.d(aVarPoll.f58276a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.eventbus.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Dispatcher.java */
    public static final class C0471d extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadLocal<Queue<c>> f58278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ThreadLocal<Boolean> f58279b;

        /* JADX INFO: renamed from: com.google.common.eventbus.d$d$a */
        /* JADX INFO: compiled from: Dispatcher.java */
        public class a extends ThreadLocal<Queue<c>> {
            a(C0471d c0471d) {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Queue<c> initialValue() {
                return a2.d();
            }
        }

        /* JADX INFO: renamed from: com.google.common.eventbus.d$d$b */
        /* JADX INFO: compiled from: Dispatcher.java */
        public class b extends ThreadLocal<Boolean> {
            b(C0471d c0471d) {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean initialValue() {
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: renamed from: com.google.common.eventbus.d$d$c */
        /* JADX INFO: compiled from: Dispatcher.java */
        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f58280a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Iterator<j> f58281b;

            private c(Object obj, Iterator<j> it) {
                this.f58280a = obj;
                this.f58281b = it;
            }
        }

        private C0471d() {
            this.f58278a = new a(this);
            this.f58279b = new b(this);
        }

        @Override // com.google.common.eventbus.d
        void a(Object obj, Iterator<j> it) {
            w.E(obj);
            w.E(it);
            Queue<c> queue = this.f58278a.get();
            queue.offer(new c(obj, it));
            if (this.f58279b.get().booleanValue()) {
                return;
            }
            this.f58279b.set(Boolean.TRUE);
            while (true) {
                try {
                    c cVarPoll = queue.poll();
                    if (cVarPoll == null) {
                        this.f58279b.remove();
                        this.f58278a.remove();
                        return;
                    } else {
                        while (cVarPoll.f58281b.hasNext()) {
                            ((j) cVarPoll.f58281b.next()).d(cVarPoll.f58280a);
                        }
                    }
                } catch (Throwable th2) {
                    this.f58279b.remove();
                    this.f58278a.remove();
                    throw th2;
                }
            }
        }
    }

    d() {
    }

    static d b() {
        return b.f58274a;
    }

    static d c() {
        return new c();
    }

    static d d() {
        return new C0471d();
    }

    abstract void a(Object obj, Iterator<j> it);
}
