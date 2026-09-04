package ii;

import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: compiled from: RuntimeErrorReporter.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final j f119383b = new j();

    private j() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.m
    public void a(@dl.d CallableMemberDescriptor descriptor) {
        f0.p(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.m
    public void b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d descriptor, @dl.d List<String> unresolvedSuperClasses) {
        f0.p(descriptor, "descriptor");
        f0.p(unresolvedSuperClasses, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + unresolvedSuperClasses);
    }
}
