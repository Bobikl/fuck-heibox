package com.huawei.hms.feature.dynamic.e;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.common.util.Logger;
import com.huawei.hms.feature.dynamic.DynamicModule;

/* JADX INFO: loaded from: classes7.dex */
public class c implements DynamicModule.VersionPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f60715a = "c";

    @Override // com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy
    public Bundle getModuleInfo(Context context, String str) throws DynamicModule.LoadingException {
        DynamicModule.LoadingException loadingException;
        Bundle bundle;
        try {
            bundle = DynamicModule.getRemoteModuleInfo(context, str);
            loadingException = null;
        } catch (DynamicModule.LoadingException e10) {
            loadingException = e10.getBundle() != null ? new DynamicModule.LoadingException(e10.getMessage(), e10.getBundle()) : new DynamicModule.LoadingException(e10.getMessage());
            Logger.w(f60715a, "Get remote module info failed: " + e10.getMessage() + ". try to query local.");
            bundle = new Bundle();
        }
        Bundle localModuleInfo = DynamicModule.getLocalModuleInfo(context, str);
        String str2 = f60715a;
        Logger.i(str2, "The version of remote module " + str + ":" + bundle.getInt(com.huawei.hms.feature.dynamic.b.f60689k));
        Logger.i(str2, "The version of local module " + str + ":" + localModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.f60690l));
        if (localModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.f60690l) > 0 && localModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.f60690l) >= bundle.getInt(com.huawei.hms.feature.dynamic.b.f60689k)) {
            Logger.i(str2, "Choose local module info.");
            return localModuleInfo;
        }
        if (loadingException != null && bundle.getInt(com.huawei.hms.feature.dynamic.b.f60689k) == 0) {
            throw loadingException;
        }
        Logger.i(str2, "Choose remote module info.");
        return bundle;
    }
}
