package androidx.compose.animation.core;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: InfiniteAnimationPolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "", "it", ak.av, "(J)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
public final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2<R> extends Lambda implements yh.l<Long, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.l<Long, R> f4156b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2(yh.l<? super Long, ? extends R> lVar) {
        super(1);
        this.f4156b = lVar;
    }

    public final R a(long j10) {
        return this.f4156b.invoke(Long.valueOf(j10 / 1000000));
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ Object invoke(Long l10) {
        return a(l10.longValue());
    }
}
