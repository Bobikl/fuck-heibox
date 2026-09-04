package androidx.compose.runtime;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.runtime.w1, reason: from toString */
/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b3\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010:\u001a\u000206¢\u0006\u0004\bp\u0010qJ\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010 \u001a\u00020\u001eJ\u0006\u0010!\u001a\u00020\u001eJ\u0006\u0010\"\u001a\u00020\u001eJ\u0006\u0010#\u001a\u00020\u001eJ\u0006\u0010$\u001a\u00020\u0003J\u0006\u0010%\u001a\u00020\u001eJ\u000e\u0010&\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010'\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010(\u001a\u00020\u001eJ\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)JQ\u00101\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u000328\u00100\u001a4\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u001e0,H\u0000¢\u0006\u0004\b1\u00102J\b\u00104\u001a\u000203H\u0016J\u0010\u00105\u001a\u00020\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u0003R\u001a\u0010:\u001a\u0002068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00107\u001a\u0004\b8\u00109R\u0014\u0010=\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u001c\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010@R\u0014\u0010B\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0015R$\u0010F\u001a\u00020\t2\u0006\u0010C\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010$\u001a\u0004\bD\u0010ER$\u0010I\u001a\u00020\u00032\u0006\u0010C\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\bG\u0010HR$\u0010K\u001a\u00020\u00032\u0006\u0010C\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010\u0015\u001a\u0004\bJ\u0010HR$\u0010M\u001a\u00020\u00032\u0006\u0010C\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u0010\u0015\u001a\u0004\bL\u0010HR\u0016\u0010N\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010\u0015R\u0016\u0010O\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0016\u0010P\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010\u0015R\u0011\u0010R\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bQ\u0010HR\u0011\u0010T\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bS\u0010HR\u0011\u0010V\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bU\u0010ER\u0011\u0010X\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bW\u0010HR\u0011\u0010Z\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bY\u0010ER\u0011\u0010\\\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b[\u0010ER\u0011\u0010^\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b]\u0010HR\u0011\u0010`\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b_\u0010HR\u0011\u0010b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\ba\u0010HR\u0011\u0010d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bc\u0010HR\u0013\u0010g\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0013\u0010i\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bh\u0010fR\u0013\u0010k\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bj\u0010fR\u0011\u0010m\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bl\u0010HR\u0011\u0010o\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bn\u0010H¨\u0006r"}, d2 = {"Landroidx/compose/runtime/w1;", "", "", "", UCropPlusActivity.ARG_INDEX, androidx.exifinterface.media.a.R4, ak.aF, "U", androidx.exifinterface.media.a.X4, "", "P", androidx.exifinterface.media.a.f23244d5, "R", "K", androidx.exifinterface.media.a.S4, "H", "M", "J", "D", "Landroidx/compose/runtime/c;", "anchor", "I", "L", "f", androidx.exifinterface.media.a.T4, "k", "F", MallPurchaseDetailDialogFragment.f89681y1, "G", "Q", "Lkotlin/b2;", "d", "g", "e", "b0", "c0", "Z", "a0", "X", "Y", RXScreenCaptureService.KEY_HEIGHT, "", "Landroidx/compose/runtime/s0;", "i", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "data", "block", "j", "(ILyh/p;)V", "", "toString", ak.av, "Landroidx/compose/runtime/x1;", "Landroidx/compose/runtime/x1;", "C", "()Landroidx/compose/runtime/x1;", "table", "b", "[I", "groups", "groupsSize", "", "[Ljava/lang/Object;", "slots", "slotsSize", "<set-?>", "l", "()Z", "closed", "n", "()I", "currentGroup", "m", "currentEnd", "y", "parent", "emptyCount", "currentSlot", "currentSlotEnd", androidx.exifinterface.media.a.W4, UiKitSpanObj.TYPE_SIZE, "B", "slot", "O", "isNode", "x", "nodeCount", "N", "isGroupEnd", RXScreenCaptureService.KEY_WIDTH, "inEmpty", "t", "groupSize", "p", "groupEnd", "q", "groupKey", "v", "groupSlotIndex", ak.aB, "()Ljava/lang/Object;", "groupObjectKey", "o", "groupAux", "r", "groupNode", ak.aD, "parentNodes", ak.aG, "groupSlotCount", "<init>", "(Landroidx/compose/runtime/x1;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class SlotReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final x1 table;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final int[] groups;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int groupsSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object[] slots;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int slotsSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private int current;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private int end;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private int parent;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int emptyCount;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int currentSlot;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int currentSlotEnd;

    public SlotReader(@dl.d x1 table) {
        kotlin.jvm.internal.f0.p(table, "table");
        this.table = table;
        this.groups = table.getGroups();
        int iD = table.getGroupsSize();
        this.groupsSize = iD;
        this.slots = table.getSlots();
        this.slotsSize = table.getSlotsSize();
        this.end = iD;
        this.parent = -1;
    }

    private final Object S(int[] iArr, int i10) {
        return z1.X(iArr, i10) ? this.slots[z1.f0(iArr, i10)] : p.INSTANCE.a();
    }

    private final Object U(int[] iArr, int i10) {
        if (z1.V(iArr, i10)) {
            return this.slots[z1.g0(iArr, i10)];
        }
        return null;
    }

    public static /* synthetic */ c b(SlotReader slotReader, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = slotReader.current;
        }
        return slotReader.a(i10);
    }

    private final Object c(int[] iArr, int i10) {
        return z1.T(iArr, i10) ? this.slots[z1.H(iArr, i10)] : p.INSTANCE.a();
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final int B() {
        return this.currentSlot - z1.m0(this.groups, this.parent);
    }

    @dl.d
    /* JADX INFO: renamed from: C, reason: from getter */
    public final x1 getTable() {
        return this.table;
    }

    @dl.e
    public final Object D(int index) {
        return c(this.groups, index);
    }

    public final int E(int index) {
        return index + z1.Q(this.groups, index);
    }

    @dl.e
    public final Object F(int index) {
        return G(this.current, index);
    }

    @dl.e
    public final Object G(int group, int index) {
        int iM0 = z1.m0(this.groups, group);
        int i10 = group + 1;
        int i11 = iM0 + index;
        return i11 < (i10 < this.groupsSize ? z1.L(this.groups, i10) : this.slotsSize) ? this.slots[i11] : p.INSTANCE.a();
    }

    public final int H(int index) {
        return z1.Y(this.groups, index);
    }

    public final int I(@dl.d c anchor) {
        kotlin.jvm.internal.f0.p(anchor, "anchor");
        if (anchor.b()) {
            return z1.Y(this.groups, this.table.j(anchor));
        }
        return 0;
    }

    @dl.e
    public final Object J(int index) {
        return U(this.groups, index);
    }

    public final int K(int index) {
        return z1.Q(this.groups, index);
    }

    public final boolean L(int index) {
        return z1.U(this.groups, index);
    }

    public final boolean M(int index) {
        return z1.V(this.groups, index);
    }

    public final boolean N() {
        return w() || this.current == this.end;
    }

    public final boolean O() {
        return z1.X(this.groups, this.current);
    }

    public final boolean P(int index) {
        return z1.X(this.groups, index);
    }

    @dl.e
    public final Object Q() {
        int i10;
        if (this.emptyCount > 0 || (i10 = this.currentSlot) >= this.currentSlotEnd) {
            return p.INSTANCE.a();
        }
        Object[] objArr = this.slots;
        this.currentSlot = i10 + 1;
        return objArr[i10];
    }

    @dl.e
    public final Object R(int index) {
        if (z1.X(this.groups, index)) {
            return S(this.groups, index);
        }
        return null;
    }

    public final int T(int index) {
        return z1.c0(this.groups, index);
    }

    public final int V(int index) {
        return z1.h0(this.groups, index);
    }

    public final int W(int index) {
        if (index >= 0 && index < this.groupsSize) {
            return z1.h0(this.groups, index);
        }
        throw new IllegalArgumentException(("Invalid group index " + index).toString());
    }

    public final void X(int i10) {
        if (!(this.emptyCount == 0)) {
            ComposerKt.A("Cannot reposition while in an empty region".toString());
            throw new KotlinNothingValueException();
        }
        this.current = i10;
        int iH0 = i10 < this.groupsSize ? z1.h0(this.groups, i10) : -1;
        this.parent = iH0;
        if (iH0 < 0) {
            this.end = this.groupsSize;
        } else {
            this.end = iH0 + z1.Q(this.groups, iH0);
        }
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void Y(int i10) {
        int iQ = z1.Q(this.groups, i10) + i10;
        int i11 = this.current;
        if (i11 >= i10 && i11 <= iQ) {
            this.parent = i10;
            this.end = iQ;
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            return;
        }
        ComposerKt.A(("Index " + i10 + " is not a parent of " + i11).toString());
        throw new KotlinNothingValueException();
    }

    public final int Z() {
        if (!(this.emptyCount == 0)) {
            ComposerKt.A("Cannot skip while in an empty region".toString());
            throw new KotlinNothingValueException();
        }
        int iC0 = z1.X(this.groups, this.current) ? 1 : z1.c0(this.groups, this.current);
        int i10 = this.current;
        this.current = i10 + z1.Q(this.groups, i10);
        return iC0;
    }

    @dl.d
    public final c a(int index) {
        ArrayList<c> arrayListA = this.table.A();
        int iK0 = z1.k0(arrayListA, index, this.groupsSize);
        if (iK0 < 0) {
            c cVar = new c(index);
            arrayListA.add(-(iK0 + 1), cVar);
            return cVar;
        }
        c cVar2 = arrayListA.get(iK0);
        kotlin.jvm.internal.f0.o(cVar2, "get(location)");
        return cVar2;
    }

    public final void a0() {
        if (this.emptyCount == 0) {
            this.current = this.end;
        } else {
            ComposerKt.A("Cannot skip the enclosing group while in an empty region".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void b0() {
        if (this.emptyCount <= 0) {
            if (!(z1.h0(this.groups, this.current) == this.parent)) {
                throw new IllegalArgumentException("Invalid slot table detected".toString());
            }
            int i10 = this.current;
            this.parent = i10;
            this.end = i10 + z1.Q(this.groups, i10);
            int i11 = this.current;
            int i12 = i11 + 1;
            this.current = i12;
            this.currentSlot = z1.m0(this.groups, i11);
            this.currentSlotEnd = i11 >= this.groupsSize - 1 ? this.slotsSize : z1.L(this.groups, i12);
        }
    }

    public final void c0() {
        if (this.emptyCount <= 0) {
            if (!z1.X(this.groups, this.current)) {
                throw new IllegalArgumentException("Expected a node group".toString());
            }
            b0();
        }
    }

    public final void d() {
        this.emptyCount++;
    }

    public final void e() {
        this.closed = true;
        this.table.o(this);
    }

    public final boolean f(int index) {
        return z1.J(this.groups, index);
    }

    public final void g() {
        int i10 = this.emptyCount;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
        }
        this.emptyCount = i10 - 1;
    }

    public final void h() {
        if (this.emptyCount == 0) {
            if (!(this.current == this.end)) {
                ComposerKt.A("endGroup() not called at the end of a group".toString());
                throw new KotlinNothingValueException();
            }
            int iH0 = z1.h0(this.groups, this.parent);
            this.parent = iH0;
            this.end = iH0 < 0 ? this.groupsSize : iH0 + z1.Q(this.groups, iH0);
        }
    }

    @dl.d
    public final List<s0> i() {
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount > 0) {
            return arrayList;
        }
        int iQ = this.current;
        int i10 = 0;
        while (iQ < this.end) {
            arrayList.add(new s0(z1.Y(this.groups, iQ), U(this.groups, iQ), iQ, z1.X(this.groups, iQ) ? 1 : z1.c0(this.groups, iQ), i10));
            iQ += z1.Q(this.groups, iQ);
            i10++;
        }
        return arrayList;
    }

    public final void j(int group, @dl.d yh.p<? super Integer, Object, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        int iM0 = z1.m0(this.groups, group);
        int i10 = group + 1;
        int iL = i10 < this.table.getGroupsSize() ? z1.L(this.table.getGroups(), i10) : this.table.getSlotsSize();
        for (int i11 = iM0; i11 < iL; i11++) {
            block.invoke(Integer.valueOf(i11 - iM0), this.slots[i11]);
        }
    }

    @dl.e
    public final Object k(int index) {
        int i10 = this.currentSlot + index;
        return i10 < this.currentSlotEnd ? this.slots[i10] : p.INSTANCE.a();
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getCurrent() {
        return this.current;
    }

    @dl.e
    public final Object o() {
        int i10 = this.current;
        if (i10 < this.end) {
            return c(this.groups, i10);
        }
        return 0;
    }

    public final int p() {
        return this.end;
    }

    public final int q() {
        int i10 = this.current;
        if (i10 < this.end) {
            return z1.Y(this.groups, i10);
        }
        return 0;
    }

    @dl.e
    public final Object r() {
        int i10 = this.current;
        if (i10 < this.end) {
            return S(this.groups, i10);
        }
        return null;
    }

    @dl.e
    public final Object s() {
        int i10 = this.current;
        if (i10 < this.end) {
            return U(this.groups, i10);
        }
        return null;
    }

    public final int t() {
        return z1.Q(this.groups, this.current);
    }

    @dl.d
    public String toString() {
        return "SlotReader(current=" + this.current + ", key=" + q() + ", parent=" + this.parent + ", end=" + this.end + ')';
    }

    public final int u() {
        int i10 = this.current;
        int iM0 = z1.m0(this.groups, i10);
        int i11 = i10 + 1;
        return (i11 < this.groupsSize ? z1.L(this.groups, i11) : this.slotsSize) - iM0;
    }

    public final int v() {
        return this.currentSlot - z1.m0(this.groups, this.parent);
    }

    public final boolean w() {
        return this.emptyCount > 0;
    }

    public final int x() {
        return z1.c0(this.groups, this.current);
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final int getParent() {
        return this.parent;
    }

    public final int z() {
        int i10 = this.parent;
        if (i10 >= 0) {
            return z1.c0(this.groups, i10);
        }
        return 0;
    }
}
