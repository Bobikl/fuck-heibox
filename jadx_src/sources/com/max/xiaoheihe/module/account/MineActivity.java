package com.max.xiaoheihe.module.account;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.pubg.MatchesFragment;
import com.max.xiaoheihe.module.littleprogram.fragment.pubg.PUBGCommonContainerFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes9.dex */
public class MineActivity extends BaseActivity {
    private static final String T = "MineActivity";
    public static final String U = "FRAGMENT_TYPE";
    private static final String V = "player_id";
    private static final String W = "heyboxId";
    private static final String X = "steamId";
    private static final String Y = "nickname";
    private static final String Z = "season";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f78213a0 = "region";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f78214b0 = "steamAppId";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f78215c0 = "game_count";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static FragmentType f78216p1;
    private String L = "-1";
    private String M = "-1";
    private String N;
    private String O;
    private String P;
    private String Q;
    private String R;
    private Fragment S;

    public enum FragmentType {
        followings,
        games,
        PUBG,
        matches,
        friendRanking,
        gameAchievement;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static FragmentType valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 23730, new Class[]{String.class}, FragmentType.class);
            return patchProxyResultProxy.isSupported ? (FragmentType) patchProxyResultProxy.result : (FragmentType) Enum.valueOf(FragmentType.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static FragmentType[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 23729, new Class[0], FragmentType[].class);
            return patchProxyResultProxy.isSupported ? (FragmentType[]) patchProxyResultProxy.result : (FragmentType[]) values().clone();
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f78217a;

        static {
            int[] iArr = new int[FragmentType.valuesCustom().length];
            f78217a = iArr;
            try {
                iArr[FragmentType.followings.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78217a[FragmentType.games.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78217a[FragmentType.PUBG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f78217a[FragmentType.matches.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f78217a[FragmentType.gameAchievement.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static Fragment M1(FragmentType fragmentType, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fragmentType, str, str2, str3, str4, str5, str6, str7, new Integer(i10)}, null, changeQuickRedirect, true, 23725, new Class[]{FragmentType.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        if (fragmentType == null) {
            return null;
        }
        int i11 = a.f78217a[fragmentType.ordinal()];
        if (i11 == 1) {
            return FollowingFragment.P4(str, str2, str4);
        }
        if (i11 == 2) {
            return UserGameFragment.V4(str, str2, str4, i10);
        }
        if (i11 == 3) {
            return com.max.xiaoheihe.module.littleprogram.fragment.pubg.c.b(str7);
        }
        if (i11 == 4) {
            return MatchesFragment.T4(str4, str5, str6, str7);
        }
        if (i11 != 5) {
            return null;
        }
        return GameAchievementFragment.U4(str2, str3);
    }

    private void N1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23728, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Intent intent = getIntent();
        if (intent == null) {
            f78216p1 = null;
            return;
        }
        this.N = intent.getStringExtra("player_id");
        this.L = intent.getStringExtra("heyboxId");
        this.M = intent.getStringExtra("steamId");
        this.O = intent.getStringExtra("nickname");
        this.P = intent.getStringExtra("season");
        this.Q = intent.getStringExtra("region");
        this.R = intent.getStringExtra(f78214b0);
        String str = this.P;
        if (str == null) {
            str = "";
        }
        this.P = str;
        String str2 = this.O;
        this.O = str2 != null ? str2 : "";
        String str3 = this.L;
        if (str3 == null) {
            str3 = "-1";
        }
        this.L = str3;
        String str4 = this.M;
        this.M = str4 != null ? str4 : "-1";
        f78216p1 = (FragmentType) intent.getSerializableExtra(U);
        if (TextUtils.isEmpty(this.N)) {
            this.N = this.O;
        }
    }

    public static Intent O1(Context context, FragmentType fragmentType, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, fragmentType, str, str2}, null, changeQuickRedirect, true, 23720, new Class[]{Context.class, FragmentType.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) MineActivity.class);
        intent.putExtra("heyboxId", str);
        intent.putExtra("steamId", str2);
        intent.putExtra(U, fragmentType);
        return intent;
    }

    public static Intent Q1(Context context, FragmentType fragmentType, String str, String str2, String str3, String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, fragmentType, str, str2, str3, str4}, null, changeQuickRedirect, true, 23721, new Class[]{Context.class, FragmentType.class, String.class, String.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intentO1 = O1(context, fragmentType, str, str2);
        intentO1.putExtra("nickname", str3);
        intentO1.putExtra("player_id", str4);
        return intentO1;
    }

    public static Intent R1(Context context, FragmentType fragmentType, String str, String str2, String str3, String str4, String str5, String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, fragmentType, str, str2, str3, str4, str5, str6}, null, changeQuickRedirect, true, 23724, new Class[]{Context.class, FragmentType.class, String.class, String.class, String.class, String.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intentQ1 = Q1(context, fragmentType, str, str2, str3, str6);
        intentQ1.putExtra("nickname", str3);
        intentQ1.putExtra("player_id", str6);
        intentQ1.putExtra("season", str4);
        intentQ1.putExtra("region", str5);
        return intentQ1;
    }

    private void T1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23727, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Fragment fragmentM1 = M1(f78216p1, this.L, this.M, this.R, this.O, this.P, this.Q, this.N, getIntent().getIntExtra(f78215c0, -1));
        if (FragmentType.matches == f78216p1) {
            com.max.hbutils.utils.t.N(this.f66601b.getWindow(), false);
            com.max.hbutils.utils.t.c(com.max.xiaoheihe.utils.d.E(R.color.transparent), this.f66616q, null);
            this.f66601b.getWindow().setNavigationBarColor(0);
            this.f66616q.setBackgroundResource(R.color.transparent);
        }
        if (fragmentM1 == null) {
            C1();
        } else {
            this.S = fragmentM1;
            getSupportFragmentManager().u().b(R.id.vg_mine_fragment_wrapper, this.S).m();
        }
    }

    public static boolean V1(Context context, FragmentType fragmentType, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, fragmentType, str, str2, str3, str4, str5, str6, str7}, null, changeQuickRedirect, true, 23723, new Class[]{Context.class, FragmentType.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Bundle bundle = new Bundle();
        bundle.putString("heyboxId", str);
        bundle.putString("steamId", str2);
        bundle.putString("nickname", str4);
        bundle.putString("player_id", str7);
        bundle.putString(MatchesFragment.B, str4);
        bundle.putString(MatchesFragment.D, str5);
        bundle.putString(MatchesFragment.E, str6);
        int i10 = a.f78217a[fragmentType.ordinal()];
        if (i10 == 1) {
            return com.max.xiaoheihe.module.littleprogram.b.p(context, com.max.xiaoheihe.module.littleprogram.b.C, bundle);
        }
        if (i10 == 2) {
            return com.max.xiaoheihe.module.littleprogram.b.p(context, com.max.xiaoheihe.module.littleprogram.b.D, bundle);
        }
        if (i10 == 3) {
            return com.max.xiaoheihe.module.littleprogram.b.p(context, lb.d.J3, bundle);
        }
        if (i10 == 4) {
            return com.max.xiaoheihe.module.littleprogram.b.p(context, com.max.xiaoheihe.module.littleprogram.b.F, bundle);
        }
        if (i10 != 5) {
            return false;
        }
        return com.max.xiaoheihe.module.littleprogram.b.p(context, com.max.xiaoheihe.module.littleprogram.b.G, bundle);
    }

    public static void W1(Context context, FragmentType fragmentType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (PatchProxy.proxy(new Object[]{context, fragmentType, str, str2, str3, str4, str5, str6, str7, str8}, null, changeQuickRedirect, true, 23722, new Class[]{Context.class, FragmentType.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (fragmentType == FragmentType.matches) {
            com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.W(context, PUBGCommonContainerFragment.f89169x, str6, str3, str4, str5, str7, str8));
        } else {
            if (V1(context, fragmentType, str, str2, null, str3, str4, str5, str6)) {
                return;
            }
            Intent intentR1 = R1(context, fragmentType, str, str2, str3, str4, str5, str6);
            if (!(context instanceof Activity)) {
                intentR1.addFlags(268435456);
            }
            context.startActivity(intentR1);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23726, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_mine);
        N1();
        T1();
    }
}
