package androidx.room.util;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import com.umeng.analytics.pro.ak;
import j3.j;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.s;
import kotlin.jvm.internal.f0;
import kotlin.k;
import kotlin.text.u;

/* JADX INFO: compiled from: DBUtil.kt */
/* JADX INFO: loaded from: classes6.dex */
@xh.h(name = "DBUtil")
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a(\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b\u001a\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u000b\u001a\u0016\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e\u001a\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011\u001a\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u001a\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¨\u0006\u0018"}, d2 = {"Landroidx/room/RoomDatabase;", "db", "Lj3/j;", "sqLiteQuery", "", "maybeCopy", "Landroid/database/Cursor;", "e", "Landroid/os/CancellationSignal;", "signal", "f", "Lj3/g;", "Lkotlin/b2;", "b", "", "tableName", ak.aF, "Ljava/io/File;", "databaseFile", "", "g", ak.av, "cursor", "d", "room-runtime_release"}, k = 2, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class b {
    @dl.e
    public static final CancellationSignal a() {
        return j3.c.a.b();
    }

    public static final void b(@dl.d j3.g db2) {
        f0.p(db2, "db");
        List listI = s.i();
        Cursor cursorD1 = db2.D1("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorD1.moveToNext()) {
            try {
                listI.add(cursorD1.getString(0));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.b.a(cursorD1, th2);
                    throw th3;
                }
            }
        }
        b2 b2Var = b2.f124493a;
        kotlin.io.b.a(cursorD1, null);
        for (String triggerName : s.a(listI)) {
            f0.o(triggerName, "triggerName");
            if (u.v2(triggerName, "room_fts_content_sync_", false, 2, null)) {
                db2.y0("DROP TRIGGER IF EXISTS " + triggerName);
            }
        }
    }

    public static final void c(@dl.d j3.g db2, @dl.d String tableName) {
        f0.p(db2, "db");
        f0.p(tableName, "tableName");
        Cursor cursorD1 = db2.D1("PRAGMA foreign_key_check(`" + tableName + "`)");
        try {
            if (cursorD1.getCount() > 0) {
                throw new SQLiteConstraintException(d(cursorD1));
            }
            b2 b2Var = b2.f124493a;
            kotlin.io.b.a(cursorD1, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.b.a(cursorD1, th2);
                throw th3;
            }
        }
    }

    private static final String d(Cursor cursor) {
        StringBuilder sb2 = new StringBuilder();
        int count = cursor.getCount();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            if (cursor.isFirst()) {
                sb2.append("Foreign key violation(s) detected in '");
                sb2.append(cursor.getString(0));
                sb2.append("'.\n");
            }
            String constraintIndex = cursor.getString(3);
            if (!linkedHashMap.containsKey(constraintIndex)) {
                f0.o(constraintIndex, "constraintIndex");
                String string = cursor.getString(2);
                f0.o(string, "cursor.getString(2)");
                linkedHashMap.put(constraintIndex, string);
            }
        }
        sb2.append("Number of different violations discovered: ");
        sb2.append(linkedHashMap.keySet().size());
        sb2.append("\n");
        sb2.append("Number of rows in violation: ");
        sb2.append(count);
        sb2.append("\n");
        sb2.append("Violation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb2.append("\tParent Table = ");
            sb2.append(str2);
            sb2.append(", Foreign Key Constraint Index = ");
            sb2.append(str);
            sb2.append("\n");
        }
        String string2 = sb2.toString();
        f0.o(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    @dl.d
    @k(message = "This is only used in the generated code and shouldn't be called directly.")
    public static final Cursor e(@dl.d RoomDatabase db2, @dl.d j sqLiteQuery, boolean z10) {
        f0.p(db2, "db");
        f0.p(sqLiteQuery, "sqLiteQuery");
        return f(db2, sqLiteQuery, z10, null);
    }

    @dl.d
    public static final Cursor f(@dl.d RoomDatabase db2, @dl.d j sqLiteQuery, boolean z10, @dl.e CancellationSignal cancellationSignal) {
        f0.p(db2, "db");
        f0.p(sqLiteQuery, "sqLiteQuery");
        Cursor cursorI = db2.I(sqLiteQuery, cancellationSignal);
        if (!z10 || !(cursorI instanceof AbstractWindowedCursor)) {
            return cursorI;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorI;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? a.a(cursorI) : cursorI;
    }

    public static final int g(@dl.d File databaseFile) throws IOException {
        f0.p(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i10 = byteBufferAllocate.getInt();
            kotlin.io.b.a(channel, null);
            return i10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.b.a(channel, th2);
                throw th3;
            }
        }
    }
}
