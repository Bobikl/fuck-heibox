package com.alibaba.sdk.android.httpdns.net64;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class a implements Net64Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f37982a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ConcurrentHashMap<String, List<String>> f46a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f37983o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile boolean f37984p;

    /* JADX INFO: renamed from: com.alibaba.sdk.android.httpdns.net64.a$a, reason: collision with other inner class name */
    public static final class C0290a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f37985a = new a();
    }

    private a() {
        this.f37982a = new b();
        this.f46a = new ConcurrentHashMap<>();
    }

    public static a a() {
        return C0290a.f37985a;
    }

    public List<String> a(String str) {
        return this.f46a.get(str);
    }

    public void a(String str, List<String> list) {
        this.f46a.put(str, list);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m29a() {
        return this.f37983o;
    }

    @Override // com.alibaba.sdk.android.httpdns.net64.Net64Service
    public void enableIPv6(boolean z10) {
        this.f37983o = z10;
    }

    @Override // com.alibaba.sdk.android.httpdns.net64.Net64Service
    public String getIPv6ByHostAsync(String str) {
        List<String> list;
        if (this.f37983o && (list = this.f46a.get(str)) != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    public boolean i() {
        return this.f37984p;
    }
}
