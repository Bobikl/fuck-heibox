package kotlinx.serialization.modules;

import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.k;
import kotlin.s0;
import kotlinx.serialization.r;

/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e {
    private e() {
    }

    public /* synthetic */ e(u uVar) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlinx.serialization.g d(e eVar, kotlin.reflect.d dVar, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i10 & 2) != 0) {
            list = CollectionsKt__CollectionsKt.E();
        }
        return eVar.c(dVar, list);
    }

    @kotlinx.serialization.d
    public abstract void a(@dl.d SerializersModuleCollector serializersModuleCollector);

    @k(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of overload with default parameter", replaceWith = @s0(expression = "getContextual(kclass)", imports = {}))
    @kotlinx.serialization.d
    public final /* synthetic */ kotlinx.serialization.g b(kotlin.reflect.d kclass) {
        f0.p(kclass, "kclass");
        return c(kclass, CollectionsKt__CollectionsKt.E());
    }

    @dl.e
    @kotlinx.serialization.d
    public abstract <T> kotlinx.serialization.g<T> c(@dl.d kotlin.reflect.d<T> dVar, @dl.d List<? extends kotlinx.serialization.g<?>> list);

    @dl.e
    @kotlinx.serialization.d
    public abstract <T> kotlinx.serialization.c<T> e(@dl.d kotlin.reflect.d<? super T> dVar, @dl.e String str);

    @dl.e
    @kotlinx.serialization.d
    public abstract <T> r<T> f(@dl.d kotlin.reflect.d<? super T> dVar, @dl.d T t10);
}
