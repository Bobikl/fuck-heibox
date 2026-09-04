package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.push.in;
import com.xiaomi.push.ja;
import com.xiaomi.push.jj;
import com.xiaomi.push.jm;
import com.xiaomi.push.jx;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class t extends XMPushService.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f108035a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f1112a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ List f1113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f108036b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(s sVar, int i10, String str, List list, String str2) {
        super(i10);
        this.f108035a = sVar;
        this.f1112a = str;
        this.f1113a = list;
        this.f108036b = str2;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "Send tiny data.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo404a() {
        String strA = this.f108035a.a(this.f1112a);
        ArrayList<jm> arrayListA = ca.a(this.f1113a, this.f1112a, strA, 32768);
        if (arrayListA == null) {
            com.xiaomi.channel.commonutils.logger.b.d("TinyData LongConnUploader.upload Get a null XmPushActionNotification list when TinyDataHelper.pack() in XMPushService.");
            return;
        }
        for (jm jmVar : arrayListA) {
            jmVar.a("uploadWay", "longXMPushService");
            jj jjVarA = ai.a(this.f1112a, strA, jmVar, in.Notification);
            if (!TextUtils.isEmpty(this.f108036b) && !TextUtils.equals(this.f1112a, this.f108036b)) {
                if (jjVarA.m564a() == null) {
                    ja jaVar = new ja();
                    jaVar.a("-1");
                    jjVarA.a(jaVar);
                }
                jjVarA.m564a().b("ext_traffic_source_pkg", this.f108036b);
            }
            this.f108035a.f108034a.a(this.f1112a, jx.a(jjVarA), true);
        }
    }
}
