package com.apm.lite.nativecrash;

import android.text.TextUtils;
import com.apm.lite.k.o;
import com.huawei.hms.framework.common.ContainerUtils;
import com.igexin.sdk.PushConsts;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f40083a;

    public a(File file) {
        String nativeCrashHeader;
        File fileM = o.m(file);
        if (!fileM.exists() || fileM.length() == 0 || (nativeCrashHeader = NativeImpl.getNativeCrashHeader(fileM.getAbsolutePath())) == null) {
            return;
        }
        String[] strArrSplit = nativeCrashHeader.split("\n");
        this.f40083a = new HashMap();
        for (String str : strArrSplit) {
            String[] strArrSplit2 = str.split(ContainerUtils.KEY_VALUE_DELIMITER);
            if (strArrSplit2.length == 2) {
                this.f40083a.put(strArrSplit2[0], strArrSplit2[1]);
            }
        }
    }

    public boolean a() {
        Map<String, String> map = this.f40083a;
        return (map == null || map.isEmpty() || TextUtils.isEmpty(this.f40083a.get("process_name")) || TextUtils.isEmpty(this.f40083a.get("crash_thread_name")) || TextUtils.isEmpty(this.f40083a.get(PushConsts.KEY_SERVICE_PIT)) || TextUtils.isEmpty(this.f40083a.get("tid")) || TextUtils.isEmpty(this.f40083a.get(com.umeng.analytics.pro.d.f104709p)) || TextUtils.isEmpty(this.f40083a.get("crash_time")) || TextUtils.isEmpty(this.f40083a.get("signal_line"))) ? false : true;
    }

    public String b() {
        return this.f40083a.get("signal_line");
    }

    public Map<String, String> c() {
        return this.f40083a;
    }
}
