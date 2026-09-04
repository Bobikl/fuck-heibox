package com.xiaomi.push;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106866a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f210a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Map<String, String> f211a = new HashMap();

    public String a() {
        return this.f210a;
    }

    public String toString() {
        return String.format("resCode = %1$d, headers = %2$s, response = %3$s", Integer.valueOf(this.f106866a), this.f211a.toString(), this.f210a);
    }
}
