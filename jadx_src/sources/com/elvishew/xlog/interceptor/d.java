package com.elvishew.xlog.interceptor;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: WhitelistTagsFilterInterceptor.java */
/* JADX INFO: loaded from: classes6.dex */
public class d extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterable<String> f42907a;

    public d(Iterable<String> iterable) {
        iterable.getClass();
        this.f42907a = iterable;
    }

    public d(String... strArr) {
        this(Arrays.asList(strArr));
    }

    @Override // com.elvishew.xlog.interceptor.a
    protected boolean b(com.elvishew.xlog.c cVar) {
        Iterable<String> iterable = this.f42907a;
        if (iterable == null) {
            return true;
        }
        Iterator<String> it = iterable.iterator();
        while (it.hasNext()) {
            if (cVar.f42853b.equals(it.next())) {
                return false;
            }
        }
        return true;
    }
}
