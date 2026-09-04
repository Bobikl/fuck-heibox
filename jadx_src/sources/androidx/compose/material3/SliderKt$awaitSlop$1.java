package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SliderKt", f = "Slider.kt", i = {0}, l = {1048}, m = "awaitSlop-8vUncbI", n = {"initialDelta"}, s = {"L$0"})
public final class SliderKt$awaitSlop$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f10711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f10712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f10713d;

    SliderKt$awaitSlop$1(kotlin.coroutines.c<? super SliderKt$awaitSlop$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f10712c = obj;
        this.f10713d |= Integer.MIN_VALUE;
        return SliderKt.F(null, 0L, 0, this);
    }
}
