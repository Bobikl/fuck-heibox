package androidx.compose.ui.platform;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: LocalSoftwareKeyboardController.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.ui.g
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/n0;", "Landroidx/compose/ui/platform/u1;", "Lkotlin/b2;", "show", "hide", "Landroidx/compose/ui/text/input/i0;", ak.av, "Landroidx/compose/ui/text/input/i0;", ak.aF, "()Landroidx/compose/ui/text/input/i0;", "textInputService", "<init>", "(Landroidx/compose/ui/text/input/i0;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class n0 implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.text.input.i0 textInputService;

    public n0(@dl.d androidx.compose.ui.text.input.i0 textInputService) {
        kotlin.jvm.internal.f0.p(textInputService, "textInputService");
        this.textInputService = textInputService;
    }

    @Override // androidx.compose.ui.platform.u1
    public /* synthetic */ void a() {
        t1.a(this);
    }

    @Override // androidx.compose.ui.platform.u1
    public /* synthetic */ void b() {
        t1.b(this);
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final androidx.compose.ui.text.input.i0 getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.platform.u1
    public void hide() {
        this.textInputService.b();
    }

    @Override // androidx.compose.ui.platform.u1
    public void show() {
        this.textInputService.c();
    }
}
