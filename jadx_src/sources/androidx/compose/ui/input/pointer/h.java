package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import com.umeng.analytics.pro.ak;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: InternalPointerEvent.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B&\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u0012\u001a\u00020\rø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/input/pointer/h;", "", "Landroidx/compose/ui/input/pointer/x;", "pointerId", "", "e", "(J)Z", "", "Landroidx/compose/ui/input/pointer/y;", ak.av, "Ljava/util/Map;", "()Ljava/util/Map;", "changes", "Landroidx/compose/ui/input/pointer/a0;", "b", "Landroidx/compose/ui/input/pointer/a0;", ak.aF, "()Landroidx/compose/ui/input/pointer/a0;", "pointerInputEvent", "Z", "d", "()Z", "f", "(Z)V", "suppressMovementConsumption", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "motionEvent", "<init>", "(Ljava/util/Map;Landroidx/compose/ui/input/pointer/a0;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<x, PointerInputChange> changes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a0 pointerInputEvent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean suppressMovementConsumption;

    public h(@dl.d Map<x, PointerInputChange> changes, @dl.d a0 pointerInputEvent) {
        kotlin.jvm.internal.f0.p(changes, "changes");
        kotlin.jvm.internal.f0.p(pointerInputEvent, "pointerInputEvent");
        this.changes = changes;
        this.pointerInputEvent = pointerInputEvent;
    }

    @dl.d
    public final Map<x, PointerInputChange> a() {
        return this.changes;
    }

    @dl.d
    public final MotionEvent b() {
        return this.pointerInputEvent.getMotionEvent();
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final a0 getPointerInputEvent() {
        return this.pointerInputEvent;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getSuppressMovementConsumption() {
        return this.suppressMovementConsumption;
    }

    public final boolean e(long pointerId) {
        PointerInputEventData pointerInputEventData;
        List<PointerInputEventData> listB = this.pointerInputEvent.b();
        int size = listB.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                pointerInputEventData = null;
                break;
            }
            pointerInputEventData = listB.get(i10);
            if (x.d(pointerInputEventData.o(), pointerId)) {
                break;
            }
            i10++;
        }
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            return pointerInputEventData2.p();
        }
        return false;
    }

    public final void f(boolean z10) {
        this.suppressMovementConsumption = z10;
    }
}
