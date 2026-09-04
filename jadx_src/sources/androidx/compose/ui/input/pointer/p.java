package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: PointerEvent.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\"\u0010#B\u0017\b\u0016\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\"\u0010$J\u0018\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u001e\u0010\u000b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0017\u001a\u00020\u00148\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0004R \u0010\u001a\u001a\u00020\u00188\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0019\u0010\u0004R3\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00028\u0006@@X\u0086\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u001c\u0010\u0004\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/compose/ui/input/pointer/p;", "", "Landroidx/compose/ui/input/pointer/r;", ak.av, "()I", "", "Landroidx/compose/ui/input/pointer/y;", "b", "changes", "Landroid/view/MotionEvent;", "motionEvent", ak.aF, "Ljava/util/List;", "e", "()Ljava/util/List;", "Landroidx/compose/ui/input/pointer/h;", "Landroidx/compose/ui/input/pointer/h;", "f", "()Landroidx/compose/ui/input/pointer/h;", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/o;", "I", "d", "buttons", "Landroidx/compose/ui/input/pointer/l0;", "g", "keyboardModifiers", "<set-?>", "i", "j", "(I)V", "type", RXScreenCaptureService.KEY_HEIGHT, "()Landroid/view/MotionEvent;", "<init>", "(Ljava/util/List;Landroidx/compose/ui/input/pointer/h;)V", "(Ljava/util/List;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f14810f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<PointerInputChange> changes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final h internalPointerEvent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int buttons;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int keyboardModifiers;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int type;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(@dl.d List<PointerInputChange> changes) {
        this(changes, null);
        kotlin.jvm.internal.f0.p(changes, "changes");
    }

    public p(@dl.d List<PointerInputChange> changes, @dl.e h hVar) {
        kotlin.jvm.internal.f0.p(changes, "changes");
        this.changes = changes;
        this.internalPointerEvent = hVar;
        MotionEvent motionEventH = h();
        this.buttons = o.b(motionEventH != null ? motionEventH.getButtonState() : 0);
        MotionEvent motionEventH2 = h();
        this.keyboardModifiers = l0.b(motionEventH2 != null ? motionEventH2.getMetaState() : 0);
        this.type = a();
    }

    private final int a() {
        MotionEvent motionEventH = h();
        if (motionEventH == null) {
            List<PointerInputChange> list = this.changes;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                PointerInputChange yVar = list.get(i10);
                if (q.e(yVar)) {
                    return r.INSTANCE.e();
                }
                if (q.c(yVar)) {
                    return r.INSTANCE.d();
                }
            }
            return r.INSTANCE.c();
        }
        int actionMasked = motionEventH.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    switch (actionMasked) {
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            return r.INSTANCE.f();
                        case 9:
                            return r.INSTANCE.a();
                        case 10:
                            return r.INSTANCE.b();
                        default:
                            return r.INSTANCE.g();
                    }
                }
                return r.INSTANCE.c();
            }
            return r.INSTANCE.e();
        }
        return r.INSTANCE.d();
    }

    @dl.d
    public final List<PointerInputChange> b() {
        return this.changes;
    }

    @dl.d
    public final p c(@dl.d List<PointerInputChange> changes, @dl.e MotionEvent motionEvent) {
        p pVar = this;
        List<PointerInputChange> changes2 = changes;
        kotlin.jvm.internal.f0.p(changes2, "changes");
        if (motionEvent == null) {
            return new p(changes2, null);
        }
        if (kotlin.jvm.internal.f0.g(motionEvent, h())) {
            return new p(changes2, pVar.internalPointerEvent);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = changes.size();
        for (int i10 = 0; i10 < size; i10++) {
            PointerInputChange yVar = changes2.get(i10);
            linkedHashMap.put(x.a(yVar.getId()), yVar);
        }
        ArrayList arrayList = new ArrayList(changes.size());
        int size2 = changes.size();
        int i11 = 0;
        while (i11 < size2) {
            PointerInputChange yVar2 = changes2.get(i11);
            long jP = yVar2.getId();
            long jZ = yVar2.getUptimeMillis();
            long jQ = yVar2.getPosition();
            long jQ2 = yVar2.getPosition();
            boolean zR = yVar2.getPressed();
            float fS = yVar2.s();
            int iY = yVar2.getType();
            h hVar = pVar.internalPointerEvent;
            boolean z10 = true;
            if (hVar == null || !hVar.e(yVar2.getId())) {
                z10 = false;
            }
            arrayList.add(new PointerInputEventData(jP, jZ, jQ, jQ2, zR, fS, iY, z10, null, 0L, 768, null));
            i11++;
            pVar = this;
            changes2 = changes;
        }
        return new p(changes, new h(linkedHashMap, new a0(motionEvent.getEventTime(), arrayList, motionEvent)));
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getButtons() {
        return this.buttons;
    }

    @dl.d
    public final List<PointerInputChange> e() {
        return this.changes;
    }

    @dl.e
    /* JADX INFO: renamed from: f, reason: from getter */
    public final h getInternalPointerEvent() {
        return this.internalPointerEvent;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getKeyboardModifiers() {
        return this.keyboardModifiers;
    }

    @dl.e
    public final MotionEvent h() {
        h hVar = this.internalPointerEvent;
        if (hVar != null) {
            return hVar.b();
        }
        return null;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final void j(int i10) {
        this.type = i10;
    }
}
