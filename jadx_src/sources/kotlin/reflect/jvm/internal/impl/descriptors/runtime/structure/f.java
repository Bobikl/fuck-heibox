package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f extends e implements mi.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Annotation f125916c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d Annotation annotation) {
        super(fVar, null);
        f0.p(annotation, "annotation");
        this.f125916c = annotation;
    }

    @Override // mi.c
    @dl.d
    public mi.a c() {
        return new d(this.f125916c);
    }
}
