package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.util.o;

/* JADX INFO: compiled from: EditorInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21546a = 16777216;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f21547b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f21548c = new String[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f21549d = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f21550e = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f21551f = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f21552g = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f21553h = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @j1
    static final int f21554i = 2048;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @j1
    static final int f21555j = 1024;

    /* JADX INFO: compiled from: EditorInfoCompat.java */
    @w0(30)
    public static class a {
        private a() {
        }

        static CharSequence a(@n0 EditorInfo editorInfo, int i10) {
            return editorInfo.getInitialSelectedText(i10);
        }

        static CharSequence b(@n0 EditorInfo editorInfo, int i10, int i11) {
            return editorInfo.getInitialTextAfterCursor(i10, i11);
        }

        static CharSequence c(@n0 EditorInfo editorInfo, int i10, int i11) {
            return editorInfo.getInitialTextBeforeCursor(i10, i11);
        }

        static void d(@n0 EditorInfo editorInfo, CharSequence charSequence, int i10) {
            editorInfo.setInitialSurroundingSubText(charSequence, i10);
        }
    }

    @Deprecated
    public e() {
    }

    @n0
    public static String[] a(@n0 EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f21548c;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f21548c;
        }
        String[] stringArray = bundle.getStringArray(f21549d);
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray(f21550e);
        }
        return stringArray != null ? stringArray : f21548c;
    }

    @p0
    public static CharSequence b(@n0 EditorInfo editorInfo, int i10) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.a(editorInfo, i10);
        }
        if (editorInfo.extras == null) {
            return null;
        }
        int iMin = Math.min(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int iMax = Math.max(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int i11 = editorInfo.extras.getInt(f21552g);
        int i12 = editorInfo.extras.getInt(f21553h);
        int i13 = iMax - iMin;
        if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || i12 - i11 != i13 || (charSequence = editorInfo.extras.getCharSequence(f21551f)) == null) {
            return null;
        }
        return (i10 & 1) != 0 ? charSequence.subSequence(i11, i12) : TextUtils.substring(charSequence, i11, i12);
    }

    @p0
    public static CharSequence c(@n0 EditorInfo editorInfo, int i10, int i11) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.b(editorInfo, i10, i11);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f21551f)) == null) {
            return null;
        }
        int i12 = editorInfo.extras.getInt(f21553h);
        int iMin = Math.min(i10, charSequence.length() - i12);
        return (i11 & 1) != 0 ? charSequence.subSequence(i12, iMin + i12) : TextUtils.substring(charSequence, i12, iMin + i12);
    }

    @p0
    public static CharSequence d(@n0 EditorInfo editorInfo, int i10, int i11) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.c(editorInfo, i10, i11);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f21551f)) == null) {
            return null;
        }
        int i12 = editorInfo.extras.getInt(f21552g);
        int iMin = Math.min(i10, i12);
        return (i11 & 1) != 0 ? charSequence.subSequence(i12 - iMin, i12) : TextUtils.substring(charSequence, i12 - iMin, i12);
    }

    static int e(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            return 1;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return 0;
        }
        boolean zContainsKey = bundle.containsKey(f21549d);
        boolean zContainsKey2 = editorInfo.extras.containsKey(f21550e);
        if (zContainsKey && zContainsKey2) {
            return 4;
        }
        if (zContainsKey) {
            return 3;
        }
        return zContainsKey2 ? 2 : 0;
    }

    private static boolean f(CharSequence charSequence, int i10, int i11) {
        if (i11 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i10));
        }
        if (i11 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i10));
    }

    private static boolean g(int i10) {
        int i11 = i10 & 4095;
        return i11 == 129 || i11 == 225 || i11 == 18;
    }

    public static void h(@n0 EditorInfo editorInfo, @p0 String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray(f21549d, strArr);
        editorInfo.extras.putStringArray(f21550e, strArr);
    }

    public static void i(@n0 EditorInfo editorInfo, @n0 CharSequence charSequence, int i10) {
        o.l(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.d(editorInfo, charSequence, i10);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 - i10 : i11 - i10;
        int i14 = i11 > i12 ? i11 - i10 : i12 - i10;
        int length = charSequence.length();
        if (i10 < 0 || i13 < 0 || i14 > length) {
            k(editorInfo, null, 0, 0);
            return;
        }
        if (g(editorInfo.inputType)) {
            k(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            k(editorInfo, charSequence, i13, i14);
        } else {
            l(editorInfo, charSequence, i13, i14);
        }
    }

    public static void j(@n0 EditorInfo editorInfo, @n0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.d(editorInfo, charSequence, 0);
        } else {
            i(editorInfo, charSequence, 0);
        }
    }

    private static void k(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence(f21551f, charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt(f21552g, i10);
        editorInfo.extras.putInt(f21553h, i11);
    }

    private static void l(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        int i12 = i11 - i10;
        int i13 = i12 > 1024 ? 0 : i12;
        int i14 = 2048 - i13;
        int iMin = Math.min(charSequence.length() - i11, i14 - Math.min(i10, (int) (((double) i14) * 0.8d)));
        int iMin2 = Math.min(i10, i14 - iMin);
        int i15 = i10 - iMin2;
        if (f(charSequence, i15, 0)) {
            i15++;
            iMin2--;
        }
        if (f(charSequence, (i11 + iMin) - 1, 1)) {
            iMin--;
        }
        CharSequence charSequenceConcat = i13 != i12 ? TextUtils.concat(charSequence.subSequence(i15, i15 + iMin2), charSequence.subSequence(i11, iMin + i11)) : charSequence.subSequence(i15, iMin2 + i13 + iMin + i15);
        int i16 = iMin2 + 0;
        k(editorInfo, charSequenceConcat, i16, i13 + i16);
    }
}
