package androidx.compose.foundation.layout;

import androidx.compose.runtime.j2;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/h1;", "", "Ls1/e;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "b", ak.av, "d", ak.aF, "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public interface h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f6331a;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.h1$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: WindowInsets.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/h1$a;", "", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f6331a = new Companion();

        private Companion() {
        }
    }

    int a(@dl.d s1.e density);

    int b(@dl.d s1.e density, @dl.d LayoutDirection layoutDirection);

    int c(@dl.d s1.e density);

    int d(@dl.d s1.e density, @dl.d LayoutDirection layoutDirection);
}
