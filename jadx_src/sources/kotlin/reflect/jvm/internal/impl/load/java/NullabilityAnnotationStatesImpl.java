package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* JADX INFO: compiled from: JavaNullabilityAnnotationSettings.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class NullabilityAnnotationStatesImpl<T> implements v<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Map<kotlin.reflect.jvm.internal.impl.name.c, T> f125978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final LockBasedStorageManager f125979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.c, T> f125980d;

    /* JADX WARN: Multi-variable type inference failed */
    public NullabilityAnnotationStatesImpl(@dl.d Map<kotlin.reflect.jvm.internal.impl.name.c, ? extends T> states) {
        f0.p(states, "states");
        this.f125978b = states;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Java nullability annotation states");
        this.f125979c = lockBasedStorageManager;
        kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.c, T> gVarH = lockBasedStorageManager.h(new yh.l<kotlin.reflect.jvm.internal.impl.name.c, T>(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl$cache$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ NullabilityAnnotationStatesImpl<T> f125981b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f125981b = this;
            }

            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final T invoke(kotlin.reflect.jvm.internal.impl.name.c it) {
                f0.o(it, "it");
                return (T) kotlin.reflect.jvm.internal.impl.name.e.a(it, this.f125981b.b());
            }
        });
        f0.o(gVarH, "storageManager.createMem…cificFqname(states)\n    }");
        this.f125980d = gVarH;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.v
    @dl.e
    public T a(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        f0.p(fqName, "fqName");
        return this.f125980d.invoke(fqName);
    }

    @dl.d
    public final Map<kotlin.reflect.jvm.internal.impl.name.c, T> b() {
        return this.f125978b;
    }
}
