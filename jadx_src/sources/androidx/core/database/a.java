package androidx.core.database;

import android.database.Cursor;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Cursor.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    @e
    public static final byte[] a(@d Cursor cursor, int i10) {
        f0.p(cursor, "<this>");
        if (cursor.isNull(i10)) {
            return null;
        }
        return cursor.getBlob(i10);
    }

    @e
    public static final Double b(@d Cursor cursor, int i10) {
        f0.p(cursor, "<this>");
        if (cursor.isNull(i10)) {
            return null;
        }
        return Double.valueOf(cursor.getDouble(i10));
    }

    @e
    public static final Float c(@d Cursor cursor, int i10) {
        f0.p(cursor, "<this>");
        if (cursor.isNull(i10)) {
            return null;
        }
        return Float.valueOf(cursor.getFloat(i10));
    }

    @e
    public static final Integer d(@d Cursor cursor, int i10) {
        f0.p(cursor, "<this>");
        if (cursor.isNull(i10)) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(i10));
    }

    @e
    public static final Long e(@d Cursor cursor, int i10) {
        f0.p(cursor, "<this>");
        if (cursor.isNull(i10)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i10));
    }

    @e
    public static final Short f(@d Cursor cursor, int i10) {
        f0.p(cursor, "<this>");
        if (cursor.isNull(i10)) {
            return null;
        }
        return Short.valueOf(cursor.getShort(i10));
    }

    @e
    public static final String g(@d Cursor cursor, int i10) {
        f0.p(cursor, "<this>");
        if (cursor.isNull(i10)) {
            return null;
        }
        return cursor.getString(i10);
    }
}
