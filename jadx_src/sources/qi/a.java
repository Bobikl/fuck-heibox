package qi;

import dl.d;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.f;

/* JADX INFO: compiled from: SerializerExtensionProtocol.kt */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final f f138658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final GeneratedMessageLite.f<ProtoBuf.Package, Integer> f138659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final GeneratedMessageLite.f<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> f138660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private final GeneratedMessageLite.f<ProtoBuf.Class, List<ProtoBuf.Annotation>> f138661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private final GeneratedMessageLite.f<ProtoBuf.Function, List<ProtoBuf.Annotation>> f138662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private final GeneratedMessageLite.f<ProtoBuf.Property, List<ProtoBuf.Annotation>> f138663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private final GeneratedMessageLite.f<ProtoBuf.Property, List<ProtoBuf.Annotation>> f138664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d
    private final GeneratedMessageLite.f<ProtoBuf.Property, List<ProtoBuf.Annotation>> f138665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d
    private final GeneratedMessageLite.f<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> f138666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @d
    private final GeneratedMessageLite.f<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> f138667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @d
    private final GeneratedMessageLite.f<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> f138668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @d
    private final GeneratedMessageLite.f<ProtoBuf.Type, List<ProtoBuf.Annotation>> f138669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @d
    private final GeneratedMessageLite.f<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> f138670m;

    public a(@d f extensionRegistry, @d GeneratedMessageLite.f<ProtoBuf.Package, Integer> packageFqName, @d GeneratedMessageLite.f<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> constructorAnnotation, @d GeneratedMessageLite.f<ProtoBuf.Class, List<ProtoBuf.Annotation>> classAnnotation, @d GeneratedMessageLite.f<ProtoBuf.Function, List<ProtoBuf.Annotation>> functionAnnotation, @d GeneratedMessageLite.f<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyAnnotation, @d GeneratedMessageLite.f<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyGetterAnnotation, @d GeneratedMessageLite.f<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertySetterAnnotation, @d GeneratedMessageLite.f<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> enumEntryAnnotation, @d GeneratedMessageLite.f<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> compileTimeValue, @d GeneratedMessageLite.f<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> parameterAnnotation, @d GeneratedMessageLite.f<ProtoBuf.Type, List<ProtoBuf.Annotation>> typeAnnotation, @d GeneratedMessageLite.f<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> typeParameterAnnotation) {
        f0.p(extensionRegistry, "extensionRegistry");
        f0.p(packageFqName, "packageFqName");
        f0.p(constructorAnnotation, "constructorAnnotation");
        f0.p(classAnnotation, "classAnnotation");
        f0.p(functionAnnotation, "functionAnnotation");
        f0.p(propertyAnnotation, "propertyAnnotation");
        f0.p(propertyGetterAnnotation, "propertyGetterAnnotation");
        f0.p(propertySetterAnnotation, "propertySetterAnnotation");
        f0.p(enumEntryAnnotation, "enumEntryAnnotation");
        f0.p(compileTimeValue, "compileTimeValue");
        f0.p(parameterAnnotation, "parameterAnnotation");
        f0.p(typeAnnotation, "typeAnnotation");
        f0.p(typeParameterAnnotation, "typeParameterAnnotation");
        this.f138658a = extensionRegistry;
        this.f138659b = packageFqName;
        this.f138660c = constructorAnnotation;
        this.f138661d = classAnnotation;
        this.f138662e = functionAnnotation;
        this.f138663f = propertyAnnotation;
        this.f138664g = propertyGetterAnnotation;
        this.f138665h = propertySetterAnnotation;
        this.f138666i = enumEntryAnnotation;
        this.f138667j = compileTimeValue;
        this.f138668k = parameterAnnotation;
        this.f138669l = typeAnnotation;
        this.f138670m = typeParameterAnnotation;
    }

    @d
    public final GeneratedMessageLite.f<ProtoBuf.Class, List<ProtoBuf.Annotation>> a() {
        return this.f138661d;
    }

    @d
    public final GeneratedMessageLite.f<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> b() {
        return this.f138667j;
    }

    @d
    public final GeneratedMessageLite.f<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> c() {
        return this.f138660c;
    }

    @d
    public final GeneratedMessageLite.f<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> d() {
        return this.f138666i;
    }

    @d
    public final f e() {
        return this.f138658a;
    }

    @d
    public final GeneratedMessageLite.f<ProtoBuf.Function, List<ProtoBuf.Annotation>> f() {
        return this.f138662e;
    }

    @d
    public final GeneratedMessageLite.f<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> g() {
        return this.f138668k;
    }

    @d
    public final GeneratedMessageLite.f<ProtoBuf.Property, List<ProtoBuf.Annotation>> h() {
        return this.f138663f;
    }

    @d
    public final GeneratedMessageLite.f<ProtoBuf.Property, List<ProtoBuf.Annotation>> i() {
        return this.f138664g;
    }

    @d
    public final GeneratedMessageLite.f<ProtoBuf.Property, List<ProtoBuf.Annotation>> j() {
        return this.f138665h;
    }

    @d
    public final GeneratedMessageLite.f<ProtoBuf.Type, List<ProtoBuf.Annotation>> k() {
        return this.f138669l;
    }

    @d
    public final GeneratedMessageLite.f<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> l() {
        return this.f138670m;
    }
}
