package androidx.room.util;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: ViewInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\tB\u0019\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0011"}, d2 = {"Landroidx/room/util/i;", "", "other", "", "equals", "", "hashCode", "", "toString", ak.av, "Ljava/lang/String;", "name", "b", com.tekartik.sqflite.b.f98602u, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", ak.aF, "room-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    @xh.e
    public final String sql;

    /* JADX INFO: renamed from: androidx.room.util.i$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ViewInfo.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/room/util/i$a;", "", "Lj3/g;", "database", "", "viewName", "Landroidx/room/util/i;", ak.av, "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @dl.d
        @m
        public final i a(@dl.d j3.g database, @dl.d String viewName) {
            i iVar;
            f0.p(database, "database");
            f0.p(viewName, "viewName");
            Cursor cursorD1 = database.D1("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + viewName + '\'');
            try {
                if (cursorD1.moveToFirst()) {
                    String string = cursorD1.getString(0);
                    f0.o(string, "cursor.getString(0)");
                    iVar = new i(string, cursorD1.getString(1));
                } else {
                    iVar = new i(viewName, null);
                }
                kotlin.io.b.a(cursorD1, null);
                return iVar;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.b.a(cursorD1, th2);
                    throw th3;
                }
            }
        }
    }

    public i(@dl.d String name, @dl.e String str) {
        f0.p(name, "name");
        this.name = name;
        this.sql = str;
    }

    @dl.d
    @m
    public static final i a(@dl.d j3.g gVar, @dl.d String str) {
        return INSTANCE.a(gVar, str);
    }

    public boolean equals(@dl.e Object other) {
        boolean zG;
        if (this == other) {
            return true;
        }
        if (!(other instanceof i)) {
            return false;
        }
        i iVar = (i) other;
        if (f0.g(this.name, iVar.name)) {
            String str = this.sql;
            String str2 = iVar.sql;
            if (str != null) {
                zG = f0.g(str, str2);
            } else {
                zG = str2 == null;
            }
            if (zG) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.sql;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @dl.d
    public String toString() {
        return "ViewInfo{name='" + this.name + "', sql='" + this.sql + "'}";
    }
}
