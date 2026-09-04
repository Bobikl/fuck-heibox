package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.c1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.q;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.x;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.load.kotlin.s;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: signatureEnhancement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class SignatureEnhancement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final c f126377a;

    public SignatureEnhancement(@dl.d c typeEnhancement) {
        f0.p(typeEnhancement, "typeEnhancement");
        this.f126377a = typeEnhancement;
    }

    private final boolean a(d0 d0Var) {
        return i1.c(d0Var, new yh.l<l1, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$containsFunctionN$1
            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(l1 l1Var) {
                kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = l1Var.O0().d();
                if (fVarD == null) {
                    return Boolean.FALSE;
                }
                kotlin.reflect.jvm.internal.impl.name.f name = fVarD.getName();
                kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f125524a;
                return Boolean.valueOf(f0.g(name, cVar.h().g()) && f0.g(DescriptorUtilsKt.h(fVarD), cVar.h()));
            }
        });
    }

    private final d0 b(CallableMemberDescriptor callableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z10, kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, k kVar, boolean z11, yh.l<? super CallableMemberDescriptor, ? extends d0> lVar) {
        i iVar = new i(aVar, z10, dVar, annotationQualifierApplicabilityType, false, 16, null);
        d0 d0VarInvoke = lVar.invoke(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.f();
        f0.o(overriddenDescriptors, "overriddenDescriptors");
        ArrayList arrayList = new ArrayList(t.Y(overriddenDescriptors, 10));
        for (CallableMemberDescriptor it : overriddenDescriptors) {
            f0.o(it, "it");
            arrayList.add(lVar.invoke(it));
        }
        return c(iVar, d0VarInvoke, arrayList, kVar, z11);
    }

    private final d0 c(i iVar, d0 d0Var, List<? extends d0> list, k kVar, boolean z10) {
        return this.f126377a.a(d0Var, iVar.b(d0Var, list, kVar, z10), iVar.u());
    }

    static /* synthetic */ d0 d(SignatureEnhancement signatureEnhancement, CallableMemberDescriptor callableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z10, kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, k kVar, boolean z11, yh.l lVar, int i10, Object obj) {
        return signatureEnhancement.b(callableMemberDescriptor, aVar, z10, dVar, annotationQualifierApplicabilityType, kVar, (i10 & 32) != 0 ? false : z11, lVar);
    }

    static /* synthetic */ d0 e(SignatureEnhancement signatureEnhancement, i iVar, d0 d0Var, List list, k kVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            kVar = null;
        }
        k kVar2 = kVar;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return signatureEnhancement.c(iVar, d0Var, list, kVar2, z10);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    private final <D extends CallableMemberDescriptor> D f(D d10, kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar) {
        D d11;
        d0 d0VarJ;
        g gVar;
        boolean z10;
        d0 type;
        boolean z11;
        d0 type2;
        List<k> listA;
        if (!(d10 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.a)) {
            return d10;
        }
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.a) d10;
        boolean z12 = true;
        if (aVar.b() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && aVar.a().f().size() == 1) {
            return d10;
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVarH = ContextKt.h(dVar, k(d10, dVar));
        if (d10 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) {
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) d10;
            a0 a0VarT0 = eVar.getGetter();
            if ((a0VarT0 == null || a0VarT0.e0()) ? false : true) {
                a0 a0VarT1 = eVar.getGetter();
                f0.m(a0VarT1);
                d11 = a0VarT1;
            } else {
                d11 = d10;
            }
        } else {
            d11 = d10;
        }
        if (aVar.l0() != null) {
            w wVar = (w) (!(d11 instanceof w) ? null : d11);
            d0VarJ = j(d10, wVar != null ? (b1) wVar.S(JavaMethodDescriptor.H) : null, dVarH, null, false, new yh.l<CallableMemberDescriptor, d0>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d0 invoke(@dl.d CallableMemberDescriptor it) {
                    f0.p(it, "it");
                    r0 r0VarL0 = it.l0();
                    f0.m(r0VarL0);
                    d0 type3 = r0VarL0.getType();
                    f0.o(type3, "it.extensionReceiverParameter!!.type");
                    return type3;
                }
            });
        } else {
            d0VarJ = null;
        }
        JavaMethodDescriptor javaMethodDescriptor = d10 instanceof JavaMethodDescriptor ? (JavaMethodDescriptor) d10 : null;
        if (javaMethodDescriptor != null) {
            SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f126464a;
            kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = javaMethodDescriptor.c();
            f0.n(kVarC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            String strA = s.a(signatureBuildingComponents, (kotlin.reflect.jvm.internal.impl.descriptors.d) kVarC, kotlin.reflect.jvm.internal.impl.load.kotlin.t.c(javaMethodDescriptor, false, false, 3, null));
            if (strA != null) {
                gVar = PredefinedEnhancementInfoKt.d().get(strA);
            } else {
                gVar = null;
            }
        } else {
            gVar = null;
        }
        if (gVar != null) {
            gVar.a().size();
            aVar.i().size();
        }
        boolean z13 = (x.c(dVar.a().i()) || dVarH.a().q().b()) && x.b(d10);
        List<b1> listI = d11.i();
        f0.o(listI, "annotationOwnerForMember.valueParameters");
        char c10 = '\n';
        ArrayList arrayList = new ArrayList(t.Y(listI, 10));
        for (final b1 b1Var : listI) {
            ArrayList arrayList2 = arrayList;
            arrayList2.add(j(d10, b1Var, dVarH, (gVar == null || (listA = gVar.a()) == null) ? null : (k) CollectionsKt___CollectionsKt.R2(listA, b1Var.getIndex()), z13, new yh.l<CallableMemberDescriptor, d0>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d0 invoke(@dl.d CallableMemberDescriptor it) {
                    f0.p(it, "it");
                    d0 type3 = it.i().get(b1Var.getIndex()).getType();
                    f0.o(type3, "it.valueParameters[p.index].type");
                    return type3;
                }
            }));
            arrayList = arrayList2;
            c10 = '\n';
        }
        ArrayList arrayList3 = arrayList;
        o0 o0Var = (o0) (!(d10 instanceof o0) ? null : d10);
        d0 d0VarD = d(this, d10, d11, true, dVarH, o0Var != null && kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b.a(o0Var) ? AnnotationQualifierApplicabilityType.FIELD : AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE, gVar != null ? gVar.b() : null, false, new yh.l<CallableMemberDescriptor, d0>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d0 invoke(@dl.d CallableMemberDescriptor it) {
                f0.p(it, "it");
                d0 returnType = it.getReturnType();
                f0.m(returnType);
                return returnType;
            }
        }, 32, null);
        d0 returnType = aVar.getReturnType();
        f0.m(returnType);
        if (a(returnType)) {
            z10 = true;
        } else {
            r0 r0VarL0 = aVar.l0();
            if ((r0VarL0 == null || (type2 = r0VarL0.getType()) == null) ? false : a(type2)) {
                z10 = true;
            } else {
                List<b1> valueParameters = aVar.i();
                f0.o(valueParameters, "valueParameters");
                if (!(valueParameters instanceof Collection) || !valueParameters.isEmpty()) {
                    Iterator<T> it = valueParameters.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z11 = false;
                            break;
                        }
                        d0 type3 = ((b1) it.next()).getType();
                        f0.o(type3, "it.type");
                        if (a(type3)) {
                            z11 = true;
                            break;
                        }
                    }
                } else {
                    z11 = false;
                    break;
                }
                if (z11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        Pair<kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<?>, ?> pairA = z10 ? c1.a(kotlin.reflect.jvm.internal.impl.resolve.deprecation.c.a(), new kotlin.reflect.jvm.internal.impl.load.java.e(d10)) : null;
        if (d0VarJ == null && d0VarD == null) {
            if (arrayList3.isEmpty()) {
                z12 = false;
                break;
            }
            Iterator it2 = arrayList3.iterator();
            do {
                if (!it2.hasNext()) {
                    z12 = false;
                    break;
                }
            } while (!(((d0) it2.next()) != null));
            if (!z12 && pairA == null) {
                return d10;
            }
        }
        if (d0VarJ == null) {
            r0 r0VarL1 = aVar.l0();
            type = r0VarL1 != null ? r0VarL1.getType() : null;
        } else {
            type = d0VarJ;
        }
        ArrayList arrayList4 = new ArrayList(t.Y(arrayList3, 10));
        int i10 = 0;
        for (Object obj : arrayList3) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            d0 type4 = (d0) obj;
            if (type4 == null) {
                type4 = aVar.i().get(i10).getType();
                f0.o(type4, "valueParameters[index].type");
            }
            arrayList4.add(type4);
            i10 = i11;
        }
        if (d0VarD == null) {
            d0VarD = aVar.getReturnType();
            f0.m(d0VarD);
        }
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.a aVarQ0 = aVar.q0(type, arrayList4, d0VarD, pairA);
        f0.n(aVarQ0, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
        return aVarQ0;
    }

    private final d0 j(CallableMemberDescriptor callableMemberDescriptor, b1 b1Var, kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar, k kVar, boolean z10, yh.l<? super CallableMemberDescriptor, ? extends d0> lVar) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVarH;
        return b(callableMemberDescriptor, b1Var, false, (b1Var == null || (dVarH = ContextKt.h(dVar, b1Var.getAnnotations())) == null) ? dVar : dVarH, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, kVar, z10, lVar);
    }

    private final <D extends CallableMemberDescriptor> kotlin.reflect.jvm.internal.impl.descriptors.annotations.e k(D d10, kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarA = q.a(d10);
        if (fVarA == null) {
            return d10.getAnnotations();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptor = fVarA instanceof LazyJavaClassDescriptor ? (LazyJavaClassDescriptor) fVarA : null;
        List<mi.a> listR0 = lazyJavaClassDescriptor != null ? lazyJavaClassDescriptor.R0() : null;
        if (listR0 == null || listR0.isEmpty()) {
            return d10.getAnnotations();
        }
        ArrayList arrayList = new ArrayList(t.Y(listR0, 10));
        Iterator<T> it = listR0.iterator();
        while (it.hasNext()) {
            arrayList.add(new LazyJavaAnnotationDescriptor(dVar, (mi.a) it.next(), true));
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.a(CollectionsKt___CollectionsKt.u4(d10.getAnnotations(), arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public final <D extends CallableMemberDescriptor> Collection<D> g(@dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d c10, @dl.d Collection<? extends D> platformSignatures) {
        f0.p(c10, "c");
        f0.p(platformSignatures, "platformSignatures");
        ArrayList arrayList = new ArrayList(t.Y(platformSignatures, 10));
        Iterator<T> it = platformSignatures.iterator();
        while (it.hasNext()) {
            arrayList.add(f((CallableMemberDescriptor) it.next(), c10));
        }
        return arrayList;
    }

    @dl.d
    public final d0 h(@dl.d d0 type, @dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d context) {
        f0.p(type, "type");
        f0.p(context, "context");
        d0 d0VarE = e(this, new i(null, false, context, AnnotationQualifierApplicabilityType.TYPE_USE, true), type, CollectionsKt__CollectionsKt.E(), null, false, 12, null);
        return d0VarE == null ? type : d0VarE;
    }

    @dl.d
    public final List<d0> i(@dl.d y0 typeParameter, @dl.d List<? extends d0> bounds, @dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d context) {
        d0 d0VarE;
        f0.p(typeParameter, "typeParameter");
        f0.p(bounds, "bounds");
        f0.p(context, "context");
        ArrayList arrayList = new ArrayList(t.Y(bounds, 10));
        for (d0 d0Var : bounds) {
            if (!TypeUtilsKt.b(d0Var, new yh.l<l1, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceTypeParameterBounds$1$1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@dl.d l1 it) {
                    f0.p(it, "it");
                    return Boolean.valueOf(it instanceof i0);
                }
            }) && (d0VarE = e(this, new i(typeParameter, false, context, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, false, 16, null), d0Var, CollectionsKt__CollectionsKt.E(), null, false, 12, null)) != null) {
                d0Var = d0VarE;
            }
            arrayList.add(d0Var);
        }
        return arrayList;
    }
}
