package com.huawei.hms.feature.dynamic.e;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.common.util.Logger;
import com.huawei.hms.feature.dynamic.DynamicModule;

/* JADX INFO: loaded from: classes7.dex */
public class d implements DynamicModule.VersionPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f60716a = "d";

    @Override // com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy
    public Bundle getModuleInfo(Context context, String str) throws DynamicModule.LoadingException {
        Bundle remoteModuleInfo = DynamicModule.getRemoteModuleInfo(context, str);
        Bundle localModuleInfo = DynamicModule.getLocalModuleInfo(context, str);
        String str2 = f60716a;
        Logger.i(str2, "The version of remote module " + str + ":" + remoteModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.f60689k));
        Logger.i(str2, "The version of local module " + str + ":" + localModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.f60690l));
        if (remoteModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.f60689k) >= localModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.f60690l)) {
            Logger.i(str2, "Choose remote module info.");
            return remoteModuleInfo;
        }
        Logger.i(str2, "Choose local module info.");
        return localModuleInfo;
    }
}
