package com.huawei.hms.scankit.p;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsApp;
import java.util.Locale;

/* JADX INFO: compiled from: CountryCodeBean.java */
/* JADX INFO: loaded from: classes7.dex */
public class a1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f61515c = "a1";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f61516a = "UNKNOWN";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f61517b;

    public a1(Context context, boolean z10) {
        this.f61517b = "UNKNOWN";
        a(context, z10);
        this.f61517b = this.f61517b.toUpperCase(Locale.ENGLISH);
    }

    private void a(Context context, boolean z10) {
        if (context != null) {
            try {
                this.f61517b = GrsApp.getInstance().getIssueCountryCode(context);
                if (b()) {
                    Logger.i(f61515c, "getCountryCode unknown");
                }
            } catch (NullPointerException unused) {
                Logger.w(f61515c, "get CountryCode error");
            } catch (Exception unused2) {
                Logger.w(f61515c, "get CountryCode error");
            }
        }
    }

    private boolean b() {
        return !"UNKNOWN".equals(this.f61517b);
    }

    public String a() {
        return this.f61517b;
    }
}
