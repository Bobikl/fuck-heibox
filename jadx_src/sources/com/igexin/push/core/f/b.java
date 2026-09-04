package com.igexin.push.core.f;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b f63740b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<Long, a> f63741a = new HashMap();

    private b() {
    }

    public static b a() {
        if (f63740b == null) {
            f63740b = new b();
        }
        return f63740b;
    }

    private void d(a aVar) {
        if (aVar != null) {
            this.f63741a.put(aVar.a(), aVar);
        }
    }

    public a a(Long l10) {
        return this.f63741a.get(l10);
    }

    public void a(a aVar) {
        if (aVar != null) {
            d(aVar);
        }
    }

    public void b(a aVar) {
        if (aVar != null) {
            aVar.c();
            c(aVar);
        }
    }

    public void c(a aVar) {
        if (aVar != null) {
            this.f63741a.remove(aVar.a());
        }
    }
}
