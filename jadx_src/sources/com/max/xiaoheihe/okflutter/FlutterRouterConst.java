package com.max.xiaoheihe.okflutter;

import com.max.hbminiprogram.fragment.BaseLittleProgramFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: FlutterRouterConst.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/max/xiaoheihe/okflutter/FlutterRouterConst;", "", "()V", "Companion", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FlutterRouterConst {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @d
    public static final Companion INSTANCE = new Companion(null);

    @d
    private static final String ADDR_HBMiniProgramCenter = BaseLittleProgramFragment.f71250k;

    /* JADX INFO: compiled from: FlutterRouterConst.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/max/xiaoheihe/okflutter/FlutterRouterConst$Companion;", "", "()V", "ADDR_HBMiniProgramCenter", "", "getADDR_HBMiniProgramCenter$annotations", "getADDR_HBMiniProgramCenter", "()Ljava/lang/String;", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @m
        public static /* synthetic */ void getADDR_HBMiniProgramCenter$annotations() {
        }

        @d
        public final String getADDR_HBMiniProgramCenter() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47732, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : FlutterRouterConst.ADDR_HBMiniProgramCenter;
        }
    }

    @d
    public static final String getADDR_HBMiniProgramCenter() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 47731, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : INSTANCE.getADDR_HBMiniProgramCenter();
    }
}
