package androidx.compose.ui.graphics;

import android.graphics.Rect;
import android.graphics.RectF;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: RectHelper.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0000*\u00020\u0001¨\u0006\u0006"}, d2 = {"Lb1/i;", "Landroid/graphics/Rect;", ak.av, "Landroid/graphics/RectF;", "b", ak.aF, "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class w1 {
    @dl.d
    public static final Rect a(@dl.d b1.i iVar) {
        kotlin.jvm.internal.f0.p(iVar, "<this>");
        return new Rect((int) iVar.t(), (int) iVar.getF30372b(), (int) iVar.x(), (int) iVar.j());
    }

    @dl.d
    public static final RectF b(@dl.d b1.i iVar) {
        kotlin.jvm.internal.f0.p(iVar, "<this>");
        return new RectF(iVar.t(), iVar.getF30372b(), iVar.x(), iVar.j());
    }

    @dl.d
    public static final b1.i c(@dl.d Rect rect) {
        kotlin.jvm.internal.f0.p(rect, "<this>");
        return new b1.i(rect.left, rect.top, rect.right, rect.bottom);
    }
}
