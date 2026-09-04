package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: ModalityUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b0 {
    public static final boolean a(@dl.d d dVar) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        return dVar.l() == Modality.FINAL && dVar.b() != ClassKind.ENUM_CLASS;
    }
}
