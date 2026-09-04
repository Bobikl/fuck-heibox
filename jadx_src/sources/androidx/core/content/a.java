package androidx.core.content;

import android.content.ContentProvider;
import android.content.Context;

/* JADX INFO: compiled from: ContentProviderCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private a() {
    }

    @androidx.annotation.n0
    public static Context a(@androidx.annotation.n0 ContentProvider contentProvider) {
        Context context = contentProvider.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Cannot find context from the provider.");
    }
}
