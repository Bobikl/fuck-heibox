package org.aspectj.runtime.internal.cflowstack;

import java.util.Stack;

/* JADX INFO: compiled from: ThreadStackFactoryImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class e implements d {

    /* JADX INFO: compiled from: ThreadStackFactoryImpl.java */
    public static class b extends ThreadLocal implements org.aspectj.runtime.internal.cflowstack.a {

        /* JADX INFO: compiled from: ThreadStackFactoryImpl.java */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            protected int f137708a = 0;

            a() {
            }
        }

        private b() {
        }

        @Override // org.aspectj.runtime.internal.cflowstack.a
        public void a() {
            e().f137708a--;
        }

        @Override // org.aspectj.runtime.internal.cflowstack.a
        public void b() {
            remove();
        }

        @Override // org.aspectj.runtime.internal.cflowstack.a
        public void c() {
            e().f137708a++;
        }

        @Override // org.aspectj.runtime.internal.cflowstack.a
        public boolean d() {
            return e().f137708a != 0;
        }

        public a e() {
            return (a) get();
        }

        @Override // java.lang.ThreadLocal
        public Object initialValue() {
            return new a();
        }
    }

    /* JADX INFO: compiled from: ThreadStackFactoryImpl.java */
    public static class c extends ThreadLocal implements org.aspectj.runtime.internal.cflowstack.c {
        private c() {
        }

        @Override // org.aspectj.runtime.internal.cflowstack.c
        public void a() {
            remove();
        }

        @Override // org.aspectj.runtime.internal.cflowstack.c
        public Stack b() {
            return (Stack) get();
        }

        @Override // java.lang.ThreadLocal
        public Object initialValue() {
            return new Stack();
        }
    }

    @Override // org.aspectj.runtime.internal.cflowstack.d
    public org.aspectj.runtime.internal.cflowstack.a a() {
        return new b();
    }

    @Override // org.aspectj.runtime.internal.cflowstack.d
    public org.aspectj.runtime.internal.cflowstack.c b() {
        return new c();
    }
}
