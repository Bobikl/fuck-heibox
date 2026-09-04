package ri;

import dl.d;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.types.v0;

/* JADX INFO: compiled from: TypeAttributeTranslators.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final List<v0> f139136a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@d List<? extends v0> translators) {
        f0.p(translators, "translators");
        this.f139136a = translators;
    }

    @d
    public final List<v0> a() {
        return this.f139136a;
    }
}
