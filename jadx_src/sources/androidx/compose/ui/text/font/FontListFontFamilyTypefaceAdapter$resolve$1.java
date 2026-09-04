package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
public final class FontListFontFamilyTypefaceAdapter$resolve$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f16510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AsyncFontListLoader f16511c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FontListFontFamilyTypefaceAdapter$resolve$1(AsyncFontListLoader asyncFontListLoader, kotlin.coroutines.c<? super FontListFontFamilyTypefaceAdapter$resolve$1> cVar) {
        super(2, cVar);
        this.f16511c = asyncFontListLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new FontListFontFamilyTypefaceAdapter$resolve$1(this.f16511c, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((FontListFontFamilyTypefaceAdapter$resolve$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f16510b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            AsyncFontListLoader asyncFontListLoader = this.f16511c;
            this.f16510b = 1;
            if (asyncFontListLoader.g(this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return b2.f124493a;
    }
}
