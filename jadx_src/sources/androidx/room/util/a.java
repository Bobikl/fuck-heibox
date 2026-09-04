package androidx.room.util;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import kotlin.text.u;
import yh.l;

/* JADX INFO: compiled from: CursorUtil.kt */
/* JADX INFO: loaded from: classes6.dex */
@xh.h(name = "CursorUtil")
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a%\u0010\u0001\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0001\u0010\f\u001a1\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r*\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a+\u0010\u0014\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"Landroid/database/Cursor;", ak.aF, ak.av, "", "name", "", "d", "e", "cursor", "b", "", "columnNames", "([Ljava/lang/String;Ljava/lang/String;)I", "R", "Lkotlin/Function1;", "block", "f", "(Landroid/database/Cursor;Lyh/l;)Ljava/lang/Object;", "", "mapping", "g", "(Landroid/database/Cursor;[Ljava/lang/String;[I)Landroid/database/Cursor;", "room-runtime_release"}, k = 2, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class a {

    /* JADX INFO: renamed from: androidx.room.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CursorUtil.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"androidx/room/util/a$a", "Landroid/database/CursorWrapper;", "", "columnName", "", "getColumnIndex", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class C0215a extends CursorWrapper {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String[] f27279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int[] f27280c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0215a(Cursor cursor, String[] strArr, int[] iArr) {
            super(cursor);
            this.f27279b = strArr;
            this.f27280c = iArr;
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public int getColumnIndex(@dl.d String columnName) {
            f0.p(columnName, "columnName");
            String[] strArr = this.f27279b;
            int[] iArr = this.f27280c;
            int length = strArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int i12 = i11 + 1;
                if (u.L1(strArr[i10], columnName, true)) {
                    return iArr[i11];
                }
                i10++;
                i11 = i12;
            }
            return super.getColumnIndex(columnName);
        }
    }

    @dl.d
    public static final Cursor a(@dl.d Cursor c10) {
        f0.p(c10, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(c10.getColumnNames(), c10.getCount());
            while (c10.moveToNext()) {
                Object[] objArr = new Object[c10.getColumnCount()];
                int columnCount = c10.getColumnCount();
                for (int i10 = 0; i10 < columnCount; i10++) {
                    int type = c10.getType(i10);
                    if (type == 0) {
                        objArr[i10] = null;
                    } else if (type == 1) {
                        objArr[i10] = Long.valueOf(c10.getLong(i10));
                    } else if (type == 2) {
                        objArr[i10] = Double.valueOf(c10.getDouble(i10));
                    } else if (type == 3) {
                        objArr[i10] = c10.getString(i10);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i10] = c10.getBlob(i10);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            kotlin.io.b.a(c10, null);
            return matrixCursor;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.b.a(c10, th2);
                throw th3;
            }
        }
    }

    private static final int b(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25) {
            return -1;
        }
        if (str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        f0.o(columnNames, "columnNames");
        return c(columnNames, str);
    }

    @j1(otherwise = 2)
    public static final int c(@dl.d String[] columnNames, @dl.d String name) {
        f0.p(columnNames, "columnNames");
        f0.p(name, "name");
        String str = lg.a.f131414g + name;
        String str2 = lg.a.f131414g + name + '`';
        int length = columnNames.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            String str3 = columnNames[i10];
            int i12 = i11 + 1;
            if (str3.length() >= name.length() + 2) {
                if (u.K1(str3, str, false, 2, null)) {
                    return i11;
                }
                if (str3.charAt(0) == '`' && u.K1(str3, str2, false, 2, null)) {
                    return i11;
                }
            }
            i10++;
            i11 = i12;
        }
        return -1;
    }

    public static final int d(@dl.d Cursor c10, @dl.d String name) {
        f0.p(c10, "c");
        f0.p(name, "name");
        int columnIndex = c10.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c10.getColumnIndex('`' + name + '`');
        return columnIndex2 >= 0 ? columnIndex2 : b(c10, name);
    }

    public static final int e(@dl.d Cursor c10, @dl.d String name) {
        String strMh;
        f0.p(c10, "c");
        f0.p(name, "name");
        int iD = d(c10, name);
        if (iD >= 0) {
            return iD;
        }
        try {
            String[] columnNames = c10.getColumnNames();
            f0.o(columnNames, "c.columnNames");
            strMh = ArraysKt___ArraysKt.Mh(columnNames, null, null, null, 0, null, null, 63, null);
        } catch (Exception e10) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e10);
            strMh = "unknown";
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + strMh);
    }

    public static final <R> R f(@dl.d Cursor cursor, @dl.d l<? super Cursor, ? extends R> block) {
        f0.p(cursor, "<this>");
        f0.p(block, "block");
        try {
            R rInvoke = block.invoke(cursor);
            c0.d(1);
            kotlin.io.b.a(cursor, null);
            c0.c(1);
            return rInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c0.d(1);
                kotlin.io.b.a(cursor, th2);
                c0.c(1);
                throw th3;
            }
        }
    }

    @dl.d
    public static final Cursor g(@dl.d Cursor cursor, @dl.d String[] columnNames, @dl.d int[] mapping) {
        f0.p(cursor, "cursor");
        f0.p(columnNames, "columnNames");
        f0.p(mapping, "mapping");
        if (columnNames.length == mapping.length) {
            return new C0215a(cursor, columnNames, mapping);
        }
        throw new IllegalStateException("Expected columnNames.length == mapping.length".toString());
    }
}
