package com.google.common.collect;

import java.util.Queue;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ConsumingQueueIterator.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public final class s<T> extends AbstractIterator<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue<T> f58170d;

    s(Queue<T> queue) {
        this.f58170d = (Queue) com.google.common.base.w.E(queue);
    }

    @Override // com.google.common.collect.AbstractIterator
    @CheckForNull
    public T a() {
        return this.f58170d.isEmpty() ? b() : this.f58170d.remove();
    }
}
