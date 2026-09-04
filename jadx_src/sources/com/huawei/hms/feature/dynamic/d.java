package com.huawei.hms.feature.dynamic;

import android.os.Bundle;
import com.huawei.hms.common.util.Logger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f60710b = "d";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f60711c = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<String> f60712a;

    public static d a() {
        return f60711c;
    }

    public void a(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("installed_module_name");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            Logger.w(f60710b, "Get installed module name failed.");
            this.f60712a = new HashSet();
            return;
        }
        Logger.i(f60710b, "Installed module name:" + stringArrayList);
        this.f60712a = new HashSet(stringArrayList);
    }
}
