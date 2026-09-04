package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Migration.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "it", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", f = "Migration.kt", i = {}, l = {bb.c.b.f30764l5}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__MigrationKt$delayEach$1<T> extends SuspendLambda implements yh.p<T, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f129547c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__MigrationKt$delayEach$1(long j10, kotlin.coroutines.c<? super FlowKt__MigrationKt$delayEach$1> cVar) {
        super(2, cVar);
        this.f129547c = j10;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(T t10, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((FlowKt__MigrationKt$delayEach$1) create(t10, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new FlowKt__MigrationKt$delayEach$1(this.f129547c, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f129546b;
        if (i10 == 0) {
            t0.n(obj);
            long j10 = this.f129547c;
            this.f129546b = 1;
            if (DelayKt.b(j10, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
