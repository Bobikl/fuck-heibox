package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s2;
import kotlinx.coroutines.v1;

/* JADX INFO: compiled from: Broadcast.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007\u001a \u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042-\b\u0002\u0010\u0012\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bj\u0004\u0018\u0001`\u00112/\b\u0001\u0010\u0018\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/ReceiveChannel;", "", "capacity", "Lkotlinx/coroutines/CoroutineStart;", com.google.android.exoplayer2.text.ttml.d.f49798o0, "Lkotlinx/coroutines/channels/h;", "b", "Lkotlinx/coroutines/q0;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "Lkotlin/Function1;", "", "Lkotlin/m0;", "name", "cause", "Lkotlin/b2;", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/w;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "block", ak.av, "(Lkotlinx/coroutines/q0;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/CoroutineStart;Lyh/l;Lyh/p;)Lkotlinx/coroutines/channels/h;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class BroadcastKt {

    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/n0$a", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/l0;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", "exception", "Lkotlin/b2;", "C", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a extends kotlin.coroutines.a implements l0 {
        public a(l0.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.l0
        public void C(@dl.d CoroutineContext coroutineContext, @dl.d Throwable th2) {
        }
    }

    @dl.d
    @s2
    public static final <E> h<E> a(@dl.d q0 q0Var, @dl.d CoroutineContext coroutineContext, int i10, @dl.d CoroutineStart coroutineStart, @dl.e yh.l<? super Throwable, b2> lVar, @kotlin.b @dl.d yh.p<? super w<? super E>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        CoroutineContext coroutineContextE = CoroutineContextKt.e(q0Var, coroutineContext);
        h hVarA = i.a(i10);
        j tVar = coroutineStart.isLazy() ? new t(coroutineContextE, hVarA, pVar) : new j(coroutineContextE, hVarA, true);
        if (lVar != null) {
            ((JobSupport) tVar).K(lVar);
        }
        ((kotlinx.coroutines.a) tVar).J1(coroutineStart, tVar, pVar);
        return (h<E>) tVar;
    }

    @dl.d
    @s2
    public static final <E> h<E> b(@dl.d final ReceiveChannel<? extends E> receiveChannel, int i10, @dl.d CoroutineStart coroutineStart) {
        return c(r0.m(r0.m(v1.f130503b, e1.g()), new a(l0.INSTANCE)), null, i10, coroutineStart, new yh.l<Throwable, b2>() { // from class: kotlinx.coroutines.channels.BroadcastKt$broadcast$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                invoke2(th2);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.e Throwable th2) {
                o.b(receiveChannel, th2);
            }
        }, new BroadcastKt$broadcast$2(receiveChannel, null), 1, null);
    }

    public static /* synthetic */ h c(q0 q0Var, CoroutineContext coroutineContext, int i10, CoroutineStart coroutineStart, yh.l lVar, yh.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f124694b;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            coroutineStart = CoroutineStart.LAZY;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i11 & 8) != 0) {
            lVar = null;
        }
        return a(q0Var, coroutineContext2, i12, coroutineStart2, lVar, pVar);
    }

    public static /* synthetic */ h d(ReceiveChannel receiveChannel, int i10, CoroutineStart coroutineStart, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        if ((i11 & 2) != 0) {
            coroutineStart = CoroutineStart.LAZY;
        }
        return b(receiveChannel, i10, coroutineStart);
    }
}
