package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Iterator;
import java.util.Set;
import kotlin.collections.c1;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* JADX INFO: compiled from: ClassDeserializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ClassDeserializer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final b f127658c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final Set<kotlin.reflect.jvm.internal.impl.name.b> f127659d = c1.f(kotlin.reflect.jvm.internal.impl.name.b.m(kotlin.reflect.jvm.internal.impl.builtins.h.a.f125424d.l()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final h f127660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.l<a, kotlin.reflect.jvm.internal.impl.descriptors.d> f127661b;

    /* JADX INFO: compiled from: ClassDeserializer.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.name.b f127662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private final e f127663b;

        public a(@dl.d kotlin.reflect.jvm.internal.impl.name.b classId, @dl.e e eVar) {
            f0.p(classId, "classId");
            this.f127662a = classId;
            this.f127663b = eVar;
        }

        @dl.e
        public final e a() {
            return this.f127663b;
        }

        @dl.d
        public final kotlin.reflect.jvm.internal.impl.name.b b() {
            return this.f127662a;
        }

        public boolean equals(@dl.e Object obj) {
            return (obj instanceof a) && f0.g(this.f127662a, ((a) obj).f127662a);
        }

        public int hashCode() {
            return this.f127662a.hashCode();
        }
    }

    /* JADX INFO: compiled from: ClassDeserializer.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Set<kotlin.reflect.jvm.internal.impl.name.b> a() {
            return ClassDeserializer.f127659d;
        }
    }

    public ClassDeserializer(@dl.d h components) {
        f0.p(components, "components");
        this.f127660a = components;
        this.f127661b = components.u().h(new yh.l<a, kotlin.reflect.jvm.internal.impl.descriptors.d>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$classes$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.descriptors.d invoke(@dl.d ClassDeserializer.a key) {
                f0.p(key, "key");
                return this.f127664b.c(key);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    public final kotlin.reflect.jvm.internal.impl.descriptors.d c(a aVar) {
        Object next;
        j jVarA;
        boolean z10;
        kotlin.reflect.jvm.internal.impl.name.b bVarB = aVar.b();
        Iterator<gi.b> it = this.f127660a.k().iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.d dVarB = it.next().b(bVarB);
            if (dVarB != null) {
                return dVarB;
            }
        }
        if (f127659d.contains(bVarB)) {
            return null;
        }
        e eVarA = aVar.a();
        if (eVarA == null && (eVarA = this.f127660a.e().a(bVarB)) == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVarA = eVarA.a();
        ProtoBuf.Class classB = eVarA.b();
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVarC = eVarA.c();
        t0 t0VarD = eVarA.d();
        kotlin.reflect.jvm.internal.impl.name.b bVarG = bVarB.g();
        if (bVarG != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.d dVarE = e(this, bVarG, null, 2, null);
            DeserializedClassDescriptor deserializedClassDescriptor = dVarE instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) dVarE : null;
            if (deserializedClassDescriptor == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.name.f fVarJ = bVarB.j();
            f0.o(fVarJ, "classId.shortClassName");
            if (!deserializedClassDescriptor.h1(fVarJ)) {
                return null;
            }
            jVarA = deserializedClassDescriptor.b1();
        } else {
            h0 h0VarR = this.f127660a.r();
            kotlin.reflect.jvm.internal.impl.name.c cVarH = bVarB.h();
            f0.o(cVarH, "classId.packageFqName");
            Iterator<T> it2 = i0.c(h0VarR, cVarH).iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                g0 g0Var = (g0) next;
                if (g0Var instanceof l) {
                    kotlin.reflect.jvm.internal.impl.name.f fVarJ2 = bVarB.j();
                    f0.o(fVarJ2, "classId.shortClassName");
                    if (((l) g0Var).L0(fVarJ2)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = true;
                }
            } while (!z10);
            g0 g0Var2 = (g0) next;
            if (g0Var2 == null) {
                return null;
            }
            h hVar = this.f127660a;
            ProtoBuf.TypeTable typeTableI1 = classB.i1();
            f0.o(typeTableI1, "classProto.typeTable");
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.g(typeTableI1);
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.a aVar2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f127067b;
            ProtoBuf.VersionRequirementTable versionRequirementTableK1 = classB.k1();
            f0.o(versionRequirementTableK1, "classProto.versionRequirementTable");
            jVarA = hVar.a(g0Var2, cVarA, gVar, aVar2.a(versionRequirementTableK1), aVarC, null);
        }
        return new DeserializedClassDescriptor(jVarA, classB, cVarA, aVarC, t0VarD);
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d e(ClassDeserializer classDeserializer, kotlin.reflect.jvm.internal.impl.name.b bVar, e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            eVar = null;
        }
        return classDeserializer.d(bVar, eVar);
    }

    @dl.e
    public final kotlin.reflect.jvm.internal.impl.descriptors.d d(@dl.d kotlin.reflect.jvm.internal.impl.name.b classId, @dl.e e eVar) {
        f0.p(classId, "classId");
        return this.f127661b.invoke(new a(classId, eVar));
    }
}
