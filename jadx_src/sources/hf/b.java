package hf;

import com.max.network.config.NetworkConfig;
import com.max.network.interfaces.ConfigProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.qcloud.core.util.IOUtils;
import dl.d;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: HBLoaderConfigProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements ConfigProvider<hf.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final a f119164a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    public static final String f119165b = "HB_LOADER";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: HBLoaderConfigProvider.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    @Override // com.max.network.interfaces.ConfigProvider
    @d
    public String getGroup() {
        return f119165b;
    }

    @Override // com.max.network.interfaces.ConfigProvider
    @d
    public NetworkConfig provideConfig() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22116, new Class[0], NetworkConfig.class);
        if (patchProxyResultProxy.isSupported) {
            return (NetworkConfig) patchProxyResultProxy.result;
        }
        return new NetworkConfig(n0.d(hf.a.class), "https://" + lb.a.f131021p1 + IOUtils.DIR_SEPARATOR_UNIX, 0L, 4, null);
    }
}
