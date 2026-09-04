package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.annotation.j1;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: MotionEventAdapter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J \u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\tH\u0002J!\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR \u0010#\u001a\u00020\u001d8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00140'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0016\u0010+\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010*R\u0016\u0010,\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010*\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/compose/ui/input/pointer/i;", "", "Landroid/view/MotionEvent;", "motionEvent", "Lkotlin/b2;", ak.av, "j", "", "pointerId", "", "i", "motionEventPointerId", "Landroidx/compose/ui/input/pointer/x;", "f", "(I)J", "b", "Landroidx/compose/ui/input/pointer/n0;", "positionCalculator", UCropPlusActivity.ARG_INDEX, "pressed", "Landroidx/compose/ui/input/pointer/b0;", "d", "Landroidx/compose/ui/input/pointer/a0;", ak.aF, "(Landroid/view/MotionEvent;Landroidx/compose/ui/input/pointer/n0;)Landroidx/compose/ui/input/pointer/a0;", "e", "", "J", "nextId", "Landroid/util/SparseLongArray;", "Landroid/util/SparseLongArray;", "g", "()Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release$annotations", "()V", "motionEventToComposePointerIdMap", "Landroid/util/SparseBooleanArray;", "Landroid/util/SparseBooleanArray;", "canHover", "", "Ljava/util/List;", "pointers", "I", "previousToolType", "previousSource", "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long nextId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SparseBooleanArray canHover = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<PointerInputEventData> pointers = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int previousToolType = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int previousSource = -1;

    private final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
                long j10 = this.nextId;
                this.nextId = 1 + j10;
                sparseLongArray.put(pointerId, j10);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.motionEventToComposePointerIdMap;
            long j11 = this.nextId;
            this.nextId = 1 + j11;
            sparseLongArray2.put(pointerId2, j11);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.canHover.put(pointerId2, true);
            }
        }
    }

    private final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.previousToolType && source == this.previousSource) {
            return;
        }
        this.previousToolType = toolType;
        this.previousSource = source;
        this.canHover.clear();
        this.motionEventToComposePointerIdMap.clear();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0055  */
    /* JADX WARN: Code duplicated, block: B:15:0x0058  */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:19:0x005e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x006c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0073  */
    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0081  */
    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d7 A[SYNTHETIC] */
    private final PointerInputEventData d(n0 positionCalculator, MotionEvent motionEvent, int index, boolean pressed) {
        long j10;
        long jZ;
        long jA;
        long jH;
        int toolType;
        int iE;
        ArrayList arrayList;
        int historySize;
        int i10;
        long jE;
        float historicalX;
        float historicalY;
        boolean z10;
        boolean z11;
        long jF = f(motionEvent.getPointerId(index));
        float pressure = motionEvent.getPressure(index);
        long jA2 = b1.g.a(motionEvent.getX(index), motionEvent.getY(index));
        if (index != 0) {
            if (Build.VERSION.SDK_INT >= 29) {
                jA = l.f14790a.a(motionEvent, index);
                jH = positionCalculator.h(jA);
            } else {
                j10 = jA2;
                jZ = positionCalculator.z(jA2);
            }
            toolType = motionEvent.getToolType(index);
            if (toolType != 0) {
                iE = m0.INSTANCE.e();
            } else if (toolType != 1) {
                iE = m0.INSTANCE.d();
            } else if (toolType != 2) {
                iE = m0.INSTANCE.c();
            } else if (toolType != 3) {
                iE = m0.INSTANCE.b();
            } else if (toolType != 4) {
                iE = m0.INSTANCE.e();
            } else {
                iE = m0.INSTANCE.a();
            }
            int i11 = iE;
            arrayList = new ArrayList();
            historySize = motionEvent.getHistorySize();
            for (i10 = 0; i10 < historySize; i10++) {
                historicalX = motionEvent.getHistoricalX(index, i10);
                historicalY = motionEvent.getHistoricalY(index, i10);
                if (!Float.isInfinite(historicalX) || Float.isNaN(historicalX)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    if (!Float.isInfinite(historicalY) || Float.isNaN(historicalY)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        arrayList.add(new HistoricalChange(motionEvent.getHistoricalEventTime(i10), b1.g.a(historicalX, historicalY), null));
                    }
                }
            }
            if (motionEvent.getActionMasked() == 8) {
                jE = b1.g.a(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
            } else {
                jE = b1.f.f30364b.e();
            }
            long j11 = jE;
            return new PointerInputEventData(jF, motionEvent.getEventTime(), jZ, j10, pressed, pressure, i11, this.canHover.get(motionEvent.getPointerId(index), false), arrayList, j11, null);
        }
        jA = b1.g.a(motionEvent.getRawX(), motionEvent.getRawY());
        jH = positionCalculator.h(jA);
        jZ = jA;
        j10 = jH;
        toolType = motionEvent.getToolType(index);
        if (toolType != 0) {
            iE = m0.INSTANCE.e();
        } else if (toolType != 1) {
            iE = m0.INSTANCE.d();
        } else if (toolType != 2) {
            iE = m0.INSTANCE.c();
        } else if (toolType != 3) {
            iE = m0.INSTANCE.b();
        } else if (toolType != 4) {
            iE = m0.INSTANCE.e();
        } else {
            iE = m0.INSTANCE.a();
        }
        int i12 = iE;
        arrayList = new ArrayList();
        historySize = motionEvent.getHistorySize();
        while (i10 < historySize) {
            historicalX = motionEvent.getHistoricalX(index, i10);
            historicalY = motionEvent.getHistoricalY(index, i10);
            if (Float.isInfinite(historicalX)) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (Float.isInfinite(historicalY)) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (z11) {
                    arrayList.add(new HistoricalChange(motionEvent.getHistoricalEventTime(i10), b1.g.a(historicalX, historicalY), null));
                }
            }
        }
        if (motionEvent.getActionMasked() == 8) {
            jE = b1.g.a(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
        } else {
            jE = b1.f.f30364b.e();
        }
        long j12 = jE;
        return new PointerInputEventData(jF, motionEvent.getEventTime(), jZ, j10, pressed, pressure, i12, this.canHover.get(motionEvent.getPointerId(index), false), arrayList, j12, null);
    }

    private final long f(int motionEventPointerId) {
        long jValueAt;
        int iIndexOfKey = this.motionEventToComposePointerIdMap.indexOfKey(motionEventPointerId);
        if (iIndexOfKey >= 0) {
            jValueAt = this.motionEventToComposePointerIdMap.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.nextId;
            this.nextId = 1 + jValueAt;
            this.motionEventToComposePointerIdMap.put(motionEventPointerId, jValueAt);
        }
        return x.b(jValueAt);
    }

    @j1
    public static /* synthetic */ void h() {
    }

    private final boolean i(MotionEvent motionEvent, int i10) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (motionEvent.getPointerId(i11) == i10) {
                return true;
            }
        }
        return false;
    }

    private final void j(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.canHover.get(pointerId, false)) {
                this.motionEventToComposePointerIdMap.delete(pointerId);
                this.canHover.delete(pointerId);
            }
        }
        if (this.motionEventToComposePointerIdMap.size() > motionEvent.getPointerCount()) {
            for (int size = this.motionEventToComposePointerIdMap.size() - 1; -1 < size; size--) {
                int iKeyAt = this.motionEventToComposePointerIdMap.keyAt(size);
                if (!i(motionEvent, iKeyAt)) {
                    this.motionEventToComposePointerIdMap.removeAt(size);
                    this.canHover.delete(iKeyAt);
                }
            }
        }
    }

    @dl.e
    public final a0 c(@dl.d MotionEvent motionEvent, @dl.d n0 positionCalculator) {
        int actionIndex;
        kotlin.jvm.internal.f0.p(motionEvent, "motionEvent");
        kotlin.jvm.internal.f0.p(positionCalculator, "positionCalculator");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.motionEventToComposePointerIdMap.clear();
            this.canHover.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z10 = actionMasked == 10 || actionMasked == 7 || actionMasked == 9;
        boolean z11 = actionMasked == 8;
        if (z10) {
            this.canHover.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        this.pointers.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i10 = 0;
        while (i10 < pointerCount) {
            this.pointers.add(d(positionCalculator, motionEvent, i10, (z10 || i10 == actionIndex || (z11 && motionEvent.getButtonState() == 0)) ? false : true));
            i10++;
        }
        j(motionEvent);
        return new a0(motionEvent.getEventTime(), this.pointers, motionEvent);
    }

    public final void e(int i10) {
        this.canHover.delete(i10);
        this.motionEventToComposePointerIdMap.delete(i10);
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final SparseLongArray getMotionEventToComposePointerIdMap() {
        return this.motionEventToComposePointerIdMap;
    }
}
