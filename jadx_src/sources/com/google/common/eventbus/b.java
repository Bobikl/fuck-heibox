package com.google.common.eventbus;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: AsyncEventBus.java */
/* JADX INFO: loaded from: classes7.dex */
@e
public class b extends f {
    public b(String str, Executor executor) {
        super(str, executor, d.c(), f.a.f58288a);
    }

    public b(Executor executor) {
        super("default", executor, d.c(), f.a.f58288a);
    }

    public b(Executor executor, l lVar) {
        super("default", executor, d.c(), lVar);
    }
}
