package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: KotlinClassFinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class n {
    @dl.e
    public static final o a(@dl.d m mVar, @dl.d kotlin.reflect.jvm.internal.impl.name.b classId) {
        f0.p(mVar, "<this>");
        f0.p(classId, "classId");
        m.a aVarC = mVar.c(classId);
        if (aVarC != null) {
            return aVarC.a();
        }
        return null;
    }

    @dl.e
    public static final o b(@dl.d m mVar, @dl.d mi.g javaClass) {
        f0.p(mVar, "<this>");
        f0.p(javaClass, "javaClass");
        m.a aVarA = mVar.a(javaClass);
        if (aVarA != null) {
            return aVarA.a();
        }
        return null;
    }
}
