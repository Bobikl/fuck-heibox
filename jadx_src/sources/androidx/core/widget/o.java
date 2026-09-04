package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.n0;
import androidx.annotation.w0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PopupWindowCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21932a = "PopupWindowCompatApi21";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f21933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f21934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f21935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f21936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Field f21937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f21938g;

    /* JADX INFO: compiled from: PopupWindowCompat.java */
    @w0(19)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
            popupWindow.showAsDropDown(view, i10, i11, i12);
        }
    }

    /* JADX INFO: compiled from: PopupWindowCompat.java */
    @w0(23)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        @androidx.annotation.u
        static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        @androidx.annotation.u
        static void c(PopupWindow popupWindow, boolean z10) {
            popupWindow.setOverlapAnchor(z10);
        }

        @androidx.annotation.u
        static void d(PopupWindow popupWindow, int i10) {
            popupWindow.setWindowLayoutType(i10);
        }
    }

    private o() {
    }

    public static boolean a(@n0 PopupWindow popupWindow) {
        return b.a(popupWindow);
    }

    public static int b(@n0 PopupWindow popupWindow) {
        return b.b(popupWindow);
    }

    public static void c(@n0 PopupWindow popupWindow, boolean z10) {
        b.c(popupWindow, z10);
    }

    public static void d(@n0 PopupWindow popupWindow, int i10) {
        b.d(popupWindow, i10);
    }

    public static void e(@n0 PopupWindow popupWindow, @n0 View view, int i10, int i11, int i12) {
        a.a(popupWindow, view, i10, i11, i12);
    }
}
