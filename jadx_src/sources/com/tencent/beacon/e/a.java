package com.tencent.beacon.e;

import java.util.Calendar;
import java.util.Map;

/* JADX INFO: compiled from: BeaconStrategy.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f98978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f98979b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f98980c = "oth.str.mdt.qq.com";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f98981d = 360;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f98982e = 100;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, String> f98983f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f98984g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f98985h = new d(1);

    private a() {
    }

    public static a a() {
        if (f98978a == null) {
            synchronized (a.class) {
                if (f98978a == null) {
                    f98978a = new a();
                }
            }
        }
        return f98978a;
    }

    public String a(String str) {
        Map<String, String> mapA;
        d dVar = this.f98985h;
        if (dVar == null || (mapA = dVar.a()) == null) {
            return null;
        }
        return mapA.get(str);
    }

    public void a(int i10) {
        this.f98981d = i10;
    }

    public synchronized void a(Map<String, String> map) {
        this.f98983f = map;
    }

    public int b() {
        return this.f98981d;
    }

    public synchronized int c() {
        String str;
        Map<String, String> map = this.f98983f;
        if (map == null || (str = map.get("maxStrategyQueryOneDay")) == null || str.trim().equals("")) {
            return this.f98982e;
        }
        int i10 = this.f98982e;
        try {
            i10 = Integer.parseInt(str);
        } catch (Exception e10) {
            com.tencent.beacon.base.util.c.a(e10);
        }
        return i10;
    }

    public d d() {
        return this.f98985h;
    }

    public synchronized boolean e() {
        Map<String, String> map = this.f98983f;
        if (map == null || !"y".equalsIgnoreCase(map.get("zeroPeak"))) {
            return false;
        }
        return Calendar.getInstance().get(11) == 0;
    }
}
