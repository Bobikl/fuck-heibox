package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: typeEnhancement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.name.c f126384b;

    public b(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqNameToMatch) {
        f0.p(fqNameToMatch, "fqNameToMatch");
        this.f126384b = fqNameToMatch;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
    public boolean J1(@dl.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a k(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        f0.p(fqName, "fqName");
        if (f0.g(fqName, this.f126384b)) {
            return a.f126383a;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    @dl.d
    public Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator() {
        return CollectionsKt__CollectionsKt.E().iterator();
    }
}
