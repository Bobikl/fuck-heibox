package androidx.navigation.ui;

import android.view.Menu;
import androidx.navigation.NavGraph;
import java.util.Set;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AppBarConfiguration.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class AppBarConfigurationKt {

    /* JADX INFO: compiled from: AppBarConfiguration.kt */
    public static final /* synthetic */ class a implements d.b, a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ yh.a f25290a;

        public a(yh.a function) {
            f0.p(function, "function");
            this.f25290a = function;
        }

        @Override // androidx.navigation.ui.d.b
        public final /* synthetic */ boolean a() {
            return ((Boolean) this.f25290a.invoke()).booleanValue();
        }

        @Override // kotlin.jvm.internal.a0
        @dl.d
        public final kotlin.u<?> b() {
            return this.f25290a;
        }

        public final boolean equals(@dl.e Object obj) {
            if ((obj instanceof d.b) && (obj instanceof a0)) {
                return f0.g(b(), ((a0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @dl.d
    public static final d a(@dl.d Menu topLevelMenu, @dl.e androidx.customview.widget.c cVar, @dl.d yh.a<Boolean> fallbackOnNavigateUpListener) {
        f0.p(topLevelMenu, "topLevelMenu");
        f0.p(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new d.a(topLevelMenu).d(cVar).c(new a(fallbackOnNavigateUpListener)).a();
    }

    @dl.d
    public static final d b(@dl.d NavGraph navGraph, @dl.e androidx.customview.widget.c cVar, @dl.d yh.a<Boolean> fallbackOnNavigateUpListener) {
        f0.p(navGraph, "navGraph");
        f0.p(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new d.a(navGraph).d(cVar).c(new a(fallbackOnNavigateUpListener)).a();
    }

    @dl.d
    public static final d c(@dl.d Set<Integer> topLevelDestinationIds, @dl.e androidx.customview.widget.c cVar, @dl.d yh.a<Boolean> fallbackOnNavigateUpListener) {
        f0.p(topLevelDestinationIds, "topLevelDestinationIds");
        f0.p(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new d.a(topLevelDestinationIds).d(cVar).c(new a(fallbackOnNavigateUpListener)).a();
    }

    public static /* synthetic */ d d(Menu topLevelMenu, androidx.customview.widget.c cVar, yh.a fallbackOnNavigateUpListener, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        if ((i10 & 4) != 0) {
            fallbackOnNavigateUpListener = new yh.a<Boolean>() { // from class: androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$2
                @Override // yh.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.FALSE;
                }
            };
        }
        f0.p(topLevelMenu, "topLevelMenu");
        f0.p(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new d.a(topLevelMenu).d(cVar).c(new a(fallbackOnNavigateUpListener)).a();
    }

    public static /* synthetic */ d e(NavGraph navGraph, androidx.customview.widget.c cVar, yh.a fallbackOnNavigateUpListener, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        if ((i10 & 4) != 0) {
            fallbackOnNavigateUpListener = AppBarConfigurationKt$AppBarConfiguration$1.f25287b;
        }
        f0.p(navGraph, "navGraph");
        f0.p(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new d.a(navGraph).d(cVar).c(new a(fallbackOnNavigateUpListener)).a();
    }

    public static /* synthetic */ d f(Set topLevelDestinationIds, androidx.customview.widget.c cVar, yh.a fallbackOnNavigateUpListener, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        if ((i10 & 4) != 0) {
            fallbackOnNavigateUpListener = new yh.a<Boolean>() { // from class: androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$3
                @Override // yh.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.FALSE;
                }
            };
        }
        f0.p(topLevelDestinationIds, "topLevelDestinationIds");
        f0.p(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new d.a((Set<Integer>) topLevelDestinationIds).d(cVar).c(new a(fallbackOnNavigateUpListener)).a();
    }
}
