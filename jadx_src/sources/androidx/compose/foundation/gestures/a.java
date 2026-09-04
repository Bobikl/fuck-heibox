package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.core.app.o0;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidScrollable.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/gestures/a;", "Landroidx/compose/foundation/gestures/l;", "Ls1/e;", "Landroidx/compose/ui/input/pointer/p;", o0.I0, "Ls1/r;", "bounds", "Lb1/f;", ak.av, "(Ls1/e;Landroidx/compose/ui/input/pointer/p;J)J", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f5776a = new a();

    private a() {
    }

    @Override // androidx.compose.foundation.gestures.l
    public long a(@dl.d s1.e calculateMouseWheelScroll, @dl.d androidx.compose.ui.input.pointer.p event, long j10) {
        f0.p(calculateMouseWheelScroll, "$this$calculateMouseWheelScroll");
        f0.p(event, "event");
        List<PointerInputChange> listE = event.e();
        b1.f fVarD = b1.f.d(b1.f.f30364b.e());
        int size = listE.size();
        for (int i10 = 0; i10 < size; i10++) {
            fVarD = b1.f.d(b1.f.v(fVarD.getF30368a(), listE.get(i10).getScrollDelta()));
        }
        return b1.f.x(fVarD.getF30368a(), -calculateMouseWheelScroll.E1(s1.h.g(64)));
    }
}
