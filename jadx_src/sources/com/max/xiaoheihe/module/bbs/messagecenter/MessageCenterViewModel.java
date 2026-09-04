package com.max.xiaoheihe.module.bbs.messagecenter;

import android.content.Intent;
import androidx.compose.runtime.internal.o;
import androidx.lifecycle.i0;
import com.max.xiaoheihe.base.mvvm.BaseViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.z;

/* JADX INFO: compiled from: MessageCenterViewModel.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class MessageCenterViewModel extends BaseViewModel {

    @dl.d
    public static final String A = "1";

    @dl.d
    public static final String B = "2";

    @dl.d
    public static final String C = "3";

    @dl.d
    public static final String D = "4";

    @dl.d
    public static final String E = "5";

    @dl.d
    public static final String F = "6";

    @dl.d
    public static final String G = "7";

    @dl.d
    public static final String H = "8";

    @dl.d
    public static final String I = "9";

    @dl.d
    public static final String J = "10";

    @dl.d
    public static final String K = "11";

    @dl.d
    public static final String L = "13";

    @dl.d
    public static final String M = "-2";

    @dl.d
    public static final String N = "-3";

    @dl.d
    public static final String O = "16";

    @dl.d
    public static final String P = "17";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    public static final a f81324q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f81325r = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    public static final String f81326s = "list_type";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    public static final String f81327t = "message_type";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    public static final String f81328u = "prefer_friend_list";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    public static final String f81329v = "sender_id";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    public static final String f81330w = "0";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    public static final String f81331x = "1";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    public static final String f81332y = "2";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    public static final String f81333z = "9";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @e
    private Intent f81334k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final z f81335l = b0.b(LazyThreadSafetyMode.SYNCHRONIZED, new yh.a<MessageCenterRepository>() { // from class: com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterViewModel$repository$2
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        public final MessageCenterRepository a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28381, new Class[0], MessageCenterRepository.class);
            return patchProxyResultProxy.isSupported ? (MessageCenterRepository) patchProxyResultProxy.result : MessageCenterRepository.f81318b.a();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterRepository, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ MessageCenterRepository invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28382, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final i0<String> f81336m = new i0<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final i0<String> f81337n = new i0<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final i0<String> f81338o = new i0<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final i0<Boolean> f81339p = new i0<>(Boolean.FALSE);

    /* JADX INFO: compiled from: MessageCenterViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    private final MessageCenterRepository s() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28378, new Class[0], MessageCenterRepository.class);
        return patchProxyResultProxy.isSupported ? (MessageCenterRepository) patchProxyResultProxy.result : (MessageCenterRepository) this.f81335l.getValue();
    }

    private final void w() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28379, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        i0<String> i0Var = this.f81336m;
        Intent intentG = g();
        i0Var.r(intentG != null ? intentG.getStringExtra("message_type") : null);
        i0<String> i0Var2 = this.f81337n;
        Intent intentG2 = g();
        i0Var2.r(intentG2 != null ? intentG2.getStringExtra("list_type") : null);
        i0<String> i0Var3 = this.f81338o;
        Intent intentG3 = g();
        i0Var3.r(intentG3 != null ? intentG3.getStringExtra("sender_id") : null);
        i0<Boolean> i0Var4 = this.f81339p;
        Intent intentG4 = g();
        i0Var4.r(intentG4 != null ? Boolean.valueOf(intentG4.getBooleanExtra("prefer_friend_list", false)) : null);
    }

    @Override // com.max.xiaoheihe.base.mvvm.a
    public void a() {
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseViewModel
    @e
    public Intent g() {
        return this.f81334k;
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseViewModel
    public void o(@e Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 28377, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f81334k = intent;
        w();
    }

    @dl.d
    public final i0<String> p() {
        return this.f81337n;
    }

    @dl.d
    public final i0<String> r() {
        return this.f81336m;
    }

    @dl.d
    public final i0<String> t() {
        return this.f81338o;
    }

    @dl.d
    public final i0<Boolean> u() {
        return this.f81339p;
    }

    public final void v(@dl.d String type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 28380, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        s().c(type);
    }
}
