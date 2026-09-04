package androidx.p001datastore.core;

import androidx.annotation.b0;
import androidx.exifinterface.media.a;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.accs.utl.BaseMonitor;
import com.umeng.analytics.pro.ak;
import dl.d;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.o;
import kotlin.t0;
import kotlin.z;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.f3;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.coroutines.y;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 U*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003\u001e$(B\u0081\u0001\u0012\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001c0P\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000#\u0012?\b\u0002\u0010R\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000F¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(G\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00120E\u0012\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000'\u0012\b\b\u0002\u0010.\u001a\u00020+ø\u0001\u0000¢\u0006\u0004\bS\u0010TJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u0013\u0010\u0010\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\rJ\u0013\u0010\u0011\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\rJN\u0010\u001a\u001a\u00028\u000021\u0010\u0017\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\f\u0010\u001d\u001a\u00020\u0005*\u00020\u001cH\u0002JF\u0010\u001e\u001a\u00028\u000021\u0010\u0017\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00028\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u00104\u001a\b\u0012\u0004\u0012\u00028\u00000/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082D¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010=\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R&\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000?0>8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b@\u0010A\u0012\u0004\bB\u0010CRR\u0010J\u001a;\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000F¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(G\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0012\u0018\u00010E8\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\bH\u0010IR \u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000L0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006V"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore;", a.f23244d5, "Landroidx/datastore/core/d;", "Landroidx/datastore/core/SingleProcessDataStore$b$a;", "read", "Lkotlin/b2;", ak.aB, "(Landroidx/datastore/core/SingleProcessDataStore$b$a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/datastore/core/SingleProcessDataStore$b$b;", "update", "t", "(Landroidx/datastore/core/SingleProcessDataStore$b$b;Lkotlin/coroutines/c;)Ljava/lang/Object;", "v", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", RXScreenCaptureService.KEY_WIDTH, ak.aG, "y", "x", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "Lkotlin/coroutines/c;", "", "transform", "Lkotlin/coroutines/CoroutineContext;", "callerContext", ak.aD, "(Lyh/p;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Ljava/io/File;", "p", ak.av, "(Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "newData", a.W4, "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/datastore/core/i;", "b", "Landroidx/datastore/core/i;", "serializer", "Landroidx/datastore/core/a;", ak.aF, "Landroidx/datastore/core/a;", "corruptionHandler", "Lkotlinx/coroutines/q0;", "d", "Lkotlinx/coroutines/q0;", "scope", "Lkotlinx/coroutines/flow/e;", "e", "Lkotlinx/coroutines/flow/e;", "getData", "()Lkotlinx/coroutines/flow/e;", "data", "", "f", "Ljava/lang/String;", "SCRATCH_SUFFIX", "g", "Lkotlin/z;", "r", "()Ljava/io/File;", "file", "Lkotlinx/coroutines/flow/j;", "Landroidx/datastore/core/j;", RXScreenCaptureService.KEY_HEIGHT, "Lkotlinx/coroutines/flow/j;", "getDownstreamFlow$annotations", "()V", "downstreamFlow", "", "Landroidx/datastore/core/g;", "api", "i", "Ljava/util/List;", "initTasks", "Landroidx/datastore/core/SimpleActor;", "Landroidx/datastore/core/SingleProcessDataStore$b;", "j", "Landroidx/datastore/core/SimpleActor;", "actor", "Lkotlin/Function0;", "produceFile", "initTasksList", "<init>", "(Lyh/a;Landroidx/datastore/core/i;Ljava/util/List;Landroidx/datastore/core/a;Lkotlinx/coroutines/q0;)V", "k", "datastore-core"}, k = 1, mv = {1, 5, 1})
public final class SingleProcessDataStore<T> implements d<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @d
    @b0("activeFilesLock")
    private static final Set<String> f22075l = new LinkedHashSet();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @d
    private static final Object f22076m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final yh.a<File> f22077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d
    private final i<T> serializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d
    private final a<T> corruptionHandler;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d
    private final q0 scope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d
    private final e<T> data;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d
    private final String SCRATCH_SUFFIX;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @d
    private final z file;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @d
    private final j<j<T>> downstreamFlow;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private List<? extends p<? super g<T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object>> initTasks;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @d
    private final SimpleActor<b<T>> actor;

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$a;", "", "", "", "activeFiles", "Ljava/util/Set;", ak.av, "()Ljava/util/Set;", "activeFilesLock", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "<init>", "()V", "datastore-core"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @d
        public final Set<String> a() {
            return SingleProcessDataStore.f22075l;
        }

        @d
        public final Object b() {
            return SingleProcessDataStore.f22076m;
        }
    }

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u0004\tB\t\b\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$b;", androidx.exifinterface.media.a.f23244d5, "", "Landroidx/datastore/core/j;", ak.av, "()Landroidx/datastore/core/j;", "lastState", "<init>", "()V", "b", "Landroidx/datastore/core/SingleProcessDataStore$b$a;", "Landroidx/datastore/core/SingleProcessDataStore$b$b;", "datastore-core"}, k = 1, mv = {1, 5, 1})
    public static abstract class b<T> {

        /* JADX INFO: compiled from: SingleProcessDataStore.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0017\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$b$a;", androidx.exifinterface.media.a.f23244d5, "Landroidx/datastore/core/SingleProcessDataStore$b;", "Landroidx/datastore/core/j;", ak.av, "Landroidx/datastore/core/j;", "()Landroidx/datastore/core/j;", "lastState", "<init>", "(Landroidx/datastore/core/j;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
        public static final class a<T> extends b<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @dl.e
            private final j<T> lastState;

            public a(@dl.e j<T> jVar) {
                super(null);
                this.lastState = jVar;
            }

            @Override // androidx.datastore.core.SingleProcessDataStore.b
            @dl.e
            public j<T> a() {
                return this.lastState;
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SingleProcessDataStore.kt */
        @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002Bc\u00121\u0010\u0019\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0013\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\b\u0012\u0006\u0010\u0012\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011RE\u0010\u0019\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00138\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000f\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$b$b;", androidx.exifinterface.media.a.f23244d5, "Landroidx/datastore/core/SingleProcessDataStore$b;", "Lkotlinx/coroutines/y;", "b", "Lkotlinx/coroutines/y;", "()Lkotlinx/coroutines/y;", BaseMonitor.COUNT_ACK, "Landroidx/datastore/core/j;", ak.aF, "Landroidx/datastore/core/j;", ak.av, "()Landroidx/datastore/core/j;", "lastState", "Lkotlin/coroutines/CoroutineContext;", "d", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "callerContext", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "t", "Lkotlin/coroutines/c;", "", "transform", "Lyh/p;", "()Lyh/p;", "<init>", "(Lyh/p;Lkotlinx/coroutines/y;Landroidx/datastore/core/j;Lkotlin/coroutines/CoroutineContext;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
        public static final class C0156b<T> extends b<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @d
            private final p<T, kotlin.coroutines.c<? super T>, Object> f22093a;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @d
            private final y<T> ack;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @dl.e
            private final j<T> lastState;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @d
            private final CoroutineContext callerContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0156b(@d p<? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> transform, @d y<T> ack, @dl.e j<T> jVar, @d CoroutineContext callerContext) {
                super(null);
                f0.p(transform, "transform");
                f0.p(ack, "ack");
                f0.p(callerContext, "callerContext");
                this.f22093a = transform;
                this.ack = ack;
                this.lastState = jVar;
                this.callerContext = callerContext;
            }

            @Override // androidx.datastore.core.SingleProcessDataStore.b
            @dl.e
            public j<T> a() {
                return this.lastState;
            }

            @d
            public final y<T> b() {
                return this.ack;
            }

            @d
            /* JADX INFO: renamed from: c, reason: from getter */
            public final CoroutineContext getCallerContext() {
                return this.callerContext;
            }

            @d
            public final p<T, kotlin.coroutines.c<? super T>, Object> d() {
                return this.f22093a;
            }
        }

        private b() {
        }

        public /* synthetic */ b(u uVar) {
            this();
        }

        @dl.e
        public abstract j<T> a();
    }

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0016J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$c;", "Ljava/io/OutputStream;", "", "b", "Lkotlin/b2;", "write", "", "bytes", s0.f130317e, "len", "close", "flush", "Ljava/io/FileOutputStream;", "Ljava/io/FileOutputStream;", ak.av, "()Ljava/io/FileOutputStream;", "fileOutputStream", "<init>", "(Ljava/io/FileOutputStream;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
    public static final class c extends OutputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d
        private final FileOutputStream fileOutputStream;

        public c(@d FileOutputStream fileOutputStream) {
            f0.p(fileOutputStream, "fileOutputStream");
            this.fileOutputStream = fileOutputStream;
        }

        @d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final FileOutputStream getFileOutputStream() {
            return this.fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.fileOutputStream.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            this.fileOutputStream.write(i10);
        }

        @Override // java.io.OutputStream
        public void write(@d byte[] b10) throws IOException {
            f0.p(b10, "b");
            this.fileOutputStream.write(b10);
        }

        @Override // java.io.OutputStream
        public void write(@d byte[] bytes, int i10, int i11) throws IOException {
            f0.p(bytes, "bytes");
            this.fileOutputStream.write(bytes, i10, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleProcessDataStore(@d yh.a<? extends File> produceFile, @d i<T> serializer, @d List<? extends p<? super g<T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object>> initTasksList, @d a<T> corruptionHandler, @d q0 scope) {
        f0.p(produceFile, "produceFile");
        f0.p(serializer, "serializer");
        f0.p(initTasksList, "initTasksList");
        f0.p(corruptionHandler, "corruptionHandler");
        f0.p(scope, "scope");
        this.f22077a = produceFile;
        this.serializer = serializer;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = g.I0(new SingleProcessDataStore$data$1(this, null));
        this.SCRATCH_SUFFIX = ".tmp";
        this.file = kotlin.b0.c(new yh.a<File>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$file$2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SingleProcessDataStore<T> f22110b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f22110b = this;
            }

            @Override // yh.a
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final File invoke() {
                File file = (File) ((SingleProcessDataStore) this.f22110b).f22077a.invoke();
                String it = file.getAbsolutePath();
                SingleProcessDataStore.Companion companion = SingleProcessDataStore.INSTANCE;
                synchronized (companion.b()) {
                    if (!(!companion.a().contains(it))) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    Set<String> setA = companion.a();
                    f0.o(it, "it");
                    setA.add(it);
                }
                return file;
            }
        });
        this.downstreamFlow = v.a(k.f22179a);
        this.initTasks = CollectionsKt___CollectionsKt.Q5(initTasksList);
        this.actor = new SimpleActor<>(scope, new l<Throwable, b2>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$actor$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SingleProcessDataStore<T> f22087b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f22087b = this;
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                invoke2(th2);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.e Throwable th2) {
                if (th2 != null) {
                    ((SingleProcessDataStore) this.f22087b).downstreamFlow.setValue(new f(th2));
                }
                SingleProcessDataStore.Companion companion = SingleProcessDataStore.INSTANCE;
                Object objB = companion.b();
                SingleProcessDataStore<T> singleProcessDataStore = this.f22087b;
                synchronized (objB) {
                    companion.a().remove(singleProcessDataStore.r().getAbsolutePath());
                    b2 b2Var = b2.f124493a;
                }
            }
        }, new p<b<T>, Throwable, b2>() { // from class: androidx.datastore.core.SingleProcessDataStore$actor$2
            public final void a(@d SingleProcessDataStore.b<T> msg, @dl.e Throwable th2) {
                f0.p(msg, "msg");
                if (msg instanceof SingleProcessDataStore.b.C0156b) {
                    y<T> yVarB = ((SingleProcessDataStore.b.C0156b) msg).b();
                    if (th2 == null) {
                        th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
                    }
                    yVarB.i(th2);
                }
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(Object obj, Throwable th2) {
                a((SingleProcessDataStore.b) obj, th2);
                return b2.f124493a;
            }
        }, new SingleProcessDataStore$actor$3(this, null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SingleProcessDataStore(yh.a aVar, i iVar, List list, a aVar2, q0 q0Var, int i10, u uVar) {
        List listE = (i10 & 4) != 0 ? CollectionsKt__CollectionsKt.E() : list;
        a aVar3 = (i10 & 8) != 0 ? new d2.a() : aVar2;
        if ((i10 & 16) != 0) {
            e1 e1Var = e1.f129185a;
            q0Var = r0.a(e1.c().I(f3.c(null, 1, null)));
        }
        this(aVar, iVar, listE, aVar3, q0Var);
    }

    private final void p(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(f0.C("Unable to create parent directories of ", file));
        }
    }

    private static /* synthetic */ void q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File r() {
        return (File) this.file.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(b.a<T> aVar, kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        j<T> value = this.downstreamFlow.getValue();
        if (!(value instanceof androidx.p001datastore.core.b)) {
            if (value instanceof h) {
                if (value == aVar.a()) {
                    Object objW = w(cVar);
                    return objW == kotlin.coroutines.intrinsics.b.h() ? objW : b2.f124493a;
                }
            } else {
                if (f0.g(value, k.f22179a)) {
                    Object objW2 = w(cVar);
                    return objW2 == kotlin.coroutines.intrinsics.b.h() ? objW2 : b2.f124493a;
                }
                if (value instanceof f) {
                    throw new IllegalStateException("Can't read in final state.".toString());
                }
            }
        }
        return b2.f124493a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.datastore.core.SingleProcessDataStore$b$b, androidx.datastore.core.SingleProcessDataStore$b$b<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [androidx.datastore.core.SingleProcessDataStore$b$b] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlinx.coroutines.y] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final Object t(b.C0156b<T> c0156b, kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        SingleProcessDataStore$handleUpdate$1 singleProcessDataStore$handleUpdate$1;
        Object objB;
        ?? r10;
        y yVarB;
        ?? r11;
        Object objZ;
        ?? r12;
        y yVar;
        if (cVar instanceof SingleProcessDataStore$handleUpdate$1) {
            singleProcessDataStore$handleUpdate$1 = (SingleProcessDataStore$handleUpdate$1) cVar;
            int i10 = singleProcessDataStore$handleUpdate$1.f22116g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$handleUpdate$1.f22116g = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$handleUpdate$1 = new SingleProcessDataStore$handleUpdate$1(this, cVar);
            }
        } else {
            singleProcessDataStore$handleUpdate$1 = new SingleProcessDataStore$handleUpdate$1(this, cVar);
        }
        Object obj = singleProcessDataStore$handleUpdate$1.f22114e;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = singleProcessDataStore$handleUpdate$1.f22116g;
        boolean z10 = true;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    yVar = (y) singleProcessDataStore$handleUpdate$1.f22111b;
                } else if (i11 == 2) {
                    y yVar2 = (y) singleProcessDataStore$handleUpdate$1.f22113d;
                    SingleProcessDataStore singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$handleUpdate$1.f22112c;
                    b.C0156b c0156b2 = (b.C0156b) singleProcessDataStore$handleUpdate$1.f22111b;
                    t0.n(obj);
                    yVarB = yVar2;
                    r11 = singleProcessDataStore;
                    r12 = (b.C0156b<T>) c0156b2;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar = (b.C0156b<T>) ((y) singleProcessDataStore$handleUpdate$1.f22111b);
                }
                t0.n(obj);
                c0156b = yVar;
                objB = Result.b(obj);
                r10 = c0156b;
                a0.d(r10, objB);
                return b2.f124493a;
            }
            t0.n(obj);
            yVarB = c0156b.b();
            try {
                Result.a aVar = Result.f124476c;
                j<T> value = this.downstreamFlow.getValue();
                if (value instanceof androidx.p001datastore.core.b) {
                    p pVarD = c0156b.d();
                    CoroutineContext callerContext = c0156b.getCallerContext();
                    singleProcessDataStore$handleUpdate$1.f22111b = yVarB;
                    singleProcessDataStore$handleUpdate$1.f22116g = 1;
                    objZ = z(pVarD, callerContext, singleProcessDataStore$handleUpdate$1);
                    if (objZ == objH) {
                        return objH;
                    }
                } else {
                    if (!(value instanceof h)) {
                        z10 = value instanceof k;
                    }
                    if (!z10) {
                        if (value instanceof f) {
                            throw ((f) value).getFinalException();
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (value != c0156b.a()) {
                        throw ((h) value).getReadException();
                    }
                    singleProcessDataStore$handleUpdate$1.f22111b = c0156b;
                    singleProcessDataStore$handleUpdate$1.f22112c = this;
                    singleProcessDataStore$handleUpdate$1.f22113d = yVarB;
                    singleProcessDataStore$handleUpdate$1.f22116g = 2;
                    if (v(singleProcessDataStore$handleUpdate$1) == objH) {
                        return objH;
                    }
                    r11 = this;
                    r12 = c0156b;
                }
                y yVar3 = yVarB;
                obj = objZ;
                c0156b = yVar3;
                objB = Result.b(obj);
                r10 = c0156b;
            } catch (Throwable th2) {
                th = th2;
                c0156b = yVarB;
                Result.a aVar2 = Result.f124476c;
                objB = Result.b(t0.a(th));
                r10 = c0156b;
            }
            a0.d(r10, objB);
            return b2.f124493a;
            p pVarD2 = r12.d();
            CoroutineContext callerContext2 = r12.getCallerContext();
            singleProcessDataStore$handleUpdate$1.f22111b = yVarB;
            singleProcessDataStore$handleUpdate$1.f22112c = null;
            singleProcessDataStore$handleUpdate$1.f22113d = null;
            singleProcessDataStore$handleUpdate$1.f22116g = 3;
            objZ = r11.z(pVarD2, callerContext2, singleProcessDataStore$handleUpdate$1);
            if (objZ == objH) {
                return objH;
            }
            y yVar4 = yVarB;
            obj = objZ;
            c0156b = yVar4;
            objB = Result.b(obj);
            r10 = c0156b;
        } catch (Throwable th3) {
            th = th3;
        }
        a0.d(r10, objB);
        return b2.f124493a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Code duplicated, block: B:42:0x0114 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0115  */
    /* JADX WARN: Code duplicated, block: B:47:0x0126  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[LOOP:0: B:34:0x00d8->B:60:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.datastore.core.SingleProcessDataStore, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r13v0, types: [androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore<T>, java.lang.Object] */
    public final Object u(kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        SingleProcessDataStore$readAndInit$1 singleProcessDataStore$readAndInit$1;
        kotlinx.coroutines.sync.c cVarB;
        Ref.ObjectRef objectRef;
        ?? r10;
        Ref.ObjectRef objectRef2;
        ?? r12;
        Ref.ObjectRef objectRef3;
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1;
        Iterator<T> it;
        kotlinx.coroutines.sync.c cVar2;
        Ref.BooleanRef booleanRef;
        kotlinx.coroutines.sync.c cVar3;
        ?? r11;
        Ref.ObjectRef objectRef4;
        Ref.BooleanRef booleanRef2;
        p pVar;
        ?? r13;
        if (cVar instanceof SingleProcessDataStore$readAndInit$1) {
            singleProcessDataStore$readAndInit$1 = (SingleProcessDataStore$readAndInit$1) cVar;
            int i10 = singleProcessDataStore$readAndInit$1.f22125j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInit$1.f22125j = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$readAndInit$1 = new SingleProcessDataStore$readAndInit$1(this, cVar);
            }
        } else {
            singleProcessDataStore$readAndInit$1 = new SingleProcessDataStore$readAndInit$1(this, cVar);
        }
        T t10 = (T) singleProcessDataStore$readAndInit$1.f22123h;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = singleProcessDataStore$readAndInit$1.f22125j;
        if (i11 != 0) {
            if (i11 == 1) {
                objectRef = (Ref.ObjectRef) singleProcessDataStore$readAndInit$1.f22120e;
                objectRef2 = (Ref.ObjectRef) singleProcessDataStore$readAndInit$1.f22119d;
                cVarB = (kotlinx.coroutines.sync.c) singleProcessDataStore$readAndInit$1.f22118c;
                SingleProcessDataStore singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readAndInit$1.f22117b;
                t0.n(t10);
                r10 = singleProcessDataStore;
            } else if (i11 == 2) {
                it = (Iterator) singleProcessDataStore$readAndInit$1.f22122g;
                singleProcessDataStore$readAndInit$api$1 = (SingleProcessDataStore$readAndInit$api$1) singleProcessDataStore$readAndInit$1.f22121f;
                booleanRef = (Ref.BooleanRef) singleProcessDataStore$readAndInit$1.f22120e;
                objectRef3 = (Ref.ObjectRef) singleProcessDataStore$readAndInit$1.f22119d;
                cVar2 = (kotlinx.coroutines.sync.c) singleProcessDataStore$readAndInit$1.f22118c;
                SingleProcessDataStore singleProcessDataStore2 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$1.f22117b;
                t0.n(t10);
                r12 = singleProcessDataStore2;
                while (it.hasNext()) {
                    pVar = (p) it.next();
                    singleProcessDataStore$readAndInit$1.f22117b = r12;
                    singleProcessDataStore$readAndInit$1.f22118c = cVar2;
                    singleProcessDataStore$readAndInit$1.f22119d = objectRef3;
                    singleProcessDataStore$readAndInit$1.f22120e = booleanRef;
                    singleProcessDataStore$readAndInit$1.f22121f = singleProcessDataStore$readAndInit$api$1;
                    singleProcessDataStore$readAndInit$1.f22122g = it;
                    singleProcessDataStore$readAndInit$1.f22125j = 2;
                    if (pVar.invoke(singleProcessDataStore$readAndInit$api$1, singleProcessDataStore$readAndInit$1) == objH) {
                        return objH;
                    }
                }
                objectRef2 = objectRef3;
                cVar3 = cVar2;
                r11 = r12;
                r11.initTasks = null;
                singleProcessDataStore$readAndInit$1.f22117b = r11;
                singleProcessDataStore$readAndInit$1.f22118c = objectRef2;
                singleProcessDataStore$readAndInit$1.f22119d = booleanRef;
                singleProcessDataStore$readAndInit$1.f22120e = cVar3;
                singleProcessDataStore$readAndInit$1.f22121f = null;
                singleProcessDataStore$readAndInit$1.f22122g = null;
                singleProcessDataStore$readAndInit$1.f22125j = 3;
                if (cVar3.e(null, singleProcessDataStore$readAndInit$1) == objH) {
                    return objH;
                }
                objectRef4 = objectRef2;
                booleanRef2 = booleanRef;
                r13 = r11;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar3 = (kotlinx.coroutines.sync.c) singleProcessDataStore$readAndInit$1.f22120e;
                booleanRef2 = (Ref.BooleanRef) singleProcessDataStore$readAndInit$1.f22119d;
                objectRef4 = (Ref.ObjectRef) singleProcessDataStore$readAndInit$1.f22118c;
                SingleProcessDataStore singleProcessDataStore3 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$1.f22117b;
                t0.n(t10);
                r13 = singleProcessDataStore3;
            }
            try {
                booleanRef2.f124884b = true;
                b2 b2Var = b2.f124493a;
                cVar3.f(null);
                j<j<T>> jVar = r13.downstreamFlow;
                T t11 = objectRef4.f124891b;
                jVar.setValue(new androidx.p001datastore.core.b(t11, t11 != null ? t11.hashCode() : 0));
                return b2Var;
            } catch (Throwable th2) {
                cVar3.f(null);
                throw th2;
            }
        }
        t0.n(t10);
        if (!(f0.g(this.downstreamFlow.getValue(), k.f22179a) || (this.downstreamFlow.getValue() instanceof h))) {
            throw new IllegalStateException("Check failed.".toString());
        }
        cVarB = MutexKt.b(false, 1, null);
        objectRef = new Ref.ObjectRef();
        singleProcessDataStore$readAndInit$1.f22117b = this;
        singleProcessDataStore$readAndInit$1.f22118c = cVarB;
        singleProcessDataStore$readAndInit$1.f22119d = objectRef;
        singleProcessDataStore$readAndInit$1.f22120e = objectRef;
        singleProcessDataStore$readAndInit$1.f22125j = 1;
        t10 = (T) y(singleProcessDataStore$readAndInit$1);
        if (t10 == objH) {
            return objH;
        }
        r10 = this;
        objectRef2 = objectRef;
        objectRef.f124891b = t10;
        Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$2 = new SingleProcessDataStore$readAndInit$api$1(cVarB, booleanRef3, objectRef2, r10);
        List<? extends p<? super g<T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object>> list = r10.initTasks;
        if (list == null) {
            cVar3 = cVarB;
            booleanRef = booleanRef3;
            r11 = r10;
        } else {
            r12 = r10;
            objectRef3 = objectRef2;
            singleProcessDataStore$readAndInit$api$1 = singleProcessDataStore$readAndInit$api$2;
            it = list.iterator();
            cVar2 = cVarB;
            booleanRef = booleanRef3;
            while (it.hasNext()) {
                pVar = (p) it.next();
                singleProcessDataStore$readAndInit$1.f22117b = r12;
                singleProcessDataStore$readAndInit$1.f22118c = cVar2;
                singleProcessDataStore$readAndInit$1.f22119d = objectRef3;
                singleProcessDataStore$readAndInit$1.f22120e = booleanRef;
                singleProcessDataStore$readAndInit$1.f22121f = singleProcessDataStore$readAndInit$api$1;
                singleProcessDataStore$readAndInit$1.f22122g = it;
                singleProcessDataStore$readAndInit$1.f22125j = 2;
                if (pVar.invoke(singleProcessDataStore$readAndInit$api$1, singleProcessDataStore$readAndInit$1) == objH) {
                    return objH;
                }
            }
            objectRef2 = objectRef3;
            cVar3 = cVar2;
            r11 = r12;
        }
        r11.initTasks = null;
        singleProcessDataStore$readAndInit$1.f22117b = r11;
        singleProcessDataStore$readAndInit$1.f22118c = objectRef2;
        singleProcessDataStore$readAndInit$1.f22119d = booleanRef;
        singleProcessDataStore$readAndInit$1.f22120e = cVar3;
        singleProcessDataStore$readAndInit$1.f22121f = null;
        singleProcessDataStore$readAndInit$1.f22122g = null;
        singleProcessDataStore$readAndInit$1.f22125j = 3;
        if (cVar3.e(null, singleProcessDataStore$readAndInit$1) == objH) {
            return objH;
        }
        objectRef4 = objectRef2;
        booleanRef2 = booleanRef;
        r13 = r11;
        booleanRef2.f124884b = true;
        b2 b2Var2 = b2.f124493a;
        cVar3.f(null);
        j<j<T>> jVar2 = r13.downstreamFlow;
        T t12 = objectRef4.f124891b;
        jVar2.setValue(new androidx.p001datastore.core.b(t12, t12 != null ? t12.hashCode() : 0));
        return b2Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1;
        SingleProcessDataStore singleProcessDataStore;
        if (cVar instanceof SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) {
            singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 = (SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) cVar;
            int i10 = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.f22141e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.f22141e = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1(this, cVar);
            }
        } else {
            singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1(this, cVar);
        }
        Object obj = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.f22139c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.f22141e;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.f22138b;
            try {
                t0.n(obj);
                return b2.f124493a;
            } catch (Throwable th2) {
                th = th2;
                singleProcessDataStore.downstreamFlow.setValue(new h(th));
                throw th;
            }
        }
        t0.n(obj);
        try {
            singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.f22138b = this;
            singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.f22141e = 1;
            if (u(singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) == objH) {
                return objH;
            }
            return b2.f124493a;
        } catch (Throwable th3) {
            th = th3;
            singleProcessDataStore = this;
            singleProcessDataStore.downstreamFlow.setValue(new h(th));
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        SingleProcessDataStore$readAndInitOrPropagateFailure$1 singleProcessDataStore$readAndInitOrPropagateFailure$1;
        SingleProcessDataStore singleProcessDataStore;
        if (cVar instanceof SingleProcessDataStore$readAndInitOrPropagateFailure$1) {
            singleProcessDataStore$readAndInitOrPropagateFailure$1 = (SingleProcessDataStore$readAndInitOrPropagateFailure$1) cVar;
            int i10 = singleProcessDataStore$readAndInitOrPropagateFailure$1.f22145e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInitOrPropagateFailure$1.f22145e = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$readAndInitOrPropagateFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateFailure$1(this, cVar);
            }
        } else {
            singleProcessDataStore$readAndInitOrPropagateFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateFailure$1(this, cVar);
        }
        Object obj = singleProcessDataStore$readAndInitOrPropagateFailure$1.f22143c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = singleProcessDataStore$readAndInitOrPropagateFailure$1.f22145e;
        if (i11 == 0) {
            t0.n(obj);
            try {
                singleProcessDataStore$readAndInitOrPropagateFailure$1.f22142b = this;
                singleProcessDataStore$readAndInitOrPropagateFailure$1.f22145e = 1;
                if (u(singleProcessDataStore$readAndInitOrPropagateFailure$1) == objH) {
                    return objH;
                }
            } catch (Throwable th2) {
                th = th2;
                singleProcessDataStore = this;
                singleProcessDataStore.downstreamFlow.setValue(new h(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readAndInitOrPropagateFailure$1.f22142b;
            try {
                t0.n(obj);
            } catch (Throwable th3) {
                th = th3;
                singleProcessDataStore.downstreamFlow.setValue(new h(th));
            }
        }
        return b2.f124493a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.SingleProcessDataStore$readData$1, kotlin.coroutines.c] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream, java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.datastore.core.i, androidx.datastore.core.i<T>] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object x(kotlin.coroutines.c<? super T> cVar) throws Throwable {
        ?? singleProcessDataStore$readData$1;
        ?? fileInputStream;
        Throwable th2;
        ?? r10;
        if (cVar instanceof SingleProcessDataStore$readData$1) {
            SingleProcessDataStore$readData$1 singleProcessDataStore$readData$2 = (SingleProcessDataStore$readData$1) cVar;
            int i10 = singleProcessDataStore$readData$2.f22151g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readData$2.f22151g = i10 - Integer.MIN_VALUE;
                singleProcessDataStore$readData$1 = singleProcessDataStore$readData$2;
            } else {
                singleProcessDataStore$readData$1 = new SingleProcessDataStore$readData$1(this, cVar);
            }
        } else {
            singleProcessDataStore$readData$1 = new SingleProcessDataStore$readData$1(this, cVar);
        }
        Object obj = singleProcessDataStore$readData$1.f22149e;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = singleProcessDataStore$readData$1.f22151g;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = (Throwable) singleProcessDataStore$readData$1.f22148d;
                fileInputStream = (Closeable) singleProcessDataStore$readData$1.f22147c;
                singleProcessDataStore$readData$1 = (SingleProcessDataStore) singleProcessDataStore$readData$1.f22146b;
                try {
                    t0.n(obj);
                    r10 = fileInputStream;
                    kotlin.io.b.a(r10, th2);
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        kotlin.io.b.a(fileInputStream, th);
                        throw th4;
                    }
                }
            }
            t0.n(obj);
            try {
                fileInputStream = new FileInputStream(r());
                try {
                    i<T> iVar = this.serializer;
                    singleProcessDataStore$readData$1.f22146b = this;
                    singleProcessDataStore$readData$1.f22147c = fileInputStream;
                    singleProcessDataStore$readData$1.f22148d = null;
                    singleProcessDataStore$readData$1.f22151g = 1;
                    Object objU = iVar.u(fileInputStream, singleProcessDataStore$readData$1);
                    if (objU == objH) {
                        return objH;
                    }
                    th2 = null;
                    obj = objU;
                    r10 = fileInputStream;
                    kotlin.io.b.a(r10, th2);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    singleProcessDataStore$readData$1 = this;
                    throw th;
                }
            } catch (FileNotFoundException e10) {
                e = e10;
                singleProcessDataStore$readData$1 = this;
                if (singleProcessDataStore$readData$1.r().exists()) {
                    throw e;
                }
                return singleProcessDataStore$readData$1.serializer.s();
            }
        } catch (FileNotFoundException e11) {
            e = e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.datastore.core.SingleProcessDataStore, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore<T>, java.lang.Object] */
    public final Object y(kotlin.coroutines.c<? super T> cVar) throws Throwable {
        SingleProcessDataStore$readDataOrHandleCorruption$1 singleProcessDataStore$readDataOrHandleCorruption$1;
        ?? r10;
        Object objA;
        CorruptionException corruptionException;
        ?? r11;
        CorruptionException corruptionException2;
        if (cVar instanceof SingleProcessDataStore$readDataOrHandleCorruption$1) {
            singleProcessDataStore$readDataOrHandleCorruption$1 = (SingleProcessDataStore$readDataOrHandleCorruption$1) cVar;
            int i10 = singleProcessDataStore$readDataOrHandleCorruption$1.f22156f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readDataOrHandleCorruption$1.f22156f = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$readDataOrHandleCorruption$1 = new SingleProcessDataStore$readDataOrHandleCorruption$1(this, cVar);
            }
        } else {
            singleProcessDataStore$readDataOrHandleCorruption$1 = new SingleProcessDataStore$readDataOrHandleCorruption$1(this, cVar);
        }
        Object objX = singleProcessDataStore$readDataOrHandleCorruption$1.f22154d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = singleProcessDataStore$readDataOrHandleCorruption$1.f22156f;
        if (i11 == 0) {
            t0.n(objX);
            try {
                singleProcessDataStore$readDataOrHandleCorruption$1.f22152b = this;
                singleProcessDataStore$readDataOrHandleCorruption$1.f22156f = 1;
                objX = x(singleProcessDataStore$readDataOrHandleCorruption$1);
                return objX == objH ? objH : objX;
            } catch (CorruptionException e10) {
                e = e10;
                r10 = this;
                a<T> aVar = r10.corruptionHandler;
                singleProcessDataStore$readDataOrHandleCorruption$1.f22152b = r10;
                singleProcessDataStore$readDataOrHandleCorruption$1.f22153c = e;
                singleProcessDataStore$readDataOrHandleCorruption$1.f22156f = 2;
                objA = aVar.a(e, singleProcessDataStore$readDataOrHandleCorruption$1);
                if (objA == objH) {
                    return objH;
                }
                ?? r12 = r10;
                corruptionException = e;
                objX = objA;
                r11 = r12;
                singleProcessDataStore$readDataOrHandleCorruption$1.f22152b = corruptionException;
                singleProcessDataStore$readDataOrHandleCorruption$1.f22153c = objX;
                singleProcessDataStore$readDataOrHandleCorruption$1.f22156f = 3;
                if (r11.A(objX, singleProcessDataStore$readDataOrHandleCorruption$1) == objH) {
                    return objH;
                }
                return objX;
            }
        }
        if (i11 != 1) {
            if (i11 == 2) {
                corruptionException = (CorruptionException) singleProcessDataStore$readDataOrHandleCorruption$1.f22153c;
                SingleProcessDataStore singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readDataOrHandleCorruption$1.f22152b;
                t0.n(objX);
                r11 = singleProcessDataStore;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj = singleProcessDataStore$readDataOrHandleCorruption$1.f22153c;
                corruptionException2 = (CorruptionException) singleProcessDataStore$readDataOrHandleCorruption$1.f22152b;
                try {
                    t0.n(objX);
                    return obj;
                } catch (IOException e11) {
                    e = e11;
                }
            }
            o.a(corruptionException2, e);
            throw corruptionException2;
        }
        r10 = (SingleProcessDataStore) singleProcessDataStore$readDataOrHandleCorruption$1.f22152b;
        try {
            t0.n(objX);
        } catch (CorruptionException e12) {
            e = e12;
            a<T> aVar2 = r10.corruptionHandler;
            singleProcessDataStore$readDataOrHandleCorruption$1.f22152b = r10;
            singleProcessDataStore$readDataOrHandleCorruption$1.f22153c = e;
            singleProcessDataStore$readDataOrHandleCorruption$1.f22156f = 2;
            objA = aVar2.a(e, singleProcessDataStore$readDataOrHandleCorruption$1);
            if (objA == objH) {
                return objH;
            }
            ?? r13 = r10;
            corruptionException = e;
            objX = objA;
            r11 = r13;
            singleProcessDataStore$readDataOrHandleCorruption$1.f22152b = corruptionException;
            singleProcessDataStore$readDataOrHandleCorruption$1.f22153c = objX;
            singleProcessDataStore$readDataOrHandleCorruption$1.f22156f = 3;
            if (r11.A(objX, singleProcessDataStore$readDataOrHandleCorruption$1) == objH) {
                return objH;
            }
            return objX;
        }
        try {
            singleProcessDataStore$readDataOrHandleCorruption$1.f22152b = corruptionException;
            singleProcessDataStore$readDataOrHandleCorruption$1.f22153c = objX;
            singleProcessDataStore$readDataOrHandleCorruption$1.f22156f = 3;
            if (r11.A(objX, singleProcessDataStore$readDataOrHandleCorruption$1) == objH) {
                return objH;
            }
            return objX;
        } catch (IOException e13) {
            e = e13;
            corruptionException2 = corruptionException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(p<? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, CoroutineContext coroutineContext, kotlin.coroutines.c<? super T> cVar) throws Throwable {
        SingleProcessDataStore$transformAndWrite$1 singleProcessDataStore$transformAndWrite$1;
        androidx.p001datastore.core.b bVar;
        Object obj;
        SingleProcessDataStore singleProcessDataStore;
        SingleProcessDataStore singleProcessDataStore2;
        int iHashCode;
        if (cVar instanceof SingleProcessDataStore$transformAndWrite$1) {
            singleProcessDataStore$transformAndWrite$1 = (SingleProcessDataStore$transformAndWrite$1) cVar;
            int i10 = singleProcessDataStore$transformAndWrite$1.f22162g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$transformAndWrite$1.f22162g = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$transformAndWrite$1 = new SingleProcessDataStore$transformAndWrite$1(this, cVar);
            }
        } else {
            singleProcessDataStore$transformAndWrite$1 = new SingleProcessDataStore$transformAndWrite$1(this, cVar);
        }
        Object obj2 = singleProcessDataStore$transformAndWrite$1.f22160e;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = singleProcessDataStore$transformAndWrite$1.f22162g;
        if (i11 != 0) {
            if (i11 == 1) {
                obj = singleProcessDataStore$transformAndWrite$1.f22159d;
                bVar = (androidx.p001datastore.core.b) singleProcessDataStore$transformAndWrite$1.f22158c;
                SingleProcessDataStore singleProcessDataStore3 = (SingleProcessDataStore) singleProcessDataStore$transformAndWrite$1.f22157b;
                t0.n(obj2);
                singleProcessDataStore = singleProcessDataStore3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = singleProcessDataStore$transformAndWrite$1.f22158c;
                SingleProcessDataStore singleProcessDataStore4 = (SingleProcessDataStore) singleProcessDataStore$transformAndWrite$1.f22157b;
                t0.n(obj2);
                singleProcessDataStore2 = singleProcessDataStore4;
            }
            j<j<T>> jVar = singleProcessDataStore2.downstreamFlow;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            jVar.setValue(new androidx.p001datastore.core.b(obj, iHashCode));
            return obj;
        }
        t0.n(obj2);
        androidx.p001datastore.core.b bVar2 = (androidx.p001datastore.core.b) this.downstreamFlow.getValue();
        bVar2.a();
        Object objC = bVar2.c();
        SingleProcessDataStore$transformAndWrite$newData$1 singleProcessDataStore$transformAndWrite$newData$1 = new SingleProcessDataStore$transformAndWrite$newData$1(pVar, objC, null);
        singleProcessDataStore$transformAndWrite$1.f22157b = this;
        singleProcessDataStore$transformAndWrite$1.f22158c = bVar2;
        singleProcessDataStore$transformAndWrite$1.f22159d = objC;
        singleProcessDataStore$transformAndWrite$1.f22162g = 1;
        Object objH2 = i.h(coroutineContext, singleProcessDataStore$transformAndWrite$newData$1, singleProcessDataStore$transformAndWrite$1);
        if (objH2 == objH) {
            return objH;
        }
        bVar = bVar2;
        obj2 = objH2;
        obj = objC;
        singleProcessDataStore = this;
        bVar.a();
        if (!f0.g(obj, obj2)) {
            singleProcessDataStore$transformAndWrite$1.f22157b = singleProcessDataStore;
            singleProcessDataStore$transformAndWrite$1.f22158c = obj2;
            singleProcessDataStore$transformAndWrite$1.f22159d = null;
            singleProcessDataStore$transformAndWrite$1.f22162g = 2;
            if (singleProcessDataStore.A(obj2, singleProcessDataStore$transformAndWrite$1) == objH) {
                return objH;
            }
            obj = obj2;
            singleProcessDataStore2 = singleProcessDataStore;
            j<j<T>> jVar2 = singleProcessDataStore2.downstreamFlow;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            jVar2.setValue(new androidx.p001datastore.core.b(obj, iHashCode));
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.StringBuilder] */
    @dl.e
    public final Object A(T t10, @d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        SingleProcessDataStore$writeData$1 singleProcessDataStore$writeData$1;
        ?? file;
        ?? fileOutputStream;
        SingleProcessDataStore<T> singleProcessDataStore;
        ?? r10;
        Throwable th2;
        if (cVar instanceof SingleProcessDataStore$writeData$1) {
            singleProcessDataStore$writeData$1 = (SingleProcessDataStore$writeData$1) cVar;
            int i10 = singleProcessDataStore$writeData$1.f22173i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$writeData$1.f22173i = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$writeData$1 = new SingleProcessDataStore$writeData$1(this, cVar);
            }
        } else {
            singleProcessDataStore$writeData$1 = new SingleProcessDataStore$writeData$1(this, cVar);
        }
        Object obj = singleProcessDataStore$writeData$1.f22171g;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = singleProcessDataStore$writeData$1.f22173i;
        ?? r11 = 1;
        try {
            if (i11 == 0) {
                t0.n(obj);
                p(r());
                file = new File(f0.C(r().getAbsolutePath(), this.SCRATCH_SUFFIX));
                try {
                    fileOutputStream = new FileOutputStream((File) file);
                    try {
                        i<T> iVar = this.serializer;
                        c cVar2 = new c(fileOutputStream);
                        singleProcessDataStore$writeData$1.f22166b = this;
                        singleProcessDataStore$writeData$1.f22167c = file;
                        singleProcessDataStore$writeData$1.f22168d = fileOutputStream;
                        singleProcessDataStore$writeData$1.f22169e = null;
                        singleProcessDataStore$writeData$1.f22170f = fileOutputStream;
                        singleProcessDataStore$writeData$1.f22173i = 1;
                        if (iVar.t(t10, cVar2, singleProcessDataStore$writeData$1) == objH) {
                            return objH;
                        }
                        singleProcessDataStore = this;
                        r11 = file;
                        r10 = fileOutputStream;
                        th2 = null;
                        fileOutputStream = fileOutputStream;
                    } catch (Throwable th3) {
                        th = th3;
                        r11 = file;
                        throw th;
                    }
                } catch (IOException e10) {
                    e = e10;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                FileOutputStream fileOutputStream2 = (FileOutputStream) singleProcessDataStore$writeData$1.f22170f;
                th2 = (Throwable) singleProcessDataStore$writeData$1.f22169e;
                fileOutputStream = (Closeable) singleProcessDataStore$writeData$1.f22168d;
                r11 = (File) singleProcessDataStore$writeData$1.f22167c;
                singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$writeData$1.f22166b;
                try {
                    t0.n(obj);
                    fileOutputStream = fileOutputStream;
                    r11 = r11;
                    r10 = fileOutputStream2;
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        throw th;
                    } catch (Throwable th5) {
                        kotlin.io.b.a(fileOutputStream, th);
                        throw th5;
                    }
                }
            }
            r10.getFD().sync();
            b2 b2Var = b2.f124493a;
            kotlin.io.b.a(fileOutputStream, th2);
            if (r11.renameTo(singleProcessDataStore.r())) {
                return b2Var;
            }
            throw new IOException("Unable to rename " + r11 + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
        } catch (IOException e11) {
            e = e11;
            file = r11;
        }
    }

    @Override // androidx.p001datastore.core.d
    @dl.e
    public Object a(@d p<? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @d kotlin.coroutines.c<? super T> cVar) {
        y yVarC = a0.c(null, 1, null);
        this.actor.e(new b.C0156b(pVar, yVarC, this.downstreamFlow.getValue(), cVar.getContext()));
        return yVarC.p(cVar);
    }

    @Override // androidx.p001datastore.core.d
    @d
    public e<T> getData() {
        return this.data;
    }
}
