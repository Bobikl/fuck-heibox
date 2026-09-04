package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Migration.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/f;", "", "e", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", i = {}, l = {306}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__MigrationKt$onErrorReturn$2<T> extends SuspendLambda implements yh.q<f<? super T>, Throwable, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f129552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f129553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.l<Throwable, Boolean> f129554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ T f129555f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__MigrationKt$onErrorReturn$2(yh.l<? super Throwable, Boolean> lVar, T t10, kotlin.coroutines.c<? super FlowKt__MigrationKt$onErrorReturn$2> cVar) {
        super(3, cVar);
        this.f129554e = lVar;
        this.f129555f = t10;
    }

    @Override // yh.q
    @dl.e
    public final Object invoke(@dl.d f<? super T> fVar, @dl.d Throwable th2, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        FlowKt__MigrationKt$onErrorReturn$2 flowKt__MigrationKt$onErrorReturn$2 = new FlowKt__MigrationKt$onErrorReturn$2(this.f129554e, this.f129555f, cVar);
        flowKt__MigrationKt$onErrorReturn$2.f129552c = fVar;
        flowKt__MigrationKt$onErrorReturn$2.f129553d = th2;
        return flowKt__MigrationKt$onErrorReturn$2.invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f129551b;
        if (i10 == 0) {
            t0.n(obj);
            f fVar = (f) this.f129552c;
            Throwable th2 = (Throwable) this.f129553d;
            if (!this.f129554e.invoke(th2).booleanValue()) {
                throw th2;
            }
            T t10 = this.f129555f;
            this.f129552c = null;
            this.f129551b = 1;
            if (fVar.emit(t10, this) == objH) {
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
