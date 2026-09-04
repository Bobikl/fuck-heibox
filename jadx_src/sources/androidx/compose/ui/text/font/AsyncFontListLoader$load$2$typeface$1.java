package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
public final class AsyncFontListLoader$load$2$typeface$1 extends SuspendLambda implements yh.l<kotlin.coroutines.c<? super Object>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f16449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AsyncFontListLoader f16450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ u f16451d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncFontListLoader$load$2$typeface$1(AsyncFontListLoader asyncFontListLoader, u uVar, kotlin.coroutines.c<? super AsyncFontListLoader$load$2$typeface$1> cVar) {
        super(1, cVar);
        this.f16450c = asyncFontListLoader;
        this.f16451d = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.d kotlin.coroutines.c<?> cVar) {
        return new AsyncFontListLoader$load$2$typeface$1(this.f16450c, this.f16451d, cVar);
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.c<? super Object> cVar) {
        return invoke2((kotlin.coroutines.c<Object>) cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.e kotlin.coroutines.c<Object> cVar) {
        return ((AsyncFontListLoader$load$2$typeface$1) create(cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f16449b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            AsyncFontListLoader asyncFontListLoader = this.f16450c;
            u uVar = this.f16451d;
            this.f16449b = 1;
            obj = asyncFontListLoader.h(uVar, this);
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
