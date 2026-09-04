package ad;

import com.max.hbmmkv.MMKVManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.mmkv.MMKV;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MMKVABTest.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class a {

    @dl.d
    public static final String A = "improve_ab_testdisable_new_style_emoji_keyboard";

    @dl.d
    public static final String B = "improve_ab_testenable_search_refresh_feeds";

    @dl.d
    public static final String C = "improve_ab_testdisable_moment_privacy_setting";

    @dl.d
    public static final String D = "improve_ab_testdisable_user_centered_search";

    @dl.d
    public static final String E = "improve_ab_testenable_new_style_collect";

    @dl.d
    public static final String F = "improve_ab_testdisable_darkmode_error_correct";

    @dl.d
    public static final String G = "improve_ab_testdisable_new_time_desc_rule";

    @dl.d
    public static final String H = "improve_ab_testdisable_top_tab_trigger_refresh";

    @dl.d
    public static final String I = "improve_ab_testdisable_post_compilation";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final String f1194a = "improve_ab_test";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final String f1195b = "improve_ab_testclear_crash_level";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final String f1196c = "improve_ab_testrelease_resources";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final String f1197d = "improve_ab_testerror_retry";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final String f1198e = "improve_ab_testuse_old_feed_back";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final String f1199f = "improve_ab_testlink_detail_lt_desc";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    public static final String f1200g = "improve_ab_testbbs_text_view_small_icon";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final String f1201h = "improve_ab_testdisable_open_link_when_post";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final String f1202i = "improve_ab_testgame_detail_feedback";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final String f1203j = "improve_ab_testshow_fullscreen_award_guide";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    public static final String f1204k = "improve_ab_testdisable_web_link_fullscreen_award";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    public static final String f1205l = "improve_ab_testsearch_welcome_page_v2";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    public static final String f1206m = "improve_ab_testopen_post_scroll_reply_owner";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    public static final String f1207n = "improve_ab_testlink_detail_not_wait_web_ready";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    public static final String f1208o = "improve_ab_testdisable_web_global_page_report";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    public static final String f1209p = "improve_ab_testdisable_post_gesture_to_userhome";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    public static final String f1210q = "improve_ab_testgetui_gtc";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    public static final String f1211r = "improve_ab_testsearch_welcome_v3";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    public static final String f1212s = "improve_ab_testpost_edit_new_topic_hashtag_entry";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    public static final String f1213t = "improve_ab_testdisable_img_viewer_single_load";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    public static final String f1214u = "improve_ab_testdisable_post_add_topic_restriction";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    public static final String f1215v = "improve_ab_testenable_new_bbs_style";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    public static final String f1216w = "improve_ab_testdisable_proxy_line_select";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    public static final String f1217x = "improve_ab_testandroid_disable_only_cookie_manger";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    public static final String f1218y = "improve_ab_testdisable_restore_auto_saved_draft";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    public static final String f1219z = "improve_ab_testdisable_share_private_chat_btn";

    public static final boolean a(@dl.d String key, boolean z10) {
        Object[] objArr = {key, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.i.f33327h2, new Class[]{String.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(key, "key");
        return MMKVManager.f71329a.d("improve_ab_test", key, z10, true);
    }

    public static /* synthetic */ boolean b(String str, boolean z10, int i10, Object obj) {
        Object[] objArr = {str, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.i.f33332i2, new Class[]{String.class, cls, Integer.TYPE, Object.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a(str, z10);
    }

    public static final int c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.i.f33347l2, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : MMKV.mmkvWithID("improve_ab_test").decodeInt(f1195b);
    }

    public static final boolean d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.i.f33337j2, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : a(f1196c, false);
    }

    public static final void e(@dl.d String key, boolean z10) {
        if (PatchProxy.proxy(new Object[]{key, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.i.f33322g2, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(key, "key");
        MMKVManager.f71329a.k("improve_ab_test", key, z10, true);
    }

    public static final void f(@dl.e String str) {
        int i10 = 0;
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.i.f33342k2, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (str != null) {
            try {
                i10 = Integer.parseInt(str);
            } catch (Exception unused) {
            }
        }
        MMKV.mmkvWithID("improve_ab_test", i10).encode(f1195b, i10);
    }
}
