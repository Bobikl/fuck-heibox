package com.elvishew.xlog.interceptor;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: BlacklistTagsFilterInterceptor.java */
/* JADX INFO: loaded from: classes6.dex */
public class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterable<String> f42906a;

    public b(Iterable<String> iterable) {
        iterable.getClass();
        this.f42906a = iterable;
    }

    public b(String... strArr) {
        this(Arrays.asList(strArr));
    }

    @Override // com.elvishew.xlog.interceptor.a
    protected boolean b(com.elvishew.xlog.c cVar) {
        Iterable<String> iterable = this.f42906a;
        if (iterable == null) {
            return false;
        }
        Iterator<String> it = iterable.iterator();
        while (it.hasNext()) {
            if (cVar.f42853b.equals(it.next())) {
                return true;
            }
        }
        return false;
    }
}
