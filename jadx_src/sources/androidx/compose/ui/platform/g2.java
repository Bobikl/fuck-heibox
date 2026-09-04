package androidx.compose.ui.platform;

import android.view.View;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ViewLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(28)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/g2;", "", "Landroid/view/View;", sd.b.f139384b, "", "target", "Lkotlin/b2;", ak.av, "b", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final g2 f15876a = new g2();

    private g2() {
    }

    @androidx.annotation.u
    public final void a(@dl.d View view, int i10) {
        kotlin.jvm.internal.f0.p(view, "view");
        view.setOutlineAmbientShadowColor(i10);
    }

    @androidx.annotation.u
    public final void b(@dl.d View view, int i10) {
        kotlin.jvm.internal.f0.p(view, "view");
        view.setOutlineSpotShadowColor(i10);
    }
}
