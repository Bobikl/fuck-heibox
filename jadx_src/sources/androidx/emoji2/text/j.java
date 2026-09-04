package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.annotation.RestrictTo;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.util.Arrays;

/* JADX INFO: compiled from: EmojiProcessor.java */
/* JADX INFO: loaded from: classes6.dex */
@androidx.annotation.d
@w0(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f23117f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f23118g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f23119h = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final f.l f23120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final p f23121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private f.e f23122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f23123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final int[] f23124e;

    /* JADX INFO: compiled from: EmojiProcessor.java */
    @w0(19)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int f23125a = -1;

        private a() {
        }

        static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        return z10 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z10 = true;
                    }
                }
                return i10;
            }
        }

        static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (i10 >= length) {
                        if (z10) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                        i10++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                        i10++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i10++;
                        z10 = true;
                    }
                }
                return i10;
            }
        }
    }

    /* JADX INFO: compiled from: EmojiProcessor.java */
    public static final class b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f23126i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f23127j = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23128a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p.a f23129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p.a f23130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p.a f23131d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f23132e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f23133f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f23134g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int[] f23135h;

        b(p.a aVar, boolean z10, int[] iArr) {
            this.f23129b = aVar;
            this.f23130c = aVar;
            this.f23134g = z10;
            this.f23135h = iArr;
        }

        private static boolean d(int i10) {
            return i10 == 65039;
        }

        private static boolean f(int i10) {
            return i10 == 65038;
        }

        private int g() {
            this.f23128a = 1;
            this.f23130c = this.f23129b;
            this.f23133f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f23130c.b().l() || d(this.f23132e)) {
                return true;
            }
            if (this.f23134g) {
                if (this.f23135h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f23135h, this.f23130c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i10) {
            p.a aVarA = this.f23130c.a(i10);
            int iG = 3;
            if (this.f23128a == 2) {
                if (aVarA != null) {
                    this.f23130c = aVarA;
                    this.f23133f++;
                } else if (f(i10)) {
                    iG = g();
                } else if (!d(i10)) {
                    if (this.f23130c.b() == null) {
                        iG = g();
                    } else if (this.f23133f != 1 || h()) {
                        this.f23131d = this.f23130c;
                        g();
                    } else {
                        iG = g();
                    }
                }
                iG = 2;
            } else if (aVarA == null) {
                iG = g();
            } else {
                this.f23128a = 2;
                this.f23130c = aVarA;
                this.f23133f = 1;
                iG = 2;
            }
            this.f23132e = i10;
            return iG;
        }

        i b() {
            return this.f23130c.b();
        }

        i c() {
            return this.f23131d.b();
        }

        boolean e() {
            return this.f23128a == 2 && this.f23130c.b() != null && (this.f23133f > 1 || h());
        }
    }

    j(@n0 p pVar, @n0 f.l lVar, @n0 f.e eVar, boolean z10, @p0 int[] iArr) {
        this.f23120a = lVar;
        this.f23121b = pVar;
        this.f23122c = eVar;
        this.f23123d = z10;
        this.f23124e = iArr;
    }

    private void a(@n0 Spannable spannable, i iVar, int i10, int i11) {
        spannable.setSpan(this.f23120a.a(iVar), i10, i11, 33);
    }

    private static boolean b(@n0 Editable editable, @n0 KeyEvent keyEvent, boolean z10) {
        k[] kVarArr;
        if (i(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!h(selectionStart, selectionEnd) && (kVarArr = (k[]) editable.getSpans(selectionStart, selectionEnd, k.class)) != null && kVarArr.length > 0) {
            for (k kVar : kVarArr) {
                int spanStart = editable.getSpanStart(kVar);
                int spanEnd = editable.getSpanEnd(kVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean e(@n0 InputConnection inputConnection, @n0 Editable editable, @f0(from = 0) int i10, @f0(from = 0) int i11, boolean z10) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (h(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                iMax = a.a(editable, selectionStart, Math.max(i10, 0));
                iMin = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i10, 0);
                iMin = Math.min(selectionEnd + i11, editable.length());
            }
            k[] kVarArr = (k[]) editable.getSpans(iMax, iMin, k.class);
            if (kVarArr != null && kVarArr.length > 0) {
                for (k kVar : kVarArr) {
                    int spanStart = editable.getSpanStart(kVar);
                    int spanEnd = editable.getSpanEnd(kVar);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean f(@n0 Editable editable, int i10, @n0 KeyEvent keyEvent) {
        boolean zB;
        if (i10 != 67) {
            zB = i10 != 112 ? false : b(editable, keyEvent, true);
        } else {
            zB = b(editable, keyEvent, false);
        }
        if (!zB) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean g(CharSequence charSequence, int i10, int i11, i iVar) {
        if (iVar.e() == 0) {
            iVar.n(this.f23122c.a(charSequence, i10, i11, iVar.i()));
        }
        return iVar.e() == 2;
    }

    private static boolean h(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    private static boolean i(@n0 KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    int c(@n0 CharSequence charSequence) {
        return d(charSequence, this.f23121b.h());
    }

    int d(@n0 CharSequence charSequence, int i10) {
        b bVar = new b(this.f23121b.i(), this.f23123d, this.f23124e);
        int length = charSequence.length();
        int iCharCount = 0;
        int i11 = 0;
        int i12 = 0;
        while (iCharCount < length) {
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            int iA = bVar.a(iCodePointAt);
            i iVarB = bVar.b();
            if (iA == 1) {
                iCharCount += Character.charCount(iCodePointAt);
                i12 = 0;
            } else if (iA == 2) {
                iCharCount += Character.charCount(iCodePointAt);
            } else if (iA == 3) {
                iVarB = bVar.c();
                if (iVarB.d() <= i10) {
                    i11++;
                }
            }
            if (iVarB != null && iVarB.d() <= i10) {
                i12++;
            }
        }
        if (i11 != 0) {
            return 2;
        }
        if (!bVar.e() || bVar.b().d() > i10) {
            return i12 == 0 ? 0 : 2;
        }
        return 1;
    }

    CharSequence j(@n0 CharSequence charSequence, @f0(from = 0) int i10, @f0(from = 0) int i11, @f0(from = 0) int i12, boolean z10) {
        int iCharCount;
        k[] kVarArr;
        boolean z11 = charSequence instanceof q;
        if (z11) {
            ((q) charSequence).a();
        }
        u uVar = null;
        if (z11) {
            uVar = new u((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    uVar = new u((Spannable) charSequence);
                } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i10 - 1, i11 + 1, k.class) <= i11) {
                    uVar = new u(charSequence);
                }
            } finally {
                if (z11) {
                    ((q) charSequence).d();
                }
            }
        }
        if (uVar != null && (kVarArr = (k[]) uVar.getSpans(i10, i11, k.class)) != null && kVarArr.length > 0) {
            for (k kVar : kVarArr) {
                int spanStart = uVar.getSpanStart(kVar);
                int spanEnd = uVar.getSpanEnd(kVar);
                if (spanStart != i11) {
                    uVar.removeSpan(kVar);
                }
                i10 = Math.min(spanStart, i10);
                i11 = Math.max(spanEnd, i11);
            }
        }
        if (i10 != i11 && i10 < charSequence.length()) {
            if (i12 != Integer.MAX_VALUE && uVar != null) {
                i12 -= ((k[]) uVar.getSpans(0, uVar.length(), k.class)).length;
            }
            b bVar = new b(this.f23121b.i(), this.f23123d, this.f23124e);
            int iCodePointAt = Character.codePointAt(charSequence, i10);
            int i13 = 0;
            u uVar2 = uVar;
            loop1: while (true) {
                iCharCount = i10;
                while (true) {
                    if (i10 >= i11 || i13 >= i12) {
                        break loop1;
                    }
                    int iA = bVar.a(iCodePointAt);
                    if (iA == 1) {
                        iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                        if (iCharCount < i11) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        }
                        i10 = iCharCount;
                    } else if (iA == 2) {
                        i10 += Character.charCount(iCodePointAt);
                        if (i10 < i11) {
                            iCodePointAt = Character.codePointAt(charSequence, i10);
                        }
                    } else if (iA != 3) {
                    }
                }
                if (z10 || !g(charSequence, iCharCount, i10, bVar.c())) {
                    if (uVar2 == null) {
                        uVar2 = new u((Spannable) new SpannableString(charSequence));
                    }
                    a(uVar2, bVar.c(), iCharCount, i10);
                    i13++;
                }
            }
            if (bVar.e() && i13 < i12 && (z10 || !g(charSequence, iCharCount, i10, bVar.b()))) {
                if (uVar2 == null) {
                    uVar2 = new u(charSequence);
                }
                a(uVar2, bVar.b(), iCharCount, i10);
            }
            return uVar2 != null ? uVar2.b() : charSequence;
        }
        return charSequence;
    }
}
