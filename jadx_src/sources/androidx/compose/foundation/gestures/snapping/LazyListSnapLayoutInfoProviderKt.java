package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.g;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.m;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.h;
import androidx.compose.runtime.p;
import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.umeng.analytics.pro.ak;
import fi.f;
import fi.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import s1.r;
import yh.q;

/* JADX INFO: compiled from: LazyListSnapLayoutInfoProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001aU\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002C\b\u0002\u0010\n\u001a=\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\tH\u0007\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a_\u0010\u0014\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122A\u0010\n\u001a=\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\tH\u0000\"\u0018\u0010\u0018\u001a\u00020\u0015*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "Lkotlin/Function3;", "Ls1/e;", "", "Lkotlin/m0;", "name", "layoutSize", "itemSize", "Lkotlin/t;", "positionInLayout", "Landroidx/compose/foundation/gestures/snapping/e;", ak.av, "Landroidx/compose/foundation/gestures/g;", "e", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/gestures/g;", "Landroidx/compose/foundation/lazy/q;", "layoutInfo", "Landroidx/compose/foundation/lazy/m;", ChannelListActivity.q.f79586f, ak.aF, "", "d", "(Landroidx/compose/foundation/lazy/q;)I", "singleAxisViewportSize", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LazyListSnapLayoutInfoProviderKt {

    /* JADX INFO: compiled from: LazyListSnapLayoutInfoProvider.kt */
    @Metadata(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0003*\u00020\u0002H\u0016R\u0014\u0010\f\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"androidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt$a", "Landroidx/compose/foundation/gestures/snapping/e;", "Ls1/e;", "", "initialVelocity", "b", "Lfi/f;", ak.av, ak.aF, "Landroidx/compose/foundation/lazy/q;", "d", "()Landroidx/compose/foundation/lazy/q;", "layoutInfo", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LazyListState f5791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q<s1.e, Float, Float, Float> f5792b;

        /* JADX WARN: Multi-variable type inference failed */
        a(LazyListState lazyListState, q<? super s1.e, ? super Float, ? super Float, Float> qVar) {
            this.f5791a = lazyListState;
            this.f5792b = qVar;
        }

        private final androidx.compose.foundation.lazy.q d() {
            return this.f5791a.q();
        }

        @Override // androidx.compose.foundation.gestures.snapping.e
        @dl.d
        public f<Float> a(@dl.d s1.e eVar) {
            f0.p(eVar, "<this>");
            List<m> listF = d().f();
            q<s1.e, Float, Float, Float> qVar = this.f5792b;
            int size = listF.size();
            float f10 = Float.NEGATIVE_INFINITY;
            float f11 = Float.POSITIVE_INFINITY;
            for (int i10 = 0; i10 < size; i10++) {
                float fC = LazyListSnapLayoutInfoProviderKt.c(eVar, d(), listF.get(i10), qVar);
                if (fC <= 0.0f && fC > f10) {
                    f10 = fC;
                }
                if (fC >= 0.0f && fC < f11) {
                    f11 = fC;
                }
            }
            return t.e(f10, f11);
        }

        @Override // androidx.compose.foundation.gestures.snapping.e
        public float b(@dl.d s1.e eVar, float f10) {
            f0.p(eVar, "<this>");
            return 0.0f;
        }

        @Override // androidx.compose.foundation.gestures.snapping.e
        public float c(@dl.d s1.e eVar) {
            f0.p(eVar, "<this>");
            androidx.compose.foundation.lazy.q qVarD = d();
            if (!(!qVarD.f().isEmpty())) {
                return 0.0f;
            }
            List<m> listF = qVarD.f();
            int size = listF.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += listF.get(i11).getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            }
            return i10 / qVarD.f().size();
        }
    }

    @androidx.compose.foundation.t
    @dl.d
    public static final e a(@dl.d LazyListState lazyListState, @dl.d q<? super s1.e, ? super Float, ? super Float, Float> positionInLayout) {
        f0.p(lazyListState, "lazyListState");
        f0.p(positionInLayout, "positionInLayout");
        return new a(lazyListState, positionInLayout);
    }

    public static /* synthetic */ e b(LazyListState lazyListState, q qVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            qVar = new q<s1.e, Float, Float, Float>() { // from class: androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1
                @dl.d
                public final Float a(@dl.d s1.e eVar, float f10, float f11) {
                    f0.p(eVar, "$this$null");
                    return Float.valueOf((f10 / 2.0f) - (f11 / 2.0f));
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ Float invoke(s1.e eVar, Float f10, Float f11) {
                    return a(eVar, f10.floatValue(), f11.floatValue());
                }
            };
        }
        return a(lazyListState, qVar);
    }

    public static final float c(@dl.d s1.e eVar, @dl.d androidx.compose.foundation.lazy.q layoutInfo, @dl.d m item, @dl.d q<? super s1.e, ? super Float, ? super Float, Float> positionInLayout) {
        f0.p(eVar, "<this>");
        f0.p(layoutInfo, "layoutInfo");
        f0.p(item, "item");
        f0.p(positionInLayout, "positionInLayout");
        return item.getOffset() - positionInLayout.invoke(eVar, Float.valueOf((d(layoutInfo) - layoutInfo.h()) - layoutInfo.getAfterContentPadding()), Float.valueOf(item.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String())).floatValue();
    }

    private static final int d(androidx.compose.foundation.lazy.q qVar) {
        return qVar.getOrientation() == Orientation.Vertical ? r.j(qVar.a()) : r.m(qVar.a());
    }

    @androidx.compose.foundation.t
    @dl.d
    @h
    public static final g e(@dl.d LazyListState lazyListState, @dl.e p pVar, int i10) {
        f0.p(lazyListState, "lazyListState");
        pVar.T(1148456277);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1148456277, i10, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:93)");
        }
        pVar.T(1157296644);
        boolean zS = pVar.s(lazyListState);
        Object objU = pVar.U();
        if (zS || objU == p.INSTANCE.a()) {
            objU = b(lazyListState, null, 2, null);
            pVar.N(objU);
        }
        pVar.c0();
        SnapFlingBehavior snapFlingBehaviorP = SnapFlingBehaviorKt.p((e) objU, pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return snapFlingBehaviorP;
    }
}
