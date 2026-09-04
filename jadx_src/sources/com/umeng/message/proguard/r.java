package com.umeng.message.proguard;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.ccg.ActionInfo;

/* JADX INFO: loaded from: classes4.dex */
public class r implements ActionInfo {
    public String getModule(Context context) {
        return "push";
    }

    public String[] getSupportAction(Context context) {
        return new String[]{"col_apl"};
    }

    public boolean getSwitchState(Context context, String str) {
        if (TextUtils.equals(str, "col_apl")) {
            return f.f105795a;
        }
        return false;
    }

    public void onCommand(Context context, String str, Object obj) {
    }
}
