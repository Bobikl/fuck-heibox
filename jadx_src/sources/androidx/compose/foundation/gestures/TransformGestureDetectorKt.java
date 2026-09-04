package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.i0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TransformGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0086\u0001\u0010\u000e\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012`\u0010\r\u001a\\\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0003H\u0086@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\n\u0010\u0011\u001a\u00020\t*\u00020\u0010\u001a\u0019\u0010\u0012\u001a\u00020\t*\u00020\u0004H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\n\u0010\u0014\u001a\u00020\t*\u00020\u0010\u001a\u0014\u0010\u0015\u001a\u00020\u0004*\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0014\u0010\u0018\u001a\u00020\t*\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0001\u001a\u001e\u0010\u0019\u001a\u00020\u0004*\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "", "panZoomLock", "Lkotlin/Function4;", "Lb1/f;", "Lkotlin/m0;", "name", "centroid", "pan", "", "zoom", androidx.constraintlayout.motion.widget.f.f18721i, "Lkotlin/b2;", "onGesture", "i", "(Landroidx/compose/ui/input/pointer/i0;ZLyh/r;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/p;", "g", ak.av, "(J)F", RXScreenCaptureService.KEY_HEIGHT, "f", "(Landroidx/compose/ui/input/pointer/p;)J", "useCurrent", "d", "b", "(Landroidx/compose/ui/input/pointer/p;Z)J", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class TransformGestureDetectorKt {
    private static final float a(long j10) {
        if (b1.f.p(j10) == 0.0f) {
            if (b1.f.r(j10) == 0.0f) {
                return 0.0f;
            }
        }
        return ((-((float) Math.atan2(b1.f.p(j10), b1.f.r(j10)))) * 180.0f) / 3.1415927f;
    }

    public static final long b(@dl.d androidx.compose.ui.input.pointer.p pVar, boolean z10) {
        f0.p(pVar, "<this>");
        long jE = b1.f.f30364b.e();
        List<PointerInputChange> listE = pVar.e();
        int size = listE.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            PointerInputChange pointerInputChange = listE.get(i11);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                jE = b1.f.v(jE, z10 ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition());
                i10++;
            }
        }
        return i10 == 0 ? b1.f.f30364b.c() : b1.f.j(jE, i10);
    }

    public static /* synthetic */ long c(androidx.compose.ui.input.pointer.p pVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return b(pVar, z10);
    }

    public static final float d(@dl.d androidx.compose.ui.input.pointer.p pVar, boolean z10) {
        f0.p(pVar, "<this>");
        long jB = b(pVar, z10);
        float fM = 0.0f;
        if (b1.f.l(jB, b1.f.f30364b.c())) {
            return 0.0f;
        }
        List<PointerInputChange> listE = pVar.e();
        int size = listE.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            PointerInputChange pointerInputChange = listE.get(i11);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                fM += b1.f.m(b1.f.u(z10 ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition(), jB));
                i10++;
            }
        }
        return fM / i10;
    }

    public static /* synthetic */ float e(androidx.compose.ui.input.pointer.p pVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return d(pVar, z10);
    }

    public static final long f(@dl.d androidx.compose.ui.input.pointer.p pVar) {
        f0.p(pVar, "<this>");
        long jB = b(pVar, true);
        b1.f.a aVar = b1.f.f30364b;
        return b1.f.l(jB, aVar.c()) ? aVar.e() : b1.f.u(jB, b(pVar, false));
    }

    public static final float g(@dl.d androidx.compose.ui.input.pointer.p pVar) {
        f0.p(pVar, "<this>");
        List<PointerInputChange> listE = pVar.e();
        int size = listE.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = 1;
            if (i10 >= size) {
                break;
            }
            PointerInputChange pointerInputChange = listE.get(i10);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i12 = 0;
            }
            i11 += i12;
            i10++;
        }
        float f10 = 0.0f;
        if (i11 < 2) {
            return 0.0f;
        }
        long jB = b(pVar, true);
        long jB2 = b(pVar, false);
        List<PointerInputChange> listE2 = pVar.e();
        int size2 = listE2.size();
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i13 = 0;
        while (i13 < size2) {
            PointerInputChange pointerInputChange2 = listE2.get(i13);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long position = pointerInputChange2.getPosition();
                long jU = b1.f.u(pointerInputChange2.getPreviousPosition(), jB2);
                long jU2 = b1.f.u(position, jB);
                float fA = a(jU2) - a(jU);
                float fM = b1.f.m(b1.f.v(jU2, jU)) / 2.0f;
                if (fA > 180.0f) {
                    fA -= 360.0f;
                } else if (fA < -180.0f) {
                    fA += 360.0f;
                }
                f12 += fA * fM;
                f11 += fM;
            }
            i13++;
            f10 = 0.0f;
        }
        return (f11 > f10 ? 1 : (f11 == f10 ? 0 : -1)) == 0 ? f10 : f12 / f11;
    }

    public static final float h(@dl.d androidx.compose.ui.input.pointer.p pVar) {
        f0.p(pVar, "<this>");
        float fD = d(pVar, true);
        float fD2 = d(pVar, false);
        if (fD == 0.0f) {
            return 1.0f;
        }
        if (fD2 == 0.0f) {
            return 1.0f;
        }
        return fD / fD2;
    }

    @dl.e
    public static final Object i(@dl.d i0 i0Var, boolean z10, @dl.d yh.r<? super b1.f, ? super b1.f, ? super Float, ? super Float, b2> rVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objD = ForEachGestureKt.d(i0Var, new TransformGestureDetectorKt$detectTransformGestures$2(z10, rVar, null), cVar);
        return objD == kotlin.coroutines.intrinsics.b.h() ? objD : b2.f124493a;
    }

    public static /* synthetic */ Object j(i0 i0Var, boolean z10, yh.r rVar, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return i(i0Var, z10, rVar, cVar);
    }
}
