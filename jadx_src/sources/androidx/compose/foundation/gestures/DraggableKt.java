package androidx.compose.foundation.gestures;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.e0;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.m2;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.i0;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import androidx.core.app.o0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.channels.b0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import s1.x;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001a\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u001a#\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aÑ\u0001\u0010\u001e\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2>\b\u0002\u0010\u001a\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0011¢\u0006\u0002\b\u00192>\b\u0002\u0010\u001c\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0011¢\u0006\u0002\b\u00192\b\b\u0002\u0010\u001d\u001a\u00020\fø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001aë\u0001\u0010$\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f0\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\"2>\b\u0002\u0010\u001a\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0011¢\u0006\u0002\b\u00192>\b\u0002\u0010\u001c\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110#¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0011¢\u0006\u0002\b\u00192\b\b\u0002\u0010\u001d\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001af\u0010+\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0013\u0018\u00010**\u00020&2\u0018\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f0\u00000'2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\"0'2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001aS\u00102\u001a\u00020\f*\u00020&2\u0006\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020\u00132\u0006\u0010)\u001a\u00020(2\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a!\u00104\u001a\u00020\u0001*\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a!\u00106\u001a\u00020\u0001*\u00020#2\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00105\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"Lkotlin/Function1;", "", "Lkotlin/b2;", "onDelta", "Landroidx/compose/foundation/gestures/f;", ak.av, "l", "(Lyh/l;Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/gestures/f;", "Landroidx/compose/ui/n;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "Landroidx/compose/foundation/interaction/g;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/q0;", "Lb1/f;", "Lkotlin/m0;", "name", "startedPosition", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "onDragStarted", "velocity", "onDragStopped", "reverseDirection", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/ui/n;Landroidx/compose/foundation/gestures/f;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/g;ZLyh/q;Lyh/q;Z)Landroidx/compose/ui/n;", "Landroidx/compose/ui/input/pointer/y;", "canDrag", "Lkotlin/Function0;", "Ls1/x;", "i", "(Landroidx/compose/ui/n;Landroidx/compose/foundation/gestures/f;Lyh/l;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/g;Lyh/a;Lyh/q;Lyh/q;Z)Landroidx/compose/ui/n;", "Landroidx/compose/ui/input/pointer/d;", "Landroidx/compose/runtime/m2;", "Lg1/f;", "velocityTracker", "Lkotlin/Pair;", "f", "(Landroidx/compose/ui/input/pointer/d;Landroidx/compose/runtime/m2;Landroidx/compose/runtime/m2;Lg1/f;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/c;)Ljava/lang/Object;", "startEvent", "initialDelta", "Lkotlinx/coroutines/channels/b0;", "Landroidx/compose/foundation/gestures/c;", "channel", "g", "(Landroidx/compose/ui/input/pointer/d;Landroidx/compose/ui/input/pointer/y;JLg1/f;Lkotlinx/coroutines/channels/b0;ZLandroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/c;)Ljava/lang/Object;", "m", "(JLandroidx/compose/foundation/gestures/Orientation;)F", "n", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class DraggableKt {
    @dl.d
    public static final f a(@dl.d yh.l<? super Float, b2> onDelta) {
        f0.p(onDelta, "onDelta");
        return new DefaultDraggableState(onDelta);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x01be  */
    /* JADX WARN: Code duplicated, block: B:46:0x01d9 A[LOOP:0: B:42:0x01bc->B:46:0x01d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e7 A[EDGE_INSN: B:94:0x01e7->B:48:0x01e7 BREAK  A[LOOP:0: B:42:0x01bc->B:46:0x01d9], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0220 -> B:37:0x0189). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0284 -> B:77:0x028b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x02d7 -> B:37:0x0189). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object f(androidx.compose.ui.input.pointer.d r20, androidx.compose.runtime.m2<? extends yh.l<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean>> r21, androidx.compose.runtime.m2<? extends yh.a<java.lang.Boolean>> r22, g1.f r23, androidx.compose.foundation.gestures.Orientation r24, kotlin.coroutines.c<? super kotlin.Pair<androidx.compose.ui.input.pointer.PointerInputChange, b1.f>> r25) {
        /*
            Method dump skipped, instruction units count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.f(androidx.compose.ui.input.pointer.d, androidx.compose.runtime.m2, androidx.compose.runtime.m2, g1.f, androidx.compose.foundation.gestures.Orientation, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(androidx.compose.ui.input.pointer.d dVar, PointerInputChange pointerInputChange, long j10, final g1.f fVar, final b0<? super c> b0Var, final boolean z10, Orientation orientation, kotlin.coroutines.c<? super Boolean> cVar) {
        b0Var.v(new c.C0045c(b1.f.u(pointerInputChange.getPosition(), b1.g.a(b1.f.p(j10) * Math.signum(b1.f.p(pointerInputChange.getPosition())), b1.f.r(j10) * Math.signum(b1.f.r(pointerInputChange.getPosition())))), null));
        if (z10) {
            j10 = b1.f.x(j10, -1.0f);
        }
        b0Var.v(new c.b(j10, null));
        yh.l<PointerInputChange, b2> lVar = new yh.l<PointerInputChange, b2>() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDrag$dragTick$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void a(@dl.d PointerInputChange event) {
                f0.p(event, "event");
                g1.g.a(fVar, event);
                long jK = androidx.compose.ui.input.pointer.q.k(event);
                event.a();
                b0<c> b0Var2 = b0Var;
                if (z10) {
                    jK = b1.f.x(jK, -1.0f);
                }
                b0Var2.v(new c.b(jK, null));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(PointerInputChange pointerInputChange2) {
                a(pointerInputChange2);
                return b2.f124493a;
            }
        };
        return orientation == Orientation.Vertical ? DragGestureDetectorKt.E(dVar, pointerInputChange.getId(), lVar, cVar) : DragGestureDetectorKt.A(dVar, pointerInputChange.getId(), lVar, cVar);
    }

    @dl.d
    public static final androidx.compose.ui.n h(@dl.d androidx.compose.ui.n nVar, @dl.d f state, @dl.d Orientation orientation, boolean z10, @dl.e androidx.compose.foundation.interaction.g gVar, final boolean z11, @dl.d yh.q<? super q0, ? super b1.f, ? super kotlin.coroutines.c<? super b2>, ? extends Object> onDragStarted, @dl.d yh.q<? super q0, ? super Float, ? super kotlin.coroutines.c<? super b2>, ? extends Object> onDragStopped, boolean z12) {
        f0.p(nVar, "<this>");
        f0.p(state, "state");
        f0.p(orientation, "orientation");
        f0.p(onDragStarted, "onDragStarted");
        f0.p(onDragStopped, "onDragStopped");
        return i(nVar, state, new yh.l<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$3
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d PointerInputChange it) {
                f0.p(it, "it");
                return Boolean.TRUE;
            }
        }, orientation, z10, gVar, new yh.a<Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(z11);
            }
        }, onDragStarted, new DraggableKt$draggable$5(onDragStopped, orientation, null), z12);
    }

    @dl.d
    public static final androidx.compose.ui.n i(@dl.d androidx.compose.ui.n nVar, @dl.d final f state, @dl.d final yh.l<? super PointerInputChange, Boolean> canDrag, @dl.d final Orientation orientation, final boolean z10, @dl.e final androidx.compose.foundation.interaction.g gVar, @dl.d final yh.a<Boolean> startDragImmediately, @dl.d final yh.q<? super q0, ? super b1.f, ? super kotlin.coroutines.c<? super b2>, ? extends Object> onDragStarted, @dl.d final yh.q<? super q0, ? super x, ? super kotlin.coroutines.c<? super b2>, ? extends Object> onDragStopped, final boolean z11) {
        f0.p(nVar, "<this>");
        f0.p(state, "state");
        f0.p(canDrag, "canDrag");
        f0.p(orientation, "orientation");
        f0.p(startDragImmediately, "startDragImmediately");
        f0.p(onDragStarted, "onDragStarted");
        f0.p(onDragStopped, "onDragStopped");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("draggable");
                x0Var.getProperties().c("canDrag", canDrag);
                x0Var.getProperties().c("orientation", orientation);
                x0Var.getProperties().c("enabled", Boolean.valueOf(z10));
                x0Var.getProperties().c("reverseDirection", Boolean.valueOf(z11));
                x0Var.getProperties().c("interactionSource", gVar);
                x0Var.getProperties().c("startDragImmediately", startDragImmediately);
                x0Var.getProperties().c("onDragStarted", onDragStarted);
                x0Var.getProperties().c("onDragStopped", onDragStopped);
                x0Var.getProperties().c("state", state);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$9

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$2, reason: invalid class name */
            /* JADX INFO: compiled from: Draggable.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2", f = "Draggable.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {bb.c.b.C1, bb.c.b.E1, 240, bb.c.b.O1, 250, 254}, m = "invokeSuspend", n = {"$this$LaunchedEffect", o0.I0, "$this$LaunchedEffect", o0.I0, "$this$LaunchedEffect", o0.I0, "$this$LaunchedEffect", "$this$LaunchedEffect", "$this$LaunchedEffect"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
            public static final class AnonymousClass2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Object f5434b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f5435c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                int f5436d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private /* synthetic */ Object f5437e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.channels.k<c> f5438f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ f f5439g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ m2<DragLogic> f5440h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                final /* synthetic */ Orientation f5441i;

                /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: Draggable.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2", f = "Draggable.kt", i = {0}, l = {bb.c.b.J1}, m = "invokeSuspend", n = {"$this$drag"}, s = {"L$0"})
                public static final class C00392 extends SuspendLambda implements yh.p<d, kotlin.coroutines.c<? super b2>, Object> {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    Object f5442b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f5443c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private /* synthetic */ Object f5444d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ Ref.ObjectRef<c> f5445e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ kotlinx.coroutines.channels.k<c> f5446f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    final /* synthetic */ Orientation f5447g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00392(Ref.ObjectRef<c> objectRef, kotlinx.coroutines.channels.k<c> kVar, Orientation orientation, kotlin.coroutines.c<? super C00392> cVar) {
                        super(2, cVar);
                        this.f5445e = objectRef;
                        this.f5446f = kVar;
                        this.f5447g = orientation;
                    }

                    @Override // yh.p
                    @dl.e
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(@dl.d d dVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                        return ((C00392) create(dVar, cVar)).invokeSuspend(b2.f124493a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.d
                    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                        C00392 c00392 = new C00392(this.f5445e, this.f5446f, this.f5447g, cVar);
                        c00392.f5444d = obj;
                        return c00392;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0060 -> B:23:0x0066). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                        d dVar;
                        C00392 c00392;
                        c cVar;
                        C00392 c00393;
                        T t10;
                        d dVar2;
                        Ref.ObjectRef<c> objectRef;
                        Object obj2;
                        Object objH = kotlin.coroutines.intrinsics.b.h();
                        int i10 = this.f5443c;
                        if (i10 == 0) {
                            t0.n(obj);
                            dVar = (d) this.f5444d;
                            c00392 = this;
                            cVar = c00392.f5445e.f124891b;
                            if (!(cVar instanceof c.d) || (cVar instanceof c.a)) {
                                return b2.f124493a;
                            }
                            c.b bVar = cVar instanceof c.b ? (c.b) cVar : null;
                            if (bVar != null) {
                                dVar.c(DraggableKt.m(bVar.getDelta(), c00392.f5447g));
                            }
                            Ref.ObjectRef<c> objectRef2 = c00392.f5445e;
                            kotlinx.coroutines.channels.k<c> kVar = c00392.f5446f;
                            c00392.f5444d = dVar;
                            c00392.f5442b = objectRef2;
                            c00392.f5443c = 1;
                            Object objH2 = kVar.h(c00392);
                            if (objH2 == objH) {
                                return objH;
                            }
                            Object obj3 = objH;
                            c00393 = c00392;
                            t10 = objH2;
                            dVar2 = dVar;
                            objectRef = objectRef2;
                            obj2 = obj3;
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Ref.ObjectRef<c> objectRef3 = (Ref.ObjectRef) this.f5442b;
                            d dVar3 = (d) this.f5444d;
                            t0.n(obj);
                            dVar2 = dVar3;
                            objectRef = objectRef3;
                            obj2 = objH;
                            c00393 = this;
                            t10 = obj;
                        }
                        objectRef.f124891b = t10;
                        c00392 = c00393;
                        objH = obj2;
                        dVar = dVar2;
                        cVar = c00392.f5445e.f124891b;
                        if (cVar instanceof c.d) {
                        }
                        return b2.f124493a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(kotlinx.coroutines.channels.k<c> kVar, f fVar, m2<DragLogic> m2Var, Orientation orientation, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                    super(2, cVar);
                    this.f5438f = kVar;
                    this.f5439g = fVar;
                    this.f5440h = m2Var;
                    this.f5441i = orientation;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f5438f, this.f5439g, this.f5440h, this.f5441i, cVar);
                    anonymousClass2.f5437e = obj;
                    return anonymousClass2;
                }

                @Override // yh.p
                @dl.e
                public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    return ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                /* JADX WARN: Code duplicated, block: B:24:0x006e  */
                /* JADX WARN: Code duplicated, block: B:26:0x0084 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:27:0x0085  */
                /* JADX WARN: Code duplicated, block: B:30:0x0093  */
                /* JADX WARN: Code duplicated, block: B:32:0x00b1 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
                /* JADX WARN: Code duplicated, block: B:36:0x00cd A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:37:0x00ce  */
                /* JADX WARN: Code duplicated, block: B:40:0x00dc A[Catch: CancellationException -> 0x010d, TryCatch #3 {CancellationException -> 0x010d, blocks: (B:38:0x00d0, B:40:0x00dc, B:45:0x00f7, B:47:0x00fb), top: B:67:0x00d0 }] */
                /* JADX WARN: Code duplicated, block: B:42:0x00f0 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:45:0x00f7 A[Catch: CancellationException -> 0x010d, TryCatch #3 {CancellationException -> 0x010d, blocks: (B:38:0x00d0, B:40:0x00dc, B:45:0x00f7, B:47:0x00fb), top: B:67:0x00d0 }] */
                /* JADX WARN: Code duplicated, block: B:47:0x00fb A[Catch: CancellationException -> 0x010d, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x010d, blocks: (B:38:0x00d0, B:40:0x00dc, B:45:0x00f7, B:47:0x00fb), top: B:67:0x00d0 }] */
                /* JADX WARN: Code duplicated, block: B:49:0x0108 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:50:0x0109  */
                /* JADX WARN: Code duplicated, block: B:57:0x0129  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v11, types: [T] */
                /* JADX WARN: Type inference failed for: r11v14 */
                /* JADX WARN: Type inference failed for: r11v16, types: [androidx.compose.foundation.gestures.DragLogic] */
                /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object, kotlinx.coroutines.q0] */
                /* JADX WARN: Type inference failed for: r11v2, types: [androidx.compose.foundation.gestures.DragLogic] */
                /* JADX WARN: Type inference failed for: r11v20 */
                /* JADX WARN: Type inference failed for: r11v25 */
                /* JADX WARN: Type inference failed for: r11v26 */
                /* JADX WARN: Type inference failed for: r11v27 */
                /* JADX WARN: Type inference failed for: r11v29 */
                /* JADX WARN: Type inference failed for: r11v30 */
                /* JADX WARN: Type inference failed for: r11v4 */
                /* JADX WARN: Type inference failed for: r11v6 */
                /* JADX WARN: Type inference failed for: r11v7 */
                /* JADX WARN: Type inference failed for: r1v0, types: [int] */
                /* JADX WARN: Type inference failed for: r1v1 */
                /* JADX WARN: Type inference failed for: r1v12 */
                /* JADX WARN: Type inference failed for: r1v17 */
                /* JADX WARN: Type inference failed for: r1v2 */
                /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlinx.coroutines.q0] */
                /* JADX WARN: Type inference failed for: r1v31 */
                /* JADX WARN: Type inference failed for: r1v34 */
                /* JADX WARN: Type inference failed for: r1v41 */
                /* JADX WARN: Type inference failed for: r1v42 */
                /* JADX WARN: Type inference failed for: r1v43 */
                /* JADX WARN: Type inference failed for: r1v6 */
                /* JADX WARN: Type inference failed for: r3v18 */
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlinx.coroutines.q0] */
                /* JADX WARN: Type inference failed for: r3v5 */
                /* JADX WARN: Type inference failed for: r4v10 */
                /* JADX WARN: Type inference failed for: r4v11 */
                /* JADX WARN: Type inference failed for: r4v12 */
                /* JADX WARN: Type inference failed for: r4v2, types: [androidx.compose.foundation.gestures.DragLogic] */
                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlinx.coroutines.q0] */
                /* JADX WARN: Type inference failed for: r4v7 */
                /* JADX WARN: Type inference failed for: r9v2 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0109 -> B:22:0x0068). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0125 -> B:22:0x0068). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0129 -> B:22:0x0068). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r11) {
                    /*
                        Method dump skipped, instruction units count: 322
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt$draggable$9.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3, reason: invalid class name */
            /* JADX INFO: compiled from: Draggable.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3", f = "Draggable.kt", i = {}, l = {bb.c.b.f30507a2}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass3 extends SuspendLambda implements yh.p<i0, kotlin.coroutines.c<? super b2>, Object> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f5448b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private /* synthetic */ Object f5449c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f5450d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ m2<yh.l<PointerInputChange, Boolean>> f5451e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ m2<yh.a<Boolean>> f5452f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ Orientation f5453g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.channels.k<c> f5454h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                final /* synthetic */ boolean f5455i;

                /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1, reason: invalid class name */
                /* JADX INFO: compiled from: Draggable.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1", f = "Draggable.kt", i = {0}, l = {bb.c.b.f30553c2}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"})
                public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f5456b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private /* synthetic */ Object f5457c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ i0 f5458d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ m2<yh.l<PointerInputChange, Boolean>> f5459e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ m2<yh.a<Boolean>> f5460f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    final /* synthetic */ Orientation f5461g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    final /* synthetic */ kotlinx.coroutines.channels.k<c> f5462h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    final /* synthetic */ boolean f5463i;

                    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: compiled from: Draggable.kt */
                    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1", f = "Draggable.kt", i = {0, 0, 1, 1, 1}, l = {bb.c.b.f30623f2, 273}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "velocityTracker", "$this$awaitPointerEventScope", "velocityTracker", "isDragSuccessful"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0"})
                    public static final class C00401 extends RestrictedSuspendLambda implements yh.p<androidx.compose.ui.input.pointer.d, kotlin.coroutines.c<? super b2>, Object> {

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        Object f5464c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        Object f5465d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        Object f5466e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        boolean f5467f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        int f5468g;

                        /* JADX INFO: renamed from: h, reason: collision with root package name */
                        int f5469h;

                        /* JADX INFO: renamed from: i, reason: collision with root package name */
                        private /* synthetic */ Object f5470i;

                        /* JADX INFO: renamed from: j, reason: collision with root package name */
                        final /* synthetic */ q0 f5471j;

                        /* JADX INFO: renamed from: k, reason: collision with root package name */
                        final /* synthetic */ m2<yh.l<PointerInputChange, Boolean>> f5472k;

                        /* JADX INFO: renamed from: l, reason: collision with root package name */
                        final /* synthetic */ m2<yh.a<Boolean>> f5473l;

                        /* JADX INFO: renamed from: m, reason: collision with root package name */
                        final /* synthetic */ Orientation f5474m;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        final /* synthetic */ kotlinx.coroutines.channels.k<c> f5475n;

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        final /* synthetic */ boolean f5476o;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C00401(q0 q0Var, m2<? extends yh.l<? super PointerInputChange, Boolean>> m2Var, m2<? extends yh.a<Boolean>> m2Var2, Orientation orientation, kotlinx.coroutines.channels.k<c> kVar, boolean z10, kotlin.coroutines.c<? super C00401> cVar) {
                            super(2, cVar);
                            this.f5471j = q0Var;
                            this.f5472k = m2Var;
                            this.f5473l = m2Var2;
                            this.f5474m = orientation;
                            this.f5475n = kVar;
                            this.f5476o = z10;
                        }

                        @Override // yh.p
                        @dl.e
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(@dl.d androidx.compose.ui.input.pointer.d dVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                            return ((C00401) create(dVar, cVar)).invokeSuspend(b2.f124493a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @dl.d
                        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                            C00401 c00401 = new C00401(this.f5471j, this.f5472k, this.f5473l, this.f5474m, this.f5475n, this.f5476o, cVar);
                            c00401.f5470i = obj;
                            return c00401;
                        }

                        /* JADX WARN: Code duplicated, block: B:19:0x0066  */
                        /* JADX WARN: Code duplicated, block: B:21:0x0086 A[RETURN] */
                        /* JADX WARN: Code duplicated, block: B:22:0x0087  */
                        /* JADX WARN: Code duplicated, block: B:25:0x0090  */
                        /* JADX WARN: Code duplicated, block: B:28:0x00aa  */
                        /* JADX WARN: Code duplicated, block: B:29:0x00ac  */
                        /* JADX WARN: Code duplicated, block: B:34:0x00d9 A[RETURN] */
                        /* JADX WARN: Code duplicated, block: B:35:0x00da  */
                        /* JADX WARN: Code duplicated, block: B:38:0x00ef  */
                        /* JADX WARN: Code duplicated, block: B:40:0x00f7  */
                        /* JADX WARN: Code duplicated, block: B:41:0x00fa  */
                        /* JADX WARN: Code duplicated, block: B:43:0x0104  */
                        /* JADX WARN: Code duplicated, block: B:74:0x016d  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00da -> B:79:0x00e7). Please report as a decompilation issue!!! */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0143 -> B:62:0x0148). Please report as a decompilation issue!!! */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x016d -> B:17:0x005e). Please report as a decompilation issue!!! */
                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @dl.e
                        public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r25) {
                            /*
                                Method dump skipped, instruction units count: 377
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt$draggable$9.AnonymousClass3.AnonymousClass1.C00401.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(i0 i0Var, m2<? extends yh.l<? super PointerInputChange, Boolean>> m2Var, m2<? extends yh.a<Boolean>> m2Var2, Orientation orientation, kotlinx.coroutines.channels.k<c> kVar, boolean z10, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.f5458d = i0Var;
                        this.f5459e = m2Var;
                        this.f5460f = m2Var2;
                        this.f5461g = orientation;
                        this.f5462h = kVar;
                        this.f5463i = z10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.d
                    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5458d, this.f5459e, this.f5460f, this.f5461g, this.f5462h, this.f5463i, cVar);
                        anonymousClass1.f5457c = obj;
                        return anonymousClass1;
                    }

                    @Override // yh.p
                    @dl.e
                    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                        return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                    }

                    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                        q0 q0Var;
                        CancellationException e10;
                        Object objH = kotlin.coroutines.intrinsics.b.h();
                        int i10 = this.f5456b;
                        if (i10 == 0) {
                            t0.n(obj);
                            q0 q0Var2 = (q0) this.f5457c;
                            try {
                                i0 i0Var = this.f5458d;
                                C00401 c00401 = new C00401(q0Var2, this.f5459e, this.f5460f, this.f5461g, this.f5462h, this.f5463i, null);
                                this.f5457c = q0Var2;
                                this.f5456b = 1;
                                if (i0Var.n1(c00401, this) == objH) {
                                    return objH;
                                }
                            } catch (CancellationException e11) {
                                q0Var = q0Var2;
                                e10 = e11;
                                if (!r0.k(q0Var)) {
                                    throw e10;
                                }
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            q0Var = (q0) this.f5457c;
                            try {
                                t0.n(obj);
                            } catch (CancellationException e12) {
                                e10 = e12;
                                if (!r0.k(q0Var)) {
                                    throw e10;
                                }
                            }
                        }
                        return b2.f124493a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass3(boolean z10, m2<? extends yh.l<? super PointerInputChange, Boolean>> m2Var, m2<? extends yh.a<Boolean>> m2Var2, Orientation orientation, kotlinx.coroutines.channels.k<c> kVar, boolean z11, kotlin.coroutines.c<? super AnonymousClass3> cVar) {
                    super(2, cVar);
                    this.f5450d = z10;
                    this.f5451e = m2Var;
                    this.f5452f = m2Var2;
                    this.f5453g = orientation;
                    this.f5454h = kVar;
                    this.f5455i = z11;
                }

                @Override // yh.p
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    return ((AnonymousClass3) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f5450d, this.f5451e, this.f5452f, this.f5453g, this.f5454h, this.f5455i, cVar);
                    anonymousClass3.f5449c = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f5448b;
                    if (i10 == 0) {
                        t0.n(obj);
                        i0 i0Var = (i0) this.f5449c;
                        if (!this.f5450d) {
                            return b2.f124493a;
                        }
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i0Var, this.f5451e, this.f5452f, this.f5453g, this.f5454h, this.f5455i, null);
                        this.f5448b = 1;
                        if (r0.g(anonymousClass1, this) == objH) {
                            return objH;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t0.n(obj);
                    }
                    return b2.f124493a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final DragLogic c(m2<DragLogic> m2Var) {
                return m2Var.getValue();
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                f0.p(composed, "$this$composed");
                pVar.T(597193710);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(597193710, i10, -1, "androidx.compose.foundation.gestures.draggable.<anonymous> (Draggable.kt:217)");
                }
                pVar.T(-492369756);
                Object objU = pVar.U();
                androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = h2.g(null, null, 2, null);
                    pVar.N(objU);
                }
                pVar.c0();
                final a1 a1Var = (a1) objU;
                final androidx.compose.foundation.interaction.g gVar2 = gVar;
                pVar.T(511388516);
                boolean zS = pVar.s(a1Var) | pVar.s(gVar2);
                Object objU2 = pVar.U();
                if (zS || objU2 == companion.a()) {
                    objU2 = new yh.l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$9$1$1

                        /* JADX INFO: compiled from: Effects.kt */
                        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                        public static final class a implements e0 {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            final /* synthetic */ a1 f5432a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            final /* synthetic */ androidx.compose.foundation.interaction.g f5433b;

                            public a(a1 a1Var, androidx.compose.foundation.interaction.g gVar) {
                                this.f5432a = a1Var;
                                this.f5433b = gVar;
                            }

                            @Override // androidx.compose.runtime.e0
                            public void dispose() {
                                androidx.compose.foundation.interaction.a.b bVar = (androidx.compose.foundation.interaction.a.b) this.f5432a.getValue();
                                if (bVar != null) {
                                    androidx.compose.foundation.interaction.g gVar = this.f5433b;
                                    if (gVar != null) {
                                        gVar.a(new androidx.compose.foundation.interaction.a.C0046a(bVar));
                                    }
                                    this.f5432a.setValue(null);
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // yh.l
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                            f0.p(DisposableEffect, "$this$DisposableEffect");
                            return new a(a1Var, gVar2);
                        }
                    };
                    pVar.N(objU2);
                }
                pVar.c0();
                EffectsKt.c(gVar2, (yh.l) objU2, pVar, 0);
                pVar.T(-492369756);
                Object objU3 = pVar.U();
                if (objU3 == companion.a()) {
                    objU3 = kotlinx.coroutines.channels.m.d(Integer.MAX_VALUE, null, null, 6, null);
                    pVar.N(objU3);
                }
                pVar.c0();
                kotlinx.coroutines.channels.k kVar = (kotlinx.coroutines.channels.k) objU3;
                m2 m2VarT = e2.t(startDragImmediately, pVar, 0);
                m2 m2VarT2 = e2.t(canDrag, pVar, 0);
                m2 m2VarT3 = e2.t(new DragLogic(onDragStarted, onDragStopped, a1Var, gVar), pVar, 8);
                f fVar = state;
                EffectsKt.h(fVar, new AnonymousClass2(kVar, fVar, m2VarT3, orientation, null), pVar, 64);
                androidx.compose.ui.n nVarE = SuspendingPointerInputFilterKt.e(androidx.compose.ui.n.INSTANCE, new Object[]{orientation, Boolean.valueOf(z10), Boolean.valueOf(z11)}, new AnonymousClass3(z10, m2VarT2, m2VarT, orientation, kVar, z11, null));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarE;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return b(nVar2, pVar, num.intValue());
            }
        });
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final f l(@dl.d yh.l<? super Float, b2> onDelta, @dl.e androidx.compose.runtime.p pVar, int i10) {
        f0.p(onDelta, "onDelta");
        pVar.T(-183245213);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-183245213, i10, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:135)");
        }
        final m2 m2VarT = e2.t(onDelta, pVar, i10 & 14);
        pVar.T(-492369756);
        Object objU = pVar.U();
        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = a(new yh.l<Float, b2>() { // from class: androidx.compose.foundation.gestures.DraggableKt$rememberDraggableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void a(float f10) {
                    m2VarT.getValue().invoke(Float.valueOf(f10));
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Float f10) {
                    a(f10.floatValue());
                    return b2.f124493a;
                }
            });
            pVar.N(objU);
        }
        pVar.c0();
        f fVar = (f) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float m(long j10, Orientation orientation) {
        return orientation == Orientation.Vertical ? b1.f.r(j10) : b1.f.p(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float n(long j10, Orientation orientation) {
        return orientation == Orientation.Vertical ? x.n(j10) : x.l(j10);
    }
}
