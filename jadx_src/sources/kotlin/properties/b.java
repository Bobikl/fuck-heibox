package kotlin.properties;

import kotlin.jvm.internal.f0;
import kotlin.reflect.n;

/* JADX INFO: compiled from: Delegates.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b<T> implements f<Object, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private T f125020a;

    @Override // kotlin.properties.f, kotlin.properties.e
    @dl.d
    public T a(@dl.e Object obj, @dl.d n<?> property) {
        f0.p(property, "property");
        T t10 = this.f125020a;
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Property " + property.getName() + " should be initialized before get.");
    }

    @Override // kotlin.properties.f
    public void b(@dl.e Object obj, @dl.d n<?> property, @dl.d T value) {
        f0.p(property, "property");
        f0.p(value, "value");
        this.f125020a = value;
    }
}
