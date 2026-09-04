package com.tencent.beacon.a.a;

import java.util.Map;

/* JADX INFO: compiled from: BusEvent.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f98739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, Object> f98740b;

    public c(int i10) {
        this.f98739a = i10;
    }

    public c(int i10, Map<String, Object> map) {
        this.f98739a = i10;
        this.f98740b = map;
    }

    public String toString() {
        return "BusEvent{channel=" + this.f98739a + ", params=" + this.f98740b + '}';
    }
}
