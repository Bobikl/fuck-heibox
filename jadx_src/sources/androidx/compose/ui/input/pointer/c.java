package androidx.compose.ui.input.pointer;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c {
    public static long a(d dVar) {
        return b1.m.f30386b.c();
    }

    @dl.e
    public static Object b(d dVar, long j10, @dl.d yh.p pVar, @dl.d kotlin.coroutines.c cVar) {
        return u(dVar, j10, pVar, cVar);
    }

    @dl.e
    public static Object c(d dVar, long j10, @dl.d yh.p pVar, @dl.d kotlin.coroutines.c cVar) {
        return v(dVar, j10, pVar, cVar);
    }

    public static /* synthetic */ Object t(d dVar, PointerEventPass pointerEventPass, kotlin.coroutines.c cVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i10 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return dVar.r1(pointerEventPass, cVar);
    }

    public static /* synthetic */ Object u(d dVar, long j10, yh.p pVar, kotlin.coroutines.c cVar) {
        return pVar.invoke(dVar, cVar);
    }

    public static /* synthetic */ Object v(d dVar, long j10, yh.p pVar, kotlin.coroutines.c cVar) {
        return pVar.invoke(dVar, cVar);
    }
}
