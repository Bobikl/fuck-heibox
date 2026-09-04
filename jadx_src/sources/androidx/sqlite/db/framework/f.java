package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import j3.i;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FrameworkSQLiteProgram.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/sqlite/db/framework/f;", "Lj3/i;", "", UCropPlusActivity.ARG_INDEX, "Lkotlin/b2;", "r0", "", "value", "d0", "", "F0", "", "X", "", "l0", "R1", "close", "Landroid/database/sqlite/SQLiteProgram;", "b", "Landroid/database/sqlite/SQLiteProgram;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteProgram;)V", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
public class f implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SQLiteProgram delegate;

    public f(@dl.d SQLiteProgram delegate) {
        f0.p(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // j3.i
    public void F0(int i10, double d10) {
        this.delegate.bindDouble(i10, d10);
    }

    @Override // j3.i
    public void R1() {
        this.delegate.clearBindings();
    }

    @Override // j3.i
    public void X(int i10, @dl.d String value) {
        f0.p(value, "value");
        this.delegate.bindString(i10, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // j3.i
    public void d0(int i10, long j10) {
        this.delegate.bindLong(i10, j10);
    }

    @Override // j3.i
    public void l0(int i10, @dl.d byte[] value) {
        f0.p(value, "value");
        this.delegate.bindBlob(i10, value);
    }

    @Override // j3.i
    public void r0(int i10) {
        this.delegate.bindNull(i10);
    }
}
