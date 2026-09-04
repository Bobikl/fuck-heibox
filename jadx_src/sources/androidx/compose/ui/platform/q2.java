package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.ui.h
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/q2;", "", "Landroid/view/View;", "windowRootView", "Landroidx/compose/runtime/Recomposer;", ak.av, "ui_release"}, k = 1, mv = {1, 7, 1})
public interface q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f15975a;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.q2$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: WindowRecomposer.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\bR\u001d\u0010\t\u001a\u00020\u00028\u0006¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/q2$a;", "", "Landroidx/compose/ui/platform/q2;", "b", "Landroidx/compose/ui/platform/q2;", ak.av, "()Landroidx/compose/ui/platform/q2;", "getLifecycleAware$annotations", "()V", "LifecycleAware", "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f15975a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final q2 LifecycleAware = C0101a.f15977b;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.q2$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: WindowRecomposer.android.kt */
        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "rootView", "Landroidx/compose/runtime/Recomposer;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class C0101a implements q2 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0101a f15977b = new C0101a();

            C0101a() {
            }

            @Override // androidx.compose.ui.platform.q2
            @dl.d
            public final Recomposer a(@dl.d View rootView) {
                kotlin.jvm.internal.f0.p(rootView, "rootView");
                return WindowRecomposer_androidKt.c(rootView, null, null, 3, null);
            }
        }

        private Companion() {
        }

        public static /* synthetic */ void b() {
        }

        @dl.d
        public final q2 a() {
            return LifecycleAware;
        }
    }

    @dl.d
    Recomposer a(@dl.d View windowRootView);
}
