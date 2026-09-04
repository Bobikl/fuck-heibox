package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: loaded from: classes5.dex */
public class b implements kotlin.reflect.jvm.internal.impl.utils.b.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f127553a;

    public b(boolean z10) {
        this.f127553a = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.b.d
    public Iterable a(Object obj) {
        return DescriptorUtilsKt.g(this.f127553a, (CallableMemberDescriptor) obj);
    }
}
