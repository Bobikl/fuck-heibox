package com.tencent.qimei.q;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ReportParamBuilder.java */
/* JADX INFO: loaded from: classes4.dex */
public class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f101304a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, Object> f101305b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f101306c = "";

    @Override // com.tencent.qimei.q.a
    public a a(String str, Object obj) {
        this.f101305b.put(str, obj);
        return this;
    }

    @Override // com.tencent.qimei.q.a
    public void a(String str) {
        j.a().b(this.f101306c, this.f101305b, str, this.f101304a);
    }

    @Override // com.tencent.qimei.q.a
    public a b(String str) {
        this.f101304a = str;
        return this;
    }

    @Override // com.tencent.qimei.q.a
    public a setPath(String str) {
        this.f101306c = str;
        return this;
    }
}
