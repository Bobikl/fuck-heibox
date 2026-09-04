package com.tencent.beacon.e;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: ModuleStrategyBean.java */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f99012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f99013b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f99014c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, String> f99015d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set<String> f99016e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Set<String> f99017f = null;

    public d(int i10) {
        this.f99012a = i10;
    }

    public Map<String, String> a() {
        return this.f99015d;
    }

    public void a(Map<String, String> map) {
        this.f99015d = map;
    }

    public void a(Set<String> set) {
        this.f99016e = set;
    }

    public void a(boolean z10) {
        this.f99014c = z10;
    }

    public int b() {
        return this.f99012a;
    }

    public void b(Set<String> set) {
        this.f99017f = set;
    }

    public boolean c() {
        return this.f99014c;
    }
}
