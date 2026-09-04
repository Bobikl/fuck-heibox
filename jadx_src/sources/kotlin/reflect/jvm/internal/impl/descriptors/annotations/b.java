package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* JADX INFO: compiled from: AnnotatedImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class b implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f125597b;

    public b(@dl.d e eVar) {
        if (eVar == null) {
            Z(0);
        }
        this.f125597b = eVar;
    }

    private static /* synthetic */ void Z(int i10) {
        String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 1 ? 3 : 2];
        if (i10 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i10 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i10 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @dl.d
    public e getAnnotations() {
        e eVar = this.f125597b;
        if (eVar == null) {
            Z(1);
        }
        return eVar;
    }
}
