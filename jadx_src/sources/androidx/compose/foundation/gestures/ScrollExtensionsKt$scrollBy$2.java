package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.t0;

/* JADX INFO: compiled from: ScrollExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/m;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", f = "ScrollExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollExtensionsKt$scrollBy$2 extends SuspendLambda implements yh.p<m, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f5520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Ref.FloatRef f5521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f5522e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollExtensionsKt$scrollBy$2(Ref.FloatRef floatRef, float f10, kotlin.coroutines.c<? super ScrollExtensionsKt$scrollBy$2> cVar) {
        super(2, cVar);
        this.f5521d = floatRef;
        this.f5522e = f10;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d m mVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ScrollExtensionsKt$scrollBy$2) create(mVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$2 = new ScrollExtensionsKt$scrollBy$2(this.f5521d, this.f5522e, cVar);
        scrollExtensionsKt$scrollBy$2.f5520c = obj;
        return scrollExtensionsKt$scrollBy$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f5519b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        m mVar = (m) this.f5520c;
        this.f5521d.f124888b = mVar.a(this.f5522e);
        return b2.f124493a;
    }
}
