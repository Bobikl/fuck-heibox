package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\"\u0010\u000e\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/c;", "", "Landroidx/compose/runtime/x1;", "slots", "", "d", "Landroidx/compose/runtime/a2;", "writer", "e", ak.av, "I", "()I", ak.aF, "(I)V", "location", "", "b", "()Z", "valid", "loc", "<init>", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int location;

    public c(int i10) {
        this.location = i10;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    public final boolean b() {
        return this.location != Integer.MIN_VALUE;
    }

    public final void c(int i10) {
        this.location = i10;
    }

    public final int d(@dl.d x1 slots) {
        kotlin.jvm.internal.f0.p(slots, "slots");
        return slots.j(this);
    }

    public final int e(@dl.d SlotWriter writer) {
        kotlin.jvm.internal.f0.p(writer, "writer");
        return writer.D(this);
    }
}
