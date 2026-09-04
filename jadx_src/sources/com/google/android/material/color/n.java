package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import androidx.annotation.n0;
import androidx.annotation.w0;
import com.google.android.material.R;
import java.util.Map;

/* JADX INFO: compiled from: ResourcesLoaderColorResourcesOverride.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(api = 30)
public class n implements d {

    /* JADX INFO: compiled from: ResourcesLoaderColorResourcesOverride.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final n f53764a = new n();

        private b() {
        }
    }

    private n() {
    }

    static d c() {
        return b.f53764a;
    }

    @Override // com.google.android.material.color.d
    @n0
    public Context a(Context context, Map<Integer, Integer> map) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.ThemeOverlay_Material3_PersonalizedColors);
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        return p.a(contextThemeWrapper, map) ? contextThemeWrapper : context;
    }

    @Override // com.google.android.material.color.d
    public boolean b(Context context, Map<Integer, Integer> map) {
        if (!p.a(context, map)) {
            return false;
        }
        q.a(context, R.style.ThemeOverlay_Material3_PersonalizedColors);
        return true;
    }
}
