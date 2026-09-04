package anet.channel.security;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.util.ALog;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class b implements ISecurity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f29815a = "awcn.DefaultSecurityGuard";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f29816b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<String, Integer> f29817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f29818d;

    static {
        try {
            Class.forName("com.alibaba.wireless.security.open.SecurityGuardManager");
            f29816b = true;
            HashMap map = new HashMap();
            f29817c = map;
            map.put(ISecurity.SIGN_ALGORITHM_HMAC_SHA1, 3);
            f29817c.put(ISecurity.CIPHER_ALGORITHM_AES128, 16);
        } catch (Throwable unused) {
            f29816b = false;
        }
    }

    b(String str) {
        this.f29818d = str;
    }

    @Override // anet.channel.security.ISecurity
    public byte[] decrypt(Context context, String str, String str2, byte[] bArr) {
        Integer num;
        IStaticDataEncryptComponent staticDataEncryptComp;
        if (!f29816b || context == null || bArr == null || TextUtils.isEmpty(str2) || !f29817c.containsKey(str) || (num = f29817c.get(str)) == null) {
            return null;
        }
        try {
            SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(context);
            if (securityGuardManager != null && (staticDataEncryptComp = securityGuardManager.getStaticDataEncryptComp()) != null) {
                return staticDataEncryptComp.staticBinarySafeDecryptNoB64(num.intValue(), str2, bArr, this.f29818d);
            }
        } catch (Throwable th2) {
            ALog.e(f29815a, "staticBinarySafeDecryptNoB64", null, th2, new Object[0]);
        }
        return null;
    }

    @Override // anet.channel.security.ISecurity
    public byte[] getBytes(Context context, String str) {
        IDynamicDataStoreComponent dynamicDataStoreComp;
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(context);
            if (securityGuardManager == null || (dynamicDataStoreComp = securityGuardManager.getDynamicDataStoreComp()) == null) {
                return null;
            }
            return dynamicDataStoreComp.getByteArray(str);
        } catch (Throwable th2) {
            ALog.e(f29815a, "getBytes", null, th2, new Object[0]);
            return null;
        }
    }

    @Override // anet.channel.security.ISecurity
    public boolean isSecOff() {
        return false;
    }

    @Override // anet.channel.security.ISecurity
    public boolean saveBytes(Context context, String str, byte[] bArr) {
        IDynamicDataStoreComponent dynamicDataStoreComp;
        if (context == null || bArr == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(context);
            return (securityGuardManager == null || (dynamicDataStoreComp = securityGuardManager.getDynamicDataStoreComp()) == null || dynamicDataStoreComp.putByteArray(str, bArr) == 0) ? false : true;
        } catch (Throwable th2) {
            ALog.e(f29815a, "saveBytes", null, th2, new Object[0]);
            return false;
        }
    }

    @Override // anet.channel.security.ISecurity
    public String sign(Context context, String str, String str2, String str3) {
        if (f29816b && context != null && !TextUtils.isEmpty(str2) && f29817c.containsKey(str)) {
            try {
                ISecureSignatureComponent secureSignatureComp = SecurityGuardManager.getInstance(context).getSecureSignatureComp();
                if (secureSignatureComp != null) {
                    SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
                    securityGuardParamContext.appKey = str2;
                    securityGuardParamContext.paramMap.put("INPUT", str3);
                    securityGuardParamContext.requestType = f29817c.get(str).intValue();
                    return secureSignatureComp.signRequest(securityGuardParamContext, this.f29818d);
                }
            } catch (Throwable th2) {
                ALog.e(f29815a, "Securityguard sign request failed.", null, th2, new Object[0]);
            }
        }
        return null;
    }
}
