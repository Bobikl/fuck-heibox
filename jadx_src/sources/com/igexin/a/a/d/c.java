package com.igexin.a.a.d;

import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentLinkedQueue<com.igexin.a.a.d.a.e> f63219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentLinkedQueue<com.igexin.a.a.d.a.e> f63220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentLinkedQueue<com.igexin.a.a.d.a.e> f63221c;

    public c() {
        ConcurrentLinkedQueue<com.igexin.a.a.d.a.e> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        this.f63219a = concurrentLinkedQueue;
        this.f63220b = new ConcurrentLinkedQueue<>();
        this.f63221c = concurrentLinkedQueue;
    }

    public synchronized void a() {
        this.f63221c = this.f63219a;
    }

    public synchronized void a(com.igexin.a.a.d.a.e eVar) {
        this.f63221c.offer(eVar);
    }

    public synchronized void b() {
        ConcurrentLinkedQueue<com.igexin.a.a.d.a.e> concurrentLinkedQueue = this.f63220b;
        this.f63221c = concurrentLinkedQueue;
        concurrentLinkedQueue.addAll(this.f63219a);
        this.f63219a.clear();
    }

    public synchronized boolean c() {
        return this.f63221c.isEmpty();
    }

    public synchronized com.igexin.a.a.d.a.e d() {
        return this.f63221c.poll();
    }
}
