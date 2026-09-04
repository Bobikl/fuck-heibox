package pi;

import dl.d;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.reflect.jvm.internal.impl.types.j0;

/* JADX INFO: compiled from: SamConversionResolverImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final Iterable<Object> f138297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final kotlin.reflect.jvm.internal.impl.storage.b<kotlin.reflect.jvm.internal.impl.descriptors.d, j0> f138298b;

    public b(@d m storageManager, @d Iterable<? extends Object> samWithReceiverResolvers) {
        f0.p(storageManager, "storageManager");
        f0.p(samWithReceiverResolvers, "samWithReceiverResolvers");
        this.f138297a = samWithReceiverResolvers;
        this.f138298b = storageManager.f();
    }
}
