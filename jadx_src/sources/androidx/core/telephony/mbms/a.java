package androidx.core.telephony.mbms;

import android.content.Context;
import android.os.Build;
import android.telephony.mbms.ServiceInfo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: MbmsHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: androidx.core.telephony.mbms.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MbmsHelper.java */
    @w0(28)
    public static class C0140a {
        private C0140a() {
        }

        static CharSequence a(Context context, ServiceInfo serviceInfo) {
            Set<Locale> namedContentLocales = serviceInfo.getNamedContentLocales();
            if (namedContentLocales.isEmpty()) {
                return null;
            }
            String[] strArr = new String[namedContentLocales.size()];
            int i10 = 0;
            Iterator<Locale> it = serviceInfo.getNamedContentLocales().iterator();
            while (it.hasNext()) {
                strArr[i10] = it.next().toLanguageTag();
                i10++;
            }
            Locale firstMatch = context.getResources().getConfiguration().getLocales().getFirstMatch(strArr);
            if (firstMatch == null) {
                return null;
            }
            return serviceInfo.getNameForLocale(firstMatch);
        }
    }

    private a() {
    }

    @p0
    public static CharSequence a(@n0 Context context, @n0 ServiceInfo serviceInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0140a.a(context, serviceInfo);
        }
        return null;
    }
}
