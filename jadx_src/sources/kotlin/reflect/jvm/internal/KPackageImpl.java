package kotlin.reflect.jvm.internal;

import com.tencent.qcloud.core.util.IOUtils;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.KPackageImpl.Data;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.text.u;

/* JADX INFO: compiled from: KPackageImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class KPackageImpl extends KDeclarationContainerImpl {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final Class<?> f125186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final n.b<Data> f125187f;

    /* JADX INFO: compiled from: KPackageImpl.kt */
    public final class Data extends KDeclarationContainerImpl.Data {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.n<Object>[] f125188j = {n0.u(new PropertyReference1Impl(n0.d(Data.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), n0.u(new PropertyReference1Impl(n0.d(Data.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), n0.u(new PropertyReference1Impl(n0.d(Data.class), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), n0.u(new PropertyReference1Impl(n0.d(Data.class), com.google.android.exoplayer2.text.ttml.d.f49817y, "getMetadata()Lkotlin/Triple;")), n0.u(new PropertyReference1Impl(n0.d(Data.class), "members", "getMembers()Ljava/util/Collection;"))};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        private final n.a f125189d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.d
        private final n.a f125190e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dl.d
        private final n.b f125191f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.d
        private final n.b f125192g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @dl.d
        private final n.a f125193h;

        public Data() {
            super();
            this.f125189d = n.d(new yh.a<ii.f>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$kotlinClass$2
                {
                    super(0);
                }

                @Override // yh.a
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ii.f invoke() {
                    return ii.f.f119377c.a(kPackageImpl.i());
                }
            });
            this.f125190e = n.d(new yh.a<MemberScope>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$scope$2
                {
                    super(0);
                }

                @Override // yh.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final MemberScope invoke() {
                    ii.f fVarC = this.f125201b.c();
                    return fVarC != null ? this.f125201b.a().c().a(fVarC) : MemberScope.b.f127587b;
                }
            });
            this.f125191f = n.b(new yh.a<Class<?>>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$multifileFacade$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Class<?> invoke() {
                    KotlinClassHeader kotlinClassHeaderH;
                    ii.f fVarC = this.f125199b.c();
                    String strE = (fVarC == null || (kotlinClassHeaderH = fVarC.h()) == null) ? null : kotlinClassHeaderH.e();
                    if (strE == null) {
                        return null;
                    }
                    if (strE.length() > 0) {
                        return kPackageImpl.i().getClassLoader().loadClass(u.k2(strE, IOUtils.DIR_SEPARATOR_UNIX, lg.a.f131414g, false, 4, null));
                    }
                    return null;
                }
            });
            this.f125192g = n.b(new yh.a<Triple<? extends kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f, ? extends ProtoBuf.Package, ? extends kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e>>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$metadata$2
                {
                    super(0);
                }

                @Override // yh.a
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Triple<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f, ProtoBuf.Package, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> invoke() {
                    KotlinClassHeader kotlinClassHeaderH;
                    ii.f fVarC = this.f125198b.c();
                    if (fVarC == null || (kotlinClassHeaderH = fVarC.h()) == null) {
                        return null;
                    }
                    String[] strArrA = kotlinClassHeaderH.a();
                    String[] strArrG = kotlinClassHeaderH.g();
                    if (strArrA == null || strArrG == null) {
                        return null;
                    }
                    Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f, ProtoBuf.Package> pairM = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.m(strArrA, strArrG);
                    return new Triple<>(pairM.a(), pairM.b(), kotlinClassHeaderH.d());
                }
            });
            this.f125193h = n.d(new yh.a<Collection<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$members$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Collection<KCallableImpl<?>> invoke() {
                    return kPackageImpl.Q(this.g(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final ii.f c() {
            return (ii.f) this.f125189d.b(this, f125188j[0]);
        }

        @dl.d
        public final Collection<KCallableImpl<?>> d() {
            T tB = this.f125193h.b(this, f125188j[4]);
            f0.o(tB, "<get-members>(...)");
            return (Collection) tB;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @dl.e
        public final Triple<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f, ProtoBuf.Package, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> e() {
            return (Triple) this.f125192g.b(this, f125188j[3]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @dl.e
        public final Class<?> f() {
            return (Class) this.f125191f.b(this, f125188j[2]);
        }

        @dl.d
        public final MemberScope g() {
            T tB = this.f125190e.b(this, f125188j[1]);
            f0.o(tB, "<get-scope>(...)");
            return (MemberScope) tB;
        }
    }

    public KPackageImpl(@dl.d Class<?> jClass) {
        f0.p(jClass, "jClass");
        this.f125186e = jClass;
        n.b<Data> bVarB = n.b(new yh.a<Data>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$data$1
            {
                super(0);
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KPackageImpl.Data invoke() {
                return this.f125202b.new Data();
            }
        });
        f0.o(bVarB, "lazy { Data() }");
        this.f125187f = bVarB;
    }

    private final MemberScope b0() {
        return this.f125187f.invoke().g();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.j> N() {
        return CollectionsKt__CollectionsKt.E();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @dl.d
    public Collection<w> O(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
        f0.p(name, "name");
        return b0().a(name, NoLookupLocation.FROM_REFLECTION);
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @dl.e
    public o0 P(int i10) {
        Triple<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f, ProtoBuf.Package, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> tripleE = this.f125187f.invoke().e();
        if (tripleE == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f fVarA = tripleE.a();
        ProtoBuf.Package packageB = tripleE.b();
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e eVarC = tripleE.c();
        GeneratedMessageLite.f<ProtoBuf.Package, List<ProtoBuf.Property>> packageLocalVariable = JvmProtoBuf.f127083n;
        f0.o(packageLocalVariable, "packageLocalVariable");
        ProtoBuf.Property property = (ProtoBuf.Property) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.b(packageB, packageLocalVariable, i10);
        if (property == null) {
            return null;
        }
        Class<?> clsI = i();
        ProtoBuf.TypeTable typeTableW = packageB.W();
        f0.o(typeTableW, "packageProto.typeTable");
        return (o0) s.h(clsI, property, fVarA, new kotlin.reflect.jvm.internal.impl.metadata.deserialization.g(typeTableW), eVarC, KPackageImpl$getLocalProperty$1$1$1.f125203d);
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @dl.d
    protected Class<?> R() {
        Class<?> clsF = this.f125187f.invoke().f();
        return clsF == null ? i() : clsF;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @dl.d
    public Collection<o0> S(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
        f0.p(name, "name");
        return b0().c(name, NoLookupLocation.FROM_REFLECTION);
    }

    public boolean equals(@dl.e Object obj) {
        return (obj instanceof KPackageImpl) && f0.g(i(), ((KPackageImpl) obj).i());
    }

    public int hashCode() {
        return i().hashCode();
    }

    @Override // kotlin.jvm.internal.r
    @dl.d
    public Class<?> i() {
        return this.f125186e;
    }

    @dl.d
    public String toString() {
        return "file class " + ReflectClassUtilKt.a(i()).b();
    }

    @Override // kotlin.reflect.h
    @dl.d
    public Collection<kotlin.reflect.c<?>> v() {
        return this.f125187f.invoke().d();
    }
}
