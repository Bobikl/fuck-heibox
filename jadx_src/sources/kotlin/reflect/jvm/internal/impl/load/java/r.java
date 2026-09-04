package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.EnumMap;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: JavaTypeQualifiersByElementType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final EnumMap<AnnotationQualifierApplicabilityType, l> f126303a;

    public r(@dl.d EnumMap<AnnotationQualifierApplicabilityType, l> defaultQualifiers) {
        f0.p(defaultQualifiers, "defaultQualifiers");
        this.f126303a = defaultQualifiers;
    }

    @dl.e
    public final l a(@dl.e AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
        return this.f126303a.get(annotationQualifierApplicabilityType);
    }

    @dl.d
    public final EnumMap<AnnotationQualifierApplicabilityType, l> b() {
        return this.f126303a;
    }
}
