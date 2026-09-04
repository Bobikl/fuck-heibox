package androidx.compose.ui.input.pointer;

import com.umeng.analytics.pro.ak;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: PointerInputEventProcessor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\bR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\t\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/pointer/z;", "", "Landroidx/compose/ui/input/pointer/a0;", "pointerInputEvent", "Landroidx/compose/ui/input/pointer/n0;", "positionCalculator", "Landroidx/compose/ui/input/pointer/h;", "b", "Lkotlin/b2;", ak.av, "", "Landroidx/compose/ui/input/pointer/x;", "Landroidx/compose/ui/input/pointer/z$a;", "Ljava/util/Map;", "previousPointerInputData", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<x, a> previousPointerInputData = new LinkedHashMap();

    /* JADX INFO: compiled from: PointerInputEventProcessor.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B*\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0003\u0010\u000eR \u0010\u0013\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\f\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/input/pointer/z$a;", "", "", ak.av, "J", "d", "()J", "uptime", "Lb1/f;", "b", "positionOnScreen", "", ak.aF, "Z", "()Z", "down", "Landroidx/compose/ui/input/pointer/m0;", "I", "()I", "type", "<init>", "(JJZILkotlin/jvm/internal/u;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long uptime;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long positionOnScreen;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean down;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int type;

        private a(long j10, long j11, boolean z10, int i10) {
            this.uptime = j10;
            this.positionOnScreen = j11;
            this.down = z10;
            this.type = i10;
        }

        public /* synthetic */ a(long j10, long j11, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
            this(j10, j11, z10, i10);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getDown() {
            return this.down;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getPositionOnScreen() {
            return this.positionOnScreen;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getUptime() {
            return this.uptime;
        }
    }

    public final void a() {
        this.previousPointerInputData.clear();
    }

    @dl.d
    public final h b(@dl.d a0 pointerInputEvent, @dl.d n0 positionCalculator) {
        long jV;
        boolean down;
        long jH;
        kotlin.jvm.internal.f0.p(pointerInputEvent, "pointerInputEvent");
        kotlin.jvm.internal.f0.p(positionCalculator, "positionCalculator");
        LinkedHashMap linkedHashMap = new LinkedHashMap(pointerInputEvent.b().size());
        List<PointerInputEventData> listB = pointerInputEvent.b();
        int size = listB.size();
        for (int i10 = 0; i10 < size; i10++) {
            PointerInputEventData pointerInputEventData = listB.get(i10);
            a aVar = this.previousPointerInputData.get(x.a(pointerInputEventData.o()));
            if (aVar == null) {
                jV = pointerInputEventData.v();
                jH = pointerInputEventData.q();
                down = false;
            } else {
                long uptime = aVar.getUptime();
                jV = uptime;
                down = aVar.getDown();
                jH = positionCalculator.h(aVar.getPositionOnScreen());
            }
            linkedHashMap.put(x.a(pointerInputEventData.o()), new PointerInputChange(pointerInputEventData.o(), pointerInputEventData.v(), pointerInputEventData.q(), pointerInputEventData.m(), pointerInputEventData.s(), jV, jH, down, false, pointerInputEventData.u(), (List) pointerInputEventData.n(), pointerInputEventData.t(), (kotlin.jvm.internal.u) null));
            if (pointerInputEventData.m()) {
                this.previousPointerInputData.put(x.a(pointerInputEventData.o()), new a(pointerInputEventData.v(), pointerInputEventData.r(), pointerInputEventData.m(), pointerInputEventData.u(), null));
            } else {
                this.previousPointerInputData.remove(x.a(pointerInputEventData.o()));
            }
        }
        return new h(linkedHashMap, pointerInputEvent);
    }
}
