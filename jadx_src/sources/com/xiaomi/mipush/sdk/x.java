package com.xiaomi.mipush.sdk;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f106804a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    String f160a = "";

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return !TextUtils.isEmpty(xVar.f160a) && xVar.f160a.equals(this.f160a);
    }
}
