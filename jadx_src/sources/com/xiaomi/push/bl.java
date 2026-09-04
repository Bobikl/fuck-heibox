package com.xiaomi.push;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public class bl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinkedList<a> f106876a = new LinkedList<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final bl f106877a = new bl();

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public int f216a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public Object f217a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public String f218a;

        a(int i10, Object obj) {
            this.f216a = i10;
            this.f217a = obj;
        }
    }

    public static bl a() {
        return a.f106877a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private void m186a() {
        if (this.f106876a.size() > 100) {
            this.f106876a.removeFirst();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized int m187a() {
        return this.f106876a.size();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized LinkedList<a> m188a() {
        LinkedList<a> linkedList;
        linkedList = this.f106876a;
        this.f106876a = new LinkedList<>();
        return linkedList;
    }

    public synchronized void a(Object obj) {
        this.f106876a.add(new a(0, obj));
        m186a();
    }
}
