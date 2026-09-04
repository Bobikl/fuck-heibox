package com.max.xiaoheihe.module.littleprogram;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.runtime.internal.o;
import com.max.hbminiprogram.h;
import com.max.hbutils.utils.k;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.bbs.WikiEntryObj;
import com.max.xiaoheihe.module.miniprogram.MiniProgramHostActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.u0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import xh.i;
import xh.m;

/* JADX INFO: compiled from: MiniProgramNavigator.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class b {

    @d
    public static final String A = "/game/destiny2/matches";

    @d
    public static final String B = "/game/destiny2/mode/detail";

    @d
    public static final String C = "/mine/following";

    @d
    public static final String D = "/mine/user/game";

    @d
    public static final String E = "/mine/achievement";

    @d
    public static final String F = "/mine/matches";

    @d
    public static final String G = "/mine/game/achievement";

    @d
    public static final String H = "BROADCAST_ARG_FLAG";

    @d
    public static final String I = "FLAG_TO_BACKGROUND";

    @d
    public static final String J = "FLAG_TO_FOREGROUND";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f88741b = 0;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @d
    public static final String f88749j = "/game/pubg/v2";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @d
    public static final String f88750k = "/game/pubg/detail";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @d
    public static final String f88751l = "/game/pubg/friend/rank";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @d
    public static final String f88752m = "/game/pubg/detail_container_v2";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @d
    public static final String f88753n = "/game/pubg/common";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @d
    public static final String f88754o = "game/roll/joined/users";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @d
    public static final String f88755p = "/game/player/leader/boards";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @d
    public static final String f88756q = "/game/csgo/bans";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @d
    public static final String f88757r = "/game/csgo_5e/bans";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @d
    public static final String f88758s = "/game/csgo_b5/bans";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @d
    public static final String f88759t = "/game/csgo_5e/matches";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @d
    public static final String f88760u = "/game/csgo_b5/matches";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @d
    public static final String f88761v = "/game/apex/player/logs";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @d
    public static final String f88762w = "/game/csgo_5e/mode/detail";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @d
    public static final String f88763x = "/game/csgo_b5/mode/detail";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @d
    public static final String f88764y = "/game/csgo_5e/weapons";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @d
    public static final String f88765z = "/game/csgo_b5/weapons";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final a f88740a = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private static final String f88742c = "web_protocol";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private static final String f88743d = "ignore_mini_program";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private static String f88744e = lb.d.H2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private static String f88745f = lb.d.I2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private static String f88746g = lb.d.J2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d
    private static String f88747h = lb.d.K2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d
    private static String f88748i = lb.d.L2;

    /* JADX INFO: compiled from: MiniProgramNavigator.kt */
    @t0({"SMAP\nMiniProgramNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiniProgramNavigator.kt\ncom/max/xiaoheihe/module/littleprogram/MiniProgramNavigator$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,336:1\n37#2,2:337\n37#2,2:339\n37#2,2:343\n215#3,2:341\n*S KotlinDebug\n*F\n+ 1 MiniProgramNavigator.kt\ncom/max/xiaoheihe/module/littleprogram/MiniProgramNavigator$Companion\n*L\n143#1:337,2\n176#1:339,2\n242#1:343,2\n224#1:341,2\n*E\n"})
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @m
        public static /* synthetic */ void c() {
        }

        public static /* synthetic */ void j(a aVar, Context context, Map map, int i10, Object obj) {
            if (PatchProxy.proxy(new Object[]{aVar, context, map, new Integer(i10), obj}, null, changeQuickRedirect, true, 38665, new Class[]{a.class, Context.class, Map.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if ((i10 & 2) != 0) {
                map = null;
            }
            aVar.i(context, map);
        }

        public static /* synthetic */ boolean m(a aVar, Context context, String str, Bundle bundle, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, context, str, bundle, new Integer(i10), obj}, null, changeQuickRedirect, true, 38671, new Class[]{a.class, Context.class, String.class, Bundle.class, Integer.TYPE, Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if ((i10 & 4) != 0) {
                bundle = null;
            }
            return aVar.l(context, str, bundle);
        }

        @d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38653, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f88743d;
        }

        @d
        public final String b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38652, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f88742c;
        }

        @d
        public final String d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38656, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f88745f;
        }

        @d
        public final String e() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38654, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f88744e;
        }

        @d
        public final String f() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38662, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f88748i;
        }

        @d
        public final String g() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38660, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f88747h;
        }

        @d
        public final String h() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38658, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f88746g;
        }

        @m
        public final void i(@d Context context, @e Map<String, ? extends Object> map) {
            Bundle bundleB;
            if (PatchProxy.proxy(new Object[]{context, map}, this, changeQuickRedirect, false, 38664, new Class[]{Context.class, Map.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            g.f74531b.q("LittleProgramUtil, openGameCenter, params = " + map);
            if (map != null) {
                Pair[] pairArr = (Pair[]) u0.J1(map).toArray(new Pair[0]);
                bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            } else {
                bundleB = null;
            }
            l(context, lb.d.P2, bundleB);
        }

        @i
        @m
        public final boolean k(@d Context context, @d String path) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, path}, this, changeQuickRedirect, false, 38673, new Class[]{Context.class, String.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(context, "context");
            f0.p(path, "path");
            return m(this, context, path, null, 4, null);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x006f  */
        /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
        @i
        @m
        public final boolean l(@d Context context, @d String path, @e Bundle bundle) {
            Serializable serializable;
            boolean z10;
            String string;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, path, bundle}, this, changeQuickRedirect, false, 38670, new Class[]{Context.class, String.class, Bundle.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(context, "context");
            f0.p(path, "path");
            Activity activityA = context instanceof Activity ? (Activity) context : com.max.hbutils.utils.e.b().a();
            String strB = null;
            if (Build.VERSION.SDK_INT >= 33) {
                if (bundle != null) {
                    serializable = (WebProtocolObj) bundle.getSerializable(b(), WebProtocolObj.class);
                } else {
                    serializable = null;
                }
            } else if (bundle != null) {
                serializable = bundle.getSerializable(b());
            } else {
                serializable = null;
            }
            boolean z11 = serializable instanceof WebProtocolObj;
            if (z11 && com.max.hbcommon.utils.c.x(((WebProtocolObj) serializable).valueOf(a()))) {
                return false;
            }
            if (f0.g(bundle != null ? bundle.getString(ob.b.f132259k, "-1") : null, "1")) {
                z10 = true;
            } else {
                if (bundle != null && bundle.getInt(ob.b.f132259k, -1) == 1) {
                    z10 = true;
                } else {
                    if (z11 ? ((WebProtocolObj) serializable).isMiniProgram() : false) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            if (z11) {
                string = ((WebProtocolObj) serializable).getMini_program_id();
            } else {
                string = bundle != null ? bundle.getString("mini_program_id") : null;
            }
            boolean z12 = context instanceof h;
            if (z12 && (strB = ((h) context).B()) == null) {
                strB = "-1";
            }
            boolean z13 = (z10 && strB == null) || !(!z10 || TextUtils.isEmpty(string) || f0.g(string, strB));
            g.f74531b.q("LittleProgramUtil, openMiniProgram, relaunchContainer = " + z13 + ", curMiniprogramId = " + strB + ", destMiniprogramId = " + string + "  path = " + path + ", bundle = " + bundle);
            if (z13) {
                activityA.startActivity(MiniProgramHostActivity.C4.a(context, path, bundle));
                return true;
            }
            if (z12) {
                return ((h) context).s0(path, bundle);
            }
            return false;
        }

        @m
        public final void n(@d Context context, @d String path, @d Bundle params) {
            if (PatchProxy.proxy(new Object[]{context, path, params}, this, changeQuickRedirect, false, 38669, new Class[]{Context.class, String.class, Bundle.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(path, "path");
            f0.p(params, "params");
            if (l(context, path, params)) {
                return;
            }
            MiniProgramContainerActivity.L.d(context, path, params);
        }

        @m
        public final boolean o(@d Context context, @d String path, @e WebProtocolObj webProtocolObj, @e Map<String, ? extends Object> map) {
            String strValueOf;
            HashMap map2;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, path, webProtocolObj, map}, this, changeQuickRedirect, false, 38668, new Class[]{Context.class, String.class, WebProtocolObj.class, Map.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(context, "context");
            f0.p(path, "path");
            g.f74531b.q("LittleProgramUtil, startLittleProgramWithWebProtocalObj, path = " + path + ", params = " + map);
            if (!(context instanceof h)) {
                if (!(webProtocolObj != null && webProtocolObj.isMiniProgram())) {
                    return false;
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (webProtocolObj != null && webProtocolObj.isMiniProgram()) {
                linkedHashMap.put(ob.b.f132259k, "1");
            }
            if (webProtocolObj != null && (strValueOf = webProtocolObj.valueOf("params")) != null && (map2 = (HashMap) k.a(strValueOf, HashMap.class)) != null) {
                f0.o(map2, "deserialize(it, HashMap::class.java)");
                for (Map.Entry entry : map2.entrySet()) {
                    if (entry.getKey() instanceof String) {
                        Object key = entry.getKey();
                        f0.n(key, "null cannot be cast to non-null type kotlin.String");
                        Object value = entry.getValue();
                        f0.o(value, "it.value");
                        linkedHashMap.put((String) key, value);
                    }
                }
            }
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            if (webProtocolObj != null) {
                linkedHashMap.put(b.f88740a.b(), webProtocolObj);
            }
            g.f74531b.q("LittleProgramUtil, startLittleProgramWithWebProtocalObj, path = " + path + ", mutableMap = " + linkedHashMap);
            Pair[] pairArr = (Pair[]) u0.J1(linkedHashMap).toArray(new Pair[0]);
            return l(context, path, androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        }

        @m
        public final boolean p(@d Context context, @d Intent intent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 38667, new Class[]{Context.class, Intent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(context, "context");
            f0.p(intent, "intent");
            g.f74531b.q("LittleProgramUtil, openWebMiniProgramByIntent, intent = " + intent.getExtras());
            return l(context, MiniProgramHostActivity.E4, intent.getExtras());
        }

        @m
        public final boolean q(@d Context context, @e WebProtocolObj webProtocolObj, @e Map<String, ? extends Object> map) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, webProtocolObj, map}, this, changeQuickRedirect, false, 38666, new Class[]{Context.class, WebProtocolObj.class, Map.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(context, "context");
            g.a aVar = g.f74531b;
            aVar.q("LittleProgramUtil, openWikiEntry, params = " + map);
            if (webProtocolObj == null) {
                return false;
            }
            if (!webProtocolObj.isMiniProgram() && !(context instanceof h)) {
                return false;
            }
            WikiEntryObj wikiEntryObj = (WikiEntryObj) webProtocolObj.objectOf("entry", WikiEntryObj.class);
            aVar.q("LittleProgramUtil, openWikiEntry, wikiEntryObj = " + wikiEntryObj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (wikiEntryObj != null) {
                linkedHashMap.put("wiki", wikiEntryObj);
            }
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            Pair[] pairArr = (Pair[]) u0.J1(linkedHashMap).toArray(new Pair[0]);
            return l(context, "/wiki/get_article_for_app/", androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        }

        @m
        public final void r(@d Context context, boolean z10) {
            if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38672, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            Intent intent = new Intent(lb.a.f130948d0);
            intent.putExtra(b.H, z10 ? b.I : b.J);
            context.sendBroadcast(intent);
        }

        public final void s(@d String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38657, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(str, "<set-?>");
            b.f88745f = str;
        }

        public final void t(@d String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38655, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(str, "<set-?>");
            b.f88744e = str;
        }

        public final void u(@d String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38663, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(str, "<set-?>");
            b.f88748i = str;
        }

        public final void v(@d String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38661, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(str, "<set-?>");
            b.f88747h = str;
        }

        public final void w(@d String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38659, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(str, "<set-?>");
            b.f88746g = str;
        }
    }

    @d
    public static final String m() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 38643, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f88740a.b();
    }

    @m
    public static final void n(@d Context context, @e Map<String, ? extends Object> map) {
        if (PatchProxy.proxy(new Object[]{context, map}, null, changeQuickRedirect, true, 38644, new Class[]{Context.class, Map.class}, Void.TYPE).isSupported) {
            return;
        }
        f88740a.i(context, map);
    }

    @i
    @m
    public static final boolean o(@d Context context, @d String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 38651, new Class[]{Context.class, String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f88740a.k(context, str);
    }

    @i
    @m
    public static final boolean p(@d Context context, @d String str, @e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, bundle}, null, changeQuickRedirect, true, 38649, new Class[]{Context.class, String.class, Bundle.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f88740a.l(context, str, bundle);
    }

    @m
    public static final void q(@d Context context, @d String str, @d Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{context, str, bundle}, null, changeQuickRedirect, true, 38648, new Class[]{Context.class, String.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f88740a.n(context, str, bundle);
    }

    @m
    public static final boolean r(@d Context context, @d String str, @e WebProtocolObj webProtocolObj, @e Map<String, ? extends Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, webProtocolObj, map}, null, changeQuickRedirect, true, 38647, new Class[]{Context.class, String.class, WebProtocolObj.class, Map.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f88740a.o(context, str, webProtocolObj, map);
    }

    @m
    public static final boolean s(@d Context context, @d Intent intent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, intent}, null, changeQuickRedirect, true, 38646, new Class[]{Context.class, Intent.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f88740a.p(context, intent);
    }

    @m
    public static final boolean t(@d Context context, @e WebProtocolObj webProtocolObj, @e Map<String, ? extends Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, webProtocolObj, map}, null, changeQuickRedirect, true, 38645, new Class[]{Context.class, WebProtocolObj.class, Map.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f88740a.q(context, webProtocolObj, map);
    }

    @m
    public static final void u(@d Context context, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 38650, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f88740a.r(context, z10);
    }
}
