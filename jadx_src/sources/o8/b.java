package o8;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: DatabaseProvider.java */
/* JADX INFO: loaded from: classes7.dex */
public interface b {
    public static final String O1 = "ExoPlayer";

    SQLiteDatabase getReadableDatabase();

    SQLiteDatabase getWritableDatabase();
}
