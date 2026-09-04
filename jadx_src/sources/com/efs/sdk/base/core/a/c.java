package com.efs.sdk.base.core.a;

import android.content.Context;
import android.text.TextUtils;
import com.efs.sdk.base.BuildConfig;
import com.efs.sdk.base.EfsConstant;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.PackageUtil;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.connect.common.Constants;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f42413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f42414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f42415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f42416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f42418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f42419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f42420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f42421i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f42422j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    String f42423k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    String f42424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f42425m = 0;

    public static c a() {
        c cVar = new c();
        cVar.f42413a = ControllerCenter.getGlobalEnvStruct().getAppid();
        cVar.f42414b = ControllerCenter.getGlobalEnvStruct().getSecret();
        cVar.f42424l = ControllerCenter.getGlobalEnvStruct().getUid();
        cVar.f42422j = BuildConfig.VERSION_NAME;
        cVar.f42415c = PackageUtil.getAppVersionName(ControllerCenter.getGlobalEnvStruct().mAppContext);
        cVar.f42421i = String.valueOf(com.efs.sdk.base.core.config.a.c.a().f42493d.f42483a);
        cVar.f42423k = EfsConstant.UM_SDK_VERSION;
        return cVar;
    }

    private static String a(Context context) {
        Class<?> cls;
        Method method;
        if (context == null) {
            return null;
        }
        try {
            cls = Class.forName("com.umeng.commonsdk.UMConfigure");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            method = cls.getMethod("getUMIDString", Context.class);
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

    public final String b() {
        a.a();
        String strValueOf = String.valueOf(a.b() / 1000);
        String strA = com.efs.sdk.base.core.util.b.b.a(com.efs.sdk.base.core.util.b.a.a(this.f42424l + strValueOf, this.f42414b));
        TreeMap treeMap = new TreeMap();
        treeMap.put(Constants.JumpUrlConstants.SRC_TYPE_APP, this.f42413a);
        treeMap.put("sd", strA);
        String strA2 = a(ControllerCenter.getGlobalEnvStruct().mAppContext);
        if (!TextUtils.isEmpty(strA2)) {
            treeMap.put("wl_dd", com.efs.sdk.base.core.util.b.b.a(com.efs.sdk.base.core.util.b.a.a(strA2 + lg.a.f131412e + strValueOf, this.f42414b)));
        }
        if (!TextUtils.isEmpty(this.f42416d)) {
            treeMap.put(h5.b.f119115m, this.f42416d);
        }
        if (this.f42419g != 0) {
            treeMap.put(SocializeProtocolConstants.PROTOCOL_KEY_DE, String.valueOf(this.f42417e));
            treeMap.put("type", this.f42420h);
            String str = this.f42418f;
            if (TextUtils.isEmpty(str)) {
                a.a();
                long jB = a.b();
                str = String.format(Locale.SIMPLIFIED_CHINESE, "%d%04d", Long.valueOf(jB), Integer.valueOf(new Random(jB).nextInt(10000)));
            }
            treeMap.put("seq", str);
        }
        treeMap.put("cver", this.f42421i);
        treeMap.put("os", "android");
        treeMap.put("sver", this.f42421i);
        treeMap.put("tm", strValueOf);
        treeMap.put("ver", this.f42415c);
        treeMap.put("um_sdk_ver", this.f42423k);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry entry : treeMap.entrySet()) {
            String str2 = ((String) entry.getKey()) + ContainerUtils.KEY_VALUE_DELIMITER + ((String) entry.getValue());
            sb3.append(str2);
            sb2.append(str2);
            sb2.append("&");
        }
        String strA3 = com.efs.sdk.base.core.util.b.b.a(sb3.toString() + this.f42414b);
        sb2.append("sign=");
        sb2.append(strA3);
        Log.d("efs.config", sb2.toString());
        return com.efs.sdk.base.core.util.b.b.b(sb2.toString());
    }
}
