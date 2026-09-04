package com.max.xiaoheihe.module.littleprogram.fragment;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import com.google.gson.JsonObject;
import com.max.hbcommon.analytics.m;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.hbminiprogram.bean.MiniProgramMenuInfoObj;
import com.max.hbshare.bean.HBShareProtocolData;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.NavBarCfgObj;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: GameWikiFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@m(path = lb.d.R2)
@o(parameters = 0)
@n9.a({com.max.hbminiprogram.d.class})
public final class GameWikiFragment extends NativeLittleProgramFragment implements com.max.hbminiprogram.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    public static final a f88830t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f88831u = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final String f88832v = "ARG_WIKI_ID";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private WebProtocolObj f88833p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.e
    private String f88834q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public WebviewFragment f88835r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private final UMShareListener f88836s = new e();

    /* JADX INFO: compiled from: GameWikiFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38839, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : GameWikiFragment.f88832v;
        }

        @dl.d
        public final Fragment b(@dl.e Map<String, ? extends Object> map) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 38840, new Class[]{Map.class}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            bundle.putString(a(), (String) (map != null ? map.get(a()) : null));
            Object obj = map != null ? map.get(com.max.xiaoheihe.module.littleprogram.b.f88740a.b()) : null;
            if (obj instanceof WebProtocolObj) {
                bundle.putSerializable(com.max.xiaoheihe.module.littleprogram.b.f88740a.b(), (WebProtocolObj) obj);
            }
            GameWikiFragment gameWikiFragment = new GameWikiFragment();
            gameWikiFragment.setArguments(bundle);
            return gameWikiFragment;
        }
    }

    /* JADX INFO: compiled from: GameWikiFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<KeyDescObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MiniProgramMenuInfoObj f88838c;

        b(MiniProgramMenuInfoObj miniProgramMenuInfoObj) {
            this.f88838c = miniProgramMenuInfoObj;
        }

        public void onNext(@dl.d Result<KeyDescObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38841, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (GameWikiFragment.this.isActive()) {
                super.onNext(result);
                GameWikiFragment.L4(GameWikiFragment.this, result.getResult(), this.f88838c);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38842, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<KeyDescObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameWikiFragment.kt */
    public static final class c extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void o(@dl.d WebView view, @dl.d String receivedTitle) {
            if (PatchProxy.proxy(new Object[]{view, receivedTitle}, this, changeQuickRedirect, false, 38843, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            f0.p(receivedTitle, "receivedTitle");
            if (l0.i0(view.getUrl(), receivedTitle) && ((com.max.hbcommon.base.d) GameWikiFragment.this).mTitleBar != null && ((com.max.hbcommon.base.d) GameWikiFragment.this).mTitleBar.getVisibility() == 0 && TextUtils.isEmpty(((com.max.hbcommon.base.d) GameWikiFragment.this).mTitleBar.getTitle())) {
                ((com.max.hbcommon.base.d) GameWikiFragment.this).mTitleBar.setTitle(receivedTitle);
            }
        }
    }

    /* JADX INFO: compiled from: GameWikiFragment.kt */
    public static final class d implements com.max.hbminiprogram.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbminiprogram.c
        public final void a(@dl.e MiniProgramMenuInfoObj miniProgramMenuInfoObj) {
            if (PatchProxy.proxy(new Object[]{miniProgramMenuInfoObj}, this, changeQuickRedirect, false, 38844, new Class[]{MiniProgramMenuInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (GameWikiFragment.this.W3() != null) {
                GameWikiFragment.this.G4(miniProgramMenuInfoObj);
            } else {
                GameWikiFragment gameWikiFragment = GameWikiFragment.this;
                GameWikiFragment.K4(gameWikiFragment, gameWikiFragment.O4(), miniProgramMenuInfoObj);
            }
        }
    }

    /* JADX INFO: compiled from: GameWikiFragment.kt */
    public static final class e implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(@dl.e SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(@dl.e SHARE_MEDIA share_media, @dl.e Throwable th2) {
            Context context;
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 38846, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported || (context = GameWikiFragment.this.getContext()) == null) {
                return;
            }
            com.max.hbutils.utils.c.f(context.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(@dl.e SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 38845, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(GameWikiFragment.this.getString(R.string.share_success));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(@dl.e SHARE_MEDIA share_media) {
        }
    }

    public static final /* synthetic */ void K4(GameWikiFragment gameWikiFragment, String str, MiniProgramMenuInfoObj miniProgramMenuInfoObj) {
        if (PatchProxy.proxy(new Object[]{gameWikiFragment, str, miniProgramMenuInfoObj}, null, changeQuickRedirect, true, 38837, new Class[]{GameWikiFragment.class, String.class, MiniProgramMenuInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameWikiFragment.P4(str, miniProgramMenuInfoObj);
    }

    public static final /* synthetic */ void L4(GameWikiFragment gameWikiFragment, KeyDescObj keyDescObj, MiniProgramMenuInfoObj miniProgramMenuInfoObj) {
        if (PatchProxy.proxy(new Object[]{gameWikiFragment, keyDescObj, miniProgramMenuInfoObj}, null, changeQuickRedirect, true, 38838, new Class[]{GameWikiFragment.class, KeyDescObj.class, MiniProgramMenuInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameWikiFragment.U4(keyDescObj, miniProgramMenuInfoObj);
    }

    private final void P4(String str, MiniProgramMenuInfoObj miniProgramMenuInfoObj) {
        if (PatchProxy.proxy(new Object[]{str, miniProgramMenuInfoObj}, this, changeQuickRedirect, false, 38833, new Class[]{String.class, MiniProgramMenuInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) i.a().M5(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(miniProgramMenuInfoObj)));
    }

    private final void Q4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38829, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WebProtocolObj webProtocolObj = this.f88833p;
        NavBarCfgObj navBarCfgObj = webProtocolObj != null ? (NavBarCfgObj) webProtocolObj.objectOf("navigation_bar", NavBarCfgObj.class) : null;
        this.mTitleBar.setTitle(navBarCfgObj != null ? navBarCfgObj.getTitle() : null);
    }

    private final void U4(KeyDescObj keyDescObj, MiniProgramMenuInfoObj miniProgramMenuInfoObj) {
        if (PatchProxy.proxy(new Object[]{keyDescObj, miniProgramMenuInfoObj}, this, changeQuickRedirect, false, 38834, new Class[]{KeyDescObj.class, MiniProgramMenuInfoObj.class}, Void.TYPE).isSupported || keyDescObj == null) {
            return;
        }
        com.max.hbminiprogram.utils.b.h(this.mContext, Q3(), miniProgramMenuInfoObj, true, HBShareProtocolData.Companion.getFromKeyDescObj(keyDescObj), !com.max.hbcommon.utils.c.u(keyDescObj.getImg()) ? new UMImage(this.mContext, keyDescObj.getImg()) : new UMImage(this.mContext, R.drawable.share_thumbnail), this.f88836s);
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public void A4() {
        Bundle arguments;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38828, new Class[0], Void.TYPE).isSupported || (arguments = getArguments()) == null) {
            return;
        }
        this.f88834q = arguments.getString(f88832v);
        Serializable serializable = arguments.getSerializable(com.max.xiaoheihe.module.littleprogram.b.f88740a.b());
        if (serializable instanceof WebProtocolObj) {
            this.f88833p = (WebProtocolObj) serializable;
        }
    }

    @dl.d
    public final WebviewFragment M4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38825, new Class[0], WebviewFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebviewFragment) patchProxyResultProxy.result;
        }
        WebviewFragment webviewFragment = this.f88835r;
        if (webviewFragment != null) {
            return webviewFragment;
        }
        f0.S("mFragment");
        return null;
    }

    @dl.e
    public final WebProtocolObj N4() {
        return this.f88833p;
    }

    @dl.e
    public final String O4() {
        return this.f88834q;
    }

    public final void R4(@dl.d WebviewFragment webviewFragment) {
        if (PatchProxy.proxy(new Object[]{webviewFragment}, this, changeQuickRedirect, false, 38826, new Class[]{WebviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(webviewFragment, "<set-?>");
        this.f88835r = webviewFragment;
    }

    public final void S4(@dl.e WebProtocolObj webProtocolObj) {
        this.f88833p = webProtocolObj;
    }

    public final void T4(@dl.e String str) {
        this.f88834q = str;
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @dl.d
    public Fragment a2(@dl.e Map<String, ? extends Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 38836, new Class[]{Map.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : f88830t.b(map);
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(@dl.e View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38827, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        setContentView(R.layout.layout_sample_fragment_container);
        Q4();
        v0 v0Var = v0.f124986a;
        String GAME_WIKI = lb.a.N2;
        f0.o(GAME_WIKI, "GAME_WIKI");
        String str = String.format(GAME_WIKI, Arrays.copyOf(new Object[]{this.f88834q}, 1));
        f0.o(str, "format(format, *args)");
        WebviewFragment webviewFragmentU7 = WebviewFragment.u7(str);
        f0.o(webviewFragmentU7, "newInstance(String.forma…tant.GAME_WIKI, mWikiId))");
        R4(webviewFragmentU7);
        M4().Y7(new c());
        getChildFragmentManager().u().y(R.id.fragment_container, M4()).n();
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void g4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38830, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        T3(new d());
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38835, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("wiki_id", this.f88834q);
        return jsonObject.toString();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38832, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38831, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRefresh();
        if (M4() != null) {
            M4().onRefresh();
        }
    }
}
