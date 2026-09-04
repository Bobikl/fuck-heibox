package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/flow/internal/j;", "Lkotlin/coroutines/c;", "", "Lkotlin/Result;", "result", "Lkotlin/b2;", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/CoroutineContext;", ak.aF, "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class j implements kotlin.coroutines.c<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final j f130079b = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final CoroutineContext context = EmptyCoroutineContext.f124694b;

    private j() {
    }

    @Override // kotlin.coroutines.c
    @dl.d
    public CoroutineContext getContext() {
        return context;
    }

    @Override // kotlin.coroutines.c
    public void resumeWith(@dl.d Object result) {
    }
}
