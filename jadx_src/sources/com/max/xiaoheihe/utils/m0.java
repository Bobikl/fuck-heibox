package com.max.xiaoheihe.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.PostEncryptParamsObj;
import com.max.hbcommon.network.WsStatus;
import com.max.hbutils.bean.Result;
import com.max.security.SecurityTool;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.BizMessageObj;
import com.max.xiaoheihe.bean.NotifyMsgObj;
import com.max.xiaoheihe.bean.NotifyPushMessageObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.module.account.MessageAndFriendsActivity;
import com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterActivity;
import com.max.xiaoheihe.module.chat.FlutterMsgConversationActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okio.ByteString;

/* JADX INFO: compiled from: WsManager.java */
/* JADX INFO: loaded from: classes13.dex */
public class m0 {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f95698n = 30000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static m0 f95699o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f95700p = 600;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private okhttp3.f0 f95701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<g> f95702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<okhttp3.g0> f95703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private e f95704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WsStatus f95705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f95706f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f95707g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f95708h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f95709i = new Handler();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Runnable f95710j = new b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f95711k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f95712l = 3000;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f95713m = 30000;

    /* JADX INFO: compiled from: WsManager.java */
    public class a extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 49090, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            com.max.heybox.hblog.g.G("WsManager, getWsId onError " + th2.getMessage());
            m0.b(m0.this);
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 49091, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            try {
                if (result.getResult() != null) {
                    m0.d(m0.this, com.max.hbutils.utils.k.e(result.getResult().toString(), "ws_id"));
                }
            } catch (UnknownHostException e10) {
                com.max.heybox.hblog.g.G("WsManager, getWsId onNext error UnknownHostException " + e10.getMessage());
            } catch (IOException e11) {
                com.max.heybox.hblog.g.G("WsManager, getWsId onNext error IOException " + e11.getMessage());
            } catch (Throwable th2) {
                com.max.heybox.hblog.g.G("WsManager, getWsId onNext error other " + th2.getMessage());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49092, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: WsManager.java */
    public class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49093, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.W("WsManager, System.currentTimeMillis() - sendTime =" + (System.currentTimeMillis() - m0.this.f95708h));
            if (System.currentTimeMillis() - m0.this.f95708h >= 30000) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("type", BizMessageObj.TYPE_PING);
                boolean zSend = m0.this.f95701a.send(com.max.hbutils.utils.k.p(jsonObject));
                m0.k(m0.this);
                if (!zSend || m0.this.f95706f >= 3) {
                    com.max.heybox.hblog.g.W("WsManager, heartbeat failed mHeartbeatReply = " + m0.this.f95706f);
                    m0.this.M(WsStatus.CONNECT_FAIL);
                    m0.this.G();
                } else {
                    com.max.heybox.hblog.g.W("WsManager, heartbeat success mHeartbeatReply = " + m0.this.f95706f);
                }
                m0.this.f95708h = System.currentTimeMillis();
            }
            m0.this.f95709i.postDelayed(this, 30000L);
        }
    }

    /* JADX INFO: compiled from: WsManager.java */
    public class c extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
        }
    }

    /* JADX INFO: compiled from: WsManager.java */
    public class d extends Thread {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49094, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.run();
            m0.a(m0.this);
        }
    }

    /* JADX INFO: compiled from: WsManager.java */
    public interface e {
        void handleMessage(@androidx.annotation.n0 String str, @androidx.annotation.n0 f fVar);
    }

    /* JADX INFO: compiled from: WsManager.java */
    public interface f {
        void a(boolean z10);
    }

    /* JADX INFO: compiled from: WsManager.java */
    public interface g {
        void F2();

        void s2(String str, String str2);
    }

    /* JADX INFO: compiled from: WsManager.java */
    public class h extends okhttp3.g0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(String str, boolean z10) {
            if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 49103, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported || z10) {
                return;
            }
            i(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void k(Activity activity, String str) {
            if (PatchProxy.proxy(new Object[]{activity, str}, null, changeQuickRedirect, true, 49102, new Class[]{Activity.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.j0(activity, str);
        }

        @Override // okhttp3.g0
        public void a(okhttp3.f0 f0Var, int i10, String str) {
            if (PatchProxy.proxy(new Object[]{f0Var, new Integer(i10), str}, this, changeQuickRedirect, false, 49100, new Class[]{okhttp3.f0.class, Integer.TYPE, String.class}, Void.TYPE).isSupported) {
                return;
            }
            super.a(f0Var, i10, str);
            m0.this.M(WsStatus.CONNECT_FAIL);
            if (!com.max.hbcommon.utils.c.w(m0.this.f95703c)) {
                Iterator it = m0.this.f95703c.iterator();
                while (it.hasNext()) {
                    ((okhttp3.g0) it.next()).a(f0Var, i10, str);
                }
            }
            com.max.heybox.hblog.g.W("WsManager, WsListener, onClosed, reason = " + str + ", code = " + i10);
        }

        @Override // okhttp3.g0
        public void b(okhttp3.f0 f0Var, int i10, String str) {
            if (PatchProxy.proxy(new Object[]{f0Var, new Integer(i10), str}, this, changeQuickRedirect, false, 49099, new Class[]{okhttp3.f0.class, Integer.TYPE, String.class}, Void.TYPE).isSupported) {
                return;
            }
            super.b(f0Var, i10, str);
            if (!com.max.hbcommon.utils.c.w(m0.this.f95703c)) {
                Iterator it = m0.this.f95703c.iterator();
                while (it.hasNext()) {
                    ((okhttp3.g0) it.next()).b(f0Var, i10, str);
                }
            }
            com.max.heybox.hblog.g.W("WsManager, WsListener, onClosing, reason = " + str + ", code = " + i10);
        }

        @Override // okhttp3.g0
        public void c(okhttp3.f0 f0Var, Throwable th2, @androidx.annotation.p0 okhttp3.c0 c0Var) {
            if (PatchProxy.proxy(new Object[]{f0Var, th2, c0Var}, this, changeQuickRedirect, false, 49101, new Class[]{okhttp3.f0.class, Throwable.class, okhttp3.c0.class}, Void.TYPE).isSupported) {
                return;
            }
            super.c(f0Var, th2, c0Var);
            th2.printStackTrace();
            if (!com.max.hbcommon.utils.c.w(m0.this.f95703c)) {
                Iterator it = m0.this.f95703c.iterator();
                while (it.hasNext()) {
                    ((okhttp3.g0) it.next()).c(f0Var, th2, c0Var);
                }
            }
            com.max.heybox.hblog.g.G("WsManager, WsListener, onFailure, response = " + c0Var + ", " + Log.getStackTraceString(th2));
            com.max.heybox.hblog.d.f74506a.b(th2, "WsManager, WsListener onFailure");
            m0.b(m0.this);
        }

        @Override // okhttp3.g0
        public void d(okhttp3.f0 f0Var, String str) {
            if (PatchProxy.proxy(new Object[]{f0Var, str}, this, changeQuickRedirect, false, 49096, new Class[]{okhttp3.f0.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            super.d(f0Var, str);
            m0.this.v(f0Var, str);
            m0.this.f95706f = 0;
            try {
                com.max.heybox.hblog.g.W("WsManager, WsListener, onMessage, text = " + str);
                BizMessageObj bizMessageObj = (BizMessageObj) com.max.hbutils.utils.k.a(str, BizMessageObj.class);
                if (bizMessageObj != null) {
                    final String strE = com.max.hbutils.utils.k.e(str, "data");
                    if (com.max.hbcommon.utils.c.u(strE)) {
                        return;
                    }
                    if (BizMessageObj.TYPE_PUSH.equals(bizMessageObj.getType())) {
                        NotifyPushMessageObj notifyPushMessageObj = (NotifyPushMessageObj) com.max.hbutils.utils.k.a(strE, NotifyPushMessageObj.class);
                        if (notifyPushMessageObj != null) {
                            String timestamp = notifyPushMessageObj.getTimestamp();
                            if (!com.max.hbcommon.utils.c.u(timestamp)) {
                                if ("follow".equals(notifyPushMessageObj.getType())) {
                                    long jR = com.max.hbutils.utils.n.r(timestamp);
                                    if (jR > com.max.hbutils.utils.n.r(com.max.hbcache.c.o(com.max.hbcache.c.f66140p, ""))) {
                                        com.max.hbcache.c.C(com.max.hbcache.c.f66140p, String.valueOf(jR));
                                        Intent intent = new Intent();
                                        intent.setAction(lb.a.f131031r);
                                        HeyBoxApplication.C().sendBroadcast(intent);
                                    }
                                } else if ("notify".equals(notifyPushMessageObj.getType()) && com.max.hbutils.utils.n.r(timestamp) > com.max.hbutils.utils.n.r(com.max.hbcache.c.o(com.max.hbcache.c.f66138o, ""))) {
                                    com.max.hbcache.c.M(true);
                                    com.max.hbcache.c.C(com.max.hbcache.c.f66138o, String.valueOf(timestamp));
                                    Intent intent2 = new Intent();
                                    intent2.setAction(lb.a.f131025q);
                                    com.max.hbcommon.utils.d.b("zzzzconntest", "sendBroadcast");
                                    HeyBoxApplication.C().sendBroadcast(intent2);
                                }
                            }
                        }
                        if (com.max.hbcommon.utils.c.w(m0.this.f95702b)) {
                            return;
                        }
                        Iterator it = m0.this.f95702b.iterator();
                        while (it.hasNext()) {
                            ((g) it.next()).s2(strE, bizMessageObj.getType());
                        }
                        return;
                    }
                    if (BizMessageObj.TYPE_MESSAGE_CENTER_PUSH.equals(bizMessageObj.getType())) {
                        if (com.max.hbcommon.utils.c.w(m0.this.f95702b)) {
                            return;
                        }
                        Iterator it2 = m0.this.f95702b.iterator();
                        while (it2.hasNext()) {
                            ((g) it2.next()).s2(strE, bizMessageObj.getType());
                        }
                        return;
                    }
                    if (BizMessageObj.TYPE_NOTIFY.equals(bizMessageObj.getType())) {
                        if (m0.this.f95704d != null) {
                            m0.this.f95704d.handleMessage(str, new f() { // from class: com.max.xiaoheihe.utils.o0
                                @Override // com.max.xiaoheihe.utils.m0.f
                                public final void a(boolean z10) {
                                    this.f95720a.j(strE, z10);
                                }
                            });
                            return;
                        } else {
                            i(strE);
                            return;
                        }
                    }
                    if (BizMessageObj.TYPE_BUBBLE_NOTIFY.equals(bizMessageObj.getType())) {
                        com.max.xiaoheihe.module.ads.e.k();
                        return;
                    }
                    if (!BizMessageObj.TYPE_HEYCHAT_IM_MESSAGE.equals(bizMessageObj.getType())) {
                        if (BizMessageObj.TYPE_PROTOCOL.equals(bizMessageObj.getType())) {
                            final Activity activityA = com.max.hbutils.utils.e.b().a();
                            activityA.runOnUiThread(new Runnable() { // from class: com.max.xiaoheihe.utils.p0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    m0.h.k(activityA, strE);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (com.max.hbcommon.utils.c.w(m0.this.f95702b)) {
                        return;
                    }
                    Iterator it3 = m0.this.f95702b.iterator();
                    while (it3.hasNext()) {
                        ((g) it3.next()).s2(strE, bizMessageObj.getType());
                    }
                }
            } catch (Exception e10) {
                com.max.heybox.hblog.d.f74506a.b(e10, "onMessage");
            }
        }

        @Override // okhttp3.g0
        public void e(okhttp3.f0 f0Var, ByteString byteString) {
            if (PatchProxy.proxy(new Object[]{f0Var, byteString}, this, changeQuickRedirect, false, 49098, new Class[]{okhttp3.f0.class, ByteString.class}, Void.TYPE).isSupported) {
                return;
            }
            super.e(f0Var, byteString);
            if (com.max.hbcommon.utils.c.w(m0.this.f95703c)) {
                return;
            }
            Iterator it = m0.this.f95703c.iterator();
            while (it.hasNext()) {
                ((okhttp3.g0) it.next()).e(f0Var, byteString);
            }
        }

        @Override // okhttp3.g0
        public void f(okhttp3.f0 f0Var, okhttp3.c0 c0Var) {
            if (PatchProxy.proxy(new Object[]{f0Var, c0Var}, this, changeQuickRedirect, false, 49095, new Class[]{okhttp3.f0.class, okhttp3.c0.class}, Void.TYPE).isSupported) {
                return;
            }
            super.f(f0Var, c0Var);
            com.max.heybox.hblog.g.W("WsManager, WsListener, onOpen, response = " + c0Var);
            m0.this.f95701a = f0Var;
            m0.this.M(WsStatus.CONNECT_SUCCESS);
            m0.m(m0.this);
            if (!com.max.hbcommon.utils.c.w(m0.this.f95702b)) {
                Iterator it = m0.this.f95702b.iterator();
                while (it.hasNext()) {
                    ((g) it.next()).F2();
                }
            }
            m0.this.w(f0Var, c0Var);
        }

        public void i(String str) {
            NotifyMsgObj notifyMsgObj;
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 49097, new Class[]{String.class}, Void.TYPE).isSupported || (notifyMsgObj = (NotifyMsgObj) com.max.hbutils.utils.k.a(str, NotifyMsgObj.class)) == null) {
                return;
            }
            Activity activityA = com.max.hbutils.utils.e.b().a();
            if (((activityA instanceof MessageCenterActivity) && ((MessageCenterActivity) activityA).W1()) || (((activityA instanceof FlutterMsgConversationActivity) && notifyMsgObj.getUserid() != null && notifyMsgObj.getUserid().equals(((FlutterMsgConversationActivity) activityA).N0())) || ((activityA instanceof MessageAndFriendsActivity) && ((MessageAndFriendsActivity) activityA).e2()))) {
                z10 = false;
            }
            if (z10) {
                s.f95742a.b(notifyMsgObj);
            }
        }
    }

    private m0() {
    }

    private String A() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49069, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("wss://");
        sb2.append(com.max.hbcommon.network.b.f68052i ? lb.a.f131069x1 : lb.a.f131063w1);
        sb2.append("/connect?");
        return sb2.toString();
    }

    private void D(String str) throws IOException {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 49072, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.W("WsManager, initSocket, reconnectCount = " + this.f95711k);
        okhttp3.z zVarF = new okhttp3.z.a().j0(0L, TimeUnit.MILLISECONDS).d0(25L, TimeUnit.SECONDS).f();
        String strA = A();
        Log.d("HBSecurity", "\n\n\n************ WsManager *************\n\n");
        SecurityTool.getVX(HeyBoxApplication.C(), "AEWEXDKSNVLXASPDQERTUQOKJNP");
        String str2 = (System.currentTimeMillis() / 1000) + "";
        HashMap map = new HashMap(16);
        map.put("ws_id", str);
        User userO = i0.o();
        map.put("userid", userO.isLoginFlag() ? userO.getAccount_detail().getUserid() : "-1");
        map.put("appid", l0.g0());
        map.put(l0.M(), userO.getPkey());
        map.put(l0.I(), com.max.xiaoheihe.utils.d.U());
        map.put(l0.J(), Build.MODEL);
        map.put(l0.Q(), "Android");
        map.put(l0.W(), "Android");
        map.put(l0.V(), "mobile");
        map.put(l0.U(), l0.g0());
        String vd2 = SecurityTool.getVD(HeyBoxApplication.C(), "SDFOGUOWEHTBSYYEWQWADZGASEL", str2, i0.j());
        map.put(l0.F(), Build.VERSION.RELEASE.trim());
        map.put(l0.R(), com.max.xiaoheihe.utils.d.x0());
        map.put(l0.P(), com.max.hbutils.utils.w.D());
        String strC = l0.C(strA);
        if (strC.endsWith("/")) {
            strC = strC.substring(0, strC.length() - 1);
        }
        String str3 = strC + "/";
        SecurityTool.setKN(str2, vd2);
        SecurityTool.setKB(str3, vd2);
        SecurityTool.setKM(str2, vd2);
        map.put(l0.G(), com.max.xiaoheihe.a.f76430g);
        map.put(l0.L(), vd2);
        NDKTools.encode(HeyBoxApplication.C(), str3, str2, vd2);
        map.put(l0.N(), SecurityTool.getVA(HeyBoxApplication.C(), vd2));
        String strF = l0.f(strA, map);
        com.max.hbcommon.utils.d.b("zzzzconntest", "url==" + strF);
        zVarF.b(new okhttp3.a0.a().a("User-Agent", "Mozilla/5.0 AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.118 Safari/537.36 ApiMaxJia/1.0").B(strF).b(), new h());
        zVarF.getDispatcher().e().shutdown();
    }

    private void F() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49073, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        M(WsStatus.CONNECT_FAIL);
        J();
    }

    private void J() {
        int i10;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49083, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.i.c(HeyBoxApplication.C())) {
            this.f95711k = 0;
            com.max.heybox.hblog.g.W("WsManager, retry, WsManager, 重连失败网络不可用, mStatus = " + this.f95705e);
            return;
        }
        com.max.heybox.hblog.g.W("WsManager, retry, mStatus =" + this.f95705e + ", reconnectCount = " + this.f95711k);
        if (i0.s() && y() == WsStatus.CONNECT_FAIL && (i10 = this.f95711k) < 600) {
            this.f95711k = i10 + 1;
            M(WsStatus.CONNECTING);
            long jMin = this.f95712l;
            int i11 = this.f95711k;
            if (i11 > 20) {
                jMin = Math.min(jMin * ((long) (i11 - 2)), this.f95713m);
            }
            com.max.heybox.hblog.g.W(String.format("WsManager 准备开始第%d次重连,重连间隔%d ", Integer.valueOf(this.f95711k), Long.valueOf(jMin)));
            okhttp3.f0 f0Var = this.f95701a;
            if (f0Var != null) {
                f0Var.close(1000, null);
            }
            this.f95709i.removeCallbacksAndMessages(null);
            this.f95709i.postDelayed(new d(), jMin);
        }
    }

    static /* synthetic */ void a(m0 m0Var) {
        if (PatchProxy.proxy(new Object[]{m0Var}, null, changeQuickRedirect, true, 49086, new Class[]{m0.class}, Void.TYPE).isSupported) {
            return;
        }
        m0Var.z();
    }

    static /* synthetic */ void b(m0 m0Var) {
        if (PatchProxy.proxy(new Object[]{m0Var}, null, changeQuickRedirect, true, 49087, new Class[]{m0.class}, Void.TYPE).isSupported) {
            return;
        }
        m0Var.F();
    }

    static /* synthetic */ void d(m0 m0Var, String str) throws IOException {
        if (PatchProxy.proxy(new Object[]{m0Var, str}, null, changeQuickRedirect, true, 49088, new Class[]{m0.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        m0Var.D(str);
    }

    static /* synthetic */ int k(m0 m0Var) {
        int i10 = m0Var.f95706f;
        m0Var.f95706f = i10 + 1;
        return i10;
    }

    static /* synthetic */ void m(m0 m0Var) {
        if (PatchProxy.proxy(new Object[]{m0Var}, null, changeQuickRedirect, true, 49089, new Class[]{m0.class}, Void.TYPE).isSupported) {
            return;
        }
        m0Var.r();
    }

    private void r() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49084, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f95711k = 0;
        this.f95709i.removeCallbacksAndMessages(null);
    }

    private void t(BizMessageObj bizMessageObj) {
        if (PatchProxy.proxy(new Object[]{bizMessageObj}, this, changeQuickRedirect, false, 49085, new Class[]{BizMessageObj.class}, Void.TYPE).isSupported) {
            return;
        }
        PostEncryptParamsObj postEncryptParamsObjV0 = com.max.xiaoheihe.utils.d.v0(com.max.hbutils.utils.k.p(bizMessageObj), true);
        com.max.xiaoheihe.network.i.a().E1("18", postEncryptParamsObjV0.getData(), postEncryptParamsObjV0.getKey(), postEncryptParamsObjV0.getSid(), postEncryptParamsObjV0.getTime()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c());
    }

    public static m0 x() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49068, new Class[0], m0.class);
        if (patchProxyResultProxy.isSupported) {
            return (m0) patchProxyResultProxy.result;
        }
        if (f95699o == null) {
            synchronized (m0.class) {
                if (f95699o == null) {
                    f95699o = new m0();
                }
            }
        }
        return f95699o;
    }

    @SuppressLint({"CheckResult"})
    private void z() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49071, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.W("WsManager, getWsId");
        com.max.xiaoheihe.network.i.a().k3().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a());
    }

    @androidx.annotation.p0
    public okhttp3.f0 B() {
        return this.f95701a;
    }

    public void C() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49070, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.W("WsManager, init getStatus() = " + y());
        if (y() == null || y() == WsStatus.CONNECT_FAIL) {
            new d().start();
        }
    }

    public boolean E() {
        return this.f95707g;
    }

    public void G() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49082, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.W("WsManager, reconnect, mStatus = " + this.f95705e);
        if (y() == WsStatus.CONNECT_SUCCESS) {
            return;
        }
        this.f95711k = 0;
        J();
    }

    public void H(@androidx.annotation.n0 okhttp3.g0 g0Var) {
        if (PatchProxy.proxy(new Object[]{g0Var}, this, changeQuickRedirect, false, 49077, new Class[]{okhttp3.g0.class}, Void.TYPE).isSupported || this.f95702b == null) {
            return;
        }
        this.f95703c.remove(g0Var);
    }

    public void I(@androidx.annotation.n0 g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, 49079, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzwstest", "removeOnMsgReceiveListener");
        List<g> list = this.f95702b;
        if (list != null) {
            list.remove(gVar);
        }
    }

    public void K(boolean z10) {
        this.f95707g = z10;
    }

    public void L(@Nullable e eVar) {
        this.f95704d = eVar;
    }

    public void M(WsStatus wsStatus) {
        this.f95705e = wsStatus;
    }

    public void p(@androidx.annotation.n0 okhttp3.g0 g0Var) {
        if (PatchProxy.proxy(new Object[]{g0Var}, this, changeQuickRedirect, false, 49076, new Class[]{okhttp3.g0.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f95703c == null) {
            this.f95703c = new ArrayList();
        }
        this.f95703c.add(g0Var);
    }

    public void q(@androidx.annotation.n0 g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, 49078, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzwstest", "addOnMsgReceiveListener");
        if (this.f95702b == null) {
            this.f95702b = new ArrayList();
        }
        this.f95702b.add(gVar);
    }

    public void s() {
        List<g> list;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49080, new Class[0], Void.TYPE).isSupported || (list = this.f95702b) == null) {
            return;
        }
        list.clear();
    }

    public void u() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49081, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.W("WsManager, disconnect");
        this.f95709i.removeCallbacksAndMessages(null);
        okhttp3.f0 f0Var = this.f95701a;
        if (f0Var != null) {
            f0Var.close(1000, null);
        }
    }

    public void v(okhttp3.f0 f0Var, String str) {
        if (PatchProxy.proxy(new Object[]{f0Var, str}, this, changeQuickRedirect, false, 49075, new Class[]{okhttp3.f0.class, String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(this.f95703c)) {
            return;
        }
        Iterator<okhttp3.g0> it = this.f95703c.iterator();
        while (it.hasNext()) {
            it.next().d(f0Var, str);
        }
    }

    public void w(okhttp3.f0 f0Var, okhttp3.c0 c0Var) {
        if (PatchProxy.proxy(new Object[]{f0Var, c0Var}, this, changeQuickRedirect, false, 49074, new Class[]{okhttp3.f0.class, okhttp3.c0.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.w(this.f95702b)) {
            Iterator<g> it = this.f95702b.iterator();
            while (it.hasNext()) {
                it.next().F2();
            }
        }
        if (com.max.hbcommon.utils.c.w(this.f95703c)) {
            return;
        }
        Iterator<okhttp3.g0> it2 = this.f95703c.iterator();
        while (it2.hasNext()) {
            it2.next().f(f0Var, c0Var);
        }
    }

    public WsStatus y() {
        return this.f95705e;
    }
}
