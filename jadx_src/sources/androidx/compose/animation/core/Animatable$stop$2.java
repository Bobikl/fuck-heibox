package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Animatable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.animation.core.Animatable$stop$2", f = "Animatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Animatable$stop$2 extends SuspendLambda implements yh.l<kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f4129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Animatable<T, V> f4130c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Animatable$stop$2(Animatable<T, V> animatable, kotlin.coroutines.c<? super Animatable$stop$2> cVar) {
        super(1, cVar);
        this.f4130c = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.d kotlin.coroutines.c<?> cVar) {
        return new Animatable$stop$2(this.f4130c, cVar);
    }

    @Override // yh.l
    @dl.e
    public final Object invoke(@dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((Animatable$stop$2) create(cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f4129b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        this.f4130c.m();
        return b2.f124493a;
    }
}
