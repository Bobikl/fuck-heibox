package com.max.xiaoheihe.module.webview;

import android.app.Activity;
import android.content.Context;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.umcrash.UMCrash;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.e1;

/* JADX INFO: compiled from: HostPingHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class HostPingHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f94176b = 0;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final String f94178d = "HostPingHelper";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final Companion f94175a = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final kotlinx.coroutines.q0 f94177c = kotlinx.coroutines.r0.a(e1.c());

    /* JADX INFO: compiled from: HostPingHelper.kt */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static final /* synthetic */ void a(Companion companion, String str) {
            if (PatchProxy.proxy(new Object[]{companion, str}, null, changeQuickRedirect, true, 46873, new Class[]{Companion.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            companion.d(str);
        }

        private final void d(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 46872, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            PageEventObj pageEventObj = new PageEventObj();
            pageEventObj.setType("1");
            pageEventObj.setPath(lb.d.f131265u4);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("domain", str);
            jsonObject.addProperty("state", "0");
            pageEventObj.setAddition(jsonObject);
            pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / ((long) 1000)));
            com.max.hbcommon.analytics.d.c(pageEventObj, true);
        }

        /* JADX WARN: Type inference failed for: r0v10, types: [T, com.max.hbcustomview.loadingdialog.LoadingDialog] */
        @xh.m
        public final void b(@dl.d Context mContext, @dl.d HashMap<String, ArrayList<String>> originHosts, @dl.e a aVar) {
            if (PatchProxy.proxy(new Object[]{mContext, originHosts, aVar}, this, changeQuickRedirect, false, 46870, new Class[]{Context.class, HashMap.class, a.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(mContext, "mContext");
            kotlin.jvm.internal.f0.p(originHosts, "originHosts");
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.f124890b = System.currentTimeMillis();
            if ((mContext instanceof Activity) && ((Activity) mContext).isFinishing()) {
                return;
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.f124891b = new LoadingDialog(mContext, "", false).r();
            com.max.hbcommon.utils.d.b(HostPingHelper.f94178d, "fun start= " + System.currentTimeMillis());
            kotlinx.coroutines.k.f(HostPingHelper.f94177c, null, null, new HostPingHelper$Companion$getValidHosts$1(originHosts, new HashMap(), longRef, mContext, objectRef, aVar, null), 3, null);
        }

        public final boolean c(@dl.e String str, int i10, int i11) throws InterruptedException {
            Object[] objArr = {str, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 46871, new Class[]{String.class, cls, cls}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                com.max.hbcommon.utils.d.b(HostPingHelper.f94178d, "ping before " + str + "  " + jCurrentTimeMillis);
                int iWaitFor = Runtime.getRuntime().exec("/system/bin/ping -c " + i10 + " -w " + i11 + ' ' + str).waitFor();
                com.max.hbcommon.utils.d.b(HostPingHelper.f94178d, "ping receive " + str + " status== " + iWaitFor + " time =" + System.currentTimeMillis() + "  cost= " + (System.currentTimeMillis() - jCurrentTimeMillis));
                return iWaitFor == 0;
            } catch (IOException e10) {
                String message = e10.getMessage();
                if (message == null) {
                    message = "error";
                }
                com.max.hbcommon.utils.d.b(HostPingHelper.f94178d, message);
                UMCrash.generateCustomLog(e10, "host ping exception");
                return false;
            }
        }
    }

    /* JADX INFO: compiled from: HostPingHelper.kt */
    public interface a {
        void a(@dl.e HashMap<String, String> map);
    }

    @xh.m
    public static final void b(@dl.d Context context, @dl.d HashMap<String, ArrayList<String>> map, @dl.e a aVar) {
        if (PatchProxy.proxy(new Object[]{context, map, aVar}, null, changeQuickRedirect, true, 46869, new Class[]{Context.class, HashMap.class, a.class}, Void.TYPE).isSupported) {
            return;
        }
        f94175a.b(context, map, aVar);
    }
}
