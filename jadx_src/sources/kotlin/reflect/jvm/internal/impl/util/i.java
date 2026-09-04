package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final i f128238a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f128239b = "second parameter must be of type KProperty<*> or its supertype";

    private i() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @dl.e
    public String a(@dl.d w wVar) {
        return f.a.a(this, wVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    public boolean b(@dl.d w functionDescriptor) {
        f0.p(functionDescriptor, "functionDescriptor");
        b1 secondParameter = functionDescriptor.i().get(1);
        ReflectionTypes.b bVar = ReflectionTypes.f125341k;
        f0.o(secondParameter, "secondParameter");
        d0 d0VarA = bVar.a(DescriptorUtilsKt.p(secondParameter));
        if (d0VarA == null) {
            return false;
        }
        d0 type = secondParameter.getType();
        f0.o(type, "secondParameter.type");
        return TypeUtilsKt.p(d0VarA, TypeUtilsKt.t(type));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @dl.d
    public String getDescription() {
        return f128239b;
    }
}
