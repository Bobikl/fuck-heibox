package androidx.paging;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlinx.coroutines.channels.ClosedSendChannelException;

/* JADX INFO: compiled from: CachedPageEventFlow.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00040\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\f\u001a\u00020\u000bR&\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/paging/TemporaryDownstream;", "", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/e;", "Lkotlin/collections/h0;", "Landroidx/paging/PageEvent;", "b", androidx.core.app.o0.I0, "", ak.aF, "(Lkotlin/collections/h0;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/b2;", ak.av, "Lkotlinx/coroutines/channels/k;", "Lkotlinx/coroutines/channels/k;", "historyChannel", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class TemporaryDownstream<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kotlinx.coroutines.channels.k<kotlin.collections.h0<PageEvent<T>>> historyChannel = kotlinx.coroutines.channels.m.d(Integer.MAX_VALUE, null, null, 6, null);

    public final void a() {
        kotlinx.coroutines.channels.b0.a.a(this.historyChannel, null, 1, null);
    }

    @dl.d
    public final kotlinx.coroutines.flow.e<kotlin.collections.h0<PageEvent<T>>> b() {
        return kotlinx.coroutines.flow.g.X(this.historyChannel);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public final Object c(@dl.d kotlin.collections.h0<? extends PageEvent<T>> h0Var, @dl.d kotlin.coroutines.c<? super Boolean> cVar) throws Throwable {
        TemporaryDownstream$send$1 temporaryDownstream$send$1;
        if (cVar instanceof TemporaryDownstream$send$1) {
            temporaryDownstream$send$1 = (TemporaryDownstream$send$1) cVar;
            int i10 = temporaryDownstream$send$1.f26353c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                temporaryDownstream$send$1.f26353c = i10 - Integer.MIN_VALUE;
            } else {
                temporaryDownstream$send$1 = new TemporaryDownstream$send$1(this, cVar);
            }
        } else {
            temporaryDownstream$send$1 = new TemporaryDownstream$send$1(this, cVar);
        }
        Object obj = temporaryDownstream$send$1.f26352b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = temporaryDownstream$send$1.f26353c;
        boolean z10 = true;
        try {
            if (i11 == 0) {
                kotlin.t0.n(obj);
                kotlinx.coroutines.channels.k<kotlin.collections.h0<PageEvent<T>>> kVar = this.historyChannel;
                temporaryDownstream$send$1.f26353c = 1;
                if (kVar.X(h0Var, temporaryDownstream$send$1) == objH) {
                    return objH;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
        } catch (ClosedSendChannelException unused) {
            z10 = false;
        }
        return kotlin.coroutines.jvm.internal.a.a(z10);
    }
}
