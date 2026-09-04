package com.tencent.qmsp.sdk.d;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.qmsp.sdk.f.g;
import com.tencent.qmsp.sdk.f.h;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<d.b> f101851a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SharedPreferences f101852b;

    public b() {
        this.f101852b = null;
        this.f101852b = com.tencent.qmsp.sdk.app.a.getContext().getSharedPreferences(com.tencent.qmsp.sdk.c.b.f101769a + a(d.f101877b), 0);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    private String a(String str, String str2, String str3) {
        File filesDir;
        String parent;
        String str4;
        String str5;
        StringBuilder sb2;
        if (!TextUtils.isEmpty(str) && !str.equals("1")) {
            if (str.equals("2")) {
                filesDir = com.tencent.qmsp.sdk.app.a.getContext().getExternalFilesDir(null);
            } else {
                parent = "";
            }
            str4 = File.separator;
            if (!parent.endsWith(str4) && !str2.startsWith(str4)) {
                parent = parent + str4;
            }
            str5 = parent + str2;
            if (str2.endsWith(str4)) {
                sb2 = new StringBuilder();
                sb2.append(str5);
            } else {
                sb2 = new StringBuilder();
                sb2.append(str5);
                sb2.append(str4);
            }
            sb2.append(str3);
            return sb2.toString();
        }
        filesDir = com.tencent.qmsp.sdk.app.a.getContext().getFilesDir();
        parent = filesDir.getParent();
        str4 = File.separator;
        if (!parent.endsWith(str4)) {
            parent = parent + str4;
        }
        str5 = parent + str2;
        if (str2.endsWith(str4)) {
            sb2 = new StringBuilder();
            sb2.append(str5);
        } else {
            sb2 = new StringBuilder();
            sb2.append(str5);
            sb2.append(str4);
        }
        sb2.append(str3);
        return sb2.toString();
    }

    private String a(byte[] bArr) {
        return h.a(bArr);
    }

    private boolean a(String str, long j10, long j11) {
        if (str == null || !str.equals("android") || j10 < 0 || j11 < 0) {
            return false;
        }
        long j12 = Build.VERSION.SDK_INT;
        if (j10 == 0 && j11 == 0) {
            return true;
        }
        if (j10 == 0 && j11 > 0) {
            return j12 <= j11;
        }
        if (j10 <= 0 || j11 != 0) {
            return j10 > 0 && j11 > 0 && j12 >= j10 && j12 <= j11;
        }
        return j12 >= j10;
    }

    private boolean a(String str, String str2) {
        if (str != null && str2 != null) {
            String strReplace = str.replace(" ", "");
            String strReplace2 = str2.replace(" ", "");
            boolean zEquals = strReplace.equals(androidx.webkit.b.f28327e);
            boolean zEquals2 = strReplace2.equals(androidx.webkit.b.f28327e);
            if (zEquals && zEquals2) {
                return true;
            }
            String strC = com.tencent.qmsp.sdk.a.c.c();
            if (TextUtils.isEmpty(strC)) {
                return false;
            }
            try {
                if (zEquals && !zEquals2) {
                    return b(strC, strReplace2) <= 0;
                }
                if (zEquals || !zEquals2) {
                    return !zEquals && !zEquals2 && b(strC, strReplace2) <= 0 && b(strC, strReplace) >= 0;
                }
                return b(strC, strReplace) >= 0;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    private int b(String str, String str2) {
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int length = strArrSplit.length < strArrSplit2.length ? strArrSplit.length : strArrSplit2.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = Integer.parseInt(strArrSplit[i10]);
            int i12 = Integer.parseInt(strArrSplit2[i10]);
            if (i11 > i12) {
                return 1;
            }
            if (i11 < i12) {
                return -1;
            }
        }
        return 0;
    }

    private String b() {
        return com.tencent.qmsp.sdk.a.b.c() + a(d.f101876a);
    }

    private boolean b(String str) {
        if (str == null) {
            return false;
        }
        String strReplace = str.replace(" ", "");
        if (strReplace.equals(androidx.webkit.b.f28327e)) {
            return true;
        }
        String str2 = Build.CPU_ABI;
        String[] strArrSplit = strReplace.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (strArrSplit == null) {
            return false;
        }
        for (String str3 : strArrSplit) {
            if (str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    private boolean c(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str);
            byte[][] bArr = d.f101882g;
            jSONObject.getLong(a(bArr[0]));
            jSONObject.getBoolean(a(bArr[1]));
            JSONArray jSONArray = jSONObject.getJSONArray(a(bArr[2]));
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                d.b bVar = new d.b();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                byte[][] bArr2 = d.f101882g;
                bVar.f101893a = jSONObject2.getLong(a(bArr2[3]));
                bVar.f101894b = jSONObject2.getLong(a(bArr2[4]));
                jSONObject2.getLong(a(bArr2[7]));
                bVar.f101895c = jSONObject2.getString(a(bArr2[5]));
                bVar.f101896d = jSONObject2.getString(a(bArr2[6]));
                bVar.f101897e = jSONObject2.getString(a(bArr2[8]));
                bVar.f101898f = jSONObject2.getLong(a(bArr2[15]));
                bVar.f101899g = jSONObject2.getLong(a(bArr2[16]));
                bVar.f101902j = jSONObject2.getString(a(bArr2[18]));
                bVar.f101900h = jSONObject2.getString(a(bArr2[10]));
                bVar.f101901i = jSONObject2.getString(a(bArr2[11]));
                String string = jSONObject2.getString(a(bArr2[9]));
                bVar.f101903k = string;
                bVar.f101905m = a(string, bVar.f101898f, bVar.f101899g);
                bVar.f101906n = b(bVar.f101902j);
                bVar.f101904l = a(bVar.f101900h, bVar.f101901i);
                if (jSONObject2.has(a(bArr2[20]))) {
                    bVar.f101913u = jSONObject2.getInt(a(bArr2[20]));
                }
                JSONArray jSONArray2 = jSONObject2.getJSONArray(a(bArr2[12]));
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i11);
                    d.a aVar = new d.a();
                    byte[][] bArr3 = d.f101882g;
                    jSONObject3.getLong(a(bArr3[7]));
                    aVar.f101886d = jSONObject3.getString(a(bArr3[13]));
                    aVar.f101887e = jSONObject3.getString(a(bArr3[14]));
                    String string2 = jSONObject3.getString(a(bArr3[5]));
                    aVar.f101883a = string2;
                    aVar.f101888f = a(aVar.f101886d, aVar.f101887e, string2);
                    aVar.f101884b = jSONObject3.getString(a(bArr3[6]));
                    aVar.f101890h = jSONObject3.getLong(a(bArr3[17]));
                    if (jSONObject3.has(a(bArr3[19]))) {
                        aVar.f101891i = jSONObject3.getString(a(bArr3[19]));
                    }
                    bVar.f101907o.add(aVar);
                }
                arrayList.add(bVar);
            }
            this.f101851a = arrayList;
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            g.a("Qp.QPUpdate", 1, "[SFU] parsing config error");
            return false;
        }
    }

    public List<d.b> a() {
        return this.f101851a;
    }

    public List<d.b> a(long j10) {
        ArrayList arrayList = new ArrayList();
        if (a(b()) && !this.f101851a.isEmpty()) {
            for (int i10 = 0; i10 < this.f101851a.size(); i10++) {
                d.b bVar = this.f101851a.get(i10);
                if (bVar.f101894b == j10) {
                    for (int i11 = 0; i11 < bVar.f101907o.size(); i11++) {
                        d.a aVar = bVar.f101907o.get(i11);
                        aVar.f101889g = this.f101852b.getString(aVar.f101888f, "");
                    }
                    for (int i12 = 0; i12 < bVar.f101909q.size(); i12++) {
                        d.a aVar2 = bVar.f101909q.get(i12);
                        aVar2.f101889g = this.f101852b.getString(aVar2.f101888f, "");
                    }
                    for (int i13 = 0; i13 < bVar.f101908p.size(); i13++) {
                        d.a aVar3 = bVar.f101908p.get(i13);
                        aVar3.f101889g = this.f101852b.getString(aVar3.f101888f, "");
                    }
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    public boolean a(String str) throws Throwable {
        byte[] bArrA = e.a(new File(str), null);
        if (bArrA != null) {
            return c(new String(bArrA));
        }
        g.a("Qp.QPUpdate", 1, String.format("[SFU] invalid sig of config: %s", str));
        return false;
    }
}
