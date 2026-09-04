package kotlin.properties;

import kotlin.jvm.internal.f0;
import kotlin.reflect.n;

/* JADX INFO: compiled from: ObservableProperty.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c<V> implements f<Object, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private V f125021a;

    public c(V v10) {
        this.f125021a = v10;
    }

    @Override // kotlin.properties.f, kotlin.properties.e
    public V a(@dl.e Object obj, @dl.d n<?> property) {
        f0.p(property, "property");
        return this.f125021a;
    }

    @Override // kotlin.properties.f
    public void b(@dl.e Object obj, @dl.d n<?> property, V v10) {
        f0.p(property, "property");
        V v11 = this.f125021a;
        if (d(property, v11, v10)) {
            this.f125021a = v10;
            c(property, v11, v10);
        }
    }

    protected void c(@dl.d n<?> property, V v10, V v11) {
        f0.p(property, "property");
    }

    protected boolean d(@dl.d n<?> property, V v10, V v11) {
        f0.p(property, "property");
        return true;
    }
}
