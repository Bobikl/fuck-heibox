package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class v0<E> extends b<E> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final List<E> f124649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f124650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f124651d;

    /* JADX WARN: Multi-variable type inference failed */
    public v0(@dl.d List<? extends E> list) {
        kotlin.jvm.internal.f0.p(list, "list");
        this.f124649b = list;
    }

    public final void a(int i10, int i11) {
        b.Companion.d(i10, i11, this.f124649b.size());
        this.f124650c = i10;
        this.f124651d = i11 - i10;
    }

    @Override // kotlin.collections.b, java.util.List
    public E get(int i10) {
        b.Companion.b(i10, this.f124651d);
        return this.f124649b.get(this.f124650c + i10);
    }

    @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public int getF140741e() {
        return this.f124651d;
    }
}
