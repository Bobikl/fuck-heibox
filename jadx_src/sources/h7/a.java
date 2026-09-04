package h7;

import android.os.Bundle;
import com.bytedance.sdk.open.aweme.authorize.model.Authorization;
import j7.b;

/* JADX INFO: loaded from: classes6.dex */
public class a implements b {
    @Override // j7.b
    public boolean a(int i10, Bundle bundle, j7.a aVar) {
        if (bundle != null && aVar != null) {
            if (i10 == 1) {
                Authorization.Request request = new Authorization.Request(bundle);
                if (!request.checkArgs()) {
                    return false;
                }
                String str = request.scope;
                if (str != null) {
                    request.scope = str.replace(" ", "");
                }
                String str2 = request.optionalScope1;
                if (str2 != null) {
                    request.optionalScope1 = str2.replace(" ", "");
                }
                String str3 = request.optionalScope0;
                if (str3 != null) {
                    request.optionalScope0 = str3.replace(" ", "");
                }
                aVar.a(request);
                return true;
            }
            if (i10 == 2) {
                k7.b response = new Authorization.Response(bundle);
                if (response.checkArgs()) {
                    aVar.c(response);
                    return true;
                }
            }
        }
        return false;
    }
}
