package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BuiltinSpecialProperties.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.jvm.internal.impl.name.c c(kotlin.reflect.jvm.internal.impl.name.c cVar, String str) {
        kotlin.reflect.jvm.internal.impl.name.c cVarC = cVar.c(kotlin.reflect.jvm.internal.impl.name.f.f(str));
        f0.o(cVarC, "child(Name.identifier(name))");
        return cVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.jvm.internal.impl.name.c d(kotlin.reflect.jvm.internal.impl.name.d dVar, String str) {
        kotlin.reflect.jvm.internal.impl.name.c cVarL = dVar.c(kotlin.reflect.jvm.internal.impl.name.f.f(str)).l();
        f0.o(cVarL, "child(Name.identifier(name)).toSafe()");
        return cVarL;
    }
}
