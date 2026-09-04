package cn.fly.verify;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import cn.fly.verify.common.exception.VerifyErr;
import cn.fly.verify.common.exception.VerifyException;
import com.taobao.accs.common.Constants;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static j f36865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final av f36866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gd f36867c = new gd();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fu f36868d;

    public static class a<T> {
        public void a(VerifyException verifyException) {
        }

        public void a(T t10) {
        }
    }

    private j(boolean z10) {
        String str;
        String str2;
        if (z10) {
            str = "97ef82c15a0d8f056f3eabe8e06adc47dccef8b3bc45824ebf1b0e4d04ad696ce390a719f23bfd726a709fccfbd8074cecf1cddfc5989a9c1d99ccd829d8991b";
            str2 = "1eac6c0206e34ff3d7cc558d05f657a99dc01bd75f44a72cd86a875ff8fa97e3b024627a68374ab90eddee7f182b9dcee2f64f97113e7473673e6b293d416220d725a60552c679bc37d1826982e0b9ef000c8d202126d665acf3698c1eae656eb0d06b6c0b923ff0f4194aa46634634c39c854bd75086b66eff132dc308746d3";
        } else {
            str = "d008219b14c84872559aaf9e69d1348175289c186912da64b2393bab376bb0d6b471220cb29cbc9875b148b593eb9d7c4c359549a1aff22f6de9d18d22f0b6cb";
            str2 = "1f228b2b8fbb7317674db20bab1d4b0f0ddb3e1f3a93177f1821c026ffd7c6b782be720a308ab69bf6c631c3c0c4d68bf9d92ddaaf712a032d591ba1c296df13332a23e37b281e5fd9b93ab016dd3efc5de45e264ed692ac63ac40013f507cd272b7aeeb85be9fe2f31f11b8c55d904b5331932c70c7cf3f2b05cb802f6b89a7";
        }
        this.f36866b = new av(1024, str, str2);
        this.f36868d = new fu();
    }

    public static j a(boolean z10) {
        if (f36865a == null) {
            synchronized (j.class) {
                if (f36865a == null) {
                    f36865a = new j(z10);
                }
            }
        }
        return f36865a;
    }

    public HashMap a(String str, e eVar) throws VerifyException {
        HashMap mapA;
        if (ax.h()) {
            throw new VerifyException(VerifyErr.C_PRIVACY_NOT_ACCEPTED_ERROR);
        }
        try {
            HashMap<String, String> map = new HashMap<>();
            map.put("appkey", ax.d());
            fu.a aVar = new fu.a();
            aVar.f36613b = 3000;
            aVar.f36612a = 5000;
            String strA = this.f36868d.a(str, (HashMap<String, Object>) null, map, aVar);
            long jUptimeMillis = SystemClock.uptimeMillis();
            boolean z10 = false;
            byte[] bArrDecode = Base64.decode(strA, 0);
            String strG = aq.g();
            if (TextUtils.isEmpty(strG)) {
                strG = ai.a().i();
            }
            JSONObject jSONObject = new JSONObject(ga.a(strG, bArrDecode));
            boolean z11 = true;
            try {
                mapA = this.f36867c.a(jSONObject.optString(Constants.SEND_TYPE_RES));
            } catch (Throwable unused) {
                mapA = null;
                z10 = true;
            }
            int iOptInt = jSONObject.optInt("status");
            String strOptString = jSONObject.optString("error");
            if (eVar != null) {
                eVar.a((String) null, (String) null, "config_decode", String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            }
            if (iOptInt == 200 && !z10) {
                z11 = z10;
            }
            if (z11) {
                throw new VerifyException(VerifyErr.C_Init_Server_Error.getCode(), strOptString);
            }
            if (mapA != null) {
                return mapA;
            }
            throw new VerifyException(VerifyErr.C_Init_Server_Error.getCode(), strOptString);
        } catch (Throwable th2) {
            f.a().c("[FlyVerify] ==>%s", "cdn init error: " + as.a(th2));
            if (th2 instanceof VerifyException) {
                throw th2;
            }
            throw new VerifyException(VerifyErr.C_INIT_UNEXPECTED_ERROR.getCode(), as.a(th2));
        }
    }

    public HashMap<String, Object> a(HashMap<String, Object> map, String str) throws Throwable {
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("appkey", ax.d());
        return (HashMap) this.f36866b.a(map2, map, str, false);
    }

    public void a(HashMap<String, Object> map, String str, a<HashMap> aVar) {
        a(map, str, false, aVar);
    }

    public void a(HashMap<String, Object> map, String str, boolean z10, a<HashMap> aVar) {
        VerifyException verifyException;
        if (ax.h()) {
            return;
        }
        try {
            HashMap<String, String> map2 = new HashMap<>();
            map2.put("appkey", ax.d());
            HashMap map3 = (HashMap) this.f36866b.a(map2, map, str, false);
            if (z10) {
                if (map3 != null && !map3.isEmpty()) {
                    verifyException = new VerifyException(VerifyErr.C_RESPONSE_DATA_ABNORMAL);
                    aVar.a(verifyException);
                    return;
                }
                aVar.a(map3);
            }
            if (map3 == null || map3.isEmpty()) {
                verifyException = new VerifyException(VerifyErr.C_RESPONSE_DATA_ABNORMAL);
                aVar.a(verifyException);
                return;
            }
            aVar.a(map3);
        } catch (Throwable th2) {
            f.a().b("[FlyVerify] ==>%s", "url:" + str + "request error:" + th2.getMessage());
            aVar.a(new VerifyException(VerifyErr.C_RESPONSE_DATA_ABNORMAL.getCode(), as.a(th2)));
        }
    }

    public HashMap b(HashMap<String, Object> map, String str) throws VerifyException {
        if (ax.h()) {
            throw new VerifyException(VerifyErr.C_PRIVACY_NOT_ACCEPTED_ERROR);
        }
        try {
            HashMap<String, String> map2 = new HashMap<>();
            map2.put("appkey", ax.d());
            return (HashMap) this.f36866b.a(map2, map, str, false);
        } catch (Throwable th2) {
            throw new VerifyException(VerifyErr.C_Init_Server_Error.getCode(), as.a(th2));
        }
    }
}
