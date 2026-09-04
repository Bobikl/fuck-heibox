package com.tencent.qimei.q;

import android.os.Build;
import com.tencent.connect.common.Constants;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: ReportError.java */
/* JADX INFO: loaded from: classes4.dex */
public class c {
    public static void a(String str) {
        j.a().a(g.REPORT_CLONE_DETECT_TYPE.a(), "2").b(str).setPath("/report").a("v5");
        com.tencent.qimei.n.a.b("SDK_INIT ｜ 本地加密", "解密失败，androidId不一致，%s可能被克隆", com.tencent.qimei.d.d.l().z());
    }

    public static void a(String str, long j10, long j11, long j12) {
        j.a().a(g.REPORT_QIMEI_USED_TIME.a(), Long.valueOf(j10)).a(g.REPORT_QIMEI_LOCAL_USED_TIME.a(), Long.valueOf(j11)).a(g.REPORT_OAID_USED_TIME.a(), Long.valueOf(j12)).b(str).setPath("/report").a(com.alipay.sdk.m.x.c.f39529d);
    }

    public static void a(String str, String str2) {
        j.a().a(g.REPORT_QIMEI_ERROR_CODE.a(), "1004").a(g.REPORT_QIMEI_ERROR_DESC.a(), str2).b(str).setPath("/report").a("v2");
    }

    public static void a(String str, String str2, int i10, String str3) {
        j.a().a(g.REPORT_QIMEI_ERROR_CODE.a(), str2.equals("451") ? "1001" : Constants.DEFAULT_UIN).a(g.REPORT_QIMEI_ERROR_DESC.a(), "error code: " + i10 + ", msg:" + str3).b(str).setPath("/report").a("v2");
    }

    public static void a(String str, String str2, String str3) {
        j.a().a(g.REPORT_CLONE_CACHE_Q16.a(), str2).a(g.REPORT_CLONE_CACHE_Q36.a(), str3).a(g.REPORT_CLONE_DETECT_TYPE.a(), "1").b(str).setPath("/report").a("v5");
        com.tencent.qimei.n.a.b("SDK_INIT ｜ 本地加密", "解密失败，安装时间不一致，%s可能被克隆", com.tencent.qimei.d.a.c());
    }

    public static void a(String str, String str2, String str3, String str4, String str5, boolean z10) {
        j.a().a(g.REPORT_QIMEI_CHANGE_OLD_Q16.a(), str2).a(g.REPORT_QIMEI_CHANGE_OLD_Q36.a(), str3).a(g.REPORT_QIMEI_CHANGE_NEW_Q16.a(), str4).a(g.REPORT_QIMEI_CHANGE_NEW_Q36.a(), str5).a(g.REPORT_QIMEI_FROM_BEACON.a(), z10 ? "1" : "0").b(str).setPath("/report").a(com.huawei.hms.feature.dynamic.b.f60699u);
    }

    public static String b(String str) {
        com.tencent.qimei.o.d dVarA = com.tencent.qimei.o.d.a(str);
        HashMap map = new HashMap();
        map.put("a1", com.tencent.qimei.d.a.f());
        map.put("a2", com.tencent.qimei.d.a.e());
        map.put("a3", Build.CPU_ABI);
        map.put("a4", Build.CPU_ABI2);
        map.put("a5", dVarA.c());
        map.put("a6", Build.BRAND);
        map.put("a7", Build.VERSION.SDK);
        return new JSONObject(map).toString();
    }

    public static void b(String str, String str2, String str3) {
        j.a().a(g.REPORT_QIMEI_ERROR_CODE.a(), "1002").a(g.REPORT_QIMEI_ERROR_DESC.a(), "decrypt error, aes key: " + str2 + ", content:" + str3).b(str).setPath("/report").a("v2");
    }

    public static void c(String str) {
        j.a().a(g.REPORT_QIMEI_ERROR_CODE.a(), "1005").a(g.REPORT_QIMEI_ERROR_DESC.a(), b(str)).b(str).setPath("/report").a("v2");
    }
}
