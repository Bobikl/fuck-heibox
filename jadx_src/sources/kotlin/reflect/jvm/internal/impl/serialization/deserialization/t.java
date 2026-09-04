package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: compiled from: ProtoContainer.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c f127898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g f127899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final t0 f127900c;

    /* JADX INFO: compiled from: ProtoContainer.kt */
    public static final class a extends t {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        private final ProtoBuf.Class f127901d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.e
        private final a f127902e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.name.b f127903f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.d
        private final ProtoBuf.Class.Kind f127904g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f127905h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d ProtoBuf.Class classProto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g typeTable, @dl.e t0 t0Var, @dl.e a aVar) {
            super(nameResolver, typeTable, t0Var, null);
            f0.p(classProto, "classProto");
            f0.p(nameResolver, "nameResolver");
            f0.p(typeTable, "typeTable");
            this.f127901d = classProto;
            this.f127902e = aVar;
            this.f127903f = r.a(nameResolver, classProto.F0());
            ProtoBuf.Class.Kind kindD = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127039f.d(classProto.E0());
            this.f127904g = kindD == null ? ProtoBuf.Class.Kind.CLASS : kindD;
            Boolean boolD = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127040g.d(classProto.E0());
            f0.o(boolD, "IS_INNER.get(classProto.flags)");
            this.f127905h = boolD.booleanValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.t
        @dl.d
        public kotlin.reflect.jvm.internal.impl.name.c a() {
            kotlin.reflect.jvm.internal.impl.name.c cVarB = this.f127903f.b();
            f0.o(cVarB, "classId.asSingleFqName()");
            return cVarB;
        }

        @dl.d
        public final kotlin.reflect.jvm.internal.impl.name.b e() {
            return this.f127903f;
        }

        @dl.d
        public final ProtoBuf.Class f() {
            return this.f127901d;
        }

        @dl.d
        public final ProtoBuf.Class.Kind g() {
            return this.f127904g;
        }

        @dl.e
        public final a h() {
            return this.f127902e;
        }

        public final boolean i() {
            return this.f127905h;
        }
    }

    /* JADX INFO: compiled from: ProtoContainer.kt */
    public static final class b extends t {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.name.c f127906d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g typeTable, @dl.e t0 t0Var) {
            super(nameResolver, typeTable, t0Var, null);
            f0.p(fqName, "fqName");
            f0.p(nameResolver, "nameResolver");
            f0.p(typeTable, "typeTable");
            this.f127906d = fqName;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.t
        @dl.d
        public kotlin.reflect.jvm.internal.impl.name.c a() {
            return this.f127906d;
        }
    }

    private t(kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, t0 t0Var) {
        this.f127898a = cVar;
        this.f127899b = gVar;
        this.f127900c = t0Var;
    }

    public /* synthetic */ t(kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, t0 t0Var, kotlin.jvm.internal.u uVar) {
        this(cVar, gVar, t0Var);
    }

    @dl.d
    public abstract kotlin.reflect.jvm.internal.impl.name.c a();

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c b() {
        return this.f127898a;
    }

    @dl.e
    public final t0 c() {
        return this.f127900c;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g d() {
        return this.f127899b;
    }

    @dl.d
    public String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
