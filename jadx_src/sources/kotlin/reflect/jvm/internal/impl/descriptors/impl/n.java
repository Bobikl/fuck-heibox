package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.o0;

/* JADX INFO: compiled from: FieldDescriptorImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class n extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.b implements kotlin.reflect.jvm.internal.impl.descriptors.v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final o0 f125743c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations, @dl.d o0 correspondingProperty) {
        super(annotations);
        kotlin.jvm.internal.f0.p(annotations, "annotations");
        kotlin.jvm.internal.f0.p(correspondingProperty, "correspondingProperty");
        this.f125743c = correspondingProperty;
    }
}
