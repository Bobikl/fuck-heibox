package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.annotation.w0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.z;
import xh.i;

/* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0003-\b.B7\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010)\u001a\u00020(\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010R\u001b\u0010\u001e\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\u0016\u0010\u001b*\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006/"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper;", "Lj3/h;", "", "enabled", "Lkotlin/b2;", "setWriteAheadLoggingEnabled", "close", "Landroid/content/Context;", "b", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "", ak.aF, "Ljava/lang/String;", "name", "e", "Z", "useNoBackupDirectory", "f", "allowDataLossOnRecovery", "Lkotlin/z;", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "g", "Lkotlin/z;", "lazyDelegate", RXScreenCaptureService.KEY_HEIGHT, "writeAheadLoggingEnabled", "()Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "getDelegate$delegate", "(Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper;)Ljava/lang/Object;", "delegate", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lj3/g;", "getWritableDatabase", "()Lj3/g;", "writableDatabase", "getReadableDatabase", "readableDatabase", "Lj3/h$a;", "callback", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lj3/h$a;ZZ)V", "i", ak.av, "OpenHelper", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
public final class FrameworkSQLiteOpenHelper implements j3.h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final String f27463j = "SupportSQLite";

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final j3.h.a f27466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean useNoBackupDirectory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean allowDataLossOnRecovery;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final z<OpenHelper> lazyDelegate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean writeAheadLoggingEnabled;

    /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
    @Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0003234B1\u0012\u0006\u0010\u001c\u001a\u00020\u0017\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\u0006\u0010\"\u001a\u00020\u001d\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b0\u00101J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0004H\u0016J \u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J \u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b\u001e\u0010$R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010#R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010#R\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00065"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "", "writable", "Landroid/database/sqlite/SQLiteDatabase;", "m", "k", "Lj3/g;", "g", "sqLiteDatabase", "Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "i", "Lkotlin/b2;", "onCreate", "", "oldVersion", "newVersion", "onUpgrade", "db", "onConfigure", "onDowngrade", "onOpen", "close", "Landroid/content/Context;", "b", "Landroid/content/Context;", "e", "()Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$b;", ak.aF, "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$b;", "f", "()Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$b;", "dbRef", "Z", "()Z", "allowDataLossOnRecovery", "migrated", RXScreenCaptureService.KEY_HEIGHT, "opened", "Lj3/h$a;", "callback", "Lj3/h$a;", "d", "()Lj3/h$a;", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$b;Lj3/h$a;Z)V", "CallbackException", "CallbackName", ak.av, "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
    public static final class OpenHelper extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Context context;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final b dbRef;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        private final j3.h.a f27474d;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean allowDataLossOnRecovery;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean migrated;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.d
        private final k3.a f27477g;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean opened;

        /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\b\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "b", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", ak.av, "()Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "callbackName", "", ak.aF, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "cause", "<init>", "(Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;Ljava/lang/Throwable;)V", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
        public static final class CallbackException extends RuntimeException {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @dl.d
            private final CallbackName callbackName;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @dl.d
            private final Throwable cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CallbackException(@dl.d CallbackName callbackName, @dl.d Throwable cause) {
                super(cause);
                f0.p(callbackName, "callbackName");
                f0.p(cause, "cause");
                this.callbackName = callbackName;
                this.cause = cause;
            }

            @dl.d
            /* JADX INFO: renamed from: a, reason: from getter */
            public final CallbackName getCallbackName() {
                return this.callbackName;
            }

            @Override // java.lang.Throwable
            @dl.d
            public Throwable getCause() {
                return this.cause;
            }
        }

        /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "", "(Ljava/lang/String;I)V", "ON_CONFIGURE", "ON_CREATE", "ON_UPGRADE", "ON_DOWNGRADE", "ON_OPEN", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public enum CallbackName {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* JADX INFO: renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$a, reason: from kotlin metadata */
        /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$a;", "", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$b;", "refHolder", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", ak.av, "<init>", "()V", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(u uVar) {
                this();
            }

            @dl.d
            public final FrameworkSQLiteDatabase a(@dl.d b refHolder, @dl.d SQLiteDatabase sqLiteDatabase) {
                f0.p(refHolder, "refHolder");
                f0.p(sqLiteDatabase, "sqLiteDatabase");
                FrameworkSQLiteDatabase db2 = refHolder.getDb();
                if (db2 != null && db2.c(sqLiteDatabase)) {
                    return db2;
                }
                FrameworkSQLiteDatabase frameworkSQLiteDatabase = new FrameworkSQLiteDatabase(sqLiteDatabase);
                refHolder.b(frameworkSQLiteDatabase);
                return frameworkSQLiteDatabase;
            }
        }

        /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public final /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f27481a;

            static {
                int[] iArr = new int[CallbackName.values().length];
                try {
                    iArr[CallbackName.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CallbackName.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CallbackName.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CallbackName.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CallbackName.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f27481a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenHelper(@dl.d Context context, @dl.e String str, @dl.d final b dbRef, @dl.d final j3.h.a callback, boolean z10) {
            super(context, str, null, callback.f124213a, new DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.d
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    FrameworkSQLiteOpenHelper.OpenHelper.b(callback, dbRef, sQLiteDatabase);
                }
            });
            f0.p(context, "context");
            f0.p(dbRef, "dbRef");
            f0.p(callback, "callback");
            this.context = context;
            this.dbRef = dbRef;
            this.f27474d = callback;
            this.allowDataLossOnRecovery = z10;
            if (str == null) {
                str = UUID.randomUUID().toString();
                f0.o(str, "randomUUID().toString()");
            }
            File cacheDir = context.getCacheDir();
            f0.o(cacheDir, "context.cacheDir");
            this.f27477g = new k3.a(str, cacheDir, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(j3.h.a callback, b dbRef, SQLiteDatabase dbObj) {
            f0.p(callback, "$callback");
            f0.p(dbRef, "$dbRef");
            Companion companion = INSTANCE;
            f0.o(dbObj, "dbObj");
            callback.c(companion.a(dbRef, dbObj));
        }

        private final SQLiteDatabase k(boolean writable) {
            if (writable) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                f0.o(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            f0.o(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        private final SQLiteDatabase m(boolean writable) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            if (databaseName != null && (parentFile = this.context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w(FrameworkSQLiteOpenHelper.f27463j, "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return k(writable);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return k(writable);
                } catch (Throwable th2) {
                    super.close();
                    if (th2 instanceof CallbackException) {
                        CallbackException callbackException = th2;
                        Throwable cause = callbackException.getCause();
                        int i10 = b.f27481a[callbackException.getCallbackName().ordinal()];
                        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || !(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else if (!(th2 instanceof SQLiteException) || databaseName == null || !this.allowDataLossOnRecovery) {
                        throw th2;
                    }
                    this.context.deleteDatabase(databaseName);
                    try {
                        return k(writable);
                    } catch (CallbackException e10) {
                        throw e10.getCause();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getAllowDataLossOnRecovery() {
            return this.allowDataLossOnRecovery;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                k3.a.c(this.f27477g, false, 1, null);
                super.close();
                this.dbRef.b(null);
                this.opened = false;
            } finally {
                this.f27477g.d();
            }
        }

        @dl.d
        /* JADX INFO: renamed from: d, reason: from getter */
        public final j3.h.a getF27474d() {
            return this.f27474d;
        }

        @dl.d
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Context getContext() {
            return this.context;
        }

        @dl.d
        /* JADX INFO: renamed from: f, reason: from getter */
        public final b getDbRef() {
            return this.dbRef;
        }

        @dl.d
        public final j3.g g(boolean writable) {
            try {
                this.f27477g.b((this.opened || getDatabaseName() == null) ? false : true);
                this.migrated = false;
                SQLiteDatabase sQLiteDatabaseM = m(writable);
                if (!this.migrated) {
                    return i(sQLiteDatabaseM);
                }
                close();
                return g(writable);
            } finally {
                this.f27477g.d();
            }
        }

        @dl.d
        public final FrameworkSQLiteDatabase i(@dl.d SQLiteDatabase sqLiteDatabase) {
            f0.p(sqLiteDatabase, "sqLiteDatabase");
            return INSTANCE.a(this.dbRef, sqLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(@dl.d SQLiteDatabase db2) {
            f0.p(db2, "db");
            try {
                this.f27474d.b(i(db2));
            } catch (Throwable th2) {
                throw new CallbackException(CallbackName.ON_CONFIGURE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(@dl.d SQLiteDatabase sqLiteDatabase) {
            f0.p(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f27474d.d(i(sqLiteDatabase));
            } catch (Throwable th2) {
                throw new CallbackException(CallbackName.ON_CREATE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(@dl.d SQLiteDatabase db2, int i10, int i11) {
            f0.p(db2, "db");
            this.migrated = true;
            try {
                this.f27474d.e(i(db2), i10, i11);
            } catch (Throwable th2) {
                throw new CallbackException(CallbackName.ON_DOWNGRADE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(@dl.d SQLiteDatabase db2) {
            f0.p(db2, "db");
            if (!this.migrated) {
                try {
                    this.f27474d.f(i(db2));
                } catch (Throwable th2) {
                    throw new CallbackException(CallbackName.ON_OPEN, th2);
                }
            }
            this.opened = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(@dl.d SQLiteDatabase sqLiteDatabase, int i10, int i11) {
            f0.p(sqLiteDatabase, "sqLiteDatabase");
            this.migrated = true;
            try {
                this.f27474d.g(i(sqLiteDatabase), i10, i11);
            } catch (Throwable th2) {
                throw new CallbackException(CallbackName.ON_UPGRADE, th2);
            }
        }
    }

    /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u0007R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$b;", "", "Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", ak.av, "Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "()Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "b", "(Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;)V", "db", "<init>", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private FrameworkSQLiteDatabase db;

        public b(@dl.e FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.db = frameworkSQLiteDatabase;
        }

        @dl.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final FrameworkSQLiteDatabase getDb() {
            return this.db;
        }

        public final void b(@dl.e FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.db = frameworkSQLiteDatabase;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public FrameworkSQLiteOpenHelper(@dl.d Context context, @dl.e String str, @dl.d j3.h.a callback) {
        this(context, str, callback, false, false, 24, null);
        f0.p(context, "context");
        f0.p(callback, "callback");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public FrameworkSQLiteOpenHelper(@dl.d Context context, @dl.e String str, @dl.d j3.h.a callback, boolean z10) {
        this(context, str, callback, z10, false, 16, null);
        f0.p(context, "context");
        f0.p(callback, "callback");
    }

    @i
    public FrameworkSQLiteOpenHelper(@dl.d Context context, @dl.e String str, @dl.d j3.h.a callback, boolean z10, boolean z11) {
        f0.p(context, "context");
        f0.p(callback, "callback");
        this.context = context;
        this.name = str;
        this.f27466d = callback;
        this.useNoBackupDirectory = z10;
        this.allowDataLossOnRecovery = z11;
        this.lazyDelegate = b0.c(new yh.a<OpenHelper>() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$lazyDelegate$1
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FrameworkSQLiteOpenHelper.OpenHelper invoke() {
                FrameworkSQLiteOpenHelper.OpenHelper openHelper;
                if (this.f27483b.name == null || !this.f27483b.useNoBackupDirectory) {
                    openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(this.f27483b.context, this.f27483b.name, new FrameworkSQLiteOpenHelper.b(null), this.f27483b.f27466d, this.f27483b.allowDataLossOnRecovery);
                } else {
                    openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(this.f27483b.context, new File(j3.c.C1116c.a(this.f27483b.context), this.f27483b.name).getAbsolutePath(), new FrameworkSQLiteOpenHelper.b(null), this.f27483b.f27466d, this.f27483b.allowDataLossOnRecovery);
                }
                j3.c.a.h(openHelper, this.f27483b.writeAheadLoggingEnabled);
                return openHelper;
            }
        });
    }

    public /* synthetic */ FrameworkSQLiteOpenHelper(Context context, String str, j3.h.a aVar, boolean z10, boolean z11, int i10, u uVar) {
        this(context, str, aVar, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11);
    }

    private final OpenHelper g() {
        return this.lazyDelegate.getValue();
    }

    private static Object i(FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper) {
        return frameworkSQLiteOpenHelper.lazyDelegate;
    }

    @Override // j3.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.lazyDelegate.l()) {
            g().close();
        }
    }

    @Override // j3.h
    @dl.e
    /* JADX INFO: renamed from: getDatabaseName, reason: from getter */
    public String getName() {
        return this.name;
    }

    @Override // j3.h
    @dl.d
    public j3.g getReadableDatabase() {
        return g().g(false);
    }

    @Override // j3.h
    @dl.d
    public j3.g getWritableDatabase() {
        return g().g(true);
    }

    @Override // j3.h
    @w0(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.lazyDelegate.l()) {
            j3.c.a.h(g(), z10);
        }
        this.writeAheadLoggingEnabled = z10;
    }
}
