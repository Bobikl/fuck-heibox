package kotlinx.serialization.modules;

import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.f0;
import kotlin.k;
import kotlin.s0;
import kotlinx.serialization.r;
import yh.l;

/* JADX INFO: compiled from: SerializersModuleCollector.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlinx.serialization.d
public interface SerializersModuleCollector {

    /* JADX INFO: compiled from: SerializersModuleCollector.kt */
    public static final class DefaultImpls {
        public static <T> void a(@dl.d SerializersModuleCollector serializersModuleCollector, @dl.d kotlin.reflect.d<T> kClass, @dl.d final kotlinx.serialization.g<T> serializer) {
            f0.p(kClass, "kClass");
            f0.p(serializer, "serializer");
            serializersModuleCollector.d(kClass, new l<List<? extends kotlinx.serialization.g<?>>, kotlinx.serialization.g<?>>() { // from class: kotlinx.serialization.modules.SerializersModuleCollector$contextual$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.g<?> invoke(@dl.d List<? extends kotlinx.serialization.g<?>> it) {
                    f0.p(it, "it");
                    return serializer;
                }
            });
        }

        @k(level = DeprecationLevel.WARNING, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @s0(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
        public static <Base> void b(@dl.d SerializersModuleCollector serializersModuleCollector, @dl.d kotlin.reflect.d<Base> baseClass, @dl.d l<? super String, ? extends kotlinx.serialization.c<? extends Base>> defaultDeserializerProvider) {
            f0.p(baseClass, "baseClass");
            f0.p(defaultDeserializerProvider, "defaultDeserializerProvider");
            serializersModuleCollector.f(baseClass, defaultDeserializerProvider);
        }
    }

    @k(level = DeprecationLevel.WARNING, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @s0(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
    <Base> void a(@dl.d kotlin.reflect.d<Base> dVar, @dl.d l<? super String, ? extends kotlinx.serialization.c<? extends Base>> lVar);

    <Base, Sub extends Base> void b(@dl.d kotlin.reflect.d<Base> dVar, @dl.d kotlin.reflect.d<Sub> dVar2, @dl.d kotlinx.serialization.g<Sub> gVar);

    <Base> void c(@dl.d kotlin.reflect.d<Base> dVar, @dl.d l<? super Base, ? extends r<? super Base>> lVar);

    <T> void d(@dl.d kotlin.reflect.d<T> dVar, @dl.d l<? super List<? extends kotlinx.serialization.g<?>>, ? extends kotlinx.serialization.g<?>> lVar);

    <T> void e(@dl.d kotlin.reflect.d<T> dVar, @dl.d kotlinx.serialization.g<T> gVar);

    <Base> void f(@dl.d kotlin.reflect.d<Base> dVar, @dl.d l<? super String, ? extends kotlinx.serialization.c<? extends Base>> lVar);
}
