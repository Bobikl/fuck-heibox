package anetwork.channel.entity;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public final class f implements ThreadFactory {
    f() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, String.format("RepeaterThread:%d", Integer.valueOf(e.f30221b.getAndIncrement())));
    }
}
