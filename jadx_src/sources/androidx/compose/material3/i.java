package androidx.compose.material3;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Checkbox.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\f\u0010\u0005¨\u0006\u0010"}, d2 = {"Landroidx/compose/material3/i;", "", "Landroidx/compose/ui/graphics/l1;", ak.av, "Landroidx/compose/ui/graphics/l1;", "()Landroidx/compose/ui/graphics/l1;", "checkPath", "Landroidx/compose/ui/graphics/p1;", "b", "Landroidx/compose/ui/graphics/p1;", "()Landroidx/compose/ui/graphics/p1;", "pathMeasure", ak.aF, "pathToDraw", "<init>", "(Landroidx/compose/ui/graphics/l1;Landroidx/compose/ui/graphics/p1;Landroidx/compose/ui/graphics/l1;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.graphics.l1 checkPath;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.graphics.p1 pathMeasure;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.graphics.l1 pathToDraw;

    public i() {
        this(null, null, null, 7, null);
    }

    public i(@dl.d androidx.compose.ui.graphics.l1 checkPath, @dl.d androidx.compose.ui.graphics.p1 pathMeasure, @dl.d androidx.compose.ui.graphics.l1 pathToDraw) {
        kotlin.jvm.internal.f0.p(checkPath, "checkPath");
        kotlin.jvm.internal.f0.p(pathMeasure, "pathMeasure");
        kotlin.jvm.internal.f0.p(pathToDraw, "pathToDraw");
        this.checkPath = checkPath;
        this.pathMeasure = pathMeasure;
        this.pathToDraw = pathToDraw;
    }

    public /* synthetic */ i(androidx.compose.ui.graphics.l1 l1Var, androidx.compose.ui.graphics.p1 p1Var, androidx.compose.ui.graphics.l1 l1Var2, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? androidx.compose.ui.graphics.o.a() : l1Var, (i10 & 2) != 0 ? androidx.compose.ui.graphics.n.a() : p1Var, (i10 & 4) != 0 ? androidx.compose.ui.graphics.o.a() : l1Var2);
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final androidx.compose.ui.graphics.l1 getCheckPath() {
        return this.checkPath;
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final androidx.compose.ui.graphics.p1 getPathMeasure() {
        return this.pathMeasure;
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final androidx.compose.ui.graphics.l1 getPathToDraw() {
        return this.pathToDraw;
    }
}
