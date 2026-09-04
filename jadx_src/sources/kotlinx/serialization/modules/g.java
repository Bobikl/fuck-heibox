package kotlinx.serialization.modules;

import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.k;
import kotlinx.serialization.r;
import yh.l;

/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: classes5.dex */
@t0({"SMAP\nSerializersModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerializersModuleKt\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,234:1\n31#2,3:235\n31#2,3:238\n*S KotlinDebug\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerializersModuleKt\n*L\n87#1:235,3\n99#1:238,3\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final e f130814a = new d(s0.z(), s0.z(), s0.z(), s0.z(), s0.z());

    /* JADX INFO: compiled from: SerializersModule.kt */
    public static final class a implements SerializersModuleCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f130815a;

        a(f fVar) {
            this.f130815a = fVar;
        }

        @Override // kotlinx.serialization.modules.SerializersModuleCollector
        @k(level = DeprecationLevel.WARNING, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @kotlin.s0(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
        public <Base> void a(@dl.d kotlin.reflect.d<Base> dVar, @dl.d l<? super String, ? extends kotlinx.serialization.c<? extends Base>> lVar) {
            SerializersModuleCollector.DefaultImpls.b(this, dVar, lVar);
        }

        @Override // kotlinx.serialization.modules.SerializersModuleCollector
        public <Base, Sub extends Base> void b(@dl.d kotlin.reflect.d<Base> baseClass, @dl.d kotlin.reflect.d<Sub> actualClass, @dl.d kotlinx.serialization.g<Sub> actualSerializer) {
            f0.p(baseClass, "baseClass");
            f0.p(actualClass, "actualClass");
            f0.p(actualSerializer, "actualSerializer");
            this.f130815a.k(baseClass, actualClass, actualSerializer, true);
        }

        @Override // kotlinx.serialization.modules.SerializersModuleCollector
        public <Base> void c(@dl.d kotlin.reflect.d<Base> baseClass, @dl.d l<? super Base, ? extends r<? super Base>> defaultSerializerProvider) {
            f0.p(baseClass, "baseClass");
            f0.p(defaultSerializerProvider, "defaultSerializerProvider");
            this.f130815a.j(baseClass, defaultSerializerProvider, true);
        }

        @Override // kotlinx.serialization.modules.SerializersModuleCollector
        public <T> void d(@dl.d kotlin.reflect.d<T> kClass, @dl.d l<? super List<? extends kotlinx.serialization.g<?>>, ? extends kotlinx.serialization.g<?>> provider) {
            f0.p(kClass, "kClass");
            f0.p(provider, "provider");
            this.f130815a.m(kClass, new kotlinx.serialization.modules.a.b(provider), true);
        }

        @Override // kotlinx.serialization.modules.SerializersModuleCollector
        public <T> void e(@dl.d kotlin.reflect.d<T> kClass, @dl.d kotlinx.serialization.g<T> serializer) {
            f0.p(kClass, "kClass");
            f0.p(serializer, "serializer");
            this.f130815a.m(kClass, new kotlinx.serialization.modules.a.C1195a(serializer), true);
        }

        @Override // kotlinx.serialization.modules.SerializersModuleCollector
        public <Base> void f(@dl.d kotlin.reflect.d<Base> baseClass, @dl.d l<? super String, ? extends kotlinx.serialization.c<? extends Base>> defaultDeserializerProvider) {
            f0.p(baseClass, "baseClass");
            f0.p(defaultDeserializerProvider, "defaultDeserializerProvider");
            this.f130815a.i(baseClass, defaultDeserializerProvider, true);
        }
    }

    @dl.d
    public static final e a() {
        return f130814a;
    }

    @k(level = DeprecationLevel.WARNING, message = "Deprecated in the favour of 'EmptySerializersModule()'", replaceWith = @kotlin.s0(expression = "EmptySerializersModule()", imports = {}))
    public static /* synthetic */ void b() {
    }

    @dl.d
    public static final e c(@dl.d e eVar, @dl.d e other) {
        f0.p(eVar, "<this>");
        f0.p(other, "other");
        f fVar = new f();
        fVar.h(eVar);
        other.a(new a(fVar));
        return fVar.g();
    }

    @dl.d
    public static final e d(@dl.d e eVar, @dl.d e other) {
        f0.p(eVar, "<this>");
        f0.p(other, "other");
        f fVar = new f();
        fVar.h(eVar);
        fVar.h(other);
        return fVar.g();
    }
}
