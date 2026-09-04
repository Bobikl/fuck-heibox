package kotlin.reflect;

import java.lang.reflect.Type;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ParameterizedTypeImpl$getTypeName$1$1 extends FunctionReferenceImpl implements yh.l<Type, String> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ParameterizedTypeImpl$getTypeName$1$1 f125047d = new ParameterizedTypeImpl$getTypeName$1$1();

    ParameterizedTypeImpl$getTypeName$1$1() {
        super(1, TypesJVMKt.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @Override // yh.l
    @dl.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final String invoke(@dl.d Type p10) {
        f0.p(p10, "p0");
        return TypesJVMKt.j(p10);
    }
}
