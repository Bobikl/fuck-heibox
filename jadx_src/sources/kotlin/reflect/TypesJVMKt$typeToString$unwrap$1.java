package kotlin.reflect;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class TypesJVMKt$typeToString$unwrap$1 extends FunctionReferenceImpl implements yh.l<Class<?>, Class<?>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TypesJVMKt$typeToString$unwrap$1 f125049d = new TypesJVMKt$typeToString$unwrap$1();

    TypesJVMKt$typeToString$unwrap$1() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    @Override // yh.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Class<?> invoke(@dl.d Class<?> p10) {
        f0.p(p10, "p0");
        return p10.getComponentType();
    }
}
