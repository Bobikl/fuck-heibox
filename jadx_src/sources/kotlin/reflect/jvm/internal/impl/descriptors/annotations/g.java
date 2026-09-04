package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g {
    @dl.d
    public static final e a(@dl.d e first, @dl.d e second) {
        f0.p(first, "first");
        f0.p(second, "second");
        if (first.isEmpty()) {
            return second;
        }
        return second.isEmpty() ? first : new CompositeAnnotations(first, second);
    }
}
