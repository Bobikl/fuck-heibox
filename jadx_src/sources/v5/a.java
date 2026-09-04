package v5;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import x5.b;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.alipay.sdk.m.r.a f140820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f140821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f140822c;

    public a(String str) {
        this.f140821b = str;
    }

    public a(String str, com.alipay.sdk.m.r.a aVar) {
        this.f140821b = str;
        this.f140820a = aVar;
    }

    public static List<a> b(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        String[] strArrD = d(jSONObject.optString("name", ""));
        for (int i10 = 0; i10 < strArrD.length; i10++) {
            com.alipay.sdk.m.r.a aVarA = com.alipay.sdk.m.r.a.a(strArrD[i10]);
            if (aVarA != com.alipay.sdk.m.r.a.None) {
                a aVar = new a(strArrD[i10], aVarA);
                aVar.f140822c = f(strArrD[i10]);
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public static void c(a aVar) {
        String[] strArrG = aVar.g();
        if (strArrG.length == 3 && TextUtils.equals("tid", strArrG[0])) {
            y5.a aVarA = y5.a.a(b.e().c());
            if (TextUtils.isEmpty(strArrG[1]) || TextUtils.isEmpty(strArrG[2])) {
                return;
            }
            aVarA.c(strArrG[1], strArrG[2]);
        }
    }

    public static String[] d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split(";");
    }

    public static String[] f(String str) {
        ArrayList arrayList = new ArrayList();
        int iIndexOf = str.indexOf(40);
        int iLastIndexOf = str.lastIndexOf(41);
        if (iIndexOf == -1 || iLastIndexOf == -1 || iLastIndexOf <= iIndexOf) {
            return null;
        }
        for (String str2 : str.substring(iIndexOf + 1, iLastIndexOf).split("' *, *'", -1)) {
            arrayList.add(str2.trim().replaceAll("'", "").replaceAll("\"", ""));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public com.alipay.sdk.m.r.a a() {
        return this.f140820a;
    }

    public String e() {
        return this.f140821b;
    }

    public String[] g() {
        return this.f140822c;
    }
}
