package androidx.compose.material3;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "", "", "anchors", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class SwipeableState$snapTo$2<T> implements kotlinx.coroutines.flow.f<Map<Float, ? extends T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ T f11109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ SwipeableState<T> f11110c;

    SwipeableState$snapTo$2(T t10, SwipeableState<T> swipeableState) {
        this.f11109b = t10;
        this.f11110c = swipeableState;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.f
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object emit(@dl.d Map<Float, ? extends T> map, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) throws Throwable {
        SwipeableState$snapTo$2$emit$1 swipeableState$snapTo$2$emit$1;
        SwipeableState$snapTo$2<T> swipeableState$snapTo$2;
        if (cVar instanceof SwipeableState$snapTo$2$emit$1) {
            swipeableState$snapTo$2$emit$1 = (SwipeableState$snapTo$2$emit$1) cVar;
            int i10 = swipeableState$snapTo$2$emit$1.f11114e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                swipeableState$snapTo$2$emit$1.f11114e = i10 - Integer.MIN_VALUE;
            } else {
                swipeableState$snapTo$2$emit$1 = new SwipeableState$snapTo$2$emit$1(this, cVar);
            }
        } else {
            swipeableState$snapTo$2$emit$1 = new SwipeableState$snapTo$2$emit$1(this, cVar);
        }
        Object obj = swipeableState$snapTo$2$emit$1.f11112c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = swipeableState$snapTo$2$emit$1.f11114e;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            Float f10 = SwipeableKt.f(map, this.f11109b);
            if (f10 == null) {
                throw new IllegalArgumentException("The target value must have an associated anchor.".toString());
            }
            SwipeableState<T> swipeableState = this.f11110c;
            float fFloatValue = f10.floatValue();
            swipeableState$snapTo$2$emit$1.f11111b = this;
            swipeableState$snapTo$2$emit$1.f11114e = 1;
            if (swipeableState.Q(fFloatValue, swipeableState$snapTo$2$emit$1) == objH) {
                return objH;
            }
            swipeableState$snapTo$2 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            swipeableState$snapTo$2 = (SwipeableState$snapTo$2) swipeableState$snapTo$2$emit$1.f11111b;
            kotlin.t0.n(obj);
        }
        swipeableState$snapTo$2.f11110c.K(swipeableState$snapTo$2.f11109b);
        return kotlin.b2.f124493a;
    }
}
