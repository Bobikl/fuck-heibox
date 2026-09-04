package com.tencent.beacon.base.net;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: BResponse.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, List<String>> f98846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f98847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f98848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f98849d;

    public a(Map<String, List<String>> map, int i10, String str, byte[] bArr) {
        this.f98846a = map;
        this.f98847b = i10;
        this.f98848c = str;
        this.f98849d = bArr;
    }

    public String toString() {
        return "BResponse{code=" + this.f98847b + ", msg='" + this.f98848c + "'}";
    }
}
