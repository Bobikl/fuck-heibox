package androidx.compose.foundation.lazy;

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
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: LazyListItemPlacementAnimator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010,\u001a\u00020*\u0012\u0006\u0010.\u001a\u00020\b¢\u0006\u0004\b@\u0010AJ[\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0012\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u001c\u0010\u0018\u001a\u00020\u0006*\u00020\u0002H\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J<\u0010!\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u001d2\u0006\u0010 \u001a\u00020\u001fJ;\u0010'\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u0006\u0010)\u001a\u00020\u0016R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010+R\u0014\u0010.\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010-R \u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00100R\"\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00100R\u0016\u00106\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00105R\u0016\u00107\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00105R\u0016\u00108\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00105R\u0016\u00109\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00105R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00010:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001b\u0010?\u001a\u00020\u0002*\u00020\u00068BX\u0082\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b3\u0010>\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "", "", UCropPlusActivity.ARG_INDEX, "sizeWithSpacings", "averageItemsSize", "Ls1/n;", "scrolledBy", "", "reverseLayout", "mainAxisLayoutSize", "fallback", "", "Landroidx/compose/foundation/lazy/v;", "visibleItems", ak.av, "(IIIJZIILjava/util/List;)I", "itemIndex", ak.aF, ChannelListActivity.q.f79586f, "Landroidx/compose/foundation/lazy/d;", "itemInfo", "Lkotlin/b2;", "g", RXScreenCaptureService.KEY_HEIGHT, "(I)J", "consumedScroll", "layoutWidth", "layoutHeight", "", "positionedItems", "Landroidx/compose/foundation/lazy/z;", "itemProvider", "e", "key", "placeableIndex", "minOffset", "maxOffset", "rawOffset", "b", "(Ljava/lang/Object;IIIJ)J", "f", "Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/q0;", "scope", "Z", "isVertical", "", "Ljava/util/Map;", "keyToItemInfoMap", "", "d", "keyToIndexMap", "I", "viewportStartItemIndex", "viewportStartItemNotVisiblePartSize", "viewportEndItemIndex", "viewportEndItemNotVisiblePartSize", "", "i", "Ljava/util/Set;", "positionedKeys", "(J)I", "mainAxis", "<init>", "(Lkotlinx/coroutines/q0;Z)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class LazyListItemPlacementAnimator {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final q0 scope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<Object, d> keyToItemInfoMap;

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

    public LazyListItemPlacementAnimator(@dl.d q0 scope, boolean z10) {
        f0.p(scope, "scope");
        this.scope = scope;
        this.isVertical = z10;
        this.keyToItemInfoMap = new LinkedHashMap();
        this.keyToIndexMap = s0.z();
        this.viewportStartItemIndex = -1;
        this.viewportEndItemIndex = -1;
        this.positionedKeys = new LinkedHashSet();
    }

    private final int a(int index, int sizeWithSpacings, int averageItemsSize, long scrolledBy, boolean reverseLayout, int mainAxisLayoutSize, int fallback, List<v> visibleItems) {
        int iC = 0;
        int i10 = this.viewportEndItemIndex;
        boolean z10 = reverseLayout ? i10 > index : i10 < index;
        int i11 = this.viewportStartItemIndex;
        boolean z11 = reverseLayout ? i11 < index : i11 > index;
        if (z10) {
            fi.l lVarW1 = !reverseLayout ? fi.u.W1(this.viewportEndItemIndex + 1, index) : fi.u.W1(index + 1, this.viewportEndItemIndex);
            int iH = lVarW1.h();
            int i12 = lVarW1.i();
            if (iH <= i12) {
                while (true) {
                    iC += c(visibleItems, iH, averageItemsSize);
                    if (iH == i12) {
                        break;
                    }
                    iH++;
                }
            }
            return mainAxisLayoutSize + this.viewportEndItemNotVisiblePartSize + iC + d(scrolledBy);
        }
        if (!z11) {
            return fallback;
        }
        fi.l lVarW2 = !reverseLayout ? fi.u.W1(index + 1, this.viewportStartItemIndex) : fi.u.W1(this.viewportStartItemIndex + 1, index);
        int iH2 = lVarW2.h();
        int i13 = lVarW2.i();
        if (iH2 <= i13) {
            while (true) {
                sizeWithSpacings += c(visibleItems, iH2, averageItemsSize);
                if (iH2 == i13) {
                    break;
                }
                iH2++;
            }
        }
        return (this.viewportStartItemNotVisiblePartSize - sizeWithSpacings) + d(scrolledBy);
    }

    private final int c(List<v> list, int i10, int i11) {
        if (!list.isEmpty() && i10 >= ((v) CollectionsKt___CollectionsKt.w2(list)).getIndex() && i10 <= ((v) CollectionsKt___CollectionsKt.k3(list)).getIndex()) {
            if (i10 - ((v) CollectionsKt___CollectionsKt.w2(list)).getIndex() >= ((v) CollectionsKt___CollectionsKt.k3(list)).getIndex() - i10) {
                for (int iG = CollectionsKt__CollectionsKt.G(list); -1 < iG; iG--) {
                    v vVar = list.get(iG);
                    if (vVar.getIndex() == i10) {
                        return vVar.getSizeWithSpacings();
                    }
                    if (vVar.getIndex() < i10) {
                        break;
                    }
                }
            } else {
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    v vVar2 = list.get(i12);
                    if (vVar2.getIndex() == i10) {
                        return vVar2.getSizeWithSpacings();
                    }
                    if (vVar2.getIndex() > i10) {
                        break;
                    }
                }
            }
        }
        return i11;
    }

    private final int d(long j10) {
        return this.isVertical ? s1.n.o(j10) : s1.n.m(j10);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00d7  */
    private final void g(v vVar, d dVar) {
        while (dVar.c().size() > vVar.g()) {
            kotlin.collections.x.L0(dVar.c());
        }
        while (dVar.c().size() < vVar.g()) {
            int size = dVar.c().size();
            long jF = vVar.f(size);
            List<c0> listC = dVar.c();
            long notAnimatableDelta = dVar.getNotAnimatableDelta();
            listC.add(new c0(s1.o.a(s1.n.m(jF) - s1.n.m(notAnimatableDelta), s1.n.o(jF) - s1.n.o(notAnimatableDelta)), vVar.d(size), null));
        }
        List<c0> listC2 = dVar.c();
        int size2 = listC2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            c0 c0Var = listC2.get(i10);
            long targetOffset = c0Var.getTargetOffset();
            long notAnimatableDelta2 = dVar.getNotAnimatableDelta();
            long jA = s1.o.a(s1.n.m(targetOffset) + s1.n.m(notAnimatableDelta2), s1.n.o(targetOffset) + s1.n.o(notAnimatableDelta2));
            long jF2 = vVar.f(i10);
            c0Var.f(vVar.d(i10));
            androidx.compose.animation.core.f0<s1.n> f0VarB = vVar.b(i10);
            if (!s1.n.j(jA, jF2)) {
                long notAnimatableDelta3 = dVar.getNotAnimatableDelta();
                c0Var.g(s1.o.a(s1.n.m(jF2) - s1.n.m(notAnimatableDelta3), s1.n.o(jF2) - s1.n.o(notAnimatableDelta3)));
                if (f0VarB != null) {
                    c0Var.e(true);
                    kotlinx.coroutines.k.f(this.scope, null, null, new LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1(c0Var, f0VarB, null), 3, null);
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

    public final long b(@dl.d Object key, int placeableIndex, int minOffset, int maxOffset, long rawOffset) {
        f0.p(key, "key");
        d dVar = this.keyToItemInfoMap.get(key);
        if (dVar == null) {
            return rawOffset;
        }
        c0 c0Var = dVar.c().get(placeableIndex);
        long f139239a = c0Var.a().u().getF139239a();
        long notAnimatableDelta = dVar.getNotAnimatableDelta();
        long jA = s1.o.a(s1.n.m(f139239a) + s1.n.m(notAnimatableDelta), s1.n.o(f139239a) + s1.n.o(notAnimatableDelta));
        long targetOffset = c0Var.getTargetOffset();
        long notAnimatableDelta2 = dVar.getNotAnimatableDelta();
        long jA2 = s1.o.a(s1.n.m(targetOffset) + s1.n.m(notAnimatableDelta2), s1.n.o(targetOffset) + s1.n.o(notAnimatableDelta2));
        if (c0Var.b() && ((d(jA2) < minOffset && d(jA) < minOffset) || (d(jA2) > maxOffset && d(jA) > maxOffset))) {
            kotlinx.coroutines.k.f(this.scope, null, null, new LazyListItemPlacementAnimator$getAnimatedOffset$1(c0Var, null), 3, null);
        }
        return jA;
    }

    public final void e(int i10, int i11, int i12, boolean z10, @dl.d List<v> positionedItems, @dl.d z itemProvider) {
        boolean z11;
        boolean z12;
        boolean z13;
        v vVar;
        int iA;
        f0.p(positionedItems, "positionedItems");
        f0.p(itemProvider, "itemProvider");
        int size = positionedItems.size();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                z11 = false;
                break;
            } else {
                if (positionedItems.get(i14).getHasAnimations()) {
                    z11 = true;
                    break;
                }
                i14++;
            }
        }
        if (!z11) {
            f();
            return;
        }
        int i15 = this.isVertical ? i12 : i11;
        int i16 = i10;
        if (z10) {
            i16 = -i16;
        }
        long jH = h(i16);
        v vVar2 = (v) CollectionsKt___CollectionsKt.w2(positionedItems);
        v vVar3 = (v) CollectionsKt___CollectionsKt.k3(positionedItems);
        int size2 = positionedItems.size();
        int iH = 0;
        for (int i17 = 0; i17 < size2; i17++) {
            v vVar4 = positionedItems.get(i17);
            d dVar = this.keyToItemInfoMap.get(vVar4.getKey());
            if (dVar != null) {
                dVar.d(vVar4.getIndex());
            }
            iH += vVar4.getSizeWithSpacings();
        }
        int size3 = iH / positionedItems.size();
        this.positionedKeys.clear();
        int size4 = positionedItems.size();
        int i18 = 0;
        while (i18 < size4) {
            v vVar5 = positionedItems.get(i18);
            this.positionedKeys.add(vVar5.getKey());
            d dVar2 = this.keyToItemInfoMap.get(vVar5.getKey());
            if (dVar2 != null) {
                i18 = i18;
                size4 = size4;
                if (vVar5.getHasAnimations()) {
                    long notAnimatableDelta = dVar2.getNotAnimatableDelta();
                    dVar2.e(s1.o.a(s1.n.m(notAnimatableDelta) + s1.n.m(jH), s1.n.o(notAnimatableDelta) + s1.n.o(jH)));
                    g(vVar5, dVar2);
                } else {
                    this.keyToItemInfoMap.remove(vVar5.getKey());
                }
            } else if (vVar5.getHasAnimations()) {
                d dVar3 = new d(vVar5.getIndex());
                Integer num = this.keyToIndexMap.get(vVar5.getKey());
                long jF = vVar5.f(i13);
                int iD = vVar5.d(i13);
                if (num == null) {
                    iA = d(jF);
                    vVar = vVar5;
                } else {
                    vVar = vVar5;
                    iA = a(num.intValue(), vVar5.getSizeWithSpacings(), size3, jH, z10, i15, !z10 ? d(jF) : (d(jF) - vVar5.getSizeWithSpacings()) + iD, positionedItems) + (z10 ? vVar.getSize() - iD : i13);
                }
                long jG = this.isVertical ? s1.n.g(jF, 0, iA, 1, null) : s1.n.g(jF, iA, 0, 2, null);
                int iG = vVar.g();
                for (int i19 = i13; i19 < iG; i19++) {
                    v vVar6 = vVar;
                    long jF2 = vVar6.f(i19);
                    long jA = s1.o.a(s1.n.m(jF2) - s1.n.m(jF), s1.n.o(jF2) - s1.n.o(jF));
                    dVar3.c().add(new c0(s1.o.a(s1.n.m(jG) + s1.n.m(jA), s1.n.o(jG) + s1.n.o(jA)), vVar6.d(i19), null));
                    b2 b2Var = b2.f124493a;
                }
                v vVar7 = vVar;
                this.keyToItemInfoMap.put(vVar7.getKey(), dVar3);
                g(vVar7, dVar3);
            } else {
                i18 = i18;
                size4 = size4;
            }
            i18++;
            size4 = size4;
            i13 = 0;
        }
        if (z10) {
            this.viewportStartItemIndex = vVar3.getIndex();
            this.viewportStartItemNotVisiblePartSize = (i15 - vVar3.getOffset()) - vVar3.getSize();
            this.viewportEndItemIndex = vVar2.getIndex();
            this.viewportEndItemNotVisiblePartSize = (-vVar2.getOffset()) + (vVar2.getSizeWithSpacings() - vVar2.getSize());
        } else {
            this.viewportStartItemIndex = vVar2.getIndex();
            this.viewportStartItemNotVisiblePartSize = vVar2.getOffset();
            this.viewportEndItemIndex = vVar3.getIndex();
            this.viewportEndItemNotVisiblePartSize = (vVar3.getOffset() + vVar3.getSizeWithSpacings()) - i15;
        }
        Iterator<Map.Entry<Object, d>> it = this.keyToItemInfoMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, d> next = it.next();
            if (!this.positionedKeys.contains(next.getKey())) {
                d value = next.getValue();
                long notAnimatableDelta2 = value.getNotAnimatableDelta();
                value.e(s1.o.a(s1.n.m(notAnimatableDelta2) + s1.n.m(jH), s1.n.o(notAnimatableDelta2) + s1.n.o(jH)));
                Integer num2 = itemProvider.c().get(next.getKey());
                List<c0> listC = value.c();
                int size5 = listC.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size5) {
                        z12 = false;
                        break;
                    }
                    c0 c0Var = listC.get(i20);
                    long targetOffset = c0Var.getTargetOffset();
                    long notAnimatableDelta3 = value.getNotAnimatableDelta();
                    long jA2 = s1.o.a(s1.n.m(targetOffset) + s1.n.m(notAnimatableDelta3), s1.n.o(targetOffset) + s1.n.o(notAnimatableDelta3));
                    if (d(jA2) + c0Var.getSize() > 0 && d(jA2) < i15) {
                        z12 = true;
                        break;
                    }
                    i20++;
                }
                List<c0> listC2 = value.c();
                int size6 = listC2.size();
                int i21 = 0;
                while (true) {
                    if (i21 >= size6) {
                        z13 = false;
                        break;
                    } else {
                        if (listC2.get(i21).b()) {
                            z13 = true;
                            break;
                        }
                        i21++;
                    }
                }
                boolean z14 = !z13;
                if ((!z12 && z14) || num2 == null || value.c().isEmpty()) {
                    it.remove();
                } else {
                    y yVarA = itemProvider.a(b.c(num2.intValue()));
                    int iA2 = a(num2.intValue(), yVarA.getSizeWithSpacings(), size3, jH, z10, i15, i15, positionedItems);
                    if (z10) {
                        iA2 = (i15 - iA2) - yVarA.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                    }
                    v vVarF = yVarA.f(iA2, i11, i12);
                    positionedItems.add(vVarF);
                    g(vVarF, value);
                }
            }
        }
        this.keyToIndexMap = itemProvider.c();
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
