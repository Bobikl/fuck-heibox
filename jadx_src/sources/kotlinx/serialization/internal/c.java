package kotlinx.serialization.internal;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: AbstractPolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    @dl.d
    @xh.h(name = "throwSubtypeNotRegistered")
    public static final Void a(@dl.e String str, @dl.d kotlin.reflect.d<?> baseClass) {
        String str2;
        kotlin.jvm.internal.f0.p(baseClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + baseClass.F() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + lg.a.f131414g;
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.F() + "' has to be sealed and '@Serializable'.";
        }
        throw new SerializationException(str2);
    }

    @dl.d
    @xh.h(name = "throwSubtypeNotRegistered")
    public static final Void b(@dl.d kotlin.reflect.d<?> subClass, @dl.d kotlin.reflect.d<?> baseClass) {
        kotlin.jvm.internal.f0.p(subClass, "subClass");
        kotlin.jvm.internal.f0.p(baseClass, "baseClass");
        String strF = subClass.F();
        if (strF == null) {
            strF = String.valueOf(subClass);
        }
        a(strF, baseClass);
        throw new KotlinNothingValueException();
    }
}
