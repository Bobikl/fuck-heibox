package org.aspectj.runtime.internal.cflowstack;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;

/* JADX INFO: compiled from: ThreadStackImpl11.java */
/* JADX INFO: loaded from: classes5.dex */
public class g implements c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f137709e = 20000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f137710f = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Thread f137712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Stack f137713c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Hashtable f137711a = new Hashtable();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f137714d = 0;

    @Override // org.aspectj.runtime.internal.cflowstack.c
    public void a() {
    }

    @Override // org.aspectj.runtime.internal.cflowstack.c
    public synchronized Stack b() {
        if (Thread.currentThread() != this.f137712b) {
            Thread threadCurrentThread = Thread.currentThread();
            this.f137712b = threadCurrentThread;
            Stack stack = (Stack) this.f137711a.get(threadCurrentThread);
            this.f137713c = stack;
            if (stack == null) {
                Stack stack2 = new Stack();
                this.f137713c = stack2;
                this.f137711a.put(this.f137712b, stack2);
            }
            this.f137714d++;
            if (this.f137714d > Math.max(100, 20000 / Math.max(1, this.f137711a.size()))) {
                Stack stack3 = new Stack();
                Enumeration enumerationKeys = this.f137711a.keys();
                while (enumerationKeys.hasMoreElements()) {
                    Thread thread = (Thread) enumerationKeys.nextElement();
                    if (!thread.isAlive()) {
                        stack3.push(thread);
                    }
                }
                Enumeration enumerationElements = stack3.elements();
                while (enumerationElements.hasMoreElements()) {
                    this.f137711a.remove((Thread) enumerationElements.nextElement());
                }
                this.f137714d = 0;
            }
        }
        return this.f137713c;
    }
}
