package com.apm.lite.g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.lite.runtime.p;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile UUID f39952a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f39953b = "";

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private a(Context context) {
        if (f39952a == null) {
            synchronized (a.class) {
                if (f39952a == null) {
                    String string = null;
                    String strC = p.b().c(null);
                    if (strC != null) {
                        f39952a = UUID.fromString(strC);
                    } else {
                        try {
                            string = Settings.Secure.getString(context.getContentResolver(), SocializeProtocolConstants.PROTOCOL_KEY_ANDROID_ID);
                        } catch (Throwable unused) {
                        }
                        try {
                            f39952a = string != null ? UUID.nameUUIDFromBytes(string.getBytes("utf8")) : UUID.randomUUID();
                        } catch (Throwable unused2) {
                        }
                        try {
                            p.b().l(f39952a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }

    public static synchronized String a(Context context) {
        UUID uuidB;
        if (TextUtils.isEmpty(f39953b) && (uuidB = new a(context).b()) != null) {
            f39953b = uuidB.toString();
        }
        return f39953b;
    }

    public UUID b() {
        return f39952a;
    }
}
