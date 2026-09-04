package androidx.room;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;

/* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003 !\"B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\b\u0010\u0007\u001a\u00020\u0005H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006#"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper;", "Lj3/h;", "Landroidx/room/l;", "", "enabled", "Lkotlin/b2;", "setWriteAheadLoggingEnabled", "close", "Landroidx/room/c;", ak.aF, "Landroidx/room/c;", "autoCloser", "Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "d", "Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "autoClosingDb", "delegate", "Lj3/h;", "getDelegate", "()Lj3/h;", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lj3/g;", "getWritableDatabase", "()Lj3/g;", "writableDatabase", "getReadableDatabase", "readableDatabase", "<init>", "(Lj3/h;Landroidx/room/c;)V", "AutoClosingSupportSQLiteDatabase", "AutoClosingSupportSqliteStatement", ak.av, "room-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class AutoClosingRoomOpenHelper implements j3.h, l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final j3.h f26866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final c autoCloser;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AutoClosingSupportSQLiteDatabase autoClosingDb;

    /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
    @Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010C\u001a\u00020@¢\u0006\u0004\ba\u0010bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0004H\u0016J)\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00042\u0010\u0010\u001d\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001c0\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020 H\u0016J\u001a\u0010$\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0017J \u0010*\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016J5\u0010-\u001a\u00020&2\u0006\u0010%\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010\u00042\u0012\u0010,\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u001bH\u0016¢\u0006\u0004\b-\u0010.JE\u0010/\u001a\u00020&2\u0006\u0010%\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010\u00042\u0012\u0010,\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u001bH\u0016¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J)\u00102\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u001d\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001c0\u001bH\u0016¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u00020\u00102\u0006\u00104\u001a\u00020&H\u0016J\u0010\u00108\u001a\u00020\u00022\u0006\u00107\u001a\u000206H\u0016J\u0010\u0010:\u001a\u00020\u00022\u0006\u00109\u001a\u00020&H\u0016J\u0010\u0010<\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u0010H\u0017J\b\u0010=\u001a\u00020\u0010H\u0016J\b\u0010>\u001a\u00020\u0002H\u0016J\b\u0010?\u001a\u00020\u0002H\u0016R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER$\u0010G\u001a\u00020&2\u0006\u0010G\u001a\u00020&8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR$\u0010R\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bO\u0010M\"\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010ER\u0014\u0010T\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010ER\u0016\u0010W\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010ER(\u0010^\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040[\u0018\u00010Z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010E¨\u0006c"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "Lj3/g;", "Lkotlin/b2;", ak.av, "", com.tekartik.sqflite.b.f98602u, "Lj3/l;", "s1", ak.aG, "D", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "T0", "H1", "U0", "O0", "", "I1", "B1", "", "sleepAfterYieldDelayMillis", "o1", "numBytes", "Q0", "query", "Landroid/database/Cursor;", "D1", "", "", "bindArgs", "U", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Lj3/j;", "u1", "Landroid/os/CancellationSignal;", "cancellationSignal", "B", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "n0", "whereClause", "whereArgs", "l", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "x1", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "y0", "P0", "(Ljava/lang/String;[Ljava/lang/Object;)V", "newVersion", "G", "Ljava/util/Locale;", "locale", "setLocale", "cacheSize", "O1", "enabled", "b0", "N0", RXScreenCaptureService.KEY_WIDTH, "close", "Landroidx/room/c;", "b", "Landroidx/room/c;", "autoCloser", "F", "()Z", "isDbLockedByCurrentThread", "version", "getVersion", "()I", "p1", "(I)V", "k0", "()J", "maximumSize", "L0", "Q1", "(J)V", "pageSize", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", FlutterActivityLaunchConfigs.EXTRA_PATH, "N1", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "v", "()Ljava/util/List;", "attachedDbs", "A0", "isDatabaseIntegrityOk", "<init>", "(Landroidx/room/c;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class AutoClosingSupportSQLiteDatabase implements j3.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final c autoCloser;

        public AutoClosingSupportSQLiteDatabase(@dl.d c autoCloser) {
            kotlin.jvm.internal.f0.p(autoCloser, "autoCloser");
            this.autoCloser = autoCloser;
        }

        @Override // j3.g
        public boolean A0() {
            return ((Boolean) this.autoCloser.g(new yh.l<j3.g, Boolean>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDatabaseIntegrityOk$1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@dl.d j3.g obj) {
                    kotlin.jvm.internal.f0.p(obj, "obj");
                    return Boolean.valueOf(obj.A0());
                }
            })).booleanValue();
        }

        @Override // j3.g
        @dl.d
        @androidx.annotation.w0(api = 24)
        public Cursor B(@dl.d j3.j query, @dl.e CancellationSignal cancellationSignal) {
            kotlin.jvm.internal.f0.p(query, "query");
            try {
                return new a(this.autoCloser.n().B(query, cancellationSignal), this.autoCloser);
            } catch (Throwable th2) {
                this.autoCloser.e();
                throw th2;
            }
        }

        @Override // j3.g
        public boolean B1() {
            return ((Boolean) this.autoCloser.g(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$1.f26902d)).booleanValue();
        }

        @Override // j3.g
        public void D() {
            try {
                this.autoCloser.n().D();
            } catch (Throwable th2) {
                this.autoCloser.e();
                throw th2;
            }
        }

        @Override // j3.g
        @dl.d
        public Cursor D1(@dl.d String query) {
            kotlin.jvm.internal.f0.p(query, "query");
            try {
                return new a(this.autoCloser.n().D1(query), this.autoCloser);
            } catch (Throwable th2) {
                this.autoCloser.e();
                throw th2;
            }
        }

        @Override // j3.g
        public /* synthetic */ boolean E() {
            return j3.f.b(this);
        }

        @Override // j3.g
        public boolean F() {
            if (this.autoCloser.getF27079i() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.g(new PropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDbLockedByCurrentThread$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.p
                @dl.e
                public Object get(@dl.e Object obj) {
                    return Boolean.valueOf(((j3.g) obj).F());
                }
            })).booleanValue();
        }

        @Override // j3.g
        public boolean G(final int newVersion) {
            return ((Boolean) this.autoCloser.g(new yh.l<j3.g, Boolean>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$needUpgrade$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@dl.d j3.g db2) {
                    kotlin.jvm.internal.f0.p(db2, "db");
                    return Boolean.valueOf(db2.G(newVersion));
                }
            })).booleanValue();
        }

        @Override // j3.g
        public void H1(@dl.d SQLiteTransactionListener transactionListener) {
            kotlin.jvm.internal.f0.p(transactionListener, "transactionListener");
            try {
                this.autoCloser.n().H1(transactionListener);
            } catch (Throwable th2) {
                this.autoCloser.e();
                throw th2;
            }
        }

        @Override // j3.g
        public boolean I1() {
            if (this.autoCloser.getF27079i() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.g(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1.f26877d)).booleanValue();
        }

        @Override // j3.g
        public long L0() {
            return ((Number) this.autoCloser.g(new MutablePropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.l
                public void Y0(@dl.e Object obj, @dl.e Object obj2) {
                    ((j3.g) obj).Q1(((Number) obj2).longValue());
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.p
                @dl.e
                public Object get(@dl.e Object obj) {
                    return Long.valueOf(((j3.g) obj).L0());
                }
            })).longValue();
        }

        @Override // j3.g
        public boolean N0() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // j3.g
        @androidx.annotation.w0(api = 16)
        public boolean N1() {
            return ((Boolean) this.autoCloser.g(new yh.l<j3.g, Boolean>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isWriteAheadLoggingEnabled$1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@dl.d j3.g db2) {
                    kotlin.jvm.internal.f0.p(db2, "db");
                    return Boolean.valueOf(db2.N1());
                }
            })).booleanValue();
        }

        @Override // j3.g
        public void O0() {
            kotlin.b2 b2Var;
            j3.g f27079i = this.autoCloser.getF27079i();
            if (f27079i != null) {
                f27079i.O0();
                b2Var = kotlin.b2.f124493a;
            } else {
                b2Var = null;
            }
            if (b2Var == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null".toString());
            }
        }

        @Override // j3.g
        public void O1(final int i10) {
            this.autoCloser.g(new yh.l<j3.g, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaxSqlCacheSize$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d j3.g db2) {
                    kotlin.jvm.internal.f0.p(db2, "db");
                    db2.O1(i10);
                    return null;
                }
            });
        }

        @Override // j3.g
        public void P0(@dl.d final String sql, @dl.d final Object[] bindArgs) throws SQLException {
            kotlin.jvm.internal.f0.p(sql, "sql");
            kotlin.jvm.internal.f0.p(bindArgs, "bindArgs");
            this.autoCloser.g(new yh.l<j3.g, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d j3.g db2) {
                    kotlin.jvm.internal.f0.p(db2, "db");
                    db2.P0(sql, bindArgs);
                    return null;
                }
            });
        }

        @Override // j3.g
        public long Q0(final long numBytes) {
            return ((Number) this.autoCloser.g(new yh.l<j3.g, Long>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaximumSize$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Long invoke(@dl.d j3.g db2) {
                    kotlin.jvm.internal.f0.p(db2, "db");
                    return Long.valueOf(db2.Q0(numBytes));
                }
            })).longValue();
        }

        @Override // j3.g
        public void Q1(final long j10) {
            this.autoCloser.g(new yh.l<j3.g, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d j3.g db2) {
                    kotlin.jvm.internal.f0.p(db2, "db");
                    db2.Q1(j10);
                    return null;
                }
            });
        }

        @Override // j3.g
        public void T0(@dl.d SQLiteTransactionListener transactionListener) {
            kotlin.jvm.internal.f0.p(transactionListener, "transactionListener");
            try {
                this.autoCloser.n().T0(transactionListener);
            } catch (Throwable th2) {
                this.autoCloser.e();
                throw th2;
            }
        }

        @Override // j3.g
        @dl.d
        public Cursor U(@dl.d String query, @dl.d Object[] bindArgs) {
            kotlin.jvm.internal.f0.p(query, "query");
            kotlin.jvm.internal.f0.p(bindArgs, "bindArgs");
            try {
                return new a(this.autoCloser.n().U(query, bindArgs), this.autoCloser);
            } catch (Throwable th2) {
                this.autoCloser.e();
                throw th2;
            }
        }

        @Override // j3.g
        public void U0() {
            if (this.autoCloser.getF27079i() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null".toString());
            }
            try {
                j3.g f27079i = this.autoCloser.getF27079i();
                kotlin.jvm.internal.f0.m(f27079i);
                f27079i.U0();
            } finally {
                this.autoCloser.e();
            }
        }

        public final void a() {
            this.autoCloser.g(new yh.l<j3.g, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pokeOpen$1
                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d j3.g it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    return null;
                }
            });
        }

        @Override // j3.g
        @androidx.annotation.w0(api = 16)
        public void b0(final boolean z10) {
            this.autoCloser.g(new yh.l<j3.g, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setForeignKeyConstraintsEnabled$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d j3.g db2) {
                    kotlin.jvm.internal.f0.p(db2, "db");
                    db2.b0(z10);
                    return null;
                }
            });
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.autoCloser.d();
        }

        @Override // j3.g
        public /* synthetic */ void g1(String str, Object[] objArr) {
            j3.f.a(this, str, objArr);
        }

        @Override // j3.g
        @dl.e
        public String getPath() {
            return (String) this.autoCloser.g(new yh.l<j3.g, String>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1
                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(@dl.d j3.g obj) {
                    kotlin.jvm.internal.f0.p(obj, "obj");
                    return obj.getPath();
                }
            });
        }

        @Override // j3.g
        public int getVersion() {
            return ((Number) this.autoCloser.g(new MutablePropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.l
                public void Y0(@dl.e Object obj, @dl.e Object obj2) {
                    ((j3.g) obj).p1(((Number) obj2).intValue());
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.p
                @dl.e
                public Object get(@dl.e Object obj) {
                    return Integer.valueOf(((j3.g) obj).getVersion());
                }
            })).intValue();
        }

        @Override // j3.g
        public boolean isOpen() {
            j3.g f27079i = this.autoCloser.getF27079i();
            if (f27079i == null) {
                return false;
            }
            return f27079i.isOpen();
        }

        @Override // j3.g
        public boolean isReadOnly() {
            return ((Boolean) this.autoCloser.g(new yh.l<j3.g, Boolean>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@dl.d j3.g obj) {
                    kotlin.jvm.internal.f0.p(obj, "obj");
                    return Boolean.valueOf(obj.isReadOnly());
                }
            })).booleanValue();
        }

        @Override // j3.g
        public long k0() {
            return ((Number) this.autoCloser.g(new PropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.p
                @dl.e
                public Object get(@dl.e Object obj) {
                    return Long.valueOf(((j3.g) obj).k0());
                }
            })).longValue();
        }

        @Override // j3.g
        public int l(@dl.d final String table, @dl.e final String whereClause, @dl.e final Object[] whereArgs) {
            kotlin.jvm.internal.f0.p(table, "table");
            return ((Number) this.autoCloser.g(new yh.l<j3.g, Integer>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$delete$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Integer invoke(@dl.d j3.g db2) {
                    kotlin.jvm.internal.f0.p(db2, "db");
                    return Integer.valueOf(db2.l(table, whereClause, whereArgs));
                }
            })).intValue();
        }

        @Override // j3.g
        public long n0(@dl.d final String table, final int conflictAlgorithm, @dl.d final ContentValues values) throws SQLException {
            kotlin.jvm.internal.f0.p(table, "table");
            kotlin.jvm.internal.f0.p(values, "values");
            return ((Number) this.autoCloser.g(new yh.l<j3.g, Long>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$insert$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Long invoke(@dl.d j3.g db2) {
                    kotlin.jvm.internal.f0.p(db2, "db");
                    return Long.valueOf(db2.n0(table, conflictAlgorithm, values));
                }
            })).longValue();
        }

        @Override // j3.g
        public boolean o1(long sleepAfterYieldDelayMillis) {
            return ((Boolean) this.autoCloser.g(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2.f26903d)).booleanValue();
        }

        @Override // j3.g
        public void p1(final int i10) {
            this.autoCloser.g(new yh.l<j3.g, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d j3.g db2) {
                    kotlin.jvm.internal.f0.p(db2, "db");
                    db2.p1(i10);
                    return null;
                }
            });
        }

        @Override // j3.g
        @dl.d
        public j3.l s1(@dl.d String sql) {
            kotlin.jvm.internal.f0.p(sql, "sql");
            return new AutoClosingSupportSqliteStatement(sql, this.autoCloser);
        }

        @Override // j3.g
        public void setLocale(@dl.d final Locale locale) {
            kotlin.jvm.internal.f0.p(locale, "locale");
            this.autoCloser.g(new yh.l<j3.g, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setLocale$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d j3.g db2) {
                    kotlin.jvm.internal.f0.p(db2, "db");
                    db2.setLocale(locale);
                    return null;
                }
            });
        }

        @Override // j3.g
        public void u() {
            try {
                this.autoCloser.n().u();
            } catch (Throwable th2) {
                this.autoCloser.e();
                throw th2;
            }
        }

        @Override // j3.g
        @dl.d
        public Cursor u1(@dl.d j3.j query) {
            kotlin.jvm.internal.f0.p(query, "query");
            try {
                return new a(this.autoCloser.n().u1(query), this.autoCloser);
            } catch (Throwable th2) {
                this.autoCloser.e();
                throw th2;
            }
        }

        @Override // j3.g
        @dl.e
        public List<Pair<String, String>> v() {
            return (List) this.autoCloser.g(new yh.l<j3.g, List<? extends Pair<String, String>>>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1
                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final List<Pair<String, String>> invoke(@dl.d j3.g obj) {
                    kotlin.jvm.internal.f0.p(obj, "obj");
                    return obj.v();
                }
            });
        }

        @Override // j3.g
        public void w() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // j3.g
        public int x1(@dl.d final String table, final int conflictAlgorithm, @dl.d final ContentValues values, @dl.e final String whereClause, @dl.e final Object[] whereArgs) {
            kotlin.jvm.internal.f0.p(table, "table");
            kotlin.jvm.internal.f0.p(values, "values");
            return ((Number) this.autoCloser.g(new yh.l<j3.g, Integer>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$update$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Integer invoke(@dl.d j3.g db2) {
                    kotlin.jvm.internal.f0.p(db2, "db");
                    return Integer.valueOf(db2.x1(table, conflictAlgorithm, values, whereClause, whereArgs));
                }
            })).intValue();
        }

        @Override // j3.g
        public void y0(@dl.d final String sql) throws SQLException {
            kotlin.jvm.internal.f0.p(sql, "sql");
            this.autoCloser.g(new yh.l<j3.g, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d j3.g db2) {
                    kotlin.jvm.internal.f0.p(db2, "db");
                    db2.y0(sql);
                    return null;
                }
            });
        }
    }

    /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
    @Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010!\u001a\u00020\u0014\u0012\u0006\u0010$\u001a\u00020\"¢\u0006\u0004\b)\u0010*J)\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0002J\u001a\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0002\u001a\u00020\u0012H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0012H\u0016J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0019H\u0016J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0014H\u0016J\u0018\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\bH\u0016R\u0014\u0010!\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R(\u0010(\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f0%j\n\u0012\u0006\u0012\u0004\u0018\u00010\f`&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'¨\u0006+"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement;", "Lj3/l;", androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function1;", "block", "d", "(Lyh/l;)Ljava/lang/Object;", "supportSQLiteStatement", "Lkotlin/b2;", ak.aF, "", "bindIndex", "", "value", "e", "close", com.tekartik.sqflite.b.f98590i, "y", "", "k1", "", "S0", UCropPlusActivity.ARG_INDEX, "r0", "d0", "", "F0", "X", "", "l0", "R1", "b", "Ljava/lang/String;", com.tekartik.sqflite.b.f98602u, "Landroidx/room/c;", "Landroidx/room/c;", "autoCloser", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "binds", "<init>", "(Ljava/lang/String;Landroidx/room/c;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class AutoClosingSupportSqliteStatement implements j3.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final String sql;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final c autoCloser;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final ArrayList<Object> binds;

        public AutoClosingSupportSqliteStatement(@dl.d String sql, @dl.d c autoCloser) {
            kotlin.jvm.internal.f0.p(sql, "sql");
            kotlin.jvm.internal.f0.p(autoCloser, "autoCloser");
            this.sql = sql;
            this.autoCloser = autoCloser;
            this.binds = new ArrayList<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(j3.l lVar) {
            Iterator<T> it = this.binds.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt__CollectionsKt.W();
                }
                Object obj = this.binds.get(i10);
                if (obj == null) {
                    lVar.r0(i11);
                } else if (obj instanceof Long) {
                    lVar.d0(i11, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    lVar.F0(i11, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    lVar.X(i11, (String) obj);
                } else if (obj instanceof byte[]) {
                    lVar.l0(i11, (byte[]) obj);
                }
                i10 = i11;
            }
        }

        private final <T> T d(final yh.l<? super j3.l, ? extends T> block) {
            return (T) this.autoCloser.g(new yh.l<j3.g, T>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeSqliteStatementWithRefCount$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // yh.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final T invoke(@dl.d j3.g db2) {
                    kotlin.jvm.internal.f0.p(db2, "db");
                    j3.l lVarS1 = db2.s1(this.f26909b.sql);
                    this.f26909b.c(lVarS1);
                    return block.invoke(lVarS1);
                }
            });
        }

        private final void e(int i10, Object obj) {
            int size;
            int i11 = i10 - 1;
            if (i11 >= this.binds.size() && (size = this.binds.size()) <= i11) {
                while (true) {
                    this.binds.add(null);
                    if (size == i11) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.binds.set(i11, obj);
        }

        @Override // j3.i
        public void F0(int i10, double d10) {
            e(i10, Double.valueOf(d10));
        }

        @Override // j3.i
        public void R1() {
            this.binds.clear();
        }

        @Override // j3.l
        @dl.e
        public String S0() {
            return (String) d(new yh.l<j3.l, String>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForString$1
                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(@dl.d j3.l obj) {
                    kotlin.jvm.internal.f0.p(obj, "obj");
                    return obj.S0();
                }
            });
        }

        @Override // j3.l
        public long T() {
            return ((Number) d(new yh.l<j3.l, Long>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForLong$1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Long invoke(@dl.d j3.l obj) {
                    kotlin.jvm.internal.f0.p(obj, "obj");
                    return Long.valueOf(obj.T());
                }
            })).longValue();
        }

        @Override // j3.i
        public void X(int i10, @dl.d String value) {
            kotlin.jvm.internal.f0.p(value, "value");
            e(i10, value);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // j3.i
        public void d0(int i10, long j10) {
            e(i10, Long.valueOf(j10));
        }

        @Override // j3.l
        public void execute() {
            d(new yh.l<j3.l, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$execute$1
                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d j3.l statement) {
                    kotlin.jvm.internal.f0.p(statement, "statement");
                    statement.execute();
                    return null;
                }
            });
        }

        @Override // j3.l
        public long k1() {
            return ((Number) d(new yh.l<j3.l, Long>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeInsert$1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Long invoke(@dl.d j3.l obj) {
                    kotlin.jvm.internal.f0.p(obj, "obj");
                    return Long.valueOf(obj.k1());
                }
            })).longValue();
        }

        @Override // j3.i
        public void l0(int i10, @dl.d byte[] value) {
            kotlin.jvm.internal.f0.p(value, "value");
            e(i10, value);
        }

        @Override // j3.i
        public void r0(int i10) {
            e(i10, null);
        }

        @Override // j3.l
        public int y() {
            return ((Number) d(new yh.l<j3.l, Integer>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeUpdateDelete$1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Integer invoke(@dl.d j3.l obj) {
                    kotlin.jvm.internal.f0.p(obj, "obj");
                    return Integer.valueOf(obj.y());
                }
            })).intValue();
        }
    }

    /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010G\u001a\u00020\u0001\u0012\u0006\u0010K\u001a\u00020H¢\u0006\u0004\bL\u0010MJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\u0096\u0001J\t\u0010\t\u001a\u00020\u0007H\u0097\u0001J\u0019\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\n0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u0010\f\u001a\u00020\u0002H\u0096\u0001J\u0019\u0010\u000e\u001a\u00020\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\r0\rH\u0096\u0001J\u0019\u0010\u000f\u001a\u00020\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\r0\rH\u0096\u0001J\u0019\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\r0\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J6\u0010\u0012\u001a(\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\r0\r \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\r0\r\u0018\u00010\u00110\u0011H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u0018\u001a\n \u0005*\u0004\u0018\u00010\u00170\u0017H\u0096\u0001J\u0011\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u0010\u001e\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0019\u0010!\u001a\n \u0005*\u0004\u0018\u00010\r0\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\"\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u0010$\u001a\u00020#H\u0096\u0001J\t\u0010%\u001a\u00020#H\u0096\u0001J\t\u0010&\u001a\u00020#H\u0096\u0001J\t\u0010'\u001a\u00020#H\u0096\u0001J\t\u0010(\u001a\u00020#H\u0096\u0001J\t\u0010)\u001a\u00020#H\u0096\u0001J\u0011\u0010*\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010+\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u0010,\u001a\u00020#H\u0096\u0001J\t\u0010-\u001a\u00020#H\u0096\u0001J\t\u0010.\u001a\u00020#H\u0096\u0001J\u0011\u0010/\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u00100\u001a\u00020#H\u0096\u0001J\u0019\u00102\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010101H\u0096\u0001J\u0019\u00104\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010303H\u0096\u0001J\t\u00105\u001a\u00020#H\u0097\u0001J!\u00106\u001a\n \u0005*\u0004\u0018\u00010\u00170\u00172\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00170\u0017H\u0096\u0001J)\u00109\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u000107072\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010808H\u0096\u0001J\u0019\u0010:\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010101H\u0096\u0001J\u0019\u0010;\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010303H\u0096\u0001J\b\u0010<\u001a\u00020\u0007H\u0016J\u001e\u0010@\u001a\u00020\u00072\u0006\u0010=\u001a\u0002072\f\u0010?\u001a\b\u0012\u0004\u0012\u0002080>H\u0017J\b\u0010A\u001a\u000208H\u0017J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u0002080>H\u0017J\u0010\u0010D\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u0017H\u0017R\u0014\u0010G\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006N"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$a;", "Landroid/database/Cursor;", "", "p0", "Landroid/database/CharArrayBuffer;", "kotlin.jvm.PlatformType", "p1", "Lkotlin/b2;", "copyStringToBuffer", "deactivate", "", "getBlob", "getColumnCount", "", "getColumnIndex", "getColumnIndexOrThrow", "getColumnName", "", "getColumnNames", "()[Ljava/lang/String;", "getCount", "", "getDouble", "Landroid/os/Bundle;", "getExtras", "", "getFloat", "getInt", "", "getLong", "getPosition", "", "getShort", "getString", "getType", "", "getWantsAllOnMoveCalls", "isAfterLast", "isBeforeFirst", "isClosed", "isFirst", "isLast", "isNull", "move", "moveToFirst", "moveToLast", "moveToNext", "moveToPosition", "moveToPrevious", "Landroid/database/ContentObserver;", "registerContentObserver", "Landroid/database/DataSetObserver;", "registerDataSetObserver", "requery", "respond", "Landroid/content/ContentResolver;", "Landroid/net/Uri;", "setNotificationUri", "unregisterContentObserver", "unregisterDataSetObserver", "close", "cr", "", "uris", "setNotificationUris", "getNotificationUri", "getNotificationUris", "extras", "setExtras", "b", "Landroid/database/Cursor;", "delegate", "Landroidx/room/c;", ak.aF, "Landroidx/room/c;", "autoCloser", "<init>", "(Landroid/database/Cursor;Landroidx/room/c;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements Cursor {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Cursor delegate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final c autoCloser;

        public a(@dl.d Cursor delegate, @dl.d c autoCloser) {
            kotlin.jvm.internal.f0.p(delegate, "delegate");
            kotlin.jvm.internal.f0.p(autoCloser, "autoCloser");
            this.delegate = delegate;
            this.autoCloser = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
            this.autoCloser.e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.delegate.copyStringToBuffer(i10, charArrayBuffer);
        }

        @Override // android.database.Cursor
        @kotlin.k(message = "Deprecated in Java")
        public void deactivate() {
            this.delegate.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int p10) {
            return this.delegate.getBlob(p10);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String p10) {
            return this.delegate.getColumnIndex(p10);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String p10) {
            return this.delegate.getColumnIndexOrThrow(p10);
        }

        @Override // android.database.Cursor
        public String getColumnName(int p10) {
            return this.delegate.getColumnName(p10);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.delegate.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.delegate.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int p10) {
            return this.delegate.getDouble(p10);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.delegate.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int p10) {
            return this.delegate.getFloat(p10);
        }

        @Override // android.database.Cursor
        public int getInt(int p10) {
            return this.delegate.getInt(p10);
        }

        @Override // android.database.Cursor
        public long getLong(int p10) {
            return this.delegate.getLong(p10);
        }

        @Override // android.database.Cursor
        @dl.d
        @androidx.annotation.w0(api = 19)
        public Uri getNotificationUri() {
            return j3.c.b.a(this.delegate);
        }

        @Override // android.database.Cursor
        @dl.d
        @androidx.annotation.w0(api = 29)
        public List<Uri> getNotificationUris() {
            return j3.c.e.a(this.delegate);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.delegate.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int p10) {
            return this.delegate.getShort(p10);
        }

        @Override // android.database.Cursor
        public String getString(int p10) {
            return this.delegate.getString(p10);
        }

        @Override // android.database.Cursor
        public int getType(int p10) {
            return this.delegate.getType(p10);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.delegate.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.delegate.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.delegate.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.delegate.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.delegate.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.delegate.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int p10) {
            return this.delegate.isNull(p10);
        }

        @Override // android.database.Cursor
        public boolean move(int p10) {
            return this.delegate.move(p10);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.delegate.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.delegate.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.delegate.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int p10) {
            return this.delegate.moveToPosition(p10);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.delegate.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.delegate.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.delegate.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        @kotlin.k(message = "Deprecated in Java")
        public boolean requery() {
            return this.delegate.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle p10) {
            return this.delegate.respond(p10);
        }

        @Override // android.database.Cursor
        @androidx.annotation.w0(api = 23)
        public void setExtras(@dl.d Bundle extras) {
            kotlin.jvm.internal.f0.p(extras, "extras");
            j3.c.d.a(this.delegate, extras);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.delegate.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        @androidx.annotation.w0(api = 29)
        public void setNotificationUris(@dl.d ContentResolver cr, @dl.d List<? extends Uri> uris) {
            kotlin.jvm.internal.f0.p(cr, "cr");
            kotlin.jvm.internal.f0.p(uris, "uris");
            j3.c.e.b(this.delegate, cr, uris);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.delegate.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.delegate.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public AutoClosingRoomOpenHelper(@dl.d j3.h delegate, @dl.d c autoCloser) {
        kotlin.jvm.internal.f0.p(delegate, "delegate");
        kotlin.jvm.internal.f0.p(autoCloser, "autoCloser");
        this.f26866b = delegate;
        this.autoCloser = autoCloser;
        autoCloser.o(getF27107b());
        this.autoClosingDb = new AutoClosingSupportSQLiteDatabase(autoCloser);
    }

    @Override // j3.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.autoClosingDb.close();
    }

    @Override // j3.h
    @dl.e
    /* JADX INFO: renamed from: getDatabaseName */
    public String getName() {
        return this.f26866b.getName();
    }

    @Override // androidx.room.l
    @dl.d
    /* JADX INFO: renamed from: getDelegate, reason: from getter */
    public j3.h getF27107b() {
        return this.f26866b;
    }

    @Override // j3.h
    @dl.d
    @androidx.annotation.w0(api = 24)
    public j3.g getReadableDatabase() {
        this.autoClosingDb.a();
        return this.autoClosingDb;
    }

    @Override // j3.h
    @dl.d
    @androidx.annotation.w0(api = 24)
    public j3.g getWritableDatabase() {
        this.autoClosingDb.a();
        return this.autoClosingDb;
    }

    @Override // j3.h
    @androidx.annotation.w0(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f26866b.setWriteAheadLoggingEnabled(z10);
    }
}
