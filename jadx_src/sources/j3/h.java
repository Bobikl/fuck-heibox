package j3;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.w0;
import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.ak;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0006\u001a\u00020\u0004H&R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lj3/h;", "Ljava/io/Closeable;", "", "enabled", "Lkotlin/b2;", "setWriteAheadLoggingEnabled", "close", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lj3/g;", "getWritableDatabase", "()Lj3/g;", "writableDatabase", "getReadableDatabase", "readableDatabase", ak.av, "b", ak.aF, "sqlite_release"}, k = 1, mv = {1, 7, 1})
public interface h extends Closeable {

    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b&\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J \u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0014"}, d2 = {"Lj3/h$a;", "", "", Progress.F, "Lkotlin/b2;", ak.av, "Lj3/g;", "db", "b", "d", "", "oldVersion", "newVersion", "g", "e", "f", ak.aF, "version", "<init>", "(I)V", "sqlite_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final C1117a f124211b = new C1117a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private static final String f124212c = "SupportSQLite";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @xh.e
        public final int f124213a;

        /* JADX INFO: renamed from: j3.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lj3/h$a$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 7, 1})
        public static final class C1117a {
            private C1117a() {
            }

            public /* synthetic */ C1117a(u uVar) {
                this();
            }
        }

        public a(int i10) {
            this.f124213a = i10;
        }

        private final void a(String str) {
            if (kotlin.text.u.L1(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = f0.t(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() == 0) {
                return;
            }
            Log.w(f124212c, "deleting the database file: " + str);
            try {
                j3.c.a.c(new File(str));
            } catch (Exception e10) {
                Log.w(f124212c, "delete failed: ", e10);
            }
        }

        public void b(@dl.d g db2) {
            f0.p(db2, "db");
        }

        public void c(@dl.d g db2) {
            f0.p(db2, "db");
            Log.e(f124212c, "Corruption reported by sqlite on database: " + db2 + ".path");
            if (!db2.isOpen()) {
                String path = db2.getPath();
                if (path != null) {
                    a(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> listV = null;
            try {
                try {
                    listV = db2.v();
                } catch (SQLiteException unused) {
                }
                try {
                    db2.close();
                } catch (IOException unused2) {
                }
                if (listV != null) {
                    return;
                }
            } finally {
                if (listV != null) {
                    Iterator<T> it = listV.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        f0.o(obj, "p.second");
                        a((String) obj);
                    }
                } else {
                    String path2 = db2.getPath();
                    if (path2 != null) {
                        a(path2);
                    }
                }
            }
        }

        public abstract void d(@dl.d g gVar);

        public void e(@dl.d g db2, int i10, int i11) {
            f0.p(db2, "db");
            throw new SQLiteException("Can't downgrade database from version " + i10 + " to " + i11);
        }

        public void f(@dl.d g db2) {
            f0.p(db2, "db");
        }

        public abstract void g(@dl.d g gVar, int i10, int i11);
    }

    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\r\u000eB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lj3/h$b;", "", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "", "name", "Lj3/h$a;", "callback", "", "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lj3/h$a;ZZ)V", ak.av, "b", "sqlite_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dl.d
        public static final C1118b f124214f = new C1118b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        @xh.e
        public final Context f124215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        @xh.e
        public final String f124216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        @xh.e
        public final a f124217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @xh.e
        public final boolean f124218d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @xh.e
        public final boolean f124219e;

        /* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
        @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0016¨\u0006\u0013"}, d2 = {"Lj3/h$b$a;", "", "Lj3/h$b;", "b", "", "name", "d", "Lj3/h$a;", "callback", ak.aF, "", "useNoBackupDirectory", "e", "allowDataLossOnRecovery", ak.av, "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "<init>", "(Landroid/content/Context;)V", "sqlite_release"}, k = 1, mv = {1, 7, 1})
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            private final Context f124220a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @dl.e
            private String f124221b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @dl.e
            private a f124222c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f124223d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f124224e;

            public a(@dl.d Context context) {
                f0.p(context, "context");
                this.f124220a = context;
            }

            @dl.d
            public a a(boolean allowDataLossOnRecovery) {
                this.f124224e = allowDataLossOnRecovery;
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001a  */
            @dl.d
            public b b() {
                boolean z10;
                a aVar = this.f124222c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
                }
                if (this.f124223d) {
                    String str = this.f124221b;
                    z10 = str == null || str.length() == 0 ? false : true;
                }
                if (z10) {
                    return new b(this.f124220a, this.f124221b, aVar, this.f124223d, this.f124224e);
                }
                throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
            }

            @dl.d
            public a c(@dl.d a callback) {
                f0.p(callback, "callback");
                this.f124222c = callback;
                return this;
            }

            @dl.d
            public a d(@dl.e String name) {
                this.f124221b = name;
                return this;
            }

            @dl.d
            public a e(boolean useNoBackupDirectory) {
                this.f124223d = useNoBackupDirectory;
                return this;
            }
        }

        /* JADX INFO: renamed from: j3.h$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lj3/h$b$b;", "", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Lj3/h$b$a;", ak.av, "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 7, 1})
        public static final class C1118b {
            private C1118b() {
            }

            public /* synthetic */ C1118b(u uVar) {
                this();
            }

            @dl.d
            @m
            public final a a(@dl.d Context context) {
                f0.p(context, "context");
                return new a(context);
            }
        }

        public b(@dl.d Context context, @dl.e String str, @dl.d a callback, boolean z10, boolean z11) {
            f0.p(context, "context");
            f0.p(callback, "callback");
            this.f124215a = context;
            this.f124216b = str;
            this.f124217c = callback;
            this.f124218d = z10;
            this.f124219e = z11;
        }

        public /* synthetic */ b(Context context, String str, a aVar, boolean z10, boolean z11, int i10, u uVar) {
            this(context, str, aVar, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11);
        }

        @dl.d
        @m
        public static final a a(@dl.d Context context) {
            return f124214f.a(context);
        }
    }

    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lj3/h$c;", "", "Lj3/h$b;", "configuration", "Lj3/h;", ak.av, "sqlite_release"}, k = 1, mv = {1, 7, 1})
    public interface c {
        @dl.d
        h a(@dl.d b configuration);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @dl.e
    String getDatabaseName();

    @dl.d
    g getReadableDatabase();

    @dl.d
    g getWritableDatabase();

    @w0(api = 16)
    void setWriteAheadLoggingEnabled(boolean z10);
}
