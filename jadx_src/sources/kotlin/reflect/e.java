package kotlin.reflect;

import kotlin.e2;
import kotlin.jvm.internal.f0;
import kotlin.u0;

/* JADX INFO: compiled from: KClasses.kt */
/* JADX INFO: loaded from: classes5.dex */
@xh.h(name = "KClasses")
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    @u0(version = "1.4")
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    @sh.h
    public static final <T> T a(@dl.d d<T> dVar, @dl.e Object obj) {
        f0.p(dVar, "<this>");
        if (dVar.u(obj)) {
            f0.n(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + dVar.A());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    @sh.h
    public static final <T> T b(@dl.d d<T> dVar, @dl.e Object obj) {
        f0.p(dVar, "<this>");
        if (!dVar.u(obj)) {
            return null;
        }
        f0.n(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
        return obj;
    }
}
