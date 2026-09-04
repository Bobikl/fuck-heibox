package androidx.compose.ui.platform;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SoftwareKeyboardController.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.j2
@androidx.compose.ui.g
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H\u0017J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/u1;", "", "Lkotlin/b2;", "show", "b", "hide", ak.av, "ui_release"}, k = 1, mv = {1, 7, 1})
public interface u1 {
    @kotlin.k(message = "Use hide instead.", replaceWith = @kotlin.s0(expression = "hide()", imports = {}))
    void a();

    @kotlin.k(message = "Use show instead.", replaceWith = @kotlin.s0(expression = "show()", imports = {}))
    void b();

    void hide();

    void show();
}
