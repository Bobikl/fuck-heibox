package com.efs.sdk.base.core.util.a;

import androidx.annotation.n0;
import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpEnv;
import com.efs.sdk.base.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f42571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<com.efs.sdk.base.core.util.concurrent.b<HttpResponse>> f42572b;

    public d(@n0 String str) {
        b bVar = new b();
        this.f42571a = bVar;
        bVar.f42563a = str;
    }

    public final c a() {
        c cVar = new c(this.f42571a);
        List<com.efs.sdk.base.core.util.concurrent.b<HttpResponse>> list = this.f42572b;
        if (list != null && list.size() > 0) {
            cVar.a(this.f42572b);
        }
        List<com.efs.sdk.base.core.util.concurrent.b<HttpResponse>> httpListenerList = HttpEnv.getInstance().getHttpListenerList();
        if (httpListenerList != null && httpListenerList.size() > 0) {
            cVar.a(httpListenerList);
        }
        return cVar;
    }

    public final d a(@n0 AbsHttpListener absHttpListener) {
        if (this.f42572b == null) {
            this.f42572b = new ArrayList(5);
        }
        this.f42572b.add(absHttpListener);
        return this;
    }

    public final d a(String str, String str2) {
        b bVar = this.f42571a;
        if (bVar.f42568f == null) {
            bVar.f42568f = new HashMap(5);
        }
        this.f42571a.f42568f.put(str, str2);
        return this;
    }

    public final d a(@n0 Map<String, String> map) {
        this.f42571a.f42564b = map;
        return this;
    }
}
