package g1;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import org.apache.tools.ant.taskdefs.a6;

/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lg1/a;", "", "", a6.a.f133725d, "col", "", ak.av, "value", "Lkotlin/b2;", ak.aF, "Lg1/d;", "b", com.tekartik.sqflite.b.f98607z, "cols", "<init>", "(II)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final d[] f118943a;

    public a(int i10, int i11) {
        d[] dVarArr = new d[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            dVarArr[i12] = new d(i11);
        }
        this.f118943a = dVarArr;
    }

    public final float a(int row, int col) {
        return this.f118943a[row].a(col);
    }

    @dl.d
    public final d b(int row) {
        return this.f118943a[row];
    }

    public final void c(int i10, int i11, float f10) {
        this.f118943a[i10].e(i11, f10);
    }
}
