package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.f0;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: _Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class SequencesKt___SequencesKt$flatMapIndexed$2<R> extends FunctionReferenceImpl implements yh.l<m<? extends R>, Iterator<? extends R>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SequencesKt___SequencesKt$flatMapIndexed$2 f128378d = new SequencesKt___SequencesKt$flatMapIndexed$2();

    SequencesKt___SequencesKt$flatMapIndexed$2() {
        super(1, m.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // yh.l
    @dl.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Iterator<R> invoke(@dl.d m<? extends R> p10) {
        f0.p(p10, "p0");
        return p10.iterator();
    }
}
