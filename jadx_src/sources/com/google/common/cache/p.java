package com.google.common.cache;

import com.google.common.base.w;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: RemovalListeners.java */
/* JADX INFO: loaded from: classes7.dex */
@f
@o9.c
public final class p {
    private p() {
    }

    public static <K, V> m<K, V> c(final m<K, V> mVar, final Executor executor) {
        w.E(mVar);
        w.E(executor);
        return new m() { // from class: com.google.common.cache.o
            @Override // com.google.common.cache.m
            public final void onRemoval(RemovalNotification removalNotification) {
                p.e(executor, mVar, removalNotification);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Executor executor, final m mVar, final RemovalNotification removalNotification) {
        executor.execute(new Runnable() { // from class: com.google.common.cache.n
            @Override // java.lang.Runnable
            public final void run() {
                mVar.onRemoval(removalNotification);
            }
        });
    }
}
