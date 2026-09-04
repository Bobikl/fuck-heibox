package com.huawei.hms.hatool;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f60951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f60952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f60953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f60954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f60955e;

    public i1(String str, String str2, String str3, String str4, long j10) {
        this.f60951a = str;
        this.f60952b = str2;
        this.f60953c = str3;
        this.f60954d = str4;
        this.f60955e = j10;
    }

    public void a() {
        v.c("StreamEventHandler", "Begin to handle stream events...");
        b1 b1Var = new b1();
        b1Var.b(this.f60953c);
        b1Var.d(this.f60952b);
        b1Var.a(this.f60954d);
        b1Var.c(String.valueOf(this.f60955e));
        if ("oper".equals(this.f60952b) && z.i(this.f60951a, "oper")) {
            p0 p0VarA = y.a().a(this.f60951a, this.f60955e);
            String strA = p0VarA.a();
            Boolean boolValueOf = Boolean.valueOf(p0VarA.b());
            b1Var.f(strA);
            b1Var.e(String.valueOf(boolValueOf));
        }
        String strReplace = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(b1Var);
        new l0(this.f60951a, this.f60952b, q0.g(), arrayList, strReplace).a();
    }
}
