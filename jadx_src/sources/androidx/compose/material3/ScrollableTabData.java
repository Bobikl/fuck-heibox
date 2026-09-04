package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\t\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002J,\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/ScrollableTabData;", "", "Landroidx/compose/material3/w1;", "Ls1/e;", "density", "", "edgeOffset", "", "tabPositions", "b", "selectedTab", "Lkotlin/b2;", ak.aF, "Landroidx/compose/foundation/ScrollState;", ak.av, "Landroidx/compose/foundation/ScrollState;", "scrollState", "Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/q0;", "coroutineScope", "Ljava/lang/Integer;", "<init>", "(Landroidx/compose/foundation/ScrollState;Lkotlinx/coroutines/q0;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class ScrollableTabData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ScrollState scrollState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.q0 coroutineScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Integer selectedTab;

    public ScrollableTabData(@dl.d ScrollState scrollState, @dl.d kotlinx.coroutines.q0 coroutineScope) {
        kotlin.jvm.internal.f0.p(scrollState, "scrollState");
        kotlin.jvm.internal.f0.p(coroutineScope, "coroutineScope");
        this.scrollState = scrollState;
        this.coroutineScope = coroutineScope;
    }

    private final int b(TabPosition tabPosition, s1.e eVar, int i10, List<TabPosition> list) {
        int iE1 = eVar.e1(((TabPosition) CollectionsKt___CollectionsKt.k3(list)).b()) + i10;
        int iL = iE1 - this.scrollState.l();
        return fi.u.I(eVar.e1(tabPosition.getLeft()) - ((iL / 2) - (eVar.e1(tabPosition.getWidth()) / 2)), 0, fi.u.u(iE1 - iL, 0));
    }

    public final void c(@dl.d s1.e density, int i10, @dl.d List<TabPosition> tabPositions, int i11) {
        int iB;
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
        Integer num = this.selectedTab;
        if (num != null && num.intValue() == i11) {
            return;
        }
        this.selectedTab = Integer.valueOf(i11);
        TabPosition tabPosition = (TabPosition) CollectionsKt___CollectionsKt.R2(tabPositions, i11);
        if (tabPosition == null || this.scrollState.m() == (iB = b(tabPosition, density, i10, tabPositions))) {
            return;
        }
        kotlinx.coroutines.k.f(this.coroutineScope, null, null, new ScrollableTabData$onLaidOut$1$1(this, iB, null), 3, null);
    }
}
