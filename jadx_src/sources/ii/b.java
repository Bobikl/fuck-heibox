package ii;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;

/* JADX INFO: compiled from: ReflectAnnotationSource.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Annotation f119374b;

    public b(@dl.d Annotation annotation) {
        f0.p(annotation, "annotation");
        this.f119374b = annotation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.t0
    @dl.d
    public u0 b() {
        u0 NO_SOURCE_FILE = u0.f125943a;
        f0.o(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    @dl.d
    public final Annotation d() {
        return this.f119374b;
    }
}
