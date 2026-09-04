package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.tencent.qcloud.core.util.IOUtils;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: JvmPackagePartSource.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.resolve.jvm.d f126529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final kotlin.reflect.jvm.internal.impl.resolve.jvm.d f126530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.o<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> f126531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f126532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final DeserializedContainerAbiStability f126533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private final o f126534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final String f126535h;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(@dl.d o kotlinClass, @dl.d ProtoBuf.Package packageProto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver, @dl.e kotlin.reflect.jvm.internal.impl.serialization.deserialization.o<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> oVar, boolean z10, @dl.d DeserializedContainerAbiStability abiStability) {
        f0.p(kotlinClass, "kotlinClass");
        f0.p(packageProto, "packageProto");
        f0.p(nameResolver, "nameResolver");
        f0.p(abiStability, "abiStability");
        kotlin.reflect.jvm.internal.impl.resolve.jvm.d dVarB = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.b(kotlinClass.f());
        f0.o(dVarB, "byClassId(kotlinClass.classId)");
        String strE = kotlinClass.h().e();
        kotlin.reflect.jvm.internal.impl.resolve.jvm.d dVarD = null;
        if (strE != null) {
            if (strE.length() > 0) {
                dVarD = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.d(strE);
            }
        }
        this(dVarB, dVarD, packageProto, nameResolver, oVar, z10, abiStability, kotlinClass);
    }

    public i(@dl.d kotlin.reflect.jvm.internal.impl.resolve.jvm.d className, @dl.e kotlin.reflect.jvm.internal.impl.resolve.jvm.d dVar, @dl.d ProtoBuf.Package packageProto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver, @dl.e kotlin.reflect.jvm.internal.impl.serialization.deserialization.o<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> oVar, boolean z10, @dl.d DeserializedContainerAbiStability abiStability, @dl.e o oVar2) {
        String string;
        f0.p(className, "className");
        f0.p(packageProto, "packageProto");
        f0.p(nameResolver, "nameResolver");
        f0.p(abiStability, "abiStability");
        this.f126529b = className;
        this.f126530c = dVar;
        this.f126531d = oVar;
        this.f126532e = z10;
        this.f126533f = abiStability;
        this.f126534g = oVar2;
        GeneratedMessageLite.f<ProtoBuf.Package, Integer> packageModuleName = JvmProtoBuf.f127082m;
        f0.o(packageModuleName, "packageModuleName");
        Integer num = (Integer) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(packageProto, packageModuleName);
        this.f126535h = (num == null || (string = nameResolver.getString(num.intValue())) == null) ? "main" : string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e
    @dl.d
    public String a() {
        return "Class '" + d().b().b() + '\'';
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.t0
    @dl.d
    public u0 b() {
        u0 NO_SOURCE_FILE = u0.f125943a;
        f0.o(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.name.b d() {
        return new kotlin.reflect.jvm.internal.impl.name.b(e().g(), h());
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.resolve.jvm.d e() {
        return this.f126529b;
    }

    @dl.e
    public kotlin.reflect.jvm.internal.impl.resolve.jvm.d f() {
        return this.f126530c;
    }

    @dl.e
    public final o g() {
        return this.f126534g;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.name.f h() {
        String strF = e().f();
        f0.o(strF, "className.internalName");
        kotlin.reflect.jvm.internal.impl.name.f fVarF = kotlin.reflect.jvm.internal.impl.name.f.f(StringsKt__StringsKt.t5(strF, IOUtils.DIR_SEPARATOR_UNIX, null, 2, null));
        f0.o(fVarF, "identifier(className.int….substringAfterLast('/'))");
        return fVarF;
    }

    @dl.d
    public String toString() {
        return i.class.getSimpleName() + ": " + e();
    }
}
