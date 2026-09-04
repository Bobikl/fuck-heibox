package com.max.xiaoheihe.okflutter.pigeonimpl;

import android.content.Context;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.okflutter.FlutterHelper;
import com.max.xiaoheihe.okflutter.executors.ProtocolExecutor;
import com.max.xiaoheihe.okflutter.pigeon.IHeyboxProtocol;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tekartik.sqflite.b;
import com.umeng.analytics.pro.d;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HBProtocolImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000fJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0016R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/max/xiaoheihe/okflutter/pigeonimpl/HBProtocolImpl;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHeyboxProtocol$HeyboxProtocol;", "", SwitchDetailActivity.P, "Lcom/max/xiaoheihe/okflutter/pigeon/IHeyboxProtocol$NullableResult;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHeyboxProtocol$ProtocolResponse;", "result", "Lkotlin/b2;", b.f98590i, "Landroid/content/Context;", d.R, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "<init>", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1})
public final class HBProtocolImpl implements IHeyboxProtocol.HeyboxProtocol {
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private Context context;

    public HBProtocolImpl(@dl.d Context context) {
        f0.p(context, "context");
        this.context = context;
    }

    @Override // com.max.xiaoheihe.okflutter.pigeon.IHeyboxProtocol.HeyboxProtocol
    public void execute(@dl.d String protocol, @dl.d IHeyboxProtocol.NullableResult<IHeyboxProtocol.ProtocolResponse> result) {
        if (PatchProxy.proxy(new Object[]{protocol, result}, this, changeQuickRedirect, false, 48094, new Class[]{String.class, IHeyboxProtocol.NullableResult.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(protocol, "protocol");
        f0.p(result, "result");
        ProtocolExecutor protocolExecutor = FlutterHelper.INSTANCE.getInstance().getProtocolExecutor();
        IHeyboxProtocol.ProtocolResponse protocolResponseExecute = protocolExecutor != null ? protocolExecutor.execute(this.context, protocol) : null;
        if (protocolResponseExecute != null) {
            result.success(protocolResponseExecute);
        } else {
            result.error(new Exception("Invalid Response"));
        }
    }

    @dl.d
    public final Context getContext() {
        return this.context;
    }

    public final void setContext(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 48093, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.context = context;
    }
}
