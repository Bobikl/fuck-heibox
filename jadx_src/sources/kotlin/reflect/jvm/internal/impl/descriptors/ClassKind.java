package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: ClassKind.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum ClassKind {
    CLASS("class"),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY(null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");


    @dl.e
    private final String codeRepresentation;

    ClassKind(String str) {
        this.codeRepresentation = str;
    }

    public final boolean isSingleton() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
