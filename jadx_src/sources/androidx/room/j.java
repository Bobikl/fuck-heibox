package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: DatabaseConfiguration.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001BÏ\u0001\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\b\u0010(\u001a\u0004\u0018\u00010%\u0012\u0006\u0010*\u001a\u00020\u0004\u0012\u0006\u0010,\u001a\u00020\u0004\u0012\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010-\u0012\b\u00102\u001a\u0004\u0018\u00010\f\u0012\b\u00106\u001a\u0004\u0018\u000103\u0012\u000e\u0010;\u001a\n\u0012\u0004\u0012\u000208\u0018\u000107\u0012\b\u0010?\u001a\u0004\u0018\u00010<\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013\u0012\f\u0010D\u001a\b\u0012\u0004\u0012\u00020B0\u0013¢\u0006\u0004\bI\u0010JBk\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010*\u001a\u00020\u0004\u0012\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010-¢\u0006\u0004\bI\u0010KB\u0083\u0001\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\u0006\u0010F\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020\u0004\u0012\u0006\u0010,\u001a\u00020\u0004\u0012\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010-¢\u0006\u0004\bI\u0010LB\u0097\u0001\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\u0006\u0010F\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020\u0004\u0012\u0006\u0010,\u001a\u00020\u0004\u0012\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010-\u0012\b\u00102\u001a\u0004\u0018\u00010\f\u0012\b\u00106\u001a\u0004\u0018\u000103¢\u0006\u0004\bI\u0010MB§\u0001\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\u0006\u0010F\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020\u0004\u0012\u0006\u0010,\u001a\u00020\u0004\u0012\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010-\u0012\b\u00102\u001a\u0004\u0018\u00010\f\u0012\b\u00106\u001a\u0004\u0018\u000103\u0012\u000e\u0010;\u001a\n\u0012\u0004\u0012\u000208\u0018\u000107¢\u0006\u0004\bI\u0010NB±\u0001\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\u0006\u0010F\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020\u0004\u0012\u0006\u0010,\u001a\u00020\u0004\u0012\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010-\u0012\b\u00102\u001a\u0004\u0018\u00010\f\u0012\b\u00106\u001a\u0004\u0018\u000103\u0012\u000e\u0010;\u001a\n\u0012\u0004\u0012\u000208\u0018\u000107\u0012\b\u0010?\u001a\u0004\u0018\u00010<¢\u0006\u0004\bI\u0010OB¿\u0001\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\u0006\u0010F\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020\u0004\u0012\u0006\u0010,\u001a\u00020\u0004\u0012\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010-\u0012\b\u00102\u001a\u0004\u0018\u00010\f\u0012\b\u00106\u001a\u0004\u0018\u000103\u0012\u000e\u0010;\u001a\n\u0012\u0004\u0012\u000208\u0018\u000107\u0012\b\u0010?\u001a\u0004\u0018\u00010<\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0004\bI\u0010PBÍ\u0001\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\u0006\u0010F\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020\u0004\u0012\u0006\u0010,\u001a\u00020\u0004\u0012\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010-\u0012\b\u00102\u001a\u0004\u0018\u00010\f\u0012\b\u00106\u001a\u0004\u0018\u000103\u0012\u000e\u0010;\u001a\n\u0012\u0004\u0012\u000208\u0018\u000107\u0012\b\u0010?\u001a\u0004\u0018\u00010<\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013\u0012\f\u0010D\u001a\b\u0012\u0004\u0012\u00020B0\u0013¢\u0006\u0004\bI\u0010QJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010(\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u0014\u0010,\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001c\u00100\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010\rR\u0016\u00106\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u0010;\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010?\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0016R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020B0\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0016R\u0014\u0010F\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0019¨\u0006R"}, d2 = {"Landroidx/room/j;", "", "", "version", "", "b", "fromVersion", "toVersion", ak.av, "Landroid/content/Context;", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "", "Ljava/lang/String;", "name", "Landroidx/room/RoomDatabase$d;", "d", "Landroidx/room/RoomDatabase$d;", "migrationContainer", "", "Landroidx/room/RoomDatabase$b;", "e", "Ljava/util/List;", "callbacks", "f", "Z", "allowMainThreadQueries", "Landroidx/room/RoomDatabase$JournalMode;", "g", "Landroidx/room/RoomDatabase$JournalMode;", "journalMode", "Ljava/util/concurrent/Executor;", RXScreenCaptureService.KEY_HEIGHT, "Ljava/util/concurrent/Executor;", "queryExecutor", "i", "transactionExecutor", "Landroid/content/Intent;", "j", "Landroid/content/Intent;", "multiInstanceInvalidationServiceIntent", "k", "requireMigration", "l", "allowDestructiveMigrationOnDowngrade", "", "m", "Ljava/util/Set;", "migrationNotRequiredFrom", "n", "copyFromAssetPath", "Ljava/io/File;", "o", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "p", "Ljava/util/concurrent/Callable;", "copyFromInputStream", "Landroidx/room/RoomDatabase$e;", "q", "Landroidx/room/RoomDatabase$e;", "prepackagedDatabaseCallback", "r", "typeConverters", "Lf3/b;", ak.aB, "autoMigrationSpecs", "t", "multiInstanceInvalidation", "Lj3/h$c;", "sqliteOpenHelperFactory", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lj3/h$c;Landroidx/room/RoomDatabase$d;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$e;Ljava/util/List;Ljava/util/List;)V", "(Landroid/content/Context;Ljava/lang/String;Lj3/h$c;Landroidx/room/RoomDatabase$d;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;ZLjava/util/Set;)V", "(Landroid/content/Context;Ljava/lang/String;Lj3/h$c;Landroidx/room/RoomDatabase$d;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;)V", "(Landroid/content/Context;Ljava/lang/String;Lj3/h$c;Landroidx/room/RoomDatabase$d;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;)V", "(Landroid/content/Context;Ljava/lang/String;Lj3/h$c;Landroidx/room/RoomDatabase$d;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;)V", "(Landroid/content/Context;Ljava/lang/String;Lj3/h$c;Landroidx/room/RoomDatabase$d;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$e;)V", "(Landroid/content/Context;Ljava/lang/String;Lj3/h$c;Landroidx/room/RoomDatabase$d;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$e;Ljava/util/List;)V", "(Landroid/content/Context;Ljava/lang/String;Lj3/h$c;Landroidx/room/RoomDatabase$d;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$e;Ljava/util/List;Ljava/util/List;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    @xh.e
    public final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    @xh.e
    public final j3.h.c f27197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final RoomDatabase.d migrationContainer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    @xh.e
    public final List<RoomDatabase.b> callbacks;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @xh.e
    public final boolean allowMainThreadQueries;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final RoomDatabase.JournalMode journalMode;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final Executor queryExecutor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final Executor transactionExecutor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.e
    @xh.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final Intent multiInstanceInvalidationServiceIntent;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @xh.e
    public final boolean requireMigration;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @xh.e
    public final boolean allowDestructiveMigrationOnDowngrade;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Set<Integer> migrationNotRequiredFrom;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.e
    @xh.e
    public final String copyFromAssetPath;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.e
    @xh.e
    public final File copyFromFile;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.e
    @xh.e
    public final Callable<InputStream> copyFromInputStream;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.e
    @xh.e
    public final RoomDatabase.e prepackagedDatabaseCallback;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final List<Object> typeConverters;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final List<f3.b> autoMigrationSpecs;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @xh.e
    public final boolean multiInstanceInvalidation;

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public j(@dl.d Context context, @dl.e String str, @dl.d j3.h.c sqliteOpenHelperFactory, @dl.d RoomDatabase.d migrationContainer, @dl.e List<? extends RoomDatabase.b> list, boolean z10, @dl.d RoomDatabase.JournalMode journalMode, @dl.d Executor queryExecutor, @dl.d Executor transactionExecutor, @dl.e Intent intent, boolean z11, boolean z12, @dl.e Set<Integer> set, @dl.e String str2, @dl.e File file, @dl.e Callable<InputStream> callable, @dl.e RoomDatabase.e eVar, @dl.d List<? extends Object> typeConverters, @dl.d List<? extends f3.b> autoMigrationSpecs) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        kotlin.jvm.internal.f0.p(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.f0.p(journalMode, "journalMode");
        kotlin.jvm.internal.f0.p(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.f0.p(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.f0.p(typeConverters, "typeConverters");
        kotlin.jvm.internal.f0.p(autoMigrationSpecs, "autoMigrationSpecs");
        this.context = context;
        this.name = str;
        this.f27197c = sqliteOpenHelperFactory;
        this.migrationContainer = migrationContainer;
        this.callbacks = list;
        this.allowMainThreadQueries = z10;
        this.journalMode = journalMode;
        this.queryExecutor = queryExecutor;
        this.transactionExecutor = transactionExecutor;
        this.multiInstanceInvalidationServiceIntent = intent;
        this.requireMigration = z11;
        this.allowDestructiveMigrationOnDowngrade = z12;
        this.migrationNotRequiredFrom = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.prepackagedDatabaseCallback = eVar;
        this.typeConverters = typeConverters;
        this.autoMigrationSpecs = autoMigrationSpecs;
        this.multiInstanceInvalidation = intent != null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.k(message = "This constructor is deprecated.", replaceWith = @kotlin.s0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public j(@dl.d Context context, @dl.e String str, @dl.d j3.h.c sqliteOpenHelperFactory, @dl.d RoomDatabase.d migrationContainer, @dl.e List<? extends RoomDatabase.b> list, boolean z10, @dl.d RoomDatabase.JournalMode journalMode, @dl.d Executor queryExecutor, @dl.d Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @dl.e Set<Integer> set) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, (String) null, (File) null, (Callable<InputStream>) null, (RoomDatabase.e) null, (List<? extends Object>) CollectionsKt__CollectionsKt.E(), (List<? extends f3.b>) CollectionsKt__CollectionsKt.E());
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        kotlin.jvm.internal.f0.p(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.f0.p(journalMode, "journalMode");
        kotlin.jvm.internal.f0.p(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.f0.p(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.k(message = "This constructor is deprecated.", replaceWith = @kotlin.s0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public j(@dl.d Context context, @dl.e String str, @dl.d j3.h.c sqliteOpenHelperFactory, @dl.d RoomDatabase.d migrationContainer, @dl.e List<? extends RoomDatabase.b> list, boolean z10, @dl.d RoomDatabase.JournalMode journalMode, @dl.d Executor queryExecutor, @dl.d Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @dl.e Set<Integer> set, @dl.e String str2, @dl.e File file) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, (Callable<InputStream>) null, (RoomDatabase.e) null, (List<? extends Object>) CollectionsKt__CollectionsKt.E(), (List<? extends f3.b>) CollectionsKt__CollectionsKt.E());
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        kotlin.jvm.internal.f0.p(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.f0.p(journalMode, "journalMode");
        kotlin.jvm.internal.f0.p(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.f0.p(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.k(message = "This constructor is deprecated.", replaceWith = @kotlin.s0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public j(@dl.d Context context, @dl.e String str, @dl.d j3.h.c sqliteOpenHelperFactory, @dl.d RoomDatabase.d migrationContainer, @dl.e List<? extends RoomDatabase.b> list, boolean z10, @dl.d RoomDatabase.JournalMode journalMode, @dl.d Executor queryExecutor, @dl.d Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @dl.e Set<Integer> set, @dl.e String str2, @dl.e File file, @dl.e Callable<InputStream> callable) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, (RoomDatabase.e) null, (List<? extends Object>) CollectionsKt__CollectionsKt.E(), (List<? extends f3.b>) CollectionsKt__CollectionsKt.E());
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        kotlin.jvm.internal.f0.p(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.f0.p(journalMode, "journalMode");
        kotlin.jvm.internal.f0.p(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.f0.p(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.k(message = "This constructor is deprecated.", replaceWith = @kotlin.s0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public j(@dl.d Context context, @dl.e String str, @dl.d j3.h.c sqliteOpenHelperFactory, @dl.d RoomDatabase.d migrationContainer, @dl.e List<? extends RoomDatabase.b> list, boolean z10, @dl.d RoomDatabase.JournalMode journalMode, @dl.d Executor queryExecutor, @dl.d Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @dl.e Set<Integer> set, @dl.e String str2, @dl.e File file, @dl.e Callable<InputStream> callable, @dl.e RoomDatabase.e eVar) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, eVar, (List<? extends Object>) CollectionsKt__CollectionsKt.E(), (List<? extends f3.b>) CollectionsKt__CollectionsKt.E());
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        kotlin.jvm.internal.f0.p(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.f0.p(journalMode, "journalMode");
        kotlin.jvm.internal.f0.p(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.f0.p(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.k(message = "This constructor is deprecated.", replaceWith = @kotlin.s0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public j(@dl.d Context context, @dl.e String str, @dl.d j3.h.c sqliteOpenHelperFactory, @dl.d RoomDatabase.d migrationContainer, @dl.e List<? extends RoomDatabase.b> list, boolean z10, @dl.d RoomDatabase.JournalMode journalMode, @dl.d Executor queryExecutor, @dl.d Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @dl.e Set<Integer> set, @dl.e String str2, @dl.e File file, @dl.e Callable<InputStream> callable, @dl.e RoomDatabase.e eVar, @dl.d List<? extends Object> typeConverters) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, eVar, typeConverters, (List<? extends f3.b>) CollectionsKt__CollectionsKt.E());
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        kotlin.jvm.internal.f0.p(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.f0.p(journalMode, "journalMode");
        kotlin.jvm.internal.f0.p(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.f0.p(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.f0.p(typeConverters, "typeConverters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.k(message = "This constructor is deprecated.", replaceWith = @kotlin.s0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public j(@dl.d Context context, @dl.e String str, @dl.d j3.h.c sqliteOpenHelperFactory, @dl.d RoomDatabase.d migrationContainer, @dl.e List<? extends RoomDatabase.b> list, boolean z10, @dl.d RoomDatabase.JournalMode journalMode, @dl.d Executor queryExecutor, @dl.d Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @dl.e Set<Integer> set, @dl.e String str2, @dl.e File file, @dl.e Callable<InputStream> callable, @dl.e RoomDatabase.e eVar, @dl.d List<? extends Object> typeConverters, @dl.d List<? extends f3.b> autoMigrationSpecs) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, (RoomDatabase.e) null, typeConverters, autoMigrationSpecs);
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        kotlin.jvm.internal.f0.p(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.f0.p(journalMode, "journalMode");
        kotlin.jvm.internal.f0.p(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.f0.p(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.f0.p(typeConverters, "typeConverters");
        kotlin.jvm.internal.f0.p(autoMigrationSpecs, "autoMigrationSpecs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.k(message = "This constructor is deprecated.", replaceWith = @kotlin.s0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public j(@dl.d Context context, @dl.e String str, @dl.d j3.h.c sqliteOpenHelperFactory, @dl.d RoomDatabase.d migrationContainer, @dl.e List<? extends RoomDatabase.b> list, boolean z10, @dl.d RoomDatabase.JournalMode journalMode, @dl.d Executor queryExecutor, boolean z11, @dl.e Set<Integer> set) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, queryExecutor, (Intent) null, z11, false, set, (String) null, (File) null, (Callable<InputStream>) null, (RoomDatabase.e) null, (List<? extends Object>) CollectionsKt__CollectionsKt.E(), (List<? extends f3.b>) CollectionsKt__CollectionsKt.E());
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        kotlin.jvm.internal.f0.p(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.f0.p(journalMode, "journalMode");
        kotlin.jvm.internal.f0.p(queryExecutor, "queryExecutor");
    }

    public boolean a(int fromVersion, int toVersion) {
        Set<Integer> set;
        if ((fromVersion > toVersion) && this.allowDestructiveMigrationOnDowngrade) {
            return false;
        }
        return this.requireMigration && ((set = this.migrationNotRequiredFrom) == null || !set.contains(Integer.valueOf(fromVersion)));
    }

    @kotlin.k(message = "Use [isMigrationRequired(int, int)] which takes\n      [allowDestructiveMigrationOnDowngrade] into account.", replaceWith = @kotlin.s0(expression = "isMigrationRequired(version, version + 1)", imports = {}))
    public boolean b(int version) {
        return a(version, version + 1);
    }
}
