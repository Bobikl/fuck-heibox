package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: EmojiInputConnection.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class c extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f23194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f23195b;

    /* JADX INFO: compiled from: EmojiInputConnection.java */
    public static class a {
        public boolean a(@n0 InputConnection inputConnection, @n0 Editable editable, @f0(from = 0) int i10, @f0(from = 0) int i11, boolean z10) {
            return androidx.emoji2.text.f.g(inputConnection, editable, i10, i11, z10);
        }

        public void b(@n0 EditorInfo editorInfo) {
            if (androidx.emoji2.text.f.n()) {
                androidx.emoji2.text.f.b().D(editorInfo);
            }
        }
    }

    c(@n0 TextView textView, @n0 InputConnection inputConnection, @n0 EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    c(@n0 TextView textView, @n0 InputConnection inputConnection, @n0 EditorInfo editorInfo, @n0 a aVar) {
        super(inputConnection, false);
        this.f23194a = textView;
        this.f23195b = aVar;
        aVar.b(editorInfo);
    }

    private Editable a() {
        return this.f23194a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        return this.f23195b.a(this, a(), i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return this.f23195b.a(this, a(), i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }
}
