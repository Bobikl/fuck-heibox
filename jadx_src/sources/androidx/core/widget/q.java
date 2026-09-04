package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.e1;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: TextViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21940a = "TextViewCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f21941b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21942c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Field f21943d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f21944e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Field f21945f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f21946g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Field f21947h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f21948i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Field f21949j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f21950k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f21951l = 1;

    /* JADX INFO: compiled from: TextViewCompat.java */
    @w0(16)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static boolean a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        @androidx.annotation.u
        static int b(TextView textView) {
            return textView.getMaxLines();
        }

        @androidx.annotation.u
        static int c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* JADX INFO: compiled from: TextViewCompat.java */
    @w0(17)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @androidx.annotation.u
        static int b(View view) {
            return view.getLayoutDirection();
        }

        @androidx.annotation.u
        static int c(View view) {
            return view.getTextDirection();
        }

        @androidx.annotation.u
        static Locale d(TextView textView) {
            return textView.getTextLocale();
        }

        @androidx.annotation.u
        static void e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        @androidx.annotation.u
        static void f(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        }

        @androidx.annotation.u
        static void g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @androidx.annotation.u
        static void h(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    /* JADX INFO: compiled from: TextViewCompat.java */
    @w0(23)
    public static class c {
        private c() {
        }

        @androidx.annotation.u
        static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        @androidx.annotation.u
        static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        @androidx.annotation.u
        static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        @androidx.annotation.u
        static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        @androidx.annotation.u
        static void e(TextView textView, int i10) {
            textView.setBreakStrategy(i10);
        }

        @androidx.annotation.u
        static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        @androidx.annotation.u
        static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        @androidx.annotation.u
        static void h(TextView textView, int i10) {
            textView.setHyphenationFrequency(i10);
        }
    }

    /* JADX INFO: compiled from: TextViewCompat.java */
    @w0(24)
    public static class d {
        private d() {
        }

        @androidx.annotation.u
        static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* JADX INFO: compiled from: TextViewCompat.java */
    @w0(26)
    public static class e {
        private e() {
        }

        @androidx.annotation.u
        static int a(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        @androidx.annotation.u
        static int b(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        @androidx.annotation.u
        static int c(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @androidx.annotation.u
        static int[] d(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }

        @androidx.annotation.u
        static int e(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        @androidx.annotation.u
        static void f(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @androidx.annotation.u
        static void g(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @androidx.annotation.u
        static void h(TextView textView, int i10) {
            textView.setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    /* JADX INFO: compiled from: TextViewCompat.java */
    @w0(28)
    public static class f {
        private f() {
        }

        @androidx.annotation.u
        static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        @androidx.annotation.u
        static PrecomputedText.Params b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        @androidx.annotation.u
        static void c(TextView textView, int i10) {
            textView.setFirstBaselineToTopHeight(i10);
        }
    }

    /* JADX INFO: compiled from: TextViewCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface g {
    }

    /* JADX INFO: compiled from: TextViewCompat.java */
    @w0(26)
    public static class h implements ActionMode.Callback {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f21952g = 100;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ActionMode.Callback f21953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextView f21954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Class<?> f21955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Method f21956d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f21957e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f21958f = false;

        h(ActionMode.Callback callback, TextView textView) {
            this.f21953a = callback;
            this.f21954b = textView;
        }

        private Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent intentPutExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        private List<ResolveInfo> c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(a(), 0)) {
                if (f(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        private boolean e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private boolean f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        private void g(Menu menu) {
            Context context = this.f21954b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f21958f) {
                this.f21958f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f21955c = cls;
                    this.f21956d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f21957e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f21955c = null;
                    this.f21956d = null;
                    this.f21957e = false;
                }
            }
            try {
                Method declaredMethod = (this.f21957e && this.f21955c.isInstance(menu)) ? this.f21956d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> listC = c(context, packageManager);
                for (int i10 = 0; i10 < listC.size(); i10++) {
                    ResolveInfo resolveInfo = listC.get(i10);
                    menu.add(0, 0, i10 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f21954b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @n0
        ActionMode.Callback d() {
            return this.f21953a;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f21953a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f21953a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f21953a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            g(menu);
            return this.f21953a.onPrepareActionMode(actionMode, menu);
        }
    }

    private q() {
    }

    public static void A(@n0 TextView textView, @f0(from = 0) @t0 int i10) {
        androidx.core.util.o.i(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            f.c(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = a.a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void B(@n0 TextView textView, @f0(from = 0) @t0 int i10) {
        androidx.core.util.o.i(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = a.a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static void C(@n0 TextView textView, @f0(from = 0) @t0 int i10) {
        androidx.core.util.o.i(i10);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i10 != fontMetricsInt) {
            textView.setLineSpacing(i10 - fontMetricsInt, 1.0f);
        }
    }

    public static void D(@n0 TextView textView, @n0 androidx.core.text.l lVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(lVar.f());
        } else {
            if (!o(textView).a(lVar.e())) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            textView.setText(lVar);
        }
    }

    public static void E(@n0 TextView textView, @e1 int i10) {
        textView.setTextAppearance(i10);
    }

    public static void F(@n0 TextView textView, @n0 androidx.core.text.l.a aVar) {
        b.h(textView, m(aVar.d()));
        textView.getPaint().set(aVar.e());
        c.e(textView, aVar.b());
        c.h(textView, aVar.c());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @p0
    public static ActionMode.Callback G(@p0 ActionMode.Callback callback) {
        return (!(callback instanceof h) || Build.VERSION.SDK_INT < 26) ? callback : ((h) callback).d();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @p0
    public static ActionMode.Callback H(@n0 TextView textView, @p0 ActionMode.Callback callback) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof h) || callback == null) ? callback : new h(callback, textView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int a(@n0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.a(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(@n0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.b(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int c(@n0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.c(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n0
    public static int[] d(@n0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.d(textView);
        }
        return textView instanceof androidx.core.widget.b ? ((androidx.core.widget.b) textView).getAutoSizeTextAvailableSizes() : new int[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int e(@n0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.e(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeTextType();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p0
    public static ColorStateList f(@n0 TextView textView) {
        androidx.core.util.o.l(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            return c.b(textView);
        }
        if (textView instanceof c0) {
            return ((c0) textView).getSupportCompoundDrawablesTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p0
    public static PorterDuff.Mode g(@n0 TextView textView) {
        androidx.core.util.o.l(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            return c.c(textView);
        }
        if (textView instanceof c0) {
            return ((c0) textView).getSupportCompoundDrawablesTintMode();
        }
        return null;
    }

    @n0
    public static Drawable[] h(@n0 TextView textView) {
        return b.a(textView);
    }

    public static int i(@n0 TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int j(@n0 TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int k(@n0 TextView textView) {
        return a.b(textView);
    }

    public static int l(@n0 TextView textView) {
        return a.c(textView);
    }

    @w0(18)
    private static int m(@n0 TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    @w0(18)
    private static TextDirectionHeuristic n(@n0 TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(f.a(d.a(b.d(textView)))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z10 = b.b(textView) == 1;
        switch (b.c(textView)) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                return z10 ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    @n0
    public static androidx.core.text.l.a o(@n0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new androidx.core.text.l.a(f.b(textView));
        }
        androidx.core.text.l.a.C0142a c0142a = new androidx.core.text.l.a.C0142a(new TextPaint(textView.getPaint()));
        c0142a.b(c.a(textView));
        c0142a.c(c.d(textView));
        c0142a.d(n(textView));
        return c0142a.a();
    }

    private static Field p(String str) {
        Field declaredField = null;
        try {
            declaredField = TextView.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException unused) {
            Log.e(f21940a, "Could not retrieve " + str + " field.");
            return declaredField;
        }
    }

    private static int q(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            Log.d(f21940a, "Could not retrieve value of " + field.getName() + " field.");
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void r(@n0 TextView textView, int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            e.f(textView, i10, i11, i12, i13);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void s(@n0 TextView textView, @n0 int[] iArr, int i10) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            e.g(textView, iArr, i10);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t(@n0 TextView textView, int i10) {
        if (Build.VERSION.SDK_INT >= 27) {
            e.h(textView, i10);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void u(@n0 TextView textView, @p0 ColorStateList colorStateList) {
        androidx.core.util.o.l(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            c.f(textView, colorStateList);
        } else if (textView instanceof c0) {
            ((c0) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void v(@n0 TextView textView, @p0 PorterDuff.Mode mode) {
        androidx.core.util.o.l(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            c.g(textView, mode);
        } else if (textView instanceof c0) {
            ((c0) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void w(@n0 TextView textView, @p0 Drawable drawable, @p0 Drawable drawable2, @p0 Drawable drawable3, @p0 Drawable drawable4) {
        b.e(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static void x(@n0 TextView textView, @androidx.annotation.v int i10, @androidx.annotation.v int i11, @androidx.annotation.v int i12, @androidx.annotation.v int i13) {
        b.f(textView, i10, i11, i12, i13);
    }

    public static void y(@n0 TextView textView, @p0 Drawable drawable, @p0 Drawable drawable2, @p0 Drawable drawable3, @p0 Drawable drawable4) {
        b.g(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static void z(@n0 TextView textView, @n0 ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(H(textView, callback));
    }
}
