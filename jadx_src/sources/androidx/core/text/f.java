package androidx.core.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;

/* JADX INFO: compiled from: HtmlCompat.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21126a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f21127b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21128c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21129d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f21130e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f21131f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f21132g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f21133h = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f21134i = 256;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f21135j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f21136k = 63;

    /* JADX INFO: compiled from: HtmlCompat.java */
    @w0(24)
    public static class a {
        private a() {
        }

        @u
        static Spanned a(String str, int i10) {
            return Html.fromHtml(str, i10);
        }

        @u
        static Spanned b(String str, int i10, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i10, imageGetter, tagHandler);
        }

        @u
        static String c(Spanned spanned, int i10) {
            return Html.toHtml(spanned, i10);
        }
    }

    private f() {
    }

    @n0
    public static Spanned a(@n0 String str, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? a.a(str, i10) : Html.fromHtml(str);
    }

    @n0
    public static Spanned b(@n0 String str, int i10, @p0 Html.ImageGetter imageGetter, @p0 Html.TagHandler tagHandler) {
        return Build.VERSION.SDK_INT >= 24 ? a.b(str, i10, imageGetter, tagHandler) : Html.fromHtml(str, imageGetter, tagHandler);
    }

    @n0
    public static String c(@n0 Spanned spanned, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? a.c(spanned, i10) : Html.toHtml(spanned);
    }
}
