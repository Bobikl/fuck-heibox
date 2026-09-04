package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.view.a1;

/* JADX INFO: compiled from: TextViewOnReceiveContentListener.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class z implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21959a = "ReceiveContent";

    /* JADX INFO: compiled from: TextViewOnReceiveContentListener.java */
    @w0(16)
    public static final class a {
        private a() {
        }

        static CharSequence a(@n0 Context context, @n0 ClipData.Item item, int i10) {
            if ((i10 & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence charSequenceCoerceToText = item.coerceToText(context);
            return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
        }
    }

    /* JADX INFO: compiled from: TextViewOnReceiveContentListener.java */
    public static final class b {
        private b() {
        }

        static CharSequence a(@n0 Context context, @n0 ClipData.Item item, int i10) {
            CharSequence charSequenceCoerceToText = item.coerceToText(context);
            return ((i10 & 1) == 0 || !(charSequenceCoerceToText instanceof Spanned)) ? charSequenceCoerceToText : charSequenceCoerceToText.toString();
        }
    }

    private static CharSequence b(@n0 Context context, @n0 ClipData.Item item, int i10) {
        return a.a(context, item, i10);
    }

    private static void c(@n0 Editable editable, @n0 CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    @Override // androidx.core.view.a1
    @p0
    public androidx.core.view.e a(@n0 View view, @n0 androidx.core.view.e eVar) {
        if (Log.isLoggable(f21959a, 3)) {
            Log.d(f21959a, "onReceive: " + eVar);
        }
        if (eVar.g() == 2) {
            return eVar;
        }
        ClipData clipDataC = eVar.c();
        int iE = eVar.e();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z10 = false;
        for (int i10 = 0; i10 < clipDataC.getItemCount(); i10++) {
            CharSequence charSequenceB = b(context, clipDataC.getItemAt(i10), iE);
            if (charSequenceB != null) {
                if (z10) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceB);
                } else {
                    c(editable, charSequenceB);
                    z10 = true;
                }
            }
        }
        return null;
    }
}
