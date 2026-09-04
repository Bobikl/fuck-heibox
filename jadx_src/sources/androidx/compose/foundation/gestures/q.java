package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: TransformableState.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q {
    public static /* synthetic */ void a(r rVar, float f10, long j10, float f11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            j10 = b1.f.f30364b.e();
        }
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        rVar.a(f10, j10, f11);
    }
}
