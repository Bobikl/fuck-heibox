package androidx.compose.runtime;

import com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0017\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H\u0096\u0002J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0011R\"\u0010\u001c\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/a0;", "", "", "", "iterator", "", "hasNext", "next", "Landroidx/compose/runtime/x1;", "b", "Landroidx/compose/runtime/x1;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/runtime/x1;", "table", "", ak.aF, "I", "()I", MallPurchaseDetailDialogFragment.f89681y1, "d", "g", com.google.android.exoplayer2.text.ttml.d.f49798o0, "e", ak.av, com.google.android.exoplayer2.text.ttml.d.f49800p0, "f", "i", "(I)V", UCropPlusActivity.ARG_INDEX, "<init>", "(Landroidx/compose/runtime/x1;I)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class a0 implements Iterable<Object>, Iterator<Object>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final x1 table;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int group;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int start;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int end;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int index;

    public a0(@dl.d x1 table, int i10) {
        kotlin.jvm.internal.f0.p(table, "table");
        this.table = table;
        this.group = i10;
        int iL = z1.L(table.getGroups(), i10);
        this.start = iL;
        this.end = i10 + 1 < table.getGroupsSize() ? z1.L(table.getGroups(), i10 + 1) : table.getSlotsSize();
        this.index = iL;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getGroup() {
        return this.group;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    @dl.d
    /* JADX INFO: renamed from: h, reason: from getter */
    public final x1 getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    public final void i(int i10) {
        this.index = i10;
    }

    @Override // java.lang.Iterable
    @dl.d
    public Iterator<Object> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    @dl.e
    public Object next() {
        int i10 = this.index;
        Object obj = (i10 < 0 || i10 >= this.table.getSlots().length) ? null : this.table.getSlots()[this.index];
        this.index++;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
