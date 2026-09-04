package androidx.compose.ui.text.input;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: TextInputService.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0082\bJ\u0006\u0010\u0007\u001a\u00020\u0003J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0005R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/text/input/k0;", "", "Lkotlin/Function0;", "Lkotlin/b2;", "block", "", "b", ak.av, "Lb1/i;", "rect", "e", "Landroidx/compose/ui/text/input/TextFieldValue;", "oldValue", "newValue", "g", "f", ak.aF, "Landroidx/compose/ui/text/input/i0;", "Landroidx/compose/ui/text/input/i0;", "textInputService", "Landroidx/compose/ui/text/input/b0;", "Landroidx/compose/ui/text/input/b0;", "platformTextInputService", "d", "()Z", "isOpen", "<init>", "(Landroidx/compose/ui/text/input/i0;Landroidx/compose/ui/text/input/b0;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16740c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final i0 textInputService;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b0 platformTextInputService;

    public k0(@dl.d i0 textInputService, @dl.d b0 platformTextInputService) {
        kotlin.jvm.internal.f0.p(textInputService, "textInputService");
        kotlin.jvm.internal.f0.p(platformTextInputService, "platformTextInputService");
        this.textInputService = textInputService;
        this.platformTextInputService = platformTextInputService;
    }

    private final boolean b(yh.a<b2> aVar) {
        boolean zD = d();
        if (zD) {
            aVar.invoke();
        }
        return zD;
    }

    public final void a() {
        this.textInputService.e(this);
    }

    public final boolean c() {
        boolean zD = d();
        if (zD) {
            this.platformTextInputService.a();
        }
        return zD;
    }

    public final boolean d() {
        return kotlin.jvm.internal.f0.g(this.textInputService.a(), this);
    }

    @kotlin.k(message = "This method should not be called, used BringIntoViewRequester instead.")
    public final boolean e(@dl.d b1.i rect) {
        kotlin.jvm.internal.f0.p(rect, "rect");
        boolean zD = d();
        if (zD) {
            this.platformTextInputService.e(rect);
        }
        return zD;
    }

    public final boolean f() {
        boolean zD = d();
        if (zD) {
            this.platformTextInputService.b();
        }
        return zD;
    }

    public final boolean g(@dl.e TextFieldValue oldValue, @dl.d TextFieldValue newValue) {
        kotlin.jvm.internal.f0.p(newValue, "newValue");
        boolean zD = d();
        if (zD) {
            this.platformTextInputService.d(oldValue, newValue);
        }
        return zD;
    }
}
