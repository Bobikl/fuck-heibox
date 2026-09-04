package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: TooltipCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class b1 {

    /* JADX INFO: compiled from: TooltipCompat.java */
    @androidx.annotation.w0(26)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    private b1() {
    }

    public static void a(@androidx.annotation.n0 View view, @androidx.annotation.p0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
        } else {
            e1.h(view, charSequence);
        }
    }
}
