package com.max.hbsearch;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: SearchNewActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@com.max.hbcommon.analytics.m(path = lb.d.f131253t)
@ig.d(interceptors = {q.class}, path = {lb.d.f131253t})
public final class SearchNewActivity extends BaseActivity implements m, n, SearchNewFragment.c {

    @dl.d
    public static final a M = new a(null);

    @dl.d
    public static final String N = "q";

    @dl.d
    public static final String O = "topic_id";
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private Fragment L;

    /* JADX INFO: compiled from: SearchNewActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.k.D2, new Class[]{Context.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) SearchNewActivity.class);
            intent.putExtra(l.f72320a0, true);
            intent.putExtra("page_type", 1);
            return intent;
        }
    }

    @dl.e
    public final Fragment M1() {
        return this.L;
    }

    public final void N1(@dl.e Fragment fragment) {
        this.L = fragment;
    }

    @Override // com.max.hbsearch.m
    public void S(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.A2, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        androidx.activity.result.b bVar = this.L;
        if (bVar instanceof m) {
            kotlin.jvm.internal.f0.n(bVar, "null cannot be cast to non-null type com.max.hbsearch.SearchEventListener");
            ((m) bVar).S(str);
        }
    }

    @Override // com.max.hbsearch.m
    @dl.e
    public String Z2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33990z2, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        androidx.activity.result.b bVar = this.L;
        if (!(bVar instanceof m)) {
            return null;
        }
        kotlin.jvm.internal.f0.n(bVar, "null cannot be cast to non-null type com.max.hbsearch.SearchEventListener");
        return ((m) bVar).Z2();
    }

    @Override // com.max.hbcommon.base.BaseActivity, com.max.hbcommon.analytics.d.f
    public boolean d2() {
        return true;
    }

    @Override // com.max.hbsearch.SearchNewFragment.c
    public void e1(@dl.e String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.f33880u2, new Class[]{String.class}, Void.TYPE).isSupported && isActive()) {
            Fragment fragment = this.L;
            SearchNewFragment searchNewFragment = fragment instanceof SearchNewFragment ? (SearchNewFragment) fragment : null;
            if (searchNewFragment != null) {
                searchNewFragment.e1(str);
            }
        }
    }

    @Override // com.max.hbsearch.m
    public void g(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.f33946x2, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        androidx.activity.result.b bVar = this.L;
        if (bVar instanceof m) {
            kotlin.jvm.internal.f0.n(bVar, "null cannot be cast to non-null type com.max.hbsearch.SearchEventListener");
            ((m) bVar).g(str);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33814r2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        if (ob.a.b().t()) {
            getWindow().setStatusBarColor(androidx.core.content.res.i.e(getResources(), R.color.max_main_color, null));
            com.max.hbutils.utils.t.M(this, false);
        }
        String stringExtra = getIntent().getStringExtra("q");
        Bundle extras = getIntent().getExtras();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        int i10 = R.id.fragment_container;
        Fragment fragmentR0 = supportFragmentManager.r0(i10);
        if (fragmentR0 == null) {
            fragmentR0 = SearchNewFragment.f72177a4.c(stringExtra, extras, true);
            fragmentR0.setUserVisibleHint(true);
            fragmentR0.setMenuVisibility(true);
            getSupportFragmentManager().u().b(i10, fragmentR0).m();
        }
        this.L = fragmentR0;
    }

    @Override // com.max.hbsearch.m
    public void n() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33968y2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.activity.result.b bVar = this.L;
        if (bVar instanceof m) {
            kotlin.jvm.internal.f0.n(bVar, "null cannot be cast to non-null type com.max.hbsearch.SearchEventListener");
            ((m) bVar).n();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.C2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        this.L = null;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@dl.d Bundle outState) {
        if (PatchProxy.proxy(new Object[]{outState}, this, changeQuickRedirect, false, bb.c.k.B2, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.clear();
    }

    @Override // com.max.hbsearch.m
    @dl.e
    public String r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33902v2, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        androidx.activity.result.b bVar = this.L;
        if (!(bVar instanceof m)) {
            return null;
        }
        kotlin.jvm.internal.f0.n(bVar, "null cannot be cast to non-null type com.max.hbsearch.SearchEventListener");
        return ((m) bVar).r();
    }

    @Override // com.max.hbsearch.n
    public void s1(@dl.e KeyDescObj keyDescObj, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{keyDescObj, str}, this, changeQuickRedirect, false, bb.c.k.f33836s2, new Class[]{KeyDescObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        androidx.activity.result.b bVar = this.L;
        if (bVar instanceof n) {
            kotlin.jvm.internal.f0.n(bVar, "null cannot be cast to non-null type com.max.hbsearch.SearchHost");
            ((n) bVar).s1(keyDescObj, str);
        }
    }

    @Override // com.max.hbsearch.n
    public void v1(@dl.e String str, @dl.e String str2, @dl.e String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, bb.c.k.f33858t2, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        androidx.activity.result.b bVar = this.L;
        if (bVar instanceof n) {
            kotlin.jvm.internal.f0.n(bVar, "null cannot be cast to non-null type com.max.hbsearch.SearchHost");
            ((n) bVar).v1(str, str2, str3);
        }
    }

    @Override // com.max.hbsearch.m
    @dl.e
    public String x3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33924w2, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        androidx.activity.result.b bVar = this.L;
        if (!(bVar instanceof m)) {
            return null;
        }
        kotlin.jvm.internal.f0.n(bVar, "null cannot be cast to non-null type com.max.hbsearch.SearchEventListener");
        return ((m) bVar).x3();
    }
}
