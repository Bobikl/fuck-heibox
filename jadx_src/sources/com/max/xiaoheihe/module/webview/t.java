package com.max.xiaoheihe.module.webview;

import com.google.gson.JsonObject;
import com.max.xiaoheihe.bean.WebProtocolObj;
import java.util.ArrayList;

/* JADX INFO: compiled from: WebActionHelper.java */
/* JADX INFO: loaded from: classes12.dex */
public interface t {

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final String f94775s1 = "showInput";

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final String f94776t1 = "replyLinkComment";

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final String f94777u1 = "openCommentReportDialog";

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final String f94778v1 = "adapteSoftKeyBoard";

    /* JADX INFO: compiled from: WebActionHelper.java */
    public interface a {
        void a();
    }

    /* JADX INFO: compiled from: WebActionHelper.java */
    public interface b {
        void a(@androidx.annotation.n0 JsonObject jsonObject);
    }

    void A1(WebProtocolObj webProtocolObj, Throwable th2);

    void B0(boolean z10);

    void C1(WebProtocolObj webProtocolObj);

    void D1(boolean z10);

    void E0(WebProtocolObj webProtocolObj);

    void E1(String str);

    void F3();

    void G3(WebProtocolObj webProtocolObj);

    void K2(WebProtocolObj webProtocolObj);

    String M0(String str);

    void N0(ArrayList<String> arrayList);

    void P0(ArrayList<String> arrayList);

    void U(boolean z10, boolean z11);

    void V0(String str);

    void e0(boolean z10);

    void e3();

    void f0(WebProtocolObj webProtocolObj);

    void g0(WebProtocolObj webProtocolObj);

    void g1(WebProtocolObj webProtocolObj);

    String l3();

    void o2(WebProtocolObj webProtocolObj);

    void reload();

    boolean t0(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2, @androidx.annotation.p0 b bVar);

    void u(WebProtocolObj webProtocolObj);

    void x0(WebProtocolObj webProtocolObj);

    void y3(String str);

    void z2(WebProtocolObj webProtocolObj);
}
