package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: PointerInteropFilter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J-\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"androidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1", "Landroidx/compose/ui/input/pointer/e0;", "Lkotlin/b2;", "v0", "Landroidx/compose/ui/input/pointer/p;", "pointerEvent", "u0", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Ls1/r;", "bounds", "d0", "(Landroidx/compose/ui/input/pointer/p;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "Y", "Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "e", "Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "state", "", "B", "()Z", "shareWithSiblings", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class PointerInteropFilter$pointerInputFilter$1 extends e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private PointerInteropFilter.DispatchToViewState state = PointerInteropFilter.DispatchToViewState.Unknown;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ PointerInteropFilter f14680f;

    PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.f14680f = pointerInteropFilter;
    }

    private final void u0(p pVar) {
        boolean z10;
        List<PointerInputChange> listE = pVar.e();
        int size = listE.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = false;
                break;
            } else {
                if (listE.get(i10).A()) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        if (z10) {
            if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
                androidx.compose.ui.layout.q qVarG = getLayoutCoordinates();
                if (qVarG == null) {
                    throw new IllegalStateException("layoutCoordinates not set".toString());
                }
                long jL = qVarG.L(b1.f.f30364b.e());
                final PointerInteropFilter pointerInteropFilter = this.f14680f;
                k0.c(pVar, jL, new yh.l<MotionEvent, b2>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$2
                    {
                        super(1);
                    }

                    public final void a(@dl.d MotionEvent motionEvent) {
                        kotlin.jvm.internal.f0.p(motionEvent, "motionEvent");
                        pointerInteropFilter.c().invoke(motionEvent);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(MotionEvent motionEvent) {
                        a(motionEvent);
                        return b2.f124493a;
                    }
                });
            }
            this.state = PointerInteropFilter.DispatchToViewState.NotDispatching;
            return;
        }
        androidx.compose.ui.layout.q qVarG2 = getLayoutCoordinates();
        if (qVarG2 == null) {
            throw new IllegalStateException("layoutCoordinates not set".toString());
        }
        long jL2 = qVarG2.L(b1.f.f30364b.e());
        final PointerInteropFilter pointerInteropFilter2 = this.f14680f;
        k0.d(pVar, jL2, new yh.l<MotionEvent, b2>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d MotionEvent motionEvent) {
                kotlin.jvm.internal.f0.p(motionEvent, "motionEvent");
                if (motionEvent.getActionMasked() != 0) {
                    pointerInteropFilter2.c().invoke(motionEvent);
                } else {
                    this.f14682b.state = pointerInteropFilter2.c().invoke(motionEvent).booleanValue() ? PointerInteropFilter.DispatchToViewState.Dispatching : PointerInteropFilter.DispatchToViewState.NotDispatching;
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(MotionEvent motionEvent) {
                a(motionEvent);
                return b2.f124493a;
            }
        });
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            int size2 = listE.size();
            for (int i11 = 0; i11 < size2; i11++) {
                listE.get(i11).a();
            }
            h internalPointerEvent = pVar.getInternalPointerEvent();
            if (internalPointerEvent == null) {
                return;
            }
            internalPointerEvent.f(!this.f14680f.getDisallowIntercept());
        }
    }

    private final void v0() {
        this.state = PointerInteropFilter.DispatchToViewState.Unknown;
        this.f14680f.e(false);
    }

    @Override // androidx.compose.ui.input.pointer.e0
    public boolean B() {
        return true;
    }

    @Override // androidx.compose.ui.input.pointer.e0
    public void Y() {
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            final PointerInteropFilter pointerInteropFilter = this.f14680f;
            k0.a(jUptimeMillis, new yh.l<MotionEvent, b2>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$onCancel$1
                {
                    super(1);
                }

                public final void a(@dl.d MotionEvent motionEvent) {
                    kotlin.jvm.internal.f0.p(motionEvent, "motionEvent");
                    pointerInteropFilter.c().invoke(motionEvent);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(MotionEvent motionEvent) {
                    a(motionEvent);
                    return b2.f124493a;
                }
            });
            v0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    @Override // androidx.compose.ui.input.pointer.e0
    public void d0(@dl.d p pointerEvent, @dl.d PointerEventPass pass, long bounds) {
        boolean z10;
        boolean z11;
        kotlin.jvm.internal.f0.p(pointerEvent, "pointerEvent");
        kotlin.jvm.internal.f0.p(pass, "pass");
        List<PointerInputChange> listE = pointerEvent.e();
        boolean z12 = false;
        if (this.f14680f.getDisallowIntercept()) {
            z10 = true;
        } else {
            int size = listE.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z11 = false;
                    break;
                }
                PointerInputChange pointerInputChange = listE.get(i10);
                if (q.c(pointerInputChange) || q.e(pointerInputChange)) {
                    z11 = true;
                    break;
                }
                i10++;
            }
            if (z11) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (this.state != PointerInteropFilter.DispatchToViewState.NotDispatching) {
            if (pass == PointerEventPass.Initial && z10) {
                u0(pointerEvent);
            }
            if (pass == PointerEventPass.Final && !z10) {
                u0(pointerEvent);
            }
        }
        if (pass == PointerEventPass.Final) {
            int size2 = listE.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    z12 = true;
                    break;
                } else if (!q.e(listE.get(i11))) {
                    break;
                } else {
                    i11++;
                }
            }
            if (z12) {
                v0();
            }
        }
    }
}
