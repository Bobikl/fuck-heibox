package androidx.compose.foundation.lazy.grid;

import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: LazyGridItemPlacementAnimator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u0010/\u001a\u00020\b¢\u0006\u0004\bA\u0010BJc\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u001c\u0010\u0018\u001a\u00020\u0006*\u00020\u0002H\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019JD\u0010!\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000fJ;\u0010'\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u0006\u0010)\u001a\u00020\u0016R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010.R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0014008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00101R\"\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00101R\u0016\u00107\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00106R\u0016\u00108\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00106R\u0016\u00109\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00106R\u0016\u0010:\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00106R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00010;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001b\u0010@\u001a\u00020\u0002*\u00020\u00068BX\u0082\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b4\u0010?\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006C"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "", "", UCropPlusActivity.ARG_INDEX, "mainAxisSizeWithSpacings", "averageLineMainAxisSize", "Ls1/n;", "scrolledBy", "", "reverseLayout", "mainAxisLayoutSize", "fallback", "", "Landroidx/compose/foundation/lazy/grid/q;", "visibleItems", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "b", "(IIIJZIILjava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;)I", ChannelListActivity.q.f79586f, "Landroidx/compose/foundation/lazy/grid/f;", "itemInfo", "Lkotlin/b2;", "g", RXScreenCaptureService.KEY_HEIGHT, "(I)J", "consumedScroll", "layoutWidth", "layoutHeight", "", "positionedItems", "Landroidx/compose/foundation/lazy/grid/x;", "measuredItemProvider", "e", "key", "placeableIndex", "minOffset", "maxOffset", "rawOffset", ak.aF, "(Ljava/lang/Object;IIIJ)J", "f", "Lkotlinx/coroutines/q0;", ak.av, "Lkotlinx/coroutines/q0;", "scope", "Z", "isVertical", "", "Ljava/util/Map;", "keyToItemInfoMap", "", "d", "keyToIndexMap", "I", "viewportStartItemIndex", "viewportStartItemNotVisiblePartSize", "viewportEndItemIndex", "viewportEndItemNotVisiblePartSize", "", "i", "Ljava/util/Set;", "positionedKeys", "(J)I", "mainAxis", "<init>", "(Lkotlinx/coroutines/q0;Z)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class LazyGridItemPlacementAnimator {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final q0 scope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<Object, f> keyToItemInfoMap;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Map<Object, Integer> keyToIndexMap;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int viewportStartItemIndex;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int viewportStartItemNotVisiblePartSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int viewportEndItemIndex;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int viewportEndItemNotVisiblePartSize;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Set<Object> positionedKeys;

    public LazyGridItemPlacementAnimator(@dl.d q0 scope, boolean z10) {
        f0.p(scope, "scope");
        this.scope = scope;
        this.isVertical = z10;
        this.keyToItemInfoMap = new LinkedHashMap();
        this.keyToIndexMap = s0.z();
        this.viewportStartItemIndex = -1;
        this.viewportEndItemIndex = -1;
        this.positionedKeys = new LinkedHashSet();
    }

    private final int b(int index, int mainAxisSizeWithSpacings, int averageLineMainAxisSize, long scrolledBy, boolean reverseLayout, int mainAxisLayoutSize, int fallback, List<q> visibleItems, LazyGridSpanLayoutProvider spanLayoutProvider) {
        boolean z10 = true;
        int i10 = this.viewportEndItemIndex;
        boolean z11 = reverseLayout ? i10 > index : i10 < index;
        int i11 = this.viewportStartItemIndex;
        if (reverseLayout ? i11 >= index : i11 <= index) {
            z10 = false;
        }
        if (z11) {
            int iF = i.f(spanLayoutProvider, !reverseLayout ? this.viewportEndItemIndex : index);
            if (reverseLayout) {
                index = this.viewportEndItemIndex;
            }
            return mainAxisLayoutSize + this.viewportEndItemNotVisiblePartSize + d(scrolledBy) + i.i(spanLayoutProvider, iF, i.j(spanLayoutProvider, index), averageLineMainAxisSize, visibleItems);
        }
        if (!z10) {
            return fallback;
        }
        int iF2 = i.f(spanLayoutProvider, !reverseLayout ? index : this.viewportStartItemIndex);
        if (!reverseLayout) {
            index = this.viewportStartItemIndex;
        }
        return this.viewportStartItemNotVisiblePartSize + d(scrolledBy) + (-mainAxisSizeWithSpacings) + (-i.i(spanLayoutProvider, iF2, i.j(spanLayoutProvider, index), averageLineMainAxisSize, visibleItems));
    }

    private final int d(long j10) {
        return this.isVertical ? s1.n.o(j10) : s1.n.m(j10);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00d7  */
    private final void g(q qVar, f fVar) {
        while (fVar.e().size() > qVar.o()) {
            kotlin.collections.x.L0(fVar.e());
        }
        while (fVar.e().size() < qVar.o()) {
            int size = fVar.e().size();
            long offset = qVar.getOffset();
            List<d0> listE = fVar.e();
            long notAnimatableDelta = fVar.getNotAnimatableDelta();
            listE.add(new d0(s1.o.a(s1.n.m(offset) - s1.n.m(notAnimatableDelta), s1.n.o(offset) - s1.n.o(notAnimatableDelta)), qVar.k(size), null));
        }
        List<d0> listE2 = fVar.e();
        int size2 = listE2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            d0 d0Var = listE2.get(i10);
            long targetOffset = d0Var.getTargetOffset();
            long notAnimatableDelta2 = fVar.getNotAnimatableDelta();
            long jA = s1.o.a(s1.n.m(targetOffset) + s1.n.m(notAnimatableDelta2), s1.n.o(targetOffset) + s1.n.o(notAnimatableDelta2));
            long placeableOffset = qVar.getPlaceableOffset();
            d0Var.f(qVar.k(i10));
            androidx.compose.animation.core.f0<s1.n> f0VarD = qVar.d(i10);
            if (!s1.n.j(jA, placeableOffset)) {
                long notAnimatableDelta3 = fVar.getNotAnimatableDelta();
                d0Var.g(s1.o.a(s1.n.m(placeableOffset) - s1.n.m(notAnimatableDelta3), s1.n.o(placeableOffset) - s1.n.o(notAnimatableDelta3)));
                if (f0VarD != null) {
                    d0Var.e(true);
                    kotlinx.coroutines.k.f(this.scope, null, null, new LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1(d0Var, f0VarD, null), 3, null);
                }
            }
        }
    }

    private final long h(int i10) {
        boolean z10 = this.isVertical;
        int i11 = z10 ? 0 : i10;
        if (!z10) {
            i10 = 0;
        }
        return s1.o.a(i11, i10);
    }

    public final long c(@dl.d Object key, int placeableIndex, int minOffset, int maxOffset, long rawOffset) {
        f0.p(key, "key");
        f fVar = this.keyToItemInfoMap.get(key);
        if (fVar == null) {
            return rawOffset;
        }
        d0 d0Var = fVar.e().get(placeableIndex);
        long f139239a = d0Var.a().u().getF139239a();
        long notAnimatableDelta = fVar.getNotAnimatableDelta();
        long jA = s1.o.a(s1.n.m(f139239a) + s1.n.m(notAnimatableDelta), s1.n.o(f139239a) + s1.n.o(notAnimatableDelta));
        long targetOffset = d0Var.getTargetOffset();
        long notAnimatableDelta2 = fVar.getNotAnimatableDelta();
        long jA2 = s1.o.a(s1.n.m(targetOffset) + s1.n.m(notAnimatableDelta2), s1.n.o(targetOffset) + s1.n.o(notAnimatableDelta2));
        if (d0Var.b() && ((d(jA2) < minOffset && d(jA) < minOffset) || (d(jA2) > maxOffset && d(jA) > maxOffset))) {
            kotlinx.coroutines.k.f(this.scope, null, null, new LazyGridItemPlacementAnimator$getAnimatedOffset$1(d0Var, null), 3, null);
        }
        return jA;
    }

    public final void e(int i10, int i11, int i12, boolean z10, @dl.d final List<q> positionedItems, @dl.d x measuredItemProvider, @dl.d LazyGridSpanLayoutProvider spanLayoutProvider) {
        boolean z11;
        boolean z12;
        boolean z13;
        f0.p(positionedItems, "positionedItems");
        f0.p(measuredItemProvider, "measuredItemProvider");
        f0.p(spanLayoutProvider, "spanLayoutProvider");
        int size = positionedItems.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                z11 = false;
                break;
            } else {
                if (positionedItems.get(i13).getHasAnimations()) {
                    z11 = true;
                    break;
                }
                i13++;
            }
        }
        if (!z11) {
            f();
            return;
        }
        int i14 = this.isVertical ? i12 : i11;
        int i15 = i10;
        if (z10) {
            i15 = -i15;
        }
        long jH = h(i15);
        q qVar = (q) CollectionsKt___CollectionsKt.w2(positionedItems);
        q qVar2 = (q) CollectionsKt___CollectionsKt.k3(positionedItems);
        int size2 = positionedItems.size();
        for (int i16 = 0; i16 < size2; i16++) {
            q qVar3 = positionedItems.get(i16);
            f fVar = this.keyToItemInfoMap.get(qVar3.getKey());
            if (fVar != null) {
                fVar.h(qVar3.getIndex());
                fVar.g(qVar3.f());
                fVar.f(qVar3.e());
            }
        }
        yh.l<Integer, Integer> lVar = new yh.l<Integer, Integer>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @dl.d
            public final Integer a(int i17) {
                return Integer.valueOf(this.f6735b.isVertical ? positionedItems.get(i17).getRow() : positionedItems.get(i17).getColumn());
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return a(num.intValue());
            }
        };
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < positionedItems.size()) {
            int iIntValue = lVar.invoke(Integer.valueOf(i17)).intValue();
            if (iIntValue == -1) {
                i17++;
            } else {
                int iMax = 0;
                while (i17 < positionedItems.size() && lVar.invoke(Integer.valueOf(i17)).intValue() == iIntValue) {
                    iMax = Math.max(iMax, positionedItems.get(i17).m());
                    i17++;
                }
                i18 += iMax;
                i19++;
            }
        }
        int i20 = i18 / i19;
        this.positionedKeys.clear();
        int size3 = positionedItems.size();
        int i21 = 0;
        while (i21 < size3) {
            q qVar4 = positionedItems.get(i21);
            this.positionedKeys.add(qVar4.getKey());
            f fVar2 = this.keyToItemInfoMap.get(qVar4.getKey());
            if (fVar2 != null) {
                i21 = i21;
                size3 = size3;
                i14 = i14;
                if (qVar4.getHasAnimations()) {
                    long notAnimatableDelta = fVar2.getNotAnimatableDelta();
                    fVar2.i(s1.o.a(s1.n.m(notAnimatableDelta) + s1.n.m(jH), s1.n.o(notAnimatableDelta) + s1.n.o(jH)));
                    g(qVar4, fVar2);
                } else {
                    this.keyToItemInfoMap.remove(qVar4.getKey());
                }
            } else if (qVar4.getHasAnimations()) {
                f fVar3 = new f(qVar4.getIndex(), qVar4.f(), qVar4.e());
                Integer num = this.keyToIndexMap.get(qVar4.getKey());
                long placeableOffset = qVar4.getPlaceableOffset();
                int iD = num == null ? d(placeableOffset) : b(num.intValue(), qVar4.m(), i20, jH, z10, i14, !z10 ? d(placeableOffset) : d(placeableOffset) - qVar4.m(), positionedItems, spanLayoutProvider);
                long jG = this.isVertical ? s1.n.g(placeableOffset, 0, iD, 1, null) : s1.n.g(placeableOffset, iD, 0, 2, null);
                int iO = qVar4.o();
                for (int i22 = 0; i22 < iO; i22++) {
                    fVar3.e().add(new d0(jG, qVar4.k(i22), null));
                    b2 b2Var = b2.f124493a;
                }
                this.keyToItemInfoMap.put(qVar4.getKey(), fVar3);
                g(qVar4, fVar3);
            } else {
                i21 = i21;
                size3 = size3;
                i14 = i14;
            }
            i21++;
            i14 = i14;
            size3 = size3;
        }
        int i23 = i14;
        if (z10) {
            this.viewportStartItemIndex = qVar2.getIndex();
            this.viewportStartItemNotVisiblePartSize = (i23 - d(qVar2.getOffset())) - qVar2.getLineMainAxisSize();
            this.viewportEndItemIndex = qVar.getIndex();
            this.viewportEndItemNotVisiblePartSize = (-d(qVar.getOffset())) + (qVar.i() - (this.isVertical ? s1.r.j(qVar.getSize()) : s1.r.m(qVar.getSize())));
        } else {
            this.viewportStartItemIndex = qVar.getIndex();
            this.viewportStartItemNotVisiblePartSize = d(qVar.getOffset());
            this.viewportEndItemIndex = qVar2.getIndex();
            this.viewportEndItemNotVisiblePartSize = (d(qVar2.getOffset()) + qVar2.i()) - i23;
        }
        Iterator<Map.Entry<Object, f>> it = this.keyToItemInfoMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, f> next = it.next();
            if (!this.positionedKeys.contains(next.getKey())) {
                f value = next.getValue();
                long notAnimatableDelta2 = value.getNotAnimatableDelta();
                value.i(s1.o.a(s1.n.m(notAnimatableDelta2) + s1.n.m(jH), s1.n.o(notAnimatableDelta2) + s1.n.o(jH)));
                Integer num2 = measuredItemProvider.c().get(next.getKey());
                List<d0> listE = value.e();
                int size4 = listE.size();
                int i24 = 0;
                while (true) {
                    if (i24 >= size4) {
                        z12 = false;
                        break;
                    }
                    d0 d0Var = listE.get(i24);
                    long targetOffset = d0Var.getTargetOffset();
                    long notAnimatableDelta3 = value.getNotAnimatableDelta();
                    long jA = s1.o.a(s1.n.m(targetOffset) + s1.n.m(notAnimatableDelta3), s1.n.o(targetOffset) + s1.n.o(notAnimatableDelta3));
                    if (d(jA) + d0Var.getMainAxisSize() > 0 && d(jA) < i23) {
                        z12 = true;
                        break;
                    }
                    i24++;
                }
                List<d0> listE2 = value.e();
                int size5 = listE2.size();
                int i25 = 0;
                while (true) {
                    if (i25 >= size5) {
                        z13 = false;
                        break;
                    } else {
                        if (listE2.get(i25).b()) {
                            z13 = true;
                            break;
                        }
                        i25++;
                    }
                }
                boolean z14 = !z13;
                if ((!z12 && z14) || num2 == null || value.e().isEmpty()) {
                    it.remove();
                } else {
                    w wVarB = x.b(measuredItemProvider, e.c(num2.intValue()), 0, this.isVertical ? s1.b.f139198b.e(value.getCrossAxisSize()) : s1.b.f139198b.d(value.getCrossAxisSize()), 2, null);
                    int iB = b(num2.intValue(), wVarB.getMainAxisSizeWithSpacings(), i20, jH, z10, i23, i23, positionedItems, spanLayoutProvider);
                    q qVarH = wVarB.h(z10 ? (i23 - iB) - wVarB.getMainAxisSize() : iB, value.getCrossAxisOffset(), i11, i12, -1, -1, wVarB.getMainAxisSize());
                    positionedItems.add(qVarH);
                    g(qVarH, value);
                }
            }
        }
        this.keyToIndexMap = measuredItemProvider.c();
    }

    public final void f() {
        this.keyToItemInfoMap.clear();
        this.keyToIndexMap = s0.z();
        this.viewportStartItemIndex = -1;
        this.viewportStartItemNotVisiblePartSize = 0;
        this.viewportEndItemIndex = -1;
        this.viewportEndItemNotVisiblePartSize = 0;
    }
}
