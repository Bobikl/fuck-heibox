package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import org.json.JSONException;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f60798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GrsBaseInfo f60799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.huawei.hms.framework.network.grs.e.a f60800c;

    public b(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo) {
        this.f60798a = context;
        this.f60799b = grsBaseInfo;
        this.f60800c = aVar;
    }

    public String a(boolean z10) {
        String str = com.huawei.hms.framework.network.grs.a.a(this.f60800c.a().a("geoipCountryCode", ""), "geoip.countrycode").get("ROOT");
        Logger.i("GeoipCountry", "geoIpCountry is: " + str);
        String strA = this.f60800c.a().a("geoipCountryCodetime", "0");
        long j10 = 0;
        if (!TextUtils.isEmpty(strA) && strA.matches("\\d+")) {
            try {
                j10 = Long.parseLong(strA);
            } catch (NumberFormatException e10) {
                Logger.w("GeoipCountry", "convert urlParamKey from String to Long catch NumberFormatException.", e10);
            }
        }
        if (TextUtils.isEmpty(str) || com.huawei.hms.framework.network.grs.h.e.a(Long.valueOf(j10))) {
            com.huawei.hms.framework.network.grs.g.j.c cVar = new com.huawei.hms.framework.network.grs.g.j.c(this.f60799b, this.f60798a);
            cVar.a("geoip.countrycode");
            com.huawei.hms.framework.network.grs.e.c cVarC = this.f60800c.c();
            if (cVarC != null) {
                String strA2 = null;
                try {
                    strA2 = h.a(cVarC.a("services", ""), cVar.c());
                } catch (JSONException e11) {
                    Logger.w("GeoipCountry", "getGeoipCountry merge services occure jsonException. %s", StringUtils.anonymizeMessage(e11.getMessage()));
                }
                if (!TextUtils.isEmpty(strA2)) {
                    cVarC.b("services", strA2);
                }
            }
            if (z10) {
                d dVarA = this.f60800c.b().a(cVar, "geoip.countrycode", cVarC, -1);
                if (dVarA != null) {
                    str = com.huawei.hms.framework.network.grs.a.a(dVarA.j(), "geoip.countrycode").get("ROOT");
                }
                Logger.i("GeoipCountry", "sync request to query geoip.countrycode is:" + str);
            } else {
                Logger.i("GeoipCountry", "async request to query geoip.countrycode");
                this.f60800c.b().a(cVar, null, "geoip.countrycode", cVarC, -1);
            }
        }
        return str;
    }
}
