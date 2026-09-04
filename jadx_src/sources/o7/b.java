package o7;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sdk.open.aweme.authorize.model.Authorization;
import com.bytedance.sdk.open.aweme.authorize.model.VerifyObject;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import n7.d;

/* JADX INFO: loaded from: classes6.dex */
public class b {
    public static String a(Context context, Authorization.Request request, String str, String str2, String str3) {
        String string;
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(request.optionalScope1)) {
            for (String str4 : request.optionalScope1.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                if (sb2.length() > 0) {
                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb2.append(str4 + ",1");
            }
        }
        if (!TextUtils.isEmpty(request.optionalScope0)) {
            for (String str5 : request.optionalScope0.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                if (sb2.length() > 0) {
                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb2.append(str5 + ",0");
            }
        }
        StringBuilder sb3 = new StringBuilder();
        String str6 = request.scope;
        if (str6 != null) {
            sb3.append(str6);
        }
        VerifyObject verifyObject = request.verifyObject;
        if (verifyObject != null && verifyObject.verifyScope != null) {
            if (sb3.length() > 0) {
                sb3.append(',');
            }
            sb3.append(request.verifyObject.verifyScope);
        }
        List<String> listA = d.a(context, request.getCallerPackage());
        Bundle bundle = request.extras;
        String str7 = "";
        if (bundle != null) {
            String string2 = bundle.getString(i7.a.i.f119324s, "");
            string = bundle.getString(i7.a.i.f119325t, "");
            str7 = string2;
        } else {
            string = "";
        }
        return new Uri.Builder().scheme(str).authority(str2).path(str3).appendQueryParameter(i7.a.i.f119306a, "code").appendQueryParameter(i7.a.i.f119307b, request.redirectUri).appendQueryParameter("client_key", request.getClientKey()).appendQueryParameter("state", request.state).appendQueryParameter("from", i7.a.i.f119314i).appendQueryParameter("scope", sb3.toString()).appendQueryParameter(i7.a.i.f119312g, sb2.toString()).appendQueryParameter("signature", d.b(listA)).appendQueryParameter(i7.a.i.f119322q, n7.c.a(request.getCallerPackage())).appendQueryParameter(i7.a.i.f119323r, "android").appendQueryParameter(i7.a.i.f119324s, str7).appendQueryParameter(i7.a.i.f119325t, string).build().toString();
    }
}
