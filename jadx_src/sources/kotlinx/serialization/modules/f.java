package kotlinx.serialization.modules;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.DeprecationLevel;
import kotlin.collections.u0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.k;
import kotlin.r0;
import kotlin.s0;
import kotlinx.serialization.r;
import xh.h;
import yh.l;

/* JADX INFO: compiled from: SerializersModuleBuilders.kt */
/* JADX INFO: loaded from: classes5.dex */
@t0({"SMAP\nSerializersModuleBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuilder\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,270:1\n372#2,7:271\n372#2,7:278\n1#3:285\n*S KotlinDebug\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuilder\n*L\n195#1:271,7\n197#1:278,7\n*E\n"})
public final class f implements SerializersModuleCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Map<kotlin.reflect.d<?>, a> f130809a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Map<kotlin.reflect.d<?>, Map<kotlin.reflect.d<?>, kotlinx.serialization.g<?>>> f130810b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Map<kotlin.reflect.d<?>, l<?, r<?>>> f130811c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final Map<kotlin.reflect.d<?>, Map<String, kotlinx.serialization.g<?>>> f130812d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final Map<kotlin.reflect.d<?>, l<String, kotlinx.serialization.c<?>>> f130813e = new HashMap();

    @r0
    public f() {
    }

    public static /* synthetic */ void l(f fVar, kotlin.reflect.d dVar, kotlin.reflect.d dVar2, kotlinx.serialization.g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        fVar.k(dVar, dVar2, gVar, z10);
    }

    public static /* synthetic */ void n(f fVar, kotlin.reflect.d dVar, a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        fVar.m(dVar, aVar, z10);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    @k(level = DeprecationLevel.WARNING, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @s0(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
    public <Base> void a(@dl.d kotlin.reflect.d<Base> dVar, @dl.d l<? super String, ? extends kotlinx.serialization.c<? extends Base>> lVar) {
        SerializersModuleCollector.DefaultImpls.b(this, dVar, lVar);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base, Sub extends Base> void b(@dl.d kotlin.reflect.d<Base> baseClass, @dl.d kotlin.reflect.d<Sub> actualClass, @dl.d kotlinx.serialization.g<Sub> actualSerializer) {
        f0.p(baseClass, "baseClass");
        f0.p(actualClass, "actualClass");
        f0.p(actualSerializer, "actualSerializer");
        l(this, baseClass, actualClass, actualSerializer, false, 8, null);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base> void c(@dl.d kotlin.reflect.d<Base> baseClass, @dl.d l<? super Base, ? extends r<? super Base>> defaultSerializerProvider) {
        f0.p(baseClass, "baseClass");
        f0.p(defaultSerializerProvider, "defaultSerializerProvider");
        j(baseClass, defaultSerializerProvider, false);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void d(@dl.d kotlin.reflect.d<T> kClass, @dl.d l<? super List<? extends kotlinx.serialization.g<?>>, ? extends kotlinx.serialization.g<?>> provider) {
        f0.p(kClass, "kClass");
        f0.p(provider, "provider");
        n(this, kClass, new a.b(provider), false, 4, null);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void e(@dl.d kotlin.reflect.d<T> kClass, @dl.d kotlinx.serialization.g<T> serializer) {
        f0.p(kClass, "kClass");
        f0.p(serializer, "serializer");
        n(this, kClass, new a.C1195a(serializer), false, 4, null);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base> void f(@dl.d kotlin.reflect.d<Base> baseClass, @dl.d l<? super String, ? extends kotlinx.serialization.c<? extends Base>> defaultDeserializerProvider) {
        f0.p(baseClass, "baseClass");
        f0.p(defaultDeserializerProvider, "defaultDeserializerProvider");
        i(baseClass, defaultDeserializerProvider, false);
    }

    @dl.d
    @r0
    public final e g() {
        return new d(this.f130809a, this.f130810b, this.f130811c, this.f130812d, this.f130813e);
    }

    public final void h(@dl.d e module) {
        f0.p(module, "module");
        module.a(this);
    }

    @h(name = "registerDefaultPolymorphicDeserializer")
    public final <Base> void i(@dl.d kotlin.reflect.d<Base> baseClass, @dl.d l<? super String, ? extends kotlinx.serialization.c<? extends Base>> defaultDeserializerProvider, boolean z10) {
        f0.p(baseClass, "baseClass");
        f0.p(defaultDeserializerProvider, "defaultDeserializerProvider");
        l<String, kotlinx.serialization.c<?>> lVar = this.f130813e.get(baseClass);
        if (lVar == null || f0.g(lVar, defaultDeserializerProvider) || z10) {
            this.f130813e.put(baseClass, defaultDeserializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + baseClass + " is already registered: " + lVar);
    }

    @h(name = "registerDefaultPolymorphicSerializer")
    public final <Base> void j(@dl.d kotlin.reflect.d<Base> baseClass, @dl.d l<? super Base, ? extends r<? super Base>> defaultSerializerProvider, boolean z10) {
        f0.p(baseClass, "baseClass");
        f0.p(defaultSerializerProvider, "defaultSerializerProvider");
        l<?, r<?>> lVar = this.f130811c.get(baseClass);
        if (lVar == null || f0.g(lVar, defaultSerializerProvider) || z10) {
            this.f130811c.put(baseClass, defaultSerializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + baseClass + " is already registered: " + lVar);
    }

    @h(name = "registerPolymorphicSerializer")
    public final <Base, Sub extends Base> void k(@dl.d kotlin.reflect.d<Base> baseClass, @dl.d kotlin.reflect.d<Sub> concreteClass, @dl.d kotlinx.serialization.g<Sub> concreteSerializer, boolean z10) {
        f0.p(baseClass, "baseClass");
        f0.p(concreteClass, "concreteClass");
        f0.p(concreteSerializer, "concreteSerializer");
        String strJ = concreteSerializer.a().j();
        Map<kotlin.reflect.d<?>, Map<kotlin.reflect.d<?>, kotlinx.serialization.g<?>>> map = this.f130810b;
        Map<kotlin.reflect.d<?>, kotlinx.serialization.g<?>> map2 = map.get(baseClass);
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put(baseClass, map2);
        }
        Map<kotlin.reflect.d<?>, kotlinx.serialization.g<?>> map3 = map2;
        kotlinx.serialization.g<?> gVar = map3.get(concreteClass);
        Map<kotlin.reflect.d<?>, Map<String, kotlinx.serialization.g<?>>> map4 = this.f130812d;
        Map<String, kotlinx.serialization.g<?>> map5 = map4.get(baseClass);
        if (map5 == null) {
            map5 = new HashMap<>();
            map4.put(baseClass, map5);
        }
        Map<String, kotlinx.serialization.g<?>> map6 = map5;
        if (z10) {
            if (gVar != null) {
                map6.remove(gVar.a().j());
            }
            map3.put(concreteClass, concreteSerializer);
            map6.put(strJ, concreteSerializer);
            return;
        }
        if (gVar != null) {
            if (!f0.g(gVar, concreteSerializer)) {
                throw new SerializerAlreadyRegisteredException(baseClass, concreteClass);
            }
            map6.remove(gVar.a().j());
        }
        kotlinx.serialization.g<?> gVar2 = map6.get(strJ);
        if (gVar2 == null) {
            map3.put(concreteClass, concreteSerializer);
            map6.put(strJ, concreteSerializer);
            return;
        }
        Map<kotlin.reflect.d<?>, kotlinx.serialization.g<?>> map7 = this.f130810b.get(baseClass);
        f0.m(map7);
        for (Object obj : u0.T0(map7)) {
            if (((Map.Entry) obj).getValue() == gVar2) {
                throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + baseClass + "' have the same serial name '" + strJ + "': '" + concreteClass + "' and '" + ((Map.Entry) obj) + '\'');
            }
        }
        obj = null;
        throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + baseClass + "' have the same serial name '" + strJ + "': '" + concreteClass + "' and '" + ((Map.Entry) obj) + '\'');
    }

    @h(name = "registerSerializer")
    public final <T> void m(@dl.d kotlin.reflect.d<T> forClass, @dl.d a provider, boolean z10) {
        a aVar;
        f0.p(forClass, "forClass");
        f0.p(provider, "provider");
        if (z10 || (aVar = this.f130809a.get(forClass)) == null || f0.g(aVar, provider)) {
            this.f130809a.put(forClass, provider);
            return;
        }
        throw new SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
    }
}
