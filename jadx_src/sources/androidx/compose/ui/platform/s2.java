package androidx.compose.ui.platform;

import android.view.ViewParent;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: RenderNodeLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(26)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/s2;", "", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/b2;", ak.av, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final s2 f15982a = new s2();

    private s2() {
    }

    @androidx.annotation.u
    public final void a(@dl.d AndroidComposeView ownerView) {
        kotlin.jvm.internal.f0.p(ownerView, "ownerView");
        ViewParent parent = ownerView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(ownerView, ownerView);
        }
    }
}
