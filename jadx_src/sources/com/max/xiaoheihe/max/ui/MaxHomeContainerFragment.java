package com.max.xiaoheihe.max.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.d;
import com.max.hbutils.utils.t;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.news.NewsTagListFragment;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.ba;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: MaxHomeContainerFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MaxHomeContainerFragment extends d implements com.max.xiaoheihe.view.callback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f77332e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f77333f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    public static final String f77334g = "type";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final String f77335h = "topic";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final String f77336i = "discover";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final String f77337j = "match";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ba f77338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private NewMsgBroadcastReceiver f77339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private OnRefreshBroadcastReceiver f77340d;

    /* JADX INFO: compiled from: MaxHomeContainerFragment.kt */
    public final class NewMsgBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        public NewMsgBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@dl.d Context context, @dl.d Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 22193, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(intent, "intent");
            if (f0.g(lb.a.f131025q, intent.getAction())) {
                MaxHomeContainerFragment.M3(MaxHomeContainerFragment.this);
            }
        }
    }

    /* JADX INFO: compiled from: MaxHomeContainerFragment.kt */
    public final class OnRefreshBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        public OnRefreshBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@dl.d Context context, @dl.d Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 22194, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(intent, "intent");
            if (f0.g(lb.a.f130966g0, intent.getAction())) {
                Bundle arguments = MaxHomeContainerFragment.this.getArguments();
                if (f0.g(arguments != null ? arguments.getString("type") : null, intent.getStringExtra("type"))) {
                    MaxHomeContainerFragment.this.D3();
                }
            }
        }
    }

    /* JADX INFO: compiled from: MaxHomeContainerFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @m
        public final MaxHomeContainerFragment a(@e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22192, new Class[]{String.class}, MaxHomeContainerFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (MaxHomeContainerFragment) patchProxyResultProxy.result;
            }
            MaxHomeContainerFragment maxHomeContainerFragment = new MaxHomeContainerFragment();
            Bundle bundle = new Bundle();
            bundle.putString("type", str);
            maxHomeContainerFragment.setArguments(bundle);
            return maxHomeContainerFragment;
        }
    }

    /* JADX INFO: compiled from: MaxHomeContainerFragment.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22195, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((d) MaxHomeContainerFragment.this).mContext;
            f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.x0(mContext, SearchHelper.f91573a.a().e("main")).A();
        }
    }

    /* JADX INFO: compiled from: MaxHomeContainerFragment.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22196, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.R1(((d) MaxHomeContainerFragment.this).mContext);
        }
    }

    public static final /* synthetic */ void M3(MaxHomeContainerFragment maxHomeContainerFragment) {
        if (PatchProxy.proxy(new Object[]{maxHomeContainerFragment}, null, changeQuickRedirect, true, 22191, new Class[]{MaxHomeContainerFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        maxHomeContainerFragment.P3();
    }

    @dl.d
    @m
    public static final MaxHomeContainerFragment O3(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 22190, new Class[]{String.class}, MaxHomeContainerFragment.class);
        return patchProxyResultProxy.isSupported ? (MaxHomeContainerFragment) patchProxyResultProxy.result : f77332e.a(str);
    }

    private final void P3() {
        ImageView iv_point_home_msg;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22188, new Class[0], Void.TYPE).isSupported || (iv_point_home_msg = N3().f108884d.getIv_point_home_msg()) == null) {
            return;
        }
        if (i0.s() && com.max.hbcache.c.v()) {
            iv_point_home_msg.setVisibility(0);
        } else {
            iv_point_home_msg.setVisibility(8);
        }
    }

    @Override // com.max.xiaoheihe.view.callback.a
    public void D3() {
        androidx.activity.result.b bVarR0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22189, new Class[0], Void.TYPE).isSupported || (bVarR0 = getChildFragmentManager().r0(R.id.fragment_container)) == null || !(bVarR0 instanceof com.max.xiaoheihe.view.callback.a)) {
            return;
        }
        ((com.max.xiaoheihe.view.callback.a) bVarR0).D3();
    }

    @dl.d
    public final ba N3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22184, new Class[0], ba.class);
        if (patchProxyResultProxy.isSupported) {
            return (ba) patchProxyResultProxy.result;
        }
        ba baVar = this.f77338b;
        if (baVar != null) {
            return baVar;
        }
        f0.S("binding");
        return null;
    }

    public final void Q3(@dl.d ba baVar) {
        if (PatchProxy.proxy(new Object[]{baVar}, this, changeQuickRedirect, false, 22185, new Class[]{ba.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(baVar, "<set-?>");
        this.f77338b = baVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00eb  */
    @Override // com.max.hbcommon.base.d
    public void installViews(@e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22186, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        super.installViews(view);
        ba baVarC = ba.c(this.mInflater);
        f0.o(baVarC, "inflate(mInflater)");
        Q3(baVarC);
        setContentView(N3());
        this.f77339c = new NewMsgBroadcastReceiver();
        this.f77340d = new OnRefreshBroadcastReceiver();
        registerReceiver(this.f77339c, lb.a.f131025q);
        registerReceiver(this.f77340d, lb.a.f130966g0);
        N3().f108883c.setPadding(0, t.p(this.mContext), 0, 0);
        N3().f108884d.setMaxStyle(true);
        N3().f108884d.getIv_home_search().setOnClickListener(new b());
        N3().f108884d.getIv_home_msg().setOnClickListener(new c());
        P3();
        d aVar = (d) getChildFragmentManager().r0(R.id.fragment_container);
        if (aVar == null) {
            Bundle arguments = getArguments();
            String string = arguments != null ? arguments.getString("type") : null;
            if (string == null) {
                aVar = new com.max.xiaoheihe.max.ui.a();
            } else {
                int iHashCode = string.hashCode();
                if (iHashCode != 103668165) {
                    if (iHashCode == 273184745 && string.equals(f77336i)) {
                        aVar = NewsTagListFragment.T3();
                    } else {
                        aVar = new com.max.xiaoheihe.max.ui.a();
                    }
                } else if (string.equals("match")) {
                    aVar = new com.max.xiaoheihe.module.webview.u(lb.a.E4).p(WebviewFragment.U4).u(false).a();
                } else {
                    aVar = new com.max.xiaoheihe.max.ui.a();
                }
            }
            f0.o(aVar, "when (arguments?.getStri…gment()\n                }");
        }
        getChildFragmentManager().u().y(R.id.fragment_container, aVar).n();
    }

    @Override // com.max.hbcommon.base.d
    public void onUnRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22187, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onUnRegisterReceiver();
        unregisterReceiver(this.f77339c);
        unregisterReceiver(this.f77340d);
    }
}
