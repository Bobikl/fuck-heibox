package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.service.XMPushService;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class ii implements XMPushService.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f107368a = false;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f580a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f107369b;

    public ii(Context context) {
        this.f581a = context;
    }

    private String a(String str) {
        return "com.xiaomi.xmsf".equals(str) ? "1000271" : this.f581a.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, null);
    }

    private void a(Context context) {
        this.f107369b = com.xiaomi.push.service.az.a(context).a(is.TinyDataUploadSwitch.a(), true);
        int iA = com.xiaomi.push.service.az.a(context).a(is.TinyDataUploadFrequency.a(), bb.c.g.Rc);
        this.f580a = iA;
        this.f580a = Math.max(60, iA);
    }

    public static void a(boolean z10) {
        f107368a = z10;
    }

    private boolean a() {
        return Math.abs((System.currentTimeMillis() / 1000) - this.f581a.getSharedPreferences("mipush_extra", 4).getLong("last_tiny_data_upload_timestamp", -1L)) > ((long) this.f580a);
    }

    private boolean a(im imVar) {
        if (!bg.b(this.f581a) || imVar == null || TextUtils.isEmpty(a(this.f581a.getPackageName())) || !new File(this.f581a.getFilesDir(), "tiny_data.data").exists() || f107368a) {
            return false;
        }
        return !com.xiaomi.push.service.az.a(this.f581a).a(is.ScreenOnOrChargingTinyDataUploadSwitch.a(), false) || i.m468a(this.f581a) || i.m471b(this.f581a);
    }

    @Override // com.xiaomi.push.service.XMPushService.n
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void mo482a() {
        a(this.f581a);
        if (this.f107369b && a()) {
            com.xiaomi.channel.commonutils.logger.b.m62a("TinyData TinyDataCacheProcessor.pingFollowUpAction ts:" + System.currentTimeMillis());
            im imVarA = il.a(this.f581a).a();
            if (a(imVarA)) {
                f107368a = true;
                ij.a(this.f581a, imVarA);
            } else {
                com.xiaomi.channel.commonutils.logger.b.m62a("TinyData TinyDataCacheProcessor.pingFollowUpAction !canUpload(uploader) ts:" + System.currentTimeMillis());
            }
        }
    }
}
