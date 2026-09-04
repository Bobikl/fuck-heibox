package com.max.xiaoheihe.module.chat;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.runtime.internal.o;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.max.hbexpression.RecentEmojiManger;
import com.max.hbutils.utils.k;
import com.max.heybox.hblog.g;
import com.max.mediaselector.utils.PictureCacheManager;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.BizMessageObj;
import com.max.xiaoheihe.flutter.BaseFlutterActivity;
import com.max.xiaoheihe.okflutter.FlutterHelper;
import com.max.xiaoheihe.okflutter.containers.HBFlutterFragmentActivity;
import com.max.xiaoheihe.okflutter.pigeon.IHybridMessage;
import com.max.xiaoheihe.utils.m0;
import com.max.xiaoheihe.utils.n0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.HashMap;
import java.util.Map;
import kotlin.c1;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: FlutterMsgConversationActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class FlutterMsgConversationActivity extends BaseFlutterActivity implements m0.g {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private String f83515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    public static final a f83513c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f83514d = 8;

    /* JADX INFO: compiled from: FlutterMsgConversationActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @m
        public final void a(@d Context context, @d String userId, @d String name) {
            if (PatchProxy.proxy(new Object[]{context, userId, name}, this, changeQuickRedirect, false, 31366, new Class[]{Context.class, String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(userId, "userId");
            f0.p(name, "name");
            if (HeyBoxApplication.S()) {
                FlutterHelper.INSTANCE.getInstance().startFlutterFragmentActivity(context, "/flutter/user_message", FlutterMsgConversationActivity.class, k.p(s0.W(c1.a("userId", userId), c1.a("userName", name))));
            }
        }
    }

    /* JADX INFO: compiled from: FlutterMsgConversationActivity.kt */
    public static final class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31367, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            HBFlutterFragmentActivity.sendFlutterMessage$default(FlutterMsgConversationActivity.this, "web_socket", null, null, 6, null);
        }
    }

    /* JADX INFO: compiled from: FlutterMsgConversationActivity.kt */
    public static final class c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f83517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FlutterMsgConversationActivity f83518c;

        c(String str, FlutterMsgConversationActivity flutterMsgConversationActivity) {
            this.f83517b = str;
            this.f83518c = flutterMsgConversationActivity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31368, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            HashMap map = new HashMap();
            map.put("msg", this.f83517b);
            HBFlutterFragmentActivity.sendFlutterMessage$default(this.f83518c, "web_socket", map, null, 4, null);
        }
    }

    @m
    public static final void P0(@d Context context, @d String str, @d String str2) {
        if (PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, 31365, new Class[]{Context.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f83513c.a(context, str, str2);
    }

    @Override // com.max.xiaoheihe.utils.m0.g
    public void F2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31362, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        n0.a(this);
        runOnUiThread(new b());
    }

    @e
    public final String N0() {
        return this.f83515b;
    }

    public final void O0(@e String str) {
        this.f83515b = str;
    }

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterFragmentActivity, com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.Host
    public boolean handleFlutterMessage(@e IHybridMessage.HybridMessageInfo hybridMessageInfo, @d IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> result) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hybridMessageInfo, result}, this, changeQuickRedirect, false, 31364, new Class[]{IHybridMessage.HybridMessageInfo.class, IHybridMessage.NullableResult.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(result, "result");
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FlutterMsgConversationActivity, handle messageInfo: ");
        sb2.append(hybridMessageInfo != null ? hybridMessageInfo.getName() : null);
        aVar.q(sb2.toString());
        String name = hybridMessageInfo != null ? hybridMessageInfo.getName() : null;
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1786934010) {
                if (iHashCode == 753744467 && name.equals("get_recent_expression")) {
                    result.success(new IHybridMessage.HybridMessageResponse.Builder().setResult(RecentEmojiManger.f70167a.a()).build());
                    return true;
                }
            } else if (name.equals("update_recent_expression")) {
                RecentEmojiManger recentEmojiManger = RecentEmojiManger.f70167a;
                Map<String, String> params = hybridMessageInfo.getParams();
                recentEmojiManger.h(params != null ? params.get("name") : null);
                return true;
            }
        }
        return super.handleFlutterMessage(hybridMessageInfo, result);
    }

    @Override // com.max.xiaoheihe.flutter.BaseFlutterActivity, io.flutter.embedding.android.FlutterFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 31360, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        m0.x().q(this);
        String paramJson = getParamJson();
        if (paramJson != null) {
            this.f83515b = (String) ((Map) new Gson().fromJson(paramJson, new TypeToken<Map<String, ? extends String>>() { // from class: com.max.xiaoheihe.module.chat.FlutterMsgConversationActivity$onCreate$1$map$1
            }.getType())).get("userId");
        }
    }

    @Override // com.max.xiaoheihe.flutter.BaseFlutterActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31363, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        PictureCacheManager.f75668a.c();
        m0.x().I(this);
    }

    @Override // com.max.xiaoheihe.utils.m0.g
    public void s2(@e String str, @e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 31361, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            if (f0.g(BizMessageObj.TYPE_HEYCHAT_IM_MESSAGE, str2)) {
                g.f74531b.q("FlutterMsgConversationActivity, onReceiveMsg msg = " + str + ", type = " + str2 + ", userId = " + this.f83515b);
                if (str != null) {
                    JsonObject jsonObject = (JsonObject) k.a(str, JsonObject.class);
                    if (!f0.g(String.valueOf(jsonObject != null ? jsonObject.get("user_id") : null), this.f83515b)) {
                        if (!f0.g(String.valueOf(jsonObject != null ? jsonObject.get("to_user_id") : null), this.f83515b)) {
                            return;
                        }
                    }
                    runOnUiThread(new c(str, this));
                }
            }
        } catch (Throwable th2) {
            Log.e("FlutterMsgConversationActivity", "msg: " + str + "   error: " + th2.getMessage());
        }
    }
}
