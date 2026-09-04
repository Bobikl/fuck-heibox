package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: methodSignatureMapping.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class w implements v<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final w f126561a = new w();

    private w() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.v
    @dl.e
    public String b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d classDescriptor) {
        f0.p(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.v
    @dl.e
    public d0 c(d0 kotlinType) {
        f0.p(kotlinType, "kotlinType");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.v
    @dl.e
    public String d(kotlin.reflect.jvm.internal.impl.descriptors.d classDescriptor) {
        f0.p(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.v
    public void e(@dl.d d0 kotlinType, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d descriptor) {
        f0.p(kotlinType, "kotlinType");
        f0.p(descriptor, "descriptor");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.v
    @dl.d
    public d0 f(@dl.d Collection<? extends d0> types) {
        f0.p(types, "types");
        throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + CollectionsKt___CollectionsKt.h3(types, null, null, null, 0, null, null, 63, null));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.v
    @dl.e
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public j a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d classDescriptor) {
        f0.p(classDescriptor, "classDescriptor");
        return null;
    }
}
