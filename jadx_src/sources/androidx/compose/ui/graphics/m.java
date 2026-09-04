package androidx.compose.ui.graphics;

import android.graphics.Path;
import android.graphics.PathMeasure;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidPathMeasure.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/m;", "Landroidx/compose/ui/graphics/p1;", "", "startDistance", "stopDistance", "Landroidx/compose/ui/graphics/l1;", "destination", "", "startWithMoveTo", ak.av, FlutterActivityLaunchConfigs.EXTRA_PATH, "forceClosed", "Lkotlin/b2;", "b", "Landroid/graphics/PathMeasure;", "Landroid/graphics/PathMeasure;", "internalPathMeasure", "getLength", "()F", com.google.android.exoplayer2.source.rtsp.k0.f48801p, "<init>", "(Landroid/graphics/PathMeasure;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class m implements p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final PathMeasure internalPathMeasure;

    public m(@dl.d PathMeasure internalPathMeasure) {
        kotlin.jvm.internal.f0.p(internalPathMeasure, "internalPathMeasure");
        this.internalPathMeasure = internalPathMeasure;
    }

    @Override // androidx.compose.ui.graphics.p1
    public boolean a(float startDistance, float stopDistance, @dl.d l1 destination, boolean startWithMoveTo) {
        kotlin.jvm.internal.f0.p(destination, "destination");
        PathMeasure pathMeasure = this.internalPathMeasure;
        if (destination instanceof j) {
            return pathMeasure.getSegment(startDistance, stopDistance, ((j) destination).getInternalPath(), startWithMoveTo);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.p1
    public void b(@dl.e l1 l1Var, boolean z10) {
        Path internalPath;
        PathMeasure pathMeasure = this.internalPathMeasure;
        if (l1Var == null) {
            internalPath = null;
        } else {
            if (!(l1Var instanceof j)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            internalPath = ((j) l1Var).getInternalPath();
        }
        pathMeasure.setPath(internalPath, z10);
    }

    @Override // androidx.compose.ui.graphics.p1
    public float getLength() {
        return this.internalPathMeasure.getLength();
    }
}
