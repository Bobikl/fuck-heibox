package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: TintContextWrapper.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class u0 extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f2936c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ArrayList<WeakReference<u0>> f2937d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f2938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources.Theme f2939b;

    private u0(@androidx.annotation.n0 Context context) {
        super(context);
        if (!g1.d()) {
            this.f2938a = new w0(this, context.getResources());
            this.f2939b = null;
            return;
        }
        g1 g1Var = new g1(this, context.getResources());
        this.f2938a = g1Var;
        Resources.Theme themeNewTheme = g1Var.newTheme();
        this.f2939b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(@androidx.annotation.n0 Context context) {
        return ((context instanceof u0) || (context.getResources() instanceof w0) || (context.getResources() instanceof g1) || !g1.d()) ? false : true;
    }

    public static Context b(@androidx.annotation.n0 Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f2936c) {
            ArrayList<WeakReference<u0>> arrayList = f2937d;
            if (arrayList == null) {
                f2937d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<u0> weakReference = f2937d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f2937d.remove(size);
                    }
                }
                for (int size2 = f2937d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<u0> weakReference2 = f2937d.get(size2);
                    u0 u0Var = weakReference2 != null ? weakReference2.get() : null;
                    if (u0Var != null && u0Var.getBaseContext() == context) {
                        return u0Var;
                    }
                }
            }
            u0 u0Var2 = new u0(context);
            f2937d.add(new WeakReference<>(u0Var2));
            return u0Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f2938a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f2938a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2939b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f2939b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
