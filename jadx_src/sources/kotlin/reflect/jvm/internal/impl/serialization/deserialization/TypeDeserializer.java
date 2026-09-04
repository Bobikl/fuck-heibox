package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.e1;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.n0;
import kotlin.reflect.jvm.internal.impl.types.o0;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.v0;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.types.z0;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: TypeDeserializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class TypeDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final j f127704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final TypeDeserializer f127705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final String f127706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final String f127707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final yh.l<Integer, kotlin.reflect.jvm.internal.impl.descriptors.f> f127708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final yh.l<Integer, kotlin.reflect.jvm.internal.impl.descriptors.f> f127709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final Map<Integer, y0> f127710g;

    public TypeDeserializer(@dl.d j c10, @dl.e TypeDeserializer typeDeserializer, @dl.d List<ProtoBuf.TypeParameter> typeParameterProtos, @dl.d String debugName, @dl.d String containerPresentableName) {
        Map<Integer, y0> linkedHashMap;
        f0.p(c10, "c");
        f0.p(typeParameterProtos, "typeParameterProtos");
        f0.p(debugName, "debugName");
        f0.p(containerPresentableName, "containerPresentableName");
        this.f127704a = c10;
        this.f127705b = typeDeserializer;
        this.f127706c = debugName;
        this.f127707d = containerPresentableName;
        this.f127708e = c10.h().h(new yh.l<Integer, kotlin.reflect.jvm.internal.impl.descriptors.f>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$classifierDescriptors$1
            {
                super(1);
            }

            @dl.e
            public final kotlin.reflect.jvm.internal.impl.descriptors.f a(int i10) {
                return this.f127711b.d(i10);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f invoke(Integer num) {
                return a(num.intValue());
            }
        });
        this.f127709f = c10.h().h(new yh.l<Integer, kotlin.reflect.jvm.internal.impl.descriptors.f>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeAliasDescriptors$1
            {
                super(1);
            }

            @dl.e
            public final kotlin.reflect.jvm.internal.impl.descriptors.f a(int i10) {
                return this.f127714b.f(i10);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f invoke(Integer num) {
                return a(num.intValue());
            }
        });
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = s0.z();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i10 = 0;
            for (ProtoBuf.TypeParameter typeParameter : typeParameterProtos) {
                linkedHashMap.put(Integer.valueOf(typeParameter.N()), new DeserializedTypeParameterDescriptor(this.f127704a, typeParameter, i10));
                i10++;
            }
        }
        this.f127710g = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.f d(int i10) {
        kotlin.reflect.jvm.internal.impl.name.b bVarA = r.a(this.f127704a.g(), i10);
        return bVarA.k() ? this.f127704a.c().b(bVarA) : FindClassInModuleKt.b(this.f127704a.c().p(), bVarA);
    }

    private final j0 e(int i10) {
        if (r.a(this.f127704a.g(), i10).k()) {
            return this.f127704a.c().n().a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.f f(int i10) {
        kotlin.reflect.jvm.internal.impl.name.b bVarA = r.a(this.f127704a.g(), i10);
        if (bVarA.k()) {
            return null;
        }
        return FindClassInModuleKt.d(this.f127704a.c().p(), bVarA);
    }

    private final j0 g(d0 d0Var, d0 d0Var2) {
        kotlin.reflect.jvm.internal.impl.builtins.g gVarI = TypeUtilsKt.i(d0Var);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations = d0Var.getAnnotations();
        d0 d0VarJ = kotlin.reflect.jvm.internal.impl.builtins.f.j(d0Var);
        List<d0> listE = kotlin.reflect.jvm.internal.impl.builtins.f.e(d0Var);
        List listY1 = CollectionsKt___CollectionsKt.Y1(kotlin.reflect.jvm.internal.impl.builtins.f.l(d0Var), 1);
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
        Iterator it = listY1.iterator();
        while (it.hasNext()) {
            arrayList.add(((c1) it.next()).getType());
        }
        return kotlin.reflect.jvm.internal.impl.builtins.f.b(gVarI, annotations, d0VarJ, listE, arrayList, null, d0Var2, true).V0(d0Var.P0());
    }

    private final j0 h(w0 w0Var, z0 z0Var, List<? extends c1> list, boolean z10) {
        int size;
        int size2 = z0Var.getParameters().size() - list.size();
        j0 j0VarI = null;
        if (size2 == 0) {
            j0VarI = i(w0Var, z0Var, list, z10);
        } else if (size2 == 1 && (size = list.size() - 1) >= 0) {
            z0 z0VarR = z0Var.t().X(size).r();
            f0.o(z0VarR, "functionTypeConstructor.…on(arity).typeConstructor");
            j0VarI = KotlinTypeFactory.l(w0Var, z0VarR, list, z10, null, 16, null);
        }
        return j0VarI == null ? kotlin.reflect.jvm.internal.impl.types.error.h.f128123a.f(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, list, z0Var, new String[0]) : j0VarI;
    }

    private final j0 i(w0 w0Var, z0 z0Var, List<? extends c1> list, boolean z10) {
        j0 j0VarL = KotlinTypeFactory.l(w0Var, z0Var, list, z10, null, 16, null);
        if (kotlin.reflect.jvm.internal.impl.builtins.f.p(j0VarL)) {
            return p(j0VarL);
        }
        return null;
    }

    private final y0 k(int i10) {
        y0 y0Var = this.f127710g.get(Integer.valueOf(i10));
        if (y0Var != null) {
            return y0Var;
        }
        TypeDeserializer typeDeserializer = this.f127705b;
        if (typeDeserializer != null) {
            return typeDeserializer.k(i10);
        }
        return null;
    }

    private static final List<ProtoBuf.Type.Argument> m(ProtoBuf.Type type, TypeDeserializer typeDeserializer) {
        List<ProtoBuf.Type.Argument> argumentList = type.W();
        f0.o(argumentList, "argumentList");
        ProtoBuf.Type typeJ = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.j(type, typeDeserializer.f127704a.j());
        List<ProtoBuf.Type.Argument> listM = typeJ != null ? m(typeJ, typeDeserializer) : null;
        if (listM == null) {
            listM = CollectionsKt__CollectionsKt.E();
        }
        return CollectionsKt___CollectionsKt.y4(argumentList, listM);
    }

    public static /* synthetic */ j0 n(TypeDeserializer typeDeserializer, ProtoBuf.Type type, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return typeDeserializer.l(type, z10);
    }

    private final w0 o(List<? extends v0> list, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, z0 z0Var, kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((v0) it.next()).a(eVar, z0Var, kVar));
        }
        return w0.f128193c.g(kotlin.collections.t.a0(arrayList));
    }

    private final j0 p(d0 d0Var) {
        d0 type;
        c1 c1Var = (c1) CollectionsKt___CollectionsKt.q3(kotlin.reflect.jvm.internal.impl.builtins.f.l(d0Var));
        if (c1Var == null || (type = c1Var.getType()) == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = type.O0().d();
        kotlin.reflect.jvm.internal.impl.name.c cVarL = fVarD != null ? DescriptorUtilsKt.l(fVarD) : null;
        if (type.M0().size() != 1 || (!f0.g(cVarL, kotlin.reflect.jvm.internal.impl.builtins.h.f125407p) && !f0.g(cVarL, x.f127921a))) {
            return (j0) d0Var;
        }
        d0 type2 = ((c1) CollectionsKt___CollectionsKt.c5(type.M0())).getType();
        f0.o(type2, "continuationArgumentType.arguments.single().type");
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarE = this.f127704a.e();
        if (!(kVarE instanceof kotlin.reflect.jvm.internal.impl.descriptors.a)) {
            kVarE = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.descriptors.a) kVarE;
        return f0.g(aVar != null ? DescriptorUtilsKt.h(aVar) : null, w.f127919a) ? g(d0Var, type2) : g(d0Var, type2);
    }

    private final c1 r(y0 y0Var, ProtoBuf.Type.Argument argument) {
        if (argument.y() == ProtoBuf.Type.Argument.Projection.STAR) {
            return y0Var == null ? new o0(this.f127704a.c().p().t()) : new StarProjectionImpl(y0Var);
        }
        u uVar = u.f127907a;
        ProtoBuf.Type.Argument.Projection projectionY = argument.y();
        f0.o(projectionY, "typeArgumentProto.projection");
        Variance varianceC = uVar.c(projectionY);
        ProtoBuf.Type typeP = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.p(argument, this.f127704a.j());
        return typeP == null ? new e1(kotlin.reflect.jvm.internal.impl.types.error.h.d(ErrorTypeKind.NO_RECORDED_TYPE, argument.toString())) : new e1(varianceC, q(typeP));
    }

    private final z0 s(ProtoBuf.Type type) {
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarInvoke;
        Object next;
        if (type.m0()) {
            fVarInvoke = this.f127708e.invoke(Integer.valueOf(type.X()));
            if (fVarInvoke == null) {
                fVarInvoke = t(this, type, type.X());
            }
        } else if (type.v0()) {
            fVarInvoke = k(type.i0());
            if (fVarInvoke == null) {
                return kotlin.reflect.jvm.internal.impl.types.error.h.f128123a.e(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(type.i0()), this.f127707d);
            }
        } else if (type.w0()) {
            String string = this.f127704a.g().getString(type.j0());
            Iterator<T> it = j().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!f0.g(((y0) next).getName().b(), string));
            fVarInvoke = (y0) next;
            if (fVarInvoke == null) {
                return kotlin.reflect.jvm.internal.impl.types.error.h.f128123a.e(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, this.f127704a.e().toString());
            }
        } else {
            if (!type.u0()) {
                return kotlin.reflect.jvm.internal.impl.types.error.h.f128123a.e(ErrorTypeKind.UNKNOWN_TYPE, new String[0]);
            }
            fVarInvoke = this.f127709f.invoke(Integer.valueOf(type.h0()));
            if (fVarInvoke == null) {
                fVarInvoke = t(this, type, type.h0());
            }
        }
        z0 z0VarR = fVarInvoke.r();
        f0.o(z0VarR, "classifier.typeConstructor");
        return z0VarR;
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.d t(final TypeDeserializer typeDeserializer, ProtoBuf.Type type, int i10) {
        kotlin.reflect.jvm.internal.impl.name.b bVarA = r.a(typeDeserializer.f127704a.g(), i10);
        List<Integer> listD3 = SequencesKt___SequencesKt.d3(SequencesKt___SequencesKt.k1(SequencesKt__SequencesKt.l(type, new yh.l<ProtoBuf.Type, ProtoBuf.Type>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProtoBuf.Type invoke(@dl.d ProtoBuf.Type it) {
                f0.p(it, "it");
                return kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.j(it, this.f127716b.f127704a.j());
            }
        }), new yh.l<ProtoBuf.Type, Integer>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(@dl.d ProtoBuf.Type it) {
                f0.p(it, "it");
                return Integer.valueOf(it.V());
            }
        }));
        int iG0 = SequencesKt___SequencesKt.g0(SequencesKt__SequencesKt.l(bVarA, TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1.f127715d));
        while (listD3.size() < iG0) {
            listD3.add(0);
        }
        return typeDeserializer.f127704a.c().q().d(bVarA, listD3);
    }

    @dl.d
    public final List<y0> j() {
        return CollectionsKt___CollectionsKt.Q5(this.f127710g.values());
    }

    @dl.d
    public final j0 l(@dl.d final ProtoBuf.Type proto, boolean z10) {
        j0 j0VarL;
        j0 j0VarJ;
        f0.p(proto, "proto");
        j0 j0VarE = proto.m0() ? e(proto.X()) : proto.u0() ? e(proto.h0()) : null;
        if (j0VarE != null) {
            return j0VarE;
        }
        z0 z0VarS = s(proto);
        boolean z11 = true;
        if (kotlin.reflect.jvm.internal.impl.types.error.h.m(z0VarS.d())) {
            return kotlin.reflect.jvm.internal.impl.types.error.h.f128123a.c(ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, z0VarS, z0VarS.toString());
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b bVar = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b(this.f127704a.h(), new yh.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$simpleType$annotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
                return this.f127712b.f127704a.c().d().h(proto, this.f127712b.f127704a.g());
            }
        });
        w0 w0VarO = o(this.f127704a.c().v(), bVar, z0VarS, this.f127704a.e());
        List<ProtoBuf.Type.Argument> listM = m(proto, this);
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listM, 10));
        int i10 = 0;
        for (Object obj : listM) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            List<y0> parameters = z0VarS.getParameters();
            f0.o(parameters, "constructor.parameters");
            arrayList.add(r((y0) CollectionsKt___CollectionsKt.R2(parameters, i10), (ProtoBuf.Type.Argument) obj));
            i10 = i11;
        }
        List<? extends c1> listQ5 = CollectionsKt___CollectionsKt.Q5(arrayList);
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = z0VarS.d();
        if (z10 && (fVarD instanceof x0)) {
            KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.f127993a;
            j0 j0VarB = KotlinTypeFactory.b((x0) fVarD, listQ5);
            w0 w0VarO2 = o(this.f127704a.c().v(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.a(CollectionsKt___CollectionsKt.u4(bVar, j0VarB.getAnnotations())), z0VarS, this.f127704a.e());
            if (!e0.b(j0VarB) && !proto.e0()) {
                z11 = false;
            }
            j0VarL = j0VarB.V0(z11).U0(w0VarO2);
        } else {
            Boolean boolD = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127034a.d(proto.a0());
            f0.o(boolD, "SUSPEND_TYPE.get(proto.flags)");
            if (boolD.booleanValue()) {
                j0VarL = h(w0VarO, z0VarS, listQ5, proto.e0());
            } else {
                j0VarL = KotlinTypeFactory.l(w0VarO, z0VarS, listQ5, proto.e0(), null, 16, null);
                Boolean boolD2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127035b.d(proto.a0());
                f0.o(boolD2, "DEFINITELY_NOT_NULL_TYPE.get(proto.flags)");
                if (boolD2.booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.types.n nVarB = kotlin.reflect.jvm.internal.impl.types.n.f128155e.b(j0VarL, true);
                    if (nVarB == null) {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + j0VarL + '\'').toString());
                    }
                    j0VarL = nVarB;
                }
            }
        }
        ProtoBuf.Type typeA = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.a(proto, this.f127704a.j());
        if (typeA != null && (j0VarJ = n0.j(j0VarL, l(typeA, false))) != null) {
            j0VarL = j0VarJ;
        }
        return proto.m0() ? this.f127704a.c().t().a(r.a(this.f127704a.g(), proto.X()), j0VarL) : j0VarL;
    }

    @dl.d
    public final d0 q(@dl.d ProtoBuf.Type proto) {
        f0.p(proto, "proto");
        if (!proto.o0()) {
            return l(proto, true);
        }
        String string = this.f127704a.g().getString(proto.b0());
        j0 j0VarN = n(this, proto, false, 2, null);
        ProtoBuf.Type typeF = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.f(proto, this.f127704a.j());
        f0.m(typeF);
        return this.f127704a.c().l().a(proto, string, j0VarN, n(this, typeF, false, 2, null));
    }

    @dl.d
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f127706c);
        if (this.f127705b == null) {
            str = "";
        } else {
            str = ". Child of " + this.f127705b.f127706c;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
