package androidx.compose.ui.platform;

import android.view.View;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/r;", "", "Landroid/view/View;", sd.b.f139384b, "Lkotlin/b2;", ak.av, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final r f15978a = new r();

    private r() {
    }

    @androidx.annotation.u
    @androidx.annotation.w0(29)
    public final void a(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "view");
        view.setForceDarkAllowed(false);
    }
}
