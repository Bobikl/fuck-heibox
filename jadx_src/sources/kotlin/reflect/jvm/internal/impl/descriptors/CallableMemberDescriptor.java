package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public interface CallableMemberDescriptor extends a, a0 {

    public enum Kind {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean isReal() {
            return this != FAKE_OVERRIDE;
        }
    }

    void X(@dl.d Collection<? extends CallableMemberDescriptor> collection);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    CallableMemberDescriptor a();

    @dl.d
    Kind b();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    Collection<? extends CallableMemberDescriptor> f();

    @dl.d
    CallableMemberDescriptor k0(k kVar, Modality modality, s sVar, Kind kind, boolean z10);
}
