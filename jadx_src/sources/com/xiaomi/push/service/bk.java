package com.xiaomi.push.service;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.xiaomi.push.C1339r;
import com.xiaomi.push.cz;
import com.xiaomi.push.dc;
import com.xiaomi.push.dd;
import com.xiaomi.push.ew;
import com.xiaomi.push.ex;
import com.xiaomi.push.ge;
import com.xiaomi.push.gm;
import com.xiaomi.push.go;
import com.xiaomi.push.hb;
import com.xiaomi.push.id;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class bk extends bw.a implements dd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f107957a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private XMPushService f1052a;

    public static class a implements dd.b {
        a() {
        }

        @Override // com.xiaomi.push.dd.b
        public String a(String str) throws IOException {
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter("sdkver", String.valueOf(48));
            builderBuildUpon.appendQueryParameter("osver", String.valueOf(Build.VERSION.SDK_INT));
            builderBuildUpon.appendQueryParameter("os", id.a(Build.MODEL + ":" + Build.VERSION.INCREMENTAL));
            builderBuildUpon.appendQueryParameter("mi", String.valueOf(C1339r.a()));
            String string = builderBuildUpon.toString();
            com.xiaomi.channel.commonutils.logger.b.c("fetch bucket from : " + string);
            URL url = new URL(string);
            int port = url.getPort() == -1 ? 80 : url.getPort();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strA = com.xiaomi.push.bg.a(C1339r.m655a(), url);
                go.a(url.getHost() + ":" + port, (int) (System.currentTimeMillis() - jCurrentTimeMillis), null);
                return strA;
            } catch (IOException e10) {
                go.a(url.getHost() + ":" + port, -1, e10);
                throw e10;
            }
        }
    }

    public static class b extends dd {
        protected b(Context context, dc dcVar, dd.b bVar, String str) {
            super(context, dcVar, bVar, str);
        }

        @Override // com.xiaomi.push.dd
        protected String a(ArrayList<String> arrayList, String str, String str2, boolean z10) throws IOException {
            try {
                if (gm.m407a().m412a()) {
                    str2 = bw.m738a();
                }
                return super.a(arrayList, str, str2, z10);
            } catch (IOException e10) {
                go.a(0, ge.GSLB_ERR.a(), 1, null, com.xiaomi.push.bg.c(dd.f106948a) ? 1 : 0);
                throw e10;
            }
        }
    }

    bk(XMPushService xMPushService) {
        this.f1052a = xMPushService;
    }

    public static void a(XMPushService xMPushService) {
        bk bkVar = new bk(xMPushService);
        bw.a().a(bkVar);
        synchronized (dd.class) {
            dd.a(bkVar);
            dd.a(xMPushService, null, new a(), "0", "push", "2.2");
        }
    }

    @Override // com.xiaomi.push.dd.a
    public dd a(Context context, dc dcVar, dd.b bVar, String str) {
        return new b(context, dcVar, bVar, str);
    }

    @Override // com.xiaomi.push.service.bw.a
    public void a(ew.a aVar) {
    }

    @Override // com.xiaomi.push.service.bw.a
    public void a(ex.b bVar) {
        cz czVarB;
        if (bVar.m312b() && bVar.m311a() && System.currentTimeMillis() - this.f107957a > 3600000) {
            com.xiaomi.channel.commonutils.logger.b.m62a("fetch bucket :" + bVar.m311a());
            this.f107957a = System.currentTimeMillis();
            dd ddVarA = dd.a();
            ddVarA.m243a();
            ddVarA.m246b();
            hb hbVarM679a = this.f1052a.m679a();
            if (hbVarM679a == null || (czVarB = ddVarA.b(hbVarM679a.m438a().c())) == null) {
                return;
            }
            ArrayList<String> arrayListM230a = czVarB.m230a();
            boolean z10 = true;
            Iterator<String> it = arrayListM230a.iterator();
            while (it.hasNext()) {
                if (it.next().equals(hbVarM679a.mo439a())) {
                    z10 = false;
                    break;
                }
            }
            if (!z10 || arrayListM230a.isEmpty()) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.m62a("bucket changed, force reconnect");
            this.f1052a.a(0, (Exception) null);
            this.f1052a.a(false);
        }
    }
}
