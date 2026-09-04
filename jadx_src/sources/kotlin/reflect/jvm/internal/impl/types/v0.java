package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: TypeAttributeTranslator.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface v0 {

    /* JADX INFO: compiled from: TypeAttributeTranslator.kt */
    public static final class a {
        public static /* synthetic */ w0 a(v0 v0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, z0 z0Var, kotlin.reflect.jvm.internal.impl.descriptors.k kVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAttributes");
            }
            if ((i10 & 2) != 0) {
                z0Var = null;
            }
            if ((i10 & 4) != 0) {
                kVar = null;
            }
            return v0Var.a(eVar, z0Var, kVar);
        }
    }

    @dl.d
    w0 a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.e z0 z0Var, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.k kVar);
}
