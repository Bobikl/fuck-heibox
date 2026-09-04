package com.max.hbcache;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.gson.Gson;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: SPUtils.java */
/* JADX INFO: loaded from: classes9.dex */
public class c {
    public static final String A = "request_after_2_hour";
    public static final String A0 = "2";
    public static final String B = "tab_img_path";
    public static final String B0 = "KEY_NO_FRIENDS_TIP";
    public static final String C = "img_one_off";
    public static final String C0 = "KEY_IMAGE_CACHE_VERSION";
    public static final String D = "img_one_on";
    public static final String D0 = "KEY_DLC_V2";
    public static final String E = "img_two_off";
    public static final String E0 = "KEY_GAME_GLOBAL_PRICE_DIALOG_V3";
    public static final String F = "img_two_on";
    public static final String F0 = "KEY_DYNAMIC_SO";
    public static final String G = "img_three_off";
    public static final String G0 = "KEY_LIMITTED_VISITOR";
    public static final String H = "img_three_on";
    public static final String H0 = "KEY_MAX_SHOW_GUILDE";
    public static final String I = "img_four_off";
    public static final String I0 = "KEY_MAX_SHOW_ME_BUBBLE_TIME";
    public static final String J = "img_four_on";
    public static final String J0 = "new_topic_selector_outside";
    public static final String K = "tab_off_color";
    public static final String K0 = "newcomer_notify";
    public static final String L = "tab_on_color";
    public static final String L0 = "login_provider";
    public static final String M = "search_hot_words_key";
    public static final String M0 = "no_one_key_verify";
    public static final String N = "search_welcome_page_v2_defalut_q";
    public static final String N0 = "mob";
    public static final String O = "first_visit_get_game";
    public static final String P = "first_scan_photo_list";
    public static final String Q = "game_bind_card_type";
    public static final String R = "hide_platforms";
    public static final String S = "KEY_CLICK_MALL_STORE_PUBLICITY";
    public static final String T = "KEY_CLICK_MALL_STORE_PUBLICITY_TIMESTAMP";
    public static final String U = "KEY_CLICK_FOLLOW_GAME_TIME_STAMP";
    public static final String V = "KEY_SHOW_BUBBLE_FOLLOW_GAME_TIME_STAMP";
    public static final String W = "show_order_tip";
    public static final String X = "download_animation_";
    public static final String Y = "me_home_show_notify";
    public static final String Z = "me_platform_tab";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f66110a = "config";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f66111a0 = "sticker_group_list";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f66112b = "user";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f66113b0 = "sticker_group_list_version";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f66114c = "enterflag";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f66115c0 = "auto_played_video_list";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f66116d = "debug_info_config";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f66117d0 = "download_module_tip";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f66118e = "webPack";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f66119e0 = "task_first_tab_data";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f66120f = "download_report";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f66121f0 = "task_second_tab_data";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f66122g = "imuserinfo";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f66123g0 = "task_third_tab_data";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f66124h = "imrelationship";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f66125h0 = "upload_list";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f66126i = "down_load_info";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f66127i0 = "post_tab";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f66128j = "tabinfo";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f66129j0 = "select_game_impression";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f66130k = "debug_info";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f66131k0 = "KEY_SHOW_BUBBLE_ADD_TO_MY_MINIPROGRAM";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f66132l = "game_id_name_map";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f66133l0 = "KEY_HOME_CORNER_DOT";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f66134m = "web_storage_";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f66135m0 = "KEY_HOME_BUBBLE_VIEW_TIME";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f66136n = "ALLOW_RECOMMEND";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final String f66137n0 = "KEY_HOME_BUBBLE_RECORD";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f66138o = "REPLY_TIMESTAMP";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f66139o0 = "KEY_HOME_BUBBLE_LAST_ID";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f66140p = "FOLLOW_TIMESTAMP";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f66141p0 = "KEY_HOME_OVERALL_AD";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f66142q = "FOLLOW_USER_INFO";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f66143q0 = "KEY_WEB_BRANCH";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f66144r = "IM_MSG_TIMESTAMP";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f66145r0 = "KEY_RYLAI_SERVICE_TAG";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f66146s = "HAS_UNREAD_MSG";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f66147s0 = "KEY_DEBUG_ROUTE_CONFIG";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f66148t = "mall_agreement_v227";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f66149t0 = "KEY_TEAM_CHAT_NOTIFY";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f66150u = "USE_TEST_SERVER";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f66151u0 = "KEY_FIRST_SELECT_GAME_SHOT";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f66152v = "USE_HEYBOX_VOICE_INTERNAL_SERVER";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final String f66153v0 = "KEY_SHORT_CUT_TIP_DIALOG_ALREADY_SHOW";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f66154w = "topic_%1$s_wiki_time";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final String f66155w0 = "KEY_STATIC_RESOURCE_VERSION";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f66156x = "topic_%1$s_provisions_time";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String f66157x0 = "SHP_DARK_MODE_STATE";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f66158y = "profile_prefer_platform";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String f66159y0 = "0";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f66160z = "request_after_5_sec";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f66161z0 = "1";

    public static void A(String str, List<String> list) {
        if (PatchProxy.proxy(new Object[]{str, list}, null, changeQuickRedirect, true, bb.c.b.Io, new Class[]{String.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        n(f66114c).edit().putString(str, new Gson().toJson(list)).apply();
    }

    public static void B(String str, List<String> list) {
        if (PatchProxy.proxy(new Object[]{str, list}, null, changeQuickRedirect, true, bb.c.b.Jo, new Class[]{String.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        HashSet hashSet = new HashSet();
        if (list != null && list.size() > 0) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        n(f66114c).edit().putStringSet(str, hashSet).apply();
    }

    public static void C(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.b.Ho, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        n(f66110a).edit().putString(str, str2).apply();
    }

    public static void D(String str, Set<String> set) {
        if (PatchProxy.proxy(new Object[]{str, set}, null, changeQuickRedirect, true, bb.c.b.No, new Class[]{String.class, Set.class}, Void.TYPE).isSupported) {
            return;
        }
        n(f66128j).edit().putStringSet(str, set).apply();
    }

    public static void E(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.b.np, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        n(f66128j).edit().putString(str, str2).apply();
    }

    public static void F(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.b.ep, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        z(f66134m + str, str2);
    }

    public static void G(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, null, changeQuickRedirect, true, bb.c.b.hp, new Class[]{Long.TYPE}, Void.TYPE).isSupported || j10 == -1) {
            return;
        }
        SharedPreferences sharedPreferencesN = n(f66126i);
        for (Map.Entry<String, ?> entry : sharedPreferencesN.getAll().entrySet()) {
            if (j10 == ((Long) entry.getValue()).longValue()) {
                sharedPreferencesN.edit().remove(entry.getKey()).apply();
            }
        }
    }

    public static void H(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.ip, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        n(f66126i).edit().remove(str).apply();
    }

    public static void I(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.Ro, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        n(f66120f).edit().remove(str).apply();
    }

    public static void J(Context context, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{context, bool}, null, changeQuickRedirect, true, bb.c.b.To, new Class[]{Context.class, Boolean.class}, Void.TYPE).isSupported) {
            return;
        }
        context.getSharedPreferences(f66114c, 0).edit().putBoolean(f66136n, bool.booleanValue()).apply();
    }

    public static void K(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.rp, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        n(f66116d).edit().putString("DebugInfo", str).commit();
    }

    public static void L(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.b.Yo, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            C(f66148t, "1");
        } else {
            C(f66148t, "0");
        }
    }

    public static void M(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.b.Wo, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            C(f66146s, "true");
        } else {
            C(f66146s, "false");
        }
    }

    public static void N(Context context, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, bb.c.b.qp, new Class[]{Context.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("USERINFO", 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static void a(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.Qo, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        n(f66120f).edit().putString(str, "1").apply();
    }

    public static void b() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.tp, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        n(f66116d).edit().clear().commit();
    }

    public static void c() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.Po, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Log.d("HBSecurity", "清空SP");
        n(f66110a).edit().clear().apply();
        n(f66124h).edit().clear().apply();
        n(f66122g).edit().clear().apply();
    }

    public static <T> T d(String str, String str2, Class<T> cls) {
        T t10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, cls}, null, changeQuickRedirect, true, bb.c.b.mp, new Class[]{String.class, String.class, Class.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        String string = n(str).getString(str2, "");
        if (TextUtils.isEmpty(string) || (t10 = (T) k.a(string, cls)) == null) {
            return null;
        }
        return t10;
    }

    public static Boolean e(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.b.Uo, new Class[]{Context.class}, Boolean.class);
        return patchProxyResultProxy.isSupported ? (Boolean) patchProxyResultProxy.result : Boolean.valueOf(context.getSharedPreferences(f66114c, 0).getBoolean(f66136n, true));
    }

    public static String f(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.b.ap, new Class[]{String.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : n(f66130k).getString(str, str2);
    }

    public static String g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.sp, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : n(f66116d).getString("DebugInfo", null);
    }

    public static long h(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.kp, new Class[]{String.class}, Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : n(f66126i).getLong(str, -1L);
    }

    public static Map<String, String> i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.So, new Class[0], Map.class);
        return patchProxyResultProxy.isSupported ? (Map) patchProxyResultProxy.result : n(f66120f).getAll();
    }

    public static String j(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.cp, new Class[]{String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : n(f66114c).getString(str, "");
    }

    public static String k(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.b.dp, new Class[]{String.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : n(f66114c).getString(str, str2);
    }

    public static List<String> l(String str) {
        List<String> listB;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.Mo, new Class[]{String.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        String string = n(f66114c).getString(str, "");
        if (TextUtils.isEmpty(string) || (listB = k.b(string, String.class)) == null) {
            return null;
        }
        return listB;
    }

    public static Set<String> m(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.Ko, new Class[]{String.class}, Set.class);
        return patchProxyResultProxy.isSupported ? (Set) patchProxyResultProxy.result : n(f66114c).getStringSet(str, null);
    }

    public static SharedPreferences n(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.Go, new Class[]{String.class}, SharedPreferences.class);
        return patchProxyResultProxy.isSupported ? (SharedPreferences) patchProxyResultProxy.result : BaseApplication.a().getSharedPreferences(str, 0);
    }

    public static String o(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.b.Lo, new Class[]{String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        SharedPreferences sharedPreferencesN = n(f66110a);
        Log.d("getString", str + "  " + sharedPreferencesN.getString(str, str2));
        return sharedPreferencesN.getString(str, str2);
    }

    public static Set<String> p(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.Oo, new Class[]{String.class}, Set.class);
        return patchProxyResultProxy.isSupported ? (Set) patchProxyResultProxy.result : n(f66128j).getStringSet(str, new HashSet());
    }

    public static String q(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.b.op, new Class[]{String.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : n(f66128j).getString(str, str2);
    }

    public static String r(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.b.pp, new Class[]{Context.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : context.getSharedPreferences("USERINFO", 0).getString(str, "");
    }

    public static String s(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.fp, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return j(f66134m + str);
    }

    public static boolean t() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.Xo, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : "1".equalsIgnoreCase(o(f66148t, "0"));
    }

    public static boolean u(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, null, changeQuickRedirect, true, bb.c.b.gp, new Class[]{Long.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (j10 == -1) {
            return false;
        }
        Iterator<Map.Entry<String, ?>> it = n(f66126i).getAll().entrySet().iterator();
        while (it.hasNext()) {
            if (j10 == ((Long) it.next().getValue()).longValue()) {
                return true;
            }
        }
        return false;
    }

    public static boolean v() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.Vo, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : "true".equalsIgnoreCase(o(f66146s, "false"));
    }

    public static <T> void w(String str, String str2, T t10) {
        if (PatchProxy.proxy(new Object[]{str, str2, t10}, null, changeQuickRedirect, true, bb.c.b.lp, new Class[]{String.class, String.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        n(str).edit().putString(str2, k.p(t10)).apply();
    }

    public static void x(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.b.Zo, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        n(f66130k).edit().putString(str, str2).apply();
    }

    public static void y(String str, long j10) {
        if (PatchProxy.proxy(new Object[]{str, new Long(j10)}, null, changeQuickRedirect, true, bb.c.b.jp, new Class[]{String.class, Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        n(f66126i).edit().putLong(str, j10).apply();
    }

    public static void z(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.b.bp, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        n(f66114c).edit().putString(str, str2).apply();
    }
}
