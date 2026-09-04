package com.google.android.exoplayer2.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: compiled from: SubtitleViewUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public final class t0 {
    private t0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c(Object obj) {
        return !(obj instanceof s8.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static void e(com.google.android.exoplayer2.text.b.c cVar) {
        cVar.b();
        if (cVar.k() instanceof Spanned) {
            if (!(cVar.k() instanceof Spannable)) {
                cVar.A(SpannableString.valueOf(cVar.k()));
            }
            g((Spannable) com.google.android.exoplayer2.util.a.g(cVar.k()), new com.google.common.base.x() { // from class: com.google.android.exoplayer2.ui.s0
                @Override // com.google.common.base.x
                public final boolean apply(Object obj) {
                    return t0.c(obj);
                }
            });
        }
        f(cVar);
    }

    public static void f(com.google.android.exoplayer2.text.b.c cVar) {
        cVar.C(-3.4028235E38f, Integer.MIN_VALUE);
        if (cVar.k() instanceof Spanned) {
            if (!(cVar.k() instanceof Spannable)) {
                cVar.A(SpannableString.valueOf(cVar.k()));
            }
            g((Spannable) com.google.android.exoplayer2.util.a.g(cVar.k()), new com.google.common.base.x() { // from class: com.google.android.exoplayer2.ui.r0
                @Override // com.google.common.base.x
                public final boolean apply(Object obj) {
                    return t0.d(obj);
                }
            });
        }
    }

    private static void g(Spannable spannable, com.google.common.base.x<Object> xVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (xVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float h(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f10;
            }
            f11 = i11;
        }
        return f10 * f11;
    }
}
