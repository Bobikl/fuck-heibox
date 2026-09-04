package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SequencesJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a<T> implements m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final AtomicReference<m<T>> f128431a;

    public a(@dl.d m<? extends T> sequence) {
        f0.p(sequence, "sequence");
        this.f128431a = new AtomicReference<>(sequence);
    }

    @Override // kotlin.sequences.m
    @dl.d
    public Iterator<T> iterator() {
        m<T> andSet = this.f128431a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
