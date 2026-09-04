package com.max.hbcommon.analytics;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.n0;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes9.dex */
public class ReportLinkViewTimeWorker extends Worker {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f66521g = "data";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f66522h = "game_show";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f66523i = "general_search";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f66524j = "page_event";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f66525k = "page_event_disk_cahce_name";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f66526l = "is_app_event";

    public ReportLinkViewTimeWorker(@n0 Context context, @n0 WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    @n0
    public androidx.work.m.a w() {
        String strE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Kt, new Class[0], androidx.work.m.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (androidx.work.m.a) patchProxyResultProxy.result;
        }
        String strA = g().A("data");
        String strA2 = g().A(f66522h);
        String strA3 = g().A(f66523i);
        boolean zN = g().n(f66526l, false);
        String strA4 = g().A(f66525k);
        if (strA4 == null || com.max.hbcommon.utils.c.u(strA4)) {
            strE = com.max.hbcommon.utils.h.e(g().q(f66524j));
        } else {
            byte[] bytes = com.max.hbcommon.utils.k.f68249b.getBytes(strA4);
            com.max.hbcommon.utils.k.f68249b.a(strA4);
            strE = com.max.hbcommon.utils.h.e(bytes);
        }
        com.max.heybox.hblog.g.W("ReportLinkViewTimeWorker, doWork, fileCacheKey = " + strA4 + ", page_event = " + strE);
        com.max.hbcommon.utils.k.s(strA, strA2, strA3, new Pair(strE, Boolean.valueOf(zN)));
        return androidx.work.m.a.e();
    }
}
