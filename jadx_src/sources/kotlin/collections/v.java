package kotlin.collections;

import java.util.Iterator;
import kotlin.b2;

/* JADX INFO: compiled from: Iterators.kt */
/* JADX INFO: loaded from: classes5.dex */
public class v extends u {
    public static final <T> void d0(@dl.d Iterator<? extends T> it, @dl.d yh.l<? super T, b2> operation) {
        kotlin.jvm.internal.f0.p(it, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        while (it.hasNext()) {
            operation.invoke(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @sh.f
    private static final <T> Iterator<T> e0(Iterator<? extends T> it) {
        kotlin.jvm.internal.f0.p(it, "<this>");
        return it;
    }

    @dl.d
    public static final <T> Iterator<h0<T>> f0(@dl.d Iterator<? extends T> it) {
        kotlin.jvm.internal.f0.p(it, "<this>");
        return new j0(it);
    }
}
