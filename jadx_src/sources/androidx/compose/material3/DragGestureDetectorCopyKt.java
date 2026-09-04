package androidx.compose.material3;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: DragGestureDetectorCopy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ag\u0010\u000e\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000326\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005H\u0080@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a]\u0010\u0013\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u0010H\u0082Hø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0017\u001a\u00020\u0016*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u001a\u001a\u00020\n*\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\"\u0017\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u001d\"\u0017\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u001d\"\u0014\u0010 \u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/ui/input/pointer/d;", "Landroidx/compose/ui/input/pointer/x;", "pointerId", "Landroidx/compose/ui/input/pointer/m0;", "pointerType", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/y;", "Lkotlin/m0;", "name", "change", "", "overSlop", "Lkotlin/b2;", "onPointerSlopReached", ak.av, "(Landroidx/compose/ui/input/pointer/d;JILyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lb1/f;", "getDragDirectionValue", "b", "(Landroidx/compose/ui/input/pointer/d;JILyh/p;Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/p;", "", ak.aF, "(Landroidx/compose/ui/input/pointer/p;J)Z", "Landroidx/compose/ui/platform/d2;", "d", "(Landroidx/compose/ui/platform/d2;I)F", "Ls1/h;", "F", "mouseSlop", "defaultTouchSlop", "mouseToTouchSlopRatio", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class DragGestureDetectorCopyKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f9342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f9343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f9344c;

    static {
        float fG = s1.h.g((float) 0.125d);
        f9342a = fG;
        float fG2 = s1.h.g(18);
        f9343b = fG2;
        f9344c = fG / fG2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00dd A[LOOP:0: B:25:0x00c6->B:29:0x00dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x00e5 A[EDGE_INSN: B:64:0x00e5->B:31:0x00e5 BREAK  A[LOOP:0: B:25:0x00c6->B:29:0x00dd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x011b -> B:57:0x0167). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x015a -> B:53:0x015d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0181 -> B:57:0x0167). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public static final java.lang.Object a(@dl.d androidx.compose.ui.input.pointer.d r19, long r20, int r22, @dl.d yh.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.b2> r23, @dl.d kotlin.coroutines.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r24) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DragGestureDetectorCopyKt.a(androidx.compose.ui.input.pointer.d, long, int, yh.p, kotlin.coroutines.c):java.lang.Object");
    }

    private static final Object b(androidx.compose.ui.input.pointer.d dVar, long j10, int i10, yh.p<? super PointerInputChange, ? super Float, kotlin.b2> pVar, yh.l<? super b1.f, Float> lVar, kotlin.coroutines.c<? super PointerInputChange> cVar) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        long id2 = j10;
        if (c(dVar.s1(), id2)) {
            return null;
        }
        float fD = d(dVar.getViewConfiguration(), i10);
        do {
            float fFloatValue = 0.0f;
            while (true) {
                kotlin.jvm.internal.c0.e(0);
                Object objT = androidx.compose.ui.input.pointer.c.t(dVar, null, cVar, 1, null);
                kotlin.jvm.internal.c0.e(1);
                androidx.compose.ui.input.pointer.p pVar2 = (androidx.compose.ui.input.pointer.p) objT;
                List<PointerInputChange> listE = pVar2.e();
                int size = listE.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = listE.get(i11);
                    if (androidx.compose.ui.input.pointer.x.d(pointerInputChange.getId(), id2)) {
                        break;
                    }
                    i11++;
                }
                kotlin.jvm.internal.f0.m(pointerInputChange);
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2.A()) {
                    return null;
                }
                if (androidx.compose.ui.input.pointer.q.e(pointerInputChange2)) {
                    List<PointerInputChange> listE2 = pVar2.e();
                    int size2 = listE2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = listE2.get(i12);
                        if (pointerInputChange3.getPressed()) {
                            break;
                        }
                        i12++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 == null) {
                        return null;
                    }
                    id2 = pointerInputChange4.getId();
                } else {
                    fFloatValue += lVar.invoke(b1.f.d(pointerInputChange2.getPosition())).floatValue() - lVar.invoke(b1.f.d(pointerInputChange2.getPreviousPosition())).floatValue();
                    if (Math.abs(fFloatValue) < fD) {
                        PointerEventPass pointerEventPass = PointerEventPass.Final;
                        kotlin.jvm.internal.c0.e(0);
                        dVar.r1(pointerEventPass, cVar);
                        kotlin.jvm.internal.c0.e(1);
                        if (pointerInputChange2.A()) {
                            return null;
                        }
                    }
                }
            }
            pVar.invoke(pointerInputChange2, Float.valueOf(fFloatValue - (Math.signum(fFloatValue) * fD)));
        } while (!pointerInputChange2.A());
        return pointerInputChange2;
    }

    private static final boolean c(androidx.compose.ui.input.pointer.p pVar, long j10) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> listE = pVar.e();
        int size = listE.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = listE.get(i10);
            if (androidx.compose.ui.input.pointer.x.d(pointerInputChange.getId(), j10)) {
                break;
            }
            i10++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z10 = true;
        }
        return true ^ z10;
    }

    public static final float d(@dl.d androidx.compose.ui.platform.d2 pointerSlop, int i10) {
        kotlin.jvm.internal.f0.p(pointerSlop, "$this$pointerSlop");
        return androidx.compose.ui.input.pointer.m0.i(i10, androidx.compose.ui.input.pointer.m0.INSTANCE.b()) ? pointerSlop.b() * f9344c : pointerSlop.b();
    }
}
