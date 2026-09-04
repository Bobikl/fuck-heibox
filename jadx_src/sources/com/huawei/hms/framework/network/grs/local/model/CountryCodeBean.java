package com.huawei.hms.framework.network.grs.local.model;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huawei.hms.framework.common.EmuiUtil;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.SystemPropUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class CountryCodeBean {
    private static final String ANDRIOD_SYSTEMPROP = "android.os.SystemProperties";
    private static final int ANDROID_9_API_LEVEL = 28;
    private static final int COUNTRYCODE_SIZE = 2;
    private static final String KEY_VERSION_EMUI = "ro.build.version.emui";
    private static final String LOCALE_COUNTRYSYSTEMPROP = "ro.product.locale";
    private static final String LOCALE_REGION_COUNTRYSYSTEMPROP = "ro.product.locale.region";
    private static final String SPECIAL_COUNTRYCODE_CN = "cn";
    private static final String SPECIAL_COUNTRYCODE_EU = "eu";
    private static final String SPECIAL_COUNTRYCODE_GB = "gb";
    private static final String SPECIAL_COUNTRYCODE_LA = "la";
    private static final String SPECIAL_COUNTRYCODE_UK = "uk";
    private static final String TAG = "CountryCodeBean";
    private static final String VENDORCOUNTRY_SYSTEMPROP = "ro.hw.country";
    private String countryCode;
    private String countrySource = "UNKNOWN";

    public CountryCodeBean(Context context, boolean z10) {
        this.countryCode = "UNKNOWN";
        init(context, z10);
        this.countryCode = this.countryCode.toUpperCase(Locale.ENGLISH);
    }

    private void checkCodeLenth() {
        String str = this.countryCode;
        if (str == null || str.length() != 2) {
            this.countryCode = "UNKNOWN";
            this.countrySource = "UNKNOWN";
        }
    }

    private void getLocaleCountryCode() {
        String str;
        String str2;
        if (SystemPropUtils.getProperty("get", "ro.build.version.emui", ANDRIOD_SYSTEMPROP, "").isEmpty()) {
            if (Build.VERSION.SDK_INT >= 28 || Build.VERSION.RELEASE.charAt(0) >= '9') {
                getRegionSettingCountryCode();
                str = TAG;
                str2 = "other Android 9.0 upper， get countryCode form Locale.getDefault().getCountry()";
            } else {
                getProductCountryCode();
                str = TAG;
                str2 = "other Android 9.0 lower, get countryCode form ro.product.locale.region or locale";
            }
        } else if (EmuiUtil.isUpPVersion()) {
            getRegionSettingCountryCode();
            str = TAG;
            str2 = "EMUI 9.0 upper System, get countryCode form Locale.getDefault().getCountry()";
        } else {
            getProductCountryCode();
            str = TAG;
            str2 = "EMUI 9.0 lower System, get countryCode form ro.product.locale.region or locale";
        }
        Logger.d(str, str2);
        this.countrySource = GrsBaseInfo.CountryCodeSource.LOCALE_INFO;
    }

    private void getProductCountryCode() {
        int iLastIndexOf;
        this.countryCode = SystemPropUtils.getProperty("get", LOCALE_REGION_COUNTRYSYSTEMPROP, ANDRIOD_SYSTEMPROP, "UNKNOWN");
        String str = TAG;
        Logger.d(str, "countryCode by ro.product.locale.region is: " + this.countryCode);
        if (TextUtils.isEmpty(this.countryCode) || "UNKNOWN".equals(this.countryCode)) {
            String property = SystemPropUtils.getProperty("get", LOCALE_COUNTRYSYSTEMPROP, ANDRIOD_SYSTEMPROP, "UNKNOWN");
            if (!TextUtils.isEmpty(property) && (iLastIndexOf = property.lastIndexOf(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) != -1) {
                this.countryCode = property.substring(iLastIndexOf + 1);
                Logger.d(str, "countryCode by ro.product.locale is: " + this.countryCode);
            }
        }
        if (SPECIAL_COUNTRYCODE_CN.equalsIgnoreCase(this.countryCode)) {
            return;
        }
        this.countryCode = "UNKNOWN";
    }

    private void getRegionSettingCountryCode() {
        this.countryCode = Locale.getDefault().getCountry();
        Logger.d(TAG, "countryCode by system's region setting is: " + this.countryCode);
        if (TextUtils.isEmpty(this.countryCode)) {
            this.countryCode = "UNKNOWN";
        }
    }

    private void getSimCountryCode(Context context) {
        getSimCountryCode(context, false);
    }

    private void getSimCountryCode(Context context, boolean z10) {
        String str;
        StringBuilder sb2;
        String str2;
        TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService(g0.a.f118921e);
        if (telephonyManager != null) {
            if (!z10 || telephonyManager.getPhoneType() == 2) {
                this.countryCode = telephonyManager.getSimCountryIso();
                this.countrySource = GrsBaseInfo.CountryCodeSource.SIM_COUNTRY;
                str = TAG;
                sb2 = new StringBuilder();
                str2 = "countryCode by SimCountryIso is: ";
            } else {
                this.countryCode = telephonyManager.getNetworkCountryIso();
                this.countrySource = GrsBaseInfo.CountryCodeSource.NETWORK_COUNTRY;
                str = TAG;
                sb2 = new StringBuilder();
                str2 = "countryCode by NetworkCountryIso is: ";
            }
            sb2.append(str2);
            sb2.append(this.countryCode);
            Logger.d(str, sb2.toString());
        }
        checkCodeLenth();
    }

    private void getVendorCountryCode() {
        this.countrySource = GrsBaseInfo.CountryCodeSource.VENDOR_COUNTRY;
        this.countryCode = SystemPropUtils.getProperty("get", VENDORCOUNTRY_SYSTEMPROP, ANDRIOD_SYSTEMPROP, "UNKNOWN");
        String str = TAG;
        Logger.d(str, "countryCode by ro.hw.country is: " + this.countryCode);
        if (SPECIAL_COUNTRYCODE_EU.equalsIgnoreCase(this.countryCode) || SPECIAL_COUNTRYCODE_LA.equalsIgnoreCase(this.countryCode)) {
            this.countryCode = "UNKNOWN";
            this.countrySource = "UNKNOWN";
        } else {
            if (!SPECIAL_COUNTRYCODE_UK.equalsIgnoreCase(this.countryCode)) {
                checkCodeLenth();
                return;
            }
            Logger.d(str, "special country of UK to map GB.");
            this.countryCode = SPECIAL_COUNTRYCODE_GB;
            this.countrySource = GrsBaseInfo.CountryCodeSource.VENDOR_COUNTRY;
        }
    }

    private void init(Context context, boolean z10) {
        if (context == null) {
            throw new NullPointerException("context must be not null.Please provide app's Context");
        }
        try {
            getVendorCountryCode();
            if (isCodeValidate()) {
                Logger.i(TAG, "get issue_country code from VENDOR_COUNTRY");
                return;
            }
            getSimCountryCode(context);
            if (isCodeValidate()) {
                Logger.i(TAG, "get issue_country code from SIM_COUNTRY");
                return;
            }
            getLocaleCountryCode();
            if (isCodeValidate()) {
                Logger.i(TAG, "get issue_country code from LOCALE_INFO");
            }
        } catch (Exception unused) {
            Logger.w(TAG, "get CountryCode error");
        }
    }

    private boolean isCodeValidate() {
        return !"UNKNOWN".equals(this.countryCode);
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getCountrySource() {
        return this.countrySource;
    }
}
