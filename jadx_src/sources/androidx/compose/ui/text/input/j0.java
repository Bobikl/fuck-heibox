package androidx.compose.ui.text.input;

import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.o0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import org.android.agoo.common.AgooConstants;

/* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002\"\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "Landroidx/compose/ui/text/input/p;", "imeOptions", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Lkotlin/b2;", "b", "", "bits", AgooConstants.MESSAGE_FLAG, "", ak.av, "", "Ljava/lang/String;", "DEBUG_CLASS", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f16738a = "TextInputServiceAndroid";

    private static final boolean a(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static final void b(@dl.d EditorInfo editorInfo, @dl.d ImeOptions imeOptions, @dl.d TextFieldValue textFieldValue) {
        kotlin.jvm.internal.f0.p(editorInfo, "<this>");
        kotlin.jvm.internal.f0.p(imeOptions, "imeOptions");
        kotlin.jvm.internal.f0.p(textFieldValue, "textFieldValue");
        int imeAction = imeOptions.getImeAction();
        o.Companion companion = o.INSTANCE;
        int i10 = 6;
        if (o.l(imeAction, companion.a())) {
            if (!imeOptions.getSingleLine()) {
                i10 = 0;
            }
        } else if (o.l(imeAction, companion.e())) {
            i10 = 1;
        } else if (o.l(imeAction, companion.c())) {
            i10 = 2;
        } else if (o.l(imeAction, companion.d())) {
            i10 = 5;
        } else if (o.l(imeAction, companion.f())) {
            i10 = 7;
        } else if (o.l(imeAction, companion.g())) {
            i10 = 3;
        } else if (o.l(imeAction, companion.h())) {
            i10 = 4;
        } else if (!o.l(imeAction, companion.b())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i10;
        int keyboardType = imeOptions.getKeyboardType();
        v.Companion companion2 = v.INSTANCE;
        if (v.m(keyboardType, companion2.h())) {
            editorInfo.inputType = 1;
        } else if (v.m(keyboardType, companion2.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (v.m(keyboardType, companion2.d())) {
            editorInfo.inputType = 2;
        } else if (v.m(keyboardType, companion2.g())) {
            editorInfo.inputType = 3;
        } else if (v.m(keyboardType, companion2.i())) {
            editorInfo.inputType = 17;
        } else if (v.m(keyboardType, companion2.c())) {
            editorInfo.inputType = 33;
        } else if (v.m(keyboardType, companion2.f())) {
            editorInfo.inputType = 129;
        } else if (v.m(keyboardType, companion2.e())) {
            editorInfo.inputType = 18;
        } else {
            if (!v.m(keyboardType, companion2.b())) {
                throw new IllegalStateException("Invalid Keyboard Type".toString());
            }
            editorInfo.inputType = 8194;
        }
        if (!imeOptions.getSingleLine() && a(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (o.l(imeOptions.getImeAction(), companion.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (a(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            u.Companion companion3 = u.INSTANCE;
            if (u.h(capitalization, companion3.a())) {
                editorInfo.inputType |= 4096;
            } else if (u.h(capitalization, companion3.d())) {
                editorInfo.inputType |= 8192;
            } else if (u.h(capitalization, companion3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = o0.n(textFieldValue.getSelection());
        editorInfo.initialSelEnd = o0.i(textFieldValue.getSelection());
        androidx.core.view.inputmethod.e.j(editorInfo, textFieldValue.i());
        editorInfo.imeOptions |= 33554432;
    }
}
