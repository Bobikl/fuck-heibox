package com.huawei.hms.framework.network.grs.local.model;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.max.xiaoheihe.module.voice.component.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f60869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, d> f60870b = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<b> f60871c = new ArrayList(16);

    public d a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f60870b.get(str);
        }
        Logger.w(f.f94113a, "In servings.getServing(String groupId), the groupId is Empty or null");
        return null;
    }

    public List<b> a() {
        return this.f60871c;
    }

    public void a(String str, d dVar) {
        if (TextUtils.isEmpty(str) || dVar == null) {
            return;
        }
        this.f60870b.put(str, dVar);
    }

    public void a(List<b> list) {
        this.f60871c = list;
    }

    public String b() {
        return this.f60869a;
    }

    public void b(String str) {
    }

    public void c(String str) {
        this.f60869a = str;
    }
}
