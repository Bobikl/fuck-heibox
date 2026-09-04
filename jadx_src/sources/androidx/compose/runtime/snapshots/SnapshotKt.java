package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.i2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.r0;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0000\u001a\b\u0010\t\u001a\u00020\bH\u0000\u001a4\u0010\u0010\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002\u001aL\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0002\u001aB\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0002\u001a'\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0081\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a@\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u001b\u001a\u00020\b2!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a8\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b \u0010!\u001a\b\u0010\"\u001a\u00020\u0006H\u0002\u001a<\u0010#\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020\b2!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b#\u0010$\u001a\u0010\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\bH\u0002\u001a \u0010)\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a \u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a3\u0010.\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0016*\u00020*2\u0006\u0010-\u001a\u00028\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b.\u0010/\u001a#\u00102\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020**\u00028\u00002\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103\u001a+\u0010\u0016\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020**\u00028\u00002\u0006\u00101\u001a\u0002002\u0006\u0010%\u001a\u00020\b¢\u0006\u0004\b\u0016\u00104\u001a\b\u00106\u001a\u000205H\u0002\u001a\u0012\u00107\u001a\u0004\u0018\u00010*2\u0006\u00101\u001a\u000200H\u0002\u001a-\u00108\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020**\u00028\u00002\u0006\u00101\u001a\u0002002\u0006\u0010%\u001a\u00020\bH\u0001¢\u0006\u0004\b8\u00104\u001a5\u0010:\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020**\u00028\u00002\u0006\u00101\u001a\u0002002\u0006\u0010%\u001a\u00020\b2\u0006\u00109\u001a\u00028\u0000H\u0000¢\u0006\u0004\b:\u0010;\u001a-\u0010<\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020**\u00028\u00002\u0006\u00101\u001a\u0002002\u0006\u0010%\u001a\u00020\bH\u0000¢\u0006\u0004\b<\u00104\u001a%\u0010=\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020**\u00028\u00002\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b=\u00103\u001a\u0018\u0010>\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\b2\u0006\u00101\u001a\u000200H\u0001\u001aP\u0010@\u001a\u00028\u0001\"\b\b\u0000\u0010\u0016*\u00020*\"\u0004\b\u0001\u0010.*\u00028\u00002\u0006\u00101\u001a\u0002002\u0006\u0010%\u001a\u00020\b2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0002\b?H\u0086\bø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001aH\u0010B\u001a\u00028\u0001\"\b\b\u0000\u0010\u0016*\u00020*\"\u0004\b\u0001\u0010.*\u00028\u00002\u0006\u00101\u001a\u0002002\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0002\b?H\u0086\bø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001aP\u0010D\u001a\u00028\u0001\"\b\b\u0000\u0010\u0016*\u00020*\"\u0004\b\u0001\u0010.*\u00028\u00002\u0006\u00101\u001a\u0002002\u0006\u00109\u001a\u00028\u00002\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0002\b?H\u0080\bø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001a.\u0010J\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*\u0018\u00010I2\u0006\u0010'\u001a\u00020F2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020\u0002H\u0002\u001a\b\u0010K\u001a\u000205H\u0002\u001a)\u0010L\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020*2\u0006\u0010-\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\bH\u0001¢\u0006\u0004\bL\u0010M\u001a!\u0010N\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020*2\u0006\u0010-\u001a\u00028\u0000H\u0001¢\u0006\u0004\bN\u0010O\u001aJ\u0010P\u001a\u00028\u0001\"\b\b\u0000\u0010\u0016*\u00020*\"\u0004\b\u0001\u0010.*\u00028\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(-\u0012\u0004\u0012\u00028\u00010\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\bP\u0010Q\u001a\u001c\u0010T\u001a\u00020\u0002*\u00020\u00022\u0006\u0010R\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\u0000H\u0000\"\u0014\u0010W\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bU\u0010V\"\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\b0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z\" \u0010b\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\\\u0010]\u0012\u0004\b`\u0010a\u001a\u0004\b^\u0010_\"\u0016\u0010e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010d\"\u0016\u0010g\u001a\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010V\"\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010j\"2\u0010q\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0n\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060m0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010p\"&\u0010s\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010p\"4\u0010z\u001a\"\u0012\f\u0012\n v*\u0004\u0018\u00010u0u0tj\u0010\u0012\f\u0012\n v*\u0004\u0018\u00010u0u`w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010y\"!\u0010\u0080\u0001\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b{\u0010|\u0012\u0004\b\u007f\u0010a\u001a\u0004\b}\u0010~\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0081\u0001"}, d2 = {"", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Z", "handle", "Lkotlin/b2;", "U", "Landroidx/compose/runtime/snapshots/f;", "C", "previousSnapshot", "Lkotlin/Function1;", "", "readObserver", "", "ownsPreviousSnapshot", "y", "parentObserver", "mergeReadObserver", "H", "writeObserver", "J", androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function0;", "block", androidx.exifinterface.media.a.T4, "(Lyh/a;)Ljava/lang/Object;", "previousGlobalSnapshot", "Lkotlin/m0;", "name", "X", "(Landroidx/compose/runtime/snapshots/f;Lyh/l;)Ljava/lang/Object;", RXScreenCaptureService.KEY_WIDTH, "(Lyh/l;)Ljava/lang/Object;", "x", "Y", "(Lyh/l;)Landroidx/compose/runtime/snapshots/f;", "snapshot", "d0", "currentSnapshot", "candidateSnapshot", "b0", "Landroidx/compose/runtime/snapshots/c0;", "data", "c0", "r", "R", "(Landroidx/compose/runtime/snapshots/c0;ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/c0;", "Landroidx/compose/runtime/snapshots/b0;", "state", androidx.exifinterface.media.a.R4, "(Landroidx/compose/runtime/snapshots/c0;Landroidx/compose/runtime/snapshots/b0;)Landroidx/compose/runtime/snapshots/c0;", "(Landroidx/compose/runtime/snapshots/c0;Landroidx/compose/runtime/snapshots/b0;Landroidx/compose/runtime/snapshots/f;)Landroidx/compose/runtime/snapshots/c0;", "", "Q", "a0", "h0", "candidate", "P", "(Landroidx/compose/runtime/snapshots/c0;Landroidx/compose/runtime/snapshots/b0;Landroidx/compose/runtime/snapshots/f;Landroidx/compose/runtime/snapshots/c0;)Landroidx/compose/runtime/snapshots/c0;", "L", "K", "M", "Lkotlin/t;", "f0", "(Landroidx/compose/runtime/snapshots/c0;Landroidx/compose/runtime/snapshots/b0;Landroidx/compose/runtime/snapshots/f;Lyh/l;)Ljava/lang/Object;", "g0", "(Landroidx/compose/runtime/snapshots/c0;Landroidx/compose/runtime/snapshots/b0;Lyh/l;)Ljava/lang/Object;", "O", "(Landroidx/compose/runtime/snapshots/c0;Landroidx/compose/runtime/snapshots/b0;Landroidx/compose/runtime/snapshots/c0;Lyh/l;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/b;", "applyingSnapshot", "invalidSnapshots", "", "N", androidx.exifinterface.media.a.X4, "B", "(Landroidx/compose/runtime/snapshots/c0;Landroidx/compose/runtime/snapshots/f;)Landroidx/compose/runtime/snapshots/c0;", androidx.exifinterface.media.a.W4, "(Landroidx/compose/runtime/snapshots/c0;)Landroidx/compose/runtime/snapshots/c0;", "e0", "(Landroidx/compose/runtime/snapshots/c0;Lyh/l;)Ljava/lang/Object;", "from", "until", "v", "b", "I", "INVALID_SNAPSHOT", "Landroidx/compose/runtime/i2;", ak.aF, "Landroidx/compose/runtime/i2;", "threadSnapshot", "d", "Ljava/lang/Object;", "D", "()Ljava/lang/Object;", "getLock$annotations", "()V", "lock", "e", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "openSnapshots", "f", "nextSnapshotId", "Landroidx/compose/runtime/snapshots/k;", "g", "Landroidx/compose/runtime/snapshots/k;", "pinningTable", "", "Lkotlin/Function2;", "", RXScreenCaptureService.KEY_HEIGHT, "Ljava/util/List;", "applyObservers", "i", "globalWriteObservers", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "j", "Ljava/util/concurrent/atomic/AtomicReference;", "currentGlobalSnapshot", "k", "Landroidx/compose/runtime/snapshots/f;", "F", "()Landroidx/compose/runtime/snapshots/f;", "getSnapshotInitializer$annotations", "snapshotInitializer", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class SnapshotKt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f13166b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static SnapshotIdSet f13169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f13170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final k f13171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final List<yh.p<Set<? extends Object>, f, b2>> f13172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final List<yh.l<Object, b2>> f13173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final AtomicReference<GlobalSnapshot> f13174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final f f13175k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final yh.l<SnapshotIdSet, b2> f13165a = new yh.l<SnapshotIdSet, b2>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$emptyLambda$1
        public final void a(@dl.d SnapshotIdSet it) {
            kotlin.jvm.internal.f0.p(it, "it");
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ b2 invoke(SnapshotIdSet snapshotIdSet) {
            a(snapshotIdSet);
            return b2.f124493a;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final i2<f> f13167c = new i2<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final Object f13168d = new Object();

    static {
        SnapshotIdSet.Companion aVar = SnapshotIdSet.INSTANCE;
        f13169e = aVar.a();
        f13170f = 1;
        f13171g = new k();
        f13172h = new ArrayList();
        f13173i = new ArrayList();
        int i10 = f13170f;
        f13170f = i10 + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i10, aVar.a());
        f13169e = f13169e.w(globalSnapshot.getId());
        AtomicReference<GlobalSnapshot> atomicReference = new AtomicReference<>(globalSnapshot);
        f13174j = atomicReference;
        GlobalSnapshot globalSnapshot2 = atomicReference.get();
        kotlin.jvm.internal.f0.o(globalSnapshot2, "currentGlobalSnapshot.get()");
        f13175k = globalSnapshot2;
    }

    @dl.d
    @r0
    public static final <T extends c0> T A(@dl.d T r10) {
        T t10;
        kotlin.jvm.internal.f0.p(r10, "r");
        f.Companion aVar = f.INSTANCE;
        f fVarB = aVar.b();
        T t11 = (T) R(r10, fVarB.getId(), fVarB.getInvalid());
        if (t11 != null) {
            return t11;
        }
        synchronized (D()) {
            f fVarB2 = aVar.b();
            t10 = (T) R(r10, fVarB2.getId(), fVarB2.getInvalid());
        }
        if (t10 != null) {
            return t10;
        }
        Q();
        throw new KotlinNothingValueException();
    }

    @dl.d
    @r0
    public static final <T extends c0> T B(@dl.d T r10, @dl.d f snapshot) {
        kotlin.jvm.internal.f0.p(r10, "r");
        kotlin.jvm.internal.f0.p(snapshot, "snapshot");
        T t10 = (T) R(r10, snapshot.getId(), snapshot.getInvalid());
        if (t10 != null) {
            return t10;
        }
        Q();
        throw new KotlinNothingValueException();
    }

    @dl.d
    public static final f C() {
        f fVarA = f13167c.a();
        if (fVarA != null) {
            return fVarA;
        }
        GlobalSnapshot globalSnapshot = f13174j.get();
        kotlin.jvm.internal.f0.o(globalSnapshot, "currentGlobalSnapshot.get()");
        return globalSnapshot;
    }

    @dl.d
    public static final Object D() {
        return f13168d;
    }

    @r0
    public static /* synthetic */ void E() {
    }

    @dl.d
    public static final f F() {
        return f13175k;
    }

    @r0
    public static /* synthetic */ void G() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yh.l<Object, b2> H(final yh.l<Object, b2> lVar, final yh.l<Object, b2> lVar2, boolean z10) {
        if (!z10) {
            lVar2 = null;
        }
        if (lVar == null || lVar2 == null || kotlin.jvm.internal.f0.g(lVar, lVar2)) {
            return lVar == null ? lVar2 : lVar;
        }
        return new yh.l<Object, b2>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$mergedReadObserver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Object obj) {
                invoke2(obj);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.d Object state) {
                kotlin.jvm.internal.f0.p(state, "state");
                lVar.invoke(state);
                lVar2.invoke(state);
            }
        };
    }

    static /* synthetic */ yh.l I(yh.l lVar, yh.l lVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return H(lVar, lVar2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yh.l<Object, b2> J(final yh.l<Object, b2> lVar, final yh.l<Object, b2> lVar2) {
        if (lVar == null || lVar2 == null || kotlin.jvm.internal.f0.g(lVar, lVar2)) {
            return lVar == null ? lVar2 : lVar;
        }
        return new yh.l<Object, b2>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$mergedWriteObserver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Object obj) {
                invoke2(obj);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.d Object state) {
                kotlin.jvm.internal.f0.p(state, "state");
                lVar.invoke(state);
                lVar2.invoke(state);
            }
        };
    }

    @dl.d
    public static final <T extends c0> T K(@dl.d T t10, @dl.d b0 state) {
        kotlin.jvm.internal.f0.p(t10, "<this>");
        kotlin.jvm.internal.f0.p(state, "state");
        T t11 = (T) a0(state);
        if (t11 != null) {
            t11.f(Integer.MAX_VALUE);
            return t11;
        }
        T t12 = (T) t10.b();
        t12.f(Integer.MAX_VALUE);
        t12.e(state.getFirstStateRecord());
        kotlin.jvm.internal.f0.n(t12, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecord$lambda-8");
        state.h(t12);
        kotlin.jvm.internal.f0.n(t12, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecord");
        return t12;
    }

    @dl.d
    public static final <T extends c0> T L(@dl.d T t10, @dl.d b0 state, @dl.d f snapshot) {
        kotlin.jvm.internal.f0.p(t10, "<this>");
        kotlin.jvm.internal.f0.p(state, "state");
        kotlin.jvm.internal.f0.p(snapshot, "snapshot");
        T t11 = (T) K(t10, state);
        t11.a(t10);
        t11.f(snapshot.getId());
        return t11;
    }

    @r0
    public static final void M(@dl.d f snapshot, @dl.d b0 state) {
        kotlin.jvm.internal.f0.p(snapshot, "snapshot");
        kotlin.jvm.internal.f0.p(state, "state");
        yh.l<Object, b2> lVarM = snapshot.m();
        if (lVarM != null) {
            lVarM.invoke(state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<c0, c0> N(b bVar, b bVar2, SnapshotIdSet snapshotIdSet) {
        c0 c0VarR;
        Set<b0> setI = bVar2.i();
        int iG = bVar.getId();
        if (setI == null) {
            return null;
        }
        SnapshotIdSet snapshotIdSetV = bVar2.getInvalid().w(bVar2.getId()).v(bVar2.L());
        HashMap map = null;
        for (b0 b0Var : setI) {
            c0 c0VarL = b0Var.getFirstStateRecord();
            c0 c0VarR2 = R(c0VarL, iG, snapshotIdSet);
            if (c0VarR2 != null && (c0VarR = R(c0VarL, iG, snapshotIdSetV)) != null && !kotlin.jvm.internal.f0.g(c0VarR2, c0VarR)) {
                c0 c0VarR3 = R(c0VarL, bVar2.getId(), bVar2.getInvalid());
                if (c0VarR3 == null) {
                    Q();
                    throw new KotlinNothingValueException();
                }
                c0 c0VarJ = b0Var.j(c0VarR, c0VarR2, c0VarR3);
                if (c0VarJ == null) {
                    return null;
                }
                if (map == null) {
                    map = new HashMap();
                }
                map.put(c0VarR2, c0VarJ);
                map = map;
            }
        }
        return map;
    }

    public static final <T extends c0, R> R O(@dl.d T t10, @dl.d b0 state, @dl.d T candidate, @dl.d yh.l<? super T, ? extends R> block) {
        f fVarB;
        R rInvoke;
        kotlin.jvm.internal.f0.p(t10, "<this>");
        kotlin.jvm.internal.f0.p(state, "state");
        kotlin.jvm.internal.f0.p(candidate, "candidate");
        kotlin.jvm.internal.f0.p(block, "block");
        F();
        synchronized (D()) {
            try {
                fVarB = f.INSTANCE.b();
                rInvoke = block.invoke(P(t10, state, fVarB, candidate));
                kotlin.jvm.internal.c0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.c0.d(1);
                kotlin.jvm.internal.c0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.c0.c(1);
        M(fVarB, state);
        return rInvoke;
    }

    @dl.d
    public static final <T extends c0> T P(@dl.d T t10, @dl.d b0 state, @dl.d f snapshot, @dl.d T candidate) {
        kotlin.jvm.internal.f0.p(t10, "<this>");
        kotlin.jvm.internal.f0.p(state, "state");
        kotlin.jvm.internal.f0.p(snapshot, "snapshot");
        kotlin.jvm.internal.f0.p(candidate, "candidate");
        if (snapshot.k()) {
            snapshot.t(state);
        }
        int iG = snapshot.getId();
        if (candidate.getSnapshotId() == iG) {
            return candidate;
        }
        T t11 = (T) K(t10, state);
        t11.f(iG);
        snapshot.t(state);
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void Q() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends c0> T R(T t10, int i10, SnapshotIdSet snapshotIdSet) {
        T t11 = null;
        while (t10 != null) {
            if (c0(t10, i10, snapshotIdSet) && (t11 == null || t11.getSnapshotId() < t10.getSnapshotId())) {
                t11 = t10;
            }
            t10 = (T) t10.getNext();
        }
        if (t11 != null) {
            return t11;
        }
        return null;
    }

    @dl.d
    public static final <T extends c0> T S(@dl.d T t10, @dl.d b0 state) {
        T t11;
        kotlin.jvm.internal.f0.p(t10, "<this>");
        kotlin.jvm.internal.f0.p(state, "state");
        f.Companion aVar = f.INSTANCE;
        f fVarB = aVar.b();
        yh.l<Object, b2> lVarJ = fVarB.j();
        if (lVarJ != null) {
            lVarJ.invoke(state);
        }
        T t12 = (T) R(t10, fVarB.getId(), fVarB.getInvalid());
        if (t12 != null) {
            return t12;
        }
        synchronized (D()) {
            f fVarB2 = aVar.b();
            t11 = (T) R(t10, fVarB2.getId(), fVarB2.getInvalid());
        }
        if (t11 != null) {
            return t11;
        }
        Q();
        throw new KotlinNothingValueException();
    }

    @dl.d
    public static final <T extends c0> T T(@dl.d T t10, @dl.d b0 state, @dl.d f snapshot) {
        kotlin.jvm.internal.f0.p(t10, "<this>");
        kotlin.jvm.internal.f0.p(state, "state");
        kotlin.jvm.internal.f0.p(snapshot, "snapshot");
        yh.l<Object, b2> lVarJ = snapshot.j();
        if (lVarJ != null) {
            lVarJ.invoke(state);
        }
        T t11 = (T) R(t10, snapshot.getId(), snapshot.getInvalid());
        if (t11 != null) {
            return t11;
        }
        Q();
        throw new KotlinNothingValueException();
    }

    public static final void U(int i10) {
        f13171g.h(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void V() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @r0
    public static final <T> T W(@dl.d yh.a<? extends T> block) {
        T tInvoke;
        kotlin.jvm.internal.f0.p(block, "block");
        synchronized (D()) {
            try {
                tInvoke = block.invoke();
                kotlin.jvm.internal.c0.d(1);
            } finally {
                kotlin.jvm.internal.c0.d(1);
                kotlin.jvm.internal.c0.c(1);
            }
        }
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T X(f fVar, yh.l<? super SnapshotIdSet, ? extends T> lVar) {
        T tInvoke = lVar.invoke(f13169e.l(fVar.getId()));
        synchronized (D()) {
            int i10 = f13170f;
            f13170f = i10 + 1;
            f13169e = f13169e.l(fVar.getId());
            f13174j.set(new GlobalSnapshot(i10, f13169e));
            fVar.d();
            f13169e = f13169e.w(i10);
            b2 b2Var = b2.f124493a;
        }
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends f> T Y(final yh.l<? super SnapshotIdSet, ? extends T> lVar) {
        return (T) w(new yh.l<SnapshotIdSet, T>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$takeNewSnapshot$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)TT; */
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f invoke(@dl.d SnapshotIdSet invalid) {
                kotlin.jvm.internal.f0.p(invalid, "invalid");
                f fVar = (f) lVar.invoke(invalid);
                synchronized (SnapshotKt.D()) {
                    SnapshotKt.f13169e = SnapshotKt.f13169e.w(fVar.getId());
                    b2 b2Var = b2.f124493a;
                }
                return fVar;
            }
        });
    }

    public static final int Z(int i10, @dl.d SnapshotIdSet invalid) {
        int iA;
        kotlin.jvm.internal.f0.p(invalid, "invalid");
        int iU = invalid.u(i10);
        synchronized (D()) {
            iA = f13171g.a(iU);
        }
        return iA;
    }

    private static final c0 a0(b0 b0Var) {
        int iF = f13171g.f(f13170f) - 1;
        SnapshotIdSet snapshotIdSetA = SnapshotIdSet.INSTANCE.a();
        c0 c0Var = null;
        for (c0 c0VarL = b0Var.getFirstStateRecord(); c0VarL != null; c0VarL = c0VarL.getNext()) {
            if (c0VarL.getSnapshotId() == 0) {
                return c0VarL;
            }
            if (c0(c0VarL, iF, snapshotIdSetA)) {
                if (c0Var != null) {
                    return c0VarL.getSnapshotId() < c0Var.getSnapshotId() ? c0VarL : c0Var;
                }
                c0Var = c0VarL;
            }
        }
        return null;
    }

    private static final boolean b0(int i10, int i11, SnapshotIdSet snapshotIdSet) {
        return (i11 == 0 || i11 > i10 || snapshotIdSet.s(i11)) ? false : true;
    }

    private static final boolean c0(c0 c0Var, int i10, SnapshotIdSet snapshotIdSet) {
        return b0(i10, c0Var.getSnapshotId(), snapshotIdSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(f fVar) {
        if (!f13169e.s(fVar.getId())) {
            throw new IllegalStateException("Snapshot is not open".toString());
        }
    }

    public static final <T extends c0, R> R e0(@dl.d T t10, @dl.d yh.l<? super T, ? extends R> block) {
        kotlin.jvm.internal.f0.p(t10, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        return block.invoke(A(t10));
    }

    public static final <T extends c0, R> R f0(@dl.d T t10, @dl.d b0 state, @dl.d f snapshot, @dl.d yh.l<? super T, ? extends R> block) {
        R rInvoke;
        kotlin.jvm.internal.f0.p(t10, "<this>");
        kotlin.jvm.internal.f0.p(state, "state");
        kotlin.jvm.internal.f0.p(snapshot, "snapshot");
        kotlin.jvm.internal.f0.p(block, "block");
        synchronized (D()) {
            try {
                rInvoke = block.invoke(h0(t10, state, snapshot));
                kotlin.jvm.internal.c0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.c0.d(1);
                kotlin.jvm.internal.c0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.c0.c(1);
        M(snapshot, state);
        return rInvoke;
    }

    public static final <T extends c0, R> R g0(@dl.d T t10, @dl.d b0 state, @dl.d yh.l<? super T, ? extends R> block) {
        f fVarB;
        R rInvoke;
        kotlin.jvm.internal.f0.p(t10, "<this>");
        kotlin.jvm.internal.f0.p(state, "state");
        kotlin.jvm.internal.f0.p(block, "block");
        F();
        synchronized (D()) {
            try {
                fVarB = f.INSTANCE.b();
                rInvoke = block.invoke(h0(t10, state, fVarB));
                kotlin.jvm.internal.c0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.c0.d(1);
                kotlin.jvm.internal.c0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.c0.c(1);
        M(fVarB, state);
        return rInvoke;
    }

    @dl.d
    @r0
    public static final <T extends c0> T h0(@dl.d T t10, @dl.d b0 state, @dl.d f snapshot) {
        kotlin.jvm.internal.f0.p(t10, "<this>");
        kotlin.jvm.internal.f0.p(state, "state");
        kotlin.jvm.internal.f0.p(snapshot, "snapshot");
        if (snapshot.k()) {
            snapshot.t(state);
        }
        T t11 = (T) R(t10, snapshot.getId(), snapshot.getInvalid());
        if (t11 == null) {
            Q();
            throw new KotlinNothingValueException();
        }
        if (t11.getSnapshotId() == snapshot.getId()) {
            return t11;
        }
        T t12 = (T) L(t11, state, snapshot);
        snapshot.t(state);
        return t12;
    }

    @dl.d
    public static final SnapshotIdSet v(@dl.d SnapshotIdSet snapshotIdSet, int i10, int i11) {
        kotlin.jvm.internal.f0.p(snapshotIdSet, "<this>");
        while (i10 < i11) {
            snapshotIdSet = snapshotIdSet.w(i10);
            i10++;
        }
        return snapshotIdSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T w(yh.l<? super SnapshotIdSet, ? extends T> lVar) {
        GlobalSnapshot globalSnapshot;
        T t10;
        List listT5;
        f fVar = f13175k;
        kotlin.jvm.internal.f0.n(fVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (D()) {
            globalSnapshot = f13174j.get();
            kotlin.jvm.internal.f0.o(globalSnapshot, "currentGlobalSnapshot.get()");
            t10 = (T) X(globalSnapshot, lVar);
        }
        Set<b0> setI = globalSnapshot.i();
        if (setI != null) {
            synchronized (D()) {
                listT5 = CollectionsKt___CollectionsKt.T5(f13172h);
            }
            int size = listT5.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((yh.p) listT5.get(i10)).invoke(setI, globalSnapshot);
            }
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x() {
        w(new yh.l<SnapshotIdSet, b2>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$advanceGlobalSnapshot$2
            public final void a(@dl.d SnapshotIdSet it) {
                kotlin.jvm.internal.f0.p(it, "it");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(SnapshotIdSet snapshotIdSet) {
                a(snapshotIdSet);
                return b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f y(f fVar, yh.l<Object, b2> lVar, boolean z10) {
        boolean z11 = fVar instanceof b;
        if (z11 || fVar == null) {
            return new e0(z11 ? (b) fVar : null, lVar, null, false, z10);
        }
        return new f0(fVar, lVar, false, z10);
    }

    static /* synthetic */ f z(f fVar, yh.l lVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return y(fVar, lVar, z10);
    }
}
