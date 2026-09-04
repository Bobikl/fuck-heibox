package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: EmojiKeyListener.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class e implements KeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KeyListener f23200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f23201b;

    /* JADX INFO: compiled from: EmojiKeyListener.java */
    public static class a {
        public boolean a(@n0 Editable editable, int i10, @n0 KeyEvent keyEvent) {
            return androidx.emoji2.text.f.h(editable, i10, keyEvent);
        }
    }

    e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    e(KeyListener keyListener, a aVar) {
        this.f23200a = keyListener;
        this.f23201b = aVar;
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f23200a.clearMetaKeyState(view, editable, i10);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f23200a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f23201b.a(editable, i10, keyEvent) || this.f23200a.onKeyDown(view, editable, i10, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f23200a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f23200a.onKeyUp(view, editable, i10, keyEvent);
    }
}
