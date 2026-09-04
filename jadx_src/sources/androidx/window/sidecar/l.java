package androidx.window.sidecar;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.core.b;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ExtensionsWindowLayoutInfoAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J!\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/window/layout/l;", "", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "Landroidx/window/core/b;", "bounds", "", ak.aF, "Landroidx/window/extensions/layout/FoldingFeature;", "oemFeature", "Landroidx/window/layout/m;", ak.av, "(Landroid/app/Activity;Landroidx/window/extensions/layout/FoldingFeature;)Landroidx/window/layout/m;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "info", "Landroidx/window/layout/v;", "b", "(Landroid/app/Activity;Landroidx/window/extensions/layout/WindowLayoutInfo;)Landroidx/window/layout/v;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final l f28634a = new l();

    private l() {
    }

    private final boolean c(Activity activity, b bounds) {
        Rect rectA = y.f28677b.a(activity).a();
        if (bounds.h()) {
            return false;
        }
        if (bounds.f() != rectA.width() && bounds.b() != rectA.height()) {
            return false;
        }
        if (bounds.f() >= rectA.width() || bounds.b() >= rectA.height()) {
            return (bounds.f() == rectA.width() && bounds.b() == rectA.height()) ? false : true;
        }
        return false;
    }

    @e
    public final m a(@d Activity activity, @d FoldingFeature oemFeature) {
        n.b bVarA;
        m.c cVar;
        f0.p(activity, "activity");
        f0.p(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            bVarA = n.b.INSTANCE.a();
        } else {
            if (type != 2) {
                return null;
            }
            bVarA = n.b.INSTANCE.b();
        }
        int state = oemFeature.getState();
        if (state == 1) {
            cVar = m.c.f28644c;
        } else {
            if (state != 2) {
                return null;
            }
            cVar = m.c.f28645d;
        }
        Rect bounds = oemFeature.getBounds();
        f0.o(bounds, "oemFeature.bounds");
        if (!c(activity, new b(bounds))) {
            return null;
        }
        Rect bounds2 = oemFeature.getBounds();
        f0.o(bounds2, "oemFeature.bounds");
        return new n(new b(bounds2), bVarA, cVar);
    }

    @d
    public final v b(@d Activity activity, @d WindowLayoutInfo info) {
        m mVarA;
        f0.p(activity, "activity");
        f0.p(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        f0.o(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                l lVar = f28634a;
                f0.o(feature, "feature");
                mVarA = lVar.a(activity, feature);
            } else {
                mVarA = null;
            }
            if (mVarA != null) {
                arrayList.add(mVarA);
            }
        }
        return new v(arrayList);
    }
}
