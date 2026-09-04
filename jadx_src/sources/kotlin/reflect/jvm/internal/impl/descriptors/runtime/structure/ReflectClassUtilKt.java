package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.meituan.robust.Constants;
import com.tencent.qcloud.core.util.IOUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.c1;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: reflectClassUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ReflectClassUtilKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final List<kotlin.reflect.d<? extends Object>> f125881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final Map<Class<? extends Object>, Class<? extends Object>> f125882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final Map<Class<? extends Object>, Class<? extends Object>> f125883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final Map<Class<? extends kotlin.u<?>>, Integer> f125884d;

    static {
        int i10 = 0;
        List<kotlin.reflect.d<? extends Object>> listL = CollectionsKt__CollectionsKt.L(n0.d(Boolean.TYPE), n0.d(Byte.TYPE), n0.d(Character.TYPE), n0.d(Double.TYPE), n0.d(Float.TYPE), n0.d(Integer.TYPE), n0.d(Long.TYPE), n0.d(Short.TYPE));
        f125881a = listL;
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listL, 10));
        Iterator<T> it = listL.iterator();
        while (it.hasNext()) {
            kotlin.reflect.d dVar = (kotlin.reflect.d) it.next();
            arrayList.add(c1.a(xh.a.g(dVar), xh.a.h(dVar)));
        }
        f125882b = s0.B0(arrayList);
        List<kotlin.reflect.d<? extends Object>> list = f125881a;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            kotlin.reflect.d dVar2 = (kotlin.reflect.d) it2.next();
            arrayList2.add(c1.a(xh.a.h(dVar2), xh.a.g(dVar2)));
        }
        f125883c = s0.B0(arrayList2);
        List listL2 = CollectionsKt__CollectionsKt.L(yh.a.class, yh.l.class, yh.p.class, yh.q.class, yh.r.class, yh.s.class, yh.t.class, yh.u.class, yh.v.class, yh.w.class, yh.b.class, yh.c.class, yh.d.class, yh.e.class, yh.f.class, yh.g.class, yh.h.class, yh.i.class, yh.j.class, yh.k.class, yh.m.class, yh.n.class, yh.o.class);
        ArrayList arrayList3 = new ArrayList(kotlin.collections.t.Y(listL2, 10));
        for (Object obj : listL2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            arrayList3.add(c1.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f125884d = s0.B0(arrayList3);
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.name.b a(@dl.d Class<?> cls) {
        kotlin.reflect.jvm.internal.impl.name.b bVarM;
        kotlin.reflect.jvm.internal.impl.name.b bVarA;
        f0.p(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            f0.o(simpleName, "simpleName");
            if (!(simpleName.length() == 0)) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass == null || (bVarA = a(declaringClass)) == null || (bVarM = bVarA.d(kotlin.reflect.jvm.internal.impl.name.f.f(cls.getSimpleName()))) == null) {
                    bVarM = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(cls.getName()));
                }
                f0.o(bVarM, "declaringClass?.classId?…Id.topLevel(FqName(name))");
                return bVarM;
            }
        }
        kotlin.reflect.jvm.internal.impl.name.c cVar = new kotlin.reflect.jvm.internal.impl.name.c(cls.getName());
        return new kotlin.reflect.jvm.internal.impl.name.b(cVar.e(), kotlin.reflect.jvm.internal.impl.name.c.k(cVar.g()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @dl.d
    public static final String b(@dl.d Class<?> cls) {
        f0.p(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                f0.o(name, "name");
                return kotlin.text.u.k2(name, lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX, false, 4, null);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Constants.OBJECT_TYPE);
            String name2 = cls.getName();
            f0.o(name2, "name");
            sb2.append(kotlin.text.u.k2(name2, lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX, false, 4, null));
            sb2.append(';');
            return sb2.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals(Constants.DOUBLE)) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals(Constants.INT)) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals(Constants.BYTE)) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals(Constants.CHAR)) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals(Constants.LONG)) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return androidx.exifinterface.media.a.X4;
                }
                break;
            case 64711720:
                if (name3.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name3.equals(Constants.SHORT)) {
                    return androidx.exifinterface.media.a.R4;
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    @dl.e
    public static final Integer c(@dl.d Class<?> cls) {
        f0.p(cls, "<this>");
        return f125884d.get(cls);
    }

    @dl.d
    public static final List<Type> d(@dl.d Type type) {
        f0.p(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return CollectionsKt__CollectionsKt.E();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return SequencesKt___SequencesKt.c3(SequencesKt___SequencesKt.H0(SequencesKt__SequencesKt.l(type, new yh.l<ParameterizedType, ParameterizedType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt$parameterizedTypeArguments$1
                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ParameterizedType invoke(@dl.d ParameterizedType it) {
                    f0.p(it, "it");
                    Type ownerType = it.getOwnerType();
                    if (ownerType instanceof ParameterizedType) {
                        return (ParameterizedType) ownerType;
                    }
                    return null;
                }
            }), new yh.l<ParameterizedType, kotlin.sequences.m<? extends Type>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt$parameterizedTypeArguments$2
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlin.sequences.m<Type> invoke(@dl.d ParameterizedType it) {
                    f0.p(it, "it");
                    Type[] actualTypeArguments = it.getActualTypeArguments();
                    f0.o(actualTypeArguments, "it.actualTypeArguments");
                    return ArraysKt___ArraysKt.l6(actualTypeArguments);
                }
            }));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        f0.o(actualTypeArguments, "actualTypeArguments");
        return ArraysKt___ArraysKt.kz(actualTypeArguments);
    }

    @dl.e
    public static final Class<?> e(@dl.d Class<?> cls) {
        f0.p(cls, "<this>");
        return f125882b.get(cls);
    }

    @dl.d
    public static final ClassLoader f(@dl.d Class<?> cls) {
        f0.p(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        f0.o(systemClassLoader, "getSystemClassLoader()");
        return systemClassLoader;
    }

    @dl.e
    public static final Class<?> g(@dl.d Class<?> cls) {
        f0.p(cls, "<this>");
        return f125883c.get(cls);
    }

    public static final boolean h(@dl.d Class<?> cls) {
        f0.p(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
