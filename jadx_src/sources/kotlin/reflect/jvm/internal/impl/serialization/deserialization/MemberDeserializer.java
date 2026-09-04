package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: MemberDeserializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class MemberDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final j f127675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final c f127676b;

    public MemberDeserializer(@dl.d j c10) {
        f0.p(c10, "c");
        this.f127675a = c10;
        this.f127676b = new c(c10.c().p(), c10.c().q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t c(kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        if (kVar instanceof g0) {
            return new t.b(((g0) kVar).e(), this.f127675a.g(), this.f127675a.j(), this.f127675a.d());
        }
        if (kVar instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) kVar).g1();
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.e d(final kotlin.reflect.jvm.internal.impl.protobuf.n nVar, int i10, final AnnotatedCallableKind annotatedCallableKind) {
        return !kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127036c.d(i10).booleanValue() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b() : new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k(this.f127675a.h(), new yh.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getAnnotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
                List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> listQ5;
                MemberDeserializer memberDeserializer = this.f127677b;
                t tVarC = memberDeserializer.c(memberDeserializer.f127675a.e());
                if (tVarC != null) {
                    listQ5 = CollectionsKt___CollectionsKt.Q5(this.f127677b.f127675a.c().d().i(tVarC, nVar, annotatedCallableKind));
                } else {
                    listQ5 = null;
                }
                return listQ5 == null ? CollectionsKt__CollectionsKt.E() : listQ5;
            }
        });
    }

    private final r0 e() {
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarE = this.f127675a.e();
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = kVarE instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) kVarE : null;
        if (dVar != null) {
            return dVar.b0();
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.e f(final ProtoBuf.Property property, final boolean z10) {
        return !kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127036c.d(property.b0()).booleanValue() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b() : new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k(this.f127675a.h(), new yh.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getPropertyFieldAnnotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
                List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> listQ5;
                MemberDeserializer memberDeserializer = this.f127680b;
                t tVarC = memberDeserializer.c(memberDeserializer.f127675a.e());
                if (tVarC != null) {
                    boolean z11 = z10;
                    MemberDeserializer memberDeserializer2 = this.f127680b;
                    ProtoBuf.Property property2 = property;
                    listQ5 = z11 ? CollectionsKt___CollectionsKt.Q5(memberDeserializer2.f127675a.c().d().k(tVarC, property2)) : CollectionsKt___CollectionsKt.Q5(memberDeserializer2.f127675a.c().d().f(tVarC, property2));
                } else {
                    listQ5 = null;
                }
                return listQ5 == null ? CollectionsKt__CollectionsKt.E() : listQ5;
            }
        });
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.e g(final kotlin.reflect.jvm.internal.impl.protobuf.n nVar, final AnnotatedCallableKind annotatedCallableKind) {
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b(this.f127675a.h(), new yh.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getReceiverParameterAnnotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
                List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> listG;
                MemberDeserializer memberDeserializer = this.f127683b;
                t tVarC = memberDeserializer.c(memberDeserializer.f127675a.e());
                if (tVarC != null) {
                    listG = this.f127683b.f127675a.c().d().g(tVarC, nVar, annotatedCallableKind);
                } else {
                    listG = null;
                }
                return listG == null ? CollectionsKt__CollectionsKt.E() : listG;
            }
        });
    }

    private final void h(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i iVar, r0 r0Var, r0 r0Var2, List<? extends r0> list, List<? extends y0> list2, List<? extends b1> list3, d0 d0Var, Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.s sVar, Map<? extends kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<?>, ?> map) {
        iVar.p1(r0Var, r0Var2, list, list2, list3, d0Var, modality, sVar, map);
    }

    private final int k(int i10) {
        return (i10 & 63) + ((i10 >> 8) << 6);
    }

    private final r0 n(ProtoBuf.Type type, j jVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        return kotlin.reflect.jvm.internal.impl.resolve.c.b(aVar, jVar.i().q(type), null, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0085  */
    private final List<b1> o(List<ProtoBuf.ValueParameter> list, final kotlin.reflect.jvm.internal.impl.protobuf.n nVar, final AnnotatedCallableKind annotatedCallableKind) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVarB;
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarE = this.f127675a.e();
        f0.n(kVarE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        kotlin.reflect.jvm.internal.impl.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.descriptors.a) kVarE;
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = aVar.c();
        f0.o(kVarC, "callableDescriptor.containingDeclaration");
        final t tVarC = c(kVarC);
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            final ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) obj;
            int iL = valueParameter.R() ? valueParameter.L() : 0;
            if (tVarC != null) {
                Boolean boolD = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127036c.d(iL);
                f0.o(boolD, "HAS_ANNOTATIONS.get(flags)");
                if (boolD.booleanValue()) {
                    final int i12 = i10;
                    eVarB = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k(this.f127675a.h(), new yh.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$valueParameters$1$annotations$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
                            return CollectionsKt___CollectionsKt.Q5(this.f127698b.f127675a.c().d().a(tVarC, nVar, annotatedCallableKind, i12, valueParameter));
                        }
                    });
                } else {
                    eVarB = kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b();
                }
            } else {
                eVarB = kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b();
            }
            kotlin.reflect.jvm.internal.impl.name.f fVarB = r.b(this.f127675a.g(), valueParameter.M());
            d0 d0VarQ = this.f127675a.i().q(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.q(valueParameter, this.f127675a.j()));
            Boolean boolD2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.G.d(iL);
            f0.o(boolD2, "DECLARES_DEFAULT_VALUE.get(flags)");
            boolean zBooleanValue = boolD2.booleanValue();
            Boolean boolD3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.H.d(iL);
            f0.o(boolD3, "IS_CROSSINLINE.get(flags)");
            boolean zBooleanValue2 = boolD3.booleanValue();
            Boolean boolD4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.I.d(iL);
            f0.o(boolD4, "IS_NOINLINE.get(flags)");
            boolean zBooleanValue3 = boolD4.booleanValue();
            ProtoBuf.Type typeT = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.t(valueParameter, this.f127675a.j());
            d0 d0VarQ2 = typeT != null ? this.f127675a.i().q(typeT) : null;
            t0 NO_SOURCE = t0.f125942a;
            f0.o(NO_SOURCE, "NO_SOURCE");
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new ValueParameterDescriptorImpl(aVar, null, i10, eVarB, fVarB, d0VarQ, zBooleanValue, zBooleanValue2, zBooleanValue3, d0VarQ2, NO_SOURCE));
            arrayList = arrayList2;
            i10 = i11;
        }
        return CollectionsKt___CollectionsKt.Q5(arrayList);
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.c i(@dl.d ProtoBuf.Constructor proto, boolean z10) {
        f0.p(proto, "proto");
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarE = this.f127675a.e();
        f0.n(kVarE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) kVarE;
        int iK = proto.K();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d dVar2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d(dVar, null, d(proto, iK, annotatedCallableKind), z10, CallableMemberDescriptor.Kind.DECLARATION, proto, this.f127675a.g(), this.f127675a.j(), this.f127675a.k(), this.f127675a.d(), null, 1024, null);
        MemberDeserializer memberDeserializerF = j.b(this.f127675a, dVar2, CollectionsKt__CollectionsKt.E(), null, null, null, null, 60, null).f();
        List<ProtoBuf.ValueParameter> listN = proto.N();
        f0.o(listN, "proto.valueParameterList");
        dVar2.r1(memberDeserializerF.o(listN, proto, annotatedCallableKind), v.a(u.f127907a, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127037d.d(proto.K())));
        dVar2.h1(dVar.v());
        dVar2.X0(dVar.w0());
        dVar2.Z0(!kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127047n.d(proto.K()).booleanValue());
        return dVar2;
    }

    @dl.d
    public final s0 j(@dl.d ProtoBuf.Function proto) {
        d0 d0VarQ;
        f0.p(proto, "proto");
        int iD0 = proto.t0() ? proto.d0() : k(proto.f0());
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVarD = d(proto, iD0, annotatedCallableKind);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVarG = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.g(proto) ? g(proto, annotatedCallableKind) : kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b();
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i iVar = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i(this.f127675a.e(), null, eVarD, r.b(this.f127675a.g(), proto.e0()), v.b(u.f127907a, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127048o.d(iD0)), proto, this.f127675a.g(), this.f127675a.j(), f0.g(DescriptorUtilsKt.l(this.f127675a.e()).c(r.b(this.f127675a.g(), proto.e0())), w.f127919a) ? kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f127067b.b() : this.f127675a.k(), this.f127675a.d(), null, 1024, null);
        j jVar = this.f127675a;
        List<ProtoBuf.TypeParameter> listM0 = proto.m0();
        f0.o(listM0, "proto.typeParameterList");
        j jVarB = j.b(jVar, iVar, listM0, null, null, null, null, 60, null);
        ProtoBuf.Type typeK = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.k(proto, this.f127675a.j());
        r0 r0VarI = (typeK == null || (d0VarQ = jVarB.i().q(typeK)) == null) ? null : kotlin.reflect.jvm.internal.impl.resolve.c.i(iVar, d0VarQ, eVarG);
        r0 r0VarE = e();
        List<ProtoBuf.Type> listC = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.c(proto, this.f127675a.j());
        List<? extends r0> arrayList = new ArrayList<>();
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            r0 r0VarN = n((ProtoBuf.Type) it.next(), jVarB, iVar);
            if (r0VarN != null) {
                arrayList.add(r0VarN);
            }
        }
        List<y0> listJ = jVarB.i().j();
        MemberDeserializer memberDeserializerF = jVarB.f();
        List<ProtoBuf.ValueParameter> listQ0 = proto.q0();
        f0.o(listQ0, "proto.valueParameterList");
        List<b1> listO = memberDeserializerF.o(listQ0, proto, AnnotatedCallableKind.FUNCTION);
        d0 d0VarQ2 = jVarB.i().q(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.m(proto, this.f127675a.j()));
        u uVar = u.f127907a;
        h(iVar, r0VarI, r0VarE, arrayList, listJ, listO, d0VarQ2, uVar.b(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127038e.d(iD0)), v.a(uVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127037d.d(iD0)), kotlin.collections.s0.z());
        Boolean boolD = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127049p.d(iD0);
        f0.o(boolD, "IS_OPERATOR.get(flags)");
        iVar.g1(boolD.booleanValue());
        Boolean boolD2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127050q.d(iD0);
        f0.o(boolD2, "IS_INFIX.get(flags)");
        iVar.d1(boolD2.booleanValue());
        Boolean boolD3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127053t.d(iD0);
        f0.o(boolD3, "IS_EXTERNAL_FUNCTION.get(flags)");
        iVar.Y0(boolD3.booleanValue());
        Boolean boolD4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127051r.d(iD0);
        f0.o(boolD4, "IS_INLINE.get(flags)");
        iVar.f1(boolD4.booleanValue());
        Boolean boolD5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127052s.d(iD0);
        f0.o(boolD5, "IS_TAILREC.get(flags)");
        iVar.j1(boolD5.booleanValue());
        Boolean boolD6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127054u.d(iD0);
        f0.o(boolD6, "IS_SUSPEND.get(flags)");
        iVar.i1(boolD6.booleanValue());
        Boolean boolD7 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127055v.d(iD0);
        f0.o(boolD7, "IS_EXPECT_FUNCTION.get(flags)");
        iVar.X0(boolD7.booleanValue());
        iVar.Z0(!kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127056w.d(iD0).booleanValue());
        Pair<kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<?>, Object> pairA = this.f127675a.c().h().a(proto, iVar, this.f127675a.j(), jVarB.i());
        if (pairA != null) {
            iVar.V0(pairA.e(), pairA.f());
        }
        return iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public final o0 l(@dl.d ProtoBuf.Property proto) {
        ProtoBuf.Property property;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVarB;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h hVar;
        r0 r0VarI;
        a0 a0Var;
        final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h hVar2;
        final ProtoBuf.Property property2;
        boolean z10;
        b0 b0VarE;
        a0 a0VarD;
        d0 d0VarQ;
        f0.p(proto, "proto");
        int iB0 = proto.p0() ? proto.b0() : k(proto.e0());
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarE = this.f127675a.e();
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVarD = d(proto, iB0, AnnotatedCallableKind.PROPERTY);
        u uVar = u.f127907a;
        Modality modalityB = uVar.b(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127038e.d(iB0));
        kotlin.reflect.jvm.internal.impl.descriptors.s sVarA = v.a(uVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127037d.d(iB0));
        Boolean boolD = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127057x.d(iB0);
        f0.o(boolD, "IS_VAR.get(flags)");
        boolean zBooleanValue = boolD.booleanValue();
        kotlin.reflect.jvm.internal.impl.name.f fVarB = r.b(this.f127675a.g(), proto.d0());
        CallableMemberDescriptor.Kind kindB = v.b(uVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127048o.d(iB0));
        Boolean boolD2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.B.d(iB0);
        f0.o(boolD2, "IS_LATEINIT.get(flags)");
        boolean zBooleanValue2 = boolD2.booleanValue();
        Boolean boolD3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.A.d(iB0);
        f0.o(boolD3, "IS_CONST.get(flags)");
        boolean zBooleanValue3 = boolD3.booleanValue();
        Boolean boolD4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.D.d(iB0);
        f0.o(boolD4, "IS_EXTERNAL_PROPERTY.get(flags)");
        boolean zBooleanValue4 = boolD4.booleanValue();
        Boolean boolD5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.E.d(iB0);
        f0.o(boolD5, "IS_DELEGATED.get(flags)");
        boolean zBooleanValue5 = boolD5.booleanValue();
        Boolean boolD6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.F.d(iB0);
        f0.o(boolD6, "IS_EXPECT_PROPERTY.get(flags)");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h hVar3 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h(kVarE, null, eVarD, modalityB, sVarA, zBooleanValue, fVarB, kindB, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, boolD6.booleanValue(), proto, this.f127675a.g(), this.f127675a.j(), this.f127675a.k(), this.f127675a.d());
        j jVar = this.f127675a;
        List<ProtoBuf.TypeParameter> listN0 = proto.n0();
        f0.o(listN0, "proto.typeParameterList");
        j jVarB = j.b(jVar, hVar3, listN0, null, null, null, null, 60, null);
        Boolean boolD7 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127058y.d(iB0);
        f0.o(boolD7, "HAS_GETTER.get(flags)");
        boolean zBooleanValue6 = boolD7.booleanValue();
        if (zBooleanValue6 && kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.h(proto)) {
            property = proto;
            eVarB = g(property, AnnotatedCallableKind.PROPERTY_GETTER);
        } else {
            property = proto;
            eVarB = kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b();
        }
        d0 d0VarQ2 = jVarB.i().q(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.n(property, this.f127675a.j()));
        List<y0> listJ = jVarB.i().j();
        r0 r0VarE = e();
        ProtoBuf.Type typeL = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.l(property, this.f127675a.j());
        if (typeL == null || (d0VarQ = jVarB.i().q(typeL)) == null) {
            hVar = hVar3;
            r0VarI = null;
        } else {
            hVar = hVar3;
            r0VarI = kotlin.reflect.jvm.internal.impl.resolve.c.i(hVar, d0VarQ, eVarB);
        }
        List<ProtoBuf.Type> listD = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.d(property, this.f127675a.j());
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(n((ProtoBuf.Type) it.next(), jVarB, hVar));
        }
        hVar.d1(d0VarQ2, listJ, r0VarE, r0VarI, arrayList);
        Boolean boolD8 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127036c.d(iB0);
        f0.o(boolD8, "HAS_ANNOTATIONS.get(flags)");
        boolean zBooleanValue7 = boolD8.booleanValue();
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d<ProtoBuf.Visibility> dVar = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127037d;
        ProtoBuf.Visibility visibilityD = dVar.d(iB0);
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d<ProtoBuf.Modality> dVar2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127038e;
        int iB = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.b(zBooleanValue7, visibilityD, dVar2.d(iB0), false, false, false);
        if (zBooleanValue6) {
            int iC0 = proto.q0() ? proto.c0() : iB;
            Boolean boolD9 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.J.d(iC0);
            f0.o(boolD9, "IS_NOT_DEFAULT.get(getterFlags)");
            boolean zBooleanValue8 = boolD9.booleanValue();
            Boolean boolD10 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.K.d(iC0);
            f0.o(boolD10, "IS_EXTERNAL_ACCESSOR.get(getterFlags)");
            boolean zBooleanValue9 = boolD10.booleanValue();
            Boolean boolD11 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.L.d(iC0);
            f0.o(boolD11, "IS_INLINE_ACCESSOR.get(getterFlags)");
            boolean zBooleanValue10 = boolD11.booleanValue();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVarD2 = d(property, iC0, AnnotatedCallableKind.PROPERTY_GETTER);
            if (zBooleanValue8) {
                u uVar2 = u.f127907a;
                a0VarD = new a0(hVar, eVarD2, uVar2.b(dVar2.d(iC0)), v.a(uVar2, dVar.d(iC0)), !zBooleanValue8, zBooleanValue9, zBooleanValue10, hVar.b(), null, t0.f125942a);
            } else {
                a0VarD = kotlin.reflect.jvm.internal.impl.resolve.c.d(hVar, eVarD2);
                f0.o(a0VarD, "{\n                Descri…nnotations)\n            }");
            }
            a0VarD.R0(hVar.getReturnType());
            a0Var = a0VarD;
        } else {
            dVar = dVar;
            jVarB = jVarB;
            dVar2 = dVar2;
            a0Var = null;
        }
        Boolean boolD12 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127059z.d(iB0);
        f0.o(boolD12, "HAS_SETTER.get(flags)");
        if (boolD12.booleanValue()) {
            if (proto.x0()) {
                iB = proto.j0();
            }
            int i10 = iB;
            Boolean boolD13 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.J.d(i10);
            f0.o(boolD13, "IS_NOT_DEFAULT.get(setterFlags)");
            boolean zBooleanValue11 = boolD13.booleanValue();
            Boolean boolD14 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.K.d(i10);
            f0.o(boolD14, "IS_EXTERNAL_ACCESSOR.get(setterFlags)");
            boolean zBooleanValue12 = boolD14.booleanValue();
            Boolean boolD15 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.L.d(i10);
            f0.o(boolD15, "IS_INLINE_ACCESSOR.get(setterFlags)");
            boolean zBooleanValue13 = boolD15.booleanValue();
            AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_SETTER;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVarD3 = d(property, i10, annotatedCallableKind);
            if (zBooleanValue11) {
                u uVar3 = u.f127907a;
                b0 b0Var = new b0(hVar, eVarD3, uVar3.b(dVar2.d(i10)), v.a(uVar3, dVar.d(i10)), !zBooleanValue11, zBooleanValue12, zBooleanValue13, hVar.b(), null, t0.f125942a);
                z10 = true;
                hVar2 = hVar;
                property2 = property;
                b0Var.S0((b1) CollectionsKt___CollectionsKt.c5(j.b(jVarB, b0Var, CollectionsKt__CollectionsKt.E(), null, null, null, null, 60, null).f().o(kotlin.collections.s.k(proto.k0()), property2, annotatedCallableKind)));
                b0VarE = b0Var;
            } else {
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h hVar4 = hVar;
                property2 = property;
                z10 = true;
                b0VarE = kotlin.reflect.jvm.internal.impl.resolve.c.e(hVar4, eVarD3, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b());
                f0.o(b0VarE, "{\n                Descri…          )\n            }");
                hVar2 = hVar4;
            }
        } else {
            hVar2 = hVar;
            property2 = property;
            z10 = true;
            b0VarE = null;
        }
        Boolean boolD16 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.C.d(iB0);
        f0.o(boolD16, "HAS_CONSTANT.get(flags)");
        if (boolD16.booleanValue()) {
            hVar2.N0(new yh.a<kotlin.reflect.jvm.internal.impl.storage.i<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> invoke() {
                    kotlin.reflect.jvm.internal.impl.storage.m mVarH = this.f127686b.f127675a.h();
                    final MemberDeserializer memberDeserializer = this.f127686b;
                    final ProtoBuf.Property property3 = property2;
                    final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h hVar5 = hVar2;
                    return mVarH.b(new yh.a<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$4.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.e
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> invoke() {
                            MemberDeserializer memberDeserializer2 = memberDeserializer;
                            t tVarC = memberDeserializer2.c(memberDeserializer2.f127675a.e());
                            f0.m(tVarC);
                            a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> aVarD = memberDeserializer.f127675a.c().d();
                            ProtoBuf.Property property4 = property3;
                            d0 returnType = hVar5.getReturnType();
                            f0.o(returnType, "property.returnType");
                            return aVarD.e(tVarC, property4, returnType);
                        }
                    });
                }
            });
        }
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarE2 = this.f127675a.e();
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar3 = kVarE2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) kVarE2 : null;
        if ((dVar3 != null ? dVar3.b() : null) == ClassKind.ANNOTATION_CLASS) {
            hVar2.N0(new yh.a<kotlin.reflect.jvm.internal.impl.storage.i<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> invoke() {
                    kotlin.reflect.jvm.internal.impl.storage.m mVarH = this.f127692b.f127675a.h();
                    final MemberDeserializer memberDeserializer = this.f127692b;
                    final ProtoBuf.Property property3 = property2;
                    final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h hVar5 = hVar2;
                    return mVarH.b(new yh.a<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$5.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.e
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> invoke() {
                            MemberDeserializer memberDeserializer2 = memberDeserializer;
                            t tVarC = memberDeserializer2.c(memberDeserializer2.f127675a.e());
                            f0.m(tVarC);
                            a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> aVarD = memberDeserializer.f127675a.c().d();
                            ProtoBuf.Property property4 = property3;
                            d0 returnType = hVar5.getReturnType();
                            f0.o(returnType, "property.returnType");
                            return aVarD.j(tVarC, property4, returnType);
                        }
                    });
                }
            });
        }
        hVar2.X0(a0Var, b0VarE, new kotlin.reflect.jvm.internal.impl.descriptors.impl.n(f(property2, false), hVar2), new kotlin.reflect.jvm.internal.impl.descriptors.impl.n(f(property2, z10), hVar2));
        return hVar2;
    }

    @dl.d
    public final x0 m(@dl.d ProtoBuf.TypeAlias proto) {
        f0.p(proto, "proto");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1;
        List<ProtoBuf.Annotation> listR = proto.R();
        f0.o(listR, "proto.annotationList");
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listR, 10));
        for (ProtoBuf.Annotation it : listR) {
            c cVar = this.f127676b;
            f0.o(it, "it");
            arrayList.add(cVar.a(it, this.f127675a.g()));
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.j jVar = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.j(this.f127675a.h(), this.f127675a.e(), aVar.a(arrayList), r.b(this.f127675a.g(), proto.X()), v.a(u.f127907a, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127037d.d(proto.W())), proto, this.f127675a.g(), this.f127675a.j(), this.f127675a.k(), this.f127675a.d());
        j jVar2 = this.f127675a;
        List<ProtoBuf.TypeParameter> listA0 = proto.a0();
        f0.o(listA0, "proto.typeParameterList");
        j jVarB = j.b(jVar2, jVar, listA0, null, null, null, null, 60, null);
        jVar.R0(jVarB.i().j(), jVarB.i().l(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.r(proto, this.f127675a.j()), false), jVarB.i().l(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.e(proto, this.f127675a.j()), false));
        return jVar;
    }
}
