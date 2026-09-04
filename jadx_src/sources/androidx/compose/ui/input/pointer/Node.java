package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.f1;
import androidx.compose.ui.node.g1;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.m, reason: from toString */
/* JADX INFO: compiled from: HitPathTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020\u001d¢\u0006\u0004\b5\u00106J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0017\u0010\u000b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0082\bJ7\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0005H\u0016ø\u0001\u0000J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J7\u0010\u0017\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0005H\u0016ø\u0001\u0000J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\u0006\u0010\u0019\u001a\u00020\u0007J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016R\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\"8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R#\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0(8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0018\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010-R\u0016\u00101\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u0016\u00104\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Landroidx/compose/ui/input/pointer/m;", "Landroidx/compose/ui/input/pointer/n;", "Landroidx/compose/ui/input/pointer/p;", "oldEvent", "newEvent", "", "m", "Lkotlin/b2;", "i", "Lkotlin/Function0;", "block", "j", "", "Landroidx/compose/ui/input/pointer/x;", "Landroidx/compose/ui/input/pointer/y;", "changes", "Landroidx/compose/ui/layout/q;", "parentCoordinates", "Landroidx/compose/ui/input/pointer/h;", "internalPointerEvent", "isInBounds", "f", "e", ak.av, "d", "n", "b", "", "toString", "Landroidx/compose/ui/node/f1;", "Landroidx/compose/ui/node/f1;", "l", "()Landroidx/compose/ui/node/f1;", "pointerInputNode", "Landroidx/compose/runtime/collection/e;", ak.aF, "Landroidx/compose/runtime/collection/e;", "k", "()Landroidx/compose/runtime/collection/e;", "pointerIds", "", "Ljava/util/Map;", "relevantChanges", "Landroidx/compose/ui/layout/q;", "coordinates", "Landroidx/compose/ui/input/pointer/p;", "pointerEvent", "g", "Z", "wasIn", RXScreenCaptureService.KEY_HEIGHT, "isIn", "hasExited", "<init>", "(Landroidx/compose/ui/node/f1;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class Node extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final f1 pointerInputFilter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final androidx.compose.runtime.collection.e<x> pointerIds;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<x, PointerInputChange> relevantChanges;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.layout.q coordinates;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private p pointerEvent;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean wasIn;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isIn;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean hasExited;

    public Node(@dl.d f1 pointerInputNode) {
        kotlin.jvm.internal.f0.p(pointerInputNode, "pointerInputNode");
        this.pointerInputFilter = pointerInputNode;
        this.pointerIds = new androidx.compose.runtime.collection.e<>(new x[16], 0);
        this.relevantChanges = new LinkedHashMap();
        this.isIn = true;
        this.hasExited = true;
    }

    private final void i() {
        this.relevantChanges.clear();
        this.coordinates = null;
    }

    private final boolean j(yh.a<b2> aVar) {
        if (this.relevantChanges.isEmpty() || !g1.c(this.pointerInputFilter)) {
            return false;
        }
        aVar.invoke();
        return true;
    }

    private final boolean m(p oldEvent, p newEvent) {
        if (oldEvent == null || oldEvent.e().size() != newEvent.e().size()) {
            return true;
        }
        int size = newEvent.e().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!b1.f.l(oldEvent.e().get(i10).getPosition(), newEvent.e().get(i10).getPosition())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x017d  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:64:0x01da  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e8  */
    @Override // androidx.compose.ui.input.pointer.n
    public boolean a(@dl.d Map<x, PointerInputChange> changes, @dl.d androidx.compose.ui.layout.q parentCoordinates, @dl.d h internalPointerEvent, boolean isInBounds) {
        PointerInputChange pointerInputChange;
        boolean z10;
        int type;
        r.Companion companion;
        int type2;
        r.Companion companion2;
        int iB;
        kotlin.jvm.internal.f0.p(changes, "changes");
        kotlin.jvm.internal.f0.p(parentCoordinates, "parentCoordinates");
        kotlin.jvm.internal.f0.p(internalPointerEvent, "internalPointerEvent");
        boolean zA = super.a(changes, parentCoordinates, internalPointerEvent, isInBounds);
        if (!g1.c(this.pointerInputFilter)) {
            return true;
        }
        this.coordinates = g1.a(this.pointerInputFilter);
        Iterator<Map.Entry<x, PointerInputChange>> it = changes.entrySet().iterator();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<x, PointerInputChange> next = it.next();
            long jH = next.getKey().h();
            PointerInputChange value = next.getValue();
            if (this.pointerIds.n(x.a(jH))) {
                ArrayList arrayList = new ArrayList();
                List<HistoricalChange> listN = value.n();
                for (int size = listN.size(); i10 < size; size = size) {
                    HistoricalChange historicalChange = listN.get(i10);
                    long uptimeMillis = historicalChange.getUptimeMillis();
                    androidx.compose.ui.layout.q qVar = this.coordinates;
                    kotlin.jvm.internal.f0.m(qVar);
                    arrayList.add(new HistoricalChange(uptimeMillis, qVar.a0(parentCoordinates, historicalChange.getPosition()), null));
                    i10++;
                    listN = listN;
                }
                Map<x, PointerInputChange> map = this.relevantChanges;
                x xVarA = x.a(jH);
                androidx.compose.ui.layout.q qVar2 = this.coordinates;
                kotlin.jvm.internal.f0.m(qVar2);
                long jA0 = qVar2.a0(parentCoordinates, value.getPreviousPosition());
                androidx.compose.ui.layout.q qVar3 = this.coordinates;
                kotlin.jvm.internal.f0.m(qVar3);
                map.put(xVarA, value.h((bb.c.b.f30586db & 1) != 0 ? value.id : 0L, (bb.c.b.f30586db & 2) != 0 ? value.uptimeMillis : 0L, (bb.c.b.f30586db & 4) != 0 ? value.position : qVar3.a0(parentCoordinates, value.getPosition()), (bb.c.b.f30586db & 8) != 0 ? value.pressed : false, (bb.c.b.f30586db & 16) != 0 ? value.previousUptimeMillis : 0L, (bb.c.b.f30586db & 32) != 0 ? value.previousPosition : jA0, (bb.c.b.f30586db & 64) != 0 ? value.previousPressed : false, (bb.c.b.f30586db & 128) != 0 ? value.type : 0, arrayList, (bb.c.b.f30586db & 512) != 0 ? value.scrollDelta : 0L));
            }
        }
        if (this.relevantChanges.isEmpty()) {
            this.pointerIds.m();
            g().m();
            return true;
        }
        for (int i11 = this.pointerIds.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() - 1; -1 < i11; i11--) {
            if (!changes.containsKey(x.a(this.pointerIds.G()[i11].h()))) {
                this.pointerIds.g0(i11);
            }
        }
        p pVar = new p(CollectionsKt___CollectionsKt.Q5(this.relevantChanges.values()), internalPointerEvent);
        List<PointerInputChange> listE = pVar.e();
        int size2 = listE.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = listE.get(i12);
            if (internalPointerEvent.e(pointerInputChange.getId())) {
                break;
            }
            i12++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null) {
            if (isInBounds) {
                if (!this.isIn && (pointerInputChange2.getPressed() || pointerInputChange2.getPreviousPressed())) {
                    androidx.compose.ui.layout.q qVar4 = this.coordinates;
                    kotlin.jvm.internal.f0.m(qVar4);
                    z10 = true;
                    this.isIn = !q.i(pointerInputChange2, qVar4.a());
                }
                if (this.isIn != this.wasIn) {
                    type2 = pVar.getType();
                    companion2 = r.INSTANCE;
                    if (!r.k(type2, companion2.c()) || r.k(pVar.getType(), companion2.a()) || r.k(pVar.getType(), companion2.b())) {
                        if (this.isIn) {
                            iB = companion2.a();
                        } else {
                            iB = companion2.b();
                        }
                        pVar.j(iB);
                    } else {
                        type = pVar.getType();
                        companion = r.INSTANCE;
                        if (!r.k(type, companion.a()) && this.wasIn && !this.hasExited) {
                            pVar.j(companion.c());
                        } else if (r.k(pVar.getType(), companion.b()) && this.isIn && pointerInputChange2.getPressed()) {
                            pVar.j(companion.c());
                        }
                    }
                } else {
                    type = pVar.getType();
                    companion = r.INSTANCE;
                    if (!r.k(type, companion.a())) {
                        if (r.k(pVar.getType(), companion.b())) {
                            pVar.j(companion.c());
                        }
                    } else if (r.k(pVar.getType(), companion.b())) {
                        pVar.j(companion.c());
                    }
                }
            } else {
                this.isIn = false;
            }
            z10 = true;
            if (this.isIn != this.wasIn) {
                type2 = pVar.getType();
                companion2 = r.INSTANCE;
                if (r.k(type2, companion2.c())) {
                }
                if (this.isIn) {
                    iB = companion2.a();
                } else {
                    iB = companion2.b();
                }
                pVar.j(iB);
            } else {
                type = pVar.getType();
                companion = r.INSTANCE;
                if (!r.k(type, companion.a())) {
                    if (r.k(pVar.getType(), companion.b())) {
                        pVar.j(companion.c());
                    }
                } else if (r.k(pVar.getType(), companion.b())) {
                    pVar.j(companion.c());
                }
            }
        } else {
            z10 = true;
        }
        boolean z11 = (zA || !r.k(pVar.getType(), r.INSTANCE.c()) || m(this.pointerEvent, pVar)) ? z10 : false;
        this.pointerEvent = pVar;
        return z11;
    }

    @Override // androidx.compose.ui.input.pointer.n
    public void b(@dl.d h internalPointerEvent) {
        kotlin.jvm.internal.f0.p(internalPointerEvent, "internalPointerEvent");
        super.b(internalPointerEvent);
        p pVar = this.pointerEvent;
        if (pVar == null) {
            return;
        }
        this.wasIn = this.isIn;
        List<PointerInputChange> listE = pVar.e();
        int size = listE.size();
        for (int i10 = 0; i10 < size; i10++) {
            PointerInputChange pointerInputChange = listE.get(i10);
            if ((pointerInputChange.getPressed() || (internalPointerEvent.e(pointerInputChange.getId()) && this.isIn)) ? false : true) {
                this.pointerIds.c0(x.a(pointerInputChange.getId()));
            }
        }
        this.isIn = false;
        this.hasExited = r.k(pVar.getType(), r.INSTANCE.b());
    }

    @Override // androidx.compose.ui.input.pointer.n
    public void d() {
        androidx.compose.runtime.collection.e<Node> eVarG = g();
        int i10 = eVarG.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 > 0) {
            int i11 = 0;
            Node[] nodeArrG = eVarG.G();
            kotlin.jvm.internal.f0.n(nodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                nodeArrG[i11].d();
                i11++;
            } while (i11 < i10);
        }
        this.pointerInputFilter.m();
    }

    @Override // androidx.compose.ui.input.pointer.n
    public boolean e(@dl.d h internalPointerEvent) {
        androidx.compose.runtime.collection.e<Node> eVarG;
        int i10;
        kotlin.jvm.internal.f0.p(internalPointerEvent, "internalPointerEvent");
        boolean z10 = true;
        int i11 = 0;
        if (!this.relevantChanges.isEmpty() && g1.c(this.pointerInputFilter)) {
            p pVar = this.pointerEvent;
            kotlin.jvm.internal.f0.m(pVar);
            androidx.compose.ui.layout.q qVar = this.coordinates;
            kotlin.jvm.internal.f0.m(qVar);
            this.pointerInputFilter.o(pVar, PointerEventPass.Final, qVar.a());
            if (g1.c(this.pointerInputFilter) && (i10 = (eVarG = g()).getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String()) > 0) {
                Node[] nodeArrG = eVarG.G();
                kotlin.jvm.internal.f0.n(nodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    nodeArrG[i11].e(internalPointerEvent);
                    i11++;
                } while (i11 < i10);
            }
        } else {
            z10 = false;
        }
        b(internalPointerEvent);
        i();
        return z10;
    }

    @Override // androidx.compose.ui.input.pointer.n
    public boolean f(@dl.d Map<x, PointerInputChange> changes, @dl.d androidx.compose.ui.layout.q parentCoordinates, @dl.d h internalPointerEvent, boolean isInBounds) {
        androidx.compose.runtime.collection.e<Node> eVarG;
        int i10;
        kotlin.jvm.internal.f0.p(changes, "changes");
        kotlin.jvm.internal.f0.p(parentCoordinates, "parentCoordinates");
        kotlin.jvm.internal.f0.p(internalPointerEvent, "internalPointerEvent");
        int i11 = 0;
        if (this.relevantChanges.isEmpty() || !g1.c(this.pointerInputFilter)) {
            return false;
        }
        p pVar = this.pointerEvent;
        kotlin.jvm.internal.f0.m(pVar);
        androidx.compose.ui.layout.q qVar = this.coordinates;
        kotlin.jvm.internal.f0.m(qVar);
        long jA = qVar.a();
        this.pointerInputFilter.o(pVar, PointerEventPass.Initial, jA);
        if (g1.c(this.pointerInputFilter) && (i10 = (eVarG = g()).getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String()) > 0) {
            Node[] nodeArrG = eVarG.G();
            kotlin.jvm.internal.f0.n(nodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                Node node = nodeArrG[i11];
                Map<x, PointerInputChange> map = this.relevantChanges;
                androidx.compose.ui.layout.q qVar2 = this.coordinates;
                kotlin.jvm.internal.f0.m(qVar2);
                node.f(map, qVar2, internalPointerEvent, isInBounds);
                i11++;
            } while (i11 < i10);
        }
        if (!g1.c(this.pointerInputFilter)) {
            return true;
        }
        this.pointerInputFilter.o(pVar, PointerEventPass.Main, jA);
        return true;
    }

    @dl.d
    public final androidx.compose.runtime.collection.e<x> k() {
        return this.pointerIds;
    }

    @dl.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public final f1 getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    public final void n() {
        this.isIn = true;
    }

    @dl.d
    public String toString() {
        return "Node(pointerInputFilter=" + this.pointerInputFilter + ", children=" + g() + ", pointerIds=" + this.pointerIds + ')';
    }
}
