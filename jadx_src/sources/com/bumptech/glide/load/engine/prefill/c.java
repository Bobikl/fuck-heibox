package com.bumptech.glide.load.engine.prefill;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PreFillQueue.java */
/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<d, Integer> f41253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<d> f41254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f41256d;

    public c(Map<d, Integer> map) {
        this.f41253a = map;
        this.f41254b = new ArrayList(map.keySet());
        Iterator<Integer> it = map.values().iterator();
        while (it.hasNext()) {
            this.f41255c += it.next().intValue();
        }
    }

    public int a() {
        return this.f41255c;
    }

    public boolean b() {
        return this.f41255c == 0;
    }

    public d c() {
        d dVar = this.f41254b.get(this.f41256d);
        Integer num = this.f41253a.get(dVar);
        if (num.intValue() == 1) {
            this.f41253a.remove(dVar);
            this.f41254b.remove(this.f41256d);
        } else {
            this.f41253a.put(dVar, Integer.valueOf(num.intValue() - 1));
        }
        this.f41255c--;
        this.f41256d = this.f41254b.isEmpty() ? 0 : (this.f41256d + 1) % this.f41254b.size();
        return dVar;
    }
}
