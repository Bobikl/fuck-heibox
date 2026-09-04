package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.RestrictTo;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: RoomDatabase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b&\u0018\u0000 \r2\u00020\u0001:\u0007wD$x%4\"B\u0007¢\u0006\u0004\bv\u0010RJ-\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0017J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u001a\u0010\u0017\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0003\u0012\u0004\u0012\u00020\u00160\u0015H\u0017J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0012H$J\b\u0010\u001e\u001a\u00020\u001dH$J\"\u0010\u001f\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00180\u0015H\u0015J\u0016\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u00030 H\u0017J\b\u0010\"\u001a\u00020\tH'J\b\u0010#\u001a\u00020\tH\u0016J\b\u0010$\u001a\u00020\tH\u0017J\b\u0010%\u001a\u00020\tH\u0017J+\u0010+\u001a\u00020*2\u0006\u0010'\u001a\u00020&2\u0012\u0010)\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010(H\u0016¢\u0006\u0004\b+\u0010,J\u001c\u00100\u001a\u00020*2\u0006\u0010'\u001a\u00020-2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.H\u0017J\u0010\u00103\u001a\u0002022\u0006\u00101\u001a\u00020&H\u0016J\b\u00104\u001a\u00020\tH\u0017J\b\u00105\u001a\u00020\tH\u0017J\b\u00106\u001a\u00020\tH\u0017J\u0010\u00109\u001a\u00020\t2\u0006\u00108\u001a\u000207H\u0016J#\u0010<\u001a\u00028\u0000\"\u0004\b\u0000\u0010:2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000;H\u0016¢\u0006\u0004\b<\u0010=J\u0010\u0010@\u001a\u00020\t2\u0006\u0010?\u001a\u00020>H\u0014J\b\u0010B\u001a\u00020AH\u0016R\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010ER\u001a\u0010K\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010H\u001a\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010LR\u0016\u0010N\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010LR$\u0010S\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010\u00188\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\b3\u0010P\u0012\u0004\bQ\u0010RR6\u0010\u0017\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0003\u0012\u0004\u0012\u00020\u00160T8\u0004@\u0004X\u0085\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010^R\u001d\u0010e\u001a\b\u0012\u0004\u0012\u00020a0`8G¢\u0006\f\n\u0004\bV\u0010b\u001a\u0004\bc\u0010dR#\u0010g\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00010T8G¢\u0006\f\n\u0004\b\u001a\u0010U\u001a\u0004\bf\u0010WR$\u0010h\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010UR\u0014\u0010k\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010m\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010jR\u0014\u0010\u0006\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u001a\u0010s\u001a\u00020A8VX\u0096\u0004¢\u0006\f\u0012\u0004\br\u0010R\u001a\u0004\bp\u0010qR\u0014\u0010u\u001a\u00020A8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bt\u0010q¨\u0006y"}, d2 = {"Landroidx/room/RoomDatabase;", "", androidx.exifinterface.media.a.f23244d5, "Ljava/lang/Class;", "clazz", "Lj3/h;", "openHelper", "P", "(Ljava/lang/Class;Lj3/h;)Ljava/lang/Object;", "Lkotlin/b2;", "B", "C", "Ljava/util/concurrent/locks/Lock;", "o", "()Ljava/util/concurrent/locks/Lock;", "klass", "y", "(Ljava/lang/Class;)Ljava/lang/Object;", "Landroidx/room/j;", "configuration", androidx.exifinterface.media.a.W4, "", "Lf3/b;", "autoMigrationSpecs", "", "Lf3/c;", "m", "config", "j", "Landroidx/room/f0;", "i", "v", "", ak.aG, "f", "g", ak.aF, "d", "", "query", "", "args", "Landroid/database/Cursor;", "J", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Lj3/j;", "Landroid/os/CancellationSignal;", "signal", "I", com.tekartik.sqflite.b.f98602u, "Lj3/l;", RXScreenCaptureService.KEY_HEIGHT, "e", "k", "O", "Ljava/lang/Runnable;", "body", "M", androidx.exifinterface.media.a.X4, "Ljava/util/concurrent/Callable;", "L", "(Ljava/util/concurrent/Callable;)Ljava/lang/Object;", "Lj3/g;", "db", "D", "", ak.aD, "Ljava/util/concurrent/Executor;", "b", "Ljava/util/concurrent/Executor;", "internalQueryExecutor", "internalTransactionExecutor", "Landroidx/room/f0;", "p", "()Landroidx/room/f0;", "invalidationTracker", "Z", "allowMainThreadQueries", "writeAheadLoggingEnabled", "Landroidx/room/RoomDatabase$b;", "Ljava/util/List;", "getMCallbacks$annotations", "()V", "mCallbacks", "", "Ljava/util/Map;", "l", "()Ljava/util/Map;", "N", "(Ljava/util/Map;)V", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "readWriteLock", "Landroidx/room/c;", "Landroidx/room/c;", "autoCloser", "Ljava/lang/ThreadLocal;", "", "Ljava/lang/ThreadLocal;", RXScreenCaptureService.KEY_WIDTH, "()Ljava/lang/ThreadLocal;", "suspendingTransactionId", "n", "backingFieldMap", "typeConverters", "t", "()Ljava/util/concurrent/Executor;", "queryExecutor", "x", "transactionExecutor", ak.aB, "()Lj3/h;", "F", "()Z", "isOpen$annotations", "isOpen", androidx.exifinterface.media.a.S4, "isMainThread", "<init>", ak.av, "JournalMode", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
public abstract class RoomDatabase {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int f26957p = 999;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    @xh.e
    protected volatile j3.g f26958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Executor internalQueryExecutor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Executor internalTransactionExecutor;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j3.h f26961d;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean allowMainThreadQueries;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean writeAheadLoggingEnabled;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.e
    @xh.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected List<? extends b> mCallbacks;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private c autoCloser;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<String, Object> backingFieldMap;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<Class<?>, Object> typeConverters;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f0 invalidationTracker = i();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private Map<Class<? extends f3.b>, f3.b> autoMigrationSpecs = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    /* JADX INFO: compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Landroidx/room/RoomDatabase$JournalMode;", "", "(Ljava/lang/String;I)V", "isLowRamDevice", "", "activityManager", "Landroid/app/ActivityManager;", "resolve", com.umeng.analytics.pro.d.R, "Landroid/content/Context;", "resolve$room_runtime_release", "AUTOMATIC", "TRUNCATE", "WRITE_AHEAD_LOGGING", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean isLowRamDevice(ActivityManager activityManager) {
            return j3.c.b.b(activityManager);
        }

        @dl.d
        public final JournalMode resolve$room_runtime_release(@dl.d Context context) {
            kotlin.jvm.internal.f0.p(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
            kotlin.jvm.internal.f0.n(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            return !isLowRamDevice((ActivityManager) systemService) ? WRITE_AHEAD_LOGGING : TRUNCATE;
        }
    }

    /* JADX INFO: compiled from: RoomDatabase.kt */
    @Metadata(bv = {}, d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\r\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\b\u0000\u0012\u0006\u0010@\u001a\u00020>\u0012\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000A\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bj\u0010kJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0017J$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J)\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016\"\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010#\u001a\u00020\"H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010#\u001a\u00020\"H\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010(\u001a\u00020'H\u0017J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010.\u001a\u00020,\"\u00020-H\u0016J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\b\u001a\u000200H\u0016J\u001e\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00103\u001a\u0002022\u0006\u0010#\u001a\u00020\"H\u0016J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00105\u001a\u00020\u0003H\u0016J \u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0001\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0017J\u000f\u0010<\u001a\u00028\u0000H\u0016¢\u0006\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010?R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010BR\u0016\u0010E\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010DR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u0002000F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010GR\u0018\u0010J\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010IR\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010LR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00030F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010GR\u001c\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001b0F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010GR\u0018\u0010P\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010LR\u0018\u0010Q\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010LR\u0016\u0010T\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010SR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010VR\u0016\u0010X\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010SR\u0016\u0010Y\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010SR\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010ZR\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010[R\u0014\u0010^\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010]R\u001c\u0010a\u001a\b\u0012\u0004\u0012\u00020-0_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010`R\u001e\u0010b\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010`R\u0018\u0010c\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010DR\u0018\u0010f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u001e\u0010i\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010h¨\u0006l"}, d2 = {"Landroidx/room/RoomDatabase$a;", "Landroidx/room/RoomDatabase;", androidx.exifinterface.media.a.f23244d5, "", "", "databaseFilePath", "g", "Landroidx/room/RoomDatabase$e;", "callback", RXScreenCaptureService.KEY_HEIGHT, "Ljava/io/File;", "databaseFile", "i", "j", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "inputStreamCallable", "k", "l", "Lj3/h$c;", "factory", "q", "", "Lf3/c;", "migrations", ak.aF, "([Lf3/c;)Landroidx/room/RoomDatabase$a;", "Lf3/b;", "autoMigrationSpec", ak.av, "e", "Landroidx/room/RoomDatabase$JournalMode;", "journalMode", ak.aB, "Ljava/util/concurrent/Executor;", "executor", "v", RXScreenCaptureService.KEY_WIDTH, "m", "Landroid/content/Intent;", "invalidationServiceIntent", "t", "n", "p", "", "", "startVersions", "o", "Landroidx/room/RoomDatabase$b;", "b", "Landroidx/room/RoomDatabase$f;", "queryCallback", ak.aG, "typeConverter", "d", "", "autoCloseTimeout", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "r", "f", "()Landroidx/room/RoomDatabase;", "Landroid/content/Context;", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Ljava/lang/Class;", "Ljava/lang/Class;", "klass", "Ljava/lang/String;", "name", "", "Ljava/util/List;", "callbacks", "Landroidx/room/RoomDatabase$e;", "prepackagedDatabaseCallback", "Landroidx/room/RoomDatabase$f;", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "typeConverters", "autoMigrationSpecs", "queryExecutor", "transactionExecutor", "", "Z", "allowMainThreadQueries", "Landroidx/room/RoomDatabase$JournalMode;", "Landroid/content/Intent;", "multiInstanceInvalidationIntent", "requireMigration", "allowDestructiveMigrationOnDowngrade", "J", "Ljava/util/concurrent/TimeUnit;", "Landroidx/room/RoomDatabase$d;", "Landroidx/room/RoomDatabase$d;", "migrationContainer", "", "Ljava/util/Set;", "migrationsNotRequiredFrom", "migrationStartAndEndVersions", "copyFromAssetPath", "x", "Ljava/io/File;", "copyFromFile", "y", "Ljava/util/concurrent/Callable;", "copyFromInputStream", "<init>", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static class a<T extends RoomDatabase> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Context context;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Class<T> klass;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private final String name;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final List<b> callbacks;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private e prepackagedDatabaseCallback;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private f queryCallback;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private Executor queryCallbackExecutor;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final List<Object> typeConverters;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private List<f3.b> autoMigrationSpecs;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private Executor queryExecutor;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private Executor transactionExecutor;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @dl.e
        private j3.h.c f26983l;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private boolean allowMainThreadQueries;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private JournalMode journalMode;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private Intent multiInstanceInvalidationIntent;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private boolean requireMigration;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private boolean allowDestructiveMigrationOnDowngrade;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private long autoCloseTimeout;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private TimeUnit autoCloseTimeUnit;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final d migrationContainer;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private Set<Integer> migrationsNotRequiredFrom;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private Set<Integer> migrationStartAndEndVersions;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private String copyFromAssetPath;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private File copyFromFile;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private Callable<InputStream> copyFromInputStream;

        public a(@dl.d Context context, @dl.d Class<T> klass, @dl.e String str) {
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(klass, "klass");
            this.context = context;
            this.klass = klass;
            this.name = str;
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.autoMigrationSpecs = new ArrayList();
            this.journalMode = JournalMode.AUTOMATIC;
            this.requireMigration = true;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new d();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
        }

        @dl.d
        public a<T> a(@dl.d f3.b autoMigrationSpec) {
            kotlin.jvm.internal.f0.p(autoMigrationSpec, "autoMigrationSpec");
            this.autoMigrationSpecs.add(autoMigrationSpec);
            return this;
        }

        @dl.d
        public a<T> b(@dl.d b callback) {
            kotlin.jvm.internal.f0.p(callback, "callback");
            this.callbacks.add(callback);
            return this;
        }

        @dl.d
        public a<T> c(@dl.d f3.c... migrations) {
            kotlin.jvm.internal.f0.p(migrations, "migrations");
            if (this.migrationStartAndEndVersions == null) {
                this.migrationStartAndEndVersions = new HashSet();
            }
            for (f3.c cVar : migrations) {
                Set<Integer> set = this.migrationStartAndEndVersions;
                kotlin.jvm.internal.f0.m(set);
                set.add(Integer.valueOf(cVar.f118738a));
                Set<Integer> set2 = this.migrationStartAndEndVersions;
                kotlin.jvm.internal.f0.m(set2);
                set2.add(Integer.valueOf(cVar.f118739b));
            }
            this.migrationContainer.c((f3.c[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        @dl.d
        public a<T> d(@dl.d Object typeConverter) {
            kotlin.jvm.internal.f0.p(typeConverter, "typeConverter");
            this.typeConverters.add(typeConverter);
            return this;
        }

        @dl.d
        public a<T> e() {
            this.allowMainThreadQueries = true;
            return this;
        }

        @dl.d
        public T f() {
            j3.h.c f1Var;
            Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                Executor executorG = androidx.arch.core.executor.c.g();
                this.transactionExecutor = executorG;
                this.queryExecutor = executorG;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            Set<Integer> set = this.migrationStartAndEndVersions;
            if (set != null) {
                kotlin.jvm.internal.f0.m(set);
                Iterator<Integer> it = set.iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    if (!(!this.migrationsNotRequiredFrom.contains(Integer.valueOf(iIntValue)))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + iIntValue).toString());
                    }
                }
            }
            j3.h.c d2Var = this.f26983l;
            if (d2Var == null) {
                d2Var = new androidx.sqlite.db.framework.e();
            }
            if (d2Var != null) {
                if (this.autoCloseTimeout > 0) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
                    }
                    long j10 = this.autoCloseTimeout;
                    TimeUnit timeUnit = this.autoCloseTimeUnit;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    Executor executor2 = this.queryExecutor;
                    if (executor2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    d2Var = new androidx.room.d(d2Var, new c(j10, timeUnit, executor2));
                }
                String str = this.copyFromAssetPath;
                if (str != null || this.copyFromFile != null || this.copyFromInputStream != null) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.".toString());
                    }
                    int i10 = str == null ? 0 : 1;
                    File file = this.copyFromFile;
                    int i11 = file == null ? 0 : 1;
                    Callable<InputStream> callable = this.copyFromInputStream;
                    if (!((i10 + i11) + (callable == null ? 0 : 1) == 1)) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.".toString());
                    }
                    d2Var = new d2(str, file, callable, d2Var);
                }
            } else {
                d2Var = null;
            }
            if (d2Var == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            f fVar = this.queryCallback;
            if (fVar != null) {
                Executor executor3 = this.queryCallbackExecutor;
                if (executor3 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                if (fVar == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                f1Var = new f1(d2Var, executor3, fVar);
            } else {
                f1Var = d2Var;
            }
            Context context = this.context;
            String str2 = this.name;
            d dVar = this.migrationContainer;
            List<b> list = this.callbacks;
            boolean z10 = this.allowMainThreadQueries;
            JournalMode journalModeResolve$room_runtime_release = this.journalMode.resolve$room_runtime_release(context);
            Executor executor4 = this.queryExecutor;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Executor executor5 = this.transactionExecutor;
            if (executor5 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            j jVar = new j(context, str2, f1Var, dVar, list, z10, journalModeResolve$room_runtime_release, executor4, executor5, this.multiInstanceInvalidationIntent, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, this.migrationsNotRequiredFrom, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, this.prepackagedDatabaseCallback, (List<? extends Object>) this.typeConverters, this.autoMigrationSpecs);
            T t10 = (T) t1.b(this.klass, "_Impl");
            t10.A(jVar);
            return t10;
        }

        @dl.d
        public a<T> g(@dl.d String databaseFilePath) {
            kotlin.jvm.internal.f0.p(databaseFilePath, "databaseFilePath");
            this.copyFromAssetPath = databaseFilePath;
            return this;
        }

        @dl.d
        @SuppressLint({"BuilderSetStyle"})
        public a<T> h(@dl.d String databaseFilePath, @dl.d e callback) {
            kotlin.jvm.internal.f0.p(databaseFilePath, "databaseFilePath");
            kotlin.jvm.internal.f0.p(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromAssetPath = databaseFilePath;
            return this;
        }

        @dl.d
        public a<T> i(@dl.d File databaseFile) {
            kotlin.jvm.internal.f0.p(databaseFile, "databaseFile");
            this.copyFromFile = databaseFile;
            return this;
        }

        @dl.d
        @SuppressLint({"BuilderSetStyle", "StreamFiles"})
        public a<T> j(@dl.d File databaseFile, @dl.d e callback) {
            kotlin.jvm.internal.f0.p(databaseFile, "databaseFile");
            kotlin.jvm.internal.f0.p(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromFile = databaseFile;
            return this;
        }

        @dl.d
        @SuppressLint({"BuilderSetStyle"})
        public a<T> k(@dl.d Callable<InputStream> inputStreamCallable) {
            kotlin.jvm.internal.f0.p(inputStreamCallable, "inputStreamCallable");
            this.copyFromInputStream = inputStreamCallable;
            return this;
        }

        @dl.d
        @SuppressLint({"BuilderSetStyle", "LambdaLast"})
        public a<T> l(@dl.d Callable<InputStream> inputStreamCallable, @dl.d e callback) {
            kotlin.jvm.internal.f0.p(inputStreamCallable, "inputStreamCallable");
            kotlin.jvm.internal.f0.p(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromInputStream = inputStreamCallable;
            return this;
        }

        @dl.d
        public a<T> m() {
            this.multiInstanceInvalidationIntent = this.name != null ? new Intent(this.context, (Class<?>) MultiInstanceInvalidationService.class) : null;
            return this;
        }

        @dl.d
        public a<T> n() {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        @dl.d
        public a<T> o(@dl.d int... startVersions) {
            kotlin.jvm.internal.f0.p(startVersions, "startVersions");
            for (int i10 : startVersions) {
                this.migrationsNotRequiredFrom.add(Integer.valueOf(i10));
            }
            return this;
        }

        @dl.d
        public a<T> p() {
            this.requireMigration = true;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        @dl.d
        public a<T> q(@dl.e j3.h.c factory) {
            this.f26983l = factory;
            return this;
        }

        @dl.d
        @v
        public a<T> r(@androidx.annotation.f0(from = 0) long autoCloseTimeout, @dl.d TimeUnit autoCloseTimeUnit) {
            kotlin.jvm.internal.f0.p(autoCloseTimeUnit, "autoCloseTimeUnit");
            if (!(autoCloseTimeout >= 0)) {
                throw new IllegalArgumentException("autoCloseTimeout must be >= 0".toString());
            }
            this.autoCloseTimeout = autoCloseTimeout;
            this.autoCloseTimeUnit = autoCloseTimeUnit;
            return this;
        }

        @dl.d
        public a<T> s(@dl.d JournalMode journalMode) {
            kotlin.jvm.internal.f0.p(journalMode, "journalMode");
            this.journalMode = journalMode;
            return this;
        }

        @dl.d
        @v
        public a<T> t(@dl.d Intent invalidationServiceIntent) {
            kotlin.jvm.internal.f0.p(invalidationServiceIntent, "invalidationServiceIntent");
            if (this.name == null) {
                invalidationServiceIntent = null;
            }
            this.multiInstanceInvalidationIntent = invalidationServiceIntent;
            return this;
        }

        @dl.d
        public a<T> u(@dl.d f queryCallback, @dl.d Executor executor) {
            kotlin.jvm.internal.f0.p(queryCallback, "queryCallback");
            kotlin.jvm.internal.f0.p(executor, "executor");
            this.queryCallback = queryCallback;
            this.queryCallbackExecutor = executor;
            return this;
        }

        @dl.d
        public a<T> v(@dl.d Executor executor) {
            kotlin.jvm.internal.f0.p(executor, "executor");
            this.queryExecutor = executor;
            return this;
        }

        @dl.d
        public a<T> w(@dl.d Executor executor) {
            kotlin.jvm.internal.f0.p(executor, "executor");
            this.transactionExecutor = executor;
            return this;
        }
    }

    /* JADX INFO: compiled from: RoomDatabase.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Landroidx/room/RoomDatabase$b;", "", "Lj3/g;", "db", "Lkotlin/b2;", ak.av, ak.aF, "b", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class b {
        public void a(@dl.d j3.g db2) {
            kotlin.jvm.internal.f0.p(db2, "db");
        }

        public void b(@dl.d j3.g db2) {
            kotlin.jvm.internal.f0.p(db2, "db");
        }

        public void c(@dl.d j3.g db2) {
            kotlin.jvm.internal.f0.p(db2, "db");
        }
    }

    /* JADX INFO: compiled from: RoomDatabase.kt */
    @Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J6\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J#\u0010\u0011\u001a\u00020\u00042\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000f\"\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016J \u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\u00140\u0014H\u0016J \u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0016\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nR,\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006\u001f"}, d2 = {"Landroidx/room/RoomDatabase$d;", "", "Lf3/c;", "migration", "Lkotlin/b2;", ak.av, "", "result", "", "upgrade", "", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "", "f", "", "migrations", ak.aF, "([Lf3/c;)V", "b", "", "g", "e", "startVersion", "endVersion", "d", "", "Ljava/util/TreeMap;", "Ljava/util/Map;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Map<Integer, TreeMap<Integer, f3.c>> migrations = new LinkedHashMap();

        private final void a(f3.c cVar) {
            int i10 = cVar.f118738a;
            int i11 = cVar.f118739b;
            Map<Integer, TreeMap<Integer, f3.c>> map = this.migrations;
            Integer numValueOf = Integer.valueOf(i10);
            TreeMap<Integer, f3.c> treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(numValueOf, treeMap);
            }
            TreeMap<Integer, f3.c> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                Log.w(t1.LOG_TAG, "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + cVar);
            }
            treeMap2.put(Integer.valueOf(i11), cVar);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0056  */
        /* JADX WARN: Code duplicated, block: B:29:0x0058  */
        private final List<f3.c> f(List<f3.c> result, boolean upgrade, int start, int end) {
            boolean z10;
            boolean z11;
            do {
                z10 = true;
                if (!(!upgrade ? start <= end : start >= end)) {
                    return result;
                }
                TreeMap<Integer, f3.c> treeMap = this.migrations.get(Integer.valueOf(start));
                if (treeMap != null) {
                    Iterator<Integer> it = (upgrade ? treeMap.descendingKeySet() : treeMap.keySet()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z10 = false;
                            break;
                        }
                        Integer targetVersion = it.next();
                        if (upgrade) {
                            int i10 = start + 1;
                            kotlin.jvm.internal.f0.o(targetVersion, "targetVersion");
                            int iIntValue = targetVersion.intValue();
                            if (i10 > iIntValue || iIntValue > end) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                        } else {
                            kotlin.jvm.internal.f0.o(targetVersion, "targetVersion");
                            int iIntValue2 = targetVersion.intValue();
                            if (end > iIntValue2 || iIntValue2 >= start) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                        }
                        if (z11) {
                            f3.c cVar = treeMap.get(targetVersion);
                            kotlin.jvm.internal.f0.m(cVar);
                            result.add(cVar);
                            start = targetVersion.intValue();
                            break;
                        }
                    }
                } else {
                    return null;
                }
            } while (z10);
            return null;
        }

        public void b(@dl.d List<? extends f3.c> migrations) {
            kotlin.jvm.internal.f0.p(migrations, "migrations");
            Iterator<T> it = migrations.iterator();
            while (it.hasNext()) {
                a((f3.c) it.next());
            }
        }

        public void c(@dl.d f3.c... migrations) {
            kotlin.jvm.internal.f0.p(migrations, "migrations");
            for (f3.c cVar : migrations) {
                a(cVar);
            }
        }

        public final boolean d(int startVersion, int endVersion) {
            Map<Integer, Map<Integer, f3.c>> mapG = g();
            if (!mapG.containsKey(Integer.valueOf(startVersion))) {
                return false;
            }
            Map<Integer, f3.c> mapZ = mapG.get(Integer.valueOf(startVersion));
            if (mapZ == null) {
                mapZ = kotlin.collections.s0.z();
            }
            return mapZ.containsKey(Integer.valueOf(endVersion));
        }

        @dl.e
        public List<f3.c> e(int start, int end) {
            if (start == end) {
                return CollectionsKt__CollectionsKt.E();
            }
            return f(new ArrayList(), end > start, start, end);
        }

        @dl.d
        public Map<Integer, Map<Integer, f3.c>> g() {
            return this.migrations;
        }
    }

    /* JADX INFO: compiled from: RoomDatabase.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Landroidx/room/RoomDatabase$e;", "", "Lj3/g;", "db", "Lkotlin/b2;", ak.av, "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class e {
        public void a(@dl.d j3.g db2) {
            kotlin.jvm.internal.f0.p(db2, "db");
        }
    }

    /* JADX INFO: compiled from: RoomDatabase.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/room/RoomDatabase$f;", "", "", "sqlQuery", "", "bindArgs", "Lkotlin/b2;", ak.av, "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public interface f {
        void a(@dl.d String str, @dl.d List<? extends Object> list);
    }

    public RoomDatabase() {
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.f0.o(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = mapSynchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        c();
        j3.g writableDatabase = s().getWritableDatabase();
        getInvalidationTracker().B(writableDatabase);
        if (writableDatabase.N1()) {
            writableDatabase.D();
        } else {
            writableDatabase.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        s().getWritableDatabase().U0();
        if (z()) {
            return;
        }
        getInvalidationTracker().q();
    }

    public static /* synthetic */ void G() {
    }

    public static /* synthetic */ Cursor K(RoomDatabase roomDatabase, j3.j jVar, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i10 & 2) != 0) {
            cancellationSignal = null;
        }
        return roomDatabase.I(jVar, cancellationSignal);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T P(Class<T> clazz, j3.h openHelper) {
        if (clazz.isInstance(openHelper)) {
            return openHelper;
        }
        if (openHelper instanceof l) {
            return (T) P(clazz, ((l) openHelper).getF26866b());
        }
        return null;
    }

    @kotlin.k(message = "Will be hidden in a future release.")
    protected static /* synthetic */ void q() {
    }

    @kotlin.k(message = "Will be hidden in the next release.")
    protected static /* synthetic */ void r() {
    }

    @androidx.annotation.i
    public void A(@dl.d j configuration) {
        kotlin.jvm.internal.f0.p(configuration, "configuration");
        this.f26961d = j(configuration);
        Set<Class<? extends f3.b>> setU = u();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends f3.b>> it = setU.iterator();
        while (true) {
            int i10 = -1;
            if (it.hasNext()) {
                Class<? extends f3.b> next = it.next();
                int size = configuration.autoMigrationSpecs.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = size - 1;
                        if (next.isAssignableFrom(configuration.autoMigrationSpecs.get(size).getClass())) {
                            bitSet.set(size);
                            i10 = size;
                            break;
                        } else if (i11 < 0) {
                            break;
                        } else {
                            size = i11;
                        }
                    }
                }
                if (!(i10 >= 0)) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.autoMigrationSpecs.put(next, configuration.autoMigrationSpecs.get(i10));
            } else {
                int size2 = configuration.autoMigrationSpecs.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i12 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                        }
                        if (i12 < 0) {
                            break;
                        } else {
                            size2 = i12;
                        }
                    }
                }
                for (f3.c cVar : m(this.autoMigrationSpecs)) {
                    if (!configuration.migrationContainer.d(cVar.f118738a, cVar.f118739b)) {
                        configuration.migrationContainer.c(cVar);
                    }
                }
                c2 c2Var = (c2) P(c2.class, s());
                if (c2Var != null) {
                    c2Var.d(configuration);
                }
                AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (AutoClosingRoomOpenHelper) P(AutoClosingRoomOpenHelper.class, s());
                if (autoClosingRoomOpenHelper != null) {
                    this.autoCloser = autoClosingRoomOpenHelper.autoCloser;
                    getInvalidationTracker().u(autoClosingRoomOpenHelper.autoCloser);
                }
                boolean z10 = configuration.journalMode == JournalMode.WRITE_AHEAD_LOGGING;
                s().setWriteAheadLoggingEnabled(z10);
                this.mCallbacks = configuration.callbacks;
                this.internalQueryExecutor = configuration.queryExecutor;
                this.internalTransactionExecutor = new i2(configuration.transactionExecutor);
                this.allowMainThreadQueries = configuration.allowMainThreadQueries;
                this.writeAheadLoggingEnabled = z10;
                if (configuration.multiInstanceInvalidationServiceIntent != null) {
                    if (configuration.name == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    getInvalidationTracker().w(configuration.context, configuration.name, configuration.multiInstanceInvalidationServiceIntent);
                }
                Map<Class<?>, List<Class<?>>> mapV = v();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : mapV.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = configuration.typeConverters.size() - 1;
                        if (size3 < 0) {
                            size3 = -1;
                            break;
                        }
                        while (true) {
                            int i13 = size3 - 1;
                            if (cls.isAssignableFrom(configuration.typeConverters.get(size3).getClass())) {
                                bitSet2.set(size3);
                                break;
                            } else {
                                if (i13 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                size3 = i13;
                            }
                        }
                        if (!(size3 >= 0)) {
                            throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.typeConverters.put(cls, configuration.typeConverters.get(size3));
                    }
                }
                int size4 = configuration.typeConverters.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i14 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.typeConverters.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i14 < 0) {
                        return;
                    } else {
                        size4 = i14;
                    }
                }
            }
        }
    }

    protected void D(@dl.d j3.g db2) {
        kotlin.jvm.internal.f0.p(db2, "db");
        getInvalidationTracker().n(db2);
    }

    public final boolean E() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean F() {
        Boolean boolValueOf;
        boolean zIsOpen;
        c cVar = this.autoCloser;
        if (cVar == null) {
            j3.g gVar = this.f26958a;
            if (gVar != null) {
                zIsOpen = gVar.isOpen();
            } else {
                boolValueOf = null;
            }
            return kotlin.jvm.internal.f0.g(boolValueOf, Boolean.TRUE);
        }
        zIsOpen = cVar.p();
        boolValueOf = Boolean.valueOf(zIsOpen);
        return kotlin.jvm.internal.f0.g(boolValueOf, Boolean.TRUE);
    }

    @dl.d
    @xh.i
    public final Cursor H(@dl.d j3.j query) {
        kotlin.jvm.internal.f0.p(query, "query");
        return K(this, query, null, 2, null);
    }

    @dl.d
    @xh.i
    public Cursor I(@dl.d j3.j query, @dl.e CancellationSignal signal) {
        kotlin.jvm.internal.f0.p(query, "query");
        c();
        d();
        return signal != null ? s().getWritableDatabase().B(query, signal) : s().getWritableDatabase().u1(query);
    }

    @dl.d
    public Cursor J(@dl.d String query, @dl.e Object[] args) {
        kotlin.jvm.internal.f0.p(query, "query");
        return s().getWritableDatabase().u1(new j3.b(query, args));
    }

    public <V> V L(@dl.d Callable<V> body) {
        kotlin.jvm.internal.f0.p(body, "body");
        e();
        try {
            V vCall = body.call();
            O();
            return vCall;
        } finally {
            k();
        }
    }

    public void M(@dl.d Runnable body) {
        kotlin.jvm.internal.f0.p(body, "body");
        e();
        try {
            body.run();
            O();
        } finally {
            k();
        }
    }

    protected final void N(@dl.d Map<Class<? extends f3.b>, f3.b> map) {
        kotlin.jvm.internal.f0.p(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    @kotlin.k(message = "setTransactionSuccessful() is deprecated", replaceWith = @kotlin.s0(expression = "runInTransaction(Runnable)", imports = {}))
    public void O() {
        s().getWritableDatabase().O0();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void c() {
        if (!this.allowMainThreadQueries && !(!E())) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void d() {
        if (!(z() || this.suspendingTransactionId.get() == null)) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    @kotlin.k(message = "beginTransaction() is deprecated", replaceWith = @kotlin.s0(expression = "runInTransaction(Runnable)", imports = {}))
    public void e() {
        c();
        c cVar = this.autoCloser;
        if (cVar == null) {
            B();
        } else {
            cVar.g(new yh.l<j3.g, Object>() { // from class: androidx.room.RoomDatabase$beginTransaction$1
                {
                    super(1);
                }

                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d j3.g it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    this.f26997b.B();
                    return null;
                }
            });
        }
    }

    @androidx.annotation.k1
    public abstract void f();

    public void g() {
        if (F()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            kotlin.jvm.internal.f0.o(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().y();
                s().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    @dl.d
    public j3.l h(@dl.d String sql) {
        kotlin.jvm.internal.f0.p(sql, "sql");
        c();
        d();
        return s().getWritableDatabase().s1(sql);
    }

    @dl.d
    protected abstract f0 i();

    @dl.d
    protected abstract j3.h j(@dl.d j config);

    @kotlin.k(message = "endTransaction() is deprecated", replaceWith = @kotlin.s0(expression = "runInTransaction(Runnable)", imports = {}))
    public void k() {
        c cVar = this.autoCloser;
        if (cVar == null) {
            C();
        } else {
            cVar.g(new yh.l<j3.g, Object>() { // from class: androidx.room.RoomDatabase$endTransaction$1
                {
                    super(1);
                }

                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d j3.g it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    this.f26999b.C();
                    return null;
                }
            });
        }
    }

    @dl.d
    protected final Map<Class<? extends f3.b>, f3.b> l() {
        return this.autoMigrationSpecs;
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @xh.n
    public List<f3.c> m(@dl.d Map<Class<? extends f3.b>, f3.b> autoMigrationSpecs) {
        kotlin.jvm.internal.f0.p(autoMigrationSpecs, "autoMigrationSpecs");
        return CollectionsKt__CollectionsKt.E();
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Map<String, Object> n() {
        return this.backingFieldMap;
    }

    @dl.d
    public final Lock o() {
        ReentrantReadWriteLock.ReadLock lock = this.readWriteLock.readLock();
        kotlin.jvm.internal.f0.o(lock, "readWriteLock.readLock()");
        return lock;
    }

    @dl.d
    /* JADX INFO: renamed from: p, reason: from getter */
    public f0 getInvalidationTracker() {
        return this.invalidationTracker;
    }

    @dl.d
    public j3.h s() {
        j3.h hVar = this.f26961d;
        if (hVar != null) {
            return hVar;
        }
        kotlin.jvm.internal.f0.S("internalOpenHelper");
        return null;
    }

    @dl.d
    public Executor t() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        kotlin.jvm.internal.f0.S("internalQueryExecutor");
        return null;
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Set<Class<? extends f3.b>> u() {
        return kotlin.collections.d1.k();
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected Map<Class<?>, List<Class<?>>> v() {
        return kotlin.collections.s0.z();
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final ThreadLocal<Integer> w() {
        return this.suspendingTransactionId;
    }

    @dl.d
    public Executor x() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        kotlin.jvm.internal.f0.S("internalTransactionExecutor");
        return null;
    }

    @dl.e
    public <T> T y(@dl.d Class<T> klass) {
        kotlin.jvm.internal.f0.p(klass, "klass");
        return (T) this.typeConverters.get(klass);
    }

    public boolean z() {
        return s().getWritableDatabase().I1();
    }
}
