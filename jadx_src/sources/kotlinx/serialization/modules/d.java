package kotlinx.serialization.modules;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.w0;
import kotlinx.serialization.r;
import yh.l;

/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: classes5.dex */
@t0({"SMAP\nSerializersModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerialModuleImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,234:1\n215#2,2:235\n215#2:237\n215#2:238\n216#2:240\n216#2:241\n215#2,2:242\n215#2,2:244\n79#3:239\n*S KotlinDebug\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerialModuleImpl\n*L\n175#1:235,2\n185#1:237\n186#1:238\n186#1:240\n185#1:241\n195#1:242,2\n199#1:244,2\n190#1:239\n*E\n"})
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Map<kotlin.reflect.d<?>, a> f130804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    @xh.e
    public final Map<kotlin.reflect.d<?>, Map<kotlin.reflect.d<?>, kotlinx.serialization.g<?>>> f130805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Map<kotlin.reflect.d<?>, l<?, r<?>>> f130806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final Map<kotlin.reflect.d<?>, Map<String, kotlinx.serialization.g<?>>> f130807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final Map<kotlin.reflect.d<?>, l<String, kotlinx.serialization.c<?>>> f130808e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(@dl.d Map<kotlin.reflect.d<?>, ? extends a> class2ContextualFactory, @dl.d Map<kotlin.reflect.d<?>, ? extends Map<kotlin.reflect.d<?>, ? extends kotlinx.serialization.g<?>>> polyBase2Serializers, @dl.d Map<kotlin.reflect.d<?>, ? extends l<?, ? extends r<?>>> polyBase2DefaultSerializerProvider, @dl.d Map<kotlin.reflect.d<?>, ? extends Map<String, ? extends kotlinx.serialization.g<?>>> polyBase2NamedSerializers, @dl.d Map<kotlin.reflect.d<?>, ? extends l<? super String, ? extends kotlinx.serialization.c<?>>> polyBase2DefaultDeserializerProvider) {
        super(null);
        f0.p(class2ContextualFactory, "class2ContextualFactory");
        f0.p(polyBase2Serializers, "polyBase2Serializers");
        f0.p(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        f0.p(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        f0.p(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f130804a = class2ContextualFactory;
        this.f130805b = polyBase2Serializers;
        this.f130806c = polyBase2DefaultSerializerProvider;
        this.f130807d = polyBase2NamedSerializers;
        this.f130808e = polyBase2DefaultDeserializerProvider;
    }

    @Override // kotlinx.serialization.modules.e
    public void a(@dl.d SerializersModuleCollector collector) {
        f0.p(collector, "collector");
        for (Map.Entry<kotlin.reflect.d<?>, a> entry : this.f130804a.entrySet()) {
            kotlin.reflect.d<?> key = entry.getKey();
            a value = entry.getValue();
            if (value instanceof a.C1195a) {
                f0.n(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                kotlinx.serialization.g<?> gVarB = ((a.C1195a) value).b();
                f0.n(gVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.e(key, gVarB);
            } else if (value instanceof a.b) {
                collector.d(key, ((a.b) value).b());
            }
        }
        for (Map.Entry<kotlin.reflect.d<?>, Map<kotlin.reflect.d<?>, kotlinx.serialization.g<?>>> entry2 : this.f130805b.entrySet()) {
            kotlin.reflect.d<?> key2 = entry2.getKey();
            for (Map.Entry<kotlin.reflect.d<?>, kotlinx.serialization.g<?>> entry3 : entry2.getValue().entrySet()) {
                kotlin.reflect.d<?> key3 = entry3.getKey();
                kotlinx.serialization.g<?> value2 = entry3.getValue();
                f0.n(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                f0.n(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                f0.n(value2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.b(key2, key3, value2);
            }
        }
        for (Map.Entry<kotlin.reflect.d<?>, l<?, r<?>>> entry4 : this.f130806c.entrySet()) {
            kotlin.reflect.d<?> key4 = entry4.getKey();
            l<?, r<?>> value3 = entry4.getValue();
            f0.n(key4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            f0.n(value3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            collector.c(key4, (l) w0.q(value3, 1));
        }
        for (Map.Entry<kotlin.reflect.d<?>, l<String, kotlinx.serialization.c<?>>> entry5 : this.f130808e.entrySet()) {
            kotlin.reflect.d<?> key5 = entry5.getKey();
            l<String, kotlinx.serialization.c<?>> value4 = entry5.getValue();
            f0.n(key5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            f0.n(value4, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            collector.f(key5, (l) w0.q(value4, 1));
        }
    }

    @Override // kotlinx.serialization.modules.e
    @dl.e
    public <T> kotlinx.serialization.g<T> c(@dl.d kotlin.reflect.d<T> kClass, @dl.d List<? extends kotlinx.serialization.g<?>> typeArgumentsSerializers) {
        f0.p(kClass, "kClass");
        f0.p(typeArgumentsSerializers, "typeArgumentsSerializers");
        a aVar = this.f130804a.get(kClass);
        kotlinx.serialization.g<?> gVarA = aVar != null ? aVar.a(typeArgumentsSerializers) : null;
        if (gVarA instanceof kotlinx.serialization.g) {
            return (kotlinx.serialization.g<T>) gVarA;
        }
        return null;
    }

    @Override // kotlinx.serialization.modules.e
    @dl.e
    public <T> kotlinx.serialization.c<T> e(@dl.d kotlin.reflect.d<? super T> baseClass, @dl.e String str) {
        f0.p(baseClass, "baseClass");
        Map<String, kotlinx.serialization.g<?>> map = this.f130807d.get(baseClass);
        kotlinx.serialization.g<?> gVar = map != null ? map.get(str) : null;
        if (!(gVar instanceof kotlinx.serialization.g)) {
            gVar = null;
        }
        if (gVar != null) {
            return gVar;
        }
        l<String, kotlinx.serialization.c<?>> lVar = this.f130808e.get(baseClass);
        l<String, kotlinx.serialization.c<?>> lVar2 = w0.B(lVar, 1) ? lVar : null;
        if (lVar2 != null) {
            return (kotlinx.serialization.c) lVar2.invoke(str);
        }
        return null;
    }

    @Override // kotlinx.serialization.modules.e
    @dl.e
    public <T> r<T> f(@dl.d kotlin.reflect.d<? super T> baseClass, @dl.d T value) {
        f0.p(baseClass, "baseClass");
        f0.p(value, "value");
        if (!baseClass.u(value)) {
            return null;
        }
        Map<kotlin.reflect.d<?>, kotlinx.serialization.g<?>> map = this.f130805b.get(baseClass);
        kotlinx.serialization.g<?> gVar = map != null ? map.get(n0.d(value.getClass())) : null;
        if (!(gVar instanceof r)) {
            gVar = null;
        }
        if (gVar != null) {
            return gVar;
        }
        l<?, r<?>> lVar = this.f130806c.get(baseClass);
        l<?, r<?>> lVar2 = w0.B(lVar, 1) ? lVar : null;
        if (lVar2 != null) {
            return (r) lVar2.invoke(value);
        }
        return null;
    }
}
