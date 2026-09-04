package com.umeng.pagesdk;

import android.content.Context;
import android.text.TextUtils;
import com.efs.sdk.base.core.util.ProcessUtil;

/* JADX INFO: loaded from: classes4.dex */
public final class e {
    public static boolean a(Context context) {
        try {
            String currentProcessName = ProcessUtil.getCurrentProcessName();
            String packageName = context.getApplicationContext().getPackageName();
            return (TextUtils.isEmpty(currentProcessName) || TextUtils.isEmpty(packageName) || !currentProcessName.equals(packageName)) ? false : true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
