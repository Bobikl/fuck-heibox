package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import com.tencent.qcloud.core.util.IOUtils;
import dl.d;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.text.u;

/* JADX INFO: compiled from: BuiltInSerializerProtocol.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends qi.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @d
    public static final a f127722n = new a();

    /* JADX WARN: Illegal instructions before constructor call */
    private a() {
        f fVarD = f.d();
        ni.b.a(fVarD);
        f0.o(fVarD, "newInstance().apply(Buil…f::registerAllExtensions)");
        GeneratedMessageLite.f<ProtoBuf.Package, Integer> packageFqName = ni.b.f132105a;
        f0.o(packageFqName, "packageFqName");
        GeneratedMessageLite.f<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> constructorAnnotation = ni.b.f132107c;
        f0.o(constructorAnnotation, "constructorAnnotation");
        GeneratedMessageLite.f<ProtoBuf.Class, List<ProtoBuf.Annotation>> classAnnotation = ni.b.f132106b;
        f0.o(classAnnotation, "classAnnotation");
        GeneratedMessageLite.f<ProtoBuf.Function, List<ProtoBuf.Annotation>> functionAnnotation = ni.b.f132108d;
        f0.o(functionAnnotation, "functionAnnotation");
        GeneratedMessageLite.f<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyAnnotation = ni.b.f132109e;
        f0.o(propertyAnnotation, "propertyAnnotation");
        GeneratedMessageLite.f<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyGetterAnnotation = ni.b.f132110f;
        f0.o(propertyGetterAnnotation, "propertyGetterAnnotation");
        GeneratedMessageLite.f<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertySetterAnnotation = ni.b.f132111g;
        f0.o(propertySetterAnnotation, "propertySetterAnnotation");
        GeneratedMessageLite.f<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> enumEntryAnnotation = ni.b.f132113i;
        f0.o(enumEntryAnnotation, "enumEntryAnnotation");
        GeneratedMessageLite.f<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> compileTimeValue = ni.b.f132112h;
        f0.o(compileTimeValue, "compileTimeValue");
        GeneratedMessageLite.f<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> parameterAnnotation = ni.b.f132114j;
        f0.o(parameterAnnotation, "parameterAnnotation");
        GeneratedMessageLite.f<ProtoBuf.Type, List<ProtoBuf.Annotation>> typeAnnotation = ni.b.f132115k;
        f0.o(typeAnnotation, "typeAnnotation");
        GeneratedMessageLite.f<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> typeParameterAnnotation = ni.b.f132116l;
        f0.o(typeParameterAnnotation, "typeParameterAnnotation");
        super(fVarD, packageFqName, constructorAnnotation, classAnnotation, functionAnnotation, propertyAnnotation, propertyGetterAnnotation, propertySetterAnnotation, enumEntryAnnotation, compileTimeValue, parameterAnnotation, typeAnnotation, typeParameterAnnotation);
    }

    private final String o(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        if (cVar.d()) {
            return "default-package";
        }
        String strB = cVar.g().b();
        f0.o(strB, "fqName.shortName().asString()");
        return strB;
    }

    @d
    public final String m(@d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        f0.p(fqName, "fqName");
        return o(fqName) + ".kotlin_builtins";
    }

    @d
    public final String n(@d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        f0.p(fqName, "fqName");
        StringBuilder sb2 = new StringBuilder();
        String strB = fqName.b();
        f0.o(strB, "fqName.asString()");
        sb2.append(u.k2(strB, lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX, false, 4, null));
        sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb2.append(m(fqName));
        return sb2.toString();
    }
}
