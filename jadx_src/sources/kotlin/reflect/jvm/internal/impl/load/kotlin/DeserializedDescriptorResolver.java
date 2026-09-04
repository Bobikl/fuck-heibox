package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.c1;
import kotlin.collections.d1;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;

/* JADX INFO: compiled from: DeserializedDescriptorResolver.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DeserializedDescriptorResolver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f126456b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final Set<KotlinClassHeader.Kind> f126457c = c1.f(KotlinClassHeader.Kind.CLASS);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final Set<KotlinClassHeader.Kind> f126458d = d1.u(KotlinClassHeader.Kind.FILE_FACADE, KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e f126459e = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e(1, 1, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e f126460f = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e(1, 1, 11);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e f126461g = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e(1, 1, 13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.h f126462a;

    /* JADX INFO: compiled from: DeserializedDescriptorResolver.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e a() {
            return DeserializedDescriptorResolver.f126461g;
        }
    }

    private final DeserializedContainerAbiStability c(o oVar) {
        if (d().g().a()) {
            return DeserializedContainerAbiStability.STABLE;
        }
        if (oVar.h().j()) {
            return DeserializedContainerAbiStability.FIR_UNSTABLE;
        }
        return oVar.h().k() ? DeserializedContainerAbiStability.IR_UNSTABLE : DeserializedContainerAbiStability.STABLE;
    }

    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.o<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> e(o oVar) {
        if (f() || oVar.h().d().h()) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.o<>(oVar.h().d(), kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e.f127169i, oVar.getLocation(), oVar.f());
    }

    private final boolean f() {
        return d().g().f();
    }

    private final boolean g(o oVar) {
        return !d().g().d() && oVar.h().i() && f0.g(oVar.h().d(), f126460f);
    }

    private final boolean h(o oVar) {
        return (d().g().b() && (oVar.h().i() || f0.g(oVar.h().d(), f126459e))) || g(oVar);
    }

    private final String[] j(o oVar, Set<? extends KotlinClassHeader.Kind> set) {
        KotlinClassHeader kotlinClassHeaderH = oVar.h();
        String[] strArrA = kotlinClassHeaderH.a();
        if (strArrA == null) {
            strArrA = kotlinClassHeaderH.b();
        }
        if (strArrA == null || !set.contains(kotlinClassHeaderH.c())) {
            return null;
        }
        return strArrA;
    }

    @dl.e
    public final MemberScope b(@dl.d g0 descriptor, @dl.d o kotlinClass) {
        String[] strArrG;
        Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f, ProtoBuf.Package> pairM;
        f0.p(descriptor, "descriptor");
        f0.p(kotlinClass, "kotlinClass");
        String[] strArrJ = j(kotlinClass, f126458d);
        if (strArrJ == null || (strArrG = kotlinClass.h().g()) == null) {
            return null;
        }
        try {
            try {
                pairM = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.m(strArrJ, strArrG);
            } catch (InvalidProtocolBufferException e10) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e10);
            }
        } catch (Throwable th2) {
            if (f() || kotlinClass.h().d().h()) {
                throw th2;
            }
            pairM = null;
        }
        if (pairM == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f fVarA = pairM.a();
        ProtoBuf.Package packageB = pairM.b();
        i iVar = new i(kotlinClass, packageB, fVarA, e(kotlinClass), h(kotlinClass), c(kotlinClass));
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g(descriptor, packageB, fVarA, kotlinClass.h().d(), iVar, d(), "scope for " + iVar + " in " + descriptor, new yh.a<Collection<? extends kotlin.reflect.jvm.internal.impl.name.f>>() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver$createKotlinPackagePartScope$2
            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                return CollectionsKt__CollectionsKt.E();
            }
        });
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.h d() {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.h hVar = this.f126462a;
        if (hVar != null) {
            return hVar;
        }
        f0.S("components");
        return null;
    }

    @dl.e
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.e i(@dl.d o kotlinClass) {
        String[] strArrG;
        Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f, ProtoBuf.Class> pairI;
        f0.p(kotlinClass, "kotlinClass");
        String[] strArrJ = j(kotlinClass, f126457c);
        if (strArrJ == null || (strArrG = kotlinClass.h().g()) == null) {
            return null;
        }
        try {
            try {
                pairI = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.i(strArrJ, strArrG);
            } catch (InvalidProtocolBufferException e10) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e10);
            }
        } catch (Throwable th2) {
            if (f() || kotlinClass.h().d().h()) {
                throw th2;
            }
            pairI = null;
        }
        if (pairI == null) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.e(pairI.a(), pairI.b(), kotlinClass.h().d(), new q(kotlinClass, e(kotlinClass), h(kotlinClass), c(kotlinClass)));
    }

    @dl.e
    public final kotlin.reflect.jvm.internal.impl.descriptors.d k(@dl.d o kotlinClass) {
        f0.p(kotlinClass, "kotlinClass");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.e eVarI = i(kotlinClass);
        if (eVarI == null) {
            return null;
        }
        return d().f().d(kotlinClass.f(), eVarI);
    }

    public final void l(@dl.d d components) {
        f0.p(components, "components");
        m(components.a());
    }

    public final void m(@dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.h hVar) {
        f0.p(hVar, "<set-?>");
        this.f126462a = hVar;
    }
}
