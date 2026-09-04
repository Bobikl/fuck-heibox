package androidx.compose.ui;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Modifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o {
    public static boolean a(n.c cVar, @dl.d yh.l predicate) {
        f0.p(predicate, "predicate");
        return ((Boolean) predicate.invoke(cVar)).booleanValue();
    }

    public static boolean b(n.c cVar, @dl.d yh.l predicate) {
        f0.p(predicate, "predicate");
        return ((Boolean) predicate.invoke(cVar)).booleanValue();
    }

    public static Object c(n.c cVar, Object obj, @dl.d yh.p operation) {
        f0.p(operation, "operation");
        return operation.invoke(obj, cVar);
    }

    public static Object d(n.c cVar, Object obj, @dl.d yh.p operation) {
        f0.p(operation, "operation");
        return operation.invoke(cVar, obj);
    }
}
