package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;

/* JADX INFO: compiled from: ReflectJavaClass.kt */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ReflectJavaClass$fields$1 extends FunctionReference implements yh.l<Member, Boolean> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ReflectJavaClass$fields$1 f125890d = new ReflectJavaClass$fields$1();

    ReflectJavaClass$fields$1() {
        super(1);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.c
    @dl.d
    public final String getName() {
        return "isSynthetic";
    }

    @Override // kotlin.jvm.internal.CallableReference
    @dl.d
    public final kotlin.reflect.h getOwner() {
        return n0.d(Member.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @dl.d
    public final String getSignature() {
        return "isSynthetic()Z";
    }

    @Override // yh.l
    @dl.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(@dl.d Member p10) {
        f0.p(p10, "p0");
        return Boolean.valueOf(p10.isSynthetic());
    }
}
