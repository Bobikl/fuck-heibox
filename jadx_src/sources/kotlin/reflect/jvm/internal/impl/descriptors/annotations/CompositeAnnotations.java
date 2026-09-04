package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.m;
import yh.l;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class CompositeAnnotations implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final List<e> f125594b;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeAnnotations(@dl.d List<? extends e> delegates) {
        f0.p(delegates, "delegates");
        this.f125594b = delegates;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompositeAnnotations(@dl.d e... delegates) {
        this((List<? extends e>) ArraysKt___ArraysKt.kz(delegates));
        f0.p(delegates, "delegates");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
    public boolean J1(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        f0.p(fqName, "fqName");
        Iterator it = CollectionsKt___CollectionsKt.v1(this.f125594b).iterator();
        while (it.hasNext()) {
            if (((e) it.next()).J1(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
    public boolean isEmpty() {
        List<e> list = this.f125594b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((e) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    @dl.d
    public Iterator<c> iterator() {
        return SequencesKt___SequencesKt.H0(CollectionsKt___CollectionsKt.v1(this.f125594b), new l<e, m<? extends c>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations.iterator.1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m<c> invoke(@dl.d e it) {
                f0.p(it, "it");
                return CollectionsKt___CollectionsKt.v1(it);
            }
        }).iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
    @dl.e
    public c k(@dl.d final kotlin.reflect.jvm.internal.impl.name.c fqName) {
        f0.p(fqName, "fqName");
        return (c) SequencesKt___SequencesKt.F0(SequencesKt___SequencesKt.p1(CollectionsKt___CollectionsKt.v1(this.f125594b), new l<e, c>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations$findAnnotation$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(@dl.d e it) {
                f0.p(it, "it");
                return it.k(fqName);
            }
        }));
    }
}
