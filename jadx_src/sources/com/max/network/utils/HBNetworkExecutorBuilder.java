package com.max.network.utils;

import bb.c;
import com.max.network.entities.ApiResponse;
import com.max.network.interfaces.ApiService;
import com.max.network.interfaces.ConfigProvider;
import com.max.network.interfaces.ResultHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import okhttp3.d0;
import xh.m;
import yh.p;

/* JADX INFO: compiled from: HBNetworkExecutorBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class HBNetworkExecutorBuilder<T extends ApiService> {

    @d
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private final String group;

    @e
    private ResultHandler resultHandler;

    /* JADX INFO: compiled from: HBNetworkExecutorBuilder.kt */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @d
        @m
        public final <P extends ApiService> HBNetworkExecutorBuilder<P> with(@d ConfigProvider<P> configProvider) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{configProvider}, this, changeQuickRedirect, false, c.m.f34683dg, new Class[]{ConfigProvider.class}, HBNetworkExecutorBuilder.class);
            if (patchProxyResultProxy.isSupported) {
                return (HBNetworkExecutorBuilder) patchProxyResultProxy.result;
            }
            f0.p(configProvider, "configProvider");
            return new HBNetworkExecutorBuilder<>(configProvider.getGroup());
        }

        @d
        @m
        public final <P extends ApiService> HBNetworkExecutorBuilder<P> with(@d ConfigProvider<P> configProvider, @d String group) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{configProvider, group}, this, changeQuickRedirect, false, c.m.f34706eg, new Class[]{ConfigProvider.class, String.class}, HBNetworkExecutorBuilder.class);
            if (patchProxyResultProxy.isSupported) {
                return (HBNetworkExecutorBuilder) patchProxyResultProxy.result;
            }
            f0.p(configProvider, "configProvider");
            f0.p(group, "group");
            return new HBNetworkExecutorBuilder<>(group);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HBNetworkExecutorBuilder() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public HBNetworkExecutorBuilder(@d String group) {
        f0.p(group, "group");
        this.group = group;
    }

    public /* synthetic */ HBNetworkExecutorBuilder(String str, int i10, u uVar) {
        this((i10 & 1) != 0 ? com.max.xiaoheihe.network.c.f94838c : str);
    }

    @d
    @m
    public static final <P extends ApiService> HBNetworkExecutorBuilder<P> with(@d ConfigProvider<P> configProvider) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{configProvider}, null, changeQuickRedirect, true, c.m.f34636bg, new Class[]{ConfigProvider.class}, HBNetworkExecutorBuilder.class);
        return patchProxyResultProxy.isSupported ? (HBNetworkExecutorBuilder) patchProxyResultProxy.result : Companion.with(configProvider);
    }

    @d
    @m
    public static final <P extends ApiService> HBNetworkExecutorBuilder<P> with(@d ConfigProvider<P> configProvider, @d String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{configProvider, str}, null, changeQuickRedirect, true, c.m.f34659cg, new Class[]{ConfigProvider.class, String.class}, HBNetworkExecutorBuilder.class);
        return patchProxyResultProxy.isSupported ? (HBNetworkExecutorBuilder) patchProxyResultProxy.result : Companion.with(configProvider, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d
    public final HBNetworkExecutorBuilder<?> addResultHandler(@e ResultHandler resultHandler) {
        this.resultHandler = resultHandler;
        return this;
    }

    @d
    public final <D> HBNetworkRequestExecutor<D> build(@d p<? super T, ? super kotlin.coroutines.c<? super ApiResponse<D>>, ? extends Object> apiBlock) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{apiBlock}, this, changeQuickRedirect, false, c.m.f34613ag, new Class[]{p.class}, HBNetworkRequestExecutor.class);
        if (patchProxyResultProxy.isSupported) {
            return (HBNetworkRequestExecutor) patchProxyResultProxy.result;
        }
        f0.p(apiBlock, "apiBlock");
        return new HBNetworkRequestExecutor<>(this.resultHandler, new HBNetworkExecutorBuilder$build$runBlock$1(apiBlock, this, null));
    }

    @d
    public final HBNetworkDownloadExecutor buildDownload(@d p<? super T, ? super kotlin.coroutines.c<? super d0>, ? extends Object> apiBlock) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{apiBlock}, this, changeQuickRedirect, false, c.m.Zf, new Class[]{p.class}, HBNetworkDownloadExecutor.class);
        if (patchProxyResultProxy.isSupported) {
            return (HBNetworkDownloadExecutor) patchProxyResultProxy.result;
        }
        f0.p(apiBlock, "apiBlock");
        return new HBNetworkDownloadExecutor(new HBNetworkExecutorBuilder$buildDownload$runBlock$1(apiBlock, this, null));
    }
}
