package androidx.compose.ui.platform;

import android.view.PointerIcon;
import android.view.View;
import androidx.compose.ui.input.pointer.AndroidPointerIcon;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(24)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/u;", "", "Landroid/view/View;", sd.b.f139384b, "Landroidx/compose/ui/input/pointer/t;", "icon", "Lkotlin/b2;", ak.av, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final u f15985a = new u();

    private u() {
    }

    @androidx.annotation.u
    @androidx.annotation.w0(24)
    public final void a(@dl.d View view, @dl.e androidx.compose.ui.input.pointer.t tVar) {
        PointerIcon systemIcon;
        kotlin.jvm.internal.f0.p(view, "view");
        if (tVar instanceof AndroidPointerIcon) {
            systemIcon = ((AndroidPointerIcon) tVar).getPointerIcon();
        } else if (tVar instanceof androidx.compose.ui.input.pointer.AndroidPointerIcon) {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), ((androidx.compose.ui.input.pointer.AndroidPointerIcon) tVar).getType());
            kotlin.jvm.internal.f0.o(systemIcon, "getSystemIcon(view.context, icon.type)");
        } else {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), 1000);
            kotlin.jvm.internal.f0.o(systemIcon, "getSystemIcon(\n         …DEFAULT\n                )");
        }
        if (kotlin.jvm.internal.f0.g(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
