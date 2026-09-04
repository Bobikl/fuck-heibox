package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: compiled from: OverridingStrategy.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class h {
    public abstract void a(@dl.d CallableMemberDescriptor callableMemberDescriptor);

    public abstract void b(@dl.d CallableMemberDescriptor callableMemberDescriptor, @dl.d CallableMemberDescriptor callableMemberDescriptor2);

    public abstract void c(@dl.d CallableMemberDescriptor callableMemberDescriptor, @dl.d CallableMemberDescriptor callableMemberDescriptor2);

    public void d(@dl.d CallableMemberDescriptor member, @dl.d Collection<? extends CallableMemberDescriptor> overridden) {
        f0.p(member, "member");
        f0.p(overridden, "overridden");
        member.X(overridden);
    }
}
