package com.huawei.hms.framework.network.grs.h;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f60859a = "c";

    public static String a(String str, Context context) {
        Logger.d(f60859a, "Io getConfigContent, fileName: " + str);
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        InputStream inputStreamOpen = null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                if (!new File(str).isDirectory()) {
                    inputStreamOpen = context.getAssets().open(str);
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i10 = inputStreamOpen.read(bArr);
                        if (i10 == -1) {
                            byteArrayOutputStream.flush();
                            return byteArrayOutputStream.toString("UTF-8");
                        }
                        byteArrayOutputStream.write(bArr, 0, i10);
                    }
                }
            } catch (IOException unused) {
                Logger.w(f60859a, "local config file is not exist.filename is {%s}", str);
            }
            return "";
        } finally {
            IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
            IoUtils.closeSecure(inputStreamOpen);
        }
    }
}
