package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.types.j0;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class t extends g<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@dl.d String value) {
        super(value);
        f0.p(value, "value");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @dl.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public j0 a(@dl.d d0 module) {
        f0.p(module, "module");
        j0 j0VarW = module.t().W();
        f0.o(j0VarW, "module.builtIns.stringType");
        return j0VarW;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @dl.d
    public String toString() {
        return kotlin.text.y.f128593b + b() + kotlin.text.y.f128593b;
    }
}
