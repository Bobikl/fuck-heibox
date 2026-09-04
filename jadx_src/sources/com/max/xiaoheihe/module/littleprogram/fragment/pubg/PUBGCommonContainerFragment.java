package com.max.xiaoheihe.module.littleprogram.fragment.pubg;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p0;
import com.airbnb.lottie.LottieAnimationView;
import com.max.hbminiprogram.d;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.pubg.MatchesFragment;
import com.max.xiaoheihe.module.game.pubg.PUBGWeaponsFragment;
import com.max.xiaoheihe.utils.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.pa;
import dl.e;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: PUBGCommonContainerFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nPUBGCommonContainerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PUBGCommonContainerFragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/pubg/PUBGCommonContainerFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,188:1\n1#2:189\n262#3,2:190\n262#3,2:192\n*S KotlinDebug\n*F\n+ 1 PUBGCommonContainerFragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/pubg/PUBGCommonContainerFragment\n*L\n127#1:190,2\n133#1:192,2\n*E\n"})
@n9.a({d.class})
@o(parameters = 0)
public final class PUBGCommonContainerFragment extends com.max.xiaoheihe.module.littleprogram.fragment.dota2.d {

    @dl.d
    public static final String A = "fragment_content_type";

    @dl.d
    public static final String B = "bg_img";

    @dl.d
    public static final String C = "bg_lottie";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    public static final a f89167v = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f89168w = 8;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    public static final String f89169x = "matches";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    public static final String f89170y = "weapon";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    public static final String f89171z = "friend";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @e
    private Fragment f89172t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private pa f89173u;

    /* JADX INFO: compiled from: PUBGCommonContainerFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @m
        public final PUBGCommonContainerFragment a(@e String str, @e Bundle bundle) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, bundle}, this, changeQuickRedirect, false, 39395, new Class[]{String.class, Bundle.class}, PUBGCommonContainerFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (PUBGCommonContainerFragment) patchProxyResultProxy.result;
            }
            PUBGCommonContainerFragment pUBGCommonContainerFragment = new PUBGCommonContainerFragment();
            if (bundle != null) {
                bundle.putString(PUBGCommonContainerFragment.A, str);
            }
            pUBGCommonContainerFragment.setArguments(bundle);
            return pUBGCommonContainerFragment;
        }
    }

    private final void T4() {
        Fragment matchesFragment;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39393, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Fragment fragmentR0 = getChildFragmentManager().r0(R.id.vg_fragment_container);
        this.f89172t = fragmentR0;
        if (fragmentR0 == null) {
            Bundle arguments = getArguments();
            String string = arguments != null ? arguments.getString(A) : null;
            if (string != null) {
                if (f0.g(string, f89170y)) {
                    matchesFragment = new PUBGWeaponsFragment();
                    matchesFragment.setArguments(getArguments());
                } else if (f0.g(string, "friend")) {
                    matchesFragment = new b();
                    matchesFragment.setArguments(getArguments());
                } else {
                    matchesFragment = new MatchesFragment();
                    matchesFragment.setArguments(getArguments());
                }
                this.f89172t = matchesFragment;
                p0 p0VarU = getChildFragmentManager().u();
                Fragment fragment = this.f89172t;
                f0.m(fragment);
                p0VarU.b(R.id.vg_fragment_container, fragment).n();
            }
        }
    }

    @dl.d
    @m
    public static final PUBGCommonContainerFragment U4(@e String str, @e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, bundle}, null, changeQuickRedirect, true, 39394, new Class[]{String.class, Bundle.class}, PUBGCommonContainerFragment.class);
        return patchProxyResultProxy.isSupported ? (PUBGCommonContainerFragment) patchProxyResultProxy.result : f89167v.a(str, bundle);
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d
    @dl.d
    public View K4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39391, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        pa paVarC = pa.c(this.mInflater);
        f0.o(paVarC, "inflate(mInflater)");
        this.f89173u = paVarC;
        T4();
        J4().f111334f.setVisibility(8);
        pa paVar = this.f89173u;
        if (paVar == null) {
            f0.S("binding");
            paVar = null;
        }
        LinearLayout linearLayoutB = paVar.b();
        f0.o(linearLayoutB, "binding.root");
        return linearLayoutB;
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d
    public boolean O4() {
        return false;
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d
    public void S4() {
        String string;
        String string2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39390, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.S4();
        ColorDrawable colorDrawable = new ColorDrawable(PUBGGameDataV2Fragment.V.a());
        J4().f111330b.setImageDrawable(colorDrawable);
        J4().f111336h.setBackgroundResource(R.color.pubg_bg_main_color);
        Bundle arguments = getArguments();
        b2 b2Var = null;
        if (arguments != null && (string2 = arguments.getString(B)) != null) {
            if (!(!kotlin.text.u.V1(string2))) {
                string2 = null;
            }
            if (string2 != null) {
                J4().f111330b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                com.max.hbimage.b.U(string2, J4().f111330b, colorDrawable);
            }
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString(C)) != null) {
            if (!(!kotlin.text.u.V1(string))) {
                string = null;
            }
            if (string != null) {
                LottieAnimationView updateBackgroundRes$lambda$4$lambda$3 = J4().f111333e;
                f0.o(updateBackgroundRes$lambda$4$lambda$3, "updateBackgroundRes$lambda$4$lambda$3");
                updateBackgroundRes$lambda$4$lambda$3.setVisibility(0);
                updateBackgroundRes$lambda$4$lambda$3.setFailureListener(r.f95734k);
                updateBackgroundRes$lambda$4$lambda$3.setAnimationFromUrl(string, PUBGGameDataV2Fragment.f89224b0);
                updateBackgroundRes$lambda$4$lambda$3.E();
                b2Var = b2.f124493a;
            }
        }
        if (b2Var == null) {
            LottieAnimationView lottieAnimationView = J4().f111333e;
            f0.o(lottieAnimationView, "baseBinding.lottieBg");
            lottieAnimationView.setVisibility(8);
        }
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @e
    public Fragment a2(@e Map<String, ? extends Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39389, new Class[]{Map.class}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        if (map == null) {
            return null;
        }
        String str = (String) map.get(A);
        Bundle bundle = new Bundle();
        bundle.putString(A, str);
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1266283874) {
                if (iHashCode != -791821796) {
                    if (iHashCode == 840862003 && str.equals(f89169x)) {
                        bundle.putString(MatchesFragment.B, (String) map.get(MatchesFragment.B));
                        bundle.putString(MatchesFragment.C, (String) map.get(MatchesFragment.C));
                        bundle.putString(MatchesFragment.D, (String) map.get(MatchesFragment.D));
                        bundle.putString(MatchesFragment.E, (String) map.get(MatchesFragment.E));
                        return f89167v.a(str, bundle);
                    }
                } else if (str.equals(f89170y)) {
                    bundle.putString("player_id", (String) map.get("player_id"));
                    bundle.putString("mode", (String) map.get("mode"));
                    bundle.putString("season", (String) map.get("season"));
                    return f89167v.a(str, bundle);
                }
            } else if (str.equals("friend")) {
                bundle.putString("nickname", (String) map.get("nickname"));
                bundle.putString("season", (String) map.get("season"));
                bundle.putString("region", (String) map.get("region"));
                return f89167v.a(str, bundle);
            }
        }
        return null;
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39392, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        LottieAnimationView lottieAnimationView = J4().f111333e;
        if (lottieAnimationView.A()) {
            lottieAnimationView.p();
        }
        lottieAnimationView.setProgress(0.0f);
        lottieAnimationView.setVisibility(8);
    }
}
