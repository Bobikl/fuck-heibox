package com.starlightc.ucropplus.network;

import com.max.network.HBNetworkManager;
import com.max.network.config.NetworkConfig;
import com.max.network.interfaces.ConfigProvider;
import com.max.xiaoheihe.network.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.qcloud.core.util.IOUtils;
import dl.d;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u;
import lb.a;

/* JADX INFO: compiled from: ImageEditorConfigProvider.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ImageEditorConfigProvider implements ConfigProvider<ImageEditorApi> {

    @d
    public static final Companion Companion = new Companion(null);

    @d
    public static final String GROUP_IMAGE_EDITOR = "ImageEditor";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: ImageEditorConfigProvider.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }
    }

    @Override // com.max.network.interfaces.ConfigProvider
    @d
    public String getGroup() {
        return GROUP_IMAGE_EDITOR;
    }

    @Override // com.max.network.interfaces.ConfigProvider
    @d
    public NetworkConfig provideConfig() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50208, new Class[0], NetworkConfig.class);
        if (patchProxyResultProxy.isSupported) {
            return (NetworkConfig) patchProxyResultProxy.result;
        }
        NetworkConfig networkConfig = new NetworkConfig(n0.d(ImageEditorApi.class), "https://" + a.f131021p1 + IOUtils.DIR_SEPARATOR_UNIX, 0L, 4, null);
        networkConfig.setInterceptors(HBNetworkManager.Companion.getInstance().getConfig(c.f94838c).getInterceptors());
        return networkConfig;
    }
}
