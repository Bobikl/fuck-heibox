package androidx.compose.ui.text.input;

import androidx.compose.ui.text.o0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextFieldValue.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "maxChars", "Landroidx/compose/ui/text/d;", ak.aF, "b", ak.av, "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class h0 {
    @dl.d
    public static final androidx.compose.ui.text.d a(@dl.d TextFieldValue textFieldValue) {
        kotlin.jvm.internal.f0.p(textFieldValue, "<this>");
        return textFieldValue.getText().m(textFieldValue.getSelection());
    }

    @dl.d
    public static final androidx.compose.ui.text.d b(@dl.d TextFieldValue textFieldValue, int i10) {
        kotlin.jvm.internal.f0.p(textFieldValue, "<this>");
        return textFieldValue.getText().subSequence(o0.k(textFieldValue.getSelection()), Math.min(o0.k(textFieldValue.getSelection()) + i10, textFieldValue.i().length()));
    }

    @dl.d
    public static final androidx.compose.ui.text.d c(@dl.d TextFieldValue textFieldValue, int i10) {
        kotlin.jvm.internal.f0.p(textFieldValue, "<this>");
        return textFieldValue.getText().subSequence(Math.max(0, o0.l(textFieldValue.getSelection()) - i10), o0.l(textFieldValue.getSelection()));
    }
}
