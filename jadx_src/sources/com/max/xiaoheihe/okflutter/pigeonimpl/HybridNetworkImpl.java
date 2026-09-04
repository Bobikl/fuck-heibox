package com.max.xiaoheihe.okflutter.pigeonimpl;

import android.content.Context;
import com.max.xiaoheihe.okflutter.FlutterHelper;
import com.max.xiaoheihe.okflutter.executors.NetworkRequestExecutor;
import com.max.xiaoheihe.okflutter.pigeon.IHybridNetwork;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.umeng.analytics.pro.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HybridNetworkImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001aJz\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/max/xiaoheihe/okflutter/pigeonimpl/HybridNetworkImpl;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridNetwork$HybridNetwork;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridNetwork$RequestType;", "type", "", "url", "", "", "headers", "params", "forms", "", "showToast", "useHeyboxHost", "needEncrypt", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridNetwork$Result;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridNetwork$HybridResponse;", "result", "Lkotlin/b2;", "request", "Landroid/content/Context;", d.R, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "<init>", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1})
public final class HybridNetworkImpl implements IHybridNetwork.HybridNetwork {
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private Context context;

    public HybridNetworkImpl(@dl.d Context context) {
        f0.p(context, "context");
        this.context = context;
    }

    @dl.d
    public final Context getContext() {
        return this.context;
    }

    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridNetwork.HybridNetwork
    public /* bridge */ /* synthetic */ void request(IHybridNetwork.RequestType requestType, String str, Map map, Map map2, Map map3, Boolean bool, Boolean bool2, Boolean bool3, IHybridNetwork.Result result) {
        if (PatchProxy.proxy(new Object[]{requestType, str, map, map2, map3, bool, bool2, bool3, result}, this, changeQuickRedirect, false, 48099, new Class[]{IHybridNetwork.RequestType.class, String.class, Map.class, Map.class, Map.class, Boolean.class, Boolean.class, Boolean.class, IHybridNetwork.Result.class}, Void.TYPE).isSupported) {
            return;
        }
        request(requestType, str, (Map<String, Object>) map, (Map<String, Object>) map2, (Map<String, Object>) map3, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), (IHybridNetwork.Result<IHybridNetwork.HybridResponse>) result);
    }

    public void request(@dl.d IHybridNetwork.RequestType type, @dl.d String url, @dl.d Map<String, Object> headers, @dl.d Map<String, Object> params, @dl.d Map<String, Object> forms, boolean z10, boolean z11, boolean z12, @dl.d IHybridNetwork.Result<IHybridNetwork.HybridResponse> result) {
        Object[] objArr = {type, url, headers, params, forms, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), result};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 48098, new Class[]{IHybridNetwork.RequestType.class, String.class, Map.class, Map.class, Map.class, cls, cls, cls, IHybridNetwork.Result.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        f0.p(url, "url");
        f0.p(headers, "headers");
        f0.p(params, "params");
        f0.p(forms, "forms");
        f0.p(result, "result");
        NetworkRequestExecutor networkRequestExecutor = FlutterHelper.INSTANCE.getInstance().getNetworkRequestExecutor();
        if (networkRequestExecutor != null) {
            networkRequestExecutor.execute(this.context, type, url, params, forms, headers, z10, z11, z12, result);
        }
    }

    public final void setContext(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 48097, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.context = context;
    }
}
