package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.f0;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: _Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class SequencesKt___SequencesKt$flatMapIndexed$1<R> extends FunctionReferenceImpl implements yh.l<Iterable<? extends R>, Iterator<? extends R>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SequencesKt___SequencesKt$flatMapIndexed$1 f128377d = new SequencesKt___SequencesKt$flatMapIndexed$1();

    SequencesKt___SequencesKt$flatMapIndexed$1() {
        super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // yh.l
    @dl.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Iterator<R> invoke(@dl.d Iterable<? extends R> p10) {
        f0.p(p10, "p0");
        return p10.iterator();
    }
}
