package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.video.AbsVideoView;
import com.max.video.player.VideoPlayerManager;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes11.dex */
public class GameCenterActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener, com.max.xiaoheihe.module.video.b {
    public static final String N = "pages";
    public static final String O = "mobile";
    public static final String P = "online";
    public static final String Q = "gift";
    public static final String T = "recommend";
    public static final String U = "rank";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static int f84129a0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String[] L;
    private int M = -1;

    @BindView(R.id.rb_1)
    RadioButton rb_1;

    @BindView(R.id.rb_2)
    RadioButton rb_2;

    @BindView(R.id.rb_3)
    RadioButton rb_3;

    @BindView(R.id.rg_main)
    RadioGroup rg_main;

    @BindView(R.id.vg_fullscreen_video_container)
    FrameLayout vg_fullscreen_video_container;
    public static final String[] V = {"mobile"};
    public static final String[] W = {"online"};
    public static final String[] X = {"gift"};
    public static final String R = "roll";
    public static final String[] Y = {"gift", R};
    public static final String S = "preview";
    public static final String[] Z = {"gift", S};

    private Fragment M1(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 32511, new Class[]{Integer.TYPE}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        Fragment fragmentS0 = getSupportFragmentManager().s0(i10 + "");
        String[] strArrR3 = O1(MainActivity.p3(this.L, 0)) == i10 ? MainActivity.r3(this.L, 1) : null;
        if (fragmentS0 == null) {
            if (i10 == 0) {
                fragmentS0 = GameMobileFragment.Q3(strArrR3);
            } else if (i10 == 1) {
                fragmentS0 = g0.R3("游戏中心", lb.a.f131017o3);
            } else if (i10 == 2) {
                fragmentS0 = a.O3();
            }
        }
        fragmentS0.setUserVisibleHint(true);
        fragmentS0.setMenuVisibility(true);
        return fragmentS0;
    }

    public static Intent N1(Context context, String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, strArr}, null, changeQuickRedirect, true, 32502, new Class[]{Context.class, String[].class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) GameCenterActivity.class);
        intent.putExtra("pages", strArr);
        return intent;
    }

    private int O1(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 32505, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (str == null) {
            return 0;
        }
        if (str.equals("online")) {
            return 1;
        }
        return !str.equals("gift") ? 0 : 2;
    }

    private void Q1(Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 32504, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        this.L = intent.getStringArrayExtra("pages");
        RadioGroup radioGroup = this.rg_main;
        radioGroup.check(radioGroup.getChildAt(1).getId());
        f84129a0 = this.rg_main.getCheckedRadioButtonId();
    }

    private void R1(int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32510, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Fragment fragmentM1 = M1(i10);
        androidx.fragment.app.p0 p0VarU = getSupportFragmentManager().u();
        if (z10) {
            if (!fragmentM1.isAdded()) {
                p0VarU.c(R.id.fl_container, fragmentM1, i10 + "");
            }
            p0VarU.P(fragmentM1);
        } else if (!fragmentM1.isAdded()) {
            return;
        } else {
            p0VarU.u(fragmentM1);
        }
        p0VarU.n();
        getSupportFragmentManager().n0();
    }

    @Override // com.max.xiaoheihe.module.video.b
    public void c(AbsVideoView absVideoView, ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{absVideoView, viewGroup}, this, changeQuickRedirect, false, 32508, new Class[]{AbsVideoView.class, ViewGroup.class}, Void.TYPE).isSupported || absVideoView == null) {
            return;
        }
        VideoPlayerManager.f76079a.w(this, absVideoView, null, 0);
    }

    @Override // com.max.xiaoheihe.module.video.b
    public void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32509, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        VideoPlayerManager.f76079a.e(this);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32503, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_game_center);
        ButterKnife.a(this);
        this.rb_1.setOnCheckedChangeListener(this);
        this.rb_2.setOnCheckedChangeListener(this);
        this.rb_3.setOnCheckedChangeListener(this);
        this.rb_1.setOnClickListener(this);
        this.rb_2.setOnClickListener(this);
        this.rb_3.setOnClickListener(this);
        Q1(getIntent());
        com.max.xiaoheihe.utils.i0.f(this);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32507, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
        }
        switch (compoundButton.getId()) {
            case R.id.rb_1 /* 2131363858 */:
                R1(0, z10);
                break;
            case R.id.rb_2 /* 2131363859 */:
                R1(1, z10);
                break;
            case R.id.rb_3 /* 2131363860 */:
                R1(2, z10);
                break;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32506, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f84129a0 = view.getId();
    }
}
