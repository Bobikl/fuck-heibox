package androidx.paging.multicast;

import com.max.hbsearch.l;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: SharedFlowProducer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BJ\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012(\u0010\u0017\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0004\u001a\u00020\u0003J\u0013\u0010\u0005\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0003R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/paging/multicast/SharedFlowProducer;", androidx.exifinterface.media.a.f23244d5, "", "Lkotlin/b2;", "f", "e", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "d", "Lkotlinx/coroutines/d2;", ak.av, "Lkotlinx/coroutines/d2;", "collectionJob", "Lkotlinx/coroutines/q0;", "b", "Lkotlinx/coroutines/q0;", "scope", "Lkotlinx/coroutines/flow/e;", ak.aF, "Lkotlinx/coroutines/flow/e;", l.W, "Lkotlin/Function2;", "Landroidx/paging/multicast/ChannelManager$b$b;", "Lkotlin/coroutines/c;", "sendUpsteamMessage", "<init>", "(Lkotlinx/coroutines/q0;Lkotlinx/coroutines/flow/e;Lyh/p;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class SharedFlowProducer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d2 collectionJob;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q0 scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e<T> src;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p<ChannelManager.b.AbstractC0200b<T>, kotlin.coroutines.c<? super b2>, Object> f26541d;

    /* JADX WARN: Multi-variable type inference failed */
    public SharedFlowProducer(@dl.d q0 scope, @dl.d e<? extends T> src, @dl.d p<? super ChannelManager.b.AbstractC0200b<T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> sendUpsteamMessage) {
        f0.p(scope, "scope");
        f0.p(src, "src");
        f0.p(sendUpsteamMessage, "sendUpsteamMessage");
        this.scope = scope;
        this.src = src;
        this.f26541d = sendUpsteamMessage;
        this.collectionJob = k.f(scope, null, CoroutineStart.LAZY, new SharedFlowProducer$collectionJob$1(this, null), 1, null);
    }

    public final void d() {
        d2.a.b(this.collectionJob, null, 1, null);
    }

    @dl.e
    public final Object e(@dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objL = g2.l(this.collectionJob, cVar);
        return objL == kotlin.coroutines.intrinsics.b.h() ? objL : b2.f124493a;
    }

    public final void f() {
        k.f(this.scope, null, null, new SharedFlowProducer$start$1(this, null), 3, null);
    }
}
