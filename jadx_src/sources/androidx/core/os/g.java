package androidx.core.os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.w0;

/* JADX INFO: compiled from: ConfigurationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: compiled from: ConfigurationCompat.java */
    @w0(24)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    private g() {
    }

    @androidx.annotation.n0
    public static o a(@androidx.annotation.n0 Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? o.o(a.a(configuration)) : o.a(configuration.locale);
    }
}
