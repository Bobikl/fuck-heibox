package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes5.dex */
public class b extends g<List<? extends g<?>>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.l<d0, kotlin.reflect.jvm.internal.impl.types.d0> f127530b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(@dl.d List<? extends g<?>> value, @dl.d yh.l<? super d0, ? extends kotlin.reflect.jvm.internal.impl.types.d0> computeType) {
        super(value);
        f0.p(value, "value");
        f0.p(computeType, "computeType");
        this.f127530b = computeType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @dl.d
    public kotlin.reflect.jvm.internal.impl.types.d0 a(@dl.d d0 module) {
        f0.p(module, "module");
        kotlin.reflect.jvm.internal.impl.types.d0 d0VarInvoke = this.f127530b.invoke(module);
        if (!kotlin.reflect.jvm.internal.impl.builtins.g.c0(d0VarInvoke) && !kotlin.reflect.jvm.internal.impl.builtins.g.p0(d0VarInvoke)) {
            kotlin.reflect.jvm.internal.impl.builtins.g.C0(d0VarInvoke);
        }
        return d0VarInvoke;
    }
}
