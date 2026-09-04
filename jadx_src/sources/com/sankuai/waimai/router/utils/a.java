package com.sankuai.waimai.router.utils;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: compiled from: CaseInsensitiveNonNullMap.java */
/* JADX INFO: loaded from: classes8.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, T> f96559a = new HashMap<>();

    public boolean a(String str) {
        return this.f96559a.containsKey(f.f(str));
    }

    public T b(String str) {
        return this.f96559a.get(f.f(str));
    }

    public T c(String str, T t10) {
        if (TextUtils.isEmpty(str) || t10 == null) {
            return null;
        }
        return this.f96559a.put(f.f(str), t10);
    }

    public T d(String str) {
        return this.f96559a.remove(f.f(str));
    }
}
