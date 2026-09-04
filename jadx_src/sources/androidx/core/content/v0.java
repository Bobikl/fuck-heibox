package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import kotlin.b2;

/* JADX INFO: compiled from: SharedPreferences.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {
    @SuppressLint({"ApplySharedPref"})
    public static final void a(@dl.d SharedPreferences sharedPreferences, boolean z10, @dl.d yh.l<? super SharedPreferences.Editor, b2> action) {
        kotlin.jvm.internal.f0.p(sharedPreferences, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        SharedPreferences.Editor editor = sharedPreferences.edit();
        kotlin.jvm.internal.f0.o(editor, "editor");
        action.invoke(editor);
        if (z10) {
            editor.commit();
        } else {
            editor.apply();
        }
    }

    public static /* synthetic */ void b(SharedPreferences sharedPreferences, boolean z10, yh.l action, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        kotlin.jvm.internal.f0.p(sharedPreferences, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        SharedPreferences.Editor editor = sharedPreferences.edit();
        kotlin.jvm.internal.f0.o(editor, "editor");
        action.invoke(editor);
        if (z10) {
            editor.commit();
        } else {
            editor.apply();
        }
    }
}
