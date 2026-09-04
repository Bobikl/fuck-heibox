package xh;

import com.meituan.robust.Constants;
import java.lang.annotation.Annotation;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: JvmClassMapping.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "JvmClassMappingKt")
public final class a {
    @dl.d
    public static final <T extends Annotation> kotlin.reflect.d<? extends T> a(@dl.d T t10) {
        f0.p(t10, "<this>");
        Class<? extends Annotation> clsAnnotationType = t10.annotationType();
        f0.o(clsAnnotationType, "this as java.lang.annota…otation).annotationType()");
        kotlin.reflect.d<? extends T> dVarI = i(clsAnnotationType);
        f0.n(dVarI, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return dVarI;
    }

    private static final <E extends Enum<E>> Class<E> b(Enum<E> r10) {
        f0.p(r10, "<this>");
        Class<E> declaringClass = r10.getDeclaringClass();
        f0.o(declaringClass, "this as java.lang.Enum<E>).declaringClass");
        return declaringClass;
    }

    @u0(version = s0.f136932w)
    @sh.f
    public static /* synthetic */ void c(Enum r10) {
    }

    @dl.d
    public static final <T> Class<T> d(@dl.d T t10) {
        f0.p(t10, "<this>");
        Class<T> cls = (Class<T>) t10.getClass();
        f0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>");
        return cls;
    }

    @dl.d
    @h(name = "getJavaClass")
    public static final <T> Class<T> e(@dl.d kotlin.reflect.d<T> dVar) {
        f0.p(dVar, "<this>");
        Class<T> cls = (Class<T>) ((kotlin.jvm.internal.r) dVar).i();
        f0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    public static /* synthetic */ void f(kotlin.reflect.d dVar) {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @dl.d
    public static final <T> Class<T> g(@dl.d kotlin.reflect.d<T> dVar) {
        f0.p(dVar, "<this>");
        Class<T> cls = (Class<T>) ((kotlin.jvm.internal.r) dVar).i();
        if (!cls.isPrimitive()) {
            f0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals(Constants.DOUBLE)) {
                    cls = (Class<T>) Double.class;
                }
                break;
            case 104431:
                if (name.equals(Constants.INT)) {
                    cls = (Class<T>) Integer.class;
                }
                break;
            case 3039496:
                if (name.equals(Constants.BYTE)) {
                    cls = (Class<T>) Byte.class;
                }
                break;
            case 3052374:
                if (name.equals(Constants.CHAR)) {
                    cls = (Class<T>) Character.class;
                }
                break;
            case 3327612:
                if (name.equals(Constants.LONG)) {
                    cls = (Class<T>) Long.class;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    cls = (Class<T>) Void.class;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    cls = (Class<T>) Boolean.class;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    cls = (Class<T>) Float.class;
                }
                break;
            case 109413500:
                if (name.equals(Constants.SHORT)) {
                    cls = (Class<T>) Short.class;
                }
                break;
        }
        f0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return cls;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @dl.e
    public static final <T> Class<T> h(@dl.d kotlin.reflect.d<T> dVar) {
        f0.p(dVar, "<this>");
        Class<T> cls = (Class<T>) ((kotlin.jvm.internal.r) dVar).i();
        if (cls.isPrimitive()) {
            f0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals(Constants.LANG_INT)) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals(Constants.LANG_FLOAT)) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals(Constants.LANG_SHORT)) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals(Constants.LANG_BOOLEAN)) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals(Constants.LANG_BYTE)) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals(Constants.LANG_LONG)) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals(Constants.LANG_VOID)) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals(Constants.LANG_DOUBLE)) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    @dl.d
    @h(name = "getKotlinClass")
    public static final <T> kotlin.reflect.d<T> i(@dl.d Class<T> cls) {
        f0.p(cls, "<this>");
        return n0.d(cls);
    }

    @dl.d
    @h(name = "getRuntimeClassOfKClassInstance")
    public static final <T> Class<kotlin.reflect.d<T>> j(@dl.d kotlin.reflect.d<T> dVar) {
        f0.p(dVar, "<this>");
        Class<kotlin.reflect.d<T>> cls = (Class<kotlin.reflect.d<T>>) dVar.getClass();
        f0.n(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>");
        return cls;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @kotlin.s0(expression = "(this as Any).javaClass", imports = {}))
    public static /* synthetic */ void k(kotlin.reflect.d dVar) {
    }

    public static final /* synthetic */ boolean l(Object[] objArr) {
        f0.p(objArr, "<this>");
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        return Object.class.isAssignableFrom(objArr.getClass().getComponentType());
    }
}
