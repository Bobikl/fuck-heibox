package com.max.video;

import android.content.Context;
import android.util.Log;
import bb.c;
import com.max.heybox.hblog.HBLogInitializer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.rtmp.TXLiveBase;
import com.tencent.rtmp.TXLiveBaseListener;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HBVideoInitializer.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class HBVideoInitializer implements androidx.startup.b<b2> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final String f75899a = "HBVideoInitializer";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final String f75900b = "https://license.vod2.myqcloud.com/license/v2/1251007209_1/v_cube.license";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final String f75901c = "6357bb7983ed8463ad20fc2f5d5bd69f";

    /* JADX INFO: compiled from: HBVideoInitializer.kt */
    public static final class a extends TXLiveBaseListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.tencent.rtmp.TXLiveBaseListener
        public void onLicenceLoaded(int i10, @e String str) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10), str}, this, changeQuickRedirect, false, c.m.f34687dk, new Class[]{Integer.TYPE, String.class}, Void.TYPE).isSupported) {
                return;
            }
            Log.d(HBVideoInitializer.this.f75899a, "onLicenceLoaded: result = " + i10 + ", reason = " + str);
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.b2] */
    @Override // androidx.startup.b
    public /* bridge */ /* synthetic */ b2 a(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, c.m.f34663ck, new Class[]{Context.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        d(context);
        return b2.f124493a;
    }

    @Override // androidx.startup.b
    @d
    public List<Class<? extends androidx.startup.b<?>>> b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34640bk, new Class[0], List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : CollectionsKt__CollectionsKt.P(HBLogInitializer.class);
    }

    public void d(@d Context ctx) {
        if (PatchProxy.proxy(new Object[]{ctx}, this, changeQuickRedirect, false, c.m.f34617ak, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(ctx, "ctx");
        Log.d("HBVideo", "HBVideoInitializer create");
        TXLiveBase.getInstance().setLicence(ctx, this.f75900b, this.f75901c);
        TXLiveBase.setListener(new a());
    }
}
