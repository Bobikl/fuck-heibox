package kotlin.reflect.jvm.internal;

import androidx.compose.material3.TextFieldImplKt;
import com.meituan.robust.Constants;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.c1;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.PropertyReference;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.text.u;
import kotlin.text.y;

/* JADX INFO: compiled from: util.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f128321a = new kotlin.reflect.jvm.internal.impl.name.c("kotlin.jvm.JvmStatic");

    /* JADX INFO: compiled from: util.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f128322a;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f128322a = iArr;
        }
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r7v12, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r7v14, types: [byte[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v16, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [float[]] */
    /* JADX WARN: Type inference failed for: r7v18, types: [long[]] */
    /* JADX WARN: Type inference failed for: r7v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.Object a(kotlin.reflect.jvm.internal.impl.resolve.constants.b r6, java.lang.ClassLoader r7) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.s.a(kotlin.reflect.jvm.internal.impl.resolve.constants.b, java.lang.ClassLoader):java.lang.Object");
    }

    @dl.e
    public static final KCallableImpl<?> b(@dl.e Object obj) {
        KCallableImpl<?> kCallableImpl = obj instanceof KCallableImpl ? (KCallableImpl) obj : null;
        if (kCallableImpl != null) {
            return kCallableImpl;
        }
        KFunctionImpl kFunctionImplC = c(obj);
        return kFunctionImplC != null ? kFunctionImplC : d(obj);
    }

    @dl.e
    public static final KFunctionImpl c(@dl.e Object obj) {
        KFunctionImpl kFunctionImpl = obj instanceof KFunctionImpl ? (KFunctionImpl) obj : null;
        if (kFunctionImpl != null) {
            return kFunctionImpl;
        }
        FunctionReference functionReference = obj instanceof FunctionReference ? (FunctionReference) obj : null;
        kotlin.reflect.c cVarCompute = functionReference != null ? functionReference.compute() : null;
        if (cVarCompute instanceof KFunctionImpl) {
            return (KFunctionImpl) cVarCompute;
        }
        return null;
    }

    @dl.e
    public static final KPropertyImpl<?> d(@dl.e Object obj) {
        KPropertyImpl<?> kPropertyImpl = obj instanceof KPropertyImpl ? (KPropertyImpl) obj : null;
        if (kPropertyImpl != null) {
            return kPropertyImpl;
        }
        PropertyReference propertyReference = obj instanceof PropertyReference ? (PropertyReference) obj : null;
        kotlin.reflect.c cVarCompute = propertyReference != null ? propertyReference.compute() : null;
        if (cVarCompute instanceof KPropertyImpl) {
            return (KPropertyImpl) cVarCompute;
        }
        return null;
    }

    @dl.d
    public static final List<Annotation> e(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar) {
        f0.p(aVar, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar : annotations) {
            t0 t0VarJ = cVar.j();
            Annotation annotationO = null;
            if (t0VarJ instanceof ii.b) {
                annotationO = ((ii.b) t0VarJ).d();
            } else if (t0VarJ instanceof ii.l.a) {
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.n nVarC = ((ii.l.a) t0VarJ).c();
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d dVar = nVarC instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d ? (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d) nVarC : null;
                if (dVar != null) {
                    annotationO = dVar.P();
                }
            } else {
                annotationO = o(cVar);
            }
            if (annotationO != null) {
                arrayList.add(annotationO);
            }
        }
        return s(arrayList);
    }

    @dl.d
    public static final Class<?> f(@dl.d Class<?> cls) {
        f0.p(cls, "<this>");
        return Array.newInstance(cls, 0).getClass();
    }

    @dl.e
    public static final Object g(@dl.d Type type) {
        f0.p(type, "type");
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (f0.g(type, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (f0.g(type, Character.TYPE)) {
            return (char) 0;
        }
        if (f0.g(type, Byte.TYPE)) {
            return (byte) 0;
        }
        if (f0.g(type, Short.TYPE)) {
            return (short) 0;
        }
        if (f0.g(type, Integer.TYPE)) {
            return 0;
        }
        if (f0.g(type, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (f0.g(type, Long.TYPE)) {
            return 0L;
        }
        if (f0.g(type, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (f0.g(type, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    @dl.d
    public static final <M extends kotlin.reflect.jvm.internal.impl.protobuf.n, D extends kotlin.reflect.jvm.internal.impl.descriptors.a> D h(@dl.d Class<?> moduleAnchor, @dl.d M proto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g typeTable, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.a metadataVersion, @dl.d yh.p<? super MemberDeserializer, ? super M, ? extends D> createDescriptor) {
        List<ProtoBuf.TypeParameter> listN0;
        f0.p(moduleAnchor, "moduleAnchor");
        f0.p(proto, "proto");
        f0.p(nameResolver, "nameResolver");
        f0.p(typeTable, "typeTable");
        f0.p(metadataVersion, "metadataVersion");
        f0.p(createDescriptor, "createDescriptor");
        ii.k kVarB = m.b(moduleAnchor);
        if (proto instanceof ProtoBuf.Function) {
            listN0 = ((ProtoBuf.Function) proto).m0();
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            listN0 = ((ProtoBuf.Property) proto).n0();
        }
        List<ProtoBuf.TypeParameter> typeParameters = listN0;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.h hVarA = kVarB.a();
        d0 d0VarB = kVarB.b();
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVarB = kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f127067b.b();
        f0.o(typeParameters, "typeParameters");
        return createDescriptor.invoke(new MemberDeserializer(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.j(hVarA, nameResolver, d0VarB, typeTable, hVarB, metadataVersion, null, null, typeParameters)), proto);
    }

    @dl.e
    public static final r0 i(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        f0.p(aVar, "<this>");
        if (aVar.i0() == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = aVar.c();
        f0.n(kVarC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((kotlin.reflect.jvm.internal.impl.descriptors.d) kVarC).b0();
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.name.c j() {
        return f128321a;
    }

    public static final boolean k(@dl.d kotlin.reflect.r rVar) {
        kotlin.reflect.jvm.internal.impl.types.d0 d0VarJ;
        f0.p(rVar, "<this>");
        KTypeImpl kTypeImpl = rVar instanceof KTypeImpl ? (KTypeImpl) rVar : null;
        return (kTypeImpl == null || (d0VarJ = kTypeImpl.j()) == null || !kotlin.reflect.jvm.internal.impl.resolve.e.c(d0VarJ)) ? false : true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final Class<?> l(ClassLoader classLoader, String str, String str2, int i10) {
        if (f0.g(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        String str3 = str + lg.a.f131414g + u.k2(str2, lg.a.f131414g, y.f128594c, false, 4, null);
        if (i10 > 0) {
            str3 = u.h2(Constants.ARRAY_TYPE, i10) + Constants.OBJECT_TYPE + str3 + ';';
        }
        return ii.e.a(classLoader, str3);
    }

    private static final Class<?> m(ClassLoader classLoader, kotlin.reflect.jvm.internal.impl.name.b bVar, int i10) {
        kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f125524a;
        kotlin.reflect.jvm.internal.impl.name.d dVarJ = bVar.b().j();
        f0.o(dVarJ, "kotlinClassId.asSingleFqName().toUnsafe()");
        kotlin.reflect.jvm.internal.impl.name.b bVarN = cVar.n(dVarJ);
        if (bVarN != null) {
            bVar = bVarN;
        }
        String strB = bVar.h().b();
        f0.o(strB, "javaClassId.packageFqName.asString()");
        String strB2 = bVar.i().b();
        f0.o(strB2, "javaClassId.relativeClassName.asString()");
        return l(classLoader, strB, strB2, i10);
    }

    static /* synthetic */ Class n(ClassLoader classLoader, kotlin.reflect.jvm.internal.impl.name.b bVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m(classLoader, bVar, i10);
    }

    private static final Annotation o(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarI = DescriptorUtilsKt.i(cVar);
        Class<?> clsP = dVarI != null ? p(dVarI) : null;
        if (!(clsP instanceof Class)) {
            clsP = null;
        }
        if (clsP == null) {
            return null;
        }
        Set<Map.Entry<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> setEntrySet = cVar.a().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            kotlin.reflect.jvm.internal.impl.name.f fVar = (kotlin.reflect.jvm.internal.impl.name.f) entry.getKey();
            kotlin.reflect.jvm.internal.impl.resolve.constants.g gVar = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) entry.getValue();
            ClassLoader classLoader = clsP.getClassLoader();
            f0.o(classLoader, "annotationClass.classLoader");
            Object objR = r(gVar, classLoader);
            Pair pairA = objR != null ? c1.a(fVar.b(), objR) : null;
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return (Annotation) AnnotationConstructorCallerKt.e(clsP, s0.B0(arrayList), null, 4, null);
    }

    @dl.e
    public static final Class<?> p(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        f0.p(dVar, "<this>");
        t0 source = dVar.j();
        f0.o(source, "source");
        if (source instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.q) {
            kotlin.reflect.jvm.internal.impl.load.kotlin.o oVarD = ((kotlin.reflect.jvm.internal.impl.load.kotlin.q) source).d();
            f0.n(oVarD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((ii.f) oVarD).a();
        }
        if (source instanceof ii.l.a) {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.n nVarC = ((ii.l.a) source).c();
            f0.n(nVarC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((ReflectJavaClass) nVarC).a();
        }
        kotlin.reflect.jvm.internal.impl.name.b bVarK = DescriptorUtilsKt.k(dVar);
        if (bVarK == null) {
            return null;
        }
        return m(ReflectClassUtilKt.f(dVar.getClass()), bVarK, 0);
    }

    @dl.e
    public static final KVisibility q(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.s sVar) {
        f0.p(sVar, "<this>");
        if (f0.g(sVar, kotlin.reflect.jvm.internal.impl.descriptors.r.f125868e)) {
            return KVisibility.PUBLIC;
        }
        if (f0.g(sVar, kotlin.reflect.jvm.internal.impl.descriptors.r.f125866c)) {
            return KVisibility.PROTECTED;
        }
        if (f0.g(sVar, kotlin.reflect.jvm.internal.impl.descriptors.r.f125867d)) {
            return KVisibility.INTERNAL;
        }
        if (f0.g(sVar, kotlin.reflect.jvm.internal.impl.descriptors.r.f125864a) ? true : f0.g(sVar, kotlin.reflect.jvm.internal.impl.descriptors.r.f125865b)) {
            return KVisibility.PRIVATE;
        }
        return null;
    }

    private static final Object r(kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar, ClassLoader classLoader) {
        if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.a) {
            return o(((kotlin.reflect.jvm.internal.impl.resolve.constants.a) gVar).b());
        }
        if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.b) {
            return a((kotlin.reflect.jvm.internal.impl.resolve.constants.b) gVar, classLoader);
        }
        if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.i) {
            Pair<? extends kotlin.reflect.jvm.internal.impl.name.b, ? extends kotlin.reflect.jvm.internal.impl.name.f> pairB = ((kotlin.reflect.jvm.internal.impl.resolve.constants.i) gVar).b();
            kotlin.reflect.jvm.internal.impl.name.b bVarA = pairB.a();
            kotlin.reflect.jvm.internal.impl.name.f fVarB = pairB.b();
            Class clsN = n(classLoader, bVarA, 0, 4, null);
            if (clsN != null) {
                return r.a(clsN, fVarB.b());
            }
            return null;
        }
        if (!(gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.o)) {
            if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.j ? true : gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.q) {
                return null;
            }
            return gVar.b();
        }
        kotlin.reflect.jvm.internal.impl.resolve.constants.o.b bVarB = ((kotlin.reflect.jvm.internal.impl.resolve.constants.o) gVar).b();
        if (bVarB instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.o.b.C1176b) {
            kotlin.reflect.jvm.internal.impl.resolve.constants.o.b.C1176b c1176b = (kotlin.reflect.jvm.internal.impl.resolve.constants.o.b.C1176b) bVarB;
            return m(classLoader, c1176b.b(), c1176b.a());
        }
        if (!(bVarB instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.o.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = ((kotlin.reflect.jvm.internal.impl.resolve.constants.o.b.a) bVarB).a().O0().d();
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD : null;
        if (dVar != null) {
            return p(dVar);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final List<Annotation> s(List<? extends Annotation> list) throws IllegalAccessException, InvocationTargetException {
        boolean z10;
        List listK;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                if (f0.g(xh.a.e(xh.a.a((Annotation) it.next())).getSimpleName(), TextFieldImplKt.f11420g)) {
                    z10 = true;
                    break;
                }
            }
        } else {
            z10 = false;
            break;
        }
        if (!z10) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation : list) {
            Class clsE = xh.a.e(xh.a.a(annotation));
            if (!f0.g(clsE.getSimpleName(), TextFieldImplKt.f11420g) || clsE.getAnnotation(p0.class) == null) {
                listK = kotlin.collections.s.k(annotation);
            } else {
                Object objInvoke = clsE.getDeclaredMethod("value", new Class[0]).invoke(annotation, new Object[0]);
                f0.n(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                listK = kotlin.collections.m.t((Annotation[]) objInvoke);
            }
            x.n0(arrayList, listK);
        }
        return arrayList;
    }
}
