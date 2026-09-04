package com.tencent.connect;

import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static boolean a(String str, IUiListener iUiListener) {
        return a(str, iUiListener, -6, Constants.MSG_PERMISSION_NOT_GRANTED, Constants.MSG_PERMISSION_NOT_GRANTED);
    }

    public static boolean a(String str, IUiListener iUiListener, int i10, String str2, String str3) {
        if (!Tencent.isPermissionNotGranted()) {
            return false;
        }
        SLog.i(str, "permission not granted");
        if (iUiListener == null) {
            return true;
        }
        iUiListener.onError(new UiError(i10, str2, str3));
        return true;
    }
}
