package com.taobao.agoo.a.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.j;
import com.taobao.accs.utl.o;
import com.taobao.accs.utl.p;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class c extends b {
    public static final String JSON_CMD_REGISTER = "register";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f98535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f98536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f98537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f98538d = String.valueOf(221);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f98539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f98540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f98541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f98542i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f98543j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f98544k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f98545l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f98546m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f98547n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f98548o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f98549p;

    public static byte[] a(Context context, String str, String str2) {
        c cVar;
        try {
            String strJ = UtilityImpl.j(context);
            String packageName = context.getPackageName();
            String str3 = GlobalClientInfo.getInstance(context).getPackageInfo().versionName;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(strJ) && !TextUtils.isEmpty(str3)) {
                cVar = new c();
                try {
                    cVar.f98534e = "register";
                    cVar.f98535a = str;
                    cVar.f98536b = strJ;
                    cVar.f98537c = str3;
                    cVar.f98539f = str2;
                    cVar.f98540g = packageName;
                    cVar.f98543j = Build.BRAND;
                    cVar.f98544k = Build.MODEL;
                    String strC = j.c(context);
                    cVar.f98541h = strC;
                    UtilityImpl.a(context, Constants.SP_CHANNEL_FILE_NAME, strC);
                    cVar.f98542i = new o().a();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        ALog.w("RegisterDO", "buildRegister", th.getMessage());
                        if (cVar == null) {
                            return null;
                        }
                    } catch (Throwable th3) {
                        if (cVar != null) {
                            cVar.a();
                        }
                        throw th3;
                    }
                }
                return cVar.a();
            }
            ALog.e("RegisterDO", "buildRegister param null", "appKey", str, "utdid", strJ, "appVersion", str3);
            return null;
        } catch (Throwable th4) {
            th = th4;
            cVar = null;
        }
    }

    public byte[] a() {
        try {
            String string = new p.a().a(b.JSON_CMD, this.f98534e).a("appKey", this.f98535a).a("utdid", this.f98536b).a("appVersion", this.f98537c).a("sdkVersion", this.f98538d).a(Constants.KEY_TTID, this.f98539f).a("packageName", this.f98540g).a("notifyEnable", this.f98541h).a("romInfo", this.f98542i).a("c0", this.f98543j).a("c1", this.f98544k).a("c2", this.f98545l).a("c3", this.f98546m).a("c4", this.f98547n).a("c5", this.f98548o).a("c6", this.f98549p).a().toString();
            ALog.i("RegisterDO", "buildData", "data", string);
            return string.getBytes("utf-8");
        } catch (Throwable th2) {
            ALog.e("RegisterDO", "buildData", th2, new Object[0]);
            return null;
        }
    }
}
