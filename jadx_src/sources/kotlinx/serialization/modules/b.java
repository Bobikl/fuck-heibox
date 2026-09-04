package kotlinx.serialization.modules;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.Pair;
import kotlin.c1;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.k;
import kotlin.r0;
import kotlin.s0;
import kotlinx.serialization.r;
import yh.l;

/* JADX INFO: compiled from: PolymorphicModuleBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
@t0({"SMAP\nPolymorphicModuleBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PolymorphicModuleBuilder.kt\nkotlinx/serialization/modules/PolymorphicModuleBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,119:1\n1855#2:120\n1856#2:122\n79#3:121\n*S KotlinDebug\n*F\n+ 1 PolymorphicModuleBuilder.kt\nkotlinx/serialization/modules/PolymorphicModuleBuilder\n*L\n88#1:120\n88#1:122\n92#1:121\n*E\n"})
public final class b<Base> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.d<Base> f130799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final kotlinx.serialization.g<Base> f130800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final List<Pair<kotlin.reflect.d<? extends Base>, kotlinx.serialization.g<? extends Base>>> f130801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private l<? super Base, ? extends r<? super Base>> f130802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private l<? super String, ? extends kotlinx.serialization.c<? extends Base>> f130803e;

    @r0
    public b(@dl.d kotlin.reflect.d<Base> baseClass, @dl.e kotlinx.serialization.g<Base> gVar) {
        f0.p(baseClass, "baseClass");
        this.f130799a = baseClass;
        this.f130800b = gVar;
        this.f130801c = new ArrayList();
    }

    public /* synthetic */ b(kotlin.reflect.d dVar, kotlinx.serialization.g gVar, int i10, u uVar) {
        this(dVar, (i10 & 2) != 0 ? null : gVar);
    }

    @r0
    public final void a(@dl.d f builder) {
        f0.p(builder, "builder");
        kotlinx.serialization.g<Base> gVar = this.f130800b;
        if (gVar != null) {
            kotlin.reflect.d<Base> dVar = this.f130799a;
            f.l(builder, dVar, dVar, gVar, false, 8, null);
        }
        Iterator<T> it = this.f130801c.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            kotlin.reflect.d dVar2 = (kotlin.reflect.d) pair.a();
            kotlinx.serialization.g gVar2 = (kotlinx.serialization.g) pair.b();
            kotlin.reflect.d<Base> dVar3 = this.f130799a;
            f0.n(dVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder.buildTo$lambda$1>");
            f0.n(gVar2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            f.l(builder, dVar3, dVar2, gVar2, false, 8, null);
        }
        l<? super Base, ? extends r<? super Base>> lVar = this.f130802d;
        if (lVar != null) {
            builder.j(this.f130799a, lVar, false);
        }
        l<? super String, ? extends kotlinx.serialization.c<? extends Base>> lVar2 = this.f130803e;
        if (lVar2 != null) {
            builder.i(this.f130799a, lVar2, false);
        }
    }

    @k(level = DeprecationLevel.WARNING, message = "Deprecated in favor of function with more precise name: defaultDeserializer", replaceWith = @s0(expression = "defaultDeserializer(defaultSerializerProvider)", imports = {}))
    public final void b(@dl.d l<? super String, ? extends kotlinx.serialization.c<? extends Base>> defaultSerializerProvider) {
        f0.p(defaultSerializerProvider, "defaultSerializerProvider");
        c(defaultSerializerProvider);
    }

    public final void c(@dl.d l<? super String, ? extends kotlinx.serialization.c<? extends Base>> defaultDeserializerProvider) {
        f0.p(defaultDeserializerProvider, "defaultDeserializerProvider");
        if (this.f130803e == null) {
            this.f130803e = defaultDeserializerProvider;
            return;
        }
        throw new IllegalArgumentException(("Default deserializer provider is already registered for class " + this.f130799a + ": " + this.f130803e).toString());
    }

    public final <T extends Base> void d(@dl.d kotlin.reflect.d<T> subclass, @dl.d kotlinx.serialization.g<T> serializer) {
        f0.p(subclass, "subclass");
        f0.p(serializer, "serializer");
        this.f130801c.add(c1.a(subclass, serializer));
    }
}
