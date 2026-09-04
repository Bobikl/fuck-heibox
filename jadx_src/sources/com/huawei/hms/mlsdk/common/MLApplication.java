package com.huawei.hms.mlsdk.common;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.hms.feature.dynamic.f.e;
import com.huawei.hms.ml.common.utils.ActivityMgr;
import com.huawei.hms.ml.common.utils.CountryCodeBean;
import com.huawei.hms.ml.common.utils.SmartLog;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class MLApplication {
    public static final String DEFAULT_APP_NAME = "_DEFAULT_";
    static final Map<String, MLApplication> INSTANCES;
    private static final Object LOCK;
    private static final String LOG_TAG = "MLApplication";
    public static final int REGION_DR_CHINA = 1002;
    public static final int REGION_DR_GERMAN = 1006;
    public static final int REGION_DR_RUSSIA = 1005;
    public static final int REGION_DR_SINGAPORE = 1007;
    public static final int REGION_DR_UNKNOWN = 1001;
    private static final Map<Integer, String> REGION_MAP;
    private String accessToken;
    private String apiKey;
    private final Context appContext;
    private final String appName;
    private final MLApplicationSetting appSetting;
    private boolean setByCP = false;
    private boolean isAcessTokenSetByCP = false;
    private int userRegion = 1001;

    static {
        HashMap map = new HashMap();
        REGION_MAP = map;
        map.put(1002, e.f60734e);
        map.put(1007, "SG");
        map.put(1006, "DE");
        map.put(1005, "RU");
        LOCK = new Object();
        INSTANCES = new HashMap();
    }

    protected MLApplication(Context context, String str, MLApplicationSetting mLApplicationSetting) {
        this.appContext = context;
        this.appName = str;
        this.appSetting = mLApplicationSetting;
    }

    private static Activity findActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return findActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private static List<String> getAllAppNames() {
        ArrayList arrayList = new ArrayList();
        synchronized (LOCK) {
            Iterator<MLApplication> it = INSTANCES.values().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getAppName());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List<MLApplication> getAppList(Context context) {
        ArrayList arrayList;
        synchronized (LOCK) {
            arrayList = new ArrayList(INSTANCES.values());
        }
        return arrayList;
    }

    public static MLApplication getInstance() {
        MLApplication mLApplicationInitialize;
        synchronized (LOCK) {
            mLApplicationInitialize = INSTANCES.get(DEFAULT_APP_NAME);
            if (mLApplicationInitialize == null && (mLApplicationInitialize = initialize(AGConnectInstance.getInstance().getContext())) == null) {
                throw new IllegalStateException("Please call MLApplication.initialize(Context) to initialize application first.");
            }
        }
        return mLApplicationInitialize;
    }

    public static MLApplication getInstance(String str) {
        MLApplication mLApplication;
        String str2;
        synchronized (LOCK) {
            mLApplication = INSTANCES.get(str);
            if (mLApplication == null) {
                List<String> allAppNames = getAllAppNames();
                if (allAppNames.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", allAppNames);
                }
                throw new IllegalStateException(String.format(Locale.ENGLISH, "application doesn't exist. current available application names:%s", str2));
            }
        }
        return mLApplication;
    }

    public static String getUniqueKey(String str, MLApplicationSetting mLApplicationSetting) {
        String strEncodeToString = null;
        String strEncodeToString2 = str != null ? Base64.encodeToString(str.getBytes(Charset.defaultCharset()), 11) : null;
        if (mLApplicationSetting != null && mLApplicationSetting.getAppId() != null) {
            strEncodeToString = Base64.encodeToString(mLApplicationSetting.getAppId().getBytes(Charset.defaultCharset()), 11);
        }
        return strEncodeToString2 + "+" + strEncodeToString;
    }

    public static MLApplication initialize(Context context) {
        MLApplication mLApplicationInitialize;
        SmartLog.i(LOG_TAG, "initialize one para");
        synchronized (LOCK) {
            makeSureAGConnectInstanceInitialed(context);
            if (INSTANCES.containsKey(DEFAULT_APP_NAME)) {
                getInstance();
            }
            new MLApplicationSetting.Factory().create();
            mLApplicationInitialize = initialize(context, MLApplicationSetting.fromResource(context));
        }
        return mLApplicationInitialize;
    }

    public static MLApplication initialize(Context context, MLApplicationSetting mLApplicationSetting) {
        SmartLog.i(LOG_TAG, "initialize two para");
        return initialize(context, mLApplicationSetting, DEFAULT_APP_NAME);
    }

    public static MLApplication initialize(Context context, MLApplicationSetting mLApplicationSetting, String str) {
        MLApplication mLApplication;
        Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
        synchronized (LOCK) {
            makeSureAGConnectInstanceInitialed(applicationContext);
            if (mLApplicationSetting == null) {
                new MLApplicationSetting.Factory().create();
                mLApplicationSetting = MLApplicationSetting.fromResource(context);
            }
            mLApplication = new MLApplication(applicationContext, str, mLApplicationSetting);
            INSTANCES.put(str, mLApplication);
            ActivityMgr activityMgr = ActivityMgr.INST;
            if (activityMgr.getCurrentActivity() == null && (applicationContext instanceof Application)) {
                activityMgr.init((Application) applicationContext);
            }
        }
        return mLApplication;
    }

    private static void makeSureAGConnectInstanceInitialed(Context context) {
        if (AGConnectInstance.getInstance() == null) {
            AGConnectInstance.initialize(context);
        }
    }

    private static String readManifest(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getPackageInfo(context.getPackageName(), 0).applicationInfo.loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            SmartLog.e(LOG_TAG, "PackageManager NameNotFoundException");
            return "";
        } catch (Resources.NotFoundException unused2) {
            SmartLog.e(LOG_TAG, "Resources NotFoundException");
            return "";
        } catch (Exception unused3) {
            SmartLog.e(LOG_TAG, "readManifest Exception");
            return "";
        }
    }

    public <T> T get(Class<T> cls) {
        return null;
    }

    public String getApiKey() {
        String str;
        String str2;
        SmartLog.i(LOG_TAG, "get ky flag: " + this.setByCP);
        synchronized (LOCK) {
            if (!getInstance().isSetByCP() || (str = this.apiKey) == null || str.length() == 0) {
                throw new NullPointerException("please set your app apiKey");
            }
            str2 = this.apiKey;
        }
        return str2;
    }

    public Context getAppContext() {
        return this.appContext;
    }

    public String getAppName() {
        return this.appName;
    }

    public MLApplicationSetting getAppSetting() {
        return this.appSetting;
    }

    public String getAuthorizationToken() {
        synchronized (LOCK) {
            if (!this.isAcessTokenSetByCP) {
                return getApiKey();
            }
            if (TextUtils.isEmpty(this.accessToken)) {
                throw new NullPointerException("access token is empty");
            }
            return this.accessToken;
        }
    }

    public String getCountryCode() {
        Map<Integer, String> map = REGION_MAP;
        if (map.containsKey(Integer.valueOf(this.userRegion))) {
            return map.get(Integer.valueOf(this.userRegion));
        }
        return null;
    }

    public String getUniqueKey() {
        return getUniqueKey(getAppName(), getAppSetting());
    }

    public boolean isDefault() {
        return DEFAULT_APP_NAME.equals(getAppName());
    }

    public boolean isSetByCP() {
        return this.setByCP;
    }

    public void setAccessToken(String str) {
        SmartLog.i(LOG_TAG, "set a tkn");
        synchronized (LOCK) {
            this.accessToken = str;
            this.isAcessTokenSetByCP = true;
        }
    }

    public void setApiKey(String str) {
        SmartLog.i(LOG_TAG, "set a ky");
        synchronized (LOCK) {
            this.apiKey = str;
            this.setByCP = true;
            if (!isDefault()) {
                getInstance().setApiKey(str);
                getInstance().setApiKeyByCP(true);
            }
        }
    }

    public void setApiKeyByCP(boolean z10) {
        this.setByCP = z10;
    }

    public void setUserRegion(int i10) throws IllegalArgumentException {
        SmartLog.i(LOG_TAG, "set userRegion: " + i10);
        synchronized (LOCK) {
            if (!REGION_MAP.containsKey(Integer.valueOf(i10))) {
                throw new IllegalArgumentException("region is not available");
            }
            this.userRegion = i10;
        }
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (getAppSetting() != null) {
            bundle.putString("appid", getAppSetting().getAppId());
            bundle.putString("appName", readManifest(getAppContext()));
            bundle.putString("packageName", getAppSetting().getPackageName());
            bundle.putString(MLApplicationSetting.BundleKeyConstants.AppInfo.ML_SDK_VERSION, getAppSetting().getMLSdkVersion());
            bundle.putBoolean(MLApplicationSetting.BundleKeyConstants.AppInfo.OPEN_HA, getAppSetting().getAcceptHa().booleanValue());
            bundle.putString(MLApplicationSetting.BundleKeyConstants.AppInfo.COUNTRY_CODE, new CountryCodeBean(this.appContext, false).getCountryCode());
        } else {
            SmartLog.w(LOG_TAG, "APP setting is null.");
        }
        return bundle;
    }

    public String toString() {
        return "appName=" + this.appName + ", appSetting=" + this.appSetting;
    }
}
