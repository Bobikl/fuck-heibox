package com.max.xiaoheihe.okflutter.pigeonimpl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.l2;
import com.max.xiaoheihe.okflutter.pigeon.IHybridPlatform;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.analytics.pro.d;
import dl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HBNotificationImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H\u0016J\u0006\u0010\b\u001a\u00020\u0006R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR,\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/max/xiaoheihe/okflutter/pigeonimpl/HBNotificationImpl;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridPlatform$HybridNotificationApi;", "", "isNotificationEnabled", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridPlatform$Result;", "result", "Lkotlin/b2;", "gotoNotificationSettings", "onNotificationSetting", "Landroid/content/Context;", d.R, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridPlatform$Result;", "getResult", "()Lcom/max/xiaoheihe/okflutter/pigeon/IHybridPlatform$Result;", "setResult", "(Lcom/max/xiaoheihe/okflutter/pigeon/IHybridPlatform$Result;)V", "<init>", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1})
public final class HBNotificationImpl implements IHybridPlatform.HybridNotificationApi {
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private Context context;

    @e
    private IHybridPlatform.Result<Boolean> result;

    public HBNotificationImpl(@dl.d Context context) {
        f0.p(context, "context");
        this.context = context;
    }

    @dl.d
    public final Context getContext() {
        return this.context;
    }

    @e
    public final IHybridPlatform.Result<Boolean> getResult() {
        return this.result;
    }

    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridPlatform.HybridNotificationApi
    public void gotoNotificationSettings(@dl.d IHybridPlatform.Result<Boolean> result) {
        if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 48090, new Class[]{IHybridPlatform.Result.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(result, "result");
        if (Build.VERSION.SDK_INT < 26) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", this.context.getPackageName(), null));
            this.context.startActivity(intent);
            return;
        }
        try {
            Intent intent2 = new Intent();
            intent2.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent2.putExtra("android.provider.extra.APP_PACKAGE", this.context.getPackageName());
            intent2.putExtra("android.provider.extra.CHANNEL_ID", this.context.getApplicationInfo().uid);
            intent2.putExtra("app_package", this.context.getPackageName());
            intent2.putExtra("app_uid", this.context.getApplicationInfo().uid);
            this.context.startActivity(intent2);
        } catch (Exception e10) {
            e10.printStackTrace();
            Intent intent3 = new Intent();
            intent3.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(Uri.fromParts("package", this.context.getPackageName(), null));
            this.context.startActivity(intent3);
        }
    }

    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridPlatform.HybridNotificationApi
    public /* bridge */ /* synthetic */ Boolean isNotificationEnabled() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48092, new Class[0], Boolean.class);
        return patchProxyResultProxy.isSupported ? (Boolean) patchProxyResultProxy.result : Boolean.valueOf(m43isNotificationEnabled());
    }

    /* JADX INFO: renamed from: isNotificationEnabled, reason: collision with other method in class */
    public boolean m43isNotificationEnabled() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48089, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            return l2.p(this.context).a();
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public final void onNotificationSetting() {
        IHybridPlatform.Result<Boolean> result;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48091, new Class[0], Void.TYPE).isSupported || (result = this.result) == null) {
            return;
        }
        result.success(Boolean.valueOf(m43isNotificationEnabled()));
    }

    public final void setContext(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 48088, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.context = context;
    }

    public final void setResult(@e IHybridPlatform.Result<Boolean> result) {
        this.result = result;
    }
}
