package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.Pair;
import kotlin.c1;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.j0;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i extends g<Pair<? extends kotlin.reflect.jvm.internal.impl.name.b, ? extends kotlin.reflect.jvm.internal.impl.name.f>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.name.b f127534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.name.f f127535c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@dl.d kotlin.reflect.jvm.internal.impl.name.b enumClassId, @dl.d kotlin.reflect.jvm.internal.impl.name.f enumEntryName) {
        super(c1.a(enumClassId, enumEntryName));
        f0.p(enumClassId, "enumClassId");
        f0.p(enumEntryName, "enumEntryName");
        this.f127534b = enumClassId;
        this.f127535c = enumEntryName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @dl.d
    public d0 a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d0 module) {
        f0.p(module, "module");
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarA = FindClassInModuleKt.a(module, this.f127534b);
        j0 j0VarV = null;
        if (dVarA != null) {
            if (!kotlin.reflect.jvm.internal.impl.resolve.d.A(dVarA)) {
                dVarA = null;
            }
            if (dVarA != null) {
                j0VarV = dVarA.v();
            }
        }
        if (j0VarV != null) {
            return j0VarV;
        }
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_ENUM_TYPE;
        String string = this.f127534b.toString();
        f0.o(string, "enumClassId.toString()");
        String string2 = this.f127535c.toString();
        f0.o(string2, "enumEntryName.toString()");
        return kotlin.reflect.jvm.internal.impl.types.error.h.d(errorTypeKind, string, string2);
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.name.f c() {
        return this.f127535c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f127534b.j());
        sb2.append(lg.a.f131414g);
        sb2.append(this.f127535c);
        return sb2.toString();
    }
}
