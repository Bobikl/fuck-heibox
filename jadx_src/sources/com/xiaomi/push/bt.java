package com.xiaomi.push;

import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public class bt extends JSONArray implements bs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f106893a = 2;

    @Override // com.xiaomi.push.bs
    public int a() {
        return this.f106893a + (length() - 1);
    }

    @Override // org.json.JSONArray
    public JSONArray put(Object obj) {
        if (obj instanceof bs) {
            this.f106893a += ((bs) obj).a();
        }
        return super.put(obj);
    }
}
