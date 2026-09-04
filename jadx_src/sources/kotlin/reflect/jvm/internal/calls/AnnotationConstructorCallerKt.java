package kotlin.reflect.jvm.internal.calls;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.b0;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.text.y;
import kotlin.z;
import yh.l;

/* JADX INFO: compiled from: AnnotationConstructorCaller.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class AnnotationConstructorCallerKt {
    @dl.d
    public static final <T> T d(@dl.d final Class<T> annotationClass, @dl.d final Map<String, ? extends Object> values, @dl.d List<Method> methods) {
        f0.p(annotationClass, "annotationClass");
        f0.p(values, "values");
        f0.p(methods, "methods");
        z zVarC = b0.c(new yh.a<Integer>() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$hashCode$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                int iHashCode;
                Iterator<T> it = values.entrySet().iterator();
                int iHashCode2 = 0;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof boolean[]) {
                        iHashCode = Arrays.hashCode((boolean[]) value);
                    } else if (value instanceof char[]) {
                        iHashCode = Arrays.hashCode((char[]) value);
                    } else if (value instanceof byte[]) {
                        iHashCode = Arrays.hashCode((byte[]) value);
                    } else if (value instanceof short[]) {
                        iHashCode = Arrays.hashCode((short[]) value);
                    } else if (value instanceof int[]) {
                        iHashCode = Arrays.hashCode((int[]) value);
                    } else if (value instanceof float[]) {
                        iHashCode = Arrays.hashCode((float[]) value);
                    } else if (value instanceof long[]) {
                        iHashCode = Arrays.hashCode((long[]) value);
                    } else if (value instanceof double[]) {
                        iHashCode = Arrays.hashCode((double[]) value);
                    } else {
                        iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                    }
                    iHashCode2 += iHashCode ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode2);
            }
        });
        T t10 = (T) Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new a(annotationClass, values, b0.c(new yh.a<String>() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() throws IOException {
                Class<T> cls = annotationClass;
                Map<String, Object> map = values;
                StringBuilder sb2 = new StringBuilder();
                sb2.append('@');
                sb2.append(cls.getCanonicalName());
                CollectionsKt___CollectionsKt.e3(map.entrySet(), sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : "(", (112 & 8) == 0 ? ")" : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : new l<Map.Entry<? extends String, ? extends Object>, CharSequence>() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1
                    @Override // yh.l
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final CharSequence invoke(@dl.d Map.Entry<String, ? extends Object> entry) {
                        String string;
                        f0.p(entry, "entry");
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof boolean[]) {
                            string = Arrays.toString((boolean[]) value);
                            f0.o(string, "toString(this)");
                        } else if (value instanceof char[]) {
                            string = Arrays.toString((char[]) value);
                            f0.o(string, "toString(this)");
                        } else if (value instanceof byte[]) {
                            string = Arrays.toString((byte[]) value);
                            f0.o(string, "toString(this)");
                        } else if (value instanceof short[]) {
                            string = Arrays.toString((short[]) value);
                            f0.o(string, "toString(this)");
                        } else if (value instanceof int[]) {
                            string = Arrays.toString((int[]) value);
                            f0.o(string, "toString(this)");
                        } else if (value instanceof float[]) {
                            string = Arrays.toString((float[]) value);
                            f0.o(string, "toString(this)");
                        } else if (value instanceof long[]) {
                            string = Arrays.toString((long[]) value);
                            f0.o(string, "toString(this)");
                        } else if (value instanceof double[]) {
                            string = Arrays.toString((double[]) value);
                            f0.o(string, "toString(this)");
                        } else if (value instanceof Object[]) {
                            string = Arrays.toString((Object[]) value);
                            f0.o(string, "toString(this)");
                        } else {
                            string = value.toString();
                        }
                        return key + n5.a.f132013h + string;
                    }
                });
                String string = sb2.toString();
                f0.o(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
        }), zVarC, methods));
        f0.n(t10, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return t10;
    }

    public static /* synthetic */ Object e(Class cls, Map map, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            Set setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList(t.Y(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), new Class[0]));
            }
            list = arrayList;
        }
        return d(cls, map, list);
    }

    private static final <T> boolean f(Class<T> cls, List<Method> list, Map<String, ? extends Object> map, Object obj) throws IllegalAccessException, InvocationTargetException {
        boolean zG;
        boolean z10;
        kotlin.reflect.d dVarA;
        Class clsE = null;
        Annotation annotation = obj instanceof Annotation ? (Annotation) obj : null;
        if (annotation != null && (dVarA = xh.a.a(annotation)) != null) {
            clsE = xh.a.e(dVarA);
        }
        if (f0.g(clsE, cls)) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = true;
                        break;
                    }
                    Method method = (Method) it.next();
                    Object obj2 = map.get(method.getName());
                    Object objInvoke = method.invoke(obj, new Object[0]);
                    if (obj2 instanceof boolean[]) {
                        f0.n(objInvoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                        zG = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                    } else if (obj2 instanceof char[]) {
                        f0.n(objInvoke, "null cannot be cast to non-null type kotlin.CharArray");
                        zG = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                    } else if (obj2 instanceof byte[]) {
                        f0.n(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                        zG = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                    } else if (obj2 instanceof short[]) {
                        f0.n(objInvoke, "null cannot be cast to non-null type kotlin.ShortArray");
                        zG = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                    } else if (obj2 instanceof int[]) {
                        f0.n(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                        zG = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                    } else if (obj2 instanceof float[]) {
                        f0.n(objInvoke, "null cannot be cast to non-null type kotlin.FloatArray");
                        zG = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                    } else if (obj2 instanceof long[]) {
                        f0.n(objInvoke, "null cannot be cast to non-null type kotlin.LongArray");
                        zG = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                    } else if (obj2 instanceof double[]) {
                        f0.n(objInvoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                        zG = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                    } else if (obj2 instanceof Object[]) {
                        f0.n(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                        zG = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                    } else {
                        zG = f0.g(obj2, objInvoke);
                    }
                    if (!zG) {
                        z10 = false;
                        break;
                    }
                }
            } else {
                z10 = true;
                break;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    private static final int g(z<Integer> zVar) {
        return zVar.getValue().intValue();
    }

    private static final String h(z<String> zVar) {
        return zVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(Class annotationClass, Map values, z toString$delegate, z hashCode$delegate, List methods, Object obj, Method method, Object[] args) {
        f0.p(annotationClass, "$annotationClass");
        f0.p(values, "$values");
        f0.p(toString$delegate, "$toString$delegate");
        f0.p(hashCode$delegate, "$hashCode$delegate");
        f0.p(methods, "$methods");
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return annotationClass;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(g(hashCode$delegate));
                }
            } else if (name.equals("toString")) {
                return h(toString$delegate);
            }
        }
        if (f0.g(name, "equals")) {
            if (args != null && args.length == 1) {
                f0.o(args, "args");
                return Boolean.valueOf(f(annotationClass, methods, values, ArraysKt___ArraysKt.Ht(args)));
            }
        }
        if (values.containsKey(name)) {
            return values.get(name);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Method is not supported: ");
        sb2.append(method);
        sb2.append(" (args: ");
        if (args == null) {
            args = new Object[0];
        }
        sb2.append(ArraysKt___ArraysKt.kz(args));
        sb2.append(')');
        throw new KotlinReflectionInternalError(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void j(int i10, String str, Class<?> cls) {
        kotlin.reflect.d dVarD;
        String strA;
        if (f0.g(cls, Class.class)) {
            dVarD = n0.d(kotlin.reflect.d.class);
        } else {
            dVarD = (cls.isArray() && f0.g(cls.getComponentType(), Class.class)) ? n0.d(kotlin.reflect.d[].class) : xh.a.i(cls);
        }
        if (f0.g(dVarD.A(), n0.d(Object[].class).A())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(dVarD.A());
            sb2.append(y.f128596e);
            Class<?> componentType = xh.a.e(dVarD).getComponentType();
            f0.o(componentType, "kotlinClass.java.componentType");
            sb2.append(xh.a.i(componentType).A());
            sb2.append(y.f128597f);
            strA = sb2.toString();
        } else {
            strA = dVarD.A();
        }
        throw new IllegalArgumentException("Argument #" + i10 + ' ' + str + " is not of the required type " + strA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object k(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof kotlin.reflect.d) {
            obj = xh.a.e((kotlin.reflect.d) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof kotlin.reflect.d[]) {
                f0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                kotlin.reflect.d[] dVarArr = (kotlin.reflect.d[]) obj;
                ArrayList arrayList = new ArrayList(dVarArr.length);
                for (kotlin.reflect.d dVar : dVarArr) {
                    arrayList.add(xh.a.e(dVar));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
