package kotlin.jvm.internal;

import com.meituan.robust.Constants;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.c1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KVisibility;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: ClassReference.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s implements kotlin.reflect.d<Object>, r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f124967c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final Map<Class<? extends kotlin.u<?>>, Integer> f124968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final HashMap<String, String> f124969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final HashMap<String, String> f124970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final HashMap<String, String> f124971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final Map<String, String> f124972h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Class<?> f124973b;

    /* JADX INFO: compiled from: ClassReference.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.e
        public final String a(@dl.d Class<?> jClass) {
            String str;
            f0.p(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String str3 = (String) s.f124971g.get(jClass.getName());
                return str3 == null ? jClass.getCanonicalName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) s.f124971g.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? kotlinx.serialization.internal.s.f130755a : str2;
        }

        @dl.e
        public final String b(@dl.d Class<?> jClass) {
            String str;
            f0.p(jClass, "jClass");
            String str2 = null;
            if (!jClass.isAnonymousClass()) {
                if (jClass.isLocalClass()) {
                    String name = jClass.getSimpleName();
                    Method enclosingMethod = jClass.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        f0.o(name, "name");
                        String strQ5 = StringsKt__StringsKt.q5(name, enclosingMethod.getName() + kotlin.text.y.f128594c, null, 2, null);
                        if (strQ5 != null) {
                            return strQ5;
                        }
                    }
                    Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
                    if (enclosingConstructor == null) {
                        f0.o(name, "name");
                        return StringsKt__StringsKt.p5(name, kotlin.text.y.f128594c, null, 2, null);
                    }
                    f0.o(name, "name");
                    return StringsKt__StringsKt.q5(name, enclosingConstructor.getName() + kotlin.text.y.f128594c, null, 2, null);
                }
                if (!jClass.isArray()) {
                    String str3 = (String) s.f124972h.get(jClass.getName());
                    return str3 == null ? jClass.getSimpleName() : str3;
                }
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) s.f124972h.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 == null) {
                    return "Array";
                }
            }
            return str2;
        }

        public final boolean c(@dl.e Object obj, @dl.d Class<?> jClass) {
            f0.p(jClass, "jClass");
            Map map = s.f124968d;
            f0.n(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return w0.B(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = xh.a.g(xh.a.i(jClass));
            }
            return jClass.isInstance(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i10 = 0;
        List listL = CollectionsKt__CollectionsKt.L(yh.a.class, yh.l.class, yh.p.class, yh.q.class, yh.r.class, yh.s.class, yh.t.class, yh.u.class, yh.v.class, yh.w.class, yh.b.class, yh.c.class, yh.d.class, yh.e.class, yh.f.class, yh.g.class, yh.h.class, yh.i.class, yh.j.class, yh.k.class, yh.m.class, yh.n.class, yh.o.class);
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listL, 10));
        for (Object obj : listL) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            arrayList.add(c1.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f124968d = kotlin.collections.s0.B0(arrayList);
        HashMap<String, String> map = new HashMap<>();
        map.put("boolean", "kotlin.Boolean");
        map.put(Constants.CHAR, "kotlin.Char");
        map.put(Constants.BYTE, "kotlin.Byte");
        map.put(Constants.SHORT, "kotlin.Short");
        map.put(Constants.INT, "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put(Constants.LONG, "kotlin.Long");
        map.put(Constants.DOUBLE, "kotlin.Double");
        f124969e = map;
        HashMap<String, String> map2 = new HashMap<>();
        map2.put(Constants.LANG_BOOLEAN, "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put(Constants.LANG_BYTE, "kotlin.Byte");
        map2.put(Constants.LANG_SHORT, "kotlin.Short");
        map2.put(Constants.LANG_INT, "kotlin.Int");
        map2.put(Constants.LANG_FLOAT, "kotlin.Float");
        map2.put(Constants.LANG_LONG, "kotlin.Long");
        map2.put(Constants.LANG_DOUBLE, "kotlin.Double");
        f124970f = map2;
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        f0.o(collectionValues, "primitiveFqNames.values");
        for (String kotlinName : collectionValues) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            f0.o(kotlinName, "kotlinName");
            sb2.append(StringsKt__StringsKt.t5(kotlinName, lg.a.f131414g, null, 2, null));
            sb2.append("CompanionObject");
            Pair pairA = c1.a(sb2.toString(), kotlinName + ".Companion");
            map3.put(pairA.e(), pairA.f());
        }
        for (Map.Entry<Class<? extends kotlin.u<?>>, Integer> entry : f124968d.entrySet()) {
            map3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f124971g = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.r0.j(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), StringsKt__StringsKt.t5((String) entry2.getValue(), lg.a.f131414g, null, 2, null));
        }
        f124972h = linkedHashMap;
    }

    public s(@dl.d Class<?> jClass) {
        f0.p(jClass, "jClass");
        this.f124973b = jClass;
    }

    @kotlin.u0(version = "1.1")
    public static /* synthetic */ void G() {
    }

    @kotlin.u0(version = "1.1")
    public static /* synthetic */ void H() {
    }

    @kotlin.u0(version = "1.1")
    public static /* synthetic */ void I() {
    }

    @kotlin.u0(version = "1.1")
    public static /* synthetic */ void J() {
    }

    @kotlin.u0(version = "1.1")
    public static /* synthetic */ void L() {
    }

    @kotlin.u0(version = "1.1")
    public static /* synthetic */ void M() {
    }

    @kotlin.u0(version = "1.1")
    public static /* synthetic */ void N() {
    }

    @kotlin.u0(version = "1.4")
    public static /* synthetic */ void O() {
    }

    @kotlin.u0(version = "1.1")
    public static /* synthetic */ void P() {
    }

    @kotlin.u0(version = "1.1")
    public static /* synthetic */ void Q() {
    }

    @kotlin.u0(version = "1.1")
    public static /* synthetic */ void R() {
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    public static /* synthetic */ void S() {
    }

    private final Void r() {
        throw new KotlinReflectionNotSupportedError();
    }

    @kotlin.u0(version = "1.3")
    public static /* synthetic */ void w() {
    }

    @Override // kotlin.reflect.d
    @dl.e
    public String A() {
        return f124967c.a(i());
    }

    @Override // kotlin.reflect.d
    @dl.d
    public Collection<kotlin.reflect.d<?>> C() {
        r();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    @dl.e
    public Object D() {
        r();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean E() {
        r();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    @dl.e
    public String F() {
        return f124967c.b(i());
    }

    @Override // kotlin.reflect.d
    public boolean equals(@dl.e Object obj) {
        return (obj instanceof s) && f0.g(xh.a.g(this), xh.a.g((kotlin.reflect.d) obj));
    }

    @Override // kotlin.reflect.b
    @dl.d
    public List<Annotation> getAnnotations() {
        r();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    @dl.d
    public List<kotlin.reflect.s> getTypeParameters() {
        r();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    @dl.e
    public KVisibility getVisibility() {
        r();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    @dl.d
    public Collection<kotlin.reflect.i<Object>> h() {
        r();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public int hashCode() {
        return xh.a.g(this).hashCode();
    }

    @Override // kotlin.jvm.internal.r
    @dl.d
    public Class<?> i() {
        return this.f124973b;
    }

    @Override // kotlin.reflect.d
    public boolean isAbstract() {
        r();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean isFinal() {
        r();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean isOpen() {
        r();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    @dl.d
    public List<kotlin.reflect.r> l() {
        r();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean m() {
        r();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    @dl.d
    public List<kotlin.reflect.d<? extends Object>> s() {
        r();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean t() {
        r();
        throw new KotlinNothingValueException();
    }

    @dl.d
    public String toString() {
        return i().toString() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.reflect.d
    @kotlin.u0(version = "1.1")
    public boolean u(@dl.e Object obj) {
        return f124967c.c(obj, i());
    }

    @Override // kotlin.reflect.d, kotlin.reflect.h
    @dl.d
    public Collection<kotlin.reflect.c<?>> v() {
        r();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean x() {
        r();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean y() {
        r();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean z() {
        r();
        throw new KotlinNothingValueException();
    }
}
