package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import androidx.annotation.e1;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.appcompat.R;

/* JADX INFO: compiled from: ContextThemeWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Configuration f1989f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources.Theme f1991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f1992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Configuration f1993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Resources f1994e;

    /* JADX INFO: compiled from: ContextThemeWrapper.java */
    @w0(17)
    public static class a {
        private a() {
        }

        @u
        static Context a(d dVar, Configuration configuration) {
            return dVar.createConfigurationContext(configuration);
        }
    }

    public d() {
        super(null);
    }

    public d(Context context, @e1 int i10) {
        super(context);
        this.f1990a = i10;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f1991b = theme;
    }

    private Resources b() {
        if (this.f1994e == null) {
            Configuration configuration = this.f1993d;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) {
                this.f1994e = super.getResources();
            } else {
                this.f1994e = a.a(this, this.f1993d).getResources();
            }
        }
        return this.f1994e;
    }

    private void d() {
        boolean z10 = this.f1991b == null;
        if (z10) {
            this.f1991b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1991b.setTo(theme);
            }
        }
        f(this.f1991b, this.f1990a, z10);
    }

    @w0(26)
    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f1989f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f1989f = configuration2;
        }
        return configuration.equals(f1989f);
    }

    public void a(Configuration configuration) {
        if (this.f1994e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f1993d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f1993d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f1990a;
    }

    protected void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1992c == null) {
            this.f1992c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1992c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1991b;
        if (theme != null) {
            return theme;
        }
        if (this.f1990a == 0) {
            this.f1990a = R.style.Theme_AppCompat_Light;
        }
        d();
        return this.f1991b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f1990a != i10) {
            this.f1990a = i10;
            d();
        }
    }
}
