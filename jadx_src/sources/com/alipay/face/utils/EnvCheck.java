package com.alipay.face.utils;

import android.os.Build;
import com.alipay.face.camera.utils.a;

/* JADX INFO: loaded from: classes6.dex */
public class EnvCheck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f39111a = 18;

    public enum EnvErrorType {
        ENV_SUCCESS,
        ENV_ERROR_LOW_OS,
        ENV_ERROR_UNSUPPORTED_CPU,
        ENV_ERROR_NO_PERMISSION_OF_CAMERA,
        ENV_ERROR_NO_FRONT_CAMERA
    }

    public static EnvErrorType a() {
        if (b()) {
            return EnvErrorType.ENV_ERROR_LOW_OS;
        }
        return a.c() == -1 ? EnvErrorType.ENV_ERROR_NO_FRONT_CAMERA : EnvErrorType.ENV_SUCCESS;
    }

    private static boolean b() {
        String str = Build.VERSION.SDK;
        return str != null && Integer.parseInt(str) < 18;
    }
}
