package com.max.hbcommon.network;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.max.hbcommon.bean.RequestTagMapObj;
import com.max.hbutils.bean.Result;
import com.tencent.open.SocialConstants;
import io.reactivex.z;
import java.util.Map;
import ll.s;
import ll.t;
import ll.u;
import ll.w;
import ll.x;
import ll.y;
import okhttp3.d0;

/* JADX INFO: compiled from: BaseApiService.java */
/* JADX INFO: loaded from: classes9.dex */
public interface c {
    @ll.f("task/shared/")
    z<Result> C1(@t("h_src") String str, @t("shared_type") String str2, @t("share_plat") String str3, @t("act_id") String str4);

    @ll.e
    @ll.o("https://data.xiaoheihe.cn/account/data_report/")
    z<Result> E1(@t("type") String str, @ll.c("data") String str2, @ll.c("key") String str3, @ll.c("sid") String str4, @t("time_") String str5);

    @ll.f
    z<JsonObject> F1(@ll.j Map<String, String> map, @y String str, @u Map<String, String> map2);

    @ll.e
    @ll.o("game/eventlog/manager/")
    z<Result> G3(@ll.c("event_id") String str, @ll.c("type") String str2, @ll.c(SocialConstants.PARAM_APP_DESC) String str3, @ll.c("page_android") String str4, @ll.c("view_android") String str5);

    @ll.f("debug/resolve-client-config")
    z<Result<JsonObject>> J2(@t("config") String str);

    @ll.f("/{param}")
    z<Result<JsonElement>> Ja(@s(encoded = true, value = RemoteMessageConst.MessageBody.PARAM) String str, @u Map<String, Object> map, @ll.j Map<String, Object> map2);

    @ll.e
    @ll.o("account/getui/report_bind_cid")
    z<Result> M(@ll.c("cid") String str);

    @ll.f
    z<Result<JsonElement>> Q4(@y String str, @u Map<String, Object> map, @ll.j Map<String, Object> map2);

    @ll.e
    @ll.o
    z<Result<JsonElement>> T2(@y String str, @u Map<String, Object> map, @ll.d Map<String, Object> map2, @ll.j Map<String, Object> map3);

    @ll.e
    @ll.o("https://data.xiaoheihe.cn/account/data_report/")
    z<Result> T7(@t("type") String str, @ll.c("data") String str2, @ll.c("key") String str3, @ll.c("sid") String str4, @t("time_") String str5, @t("session_id") String str6);

    @ll.o("/{param}")
    @w
    @ll.e
    z<Result<JsonElement>> V2(@s(encoded = true, value = RemoteMessageConst.MessageBody.PARAM) String str, @u Map<String, Object> map, @ll.d Map<String, Object> map2, @ll.j Map<String, Object> map3);

    @ll.e
    @ll.o
    z<Result> Y2(@ll.j Map<String, String> map, @y String str, @u Map<String, String> map2, @ll.d Map<String, String> map3, @x RequestTagMapObj requestTagMapObj);

    @ll.e
    @ll.o
    z<Result<JsonElement>> Z3(@y String str, @u Map<String, Object> map, @ll.d Map<String, Object> map2, @ll.j Map<String, Object> map3);

    @ll.f
    z<d0> a(@ll.j Map<String, String> map, @y String str, @u Map<String, String> map2);

    @ll.e
    @ll.o("/{param}")
    z<Result<JsonElement>> b7(@s(encoded = true, value = RemoteMessageConst.MessageBody.PARAM) String str, @u Map<String, Object> map, @ll.d Map<String, Object> map2, @ll.j Map<String, Object> map3);

    @ll.e
    @ll.o("https://data.xiaoheihe.cn/bbs/app/link/view/time")
    z<Result> h0(@ll.c("data") String str, @ll.c("key") String str2, @ll.c("sid") String str3, @t("time_") String str4);

    @ll.e
    @ll.o
    z<d0> j1(@ll.j Map<String, String> map, @y String str, @u Map<String, String> map2, @ll.d Map<String, String> map3);

    @ll.e
    @ll.o("account/getui/report_unbind_cid")
    z<Result> n(@ll.c("cid") String str);

    @ll.f
    z<Result> u5(@ll.j Map<String, String> map, @y String str, @u Map<String, String> map2, @x RequestTagMapObj requestTagMapObj);

    @ll.e
    @ll.o
    z<JsonObject> u7(@ll.j Map<String, String> map, @y String str, @ll.d Map<String, String> map2);

    @ll.f("https://data.xiaoheihe.cn/account/data_report/")
    z<Result> x8(@t("type") String str, @u Map<String, String> map);

    @ll.e
    @ll.o("https://data.xiaoheihe.cn/bbs/app/api/general/search/report")
    z<Result> z(@ll.c("data") String str, @ll.c("sid") String str2, @ll.c("key") String str3, @t("time_") String str4);
}
