package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: Modality.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum Modality {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;


    @dl.d
    public static final a Companion = new a(null);

    /* JADX INFO: compiled from: Modality.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Modality a(boolean z10, boolean z11, boolean z12) {
            if (z10) {
                return Modality.SEALED;
            }
            if (z11) {
                return Modality.ABSTRACT;
            }
            return z12 ? Modality.OPEN : Modality.FINAL;
        }
    }
}
