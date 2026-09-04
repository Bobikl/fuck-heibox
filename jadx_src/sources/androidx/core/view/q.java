package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: LayoutInflaterCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21778a = "LayoutInflaterCompatHC";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f21779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f21780c;

    /* JADX INFO: compiled from: LayoutInflaterCompat.java */
    public static class a implements LayoutInflater.Factory2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final r f21781b;

        a(r rVar) {
            this.f21781b = rVar;
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.f21781b.onCreateView(view, str, context, attributeSet);
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.f21781b.onCreateView(null, str, context, attributeSet);
        }

        @androidx.annotation.n0
        public String toString() {
            return getClass().getName() + "{" + this.f21781b + z5.g.f141884d;
        }
    }

    private q() {
    }

    private static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f21780c) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f21779b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e(f21778a, "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e10);
            }
            f21780c = true;
        }
        Field field = f21779b;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e11) {
                Log.e(f21778a, "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e11);
            }
        }
    }

    @Deprecated
    public static r b(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof a) {
            return ((a) factory).f21781b;
        }
        return null;
    }

    @Deprecated
    public static void c(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.n0 r rVar) {
        layoutInflater.setFactory2(new a(rVar));
    }

    public static void d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.n0 LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }
}
