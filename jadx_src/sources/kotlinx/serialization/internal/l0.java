package kotlinx.serialization.internal;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class l0<E> extends u<E, Set<? extends E>, HashSet<E>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.descriptors.f f130720b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(@dl.d kotlinx.serialization.g<E> eSerializer) {
        super(eSerializer);
        kotlin.jvm.internal.f0.p(eSerializer, "eSerializer");
        this.f130720b = new k0(eSerializer.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Set<E> q(@dl.d HashSet<E> hashSet) {
        kotlin.jvm.internal.f0.p(hashSet, "<this>");
        return hashSet;
    }

    @Override // kotlinx.serialization.internal.t, kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return this.f130720b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public HashSet<E> f() {
        return new HashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int g(@dl.d HashSet<E> hashSet) {
        kotlin.jvm.internal.f0.p(hashSet, "<this>");
        return hashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(@dl.d HashSet<E> hashSet, int i10) {
        kotlin.jvm.internal.f0.p(hashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.t
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void s(@dl.d HashSet<E> hashSet, int i10, E e10) {
        kotlin.jvm.internal.f0.p(hashSet, "<this>");
        hashSet.add(e10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public HashSet<E> p(@dl.d Set<? extends E> set) {
        kotlin.jvm.internal.f0.p(set, "<this>");
        HashSet<E> hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet<>(set) : hashSet;
    }
}
