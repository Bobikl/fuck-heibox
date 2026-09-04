package b6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    public static final class a implements Callable<WifiInfo> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f30407b;

        public a(Context context) {
            this.f30407b = context;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WifiInfo call() {
            return ((WifiManager) this.f30407b.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
        }
    }

    /* JADX INFO: renamed from: b6.b$b, reason: collision with other inner class name */
    public static final class C0258b implements b6.a.InterfaceC0257a<Object, Boolean> {
        @Override // b6.a.InterfaceC0257a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    public static final class c implements Callable<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f30408b;

        public c(Context context) {
            this.f30408b = context;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            return p4.c.a(this.f30408b);
        }
    }

    public static final class d implements b6.a.InterfaceC0257a<Object, Boolean> {
        @Override // b6.a.InterfaceC0257a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof NetworkInfo) || obj == null);
        }
    }

    public static final class e implements Callable<NetworkInfo> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f30409b;

        public e(Context context) {
            this.f30409b = context;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NetworkInfo call() {
            return ((ConnectivityManager) this.f30409b.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        }
    }

    public static final class f implements b6.a.InterfaceC0257a<Object, Boolean> {
        @Override // b6.a.InterfaceC0257a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    public static final class g implements Callable<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f30410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x5.a f30411c;

        public g(Context context, x5.a aVar) {
            this.f30410b = context;
            this.f30411c = aVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            try {
                return o5.a.c(this.f30410b);
            } catch (Throwable th2) {
                h5.a.i(this.f30411c, h5.b.f119119o, h5.b.f119131u, th2.getClass().getName());
                return "";
            }
        }
    }

    public static final class h implements b6.a.InterfaceC0257a<Object, Boolean> {
        @Override // b6.a.InterfaceC0257a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    public static final class i implements Callable<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f30413c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f30414d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x5.a f30415e;

        public class a implements APSecuritySdk.InitResultListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String[] f30416a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConditionVariable f30417b;

            public a(String[] strArr, ConditionVariable conditionVariable) {
                this.f30416a = strArr;
                this.f30417b = conditionVariable;
            }

            @Override // com.alipay.apmobilesecuritysdk.face.APSecuritySdk.InitResultListener
            public void onResult(APSecuritySdk.TokenResult tokenResult) {
                if (tokenResult != null) {
                    this.f30416a[0] = tokenResult.apdidToken;
                }
                this.f30417b.open();
            }
        }

        public i(String str, String str2, Context context, x5.a aVar) {
            this.f30412b = str;
            this.f30413c = str2;
            this.f30414d = context;
            this.f30415e = aVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            HashMap map = new HashMap();
            map.put("tid", this.f30412b);
            map.put("utdid", this.f30413c);
            String[] strArr = {""};
            try {
                APSecuritySdk aPSecuritySdk = APSecuritySdk.getInstance(this.f30414d);
                ConditionVariable conditionVariable = new ConditionVariable();
                aPSecuritySdk.initToken(0, map, new a(strArr, conditionVariable));
                conditionVariable.block(3000L);
            } catch (Throwable th2) {
                z5.e.d(th2);
                h5.a.i(this.f30415e, h5.b.f119119o, h5.b.f119125r, th2.getClass().getName());
            }
            if (TextUtils.isEmpty(strArr[0])) {
                h5.a.i(this.f30415e, h5.b.f119119o, h5.b.f119127s, "missing token");
            }
            return strArr[0];
        }
    }

    public static final class j implements b6.a.InterfaceC0257a<Object, Boolean> {
        @Override // b6.a.InterfaceC0257a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof WifiInfo) || obj == null);
        }
    }

    public static NetworkInfo a(x5.a aVar, Context context) {
        Context contextA = b6.a.a(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (NetworkInfo) b6.a.c(2, 10L, timeUnit, new d(), new e(contextA), false, 10L, timeUnit, aVar, false);
    }

    public static String b(x5.a aVar, Context context, String str, String str2) {
        Context contextA = b6.a.a(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (String) b6.a.c(4, 10L, timeUnit, new h(), new i(str, str2, contextA, aVar), true, 3L, timeUnit, aVar, true);
    }

    public static String c(x5.a aVar, Context context) {
        if (!l5.a.d().L()) {
            return "";
        }
        return (String) b6.a.c(1, 1L, TimeUnit.DAYS, new C0258b(), new c(b6.a.a(context)), true, 200L, TimeUnit.MILLISECONDS, aVar, true);
    }

    public static String d(x5.a aVar, Context context) {
        return (String) b6.a.c(3, 1L, TimeUnit.DAYS, new f(), new g(b6.a.a(context), aVar), true, 3L, TimeUnit.SECONDS, aVar, false);
    }

    public static WifiInfo e(x5.a aVar, Context context) {
        Context contextA = b6.a.a(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (WifiInfo) b6.a.c(5, 10L, timeUnit, new j(), new a(contextA), false, 10L, timeUnit, aVar, false);
    }
}
