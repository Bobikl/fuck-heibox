package com.taobao.downloader.util;

/* JADX INFO: loaded from: classes4.dex */
public class IdGenerator {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private static int f98561id;

    public static synchronized int nextId() {
        int i10;
        if (f98561id >= Integer.MAX_VALUE) {
            f98561id = 0;
        }
        i10 = f98561id;
        f98561id = i10 + 1;
        return i10;
    }
}
