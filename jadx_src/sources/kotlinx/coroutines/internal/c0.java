package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.n2;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/internal/c0;", "", "Lkotlinx/coroutines/n2;", ak.av, "", "b", "Z", "FAST_SERVICE_LOADER_ENABLED", ak.aF, "Lkotlinx/coroutines/n2;", "dispatcher", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c0 f130154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final boolean FAST_SERVICE_LOADER_ENABLED;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public static final n2 dispatcher;

    static {
        c0 c0Var = new c0();
        f130154a = c0Var;
        FAST_SERVICE_LOADER_ENABLED = q0.e("kotlinx.coroutines.fast.service.loader", true);
        dispatcher = c0Var.a();
    }

    private c0() {
    }

    private final n2 a() {
        Object next;
        n2 n2VarF;
        try {
            List<b0> listD = FAST_SERVICE_LOADER_ENABLED ? n.f130183a.d() : SequencesKt___SequencesKt.c3(SequencesKt__SequencesKt.e(ServiceLoader.load(b0.class, b0.class.getClassLoader()).iterator()));
            Iterator<T> it = listD.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iA = ((b0) next).a();
                    do {
                        Object next2 = it.next();
                        int iA2 = ((b0) next2).a();
                        if (iA < iA2) {
                            next = next2;
                            iA = iA2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            b0 b0Var = (b0) next;
            return (b0Var == null || (n2VarF = d0.f(b0Var, listD)) == null) ? d0.b(null, null, 3, null) : n2VarF;
        } catch (Throwable th2) {
            return d0.b(th2, null, 2, null);
        }
    }
}
