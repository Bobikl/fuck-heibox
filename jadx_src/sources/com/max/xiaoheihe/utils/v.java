package com.max.xiaoheihe.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.NativeParamsObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.max.xiaoheihe.module.bbs.post.PostPageFactory;
import com.max.xiaoheihe.module.chat.MsgConversationActivity;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.module.littleprogram.fragment.RollRoomDetailFragment;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.open.SocialConstants;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.ak;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PushNotifyUtils.java */
/* JADX INFO: loaded from: classes13.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f95760a = "type_post";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f95761b = "type_comment";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f95762c = "type_feedback";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f95763d = "type_follow_user";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f95764e = {1, 2, 5};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f95765f = {1, 3, 10};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f95766g = {1, 3, 10};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f95767h = "zzzzupush";

    /* JADX INFO: compiled from: PushNotifyUtils.java */
    public class a implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DialogInterface.OnClickListener f95768b;

        a(DialogInterface.OnClickListener onClickListener) {
            this.f95768b = onClickListener;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48811, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            DialogInterface.OnClickListener onClickListener = this.f95768b;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i10);
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: PushNotifyUtils.java */
    public class b implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DialogInterface.OnClickListener f95769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f95770c;

        b(DialogInterface.OnClickListener onClickListener, Activity activity) {
            this.f95769b = onClickListener;
            this.f95770c = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48812, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            DialogInterface.OnClickListener onClickListener = this.f95769b;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i10);
            }
            com.max.xiaoheihe.utils.d.B0(this.f95770c);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: PushNotifyUtils.java */
    public class c extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
        }
    }

    /* JADX INFO: compiled from: PushNotifyUtils.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.view.a f95771b;

        d(com.max.hbcommon.view.a aVar) {
            this.f95771b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48813, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f95771b.dismiss();
        }
    }

    /* JADX INFO: compiled from: PushNotifyUtils.java */
    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.view.a f95772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f95773c;

        e(com.max.hbcommon.view.a aVar, Context context) {
            this.f95772b = aVar;
            this.f95773c = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48814, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f95772b.dismiss();
            com.max.xiaoheihe.utils.d.B0(this.f95773c);
        }
    }

    /* JADX INFO: compiled from: PushNotifyUtils.java */
    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.view.a f95774b;

        f(com.max.hbcommon.view.a aVar) {
            this.f95774b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48815, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f95774b.dismiss();
        }
    }

    /* JADX INFO: compiled from: PushNotifyUtils.java */
    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.view.a f95775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f95776c;

        g(com.max.hbcommon.view.a aVar, Context context) {
            this.f95775b = aVar;
            this.f95776c = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48816, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f95775b.dismiss();
            com.max.xiaoheihe.utils.d.B0(this.f95776c);
        }
    }

    /* JADX INFO: compiled from: PushNotifyUtils.java */
    public class h extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
        }

        public void onNext(Result result) {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48817, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public static void a(Context context, String str, DialogInterface.OnClickListener onClickListener) {
        boolean zB = false;
        if (PatchProxy.proxy(new Object[]{context, str, onClickListener}, null, changeQuickRedirect, true, 48798, new Class[]{Context.class, String.class, DialogInterface.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!(context instanceof Activity) || com.max.xiaoheihe.utils.d.N0(context)) {
            if (onClickListener != null) {
                onClickListener.onClick(null, 0);
                return;
            }
            return;
        }
        Activity activity = (Activity) context;
        if (activity.isFinishing()) {
            return;
        }
        String str2 = "push_switch_tips_time_" + str;
        String str3 = "push_switch_tips_cnt_" + str;
        if (com.max.hbutils.utils.w.N(com.max.hbutils.utils.n.r(com.max.hbcache.c.o(str2, "")))) {
            if (onClickListener != null) {
                onClickListener.onClick(null, 0);
                return;
            }
            return;
        }
        int iQ = com.max.hbutils.utils.n.q(com.max.hbcache.c.o(str3, "")) + 1;
        if (f95760a.equals(str)) {
            zB = b(activity, f95764e, iQ, activity.getResources().getString(R.string.post_success), activity.getResources().getString(R.string.push_switch_tips_post), onClickListener);
        } else if (f95761b.equals(str)) {
            zB = b(activity, f95765f, iQ, "", activity.getResources().getString(R.string.push_switch_tips_comment), onClickListener);
        } else if (f95762c.equals(str)) {
            k(activity, "", activity.getResources().getString(R.string.push_switch_tips_feedback), onClickListener);
        } else if (f95763d.equals(str)) {
            zB = b(activity, f95766g, iQ, "", activity.getResources().getString(R.string.push_switch_tips_follow_user), onClickListener);
        }
        if (zB) {
            com.max.hbcache.c.C(str2, String.valueOf(System.currentTimeMillis()));
            com.max.hbcache.c.C(str3, String.valueOf(iQ));
        }
    }

    private static boolean b(Activity activity, int[] iArr, int i10, String str, String str2, DialogInterface.OnClickListener onClickListener) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity, iArr, new Integer(i10), str, str2, onClickListener}, null, changeQuickRedirect, true, 48799, new Class[]{Activity.class, int[].class, Integer.TYPE, String.class, String.class, DialogInterface.OnClickListener.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (Arrays.binarySearch(iArr, i10) >= 0) {
            k(activity, str, str2, onClickListener);
        } else if (onClickListener != null) {
            onClickListener.onClick(null, 0);
        }
        return i10 <= iArr[iArr.length + (-1)];
    }

    private static void c(String str, String str2, String str3, String str4) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4}, null, changeQuickRedirect, true, 48803, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        boolean zEquals = "1".equals(com.max.hbcache.c.o("first_time", "0"));
        HashMap map = new HashMap(16);
        map.put("push_type", str);
        map.put("event_id", str2);
        map.put("day_first", zEquals ? "1" : "0");
        if (zEquals) {
            com.max.hbcache.c.C("first_time", "0");
        }
        if ("6".equals(str) || "7".equals(str)) {
            map.put("h_src", str3);
        }
        if (!com.max.hbcommon.utils.c.u(str4)) {
            map.put("event_str", str4);
        }
        com.max.xiaoheihe.network.i.a().x8("6", map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.schedulers.b.d()).g(new c());
    }

    private static void d(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48801, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        m(context, new Intent(context, (Class<?>) MainActivity.class));
    }

    public static String e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48804, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = Long.parseLong(com.max.hbcache.c.o("last_enter_time", "-1"));
        if (j10 == -1) {
            com.max.hbcache.c.C("last_enter_time", String.valueOf(jCurrentTimeMillis));
            return "0";
        }
        Date date = new Date(j10);
        Date date2 = new Date(jCurrentTimeMillis);
        com.max.hbcache.c.C("last_enter_time", String.valueOf(jCurrentTimeMillis));
        return (!date.before(date2) || date.getDay() == date2.getDay()) ? "0" : "1";
    }

    public static Boolean f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48808, new Class[0], Boolean.class);
        if (patchProxyResultProxy.isSupported) {
            return (Boolean) patchProxyResultProxy.result;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strO = com.max.hbcache.c.o("show_open_push_dialog", "0");
        if (("1".equals(strO) || "0".equals(strO)) && jCurrentTimeMillis >= Long.parseLong(com.max.hbcache.c.o("last_show_push_dialog", String.valueOf(jCurrentTimeMillis))) - 86400000) {
            if ("1".equals(strO)) {
                com.max.hbcache.c.C("show_open_push_dialog", "2");
            } else {
                com.max.hbcache.c.C("show_open_push_dialog", "1");
            }
            com.max.hbcache.c.C("show_open_push_dialog", "2");
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static void g(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 48797, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        String strE = com.max.hbutils.utils.k.e(str, "id");
        String strE2 = com.max.hbutils.utils.k.e(str, "h_src");
        String strE3 = com.max.hbutils.utils.k.e(str, "event_str");
        String strE4 = com.max.hbutils.utils.k.e(str, "goto_tab_bbs");
        com.max.hbcommon.utils.d.b(f95767h, "h_src == " + strE2);
        com.max.hbcommon.utils.d.b(f95767h, "type " + strE);
        com.max.hbcommon.utils.d.b(f95767h, "extra ==" + str);
        com.max.hbcommon.utils.d.b(f95767h, "event_str ==" + strE3);
        c(strE, com.max.hbcommon.utils.c.u(com.max.hbutils.utils.k.e(str, "event_id")) ? "-1" : com.max.hbutils.utils.k.e(str, "event_id"), strE2, strE3);
        if (!com.max.xiaoheihe.utils.d.J0(context, MainActivity.class)) {
            if ("11".equals(strE) && com.max.hbcommon.utils.c.x(strE4)) {
                com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.f(context, lb.d.M));
            } else {
                d(context);
            }
        }
        if ("1".equals(strE)) {
            com.max.hbutils.utils.k.e(str, "news_url");
            com.max.hbutils.utils.k.e(str, "news_id");
            String strE5 = com.max.hbutils.utils.k.e(str, "title");
            String strE6 = com.max.hbutils.utils.k.e(str, SocialConstants.PARAM_APP_DESC);
            String strE7 = com.max.hbutils.utils.k.e(str, "content_type");
            String strE8 = com.max.hbutils.utils.k.e(str, "link_id");
            String strE9 = com.max.hbutils.utils.k.e(str, "link_tag");
            String strE10 = com.max.hbutils.utils.k.e(str, PostPageFactory.f81484t);
            String strE11 = com.max.hbutils.utils.k.e(str, "share_url");
            String strE12 = com.max.hbutils.utils.k.e(str, "use_concept_type");
            String strE13 = com.max.hbutils.utils.k.e(str, com.max.xiaoheihe.router.c.f94902h);
            if (!com.max.hbcommon.utils.c.u(strE13)) {
                com.max.xiaoheihe.base.router.b.k0(context, strE13);
                return;
            }
            BBSLinkObj bBSLinkObj = new BBSLinkObj();
            bBSLinkObj.setTitle(strE5);
            bBSLinkObj.setDescription(strE6);
            bBSLinkObj.setLinkid(strE8);
            bBSLinkObj.setLink_tag(strE9);
            bBSLinkObj.setHas_video(strE10);
            bBSLinkObj.setShare_url(strE11);
            bBSLinkObj.setUse_concept_type(strE12);
            bBSLinkObj.setContent_type(strE7);
            com.max.xiaoheihe.module.bbs.utils.b.E(context, bBSLinkObj);
            return;
        }
        if ("2".equals(strE)) {
            String strE14 = com.max.hbutils.utils.k.e(str, com.max.xiaoheihe.router.c.f94902h);
            if (com.max.hbcommon.utils.c.u(strE14)) {
                d(context);
                return;
            } else {
                com.max.xiaoheihe.base.router.b.k0(context, strE14);
                return;
            }
        }
        if ("3".equals(strE)) {
            String strE15 = com.max.hbutils.utils.k.e(str, "player_id");
            String strE16 = com.max.hbutils.utils.k.e(str, "nickname");
            String strE17 = com.max.hbutils.utils.k.e(str, "season");
            String strE18 = com.max.hbutils.utils.k.e(str, "region");
            String strE19 = com.max.hbutils.utils.k.e(str, "mode");
            String strE20 = com.max.hbutils.utils.k.e(str, "record_time");
            com.max.hbutils.utils.k.e(str, "download_url");
            String strE21 = com.max.hbutils.utils.k.e(str, "matchId");
            if (TextUtils.isEmpty(strE15)) {
                strE15 = strE16;
            }
            if (com.max.hbcommon.utils.c.v(strE16, strE17, strE18, strE20, strE19)) {
                d(context);
                return;
            }
            if (com.max.hbcommon.utils.c.u(strE21)) {
                Intent intent = new Intent(context, (Class<?>) WebActionActivity.class);
                intent.putExtra("pageurl", String.format(lb.a.Q1, strE18, strE17, strE16, strE19, strE20, strE15));
                intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.match_details));
                intent.putExtra("isfullScreen", true);
                m(context, intent);
                return;
            }
            Intent intent2 = new Intent(context, (Class<?>) WebActionActivity.class);
            intent2.putExtra("pageurl", String.format(lb.a.R1, strE21, strE18, strE17, strE16, strE19, strE20, strE15));
            intent2.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.match_details));
            intent2.putExtra("isfullScreen", true);
            m(context, intent2);
            return;
        }
        if ("4".equals(strE)) {
            String strE22 = com.max.hbutils.utils.k.e(str, "message_type");
            if (com.max.hbcommon.utils.c.u(strE22)) {
                return;
            }
            if ("8".equalsIgnoreCase(strE22)) {
                com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.f(context, lb.d.W4));
                return;
            } else {
                com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.x(context, "2", strE22));
                return;
            }
        }
        if ("5".equals(strE)) {
            d(context);
            return;
        }
        if ("6".equals(strE)) {
            m(context, com.max.xiaoheihe.module.game.z.b(context, strE2, com.max.hbutils.utils.k.e(str, "appid"), com.max.hbutils.utils.k.e(str, ChannelsDetailActivity.V3), null, i0.m(), i0.j(), null));
            return;
        }
        if ("7".equals(strE)) {
            if (i0.o().isLoginFlag()) {
                com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.d0(context, i0.o().getAccount_detail().getUserid(), "task"));
                return;
            }
            return;
        }
        if ("8".equals(strE)) {
            Intent intent3 = new Intent();
            String strE23 = com.max.hbutils.utils.k.e(str, "android_component");
            String strE24 = com.max.hbutils.utils.k.e(str, "android_params");
            intent3.setClassName(context, strE23);
            if (!com.max.hbcommon.utils.c.u(strE24)) {
                try {
                    JsonObject jsonObject = (JsonObject) new Gson().fromJson(strE24, JsonObject.class);
                    if (jsonObject != null) {
                        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                            intent3.putExtra(entry.getKey(), entry.getValue().getAsString());
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            try {
                m(context, intent3);
                return;
            } catch (ActivityNotFoundException e11) {
                MobclickAgent.reportError(HeyBoxApplication.C(), e11);
                return;
            }
        }
        if ("9".equals(strE)) {
            Intent intent4 = new Intent();
            String strE25 = com.max.hbutils.utils.k.e(str, "android_component");
            String strE26 = com.max.hbutils.utils.k.e(str, "android_params");
            intent4.setClassName(context, strE25);
            if (!com.max.hbcommon.utils.c.u(strE26)) {
                try {
                    for (Map.Entry<String, JsonElement> entry2 : ((JsonObject) new Gson().fromJson(strE26, JsonObject.class)).entrySet()) {
                        NativeParamsObj nativeParamsObj = (NativeParamsObj) new Gson().fromJson(entry2.getValue(), NativeParamsObj.class);
                        Object objFromJson = new Gson().fromJson(nativeParamsObj.getValue(), (Class<Object>) Class.forName(nativeParamsObj.getClazz()));
                        if (objFromJson instanceof Serializable) {
                            intent4.putExtra(entry2.getKey(), (Serializable) objFromJson);
                        }
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
            try {
                m(context, intent4);
                return;
            } catch (ActivityNotFoundException e13) {
                MobclickAgent.reportError(HeyBoxApplication.C(), e13);
                return;
            }
        }
        if ("10".equals(strE)) {
            String strE27 = com.max.hbutils.utils.k.e(str, "userid");
            String strE28 = com.max.hbutils.utils.k.e(str, g0.a.f118919c);
            if (com.max.hbcommon.utils.c.u(strE27)) {
                return;
            }
            MsgConversationActivity.R1(context, strE27, strE28);
            return;
        }
        if (!"11".equals(strE)) {
            if ("12".equals(strE)) {
                com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.R(context, com.max.hbutils.utils.k.e(str, "order_id"), false));
                return;
            }
            if (!"13".equals(strE)) {
                d(context);
                return;
            }
            String strE29 = com.max.hbutils.utils.k.e(str, SwitchDetailActivity.P);
            if (com.max.hbcommon.utils.c.u(strE29)) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(context, strE29);
            return;
        }
        String strE30 = com.max.hbutils.utils.k.e(str, RollRoomDetailFragment.A);
        String strE31 = com.max.hbutils.utils.k.e(str, "link_tag");
        String strE32 = com.max.hbutils.utils.k.e(str, PostPageFactory.f81484t);
        String strE33 = com.max.hbutils.utils.k.e(str, "h_src");
        BBSLinkObj bBSLinkObj2 = new BBSLinkObj();
        bBSLinkObj2.setLinkid(strE30);
        bBSLinkObj2.setLink_tag(strE31);
        bBSLinkObj2.setHas_video(strE32);
        bBSLinkObj2.setH_src(strE33);
        bBSLinkObj2.setContent_type("4");
        com.max.xiaoheihe.module.bbs.utils.b.E(context, bBSLinkObj2);
    }

    public static io.reactivex.disposables.b h(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48809, new Class[]{Context.class}, io.reactivex.disposables.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.disposables.b) patchProxyResultProxy.result;
        }
        String str = com.max.xiaoheihe.utils.d.N0(context) ? "1" : "0";
        com.max.hbcache.c.C("push_open_state", str);
        return n(str);
    }

    public static void i(Context context, LayoutInflater layoutInflater) {
        if (!PatchProxy.proxy(new Object[]{context, layoutInflater}, null, changeQuickRedirect, true, 48805, new Class[]{Context.class, LayoutInflater.class}, Void.TYPE).isSupported && f().booleanValue()) {
            j(context, layoutInflater);
        }
    }

    private static void j(Context context, LayoutInflater layoutInflater) {
        if (PatchProxy.proxy(new Object[]{context, layoutInflater}, null, changeQuickRedirect, true, 48806, new Class[]{Context.class, LayoutInflater.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_push_lowest_price, (ViewGroup) null, false);
        View viewFindViewById = viewInflate.findViewById(R.id.iv_close);
        View viewFindViewById2 = viewInflate.findViewById(R.id.vg_confirm);
        com.max.hbcommon.view.a aVarF = new com.max.hbcommon.view.a.f(context).D(viewInflate).F();
        viewFindViewById.setOnClickListener(new d(aVarF));
        viewFindViewById2.setOnClickListener(new e(aVarF, context));
    }

    public static void k(Activity activity, String str, String str2, DialogInterface.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{activity, str, str2, onClickListener}, null, changeQuickRedirect, true, 48800, new Class[]{Activity.class, String.class, String.class, DialogInterface.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(activity).y(str).l(str2).t(R.string.launch, new b(onClickListener, activity)).n(R.string.cancel, new a(onClickListener)).g(false).F();
    }

    public static void l(Context context, LayoutInflater layoutInflater) {
        if (PatchProxy.proxy(new Object[]{context, layoutInflater}, null, changeQuickRedirect, true, 48807, new Class[]{Context.class, LayoutInflater.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_push_lowest_price, (ViewGroup) null, false);
        View viewFindViewById = viewInflate.findViewById(R.id.iv_close);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_img);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_desc);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_confirm);
        View viewFindViewById2 = viewInflate.findViewById(R.id.vg_confirm);
        imageView.setImageResource(R.drawable.push_sign_in_315x191);
        textView.setText("签到奖励不错过");
        textView2.setText("提醒您领取签到奖励");
        textView3.setText("打开通知");
        com.max.hbcommon.view.a aVarF = new com.max.hbcommon.view.a.f(context).D(viewInflate).F();
        viewFindViewById.setOnClickListener(new f(aVarF));
        viewFindViewById2.setOnClickListener(new g(aVarF, context));
    }

    private static void m(Context context, Intent intent) {
        if (PatchProxy.proxy(new Object[]{context, intent}, null, changeQuickRedirect, true, 48802, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    private static io.reactivex.disposables.b n(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48810, new Class[]{String.class}, io.reactivex.disposables.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.disposables.b) patchProxyResultProxy.result;
        }
        HashMap map = new HashMap(16);
        map.put("push_open", str);
        map.put(ak.H, Build.MANUFACTURER);
        return (io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().x8("7", map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.schedulers.b.d()).J5(new h());
    }
}
