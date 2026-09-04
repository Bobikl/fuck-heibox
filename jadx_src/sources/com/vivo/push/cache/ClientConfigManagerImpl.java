package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.p;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class ClientConfigManagerImpl implements d {
    private static final String TAG = "ClientConfigManager";
    private static volatile ClientConfigManagerImpl sClientConfigManagerImpl;
    private a mAppConfigSettings;
    private Context mContext;
    private e mPushConfigSettings;

    private ClientConfigManagerImpl(Context context) {
        this.mContext = ContextDelegate.getContext(context);
        this.mAppConfigSettings = new a(this.mContext);
        this.mPushConfigSettings = new e(this.mContext);
    }

    public static synchronized ClientConfigManagerImpl getInstance(Context context) {
        if (sClientConfigManagerImpl == null) {
            sClientConfigManagerImpl = new ClientConfigManagerImpl(context);
        }
        return sClientConfigManagerImpl;
    }

    private void prepareAppConfig() {
        a aVar = this.mAppConfigSettings;
        if (aVar == null) {
            this.mAppConfigSettings = new a(this.mContext);
        } else {
            aVar.c();
        }
    }

    private e preparePushConfigSettings() {
        e eVar = this.mPushConfigSettings;
        if (eVar == null) {
            this.mPushConfigSettings = new e(this.mContext);
        } else {
            eVar.c();
        }
        return this.mPushConfigSettings;
    }

    public void clearPush() {
        this.mAppConfigSettings.d();
    }

    public Set<String> getBlackEventList() {
        return null;
    }

    public String getSuitTag() {
        return preparePushConfigSettings().c("CSPT");
    }

    public String getValueByKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.mPushConfigSettings.c();
        return this.mPushConfigSettings.c(str);
    }

    public Set<Long> getWhiteLogList() {
        HashSet hashSet = new HashSet();
        String valueByKey = getValueByKey("WLL");
        if (!TextUtils.isEmpty(valueByKey)) {
            for (String str : valueByKey.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                try {
                    hashSet.add(Long.valueOf(Long.parseLong(str)));
                } catch (Exception unused) {
                }
            }
        }
        p.d(TAG, " initWhiteLogList ".concat(String.valueOf(hashSet)));
        return hashSet;
    }

    public boolean isCancleBroadcastReceiver() {
        int i10;
        String strC = preparePushConfigSettings().c("PSM");
        if (TextUtils.isEmpty(strC)) {
            i10 = 0;
        } else {
            try {
                i10 = Integer.parseInt(strC);
            } catch (NumberFormatException e10) {
                e10.printStackTrace();
                i10 = 0;
            }
        }
        return (i10 & 4) != 0;
    }

    public boolean isDebug() {
        this.mAppConfigSettings.c();
        return a.a(this.mAppConfigSettings.b());
    }

    public boolean isDebug(int i10) {
        return a.a(i10);
    }

    public boolean isEnablePush() {
        prepareAppConfig();
        com.vivo.push.model.a aVarC = this.mAppConfigSettings.c(this.mContext.getPackageName());
        if (aVarC != null) {
            return "1".equals(aVarC.b());
        }
        return true;
    }

    @Override // com.vivo.push.cache.d
    public boolean isInBlackList(long j10) {
        String strC = preparePushConfigSettings().c("BL");
        if (!TextUtils.isEmpty(strC)) {
            for (String str : strC.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                try {
                    if (!TextUtils.isEmpty(str) && Long.parseLong(str) == j10) {
                        return true;
                    }
                } catch (NumberFormatException e10) {
                    e10.printStackTrace();
                }
            }
        }
        return false;
    }
}
