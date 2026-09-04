package j3;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.annotation.w0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import xh.m;

/* JADX INFO: compiled from: SupportSQLiteCompat.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lj3/c;", "", "<init>", "()V", ak.av, "b", ak.aF, "d", "e", "sqlite_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class c {

    /* JADX INFO: compiled from: SupportSQLiteCompat.kt */
    @Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007JK\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0010\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\tH\u0007J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0018\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\tH\u0007¨\u0006!"}, d2 = {"Lj3/c$a;", "", "Landroid/os/CancellationSignal;", "cancellationSignal", "Lkotlin/b2;", ak.av, "b", "Ljava/io/File;", "file", "", ak.aF, "Landroid/database/sqlite/SQLiteDatabase;", "sQLiteDatabase", "", com.tekartik.sqflite.b.f98602u, "", "selectionArgs", "editTable", "Landroid/database/sqlite/SQLiteDatabase$CursorFactory;", "cursorFactory", "Landroid/database/Cursor;", "f", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/Cursor;", "enable", "g", "d", "e", "Landroid/database/sqlite/SQLiteOpenHelper;", "sQLiteOpenHelper", "enabled", RXScreenCaptureService.KEY_HEIGHT, "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 7, 1})
    @w0(16)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f124206a = new a();

        private a() {
        }

        @m
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void a(@dl.d CancellationSignal cancellationSignal) {
            f0.p(cancellationSignal, "cancellationSignal");
            cancellationSignal.cancel();
        }

        @dl.d
        @m
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final CancellationSignal b() {
            return new CancellationSignal();
        }

        @m
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final boolean c(@dl.d File file) {
            f0.p(file, "file");
            return SQLiteDatabase.deleteDatabase(file);
        }

        @m
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void d(@dl.d SQLiteDatabase sQLiteDatabase) {
            f0.p(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.disableWriteAheadLogging();
        }

        @m
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final boolean e(@dl.d SQLiteDatabase sQLiteDatabase) {
            f0.p(sQLiteDatabase, "sQLiteDatabase");
            return sQLiteDatabase.isWriteAheadLoggingEnabled();
        }

        @dl.d
        @m
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final Cursor f(@dl.d SQLiteDatabase sQLiteDatabase, @dl.d String sql, @dl.d String[] selectionArgs, @dl.e String editTable, @dl.d CancellationSignal cancellationSignal, @dl.d SQLiteDatabase.CursorFactory cursorFactory) {
            f0.p(sQLiteDatabase, "sQLiteDatabase");
            f0.p(sql, "sql");
            f0.p(selectionArgs, "selectionArgs");
            f0.p(cancellationSignal, "cancellationSignal");
            f0.p(cursorFactory, "cursorFactory");
            Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, selectionArgs, editTable, cancellationSignal);
            f0.o(cursorRawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
            return cursorRawQueryWithFactory;
        }

        @m
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void g(@dl.d SQLiteDatabase sQLiteDatabase, boolean z10) {
            f0.p(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.setForeignKeyConstraintsEnabled(z10);
        }

        @m
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void h(@dl.d SQLiteOpenHelper sQLiteOpenHelper, boolean z10) {
            f0.p(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z10);
        }
    }

    /* JADX INFO: compiled from: SupportSQLiteCompat.kt */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\f"}, d2 = {"Lj3/c$b;", "", "Landroid/database/Cursor;", "cursor", "Landroid/net/Uri;", ak.av, "Landroid/app/ActivityManager;", "activityManager", "", "b", "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 7, 1})
    @w0(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final b f124207a = new b();

        private b() {
        }

        @dl.d
        @m
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final Uri a(@dl.d Cursor cursor) {
            f0.p(cursor, "cursor");
            Uri notificationUri = cursor.getNotificationUri();
            f0.o(notificationUri, "cursor.notificationUri");
            return notificationUri;
        }

        @m
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final boolean b(@dl.d ActivityManager activityManager) {
            f0.p(activityManager, "activityManager");
            return activityManager.isLowRamDevice();
        }
    }

    /* JADX INFO: renamed from: j3.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SupportSQLiteCompat.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lj3/c$c;", "", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Ljava/io/File;", ak.av, "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 7, 1})
    @w0(21)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class C1116c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final C1116c f124208a = new C1116c();

        private C1116c() {
        }

        @dl.d
        @m
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final File a(@dl.d Context context) {
            f0.p(context, "context");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            f0.o(noBackupFilesDir, "context.noBackupFilesDir");
            return noBackupFilesDir;
        }
    }

    /* JADX INFO: compiled from: SupportSQLiteCompat.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lj3/c$d;", "", "Landroid/database/Cursor;", "cursor", "Landroid/os/Bundle;", "extras", "Lkotlin/b2;", ak.av, "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 7, 1})
    @w0(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final d f124209a = new d();

        private d() {
        }

        @m
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void a(@dl.d Cursor cursor, @dl.d Bundle extras) {
            f0.p(cursor, "cursor");
            f0.p(extras, "extras");
            cursor.setExtras(extras);
        }
    }

    /* JADX INFO: compiled from: SupportSQLiteCompat.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u000e"}, d2 = {"Lj3/c$e;", "", "Landroid/database/Cursor;", "cursor", "Landroid/content/ContentResolver;", "cr", "", "Landroid/net/Uri;", "uris", "Lkotlin/b2;", "b", ak.av, "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 7, 1})
    @w0(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final e f124210a = new e();

        private e() {
        }

        @dl.d
        @m
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final List<Uri> a(@dl.d Cursor cursor) {
            f0.p(cursor, "cursor");
            List<Uri> notificationUris = cursor.getNotificationUris();
            f0.m(notificationUris);
            return notificationUris;
        }

        @m
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void b(@dl.d Cursor cursor, @dl.d ContentResolver cr, @dl.d List<? extends Uri> uris) {
            f0.p(cursor, "cursor");
            f0.p(cr, "cr");
            f0.p(uris, "uris");
            cursor.setNotificationUris(cr, uris);
        }
    }

    private c() {
    }
}
