package com.heytap.mcssdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.heytap.mcssdk.utils.e;
import com.heytap.mcssdk.utils.g;
import com.heytap.mcssdk.utils.i;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import com.heytap.msp.push.mode.MessageStat;
import com.taobao.accs.common.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PushService.java */
/* JADX INFO: loaded from: classes7.dex */
public class d implements com.heytap.mcssdk.a {
    private static final String A = "pushSdkVersion";
    private static final int B = 23;
    private static final int C = 59;
    private static final int D = 24;
    private static final int E = 1000;
    private static final int F = 2;
    private static String H = null;
    private static boolean I = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f59906n = "Y29tLm1jcy5hY3Rpb24uUkVDRUlWRV9TREtfTUVTU0FHRQ==";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f59907o = "type";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f59908p = 1019;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f59909q = "eventID";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f59910r = "taskID";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f59911s = "appPackage";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f59912t = "extra";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f59913u = "messageType";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f59914v = "messageID";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f59915w = "globalID";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f59916x = "supportOpenPush";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f59917y = "versionName";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f59918z = "versionCode";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f59919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<com.heytap.mcssdk.processor.c> f59920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<com.heytap.mcssdk.parser.d> f59921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f59922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f59923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f59924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ICallBackResultService f59925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ISetAppNotificationCallBackService f59926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private IGetAppNotificationCallBackService f59927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ConcurrentHashMap<Integer, y9.a> f59928j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f59903k = {99, 111, 109, 46, 99, 111, 108, 111, 114, 111, 115, 46, 109, 99, 115};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f59904l = {99, 111, 109, 46, 99, 111, 108, 111, 114, 111, 115, 46, 109, 99, 115, 115, 100, 107, 46, 97, 99, 116, 105, 111, 110, 46, 82, 69, 67, 69, 73, 86, 69, 95, 83, 68, 75, 95, 77, 69, 83, 83, 65, 71, 69};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static String f59905m = "";
    private static int G = 0;

    /* JADX INFO: compiled from: PushService.java */
    public class a implements ServiceConnection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Intent f59929b;

        a(Intent intent) {
            this.f59929b = intent;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Bundle bundle = new Bundle();
            bundle.putAll(this.f59929b.getExtras());
            try {
                com.mcs.aidl.a.b.g(iBinder).X(bundle);
            } catch (Exception e10) {
                e.a("bindMcsService exception:" + e10);
            }
            d.this.f59919a.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: compiled from: PushService.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f59931a = new d(null);

        private b() {
        }
    }

    private d() {
        this.f59920b = new ArrayList();
        this.f59921c = new ArrayList();
        this.f59924f = null;
        synchronized (d.class) {
            int i10 = G;
            if (i10 > 0) {
                throw new RuntimeException("PushService can't create again!");
            }
            G = i10 + 1;
        }
        E(new com.heytap.mcssdk.parser.b());
        E(new com.heytap.mcssdk.parser.a());
        F(new com.heytap.mcssdk.processor.b());
        F(new com.heytap.mcssdk.processor.a());
        this.f59928j = new ConcurrentHashMap<>();
    }

    /* synthetic */ d(a aVar) {
        this();
    }

    private y9.a D(int i10) {
        if (!this.f59928j.containsKey(Integer.valueOf(i10))) {
            y9.a aVar = new y9.a(System.currentTimeMillis(), 1);
            this.f59928j.put(Integer.valueOf(i10), aVar);
            e.a("addCommandToMap :appBean is null");
            return aVar;
        }
        y9.a aVar2 = this.f59928j.get(Integer.valueOf(i10));
        if (!L(aVar2)) {
            aVar2.c(aVar2.a() + 1);
            e.a("addCommandToMap :appLimitBean.getCount() + 1");
            return aVar2;
        }
        aVar2.c(1);
        aVar2.d(System.currentTimeMillis());
        e.a("addCommandToMap : appLimitBean.setCount(1)");
        return aVar2;
    }

    private synchronized void E(com.heytap.mcssdk.parser.d dVar) {
        if (dVar != null) {
            this.f59921c.add(dVar);
        }
    }

    private synchronized void F(com.heytap.mcssdk.processor.c cVar) {
        if (cVar != null) {
            this.f59920b.add(cVar);
        }
    }

    private boolean H() throws IllegalArgumentException {
        return J() && K();
    }

    private boolean J() {
        return this.f59919a != null;
    }

    private boolean K() {
        return this.f59924f != null;
    }

    private boolean L(y9.a aVar) {
        long jB = aVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        e.a("checkTimeNeedUpdate : lastedTime " + jB + " currentTime:" + jCurrentTimeMillis);
        return jCurrentTimeMillis - jB > 1000;
    }

    public static d P() {
        return b.f59931a;
    }

    private Intent Q(int i10, String str, JSONObject jSONObject) {
        Intent intent = new Intent();
        intent.setAction(b0(this.f59919a));
        intent.setPackage(R(this.f59919a));
        intent.putExtra("type", i10);
        JSONObject jSONObject2 = new JSONObject();
        try {
            Context context = this.f59919a;
            jSONObject2.putOpt(f59917y, i.e(context, context.getPackageName()));
            Context context2 = this.f59919a;
            jSONObject2.putOpt(f59918z, Integer.valueOf(i.c(context2, context2.getPackageName())));
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject2.putOpt(next, jSONObject.get(next));
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            intent.putExtra(f59912t, jSONObject2.toString());
            throw th2;
        }
        intent.putExtra(f59912t, jSONObject2.toString());
        intent.putExtra("params", str);
        intent.putExtra("appPackage", this.f59919a.getPackageName());
        intent.putExtra("appKey", this.f59922d);
        intent.putExtra(x9.b.A, this.f59923e);
        intent.putExtra(x9.b.B, this.f59924f);
        intent.putExtra("sdkVersion", d0());
        return intent;
    }

    private String S(Context context) {
        if (TextUtils.isEmpty(f59905m)) {
            f59905m = new String(com.heytap.mcssdk.base.a.t(f59906n));
        }
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(new Intent(f59905m), 8192);
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        while (it.hasNext()) {
            String str = it.next().serviceInfo.packageName;
            try {
                boolean z10 = (context.getPackageManager().getApplicationInfo(str, 0).flags & 1) == 1;
                boolean z11 = context.getPackageManager().getPackageUid(str, 0) == context.getPackageManager().getPackageUid("android", 0);
                if (z10 || z11) {
                    return str;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return null;
    }

    public static int c0() {
        return 3100;
    }

    public static String d0() {
        return gg.a.f119052f;
    }

    private boolean h0(Context context) {
        if (this.f59919a == null) {
            this.f59919a = context.getApplicationContext();
        }
        String strR = R(this.f59919a);
        return i.f(this.f59919a, strR) && i.c(this.f59919a, strR) >= 1019 && i.g(this.f59919a, strR, f59916x);
    }

    @Deprecated
    private static void i0(Context context) {
        g.b(context, new MessageStat(context.getPackageName(), "app_start", null));
    }

    private void l0(int i10, String str, JSONObject jSONObject) {
        if (I(i10)) {
            ICallBackResultService iCallBackResultService = this.f59925g;
            if (iCallBackResultService != null) {
                iCallBackResultService.onError(O(i10), "api_call_too_frequently");
                return;
            }
            return;
        }
        try {
            this.f59919a.startService(Q(i10, str, jSONObject));
        } catch (Exception e10) {
            e.d("startMcsService--Exception" + e10.getMessage());
        }
    }

    private void m0(int i10, JSONObject jSONObject) {
        l0(i10, "", jSONObject);
    }

    @Override // com.heytap.mcssdk.a
    public void A(int i10) {
        f(i10, null);
    }

    @Override // com.heytap.mcssdk.a
    public void B() {
        j(null);
    }

    public void G(int i10) {
        if (!I(i10)) {
            Intent intentQ = Q(i10, "", null);
            this.f59919a.bindService(intentQ, new a(intentQ), 1);
        } else {
            ICallBackResultService iCallBackResultService = this.f59925g;
            if (iCallBackResultService != null) {
                iCallBackResultService.onError(O(i10), "api_call_too_frequently");
            }
        }
    }

    public boolean I(int i10) {
        return (i10 == 12291 || i10 == 12312 || D(i10).a() <= 2) ? false : true;
    }

    public Map<Integer, y9.a> M() {
        return this.f59928j;
    }

    public Context N() {
        return this.f59919a;
    }

    public int O(int i10) {
        switch (i10) {
            case 12289:
                return -1;
            case 12290:
                return -2;
            case 12291:
                return -14;
            default:
                switch (i10) {
                    case 12298:
                        return -11;
                    case 12299:
                        return -3;
                    case 12300:
                        return -4;
                    default:
                        switch (i10) {
                            case 12306:
                                return -10;
                            case 12307:
                                return -6;
                            case 12308:
                                return -7;
                            case 12309:
                                return -5;
                            case 12310:
                                return -8;
                            case 12311:
                                return -9;
                            case 12312:
                                return -13;
                            case 12313:
                                return -12;
                            default:
                                switch (i10) {
                                    case 12316:
                                        return -15;
                                    case 12317:
                                        return -16;
                                    case 12318:
                                        return -17;
                                    default:
                                        return 0;
                                }
                        }
                }
        }
    }

    public String R(Context context) {
        if (H == null) {
            String strS = S(context);
            if (strS == null) {
                H = i.a(f59903k);
                I = false;
            } else {
                H = strS;
                I = true;
            }
        }
        return H;
    }

    public List<com.heytap.mcssdk.parser.d> T() {
        return this.f59921c;
    }

    public List<com.heytap.mcssdk.processor.c> U() {
        return this.f59920b;
    }

    public ICallBackResultService V() {
        return this.f59925g;
    }

    public IGetAppNotificationCallBackService W() {
        return this.f59927i;
    }

    public ISetAppNotificationCallBackService X() {
        return this.f59926h;
    }

    public void Y() {
        if (H()) {
            m0(12306, null);
        } else if (V() != null) {
            V().onGetPushStatus(-2, 0);
        }
    }

    public int Z() {
        if (!J()) {
            return 0;
        }
        Context context = this.f59919a;
        return i.c(context, R(context));
    }

    @Override // com.heytap.mcssdk.a
    public void a(JSONObject jSONObject) {
        if (H()) {
            m0(12309, jSONObject);
        } else if (V() != null) {
            V().onGetNotificationStatus(-2, 0);
        }
    }

    public String a0() {
        if (!J()) {
            return "";
        }
        Context context = this.f59919a;
        return i.e(context, R(context));
    }

    @Override // com.heytap.mcssdk.a
    public String b() {
        return this.f59924f;
    }

    public String b0(Context context) {
        if (H == null) {
            S(context);
        }
        if (!I) {
            return i.a(f59904l);
        }
        if (TextUtils.isEmpty(f59905m)) {
            f59905m = new String(com.heytap.mcssdk.base.a.t(f59906n));
        }
        return f59905m;
    }

    @Override // com.heytap.mcssdk.a
    public void c() {
        if (J()) {
            G(12313);
        } else {
            e.e(e.f59958a, "please call the register first!");
        }
    }

    @Override // com.heytap.mcssdk.a
    public void d() {
        n(null);
    }

    @Override // com.heytap.mcssdk.a
    public void e(JSONObject jSONObject) {
        if (J()) {
            m0(12290, jSONObject);
        } else if (V() != null) {
            V().onUnRegister(-2);
        }
    }

    public d e0(Context context, boolean z10) {
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        f0(context);
        new com.heytap.mcssdk.manage.a().c(this.f59919a);
        e.r(z10);
        return this;
    }

    @Override // com.heytap.mcssdk.a
    public void f(int i10, JSONObject jSONObject) {
        if (!H()) {
            e.e(e.f59958a, "please call the register first!");
            return;
        }
        l0(12307, i10 + "", jSONObject);
    }

    public void f0(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f59919a = applicationContext;
        if (H == null) {
            String strS = S(applicationContext);
            if (strS == null) {
                H = i.a(f59903k);
                I = false;
            } else {
                H = strS;
                I = true;
            }
        }
    }

    @Override // com.heytap.mcssdk.a
    public void g() {
        r(null);
    }

    public boolean g0(Context context) {
        return h0(context);
    }

    @Override // com.heytap.mcssdk.a
    public void h(JSONObject jSONObject) {
        if (H()) {
            m0(12310, jSONObject);
        } else {
            e.e(e.f59958a, "please call the register first!");
        }
    }

    @Override // com.heytap.mcssdk.a
    public void i() {
        a(null);
    }

    @Override // com.heytap.mcssdk.a
    public void j(JSONObject jSONObject) {
        if (J()) {
            m0(12289, jSONObject);
        } else if (V() != null) {
            V().onRegister(-2, null);
        }
    }

    public void j0(String str, String str2) {
        this.f59922d = str;
        this.f59923e = str2;
    }

    @Override // com.heytap.mcssdk.a
    public void k() {
        u(null);
    }

    public void k0(ICallBackResultService iCallBackResultService) {
        this.f59925g = iCallBackResultService;
    }

    @Override // com.heytap.mcssdk.a
    public void l() {
        w(null);
    }

    @Override // com.heytap.mcssdk.a
    public void m(List<Integer> list, int i10, int i11, int i12, int i13, JSONObject jSONObject) throws IllegalArgumentException {
        if (!H()) {
            if (V() != null) {
                V().onSetPushTime(-2, "please call the register first!");
                return;
            }
            return;
        }
        if (list == null || list.size() <= 0 || i10 < 0 || i11 < 0 || i12 < i10 || i12 > 23 || i13 < i11 || i13 > 59) {
            throw new IllegalArgumentException("params are not all right,please check params");
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("weekDays", y9.b.g(list));
            jSONObject2.put("startHour", i10);
            jSONObject2.put("startMin", i11);
            jSONObject2.put("endHour", i12);
            jSONObject2.put("endMin", i13);
            l0(12298, jSONObject2.toString(), jSONObject);
        } catch (JSONException e10) {
            e.e(e.f59958a, e10.getLocalizedMessage());
        }
    }

    @Override // com.heytap.mcssdk.a
    public void n(JSONObject jSONObject) {
        if (J()) {
            m0(12311, jSONObject);
        } else {
            e.e(e.f59958a, "please call the register first!");
        }
    }

    public void n0(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        this.f59922d = str;
        this.f59923e = str2;
        this.f59919a = context.getApplicationContext();
        this.f59925g = iCallBackResultService;
        e(jSONObject);
    }

    @Override // com.heytap.mcssdk.a
    public void o(JSONObject jSONObject) {
        if (H()) {
            m0(12319, jSONObject);
        } else {
            e.e(e.f59958a, "please call the register first!");
        }
    }

    @Override // com.heytap.mcssdk.a
    public void p(Context context, String str, String str2, ICallBackResultService iCallBackResultService) {
        t(context, str, str2, null, iCallBackResultService);
    }

    @Override // com.heytap.mcssdk.a
    public void q(IGetAppNotificationCallBackService iGetAppNotificationCallBackService) {
        if (J()) {
            this.f59927i = iGetAppNotificationCallBackService;
            m0(12318, null);
        } else {
            IGetAppNotificationCallBackService iGetAppNotificationCallBackService2 = this.f59927i;
            if (iGetAppNotificationCallBackService2 != null) {
                iGetAppNotificationCallBackService2.onGetAppNotificationSwitch(-2, 0);
            }
        }
    }

    @Override // com.heytap.mcssdk.a
    public void r(JSONObject jSONObject) {
        if (H()) {
            m0(12299, jSONObject);
        } else {
            e.e(e.f59958a, "please call the register first!");
        }
    }

    @Override // com.heytap.mcssdk.a
    public void s(List<Integer> list, int i10, int i11, int i12, int i13) {
        m(list, i10, i11, i12, i13, null);
    }

    @Override // com.heytap.mcssdk.a
    public void t(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        if (context == null) {
            if (iCallBackResultService != null) {
                iCallBackResultService.onRegister(-2, null);
                return;
            }
            return;
        }
        if (this.f59919a == null) {
            this.f59919a = context.getApplicationContext();
        }
        if (!i.h(this.f59919a)) {
            if (iCallBackResultService != null) {
                iCallBackResultService.onRegister(-2, null);
                return;
            }
            return;
        }
        this.f59922d = str;
        this.f59923e = str2;
        this.f59925g = iCallBackResultService;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.putOpt(Constants.KEY_APP_VERSION_CODE, Integer.valueOf(i.b(context)));
            jSONObject.putOpt(Constants.KEY_APP_VERSION_NAME, i.d(context));
        } catch (JSONException e10) {
            e.d("register-Exception:" + e10.getMessage());
        }
        m0(12289, jSONObject);
    }

    @Override // com.heytap.mcssdk.a
    public void u(JSONObject jSONObject) {
        if (H()) {
            m0(12308, jSONObject);
        } else {
            e.e(e.f59958a, "please call the register first!");
        }
    }

    @Override // com.heytap.mcssdk.a
    public void unRegister() {
        e(null);
    }

    @Override // com.heytap.mcssdk.a
    public void v(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
        if (J()) {
            this.f59926h = iSetAppNotificationCallBackService;
            m0(12317, null);
        } else if (V() != null) {
            this.f59926h.onSetAppNotificationSwitch(-2);
        }
    }

    @Override // com.heytap.mcssdk.a
    public void w(JSONObject jSONObject) {
        if (H()) {
            m0(12300, jSONObject);
        } else {
            e.e(e.f59958a, "please call the register first!");
        }
    }

    @Override // com.heytap.mcssdk.a
    public void x() {
        h(null);
    }

    @Override // com.heytap.mcssdk.a
    public void y(String str) {
        this.f59924f = str;
    }

    @Override // com.heytap.mcssdk.a
    public void z(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
        if (J()) {
            this.f59926h = iSetAppNotificationCallBackService;
            m0(12316, null);
        } else {
            ISetAppNotificationCallBackService iSetAppNotificationCallBackService2 = this.f59926h;
            if (iSetAppNotificationCallBackService2 != null) {
                iSetAppNotificationCallBackService2.onSetAppNotificationSwitch(-2);
            }
        }
    }
}
