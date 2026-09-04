package com.max.xiaoheihe.module.favour;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: WikiFavourFolder.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class WikiFavourFolder extends BaseActivity {

    @dl.d
    public static final a M = new a(null);
    public static final int N = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private FavourWikiListFragment L;

    /* JADX INFO: compiled from: WikiFavourFolder.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final Intent a(@dl.d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 32072, new Class[]{Context.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            return new Intent(context, (Class<?>) WikiFavourFolder.class);
        }
    }

    @dl.d
    @xh.m
    public static final Intent M1(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 32071, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : M.a(context);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32070, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.setTitle("百科收藏夹");
        this.f66617r.setVisibility(0);
        FavourWikiListFragment favourWikiListFragmentR3 = FavourWikiListFragment.R3();
        this.L = favourWikiListFragmentR3;
        if (favourWikiListFragmentR3 != null) {
            getSupportFragmentManager().u().b(R.id.multi_status_view_container, favourWikiListFragmentR3).m();
        }
    }
}
