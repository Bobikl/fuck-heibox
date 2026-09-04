package kotlinx.serialization;

import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.serialization.internal.d2;
import kotlinx.serialization.internal.o1;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

/* JADX INFO: compiled from: SerializersCache.kt */
/* JADX INFO: loaded from: classes5.dex */
@t0({"SMAP\nSerializersCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersCache.kt\nkotlinx/serialization/SerializersCacheKt\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,75:1\n79#2:76\n*S KotlinDebug\n*F\n+ 1 SerializersCache.kt\nkotlinx/serialization/SerializersCacheKt\n*L\n53#1:76\n*E\n"})
public final class SerializersCacheKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final d2<? extends Object> f130533a = kotlinx.serialization.internal.o.a(new yh.l<kotlin.reflect.d<?>, g<? extends Object>>() { // from class: kotlinx.serialization.SerializersCacheKt$SERIALIZERS_CACHE$1
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g<? extends Object> invoke(@dl.d kotlin.reflect.d<?> it) {
            f0.p(it, "it");
            return t.o(it);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final d2<Object> f130534b = kotlinx.serialization.internal.o.a(new yh.l<kotlin.reflect.d<?>, g<Object>>() { // from class: kotlinx.serialization.SerializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g<Object> invoke(@dl.d kotlin.reflect.d<?> it) {
            g<Object> gVarV;
            f0.p(it, "it");
            g gVarO = t.o(it);
            if (gVarO == null || (gVarV = dj.a.v(gVarO)) == null) {
                return null;
            }
            return gVarV;
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final o1<? extends Object> f130535c = kotlinx.serialization.internal.o.b(new yh.p<kotlin.reflect.d<Object>, List<? extends kotlin.reflect.r>, g<? extends Object>>() { // from class: kotlinx.serialization.SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g<? extends Object> invoke(@dl.d kotlin.reflect.d<Object> clazz, @dl.d final List<? extends kotlin.reflect.r> types) {
            f0.p(clazz, "clazz");
            f0.p(types, "types");
            List<g<Object>> listS = t.s(SerializersModuleBuildersKt.a(), types, true);
            f0.m(listS);
            return t.d(clazz, listS, new yh.a<kotlin.reflect.g>() { // from class: kotlinx.serialization.SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlin.reflect.g invoke() {
                    return types.get(0).o();
                }
            });
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final o1<Object> f130536d = kotlinx.serialization.internal.o.b(new yh.p<kotlin.reflect.d<Object>, List<? extends kotlin.reflect.r>, g<Object>>() { // from class: kotlinx.serialization.SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g<Object> invoke(@dl.d kotlin.reflect.d<Object> clazz, @dl.d final List<? extends kotlin.reflect.r> types) {
            g<Object> gVarV;
            f0.p(clazz, "clazz");
            f0.p(types, "types");
            List<g<Object>> listS = t.s(SerializersModuleBuildersKt.a(), types, true);
            f0.m(listS);
            g<? extends Object> gVarD = t.d(clazz, listS, new yh.a<kotlin.reflect.g>() { // from class: kotlinx.serialization.SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlin.reflect.g invoke() {
                    return types.get(0).o();
                }
            });
            if (gVarD == null || (gVarV = dj.a.v(gVarD)) == null) {
                return null;
            }
            return gVarV;
        }
    });

    @dl.e
    public static final g<Object> a(@dl.d kotlin.reflect.d<Object> clazz, boolean z10) {
        f0.p(clazz, "clazz");
        if (z10) {
            return f130534b.a(clazz);
        }
        g<? extends Object> gVarA = f130533a.a(clazz);
        if (gVarA != null) {
            return gVarA;
        }
        return null;
    }

    @dl.d
    public static final Object b(@dl.d kotlin.reflect.d<Object> clazz, @dl.d List<? extends kotlin.reflect.r> types, boolean z10) {
        f0.p(clazz, "clazz");
        f0.p(types, "types");
        return !z10 ? f130535c.a(clazz, types) : f130536d.a(clazz, types);
    }

    private static /* synthetic */ void c() {
    }

    private static /* synthetic */ void d() {
    }

    private static /* synthetic */ void e() {
    }

    private static /* synthetic */ void f() {
    }
}
