package com.tencent.open.a;

import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f101009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f101010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f101011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f101012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f101013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, List<String>> f101014f = new HashMap();

    public c(HttpURLConnection httpURLConnection, String str, int i10, int i11, int i12, String str2) {
        Map<String, List<String>> headerFields;
        this.f101009a = str;
        this.f101010b = i10;
        this.f101011c = i11;
        this.f101012d = i12;
        this.f101013e = str2;
        if (httpURLConnection == null || (headerFields = httpURLConnection.getHeaderFields()) == null) {
            return;
        }
        this.f101014f.putAll(headerFields);
    }

    @Override // com.tencent.open.a.g
    public String a() {
        return this.f101009a;
    }

    @Override // com.tencent.open.a.g
    public int b() {
        return this.f101010b;
    }

    @Override // com.tencent.open.a.g
    public int c() {
        return this.f101011c;
    }

    @Override // com.tencent.open.a.g
    public int d() {
        return this.f101012d;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + hashCode() + "\ncontent = [" + this.f101009a + "]\nresponseSize = " + this.f101010b + "\nrequestSize = " + this.f101011c + "\nresultCode = " + this.f101012d + "\nerrorMsg = " + this.f101013e;
    }
}
