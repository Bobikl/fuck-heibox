package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.RestrictTo;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.util.o;

/* JADX INFO: compiled from: EmojiEditTextHelper.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f23186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23188c;

    /* JADX INFO: renamed from: androidx.emoji2.viewsintegration.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EmojiEditTextHelper.java */
    @w0(19)
    public static class C0167a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EditText f23189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f23190b;

        C0167a(@n0 EditText editText, boolean z10) {
            this.f23189a = editText;
            g gVar = new g(editText, z10);
            this.f23190b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(androidx.emoji2.viewsintegration.b.getInstance());
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        KeyListener a(@p0 KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        boolean b() {
            return this.f23190b.d();
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        InputConnection c(@n0 InputConnection inputConnection, @n0 EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f23189a, inputConnection, editorInfo);
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        void d(int i10) {
            this.f23190b.f(i10);
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        void e(boolean z10) {
            this.f23190b.g(z10);
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        void f(int i10) {
            this.f23190b.h(i10);
        }
    }

    /* JADX INFO: compiled from: EmojiEditTextHelper.java */
    public static class b {
        b() {
        }

        @p0
        KeyListener a(@p0 KeyListener keyListener) {
            return keyListener;
        }

        boolean b() {
            return false;
        }

        InputConnection c(@n0 InputConnection inputConnection, @n0 EditorInfo editorInfo) {
            return inputConnection;
        }

        void d(int i10) {
        }

        void e(boolean z10) {
        }

        void f(int i10) {
        }
    }

    public a(@n0 EditText editText) {
        this(editText, true);
    }

    public a(@n0 EditText editText, boolean z10) {
        this.f23187b = Integer.MAX_VALUE;
        this.f23188c = 0;
        o.m(editText, "editText cannot be null");
        this.f23186a = new C0167a(editText, z10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int a() {
        return this.f23188c;
    }

    @p0
    public KeyListener b(@p0 KeyListener keyListener) {
        return this.f23186a.a(keyListener);
    }

    public int c() {
        return this.f23187b;
    }

    public boolean d() {
        return this.f23186a.b();
    }

    @p0
    public InputConnection e(@p0 InputConnection inputConnection, @n0 EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f23186a.c(inputConnection, editorInfo);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void f(int i10) {
        this.f23188c = i10;
        this.f23186a.d(i10);
    }

    public void g(boolean z10) {
        this.f23186a.e(z10);
    }

    public void h(@f0(from = 0) int i10) {
        o.j(i10, "maxEmojiCount should be greater than 0");
        this.f23187b = i10;
        this.f23186a.f(i10);
    }
}
