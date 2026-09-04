package androidx.compose.ui.text.input;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import com.umeng.analytics.pro.ak;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX INFO: compiled from: InputMethodManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J0\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/input/InputMethodManagerImpl;", "Landroidx/compose/ui/text/input/s;", "Landroid/view/View;", sd.b.f139384b, "Lkotlin/b2;", "e", ak.av, "Landroid/os/IBinder;", "windowToken", "b", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", "d", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", ak.aF, "Landroid/view/inputmethod/InputMethodManager;", "Lkotlin/z;", "f", "()Landroid/view/inputmethod/InputMethodManager;", "imm", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "<init>", "(Landroid/content/Context;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class InputMethodManagerImpl implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlin.z imm;

    public InputMethodManagerImpl(@dl.d final Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        this.imm = kotlin.b0.b(LazyThreadSafetyMode.NONE, new yh.a<InputMethodManager>() { // from class: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InputMethodManager invoke() {
                Object systemService = context.getSystemService("input_method");
                kotlin.jvm.internal.f0.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            }
        });
    }

    private final InputMethodManager f() {
        return (InputMethodManager) this.imm.getValue();
    }

    @Override // androidx.compose.ui.text.input.s
    public void a(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "view");
        f().showSoftInput(view, 0);
    }

    @Override // androidx.compose.ui.text.input.s
    public void b(@dl.e IBinder iBinder) {
        f().hideSoftInputFromWindow(iBinder, 0);
    }

    @Override // androidx.compose.ui.text.input.s
    public void c(@dl.d View view, int i10, int i11, int i12, int i13) {
        kotlin.jvm.internal.f0.p(view, "view");
        f().updateSelection(view, i10, i11, i12, i13);
    }

    @Override // androidx.compose.ui.text.input.s
    public void d(@dl.d View view, int i10, @dl.d ExtractedText extractedText) {
        kotlin.jvm.internal.f0.p(view, "view");
        kotlin.jvm.internal.f0.p(extractedText, "extractedText");
        f().updateExtractedText(view, i10, extractedText);
    }

    @Override // androidx.compose.ui.text.input.s
    public void e(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "view");
        f().restartInput(view);
    }
}
