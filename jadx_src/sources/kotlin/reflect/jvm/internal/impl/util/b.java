package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b {
    @dl.d
    public final g a(@dl.d w functionDescriptor) {
        f0.p(functionDescriptor, "functionDescriptor");
        for (Checks checks : b()) {
            if (checks.b(functionDescriptor)) {
                return checks.a(functionDescriptor);
            }
        }
        return g.a.f128234b;
    }

    @dl.d
    public abstract List<Checks> b();
}
