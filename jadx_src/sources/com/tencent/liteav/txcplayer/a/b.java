package com.tencent.liteav.txcplayer.a;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i10 = 0; i10 < codecCount; i10++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                if (!codecInfoAt.isEncoder()) {
                    for (String str2 : codecInfoAt.getSupportedTypes()) {
                        if (str2.equalsIgnoreCase(str)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            LiteavLog.e("MediaCodecUtils", "isMimeTypeSupported exception: " + th2.getMessage());
        }
        return false;
    }
}
