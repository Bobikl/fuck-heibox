package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteStatement;
import com.umeng.analytics.pro.ak;
import j3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FrameworkSQLiteStatement.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/sqlite/db/framework/g;", "Landroidx/sqlite/db/framework/f;", "Lj3/l;", "Lkotlin/b2;", com.tekartik.sqflite.b.f98590i, "", "y", "", "k1", androidx.exifinterface.media.a.f23244d5, "", "S0", "Landroid/database/sqlite/SQLiteStatement;", ak.aF, "Landroid/database/sqlite/SQLiteStatement;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteStatement;)V", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
public final class g extends f implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SQLiteStatement delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@dl.d SQLiteStatement delegate) {
        super(delegate);
        f0.p(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // j3.l
    @dl.e
    public String S0() {
        return this.delegate.simpleQueryForString();
    }

    @Override // j3.l
    public long T() {
        return this.delegate.simpleQueryForLong();
    }

    @Override // j3.l
    public void execute() {
        this.delegate.execute();
    }

    @Override // j3.l
    public long k1() {
        return this.delegate.executeInsert();
    }

    @Override // j3.l
    public int y() {
        return this.delegate.executeUpdateDelete();
    }
}
