package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k0;
import kotlin.collections.r0;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.j0;

/* JADX INFO: compiled from: AnnotationDeserializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final d0 f127725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final NotFoundClasses f127726b;

    /* JADX INFO: compiled from: AnnotationDeserializer.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127727a;

        static {
            int[] iArr = new int[ProtoBuf.Annotation.Argument.Value.Type.values().length];
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f127727a = iArr;
        }
    }

    public c(@dl.d d0 module, @dl.d NotFoundClasses notFoundClasses) {
        f0.p(module, "module");
        f0.p(notFoundClasses, "notFoundClasses");
        this.f127725a = module;
        this.f127726b = notFoundClasses;
    }

    private final boolean b(kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar, kotlin.reflect.jvm.internal.impl.types.d0 d0Var, ProtoBuf.Annotation.Argument.Value value) {
        ProtoBuf.Annotation.Argument.Value.Type typeU = value.U();
        int i10 = typeU == null ? -1 : a.f127727a[typeU.ordinal()];
        if (i10 == 10) {
            kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = d0Var.O0().d();
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar = fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD : null;
            if (dVar != null && !kotlin.reflect.jvm.internal.impl.builtins.g.k0(dVar)) {
                return false;
            }
        } else {
            if (i10 != 13) {
                return f0.g(gVar.a(this.f127725a), d0Var);
            }
            if (!((gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.b) && ((kotlin.reflect.jvm.internal.impl.resolve.constants.b) gVar).b().size() == value.K().size())) {
                throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
            }
            kotlin.reflect.jvm.internal.impl.types.d0 d0VarK = c().k(d0Var);
            f0.o(d0VarK, "builtIns.getArrayElementType(expectedType)");
            kotlin.reflect.jvm.internal.impl.resolve.constants.b bVar = (kotlin.reflect.jvm.internal.impl.resolve.constants.b) gVar;
            Iterable iterableF = CollectionsKt__CollectionsKt.F(bVar.b());
            if (!(iterableF instanceof Collection) || !((Collection) iterableF).isEmpty()) {
                Iterator it = iterableF.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((k0) it).nextInt();
                    kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar2 = bVar.b().get(iNextInt);
                    ProtoBuf.Annotation.Argument.Value valueH = value.H(iNextInt);
                    f0.o(valueH, "value.getArrayElement(i)");
                    if (!b(gVar2, d0VarK, valueH)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private final kotlin.reflect.jvm.internal.impl.builtins.g c() {
        return this.f127725a.t();
    }

    private final Pair<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> d(ProtoBuf.Annotation.Argument argument, Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends b1> map, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        b1 b1Var = map.get(r.b(cVar, argument.x()));
        if (b1Var == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.f fVarB = r.b(cVar, argument.x());
        kotlin.reflect.jvm.internal.impl.types.d0 type = b1Var.getType();
        f0.o(type, "parameter.type");
        ProtoBuf.Annotation.Argument.Value valueY = argument.y();
        f0.o(valueY, "proto.value");
        return new Pair<>(fVarB, g(type, valueY, cVar));
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d e(kotlin.reflect.jvm.internal.impl.name.b bVar) {
        return FindClassInModuleKt.c(this.f127725a, bVar, this.f127726b);
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> g(kotlin.reflect.jvm.internal.impl.types.d0 d0Var, ProtoBuf.Annotation.Argument.Value value, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVarF = f(d0Var, value, cVar);
        if (!b(gVarF, d0Var, value)) {
            gVarF = null;
        }
        if (gVarF != null) {
            return gVarF;
        }
        return kotlin.reflect.jvm.internal.impl.resolve.constants.j.f127536b.a("Unexpected argument value: actual type " + value.U() + " != expected type " + d0Var);
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(@dl.d ProtoBuf.Annotation proto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver) {
        f0.p(proto, "proto");
        f0.p(nameResolver, "nameResolver");
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarE = e(r.a(nameResolver, proto.B()));
        Map mapZ = s0.z();
        if (proto.x() != 0 && !kotlin.reflect.jvm.internal.impl.types.error.h.m(dVarE) && kotlin.reflect.jvm.internal.impl.resolve.d.t(dVarE)) {
            Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> collectionH = dVarE.h();
            f0.o(collectionH, "annotationClass.constructors");
            kotlin.reflect.jvm.internal.impl.descriptors.c cVar = (kotlin.reflect.jvm.internal.impl.descriptors.c) CollectionsKt___CollectionsKt.d5(collectionH);
            if (cVar != null) {
                List<b1> listI = cVar.i();
                f0.o(listI, "constructor.valueParameters");
                LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(kotlin.collections.t.Y(listI, 10)), 16));
                for (Object obj : listI) {
                    linkedHashMap.put(((b1) obj).getName(), obj);
                }
                List<ProtoBuf.Annotation.Argument> listY = proto.y();
                f0.o(listY, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (ProtoBuf.Annotation.Argument it : listY) {
                    f0.o(it, "it");
                    Pair<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> pairD = d(it, linkedHashMap, nameResolver);
                    if (pairD != null) {
                        arrayList.add(pairD);
                    }
                }
                mapZ = s0.B0(arrayList);
            }
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.annotations.d(dVarE.v(), mapZ, t0.f125942a);
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> f(@dl.d kotlin.reflect.jvm.internal.impl.types.d0 expectedType, @dl.d ProtoBuf.Annotation.Argument.Value value, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> eVar;
        f0.p(expectedType, "expectedType");
        f0.p(value, "value");
        f0.p(nameResolver, "nameResolver");
        Boolean boolD = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.O.d(value.Q());
        f0.o(boolD, "IS_UNSIGNED.get(value.flags)");
        boolean zBooleanValue = boolD.booleanValue();
        ProtoBuf.Annotation.Argument.Value.Type typeU = value.U();
        switch (typeU == null ? -1 : a.f127727a[typeU.ordinal()]) {
            case 1:
                byte bS = (byte) value.S();
                return zBooleanValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.u(bS) : new kotlin.reflect.jvm.internal.impl.resolve.constants.d(bS);
            case 2:
                eVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.e((char) value.S());
                break;
            case 3:
                short S = (short) value.S();
                return zBooleanValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.x(S) : new kotlin.reflect.jvm.internal.impl.resolve.constants.s(S);
            case 4:
                int iS = (int) value.S();
                return zBooleanValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.v(iS) : new kotlin.reflect.jvm.internal.impl.resolve.constants.l(iS);
            case 5:
                long jS = value.S();
                return zBooleanValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.w(jS) : new kotlin.reflect.jvm.internal.impl.resolve.constants.p(jS);
            case 6:
                eVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.k(value.R());
                break;
            case 7:
                eVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.h(value.O());
                break;
            case 8:
                eVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.c(value.S() != 0);
                break;
            case 9:
                eVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.t(nameResolver.getString(value.T()));
                break;
            case 10:
                eVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.o(r.a(nameResolver, value.L()), value.G());
                break;
            case 11:
                eVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.i(r.a(nameResolver, value.L()), r.b(nameResolver, value.P()));
                break;
            case 12:
                ProtoBuf.Annotation annotationF = value.F();
                f0.o(annotationF, "value.annotation");
                eVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.a(a(annotationF, nameResolver));
                break;
            case 13:
                List<ProtoBuf.Annotation.Argument.Value> listK = value.K();
                f0.o(listK, "value.arrayElementList");
                ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listK, 10));
                for (ProtoBuf.Annotation.Argument.Value it : listK) {
                    j0 j0VarI = c().i();
                    f0.o(j0VarI, "builtIns.anyType");
                    f0.o(it, "it");
                    arrayList.add(f(j0VarI, it, nameResolver));
                }
                return new DeserializedArrayValue(arrayList, expectedType);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.U() + " (expected " + expectedType + ')').toString());
        }
        return eVar;
    }
}
