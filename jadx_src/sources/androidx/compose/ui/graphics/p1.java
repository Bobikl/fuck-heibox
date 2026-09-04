package androidx.compose.ui.graphics;

import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PathMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&J\u001a\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0007H&R\u0014\u0010\u0010\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/p1;", "", "", "startDistance", "stopDistance", "Landroidx/compose/ui/graphics/l1;", "destination", "", "startWithMoveTo", ak.av, FlutterActivityLaunchConfigs.EXTRA_PATH, "forceClosed", "Lkotlin/b2;", "b", "getLength", "()F", com.google.android.exoplayer2.source.rtsp.k0.f48801p, "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public interface p1 {

    /* JADX INFO: compiled from: PathMeasure.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
    }

    boolean a(float startDistance, float stopDistance, @dl.d l1 destination, boolean startWithMoveTo);

    void b(@dl.e l1 l1Var, boolean z10);

    float getLength();
}
