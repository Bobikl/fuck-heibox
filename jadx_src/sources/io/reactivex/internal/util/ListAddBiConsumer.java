package io.reactivex.internal.util;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public enum ListAddBiConsumer implements kh.c<List, Object, List> {
    INSTANCE;

    public static <T> kh.c<List<T>, T, List<T>> instance() {
        return INSTANCE;
    }

    @Override // kh.c
    public List apply(List list, Object obj) throws Exception {
        list.add(obj);
        return list;
    }
}
