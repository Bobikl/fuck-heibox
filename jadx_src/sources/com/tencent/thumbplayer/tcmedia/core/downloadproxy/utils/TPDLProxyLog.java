package com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils;

import android.util.Log;
import com.meituan.robust.Constants;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener;

/* JADX INFO: loaded from: classes4.dex */
public class TPDLProxyLog {
    private static ITPDLProxyLogListener mLogListener;
    private static int mServiceType;

    public static void d(String str, int i10, String str2, String str3) {
        ITPDLProxyLogListener iTPDLProxyLogListener = mLogListener;
        if (iTPDLProxyLogListener != null) {
            iTPDLProxyLogListener.d(str, i10, str2, str3);
            return;
        }
        Log.d(Constants.ARRAY_TYPE + str2 + "][" + str + ":" + i10 + "]", str3);
    }

    public static void e(String str, int i10, String str2, String str3) {
        ITPDLProxyLogListener iTPDLProxyLogListener = mLogListener;
        if (iTPDLProxyLogListener != null) {
            iTPDLProxyLogListener.e(str, i10, str2, str3);
            return;
        }
        Log.e(Constants.ARRAY_TYPE + str2 + "][" + str + ":" + i10 + "]", str3);
    }

    public static void i(String str, int i10, String str2, String str3) {
        ITPDLProxyLogListener iTPDLProxyLogListener = mLogListener;
        if (iTPDLProxyLogListener != null) {
            iTPDLProxyLogListener.i(str, i10, str2, str3);
            return;
        }
        Log.i(Constants.ARRAY_TYPE + str2 + "][" + str + ":" + i10 + "]", str3);
    }

    public static void setLogListener(int i10, ITPDLProxyLogListener iTPDLProxyLogListener) {
        mServiceType = i10;
        mLogListener = iTPDLProxyLogListener;
    }

    public static void w(String str, int i10, String str2, String str3) {
        ITPDLProxyLogListener iTPDLProxyLogListener = mLogListener;
        if (iTPDLProxyLogListener != null) {
            iTPDLProxyLogListener.w(str, i10, str2, str3);
            return;
        }
        Log.w(Constants.ARRAY_TYPE + str2 + "][" + str + ":" + i10 + "]", str3);
    }
}
