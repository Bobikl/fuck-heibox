package com.vivo.push.d;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.util.NotifyAdapterUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: OnNotificationClickTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends z {
    u(com.vivo.push.o oVar) {
        super(oVar);
    }

    private void a(UPSNotificationMessage uPSNotificationMessage) {
        com.vivo.push.m.c(new w(this, uPSNotificationMessage));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Intent b(Intent intent, Map<String, String> map) {
        if (map != null && map.entrySet() != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null && entry.getKey() != null) {
                    intent.putExtra(entry.getKey(), entry.getValue());
                }
            }
        }
        return intent;
    }

    @Override // com.vivo.push.l
    protected final void a(com.vivo.push.o oVar) {
        com.vivo.push.b.p pVar = (com.vivo.push.b.p) oVar;
        InsideNotificationItem insideNotificationItemF = pVar.f();
        if (insideNotificationItemF == null) {
            com.vivo.push.util.p.d("OnNotificationClickTask", "current notification item is null");
            return;
        }
        UPSNotificationMessage uPSNotificationMessageA = com.vivo.push.util.q.a(insideNotificationItemF);
        boolean zEquals = this.f106610a.getPackageName().equals(pVar.d());
        if (zEquals) {
            NotifyAdapterUtil.cancelNotify(this.f106610a);
        }
        if (!zEquals) {
            com.vivo.push.util.p.a("OnNotificationClickTask", "notify is " + uPSNotificationMessageA + " ; isMatch is " + zEquals);
            return;
        }
        com.vivo.push.b.x xVar = new com.vivo.push.b.x(1030L);
        HashMap<String, String> map = new HashMap<>();
        map.put("type", "2");
        map.put(x9.b.f141138c, String.valueOf(pVar.e()));
        map.put("platform", this.f106610a.getPackageName());
        Context context = this.f106610a;
        String strB = com.vivo.push.util.z.b(context, context.getPackageName());
        if (!TextUtils.isEmpty(strB)) {
            map.put("remoteAppId", strB);
        }
        xVar.a(map);
        com.vivo.push.e.a().a(xVar);
        com.vivo.push.util.p.d("OnNotificationClickTask", "notification is clicked by skip type[" + uPSNotificationMessageA.getSkipType() + "]");
        int skipType = uPSNotificationMessageA.getSkipType();
        boolean z10 = true;
        if (skipType == 1) {
            new Thread(new v(this, this.f106610a, uPSNotificationMessageA.getParams())).start();
            a(uPSNotificationMessageA);
            return;
        }
        if (skipType == 2) {
            String skipContent = uPSNotificationMessageA.getSkipContent();
            if (!skipContent.startsWith("http://") && !skipContent.startsWith("https://")) {
                z10 = false;
            }
            if (z10) {
                Uri uri = Uri.parse(skipContent);
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.setFlags(268435456);
                b(intent, uPSNotificationMessageA.getParams());
                try {
                    this.f106610a.startActivity(intent);
                } catch (Exception unused) {
                    com.vivo.push.util.p.a("OnNotificationClickTask", "startActivity error : ".concat(String.valueOf(uri)));
                }
            } else {
                com.vivo.push.util.p.a("OnNotificationClickTask", "url not legal");
            }
            a(uPSNotificationMessageA);
            return;
        }
        if (skipType == 3) {
            a(uPSNotificationMessageA);
            return;
        }
        if (skipType != 4) {
            com.vivo.push.util.p.a("OnNotificationClickTask", "illegitmacy skip type error : " + uPSNotificationMessageA.getSkipType());
            return;
        }
        String skipContent2 = uPSNotificationMessageA.getSkipContent();
        try {
            Intent uri2 = Intent.parseUri(skipContent2, 1);
            String str = uri2.getPackage();
            if (!TextUtils.isEmpty(str) && !this.f106610a.getPackageName().equals(str)) {
                com.vivo.push.util.p.a("OnNotificationClickTask", "open activity error : local pkgName is " + this.f106610a.getPackageName() + "; but remote pkgName is " + uri2.getPackage());
                return;
            }
            String packageName = uri2.getComponent() == null ? null : uri2.getComponent().getPackageName();
            if (!TextUtils.isEmpty(packageName) && !this.f106610a.getPackageName().equals(packageName)) {
                com.vivo.push.util.p.a("OnNotificationClickTask", "open activity component error : local pkgName is " + this.f106610a.getPackageName() + "; but remote pkgName is " + uri2.getPackage());
                return;
            }
            uri2.setSelector(null);
            uri2.setPackage(this.f106610a.getPackageName());
            uri2.addFlags(335544320);
            b(uri2, uPSNotificationMessageA.getParams());
            ActivityInfo activityInfoResolveActivityInfo = uri2.resolveActivityInfo(this.f106610a.getPackageManager(), 65536);
            if (activityInfoResolveActivityInfo == null || activityInfoResolveActivityInfo.exported) {
                this.f106610a.startActivity(uri2);
                a(uPSNotificationMessageA);
            } else {
                com.vivo.push.util.p.a("OnNotificationClickTask", "activity is not exported : " + activityInfoResolveActivityInfo.toString());
            }
        } catch (Exception e10) {
            com.vivo.push.util.p.a("OnNotificationClickTask", "open activity error : ".concat(String.valueOf(skipContent2)), e10);
        }
    }
}
