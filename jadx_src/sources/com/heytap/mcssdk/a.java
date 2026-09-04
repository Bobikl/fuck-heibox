package com.heytap.mcssdk;

import android.content.Context;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: IPushService.java */
/* JADX INFO: loaded from: classes7.dex */
public interface a {
    @Deprecated
    void A(int i10);

    void B();

    void a(JSONObject jSONObject);

    String b();

    void c();

    void d();

    void e(JSONObject jSONObject);

    @Deprecated
    void f(int i10, JSONObject jSONObject);

    void g();

    void h(JSONObject jSONObject);

    void i();

    void j(JSONObject jSONObject);

    @Deprecated
    void k();

    void l();

    void m(List<Integer> list, int i10, int i11, int i12, int i13, JSONObject jSONObject);

    void n(JSONObject jSONObject);

    void o(JSONObject jSONObject);

    void p(Context context, String str, String str2, ICallBackResultService iCallBackResultService);

    void q(IGetAppNotificationCallBackService iGetAppNotificationCallBackService);

    void r(JSONObject jSONObject);

    void s(List<Integer> list, int i10, int i11, int i12, int i13);

    void t(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService);

    @Deprecated
    void u(JSONObject jSONObject);

    void unRegister();

    void v(ISetAppNotificationCallBackService iSetAppNotificationCallBackService);

    void w(JSONObject jSONObject);

    void x();

    void y(String str);

    void z(ISetAppNotificationCallBackService iSetAppNotificationCallBackService);
}
