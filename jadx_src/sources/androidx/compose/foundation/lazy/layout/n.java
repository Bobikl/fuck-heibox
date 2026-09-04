package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.j2;
import androidx.compose.ui.layout.e1;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.j0;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.layout.q1;
import androidx.compose.ui.unit.LayoutDirection;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import s1.DpRect;

/* JADX INFO: compiled from: LazyLayoutMeasureScope.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.t
@Metadata(bv = {}, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010:\u001a\u000207¢\u0006\u0004\bI\u0010JJH\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0096\u0001J\u001a\u0010\u0011\u001a\u00020\u0003*\u00020\u0010H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u0003*\u00020\u0013H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u0016*\u00020\u0010H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u0016*\u00020\u0013H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u001c*\u00020\u001bH\u0097\u0001J+\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\u0010*\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\u001aJ\u001c\u0010&\u001a\u00020\u0010*\u00020\u0003H\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J\u001c\u0010(\u001a\u00020\u0010*\u00020\u0016H\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010\u0018J\u001c\u0010)\u001a\u00020\u0013*\u00020\u0016H\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u001c\u0010+\u001a\u00020\u0013*\u00020\u0003H\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u00020\u0013*\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010*J\u0019\u00100\u001a\u00020/*\u00020.H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u00020.*\u00020/H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R<\u0010?\u001a*\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0;j\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!`<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020\u00168\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\u00168\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bC\u0010AR\u0014\u0010H\u001a\u00020E8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010G\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006K"}, d2 = {"Landroidx/compose/foundation/lazy/layout/n;", "Landroidx/compose/foundation/lazy/layout/m;", "Landroidx/compose/ui/layout/l0;", "", "width", "height", "", "Landroidx/compose/ui/layout/a;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/e1$a;", "Lkotlin/b2;", "Lkotlin/t;", "placementBlock", "Landroidx/compose/ui/layout/j0;", "p1", "Ls1/h;", "e1", "(F)I", "Ls1/u;", "J1", "(J)I", "", "E1", "(F)F", "k1", "(J)F", "Ls1/k;", "Lb1/i;", "h0", UCropPlusActivity.ARG_INDEX, "Ls1/b;", "constraints", "", "Landroidx/compose/ui/layout/e1;", "k0", "(IJ)Ljava/util/List;", "q", androidx.exifinterface.media.a.S4, "(I)F", "F", ak.aB, "(F)J", "r", "(I)J", "M", "Ls1/l;", "Lb1/m;", "J", "(J)J", "n", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "b", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "itemContentFactory", "Landroidx/compose/ui/layout/q1;", ak.aF, "Landroidx/compose/ui/layout/q1;", "subcomposeMeasureScope", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "d", "Ljava/util/HashMap;", "placeablesCache", "getDensity", "()F", "density", "C1", "fontScale", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/q1;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class n implements m, l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LazyLayoutItemContentFactory itemContentFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final q1 subcomposeMeasureScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final HashMap<Integer, List<e1>> placeablesCache;

    public n(@dl.d LazyLayoutItemContentFactory itemContentFactory, @dl.d q1 subcomposeMeasureScope) {
        f0.p(itemContentFactory, "itemContentFactory");
        f0.p(subcomposeMeasureScope, "subcomposeMeasureScope");
        this.itemContentFactory = itemContentFactory;
        this.subcomposeMeasureScope = subcomposeMeasureScope;
        this.placeablesCache = new HashMap<>();
    }

    @Override // s1.e
    /* JADX INFO: renamed from: C1 */
    public float getF139218c() {
        return this.subcomposeMeasureScope.getF139218c();
    }

    @Override // androidx.compose.foundation.lazy.layout.m, s1.e
    public float E(int i10) {
        return this.subcomposeMeasureScope.E(i10);
    }

    @Override // s1.e
    @j2
    public float E1(float f10) {
        return this.subcomposeMeasureScope.E1(f10);
    }

    @Override // androidx.compose.foundation.lazy.layout.m, s1.e
    public float F(float f10) {
        return this.subcomposeMeasureScope.F(f10);
    }

    @Override // androidx.compose.foundation.lazy.layout.m, s1.e
    public long J(long j10) {
        return this.subcomposeMeasureScope.J(j10);
    }

    @Override // s1.e
    @j2
    public int J1(long j10) {
        return this.subcomposeMeasureScope.J1(j10);
    }

    @Override // androidx.compose.foundation.lazy.layout.m, s1.e
    public long M(float f10) {
        return this.subcomposeMeasureScope.M(f10);
    }

    @Override // s1.e
    @j2
    public int e1(float f10) {
        return this.subcomposeMeasureScope.e1(f10);
    }

    @Override // s1.e
    /* JADX INFO: renamed from: getDensity */
    public float getF139217b() {
        return this.subcomposeMeasureScope.getF139217b();
    }

    @Override // androidx.compose.ui.layout.n
    @dl.d
    public LayoutDirection getLayoutDirection() {
        return this.subcomposeMeasureScope.getLayoutDirection();
    }

    @Override // s1.e
    @j2
    @dl.d
    public b1.i h0(@dl.d DpRect dpRect) {
        f0.p(dpRect, "<this>");
        return this.subcomposeMeasureScope.h0(dpRect);
    }

    @Override // androidx.compose.foundation.lazy.layout.m
    @dl.d
    public List<e1> k0(int index, long constraints) {
        List<e1> list = this.placeablesCache.get(Integer.valueOf(index));
        if (list != null) {
            return list;
        }
        Object objE = this.itemContentFactory.d().invoke().e(index);
        List<g0> listY1 = this.subcomposeMeasureScope.y1(objE, this.itemContentFactory.b(index, objE));
        int size = listY1.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(listY1.get(i10).z1(constraints));
        }
        this.placeablesCache.put(Integer.valueOf(index), arrayList);
        return arrayList;
    }

    @Override // s1.e
    @j2
    public float k1(long j10) {
        return this.subcomposeMeasureScope.k1(j10);
    }

    @Override // androidx.compose.foundation.lazy.layout.m, s1.e
    public long n(long j10) {
        return this.subcomposeMeasureScope.n(j10);
    }

    @Override // androidx.compose.ui.layout.l0
    @dl.d
    public j0 p1(int i10, int i11, @dl.d Map<androidx.compose.ui.layout.a, Integer> alignmentLines, @dl.d yh.l<? super e1.a, b2> placementBlock) {
        f0.p(alignmentLines, "alignmentLines");
        f0.p(placementBlock, "placementBlock");
        return this.subcomposeMeasureScope.p1(i10, i11, alignmentLines, placementBlock);
    }

    @Override // androidx.compose.foundation.lazy.layout.m, s1.e
    public float q(long j10) {
        return this.subcomposeMeasureScope.q(j10);
    }

    @Override // androidx.compose.foundation.lazy.layout.m, s1.e
    public long r(int i10) {
        return this.subcomposeMeasureScope.r(i10);
    }

    @Override // androidx.compose.foundation.lazy.layout.m, s1.e
    public long s(float f10) {
        return this.subcomposeMeasureScope.s(f10);
    }
}
