package o8;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: compiled from: DefaultDatabaseProvider.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SQLiteOpenHelper f132222b;

    public c(SQLiteOpenHelper sQLiteOpenHelper) {
        this.f132222b = sQLiteOpenHelper;
    }

    @Override // o8.b
    public SQLiteDatabase getReadableDatabase() {
        return this.f132222b.getReadableDatabase();
    }

    @Override // o8.b
    public SQLiteDatabase getWritableDatabase() {
        return this.f132222b.getWritableDatabase();
    }
}
