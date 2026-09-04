package kotlinx.serialization.internal;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: Platform.common.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface o1<T> {

    /* JADX INFO: compiled from: Platform.common.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object a(o1 o1Var, kotlin.reflect.d dVar, List list, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get-gIAlu-s");
            }
            if ((i10 & 2) != 0) {
                list = CollectionsKt__CollectionsKt.E();
            }
            return o1Var.a(dVar, list);
        }
    }

    @dl.d
    Object a(@dl.d kotlin.reflect.d<Object> dVar, @dl.d List<? extends kotlin.reflect.r> list);
}
