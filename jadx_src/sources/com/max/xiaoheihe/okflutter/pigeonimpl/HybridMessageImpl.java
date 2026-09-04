package com.max.xiaoheihe.okflutter.pigeonimpl;

import android.content.Context;
import com.max.xiaoheihe.okflutter.FlutterHelper;
import com.max.xiaoheihe.okflutter.executors.MessageHandler;
import com.max.xiaoheihe.okflutter.pigeon.IHybridMessage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.umeng.analytics.pro.d;
import dl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HybridMessageImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000fJ \u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/max/xiaoheihe/okflutter/pigeonimpl/HybridMessageImpl;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$HostMessageHandler;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$HybridMessageInfo;", "messageInfo", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$NullableResult;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$HybridMessageResponse;", "result", "Lkotlin/b2;", "handleFlutterMessage", "Landroid/content/Context;", d.R, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "<init>", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1})
public final class HybridMessageImpl implements IHybridMessage.HostMessageHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private Context context;

    public HybridMessageImpl(@dl.d Context context) {
        f0.p(context, "context");
        this.context = context;
    }

    @dl.d
    public final Context getContext() {
        return this.context;
    }

    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridMessage.HostMessageHandler
    public void handleFlutterMessage(@e IHybridMessage.HybridMessageInfo hybridMessageInfo, @dl.d IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> result) {
        MessageHandler messageHandler;
        if (PatchProxy.proxy(new Object[]{hybridMessageInfo, result}, this, changeQuickRedirect, false, 48096, new Class[]{IHybridMessage.HybridMessageInfo.class, IHybridMessage.NullableResult.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(result, "result");
        if (hybridMessageInfo == null || (messageHandler = FlutterHelper.INSTANCE.getInstance().getMessageHandler()) == null) {
            return;
        }
        messageHandler.handle(this.context, hybridMessageInfo, result);
    }

    public final void setContext(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 48095, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.context = context;
    }
}
