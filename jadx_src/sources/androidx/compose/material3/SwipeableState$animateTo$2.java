package androidx.compose.material3;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "", "", "anchors", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class SwipeableState$animateTo$2<T> implements kotlinx.coroutines.flow.f<Map<Float, ? extends T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ T f11089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ SwipeableState<T> f11090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.core.h<Float> f11091d;

    SwipeableState$animateTo$2(T t10, SwipeableState<T> swipeableState, androidx.compose.animation.core.h<Float> hVar) {
        this.f11089b = t10;
        this.f11090c = swipeableState;
        this.f11091d = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:48:0x010f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0111  */
    /* JADX WARN: Code duplicated, block: B:54:0x012a  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.f
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object emit(@dl.d Map<Float, ? extends T> map, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) throws Throwable {
        SwipeableState$animateTo$2$emit$1 swipeableState$animateTo$2$emit$1;
        SwipeableState$animateTo$2<T> swipeableState$animateTo$2;
        float fFloatValue;
        LinkedHashMap linkedHashMap;
        Object objZ2;
        boolean z10;
        float fFloatValue2;
        LinkedHashMap linkedHashMap2;
        Object objZ3;
        boolean z11;
        if (cVar instanceof SwipeableState$animateTo$2$emit$1) {
            swipeableState$animateTo$2$emit$1 = (SwipeableState$animateTo$2$emit$1) cVar;
            int i10 = swipeableState$animateTo$2$emit$1.f11096f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                swipeableState$animateTo$2$emit$1.f11096f = i10 - Integer.MIN_VALUE;
            } else {
                swipeableState$animateTo$2$emit$1 = new SwipeableState$animateTo$2$emit$1(this, cVar);
            }
        } else {
            swipeableState$animateTo$2$emit$1 = new SwipeableState$animateTo$2$emit$1(this, cVar);
        }
        Object obj = swipeableState$animateTo$2$emit$1.f11094d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = swipeableState$animateTo$2$emit$1.f11096f;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) swipeableState$animateTo$2$emit$1.f11093c;
            swipeableState$animateTo$2 = (SwipeableState$animateTo$2) swipeableState$animateTo$2$emit$1.f11092b;
            try {
                kotlin.t0.n(obj);
                fFloatValue2 = ((Number) ((SwipeableState) swipeableState$animateTo$2.f11090c).absoluteOffset.getValue()).floatValue();
                linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<Float, ? extends T> entry : map.entrySet()) {
                    if (Math.abs(entry.getKey().floatValue() - fFloatValue2) < 0.5f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                objZ3 = CollectionsKt___CollectionsKt.z2(linkedHashMap2.values());
                if (objZ3 == null) {
                    objZ3 = swipeableState$animateTo$2.f11090c.p();
                }
                swipeableState$animateTo$2.f11090c.K(objZ3);
                return kotlin.b2.f124493a;
            } catch (Throwable th2) {
                th = th2;
                fFloatValue = ((Number) ((SwipeableState) swipeableState$animateTo$2.f11090c).absoluteOffset.getValue()).floatValue();
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Float, ? extends T> entry2 : map.entrySet()) {
                    if (Math.abs(entry2.getKey().floatValue() - fFloatValue) < 0.5f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
                objZ2 = CollectionsKt___CollectionsKt.z2(linkedHashMap.values());
                if (objZ2 == null) {
                    objZ2 = swipeableState$animateTo$2.f11090c.p();
                }
                swipeableState$animateTo$2.f11090c.K(objZ2);
                throw th;
            }
        }
        kotlin.t0.n(obj);
        try {
            Float f10 = SwipeableKt.f(map, this.f11089b);
            if (f10 == null) {
                throw new IllegalArgumentException("The target value must have an associated anchor.".toString());
            }
            SwipeableState<T> swipeableState = this.f11090c;
            float fFloatValue3 = f10.floatValue();
            androidx.compose.animation.core.h<Float> hVar = this.f11091d;
            swipeableState$animateTo$2$emit$1.f11092b = this;
            swipeableState$animateTo$2$emit$1.f11093c = map;
            swipeableState$animateTo$2$emit$1.f11096f = 1;
            if (swipeableState.i(fFloatValue3, hVar, swipeableState$animateTo$2$emit$1) == objH) {
                return objH;
            }
            swipeableState$animateTo$2 = this;
            fFloatValue2 = ((Number) ((SwipeableState) swipeableState$animateTo$2.f11090c).absoluteOffset.getValue()).floatValue();
            linkedHashMap2 = new LinkedHashMap();
            while (r9.hasNext()) {
                if (Math.abs(entry.getKey().floatValue() - fFloatValue2) < 0.5f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            objZ3 = CollectionsKt___CollectionsKt.z2(linkedHashMap2.values());
            if (objZ3 == null) {
                objZ3 = swipeableState$animateTo$2.f11090c.p();
            }
            swipeableState$animateTo$2.f11090c.K(objZ3);
            return kotlin.b2.f124493a;
        } catch (Throwable th3) {
            th = th3;
            swipeableState$animateTo$2 = this;
            fFloatValue = ((Number) ((SwipeableState) swipeableState$animateTo$2.f11090c).absoluteOffset.getValue()).floatValue();
            linkedHashMap = new LinkedHashMap();
            while (r9.hasNext()) {
                if (Math.abs(entry2.getKey().floatValue() - fFloatValue) < 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
            objZ2 = CollectionsKt___CollectionsKt.z2(linkedHashMap.values());
            if (objZ2 == null) {
                objZ2 = swipeableState$animateTo$2.f11090c.p();
            }
            swipeableState$animateTo$2.f11090c.K(objZ2);
            throw th;
        }
    }
}
