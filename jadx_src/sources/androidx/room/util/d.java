package androidx.room.util;

import android.annotation.SuppressLint;
import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import com.umeng.analytics.pro.ak;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.c1;
import kotlin.collections.d1;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt__StringsKt;
import xh.m;

/* JADX INFO: compiled from: FtsTableInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\tB+\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0004\b\u0012\u0010\u0013B'\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u0012\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0015J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0017"}, d2 = {"Landroidx/room/util/d;", "", "other", "", "equals", "", "hashCode", "", "toString", ak.av, "Ljava/lang/String;", "name", "", "b", "Ljava/util/Set;", com.tekartik.sqflite.b.f98606y, ak.aF, com.tekartik.sqflite.b.f98586e, "<init>", "(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)V", "createSql", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;)V", "d", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final String[] f27282e = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    @xh.e
    public final Set<String> columns;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    @xh.e
    public final Set<String> options;

    /* JADX INFO: renamed from: androidx.room.util.d$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FtsTableInfo.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0007R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/room/util/d$a;", "", "Lj3/g;", "database", "", "tableName", "", ak.aF, "d", "Landroidx/room/util/d;", "b", "createStatement", ak.av, "", "FTS_OPTIONS", "[Ljava/lang/String;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private final Set<String> c(j3.g database, String tableName) {
            Set setD = c1.d();
            Cursor cursorD1 = database.D1("PRAGMA table_info(`" + tableName + "`)");
            try {
                if (cursorD1.getColumnCount() > 0) {
                    int columnIndex = cursorD1.getColumnIndex("name");
                    while (cursorD1.moveToNext()) {
                        String string = cursorD1.getString(columnIndex);
                        f0.o(string, "cursor.getString(nameIndex)");
                        setD.add(string);
                    }
                }
                b2 b2Var = b2.f124493a;
                kotlin.io.b.a(cursorD1, null);
                return c1.a(setD);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.b.a(cursorD1, th2);
                    throw th3;
                }
            }
        }

        private final Set<String> d(j3.g database, String tableName) {
            Cursor cursorD1 = database.D1("SELECT * FROM sqlite_master WHERE `name` = '" + tableName + '\'');
            try {
                String sql = cursorD1.moveToFirst() ? cursorD1.getString(cursorD1.getColumnIndexOrThrow(com.tekartik.sqflite.b.f98602u)) : "";
                kotlin.io.b.a(cursorD1, null);
                f0.o(sql, "sql");
                return a(sql);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.b.a(cursorD1, th2);
                    throw th3;
                }
            }
        }

        @j1
        @dl.d
        @m
        public final Set<String> a(@dl.d String createStatement) {
            boolean z10;
            Character ch2;
            f0.p(createStatement, "createStatement");
            if (createStatement.length() == 0) {
                return d1.k();
            }
            String strSubstring = createStatement.substring(StringsKt__StringsKt.r3(createStatement, '(', 0, false, 6, null) + 1, StringsKt__StringsKt.F3(createStatement, ')', 0, false, 6, null));
            f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            ArrayList arrayList = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            int i10 = -1;
            int i11 = 0;
            int i12 = 0;
            while (i11 < strSubstring.length()) {
                char cCharAt = strSubstring.charAt(i11);
                int i13 = i12 + 1;
                if ((cCharAt == '\'' || cCharAt == '\"') || cCharAt == '`') {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(cCharAt));
                    } else {
                        Character ch3 = (Character) arrayDeque.peek();
                        if (ch3 != null && ch3.charValue() == cCharAt) {
                            arrayDeque.pop();
                        }
                    }
                } else if (cCharAt == '[') {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(cCharAt));
                    }
                } else if (cCharAt == ']') {
                    if (!arrayDeque.isEmpty() && (ch2 = (Character) arrayDeque.peek()) != null && ch2.charValue() == '[') {
                        arrayDeque.pop();
                    }
                } else if (cCharAt == ',' && arrayDeque.isEmpty()) {
                    String strSubstring2 = strSubstring.substring(i10 + 1, i12);
                    f0.o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    int length = strSubstring2.length() - 1;
                    int i14 = 0;
                    boolean z11 = false;
                    while (i14 <= length) {
                        boolean z12 = f0.t(strSubstring2.charAt(!z11 ? i14 : length), 32) <= 0;
                        if (z11) {
                            if (!z12) {
                                break;
                            }
                            length--;
                        } else if (z12) {
                            i14++;
                        } else {
                            z11 = true;
                        }
                    }
                    arrayList.add(strSubstring2.subSequence(i14, length + 1).toString());
                    i10 = i12;
                }
                i11++;
                i12 = i13;
            }
            String strSubstring3 = strSubstring.substring(i10 + 1);
            f0.o(strSubstring3, "this as java.lang.String).substring(startIndex)");
            arrayList.add(StringsKt__StringsKt.F5(strSubstring3).toString());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String str = (String) obj;
                String[] strArr = d.f27282e;
                int length2 = strArr.length;
                int i15 = 0;
                while (true) {
                    if (i15 >= length2) {
                        z10 = false;
                        break;
                    }
                    if (kotlin.text.u.v2(str, strArr[i15], false, 2, null)) {
                        z10 = true;
                        break;
                    }
                    i15++;
                }
                if (z10) {
                    arrayList2.add(obj);
                }
            }
            return CollectionsKt___CollectionsKt.V5(arrayList2);
        }

        @dl.d
        @m
        @SuppressLint({"SyntheticAccessor"})
        public final d b(@dl.d j3.g database, @dl.d String tableName) {
            f0.p(database, "database");
            f0.p(tableName, "tableName");
            return new d(tableName, c(database, tableName), d(database, tableName));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@dl.d String name, @dl.d Set<String> columns, @dl.d String createSql) {
        this(name, columns, INSTANCE.a(createSql));
        f0.p(name, "name");
        f0.p(columns, "columns");
        f0.p(createSql, "createSql");
    }

    public d(@dl.d String name, @dl.d Set<String> columns, @dl.d Set<String> options) {
        f0.p(name, "name");
        f0.p(columns, "columns");
        f0.p(options, "options");
        this.name = name;
        this.columns = columns;
        this.options = options;
    }

    @j1
    @dl.d
    @m
    public static final Set<String> b(@dl.d String str) {
        return INSTANCE.a(str);
    }

    @dl.d
    @m
    @SuppressLint({"SyntheticAccessor"})
    public static final d c(@dl.d j3.g gVar, @dl.d String str) {
        return INSTANCE.b(gVar, str);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d)) {
            return false;
        }
        d dVar = (d) other;
        if (f0.g(this.name, dVar.name) && f0.g(this.columns, dVar.columns)) {
            return f0.g(this.options, dVar.options);
        }
        return false;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.columns.hashCode()) * 31) + this.options.hashCode();
    }

    @dl.d
    public String toString() {
        return "FtsTableInfo{name='" + this.name + "', columns=" + this.columns + ", options=" + this.options + "'}";
    }
}
