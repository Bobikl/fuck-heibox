package kotlinx.serialization.internal;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class y0<E> extends u<E, Set<? extends E>, LinkedHashSet<E>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.descriptors.f f130786b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(@dl.d kotlinx.serialization.g<E> eSerializer) {
        super(eSerializer);
        kotlin.jvm.internal.f0.p(eSerializer, "eSerializer");
        this.f130786b = new x0(eSerializer.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Set<E> q(@dl.d LinkedHashSet<E> linkedHashSet) {
        kotlin.jvm.internal.f0.p(linkedHashSet, "<this>");
        return linkedHashSet;
    }

    @Override // kotlinx.serialization.internal.t, kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return this.f130786b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<E> f() {
        return new LinkedHashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int g(@dl.d LinkedHashSet<E> linkedHashSet) {
        kotlin.jvm.internal.f0.p(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(@dl.d LinkedHashSet<E> linkedHashSet, int i10) {
        kotlin.jvm.internal.f0.p(linkedHashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.t
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void s(@dl.d LinkedHashSet<E> linkedHashSet, int i10, E e10) {
        kotlin.jvm.internal.f0.p(linkedHashSet, "<this>");
        linkedHashSet.add(e10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<E> p(@dl.d Set<? extends E> set) {
        kotlin.jvm.internal.f0.p(set, "<this>");
        LinkedHashSet<E> linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet<>(set) : linkedHashSet;
    }
}
