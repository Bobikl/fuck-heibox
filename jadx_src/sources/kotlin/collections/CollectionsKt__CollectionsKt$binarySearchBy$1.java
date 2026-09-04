package kotlin.collections;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Collections.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class CollectionsKt__CollectionsKt$binarySearchBy$1<T> extends Lambda implements yh.l<T, Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.l<T, K> f124532b;

    /* JADX INFO: Incorrect field signature: TK; */
    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Comparable f124533c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lyh/l<-TT;+TK;>;TK;)V */
    public CollectionsKt__CollectionsKt$binarySearchBy$1(yh.l lVar, Comparable comparable) {
        super(1);
        this.f124532b = lVar;
        this.f124533c = comparable;
    }

    @Override // yh.l
    @dl.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer invoke(T t10) {
        return Integer.valueOf(kotlin.comparisons.g.l((Comparable) this.f124532b.invoke(t10), this.f124533c));
    }
}
