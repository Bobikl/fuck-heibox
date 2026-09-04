package kotlin.reflect.jvm.internal;

import com.tencent.qcloud.core.util.IOUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class KDeclarationContainerImpl implements kotlin.jvm.internal.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f125156b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class<?> f125157c = u.class;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final Regex f125158d = new Regex("<v#(\\d+)>");

    /* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
    public abstract class Data {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.n<Object>[] f125159c = {n0.u(new PropertyReference1Impl(n0.d(Data.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final n.a f125160a;

        public Data() {
            this.f125160a = n.d(new yh.a<ii.k>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$Data$moduleData$2
                {
                    super(0);
                }

                @Override // yh.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ii.k invoke() {
                    return m.b(kDeclarationContainerImpl.i());
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        @dl.d
        public final ii.k a() {
            T tB = this.f125160a.b(this, f125159c[0]);
            f0.o(tB, "<get-moduleData>(...)");
            return (ii.k) tB;
        }
    }

    /* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
    public enum MemberBelonginess {
        DECLARED,
        INHERITED;

        public final boolean accept(@dl.d CallableMemberDescriptor member) {
            f0.p(member, "member");
            return member.b().isReal() == (this == DECLARED);
        }
    }

    /* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Regex a() {
            return KDeclarationContainerImpl.f125158d;
        }
    }

    /* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
    public static final class b extends e {
        b(KDeclarationContainerImpl kDeclarationContainerImpl) {
            super(kDeclarationContainerImpl);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.m
        @dl.d
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public KCallableImpl<?> f(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.j descriptor, @dl.d b2 data) {
            f0.p(descriptor, "descriptor");
            f0.p(data, "data");
            throw new IllegalStateException("No constructors should appear here: " + descriptor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int M(yh.p tmp0, Object obj, Object obj2) {
        f0.p(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    private final List<Class<?>> T(String str) {
        int iR3;
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        while (str.charAt(i10) != ')') {
            int i11 = i10;
            while (str.charAt(i11) == '[') {
                i11++;
            }
            char cCharAt = str.charAt(i11);
            if (StringsKt__StringsKt.V2("VZCBSIFJD", cCharAt, false, 2, null)) {
                iR3 = i11 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: " + str);
                }
                iR3 = StringsKt__StringsKt.r3(str, ';', i10, false, 4, null) + 1;
            }
            arrayList.add(X(str, i10, iR3));
            i10 = iR3;
        }
        return arrayList;
    }

    private final Class<?> V(String str) {
        return X(str, StringsKt__StringsKt.r3(str, ')', 0, false, 6, null) + 1, str.length());
    }

    private final Method W(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z10) {
        Method methodW;
        if (z10) {
            clsArr[0] = cls;
        }
        Method methodA0 = a0(cls, str, clsArr, cls2);
        if (methodA0 != null) {
            return methodA0;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && (methodW = W(superclass, str, clsArr, cls2, z10)) != null) {
            return methodW;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        f0.o(interfaces, "interfaces");
        for (Class<?> superInterface : interfaces) {
            f0.o(superInterface, "superInterface");
            Method methodW2 = W(superInterface, str, clsArr, cls2, z10);
            if (methodW2 != null) {
                return methodW2;
            }
            if (z10) {
                Class<?> clsA = ii.e.a(ReflectClassUtilKt.f(superInterface), superInterface.getName() + "$DefaultImpls");
                if (clsA != null) {
                    clsArr[0] = superInterface;
                    Method methodA1 = a0(clsA, str, clsArr, cls2);
                    if (methodA1 != null) {
                        return methodA1;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private final Class<?> X(String str, int i10, int i11) throws ClassNotFoundException {
        char cCharAt = str.charAt(i10);
        if (cCharAt == 'L') {
            ClassLoader classLoaderF = ReflectClassUtilKt.f(i());
            String strSubstring = str.substring(i10 + 1, i11 - 1);
            f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Class<?> clsLoadClass = classLoaderF.loadClass(kotlin.text.u.k2(strSubstring, IOUtils.DIR_SEPARATOR_UNIX, lg.a.f131414g, false, 4, null));
            f0.o(clsLoadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
            return clsLoadClass;
        }
        if (cCharAt == '[') {
            return s.f(X(str, i10 + 1, i11));
        }
        if (cCharAt == 'V') {
            Class<?> TYPE = Void.TYPE;
            f0.o(TYPE, "TYPE");
            return TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == 'C') {
            return Character.TYPE;
        }
        if (cCharAt == 'B') {
            return Byte.TYPE;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'D') {
            return Double.TYPE;
        }
        throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: " + str);
    }

    private final Constructor<?> Z(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final Method a0(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (f0.g(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            f0.o(declaredMethods, "declaredMethods");
            for (Method method : declaredMethods) {
                if (f0.g(method.getName(), str) && f0.g(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final void r(List<Class<?>> list, String str, boolean z10) {
        List<Class<?>> listT = T(str);
        list.addAll(listT);
        int size = ((listT.size() + 32) - 1) / 32;
        for (int i10 = 0; i10 < size; i10++) {
            Class<?> TYPE = Integer.TYPE;
            f0.o(TYPE, "TYPE");
            list.add(TYPE);
        }
        if (!z10) {
            list.add(Object.class);
            return;
        }
        Class<?> DEFAULT_CONSTRUCTOR_MARKER = f125157c;
        list.remove(DEFAULT_CONSTRUCTOR_MARKER);
        f0.o(DEFAULT_CONSTRUCTOR_MARKER, "DEFAULT_CONSTRUCTOR_MARKER");
        list.add(DEFAULT_CONSTRUCTOR_MARKER);
    }

    @dl.e
    public final Constructor<?> G(@dl.d String desc) {
        f0.p(desc, "desc");
        Class<?> clsI = i();
        ArrayList arrayList = new ArrayList();
        r(arrayList, desc, true);
        b2 b2Var = b2.f124493a;
        return Z(clsI, arrayList);
    }

    @dl.e
    public final Method H(@dl.d String name, @dl.d String desc, boolean z10) {
        f0.p(name, "name");
        f0.p(desc, "desc");
        if (f0.g(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z10) {
            arrayList.add(i());
        }
        r(arrayList, desc, false);
        return W(R(), name + "$default", (Class[]) arrayList.toArray(new Class[0]), V(desc), z10);
    }

    @dl.d
    public final w I(@dl.d String name, @dl.d String signature) {
        Collection<w> collectionO;
        f0.p(name, "name");
        f0.p(signature, "signature");
        if (f0.g(name, "<init>")) {
            collectionO = CollectionsKt___CollectionsKt.Q5(N());
        } else {
            kotlin.reflect.jvm.internal.impl.name.f fVarF = kotlin.reflect.jvm.internal.impl.name.f.f(name);
            f0.o(fVarF, "identifier(name)");
            collectionO = O(fVarF);
        }
        Collection<w> collection = collectionO;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (f0.g(p.f128319a.g((w) obj).a(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 1) {
            return (w) CollectionsKt___CollectionsKt.c5(arrayList);
        }
        String strH3 = CollectionsKt___CollectionsKt.h3(collection, "\n", null, null, 0, null, new yh.l<w, CharSequence>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@dl.d w descriptor) {
                f0.p(descriptor, "descriptor");
                return DescriptorRenderer.f127420j.s(descriptor) + " | " + p.f128319a.g(descriptor).a();
            }
        }, 30, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Function '");
        sb2.append(name);
        sb2.append("' (JVM signature: ");
        sb2.append(signature);
        sb2.append(") not resolved in ");
        sb2.append(this);
        sb2.append(':');
        sb2.append(strH3.length() == 0 ? " no members found" : '\n' + strH3);
        throw new KotlinReflectionInternalError(sb2.toString());
    }

    @dl.e
    public final Method J(@dl.d String name, @dl.d String desc) {
        Method methodW;
        f0.p(name, "name");
        f0.p(desc, "desc");
        if (f0.g(name, "<init>")) {
            return null;
        }
        Class<?>[] clsArr = (Class[]) T(desc).toArray(new Class[0]);
        Class<?> clsV = V(desc);
        Method methodW2 = W(R(), name, clsArr, clsV, false);
        if (methodW2 != null) {
            return methodW2;
        }
        if (!R().isInterface() || (methodW = W(Object.class, name, clsArr, clsV, false)) == null) {
            return null;
        }
        return methodW;
    }

    @dl.d
    public final o0 L(@dl.d String name, @dl.d String signature) {
        f0.p(name, "name");
        f0.p(signature, "signature");
        kotlin.text.k kVarJ = f125158d.j(signature);
        if (kVarJ != null) {
            String str = kVarJ.a().k().c().get(1);
            o0 o0VarP = P(Integer.parseInt(str));
            if (o0VarP != null) {
                return o0VarP;
            }
            throw new KotlinReflectionInternalError("Local property #" + str + " not found in " + i());
        }
        kotlin.reflect.jvm.internal.impl.name.f fVarF = kotlin.reflect.jvm.internal.impl.name.f.f(name);
        f0.o(fVarF, "identifier(name)");
        Collection<o0> collectionS = S(fVarF);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionS) {
            if (f0.g(p.f128319a.f((o0) obj).a(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new KotlinReflectionInternalError("Property '" + name + "' (JVM signature: " + signature + ") not resolved in " + this);
        }
        if (arrayList.size() == 1) {
            return (o0) CollectionsKt___CollectionsKt.c5(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            kotlin.reflect.jvm.internal.impl.descriptors.s visibility = ((o0) obj2).getVisibility();
            Object arrayList2 = linkedHashMap.get(visibility);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(visibility, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        Collection collectionValues = r0.r(linkedHashMap, new j(new yh.p<kotlin.reflect.jvm.internal.impl.descriptors.s, kotlin.reflect.jvm.internal.impl.descriptors.s, Integer>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2
            @Override // yh.p
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(kotlin.reflect.jvm.internal.impl.descriptors.s sVar, kotlin.reflect.jvm.internal.impl.descriptors.s sVar2) {
                Integer numD = kotlin.reflect.jvm.internal.impl.descriptors.r.d(sVar, sVar2);
                return Integer.valueOf(numD == null ? 0 : numD.intValue());
            }
        })).values();
        f0.o(collectionValues, "properties\n             …\n                }.values");
        List mostVisibleProperties = (List) CollectionsKt___CollectionsKt.i3(collectionValues);
        if (mostVisibleProperties.size() == 1) {
            f0.o(mostVisibleProperties, "mostVisibleProperties");
            return (o0) CollectionsKt___CollectionsKt.w2(mostVisibleProperties);
        }
        kotlin.reflect.jvm.internal.impl.name.f fVarF2 = kotlin.reflect.jvm.internal.impl.name.f.f(name);
        f0.o(fVarF2, "identifier(name)");
        String strH3 = CollectionsKt___CollectionsKt.h3(S(fVarF2), "\n", null, null, 0, null, new yh.l<o0, CharSequence>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@dl.d o0 descriptor) {
                f0.p(descriptor, "descriptor");
                return DescriptorRenderer.f127420j.s(descriptor) + " | " + p.f128319a.f(descriptor).a();
            }
        }, 30, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Property '");
        sb2.append(name);
        sb2.append("' (JVM signature: ");
        sb2.append(signature);
        sb2.append(") not resolved in ");
        sb2.append(this);
        sb2.append(':');
        sb2.append(strH3.length() == 0 ? " no members found" : '\n' + strH3);
        throw new KotlinReflectionInternalError(sb2.toString());
    }

    @dl.d
    public abstract Collection<kotlin.reflect.jvm.internal.impl.descriptors.j> N();

    @dl.d
    public abstract Collection<w> O(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar);

    @dl.e
    public abstract o0 P(int i10);

    /* JADX WARN: Code duplicated, block: B:12:0x004c  */
    @dl.d
    protected final Collection<KCallableImpl<?>> Q(@dl.d MemberScope scope, @dl.d MemberBelonginess belonginess) {
        KCallableImpl kCallableImpl;
        f0.p(scope, "scope");
        f0.p(belonginess, "belonginess");
        b bVar = new b(this);
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> collectionA = kotlin.reflect.jvm.internal.impl.resolve.scopes.h.a.a(scope, null, null, 3, null);
        ArrayList arrayList = new ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.k kVar : collectionA) {
            if (kVar instanceof CallableMemberDescriptor) {
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) kVar;
                if (f0.g(callableMemberDescriptor.getVisibility(), kotlin.reflect.jvm.internal.impl.descriptors.r.f125871h) || !belonginess.accept(callableMemberDescriptor)) {
                    kCallableImpl = null;
                } else {
                    kCallableImpl = (KCallableImpl) kVar.c0(bVar, b2.f124493a);
                }
            } else {
                kCallableImpl = null;
            }
            if (kCallableImpl != null) {
                arrayList.add(kCallableImpl);
            }
        }
        return CollectionsKt___CollectionsKt.Q5(arrayList);
    }

    @dl.d
    protected Class<?> R() {
        Class<?> clsG = ReflectClassUtilKt.g(i());
        return clsG == null ? i() : clsG;
    }

    @dl.d
    public abstract Collection<o0> S(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar);

    @dl.e
    public final Constructor<?> w(@dl.d String desc) {
        f0.p(desc, "desc");
        return Z(i(), T(desc));
    }
}
