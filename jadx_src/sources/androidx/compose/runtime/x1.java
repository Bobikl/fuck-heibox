package androidx.compose.runtime;

import com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b&\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\bf\u0010gJ\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\u000e\u001a\u00020\u0004*\u00060\nj\u0002`\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0002J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0002J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0002J<\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00028\u00000\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ<\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00028\u00000\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001cJ\u0006\u0010 \u001a\u00020\u0016J\u0006\u0010!\u001a\u00020\u001dJ\u000e\u0010#\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\"J\u000e\u0010&\u001a\u00020\b2\u0006\u0010$\u001a\u00020\"J\u0016\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\"J\u0017\u0010*\u001a\u00020)2\u0006\u0010\u0019\u001a\u00020\u0016H\u0000¢\u0006\u0004\b*\u0010+JW\u00106\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u00042\u000e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000/2\u0006\u00102\u001a\u00020\u00042\u0016\u00105\u001a\u0012\u0012\u0004\u0012\u00020\"03j\b\u0012\u0004\u0012\u00020\"`4H\u0000¢\u0006\u0004\b6\u00107JO\u00108\u001a\u00020)2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u00042\u000e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000/2\u0006\u00102\u001a\u00020\u00042\u0016\u00105\u001a\u0012\u0012\u0004\u0012\u00020\"03j\b\u0012\u0004\u0012\u00020\"`4H\u0000¢\u0006\u0004\b8\u00109J\u001f\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f2\u0006\u0010:\u001a\u00020\u0004H\u0000¢\u0006\u0004\b;\u0010<J\u0006\u0010=\u001a\u00020\bJ\u0006\u0010>\u001a\u00020)J\u0006\u0010@\u001a\u00020?J\u001f\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\bA\u0010<J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00030BH\u0096\u0002J\u0012\u0010E\u001a\u0004\u0018\u00010\u00032\u0006\u0010D\u001a\u000200H\u0016R$\u0010-\u001a\u00020,2\u0006\u0010F\u001a\u00020,8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR$\u0010.\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bK\u0010(\u001a\u0004\bL\u0010MR4\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000/2\u000e\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000/8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR$\u00102\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bR\u0010(\u001a\u0004\bS\u0010MR\u0016\u0010U\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010(R$\u0010\u001e\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\"\u0010^\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010(\u001a\u0004\b[\u0010M\"\u0004\b\\\u0010]R2\u00105\u001a\u0012\u0012\u0004\u0012\u00020\"03j\b\u0012\u0004\u0012\u00020\"`48\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010_\u001a\u0004\b`\u0010a\"\u0004\bW\u0010bR\u0014\u0010c\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010YR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010d\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006h"}, d2 = {"Landroidx/compose/runtime/x1;", "Landroidx/compose/runtime/tooling/b;", "", "Landroidx/compose/runtime/tooling/d;", "", MallPurchaseDetailDialogFragment.f89681y1, "Landroidx/compose/runtime/RecomposeScopeImpl;", "y", "", "L", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", UCropPlusActivity.ARG_INDEX, "level", RXScreenCaptureService.KEY_WIDTH, "", "R", androidx.exifinterface.media.a.f23244d5, "X", "v", "J", "Lkotlin/Function1;", "Landroidx/compose/runtime/w1;", "Lkotlin/m0;", "name", "reader", "block", "Y", "(Lyh/l;)Ljava/lang/Object;", "Landroidx/compose/runtime/a2;", "writer", "k0", "U", androidx.exifinterface.media.a.X4, "Landroidx/compose/runtime/c;", "i", "anchor", "j", androidx.exifinterface.media.a.T4, "groupIndex", "I", "Lkotlin/b2;", "o", "(Landroidx/compose/runtime/w1;)V", "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", ak.aB, "(Landroidx/compose/runtime/a2;[II[Ljava/lang/Object;ILjava/util/ArrayList;)V", "a0", "([II[Ljava/lang/Object;ILjava/util/ArrayList;)V", "target", "Q", "(I)Ljava/util/List;", ak.aG, "h0", "", "l", "d0", "", "iterator", "identityToFind", ak.av, "<set-?>", "b", "[I", "B", "()[I", ak.aF, "D", "()I", "d", "[Ljava/lang/Object;", androidx.exifinterface.media.a.S4, "()[Ljava/lang/Object;", "e", "F", "f", "readers", "g", "Z", "H", "()Z", RXScreenCaptureService.KEY_HEIGHT, "G", "b0", "(I)V", "version", "Ljava/util/ArrayList;", androidx.exifinterface.media.a.W4, "()Ljava/util/ArrayList;", "(Ljava/util/ArrayList;)V", "isEmpty", "()Ljava/lang/Iterable;", "compositionGroups", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class x1 implements androidx.compose.runtime.tooling.b, Iterable<androidx.compose.runtime.tooling.d>, zh.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int groupsSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int slotsSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int readers;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean writer;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private int[] groups = new int[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Object[] slots = new Object[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private ArrayList<c> anchors = new ArrayList<>();

    private final List<Integer> J() {
        return z1.R(this.groups, this.groupsSize * 5);
    }

    private final boolean L(int group) {
        while (group >= 0) {
            for (Object obj : new a0(this, group)) {
                if (obj instanceof RecomposeScopeImpl) {
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                    recomposeScopeImpl.D(true);
                    return recomposeScopeImpl.t(null) != InvalidationResult.IGNORED;
                }
            }
            group = z1.h0(this.groups, group);
        }
        return false;
    }

    private static final void N(SlotReader slotReader, int i10, List<c> list, Ref.BooleanRef booleanRef, x1 x1Var, List<RecomposeScopeImpl> list2) {
        if (slotReader.q() != i10) {
            slotReader.b0();
            while (!slotReader.N()) {
                N(slotReader, i10, list, booleanRef, x1Var, list2);
            }
            slotReader.h();
            return;
        }
        list.add(SlotReader.b(slotReader, 0, 1, null));
        if (booleanRef.f124884b) {
            RecomposeScopeImpl recomposeScopeImplY = x1Var.y(slotReader.getCurrent());
            if (recomposeScopeImplY != null) {
                list2.add(recomposeScopeImplY);
            } else {
                booleanRef.f124884b = false;
                list2.clear();
            }
        }
        slotReader.Z();
    }

    private final List<Integer> R() {
        return z1.Z(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> T() {
        return z1.d0(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> X() {
        return z1.i0(this.groups, this.groupsSize * 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    private static final int i0(Ref.IntRef intRef, x1 x1Var, int i10, int i11) {
        int i12 = intRef.f124889b;
        int i13 = i12 + 1;
        intRef.f124889b = i13;
        int iH0 = z1.h0(x1Var.groups, i12);
        if ((iH0 == i10) != true) {
            throw new IllegalStateException(("Invalid parent index detected at " + i12 + ", expected parent index to be " + i10 + " found " + iH0).toString());
        }
        int iQ = z1.Q(x1Var.groups, i12) + i12;
        if ((iQ <= x1Var.groupsSize) != true) {
            throw new IllegalStateException(("A group extends past the end of the table at " + i12).toString());
        }
        if ((iQ <= i11) != true) {
            throw new IllegalStateException(("A group extends past its parent group at " + i12).toString());
        }
        int iL = z1.L(x1Var.groups, i12);
        int iL2 = i12 >= x1Var.groupsSize - 1 ? x1Var.slotsSize : z1.L(x1Var.groups, i13);
        if ((iL2 <= x1Var.slots.length) != true) {
            throw new IllegalStateException(("Slots for " + i12 + " extend past the end of the slot table").toString());
        }
        if ((iL <= iL2) != true) {
            throw new IllegalStateException(("Invalid data anchor at " + i12).toString());
        }
        if ((z1.m0(x1Var.groups, i12) <= iL2) != true) {
            throw new IllegalStateException(("Slots start out of range at " + i12).toString());
        }
        if ((iL2 - iL >= ((z1.X(x1Var.groups, i12) ? 1 : 0) + (z1.V(x1Var.groups, i12) ? 1 : 0)) + (z1.T(x1Var.groups, i12) ? 1 : 0)) != true) {
            throw new IllegalStateException(("Not enough slots added for group " + i12).toString());
        }
        boolean zX = z1.X(x1Var.groups, i12);
        if (((zX && x1Var.slots[z1.f0(x1Var.groups, i12)] == null) ? false : true) != true) {
            throw new IllegalStateException(("No node recorded for a node group at " + i12).toString());
        }
        int iI0 = 0;
        while (intRef.f124889b < iQ) {
            iI0 += i0(intRef, x1Var, i12, iQ);
        }
        int iC0 = z1.c0(x1Var.groups, i12);
        int iQ2 = z1.Q(x1Var.groups, i12);
        if ((iC0 == iI0) != true) {
            throw new IllegalStateException(("Incorrect node count detected at " + i12 + ", expected " + iC0 + ", received " + iI0).toString());
        }
        int i14 = intRef.f124889b - i12;
        if ((iQ2 == i14) != true) {
            throw new IllegalStateException(("Incorrect slot count detected at " + i12 + ", expected " + iQ2 + ", received " + i14).toString());
        }
        if (z1.I(x1Var.groups, i12)) {
            if (!(i12 <= 0 || z1.J(x1Var.groups, i10))) {
                throw new IllegalStateException(("Expected group " + i10 + " to record it contains a mark because " + i12 + " does").toString());
            }
        }
        if (zX) {
            return 1;
        }
        return iI0;
    }

    private final List<Integer> v() {
        return z1.M(this.groups, this.groupsSize * 5);
    }

    private final int w(StringBuilder sb2, int i10, int i11) {
        boolean z10 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(' ');
        }
        sb2.append("Group(");
        sb2.append(i10);
        sb2.append(") key=");
        sb2.append(z1.Y(this.groups, i10));
        int iQ = z1.Q(this.groups, i10);
        sb2.append(", nodes=");
        sb2.append(z1.c0(this.groups, i10));
        sb2.append(", size=");
        sb2.append(iQ);
        if (z1.U(this.groups, i10)) {
            sb2.append(", mark");
        }
        if (z1.J(this.groups, i10)) {
            sb2.append(", contains mark");
        }
        int iX = x(this, i10);
        int iW = i10 + 1;
        int iX2 = x(this, iW);
        if (iX >= 0 && iX <= iX2) {
            z10 = true;
        }
        if (!z10 || iX2 > this.slotsSize) {
            sb2.append(", *invalid data offsets " + iX + '-' + iX2 + '*');
        } else {
            if (z1.V(this.groups, i10)) {
                sb2.append(" objectKey=" + this.slots[z1.g0(this.groups, i10)]);
            }
            if (z1.X(this.groups, i10)) {
                sb2.append(" node=" + this.slots[z1.f0(this.groups, i10)]);
            }
            if (z1.T(this.groups, i10)) {
                sb2.append(" aux=" + this.slots[z1.H(this.groups, i10)]);
            }
            int iM0 = z1.m0(this.groups, i10);
            if (iM0 < iX2) {
                sb2.append(", slots=[");
                sb2.append(iM0);
                sb2.append(": ");
                for (int i13 = iM0; i13 < iX2; i13++) {
                    if (i13 != iM0) {
                        sb2.append(", ");
                    }
                    sb2.append(String.valueOf(this.slots[i13]));
                }
                sb2.append("]");
            }
        }
        sb2.append('\n');
        int i14 = i10 + iQ;
        while (iW < i14) {
            iW += w(sb2, iW, i11 + 1);
        }
        return iQ;
    }

    private static final int x(x1 x1Var, int i10) {
        return i10 >= x1Var.groupsSize ? x1Var.slotsSize : z1.L(x1Var.groups, i10);
    }

    private final RecomposeScopeImpl y(int group) {
        while (group > 0) {
            for (Object obj : new a0(this, group)) {
                if (obj instanceof RecomposeScopeImpl) {
                    return (RecomposeScopeImpl) obj;
                }
            }
            group = z1.h0(this.groups, group);
        }
        return null;
    }

    @dl.d
    public final ArrayList<c> A() {
        return this.anchors;
    }

    @dl.d
    /* JADX INFO: renamed from: B, reason: from getter */
    public final int[] getGroups() {
        return this.groups;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    @dl.d
    /* JADX INFO: renamed from: E, reason: from getter */
    public final Object[] getSlots() {
        return this.slots;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final int getSlotsSize() {
        return this.slotsSize;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final boolean getWriter() {
        return this.writer;
    }

    public final boolean I(int groupIndex, @dl.d c anchor) {
        kotlin.jvm.internal.f0.p(anchor, "anchor");
        if (!(!this.writer)) {
            ComposerKt.A("Writer is active".toString());
            throw new KotlinNothingValueException();
        }
        if (!(groupIndex >= 0 && groupIndex < this.groupsSize)) {
            ComposerKt.A("Invalid group index".toString());
            throw new KotlinNothingValueException();
        }
        if (W(anchor)) {
            int iQ = z1.Q(this.groups, groupIndex) + groupIndex;
            int location = anchor.getLocation();
            if (groupIndex <= location && location < iQ) {
                return true;
            }
        }
        return false;
    }

    @dl.e
    public final List<RecomposeScopeImpl> Q(int target) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.f124884b = true;
        SlotReader slotReaderU = U();
        try {
            N(slotReaderU, target, arrayList, booleanRef, this, arrayList2);
            kotlin.b2 b2Var = kotlin.b2.f124493a;
            slotReaderU.e();
            SlotWriter slotWriterV = V();
            try {
                slotWriterV.h1();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    c cVar = (c) arrayList.get(i10);
                    if (cVar.e(slotWriterV) >= slotWriterV.getCurrentGroup()) {
                        slotWriterV.W0(cVar);
                        slotWriterV.F();
                    }
                }
                slotWriterV.b1();
                slotWriterV.R();
                slotWriterV.I();
                if (booleanRef.f124884b) {
                    return arrayList2;
                }
                return null;
            } catch (Throwable th2) {
                slotWriterV.I();
                throw th2;
            }
        } catch (Throwable th3) {
            slotReaderU.e();
            throw th3;
        }
    }

    @dl.d
    public final SlotReader U() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.readers++;
        return new SlotReader(this);
    }

    @dl.d
    public final SlotWriter V() {
        if (!(!this.writer)) {
            ComposerKt.A("Cannot start a writer when another writer is pending".toString());
            throw new KotlinNothingValueException();
        }
        if (!(this.readers <= 0)) {
            ComposerKt.A("Cannot start a writer when a reader is pending".toString());
            throw new KotlinNothingValueException();
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    public final boolean W(@dl.d c anchor) {
        kotlin.jvm.internal.f0.p(anchor, "anchor");
        if (anchor.b()) {
            int iK0 = z1.k0(this.anchors, anchor.getLocation(), this.groupsSize);
            if (iK0 >= 0 && kotlin.jvm.internal.f0.g(this.anchors.get(iK0), anchor)) {
                return true;
            }
        }
        return false;
    }

    public final <T> T Y(@dl.d yh.l<? super SlotReader, ? extends T> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        SlotReader slotReaderU = U();
        try {
            return block.invoke(slotReaderU);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            slotReaderU.e();
            kotlin.jvm.internal.c0.c(1);
        }
    }

    public final void Z(@dl.d ArrayList<c> arrayList) {
        kotlin.jvm.internal.f0.p(arrayList, "<set-?>");
        this.anchors = arrayList;
    }

    @Override // androidx.compose.runtime.tooling.b
    @dl.e
    public androidx.compose.runtime.tooling.d a(@dl.d Object identityToFind) {
        kotlin.jvm.internal.f0.p(identityToFind, "identityToFind");
        return new y1(this, 0, 0, 4, null).a(identityToFind);
    }

    public final void a0(@dl.d int[] groups, int groupsSize, @dl.d Object[] slots, int slotsSize, @dl.d ArrayList<c> anchors) {
        kotlin.jvm.internal.f0.p(groups, "groups");
        kotlin.jvm.internal.f0.p(slots, "slots");
        kotlin.jvm.internal.f0.p(anchors, "anchors");
        this.groups = groups;
        this.groupsSize = groupsSize;
        this.slots = slots;
        this.slotsSize = slotsSize;
        this.anchors = anchors;
    }

    @Override // androidx.compose.runtime.tooling.b
    @dl.d
    public Iterable<androidx.compose.runtime.tooling.d> b() {
        return this;
    }

    public final void b0(int i10) {
        this.version = i10;
    }

    @dl.d
    public final List<Object> d0(int group) {
        int iL = z1.L(this.groups, group);
        int i10 = group + 1;
        return ArraysKt___ArraysKt.kz(this.slots).subList(iL, i10 < this.groupsSize ? z1.L(this.groups, i10) : this.slots.length);
    }

    public final void h0() {
        int i10;
        int i11;
        Ref.IntRef intRef = new Ref.IntRef();
        int i12 = -1;
        if (this.groupsSize > 0) {
            while (true) {
                i10 = intRef.f124889b;
                i11 = this.groupsSize;
                if (i10 >= i11) {
                    break;
                } else {
                    i0(intRef, this, -1, i10 + z1.Q(this.groups, i10));
                }
            }
            if (!(i10 == i11)) {
                throw new IllegalStateException(("Incomplete group at root " + intRef.f124889b + " expected to be " + this.groupsSize).toString());
            }
        }
        ArrayList<c> arrayList = this.anchors;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            int iD = arrayList.get(i13).d(this);
            if (!(iD >= 0 && iD <= this.groupsSize)) {
                throw new IllegalArgumentException("Invalid anchor, location out of bound".toString());
            }
            if (!(i12 < iD)) {
                throw new IllegalArgumentException("Anchor is out of order".toString());
            }
            i13++;
            i12 = iD;
        }
    }

    @dl.d
    public final c i(int index) {
        if (!(!this.writer)) {
            ComposerKt.A("use active SlotWriter to create an anchor location instead ".toString());
            throw new KotlinNothingValueException();
        }
        boolean z10 = false;
        if (index >= 0 && index < this.groupsSize) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException("Parameter index is out of range".toString());
        }
        ArrayList<c> arrayList = this.anchors;
        int iK0 = z1.k0(arrayList, index, this.groupsSize);
        if (iK0 < 0) {
            c cVar = new c(index);
            arrayList.add(-(iK0 + 1), cVar);
            return cVar;
        }
        c cVar2 = arrayList.get(iK0);
        kotlin.jvm.internal.f0.o(cVar2, "get(location)");
        return cVar2;
    }

    @Override // androidx.compose.runtime.tooling.b
    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    @Override // java.lang.Iterable
    @dl.d
    public Iterator<androidx.compose.runtime.tooling.d> iterator() {
        return new k0(this, 0, this.groupsSize);
    }

    public final int j(@dl.d c anchor) {
        kotlin.jvm.internal.f0.p(anchor, "anchor");
        if (!(!this.writer)) {
            ComposerKt.A("Use active SlotWriter to determine anchor location instead".toString());
            throw new KotlinNothingValueException();
        }
        if (anchor.b()) {
            return anchor.getLocation();
        }
        throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
    }

    public final <T> T k0(@dl.d yh.l<? super SlotWriter, ? extends T> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        SlotWriter slotWriterV = V();
        try {
            return block.invoke(slotWriterV);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            slotWriterV.I();
            kotlin.jvm.internal.c0.c(1);
        }
    }

    @dl.d
    public final String l() {
        if (this.writer) {
            return super.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append('\n');
        int i10 = this.groupsSize;
        if (i10 > 0) {
            int iW = 0;
            while (iW < i10) {
                iW += w(sb2, iW, 0);
            }
        } else {
            sb2.append("<EMPTY>");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void o(@dl.d SlotReader reader) {
        kotlin.jvm.internal.f0.p(reader, "reader");
        if (reader.getTable() == this && this.readers > 0) {
            this.readers--;
        } else {
            ComposerKt.A("Unexpected reader close()".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void s(@dl.d SlotWriter writer, @dl.d int[] groups, int groupsSize, @dl.d Object[] slots, int slotsSize, @dl.d ArrayList<c> anchors) {
        kotlin.jvm.internal.f0.p(writer, "writer");
        kotlin.jvm.internal.f0.p(groups, "groups");
        kotlin.jvm.internal.f0.p(slots, "slots");
        kotlin.jvm.internal.f0.p(anchors, "anchors");
        if (!(writer.getTable() == this && this.writer)) {
            throw new IllegalArgumentException("Unexpected writer close()".toString());
        }
        this.writer = false;
        a0(groups, groupsSize, slots, slotsSize, anchors);
    }

    public final boolean u() {
        return this.groupsSize > 0 && z1.J(this.groups, 0);
    }
}
