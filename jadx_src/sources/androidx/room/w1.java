package androidx.room;

import androidx.annotation.RestrictTo;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

/* JADX INFO: compiled from: RoomSQLiteQuery.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u000e\b\u0007\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0002:\u000bB\u0011\b\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b>\u0010?J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0000J\b\u0010\u0019\u001a\u00020\u0007H\u0016R\u001a\u0010\u001d\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010$R\u001a\u0010)\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010'\u0012\u0004\b(\u0010$R\"\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u0012\u0004\b-\u0010$R\"\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u0012\u0004\b1\u0010$R\u001a\u00107\u001a\u0002038\u0002X\u0082\u0004¢\u0006\f\n\u0004\b4\u00105\u0012\u0004\b6\u0010$R$\u0010;\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b9\u0010\u001a\u001a\u0004\b:\u0010\u001cR\u0014\u0010=\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010<¨\u0006A"}, d2 = {"Landroidx/room/w1;", "Lj3/j;", "Lj3/i;", "", "query", "", "initArgCount", "Lkotlin/b2;", "p", "release", "statement", "b", UCropPlusActivity.ARG_INDEX, "r0", "", "value", "d0", "", "F0", "X", "", "l0", "close", "other", "e", "R1", "I", "k", "()I", "capacity", ak.aF, "Ljava/lang/String;", "", "d", "[J", "getLongBindings$annotations", "()V", "longBindings", "", "[D", "getDoubleBindings$annotations", "doubleBindings", "", "f", "[Ljava/lang/String;", "getStringBindings$annotations", "stringBindings", "g", "[[B", "getBlobBindings$annotations", "blobBindings", "", RXScreenCaptureService.KEY_HEIGHT, "[I", "getBindingTypes$annotations", "bindingTypes", "<set-?>", "i", ak.av, "argCount", "()Ljava/lang/String;", com.tekartik.sqflite.b.f98602u, "<init>", "(I)V", "j", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class w1 implements j3.j, j3.i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f27343k = 15;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f27344l = 10;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f27346n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f27347o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f27348p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f27349q = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f27350r = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @androidx.annotation.j1
    private final int capacity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private volatile String query;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final long[] longBindings;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final double[] doubleBindings;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final String[] stringBindings;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final byte[][] blobBindings;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final int[] bindingTypes;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int argCount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final TreeMap<Integer, w1> f27345m = new TreeMap<>();

    /* JADX INFO: compiled from: RoomSQLiteQuery.kt */
    @mh.c(AnnotationRetention.SOURCE)
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/room/w1$a;", "", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: renamed from: androidx.room.w1$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: RoomSQLiteQuery.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0087T¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u0012\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\b8\u0006X\u0087T¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u0012\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001b\u0010\r¨\u0006\u001d"}, d2 = {"Landroidx/room/w1$b;", "", "Lj3/j;", "supportSQLiteQuery", "Landroidx/room/w1;", "b", "", "query", "", "argumentCount", ak.av, "Lkotlin/b2;", "f", "()V", "BLOB", "I", "DESIRED_POOL_SIZE", "getDESIRED_POOL_SIZE$annotations", "DOUBLE", "LONG", "NULL", "POOL_LIMIT", "getPOOL_LIMIT$annotations", "STRING", "Ljava/util/TreeMap;", "queryPool", "Ljava/util/TreeMap;", "getQueryPool$annotations", "<init>", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: androidx.room.w1$b$a */
        /* JADX INFO: compiled from: RoomSQLiteQuery.kt */
        @Metadata(bv = {}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001J\u0019\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\bH\u0096\u0001J\u0019\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\nH\u0096\u0001J\u0011\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0019\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\rH\u0096\u0001J\t\u0010\u000f\u001a\u00020\u0006H\u0096\u0001J\t\u0010\u0010\u001a\u00020\u0006H\u0096\u0001¨\u0006\u0011"}, d2 = {"androidx/room/w1$b$a", "Lj3/i;", "", UCropPlusActivity.ARG_INDEX, "", "value", "Lkotlin/b2;", "l0", "", "F0", "", "d0", "r0", "", "X", "R1", "close", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
        public static final class a implements j3.i {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final /* synthetic */ w1 f27359b;

            a(w1 w1Var) {
                this.f27359b = w1Var;
            }

            @Override // j3.i
            public void F0(int i10, double d10) {
                this.f27359b.F0(i10, d10);
            }

            @Override // j3.i
            public void R1() {
                this.f27359b.R1();
            }

            @Override // j3.i
            public void X(int i10, @dl.d String value) {
                kotlin.jvm.internal.f0.p(value, "value");
                this.f27359b.X(i10, value);
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f27359b.close();
            }

            @Override // j3.i
            public void d0(int i10, long j10) {
                this.f27359b.d0(i10, j10);
            }

            @Override // j3.i
            public void l0(int i10, @dl.d byte[] value) {
                kotlin.jvm.internal.f0.p(value, "value");
                this.f27359b.l0(i10, value);
            }

            @Override // j3.i
            public void r0(int i10) {
                this.f27359b.r0(i10);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @androidx.annotation.j1
        public static /* synthetic */ void c() {
        }

        @androidx.annotation.j1
        public static /* synthetic */ void d() {
        }

        @androidx.annotation.j1
        public static /* synthetic */ void e() {
        }

        @dl.d
        @xh.m
        public final w1 a(@dl.d String query, int argumentCount) {
            kotlin.jvm.internal.f0.p(query, "query");
            TreeMap<Integer, w1> treeMap = w1.f27345m;
            synchronized (treeMap) {
                Map.Entry<Integer, w1> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(argumentCount));
                if (entryCeilingEntry == null) {
                    kotlin.b2 b2Var = kotlin.b2.f124493a;
                    w1 w1Var = new w1(argumentCount, null);
                    w1Var.p(query, argumentCount);
                    return w1Var;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                w1 sqliteQuery = entryCeilingEntry.getValue();
                sqliteQuery.p(query, argumentCount);
                kotlin.jvm.internal.f0.o(sqliteQuery, "sqliteQuery");
                return sqliteQuery;
            }
        }

        @dl.d
        @xh.m
        public final w1 b(@dl.d j3.j supportSQLiteQuery) {
            kotlin.jvm.internal.f0.p(supportSQLiteQuery, "supportSQLiteQuery");
            w1 w1VarA = a(supportSQLiteQuery.getF124204b(), supportSQLiteQuery.getArgCount());
            supportSQLiteQuery.b(new a(w1VarA));
            return w1VarA;
        }

        public final void f() {
            TreeMap<Integer, w1> treeMap = w1.f27345m;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            kotlin.jvm.internal.f0.o(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i10;
            }
        }
    }

    private w1(int i10) {
        this.capacity = i10;
        int i11 = i10 + 1;
        this.bindingTypes = new int[i11];
        this.longBindings = new long[i11];
        this.doubleBindings = new double[i11];
        this.stringBindings = new String[i11];
        this.blobBindings = new byte[i11][];
    }

    public /* synthetic */ w1(int i10, kotlin.jvm.internal.u uVar) {
        this(i10);
    }

    @dl.d
    @xh.m
    public static final w1 d(@dl.d String str, int i10) {
        return INSTANCE.a(str, i10);
    }

    @dl.d
    @xh.m
    public static final w1 f(@dl.d j3.j jVar) {
        return INSTANCE.b(jVar);
    }

    private static /* synthetic */ void g() {
    }

    @androidx.annotation.j1
    public static /* synthetic */ void i() {
    }

    @androidx.annotation.j1
    public static /* synthetic */ void m() {
    }

    @androidx.annotation.j1
    public static /* synthetic */ void n() {
    }

    @androidx.annotation.j1
    public static /* synthetic */ void o() {
    }

    @Override // j3.i
    public void F0(int i10, double d10) {
        this.bindingTypes[i10] = 3;
        this.doubleBindings[i10] = d10;
    }

    @Override // j3.i
    public void R1() {
        Arrays.fill(this.bindingTypes, 1);
        Arrays.fill(this.stringBindings, (Object) null);
        Arrays.fill(this.blobBindings, (Object) null);
        this.query = null;
    }

    @Override // j3.i
    public void X(int i10, @dl.d String value) {
        kotlin.jvm.internal.f0.p(value, "value");
        this.bindingTypes[i10] = 4;
        this.stringBindings[i10] = value;
    }

    @Override // j3.j
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getArgCount() {
        return this.argCount;
    }

    @Override // j3.j
    public void b(@dl.d j3.i statement) {
        kotlin.jvm.internal.f0.p(statement, "statement");
        int argCount = getArgCount();
        if (1 > argCount) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.bindingTypes[i10];
            if (i11 == 1) {
                statement.r0(i10);
            } else if (i11 == 2) {
                statement.d0(i10, this.longBindings[i10]);
            } else if (i11 == 3) {
                statement.F0(i10, this.doubleBindings[i10]);
            } else if (i11 == 4) {
                String str = this.stringBindings[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                statement.X(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.blobBindings[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                statement.l0(i10, bArr);
            }
            if (i10 == argCount) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // j3.j
    @dl.d
    /* JADX INFO: renamed from: c */
    public String getF124204b() {
        String str = this.query;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // j3.i
    public void d0(int i10, long j10) {
        this.bindingTypes[i10] = 2;
        this.longBindings[i10] = j10;
    }

    public final void e(@dl.d w1 other) {
        kotlin.jvm.internal.f0.p(other, "other");
        int argCount = other.getArgCount() + 1;
        System.arraycopy(other.bindingTypes, 0, this.bindingTypes, 0, argCount);
        System.arraycopy(other.longBindings, 0, this.longBindings, 0, argCount);
        System.arraycopy(other.stringBindings, 0, this.stringBindings, 0, argCount);
        System.arraycopy(other.blobBindings, 0, this.blobBindings, 0, argCount);
        System.arraycopy(other.doubleBindings, 0, this.doubleBindings, 0, argCount);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getCapacity() {
        return this.capacity;
    }

    @Override // j3.i
    public void l0(int i10, @dl.d byte[] value) {
        kotlin.jvm.internal.f0.p(value, "value");
        this.bindingTypes[i10] = 5;
        this.blobBindings[i10] = value;
    }

    public final void p(@dl.d String query, int i10) {
        kotlin.jvm.internal.f0.p(query, "query");
        this.query = query;
        this.argCount = i10;
    }

    @Override // j3.i
    public void r0(int i10) {
        this.bindingTypes[i10] = 1;
    }

    public final void release() {
        TreeMap<Integer, w1> treeMap = f27345m;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.capacity), this);
            INSTANCE.f();
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
    }
}
