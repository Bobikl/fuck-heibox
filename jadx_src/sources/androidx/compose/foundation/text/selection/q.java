package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SelectionRegistrarImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bb\u0010cJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0016J-\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0016J=\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0005H\u0016J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0016R\"\u0010$\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010&R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u001a\u0010/\u001a\u00060+j\u0002`,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.RC\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000201002\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000201008V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b-\u00105\"\u0004\b6\u00107R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u00105R0\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR?\u0010F\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0005\u0018\u00010E8\u0000@\u0000X\u0080\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR0\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u0010@\u001a\u0004\bM\u0010B\"\u0004\bN\u0010DRK\u0010P\u001a(\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0019\u0018\u00010O8\u0000@\u0000X\u0080\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR*\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010V8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R0\u0010]\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b]\u0010@\u001a\u0004\b3\u0010B\"\u0004\b^\u0010DR0\u0010_\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u0010@\u001a\u0004\b`\u0010B\"\u0004\ba\u0010D\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006d"}, d2 = {"Landroidx/compose/foundation/text/selection/q;", "Landroidx/compose/foundation/text/selection/o;", "Landroidx/compose/foundation/text/selection/i;", "selectable", "j", "Lkotlin/b2;", ak.aF, "", "e", "Landroidx/compose/ui/layout/q;", "containerLayoutCoordinates", "", androidx.exifinterface.media.a.S4, "selectableId", "b", "layoutCoordinates", "Lb1/f;", "startPosition", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", ak.av, "(Landroidx/compose/ui/layout/q;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "i", "newPosition", "previousPosition", "", "isStartHandle", "g", "(Landroidx/compose/ui/layout/q;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "d", RXScreenCaptureService.KEY_HEIGHT, "Z", ak.aG, "()Z", "C", "(Z)V", "sorted", "", "Ljava/util/List;", "_selectables", "", "Ljava/util/Map;", "_selectableMap", "Ljava/util/concurrent/atomic/AtomicLong;", "Landroidx/compose/foundation/AtomicLong;", "f", "Ljava/util/concurrent/atomic/AtomicLong;", "incrementId", "", "Landroidx/compose/foundation/text/selection/j;", "<set-?>", "n", "Landroidx/compose/runtime/a1;", "()Ljava/util/Map;", "D", "(Ljava/util/Map;)V", "subselections", "t", "()Ljava/util/List;", "selectables", ak.aB, "selectableMap", "Lkotlin/Function1;", "onPositionChangeCallback", "Lyh/l;", "m", "()Lyh/l;", RXScreenCaptureService.KEY_WIDTH, "(Lyh/l;)V", "Lkotlin/Function3;", "onSelectionUpdateStartCallback", "Lyh/q;", "r", "()Lyh/q;", "B", "(Lyh/q;)V", "onSelectionUpdateSelectAll", "q", androidx.exifinterface.media.a.W4, "Lkotlin/Function5;", "onSelectionUpdateCallback", "Lyh/s;", "o", "()Lyh/s;", "y", "(Lyh/s;)V", "Lkotlin/Function0;", "onSelectionUpdateEndCallback", "Lyh/a;", "p", "()Lyh/a;", ak.aD, "(Lyh/a;)V", "onSelectableChangeCallback", "x", "afterSelectableUnsubscribe", "l", "v", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class q implements o {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean sorted;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private yh.l<? super Long, b2> f8384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private yh.q<? super androidx.compose.ui.layout.q, ? super b1.f, ? super SelectionAdjustment, b2> f8385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private yh.l<? super Long, b2> f8386i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private yh.s<? super androidx.compose.ui.layout.q, ? super b1.f, ? super b1.f, ? super Boolean, ? super SelectionAdjustment, Boolean> f8387j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private yh.a<b2> f8388k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private yh.l<? super Long, b2> f8389l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private yh.l<? super Long, b2> f8390m;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<i> _selectables = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<Long, i> _selectableMap = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private AtomicLong incrementId = new AtomicLong(1);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 subselections = h2.g(s0.z(), null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int F(androidx.compose.ui.layout.q containerLayoutCoordinates, i a10, i b10) {
        f0.p(containerLayoutCoordinates, "$containerLayoutCoordinates");
        f0.p(a10, "a");
        f0.p(b10, "b");
        androidx.compose.ui.layout.q qVarD = a10.d();
        androidx.compose.ui.layout.q qVarD2 = b10.d();
        long jA0 = qVarD != null ? containerLayoutCoordinates.a0(qVarD, b1.f.f30364b.e()) : b1.f.f30364b.e();
        long jA1 = qVarD2 != null ? containerLayoutCoordinates.a0(qVarD2, b1.f.f30364b.e()) : b1.f.f30364b.e();
        return (b1.f.r(jA0) > b1.f.r(jA1) ? 1 : (b1.f.r(jA0) == b1.f.r(jA1) ? 0 : -1)) == 0 ? kotlin.comparisons.g.l(Float.valueOf(b1.f.p(jA0)), Float.valueOf(b1.f.p(jA1))) : kotlin.comparisons.g.l(Float.valueOf(b1.f.r(jA0)), Float.valueOf(b1.f.r(jA1)));
    }

    public final void A(@dl.e yh.l<? super Long, b2> lVar) {
        this.f8386i = lVar;
    }

    public final void B(@dl.e yh.q<? super androidx.compose.ui.layout.q, ? super b1.f, ? super SelectionAdjustment, b2> qVar) {
        this.f8385h = qVar;
    }

    public final void C(boolean z10) {
        this.sorted = z10;
    }

    public void D(@dl.d Map<Long, Selection> map) {
        f0.p(map, "<set-?>");
        this.subselections.setValue(map);
    }

    @dl.d
    public final List<i> E(@dl.d final androidx.compose.ui.layout.q containerLayoutCoordinates) {
        f0.p(containerLayoutCoordinates, "containerLayoutCoordinates");
        if (!this.sorted) {
            kotlin.collections.w.m0(this._selectables, new Comparator() { // from class: androidx.compose.foundation.text.selection.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return q.F(containerLayoutCoordinates, (i) obj, (i) obj2);
                }
            });
            this.sorted = true;
        }
        return t();
    }

    @Override // androidx.compose.foundation.text.selection.o
    public void a(@dl.d androidx.compose.ui.layout.q layoutCoordinates, long startPosition, @dl.d SelectionAdjustment adjustment) {
        f0.p(layoutCoordinates, "layoutCoordinates");
        f0.p(adjustment, "adjustment");
        yh.q<? super androidx.compose.ui.layout.q, ? super b1.f, ? super SelectionAdjustment, b2> qVar = this.f8385h;
        if (qVar != null) {
            qVar.invoke(layoutCoordinates, b1.f.d(startPosition), adjustment);
        }
    }

    @Override // androidx.compose.foundation.text.selection.o
    public void b(long j10) {
        this.sorted = false;
        yh.l<? super Long, b2> lVar = this.f8384g;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j10));
        }
    }

    @Override // androidx.compose.foundation.text.selection.o
    public void c(@dl.d i selectable) {
        f0.p(selectable, "selectable");
        if (this._selectableMap.containsKey(Long.valueOf(selectable.getSelectableId()))) {
            this._selectables.remove(selectable);
            this._selectableMap.remove(Long.valueOf(selectable.getSelectableId()));
            yh.l<? super Long, b2> lVar = this.f8390m;
            if (lVar != null) {
                lVar.invoke(Long.valueOf(selectable.getSelectableId()));
            }
        }
    }

    @Override // androidx.compose.foundation.text.selection.o
    public void d() {
        yh.a<b2> aVar = this.f8388k;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // androidx.compose.foundation.text.selection.o
    public long e() {
        long andIncrement = this.incrementId.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.incrementId.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // androidx.compose.foundation.text.selection.o
    @dl.d
    public Map<Long, Selection> f() {
        return (Map) this.subselections.getValue();
    }

    @Override // androidx.compose.foundation.text.selection.o
    public boolean g(@dl.d androidx.compose.ui.layout.q layoutCoordinates, long newPosition, long previousPosition, boolean isStartHandle, @dl.d SelectionAdjustment adjustment) {
        f0.p(layoutCoordinates, "layoutCoordinates");
        f0.p(adjustment, "adjustment");
        yh.s<? super androidx.compose.ui.layout.q, ? super b1.f, ? super b1.f, ? super Boolean, ? super SelectionAdjustment, Boolean> sVar = this.f8387j;
        if (sVar != null) {
            return sVar.N0(layoutCoordinates, b1.f.d(newPosition), b1.f.d(previousPosition), Boolean.valueOf(isStartHandle), adjustment).booleanValue();
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.o
    public void h(long j10) {
        yh.l<? super Long, b2> lVar = this.f8389l;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j10));
        }
    }

    @Override // androidx.compose.foundation.text.selection.o
    public void i(long j10) {
        yh.l<? super Long, b2> lVar = this.f8386i;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j10));
        }
    }

    @Override // androidx.compose.foundation.text.selection.o
    @dl.d
    public i j(@dl.d i selectable) {
        f0.p(selectable, "selectable");
        if (!(selectable.getSelectableId() != 0)) {
            throw new IllegalArgumentException(("The selectable contains an invalid id: " + selectable.getSelectableId()).toString());
        }
        if (!this._selectableMap.containsKey(Long.valueOf(selectable.getSelectableId()))) {
            this._selectableMap.put(Long.valueOf(selectable.getSelectableId()), selectable);
            this._selectables.add(selectable);
            this.sorted = false;
            return selectable;
        }
        throw new IllegalArgumentException(("Another selectable with the id: " + selectable + ".selectableId has already subscribed.").toString());
    }

    @dl.e
    public final yh.l<Long, b2> l() {
        return this.f8390m;
    }

    @dl.e
    public final yh.l<Long, b2> m() {
        return this.f8384g;
    }

    @dl.e
    public final yh.l<Long, b2> n() {
        return this.f8389l;
    }

    @dl.e
    public final yh.s<androidx.compose.ui.layout.q, b1.f, b1.f, Boolean, SelectionAdjustment, Boolean> o() {
        return this.f8387j;
    }

    @dl.e
    public final yh.a<b2> p() {
        return this.f8388k;
    }

    @dl.e
    public final yh.l<Long, b2> q() {
        return this.f8386i;
    }

    @dl.e
    public final yh.q<androidx.compose.ui.layout.q, b1.f, SelectionAdjustment, b2> r() {
        return this.f8385h;
    }

    @dl.d
    public final Map<Long, i> s() {
        return this._selectableMap;
    }

    @dl.d
    public final List<i> t() {
        return this._selectables;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getSorted() {
        return this.sorted;
    }

    public final void v(@dl.e yh.l<? super Long, b2> lVar) {
        this.f8390m = lVar;
    }

    public final void w(@dl.e yh.l<? super Long, b2> lVar) {
        this.f8384g = lVar;
    }

    public final void x(@dl.e yh.l<? super Long, b2> lVar) {
        this.f8389l = lVar;
    }

    public final void y(@dl.e yh.s<? super androidx.compose.ui.layout.q, ? super b1.f, ? super b1.f, ? super Boolean, ? super SelectionAdjustment, Boolean> sVar) {
        this.f8387j = sVar;
    }

    public final void z(@dl.e yh.a<b2> aVar) {
        this.f8388k = aVar;
    }
}
