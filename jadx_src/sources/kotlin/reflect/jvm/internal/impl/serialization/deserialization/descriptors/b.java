package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.storage.l;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.reflect.n;

/* JADX INFO: compiled from: DeserializedAnnotations.kt */
/* JADX INFO: loaded from: classes5.dex */
public class b implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f127831c = {n0.u(new PropertyReference1Impl(n0.d(b.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.h f127832b;

    public b(@dl.d m storageManager, @dl.d yh.a<? extends List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> compute) {
        f0.p(storageManager, "storageManager");
        f0.p(compute, "compute");
        this.f127832b = storageManager.c(compute);
    }

    private final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> a() {
        return (List) l.a(this.f127832b, this, f127831c[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
    public boolean J1(@dl.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
    public boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.lang.Iterable
    @dl.d
    public Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator() {
        return a().iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c k(@dl.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.b.a(this, cVar);
    }
}
