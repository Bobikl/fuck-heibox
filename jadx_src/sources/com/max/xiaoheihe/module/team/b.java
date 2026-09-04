package com.max.xiaoheihe.module.team;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.component.inappnotification.InAppNotificationManager;
import com.max.hbcommon.utils.l;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.hbutils.utils.t;
import com.max.hbutils.utils.u;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.Arrays;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: TeamChatUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final b f92383a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f92384b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: TeamChatUtils.kt */
    public static final class a implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f92385b;

        a(Activity activity) {
            this.f92385b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44281, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.B0(this.f92385b);
            dialogInterface.dismiss();
        }
    }

    private b() {
    }

    private final void e() {
        Activity activityE;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44279, new Class[0], Void.TYPE).isSupported || (activityE = HeyBoxApplication.C().E()) == null || activityE.isFinishing()) {
            return;
        }
        com.max.hbcommon.view.a aVarF = new com.max.hbcommon.view.a.f(activityE).y("开启消息通知").l("组队信息不丢失").g(false).w(true).u("开启推送", new a(activityE)).F();
        aVarF.d().setBackgroundResource(R.color.team_chat_bg);
        aVarF.i().setTextColor(l.a(R.color.white));
        aVarF.e().setColorFilter(l.a(R.color.team_chat_gray));
        aVarF.f().setTextColor(l.a(R.color.team_chat_text_secondary));
        aVarF.h().setBackground(q.o(activityE, R.color.team_chat_interactive, 5.0f));
    }

    public final void a(@e Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 44277, new Class[]{Context.class}, Void.TYPE).isSupported || u.c(context)) {
            return;
        }
        String strJ = com.max.hbcache.c.j(com.max.hbcache.c.f66149t0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - n.r(strJ) > 2592000000L) {
            com.max.hbcache.c.z(com.max.hbcache.c.f66149t0, String.valueOf(jCurrentTimeMillis));
            e();
        }
    }

    public final boolean b(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 44278, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return !com.max.hbcommon.utils.c.u(str) && "/chat/im/room/entrance".equals(Uri.parse(str).getPath());
    }

    public final void c(@e Context context, @e String str, @e String str2, @e String str3) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, str3}, this, changeQuickRedirect, false, 44276, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE).isSupported || context == null || com.max.hbcommon.utils.c.u(str) || com.max.hbcommon.utils.c.u(str2)) {
            return;
        }
        v0 v0Var = v0.f124986a;
        String TEAM_CHAT_ROOM_URL = lb.a.f131072x4;
        f0.o(TEAM_CHAT_ROOM_URL, "TEAM_CHAT_ROOM_URL");
        Object[] objArr = new Object[3];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = str3 == null ? "" : str3;
        String str4 = String.format(TEAM_CHAT_ROOM_URL, Arrays.copyOf(objArr, 3));
        f0.o(str4, "format(format, *args)");
        com.max.xiaoheihe.base.router.b.k0(context, str4);
    }

    public final void d(@d WebProtocolObj webProtocolObj) {
        if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 44280, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(webProtocolObj, "webProtocolObj");
        Activity activityE = HeyBoxApplication.C().E();
        if (activityE == null || activityE.isFinishing()) {
            return;
        }
        int iF = ViewUtils.f(activityE, 14.0f);
        if (t.x(activityE)) {
            iF += t.p(activityE);
        }
        InAppNotificationManager.f67721a.s(new com.max.xiaoheihe.module.team.a(activityE, webProtocolObj, iF), 300L);
    }
}
