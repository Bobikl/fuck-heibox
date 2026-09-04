package kotlin.reflect.jvm;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.f0;
import kotlin.reflect.i;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.g;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f;
import kotlin.reflect.jvm.internal.s;
import kotlin.u;

/* JADX INFO: compiled from: reflectLambda.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ReflectLambdaKt {
    @a
    @dl.e
    public static final <R> i<R> a(@dl.d u<? extends R> uVar) {
        f0.p(uVar, "<this>");
        Metadata metadata = (Metadata) uVar.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 == null) {
            return null;
        }
        Pair<f, ProtoBuf.Function> pairJ = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.j(strArrD1, metadata.d2());
        f fVarA = pairJ.a();
        ProtoBuf.Function functionB = pairJ.b();
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e eVar = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e(metadata.mv(), (metadata.xi() & 8) != 0);
        Class<?> cls = uVar.getClass();
        ProtoBuf.TypeTable typeTableN0 = functionB.n0();
        f0.o(typeTableN0, "proto.typeTable");
        return new KFunctionImpl(kotlin.reflect.jvm.internal.f.f125319e, (s0) s.h(cls, functionB, fVarA, new g(typeTableN0), eVar, ReflectLambdaKt$reflect$descriptor$1.f125070d));
    }
}
