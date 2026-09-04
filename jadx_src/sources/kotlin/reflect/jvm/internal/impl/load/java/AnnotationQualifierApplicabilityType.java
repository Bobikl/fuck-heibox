package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: compiled from: AnnotationQualifierApplicabilityType.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum AnnotationQualifierApplicabilityType {
    METHOD_RETURN_TYPE("METHOD"),
    VALUE_PARAMETER("PARAMETER"),
    FIELD("FIELD"),
    TYPE_USE("TYPE_USE"),
    TYPE_PARAMETER_BOUNDS("TYPE_USE"),
    TYPE_PARAMETER("TYPE_PARAMETER");


    @dl.d
    private final String javaTarget;

    AnnotationQualifierApplicabilityType(String str) {
        this.javaTarget = str;
    }

    @dl.d
    public final String getJavaTarget() {
        return this.javaTarget;
    }
}
