package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.aaid.encrypt.PushEncrypter;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.support.log.HMSLog;
import java.util.Map;

/* JADX INFO: compiled from: PushClientSp.java */
/* JADX INFO: loaded from: classes7.dex */
public class i extends PushPreferences {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f61153c = "i";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f61154b;

    private i(Context context) {
        super(context, "push_client_self_info");
        this.f61154b = context;
    }

    public static i a(Context context) {
        return new i(context);
    }

    public String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return PushEncrypter.decrypter(this.f61154b, getString(str));
        } catch (Exception e10) {
            HMSLog.e(f61153c, "getSecureData" + e10.getMessage());
            return "";
        }
    }

    public void a() {
        Map<String, ?> all = getAll();
        if (all.isEmpty() || all.keySet().isEmpty()) {
            return;
        }
        for (String str : all.keySet()) {
            if (!"push_kit_auto_init_enabled".equals(str) && !"_proxy_init".equals(str)) {
                removeKey(str);
            }
        }
    }

    public boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return saveString(str, PushEncrypter.encrypter(this.f61154b, str2));
        } catch (Exception e10) {
            HMSLog.e(f61153c, "saveSecureData" + e10.getMessage());
            return false;
        }
    }

    public String b(String str) {
        try {
            return TextUtils.isEmpty(str) ? a("token_info_v2") : a(str);
        } catch (Exception e10) {
            HMSLog.e(f61153c, "getSecureData" + e10.getMessage());
            return "";
        }
    }

    public boolean b(String str, String str2) {
        try {
            return TextUtils.isEmpty(str) ? a("token_info_v2", str2) : a(str, str2);
        } catch (Exception e10) {
            HMSLog.e(f61153c, "saveSecureData" + e10.getMessage());
            return false;
        }
    }

    public boolean c(String str) {
        try {
            return TextUtils.isEmpty(str) ? removeKey("token_info_v2") : removeKey(str);
        } catch (Exception e10) {
            HMSLog.e(f61153c, "removeToken" + e10.getMessage());
            return false;
        }
    }
}
