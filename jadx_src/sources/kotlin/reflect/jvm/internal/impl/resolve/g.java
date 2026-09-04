package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: compiled from: OverridingStrategy.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class g extends h {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.h
    public void b(@dl.d CallableMemberDescriptor first, @dl.d CallableMemberDescriptor second) {
        f0.p(first, "first");
        f0.p(second, "second");
        e(first, second);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.h
    public void c(@dl.d CallableMemberDescriptor fromSuper, @dl.d CallableMemberDescriptor fromCurrent) {
        f0.p(fromSuper, "fromSuper");
        f0.p(fromCurrent, "fromCurrent");
        e(fromSuper, fromCurrent);
    }

    protected abstract void e(@dl.d CallableMemberDescriptor callableMemberDescriptor, @dl.d CallableMemberDescriptor callableMemberDescriptor2);
}
