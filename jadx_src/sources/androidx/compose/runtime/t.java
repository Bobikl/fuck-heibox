package androidx.compose.runtime;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001:\u0001&B+\u0012\u0006\u0010[\u001a\u00020X\u0012\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0010\u0012\f\b\u0002\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0088\u0001¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001e\u0010\n\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0002Jc\u0010\u001a\u001a\u00020\u00022Y\u0010\u0019\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00020\u000fj\u0002`\u00180\u000eH\u0002JM\u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001b25\u0010 \u001a1\u0012'\u0012%\u0012\u0004\u0012\u00020\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f0\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00028\u00000\u001cH\u0082\b¢\u0006\u0004\b!\u0010\"J$\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0082\b¢\u0006\u0004\b$\u0010%J\b\u0010&\u001a\u00020\u0002H\u0002J\"\u0010,\u001a\u00020+2\u0006\u0010'\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u0006H\u0002J\u001c\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f0\u001dH\u0002J\u0010\u0010/\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-H\u0002J$\u00100\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0082\b¢\u0006\u0004\b0\u0010%J\"\u00103\u001a\u00020\u00022\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020\u00020#¢\u0006\u0002\b1H\u0016¢\u0006\u0004\b3\u00104J\u000e\u00107\u001a\u00020\u00022\u0006\u00106\u001a\u000205J\"\u00108\u001a\u00020\u00022\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020\u00020#¢\u0006\u0002\b1H\u0016¢\u0006\u0004\b8\u00104J\b\u00109\u001a\u00020\u0002H\u0016J\u0016\u0010:\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010;\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010<\u001a\u00020\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0016J\u0010\u0010=\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010>\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010?\u001a\u00020\bH\u0016J$\u0010D\u001a\u00020\u00022\u001a\u0010C\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020B\u0012\u0006\u0012\u0004\u0018\u00010B0A0@H\u0016J\u0010\u0010G\u001a\u00020\u00022\u0006\u0010F\u001a\u00020EH\u0016J\b\u0010H\u001a\u00020\u0002H\u0016J\b\u0010I\u001a\u00020\u0002H\u0016J\b\u0010J\u001a\u00020\u0002H\u0016J\b\u0010K\u001a\u00020\u0002H\u0016J\b\u0010L\u001a\u00020\u0002H\u0016J5\u0010P\u001a\u00028\u0000\"\u0004\b\u0000\u0010M2\b\u0010N\u001a\u0004\u0018\u00010\u00012\u0006\u0010O\u001a\u0002052\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016¢\u0006\u0004\bP\u0010QJ\u0018\u0010R\u001a\u00020+2\u0006\u0010'\u001a\u00020\u001e2\b\u0010*\u001a\u0004\u0018\u00010\u0006J\u001f\u0010S\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u001eH\u0000¢\u0006\u0004\bS\u0010TJ\u001b\u0010V\u001a\u00020\u00022\n\u0010F\u001a\u0006\u0012\u0002\b\u00030UH\u0000¢\u0006\u0004\bV\u0010WR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\\R(\u0010`\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00060]j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0006`^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010_R\u0014\u0010c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR$\u0010h\u001a\u0012\u0012\u0004\u0012\u00020e0dj\b\u0012\u0004\u0012\u00020e`f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010gR\u001a\u0010.\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010i\u001a\u0004\bj\u0010kR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020\u001e0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010mR$\u0010o\u001a\u0012\u0012\u0004\u0012\u00020\u001e0dj\b\u0012\u0004\u0012\u00020\u001e`f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010gR\u001e\u0010q\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030U0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010mRg\u0010\u0019\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00020\u000fj\u0002`\u00180\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sRg\u0010u\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00020\u000fj\u0002`\u00180\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010sR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020\u001e0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010mR*\u0010z\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR#\u0010\u0080\u0001\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b{\u0010|\u001a\u0004\b{\u0010}\"\u0004\b~\u0010\u007fR\u001b\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u0084\u0001\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010:R\u0017\u0010\u0087\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b$\u0010\u0086\u0001R\u0019\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010\u0089\u0001R\u0019\u0010\u008c\u0001\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\bR\u0010|\u001a\u0005\b\u008b\u0001\u0010}R\u0017\u0010\u008d\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010|R\u0015\u0010\u008e\u0001\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010}R\u001c\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060@8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bx\u0010\u008f\u0001R\u001c\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060@8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bv\u0010\u008f\u0001R\u001c\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0@8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bt\u0010\u008f\u0001R\u0015\u0010\u0094\u0001\u001a\u00030\u0088\u00018F¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0093\u0001R1\u0010\u0095\u0001\u001a\r\u0012\u0004\u0012\u00020\u00020#¢\u0006\u0002\b18\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0005\br\u0010\u0097\u0001\"\u0004\bM\u00104R\u0016\u0010\u0099\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010}R\u0016\u0010\u009a\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010}R\u0016\u0010\u009c\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010}R\u0015\u0010\u009d\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010}¨\u0006 \u0001"}, d2 = {"Landroidx/compose/runtime/t;", "Landroidx/compose/runtime/z;", "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "i", "", "", "values", "", "forgetConditionalScopes", "d", "g", "value", "N", "", "Lkotlin/Function3;", "Landroidx/compose/runtime/e;", "Lkotlin/m0;", "name", "applier", "Landroidx/compose/runtime/a2;", "slots", "Landroidx/compose/runtime/s1;", "rememberManager", "Landroidx/compose/runtime/Change;", "changes", "f", androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function1;", "Landroidx/compose/runtime/collection/b;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/collection/c;", "block", ak.aB, "(Lyh/l;)Ljava/lang/Object;", "Lkotlin/Function0;", "r", "(Lyh/a;)Ljava/lang/Object;", ak.av, "scope", "Landroidx/compose/runtime/c;", "anchor", "instance", "Landroidx/compose/runtime/InvalidationResult;", ak.aG, "Landroidx/compose/runtime/x1;", "slotTable", androidx.exifinterface.media.a.X4, "U", "Landroidx/compose/runtime/h;", "content", ak.aF, "(Lyh/p;)V", "", "key", "v", androidx.exifinterface.media.a.W4, "dispose", "I", "y", "B", "H", "L", "F", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/z0;", "references", "D", "Landroidx/compose/runtime/y0;", "state", "x", "J", "C", ak.aD, RXScreenCaptureService.KEY_WIDTH, "G", "R", "to", "groupIndex", "M", "(Landroidx/compose/runtime/z;ILyh/a;)Ljava/lang/Object;", "t", "Q", "(Ljava/lang/Object;Landroidx/compose/runtime/RecomposeScopeImpl;)V", "Landroidx/compose/runtime/b0;", "P", "(Landroidx/compose/runtime/b0;)V", "Landroidx/compose/runtime/r;", "b", "Landroidx/compose/runtime/r;", "parent", "Landroidx/compose/runtime/e;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingModifications", "e", "Ljava/lang/Object;", "lock", "Ljava/util/HashSet;", "Landroidx/compose/runtime/t1;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "abandonSet", "Landroidx/compose/runtime/x1;", "q", "()Landroidx/compose/runtime/x1;", "Landroidx/compose/runtime/collection/d;", "Landroidx/compose/runtime/collection/d;", "observations", "conditionallyInvalidatedScopes", "j", "derivedStates", "k", "Ljava/util/List;", "l", "lateChanges", "m", "observationsProcessed", "n", "Landroidx/compose/runtime/collection/b;", "invalidations", "o", "Z", "()Z", androidx.exifinterface.media.a.R4, "(Z)V", "pendingInvalidScopes", "p", "Landroidx/compose/runtime/t;", "invalidationDelegate", "invalidationDelegateGroup", "Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/ComposerImpl;", "composer", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "_recomposeContext", "O", "isRoot", "disposed", "areChildrenComposing", "()Ljava/util/List;", "observedObjects", "derivedStateDependencies", "conditionalScopes", "()Lkotlin/coroutines/CoroutineContext;", "recomposeContext", "composable", "Lyh/p;", "()Lyh/p;", "K", "isComposing", "isDisposed", androidx.exifinterface.media.a.S4, "hasPendingChanges", "hasInvalidations", "<init>", "(Landroidx/compose/runtime/r;Landroidx/compose/runtime/e;Lkotlin/coroutines/CoroutineContext;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class t implements z {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final r parent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final e<?> applier;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AtomicReference<Object> pendingModifications;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object lock;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final HashSet<t1> abandonSet;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final x1 slotTable;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.d<RecomposeScopeImpl> observations;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final HashSet<RecomposeScopeImpl> conditionallyInvalidatedScopes;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.d<b0<?>> derivedStates;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<yh.q<e<?>, SlotWriter, s1, kotlin.b2>> changes;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<yh.q<e<?>, SlotWriter, s1, kotlin.b2>> lateChanges;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.d<RecomposeScopeImpl> observationsProcessed;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private androidx.compose.runtime.collection.b<RecomposeScopeImpl, androidx.compose.runtime.collection.c<Object>> invalidations;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean pendingInvalidScopes;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private t invalidationDelegate;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int invalidationDelegateGroup;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ComposerImpl composer;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final CoroutineContext _recomposeContext;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean isRoot;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private yh.p<? super p, ? super Integer, kotlin.b2> f13310v;

    /* JADX INFO: compiled from: Composition.kt */
    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0016J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/t$a;", "Landroidx/compose/runtime/s1;", "Landroidx/compose/runtime/t1;", "instance", "Lkotlin/b2;", ak.aF, ak.av, "Lkotlin/Function0;", "effect", "b", "e", "f", "d", "", "Ljava/util/Set;", "abandoning", "", "Ljava/util/List;", "remembering", "forgetting", "sideEffects", "<init>", "(Ljava/util/Set;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements s1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Set<t1> abandoning;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final List<t1> remembering;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final List<t1> forgetting;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final List<yh.a<kotlin.b2>> sideEffects;

        public a(@dl.d Set<t1> abandoning) {
            kotlin.jvm.internal.f0.p(abandoning, "abandoning");
            this.abandoning = abandoning;
            this.remembering = new ArrayList();
            this.forgetting = new ArrayList();
            this.sideEffects = new ArrayList();
        }

        @Override // androidx.compose.runtime.s1
        public void a(@dl.d t1 instance) {
            kotlin.jvm.internal.f0.p(instance, "instance");
            int iLastIndexOf = this.remembering.lastIndexOf(instance);
            if (iLastIndexOf < 0) {
                this.forgetting.add(instance);
            } else {
                this.remembering.remove(iLastIndexOf);
                this.abandoning.remove(instance);
            }
        }

        @Override // androidx.compose.runtime.s1
        public void b(@dl.d yh.a<kotlin.b2> effect) {
            kotlin.jvm.internal.f0.p(effect, "effect");
            this.sideEffects.add(effect);
        }

        @Override // androidx.compose.runtime.s1
        public void c(@dl.d t1 instance) {
            kotlin.jvm.internal.f0.p(instance, "instance");
            int iLastIndexOf = this.forgetting.lastIndexOf(instance);
            if (iLastIndexOf < 0) {
                this.remembering.add(instance);
            } else {
                this.forgetting.remove(iLastIndexOf);
                this.abandoning.remove(instance);
            }
        }

        public final void d() {
            if (!this.abandoning.isEmpty()) {
                Object objA = r2.f13058a.a("Compose:abandons");
                try {
                    Iterator<t1> it = this.abandoning.iterator();
                    while (it.hasNext()) {
                        t1 next = it.next();
                        it.remove();
                        next.c();
                    }
                    kotlin.b2 b2Var = kotlin.b2.f124493a;
                } finally {
                    r2.f13058a.b(objA);
                }
            }
        }

        public final void e() {
            if (!this.forgetting.isEmpty()) {
                Object objA = r2.f13058a.a("Compose:onForgotten");
                try {
                    for (int size = this.forgetting.size() - 1; -1 < size; size--) {
                        t1 t1Var = this.forgetting.get(size);
                        if (!this.abandoning.contains(t1Var)) {
                            t1Var.d();
                        }
                    }
                    kotlin.b2 b2Var = kotlin.b2.f124493a;
                    r2.f13058a.b(objA);
                } catch (Throwable th2) {
                    r2.f13058a.b(objA);
                    throw th2;
                }
            }
            if (!this.remembering.isEmpty()) {
                Object objA2 = r2.f13058a.a("Compose:onRemembered");
                try {
                    List<t1> list = this.remembering;
                    int size2 = list.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        t1 t1Var2 = list.get(i10);
                        this.abandoning.remove(t1Var2);
                        t1Var2.b();
                    }
                    kotlin.b2 b2Var2 = kotlin.b2.f124493a;
                } finally {
                    r2.f13058a.b(objA2);
                }
            }
        }

        public final void f() {
            if (!this.sideEffects.isEmpty()) {
                Object objA = r2.f13058a.a("Compose:sideeffects");
                try {
                    List<yh.a<kotlin.b2>> list = this.sideEffects;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.get(i10).invoke();
                    }
                    this.sideEffects.clear();
                    kotlin.b2 b2Var = kotlin.b2.f124493a;
                } finally {
                    r2.f13058a.b(objA);
                }
            }
        }
    }

    public t(@dl.d r parent, @dl.d e<?> applier, @dl.e CoroutineContext coroutineContext) {
        kotlin.jvm.internal.f0.p(parent, "parent");
        kotlin.jvm.internal.f0.p(applier, "applier");
        this.parent = parent;
        this.applier = applier;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        HashSet<t1> hashSet = new HashSet<>();
        this.abandonSet = hashSet;
        x1 x1Var = new x1();
        this.slotTable = x1Var;
        this.observations = new androidx.compose.runtime.collection.d<>();
        this.conditionallyInvalidatedScopes = new HashSet<>();
        this.derivedStates = new androidx.compose.runtime.collection.d<>();
        ArrayList arrayList = new ArrayList();
        this.changes = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.lateChanges = arrayList2;
        this.observationsProcessed = new androidx.compose.runtime.collection.d<>();
        this.invalidations = new androidx.compose.runtime.collection.b<>(0, 1, null);
        ComposerImpl composerImpl = new ComposerImpl(applier, parent, x1Var, hashSet, arrayList, arrayList2, this);
        parent.o(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = coroutineContext;
        this.isRoot = parent instanceof Recomposer;
        this.f13310v = ComposableSingletons$CompositionKt.f12208a.a();
    }

    public /* synthetic */ t(r rVar, e eVar, CoroutineContext coroutineContext, int i10, kotlin.jvm.internal.u uVar) {
        this(rVar, eVar, (i10 & 4) != 0 ? null : coroutineContext);
    }

    private final void N(Object obj) {
        androidx.compose.runtime.collection.d<RecomposeScopeImpl> dVar = this.observations;
        int iF = dVar.f(obj);
        if (iF >= 0) {
            androidx.compose.runtime.collection.c cVarV = dVar.v(iF);
            int size = cVarV.size();
            for (int i10 = 0; i10 < size; i10++) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) cVarV.get(i10);
                if (recomposeScopeImpl.t(obj) == InvalidationResult.IMMINENT) {
                    this.observationsProcessed.c(obj, recomposeScopeImpl);
                }
            }
        }
    }

    private final androidx.compose.runtime.collection.b<RecomposeScopeImpl, androidx.compose.runtime.collection.c<Object>> T() {
        androidx.compose.runtime.collection.b<RecomposeScopeImpl, androidx.compose.runtime.collection.c<Object>> bVar = this.invalidations;
        this.invalidations = new androidx.compose.runtime.collection.b<>(0, 1, null);
        return bVar;
    }

    private final <T> T U(yh.a<? extends T> block) {
        try {
            T tInvoke = block.invoke();
            kotlin.jvm.internal.c0.d(1);
            return tInvoke;
        } finally {
            kotlin.jvm.internal.c0.d(1);
            if (!this.abandonSet.isEmpty()) {
                new a(this.abandonSet).d();
            }
            kotlin.jvm.internal.c0.c(1);
        }
    }

    private final void V(x1 x1Var) {
        Object[] objArrE = x1Var.getSlots();
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArrE) {
            RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList.get(i10);
            c cVarJ = recomposeScopeImpl2.getAnchor();
            if (cVarJ != null && !x1Var.d0(cVarJ.d(x1Var)).contains(recomposeScopeImpl2)) {
                throw new IllegalStateException(("Misaligned anchor " + cVarJ + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + ArraysKt___ArraysKt.jg(x1Var.getSlots(), recomposeScopeImpl2)).toString());
            }
        }
    }

    private final void a() {
        this.pendingModifications.set(null);
        this.changes.clear();
        this.lateChanges.clear();
        this.abandonSet.clear();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void d(Set<? extends Object> set, boolean z10) {
        boolean z11;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (Object obj : set) {
            if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).t(null);
            } else {
                e(this, z10, objectRef, obj);
                androidx.compose.runtime.collection.d<b0<?>> dVar = this.derivedStates;
                int iF = dVar.f(obj);
                if (iF >= 0) {
                    androidx.compose.runtime.collection.c cVarV = dVar.v(iF);
                    int size = cVarV.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        e(this, z10, objectRef, (b0) cVarV.get(i10));
                    }
                }
            }
        }
        if (!z10 || !(!this.conditionallyInvalidatedScopes.isEmpty())) {
            HashSet hashSet = (HashSet) objectRef.f124891b;
            if (hashSet != null) {
                androidx.compose.runtime.collection.d<RecomposeScopeImpl> dVar2 = this.observations;
                int size2 = dVar2.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                int i11 = 0;
                for (int i12 = 0; i12 < size2; i12++) {
                    int i13 = dVar2.getValueOrder()[i12];
                    androidx.compose.runtime.collection.c<RecomposeScopeImpl> cVar = dVar2.j()[i13];
                    kotlin.jvm.internal.f0.m(cVar);
                    int size3 = cVar.size();
                    int i14 = 0;
                    for (int i15 = 0; i15 < size3; i15++) {
                        Object obj2 = cVar.getValues()[i15];
                        kotlin.jvm.internal.f0.n(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        if (!hashSet.contains((RecomposeScopeImpl) obj2)) {
                            if (i14 != i15) {
                                cVar.getValues()[i14] = obj2;
                            }
                            i14++;
                        }
                    }
                    int size4 = cVar.size();
                    for (int i16 = i14; i16 < size4; i16++) {
                        cVar.getValues()[i16] = null;
                    }
                    cVar.o(i14);
                    if (cVar.size() > 0) {
                        if (i11 != i12) {
                            int i17 = dVar2.getValueOrder()[i11];
                            dVar2.getValueOrder()[i11] = i13;
                            dVar2.getValueOrder()[i12] = i17;
                        }
                        i11++;
                    }
                }
                int size5 = dVar2.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                for (int i18 = i11; i18 < size5; i18++) {
                    dVar2.getValues()[dVar2.getValueOrder()[i18]] = null;
                }
                dVar2.x(i11);
                g();
                return;
            }
            return;
        }
        androidx.compose.runtime.collection.d<RecomposeScopeImpl> dVar3 = this.observations;
        int size6 = dVar3.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        int i19 = 0;
        for (int i20 = 0; i20 < size6; i20++) {
            int i21 = dVar3.getValueOrder()[i20];
            androidx.compose.runtime.collection.c<RecomposeScopeImpl> cVar2 = dVar3.j()[i21];
            kotlin.jvm.internal.f0.m(cVar2);
            int size7 = cVar2.size();
            int i22 = 0;
            for (int i23 = 0; i23 < size7; i23++) {
                Object obj3 = cVar2.getValues()[i23];
                kotlin.jvm.internal.f0.n(obj3, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj3;
                if (this.conditionallyInvalidatedScopes.contains(recomposeScopeImpl)) {
                    z11 = true;
                } else {
                    HashSet hashSet2 = (HashSet) objectRef.f124891b;
                    if (hashSet2 != null && hashSet2.contains(recomposeScopeImpl)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (!z11) {
                    if (i22 != i23) {
                        cVar2.getValues()[i22] = obj3;
                    }
                    i22++;
                }
            }
            int size8 = cVar2.size();
            for (int i24 = i22; i24 < size8; i24++) {
                cVar2.getValues()[i24] = null;
            }
            cVar2.o(i22);
            if (cVar2.size() > 0) {
                if (i19 != i20) {
                    int i25 = dVar3.getValueOrder()[i19];
                    dVar3.getValueOrder()[i19] = i21;
                    dVar3.getValueOrder()[i20] = i25;
                }
                i19++;
            }
        }
        int size9 = dVar3.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        for (int i26 = i19; i26 < size9; i26++) {
            dVar3.getValues()[dVar3.getValueOrder()[i26]] = null;
        }
        dVar3.x(i19);
        g();
        this.conditionallyInvalidatedScopes.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v9 */
    private static final void e(t tVar, boolean z10, Ref.ObjectRef<HashSet<RecomposeScopeImpl>> objectRef, Object obj) {
        androidx.compose.runtime.collection.d<RecomposeScopeImpl> dVar = tVar.observations;
        int iF = dVar.f(obj);
        if (iF >= 0) {
            androidx.compose.runtime.collection.c cVarV = dVar.v(iF);
            int size = cVarV.size();
            for (int i10 = 0; i10 < size; i10++) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) cVarV.get(i10);
                if (!tVar.observationsProcessed.r(obj, recomposeScopeImpl) && recomposeScopeImpl.t(obj) != InvalidationResult.IGNORED) {
                    if (!recomposeScopeImpl.u() || z10) {
                        HashSet<RecomposeScopeImpl> hashSet = objectRef.f124891b;
                        ?? r10 = hashSet;
                        if (hashSet == null) {
                            ?? hashSet2 = new HashSet();
                            objectRef.f124891b = hashSet2;
                            r10 = hashSet2;
                        }
                        r10.add(recomposeScopeImpl);
                    } else {
                        tVar.conditionallyInvalidatedScopes.add(recomposeScopeImpl);
                    }
                }
            }
        }
    }

    private final void f(List<yh.q<e<?>, SlotWriter, s1, kotlin.b2>> list) {
        a aVar = new a(this.abandonSet);
        try {
            if (list.isEmpty()) {
                if (this.lateChanges.isEmpty()) {
                    aVar.d();
                    return;
                }
                return;
            }
            Object objA = r2.f13058a.a("Compose:applyChanges");
            try {
                this.applier.d();
                SlotWriter a2VarV = this.slotTable.V();
                try {
                    e<?> eVar = this.applier;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.get(i10).invoke(eVar, a2VarV, aVar);
                    }
                    list.clear();
                    kotlin.b2 b2Var = kotlin.b2.f124493a;
                    a2VarV.I();
                    this.applier.c();
                    r2 r2Var = r2.f13058a;
                    r2Var.b(objA);
                    aVar.e();
                    aVar.f();
                    if (this.pendingInvalidScopes) {
                        Object objA2 = r2Var.a("Compose:unobserve");
                        try {
                            this.pendingInvalidScopes = false;
                            androidx.compose.runtime.collection.d<RecomposeScopeImpl> dVar = this.observations;
                            int size2 = dVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                            int i11 = 0;
                            for (int i12 = 0; i12 < size2; i12++) {
                                int i13 = dVar.getValueOrder()[i12];
                                androidx.compose.runtime.collection.c<RecomposeScopeImpl> cVar = dVar.j()[i13];
                                kotlin.jvm.internal.f0.m(cVar);
                                int size3 = cVar.size();
                                int i14 = 0;
                                for (int i15 = 0; i15 < size3; i15++) {
                                    Object obj = cVar.getValues()[i15];
                                    kotlin.jvm.internal.f0.n(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    if (!(!((RecomposeScopeImpl) obj).s())) {
                                        if (i14 != i15) {
                                            cVar.getValues()[i14] = obj;
                                        }
                                        i14++;
                                    }
                                }
                                int size4 = cVar.size();
                                for (int i16 = i14; i16 < size4; i16++) {
                                    cVar.getValues()[i16] = null;
                                }
                                cVar.o(i14);
                                if (cVar.size() > 0) {
                                    if (i11 != i12) {
                                        int i17 = dVar.getValueOrder()[i11];
                                        dVar.getValueOrder()[i11] = i13;
                                        dVar.getValueOrder()[i12] = i17;
                                    }
                                    i11++;
                                }
                            }
                            int size5 = dVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                            for (int i18 = i11; i18 < size5; i18++) {
                                dVar.getValues()[dVar.getValueOrder()[i18]] = null;
                            }
                            dVar.x(i11);
                            g();
                            kotlin.b2 b2Var2 = kotlin.b2.f124493a;
                            r2.f13058a.b(objA2);
                        } catch (Throwable th2) {
                            r2.f13058a.b(objA2);
                            throw th2;
                        }
                    }
                    if (this.lateChanges.isEmpty()) {
                        aVar.d();
                    }
                } catch (Throwable th3) {
                    a2VarV.I();
                    throw th3;
                }
            } catch (Throwable th4) {
                r2.f13058a.b(objA);
                throw th4;
            }
        } catch (Throwable th5) {
            if (this.lateChanges.isEmpty()) {
                aVar.d();
            }
            throw th5;
        }
    }

    private final void g() {
        androidx.compose.runtime.collection.d<b0<?>> dVar = this.derivedStates;
        int size = dVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = dVar.getValueOrder()[i11];
            androidx.compose.runtime.collection.c<b0<?>> cVar = dVar.j()[i12];
            kotlin.jvm.internal.f0.m(cVar);
            int size2 = cVar.size();
            int i13 = 0;
            for (int i14 = 0; i14 < size2; i14++) {
                Object obj = cVar.getValues()[i14];
                kotlin.jvm.internal.f0.n(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!(!this.observations.e((b0) obj))) {
                    if (i13 != i14) {
                        cVar.getValues()[i13] = obj;
                    }
                    i13++;
                }
            }
            int size3 = cVar.size();
            for (int i15 = i13; i15 < size3; i15++) {
                cVar.getValues()[i15] = null;
            }
            cVar.o(i13);
            if (cVar.size() > 0) {
                if (i10 != i11) {
                    int i16 = dVar.getValueOrder()[i10];
                    dVar.getValueOrder()[i10] = i12;
                    dVar.getValueOrder()[i11] = i16;
                }
                i10++;
            }
        }
        int size4 = dVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        for (int i17 = i10; i17 < size4; i17++) {
            dVar.getValues()[dVar.getValueOrder()[i17]] = null;
        }
        dVar.x(i10);
        Iterator<RecomposeScopeImpl> it = this.conditionallyInvalidatedScopes.iterator();
        kotlin.jvm.internal.f0.o(it, "iterator()");
        while (it.hasNext()) {
            if (!it.next().u()) {
                it.remove();
            }
        }
    }

    private final void h() {
        Object andSet = this.pendingModifications.getAndSet(u.f13320a);
        if (andSet != null) {
            if (kotlin.jvm.internal.f0.g(andSet, u.f13320a)) {
                ComposerKt.A("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                d((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                ComposerKt.A("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new KotlinNothingValueException();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                d(set, true);
            }
        }
    }

    private final void i() {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (kotlin.jvm.internal.f0.g(andSet, u.f13320a)) {
            return;
        }
        if (andSet instanceof Set) {
            d((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                d(set, false);
            }
            return;
        }
        if (andSet == null) {
            ComposerKt.A("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        ComposerKt.A("corrupt pendingModifications drain: " + this.pendingModifications);
        throw new KotlinNothingValueException();
    }

    private final boolean j() {
        return this.composer.Q0();
    }

    private final <T> T r(yh.a<? extends T> block) throws Exception {
        try {
            try {
                T tInvoke = block.invoke();
                kotlin.jvm.internal.c0.d(1);
                return tInvoke;
            } finally {
                kotlin.jvm.internal.c0.d(1);
                if (!this.abandonSet.isEmpty()) {
                    new a(this.abandonSet).d();
                }
                kotlin.jvm.internal.c0.c(1);
            }
        } catch (Exception e10) {
            a();
            throw e10;
        }
    }

    private final <T> T s(yh.l<? super androidx.compose.runtime.collection.b<RecomposeScopeImpl, androidx.compose.runtime.collection.c<Object>>, ? extends T> block) throws Exception {
        androidx.compose.runtime.collection.b<RecomposeScopeImpl, androidx.compose.runtime.collection.c<Object>> bVarT = T();
        try {
            return block.invoke(bVarT);
        } catch (Exception e10) {
            this.invalidations = bVarT;
            throw e10;
        }
    }

    private final InvalidationResult u(RecomposeScopeImpl scope, c anchor, Object instance) {
        synchronized (this.lock) {
            t tVar = this.invalidationDelegate;
            if (tVar == null || !this.slotTable.I(this.invalidationDelegateGroup, anchor)) {
                tVar = null;
            }
            if (tVar == null) {
                if (K() && this.composer.h2(scope, instance)) {
                    return InvalidationResult.IMMINENT;
                }
                if (instance == null) {
                    this.invalidations.o(scope, null);
                } else {
                    u.g(this.invalidations, scope, instance);
                }
            }
            if (tVar != null) {
                return tVar.u(scope, anchor, instance);
            }
            this.parent.j(this);
            return K() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
        }
    }

    @Override // androidx.compose.runtime.z
    public void A(@dl.d yh.p<? super p, ? super Integer, kotlin.b2> content) throws Exception {
        kotlin.jvm.internal.f0.p(content, "content");
        try {
            synchronized (this.lock) {
                h();
                androidx.compose.runtime.collection.b<RecomposeScopeImpl, androidx.compose.runtime.collection.c<Object>> bVarT = T();
                try {
                    this.composer.A0(bVarT, content);
                    kotlin.b2 b2Var = kotlin.b2.f124493a;
                } catch (Exception e10) {
                    this.invalidations = bVarT;
                    throw e10;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    new a(this.abandonSet).d();
                }
                throw th2;
            } catch (Exception e11) {
                a();
                throw e11;
            }
        }
    }

    @Override // androidx.compose.runtime.z
    public void B(@dl.d yh.a<kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        this.composer.p1(block);
    }

    @Override // androidx.compose.runtime.z
    public void C() {
        synchronized (this.lock) {
            try {
                if (!this.lateChanges.isEmpty()) {
                    f(this.lateChanges);
                }
                kotlin.b2 b2Var = kotlin.b2.f124493a;
            } catch (Throwable th2) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        new a(this.abandonSet).d();
                    }
                    throw th2;
                } catch (Exception e10) {
                    a();
                    throw e10;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.z
    public void D(@dl.d List<Pair<z0, z0>> references) throws Exception {
        kotlin.jvm.internal.f0.p(references, "references");
        int size = references.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!kotlin.jvm.internal.f0.g(references.get(i10).e().getComposition(), this)) {
                break;
            } else {
                i10++;
            }
        }
        ComposerKt.q0(z10);
        try {
            this.composer.c(references);
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        } catch (Throwable th2) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    new a(this.abandonSet).d();
                }
                throw th2;
            } catch (Exception e10) {
                a();
                throw e10;
            }
        }
    }

    @Override // androidx.compose.runtime.z
    public boolean E() {
        boolean zX0;
        synchronized (this.lock) {
            zX0 = this.composer.X0();
        }
        return zX0;
    }

    @Override // androidx.compose.runtime.z
    public boolean F() {
        boolean zW1;
        synchronized (this.lock) {
            h();
            try {
                androidx.compose.runtime.collection.b<RecomposeScopeImpl, androidx.compose.runtime.collection.c<Object>> bVarT = T();
                try {
                    zW1 = this.composer.w1(bVarT);
                    if (!zW1) {
                        i();
                    }
                } catch (Exception e10) {
                    this.invalidations = bVarT;
                    throw e10;
                }
            } catch (Throwable th2) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        new a(this.abandonSet).d();
                    }
                    throw th2;
                } catch (Exception e11) {
                    a();
                    throw e11;
                }
            }
        }
        return zW1;
    }

    @Override // androidx.compose.runtime.z
    public void G() {
        synchronized (this.lock) {
            if (!K()) {
                this.composer.u2();
                this.slotTable.h0();
                V(this.slotTable);
            }
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
    }

    @Override // androidx.compose.runtime.z
    public void H(@dl.d Object value) {
        RecomposeScopeImpl recomposeScopeImplT0;
        kotlin.jvm.internal.f0.p(value, "value");
        if (j() || (recomposeScopeImplT0 = this.composer.T0()) == null) {
            return;
        }
        recomposeScopeImplT0.G(true);
        this.observations.c(value, recomposeScopeImplT0);
        if (value instanceof b0) {
            this.derivedStates.s(value);
            for (Object obj : ((b0) value).k()) {
                if (obj == null) {
                    break;
                }
                this.derivedStates.c(obj, value);
            }
        }
        recomposeScopeImplT0.w(value);
    }

    @Override // androidx.compose.runtime.z
    public void I(@dl.d Set<? extends Object> values) {
        Object obj;
        Object objX3;
        kotlin.jvm.internal.f0.p(values, "values");
        do {
            obj = this.pendingModifications.get();
            if (obj == null ? true : kotlin.jvm.internal.f0.g(obj, u.f13320a)) {
                objX3 = values;
            } else if (obj instanceof Set) {
                objX3 = new Set[]{(Set) obj, values};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                }
                kotlin.jvm.internal.f0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                objX3 = kotlin.collections.m.X3((Set[]) obj, values);
            }
        } while (!androidx.compose.animation.core.s0.a(this.pendingModifications, obj, objX3));
        if (obj == null) {
            synchronized (this.lock) {
                i();
                kotlin.b2 b2Var = kotlin.b2.f124493a;
            }
        }
    }

    @Override // androidx.compose.runtime.z
    public void J() {
        synchronized (this.lock) {
            try {
                f(this.changes);
                i();
                kotlin.b2 b2Var = kotlin.b2.f124493a;
            } catch (Throwable th2) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        new a(this.abandonSet).d();
                    }
                    throw th2;
                } catch (Exception e10) {
                    a();
                    throw e10;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.z
    public boolean K() {
        return this.composer.getIsComposing();
    }

    @Override // androidx.compose.runtime.z
    public void L(@dl.d Object value) {
        kotlin.jvm.internal.f0.p(value, "value");
        synchronized (this.lock) {
            N(value);
            androidx.compose.runtime.collection.d<b0<?>> dVar = this.derivedStates;
            int iF = dVar.f(value);
            if (iF >= 0) {
                androidx.compose.runtime.collection.c cVarV = dVar.v(iF);
                int size = cVarV.size();
                for (int i10 = 0; i10 < size; i10++) {
                    N((b0) cVarV.get(i10));
                }
            }
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
    }

    @Override // androidx.compose.runtime.z
    public <R> R M(@dl.e z to, int groupIndex, @dl.d yh.a<? extends R> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        if (to == null || kotlin.jvm.internal.f0.g(to, this) || groupIndex < 0) {
            return block.invoke();
        }
        this.invalidationDelegate = (t) to;
        this.invalidationDelegateGroup = groupIndex;
        try {
            return block.invoke();
        } finally {
            this.invalidationDelegate = null;
            this.invalidationDelegateGroup = 0;
        }
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    public final void P(@dl.d b0<?> state) {
        kotlin.jvm.internal.f0.p(state, "state");
        if (this.observations.e(state)) {
            return;
        }
        this.derivedStates.s(state);
    }

    public final void Q(@dl.d Object instance, @dl.d RecomposeScopeImpl scope) {
        kotlin.jvm.internal.f0.p(instance, "instance");
        kotlin.jvm.internal.f0.p(scope, "scope");
        this.observations.r(instance, scope);
    }

    public final void R(@dl.d yh.p<? super p, ? super Integer, kotlin.b2> pVar) {
        kotlin.jvm.internal.f0.p(pVar, "<set-?>");
        this.f13310v = pVar;
    }

    public final void S(boolean z10) {
        this.pendingInvalidScopes = z10;
    }

    @Override // androidx.compose.runtime.q
    public boolean b() {
        boolean z10;
        synchronized (this.lock) {
            z10 = this.invalidations.getSize() > 0;
        }
        return z10;
    }

    @Override // androidx.compose.runtime.q
    public void c(@dl.d yh.p<? super p, ? super Integer, kotlin.b2> content) {
        kotlin.jvm.internal.f0.p(content, "content");
        if (!(!this.disposed)) {
            throw new IllegalStateException("The composition is disposed".toString());
        }
        this.f13310v = content;
        this.parent.a(this, content);
    }

    @Override // androidx.compose.runtime.q
    public void dispose() {
        synchronized (this.lock) {
            if (!this.disposed) {
                this.disposed = true;
                this.f13310v = ComposableSingletons$CompositionKt.f12208a.b();
                List<yh.q<e<?>, SlotWriter, s1, kotlin.b2>> listV0 = this.composer.V0();
                if (listV0 != null) {
                    f(listV0);
                }
                boolean z10 = this.slotTable.getGroupsSize() > 0;
                if (z10 || (true ^ this.abandonSet.isEmpty())) {
                    a aVar = new a(this.abandonSet);
                    if (z10) {
                        SlotWriter a2VarV = this.slotTable.V();
                        try {
                            ComposerKt.n0(a2VarV, aVar);
                            kotlin.b2 b2Var = kotlin.b2.f124493a;
                            a2VarV.I();
                            this.applier.clear();
                            aVar.e();
                        } catch (Throwable th2) {
                            a2VarV.I();
                            throw th2;
                        }
                    }
                    aVar.d();
                }
                this.composer.F0();
            }
            kotlin.b2 b2Var2 = kotlin.b2.f124493a;
        }
        this.parent.s(this);
    }

    @Override // androidx.compose.runtime.q
    /* JADX INFO: renamed from: isDisposed, reason: from getter */
    public boolean getDisposed() {
        return this.disposed;
    }

    @dl.d
    public final yh.p<p, Integer, kotlin.b2> k() {
        return this.f13310v;
    }

    @dl.d
    public final List<RecomposeScopeImpl> l() {
        return CollectionsKt___CollectionsKt.Q5(this.conditionallyInvalidatedScopes);
    }

    @dl.d
    public final List<Object> m() {
        return ArraysKt___ArraysKt.ub(this.derivedStates.getValues());
    }

    @dl.d
    public final List<Object> n() {
        return ArraysKt___ArraysKt.ub(this.observations.getValues());
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getPendingInvalidScopes() {
        return this.pendingInvalidScopes;
    }

    @dl.d
    public final CoroutineContext p() {
        CoroutineContext coroutineContext = this._recomposeContext;
        return coroutineContext == null ? this.parent.h() : coroutineContext;
    }

    @dl.d
    /* JADX INFO: renamed from: q, reason: from getter */
    public final x1 getSlotTable() {
        return this.slotTable;
    }

    @dl.d
    public final InvalidationResult t(@dl.d RecomposeScopeImpl scope, @dl.e Object instance) {
        kotlin.jvm.internal.f0.p(scope, "scope");
        if (scope.m()) {
            scope.C(true);
        }
        c cVarJ = scope.getAnchor();
        if (cVarJ == null || !this.slotTable.W(cVarJ) || !cVarJ.b()) {
            return InvalidationResult.IGNORED;
        }
        if (cVarJ.b() && scope.k()) {
            return u(scope, cVarJ, instance);
        }
        return InvalidationResult.IGNORED;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    public final void v(int i10) {
        List<RecomposeScopeImpl> listQ;
        boolean z10;
        boolean z11;
        synchronized (this.lock) {
            listQ = this.slotTable.Q(i10);
        }
        if (listQ != null) {
            int size = listQ.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z11 = false;
                    break;
                }
                if (listQ.get(i11).t(null) == InvalidationResult.IGNORED) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            z10 = z11;
        }
        if (z10 && this.composer.P0()) {
            this.parent.j(this);
        }
    }

    @Override // androidx.compose.runtime.z
    public void w() {
        synchronized (this.lock) {
            for (Object obj : this.slotTable.getSlots()) {
                RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.invalidate();
                }
            }
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
    }

    @Override // androidx.compose.runtime.z
    public void x(@dl.d y0 state) {
        kotlin.jvm.internal.f0.p(state, "state");
        a aVar = new a(this.abandonSet);
        SlotWriter a2VarV = state.getSlotTable().V();
        try {
            ComposerKt.n0(a2VarV, aVar);
            kotlin.b2 b2Var = kotlin.b2.f124493a;
            a2VarV.I();
            aVar.e();
        } catch (Throwable th2) {
            a2VarV.I();
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.z
    public boolean y(@dl.d Set<? extends Object> values) {
        kotlin.jvm.internal.f0.p(values, "values");
        for (Object obj : values) {
            if (this.observations.e(obj) || this.derivedStates.e(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.z
    public void z() {
        synchronized (this.lock) {
            try {
                this.composer.x0();
                if (!this.abandonSet.isEmpty()) {
                    new a(this.abandonSet).d();
                }
                kotlin.b2 b2Var = kotlin.b2.f124493a;
            } catch (Throwable th2) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        new a(this.abandonSet).d();
                    }
                    throw th2;
                } catch (Exception e10) {
                    a();
                    throw e10;
                }
            }
        }
    }
}
