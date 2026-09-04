package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import dl.d;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: SQLiteDatabase.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final <T> T a(@d SQLiteDatabase sQLiteDatabase, boolean z10, @d l<? super SQLiteDatabase, ? extends T> body) {
        f0.p(sQLiteDatabase, "<this>");
        f0.p(body, "body");
        if (z10) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T tInvoke = body.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return tInvoke;
        } finally {
            c0.d(1);
            sQLiteDatabase.endTransaction();
            c0.c(1);
        }
    }

    public static /* synthetic */ Object b(SQLiteDatabase sQLiteDatabase, boolean z10, l body, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        f0.p(sQLiteDatabase, "<this>");
        f0.p(body, "body");
        if (z10) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object objInvoke = body.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return objInvoke;
        } finally {
            c0.d(1);
            sQLiteDatabase.endTransaction();
            c0.c(1);
        }
    }
}
