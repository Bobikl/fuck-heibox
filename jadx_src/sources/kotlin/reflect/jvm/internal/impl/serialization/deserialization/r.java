package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: NameResolverUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class r {
    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.name.b a(@dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, int i10) {
        f0.p(cVar, "<this>");
        kotlin.reflect.jvm.internal.impl.name.b bVarF = kotlin.reflect.jvm.internal.impl.name.b.f(cVar.a(i10), cVar.b(i10));
        f0.o(bVarF, "fromString(getQualifiedC… isLocalClassName(index))");
        return bVarF;
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.name.f b(@dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, int i10) {
        f0.p(cVar, "<this>");
        kotlin.reflect.jvm.internal.impl.name.f fVarE = kotlin.reflect.jvm.internal.impl.name.f.e(cVar.getString(i10));
        f0.o(fVarE, "guessByFirstCharacter(getString(index))");
        return fVarE;
    }
}
