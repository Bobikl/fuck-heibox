package androidx.core.content.res;

import android.content.res.Resources;
import androidx.annotation.n0;

/* JADX INFO: compiled from: ConfigurationHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    private e() {
    }

    public static int a(@n0 Resources resources) {
        return resources.getConfiguration().densityDpi;
    }
}
