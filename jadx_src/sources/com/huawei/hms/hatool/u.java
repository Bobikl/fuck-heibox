package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<b1> f61052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f61053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f61054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f61055d;

    public u(List<b1> list, String str, String str2, String str3) {
        this.f61052a = list;
        this.f61053b = str;
        this.f61054c = str2;
        this.f61055d = str3;
    }

    private void a(List<b1> list, String str, String str2) {
        if (list.isEmpty()) {
            return;
        }
        int size = (list.size() / 500) + 1;
        for (int i10 = 0; i10 < size; i10++) {
            int i11 = i10 * 500;
            List<b1> listSubList = list.subList(i11, Math.min(list.size(), i11 + 500));
            String strReplace = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jB = ((long) a1.b(str2, str)) * 86400000;
            ArrayList arrayList = new ArrayList();
            for (b1 b1Var : listSubList) {
                if (!c0.a(b1Var.b(), jCurrentTimeMillis, jB)) {
                    arrayList.add(b1Var);
                }
            }
            if (arrayList.size() > 0) {
                new l0(str2, str, this.f61055d, arrayList, strReplace).a();
            } else {
                v.e("hmsSdk", "No data to report handler");
            }
        }
    }

    public void a() {
        if (!"_default_config_tag".equals(this.f61054c)) {
            a(this.f61052a, this.f61054c, this.f61053b);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (b1 b1Var : this.f61052a) {
            String strC = b1Var.c();
            if (TextUtils.isEmpty(strC) || "oper".equals(strC)) {
                arrayList4.add(b1Var);
            } else if ("maint".equals(strC)) {
                arrayList.add(b1Var);
            } else if ("preins".equals(strC)) {
                arrayList2.add(b1Var);
            } else if ("diffprivacy".equals(strC)) {
                arrayList3.add(b1Var);
            }
        }
        a(arrayList4, "oper", "_default_config_tag");
        a(arrayList, "maint", "_default_config_tag");
        a(arrayList2, "preins", "_default_config_tag");
        a(arrayList3, "diffprivacy", "_default_config_tag");
    }
}
