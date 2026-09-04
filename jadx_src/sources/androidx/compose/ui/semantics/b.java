package androidx.compose.ui.semantics;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/semantics/b;", "", "", ak.av, "I", "b", "()I", "rowCount", "columnCount", "<init>", "(II)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16096c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int rowCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int columnCount;

    public b(int i10, int i11) {
        this.rowCount = i10;
        this.columnCount = i11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getColumnCount() {
        return this.columnCount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getRowCount() {
        return this.rowCount;
    }
}
