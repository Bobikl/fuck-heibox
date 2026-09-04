package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: InvalidationTracker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 )2\u00020\u0001:\u0005:#$47BX\b\u0007\u0012\u0006\u0010\u0014\u001a\u000209\u0012\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0>\u0012\u001d\u0010C\u001a\u0019\u0012\u0004\u0012\u00020\n\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\n0A¢\u0006\u0002\bB0>\u0012\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0004\bq\u0010rB%\b\u0017\u0012\u0006\u0010\u0014\u001a\u000209\u0012\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0004\bq\u0010sJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J'\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0000¢\u0006\u0004\b \u0010\u0018J\u0010\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0017J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0017J\u0010\u0010%\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0017J\u000f\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b'\u0010(J\b\u0010)\u001a\u00020\u0006H\u0016J\b\u0010*\u001a\u00020\u0006H\u0017J#\u0010,\u001a\u00020\u00062\u0012\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b.\u0010\u0016J\u000f\u0010/\u001a\u00020\u0006H\u0000¢\u0006\u0004\b/\u0010\u0018J9\u00104\u001a\b\u0012\u0004\u0012\u00028\u000003\"\u0004\b\u0000\u001002\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0017¢\u0006\u0004\b4\u00105JA\u00107\u001a\b\u0012\u0004\u0012\u00028\u000003\"\u0004\b\u0000\u001002\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u00106\u001a\u00020&2\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0017¢\u0006\u0004\b7\u00108R\u001a\u0010\u0014\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010?R+\u0010C\u001a\u0019\u0012\u0004\u0012\u00020\n\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\n0A¢\u0006\u0002\bB0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010?R&\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u0010?\u001a\u0004\bD\u0010ER\"\u0010J\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u0010G\u001a\u0004\bH\u0010IR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010KR\u001a\u0010Q\u001a\u00020L8GX\u0087\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010RR\u0014\u0010V\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010UR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR&\u0010`\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\\0[8\u0000X\u0081\u0004¢\u0006\f\n\u0004\bD\u0010]\u001a\u0004\b^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010bR\u0014\u0010e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010dR\u0014\u0010f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010dR\u001a\u0010j\u001a\u00020g8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010h\u0012\u0004\bi\u0010\u0018R$\u0010l\u001a\u0004\u0018\u00010k8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bM\u0010n\"\u0004\bo\u0010p¨\u0006t"}, d2 = {"Landroidx/room/f0;", "", "Lj3/g;", "db", "", "tableId", "Lkotlin/b2;", ak.aD, "x", "", "", "tableNames", "C", "([Ljava/lang/String;)[Ljava/lang/String;", "names", "t", "Landroidx/room/c;", "autoCloser", ak.aG, "(Landroidx/room/c;)V", "database", "n", "(Lj3/g;)V", "p", "()V", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "name", "Landroid/content/Intent;", "serviceIntent", RXScreenCaptureService.KEY_WIDTH, "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "y", "Landroidx/room/f0$c;", "observer", "b", ak.aF, ak.aB, "", "f", "()Z", "q", "r", "tables", "o", "([Ljava/lang/String;)V", "B", androidx.exifinterface.media.a.W4, androidx.exifinterface.media.a.f23244d5, "Ljava/util/concurrent/Callable;", "computeFunction", "Landroidx/lifecycle/LiveData;", "d", "([Ljava/lang/String;Ljava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", com.tekartik.sqflite.b.f98597p, "e", "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "Landroidx/room/RoomDatabase;", ak.av, "Landroidx/room/RoomDatabase;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/room/RoomDatabase;", "", "Ljava/util/Map;", "shadowTablesMap", "", "Lxh/n;", "viewTables", "l", "()Ljava/util/Map;", "tableIdLookup", "[Ljava/lang/String;", "m", "()[Ljava/lang/String;", "tablesNames", "Landroidx/room/c;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "g", "Ljava/util/concurrent/atomic/AtomicBoolean;", "j", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRefresh", "Z", "initialized", "Landroidx/room/f0$b;", "Landroidx/room/f0$b;", "observedTableTracker", "Landroidx/room/d0;", "k", "Landroidx/room/d0;", "invalidationLiveDataContainer", "Landroidx/arch/core/internal/b;", "Landroidx/room/f0$d;", "Landroidx/arch/core/internal/b;", "i", "()Landroidx/arch/core/internal/b;", "observerMap", "Landroidx/room/k0;", "Landroidx/room/k0;", "multiInstanceInvalidationClient", "Ljava/lang/Object;", "syncTriggersLock", "trackerLock", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "getRefreshRunnable$annotations", "refreshRunnable", "Lj3/l;", "cleanupStatement", "Lj3/l;", "()Lj3/l;", "v", "(Lj3/l;)V", "<init>", "(Landroidx/room/RoomDatabase;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V", "(Landroidx/room/RoomDatabase;[Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
public class f0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final String[] f27139r = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private static final String f27140s = "room_table_modification_log";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private static final String f27141t = "table_id";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final String f27142u = "invalidated";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final String f27143v = "CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    public static final String f27144w = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    public static final String f27145x = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final RoomDatabase database;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<String, String> shadowTablesMap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<String, Set<String>> viewTables;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<String, Integer> tableIdLookup;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String[] tablesNames;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.room.c autoCloser;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    private final AtomicBoolean pendingRefresh;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private volatile boolean initialized;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private volatile j3.l f27154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b observedTableTracker;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final d0 invalidationLiveDataContainer;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @androidx.annotation.b0("observerMap")
    private final androidx.arch.core.internal.b<c, d> observerMap;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private k0 multiInstanceInvalidationClient;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object syncTriggersLock;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object trackerLock;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final Runnable refreshRunnable;

    /* JADX INFO: renamed from: androidx.room.f0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: InvalidationTracker.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u0011J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001a\u0010\u000f\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u000f\u0010\r\u0012\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0012\u0010\r\u0012\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\r¨\u0006\u001a"}, d2 = {"Landroidx/room/f0$a;", "", "", "tableName", "triggerType", "d", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lj3/g;", "database", "Lkotlin/b2;", ak.av, "(Lj3/g;)V", "CREATE_TRACKING_TABLE_SQL", "Ljava/lang/String;", "INVALIDATED_COLUMN_NAME", "RESET_UPDATED_TABLES_SQL", "getRESET_UPDATED_TABLES_SQL$room_runtime_release$annotations", "()V", "SELECT_UPDATED_TABLES_SQL", "getSELECT_UPDATED_TABLES_SQL$room_runtime_release$annotations", "TABLE_ID_COLUMN_NAME", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "<init>", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @androidx.annotation.j1
        public static /* synthetic */ void b() {
        }

        @androidx.annotation.j1
        public static /* synthetic */ void c() {
        }

        public final void a(@dl.d j3.g database) {
            kotlin.jvm.internal.f0.p(database, "database");
            if (database.N1()) {
                database.D();
            } else {
                database.u();
            }
        }

        @dl.d
        public final String d(@dl.d String tableName, @dl.d String triggerType) {
            kotlin.jvm.internal.f0.p(tableName, "tableName");
            kotlin.jvm.internal.f0.p(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }
    }

    /* JADX INFO: compiled from: InvalidationTracker.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\u0018\n\u0002\b\r\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003J\u0012\u0010\u0007\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003J\u0006\u0010\t\u001a\u00020\bJ\n\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0007R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\"\u0010\u001a\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\f\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Landroidx/room/f0$b;", "", "", "", "tableIds", "", "d", "e", "Lkotlin/b2;", "f", ak.aF, "", ak.av, "[J", "b", "()[J", "tableObservers", "", "[Z", "triggerStates", "[I", "triggerStateChanges", "Z", "()Z", "g", "(Z)V", "needsSync", "tableCount", "<init>", "(I)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f27163f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f27164g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f27165h = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final long[] tableObservers;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final boolean[] triggerStates;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final int[] triggerStateChanges;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean needsSync;

        public b(int i10) {
            this.tableObservers = new long[i10];
            this.triggerStates = new boolean[i10];
            this.triggerStateChanges = new int[i10];
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getNeedsSync() {
            return this.needsSync;
        }

        @dl.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public final long[] getTableObservers() {
            return this.tableObservers;
        }

        @androidx.annotation.j1
        @xh.h(name = "getTablesToSync")
        @dl.e
        public final int[] c() {
            synchronized (this) {
                if (!this.needsSync) {
                    return null;
                }
                long[] jArr = this.tableObservers;
                int length = jArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    int i13 = 1;
                    boolean z10 = jArr[i10] > 0;
                    boolean[] zArr = this.triggerStates;
                    if (z10 != zArr[i11]) {
                        int[] iArr = this.triggerStateChanges;
                        if (!z10) {
                            i13 = 2;
                        }
                        iArr[i11] = i13;
                    } else {
                        this.triggerStateChanges[i11] = 0;
                    }
                    zArr[i11] = z10;
                    i10++;
                    i11 = i12;
                }
                this.needsSync = false;
                return (int[]) this.triggerStateChanges.clone();
            }
        }

        public final boolean d(@dl.d int... tableIds) {
            boolean z10;
            kotlin.jvm.internal.f0.p(tableIds, "tableIds");
            synchronized (this) {
                z10 = false;
                for (int i10 : tableIds) {
                    long[] jArr = this.tableObservers;
                    long j10 = jArr[i10];
                    jArr[i10] = 1 + j10;
                    if (j10 == 0) {
                        this.needsSync = true;
                        z10 = true;
                    }
                }
                kotlin.b2 b2Var = kotlin.b2.f124493a;
            }
            return z10;
        }

        public final boolean e(@dl.d int... tableIds) {
            boolean z10;
            kotlin.jvm.internal.f0.p(tableIds, "tableIds");
            synchronized (this) {
                z10 = false;
                for (int i10 : tableIds) {
                    long[] jArr = this.tableObservers;
                    long j10 = jArr[i10];
                    jArr[i10] = j10 - 1;
                    if (j10 == 1) {
                        this.needsSync = true;
                        z10 = true;
                    }
                }
                kotlin.b2 b2Var = kotlin.b2.f124493a;
            }
            return z10;
        }

        public final void f() {
            synchronized (this) {
                Arrays.fill(this.triggerStates, false);
                this.needsSync = true;
                kotlin.b2 b2Var = kotlin.b2.f124493a;
            }
        }

        public final void g(boolean z10) {
            this.needsSync = z10;
        }
    }

    /* JADX INFO: compiled from: InvalidationTracker.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007¢\u0006\u0004\b\u000f\u0010\u0010B%\b\u0014\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007\"\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0013J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&R\"\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Landroidx/room/f0$c;", "", "", "", "tables", "Lkotlin/b2;", ak.aF, "", ak.av, "[Ljava/lang/String;", "()[Ljava/lang/String;", "", "b", "()Z", "isRemote", "<init>", "([Ljava/lang/String;)V", "firstTable", "rest", "(Ljava/lang/String;[Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final String[] tables;

        /* JADX WARN: Illegal instructions before constructor call */
        protected c(@dl.d String firstTable, @dl.d String... rest) {
            kotlin.jvm.internal.f0.p(firstTable, "firstTable");
            kotlin.jvm.internal.f0.p(rest, "rest");
            List listI = kotlin.collections.s.i();
            kotlin.collections.x.p0(listI, rest);
            listI.add(firstTable);
            Object[] array = kotlin.collections.s.a(listI).toArray(new String[0]);
            kotlin.jvm.internal.f0.n(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            this((String[]) array);
        }

        public c(@dl.d String[] tables) {
            kotlin.jvm.internal.f0.p(tables, "tables");
            this.tables = tables;
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String[] getTables() {
            return this.tables;
        }

        public boolean b() {
            return false;
        }

        public abstract void c(@dl.d Set<String> set);
    }

    /* JADX INFO: compiled from: InvalidationTracker.kt */
    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/room/f0$d;", "", "", "", "invalidatedTablesIds", "Lkotlin/b2;", ak.aF, "(Ljava/util/Set;)V", "", "", "tables", "d", "([Ljava/lang/String;)V", "Landroidx/room/f0$c;", ak.av, "Landroidx/room/f0$c;", "()Landroidx/room/f0$c;", "observer", "", "b", "[I", "()[I", "tableIds", "[Ljava/lang/String;", "tableNames", "Ljava/util/Set;", "singleTableSet", "<init>", "(Landroidx/room/f0$c;[I[Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final c observer;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final int[] tableIds;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final String[] tableNames;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Set<String> singleTableSet;

        public d(@dl.d c observer, @dl.d int[] tableIds, @dl.d String[] tableNames) {
            kotlin.jvm.internal.f0.p(observer, "observer");
            kotlin.jvm.internal.f0.p(tableIds, "tableIds");
            kotlin.jvm.internal.f0.p(tableNames, "tableNames");
            this.observer = observer;
            this.tableIds = tableIds;
            this.tableNames = tableNames;
            this.singleTableSet = (tableNames.length == 0) ^ true ? kotlin.collections.c1.f(tableNames[0]) : kotlin.collections.d1.k();
            if (!(tableIds.length == tableNames.length)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final c getObserver() {
            return this.observer;
        }

        @dl.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public final int[] getTableIds() {
            return this.tableIds;
        }

        public final void c(@dl.d Set<Integer> invalidatedTablesIds) {
            Set<String> setK;
            kotlin.jvm.internal.f0.p(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.tableIds;
            int length = iArr.length;
            if (length != 0) {
                int i10 = 0;
                if (length != 1) {
                    Set setD = kotlin.collections.c1.d();
                    int[] iArr2 = this.tableIds;
                    int length2 = iArr2.length;
                    int i11 = 0;
                    while (i10 < length2) {
                        int i12 = i11 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i10]))) {
                            setD.add(this.tableNames[i11]);
                        }
                        i10++;
                        i11 = i12;
                    }
                    setK = kotlin.collections.c1.a(setD);
                } else {
                    setK = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.singleTableSet : kotlin.collections.d1.k();
                }
            } else {
                setK = kotlin.collections.d1.k();
            }
            if (!setK.isEmpty()) {
                this.observer.c(setK);
            }
        }

        public final void d(@dl.d String[] tables) {
            Set<String> setK;
            kotlin.jvm.internal.f0.p(tables, "tables");
            int length = this.tableNames.length;
            if (length != 0) {
                boolean z10 = false;
                if (length != 1) {
                    Set setD = kotlin.collections.c1.d();
                    for (String str : tables) {
                        for (String str2 : this.tableNames) {
                            if (kotlin.text.u.L1(str2, str, true)) {
                                setD.add(str2);
                            }
                        }
                    }
                    setK = kotlin.collections.c1.a(setD);
                } else {
                    for (String str3 : tables) {
                        if (kotlin.text.u.L1(str3, this.tableNames[0], true)) {
                            z10 = true;
                            break;
                        }
                    }
                    setK = z10 ? this.singleTableSet : kotlin.collections.d1.k();
                }
            } else {
                setK = kotlin.collections.d1.k();
            }
            if (!setK.isEmpty()) {
                this.observer.c(setK);
            }
        }
    }

    /* JADX INFO: compiled from: InvalidationTracker.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Landroidx/room/f0$e;", "Landroidx/room/f0$c;", "", "", "tables", "Lkotlin/b2;", ak.aF, "Landroidx/room/f0;", "b", "Landroidx/room/f0;", "e", "()Landroidx/room/f0;", "tracker", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "d", "()Ljava/lang/ref/WeakReference;", "delegateRef", "delegate", "<init>", "(Landroidx/room/f0;Landroidx/room/f0$c;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class e extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final f0 tracker;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final WeakReference<c> delegateRef;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@dl.d f0 tracker, @dl.d c delegate) {
            super(delegate.getTables());
            kotlin.jvm.internal.f0.p(tracker, "tracker");
            kotlin.jvm.internal.f0.p(delegate, "delegate");
            this.tracker = tracker;
            this.delegateRef = new WeakReference<>(delegate);
        }

        @Override // androidx.room.f0.c
        public void c(@dl.d Set<String> tables) {
            kotlin.jvm.internal.f0.p(tables, "tables");
            c cVar = this.delegateRef.get();
            if (cVar == null) {
                this.tracker.s(this);
            } else {
                cVar.c(tables);
            }
        }

        @dl.d
        public final WeakReference<c> d() {
            return this.delegateRef;
        }

        @dl.d
        /* JADX INFO: renamed from: e, reason: from getter */
        public final f0 getTracker() {
            return this.tracker;
        }
    }

    /* JADX INFO: compiled from: InvalidationTracker.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"androidx/room/f0$f", "Ljava/lang/Runnable;", "", "", ak.av, "Lkotlin/b2;", "run", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class f implements Runnable {
        f() {
        }

        private final Set<Integer> a() {
            f0 f0Var = f0.this;
            Set setD = kotlin.collections.c1.d();
            Cursor cursorK = RoomDatabase.K(f0Var.getDatabase(), new j3.b(f0.f27145x), null, 2, null);
            while (cursorK.moveToNext()) {
                try {
                    setD.add(Integer.valueOf(cursorK.getInt(0)));
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.io.b.a(cursorK, th2);
                        throw th3;
                    }
                }
            }
            kotlin.b2 b2Var = kotlin.b2.f124493a;
            kotlin.io.b.a(cursorK, null);
            Set<Integer> setA = kotlin.collections.c1.a(setD);
            if (!setA.isEmpty()) {
                if (f0.this.getF27154i() == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                j3.l f27154i = f0.this.getF27154i();
                if (f27154i == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                f27154i.y();
            }
            return setA;
        }

        @Override // java.lang.Runnable
        public void run() {
            Set<Integer> setK;
            androidx.room.c cVar;
            Lock lockO = f0.this.getDatabase().o();
            lockO.lock();
            try {
                try {
                    if (!f0.this.f()) {
                        lockO.unlock();
                        androidx.room.c cVar2 = f0.this.autoCloser;
                        if (cVar2 != null) {
                            cVar2.e();
                            return;
                        }
                        return;
                    }
                    if (!f0.this.getPendingRefresh().compareAndSet(true, false)) {
                        lockO.unlock();
                        androidx.room.c cVar3 = f0.this.autoCloser;
                        if (cVar3 != null) {
                            cVar3.e();
                            return;
                        }
                        return;
                    }
                    if (f0.this.getDatabase().z()) {
                        lockO.unlock();
                        androidx.room.c cVar4 = f0.this.autoCloser;
                        if (cVar4 != null) {
                            cVar4.e();
                            return;
                        }
                        return;
                    }
                    j3.g writableDatabase = f0.this.getDatabase().s().getWritableDatabase();
                    writableDatabase.D();
                    try {
                        setK = a();
                        writableDatabase.O0();
                        writableDatabase.U0();
                        lockO.unlock();
                        cVar = f0.this.autoCloser;
                        if (cVar != null) {
                            cVar.e();
                        }
                        if (!setK.isEmpty()) {
                            androidx.arch.core.internal.b<c, d> bVarI = f0.this.i();
                            f0 f0Var = f0.this;
                            synchronized (bVarI) {
                                Iterator<Map.Entry<K, V>> it = f0Var.i().iterator();
                                while (it.hasNext()) {
                                    ((d) ((Map.Entry) it.next()).getValue()).c(setK);
                                }
                                kotlin.b2 b2Var = kotlin.b2.f124493a;
                            }
                        }
                    } catch (Throwable th2) {
                        writableDatabase.U0();
                        throw th2;
                    }
                } catch (SQLiteException e10) {
                    Log.e(t1.f27263b, "Cannot run invalidation tracker. Is the db closed?", e10);
                    setK = kotlin.collections.d1.k();
                    lockO.unlock();
                    cVar = f0.this.autoCloser;
                    if (cVar != null) {
                    }
                } catch (IllegalStateException e11) {
                    Log.e(t1.f27263b, "Cannot run invalidation tracker. Is the db closed?", e11);
                    setK = kotlin.collections.d1.k();
                    lockO.unlock();
                    cVar = f0.this.autoCloser;
                    if (cVar != null) {
                    }
                }
            } catch (Throwable th3) {
                lockO.unlock();
                androidx.room.c cVar5 = f0.this.autoCloser;
                if (cVar5 != null) {
                    cVar5.e();
                }
                throw th3;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public f0(@dl.d RoomDatabase database, @dl.d Map<String, String> shadowTablesMap, @dl.d Map<String, Set<String>> viewTables, @dl.d String... tableNames) {
        String lowerCase;
        kotlin.jvm.internal.f0.p(database, "database");
        kotlin.jvm.internal.f0.p(shadowTablesMap, "shadowTablesMap");
        kotlin.jvm.internal.f0.p(viewTables, "viewTables");
        kotlin.jvm.internal.f0.p(tableNames, "tableNames");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.pendingRefresh = new AtomicBoolean(false);
        this.observedTableTracker = new b(tableNames.length);
        this.invalidationLiveDataContainer = new d0(database);
        this.observerMap = new androidx.arch.core.internal.b<>();
        this.syncTriggersLock = new Object();
        this.trackerLock = new Object();
        this.tableIdLookup = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = tableNames[i10];
            Locale US = Locale.US;
            kotlin.jvm.internal.f0.o(US, "US");
            String lowerCase2 = str.toLowerCase(US);
            kotlin.jvm.internal.f0.o(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.tableIdLookup.put(lowerCase2, Integer.valueOf(i10));
            String str2 = this.shadowTablesMap.get(tableNames[i10]);
            if (str2 != null) {
                kotlin.jvm.internal.f0.o(US, "US");
                lowerCase = str2.toLowerCase(US);
                kotlin.jvm.internal.f0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr[i10] = lowerCase2;
        }
        this.tablesNames = strArr;
        for (Map.Entry<String, String> entry : this.shadowTablesMap.entrySet()) {
            String value = entry.getValue();
            Locale US2 = Locale.US;
            kotlin.jvm.internal.f0.o(US2, "US");
            String lowerCase3 = value.toLowerCase(US2);
            kotlin.jvm.internal.f0.o(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.tableIdLookup.containsKey(lowerCase3)) {
                String key = entry.getKey();
                kotlin.jvm.internal.f0.o(US2, "US");
                String lowerCase4 = key.toLowerCase(US2);
                kotlin.jvm.internal.f0.o(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                Map<String, Integer> map = this.tableIdLookup;
                map.put(lowerCase4, (Integer) kotlin.collections.s0.K(map, lowerCase3));
            }
        }
        this.refreshRunnable = new f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public f0(@dl.d RoomDatabase database, @dl.d String... tableNames) {
        this(database, kotlin.collections.s0.z(), kotlin.collections.s0.z(), (String[]) Arrays.copyOf(tableNames, tableNames.length));
        kotlin.jvm.internal.f0.p(database, "database");
        kotlin.jvm.internal.f0.p(tableNames, "tableNames");
    }

    private final String[] C(String[] tableNames) {
        String[] strArrT = t(tableNames);
        for (String str : strArrT) {
            Map<String, Integer> map = this.tableIdLookup;
            Locale US = Locale.US;
            kotlin.jvm.internal.f0.o(US, "US");
            String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.f0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!map.containsKey(lowerCase)) {
                throw new IllegalArgumentException(("There is no table with name " + str).toString());
            }
        }
        return strArrT;
    }

    @androidx.annotation.j1
    public static /* synthetic */ void k() {
    }

    private final String[] t(String[] names) {
        Set setD = kotlin.collections.c1.d();
        for (String str : names) {
            Map<String, Set<String>> map = this.viewTables;
            Locale US = Locale.US;
            kotlin.jvm.internal.f0.o(US, "US");
            String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.f0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.viewTables;
                kotlin.jvm.internal.f0.o(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                kotlin.jvm.internal.f0.o(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                kotlin.jvm.internal.f0.m(set);
                setD.addAll(set);
            } else {
                setD.add(str);
            }
        }
        Object[] array = kotlin.collections.c1.a(setD).toArray(new String[0]);
        kotlin.jvm.internal.f0.n(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    private final void x(j3.g gVar, int i10) {
        gVar.y0("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.tablesNames[i10];
        for (String str2 : f27139r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + INSTANCE.d(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE " + f27140s + " SET " + f27142u + " = 1 WHERE " + f27141t + " = " + i10 + " AND " + f27142u + " = 0; END";
            kotlin.jvm.internal.f0.o(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.y0(str3);
        }
    }

    private final void z(j3.g gVar, int i10) {
        String str = this.tablesNames[i10];
        for (String str2 : f27139r) {
            String str3 = "DROP TRIGGER IF EXISTS " + INSTANCE.d(str, str2);
            kotlin.jvm.internal.f0.o(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.y0(str3);
        }
    }

    public final void A() {
        if (this.database.F()) {
            B(this.database.s().getWritableDatabase());
        }
    }

    public final void B(@dl.d j3.g database) {
        kotlin.jvm.internal.f0.p(database, "database");
        if (database.I1()) {
            return;
        }
        try {
            Lock lockO = this.database.o();
            lockO.lock();
            try {
                synchronized (this.syncTriggersLock) {
                    int[] iArrC = this.observedTableTracker.c();
                    if (iArrC == null) {
                        lockO.unlock();
                        return;
                    }
                    INSTANCE.a(database);
                    try {
                        int length = iArrC.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length) {
                            int i12 = iArrC[i10];
                            int i13 = i11 + 1;
                            if (i12 == 1) {
                                x(database, i11);
                            } else if (i12 == 2) {
                                z(database, i11);
                            }
                            i10++;
                            i11 = i13;
                        }
                        database.O0();
                        database.U0();
                        kotlin.b2 b2Var = kotlin.b2.f124493a;
                        lockO.unlock();
                    } catch (Throwable th2) {
                        database.U0();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                lockO.unlock();
                throw th3;
            }
        } catch (SQLiteException e10) {
            Log.e(t1.f27263b, "Cannot run invalidation tracker. Is the db closed?", e10);
        } catch (IllegalStateException e11) {
            Log.e(t1.f27263b, "Cannot run invalidation tracker. Is the db closed?", e11);
        }
    }

    @androidx.annotation.k1
    @SuppressLint({"RestrictedApi"})
    public void b(@dl.d c observer) {
        d dVarI;
        kotlin.jvm.internal.f0.p(observer, "observer");
        String[] strArrT = t(observer.getTables());
        ArrayList arrayList = new ArrayList(strArrT.length);
        for (String str : strArrT) {
            Map<String, Integer> map = this.tableIdLookup;
            Locale US = Locale.US;
            kotlin.jvm.internal.f0.o(US, "US");
            String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.f0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(Integer.valueOf(num.intValue()));
        }
        int[] iArrP5 = CollectionsKt___CollectionsKt.P5(arrayList);
        d dVar = new d(observer, iArrP5, strArrT);
        synchronized (this.observerMap) {
            dVarI = this.observerMap.i(observer, dVar);
        }
        if (dVarI == null && this.observedTableTracker.d(Arrays.copyOf(iArrP5, iArrP5.length))) {
            A();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void c(@dl.d c observer) {
        kotlin.jvm.internal.f0.p(observer, "observer");
        b(new e(this, observer));
    }

    @dl.d
    @kotlin.k(message = "Use [createLiveData(String[], boolean, Callable)]")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public <T> LiveData<T> d(@dl.d String[] tableNames, @dl.d Callable<T> computeFunction) {
        kotlin.jvm.internal.f0.p(tableNames, "tableNames");
        kotlin.jvm.internal.f0.p(computeFunction, "computeFunction");
        return e(tableNames, false, computeFunction);
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public <T> LiveData<T> e(@dl.d String[] tableNames, boolean inTransaction, @dl.d Callable<T> computeFunction) {
        kotlin.jvm.internal.f0.p(tableNames, "tableNames");
        kotlin.jvm.internal.f0.p(computeFunction, "computeFunction");
        return this.invalidationLiveDataContainer.a(C(tableNames), inTransaction, computeFunction);
    }

    public final boolean f() {
        if (!this.database.F()) {
            return false;
        }
        if (!this.initialized) {
            this.database.s().getWritableDatabase();
        }
        if (this.initialized) {
            return true;
        }
        Log.e(t1.f27263b, "database is not initialized even though it is open");
        return false;
    }

    @dl.e
    /* JADX INFO: renamed from: g, reason: from getter */
    public final j3.l getF27154i() {
        return this.f27154i;
    }

    @dl.d
    /* JADX INFO: renamed from: h, reason: from getter */
    public final RoomDatabase getDatabase() {
        return this.database;
    }

    @dl.d
    public final androidx.arch.core.internal.b<c, d> i() {
        return this.observerMap;
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: j, reason: from getter */
    public final AtomicBoolean getPendingRefresh() {
        return this.pendingRefresh;
    }

    @dl.d
    public final Map<String, Integer> l() {
        return this.tableIdLookup;
    }

    @dl.d
    /* JADX INFO: renamed from: m, reason: from getter */
    public final String[] getTablesNames() {
        return this.tablesNames;
    }

    public final void n(@dl.d j3.g database) {
        kotlin.jvm.internal.f0.p(database, "database");
        synchronized (this.trackerLock) {
            if (this.initialized) {
                Log.e(t1.f27263b, "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.y0("PRAGMA temp_store = MEMORY;");
            database.y0("PRAGMA recursive_triggers='ON';");
            database.y0(f27143v);
            B(database);
            this.f27154i = database.s1(f27144w);
            this.initialized = true;
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
    }

    @androidx.annotation.j1(otherwise = 3)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void o(@dl.d String... tables) {
        kotlin.jvm.internal.f0.p(tables, "tables");
        synchronized (this.observerMap) {
            Iterator<Map.Entry<K, V>> it = this.observerMap.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                kotlin.jvm.internal.f0.o(entry, "(observer, wrapper)");
                c cVar = (c) entry.getKey();
                d dVar = (d) entry.getValue();
                if (!cVar.b()) {
                    dVar.d(tables);
                }
            }
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
    }

    public final void p() {
        synchronized (this.trackerLock) {
            this.initialized = false;
            this.observedTableTracker.f();
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
    }

    public void q() {
        if (this.pendingRefresh.compareAndSet(false, true)) {
            androidx.room.c cVar = this.autoCloser;
            if (cVar != null) {
                cVar.n();
            }
            this.database.t().execute(this.refreshRunnable);
        }
    }

    @androidx.annotation.k1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void r() {
        androidx.room.c cVar = this.autoCloser;
        if (cVar != null) {
            cVar.n();
        }
        A();
        this.refreshRunnable.run();
    }

    @androidx.annotation.k1
    @SuppressLint({"RestrictedApi"})
    public void s(@dl.d c observer) {
        d dVarJ;
        kotlin.jvm.internal.f0.p(observer, "observer");
        synchronized (this.observerMap) {
            dVarJ = this.observerMap.j(observer);
        }
        if (dVarJ != null) {
            b bVar = this.observedTableTracker;
            int[] tableIds = dVarJ.getTableIds();
            if (bVar.e(Arrays.copyOf(tableIds, tableIds.length))) {
                A();
            }
        }
    }

    public final void u(@dl.d androidx.room.c autoCloser) {
        kotlin.jvm.internal.f0.p(autoCloser, "autoCloser");
        this.autoCloser = autoCloser;
        autoCloser.q(new Runnable() { // from class: androidx.room.e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f27106b.p();
            }
        });
    }

    public final void v(@dl.e j3.l lVar) {
        this.f27154i = lVar;
    }

    public final void w(@dl.d Context context, @dl.d String name, @dl.d Intent serviceIntent) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(name, "name");
        kotlin.jvm.internal.f0.p(serviceIntent, "serviceIntent");
        this.multiInstanceInvalidationClient = new k0(context, name, serviceIntent, this, this.database.t());
    }

    public final void y() {
        k0 k0Var = this.multiInstanceInvalidationClient;
        if (k0Var != null) {
            k0Var.s();
        }
        this.multiInstanceInvalidationClient = null;
    }
}
