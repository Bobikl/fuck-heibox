package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: AndroidFontLoader.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Landroid/graphics/Typeface;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2", f = "AndroidFontLoader.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AndroidFontLoader_androidKt$loadAsync$2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super Typeface>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f16431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ResourceFont f16432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f16433d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidFontLoader_androidKt$loadAsync$2(ResourceFont resourceFont, Context context, kotlin.coroutines.c<? super AndroidFontLoader_androidKt$loadAsync$2> cVar) {
        super(2, cVar);
        this.f16432c = resourceFont;
        this.f16433d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new AndroidFontLoader_androidKt$loadAsync$2(this.f16432c, this.f16433d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super Typeface> cVar) {
        return ((AndroidFontLoader_androidKt$loadAsync$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f16431b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        return AndroidFontLoader_androidKt.c(this.f16432c, this.f16433d);
    }
}
