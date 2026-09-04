package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ao\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u000228\u0010\b\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0003\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0004H\u0082\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u000e\u001a\u00028\u0000\"\u000e\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\f*\u00028\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0018\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u0012\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/internal/l0;", androidx.exifinterface.media.a.R4, "", "id", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "prev", "createNewSegment", "Lkotlinx/coroutines/internal/m0;", ak.aF, "(Lkotlinx/coroutines/internal/l0;JLyh/p;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/h;", "N", "b", "(Lkotlinx/coroutines/internal/h;)Lkotlinx/coroutines/internal/h;", "", ak.av, "I", "POINTERS_SHIFT", "Lkotlinx/coroutines/internal/o0;", "Lkotlinx/coroutines/internal/o0;", "getCLOSED$annotations", "()V", "CLOSED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f130166a = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final o0 f130167b = new o0("CLOSED");

    @dl.d
    public static final <N extends h<N>> N b(@dl.d N n10) {
        while (true) {
            Object obj = n10.get_next();
            if (obj == f130167b) {
                return n10;
            }
            h hVar = (h) obj;
            if (hVar != null) {
                n10 = (N) hVar;
            } else if (n10.j()) {
                return n10;
            }
        }
    }

    private static final <S extends l0<S>> Object c(S s10, long j10, yh.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            if (s10.getId() >= j10 && !s10.g()) {
                return m0.b(s10);
            }
            Object obj = s10.get_next();
            if (obj == f130167b) {
                return m0.b(f130167b);
            }
            S sInvoke = (S) ((h) obj);
            if (sInvoke == null) {
                sInvoke = pVar.invoke(Long.valueOf(s10.getId() + 1), s10);
                if (s10.m(sInvoke)) {
                    if (s10.g()) {
                        s10.l();
                    }
                }
            }
            s10 = (Object) sInvoke;
        }
    }

    private static /* synthetic */ void d() {
    }
}
