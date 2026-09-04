package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f56319a;

    public r0(Context context) {
        this.f56319a = context;
    }

    private static String b(Locale locale) {
        return String.valueOf(locale.getLanguage()).concat(locale.getCountry().isEmpty() ? "" : lg.a.f131412e.concat(String.valueOf(locale.getCountry())));
    }

    public final List a() {
        Configuration configuration = this.f56319a.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT < 24) {
            return Collections.singletonList(b(configuration.locale));
        }
        LocaleList locales = configuration.getLocales();
        ArrayList arrayList = new ArrayList(locales.size());
        for (int i10 = 0; i10 < locales.size(); i10++) {
            arrayList.add(b(locales.get(i10)));
        }
        return arrayList;
    }
}
