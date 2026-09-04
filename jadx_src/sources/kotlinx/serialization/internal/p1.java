package kotlinx.serialization.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: Platform.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,174:1\n1#2:175\n3133#3,11:176\n1282#3,2:187\n3133#3,11:190\n3133#3,11:201\n26#4:189\n*S KotlinDebug\n*F\n+ 1 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n*L\n70#1:176,11\n78#1:187,2\n161#1:190,11\n166#1:201,11\n129#1:189\n*E\n"})
public final class p1 {
    private static final Object a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @dl.e
    public static final <T> kotlinx.serialization.g<T> b(@dl.d kotlin.reflect.d<T> dVar) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        return d(dVar, new kotlinx.serialization.g[0]);
    }

    @dl.e
    public static final <T> kotlinx.serialization.g<T> c(@dl.d Class<T> cls, @dl.d kotlinx.serialization.g<Object>... args) {
        kotlinx.serialization.g<T> gVarK;
        kotlin.jvm.internal.f0.p(cls, "<this>");
        kotlin.jvm.internal.f0.p(args, "args");
        if (cls.isEnum() && n(cls)) {
            return e(cls);
        }
        if (cls.isInterface() && (gVarK = k(cls)) != null) {
            return gVarK;
        }
        kotlinx.serialization.g<T> gVarM = m(cls, (kotlinx.serialization.g[]) Arrays.copyOf(args, args.length));
        if (gVarM != null) {
            return gVarM;
        }
        kotlinx.serialization.g<T> gVarH = h(cls);
        if (gVarH != null) {
            return gVarH;
        }
        kotlinx.serialization.g<T> gVarF = f(cls, (kotlinx.serialization.g[]) Arrays.copyOf(args, args.length));
        if (gVarF != null) {
            return gVarF;
        }
        if (o(cls)) {
            return new PolymorphicSerializer(xh.a.i(cls));
        }
        return null;
    }

    @dl.e
    public static final <T> kotlinx.serialization.g<T> d(@dl.d kotlin.reflect.d<T> dVar, @dl.d kotlinx.serialization.g<Object>... args) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        kotlin.jvm.internal.f0.p(args, "args");
        return c(xh.a.e(dVar), (kotlinx.serialization.g[]) Arrays.copyOf(args, args.length));
    }

    private static final <T> kotlinx.serialization.g<T> e(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        kotlin.jvm.internal.f0.o(canonicalName, "getCanonicalName(...)");
        kotlin.jvm.internal.f0.n(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new EnumSerializer(canonicalName, (Enum[]) enumConstants);
    }

    private static final <T> kotlinx.serialization.g<T> f(Class<T> cls, kotlinx.serialization.g<Object>... gVarArr) {
        Field field;
        kotlinx.serialization.g<T> gVarL;
        Object objG = g(cls);
        if (objG != null && (gVarL = l(objG, (kotlinx.serialization.g[]) Arrays.copyOf(gVarArr, gVarArr.length))) != null) {
            return gVarL;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            kotlin.jvm.internal.f0.o(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i10 = 0;
            Class<?> cls2 = null;
            boolean z10 = false;
            while (true) {
                if (i10 >= length) {
                    if (!z10) {
                        break;
                    }
                    break;
                }
                Class<?> cls3 = declaredClasses[i10];
                if (kotlin.jvm.internal.f0.g(cls3.getSimpleName(), "$serializer")) {
                    if (!z10) {
                        z10 = true;
                        cls2 = cls3;
                    }
                }
                i10++;
                cls2 = null;
                break;
            }
            Class<?> cls4 = cls2;
            Object obj = (cls4 == null || (field = cls4.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof kotlinx.serialization.g) {
                return (kotlinx.serialization.g) obj;
            }
            return null;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static final <T> Object g(Class<T> cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        kotlin.jvm.internal.f0.o(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i10];
            if (cls2.getAnnotation(g1.class) != null) {
                break;
            }
            i10++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        kotlin.jvm.internal.f0.o(simpleName, "getSimpleName(...)");
        return a(cls, simpleName);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ac  */
    private static final <T> kotlinx.serialization.g<T> h(Class<T> cls) throws IllegalAccessException, InvocationTargetException {
        boolean z10;
        boolean z11;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            z10 = false;
        } else {
            if (kotlin.text.u.v2(canonicalName, "java.", false, 2, null) || kotlin.text.u.v2(canonicalName, "kotlin.", false, 2, null)) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (!z10) {
            return null;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        kotlin.jvm.internal.f0.o(declaredFields, "getDeclaredFields(...)");
        int length = declaredFields.length;
        Field field = null;
        int i10 = 0;
        boolean z12 = false;
        while (true) {
            if (i10 >= length) {
                if (!z12) {
                    break;
                }
                break;
            }
            Field field2 = declaredFields[i10];
            if (kotlin.jvm.internal.f0.g(field2.getName(), "INSTANCE") && kotlin.jvm.internal.f0.g(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                if (!z12) {
                    z12 = true;
                    field = field2;
                }
            }
            i10++;
            field = null;
            break;
        }
        Field field3 = field;
        if (field3 == null) {
            return null;
        }
        Object obj = field3.get(null);
        Method[] methods = cls.getMethods();
        kotlin.jvm.internal.f0.o(methods, "getMethods(...)");
        int length2 = methods.length;
        Method method = null;
        int i11 = 0;
        boolean z13 = false;
        while (true) {
            if (i11 >= length2) {
                if (!z13) {
                    break;
                }
                break;
            }
            Method method2 = methods[i11];
            if (kotlin.jvm.internal.f0.g(method2.getName(), "serializer")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                kotlin.jvm.internal.f0.o(parameterTypes, "getParameterTypes(...)");
                if ((parameterTypes.length == 0) && kotlin.jvm.internal.f0.g(method2.getReturnType(), kotlinx.serialization.g.class)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            if (z11) {
                if (!z13) {
                    z13 = true;
                    method = method2;
                }
            }
            i11++;
            method = null;
            break;
        }
        Method method3 = method;
        if (method3 == null) {
            return null;
        }
        Object objInvoke = method3.invoke(obj, new Object[0]);
        if (objInvoke instanceof kotlinx.serialization.g) {
            return (kotlinx.serialization.g) objInvoke;
        }
        return null;
    }

    public static final <T> T i(@dl.d T[] tArr, int i10) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        return tArr[i10];
    }

    public static final boolean j(@dl.d boolean[] zArr, int i10) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return zArr[i10];
    }

    private static final <T> kotlinx.serialization.g<T> k(Class<T> cls) {
        kotlinx.serialization.q qVar = (kotlinx.serialization.q) cls.getAnnotation(kotlinx.serialization.q.class);
        if (qVar == null || kotlin.jvm.internal.f0.g(kotlin.jvm.internal.n0.d(qVar.with()), kotlin.jvm.internal.n0.d(PolymorphicSerializer.class))) {
            return new PolymorphicSerializer(xh.a.i(cls));
        }
        return null;
    }

    private static final <T> kotlinx.serialization.g<T> l(Object obj, kotlinx.serialization.g<Object>... gVarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (gVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = gVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i10 = 0; i10 < length; i10++) {
                    clsArr2[i10] = kotlinx.serialization.g.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(gVarArr, gVarArr.length));
            if (objInvoke instanceof kotlinx.serialization.g) {
                return (kotlinx.serialization.g) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                throw e10;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e10.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    private static final <T> kotlinx.serialization.g<T> m(Class<?> cls, kotlinx.serialization.g<Object>... gVarArr) {
        Object objA = a(cls, "Companion");
        if (objA == null) {
            return null;
        }
        return l(objA, (kotlinx.serialization.g[]) Arrays.copyOf(gVarArr, gVarArr.length));
    }

    private static final <T> boolean n(Class<T> cls) {
        return cls.getAnnotation(kotlinx.serialization.q.class) == null && cls.getAnnotation(kotlinx.serialization.j.class) == null;
    }

    private static final <T> boolean o(Class<T> cls) {
        if (cls.getAnnotation(kotlinx.serialization.j.class) != null) {
            return true;
        }
        kotlinx.serialization.q qVar = (kotlinx.serialization.q) cls.getAnnotation(kotlinx.serialization.q.class);
        return qVar != null && kotlin.jvm.internal.f0.g(kotlin.jvm.internal.n0.d(qVar.with()), kotlin.jvm.internal.n0.d(PolymorphicSerializer.class));
    }

    public static final boolean p(@dl.d kotlin.reflect.d<Object> rootClass) {
        kotlin.jvm.internal.f0.p(rootClass, "rootClass");
        return xh.a.e(rootClass).isArray();
    }

    @dl.d
    public static final Void q(@dl.d kotlin.reflect.d<?> dVar) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        q1.j(dVar);
        throw new KotlinNothingValueException();
    }

    @dl.d
    public static final Void r(@dl.d Class<?> cls) {
        kotlin.jvm.internal.f0.p(cls, "<this>");
        throw new SerializationException(q1.i(xh.a.i(cls)));
    }

    @dl.d
    public static final <T, E extends T> E[] s(@dl.d ArrayList<E> arrayList, @dl.d kotlin.reflect.d<T> eClass) {
        kotlin.jvm.internal.f0.p(arrayList, "<this>");
        kotlin.jvm.internal.f0.p(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) xh.a.e(eClass), arrayList.size());
        kotlin.jvm.internal.f0.n(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] eArr = (E[]) arrayList.toArray((Object[]) objNewInstance);
        kotlin.jvm.internal.f0.o(eArr, "toArray(...)");
        return eArr;
    }
}
