package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.c1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.d1;
import kotlin.collections.e1;
import kotlin.collections.r0;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: compiled from: SpecialGenericSignatures.kt */
/* JADX INFO: loaded from: classes5.dex */
public class SpecialGenericSignatures {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f125985a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final List<a.C1148a> f125986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final List<String> f125987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final List<String> f125988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final Map<a.C1148a, TypeSafeBarrierDescription> f125989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final Map<String, TypeSafeBarrierDescription> f125990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final Set<kotlin.reflect.jvm.internal.impl.name.f> f125991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final Set<String> f125992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final a.C1148a f125993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final Map<a.C1148a, kotlin.reflect.jvm.internal.impl.name.f> f125994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final Map<String, kotlin.reflect.jvm.internal.impl.name.f> f125995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final List<kotlin.reflect.jvm.internal.impl.name.f> f125996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.name.f> f125997m;

    /* JADX INFO: compiled from: SpecialGenericSignatures.kt */
    public enum SpecialSignatureInfo {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);

        private final boolean isObjectReplacedWithTypeParameter;

        @dl.e
        private final String valueParametersSignature;

        SpecialSignatureInfo(String str, boolean z10) {
            this.valueParametersSignature = str;
            this.isObjectReplacedWithTypeParameter = z10;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: SpecialGenericSignatures.kt */
    public static class TypeSafeBarrierDescription {

        @dl.e
        private final Object defaultValue;
        public static final TypeSafeBarrierDescription NULL = new TypeSafeBarrierDescription("NULL", 0, null);
        public static final TypeSafeBarrierDescription INDEX = new TypeSafeBarrierDescription("INDEX", 1, -1);
        public static final TypeSafeBarrierDescription FALSE = new TypeSafeBarrierDescription("FALSE", 2, Boolean.FALSE);
        public static final TypeSafeBarrierDescription MAP_GET_OR_DEFAULT = new MAP_GET_OR_DEFAULT("MAP_GET_OR_DEFAULT", 3);
        private static final /* synthetic */ TypeSafeBarrierDescription[] $VALUES = $values();

        /* JADX INFO: compiled from: SpecialGenericSignatures.kt */
        public static final class MAP_GET_OR_DEFAULT extends TypeSafeBarrierDescription {
            /* JADX WARN: Illegal instructions before constructor call */
            MAP_GET_OR_DEFAULT(String str, int i10) {
                kotlin.jvm.internal.u uVar = null;
                super(str, i10, uVar, uVar);
            }
        }

        private static final /* synthetic */ TypeSafeBarrierDescription[] $values() {
            return new TypeSafeBarrierDescription[]{NULL, INDEX, FALSE, MAP_GET_OR_DEFAULT};
        }

        private TypeSafeBarrierDescription(String str, int i10, Object obj) {
            super(str, i10);
            this.defaultValue = obj;
        }

        public /* synthetic */ TypeSafeBarrierDescription(String str, int i10, Object obj, kotlin.jvm.internal.u uVar) {
            this(str, i10, obj);
        }

        public static TypeSafeBarrierDescription valueOf(String str) {
            return (TypeSafeBarrierDescription) Enum.valueOf(TypeSafeBarrierDescription.class, str);
        }

        public static TypeSafeBarrierDescription[] values() {
            return (TypeSafeBarrierDescription[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: SpecialGenericSignatures.kt */
    public static final class a {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SpecialGenericSignatures.kt */
        public static final class C1148a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            private final kotlin.reflect.jvm.internal.impl.name.f f125998a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @dl.d
            private final String f125999b;

            public C1148a(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d String signature) {
                f0.p(name, "name");
                f0.p(signature, "signature");
                this.f125998a = name;
                this.f125999b = signature;
            }

            @dl.d
            public final kotlin.reflect.jvm.internal.impl.name.f a() {
                return this.f125998a;
            }

            @dl.d
            public final String b() {
                return this.f125999b;
            }

            public boolean equals(@dl.e Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1148a)) {
                    return false;
                }
                C1148a c1148a = (C1148a) obj;
                return f0.g(this.f125998a, c1148a.f125998a) && f0.g(this.f125999b, c1148a.f125999b);
            }

            public int hashCode() {
                return (this.f125998a.hashCode() * 31) + this.f125999b.hashCode();
            }

            @dl.d
            public String toString() {
                return "NameAndSignature(name=" + this.f125998a + ", signature=" + this.f125999b + ')';
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C1148a m(String str, String str2, String str3, String str4) {
            kotlin.reflect.jvm.internal.impl.name.f fVarF = kotlin.reflect.jvm.internal.impl.name.f.f(str2);
            f0.o(fVarF, "identifier(name)");
            return new C1148a(fVarF, SignatureBuildingComponents.f126464a.k(str, str2 + '(' + str3 + ')' + str4));
        }

        @dl.e
        public final kotlin.reflect.jvm.internal.impl.name.f b(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
            f0.p(name, "name");
            return f().get(name);
        }

        @dl.d
        public final List<String> c() {
            return SpecialGenericSignatures.f125987c;
        }

        @dl.d
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            return SpecialGenericSignatures.f125991g;
        }

        @dl.d
        public final Set<String> e() {
            return SpecialGenericSignatures.f125992h;
        }

        @dl.d
        public final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.name.f> f() {
            return SpecialGenericSignatures.f125997m;
        }

        @dl.d
        public final List<kotlin.reflect.jvm.internal.impl.name.f> g() {
            return SpecialGenericSignatures.f125996l;
        }

        @dl.d
        public final C1148a h() {
            return SpecialGenericSignatures.f125993i;
        }

        @dl.d
        public final Map<String, TypeSafeBarrierDescription> i() {
            return SpecialGenericSignatures.f125990f;
        }

        @dl.d
        public final Map<String, kotlin.reflect.jvm.internal.impl.name.f> j() {
            return SpecialGenericSignatures.f125995k;
        }

        public final boolean k(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            f0.p(fVar, "<this>");
            return g().contains(fVar);
        }

        @dl.d
        public final SpecialSignatureInfo l(@dl.d String builtinSignature) {
            f0.p(builtinSignature, "builtinSignature");
            if (c().contains(builtinSignature)) {
                return SpecialSignatureInfo.ONE_COLLECTION_PARAMETER;
            }
            return ((TypeSafeBarrierDescription) s0.K(i(), builtinSignature)) == TypeSafeBarrierDescription.NULL ? SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC : SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
        }
    }

    static {
        Set<String> setU = d1.u("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(setU, 10));
        for (String str : setU) {
            a aVar = f125985a;
            String desc = JvmPrimitiveType.BOOLEAN.getDesc();
            f0.o(desc, "BOOLEAN.desc");
            arrayList.add(aVar.m("java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        f125986b = arrayList;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((a.C1148a) it.next()).b());
        }
        f125987c = arrayList2;
        List<a.C1148a> list = f125986b;
        ArrayList arrayList3 = new ArrayList(kotlin.collections.t.Y(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((a.C1148a) it2.next()).a().b());
        }
        f125988d = arrayList3;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f126464a;
        a aVar2 = f125985a;
        String strI = signatureBuildingComponents.i("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String desc2 = jvmPrimitiveType.getDesc();
        f0.o(desc2, "BOOLEAN.desc");
        a.C1148a c1148aM = aVar2.m(strI, "contains", "Ljava/lang/Object;", desc2);
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.FALSE;
        String strI2 = signatureBuildingComponents.i("Collection");
        String desc3 = jvmPrimitiveType.getDesc();
        f0.o(desc3, "BOOLEAN.desc");
        String strI3 = signatureBuildingComponents.i("Map");
        String desc4 = jvmPrimitiveType.getDesc();
        f0.o(desc4, "BOOLEAN.desc");
        String strI4 = signatureBuildingComponents.i("Map");
        String desc5 = jvmPrimitiveType.getDesc();
        f0.o(desc5, "BOOLEAN.desc");
        String strI5 = signatureBuildingComponents.i("Map");
        String desc6 = jvmPrimitiveType.getDesc();
        f0.o(desc6, "BOOLEAN.desc");
        a.C1148a c1148aM2 = aVar2.m(signatureBuildingComponents.i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.NULL;
        String strI6 = signatureBuildingComponents.i("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String desc7 = jvmPrimitiveType2.getDesc();
        f0.o(desc7, "INT.desc");
        a.C1148a c1148aM3 = aVar2.m(strI6, "indexOf", "Ljava/lang/Object;", desc7);
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.INDEX;
        String strI7 = signatureBuildingComponents.i("List");
        String desc8 = jvmPrimitiveType2.getDesc();
        f0.o(desc8, "INT.desc");
        Map<a.C1148a, TypeSafeBarrierDescription> mapW = s0.W(c1.a(c1148aM, typeSafeBarrierDescription), c1.a(aVar2.m(strI2, "remove", "Ljava/lang/Object;", desc3), typeSafeBarrierDescription), c1.a(aVar2.m(strI3, "containsKey", "Ljava/lang/Object;", desc4), typeSafeBarrierDescription), c1.a(aVar2.m(strI4, "containsValue", "Ljava/lang/Object;", desc5), typeSafeBarrierDescription), c1.a(aVar2.m(strI5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), typeSafeBarrierDescription), c1.a(aVar2.m(signatureBuildingComponents.i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT), c1.a(c1148aM2, typeSafeBarrierDescription2), c1.a(aVar2.m(signatureBuildingComponents.i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2), c1.a(c1148aM3, typeSafeBarrierDescription3), c1.a(aVar2.m(strI7, "lastIndexOf", "Ljava/lang/Object;", desc8), typeSafeBarrierDescription3));
        f125989e = mapW;
        LinkedHashMap linkedHashMap = new LinkedHashMap(r0.j(mapW.size()));
        Iterator<T> it3 = mapW.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(((a.C1148a) entry.getKey()).b(), entry.getValue());
        }
        f125990f = linkedHashMap;
        Set setC = e1.C(f125989e.keySet(), f125986b);
        ArrayList arrayList4 = new ArrayList(kotlin.collections.t.Y(setC, 10));
        Iterator it4 = setC.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((a.C1148a) it4.next()).a());
        }
        f125991g = CollectionsKt___CollectionsKt.V5(arrayList4);
        ArrayList arrayList5 = new ArrayList(kotlin.collections.t.Y(setC, 10));
        Iterator it5 = setC.iterator();
        while (it5.hasNext()) {
            arrayList5.add(((a.C1148a) it5.next()).b());
        }
        f125992h = CollectionsKt___CollectionsKt.V5(arrayList5);
        a aVar3 = f125985a;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String desc9 = jvmPrimitiveType3.getDesc();
        f0.o(desc9, "INT.desc");
        a.C1148a c1148aM4 = aVar3.m("java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        f125993i = c1148aM4;
        SignatureBuildingComponents signatureBuildingComponents2 = SignatureBuildingComponents.f126464a;
        String strH = signatureBuildingComponents2.h("Number");
        String desc10 = JvmPrimitiveType.BYTE.getDesc();
        f0.o(desc10, "BYTE.desc");
        String strH2 = signatureBuildingComponents2.h("Number");
        String desc11 = JvmPrimitiveType.SHORT.getDesc();
        f0.o(desc11, "SHORT.desc");
        String strH3 = signatureBuildingComponents2.h("Number");
        String desc12 = jvmPrimitiveType3.getDesc();
        f0.o(desc12, "INT.desc");
        String strH4 = signatureBuildingComponents2.h("Number");
        String desc13 = JvmPrimitiveType.LONG.getDesc();
        f0.o(desc13, "LONG.desc");
        String strH5 = signatureBuildingComponents2.h("Number");
        String desc14 = JvmPrimitiveType.FLOAT.getDesc();
        f0.o(desc14, "FLOAT.desc");
        String strH6 = signatureBuildingComponents2.h("Number");
        String desc15 = JvmPrimitiveType.DOUBLE.getDesc();
        f0.o(desc15, "DOUBLE.desc");
        String strH7 = signatureBuildingComponents2.h("CharSequence");
        String desc16 = jvmPrimitiveType3.getDesc();
        f0.o(desc16, "INT.desc");
        String desc17 = JvmPrimitiveType.CHAR.getDesc();
        f0.o(desc17, "CHAR.desc");
        Map<a.C1148a, kotlin.reflect.jvm.internal.impl.name.f> mapW2 = s0.W(c1.a(aVar3.m(strH, "toByte", "", desc10), kotlin.reflect.jvm.internal.impl.name.f.f("byteValue")), c1.a(aVar3.m(strH2, "toShort", "", desc11), kotlin.reflect.jvm.internal.impl.name.f.f("shortValue")), c1.a(aVar3.m(strH3, "toInt", "", desc12), kotlin.reflect.jvm.internal.impl.name.f.f("intValue")), c1.a(aVar3.m(strH4, "toLong", "", desc13), kotlin.reflect.jvm.internal.impl.name.f.f("longValue")), c1.a(aVar3.m(strH5, "toFloat", "", desc14), kotlin.reflect.jvm.internal.impl.name.f.f("floatValue")), c1.a(aVar3.m(strH6, "toDouble", "", desc15), kotlin.reflect.jvm.internal.impl.name.f.f("doubleValue")), c1.a(c1148aM4, kotlin.reflect.jvm.internal.impl.name.f.f("remove")), c1.a(aVar3.m(strH7, "get", desc16, desc17), kotlin.reflect.jvm.internal.impl.name.f.f("charAt")));
        f125994j = mapW2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(r0.j(mapW2.size()));
        Iterator<T> it6 = mapW2.entrySet().iterator();
        while (it6.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it6.next();
            linkedHashMap2.put(((a.C1148a) entry2.getKey()).b(), entry2.getValue());
        }
        f125995k = linkedHashMap2;
        Set<a.C1148a> setKeySet = f125994j.keySet();
        ArrayList arrayList6 = new ArrayList(kotlin.collections.t.Y(setKeySet, 10));
        Iterator<T> it7 = setKeySet.iterator();
        while (it7.hasNext()) {
            arrayList6.add(((a.C1148a) it7.next()).a());
        }
        f125996l = arrayList6;
        Set<Map.Entry<a.C1148a, kotlin.reflect.jvm.internal.impl.name.f>> setEntrySet = f125994j.entrySet();
        ArrayList<Pair> arrayList7 = new ArrayList(kotlin.collections.t.Y(setEntrySet, 10));
        Iterator<T> it8 = setEntrySet.iterator();
        while (it8.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it8.next();
            arrayList7.add(new Pair(((a.C1148a) entry3.getKey()).a(), entry3.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(fi.u.u(r0.j(kotlin.collections.t.Y(arrayList7, 10)), 16));
        for (Pair pair : arrayList7) {
            linkedHashMap3.put((kotlin.reflect.jvm.internal.impl.name.f) pair.f(), (kotlin.reflect.jvm.internal.impl.name.f) pair.e());
        }
        f125997m = linkedHashMap3;
    }
}
