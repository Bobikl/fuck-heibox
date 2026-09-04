package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.component.bubble.BubbleTipPopup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes11.dex */
@ig.d(path = {lb.d.V1})
public class GameStoreActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    private GameStoreFragment L;
    private BubbleTipPopup M;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33856, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            String strE = com.max.xiaoheihe.module.mall.o.e(false);
            GameStoreActivity gameStoreActivity = GameStoreActivity.this;
            gameStoreActivity.startActivity(WebActionActivity.K2(((BaseActivity) gameStoreActivity).f66601b, strE, " ", true, true));
            com.max.hbcache.c.z(com.max.hbcache.c.S, "1");
            if (GameStoreActivity.this.M != null) {
                GameStoreActivity.this.M.G();
            }
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33857, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.i0(((BaseActivity) GameStoreActivity.this).f66601b, lb.d.f131195k4);
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33858, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.x0(((BaseActivity) GameStoreActivity.this).f66601b, SearchHelper.c().d(11)).A();
        }
    }

    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f84872b;

        d(View view) {
            this.f84872b = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33859, new Class[]{View.class}, Void.TYPE).isSupported && GameStoreActivity.this.isActive()) {
                this.f84872b.performClick();
            }
        }
    }

    public static Intent R1(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 33851, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent(context, (Class<?>) GameStoreActivity.class);
    }

    public void T1() {
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33852, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = getLayoutInflater().inflate(R.layout.layout_mall_store_title, (ViewGroup) null, false);
        viewInflate.setOnClickListener(new a());
        this.f66616q.setContentView(viewInflate);
        this.f66617r.setVisibility(0);
        this.f66616q.setActionIcon(R.drawable.common_service);
        this.f66616q.setActionIconOnClickListener(new b());
        this.f66616q.setActionXIcon(R.drawable.common_search);
        this.f66616q.getAppbarActionButtonXView().setOnClickListener(new c());
        this.L = new GameStoreFragment();
        getSupportFragmentManager().u().b(R.id.multi_status_view_container, this.L).m();
        if (com.max.hbutils.utils.n.r(com.max.hbcache.c.j(com.max.hbcache.c.T)) <= 0) {
            com.max.hbcache.c.z(com.max.hbcache.c.T, String.valueOf(System.currentTimeMillis()));
        }
        if ("1".equals(com.max.hbcache.c.j(com.max.hbcache.c.S)) || System.currentTimeMillis() - com.max.hbutils.utils.n.r(com.max.hbcache.c.j(com.max.hbcache.c.T)) >= 172800000) {
            return;
        }
        if (this.M == null) {
            this.M = com.max.xiaoheihe.utils.d.B(this.f66601b, viewInflate.findViewById(R.id.tv_store_icon_desc), "戳这里看新用户商城指南!", 80, 25.0f, new d(viewInflate));
        }
        this.M.O();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33855, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        BubbleTipPopup bubbleTipPopup = this.M;
        if (bubbleTipPopup != null) {
            bubbleTipPopup.G();
            this.M = null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 33853, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onNewIntent(intent);
        this.L.V4();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33854, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        T1();
    }
}
