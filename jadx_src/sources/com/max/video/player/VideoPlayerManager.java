package com.max.video.player;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewGroupKt;
import bb.c;
import com.max.hbvideo.R;
import com.max.heybox.hblog.g;
import com.max.video.AbsVideoView;
import com.max.video.player.info.NetworkType;
import com.max.video.player.info.WindowMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.o;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.v;
import ye.b;

/* JADX INFO: compiled from: VideoPlayerManager.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class VideoPlayerManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final VideoPlayerManager f76079a = new VideoPlayerManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private static final j<Boolean> f76080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private static final j<Integer> f76081c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private static final u<Boolean> f76082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private static final u<Integer> f76083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private static final j<NetworkType> f76084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private static final u<NetworkType> f76085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @e
    private static BroadcastReceiver f76086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @e
    private static WeakReference<AbsVideoView> f76087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @d
    private static final HashMap<String, Integer> f76088j;

    static {
        j<Boolean> jVarA = v.a(Boolean.FALSE);
        f76080b = jVarA;
        j<Integer> jVarA2 = v.a(100);
        f76081c = jVarA2;
        f76082d = jVarA;
        f76083e = jVarA2;
        j<NetworkType> jVarA3 = v.a(NetworkType.WIFI);
        f76084f = jVarA3;
        f76085g = jVarA3;
        f76088j = new HashMap<>();
    }

    private VideoPlayerManager() {
    }

    private final View f(ViewGroup viewGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, c.m.Uo, new Class[]{ViewGroup.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        ArrayList<View> arrayList = new ArrayList<>();
        l(viewGroup, arrayList);
        if (arrayList.size() > 0) {
            return arrayList.get(0);
        }
        return null;
    }

    private final void l(ViewGroup viewGroup, ArrayList<View> arrayList) {
        if (PatchProxy.proxy(new Object[]{viewGroup, arrayList}, this, changeQuickRedirect, false, c.m.Vo, new Class[]{ViewGroup.class, ArrayList.class}, Void.TYPE).isSupported || viewGroup == null) {
            return;
        }
        if (viewGroup.getTag(R.id.window_mode) == WindowMode.FULLSCREEN) {
            arrayList.add(viewGroup);
            return;
        }
        for (View view : ViewGroupKt.e(viewGroup)) {
            if (view instanceof ViewGroup) {
                l((ViewGroup) view, arrayList);
            }
        }
    }

    private final void p(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, c.m.Xo, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        Integer numValueOf = intentRegisterReceiver != null ? Integer.valueOf(intentRegisterReceiver.getIntExtra("status", -1)) : null;
        f76080b.setValue(Boolean.valueOf(numValueOf != null && numValueOf.intValue() == 2));
        Bundle extras = intentRegisterReceiver != null ? intentRegisterReceiver.getExtras() : null;
        int i10 = ((extras != null ? extras.getInt("level") : 0) * 100) / (extras != null ? extras.getInt("scale") : 1);
        f76081c.setValue(Integer.valueOf(i10));
        g gVarH = g.f74531b.H();
        if (gVarH != null) {
            gVarH.a0("当前电量：" + i10);
        }
    }

    public static /* synthetic */ void x(VideoPlayerManager videoPlayerManager, Activity activity, View view, ViewGroup viewGroup, int i10, int i11, Object obj) {
        Object[] objArr = {videoPlayerManager, activity, view, viewGroup, new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.m.Ro, new Class[]{VideoPlayerManager.class, Activity.class, View.class, ViewGroup.class, cls, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        videoPlayerManager.w(activity, view, viewGroup, (i11 & 8) == 0 ? i10 : 0);
    }

    @e
    public final AbsVideoView c(@d Activity activity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, c.m.Oo, new Class[]{Activity.class}, AbsVideoView.class);
        if (patchProxyResultProxy.isSupported) {
            return (AbsVideoView) patchProxyResultProxy.result;
        }
        f0.p(activity, "activity");
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(android.R.id.content);
        if (viewGroup == null || f(viewGroup) == null) {
            return null;
        }
        View viewE = f76079a.e(activity);
        f0.n(viewE, "null cannot be cast to non-null type com.max.video.AbsVideoView");
        return (AbsVideoView) viewE;
    }

    public final boolean d(@d Activity activity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, c.m.Wo, new Class[]{Activity.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(activity, "activity");
        g gVarH = g.f74531b.H();
        if (gVarH != null) {
            gVarH.a0("检查网络连接状态");
        }
        if (Build.VERSION.SDK_INT >= 29 && (androidx.core.content.d.a(activity, "android.permission.ACCESS_NETWORK_STATE") != 0 || androidx.core.content.d.a(activity, "android.permission.READ_PHONE_STATE") != 0)) {
            f76084f.setValue(NetworkType.WIFI);
            return true;
        }
        Object systemService = activity.getSystemService("connectivity");
        f0.n(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.getType() == 1 && activeNetworkInfo.isConnected()) {
            f76084f.setValue(NetworkType.WIFI);
            return true;
        }
        if (activeNetworkInfo == null) {
            f76084f.setValue(NetworkType.NONE);
            return false;
        }
        Object systemService2 = activity.getSystemService(g0.a.f118921e);
        f0.n(systemService2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        int networkType = ((TelephonyManager) systemService2).getNetworkType();
        if (networkType != 18) {
            if (networkType == 20) {
                f76084f.setValue(NetworkType.GEN5);
                return true;
            }
            switch (networkType) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    f76084f.setValue(NetworkType.GEN2);
                    return true;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    f76084f.setValue(NetworkType.GEN3);
                    return true;
                case 13:
                    break;
                default:
                    f76084f.setValue(NetworkType.MOBILE);
                    return true;
            }
        }
        f76084f.setValue(NetworkType.GEN4);
        return true;
    }

    @e
    public final View e(@d Activity activity) {
        View viewF;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, c.m.To, new Class[]{Activity.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(activity, "activity");
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(android.R.id.content);
        if (viewGroup == null || (viewF = f(viewGroup)) == null) {
            return null;
        }
        if (viewF.getParent() instanceof ViewGroup) {
            ViewParent parent = viewF.getParent();
            f0.n(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(viewF);
        }
        int i10 = R.id.window_mode;
        WindowMode windowMode = WindowMode.NORMAL;
        viewF.setTag(i10, windowMode);
        if (viewF instanceof AbsVideoView) {
            AbsVideoView absVideoView = (AbsVideoView) viewF;
            ViewGroup originContainer = absVideoView.getOriginContainer();
            if (originContainer != null) {
                originContainer.addView(viewF);
            }
            absVideoView.b0(windowMode);
        }
        ye.a.f141789a.e(activity, 1);
        b bVar = b.f141790a;
        bVar.v(activity);
        bVar.w(activity);
        return viewF;
    }

    @e
    public final BroadcastReceiver g() {
        return f76086h;
    }

    @d
    public final u<Boolean> h() {
        return f76082d;
    }

    @d
    public final u<Integer> i() {
        return f76083e;
    }

    public final int j(@d AbsVideoView videoView) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{videoView}, this, changeQuickRedirect, false, c.m.Jo, new Class[]{AbsVideoView.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(videoView, "videoView");
        return k((String) videoView.getTag());
    }

    public final int k(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.m.Ko, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (str == null) {
            return 0;
        }
        HashMap<String, Integer> map = f76088j;
        if (!map.containsKey(str)) {
            return 0;
        }
        Integer num = map.get(str);
        f0.m(num);
        f0.m(num);
        return num.intValue();
    }

    @e
    public final AbsVideoView m() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.bp, new Class[0], AbsVideoView.class);
        if (patchProxyResultProxy.isSupported) {
            return (AbsVideoView) patchProxyResultProxy.result;
        }
        WeakReference<AbsVideoView> weakReference = f76087i;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @d
    public final u<NetworkType> n() {
        return f76085g;
    }

    public final void o(@d AbsVideoView videoView) {
        if (PatchProxy.proxy(new Object[]{videoView}, this, changeQuickRedirect, false, c.m.ap, new Class[]{AbsVideoView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(videoView, "videoView");
        f76087i = new WeakReference<>(videoView);
    }

    public final boolean q(@d AbsVideoView view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, c.m.Po, new Class[]{AbsVideoView.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(view, "view");
        return view.getTag(R.id.window_mode) == WindowMode.FULLSCREEN;
    }

    public final void r(@d AbsVideoView videoView) {
        if (PatchProxy.proxy(new Object[]{videoView}, this, changeQuickRedirect, false, c.m.No, new Class[]{AbsVideoView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(videoView, "videoView");
        String str = (String) videoView.getTag();
        int duration = videoView.getDuration();
        int currentPosition = videoView.getCurrentPosition();
        if (str == null || currentPosition <= 0 || duration <= currentPosition) {
            return;
        }
        f76088j.put(str, Integer.valueOf(currentPosition));
    }

    public final void s(@d Context activityContext) {
        if (PatchProxy.proxy(new Object[]{activityContext}, this, changeQuickRedirect, false, c.m.Yo, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activityContext, "activityContext");
        if (f76086h == null) {
            g gVarH = g.f74531b.H();
            if (gVarH != null) {
                gVarH.a0("注册电池监听");
            }
            f76086h = new BroadcastReceiver() { // from class: com.max.video.player.VideoPlayerManager$registerBatteryBroadCastReceiver$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.content.BroadcastReceiver
                public void onReceive(@e Context context, @e Intent intent) {
                    if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, c.m.cp, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.m(intent);
                    String action = intent.getAction();
                    if (action != null) {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1886648615) {
                            if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                VideoPlayerManager.f76080b.setValue(Boolean.FALSE);
                                g gVarH2 = g.f74531b.H();
                                if (gVarH2 != null) {
                                    gVarH2.a0("电源断开");
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (iHashCode == -1538406691) {
                            if (action.equals("android.intent.action.BATTERY_CHANGED")) {
                                Bundle extras = intent.getExtras();
                                VideoPlayerManager.f76081c.setValue(Integer.valueOf(((extras != null ? extras.getInt("level") : 0) * 100) / (extras != null ? extras.getInt("scale") : 1)));
                                return;
                            }
                            return;
                        }
                        if (iHashCode == 1019184907 && action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                            VideoPlayerManager.f76080b.setValue(Boolean.TRUE);
                            g gVarH3 = g.f74531b.H();
                            if (gVarH3 != null) {
                                gVarH3.a0("电源已连接");
                            }
                        }
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            activityContext.registerReceiver(f76086h, intentFilter);
        }
    }

    public final void t(@d AbsVideoView videoView) {
        if (PatchProxy.proxy(new Object[]{videoView}, this, changeQuickRedirect, false, c.m.Lo, new Class[]{AbsVideoView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(videoView, "videoView");
        u((String) videoView.getTag());
    }

    public final void u(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.m.Mo, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        f76088j.put(str, 0);
    }

    public final void v(@e BroadcastReceiver broadcastReceiver) {
        f76086h = broadcastReceiver;
    }

    public final void w(@d Activity activity, @d View videoView, @e ViewGroup viewGroup, int i10) {
        View viewF;
        if (PatchProxy.proxy(new Object[]{activity, videoView, viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, c.m.Qo, new Class[]{Activity.class, View.class, ViewGroup.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        f0.p(videoView, "videoView");
        g gVarH = g.f74531b.H();
        if (gVarH != null) {
            gVarH.a0("開啟全屏");
        }
        videoView.setTag(R.id.system_ui_visibility, Integer.valueOf(activity.getWindow().getDecorView().getSystemUiVisibility()));
        int i11 = R.id.window_mode;
        WindowMode windowMode = WindowMode.FULLSCREEN;
        videoView.setTag(i11, windowMode);
        if (videoView instanceof AbsVideoView) {
            AbsVideoView absVideoView = (AbsVideoView) videoView;
            absVideoView.setOriginContainer(viewGroup);
            absVideoView.b0(windowMode);
        }
        b bVar = b.f141790a;
        bVar.l(activity);
        ViewGroup viewGroup2 = (ViewGroup) activity.findViewById(android.R.id.content);
        if (viewGroup2 != null && (viewF = f(viewGroup2)) != null) {
            viewGroup2.removeView(viewF);
        }
        if (viewGroup != null) {
            viewGroup.removeView(videoView);
        }
        if (viewGroup2 != null) {
            viewGroup2.addView(videoView, new ViewGroup.LayoutParams(-1, -1));
        }
        ye.a.f141789a.e(activity, i10);
        bVar.m(activity);
    }

    public final void y(@d Activity activity, @d AbsVideoView videoView, @e ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{activity, videoView, viewGroup}, this, changeQuickRedirect, false, c.m.So, new Class[]{Activity.class, AbsVideoView.class, ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        f0.p(videoView, "videoView");
        w(activity, videoView, viewGroup, 8);
    }

    public final void z(@d Context activityContext) {
        if (PatchProxy.proxy(new Object[]{activityContext}, this, changeQuickRedirect, false, c.m.Zo, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activityContext, "activityContext");
        BroadcastReceiver broadcastReceiver = f76086h;
        if (broadcastReceiver != null) {
            try {
                g gVarH = g.f74531b.H();
                if (gVarH != null) {
                    gVarH.a0("销毁电源监听");
                }
                activityContext.unregisterReceiver(broadcastReceiver);
                b2 b2Var = b2.f124493a;
            } catch (Exception e10) {
                g gVarH2 = g.f74531b.H();
                if (gVarH2 != null) {
                    gVarH2.s0("!!!销毁电源监听异常:" + o.i(e10));
                    b2 b2Var2 = b2.f124493a;
                }
            }
        }
        f76086h = null;
    }
}
