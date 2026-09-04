package lb;

import android.net.Uri;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: AppConstant.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {
    public static final String A = "com.max.xiaoheihe.ORDER_LIST_UPDATED";
    public static final String A0 = "359550";
    public static final String A1;
    public static final String A2;
    public static final String A3;
    public static final String A4;
    public static final String B = "com.max.xiaoheihe.SHOPPING_CART_UPDATED";
    public static final String B0 = "900000061";
    public static final String B1 = "https://soft.imtt.qq.com/browser/tes/feedback.html";
    public static final String B2;
    public static final String B3;
    public static final String B4;
    public static final String C = "com.max.xiaoheihe.COUPON_LIST_UPDATED";
    public static final String C0 = "900000058";
    public static final String C1;
    public static final String C2;
    public static final String C3;
    public static final String C4;
    public static final String D = "com.max.xiaoheihe.GAME_LIST_FILTER_UPDATED";
    public static final String D0 = "57602";
    public static final String D1;
    public static final String D2;
    public static final String D3;
    public static final String D4;
    public static final String E = "com.max.xiaoheihe.TOPIC_UPDATE";
    public static final String E0 = "900000012";
    public static final String E1;
    public static final String E2;
    public static final String E3;
    public static final String E4;
    public static final String F = "com.max.xiaoheihe.MOBILE_BADGE";
    public static final String F0 = "1085660";
    public static final String F1;
    public static final String F2;
    public static final String F3;
    public static final String F4;
    public static final String G = "com.max.xiaoheihe.chatroom.refreshplaylist";
    public static final String G0 = "730";
    public static final String G1;
    public static final String G2;
    public static final String G3;
    public static final String G4;
    public static final String H = "com.max.xiaoheihe.chatroom.playing.change";
    public static final String H0 = "psn_card";
    public static final String H1;
    public static final String H2;
    public static final String H3;
    public static final String H4 = "heybox://{\"protocol_type\":\"openWindow\",\"full_screen\":true,\"navigation_bar\":{\"title\":\"\"},\"webview\":{\"url\":\"https://open.xiaoheihe.cn/zh_cn/home\",\"bg\":\"#000000\"},\"status_bar\":{\"style\":\"light\"}}";
    public static final String I = "com.max.xiaoheihe.chatroom.music.download";
    public static final String I0 = "steam";
    public static final String I1;
    public static final String I2;
    public static final String I3;
    public static final String I4;
    public static final String J = "com.max.xiaoheihe.close.chatroom";
    public static final String J0 = "pubg";
    public static final String J1;
    public static final String J2;
    public static final String J3;
    public static final String K = "com.max.xiaoheihe.close.BROADCAST_NEWS_LIST_TYPE_CHANGED";
    public static final String K0 = "r6";
    public static final String K1;
    public static final String K2;
    public static final String K3;
    public static final String L = "com.max.xiaoheihe.BROADCAST_AVATAR_DECOR_LIST_UPDATED";
    public static final String L0 = "apex";
    public static final String L1;
    public static final String L2;
    public static final String L3;
    public static final String M = "com.xiaoheihe.pay.finish";
    public static final String M0 = "ow";
    public static final String M1;
    public static final String M2;
    public static final String M3;
    public static final String N = "com.xiaoheihe.trade.point.refresh";
    public static final String N0 = "psn";
    public static final String N1;
    public static final String N2;
    public static final String N3;
    public static final String O = "com.max.xiaoheihe.BROADCAST_REFRESH_STEAM_FRIEND_REQUEST_HISTORY";
    public static final String O0 = "xbox";
    public static final String O1;
    public static final String O2;
    public static final String O3;
    public static final String P = "com.max.xiaoheihe.BROADCAST_BIND_GAME_CARD_TYPE_UPDATED";
    public static final String P0 = "switch";
    public static final String P1;
    public static final String P2;
    public static final String P3;
    public static final String Q = "com.max.xiaoheihe.BROADCAST_REFRESH_PLATFORM_GAMES_ALL_CHECKED";
    public static final String Q0 = "epic";
    public static final String Q1;
    public static final String Q2;
    public static final String Q3;
    public static final String R = "com.max.xiaoheihe.BROADCAST_REFRESH_ORDER_TIP";
    public static final String R0 = "destiny2";
    public static final String R1;
    public static final String R2;
    public static final String R3;
    public static final String S = "com.max.xiaoheihe.BROADCAST_REFRESH_BBS_TAB";
    public static final String S0 = "dac";
    public static final String S1;
    public static final String S2;
    public static final String S3;
    public static final String T = "com.max.xiaoheihe.BROADCAST_REFRESH_GAME_BIND_STATE";
    public static final String T0 = "csgob5";
    public static final String T1;
    public static final String T2;
    public static final String T3;
    public static final String U = "com.max.xiaoheihe.WEB_POST_EVALUATE_JS";
    public static final String U0 = "csgo";
    public static final String U1;
    public static final String U2;
    public static final String U3;
    public static final String V = "com.max.xiaoheihe.BROADCAST_REFRESH_GAME_DETAIL";
    public static final String V0 = "csgo5e";
    public static final String V1;
    public static final String V2;
    public static final String V3;
    public static final String W = "com.max.xiaoheihe.BROADCAST_REFRESH_GAME_DETAIL_COMMENT";
    public static final String W0 = "pc";
    public static final String W1;
    public static final String W2 = "bbs/app/link/web/view";
    public static final String W3;
    public static final String X = "com.max.xiaoheihe.BROADCAST_PLATFORM_UPDATED";
    public static final String X0 = "dota2";
    public static final String X1;
    public static final String X2;
    public static final String X3;
    public static final String Y = "com.max.xiaoheihe.BROADCAST_UPLAOD_VIDEO";
    public static final String Y0 = "570";
    public static final String Y1;
    public static final String Y2 = "/mall/common/store_item_detail_v2";
    public static final String Y3;
    public static final String Z = "com.max.xiaoheihe.BROADCAST_REFRESH_DRAFT_BOX";
    public static final String Z0 = "40";
    public static final String Z1;
    public static final String Z2;
    public static final String Z3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f130929a = 30;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f130930a0 = "com.max.xiaoheihe.BROADCAST_SHOW_BOTTOM_BIND_PHONE_DIALOG";

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final String f130931a1 = "privacy_agreement";

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public static final String f130932a2 = "https://chat.xiaoheihe.cn/home/mobile";

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public static final String f130933a3;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static final String f130934a4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f130935b = 180000;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f130936b0 = "com.max.xiaoheihe.BROADCAST_HIDE_BOTTOM_BIND_PHONE_DIALOG";

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final String f130937b1 = "privacy_agreement_version";

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public static final String f130938b2;

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    public static final String f130939b3;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public static final String f130940b4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f130941c = 300000;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f130942c0 = "com.max.xiaoheihe.BROADCAST_LOGIN_SUCCESS";

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final String f130943c1 = "api.xiaoheihe.cn";

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public static final String f130944c2;

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    public static final String f130945c3;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public static final String f130946c4;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f130947d = 14400000;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f130948d0 = "com.max.xiaoheihe.BROADCAST_MINI_APP_CONTAINER_REPORT";

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final String f130949d1 = "chat.xiaoheihe.cn";

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public static final String f130950d2;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final String f130951d3;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public static final String f130952d4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f130953e = 3600000;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f130954e0 = "com.max.xiaoheihe.BROADCAST_ROLL_ITEM_COUPON_CHECKED";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final String f130955e1 = "chat2.xiaoheihe.cn";

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public static final String f130956e2 = "https://cdn.max-c.com/heybox/landing/heybox_acc_landing_2.html";

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    public static final String f130957e3;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    public static final String f130958e4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f130959f = 7200000;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f130960f0 = "com.max.xiaoheihe.BROADCAST_REFRESH_FRIEND_STATE";

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final String f130961f1 = "heybox.debugmode.cn";

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public static final String f130962f2;

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    public static final String f130963f3;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public static final String f130964f4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f130965g = 86400000;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f130966g0 = "com.max.xiaoheihe.BROADCAST_ON_REFRESH";

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final String f130967g1 = "chat.debugmode.cn";

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public static final String f130968g2;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final String f130969g3;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public static final String f130970g4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f130971h = 250;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f130972h0 = "com.max.xiaoheihe.BROADCAST_POST_SUCCESS_JS_CALLBACK";

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final String f130973h1 = "data.xiaoheihe.cn";

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public static final String f130974h2;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final String f130975h3;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public static final String f130976h4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f130977i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f130978i0 = "com.max.xiaoheihe.BROADCAST_ON_DEBUG_CONFIG_UPDATE";

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final String f130979i1 = "web.xiaoheihe.cn";

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public static final String f130980i2;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final String f130981i3;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final String f130982i4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f130983j = "com.max.maxaccelerator";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f130984j0 = "com.max.xiaoheihe.NOTIFICATION_CHANNEL_DOWNLOAD";

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final String f130985j1 = "web.debugmode.cn";

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public static final String f130986j2;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final String f130987j3;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public static final String f130988j4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f130989k = "heyboxacc";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f130990k0 = "NEW_CHAT_MSG";

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final String f130991k1 = "v5api.maxjia.com";

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public static final String f130992k2;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final String f130993k3;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public static final String f130994k4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f130995l = "Vg7AXtrTolNtWsa8HiB0tI0YClYaQ\nlOXm4UxLeSxQwSFETwIDAQAB";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f130996l0 = "ORDER_OPTION";

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final String f130997l1 = "v5max.debugmode.cn";

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public static final String f130998l2;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final String f130999l3;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public static final String f131000l4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f131001m = "Mhw";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f131002m0 = "UPDATED_USER_PROFILE";

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final String f131003m1 = "v5data.maxjia.com";

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public static final String f131004m2;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final String f131005m3;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public static final String f131006m4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f131007n = "Fortnite";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final String f131008n0 = "KEY_PLATFORM_GAMES_ALL_CHECKED_STATE";

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final String f131009n1 = "v5web.maxjia.com";

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public static final String f131010n2;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final String f131011n3;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    public static final String f131012n4 = "https://oo9phr0289.feishu.cn/docs/doccnns5hrY37hmZvD6JitBJNZg#WYfyYd";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f131013o = "Mrzh";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f131014o0 = "KEY_PLATFORM";

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final String f131015o1 = "v5web.debugmode.cn";

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public static final String f131016o2;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final String f131017o3;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    public static final String f131018o4;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f131019p = "Artifact";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f131020p0 = "KEY_PLATFORM_GAMES_HIDE_BUTTON";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final String f131021p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final String f131022p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final String f131023p3;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    public static final String f131024p4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f131025q = "com.max.xiaoheihe.NEW_MSG";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f131026q0 = "KEY_REFRESH_GAME_BIND_STATE_PARAMS";

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final String f131027q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public static final String f131028q2;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public static final String f131029q3;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    public static final String f131030q4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f131031r = "com.max.xiaoheihe.FOLLOW";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f131032r0 = "KEY_WEB_POST_EVALUATE_JS";

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final String f131033r1 = "mall.heybox.hk";

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public static final String f131034r2;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public static final String f131035r3;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    public static final String f131036r4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f131037s = "com.max.xiaoheihe.FOLLOWED_MOMENTS_UPDATED";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f131038s0 = "KEY_GAME_ID";

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final String f131039s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public static final String f131040s2;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public static final String f131041s3;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    public static final String f131042s4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f131043t = "com.max.xiaoheihe.REFRESH_USER_LINK_LIST";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f131044t0 = "ORDER_OPTION_REGISTER";

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final String f131045t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public static final String f131046t2;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public static final String f131047t3;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    public static final String f131048t4;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f131049u = "com.max.xiaoheihe.NEWS_TAG";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f131050u0 = "ORDER_OPTION_CANCEL";

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final String f131051u1;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public static final String f131052u2;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public static final String f131053u3;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public static final String f131054u4;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f131055v = "com.max.xiaoheihe.USER_PROFILE_UPDATED";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final String f131056v0 = "ORDER_OPTION_COMPLETE";

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final String f131057v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public static final String f131058v2;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static final String f131059v3;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    public static final String f131060v4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f131061w = "com.max.xiaoheihe.BROADCAST_CANCEL_FRIEND_RED_POINT";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final String f131062w0 = "USER_PROFILE_BIND_STEAM";

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final String f131063w1 = "ws.xiaoheihe.cn";

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public static final String f131064w2;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public static final String f131065w3;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    public static final String f131066w4;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f131067x = "com.max.xiaoheihe.ROLL_ROOM_LIST_UPDATED";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String f131068x0 = "USER_PROFILE_UNBIND_STEAM";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final String f131069x1 = "ws.debugmode.cn";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f131070x2;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public static final String f131071x3;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public static final String f131072x4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f131073y = "com.max.xiaoheihe.GAME_PREVIEW_LIST_UPDATED";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String f131074y0 = "USER_PROFILE_UPDATE_ACCOUNT_INFO";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final String f131075y1 = "https://api.xiaoheihe.cn/heybox/download/";

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final String f131076y2;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public static final String f131077y3;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    public static final String f131078y4;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f131079z = "com.max.xiaoheihe.ACHIEVE_BADGE_UPDATED";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f131080z0 = "578080";

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final String f131081z1 = "https://v5api.maxjia.com/max/download/";

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public static final String f131082z2;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final String f131083z3;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public static final String f131084z4;

    static {
        f130977i = ob.a.b().t() ? "Max" : "HeyBox";
        String strA = a(f130943c1);
        f131021p1 = strA;
        String str = "https://" + strA + "/";
        f131027q1 = str;
        f131039s1 = a(f130961f1);
        f131045t1 = a(f130973h1);
        f131051u1 = a(f130979i1);
        f131057v1 = a(f130985j1);
        A1 = b() ? f131081z1 : f131075y1;
        C1 = com.max.hbcommon.network.b.c() + "account/privacy_introduce/";
        D1 = com.max.hbcommon.network.b.c() + "account/privacy_introduce/?type=1";
        E1 = com.max.hbcommon.network.b.c() + "account/privacy_introduce/?type=2";
        F1 = com.max.hbcommon.network.b.c() + "static/pages/app_personal_info_list.html";
        G1 = com.max.hbcommon.network.b.c() + "static/pages/app_sdk_list.html";
        H1 = com.max.hbcommon.network.b.c() + "account/privacy_introduce/?type=3";
        I1 = com.max.hbcommon.network.b.c() + "game/invite_friend_web/?heybox_id=%s";
        J1 = com.max.hbcommon.network.b.c() + "game/badge_detail_web/?steam_id64=%s&steam_appid=%s";
        K1 = com.max.hbcommon.network.b.c() + "account/guid_for_open_privacy_web/";
        L1 = com.max.hbcommon.network.b.c() + "game/steam_inventory_web/?steam_id64=%s";
        M1 = com.max.hbcommon.network.b.c() + "game/steam_inventory_web/?steam_id64=%s&steam_appid=%s";
        N1 = com.max.hbcommon.network.b.c() + "game/achievement_detail_web/?steam_id64=%s&steam_appid=%s";
        O1 = com.max.hbcommon.network.b.c() + "bbs/app/feedback/faq/detail/page?seq_id=129";
        P1 = com.max.hbcommon.network.b.c() + "task/exp/rule/web/";
        Q1 = com.max.hbcommon.network.b.c() + "game/pubg/get_match_detail/web/?region=%s&season=%s&nickname=%s&mode=%s&record_time=%s&player_id=%s";
        R1 = com.max.hbcommon.network.b.c() + "game/pubg/get_single_match_detail/?matchId=%s&region=%s&season=%s&nickname=%s&mode=%s&record_time=%s&player_id=%s";
        S1 = str + "bbs/app/feedback/faq/detail/page?seq_id=62";
        T1 = str + "bbs/app/feedback/faq/detail/page?seq_id=273";
        U1 = com.max.hbcommon.network.b.c() + "store/hosts_to_ip/";
        V1 = com.max.hbcommon.network.b.c() + "account/guid_for_open_inventory_web/";
        W1 = com.max.hbcommon.network.b.c() + "game/pubg/get_calendar_detail/";
        X1 = com.max.hbcommon.network.b.e() + "game/pubg/daily_report";
        Y1 = com.max.hbcommon.network.b.c() + "game/game_introduction/";
        Z1 = com.max.hbcommon.network.b.c() + "account/about";
        f130938b2 = com.max.hbcommon.network.b.c() + "bbs/app/api/activity/community_survey";
        f130944c2 = com.max.hbcommon.network.b.c() + "chat/group/user_ranking/?group_id=";
        f130950d2 = com.max.hbcommon.network.b.c() + "pc/hardware_info/?userid=";
        f130962f2 = com.max.hbcommon.network.b.c() + "pc/media/share/?";
        f130968g2 = com.max.hbcommon.network.b.c() + "bbs/app/api/medal/rule-declare";
        f130974h2 = com.max.hbcommon.network.b.c() + "game/pubg/compare/web/?nickname=%s&season=%s&region=%s";
        f130980i2 = str + "bbs/app/feedback/faq/detail/page?seq_id=63";
        f130986j2 = com.max.hbcommon.network.b.c() + "bbs/app/feedback/faq/detail/page?seq_id=61";
        f130992k2 = com.max.hbcommon.network.b.c() + "bbs/app/feedback/faq/detail/page?seq_id=65";
        f130998l2 = com.max.hbcommon.network.b.c() + "bbs/app/feedback/faq/detail/page?seq_id=64";
        f131004m2 = str + "bbs/app/feedback/faq/detail/page?seq_id=60";
        f131010n2 = str + "bbs/app/feedback/faq/detail/page?seq_id=59";
        f131016o2 = str + "bbs/app/feedback/faq/detail/page?seq_id=263";
        f131022p2 = str + "bbs/app/feedback/faq/detail/page?seq_id=85";
        f131028q2 = str + "bbs/app/feedback/faq/detail/page?seq_id=105";
        f131034r2 = str + "bbs/app/feedback/faq/detail/page?seq_id=124";
        f131040s2 = str + "bbs/app/feedback/faq/detail/page?seq_id=%s";
        f131046t2 = com.max.hbcommon.network.b.c() + "bbs/app/api/achievements";
        f131052u2 = str + "bbs/app/feedback/faq/detail/page?seq_id=130";
        f131058v2 = str + "bbs/app/feedback/faq/detail/page?seq_id=264";
        f131064w2 = str + "bbs/app/feedback/faq/detail/page?seq_id=275";
        f131070x2 = com.max.hbcommon.network.b.c() + "mall/sku_list?app_id=%s";
        f131076y2 = com.max.hbcommon.network.b.c() + "mall/free_package/";
        f131082z2 = com.max.hbcommon.network.b.c() + "mall/free_package/?platform=epic";
        A2 = com.max.hbcommon.network.b.c() + "mall/sku_list?link_id=%s";
        B2 = str + "bbs/app/feedback/faq/detail/page?seq_id=132";
        C2 = str + "bbs/app/feedback/faq/detail/page?seq_id=1";
        D2 = com.max.hbcommon.network.b.c() + "bbs/app/feedback/faq/center/page";
        E2 = com.max.hbcommon.network.b.c() + "bbs/app/feedback/list/page";
        F2 = com.max.hbcommon.network.b.c() + "game/dac/get_match_detail/?player_id=%s&match_id=%s&sign=%s";
        G2 = com.max.hbcommon.network.b.c() + "game/aco/get_match_detail/?player_id=%s&match_id=%s&sign=%s";
        H2 = com.max.hbcommon.network.b.c() + "game/dac/get_chess_detail_web/?chess_id=%s";
        I2 = com.max.hbcommon.network.b.c() + "game/aco/get_chess_web/";
        J2 = com.max.hbcommon.network.b.c() + "game/aco/get_chess_detail_web/?chess_id=%s";
        K2 = com.max.hbcommon.network.b.c() + "game/aco/get_buff_web/";
        L2 = com.max.hbcommon.network.b.c() + "game/aco/get_buff_detail_web/?buff_key=%s";
        M2 = str + "bbs/app/feedback/faq/detail/page?seq_id=128";
        N2 = com.max.hbcommon.network.b.c() + "wiki/get_homepage_info_for_app/?wiki_id=%s";
        O2 = com.max.hbcommon.network.b.c() + "bbs/app/feedback/faq/detail/page?seq_id=131";
        P2 = com.max.hbcommon.network.b.c() + "wiki/become_admin_page/?";
        Q2 = com.max.hbcommon.network.b.c() + "wiki/get_homepage_info_for_app/?wiki_id=%s&is_share=1";
        R2 = str + "bbs/app/feedback/faq/detail/page?seq_id=70";
        S2 = com.max.hbcommon.network.b.c() + "game/ow/get_hero_dtl/?player_id=%s&hero_id=%s&season=%s&is_share=1";
        T2 = str + "bbs/app/feedback/faq/detail/page?seq_id=38";
        U2 = str + "bbs/app/feedback/faq/detail/page?seq_id=39";
        V2 = com.max.hbcommon.network.b.c() + "game/game_developer_words/?appid=%s";
        X2 = com.max.hbcommon.network.b.e() + "mall/common/store_item_detail_v2?sku_id=%s";
        Z2 = com.max.hbcommon.network.b.c() + "bbs/app/comment/share/page?comment_id=%s";
        f130933a3 = str + "bbs/app/feedback/faq/detail/page?seq_id=71";
        f130939b3 = com.max.hbcommon.network.b.e() + "account/game_statistic/home?&userid=%s&appid=%s&steam_id=%s";
        f130945c3 = str + "bbs/app/feedback/faq/detail/page?seq_id=84";
        f130951d3 = str + "bbs/app/feedback/faq/detail/page?seq_id=115";
        f130957e3 = str + "bbs/app/feedback/faq/detail/page?seq_id=88";
        f130963f3 = str + "bbs/app/feedback/faq/detail/page?seq_id=93";
        f130969g3 = str + "bbs/app/feedback/faq/detail/page?seq_id=122";
        f130975h3 = com.max.hbcommon.network.b.c() + "pay/profit_detail_query/?cate_type=chat";
        f130981i3 = com.max.hbcommon.network.b.c() + "game/blstar/get_player_overview?userid=%s&playertag=%s";
        f130987j3 = str + "bbs/app/feedback/faq/detail/page?seq_id=138";
        f130993k3 = com.max.hbcommon.network.b.c() + "mall/coupon/center/web/";
        f130999l3 = com.max.hbcommon.network.b.c() + "mall/coupon/center/web/?primary_id=%s&cate=game";
        f131005m3 = com.max.hbcommon.network.b.c() + "mall/coupon/center/web/?primary_id=%s&sub_id=%s&cate=item";
        f131011n3 = str + "bbs/app/feedback/faq/detail/page?seq_id=151";
        f131017o3 = com.max.hbcommon.network.b.c() + "heybox/open/game/center";
        f131023p3 = com.max.hbcommon.network.b.c() + "heybox/open/game/center/hashtag";
        f131029q3 = str + "bbs/app/feedback/faq/detail/page?seq_id=153";
        f131035r3 = str + "bbs/app/feedback/faq/detail/page?seq_id=171";
        f131041s3 = com.max.hbcommon.network.b.c() + "bbs/app/api/qcloud/cos/upload/token?";
        f131047t3 = str + "bbs/app/feedback/faq/detail/page?seq_id=173";
        f131053u3 = str + "bbs/app/feedback/faq/detail/page?seq_id=174";
        f131059v3 = str + "bbs/app/feedback/faq/detail/page?seq_id=175";
        f131065w3 = com.max.hbcommon.network.b.c() + "mall/trade/spu/page?";
        f131071x3 = com.max.hbcommon.network.b.c() + "mall/trade/trading_report/page?";
        f131077y3 = com.max.hbcommon.network.b.c() + "mall/trade/sku/page?";
        f131083z3 = str + "bbs/app/feedback/faq/detail/page?seq_id=180";
        A3 = str + "bbs/app/feedback/faq/detail/page?seq_id=184";
        B3 = com.max.hbcommon.network.b.c() + "bbs/app/feedback/faq/list/page?group_id=10";
        C3 = str + "bbs/app/feedback/faq/detail/page?seq_id=179";
        D3 = com.max.hbcommon.network.b.c() + "account/abount_real_name";
        E3 = str + "bbs/app/feedback/faq/detail/page?seq_id=187";
        F3 = str + "bbs/app/feedback/faq/detail/page?seq_id=107";
        G3 = str + "bbs/app/feedback/faq/detail/page?seq_id=181";
        H3 = str + "bbs/app/feedback/faq/detail/page?seq_id=191";
        I3 = com.max.hbcommon.network.b.c() + "game/h888_activity/lottery/index";
        J3 = com.max.hbcommon.network.b.c() + "mall/trade/static?";
        K3 = str + "bbs/app/feedback/faq/detail/page?seq_id=229";
        L3 = str + "bbs/app/feedback/faq/detail/page?seq_id=229";
        M3 = str + "bbs/app/feedback/faq/detail/page?seq_id=265";
        N3 = com.max.hbcommon.network.b.c() + "mall/trade/web/bind_sms/page";
        O3 = com.max.hbcommon.network.b.c() + "wiki/get_homepage_info_for_app/?wiki_id=730";
        P3 = str + "bbs/app/feedback/faq/detail/page?seq_id=266";
        Q3 = str + "heybox/switch_download";
        R3 = str + "heybox/epic_download";
        S3 = com.max.hbcommon.network.b.c() + "mall/cassette/web/detail/page?sku_id=%s&showMask=%s";
        T3 = com.max.hbcommon.network.b.c() + "bbs/app/feedback/faq/list/page?group_id=39";
        U3 = com.max.hbcommon.network.b.c() + "mall/cassette/web/page?sku_id=%s&showSell=1";
        V3 = com.max.hbcommon.network.b.c() + "mall/cassette/web/page?showSell=0";
        W3 = com.max.hbcommon.network.b.c() + "mall/coop/heyboxint/purchase/terms";
        X3 = com.max.hbcommon.network.b.c() + "account/realname_info";
        Y3 = str + "bbs/app/feedback/faq/detail/page?seq_id=277";
        Z3 = str + "bbs/app/feedback/faq/detail/page?seq_id=280";
        f130934a4 = str + "bbs/app/feedback/faq/detail/page?seq_id=286";
        f130940b4 = str + "bbs/app/feedback/faq/detail/page?seq_id=301";
        f130946c4 = com.max.hbcommon.network.b.c() + "mall/balance/purchase/tutorial";
        f130952d4 = str + "bbs/app/feedback/faq/detail/page?seq_id=287";
        f130958e4 = str + "bbs/app/feedback/faq/detail/page?seq_id=281";
        f130964f4 = com.max.hbcommon.network.b.c() + "mall/balance/steam_guard/course";
        f130970g4 = com.max.hbcommon.network.b.e() + "account/avatar";
        f130976h4 = com.max.hbcommon.network.b.c() + "game/xbox/xgp/web_index?xuid=%s";
        f130982i4 = str + "bbs/app/feedback/faq/detail/page?seq_id=297";
        f130988j4 = str + "bbs/app/feedback/faq/detail/page?seq_id=298";
        f130994k4 = str + "bbs/app/feedback/faq/detail/page?seq_id=427";
        f131000l4 = com.max.hbcommon.network.b.c() + "game/switch/jp/account/web?userid=%s";
        f131006m4 = com.max.hbcommon.network.b.c() + "game/switch/jp/bind/web/real";
        f131018o4 = com.max.hbcommon.network.b.e() + "account/game_statistic/trend?appid=%s";
        f131024p4 = str + "bbs/app/feedback/faq/detail/page?seq_id=234";
        f131030q4 = com.max.hbcommon.network.b.c() + "game/switch/jp/friends/web?userid=%s";
        f131036r4 = com.max.hbcommon.network.b.c() + "game/self_made_game_list/web/home?tab_type=my_album";
        f131042s4 = "heybox://{\"network\":false,\"navigation_bar\":{\"color\":\"1A1313\",\"transparent\":false,\"title\":\"\\u6e38\\u620f\\u5355\"},\"mini_program\":\"1\",\"full_screen\":false,\"report_stay\":\"1\",\"status_bar\":{\"style\":\"default\"},\"webview\":{\"pull\":false,\"loading\":false,\"url\":\"https:\\/\\/" + strA + "\\/game\\/self_made_game_list\\/web\\/home?tab=fav_album\",\"refresh\":false,\"bg\":\"F1F2F3\",\"proxy\":false},\"report_visit\":\"1\",\"protocol_type\":\"openWindow\"}";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(com.max.hbcommon.network.b.c());
        sb2.append("mall/user/agreement");
        f131048t4 = sb2.toString();
        f131054u4 = com.max.hbcommon.network.b.c() + "bbs/app/write_box/home";
        f131060v4 = str + "bbs/app/feedback/faq/detail/page?seq_id=35";
        f131066w4 = com.max.hbcommon.network.b.e() + "account/epic_bind/home?user_id=%s";
        StringBuilder sb3 = new StringBuilder();
        sb3.append("heybox://{\"network\":false,\"navigation_bar\":{\"color\":\"1A1313\",\"transparent\":false,\"title\":\"\"},\"mini_program\":\"1\",\"full_screen\":true,\"report_stay\":\"0\",\"status_bar\":{\"style\":\"light\"},\"webview\":{\"pull\":false,\"loading\":false,\"url\":\"https:\\/\\/");
        sb3.append(com.max.hbcommon.network.b.d());
        sb3.append("\\/chat\\/im\\/room\\/entrance?");
        sb3.append(com.max.hbcommon.network.b.f68052i ? "&skip=1" : "");
        sb3.append("&room_id=%s&channel_id=%s&link_id=%s\",\"refresh\":false,\"bg\":\"F1F2F3\",\"proxy\":false},\"report_visit\":\"0\",\"protocol_type\":\"openWindow\"}");
        f131072x4 = sb3.toString();
        f131078y4 = str + "bbs/app/feedback/faq/detail/page?seq_id=357";
        f131084z4 = "heybox://{\"network\":false,\"navigation_bar\":{\"color\":\"1A1313\",\"transparent\":false,\"title\":\"\"},\"full_screen\":true,\"status_bar\":{\"style\":\"light\"},\"webview\":{\"pull\":false,\"loading\":false,\"url\":\"https:\\/\\/" + com.max.hbcommon.network.b.d() + "\\/game\\/invite_friend_web\\/?&show_share_icon=1\",\"refresh\":false,\"bg\":\"F1F2F3\",\"proxy\":false},\"protocol_type\":\"openWindow\"}";
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append("bbs/app/feedback/faq/detail/page?seq_id=364");
        A4 = sb4.toString();
        B4 = str + "bbs/app/feedback/new/post/page?faq_id=376&faq_group_id=3";
        C4 = str + "bbs/app/feedback/new/post/page?faq_id=407&faq_group_id=3";
        D4 = com.max.hbcommon.network.b.c() + "game/player_search/web";
        E4 = com.max.hbcommon.network.b.e() + "tools/match_center/home";
        F4 = com.max.hbcommon.network.b.e() + "account/login_device_manage";
        G4 = "heybox://{\"protocol_type\":\"openWindow\",\"navigation_bar\":{\"title\":\"帮助\"},\"webview\":{\"url\":\"https://" + strA + "/bbs/app/feedback/faq/detail/page?seq_id=%s\"}}";
        I4 = "heybox://{\"protocol_type\":\"openWindow\",\"navigation_bar\":{\"title\":\"帮助\"},\"webview\":{\"url\":\"https://" + strA + "/bbs/app/feedback/faq/detail/page?seq_id=436\"},\"ignore_mini_program\":1}";
    }

    public static String a(String str) {
        byte b10 = 1;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.e.f32054v5, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null) {
            return null;
        }
        if (!b()) {
            return str;
        }
        switch (str.hashCode()) {
            case -1715608925:
                b10 = !str.equals(f130943c1) ? (byte) -1 : (byte) 0;
                break;
            case -1131505859:
                if (!str.equals(f130985j1)) {
                    b10 = -1;
                }
                break;
            case -221716567:
                b10 = !str.equals(f130979i1) ? (byte) -1 : (byte) 2;
                break;
            case 1648933186:
                b10 = !str.equals(f130961f1) ? (byte) -1 : (byte) 3;
                break;
            case 1956116243:
                b10 = !str.equals(f130973h1) ? (byte) -1 : (byte) 4;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return f130991k1;
            case 1:
                return f131015o1;
            case 2:
                return f131009n1;
            case 3:
                return f130997l1;
            case 4:
                return f131003m1;
            default:
                return str;
        }
    }

    public static boolean b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.e.f32020t5, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        ob.a aVar = ob.a.f132240a;
        return ob.a.b().t();
    }

    public static boolean c(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.e.f32071w5, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return f130943c1.equals(str) || f130991k1.equals(str) || f130961f1.equals(str) || f130997l1.equals(str) || f130973h1.equals(str) || f131003m1.equals(str) || f130979i1.equals(str) || f131009n1.equals(str) || f130967g1.equals(str) || f130949d1.equals(str) || f130955e1.equals(str) || f130985j1.equals(str) || f131015o1.equals(str);
    }

    public static String d(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.e.f32037u5, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null) {
            return null;
        }
        if (b()) {
            try {
                String host = Uri.parse(str).getHost();
                return host != null ? str.replaceFirst(host, a(host)) : str;
            } catch (Exception e10) {
                g.G("replaceHost url: " + str + "  error: " + e10.getMessage());
            }
        }
        return str;
    }
}
