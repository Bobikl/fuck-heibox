package com.efs.sdk.base.core.config;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.efs.sdk.base.BuildConfig;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.efs.sdk.base.core.util.PackageUtil;
import com.efs.sdk.base.core.util.ProcessUtil;
import com.efs.sdk.base.core.util.d;
import com.igexin.sdk.PushConsts;
import com.taobao.accs.common.Constants;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.umeng.umcrash.UMCrash;
import h5.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes6.dex */
public class GlobalInfoManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private GlobalInfo f42479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f42480b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final GlobalInfoManager f42481a = new GlobalInfoManager(0);
    }

    private GlobalInfoManager() {
        this.f42480b = ControllerCenter.getGlobalEnvStruct().mAppContext;
    }

    /* synthetic */ GlobalInfoManager(byte b10) {
        this();
    }

    private static String a(Context context) {
        Class<?> cls;
        Method method;
        if (context == null) {
            return null;
        }
        try {
            cls = Class.forName("com.umeng.commonsdk.statistics.common.DeviceConfig");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            method = cls.getMethod("getSid", Context.class);
        } catch (NoSuchMethodException unused2) {
            method = null;
        }
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, context);
            if (objInvoke != null) {
                return objInvoke.toString();
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    public static GlobalInfoManager getInstance() {
        return a.f42481a;
    }

    public GlobalInfo getGlobalInfo() {
        try {
            String strA = a(this.f42480b);
            if (!TextUtils.isEmpty(strA)) {
                this.f42479a.a(UMCrash.KEY_CALLBACK_SESSION_ID, strA);
            }
        } catch (Throwable th2) {
            Log.d("efs.info.manager", "refreshSessionId caused error: " + th2.getMessage());
        }
        return this.f42479a;
    }

    public String getNetStatus() {
        return this.f42479a.b(b.f119111k, NetworkUtil.NETWORK_CLASS_DISCONNECTED).toString();
    }

    public void initGlobalInfo() {
        Log.e("ballack", "initGlobalInfo called once.");
        GlobalInfo globalInfo = new GlobalInfo();
        this.f42479a = globalInfo;
        globalInfo.a("appid", ControllerCenter.getGlobalEnvStruct().getAppid());
        int iMyPid = ProcessUtil.myPid();
        this.f42479a.a(PushConsts.KEY_SERVICE_PIT, Integer.valueOf(iMyPid));
        this.f42479a.a("ps", ProcessUtil.getProcessName(iMyPid));
        String strA = d.a(this.f42480b);
        this.f42479a.a("wid", strA);
        if (TextUtils.isEmpty(ControllerCenter.getGlobalEnvStruct().getUid())) {
            this.f42479a.a("uid", strA);
        } else {
            this.f42479a.a("uid", ControllerCenter.getGlobalEnvStruct().getUid());
        }
        GlobalInfo globalInfo2 = this.f42479a;
        com.efs.sdk.base.core.a.a.a();
        globalInfo2.a("stime", Long.valueOf(com.efs.sdk.base.core.a.a.b() - Process.getElapsedCpuTime()));
        this.f42479a.a("pkg", PackageUtil.getPackageName(this.f42480b));
        this.f42479a.a("ver", PackageUtil.getAppVersionName(this.f42480b));
        this.f42479a.a("vcode", PackageUtil.getAppVersionCode(this.f42480b));
        this.f42479a.a("sdk_ver", BuildConfig.VERSION_NAME);
        this.f42479a.a("brand", Build.BRAND.toLowerCase());
        GlobalInfo globalInfo3 = this.f42479a;
        String str = Build.MODEL;
        globalInfo3.a(Constants.KEY_MODEL, str == null ? "unknown" : str.replace(" ", com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER).replace(lg.a.f131412e, com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER).toLowerCase());
        this.f42479a.a("build_model", str);
        DisplayMetrics displayMetrics = this.f42480b.getResources().getDisplayMetrics();
        this.f42479a.a("dsp_w", Integer.valueOf(displayMetrics.widthPixels));
        this.f42479a.a("dsp_h", Integer.valueOf(displayMetrics.heightPixels));
        this.f42479a.a(SocializeProtocolConstants.PROTOCOL_KEY_FR, "android");
        this.f42479a.a("rom", Build.VERSION.RELEASE);
        this.f42479a.a("sdk", Integer.valueOf(Build.VERSION.SDK_INT));
        this.f42479a.a("lang", Locale.getDefault().getLanguage());
        this.f42479a.a("tzone", TimeZone.getDefault().getID());
        this.f42479a.a(b.f119111k, NetworkUtil.getNetworkType(this.f42480b));
        try {
            String[] networkAccessMode = NetworkUtil.getNetworkAccessMode(this.f42480b);
            if ("Wi-Fi".equals(networkAccessMode[0])) {
                this.f42479a.a(UMCrash.KEY_HEADER_ACCESS, "wifi");
            } else if ("2G/3G".equals(networkAccessMode[0])) {
                this.f42479a.a(UMCrash.KEY_HEADER_ACCESS, "2G/3G");
            } else {
                this.f42479a.a(UMCrash.KEY_HEADER_ACCESS, "unknow");
            }
            if (!"".equals(networkAccessMode[1])) {
                this.f42479a.a(UMCrash.KEY_HEADER_ACCESS_SUBTYPE, networkAccessMode[1]);
            }
            this.f42479a.a(UMCrash.KEY_HEADER_NETWORK_TYPE, Integer.valueOf(NetworkUtil.getNetworkTypeUmeng(this.f42480b)));
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void refreshNetStatus() {
        String networkType = NetworkUtil.getNetworkType(ControllerCenter.getGlobalEnvStruct().mAppContext);
        Log.w("efs.info.manager", "network change: ".concat(String.valueOf(networkType)));
        this.f42479a.a(b.f119111k, networkType);
    }
}
