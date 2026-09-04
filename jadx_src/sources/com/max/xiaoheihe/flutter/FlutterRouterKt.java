package com.max.xiaoheihe.flutter;

import android.content.Context;
import android.os.Bundle;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.max.hbcache.c;
import com.max.hbminiprogram.h;
import com.max.hbutils.utils.k;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.bean.account.AccountDetailObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.taobao.accs.common.Constants;
import dl.d;
import dl.e;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.u;
import ob.b;

/* JADX INFO: compiled from: FlutterRouter.kt */
/* JADX INFO: loaded from: classes3.dex */
@t0({"SMAP\nFlutterRouter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterRouter.kt\ncom/max/xiaoheihe/flutter/FlutterRouterKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n1855#2,2:134\n*S KotlinDebug\n*F\n+ 1 FlutterRouter.kt\ncom/max/xiaoheihe/flutter/FlutterRouterKt\n*L\n92#1:134,2\n*E\n"})
public final class FlutterRouterKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    public static final String serializeFlutterPageParams(@d Context context, @e Bundle bundle, @e String str) {
        AccountDetailObj account_detail;
        AccountDetailObj account_detail2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, bundle, str}, null, changeQuickRedirect, true, 21995, new Class[]{Context.class, Bundle.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        g.f74531b.q("serializeFlutterPageParams, context = " + context + ", pageBundle = " + bundle + ", paramsJson = " + str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bundle == null) {
            bundle = androidx.core.os.e.a();
        }
        Set<String> setKeySet = bundle.keySet();
        if (setKeySet != null) {
            for (String key : setKeySet) {
                Object obj = bundle.get(key);
                if (obj != null) {
                    f0.o(key, "key");
                    linkedHashMap.put(key, obj);
                }
            }
        }
        linkedHashMap.put("cur_env", context instanceof h ? b.f132259k : context instanceof MainActivity ? "tab" : "normal");
        if (i0.s()) {
            User userO = i0.o();
            String username = null;
            String userid = (userO == null || (account_detail2 = userO.getAccount_detail()) == null) ? null : account_detail2.getUserid();
            if (userid == null) {
                userid = "";
            }
            linkedHashMap.put("my_heybox_id", userid);
            User userO2 = i0.o();
            if (userO2 != null && (account_detail = userO2.getAccount_detail()) != null) {
                username = account_detail.getUsername();
            }
            if (username == null) {
                username = "";
            }
            linkedHashMap.put("my_heybox_username", username);
        }
        linkedHashMap.put(Constants.SP_KEY_DEBUG_MODE, Boolean.FALSE);
        linkedHashMap.put("debug_server", Boolean.valueOf(com.max.hbcommon.network.b.f68052i));
        linkedHashMap.put("voice_internal_server", Boolean.valueOf(u.L1("true", c.f(c.f66152v, ""), true)));
        if (str != null) {
            Map map = (Map) new Gson().fromJson(str, new TypeToken<Map<String, ? extends Object>>() { // from class: com.max.xiaoheihe.flutter.FlutterRouterKt$serializeFlutterPageParams$2$map$1
            }.getType());
            f0.o(map, "map");
            linkedHashMap.putAll(map);
        }
        g.f74531b.q("serializeFlutterPageParams, paramsMap = " + linkedHashMap);
        String strP = k.p(linkedHashMap);
        f0.o(strP, "serialize(\n        paramsMap\n    )");
        return strP;
    }
}
