package com.tencent.liteav.videobase.utils;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList<Runnable> f100403a = new LinkedList<>();

    public final void a() {
        LinkedList linkedList;
        synchronized (this.f100403a) {
            if (this.f100403a.isEmpty()) {
                linkedList = null;
            } else {
                linkedList = new LinkedList(this.f100403a);
                this.f100403a.clear();
            }
        }
        while (linkedList != null && !linkedList.isEmpty()) {
            ((Runnable) linkedList.removeFirst()).run();
        }
    }
}
