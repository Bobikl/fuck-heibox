package ii;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: compiled from: ReflectKotlinClass.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final m f119389a = new m();

    private m() {
    }

    @dl.d
    public final String a(@dl.d Constructor<?> constructor) {
        f0.p(constructor, "constructor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        f0.o(parameterTypes, "constructor.parameterTypes");
        for (Class<?> parameterType : parameterTypes) {
            f0.o(parameterType, "parameterType");
            sb2.append(ReflectClassUtilKt.b(parameterType));
        }
        sb2.append(")V");
        String string = sb2.toString();
        f0.o(string, "sb.toString()");
        return string;
    }

    @dl.d
    public final String b(@dl.d Field field) {
        f0.p(field, "field");
        Class<?> type = field.getType();
        f0.o(type, "field.type");
        return ReflectClassUtilKt.b(type);
    }

    @dl.d
    public final String c(@dl.d Method method) {
        f0.p(method, "method");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        f0.o(parameterTypes, "method.parameterTypes");
        for (Class<?> parameterType : parameterTypes) {
            f0.o(parameterType, "parameterType");
            sb2.append(ReflectClassUtilKt.b(parameterType));
        }
        sb2.append(")");
        Class<?> returnType = method.getReturnType();
        f0.o(returnType, "method.returnType");
        sb2.append(ReflectClassUtilKt.b(returnType));
        String string = sb2.toString();
        f0.o(string, "sb.toString()");
        return string;
    }
}
