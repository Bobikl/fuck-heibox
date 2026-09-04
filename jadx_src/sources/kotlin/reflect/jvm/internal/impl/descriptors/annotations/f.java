package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AnnotationsImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final List<c> f125604b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@dl.d List<? extends c> annotations) {
        f0.p(annotations, "annotations");
        this.f125604b = annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
    public boolean J1(@dl.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return e.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
    public boolean isEmpty() {
        return this.f125604b.isEmpty();
    }

    @Override // java.lang.Iterable
    @dl.d
    public Iterator<c> iterator() {
        return this.f125604b.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
    @dl.e
    public c k(@dl.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return e.b.a(this, cVar);
    }

    @dl.d
    public String toString() {
        return this.f125604b.toString();
    }
}
