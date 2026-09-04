package com.tencent.thumbplayer.tcmedia.tplayer.a;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, String> f102977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f102978b = 1;

    static {
        HashMap map = new HashMap();
        f102977a = map;
        map.put(1, "IDLE");
        map.put(2, "PREPARING");
        map.put(3, "PREPARED");
    }

    public synchronized void a(int i10) {
        this.f102978b = i10;
    }

    public synchronized boolean b(int i10) {
        return this.f102978b == i10;
    }

    public synchronized String toString() {
        return "state[ cur : " + f102977a.get(Integer.valueOf(this.f102978b)) + " ]";
    }
}
