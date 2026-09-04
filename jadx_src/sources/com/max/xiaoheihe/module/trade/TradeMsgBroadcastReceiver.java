package com.max.xiaoheihe.module.trade;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.component.TitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TradeInfoUtil.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class TradeMsgBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f93024c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f93025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final TitleBar f93026b;

    public TradeMsgBroadcastReceiver(@dl.d TitleBar toolbar, boolean z10) {
        f0.p(toolbar, "toolbar");
        this.f93025a = z10;
        this.f93026b = toolbar;
    }

    public /* synthetic */ TradeMsgBroadcastReceiver(TitleBar titleBar, boolean z10, int i10, u uVar) {
        this(titleBar, (i10 & 2) != 0 ? false : z10);
    }

    @dl.d
    public final TitleBar a() {
        return this.f93026b;
    }

    public final boolean b() {
        return this.f93025a;
    }

    public final void c(boolean z10) {
        this.f93025a = z10;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@dl.d Context context, @dl.d Intent intent) {
        if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 45432, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(intent, "intent");
        if (f0.g(lb.a.N, intent.getAction())) {
            if (this.f93025a) {
                TradeInfoUtilKt.w(context, this.f93026b);
            } else {
                TradeInfoUtilKt.x(context, this.f93026b);
            }
        }
    }
}
