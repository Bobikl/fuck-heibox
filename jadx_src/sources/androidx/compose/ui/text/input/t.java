package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.o0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: InputState.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "Landroid/view/inputmethod/ExtractedText;", ak.av, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class t {
    @dl.d
    public static final ExtractedText a(@dl.d TextFieldValue textFieldValue) {
        kotlin.jvm.internal.f0.p(textFieldValue, "<this>");
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.i();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.i().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = o0.l(textFieldValue.getSelection());
        extractedText.selectionEnd = o0.k(textFieldValue.getSelection());
        extractedText.flags = !StringsKt__StringsKt.V2(textFieldValue.i(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
