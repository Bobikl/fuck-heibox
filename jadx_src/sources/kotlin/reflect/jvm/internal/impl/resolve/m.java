package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.r;

/* JADX INFO: compiled from: VisibilityUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m {
    @dl.d
    public static final CallableMemberDescriptor a(@dl.d Collection<? extends CallableMemberDescriptor> descriptors) {
        Integer numD;
        f0.p(descriptors, "descriptors");
        descriptors.isEmpty();
        CallableMemberDescriptor callableMemberDescriptor = null;
        for (CallableMemberDescriptor callableMemberDescriptor2 : descriptors) {
            if (callableMemberDescriptor == null || ((numD = r.d(callableMemberDescriptor.getVisibility(), callableMemberDescriptor2.getVisibility())) != null && numD.intValue() < 0)) {
                callableMemberDescriptor = callableMemberDescriptor2;
            }
        }
        f0.m(callableMemberDescriptor);
        return callableMemberDescriptor;
    }
}
