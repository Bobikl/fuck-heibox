package androidx.compose.foundation.gestures;

import androidx.compose.runtime.a1;
import androidx.core.app.o0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.q0;
import s1.x;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B£\u0001\u0012<\u0010!\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001a¢\u0006\u0002\b \u0012<\u0010&\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110$¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001a¢\u0006\u0002\b \u0012\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018RS\u0010!\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001a¢\u0006\u0002\b 8\u0006ø\u0001\u0000ø\u0001\u0000¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u000f\u0010#RS\u0010&\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110$¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001a¢\u0006\u0002\b 8\u0006ø\u0001\u0000ø\u0001\u0000¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b\u0015\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroidx/compose/foundation/gestures/DragLogic;", "", "Lkotlinx/coroutines/q0;", "Landroidx/compose/foundation/gestures/c$c;", o0.I0, "Lkotlin/b2;", "f", "(Lkotlinx/coroutines/q0;Landroidx/compose/foundation/gestures/c$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/c$d;", "g", "(Lkotlinx/coroutines/q0;Landroidx/compose/foundation/gestures/c$d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "e", "(Lkotlinx/coroutines/q0;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/runtime/a1;", "Landroidx/compose/foundation/interaction/a$b;", ak.aF, "Landroidx/compose/runtime/a1;", ak.av, "()Landroidx/compose/runtime/a1;", "dragStartInteraction", "Landroidx/compose/foundation/interaction/g;", "d", "Landroidx/compose/foundation/interaction/g;", "b", "()Landroidx/compose/foundation/interaction/g;", "interactionSource", "Lkotlin/Function3;", "Lb1/f;", "Lkotlin/m0;", "name", "startedPosition", "Lkotlin/coroutines/c;", "Lkotlin/t;", "onDragStarted", "Lyh/q;", "()Lyh/q;", "Ls1/x;", "velocity", "onDragStopped", "<init>", "(Lyh/q;Lyh/q;Landroidx/compose/runtime/a1;Landroidx/compose/foundation/interaction/g;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class DragLogic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final yh.q<q0, b1.f, kotlin.coroutines.c<? super b2>, Object> f5362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.q<q0, x, kotlin.coroutines.c<? super b2>, Object> f5363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1<androidx.compose.foundation.interaction.a.b> dragStartInteraction;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final androidx.compose.foundation.interaction.g interactionSource;

    /* JADX WARN: Multi-variable type inference failed */
    public DragLogic(@dl.d yh.q<? super q0, ? super b1.f, ? super kotlin.coroutines.c<? super b2>, ? extends Object> onDragStarted, @dl.d yh.q<? super q0, ? super x, ? super kotlin.coroutines.c<? super b2>, ? extends Object> onDragStopped, @dl.d a1<androidx.compose.foundation.interaction.a.b> dragStartInteraction, @dl.e androidx.compose.foundation.interaction.g gVar) {
        f0.p(onDragStarted, "onDragStarted");
        f0.p(onDragStopped, "onDragStopped");
        f0.p(dragStartInteraction, "dragStartInteraction");
        this.f5362a = onDragStarted;
        this.f5363b = onDragStopped;
        this.dragStartInteraction = dragStartInteraction;
        this.interactionSource = gVar;
    }

    @dl.d
    public final a1<androidx.compose.foundation.interaction.a.b> a() {
        return this.dragStartInteraction;
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final androidx.compose.foundation.interaction.g getInteractionSource() {
        return this.interactionSource;
    }

    @dl.d
    public final yh.q<q0, b1.f, kotlin.coroutines.c<? super b2>, Object> c() {
        return this.f5362a;
    }

    @dl.d
    public final yh.q<q0, x, kotlin.coroutines.c<? super b2>, Object> d() {
        return this.f5363b;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public final Object e(@dl.d q0 q0Var, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        DragLogic$processDragCancel$1 dragLogic$processDragCancel$1;
        DragLogic dragLogic;
        yh.q<q0, x, kotlin.coroutines.c<? super b2>, Object> qVar;
        x xVarB;
        if (cVar instanceof DragLogic$processDragCancel$1) {
            dragLogic$processDragCancel$1 = (DragLogic$processDragCancel$1) cVar;
            int i10 = dragLogic$processDragCancel$1.f5370f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dragLogic$processDragCancel$1.f5370f = i10 - Integer.MIN_VALUE;
            } else {
                dragLogic$processDragCancel$1 = new DragLogic$processDragCancel$1(this, cVar);
            }
        } else {
            dragLogic$processDragCancel$1 = new DragLogic$processDragCancel$1(this, cVar);
        }
        Object obj = dragLogic$processDragCancel$1.f5368d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = dragLogic$processDragCancel$1.f5370f;
        if (i11 != 0) {
            if (i11 == 1) {
                q0Var = (q0) dragLogic$processDragCancel$1.f5367c;
                dragLogic = (DragLogic) dragLogic$processDragCancel$1.f5366b;
                t0.n(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
        t0.n(obj);
        androidx.compose.foundation.interaction.a.b value = this.dragStartInteraction.getValue();
        if (value != null) {
            androidx.compose.foundation.interaction.g gVar = this.interactionSource;
            if (gVar != null) {
                androidx.compose.foundation.interaction.a.C0046a c0046a = new androidx.compose.foundation.interaction.a.C0046a(value);
                dragLogic$processDragCancel$1.f5366b = this;
                dragLogic$processDragCancel$1.f5367c = q0Var;
                dragLogic$processDragCancel$1.f5370f = 1;
                if (gVar.b(c0046a, dragLogic$processDragCancel$1) == objH) {
                    return objH;
                }
            }
            dragLogic = this;
        } else {
            dragLogic = this;
        }
        qVar = dragLogic.f5363b;
        xVarB = x.b(x.f139262b.a());
        dragLogic$processDragCancel$1.f5366b = null;
        dragLogic$processDragCancel$1.f5367c = null;
        dragLogic$processDragCancel$1.f5370f = 2;
        if (qVar.invoke(q0Var, xVarB, dragLogic$processDragCancel$1) == objH) {
            return objH;
        }
        return b2.f124493a;
        dragLogic.dragStartInteraction.setValue(null);
        qVar = dragLogic.f5363b;
        xVarB = x.b(x.f139262b.a());
        dragLogic$processDragCancel$1.f5366b = null;
        dragLogic$processDragCancel$1.f5367c = null;
        dragLogic$processDragCancel$1.f5370f = 2;
        if (qVar.invoke(q0Var, xVarB, dragLogic$processDragCancel$1) == objH) {
            return objH;
        }
        return b2.f124493a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public final Object f(@dl.d q0 q0Var, @dl.d c.C0045c c0045c, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        DragLogic$processDragStart$1 dragLogic$processDragStart$1;
        DragLogic dragLogic;
        androidx.compose.foundation.interaction.g gVar;
        androidx.compose.foundation.interaction.a.b bVar;
        DragLogic dragLogic2;
        q0 q0Var2;
        androidx.compose.foundation.interaction.a.b bVar2;
        yh.q<q0, b1.f, kotlin.coroutines.c<? super b2>, Object> qVar;
        b1.f fVarD;
        if (cVar instanceof DragLogic$processDragStart$1) {
            dragLogic$processDragStart$1 = (DragLogic$processDragStart$1) cVar;
            int i10 = dragLogic$processDragStart$1.f5377h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dragLogic$processDragStart$1.f5377h = i10 - Integer.MIN_VALUE;
            } else {
                dragLogic$processDragStart$1 = new DragLogic$processDragStart$1(this, cVar);
            }
        } else {
            dragLogic$processDragStart$1 = new DragLogic$processDragStart$1(this, cVar);
        }
        Object obj = dragLogic$processDragStart$1.f5375f;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = dragLogic$processDragStart$1.f5377h;
        if (i11 != 0) {
            if (i11 == 1) {
                c.C0045c c0045c2 = (c.C0045c) dragLogic$processDragStart$1.f5373d;
                q0 q0Var3 = (q0) dragLogic$processDragStart$1.f5372c;
                dragLogic = (DragLogic) dragLogic$processDragStart$1.f5371b;
                t0.n(obj);
                c0045c = c0045c2;
                q0Var = q0Var3;
            } else if (i11 == 2) {
                bVar2 = (androidx.compose.foundation.interaction.a.b) dragLogic$processDragStart$1.f5374e;
                c0045c = (c.C0045c) dragLogic$processDragStart$1.f5373d;
                q0Var2 = (q0) dragLogic$processDragStart$1.f5372c;
                dragLogic2 = (DragLogic) dragLogic$processDragStart$1.f5371b;
                t0.n(obj);
                bVar = bVar2;
                q0Var = q0Var2;
                dragLogic = dragLogic2;
                dragLogic.dragStartInteraction.setValue(bVar);
                qVar = dragLogic.f5362a;
                fVarD = b1.f.d(c0045c.getStartPoint());
                dragLogic$processDragStart$1.f5371b = null;
                dragLogic$processDragStart$1.f5372c = null;
                dragLogic$processDragStart$1.f5373d = null;
                dragLogic$processDragStart$1.f5374e = null;
                dragLogic$processDragStart$1.f5377h = 3;
                if (qVar.invoke(q0Var, fVarD, dragLogic$processDragStart$1) == objH) {
                    return objH;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
        t0.n(obj);
        androidx.compose.foundation.interaction.a.b value = this.dragStartInteraction.getValue();
        if (value != null && (gVar = this.interactionSource) != null) {
            androidx.compose.foundation.interaction.a.C0046a c0046a = new androidx.compose.foundation.interaction.a.C0046a(value);
            dragLogic$processDragStart$1.f5371b = this;
            dragLogic$processDragStart$1.f5372c = q0Var;
            dragLogic$processDragStart$1.f5373d = c0045c;
            dragLogic$processDragStart$1.f5377h = 1;
            if (gVar.b(c0046a, dragLogic$processDragStart$1) == objH) {
                return objH;
            }
        }
        dragLogic = this;
        bVar = new androidx.compose.foundation.interaction.a.b();
        androidx.compose.foundation.interaction.g gVar2 = dragLogic.interactionSource;
        if (gVar2 != null) {
            dragLogic$processDragStart$1.f5371b = dragLogic;
            dragLogic$processDragStart$1.f5372c = q0Var;
            dragLogic$processDragStart$1.f5373d = c0045c;
            dragLogic$processDragStart$1.f5374e = bVar;
            dragLogic$processDragStart$1.f5377h = 2;
            if (gVar2.b(bVar, dragLogic$processDragStart$1) == objH) {
                return objH;
            }
            dragLogic2 = dragLogic;
            q0Var2 = q0Var;
            bVar2 = bVar;
            bVar = bVar2;
            q0Var = q0Var2;
            dragLogic = dragLogic2;
        }
        dragLogic.dragStartInteraction.setValue(bVar);
        qVar = dragLogic.f5362a;
        fVarD = b1.f.d(c0045c.getStartPoint());
        dragLogic$processDragStart$1.f5371b = null;
        dragLogic$processDragStart$1.f5372c = null;
        dragLogic$processDragStart$1.f5373d = null;
        dragLogic$processDragStart$1.f5374e = null;
        dragLogic$processDragStart$1.f5377h = 3;
        if (qVar.invoke(q0Var, fVarD, dragLogic$processDragStart$1) == objH) {
            return objH;
        }
        return b2.f124493a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public final Object g(@dl.d q0 q0Var, @dl.d c.d dVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        DragLogic$processDragStop$1 dragLogic$processDragStop$1;
        DragLogic dragLogic;
        yh.q<q0, x, kotlin.coroutines.c<? super b2>, Object> qVar;
        x xVarB;
        if (cVar instanceof DragLogic$processDragStop$1) {
            dragLogic$processDragStop$1 = (DragLogic$processDragStop$1) cVar;
            int i10 = dragLogic$processDragStop$1.f5383g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dragLogic$processDragStop$1.f5383g = i10 - Integer.MIN_VALUE;
            } else {
                dragLogic$processDragStop$1 = new DragLogic$processDragStop$1(this, cVar);
            }
        } else {
            dragLogic$processDragStop$1 = new DragLogic$processDragStop$1(this, cVar);
        }
        Object obj = dragLogic$processDragStop$1.f5381e;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = dragLogic$processDragStop$1.f5383g;
        if (i11 != 0) {
            if (i11 == 1) {
                c.d dVar2 = (c.d) dragLogic$processDragStop$1.f5380d;
                q0 q0Var2 = (q0) dragLogic$processDragStop$1.f5379c;
                dragLogic = (DragLogic) dragLogic$processDragStop$1.f5378b;
                t0.n(obj);
                dVar = dVar2;
                q0Var = q0Var2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
        t0.n(obj);
        androidx.compose.foundation.interaction.a.b value = this.dragStartInteraction.getValue();
        if (value != null) {
            androidx.compose.foundation.interaction.g gVar = this.interactionSource;
            if (gVar != null) {
                androidx.compose.foundation.interaction.a.c cVar2 = new androidx.compose.foundation.interaction.a.c(value);
                dragLogic$processDragStop$1.f5378b = this;
                dragLogic$processDragStop$1.f5379c = q0Var;
                dragLogic$processDragStop$1.f5380d = dVar;
                dragLogic$processDragStop$1.f5383g = 1;
                if (gVar.b(cVar2, dragLogic$processDragStop$1) == objH) {
                    return objH;
                }
            }
            dragLogic = this;
        } else {
            dragLogic = this;
        }
        qVar = dragLogic.f5363b;
        xVarB = x.b(dVar.getVelocity());
        dragLogic$processDragStop$1.f5378b = null;
        dragLogic$processDragStop$1.f5379c = null;
        dragLogic$processDragStop$1.f5380d = null;
        dragLogic$processDragStop$1.f5383g = 2;
        if (qVar.invoke(q0Var, xVarB, dragLogic$processDragStop$1) == objH) {
            return objH;
        }
        return b2.f124493a;
        dragLogic.dragStartInteraction.setValue(null);
        qVar = dragLogic.f5363b;
        xVarB = x.b(dVar.getVelocity());
        dragLogic$processDragStop$1.f5378b = null;
        dragLogic$processDragStop$1.f5379c = null;
        dragLogic$processDragStop$1.f5380d = null;
        dragLogic$processDragStop$1.f5383g = 2;
        if (qVar.invoke(q0Var, xVarB, dragLogic$processDragStop$1) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
