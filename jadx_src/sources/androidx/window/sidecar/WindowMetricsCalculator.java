package androidx.window.sidecar;

import android.app.Activity;
import androidx.annotation.RestrictTo;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import xh.m;
import yh.l;

/* JADX INFO: compiled from: WindowMetricsCalculator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculator;", "", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "Landroidx/window/layout/w;", ak.av, "b", "Companion", "window_release"}, k = 1, mv = {1, 6, 0})
public interface WindowMetricsCalculator {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    public static final Companion INSTANCE = Companion.f28617a;

    /* JADX INFO: compiled from: WindowMetricsCalculator.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculator$Companion;", "", "Landroidx/window/layout/WindowMetricsCalculator;", ak.av, "Landroidx/window/layout/z;", "overridingDecorator", "Lkotlin/b2;", "b", ak.aF, "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f28617a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @d
        private static l<? super WindowMetricsCalculator, ? extends WindowMetricsCalculator> f28618b = new l<WindowMetricsCalculator, WindowMetricsCalculator>() { // from class: androidx.window.layout.WindowMetricsCalculator$Companion$decorator$1
            @Override // yh.l
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WindowMetricsCalculator invoke(@d WindowMetricsCalculator it) {
                f0.p(it, "it");
                return it;
            }
        };

        private Companion() {
        }

        @d
        @m
        public final WindowMetricsCalculator a() {
            return f28618b.invoke(y.f28677b);
        }

        @androidx.window.core.d
        @m
        @RestrictTo({RestrictTo.Scope.TESTS})
        public final void b(@d z overridingDecorator) {
            f0.p(overridingDecorator, "overridingDecorator");
            f28618b = new WindowMetricsCalculator$Companion$overrideDecorator$1(overridingDecorator);
        }

        @androidx.window.core.d
        @m
        @RestrictTo({RestrictTo.Scope.TESTS})
        public final void c() {
            f28618b = new l<WindowMetricsCalculator, WindowMetricsCalculator>() { // from class: androidx.window.layout.WindowMetricsCalculator$Companion$reset$1
                @Override // yh.l
                @d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final WindowMetricsCalculator invoke(@d WindowMetricsCalculator it) {
                    f0.p(it, "it");
                    return it;
                }
            };
        }
    }

    @d
    w a(@d Activity activity);

    @d
    w b(@d Activity activity);
}
