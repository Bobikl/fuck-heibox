package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {305}, m = "invokeSuspend", n = {}, s = {})
public final class AsyncFontListLoader$loadWithTimeoutOrNull$2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super Object>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f16456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AsyncFontListLoader f16457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ u f16458d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncFontListLoader$loadWithTimeoutOrNull$2(AsyncFontListLoader asyncFontListLoader, u uVar, kotlin.coroutines.c<? super AsyncFontListLoader$loadWithTimeoutOrNull$2> cVar) {
        super(2, cVar);
        this.f16457c = asyncFontListLoader;
        this.f16458d = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new AsyncFontListLoader$loadWithTimeoutOrNull$2(this.f16457c, this.f16458d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super Object> cVar) {
        return invoke2(q0Var, (kotlin.coroutines.c<Object>) cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<Object> cVar) {
        return ((AsyncFontListLoader$loadWithTimeoutOrNull$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f16456b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            q0 q0Var = this.f16457c.platformFontLoader;
            u uVar = this.f16458d;
            this.f16456b = 1;
            obj = q0Var.b(uVar, this);
            if (obj == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return obj;
    }
}
