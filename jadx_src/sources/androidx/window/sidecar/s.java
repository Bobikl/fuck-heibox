package androidx.window.sidecar;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.window.extensions.layout.WindowLayoutComponent;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import xh.h;
import xh.m;

/* JADX INFO: compiled from: WindowInfoTracker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Landroidx/window/layout/s;", "", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "Lkotlinx/coroutines/flow/e;", "Landroidx/window/layout/v;", ak.av, "window_release"}, k = 1, mv = {1, 6, 0})
public interface s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    public static final Companion INSTANCE = Companion.f28670a;

    /* JADX INFO: renamed from: androidx.window.layout.s$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: WindowInfoTracker.kt */
    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\u000bH\u0007R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/window/layout/s$a;", "", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroidx/window/layout/s;", ak.av, "Landroidx/window/layout/q;", "d", "(Landroid/content/Context;)Landroidx/window/layout/q;", "Landroidx/window/layout/t;", "overridingDecorator", "Lkotlin/b2;", "b", ak.aF, "", "Z", "DEBUG", "", "Ljava/lang/String;", "TAG", "Landroidx/window/layout/t;", "decorator", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final boolean DEBUG = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f28670a = new Companion();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @e
        private static final String TAG = n0.d(s.class).F();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @d
        private static t decorator = i.f28625a;

        private Companion() {
        }

        @d
        @h(name = "getOrCreate")
        @m
        public final s a(@d Context context) {
            f0.p(context, "context");
            return decorator.a(new WindowInfoTrackerImpl(y.f28677b, d(context)));
        }

        @m
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void b(@d t overridingDecorator) {
            f0.p(overridingDecorator, "overridingDecorator");
            decorator = overridingDecorator;
        }

        @m
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void c() {
            decorator = i.f28625a;
        }

        @d
        public final q d(@d Context context) {
            f0.p(context, "context");
            k kVar = null;
            try {
                WindowLayoutComponent windowLayoutComponentM = SafeWindowLayoutComponentProvider.f28572a.m();
                if (windowLayoutComponentM != null) {
                    kVar = new k(windowLayoutComponentM);
                }
            } catch (Throwable unused) {
                if (DEBUG) {
                    Log.d(TAG, "Failed to load WindowExtensions");
                }
            }
            return kVar == null ? o.INSTANCE.a(context) : kVar;
        }
    }

    @d
    kotlinx.coroutines.flow.e<v> a(@d Activity activity);
}
