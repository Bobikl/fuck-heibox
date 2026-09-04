package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: ContentInViewModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.ContentInViewModifier$onSizeChanged$1$job$1", f = "ContentInViewModifier.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
public final class ContentInViewModifier$onSizeChanged$1$job$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ContentInViewModifier f5130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ b1.i f5131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ b1.i f5132e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentInViewModifier$onSizeChanged$1$job$1(ContentInViewModifier contentInViewModifier, b1.i iVar, b1.i iVar2, kotlin.coroutines.c<? super ContentInViewModifier$onSizeChanged$1$job$1> cVar) {
        super(2, cVar);
        this.f5130c = contentInViewModifier;
        this.f5131d = iVar;
        this.f5132e = iVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new ContentInViewModifier$onSizeChanged$1$job$1(this.f5130c, this.f5131d, this.f5132e, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ContentInViewModifier$onSizeChanged$1$job$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f5129b;
        if (i10 == 0) {
            t0.n(obj);
            ContentInViewModifier contentInViewModifier = this.f5130c;
            b1.i iVar = this.f5131d;
            b1.i iVar2 = this.f5132e;
            this.f5129b = 1;
            if (contentInViewModifier.u(iVar, iVar2, this) == objH) {
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
