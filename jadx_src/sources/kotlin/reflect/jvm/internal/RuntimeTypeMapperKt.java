package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: compiled from: RuntimeTypeMapper.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class RuntimeTypeMapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        f0.o(parameterTypes, "parameterTypes");
        sb2.append(ArraysKt___ArraysKt.Mh(parameterTypes, "", "(", ")", 0, null, new yh.l<Class<?>, CharSequence>() { // from class: kotlin.reflect.jvm.internal.RuntimeTypeMapperKt$signature$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(Class<?> it) {
                f0.o(it, "it");
                return ReflectClassUtilKt.b(it);
            }
        }, 24, null));
        Class<?> returnType = method.getReturnType();
        f0.o(returnType, "returnType");
        sb2.append(ReflectClassUtilKt.b(returnType));
        return sb2.toString();
    }
}
