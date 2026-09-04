package androidx.compose.animation.core;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.j2;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004'+1\u001bB#\b\u0001\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000&\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010*¢\u0006\u0004\bd\u0010eB\u001b\b\u0010\u0012\u0006\u0010\u000f\u001a\u00028\u0000\u0012\b\u0010/\u001a\u0004\u0018\u00010*¢\u0006\u0004\bd\u0010fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0017J)\u0010\u001b\u001a\u00020\u00152\u0018\u0010\u001a\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0019R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001d\u001a\u00020\u00032\u0018\u0010\u001a\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0019R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H\u0001¢\u0006\u0004\b!\u0010 J)\u0010$\u001a\u00020\u00032\u0018\u0010#\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\"R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0019\u0010/\u001a\u0004\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R+\u0010\u0010\u001a\u00028\u00002\u0006\u00100\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R7\u0010<\u001a\b\u0012\u0004\u0012\u00028\u0000072\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u0000078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u00102\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R1\u0010\u0011\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00058F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\u0016\u00102\u0012\u0004\b@\u0010\u000e\u001a\u0004\b=\u0010>\"\u0004\b?\u0010\fR+\u0010C\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u00102\u001a\u0004\bA\u0010>\"\u0004\bB\u0010\fR+\u0010I\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u00158@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bD\u00102\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR,\u0010M\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0019R\b\u0012\u0004\u0012\u00028\u00000\u00000J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001e\u0010N\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010LR1\u0010S\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u00158F@@X\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bO\u00102\u0012\u0004\bR\u0010\u000e\u001a\u0004\bP\u0010F\"\u0004\bQ\u0010HR\"\u0010U\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u00105\u001a\u0004\bO\u0010>\"\u0004\bT\u0010\fR\u001b\u0010Y\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010>R$\u0010\\\u001a\u00028\u00002\u0006\u0010Z\u001a\u00028\u00008F@@X\u0086\u000e¢\u0006\f\u001a\u0004\bK\u00104\"\u0004\b[\u00106R\u0011\u0010^\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b]\u0010FR\u001b\u0010b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000_8F¢\u0006\u0006\u001a\u0004\b`\u0010aR)\u0010c\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0019R\b\u0012\u0004\u0012\u00028\u00000\u00000_8F¢\u0006\u0006\u001a\u0004\bD\u0010a¨\u0006g"}, d2 = {"Landroidx/compose/animation/core/Transition;", androidx.exifinterface.media.a.R4, "", "Lkotlin/b2;", "v", "", "frameTimeNanos", "", "durationScale", RXScreenCaptureService.KEY_WIDTH, "(JF)V", "y", "(J)V", "x", "()V", "initialState", "targetState", "playTimeNanos", "C", "(Ljava/lang/Object;Ljava/lang/Object;J)V", "transition", "", "e", "(Landroidx/compose/animation/core/Transition;)Z", "B", "Landroidx/compose/animation/core/Transition$d;", "animation", "d", "(Landroidx/compose/animation/core/Transition$d;)Z", androidx.exifinterface.media.a.W4, "(Landroidx/compose/animation/core/Transition$d;)V", "L", "(Ljava/lang/Object;Landroidx/compose/runtime/p;I)V", "f", "Landroidx/compose/animation/core/Transition$a;", "deferredAnimation", ak.aD, "(Landroidx/compose/animation/core/Transition$a;)V", "Landroidx/compose/animation/core/r0;", ak.av, "Landroidx/compose/animation/core/r0;", "transitionState", "", "b", "Ljava/lang/String;", "i", "()Ljava/lang/String;", BasePuzzleInfo.PUZZLE_TYPE_LABEL, "<set-?>", ak.aF, "Landroidx/compose/runtime/a1;", "o", "()Ljava/lang/Object;", "J", "(Ljava/lang/Object;)V", "Landroidx/compose/animation/core/Transition$b;", "m", "()Landroidx/compose/animation/core/Transition$b;", "H", "(Landroidx/compose/animation/core/Transition$b;)V", "segment", "k", "()J", "F", "getPlayTimeNanos$annotations", "n", "I", "startTimeNanos", "g", "r", "()Z", "K", "(Z)V", "updateChildrenNeeded", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "_animations", "_transitions", "j", "t", "G", "isSeeking$annotations", "isSeeking", androidx.exifinterface.media.a.S4, "lastSeekedTimeNanos", "l", "Landroidx/compose/runtime/m2;", "p", "totalDurationNanos", "value", "D", "currentState", ak.aB, "isRunning", "", "q", "()Ljava/util/List;", "transitions", "animations", "<init>", "(Landroidx/compose/animation/core/r0;Ljava/lang/String;)V", "(Ljava/lang/Object;Ljava/lang/String;)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class Transition<S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final r0<S> transitionState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final String label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 targetState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 segment;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 playTimeNanos;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 startTimeNanos;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 updateChildrenNeeded;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SnapshotStateList<Transition<S>.d<?, ?>> _animations;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SnapshotStateList<Transition<?>> _transitions;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 isSeeking;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long lastSeekedTimeNanos;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m2 totalDurationNanos;

    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001\u000fB%\b\u0000\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0013\u0012\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b&\u0010'JT\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0005¢\u0006\u0002\b\b2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00028\u00010\u0005J\u000f\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR{\u0010%\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001eR\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\u001f2.\u0010 \u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001eR\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\u001f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010!\u001a\u0004\b\u0019\u0010\"\"\u0004\b#\u0010$¨\u0006("}, d2 = {"Landroidx/compose/animation/core/Transition$a;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$b;", "Landroidx/compose/animation/core/f0;", "Lkotlin/t;", "transitionSpec", "Lkotlin/m0;", "name", "state", "targetValueByState", "Landroidx/compose/runtime/m2;", ak.av, "Lkotlin/b2;", "f", "()V", "Landroidx/compose/animation/core/f1;", "Landroidx/compose/animation/core/f1;", "d", "()Landroidx/compose/animation/core/f1;", "typeConverter", "", "b", "Ljava/lang/String;", ak.aF, "()Ljava/lang/String;", BasePuzzleInfo.PUZZLE_TYPE_LABEL, "Landroidx/compose/animation/core/Transition$a$a;", "Landroidx/compose/animation/core/Transition;", "<set-?>", "Landroidx/compose/runtime/a1;", "()Landroidx/compose/animation/core/Transition$a$a;", "e", "(Landroidx/compose/animation/core/Transition$a$a;)V", "data", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/f1;Ljava/lang/String;)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
    @o0
    public final class a<T, V extends p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final f1<T, V> typeConverter;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.compose.runtime.a1 data;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Transition<S> f4274d;

        /* JADX INFO: renamed from: androidx.compose.animation.core.Transition$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Transition.kt */
        @Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\b\b\u0004\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00030\u0004Bm\u0012\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\tR\b\u0012\u0004\u0012\u00028\u00000\n\u0012#\u0010\u0013\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00110\u0010¢\u0006\u0002\b\u0012\u0012!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00028\u00030\u0010¢\u0006\u0004\b\"\u0010#J\u0014\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005R-\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\tR\b\u0012\u0004\u0012\u00028\u00000\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR?\u0010\u0013\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00110\u0010¢\u0006\u0002\b\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R=\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00028\u00030\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u0014\u0010!\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Landroidx/compose/animation/core/Transition$a$a;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/runtime/m2;", "Landroidx/compose/animation/core/Transition$b;", "segment", "Lkotlin/b2;", "j", "Landroidx/compose/animation/core/Transition$d;", "Landroidx/compose/animation/core/Transition;", "b", "Landroidx/compose/animation/core/Transition$d;", ak.aF, "()Landroidx/compose/animation/core/Transition$d;", "animation", "Lkotlin/Function1;", "Landroidx/compose/animation/core/f0;", "Lkotlin/t;", "transitionSpec", "Lyh/l;", "g", "()Lyh/l;", "i", "(Lyh/l;)V", "Lkotlin/m0;", "name", "state", "targetValueByState", "e", RXScreenCaptureService.KEY_HEIGHT, "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Landroidx/compose/animation/core/Transition$a;Landroidx/compose/animation/core/Transition$d;Lyh/l;Lyh/l;)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
        public final class C0031a<T, V extends p> implements m2<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @dl.d
            private final Transition<S>.d<T, V> animation;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @dl.d
            private yh.l<? super b<S>, ? extends f0<T>> f4276c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @dl.d
            private yh.l<? super S, ? extends T> f4277d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Transition<S>.a<T, V> f4278e;

            public C0031a(@dl.d a aVar, @dl.d Transition<S>.d<T, V> animation, @dl.d yh.l<? super b<S>, ? extends f0<T>> transitionSpec, yh.l<? super S, ? extends T> targetValueByState) {
                kotlin.jvm.internal.f0.p(animation, "animation");
                kotlin.jvm.internal.f0.p(transitionSpec, "transitionSpec");
                kotlin.jvm.internal.f0.p(targetValueByState, "targetValueByState");
                this.f4278e = aVar;
                this.animation = animation;
                this.f4276c = transitionSpec;
                this.f4277d = targetValueByState;
            }

            @dl.d
            public final Transition<S>.d<T, V> c() {
                return this.animation;
            }

            @dl.d
            public final yh.l<S, T> e() {
                return this.f4277d;
            }

            @dl.d
            public final yh.l<b<S>, f0<T>> g() {
                return this.f4276c;
            }

            @Override // androidx.compose.runtime.m2
            public T getValue() {
                j(this.f4278e.f4274d.m());
                return this.animation.getValue();
            }

            public final void h(@dl.d yh.l<? super S, ? extends T> lVar) {
                kotlin.jvm.internal.f0.p(lVar, "<set-?>");
                this.f4277d = lVar;
            }

            public final void i(@dl.d yh.l<? super b<S>, ? extends f0<T>> lVar) {
                kotlin.jvm.internal.f0.p(lVar, "<set-?>");
                this.f4276c = lVar;
            }

            public final void j(@dl.d b<S> segment) {
                kotlin.jvm.internal.f0.p(segment, "segment");
                T tInvoke = this.f4277d.invoke(segment.a());
                if (!this.f4278e.f4274d.t()) {
                    this.animation.D(tInvoke, this.f4276c.invoke(segment));
                } else {
                    this.animation.C(this.f4277d.invoke(segment.c()), tInvoke, this.f4276c.invoke(segment));
                }
            }
        }

        public a(@dl.d Transition transition, @dl.d f1<T, V> typeConverter, String label) {
            kotlin.jvm.internal.f0.p(typeConverter, "typeConverter");
            kotlin.jvm.internal.f0.p(label, "label");
            this.f4274d = transition;
            this.typeConverter = typeConverter;
            this.label = label;
            this.data = h2.g(null, null, 2, null);
        }

        @dl.d
        public final m2<T> a(@dl.d yh.l<? super b<S>, ? extends f0<T>> transitionSpec, @dl.d yh.l<? super S, ? extends T> targetValueByState) {
            kotlin.jvm.internal.f0.p(transitionSpec, "transitionSpec");
            kotlin.jvm.internal.f0.p(targetValueByState, "targetValueByState");
            Transition<S>.C0031a<T, V>.a<T, V> c0031aB = b();
            if (c0031aB == null) {
                Transition<S> transition = this.f4274d;
                c0031aB = new C0031a<>(this, new d(transition, targetValueByState.invoke(transition.h()), k.i(this.typeConverter, targetValueByState.invoke(this.f4274d.h())), this.typeConverter, this.label), transitionSpec, targetValueByState);
                Transition<S> transition2 = this.f4274d;
                e(c0031aB);
                transition2.d(c0031aB.c());
            }
            Transition<S> transition3 = this.f4274d;
            c0031aB.h(targetValueByState);
            c0031aB.i(transitionSpec);
            c0031aB.j(transition3.m());
            return c0031aB;
        }

        @dl.e
        public final Transition<S>.C0031a<T, V>.a<T, V> b() {
            return (C0031a) this.data.getValue();
        }

        @dl.d
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @dl.d
        public final f1<T, V> d() {
            return this.typeConverter;
        }

        public final void e(@dl.e Transition<S>.C0031a<T, V>.a<T, V> c0031a) {
            this.data.setValue(c0031a);
        }

        public final void f() {
            Transition<S>.C0031a<T, V>.a<T, V> c0031aB = b();
            if (c0031aB != null) {
                Transition<S> transition = this.f4274d;
                c0031aB.c().C(c0031aB.e().invoke(transition.m().c()), c0031aB.e().invoke(transition.m().a()), c0031aB.g().invoke(transition.m()));
            }
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001c\u0010\u0005\u001a\u00020\u0004*\u00028\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/Transition$b;", androidx.exifinterface.media.a.R4, "", "targetState", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", ak.aF, "()Ljava/lang/Object;", "initialState", ak.av, "animation-core_release"}, k = 1, mv = {1, 7, 1})
    public interface b<S> {

        /* JADX INFO: compiled from: Transition.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a {
            @Deprecated
            public static <S> boolean a(@dl.d b<S> bVar, S s10, S s11) {
                return d1.a(bVar, s10, s11);
            }
        }

        S a();

        boolean b(S s10, S s11);

        S c();
    }

    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0017\u0012\u0006\u0010\r\u001a\u00028\u0001\u0012\u0006\u0010\u000f\u001a\u00028\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\r\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/core/Transition$c;", androidx.exifinterface.media.a.R4, "Landroidx/compose/animation/core/Transition$b;", "", "other", "", "equals", "", "hashCode", ak.av, "Ljava/lang/Object;", ak.aF, "()Ljava/lang/Object;", "initialState", "b", "targetState", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class c<S> implements b<S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final S initialState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final S targetState;

        public c(S s10, S s11) {
            this.initialState = s10;
            this.targetState = s11;
        }

        @Override // androidx.compose.animation.core.Transition.b
        public S a() {
            return this.targetState;
        }

        @Override // androidx.compose.animation.core.Transition.b
        public /* synthetic */ boolean b(Object obj, Object obj2) {
            return d1.a(this, obj, obj2);
        }

        @Override // androidx.compose.animation.core.Transition.b
        public S c() {
            return this.initialState;
        }

        public boolean equals(@dl.e Object other) {
            if (other instanceof b) {
                b bVar = (b) other;
                if (kotlin.jvm.internal.f0.g(c(), bVar.c()) && kotlin.jvm.internal.f0.g(a(), bVar.a())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            S sC = c();
            int iHashCode = (sC != null ? sC.hashCode() : 0) * 31;
            S sA = a();
            return iHashCode + (sA != null ? sA.hashCode() : 0);
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @j2
    @Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B5\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010O\u001a\u00028\u0002\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001c\u0012\u0006\u0010'\u001a\u00020\"¢\u0006\u0004\bP\u0010QJ#\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00028\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00028\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR#\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R+\u0010\u0015\u001a\u00028\u00012\u0006\u0010(\u001a\u00028\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R7\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00162\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u00168F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b/\u00100\"\u0004\b1\u00102RC\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002032\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002038F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010*\u001a\u0004\b#\u00105\"\u0004\b6\u00107R+\u0010>\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010*\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010B\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010*\u001a\u0004\b?\u0010@\"\u0004\bA\u0010\u0012R+\u0010E\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010*\u001a\u0004\bC\u0010;\"\u0004\bD\u0010=R+\u0010H\u001a\u00028\u00012\u0006\u0010(\u001a\u00028\u00018V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010*\u001a\u0004\bF\u0010,\"\u0004\bG\u0010.R\u0016\u0010K\u001a\u00028\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010LR\u0014\u0010N\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010@¨\u0006R"}, d2 = {"Landroidx/compose/animation/core/Transition$d;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/runtime/m2;", "initialValue", "", "isInterrupted", "Lkotlin/b2;", androidx.exifinterface.media.a.W4, "(Ljava/lang/Object;Z)V", "", "playTimeNanos", "", "durationScale", "q", "(JF)V", ak.aB, "(J)V", "r", "()V", "targetValue", "Landroidx/compose/animation/core/f0;", "animationSpec", "D", "(Ljava/lang/Object;Landroidx/compose/animation/core/f0;)V", "C", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/f0;)V", "Landroidx/compose/animation/core/f1;", "b", "Landroidx/compose/animation/core/f1;", "m", "()Landroidx/compose/animation/core/f1;", "typeConverter", "", ak.aF, "Ljava/lang/String;", RXScreenCaptureService.KEY_HEIGHT, "()Ljava/lang/String;", BasePuzzleInfo.PUZZLE_TYPE_LABEL, "<set-?>", "d", "Landroidx/compose/runtime/a1;", "l", "()Ljava/lang/Object;", "y", "(Ljava/lang/Object;)V", "e", "()Landroidx/compose/animation/core/f0;", ak.aG, "(Landroidx/compose/animation/core/f0;)V", "Landroidx/compose/animation/core/c1;", "f", "()Landroidx/compose/animation/core/c1;", "t", "(Landroidx/compose/animation/core/c1;)V", "animation", "g", "p", "()Z", "v", "(Z)V", "isFinished", "j", "()J", "x", "offsetTimeNanos", "i", RXScreenCaptureService.KEY_WIDTH, "needsReset", "getValue", ak.aD, "value", "k", "Landroidx/compose/animation/core/p;", "velocityVector", "Landroidx/compose/animation/core/f0;", "interruptionSpec", "durationNanos", "initialVelocityVector", "<init>", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/f1;Ljava/lang/String;)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
    public final class d<T, V extends p> implements m2<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final f1<T, V> typeConverter;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final String label;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.compose.runtime.a1 targetValue;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.compose.runtime.a1 animationSpec;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.compose.runtime.a1 animation;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.compose.runtime.a1 isFinished;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.compose.runtime.a1 offsetTimeNanos;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.compose.runtime.a1 needsReset;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.compose.runtime.a1 value;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private V velocityVector;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final f0<T> interruptionSpec;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Transition<S> f4300m;

        public d(Transition transition, @dl.d T t10, @dl.d V initialVelocityVector, @dl.d f1<T, V> typeConverter, String label) {
            T tInvoke;
            kotlin.jvm.internal.f0.p(initialVelocityVector, "initialVelocityVector");
            kotlin.jvm.internal.f0.p(typeConverter, "typeConverter");
            kotlin.jvm.internal.f0.p(label, "label");
            this.f4300m = transition;
            this.typeConverter = typeConverter;
            this.label = label;
            this.targetValue = h2.g(t10, null, 2, null);
            this.animationSpec = h2.g(i.o(0.0f, 0.0f, null, 7, null), null, 2, null);
            this.animation = h2.g(new c1(e(), typeConverter, t10, l(), initialVelocityVector), null, 2, null);
            this.isFinished = h2.g(Boolean.TRUE, null, 2, null);
            this.offsetTimeNanos = h2.g(0L, null, 2, null);
            this.needsReset = h2.g(Boolean.FALSE, null, 2, null);
            this.value = h2.g(t10, null, 2, null);
            this.velocityVector = initialVelocityVector;
            Float f10 = x1.i().get(typeConverter);
            if (f10 != null) {
                float fFloatValue = f10.floatValue();
                V vInvoke = typeConverter.a().invoke(t10);
                int i10 = vInvoke.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                for (int i11 = 0; i11 < i10; i11++) {
                    vInvoke.e(i11, fFloatValue);
                }
                tInvoke = this.typeConverter.b().invoke(vInvoke);
            } else {
                tInvoke = null;
            }
            this.interruptionSpec = i.o(0.0f, 0.0f, tInvoke, 3, null);
        }

        private final void A(T initialValue, boolean isInterrupted) {
            f0<T> f0VarE = (!isInterrupted || (e() instanceof z0)) ? e() : this.interruptionSpec;
            t(new c1<>(f0VarE, this.typeConverter, initialValue, l(), this.velocityVector));
            this.f4300m.v();
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ void B(d dVar, Object obj, boolean z10, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = dVar.getValue();
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            dVar.A(obj, z10);
        }

        private final boolean i() {
            return ((Boolean) this.needsReset.getValue()).booleanValue();
        }

        private final long j() {
            return ((Number) this.offsetTimeNanos.getValue()).longValue();
        }

        private final T l() {
            return this.targetValue.getValue();
        }

        private final void t(c1<T, V> c1Var) {
            this.animation.setValue(c1Var);
        }

        private final void u(f0<T> f0Var) {
            this.animationSpec.setValue(f0Var);
        }

        private final void w(boolean z10) {
            this.needsReset.setValue(Boolean.valueOf(z10));
        }

        private final void x(long j10) {
            this.offsetTimeNanos.setValue(Long.valueOf(j10));
        }

        private final void y(T t10) {
            this.targetValue.setValue(t10);
        }

        public final void C(T initialValue, T targetValue, @dl.d f0<T> animationSpec) {
            kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
            y(targetValue);
            u(animationSpec);
            if (kotlin.jvm.internal.f0.g(c().i(), initialValue) && kotlin.jvm.internal.f0.g(c().f(), targetValue)) {
                return;
            }
            B(this, initialValue, false, 2, null);
        }

        public final void D(T targetValue, @dl.d f0<T> animationSpec) {
            kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
            if (!kotlin.jvm.internal.f0.g(l(), targetValue) || i()) {
                y(targetValue);
                u(animationSpec);
                B(this, null, !p(), 1, null);
                v(false);
                x(this.f4300m.k());
                w(false);
            }
        }

        @dl.d
        public final c1<T, V> c() {
            return (c1) this.animation.getValue();
        }

        @dl.d
        public final f0<T> e() {
            return (f0) this.animationSpec.getValue();
        }

        public final long g() {
            return c().getDurationNanos();
        }

        @Override // androidx.compose.runtime.m2
        public T getValue() {
            return this.value.getValue();
        }

        @dl.d
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @dl.d
        public final f1<T, V> m() {
            return this.typeConverter;
        }

        public final boolean p() {
            return ((Boolean) this.isFinished.getValue()).booleanValue();
        }

        public final void q(long playTimeNanos, float durationScale) {
            long durationNanos;
            if (durationScale > 0.0f) {
                float fJ = (playTimeNanos - j()) / durationScale;
                if (!(!Float.isNaN(fJ))) {
                    throw new IllegalStateException(("Duration scale adjusted time is NaN. Duration scale: " + durationScale + ",playTimeNanos: " + playTimeNanos + ", offsetTimeNanos: " + j()).toString());
                }
                durationNanos = (long) fJ;
            } else {
                durationNanos = c().getDurationNanos();
            }
            z(c().e(durationNanos));
            this.velocityVector = (V) c().g(durationNanos);
            if (c().b(durationNanos)) {
                v(true);
                x(0L);
            }
        }

        public final void r() {
            w(true);
        }

        public final void s(long playTimeNanos) {
            z(c().e(playTimeNanos));
            this.velocityVector = (V) c().g(playTimeNanos);
        }

        public final void v(boolean z10) {
            this.isFinished.setValue(Boolean.valueOf(z10));
        }

        public void z(T t10) {
            this.value.setValue(t10);
        }
    }

    @kotlin.r0
    public Transition(@dl.d r0<S> transitionState, @dl.e String str) {
        kotlin.jvm.internal.f0.p(transitionState, "transitionState");
        this.transitionState = transitionState;
        this.label = str;
        this.targetState = h2.g(h(), null, 2, null);
        this.segment = h2.g(new c(h(), h()), null, 2, null);
        this.playTimeNanos = h2.g(0L, null, 2, null);
        this.startTimeNanos = h2.g(Long.MIN_VALUE, null, 2, null);
        this.updateChildrenNeeded = h2.g(Boolean.TRUE, null, 2, null);
        this._animations = e2.f();
        this._transitions = e2.f();
        this.isSeeking = h2.g(Boolean.FALSE, null, 2, null);
        this.totalDurationNanos = e2.d(new yh.a<Long>(this) { // from class: androidx.compose.animation.core.Transition$totalDurationNanos$2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Transition<S> f4301b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f4301b = this;
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke() {
                Iterator<T> it = ((Transition) this.f4301b)._animations.iterator();
                long jMax = 0;
                while (it.hasNext()) {
                    jMax = Math.max(jMax, ((Transition.d) it.next()).g());
                }
                Iterator<T> it2 = ((Transition) this.f4301b)._transitions.iterator();
                while (it2.hasNext()) {
                    jMax = Math.max(jMax, ((Transition) it2.next()).p());
                }
                return Long.valueOf(jMax);
            }
        });
    }

    public /* synthetic */ Transition(r0 r0Var, String str, int i10, kotlin.jvm.internal.u uVar) {
        this(r0Var, (i10 & 2) != 0 ? null : str);
    }

    public Transition(S s10, @dl.e String str) {
        this(new r0(s10), str);
    }

    private final void H(b<S> bVar) {
        this.segment.setValue(bVar);
    }

    private final void I(long j10) {
        this.startTimeNanos.setValue(Long.valueOf(j10));
    }

    @o0
    public static /* synthetic */ void l() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long n() {
        return ((Number) this.startTimeNanos.getValue()).longValue();
    }

    @o0
    public static /* synthetic */ void u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        K(true);
        if (t()) {
            long jMax = 0;
            for (Transition<S>.d<?, ?> dVar : this._animations) {
                jMax = Math.max(jMax, dVar.g());
                dVar.s(this.lastSeekedTimeNanos);
            }
            K(false);
        }
    }

    public final void A(@dl.d Transition<S>.d<?, ?> animation) {
        kotlin.jvm.internal.f0.p(animation, "animation");
        this._animations.remove(animation);
    }

    public final boolean B(@dl.d Transition<?> transition) {
        kotlin.jvm.internal.f0.p(transition, "transition");
        return this._transitions.remove(transition);
    }

    @xh.h(name = "seek")
    public final void C(S initialState, S targetState, long playTimeNanos) {
        I(Long.MIN_VALUE);
        this.transitionState.f(false);
        if (!t() || !kotlin.jvm.internal.f0.g(h(), initialState) || !kotlin.jvm.internal.f0.g(o(), targetState)) {
            D(initialState);
            J(targetState);
            G(true);
            H(new c(initialState, targetState));
        }
        for (Transition<?> transition : this._transitions) {
            kotlin.jvm.internal.f0.n(transition, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (transition.t()) {
                transition.C(transition.h(), transition.o(), playTimeNanos);
            }
        }
        Iterator<Transition<S>.d<?, ?>> it = this._animations.iterator();
        while (it.hasNext()) {
            it.next().s(playTimeNanos);
        }
        this.lastSeekedTimeNanos = playTimeNanos;
    }

    public final void D(S s10) {
        this.transitionState.e(s10);
    }

    public final void E(long j10) {
        this.lastSeekedTimeNanos = j10;
    }

    public final void F(long j10) {
        this.playTimeNanos.setValue(Long.valueOf(j10));
    }

    public final void G(boolean z10) {
        this.isSeeking.setValue(Boolean.valueOf(z10));
    }

    public final void J(S s10) {
        this.targetState.setValue(s10);
    }

    public final void K(boolean z10) {
        this.updateChildrenNeeded.setValue(Boolean.valueOf(z10));
    }

    @androidx.compose.runtime.h
    public final void L(final S s10, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        int i11;
        androidx.compose.runtime.p pVarF = pVar.F(-583974681);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(s10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= pVarF.s(this) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-583974681, i10, -1, "androidx.compose.animation.core.Transition.updateTarget (Transition.kt:399)");
            }
            if (!t() && !kotlin.jvm.internal.f0.g(o(), s10)) {
                H(new c(o(), s10));
                D(o());
                J(s10);
                if (!s()) {
                    K(true);
                }
                Iterator<Transition<S>.d<?, ?>> it = this._animations.iterator();
                while (it.hasNext()) {
                    it.next().r();
                }
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>(this) { // from class: androidx.compose.animation.core.Transition$updateTarget$2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Transition<S> f4302b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.f4302b = this;
            }

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
            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                this.f4302b.L(s10, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    public final boolean d(@dl.d Transition<S>.d<?, ?> animation) {
        kotlin.jvm.internal.f0.p(animation, "animation");
        return this._animations.add(animation);
    }

    public final boolean e(@dl.d Transition<?> transition) {
        kotlin.jvm.internal.f0.p(transition, "transition");
        return this._transitions.add(transition);
    }

    @androidx.compose.runtime.h
    public final void f(final S s10, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        int i11;
        androidx.compose.runtime.p pVarF = pVar.F(-1493585151);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(s10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= pVarF.s(this) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1493585151, i11, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:424)");
            }
            if (!t()) {
                L(s10, pVarF, (i11 & 14) | (i11 & 112));
                if (!kotlin.jvm.internal.f0.g(s10, h()) || s() || r()) {
                    int i12 = ((i11 >> 3) & 14) | 64;
                    pVarF.T(1157296644);
                    boolean zS = pVarF.s(this);
                    Object objU = pVarF.U();
                    if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new Transition$animateTo$1$1(this, null);
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    EffectsKt.h(this, (yh.p) objU, pVarF, i12);
                }
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>(this) { // from class: androidx.compose.animation.core.Transition$animateTo$2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Transition<S> f4284b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.f4284b = this;
            }

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
            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i13) {
                this.f4284b.f(s10, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @dl.d
    public final List<Transition<S>.d<?, ?>> g() {
        return this._animations;
    }

    public final S h() {
        return this.transitionState.a();
    }

    @dl.e
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getLastSeekedTimeNanos() {
        return this.lastSeekedTimeNanos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long k() {
        return ((Number) this.playTimeNanos.getValue()).longValue();
    }

    @dl.d
    public final b<S> m() {
        return (b) this.segment.getValue();
    }

    public final S o() {
        return (S) this.targetState.getValue();
    }

    public final long p() {
        return ((Number) this.totalDurationNanos.getValue()).longValue();
    }

    @dl.d
    public final List<Transition<?>> q() {
        return this._transitions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r() {
        return ((Boolean) this.updateChildrenNeeded.getValue()).booleanValue();
    }

    public final boolean s() {
        return n() != Long.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean t() {
        return ((Boolean) this.isSeeking.getValue()).booleanValue();
    }

    public final void w(long frameTimeNanos, float durationScale) {
        if (n() == Long.MIN_VALUE) {
            y(frameTimeNanos);
        }
        K(false);
        F(frameTimeNanos - n());
        boolean z10 = true;
        for (Transition<S>.d<?, ?> dVar : this._animations) {
            if (!dVar.p()) {
                dVar.q(k(), durationScale);
            }
            if (!dVar.p()) {
                z10 = false;
            }
        }
        for (Transition<?> transition : this._transitions) {
            if (!kotlin.jvm.internal.f0.g(transition.o(), transition.h())) {
                transition.w(k(), durationScale);
            }
            if (!kotlin.jvm.internal.f0.g(transition.o(), transition.h())) {
                z10 = false;
            }
        }
        if (z10) {
            x();
        }
    }

    public final void x() {
        I(Long.MIN_VALUE);
        D(o());
        F(0L);
        this.transitionState.f(false);
    }

    public final void y(long frameTimeNanos) {
        I(frameTimeNanos);
        this.transitionState.f(true);
    }

    public final void z(@dl.d Transition<S>.a<?, ?> deferredAnimation) {
        Transition<S>.d<?, ?> dVarC;
        kotlin.jvm.internal.f0.p(deferredAnimation, "deferredAnimation");
        Transition<S>.C0031a<?, ?>.a<?, V> c0031aB = deferredAnimation.b();
        if (c0031aB == 0 || (dVarC = c0031aB.c()) == null) {
            return;
        }
        A(dVarC);
    }
}
