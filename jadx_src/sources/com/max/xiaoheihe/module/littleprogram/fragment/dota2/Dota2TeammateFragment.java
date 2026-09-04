package com.max.xiaoheihe.module.littleprogram.fragment.dota2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.gson.JsonObject;
import com.max.hbcommon.analytics.m;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewHeaderInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.n8;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Dota2TeammateFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@m(path = lb.d.f131125a4)
@o(parameters = 0)
@n9.a({com.max.hbminiprogram.d.class})
public final class Dota2TeammateFragment extends com.max.xiaoheihe.module.littleprogram.fragment.dota2.a implements com.max.hbminiprogram.d {

    @dl.d
    public static final String A = "is_me";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    public static final a f89065y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f89066z = 8;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.e
    private String f89067u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.e
    private String f89068v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f89069w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public n8 f89070x;

    /* JADX INFO: compiled from: Dota2TeammateFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Fragment a(@dl.e Map<String, ? extends Object> map) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39335, new Class[]{Map.class}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            String str = (String) (map != null ? map.get(Dota2GameDetailFragment.C.b()) : null);
            String str2 = (String) (map != null ? map.get(Dota2GameDetailFragment.C.a()) : null);
            Object obj = map != null ? map.get(Dota2TeammateFragment.A) : null;
            Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
            bundle.putString(aVar.b(), str);
            bundle.putString(aVar.a(), str2);
            bundle.putString(Dota2TeammateFragment.A, (String) obj);
            Dota2TeammateFragment dota2TeammateFragment = new Dota2TeammateFragment();
            dota2TeammateFragment.setArguments(bundle);
            return dota2TeammateFragment;
        }
    }

    /* JADX INFO: compiled from: Dota2TeammateFragment.kt */
    public static final class b extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39337, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            return Dota2TeammateFragment.this.W4() ? 3 : 2;
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 39336, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            if (i10 == 0) {
                return Dota2TeammateFragment.this.W4() ? Dota2FollowListFragment.f88915i.a(Dota2TeammateFragment.this.V4(), Dota2TeammateFragment.this.U4(), "follows") : Dota2FollowListFragment.f88915i.a(Dota2TeammateFragment.this.V4(), Dota2TeammateFragment.this.U4(), "friends");
            }
            if (i10 == 1 && Dota2TeammateFragment.this.W4()) {
                return Dota2FollowListFragment.f88915i.a(Dota2TeammateFragment.this.V4(), Dota2TeammateFragment.this.U4(), "friends");
            }
            return Dota2TeammateListFragment.f89072h.a(Dota2TeammateFragment.this.V4(), Dota2TeammateFragment.this.U4(), true);
        }

        @Override // androidx.viewpager.widget.a
        public int getItemPosition(@dl.d Object object) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{object}, this, changeQuickRedirect, false, 39339, new Class[]{Object.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            f0.p(object, "object");
            return -2;
        }

        @Override // androidx.viewpager.widget.a
        @dl.e
        public CharSequence getPageTitle(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 39338, new Class[]{Integer.TYPE}, CharSequence.class);
            if (patchProxyResultProxy.isSupported) {
                return (CharSequence) patchProxyResultProxy.result;
            }
            String str = "好友";
            if (i10 != 0) {
                if (i10 != 1) {
                    return "队友";
                }
                if (!Dota2TeammateFragment.this.W4()) {
                    str = "队友";
                }
            } else if (Dota2TeammateFragment.this.W4()) {
                str = "关注";
            }
            return str;
        }
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public void A4() {
        Bundle arguments;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39330, new Class[0], Void.TYPE).isSupported || (arguments = getArguments()) == null) {
            return;
        }
        Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
        this.f89067u = arguments.getString(aVar.b());
        this.f89068v = arguments.getString(aVar.a());
        this.f89069w = com.max.hbcommon.utils.c.A(arguments.getString(A));
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d
    @dl.d
    public View K4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39329, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        n8 n8VarC = n8.c(this.mInflater);
        f0.o(n8VarC, "inflate(mInflater)");
        Y4(n8VarC);
        T4().f113731e.setAdapter(new b(getChildFragmentManager()));
        T4().f113728b.setupWithViewPager(T4().f113731e);
        T4().f113729c.setVisibility(4);
        CircularProgressIndicator circularProgressIndicator = J4().f111334f;
        circularProgressIndicator.setTrackColor(this.mContext.getColor(R.color.white_alpha30));
        circularProgressIndicator.setIndicatorColor(this.mContext.getColor(R.color.divider_primary_1_color));
        circularProgressIndicator.p();
        LinearLayout linearLayoutB = T4().b();
        f0.o(linearLayoutB, "binding.root");
        return linearLayoutB;
    }

    @dl.d
    public final n8 T4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39327, new Class[0], n8.class);
        if (patchProxyResultProxy.isSupported) {
            return (n8) patchProxyResultProxy.result;
        }
        n8 n8Var = this.f89070x;
        if (n8Var != null) {
            return n8Var;
        }
        f0.S("binding");
        return null;
    }

    @dl.e
    public final String U4() {
        return this.f89068v;
    }

    @dl.e
    public final String V4() {
        return this.f89067u;
    }

    public final boolean W4() {
        return this.f89069w;
    }

    public final void X4(@dl.e GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj) {
        if (PatchProxy.proxy(new Object[]{gameOverviewHeaderInfoObj}, this, changeQuickRedirect, false, 39333, new Class[]{GameOverviewHeaderInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        c cVar = c.f89134a;
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        cVar.e(mContext, T4().f113730d.b(), gameOverviewHeaderInfoObj);
        T4().f113729c.setVisibility(0);
        J4().f111334f.j();
    }

    public final void Y4(@dl.d n8 n8Var) {
        if (PatchProxy.proxy(new Object[]{n8Var}, this, changeQuickRedirect, false, 39328, new Class[]{n8.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(n8Var, "<set-?>");
        this.f89070x = n8Var;
    }

    public final void Z4(boolean z10) {
        this.f89069w = z10;
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @dl.d
    public Fragment a2(@dl.e Map<String, ? extends Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39332, new Class[]{Map.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : f89065y.a(map);
    }

    public final void a5(@dl.e String str) {
        this.f89068v = str;
    }

    public final void b5(@dl.e String str) {
        this.f89067u = str;
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d, com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public boolean e4() {
        return false;
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39331, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
        jsonObject.addProperty(aVar.b(), this.f89067u);
        jsonObject.addProperty(aVar.a(), this.f89068v);
        return jsonObject.toString();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39334, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
    }
}
