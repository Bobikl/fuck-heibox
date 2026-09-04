package androidx.compose.ui.text.input;

import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: InputMethodManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&J0\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/s;", "", "Landroid/view/View;", sd.b.f139384b, "Lkotlin/b2;", "e", ak.av, "Landroid/os/IBinder;", "windowToken", "b", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", "d", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", ak.aF, "ui_release"}, k = 1, mv = {1, 7, 1})
public interface s {
    void a(@dl.d View view);

    void b(@dl.e IBinder iBinder);

    void c(@dl.d View view, int i10, int i11, int i12, int i13);

    void d(@dl.d View view, int i10, @dl.d ExtractedText extractedText);

    void e(@dl.d View view);
}
