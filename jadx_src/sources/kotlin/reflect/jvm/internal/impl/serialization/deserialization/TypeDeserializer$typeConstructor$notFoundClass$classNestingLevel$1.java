package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;

/* JADX INFO: compiled from: TypeDeserializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1 extends FunctionReference implements yh.l<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1 f127715d = new TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1();

    TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1() {
        super(1);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.c
    @dl.d
    public final String getName() {
        return "getOuterClassId";
    }

    @Override // kotlin.jvm.internal.CallableReference
    @dl.d
    public final kotlin.reflect.h getOwner() {
        return n0.d(kotlin.reflect.jvm.internal.impl.name.b.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @dl.d
    public final String getSignature() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }

    @Override // yh.l
    @dl.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final kotlin.reflect.jvm.internal.impl.name.b invoke(@dl.d kotlin.reflect.jvm.internal.impl.name.b p10) {
        f0.p(p10, "p0");
        return p10.g();
    }
}
