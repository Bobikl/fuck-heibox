package com.huawei.hms.feature.dynamic.e;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.common.util.Logger;
import com.huawei.hms.feature.dynamic.DynamicModule;

/* JADX INFO: loaded from: classes7.dex */
public class e implements DynamicModule.VersionPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f60717a = "e";

    @Override // com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy
    public Bundle getModuleInfo(Context context, String str) throws DynamicModule.LoadingException {
        Bundle remoteModuleInfo = DynamicModule.getRemoteModuleInfo(context, str);
        if (remoteModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.f60689k) > 0) {
            Logger.i(f60717a, "Prefer remote: The version of remote module " + str + ":" + remoteModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.f60689k));
            return remoteModuleInfo;
        }
        Bundle localModuleInfo = DynamicModule.getLocalModuleInfo(context, str);
        if (localModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.f60690l) <= 0) {
            Logger.i(f60717a, "Cannot get module info in remote or local.");
            return new Bundle();
        }
        Logger.i(f60717a, "Choose local: The version of local module " + str + ":" + localModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.f60690l));
        return localModuleInfo;
    }
}
