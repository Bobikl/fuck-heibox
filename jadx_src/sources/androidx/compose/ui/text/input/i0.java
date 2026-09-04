package androidx.compose.ui.text.input;

import com.umeng.analytics.pro.ak;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.s0;

/* JADX INFO: compiled from: TextInputService.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJI\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0006H\u0016ø\u0001\u0000J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0007J\b\u0010\u0012\u001a\u00020\tH\u0007R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R(\u0010\u001a\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0017j\n\u0012\u0006\u0012\u0004\u0018\u00010\r`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/input/i0;", "", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/p;", "imeOptions", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/g;", "Lkotlin/b2;", "onEditCommand", "Landroidx/compose/ui/text/input/o;", "onImeActionPerformed", "Landroidx/compose/ui/text/input/k0;", "d", com.umeng.analytics.pro.d.aw, "e", ak.aF, "b", "Landroidx/compose/ui/text/input/b0;", ak.av, "Landroidx/compose/ui/text/input/b0;", "platformTextInputService", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/text/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "_currentInputSession", "()Landroidx/compose/ui/text/input/k0;", "currentInputSession", "<init>", "(Landroidx/compose/ui/text/input/b0;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public class i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16735c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b0 platformTextInputService;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AtomicReference<k0> _currentInputSession;

    public i0(@dl.d b0 platformTextInputService) {
        kotlin.jvm.internal.f0.p(platformTextInputService, "platformTextInputService");
        this.platformTextInputService = platformTextInputService;
        this._currentInputSession = new AtomicReference<>(null);
    }

    @dl.e
    public final k0 a() {
        return this._currentInputSession.get();
    }

    @kotlin.k(message = "Use SoftwareKeyboardController.hide or TextInputSession.hideSoftwareKeyboard instead.", replaceWith = @s0(expression = "textInputSession.hideSoftwareKeyboard()", imports = {}))
    public final void b() {
        this.platformTextInputService.a();
    }

    @kotlin.k(message = "Use SoftwareKeyboardController.show or TextInputSession.showSoftwareKeyboard instead.", replaceWith = @s0(expression = "textInputSession.showSoftwareKeyboard()", imports = {}))
    public final void c() {
        if (this._currentInputSession.get() != null) {
            this.platformTextInputService.b();
        }
    }

    @dl.d
    public k0 d(@dl.d TextFieldValue value, @dl.d ImeOptions imeOptions, @dl.d yh.l<? super List<? extends g>, b2> onEditCommand, @dl.d yh.l<? super o, b2> onImeActionPerformed) {
        kotlin.jvm.internal.f0.p(value, "value");
        kotlin.jvm.internal.f0.p(imeOptions, "imeOptions");
        kotlin.jvm.internal.f0.p(onEditCommand, "onEditCommand");
        kotlin.jvm.internal.f0.p(onImeActionPerformed, "onImeActionPerformed");
        this.platformTextInputService.f(value, imeOptions, onEditCommand, onImeActionPerformed);
        k0 k0Var = new k0(this, this.platformTextInputService);
        this._currentInputSession.set(k0Var);
        return k0Var;
    }

    public void e(@dl.d k0 session) {
        kotlin.jvm.internal.f0.p(session, "session");
        if (androidx.compose.animation.core.s0.a(this._currentInputSession, session, null)) {
            this.platformTextInputService.c();
        }
    }
}
