package androidx.compose.runtime;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 »\u00012\u00020\u0001:\u0006H[im¼\u0001B\u0011\u0012\u0006\u0010s\u001a\u00020?¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u001d\u0010\t\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006H\u0082\bJ\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J*\u0010\u0013\u001a\u00020\u00032\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0002J#\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJQ\u0010'\u001a\u00020\u00032<\u0010&\u001a8\b\u0001\u0012\u0004\u0012\u00020 \u0012\u0013\u0012\u00110\u0017¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030#\u0012\u0006\u0012\u0004\u0018\u00010$0\u001f¢\u0006\u0002\b%H\u0082@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0007H\u0002J\"\u0010-\u001a\u0004\u0018\u00010\u00072\u0006\u0010)\u001a\u00020\u00072\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010+H\u0002J,\u00101\u001a\b\u0012\u0004\u0012\u00020\u00070.2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010+H\u0002J\b\u00102\u001a\u00020\u0003H\u0002J\u001c\u00103\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010)\u001a\u00020\u0007H\u0002J,\u00104\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010)\u001a\u00020\u00072\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010+H\u0002J<\u00107\u001a\u00028\u0000\"\u0004\b\u0000\u001052\u0006\u0010)\u001a\u00020\u00072\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010+2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0082\b¢\u0006\u0004\b7\u00108J\u0010\u0010;\u001a\u00020\u00032\u0006\u0010:\u001a\u000209H\u0002J\u0006\u0010=\u001a\u00020<J\u0013\u0010>\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b>\u0010\u001eJ\u001b\u0010A\u001a\u00020\u00032\u0006\u0010@\u001a\u00020?H\u0087@ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\u0006\u0010C\u001a\u00020\u0003J\u0006\u0010D\u001a\u00020\u0003J\u0013\u0010E\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\bE\u0010\u001eJ*\u0010H\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00072\u0011\u0010G\u001a\r\u0012\u0004\u0012\u00020\u000306¢\u0006\u0002\bFH\u0010¢\u0006\u0004\bH\u0010IJ\u0013\u0010J\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\bJ\u0010\u001eJ\u001d\u0010N\u001a\u00020\u00032\f\u0010M\u001a\b\u0012\u0004\u0012\u00020L0KH\u0010¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0007H\u0010¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0007H\u0010¢\u0006\u0004\bR\u0010QJ\u0017\u0010S\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0007H\u0010¢\u0006\u0004\bS\u0010QJ\u0017\u0010V\u001a\u00020\u00032\u0006\u0010U\u001a\u00020TH\u0010¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020\u00032\u0006\u0010X\u001a\u00020/H\u0010¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020\u00032\u0006\u0010X\u001a\u00020/H\u0010¢\u0006\u0004\b[\u0010ZJ\u001f\u0010^\u001a\u00020\u00032\u0006\u0010X\u001a\u00020/2\u0006\u0010]\u001a\u00020\\H\u0010¢\u0006\u0004\b^\u0010_J\u0019\u0010`\u001a\u0004\u0018\u00010\\2\u0006\u0010X\u001a\u00020/H\u0010¢\u0006\u0004\b`\u0010aR$\u0010g\u001a\u00020b2\u0006\u0010c\u001a\u00020b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b[\u0010d\u001a\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u001a\u0010s\u001a\u00020?8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000f\u0010p\u001a\u0004\bq\u0010rR\u0014\u0010v\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010x\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010wR\u0018\u0010|\u001a\u0004\u0018\u00010y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00070}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010~R\"\u0010\u0081\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020$0\u0080\u00010}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010~R\u001b\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010~R\u001b\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010~R\u001b\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020/0}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010~R2\u0010\u0088\u0001\u001a\u001e\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010$0\u0086\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0}0\u0085\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bN\u0010\u0087\u0001R$\u0010\u008a\u0001\u001a\u000f\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\\0\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0087\u0001R\u001f\u0010\u008b\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010~R!\u0010\u008e\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001a\u0010\u0092\u0001\u001a\u00030\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0094\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bR\u0010\u0093\u0001R\u001b\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001f\u0010\u009c\u0001\u001a\n\u0012\u0005\u0012\u00030\u0099\u00010\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001c\u0010 \u0001\u001a\u00070\u009d\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0017\u0010£\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0017\u0010¥\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¢\u0001R\u0017\u0010§\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010¢\u0001R\u0017\u0010©\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010¢\u0001R\u0014\u0010@\u001a\u00020?8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bz\u0010rR'\u0010¯\u0001\u001a\n\u0012\u0005\u0012\u00030\u0099\u00010ª\u00018FX\u0087\u0004¢\u0006\u0010\u0012\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R\u001c\u0010³\u0001\u001a\n\u0012\u0005\u0012\u00030\u0099\u00010°\u00018F¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R\u0014\u0010µ\u0001\u001a\u00020\u00118F¢\u0006\b\u001a\u0006\b´\u0001\u0010¢\u0001R\u0017\u0010·\u0001\u001a\u00030\u008f\u00018PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bt\u0010¶\u0001R\u0016\u0010¸\u0001\u001a\u00020\u00118PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bm\u0010¢\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006½\u0001"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/r;", "Lkotlinx/coroutines/p;", "Lkotlin/b2;", "l0", "F0", "Lkotlin/Function1;", "Landroidx/compose/runtime/z;", "onEachInvalidComposition", "G0", "Lkotlinx/coroutines/d2;", "callingJob", "H0", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "failedInitialComposition", "", "recoverable", "B0", "Landroidx/compose/runtime/Recomposer$c;", "I0", "J0", "Landroidx/compose/runtime/w0;", "parentFrameClock", "Landroidx/compose/runtime/h1;", "frameSignal", "K0", "(Landroidx/compose/runtime/w0;Landroidx/compose/runtime/h1;Lkotlin/coroutines/c;)Ljava/lang/Object;", "h0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlinx/coroutines/q0;", "Lkotlin/m0;", "name", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "block", "E0", "(Lyh/q;Lkotlin/coroutines/c;)Ljava/lang/Object;", "composition", "x0", "Landroidx/compose/runtime/collection/c;", "modifiedValues", "A0", "", "Landroidx/compose/runtime/z0;", "references", "z0", "m0", "D0", "N0", androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function0;", "k0", "(Landroidx/compose/runtime/z;Landroidx/compose/runtime/collection/c;Lyh/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/b;", "snapshot", "e0", "Landroidx/compose/runtime/q1;", "f0", "L0", "Lkotlin/coroutines/CoroutineContext;", "recomposeCoroutineContext", "M0", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/c;)Ljava/lang/Object;", "i0", "j0", "w0", "Landroidx/compose/runtime/h;", "content", ak.av, "(Landroidx/compose/runtime/z;Lyh/p;)V", "g0", "", "Landroidx/compose/runtime/tooling/b;", "table", "n", "(Ljava/util/Set;)V", "p", "(Landroidx/compose/runtime/z;)V", ak.aB, "j", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "k", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "reference", "i", "(Landroidx/compose/runtime/z0;)V", "b", "Landroidx/compose/runtime/y0;", "data", "l", "(Landroidx/compose/runtime/z0;Landroidx/compose/runtime/y0;)V", "m", "(Landroidx/compose/runtime/z0;)Landroidx/compose/runtime/y0;", "", "<set-?>", "J", "n0", "()J", "changeCount", "Landroidx/compose/runtime/BroadcastFrameClock;", ak.aF, "Landroidx/compose/runtime/BroadcastFrameClock;", "broadcastFrameClock", "Lkotlinx/coroutines/b0;", "d", "Lkotlinx/coroutines/b0;", "effectJob", "Lkotlin/coroutines/CoroutineContext;", "g", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "f", "Ljava/lang/Object;", "stateLock", "Lkotlinx/coroutines/d2;", "runnerJob", "", RXScreenCaptureService.KEY_HEIGHT, "Ljava/lang/Throwable;", "closeCause", "", "Ljava/util/List;", "knownCompositions", "", "snapshotInvalidations", "compositionInvalidations", "compositionsAwaitingApply", "compositionValuesAwaitingInsert", "", "Landroidx/compose/runtime/x0;", "Ljava/util/Map;", "compositionValuesRemoved", "o", "compositionValueStatesAvailable", "failedCompositions", "q", "Lkotlinx/coroutines/p;", "workContinuation", "", "r", "I", "concurrentCompositionsOutstanding", "Z", "isClosed", "t", "Landroidx/compose/runtime/Recomposer$c;", "errorState", "Lkotlinx/coroutines/flow/j;", "Landroidx/compose/runtime/Recomposer$State;", ak.aG, "Lkotlinx/coroutines/flow/j;", "_state", "Landroidx/compose/runtime/Recomposer$d;", "v", "Landroidx/compose/runtime/Recomposer$d;", "recomposerInfo", "t0", "()Z", "shouldKeepRecomposing", "s0", "hasSchedulingWork", "q0", "hasFrameWorkLocked", "p0", "hasConcurrentFrameWorkLocked", "Lkotlinx/coroutines/flow/e;", "u0", "()Lkotlinx/coroutines/flow/e;", "getState$annotations", "()V", "state", "Lkotlinx/coroutines/flow/u;", "o0", "()Lkotlinx/coroutines/flow/u;", "currentState", "r0", "hasPendingWork", "()I", "compoundHashKey", "collectingParameterInformation", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", RXScreenCaptureService.KEY_WIDTH, "State", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class Recomposer extends r {

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f12441x = 8;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final kotlinx.coroutines.flow.j<u0.j<d>> f12442y = kotlinx.coroutines.flow.v.a(u0.a.K());

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private static final AtomicReference<Boolean> f12443z = new AtomicReference<>(Boolean.FALSE);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long changeCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final BroadcastFrameClock broadcastFrameClock;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.b0 effectJob;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CoroutineContext effectCoroutineContext;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object stateLock;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private kotlinx.coroutines.d2 runnerJob;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Throwable closeCause;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<z> knownCompositions;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<Set<Object>> snapshotInvalidations;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<z> compositionInvalidations;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<z> compositionsAwaitingApply;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<z0> compositionValuesAwaitingInsert;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<x0<Object>, List<z0>> compositionValuesRemoved;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<z0, y0> compositionValueStatesAvailable;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private List<z> failedCompositions;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private kotlinx.coroutines.p<? super kotlin.b2> workContinuation;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int concurrentCompositionsOutstanding;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private c errorState;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.flow.j<State> _state;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final d recomposerInfo;

    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010\u001aJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003H\u0002J\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003H\u0002J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR4\u0010$\u001a\"\u0012\f\u0012\n \"*\u0004\u0018\u00010\b0\b0!j\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010\b0\b`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010(\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0002R\u00020\u00030'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Landroidx/compose/runtime/Recomposer$a;", "", "Landroidx/compose/runtime/Recomposer$d;", "Landroidx/compose/runtime/Recomposer;", "info", "Lkotlin/b2;", ak.aF, "i", "", "value", "k", "(Z)V", "j", "()Ljava/lang/Object;", "token", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/lang/Object;)V", "", "key", "g", "(I)V", "", "Landroidx/compose/runtime/p1;", "e", "()Ljava/util/List;", "d", "()V", "Lkotlinx/coroutines/flow/u;", "", "Landroidx/compose/runtime/q1;", "f", "()Lkotlinx/coroutines/flow/u;", "runningRecomposers", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/flow/j;", "Lu0/j;", "_runningRecomposers", "Lkotlinx/coroutines/flow/j;", "<init>", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(d dVar) {
            u0.j jVar;
            u0.j jVarAdd;
            do {
                jVar = (u0.j) Recomposer.f12442y.getValue();
                jVarAdd = jVar.add(dVar);
                if (jVar == jVarAdd) {
                    return;
                }
            } while (!Recomposer.f12442y.compareAndSet(jVar, jVarAdd));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void i(d dVar) {
            u0.j jVar;
            u0.j jVarRemove;
            do {
                jVar = (u0.j) Recomposer.f12442y.getValue();
                jVarRemove = jVar.remove(dVar);
                if (jVar == jVarRemove) {
                    return;
                }
            } while (!Recomposer.f12442y.compareAndSet(jVar, jVarRemove));
        }

        public final void d() {
            Iterable iterable = (Iterable) Recomposer.f12442y.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                c cVarE = ((d) it.next()).e();
                if (cVarE != null) {
                    arrayList.add(cVarE);
                }
            }
        }

        @dl.d
        public final List<p1> e() {
            Iterable iterable = (Iterable) Recomposer.f12442y.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                p1 p1VarC = ((d) it.next()).c();
                if (p1VarC != null) {
                    arrayList.add(p1VarC);
                }
            }
            return arrayList;
        }

        @dl.d
        public final kotlinx.coroutines.flow.u<Set<q1>> f() {
            return Recomposer.f12442y;
        }

        public final void g(int key) {
            Recomposer.f12443z.set(Boolean.TRUE);
            for (d dVar : (Iterable) Recomposer.f12442y.getValue()) {
                p1 p1VarC = dVar.c();
                boolean z10 = false;
                if (p1VarC != null && !p1VarC.getRecoverable()) {
                    z10 = true;
                }
                if (!z10) {
                    dVar.e();
                    dVar.d(key);
                    dVar.f();
                }
            }
        }

        public final void h(@dl.d Object token) {
            kotlin.jvm.internal.f0.p(token, "token");
            Recomposer.f12443z.set(Boolean.TRUE);
            Iterator it = ((Iterable) Recomposer.f12442y.getValue()).iterator();
            while (it.hasNext()) {
                ((d) it.next()).e();
            }
            List list = (List) token;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) list.get(i10)).c();
            }
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((b) list.get(i11)).b();
            }
            Iterator it2 = ((Iterable) Recomposer.f12442y.getValue()).iterator();
            while (it2.hasNext()) {
                ((d) it2.next()).f();
            }
        }

        @dl.d
        public final Object j() {
            Recomposer.f12443z.set(Boolean.TRUE);
            Iterable iterable = (Iterable) Recomposer.f12442y.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                kotlin.collections.x.n0(arrayList, ((d) it.next()).g());
            }
            return arrayList;
        }

        public final void k(boolean value) {
            Recomposer.f12443z.set(Boolean.valueOf(value));
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/Recomposer$b;", "", "Lkotlin/b2;", ak.av, ak.aF, "b", "Landroidx/compose/runtime/t;", "Landroidx/compose/runtime/t;", "composition", "<init>", "(Landroidx/compose/runtime/t;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final t composition;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private yh.p<? super p, ? super Integer, kotlin.b2> f12468b;

        public b(@dl.d t composition) {
            kotlin.jvm.internal.f0.p(composition, "composition");
            this.composition = composition;
            this.f12468b = composition.k();
        }

        public final void a() {
            if (this.composition.getIsRoot()) {
                this.composition.c(ComposableSingletons$RecomposerKt.f12213a.a());
            }
        }

        public final void b() {
            if (this.composition.getIsRoot()) {
                this.composition.c(this.f12468b);
            }
        }

        public final void c() {
            this.composition.R(this.f12468b);
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\u0010\f\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\f\u001a\u00060\bj\u0002`\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/Recomposer$c;", "Landroidx/compose/runtime/p1;", "", ak.av, "Z", "b", "()Z", "recoverable", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "cause", "<init>", "(ZLjava/lang/Exception;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean recoverable;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Exception cause;

        public c(boolean z10, @dl.d Exception cause) {
            kotlin.jvm.internal.f0.p(cause, "cause");
            this.recoverable = z10;
            this.cause = cause;
        }

        @Override // androidx.compose.runtime.p1
        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public Exception getCause() {
            return this.cause;
        }

        @Override // androidx.compose.runtime.p1
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getRecoverable() {
            return this.recoverable;
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0006\u0010\u000b\u001a\u00020\u0004R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/Recomposer$d;", "Landroidx/compose/runtime/q1;", "", "key", "Lkotlin/b2;", "d", "", "Landroidx/compose/runtime/Recomposer$b;", "g", "Landroidx/compose/runtime/Recomposer$c;", "e", "f", "Lkotlinx/coroutines/flow/e;", "Landroidx/compose/runtime/Recomposer$State;", "getState", "()Lkotlinx/coroutines/flow/e;", "state", "", "b", "()Z", "hasPendingWork", "", ak.av, "()J", "changeCount", "Landroidx/compose/runtime/p1;", ak.aF, "()Landroidx/compose/runtime/p1;", "currentError", "<init>", "(Landroidx/compose/runtime/Recomposer;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public final class d implements q1 {
        public d() {
        }

        @Override // androidx.compose.runtime.q1
        public long a() {
            return Recomposer.this.getChangeCount();
        }

        @Override // androidx.compose.runtime.q1
        public boolean b() {
            return Recomposer.this.r0();
        }

        @dl.e
        public final p1 c() {
            c cVar;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                cVar = recomposer.errorState;
            }
            return cVar;
        }

        public final void d(int i10) {
            List listT5;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                listT5 = CollectionsKt___CollectionsKt.T5(recomposer.knownCompositions);
            }
            ArrayList arrayList = new ArrayList(listT5.size());
            int size = listT5.size();
            for (int i11 = 0; i11 < size; i11++) {
                z zVar = (z) listT5.get(i11);
                t tVar = zVar instanceof t ? (t) zVar : null;
                if (tVar != null) {
                    arrayList.add(tVar);
                }
            }
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((t) arrayList.get(i12)).v(i10);
            }
        }

        @dl.e
        public final c e() {
            return Recomposer.this.I0();
        }

        public final void f() {
            Recomposer.this.J0();
        }

        @dl.d
        public final List<b> g() {
            List listT5;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                listT5 = CollectionsKt___CollectionsKt.T5(recomposer.knownCompositions);
            }
            ArrayList arrayList = new ArrayList(listT5.size());
            int size = listT5.size();
            for (int i10 = 0; i10 < size; i10++) {
                z zVar = (z) listT5.get(i10);
                t tVar = zVar instanceof t ? (t) zVar : null;
                if (tVar != null) {
                    arrayList.add(tVar);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                b bVar = new b((t) arrayList.get(i11));
                bVar.a();
                arrayList2.add(bVar);
            }
            return arrayList2;
        }

        @Override // androidx.compose.runtime.q1
        @dl.d
        public kotlinx.coroutines.flow.e<State> getState() {
            return Recomposer.this.o0();
        }
    }

    public Recomposer(@dl.d CoroutineContext effectCoroutineContext) {
        kotlin.jvm.internal.f0.p(effectCoroutineContext, "effectCoroutineContext");
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new yh.a<kotlin.b2>() { // from class: androidx.compose.runtime.Recomposer$broadcastFrameClock$1
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                invoke2();
                return kotlin.b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                kotlinx.coroutines.p pVarL0;
                Object obj = this.f12469b.stateLock;
                Recomposer recomposer = this.f12469b;
                synchronized (obj) {
                    pVarL0 = recomposer.l0();
                    if (((Recomposer.State) recomposer._state.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                        throw kotlinx.coroutines.q1.a("Recomposer shutdown; frame clock awaiter will never resume", recomposer.closeCause);
                    }
                }
                if (pVarL0 != null) {
                    Result.a aVar = Result.f124476c;
                    pVarL0.resumeWith(Result.b(kotlin.b2.f124493a));
                }
            }
        });
        this.broadcastFrameClock = broadcastFrameClock;
        kotlinx.coroutines.b0 b0VarA = kotlinx.coroutines.g2.a((kotlinx.coroutines.d2) effectCoroutineContext.f(kotlinx.coroutines.d2.INSTANCE));
        b0VarA.K(new yh.l<Throwable, kotlin.b2>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1
            {
                super(1);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Throwable th2) {
                invoke2(th2);
                return kotlin.b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.e final Throwable th2) {
                kotlinx.coroutines.p pVar;
                kotlinx.coroutines.p pVar2;
                CancellationException cancellationExceptionA = kotlinx.coroutines.q1.a("Recomposer effect job completed", th2);
                Object obj = this.f12473b.stateLock;
                final Recomposer recomposer = this.f12473b;
                synchronized (obj) {
                    kotlinx.coroutines.d2 d2Var = recomposer.runnerJob;
                    pVar = null;
                    if (d2Var != null) {
                        recomposer._state.setValue(Recomposer.State.ShuttingDown);
                        if (recomposer.isClosed) {
                            if (recomposer.workContinuation != null) {
                                pVar2 = recomposer.workContinuation;
                            }
                            recomposer.workContinuation = null;
                            d2Var.K(new yh.l<Throwable, kotlin.b2>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(Throwable th3) {
                                    invoke2(th3);
                                    return kotlin.b2.f124493a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@dl.e Throwable th3) {
                                    Object obj2 = recomposer.stateLock;
                                    Recomposer recomposer2 = recomposer;
                                    Throwable th4 = th2;
                                    synchronized (obj2) {
                                        if (th4 == null) {
                                            th4 = null;
                                        } else if (th3 != null) {
                                            if (!(!(th3 instanceof CancellationException))) {
                                                th3 = null;
                                            }
                                            if (th3 != null) {
                                                kotlin.o.a(th4, th3);
                                            }
                                        }
                                        recomposer2.closeCause = th4;
                                        recomposer2._state.setValue(Recomposer.State.ShutDown);
                                        kotlin.b2 b2Var = kotlin.b2.f124493a;
                                    }
                                }
                            });
                            pVar = pVar2;
                        } else {
                            d2Var.e(cancellationExceptionA);
                        }
                        pVar2 = null;
                        recomposer.workContinuation = null;
                        d2Var.K(new yh.l<Throwable, kotlin.b2>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Throwable th3) {
                                invoke2(th3);
                                return kotlin.b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@dl.e Throwable th3) {
                                Object obj2 = recomposer.stateLock;
                                Recomposer recomposer2 = recomposer;
                                Throwable th4 = th2;
                                synchronized (obj2) {
                                    if (th4 == null) {
                                        th4 = null;
                                    } else if (th3 != null) {
                                        if (!(!(th3 instanceof CancellationException))) {
                                            th3 = null;
                                        }
                                        if (th3 != null) {
                                            kotlin.o.a(th4, th3);
                                        }
                                    }
                                    recomposer2.closeCause = th4;
                                    recomposer2._state.setValue(Recomposer.State.ShutDown);
                                    kotlin.b2 b2Var = kotlin.b2.f124493a;
                                }
                            }
                        });
                        pVar = pVar2;
                    } else {
                        recomposer.closeCause = cancellationExceptionA;
                        recomposer._state.setValue(Recomposer.State.ShutDown);
                        kotlin.b2 b2Var = kotlin.b2.f124493a;
                    }
                }
                if (pVar != null) {
                    Result.a aVar = Result.f124476c;
                    pVar.resumeWith(Result.b(kotlin.b2.f124493a));
                }
            }
        });
        this.effectJob = b0VarA;
        this.effectCoroutineContext = effectCoroutineContext.I(broadcastFrameClock).I(b0VarA);
        this.stateLock = new Object();
        this.knownCompositions = new ArrayList();
        this.snapshotInvalidations = new ArrayList();
        this.compositionInvalidations = new ArrayList();
        this.compositionsAwaitingApply = new ArrayList();
        this.compositionValuesAwaitingInsert = new ArrayList();
        this.compositionValuesRemoved = new LinkedHashMap();
        this.compositionValueStatesAvailable = new LinkedHashMap();
        this._state = kotlinx.coroutines.flow.v.a(State.Inactive);
        this.recomposerInfo = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    public final z A0(final z composition, final androidx.compose.runtime.collection.c<Object> modifiedValues) {
        if (composition.K() || composition.getDisposed()) {
            return null;
        }
        androidx.compose.runtime.snapshots.b bVarM = androidx.compose.runtime.snapshots.f.INSTANCE.m(D0(composition), N0(composition, modifiedValues));
        try {
            androidx.compose.runtime.snapshots.f fVarP = bVarM.p();
            boolean z10 = true;
            if (modifiedValues != null) {
                try {
                    if (!modifiedValues.j()) {
                        z10 = false;
                    }
                } catch (Throwable th2) {
                    bVarM.w(fVarP);
                    throw th2;
                }
            } else {
                z10 = false;
            }
            if (z10) {
                composition.B(new yh.a<kotlin.b2>() { // from class: androidx.compose.runtime.Recomposer$performRecompose$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // yh.a
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                        invoke2();
                        return kotlin.b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        androidx.compose.runtime.collection.c<Object> cVar = modifiedValues;
                        z zVar = composition;
                        int size = cVar.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            zVar.L(cVar.get(i10));
                        }
                    }
                });
            }
            boolean zF = composition.F();
            bVarM.w(fVarP);
            e0(bVarM);
            if (zF) {
                return composition;
            }
            return null;
        } catch (Throwable th3) {
            e0(bVarM);
            throw th3;
        }
    }

    private final void B0(Exception exc, z zVar, boolean z10) throws Exception {
        Boolean bool = f12443z.get();
        kotlin.jvm.internal.f0.o(bool, "_hotReloadEnabled.get()");
        if (!bool.booleanValue() || (exc instanceof ComposeRuntimeError)) {
            throw exc;
        }
        synchronized (this.stateLock) {
            this.compositionsAwaitingApply.clear();
            this.compositionInvalidations.clear();
            this.snapshotInvalidations.clear();
            this.compositionValuesAwaitingInsert.clear();
            this.compositionValuesRemoved.clear();
            this.compositionValueStatesAvailable.clear();
            this.errorState = new c(z10, exc);
            if (zVar != null) {
                List arrayList = this.failedCompositions;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.failedCompositions = arrayList;
                }
                if (!arrayList.contains(zVar)) {
                    arrayList.add(zVar);
                }
                this.knownCompositions.remove(zVar);
            }
            l0();
        }
    }

    static /* synthetic */ void C0(Recomposer recomposer, Exception exc, z zVar, boolean z10, int i10, Object obj) throws Exception {
        if ((i10 & 2) != 0) {
            zVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        recomposer.B0(exc, zVar, z10);
    }

    private final yh.l<Object, kotlin.b2> D0(final z zVar) {
        return new yh.l<Object, kotlin.b2>() { // from class: androidx.compose.runtime.Recomposer$readObserverOf$1
            {
                super(1);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Object obj) {
                invoke2(obj);
                return kotlin.b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.d Object value) {
                kotlin.jvm.internal.f0.p(value, "value");
                zVar.H(value);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E0(yh.q<? super kotlinx.coroutines.q0, ? super w0, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> qVar, kotlin.coroutines.c<? super kotlin.b2> cVar) throws Throwable {
        Object objH = kotlinx.coroutines.i.h(this.broadcastFrameClock, new Recomposer$recompositionRunner$2(this, qVar, MonotonicFrameClockKt.a(cVar.getContext()), null), cVar);
        return objH == kotlin.coroutines.intrinsics.b.h() ? objH : kotlin.b2.f124493a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F0() {
        if (!this.snapshotInvalidations.isEmpty()) {
            List<Set<Object>> list = this.snapshotInvalidations;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Set<? extends Object> set = list.get(i10);
                List<z> list2 = this.knownCompositions;
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    list2.get(i11).I(set);
                }
            }
            this.snapshotInvalidations.clear();
            if (l0() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
            }
        }
    }

    private final void G0(yh.l<? super z, kotlin.b2> lVar) {
        if (!this.snapshotInvalidations.isEmpty()) {
            List list = this.snapshotInvalidations;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Set<? extends Object> set = (Set) list.get(i10);
                List list2 = this.knownCompositions;
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((z) list2.get(i11)).I(set);
                }
            }
            this.snapshotInvalidations.clear();
        }
        List list3 = this.compositionInvalidations;
        int size3 = list3.size();
        for (int i12 = 0; i12 < size3; i12++) {
            lVar.invoke(list3.get(i12));
        }
        this.compositionInvalidations.clear();
        if (l0() != null) {
            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(kotlinx.coroutines.d2 d2Var) {
        synchronized (this.stateLock) {
            Throwable th2 = this.closeCause;
            if (th2 != null) {
                throw th2;
            }
            if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down".toString());
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running".toString());
            }
            this.runnerJob = d2Var;
            l0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c I0() {
        c cVar;
        synchronized (this.stateLock) {
            cVar = this.errorState;
            if (cVar != null) {
                this.errorState = null;
                l0();
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0() {
        synchronized (this.stateLock) {
            List<z> list = this.failedCompositions;
            if (list == null) {
                return;
            }
            while (!list.isEmpty()) {
                z zVar = (z) kotlin.collections.x.L0(list);
                if (zVar instanceof t) {
                    zVar.w();
                    zVar.c(((t) zVar).k());
                    if (this.errorState != null) {
                        break;
                    }
                }
            }
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0088  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a2 -> B:13:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object K0(androidx.compose.runtime.w0 r8, androidx.compose.runtime.h1 r9, kotlin.coroutines.c<? super kotlin.b2> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.runtime.Recomposer$runFrameLoop$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = (androidx.compose.runtime.Recomposer$runFrameLoop$1) r0
            int r1 = r0.f12499i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12499i = r1
            goto L18
        L13:
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = new androidx.compose.runtime.Recomposer$runFrameLoop$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f12497g
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f12499i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L65
            if (r2 == r4) goto L4d
            if (r2 != r3) goto L45
            java.lang.Object r8 = r0.f12496f
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.f12495e
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.f12494d
            androidx.compose.runtime.h1 r2 = (androidx.compose.runtime.h1) r2
            java.lang.Object r5 = r0.f12493c
            androidx.compose.runtime.w0 r5 = (androidx.compose.runtime.w0) r5
            java.lang.Object r6 = r0.f12492b
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            kotlin.t0.n(r10)
        L3f:
            r10 = r9
            r9 = r2
            r2 = r8
            r8 = r5
            r5 = r6
            goto L73
        L45:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4d:
            java.lang.Object r8 = r0.f12496f
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.f12495e
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.f12494d
            androidx.compose.runtime.h1 r2 = (androidx.compose.runtime.h1) r2
            java.lang.Object r5 = r0.f12493c
            androidx.compose.runtime.w0 r5 = (androidx.compose.runtime.w0) r5
            java.lang.Object r6 = r0.f12492b
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            kotlin.t0.n(r10)
            goto L8d
        L65:
            kotlin.t0.n(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5 = r7
        L73:
            java.lang.Object r6 = r5.stateLock
            r0.f12492b = r5
            r0.f12493c = r8
            r0.f12494d = r9
            r0.f12495e = r10
            r0.f12496f = r2
            r0.f12499i = r4
            java.lang.Object r6 = r9.c(r6, r0)
            if (r6 != r1) goto L88
            return r1
        L88:
            r6 = r5
            r5 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L8d:
            androidx.compose.runtime.Recomposer$runFrameLoop$2 r10 = new androidx.compose.runtime.Recomposer$runFrameLoop$2
            r10.<init>()
            r0.f12492b = r6
            r0.f12493c = r5
            r0.f12494d = r2
            r0.f12495e = r9
            r0.f12496f = r8
            r0.f12499i = r3
            java.lang.Object r10 = r5.h0(r10, r0)
            if (r10 != r1) goto L3f
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.K0(androidx.compose.runtime.w0, androidx.compose.runtime.h1, kotlin.coroutines.c):java.lang.Object");
    }

    private final yh.l<Object, kotlin.b2> N0(final z zVar, final androidx.compose.runtime.collection.c<Object> cVar) {
        return new yh.l<Object, kotlin.b2>() { // from class: androidx.compose.runtime.Recomposer$writeObserverOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Object obj) {
                invoke2(obj);
                return kotlin.b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.d Object value) {
                kotlin.jvm.internal.f0.p(value, "value");
                zVar.L(value);
                androidx.compose.runtime.collection.c<Object> cVar2 = cVar;
                if (cVar2 != null) {
                    cVar2.add(value);
                }
            }
        };
    }

    private final void e0(androidx.compose.runtime.snapshots.b bVar) {
        try {
            if (bVar.J() instanceof androidx.compose.runtime.snapshots.g.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
            bVar.d();
        } catch (Throwable th2) {
            bVar.d();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h0(kotlin.coroutines.c<? super kotlin.b2> cVar) {
        kotlin.b2 b2Var;
        if (s0()) {
            return kotlin.b2.f124493a;
        }
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        synchronized (this.stateLock) {
            if (s0()) {
                Result.a aVar = Result.f124476c;
                qVar.resumeWith(Result.b(kotlin.b2.f124493a));
            } else {
                this.workContinuation = qVar;
            }
            b2Var = kotlin.b2.f124493a;
        }
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT == kotlin.coroutines.intrinsics.b.h() ? objT : b2Var;
    }

    private final <T> T k0(z composition, androidx.compose.runtime.collection.c<Object> modifiedValues, yh.a<? extends T> block) {
        androidx.compose.runtime.snapshots.b bVarM = androidx.compose.runtime.snapshots.f.INSTANCE.m(D0(composition), N0(composition, modifiedValues));
        try {
            androidx.compose.runtime.snapshots.f fVarP = bVarM.p();
            try {
                T tInvoke = block.invoke();
                kotlin.jvm.internal.c0.d(1);
                bVarM.w(fVarP);
                kotlin.jvm.internal.c0.c(1);
                kotlin.jvm.internal.c0.d(1);
                e0(bVarM);
                return tInvoke;
            } finally {
                kotlin.jvm.internal.c0.d(1);
                bVarM.w(fVarP);
                kotlin.jvm.internal.c0.c(1);
            }
        } catch (Throwable th2) {
            kotlin.jvm.internal.c0.d(1);
            e0(bVarM);
            kotlin.jvm.internal.c0.c(1);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.p<kotlin.b2> l0() {
        State state;
        if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
            this.knownCompositions.clear();
            this.snapshotInvalidations.clear();
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            this.compositionValuesAwaitingInsert.clear();
            this.failedCompositions = null;
            kotlinx.coroutines.p<? super kotlin.b2> pVar = this.workContinuation;
            if (pVar != null) {
                kotlinx.coroutines.p.a.a(pVar, null, 1, null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            state = State.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations.clear();
            this.compositionInvalidations.clear();
            state = this.broadcastFrameClock.v() ? State.InactivePendingWork : State.Inactive;
        } else {
            state = ((this.compositionInvalidations.isEmpty() ^ true) || (this.snapshotInvalidations.isEmpty() ^ true) || (this.compositionsAwaitingApply.isEmpty() ^ true) || (this.compositionValuesAwaitingInsert.isEmpty() ^ true) || this.concurrentCompositionsOutstanding > 0 || this.broadcastFrameClock.v()) ? State.PendingWork : State.Idle;
        }
        this._state.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        kotlinx.coroutines.p pVar2 = this.workContinuation;
        this.workContinuation = null;
        return pVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0() {
        int i10;
        List listE;
        synchronized (this.stateLock) {
            if (!this.compositionValuesRemoved.isEmpty()) {
                List listA0 = kotlin.collections.t.a0(this.compositionValuesRemoved.values());
                this.compositionValuesRemoved.clear();
                listE = new ArrayList(listA0.size());
                int size = listA0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    z0 z0Var = (z0) listA0.get(i11);
                    listE.add(kotlin.c1.a(z0Var, this.compositionValueStatesAvailable.get(z0Var)));
                }
                this.compositionValueStatesAvailable.clear();
            } else {
                listE = CollectionsKt__CollectionsKt.E();
            }
        }
        int size2 = listE.size();
        for (i10 = 0; i10 < size2; i10++) {
            Pair pair = (Pair) listE.get(i10);
            z0 z0Var2 = (z0) pair.a();
            y0 y0Var = (y0) pair.b();
            if (y0Var != null) {
                z0Var2.getComposition().x(y0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p0() {
        return (this.compositionsAwaitingApply.isEmpty() ^ true) || this.broadcastFrameClock.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q0() {
        return (this.compositionInvalidations.isEmpty() ^ true) || this.broadcastFrameClock.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean s0() {
        boolean z10;
        synchronized (this.stateLock) {
            z10 = true;
            if (!(!this.snapshotInvalidations.isEmpty()) && !(!this.compositionInvalidations.isEmpty()) && !this.broadcastFrameClock.v()) {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x002d  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    public final boolean t0() {
        boolean z10;
        boolean z11;
        synchronized (this.stateLock) {
            z10 = !this.isClosed;
        }
        if (z10) {
            return true;
        }
        Iterator<kotlinx.coroutines.d2> it = this.effectJob.S().iterator();
        while (it.hasNext()) {
            if (it.next().isActive()) {
                z11 = true;
                if (z11) {
                    return true;
                }
                return false;
            }
        }
        z11 = false;
        if (z11) {
            return true;
        }
        return false;
    }

    @kotlin.k(message = "Replaced by currentState as a StateFlow", replaceWith = @kotlin.s0(expression = "currentState", imports = {}))
    public static /* synthetic */ void v0() {
    }

    private final void x0(z zVar) {
        synchronized (this.stateLock) {
            List<z0> list = this.compositionValuesAwaitingInsert;
            int size = list.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (kotlin.jvm.internal.f0.g(list.get(i10).getComposition(), zVar)) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                kotlin.b2 b2Var = kotlin.b2.f124493a;
                ArrayList arrayList = new ArrayList();
                y0(arrayList, this, zVar);
                while (!arrayList.isEmpty()) {
                    z0(arrayList, null);
                    y0(arrayList, this, zVar);
                }
            }
        }
    }

    private static final void y0(List<z0> list, Recomposer recomposer, z zVar) {
        list.clear();
        synchronized (recomposer.stateLock) {
            Iterator<z0> it = recomposer.compositionValuesAwaitingInsert.iterator();
            while (it.hasNext()) {
                z0 next = it.next();
                if (kotlin.jvm.internal.f0.g(next.getComposition(), zVar)) {
                    list.add(next);
                    it.remove();
                }
            }
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<z> z0(List<z0> references, androidx.compose.runtime.collection.c<Object> modifiedValues) {
        ArrayList arrayList;
        HashMap map = new HashMap(references.size());
        int size = references.size();
        for (int i10 = 0; i10 < size; i10++) {
            z0 z0Var = references.get(i10);
            z zVarB = z0Var.getComposition();
            Object arrayList2 = map.get(zVarB);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(zVarB, arrayList2);
            }
            ((ArrayList) arrayList2).add(z0Var);
        }
        for (Map.Entry entry : map.entrySet()) {
            z zVar = (z) entry.getKey();
            List list = (List) entry.getValue();
            ComposerKt.q0(!zVar.K());
            androidx.compose.runtime.snapshots.b bVarM = androidx.compose.runtime.snapshots.f.INSTANCE.m(D0(zVar), N0(zVar, modifiedValues));
            try {
                androidx.compose.runtime.snapshots.f fVarP = bVarM.p();
                try {
                    synchronized (this.stateLock) {
                        arrayList = new ArrayList(list.size());
                        int size2 = list.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            z0 z0Var2 = (z0) list.get(i11);
                            arrayList.add(kotlin.c1.a(z0Var2, RecomposerKt.d(this.compositionValuesRemoved, z0Var2.c())));
                        }
                    }
                    zVar.D(arrayList);
                    kotlin.b2 b2Var = kotlin.b2.f124493a;
                    bVarM.w(fVarP);
                    e0(bVarM);
                } catch (Throwable th2) {
                    bVarM.w(fVarP);
                    throw th2;
                }
            } catch (Throwable th3) {
                e0(bVarM);
                throw th3;
            }
        }
        return CollectionsKt___CollectionsKt.Q5(map.keySet());
    }

    @dl.e
    public final Object L0(@dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) throws Throwable {
        Object objE0 = E0(new Recomposer$runRecomposeAndApplyChanges$2(this, null), cVar);
        return objE0 == kotlin.coroutines.intrinsics.b.h() ? objE0 : kotlin.b2.f124493a;
    }

    @h0
    @dl.e
    public final Object M0(@dl.d CoroutineContext coroutineContext, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) throws Throwable {
        Object objE0 = E0(new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(coroutineContext, this, null), cVar);
        return objE0 == kotlin.coroutines.intrinsics.b.h() ? objE0 : kotlin.b2.f124493a;
    }

    @Override // androidx.compose.runtime.r
    @i(scheme = "[0[0]]")
    public void a(@dl.d z composition, @dl.d yh.p<? super p, ? super Integer, kotlin.b2> content) throws Exception {
        kotlin.jvm.internal.f0.p(composition, "composition");
        kotlin.jvm.internal.f0.p(content, "content");
        boolean zK = composition.K();
        try {
            androidx.compose.runtime.snapshots.f.Companion companion = androidx.compose.runtime.snapshots.f.INSTANCE;
            androidx.compose.runtime.snapshots.b bVarM = companion.m(D0(composition), N0(composition, null));
            try {
                androidx.compose.runtime.snapshots.f fVarP = bVarM.p();
                try {
                    composition.A(content);
                    kotlin.b2 b2Var = kotlin.b2.f124493a;
                    bVarM.w(fVarP);
                    e0(bVarM);
                    if (!zK) {
                        companion.d();
                    }
                    synchronized (this.stateLock) {
                        if (this._state.getValue().compareTo(State.ShuttingDown) > 0 && !this.knownCompositions.contains(composition)) {
                            this.knownCompositions.add(composition);
                        }
                    }
                    try {
                        x0(composition);
                        try {
                            composition.J();
                            composition.C();
                            if (zK) {
                                return;
                            }
                            companion.d();
                        } catch (Exception e10) {
                            C0(this, e10, null, false, 6, null);
                        }
                    } catch (Exception e11) {
                        B0(e11, composition, true);
                    }
                } catch (Throwable th2) {
                    bVarM.w(fVarP);
                    throw th2;
                }
            } catch (Throwable th3) {
                e0(bVarM);
                throw th3;
            }
        } catch (Exception e12) {
            B0(e12, composition, true);
        }
    }

    @Override // androidx.compose.runtime.r
    public void b(@dl.d z0 reference) {
        kotlin.jvm.internal.f0.p(reference, "reference");
        synchronized (this.stateLock) {
            RecomposerKt.c(this.compositionValuesRemoved, reference.c(), reference);
        }
    }

    @Override // androidx.compose.runtime.r
    public boolean d() {
        return false;
    }

    @Override // androidx.compose.runtime.r
    public int f() {
        return 1000;
    }

    @dl.d
    public final q1 f0() {
        return this.recomposerInfo;
    }

    @Override // androidx.compose.runtime.r
    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public CoroutineContext getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    @dl.e
    public final Object g0(@dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        Object objX = kotlinx.coroutines.flow.g.x(kotlinx.coroutines.flow.g.U1(o0(), new Recomposer$awaitIdle$2(null)), cVar);
        return objX == kotlin.coroutines.intrinsics.b.h() ? objX : kotlin.b2.f124493a;
    }

    @Override // androidx.compose.runtime.r
    @dl.d
    public CoroutineContext h() {
        return EmptyCoroutineContext.f124694b;
    }

    @Override // androidx.compose.runtime.r
    public void i(@dl.d z0 reference) {
        kotlinx.coroutines.p<kotlin.b2> pVarL0;
        kotlin.jvm.internal.f0.p(reference, "reference");
        synchronized (this.stateLock) {
            this.compositionValuesAwaitingInsert.add(reference);
            pVarL0 = l0();
        }
        if (pVarL0 != null) {
            Result.a aVar = Result.f124476c;
            pVarL0.resumeWith(Result.b(kotlin.b2.f124493a));
        }
    }

    public final void i0() {
        synchronized (this.stateLock) {
            if (this._state.getValue().compareTo(State.Idle) >= 0) {
                this._state.setValue(State.ShuttingDown);
            }
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
        kotlinx.coroutines.d2.a.b(this.effectJob, null, 1, null);
    }

    @Override // androidx.compose.runtime.r
    public void j(@dl.d z composition) {
        kotlinx.coroutines.p<kotlin.b2> pVarL0;
        kotlin.jvm.internal.f0.p(composition, "composition");
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.contains(composition)) {
                pVarL0 = null;
            } else {
                this.compositionInvalidations.add(composition);
                pVarL0 = l0();
            }
        }
        if (pVarL0 != null) {
            Result.a aVar = Result.f124476c;
            pVarL0.resumeWith(Result.b(kotlin.b2.f124493a));
        }
    }

    public final void j0() {
        if (this.effectJob.a()) {
            synchronized (this.stateLock) {
                this.isClosed = true;
                kotlin.b2 b2Var = kotlin.b2.f124493a;
            }
        }
    }

    @Override // androidx.compose.runtime.r
    public void k(@dl.d RecomposeScopeImpl scope) {
        kotlinx.coroutines.p<kotlin.b2> pVarL0;
        kotlin.jvm.internal.f0.p(scope, "scope");
        synchronized (this.stateLock) {
            this.snapshotInvalidations.add(kotlin.collections.c1.f(scope));
            pVarL0 = l0();
        }
        if (pVarL0 != null) {
            Result.a aVar = Result.f124476c;
            pVarL0.resumeWith(Result.b(kotlin.b2.f124493a));
        }
    }

    @Override // androidx.compose.runtime.r
    public void l(@dl.d z0 reference, @dl.d y0 data) {
        kotlin.jvm.internal.f0.p(reference, "reference");
        kotlin.jvm.internal.f0.p(data, "data");
        synchronized (this.stateLock) {
            this.compositionValueStatesAvailable.put(reference, data);
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
    }

    @Override // androidx.compose.runtime.r
    @dl.e
    public y0 m(@dl.d z0 reference) {
        y0 y0VarRemove;
        kotlin.jvm.internal.f0.p(reference, "reference");
        synchronized (this.stateLock) {
            y0VarRemove = this.compositionValueStatesAvailable.remove(reference);
        }
        return y0VarRemove;
    }

    @Override // androidx.compose.runtime.r
    public void n(@dl.d Set<androidx.compose.runtime.tooling.b> table) {
        kotlin.jvm.internal.f0.p(table, "table");
    }

    /* JADX INFO: renamed from: n0, reason: from getter */
    public final long getChangeCount() {
        return this.changeCount;
    }

    @dl.d
    public final kotlinx.coroutines.flow.u<State> o0() {
        return this._state;
    }

    @Override // androidx.compose.runtime.r
    public void p(@dl.d z composition) {
        kotlin.jvm.internal.f0.p(composition, "composition");
    }

    public final boolean r0() {
        boolean z10;
        synchronized (this.stateLock) {
            z10 = true;
            if (!(!this.snapshotInvalidations.isEmpty()) && !(!this.compositionInvalidations.isEmpty()) && this.concurrentCompositionsOutstanding <= 0 && !(!this.compositionsAwaitingApply.isEmpty()) && !this.broadcastFrameClock.v()) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // androidx.compose.runtime.r
    public void s(@dl.d z composition) {
        kotlin.jvm.internal.f0.p(composition, "composition");
        synchronized (this.stateLock) {
            this.knownCompositions.remove(composition);
            this.compositionInvalidations.remove(composition);
            this.compositionsAwaitingApply.remove(composition);
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
    }

    @dl.d
    public final kotlinx.coroutines.flow.e<State> u0() {
        return o0();
    }

    @dl.e
    public final Object w0(@dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        Object objU0 = kotlinx.coroutines.flow.g.u0(o0(), new Recomposer$join$2(null), cVar);
        return objU0 == kotlin.coroutines.intrinsics.b.h() ? objU0 : kotlin.b2.f124493a;
    }
}
