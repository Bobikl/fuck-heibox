package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.compose.material3.TextFieldImplKt;
import com.tencent.qcloud.core.util.IOUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.a;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: AbstractBinaryClassAnnotationLoader.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractBinaryClassAnnotationLoader<A, S extends a<? extends A>> implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.d<A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final m f126452a;

    /* JADX INFO: compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public enum PropertyRelatedElement {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* JADX INFO: compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public static abstract class a<A> {
        @dl.d
        public abstract Map<r, List<A>> a();
    }

    /* JADX INFO: compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f126453a;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f126453a = iArr;
        }
    }

    /* JADX INFO: compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public static final class c implements o.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractBinaryClassAnnotationLoader<A, S> f126454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList<A> f126455b;

        c(AbstractBinaryClassAnnotationLoader<A, S> abstractBinaryClassAnnotationLoader, ArrayList<A> arrayList) {
            this.f126454a = abstractBinaryClassAnnotationLoader;
            this.f126455b = arrayList;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.c
        @dl.e
        public o.a b(@dl.d kotlin.reflect.jvm.internal.impl.name.b classId, @dl.d t0 source) {
            f0.p(classId, "classId");
            f0.p(source, "source");
            return this.f126454a.w(classId, source, this.f126455b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.c
        public void visitEnd() {
        }
    }

    public AbstractBinaryClassAnnotationLoader(@dl.d m kotlinClassFinder) {
        f0.p(kotlinClassFinder, "kotlinClassFinder");
        this.f126452a = kotlinClassFinder;
    }

    private final int l(kotlin.reflect.jvm.internal.impl.serialization.deserialization.t tVar, kotlin.reflect.jvm.internal.impl.protobuf.n nVar) {
        if (nVar instanceof ProtoBuf.Function) {
            if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.g((ProtoBuf.Function) nVar)) {
                return 1;
            }
        } else if (nVar instanceof ProtoBuf.Property) {
            if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.h((ProtoBuf.Property) nVar)) {
                return 1;
            }
        } else {
            if (!(nVar instanceof ProtoBuf.Constructor)) {
                throw new UnsupportedOperationException("Unsupported message: " + nVar.getClass());
            }
            f0.n(tVar, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.t.a aVar = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.t.a) tVar;
            if (aVar.g() == ProtoBuf.Class.Kind.ENUM_CLASS) {
                return 2;
            }
            if (aVar.i()) {
                return 1;
            }
        }
        return 0;
    }

    private final List<A> m(kotlin.reflect.jvm.internal.impl.serialization.deserialization.t tVar, r rVar, boolean z10, boolean z11, Boolean bool, boolean z12) {
        List<A> list;
        o oVarO = o(tVar, t(tVar, z10, z11, bool, z12));
        return (oVarO == null || (list = p(oVarO).a().get(rVar)) == null) ? CollectionsKt__CollectionsKt.E() : list;
    }

    static /* synthetic */ List n(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, kotlin.reflect.jvm.internal.impl.serialization.deserialization.t tVar, r rVar, boolean z10, boolean z11, Boolean bool, boolean z12, int i10, Object obj) {
        if (obj == null) {
            return abstractBinaryClassAnnotationLoader.m(tVar, rVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? false : z12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    public static /* synthetic */ r s(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, kotlin.reflect.jvm.internal.impl.protobuf.n nVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, AnnotatedCallableKind annotatedCallableKind, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return abstractBinaryClassAnnotationLoader.r(nVar, cVar, gVar, annotatedCallableKind, z10);
    }

    private final List<A> x(kotlin.reflect.jvm.internal.impl.serialization.deserialization.t tVar, ProtoBuf.Property property, PropertyRelatedElement propertyRelatedElement) {
        Boolean boolD = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.A.d(property.b0());
        f0.o(boolD, "IS_CONST.get(proto.flags)");
        boolean zBooleanValue = boolD.booleanValue();
        boolean zF = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f(property);
        if (propertyRelatedElement == PropertyRelatedElement.PROPERTY) {
            r rVarB = kotlin.reflect.jvm.internal.impl.load.kotlin.a.b(property, tVar.b(), tVar.d(), false, true, false, 40, null);
            return rVarB == null ? CollectionsKt__CollectionsKt.E() : n(this, tVar, rVarB, true, false, Boolean.valueOf(zBooleanValue), zF, 8, null);
        }
        r rVarB2 = kotlin.reflect.jvm.internal.impl.load.kotlin.a.b(property, tVar.b(), tVar.d(), true, false, false, 48, null);
        if (rVarB2 == null) {
            return CollectionsKt__CollectionsKt.E();
        }
        return StringsKt__StringsKt.W2(rVarB2.a(), "$delegate", false, 2, null) != (propertyRelatedElement == PropertyRelatedElement.DELEGATE_FIELD) ? CollectionsKt__CollectionsKt.E() : m(tVar, rVarB2, true, true, Boolean.valueOf(zBooleanValue), zF);
    }

    private final o z(kotlin.reflect.jvm.internal.impl.serialization.deserialization.t.a aVar) {
        t0 t0VarC = aVar.c();
        q qVar = t0VarC instanceof q ? (q) t0VarC : null;
        if (qVar != null) {
            return qVar.d();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    @dl.d
    public List<A> a(@dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.t container, @dl.d kotlin.reflect.jvm.internal.impl.protobuf.n callableProto, @dl.d AnnotatedCallableKind kind, int i10, @dl.d ProtoBuf.ValueParameter proto) {
        f0.p(container, "container");
        f0.p(callableProto, "callableProto");
        f0.p(kind, "kind");
        f0.p(proto, "proto");
        r rVarS = s(this, callableProto, container.b(), container.d(), kind, false, 16, null);
        if (rVarS == null) {
            return CollectionsKt__CollectionsKt.E();
        }
        return n(this, container, r.f126558b.e(rVarS, i10 + l(container, callableProto)), false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    @dl.d
    public List<A> b(@dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.t.a container) {
        f0.p(container, "container");
        o oVarZ = z(container);
        if (oVarZ != null) {
            ArrayList arrayList = new ArrayList(1);
            oVarZ.i(new c(this, arrayList), q(oVarZ));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + container.a()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    @dl.d
    public List<A> c(@dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.t container, @dl.d ProtoBuf.EnumEntry proto) {
        f0.p(container, "container");
        f0.p(proto, "proto");
        r.a aVar = r.f126558b;
        String string = container.b().getString(proto.F());
        String strC = ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.t.a) container).e().c();
        f0.o(strC, "container as ProtoContai…Class).classId.asString()");
        return n(this, container, aVar.a(string, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.b(strC)), false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    @dl.d
    public List<A> d(@dl.d ProtoBuf.TypeParameter proto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver) {
        f0.p(proto, "proto");
        f0.p(nameResolver, "nameResolver");
        Object objP = proto.p(JvmProtoBuf.f127077h);
        f0.o(objP, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) objP;
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(iterable, 10));
        for (ProtoBuf.Annotation it : iterable) {
            f0.o(it, "it");
            arrayList.add(y(it, nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    @dl.d
    public List<A> f(@dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.t container, @dl.d ProtoBuf.Property proto) {
        f0.p(container, "container");
        f0.p(proto, "proto");
        return x(container, proto, PropertyRelatedElement.BACKING_FIELD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    @dl.d
    public List<A> g(@dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.t container, @dl.d kotlin.reflect.jvm.internal.impl.protobuf.n proto, @dl.d AnnotatedCallableKind kind) {
        f0.p(container, "container");
        f0.p(proto, "proto");
        f0.p(kind, "kind");
        r rVarS = s(this, proto, container.b(), container.d(), kind, false, 16, null);
        return rVarS != null ? n(this, container, r.f126558b.e(rVarS, 0), false, false, null, false, 60, null) : CollectionsKt__CollectionsKt.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    @dl.d
    public List<A> h(@dl.d ProtoBuf.Type proto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver) {
        f0.p(proto, "proto");
        f0.p(nameResolver, "nameResolver");
        Object objP = proto.p(JvmProtoBuf.f127075f);
        f0.o(objP, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) objP;
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(iterable, 10));
        for (ProtoBuf.Annotation it : iterable) {
            f0.o(it, "it");
            arrayList.add(y(it, nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    @dl.d
    public List<A> i(@dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.t container, @dl.d kotlin.reflect.jvm.internal.impl.protobuf.n proto, @dl.d AnnotatedCallableKind kind) {
        f0.p(container, "container");
        f0.p(proto, "proto");
        f0.p(kind, "kind");
        if (kind == AnnotatedCallableKind.PROPERTY) {
            return x(container, (ProtoBuf.Property) proto, PropertyRelatedElement.PROPERTY);
        }
        r rVarS = s(this, proto, container.b(), container.d(), kind, false, 16, null);
        return rVarS == null ? CollectionsKt__CollectionsKt.E() : n(this, container, rVarS, false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    @dl.d
    public List<A> k(@dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.t container, @dl.d ProtoBuf.Property proto) {
        f0.p(container, "container");
        f0.p(proto, "proto");
        return x(container, proto, PropertyRelatedElement.DELEGATE_FIELD);
    }

    @dl.e
    protected final o o(@dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.t container, @dl.e o oVar) {
        f0.p(container, "container");
        if (oVar != null) {
            return oVar;
        }
        if (container instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.t.a) {
            return z((kotlin.reflect.jvm.internal.impl.serialization.deserialization.t.a) container);
        }
        return null;
    }

    @dl.d
    protected abstract S p(@dl.d o oVar);

    @dl.e
    protected byte[] q(@dl.d o kotlinClass) {
        f0.p(kotlinClass, "kotlinClass");
        return null;
    }

    @dl.e
    protected final r r(@dl.d kotlin.reflect.jvm.internal.impl.protobuf.n proto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g typeTable, @dl.d AnnotatedCallableKind kind, boolean z10) {
        f0.p(proto, "proto");
        f0.p(nameResolver, "nameResolver");
        f0.p(typeTable, "typeTable");
        f0.p(kind, "kind");
        if (proto instanceof ProtoBuf.Constructor) {
            r.a aVar = r.f126558b;
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b bVarB = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f127181a.b((ProtoBuf.Constructor) proto, nameResolver, typeTable);
            if (bVarB == null) {
                return null;
            }
            return aVar.b(bVarB);
        }
        if (proto instanceof ProtoBuf.Function) {
            r.a aVar2 = r.f126558b;
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b bVarE = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f127181a.e((ProtoBuf.Function) proto, nameResolver, typeTable);
            if (bVarE == null) {
                return null;
            }
            return aVar2.b(bVarE);
        }
        if (!(proto instanceof ProtoBuf.Property)) {
            return null;
        }
        GeneratedMessageLite.f<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.f127073d;
        f0.o(propertySignature, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a((GeneratedMessageLite.ExtendableMessage) proto, propertySignature);
        if (jvmPropertySignature == null) {
            return null;
        }
        int i10 = b.f126453a[kind.ordinal()];
        if (i10 == 1) {
            if (!jvmPropertySignature.H()) {
                return null;
            }
            r.a aVar3 = r.f126558b;
            JvmProtoBuf.JvmMethodSignature jvmMethodSignatureC = jvmPropertySignature.C();
            f0.o(jvmMethodSignatureC, "signature.getter");
            return aVar3.c(nameResolver, jvmMethodSignatureC);
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            return kotlin.reflect.jvm.internal.impl.load.kotlin.a.a((ProtoBuf.Property) proto, nameResolver, typeTable, true, true, z10);
        }
        if (!jvmPropertySignature.J()) {
            return null;
        }
        r.a aVar4 = r.f126558b;
        JvmProtoBuf.JvmMethodSignature jvmMethodSignatureD = jvmPropertySignature.D();
        f0.o(jvmMethodSignatureD, "signature.setter");
        return aVar4.c(nameResolver, jvmMethodSignatureD);
    }

    @dl.e
    protected final o t(@dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.t container, boolean z10, boolean z11, @dl.e Boolean bool, boolean z12) {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.t.a aVarH;
        f0.p(container, "container");
        if (z10) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
            }
            if (container instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.t.a) {
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.t.a aVar = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.t.a) container;
                if (aVar.g() == ProtoBuf.Class.Kind.INTERFACE) {
                    m mVar = this.f126452a;
                    kotlin.reflect.jvm.internal.impl.name.b bVarD = aVar.e().d(kotlin.reflect.jvm.internal.impl.name.f.f("DefaultImpls"));
                    f0.o(bVarD, "container.classId.create…EFAULT_IMPLS_CLASS_NAME))");
                    return n.a(mVar, bVarD);
                }
            }
            if (bool.booleanValue() && (container instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.t.b)) {
                t0 t0VarC = container.c();
                i iVar = t0VarC instanceof i ? (i) t0VarC : null;
                kotlin.reflect.jvm.internal.impl.resolve.jvm.d dVarF = iVar != null ? iVar.f() : null;
                if (dVarF != null) {
                    m mVar2 = this.f126452a;
                    String strF = dVarF.f();
                    f0.o(strF, "facadeClassName.internalName");
                    kotlin.reflect.jvm.internal.impl.name.b bVarM = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(kotlin.text.u.k2(strF, IOUtils.DIR_SEPARATOR_UNIX, lg.a.f131414g, false, 4, null)));
                    f0.o(bVarM, "topLevel(FqName(facadeCl…lName.replace('/', '.')))");
                    return n.a(mVar2, bVarM);
                }
            }
        }
        if (z11 && (container instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.t.a)) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.t.a aVar2 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.t.a) container;
            if (aVar2.g() == ProtoBuf.Class.Kind.COMPANION_OBJECT && (aVarH = aVar2.h()) != null && (aVarH.g() == ProtoBuf.Class.Kind.CLASS || aVarH.g() == ProtoBuf.Class.Kind.ENUM_CLASS || (z12 && (aVarH.g() == ProtoBuf.Class.Kind.INTERFACE || aVarH.g() == ProtoBuf.Class.Kind.ANNOTATION_CLASS)))) {
                return z(aVarH);
            }
        }
        if (!(container instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.t.b) || !(container.c() instanceof i)) {
            return null;
        }
        t0 t0VarC2 = container.c();
        f0.n(t0VarC2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        i iVar2 = (i) t0VarC2;
        o oVarG = iVar2.g();
        return oVarG == null ? n.a(this.f126452a, iVar2.d()) : oVarG;
    }

    protected final boolean u(@dl.d kotlin.reflect.jvm.internal.impl.name.b classId) {
        o oVarA;
        f0.p(classId, "classId");
        return classId.g() != null && f0.g(classId.j().b(), TextFieldImplKt.f11420g) && (oVarA = n.a(this.f126452a, classId)) != null && kotlin.reflect.jvm.internal.impl.a.f125331a.c(oVarA);
    }

    @dl.e
    protected abstract o.a v(@dl.d kotlin.reflect.jvm.internal.impl.name.b bVar, @dl.d t0 t0Var, @dl.d List<A> list);

    @dl.e
    protected final o.a w(@dl.d kotlin.reflect.jvm.internal.impl.name.b annotationClassId, @dl.d t0 source, @dl.d List<A> result) {
        f0.p(annotationClassId, "annotationClassId");
        f0.p(source, "source");
        f0.p(result, "result");
        if (kotlin.reflect.jvm.internal.impl.a.f125331a.b().contains(annotationClassId)) {
            return null;
        }
        return v(annotationClassId, source, result);
    }

    @dl.d
    protected abstract A y(@dl.d ProtoBuf.Annotation annotation, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar);
}
