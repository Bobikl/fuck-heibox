package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.s2;

/* JADX INFO: compiled from: Actor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009e\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062-\b\u0002\u0010\u000f\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bj\u0004\u0018\u0001`\u000e2-\u0010\u0015\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/q0;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", "capacity", "Lkotlinx/coroutines/CoroutineStart;", com.google.android.exoplayer2.text.ttml.d.f49798o0, "Lkotlin/Function1;", "", "Lkotlin/m0;", "name", "cause", "Lkotlin/b2;", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/e;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "block", "Lkotlinx/coroutines/channels/b0;", ak.av, "(Lkotlinx/coroutines/q0;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/CoroutineStart;Lyh/l;Lyh/p;)Lkotlinx/coroutines/channels/b0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class d {
    @dl.d
    @s2
    public static final <E> b0<E> a(@dl.d q0 q0Var, @dl.d CoroutineContext coroutineContext, int i10, @dl.d CoroutineStart coroutineStart, @dl.e yh.l<? super Throwable, b2> lVar, @dl.d yh.p<? super e<E>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        CoroutineContext coroutineContextE = CoroutineContextKt.e(q0Var, coroutineContext);
        k kVarD = m.d(i10, null, null, 6, null);
        c sVar = coroutineStart.isLazy() ? new s(coroutineContextE, kVarD, pVar) : new c(coroutineContextE, kVarD, true);
        if (lVar != null) {
            ((JobSupport) sVar).K(lVar);
        }
        ((kotlinx.coroutines.a) sVar).J1(coroutineStart, sVar, pVar);
        return (b0<E>) sVar;
    }

    public static /* synthetic */ b0 b(q0 q0Var, CoroutineContext coroutineContext, int i10, CoroutineStart coroutineStart, yh.l lVar, yh.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f124694b;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i11 & 8) != 0) {
            lVar = null;
        }
        return a(q0Var, coroutineContext2, i12, coroutineStart2, lVar, pVar);
    }
}
