package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: DeserializedPackageFragmentImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class DeserializedPackageFragmentImpl extends l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a f127667i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e f127668j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.d f127669k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final s f127670l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private ProtoBuf.PackageFragment f127671m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MemberScope f127672n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName, @dl.d kotlin.reflect.jvm.internal.impl.storage.m storageManager, @dl.d d0 module, @dl.d ProtoBuf.PackageFragment proto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.a metadataVersion, @dl.e kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e eVar) {
        super(fqName, storageManager, module);
        f0.p(fqName, "fqName");
        f0.p(storageManager, "storageManager");
        f0.p(module, "module");
        f0.p(proto, "proto");
        f0.p(metadataVersion, "metadataVersion");
        this.f127667i = metadataVersion;
        this.f127668j = eVar;
        ProtoBuf.StringTable stringTableP = proto.P();
        f0.o(stringTableP, "proto.strings");
        ProtoBuf.QualifiedNameTable qualifiedNameTableO = proto.O();
        f0.o(qualifiedNameTableO, "proto.qualifiedNames");
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.d dVar = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.d(stringTableP, qualifiedNameTableO);
        this.f127669k = dVar;
        this.f127670l = new s(proto, dVar, metadataVersion, new yh.l<kotlin.reflect.jvm.internal.impl.name.b, t0>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl$classDataFinder$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final t0 invoke(@dl.d kotlin.reflect.jvm.internal.impl.name.b it) {
                f0.p(it, "it");
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e eVar2 = this.f127673b.f127668j;
                if (eVar2 != null) {
                    return eVar2;
                }
                t0 NO_SOURCE = t0.f125942a;
                f0.o(NO_SOURCE, "NO_SOURCE");
                return NO_SOURCE;
            }
        });
        this.f127671m = proto;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.l
    public void M0(@dl.d h components) {
        f0.p(components, "components");
        ProtoBuf.PackageFragment packageFragment = this.f127671m;
        if (packageFragment == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
        }
        this.f127671m = null;
        ProtoBuf.Package packageN = packageFragment.N();
        f0.o(packageN, "proto.`package`");
        this.f127672n = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g(this, packageN, this.f127669k, this.f127667i, this.f127668j, components, "scope of " + this, new yh.a<Collection<? extends kotlin.reflect.jvm.internal.impl.name.f>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl$initialize$1
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                Collection<kotlin.reflect.jvm.internal.impl.name.b> collectionB = this.f127674b.K0().b();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionB) {
                    kotlin.reflect.jvm.internal.impl.name.b bVar = (kotlin.reflect.jvm.internal.impl.name.b) obj;
                    if ((bVar.l() || ClassDeserializer.f127658c.a().contains(bVar)) ? false : true) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((kotlin.reflect.jvm.internal.impl.name.b) it.next()).j());
                }
                return arrayList2;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.l
    @dl.d
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public s K0() {
        return this.f127670l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    @dl.d
    public MemberScope u() {
        MemberScope memberScope = this.f127672n;
        if (memberScope != null) {
            return memberScope;
        }
        f0.S("_memberScope");
        return null;
    }
}
