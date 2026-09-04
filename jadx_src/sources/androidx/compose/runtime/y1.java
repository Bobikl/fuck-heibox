package androidx.compose.runtime;

import com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B!\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b+\u0010,J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0096\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010$\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001dR\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001dR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010&¨\u0006-"}, d2 = {"Landroidx/compose/runtime/y1;", "Landroidx/compose/runtime/tooling/d;", "", "Lkotlin/b2;", "o", "", "iterator", "", "identityToFind", ak.av, "Landroidx/compose/runtime/x1;", "b", "Landroidx/compose/runtime/x1;", "j", "()Landroidx/compose/runtime/x1;", "table", "", ak.aF, "I", "i", "()I", MallPurchaseDetailDialogFragment.f89681y1, "d", "l", "version", "", "isEmpty", "()Z", "getKey", "()Ljava/lang/Object;", "key", "", "g", "()Ljava/lang/String;", "sourceInfo", "e", "node", "getData", "()Ljava/lang/Iterable;", "data", RXScreenCaptureService.KEY_HEIGHT, "identity", "compositionGroups", "<init>", "(Landroidx/compose/runtime/x1;II)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class y1 implements androidx.compose.runtime.tooling.d, Iterable<androidx.compose.runtime.tooling.d>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final x1 table;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int group;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int version;

    public y1(@dl.d x1 table, int i10, int i11) {
        kotlin.jvm.internal.f0.p(table, "table");
        this.table = table;
        this.group = i10;
        this.version = i11;
    }

    public /* synthetic */ y1(x1 x1Var, int i10, int i11, int i12, kotlin.jvm.internal.u uVar) {
        this(x1Var, i10, (i12 & 4) != 0 ? x1Var.getVersion() : i11);
    }

    private final void o() {
        if (this.table.getVersion() != this.version) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // androidx.compose.runtime.tooling.b
    @dl.e
    public androidx.compose.runtime.tooling.d a(@dl.d Object identityToFind) {
        int iJ;
        int i10;
        kotlin.jvm.internal.f0.p(identityToFind, "identityToFind");
        c cVar = identityToFind instanceof c ? (c) identityToFind : null;
        if (cVar == null || !this.table.W(cVar) || (iJ = this.table.j(cVar)) < (i10 = this.group) || iJ - i10 >= z1.Q(this.table.getGroups(), this.group)) {
            return null;
        }
        return new y1(this.table, iJ, this.version);
    }

    @Override // androidx.compose.runtime.tooling.b
    @dl.d
    public Iterable<androidx.compose.runtime.tooling.d> b() {
        return this;
    }

    @Override // androidx.compose.runtime.tooling.d
    @dl.e
    public Object e() {
        if (z1.X(this.table.getGroups(), this.group)) {
            return this.table.getSlots()[z1.f0(this.table.getGroups(), this.group)];
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.d
    @dl.e
    public String g() {
        if (!z1.T(this.table.getGroups(), this.group)) {
            return null;
        }
        Object obj = this.table.getSlots()[z1.H(this.table.getGroups(), this.group)];
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.d
    @dl.d
    public Iterable<Object> getData() {
        return new a0(this.table, this.group);
    }

    @Override // androidx.compose.runtime.tooling.d
    @dl.d
    public Object getKey() {
        if (!z1.V(this.table.getGroups(), this.group)) {
            return Integer.valueOf(z1.Y(this.table.getGroups(), this.group));
        }
        Object obj = this.table.getSlots()[z1.g0(this.table.getGroups(), this.group)];
        kotlin.jvm.internal.f0.m(obj);
        return obj;
    }

    @Override // androidx.compose.runtime.tooling.d
    @dl.d
    public Object h() {
        o();
        SlotReader slotReaderU = this.table.U();
        try {
            return slotReaderU.a(this.group);
        } finally {
            slotReaderU.e();
        }
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getGroup() {
        return this.group;
    }

    @Override // androidx.compose.runtime.tooling.b
    public boolean isEmpty() {
        return z1.Q(this.table.getGroups(), this.group) == 0;
    }

    @Override // java.lang.Iterable
    @dl.d
    public Iterator<androidx.compose.runtime.tooling.d> iterator() {
        o();
        x1 x1Var = this.table;
        int i10 = this.group;
        return new k0(x1Var, i10 + 1, i10 + z1.Q(x1Var.getGroups(), this.group));
    }

    @dl.d
    /* JADX INFO: renamed from: j, reason: from getter */
    public final x1 getTable() {
        return this.table;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getVersion() {
        return this.version;
    }
}
