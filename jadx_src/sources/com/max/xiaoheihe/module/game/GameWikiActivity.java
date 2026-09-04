package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.webkit.WebView;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbshare.bean.HBShareData;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import java.util.Arrays;

/* JADX INFO: compiled from: GameWikiActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
@com.max.hbcommon.analytics.m(path = lb.d.R2)
@androidx.compose.runtime.internal.o(parameters = 0)
public final class GameWikiActivity extends BaseActivity {

    @dl.d
    public static final a N = new a(null);
    public static final int O = 8;

    @dl.d
    private static final String P = "ARG_WIKI_ID";
    public static ChangeQuickRedirect changeQuickRedirect;
    public String L;

    @dl.d
    private final UMShareListener M = new e();

    /* JADX INFO: compiled from: GameWikiActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34817, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : GameWikiActivity.P;
        }

        @dl.d
        @xh.m
        public final Intent b(@dl.d Context context, @dl.d String id2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, id2}, this, changeQuickRedirect, false, 34818, new Class[]{Context.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(id2, "id");
            Intent intent = new Intent(context, (Class<?>) GameWikiActivity.class);
            intent.putExtra(GameWikiActivity.N.a(), id2);
            return intent;
        }
    }

    /* JADX INFO: compiled from: GameWikiActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<KeyDescObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void onNext(@dl.d Result<KeyDescObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34819, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (GameWikiActivity.this.isActive()) {
                super.onNext(result);
                GameWikiActivity.Q1(GameWikiActivity.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34820, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<KeyDescObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameWikiActivity.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34821, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameWikiActivity gameWikiActivity = GameWikiActivity.this;
            GameWikiActivity.O1(gameWikiActivity, gameWikiActivity.T1());
            com.max.hbcommon.analytics.l lVar = com.max.hbcommon.analytics.l.f66572a;
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("wiki_id", GameWikiActivity.this.T1());
            kotlin.b2 b2Var = kotlin.b2.f124493a;
            lVar.l(lb.d.S2, jsonObject);
        }
    }

    /* JADX INFO: compiled from: GameWikiActivity.kt */
    public static final class d extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void o(@dl.d WebView view, @dl.d String receivedTitle) {
            if (PatchProxy.proxy(new Object[]{view, receivedTitle}, this, changeQuickRedirect, false, 34822, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(receivedTitle, "receivedTitle");
            if (com.max.xiaoheihe.utils.l0.i0(view.getUrl(), receivedTitle) && ((BaseActivity) GameWikiActivity.this).f66616q != null && ((BaseActivity) GameWikiActivity.this).f66616q.getVisibility() == 0) {
                ((BaseActivity) GameWikiActivity.this).f66616q.setTitle(receivedTitle);
            }
        }
    }

    /* JADX INFO: compiled from: GameWikiActivity.kt */
    public static final class e implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(@dl.e SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(@dl.e SHARE_MEDIA share_media, @dl.e Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 34824, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(GameWikiActivity.this.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(@dl.e SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 34823, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(GameWikiActivity.this.getString(R.string.share_success));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(@dl.e SHARE_MEDIA share_media) {
        }
    }

    public static final /* synthetic */ void O1(GameWikiActivity gameWikiActivity, String str) {
        if (PatchProxy.proxy(new Object[]{gameWikiActivity, str}, null, changeQuickRedirect, true, 34815, new Class[]{GameWikiActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameWikiActivity.V1(str);
    }

    public static final /* synthetic */ void Q1(GameWikiActivity gameWikiActivity, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{gameWikiActivity, keyDescObj}, null, changeQuickRedirect, true, 34816, new Class[]{GameWikiActivity.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameWikiActivity.X1(keyDescObj);
    }

    @dl.d
    @xh.m
    public static final Intent R1(@dl.d Context context, @dl.d String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 34814, new Class[]{Context.class, String.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : N.b(context, str);
    }

    private final void V1(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34811, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().M5(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void X1(KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, 34812, new Class[]{KeyDescObj.class}, Void.TYPE).isSupported || keyDescObj == null) {
            return;
        }
        com.max.hbshare.d.E(this.f66601b, new HBShareData(false, true, keyDescObj.getTitle(), keyDescObj.getDesc(), keyDescObj.getUrl(), null, !com.max.hbcommon.utils.c.u(keyDescObj.getImg()) ? new UMImage(this.f66601b, keyDescObj.getImg()) : new UMImage(this.f66601b, R.drawable.share_thumbnail), this.M, null, null, null, null, null, bb.c.k.L0, null));
    }

    @dl.d
    public final String T1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34808, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str = this.L;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.f0.S("mWikiId");
        return null;
    }

    public final void W1(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34809, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(str, "<set-?>");
        this.L = str;
    }

    @Override // com.max.hbcommon.base.BaseActivity, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34813, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("wiki_id", T1());
        return jsonObject.toString();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34810, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        String stringExtra = getIntent().getStringExtra(P);
        kotlin.jvm.internal.f0.m(stringExtra);
        W1(stringExtra);
        this.f66616q.setTitle("百科");
        this.f66616q.setActionIcon(R.drawable.common_share);
        this.f66616q.setActionIconOnClickListener(new c());
        kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
        String GAME_WIKI = lb.a.N2;
        kotlin.jvm.internal.f0.o(GAME_WIKI, "GAME_WIKI");
        String str = String.format(GAME_WIKI, Arrays.copyOf(new Object[]{T1()}, 1));
        kotlin.jvm.internal.f0.o(str, "format(format, *args)");
        WebviewFragment webviewFragmentU7 = WebviewFragment.u7(str);
        webviewFragmentU7.Y7(new d());
        getSupportFragmentManager().u().y(R.id.fragment_container, webviewFragmentU7).n();
    }
}
