package androidx.compose.material3;

import androidx.compose.runtime.j2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@w
@j2
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/d2;", "", "Landroidx/compose/material3/TopAppBarState;", "getState", "()Landroidx/compose/material3/TopAppBarState;", "state", "", "b", "()Z", "isPinned", "Landroidx/compose/animation/core/h;", "", ak.aF, "()Landroidx/compose/animation/core/h;", "snapAnimationSpec", "Landroidx/compose/animation/core/x;", "d", "()Landroidx/compose/animation/core/x;", "flingAnimationSpec", "Landroidx/compose/ui/input/nestedscroll/b;", ak.av, "()Landroidx/compose/ui/input/nestedscroll/b;", "nestedScrollConnection", "material3_release"}, k = 1, mv = {1, 7, 1})
public interface d2 {
    @dl.d
    /* JADX INFO: renamed from: a */
    androidx.compose.ui.input.nestedscroll.b getNestedScrollConnection();

    /* JADX INFO: renamed from: b */
    boolean getIsPinned();

    @dl.e
    androidx.compose.animation.core.h<Float> c();

    @dl.e
    androidx.compose.animation.core.x<Float> d();

    @dl.d
    TopAppBarState getState();
}
