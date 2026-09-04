package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import xh.m;

/* JADX INFO: compiled from: JvmProtoBufUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final i f127181a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.protobuf.f f127182b;

    static {
        kotlin.reflect.jvm.internal.impl.protobuf.f fVarD = kotlin.reflect.jvm.internal.impl.protobuf.f.d();
        JvmProtoBuf.a(fVarD);
        f0.o(fVarD, "newInstance().apply(JvmP…f::registerAllExtensions)");
        f127182b = fVarD;
    }

    private i() {
    }

    public static /* synthetic */ d.a d(i iVar, ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return iVar.c(property, cVar, gVar, z10);
    }

    @m
    public static final boolean f(@dl.d ProtoBuf.Property proto) {
        f0.p(proto, "proto");
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.C1167b c1167bA = c.f127160a.a();
        Object objP = proto.p(JvmProtoBuf.f127074e);
        f0.o(objP, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean boolD = c1167bA.d(((Number) objP).intValue());
        f0.o(boolD, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return boolD.booleanValue();
    }

    private final String g(ProtoBuf.Type type, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        if (type.m0()) {
            return b.b(cVar.a(type.X()));
        }
        return null;
    }

    @dl.d
    @m
    public static final Pair<f, ProtoBuf.Class> h(@dl.d byte[] bytes, @dl.d String[] strings) {
        f0.p(bytes, "bytes");
        f0.p(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair<>(f127181a.k(byteArrayInputStream, strings), ProtoBuf.Class.x1(byteArrayInputStream, f127182b));
    }

    @dl.d
    @m
    public static final Pair<f, ProtoBuf.Class> i(@dl.d String[] data, @dl.d String[] strings) {
        f0.p(data, "data");
        f0.p(strings, "strings");
        byte[] bArrE = a.e(data);
        f0.o(bArrE, "decodeBytes(data)");
        return h(bArrE, strings);
    }

    @dl.d
    @m
    public static final Pair<f, ProtoBuf.Function> j(@dl.d String[] data, @dl.d String[] strings) {
        f0.p(data, "data");
        f0.p(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.e(data));
        return new Pair<>(f127181a.k(byteArrayInputStream, strings), ProtoBuf.Function.F0(byteArrayInputStream, f127182b));
    }

    private final f k(InputStream inputStream, String[] strArr) throws IOException {
        JvmProtoBuf.StringTableTypes stringTableTypesE = JvmProtoBuf.StringTableTypes.E(inputStream, f127182b);
        f0.o(stringTableTypesE, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new f(stringTableTypesE, strArr);
    }

    @dl.d
    @m
    public static final Pair<f, ProtoBuf.Package> l(@dl.d byte[] bytes, @dl.d String[] strings) {
        f0.p(bytes, "bytes");
        f0.p(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair<>(f127181a.k(byteArrayInputStream, strings), ProtoBuf.Package.e0(byteArrayInputStream, f127182b));
    }

    @dl.d
    @m
    public static final Pair<f, ProtoBuf.Package> m(@dl.d String[] data, @dl.d String[] strings) {
        f0.p(data, "data");
        f0.p(strings, "strings");
        byte[] bArrE = a.e(data);
        f0.o(bArrE, "decodeBytes(data)");
        return l(bArrE, strings);
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.protobuf.f a() {
        return f127182b;
    }

    @dl.e
    public final d.b b(@dl.d ProtoBuf.Constructor proto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g typeTable) {
        String strH3;
        f0.p(proto, "proto");
        f0.p(nameResolver, "nameResolver");
        f0.p(typeTable, "typeTable");
        GeneratedMessageLite.f<ProtoBuf.Constructor, JvmProtoBuf.JvmMethodSignature> constructorSignature = JvmProtoBuf.f127070a;
        f0.o(constructorSignature, "constructorSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(proto, constructorSignature);
        String string = (jvmMethodSignature == null || !jvmMethodSignature.A()) ? "<init>" : nameResolver.getString(jvmMethodSignature.y());
        if (jvmMethodSignature == null || !jvmMethodSignature.z()) {
            List<ProtoBuf.ValueParameter> listN = proto.N();
            f0.o(listN, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(t.Y(listN, 10));
            for (ProtoBuf.ValueParameter it : listN) {
                i iVar = f127181a;
                f0.o(it, "it");
                String strG = iVar.g(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.q(it, typeTable), nameResolver);
                if (strG == null) {
                    return null;
                }
                arrayList.add(strG);
            }
            strH3 = CollectionsKt___CollectionsKt.h3(arrayList, "", "(", ")V", 0, null, null, 56, null);
        } else {
            strH3 = nameResolver.getString(jvmMethodSignature.x());
        }
        return new d.b(string, strH3);
    }

    @dl.e
    public final d.a c(@dl.d ProtoBuf.Property proto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g typeTable, boolean z10) {
        String strG;
        f0.p(proto, "proto");
        f0.p(nameResolver, "nameResolver");
        f0.p(typeTable, "typeTable");
        GeneratedMessageLite.f<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.f127073d;
        f0.o(propertySignature, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(proto, propertySignature);
        if (jvmPropertySignature == null) {
            return null;
        }
        JvmProtoBuf.JvmFieldSignature jvmFieldSignatureB = jvmPropertySignature.G() ? jvmPropertySignature.B() : null;
        if (jvmFieldSignatureB == null && z10) {
            return null;
        }
        int iD0 = (jvmFieldSignatureB == null || !jvmFieldSignatureB.A()) ? proto.d0() : jvmFieldSignatureB.y();
        if (jvmFieldSignatureB == null || !jvmFieldSignatureB.z()) {
            strG = g(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.n(proto, typeTable), nameResolver);
            if (strG == null) {
                return null;
            }
        } else {
            strG = nameResolver.getString(jvmFieldSignatureB.x());
        }
        return new d.a(nameResolver.getString(iD0), strG);
    }

    @dl.e
    public final d.b e(@dl.d ProtoBuf.Function proto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g typeTable) {
        String string;
        f0.p(proto, "proto");
        f0.p(nameResolver, "nameResolver");
        f0.p(typeTable, "typeTable");
        GeneratedMessageLite.f<ProtoBuf.Function, JvmProtoBuf.JvmMethodSignature> methodSignature = JvmProtoBuf.f127071b;
        f0.o(methodSignature, "methodSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(proto, methodSignature);
        int iE0 = (jvmMethodSignature == null || !jvmMethodSignature.A()) ? proto.e0() : jvmMethodSignature.y();
        if (jvmMethodSignature == null || !jvmMethodSignature.z()) {
            List listM = CollectionsKt__CollectionsKt.M(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.k(proto, typeTable));
            List<ProtoBuf.ValueParameter> listQ0 = proto.q0();
            f0.o(listQ0, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(t.Y(listQ0, 10));
            for (ProtoBuf.ValueParameter it : listQ0) {
                f0.o(it, "it");
                arrayList.add(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.q(it, typeTable));
            }
            List listY4 = CollectionsKt___CollectionsKt.y4(listM, arrayList);
            ArrayList arrayList2 = new ArrayList(t.Y(listY4, 10));
            Iterator it2 = listY4.iterator();
            while (it2.hasNext()) {
                String strG = f127181a.g((ProtoBuf.Type) it2.next(), nameResolver);
                if (strG == null) {
                    return null;
                }
                arrayList2.add(strG);
            }
            String strG2 = g(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.m(proto, typeTable), nameResolver);
            if (strG2 == null) {
                return null;
            }
            string = CollectionsKt___CollectionsKt.h3(arrayList2, "", "(", ")", 0, null, null, 56, null) + strG2;
        } else {
            string = nameResolver.getString(jvmMethodSignature.x());
        }
        return new d.b(nameResolver.getString(iE0), string);
    }
}
