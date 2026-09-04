package androidx.compose.runtime;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/k0;", "", "Landroidx/compose/runtime/tooling/d;", "Lkotlin/b2;", "d", "", "hasNext", ak.aF, "Landroidx/compose/runtime/x1;", "b", "Landroidx/compose/runtime/x1;", "()Landroidx/compose/runtime/x1;", "table", "", "I", ak.av, "()I", com.google.android.exoplayer2.text.ttml.d.f49800p0, UCropPlusActivity.ARG_INDEX, "e", "version", com.google.android.exoplayer2.text.ttml.d.f49798o0, "<init>", "(Landroidx/compose/runtime/x1;II)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class k0 implements Iterator<androidx.compose.runtime.tooling.d>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final x1 table;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int end;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int version;

    public k0(@dl.d x1 table, int i10, int i11) {
        kotlin.jvm.internal.f0.p(table, "table");
        this.table = table;
        this.end = i11;
        this.index = i10;
        this.version = table.getVersion();
        if (table.getWriter()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void d() {
        if (this.table.getVersion() != this.version) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final x1 getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    @dl.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public androidx.compose.runtime.tooling.d next() {
        d();
        int i10 = this.index;
        this.index = z1.Q(this.table.getGroups(), i10) + i10;
        return new y1(this.table, i10, this.version);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
