package androidx.compose.foundation;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.j2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PlatformMagnifier.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\ba\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&R\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/j0;", "", "Landroidx/compose/foundation/c0;", "style", "Landroid/view/View;", sd.b.f139384b, "Ls1/e;", "density", "", "initialZoom", "Landroidx/compose/foundation/i0;", ak.av, "", "b", "()Z", "canUpdateZoom", "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f5878a;

    /* JADX INFO: renamed from: androidx.compose.foundation.j0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: PlatformMagnifier.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/j0$a;", "", "Landroidx/compose/foundation/j0;", ak.av, "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f5878a = new Companion();

        private Companion() {
        }

        @j2
        @dl.d
        public final j0 a() {
            if (MagnifierKt.c(0, 1, null)) {
                return Build.VERSION.SDK_INT == 28 ? k0.f5879b : n0.f7447b;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    @dl.d
    i0 a(@dl.d c0 style, @dl.d View view, @dl.d s1.e density, float initialZoom);

    boolean b();
}
