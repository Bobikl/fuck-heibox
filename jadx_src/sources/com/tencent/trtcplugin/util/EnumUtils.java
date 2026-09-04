package com.tencent.trtcplugin.util;

/* JADX INFO: loaded from: classes4.dex */
public class EnumUtils {
    public static int getPublishMode(int i10) {
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    i11 = 4;
                    if (i10 != 4) {
                        return 0;
                    }
                }
            }
        }
        return i11;
    }

    public static int getVideoRenderFillMode(int i10) {
        return i10 != 1 ? 0 : 1;
    }

    public static int getVideoStreamType(int i10) {
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                return 0;
            }
        }
        return i11;
    }
}
