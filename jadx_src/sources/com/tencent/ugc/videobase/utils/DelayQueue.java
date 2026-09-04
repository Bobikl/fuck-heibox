package com.tencent.ugc.videobase.utils;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public class DelayQueue {
    private final LinkedList<Runnable> mRunOnDraw = new LinkedList<>();

    public void add(Runnable runnable) {
        synchronized (this.mRunOnDraw) {
            this.mRunOnDraw.add(runnable);
        }
    }

    public void rerun() {
        LinkedList linkedList;
        synchronized (this.mRunOnDraw) {
            if (this.mRunOnDraw.isEmpty()) {
                linkedList = null;
            } else {
                linkedList = new LinkedList(this.mRunOnDraw);
                this.mRunOnDraw.clear();
            }
        }
        while (linkedList != null && !linkedList.isEmpty()) {
            ((Runnable) linkedList.removeFirst()).run();
        }
    }
}
