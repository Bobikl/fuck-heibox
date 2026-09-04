package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Constructor;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;

/* JADX INFO: compiled from: ReflectJavaClass.kt */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ReflectJavaClass$constructors$2 extends FunctionReference implements yh.l<Constructor<?>, m> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ReflectJavaClass$constructors$2 f125889d = new ReflectJavaClass$constructors$2();

    ReflectJavaClass$constructors$2() {
        super(1);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.c
    @dl.d
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.CallableReference
    @dl.d
    public final kotlin.reflect.h getOwner() {
        return n0.d(m.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @dl.d
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    @Override // yh.l
    @dl.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final m invoke(@dl.d Constructor<?> p10) {
        f0.p(p10, "p0");
        return new m(p10);
    }
}
