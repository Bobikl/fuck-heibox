package androidx.compose.foundation.lazy.layout;

/* JADX INFO: compiled from: IntervalList.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b<T> {
    public static /* synthetic */ void a(c cVar, int i10, int i11, yh.l lVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forEach");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = cVar.a() - 1;
        }
        cVar.b(i10, i11, lVar);
    }
}
