package io.flutter.plugin.localization;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.constraintlayout.core.motion.utils.w;
import com.xiaomi.mipush.sdk.Constants;
import io.flutter.embedding.engine.systemchannels.LocalizationChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class LocalizationPlugin {

    @n0
    private final Context context;

    @n0
    private final LocalizationChannel localizationChannel;

    @j1
    @SuppressLint({"AppBundleLocaleChanges", "DiscouragedApi"})
    final LocalizationChannel.LocalizationMessageHandler localizationMessageHandler;

    public LocalizationPlugin(@n0 Context context, @n0 LocalizationChannel localizationChannel) {
        LocalizationChannel.LocalizationMessageHandler localizationMessageHandler = new LocalizationChannel.LocalizationMessageHandler() { // from class: io.flutter.plugin.localization.LocalizationPlugin.1
            @Override // io.flutter.embedding.engine.systemchannels.LocalizationChannel.LocalizationMessageHandler
            public String getStringResource(@n0 String str, @p0 String str2) {
                Context contextCreateConfigurationContext = LocalizationPlugin.this.context;
                if (str2 != null) {
                    Locale localeLocaleFromString = LocalizationPlugin.localeFromString(str2);
                    Configuration configuration = new Configuration(LocalizationPlugin.this.context.getResources().getConfiguration());
                    configuration.setLocale(localeLocaleFromString);
                    contextCreateConfigurationContext = LocalizationPlugin.this.context.createConfigurationContext(configuration);
                }
                int identifier = contextCreateConfigurationContext.getResources().getIdentifier(str, w.b.f17895e, LocalizationPlugin.this.context.getPackageName());
                if (identifier != 0) {
                    return contextCreateConfigurationContext.getResources().getString(identifier);
                }
                return null;
            }
        };
        this.localizationMessageHandler = localizationMessageHandler;
        this.context = context;
        this.localizationChannel = localizationChannel;
        localizationChannel.setLocalizationMessageHandler(localizationMessageHandler);
    }

    @n0
    public static Locale localeFromString(@n0 String str) {
        String str2;
        String[] strArrSplit = str.replace('_', '-').split(Constants.ACCEPT_TIME_SEPARATOR_SERVER, -1);
        String str3 = strArrSplit[0];
        String str4 = "";
        int i10 = 1;
        if (strArrSplit.length <= 1 || strArrSplit[1].length() != 4) {
            str2 = "";
        } else {
            str2 = strArrSplit[1];
            i10 = 2;
        }
        if (strArrSplit.length > i10 && strArrSplit[i10].length() >= 2 && strArrSplit[i10].length() <= 3) {
            str4 = strArrSplit[i10];
        }
        return new Locale(str3, str4, str2);
    }

    @p0
    public Locale resolveNativeLocale(@p0 List<Locale> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            ArrayList arrayList = new ArrayList();
            LocaleList locales = this.context.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i11 = 0; i11 < size; i11++) {
                Locale locale = locales.get(i11);
                String language = locale.getLanguage();
                if (!locale.getScript().isEmpty()) {
                    language = language + Constants.ACCEPT_TIME_SEPARATOR_SERVER + locale.getScript();
                }
                if (!locale.getCountry().isEmpty()) {
                    language = language + Constants.ACCEPT_TIME_SEPARATOR_SERVER + locale.getCountry();
                }
                arrayList.add(new Locale.LanguageRange(language));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage()));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage() + "-*"));
            }
            Locale localeLookup = Locale.lookup(arrayList, list);
            return localeLookup != null ? localeLookup : list.get(0);
        }
        if (i10 < 24) {
            Locale locale2 = this.context.getResources().getConfiguration().locale;
            if (locale2 != null) {
                for (Locale locale3 : list) {
                    if (locale2.equals(locale3)) {
                        return locale3;
                    }
                }
                for (Locale locale4 : list) {
                    if (locale2.getLanguage().equals(locale4.toString())) {
                        return locale4;
                    }
                }
            }
            return list.get(0);
        }
        LocaleList locales2 = this.context.getResources().getConfiguration().getLocales();
        for (int i12 = 0; i12 < locales2.size(); i12++) {
            Locale locale5 = locales2.get(i12);
            for (Locale locale6 : list) {
                if (locale5.equals(locale6)) {
                    return locale6;
                }
            }
            for (Locale locale7 : list) {
                if (locale5.getLanguage().equals(locale7.toLanguageTag())) {
                    return locale7;
                }
            }
            for (Locale locale8 : list) {
                if (locale5.getLanguage().equals(locale8.getLanguage())) {
                    return locale8;
                }
            }
        }
        return list.get(0);
    }

    public void sendLocalesToFlutter(@n0 Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = configuration.getLocales();
            int size = locales.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(locales.get(i10));
            }
        } else {
            arrayList.add(configuration.locale);
        }
        this.localizationChannel.sendLocales(arrayList);
    }
}
