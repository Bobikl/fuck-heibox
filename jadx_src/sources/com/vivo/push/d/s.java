package com.vivo.push.d;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;
import java.util.HashMap;

/* JADX INFO: compiled from: OnNotificationArrivedReceiveTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ InsideNotificationItem f106558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.q f106559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ r f106560c;

    s(r rVar, InsideNotificationItem insideNotificationItem, com.vivo.push.b.q qVar) {
        this.f106560c = rVar;
        this.f106558a = insideNotificationItem;
        this.f106559b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        r rVar = this.f106560c;
        if (((z) rVar).f106569b.onNotificationMessageArrived(((com.vivo.push.l) rVar).f106610a, com.vivo.push.util.q.a(this.f106558a))) {
            com.vivo.push.util.p.b("OnNotificationArrivedTask", "pkg name : " + ((com.vivo.push.l) this.f106560c).f106610a.getPackageName() + " 应用主动拦截通知");
            com.vivo.push.util.p.b(((com.vivo.push.l) this.f106560c).f106610a, "应用主动拦截通知，导致通知无法展示，如需打开请在onNotificationMessageArrived中返回false");
            HashMap map = new HashMap();
            map.put(x9.b.f141138c, String.valueOf(this.f106559b.f()));
            String strB = com.vivo.push.util.z.b(((com.vivo.push.l) this.f106560c).f106610a, ((com.vivo.push.l) this.f106560c).f106610a.getPackageName());
            if (!TextUtils.isEmpty(strB)) {
                map.put("remoteAppId", strB);
            }
            com.vivo.push.util.e.a(2120L, map);
            return;
        }
        int iB = this.f106560c.b();
        if (iB > 0) {
            com.vivo.push.util.p.b("OnNotificationArrivedTask", "pkg name : " + ((com.vivo.push.l) this.f106560c).f106610a.getPackageName() + " notify channel switch is " + iB);
            com.vivo.push.util.p.b(((com.vivo.push.l) this.f106560c).f106610a, "允许通知开关或者推送通知渠道开关关闭，导致通知无法展示，请到设置页打开应用通知开关 ".concat(String.valueOf(iB)));
            HashMap map2 = new HashMap();
            map2.put(x9.b.f141138c, String.valueOf(this.f106559b.f()));
            String strB2 = com.vivo.push.util.z.b(((com.vivo.push.l) this.f106560c).f106610a, ((com.vivo.push.l) this.f106560c).f106610a.getPackageName());
            if (!TextUtils.isEmpty(strB2)) {
                map2.put("remoteAppId", strB2);
            }
            com.vivo.push.util.e.a(iB, map2);
            return;
        }
        Context context = ((com.vivo.push.l) this.f106560c).f106610a;
        InsideNotificationItem insideNotificationItem = this.f106558a;
        long jF = this.f106559b.f();
        r rVar2 = this.f106560c;
        com.vivo.push.util.k kVar = new com.vivo.push.util.k(context, insideNotificationItem, jF, ((z) rVar2).f106569b.isAllowNet(((com.vivo.push.l) rVar2).f106610a), new t(this));
        boolean zIsShowBigPicOnMobileNet = this.f106558a.isShowBigPicOnMobileNet();
        String purePicUrl = this.f106558a.getPurePicUrl();
        if (TextUtils.isEmpty(purePicUrl)) {
            purePicUrl = this.f106558a.getCoverUrl();
        }
        if (!TextUtils.isEmpty(purePicUrl)) {
            com.vivo.push.util.p.c("OnNotificationArrivedTask", "showCode=".concat(String.valueOf(zIsShowBigPicOnMobileNet)));
            if (zIsShowBigPicOnMobileNet) {
                com.vivo.push.util.p.a(((com.vivo.push.l) this.f106560c).f106610a, "mobile net show");
            } else {
                com.vivo.push.util.p.a(((com.vivo.push.l) this.f106560c).f106610a, "mobile net unshow");
                NetworkInfo networkInfoA = com.vivo.push.util.r.a(((com.vivo.push.l) this.f106560c).f106610a);
                if (networkInfoA != null && networkInfoA.getState() == NetworkInfo.State.CONNECTED) {
                    int type = networkInfoA.getType();
                    if (type == 1) {
                        c10 = 2;
                    } else {
                        c10 = type == 0 ? (char) 1 : (char) 3;
                    }
                } else {
                    c10 = 0;
                }
                if (c10 == 1) {
                    purePicUrl = null;
                    this.f106558a.clearCoverUrl();
                    this.f106558a.clearPurePicUrl();
                }
            }
        }
        kVar.execute(this.f106558a.getIconUrl(), purePicUrl);
    }
}
