package com.max.xiaoheihe.flutter;

import android.content.Context;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.k;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.account.AccountDetailObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.flutter.pages.FlutterGameDeveloperActivity;
import com.max.xiaoheihe.module.littleprogram.b;
import com.max.xiaoheihe.okflutter.FlutterHelper;
import com.max.xiaoheihe.okflutter.containers.HBFlutterFragmentActivity;
import com.max.xiaoheihe.okflutter.entity.HybridResult;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.taobao.accs.common.Constants;
import com.tencent.qcloud.core.util.IOUtils;
import dl.d;
import dl.e;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import yh.l;

/* JADX INFO: compiled from: FlutterRouter.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FlutterRouter {
    public static final int $stable = 0;

    @d
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: FlutterRouter.kt */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final void route(@d final Context context, @d WebProtocolObj webProtocolObj, @d String path, @e HashMap<String, Object> map) {
            String str;
            AccountDetailObj account_detail;
            if (PatchProxy.proxy(new Object[]{context, webProtocolObj, path, map}, this, changeQuickRedirect, false, 21992, new Class[]{Context.class, WebProtocolObj.class, String.class, HashMap.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(webProtocolObj, "webProtocolObj");
            f0.p(path, "path");
            g.f74531b.q("FlutterRouter, route, path = " + path + ", params = " + map + ", params = " + webProtocolObj.getParams() + ", kvPair = " + webProtocolObj.getKvPair());
            if (kotlin.text.u.v2(path, "/", false, 2, null)) {
                str = path;
            } else {
                str = IOUtils.DIR_SEPARATOR_UNIX + path;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            if (i0.s()) {
                User userO = i0.o();
                String userid = (userO == null || (account_detail = userO.getAccount_detail()) == null) ? null : account_detail.getUserid();
                if (userid == null) {
                    userid = "";
                }
                linkedHashMap.put("my_heybox_id", userid);
            }
            HashMap<String, String> params = webProtocolObj.getParams();
            if (params != null) {
                linkedHashMap.putAll(params);
            }
            Map<String, String> kvPair = webProtocolObj.getKvPair();
            if (kvPair != null) {
                linkedHashMap.putAll(kvPair);
            }
            linkedHashMap.put(Constants.SP_KEY_DEBUG_MODE, Boolean.FALSE);
            String strP = k.p(linkedHashMap);
            boolean zG = map != null ? f0.g(map.get("needResult"), Boolean.TRUE) : false;
            final String str2 = (String) (map != null ? map.get("resultAction") : null);
            if (b.f88740a.o(context, str, webProtocolObj, linkedHashMap)) {
                return;
            }
            if (f0.g(path, "/flutter/game_developer")) {
                FlutterGameDeveloperActivity.Companion.start(context, map != null ? map.get("dvpid") : null);
            } else if (zG && (context instanceof AppCompatActivity)) {
                FlutterHelper.INSTANCE.getInstance().startFlutterActivityForResult((AppCompatActivity) context, str, strP, new l<HybridResult, b2>() { // from class: com.max.xiaoheihe.flutter.FlutterRouter$Companion$route$4
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(HybridResult hybridResult) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hybridResult}, this, changeQuickRedirect, false, 21994, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2(hybridResult);
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@e HybridResult hybridResult) {
                        if (PatchProxy.proxy(new Object[]{hybridResult}, this, changeQuickRedirect, false, 21993, new Class[]{HybridResult.class}, Void.TYPE).isSupported || str2 == null) {
                            return;
                        }
                        if (hybridResult != null && hybridResult.getResultCode() == 0) {
                            Log.d("flutter", "执行额外操作");
                            com.max.xiaoheihe.base.router.b.k0(context, str2);
                        }
                    }
                });
            } else {
                context.startActivity(new HBFlutterFragmentActivity.FlutterFragmentActivityIntentBuilder(BaseFlutterActivity.class).path(str).paramJson(strP).build(context));
            }
        }
    }
}
