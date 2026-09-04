package androidx.compose.ui.draw;

import androidx.compose.ui.unit.LayoutDirection;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/draw/m;", "Landroidx/compose/ui/draw/c;", "Lb1/m;", ak.aF, "J", "()J", UiKitSpanObj.TYPE_SIZE, "Landroidx/compose/ui/unit/LayoutDirection;", "d", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Ls1/e;", "density", "Ls1/e;", "getDensity", "()Ls1/e;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class m implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final m f13473b = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final long size = b1.m.f30386b.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final LayoutDirection layoutDirection = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final s1.e f13476e = s1.g.a(1.0f, 1.0f);

    private m() {
    }

    @Override // androidx.compose.ui.draw.c
    public long c() {
        return size;
    }

    @Override // androidx.compose.ui.draw.c
    @dl.d
    public s1.e getDensity() {
        return f13476e;
    }

    @Override // androidx.compose.ui.draw.c
    @dl.d
    public LayoutDirection getLayoutDirection() {
        return layoutDirection;
    }
}
