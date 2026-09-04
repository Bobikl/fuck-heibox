package androidx.compose.ui.semantics;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/semantics/c;", "", "", ak.av, "I", ak.aF, "()I", "rowIndex", "b", "d", "rowSpan", "columnIndex", "columnSpan", "<init>", "(IIII)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f16099e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int rowIndex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int rowSpan;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int columnIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int columnSpan;

    public c(int i10, int i11, int i12, int i13) {
        this.rowIndex = i10;
        this.rowSpan = i11;
        this.columnIndex = i12;
        this.columnSpan = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getColumnIndex() {
        return this.columnIndex;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getColumnSpan() {
        return this.columnSpan;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getRowIndex() {
        return this.rowIndex;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getRowSpan() {
        return this.rowSpan;
    }
}
