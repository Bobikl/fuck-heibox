package com.umeng.analytics.pro;

import com.lzy.okgo.model.Progress;
import com.max.hblogistics.bean.address.AdminRegionObj;
import org.apache.tools.ant.taskdefs.p7;

/* JADX INFO: compiled from: UContent.java */
/* JADX INFO: loaded from: classes4.dex */
public class d {
    public static final String A = "ts";
    public static final String B = "locations";
    public static final String C = "lat";
    public static final String D = "lng";
    public static final String E = "ts";
    public static final String F = "traffic";
    public static final String G = "upload_traffic";
    public static final String H = "download_traffic";
    public static final String I = "activate_msg";
    public static final String J = "ts";
    public static final String K = "group_info";
    public static final String L = "active_user";
    public static final String M = "provider";
    public static final String N = "puid";
    public static final String O = "error";
    public static final String P = "ts";
    public static final String Q = "error_source";
    public static final String R = "context";
    public static final String S = "ekv";
    public static final String T = "gkv";
    public static final String U = "id";
    public static final String V = "ts";
    public static final String X = "userlevel";
    public static final String Z = "dplus";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f104682a = "appkey";
    public static final String aA = "userlevel";
    public static final String aB = "eof";
    public static final String aC = "exception";

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    public static final String f104683aa = "analytics";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final String f104684ab = "push";

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    public static final String f104685ac = "share";

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    public static final String f104686ad = "content";

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    public static final String f104687ae = "header";

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    public static final String f104688af = "ds";

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    public static final String f104689ag = "pn";

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    public static final String f104690ah = "pro_ver";

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    public static final String f104691ai = "1.0.0";

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    public static final String f104692aj = "atm";

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    public static final String f104693ak = "st";

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    public static final String f104694al = "ekv_bl";
    public static final String am = "ekv_wl";
    public static final String an = "ekv_bl_ver";
    public static final String ao = "ekv_wl_ver";
    public static final String ap = "$ekv_bl_ver";
    public static final String aq = "$ekv_wl_ver";
    public static final String ar = "events";
    public static final String av = "_$pp";
    public static final String aw = "session";
    public static final String ax = "pageview";
    public static final String ay = "versioncode";
    public static final String az = "versionname";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f104695b = "channel";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f104696c = "secret";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f104697d = "app_version";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f104698e = "version_code";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f104699f = "wrapper_type";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f104700g = "wrapper_version";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f104701h = "sdk_version";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f104702i = "vertical_type";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f104703j = "device_id";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f104704k = "device_model";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f104705l = "$pr_ve";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f104706m = "$ud_da";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f104707n = "sessions";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f104708o = "id";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f104709p = "start_time";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f104710q = "end_time";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f104711r = "duration";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f104712s = "duration_old";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f104713t = "pages";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f104714u = "autopages";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f104715v = "page_name";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f104716w = "duration";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f104717x = "page_start";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f104718y = "type";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f104719z = "$page_num";
    public static final String aD = "_$!deep_link";
    public static final String aE = "_$!link";
    public static final String[] aF = {aD, aE};
    public static final String W = "du";
    public static final String Y = "$st_fl";
    public static final String au = "_$sp";
    public static final String[] aG = {"id", "ts", W, Y, "ds", "pn", au};
    public static final String as = "_$!ts";
    public static final String at = "_$!id";
    public static final String[] aH = {as, at, "_$!du", "_$!c", Y, "_$!sp", "event_name", "token", "time", "ip", ak.O, "region", AdminRegionObj.TYPE_CITY, "browser", "os", ak.F, "device_version", ak.f104426ai, "screen_width", "screen_height", "referrer", "referrer_domain", "initial_referrer", "initial_referrer_domain", "initial_view_time", "search_engine", "keyword", "ali_lib", "utm_source", "utm_medium", "utm_term", "utm_content", "utm_campaign", Progress.L, p7.a.f135569g, p7.a.f135568f, "app_version", "sp"};
}
