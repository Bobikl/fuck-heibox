package androidx.compose.ui.layout;

import androidx.compose.ui.platform.d2;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011R\u0014\u0010%\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006&À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/u;", "", "", "Landroidx/compose/ui/layout/o0;", "x", "", "getWidth", "()I", "width", "getHeight", "height", "Landroidx/compose/ui/layout/q;", ak.aG, "()Landroidx/compose/ui/layout/q;", "coordinates", "", "t", "()Z", "isPlaced", RXScreenCaptureService.KEY_WIDTH, "()Landroidx/compose/ui/layout/u;", "parentInfo", "Ls1/e;", "getDensity", "()Ls1/e;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/platform/d2;", "getViewConfiguration", "()Landroidx/compose/ui/platform/d2;", "viewConfiguration", "p", "isAttached", "v", "semanticsId", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface u {
    @dl.d
    /* JADX INFO: renamed from: getDensity */
    s1.e getF15149p();

    int getHeight();

    @dl.d
    LayoutDirection getLayoutDirection();

    @dl.d
    d2 getViewConfiguration();

    int getWidth();

    boolean p();

    /* JADX INFO: renamed from: t */
    boolean getIsPlaced();

    @dl.d
    q u();

    /* JADX INFO: renamed from: v */
    int getSemanticsId();

    @dl.e
    u w();

    @dl.d
    List<o0> x();
}
