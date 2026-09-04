package com.max.xiaoheihe.module.video.sample;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.internal.o;
import com.max.hbcustomview.video.VideoViewX;
import com.max.video.impl.PlainVideoUI;
import com.max.video.impl.StatusInfoTopPanel;
import com.max.video.impl.f;
import com.max.video.player.VideoPlayerManager;
import com.max.video.ui.widget.BasicBottomPanel;
import com.max.video.ui.widget.BasicCenterPanel;
import com.max.xiaoheihe.base.mvvm.BaseActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.msdk.dns.MSDKDnsResolver;
import df.x2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;
import ze.e;

/* JADX INFO: compiled from: TXVideoTestActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class TXVideoTestActivity extends BaseActivity<TXVideoVM> {
    public static final int E = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private final Handler C = new Handler(Looper.getMainLooper());
    private x2 D;

    /* JADX INFO: compiled from: TXVideoTestActivity.kt */
    public static final class a implements e {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // ze.e
        public void invoke() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46432, new Class[0], Void.TYPE).isSupported && VideoPlayerManager.f76079a.e(TXVideoTestActivity.this) == null) {
                TXVideoTestActivity.this.getOnBackPressedDispatcher().f();
            }
        }
    }

    /* JADX INFO: compiled from: TXVideoTestActivity.kt */
    public static final class b implements ze.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // ze.a
        public void a(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 46433, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (!z10) {
                VideoPlayerManager.f76079a.e(TXVideoTestActivity.this);
                return;
            }
            VideoPlayerManager videoPlayerManager = VideoPlayerManager.f76079a;
            TXVideoTestActivity tXVideoTestActivity = TXVideoTestActivity.this;
            x2 x2Var = tXVideoTestActivity.D;
            x2 x2Var2 = null;
            if (x2Var == null) {
                f0.S("binding");
                x2Var = null;
            }
            VideoViewX videoViewX = x2Var.f117353f;
            f0.o(videoViewX, "binding.videoCountdown");
            x2 x2Var3 = TXVideoTestActivity.this.D;
            if (x2Var3 == null) {
                f0.S("binding");
            } else {
                x2Var2 = x2Var3;
            }
            VideoPlayerManager.x(videoPlayerManager, tXVideoTestActivity, videoViewX, x2Var2.f117351d, 0, 8, null);
        }
    }

    /* JADX INFO: compiled from: TXVideoTestActivity.kt */
    public static final class c implements ve.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // ve.a
        @dl.d
        public List<String> a(@dl.d String host) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{host}, this, changeQuickRedirect, false, 46434, new Class[]{String.class}, List.class);
            if (patchProxyResultProxy.isSupported) {
                return (List) patchProxyResultProxy.result;
            }
            f0.p(host, "host");
            String ips = MSDKDnsResolver.getInstance().getAddrByName(host);
            f0.o(ips, "ips");
            List<String> listU4 = StringsKt__StringsKt.U4(ips, new String[]{";"}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList();
            for (String str : listU4) {
                if (!f0.g("0", str)) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: TXVideoTestActivity.kt */
    public static final class d extends androidx.activity.o {
        public static ChangeQuickRedirect changeQuickRedirect;

        d(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.o
        public void handleOnBackPressed() {
        }
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseActivity
    @dl.d
    public Handler V0() {
        return this.C;
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseActivity
    public void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46428, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        x2 x2VarC = x2.c(getLayoutInflater());
        f0.o(x2VarC, "inflate(layoutInflater)");
        this.D = x2VarC;
        if (x2VarC == null) {
            f0.S("binding");
            x2VarC = null;
        }
        A1(x2VarC);
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseActivity
    public void initViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46429, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        new f(this);
        new PlainVideoUI(this);
        ze.d plainVideoUI = new PlainVideoUI(this);
        f fVar = new f(this);
        StatusInfoTopPanel statusInfoTopPanel = new StatusInfoTopPanel(this);
        BasicCenterPanel basicCenterPanel = new BasicCenterPanel(this);
        BasicBottomPanel basicBottomPanel = new BasicBottomPanel(this);
        statusInfoTopPanel.setBackwardAction(new a());
        basicBottomPanel.setFullScreenAction(new b());
        plainVideoUI.m(statusInfoTopPanel).k(basicCenterPanel).q(basicBottomPanel);
        plainVideoUI.g();
        fVar.j(new c());
        x2 x2Var = this.D;
        x2 x2Var2 = null;
        if (x2Var == null) {
            f0.S("binding");
            x2Var = null;
        }
        x2Var.f117353f.p(plainVideoUI).o(fVar).n(this).s(this);
        x2 x2Var3 = this.D;
        if (x2Var3 == null) {
            f0.S("binding");
            x2Var3 = null;
        }
        x2Var3.f117353f.setVideoRes("https://media.st.dl.eccdnx.com/steam/apps/256826509/movie480.mp4");
        x2 x2Var4 = this.D;
        if (x2Var4 == null) {
            f0.S("binding");
            x2Var4 = null;
        }
        x2Var4.f117353f.O();
        x2 x2Var5 = this.D;
        if (x2Var5 == null) {
            f0.S("binding");
        } else {
            x2Var2 = x2Var5;
        }
        x2Var2.f117353f.Y();
        getOnBackPressedDispatcher().c(this, new d(VideoPlayerManager.f76079a.c(this) != null));
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 46430, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        VideoPlayerManager.f76079a.s(this);
        super.onCreate(bundle);
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46431, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        VideoPlayerManager.f76079a.z(this);
        super.onDestroy();
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseActivity
    public void t1() {
    }
}
