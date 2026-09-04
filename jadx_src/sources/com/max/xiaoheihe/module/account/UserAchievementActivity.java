package com.max.xiaoheihe.module.account;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
@ig.d(path = {lb.d.G1})
public class UserAchievementActivity extends BaseActivity {
    private static final String T = "share_image";
    private static final String U = "page_task";
    private static final String V = "page_achievement";
    public static final String W = "task";
    public static final String X = "achieve";
    private static final String Y = "all_tab";
    private static final String Z = "current_tab_position";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String L;
    private String M;
    private int N;
    private ViewPager O;
    private SlidingTabLayout P;
    private androidx.viewpager.widget.a Q;
    private ArrayList<KeyDescObj> R = new ArrayList<>();
    private boolean S;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24396, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            UserAchievementActivity.M1(UserAchievementActivity.this);
        }
    }

    public class b extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24398, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : UserAchievementActivity.this.R.size();
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 24397, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            String key = ((KeyDescObj) UserAchievementActivity.this.R.get(i10)).getKey();
            if (UserAchievementActivity.U.equals(key)) {
                return UserTaskFragmentV2.y4(UserAchievementActivity.this.L);
            }
            if (UserAchievementActivity.V.equals(key)) {
                return UserMedalFragmentV2.Y3(UserAchievementActivity.this.L);
            }
            return null;
        }
    }

    public class c extends ViewPager.l {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24400, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                UserAchievementActivity.M1(UserAchievementActivity.this);
            }
        }

        c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 24399, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (!(UserAchievementActivity.this.Q.instantiateItem((ViewGroup) UserAchievementActivity.this.O, i10) instanceof UserMedalFragmentV2)) {
                ((BaseActivity) UserAchievementActivity.this).f66616q.setActionIcon((Drawable) null);
            } else {
                ((BaseActivity) UserAchievementActivity.this).f66616q.setActionIcon(R.drawable.common_share);
                ((BaseActivity) UserAchievementActivity.this).f66616q.setActionIconOnClickListener(new a());
            }
        }
    }

    public class d implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(SHARE_MEDIA share_media, Throwable th2) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
        }
    }

    static /* synthetic */ void M1(UserAchievementActivity userAchievementActivity) {
        if (PatchProxy.proxy(new Object[]{userAchievementActivity}, null, changeQuickRedirect, true, 24395, new Class[]{UserAchievementActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        userAchievementActivity.Z1();
    }

    private void Y1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24391, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.R.isEmpty()) {
            if (this.S) {
                KeyDescObj keyDescObj = new KeyDescObj();
                keyDescObj.setKey(U);
                keyDescObj.setDesc(getString(R.string.task));
                this.R.add(keyDescObj);
            }
            KeyDescObj keyDescObj2 = new KeyDescObj();
            keyDescObj2.setKey(V);
            keyDescObj2.setDesc(getString(R.string.achievement));
            this.R.add(keyDescObj2);
        }
        this.Q.notifyDataSetChanged();
        String[] strArr = new String[this.R.size()];
        for (int i10 = 0; i10 < this.R.size(); i10++) {
            strArr[i10] = this.R.get(i10).getDesc();
        }
        SlidingTabLayout slidingTabLayout = this.P;
        if (slidingTabLayout != null) {
            slidingTabLayout.setViewPager(this.O, strArr);
        }
        if (this.N > 0 || com.max.hbcommon.utils.c.u(this.M)) {
            return;
        }
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < this.R.size(); i13++) {
            KeyDescObj keyDescObj3 = this.R.get(i13);
            if (U.equals(keyDescObj3.getKey())) {
                i11 = i13;
            } else if (V.equals(keyDescObj3.getKey())) {
                i12 = i13;
            }
        }
        if ("task".equals(this.M) && i11 != -1) {
            this.O.setCurrentItem(i11, false);
        } else {
            if (!"achieve".equals(this.M) || i12 == -1) {
                return;
            }
            this.O.setCurrentItem(i12, false);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void Z1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24392, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Object objInstantiateItem = this.Q.instantiateItem((ViewGroup) this.O, this.S ? 1 : 0);
        if (objInstantiateItem instanceof UserMedalFragmentV2) {
            ShareImageDialogFragment shareImageDialogFragmentX4 = ShareImageDialogFragment.x4();
            shareImageDialogFragmentX4.Q4(com.max.hbimage.image.c.d(this.f66601b));
            shareImageDialogFragmentX4.A4(((UserMedalFragmentV2) objInstantiateItem).V3());
            shareImageDialogFragmentX4.V4(true);
            shareImageDialogFragmentX4.S4(new com.max.hbshare.c.b(com.max.hbshare.c.f72567w, new d()));
            shareImageDialogFragmentX4.show(getSupportFragmentManager(), "share_image");
        }
    }

    public void X1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24390, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.O.setCurrentItem(1);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24388, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_vp);
        String stringExtra = getIntent().getStringExtra("userid");
        this.L = stringExtra;
        this.S = com.max.xiaoheihe.utils.i0.q(stringExtra);
        this.M = getIntent().getStringExtra("key");
        this.O = (ViewPager) findViewById(R.id.vp);
        if (this.S) {
            this.P = this.f66616q.getTitleTabLayout();
            this.f66616q.a0();
            this.P.setVisibility(0);
        } else {
            this.f66616q.setTitle("成就");
            this.f66616q.setActionIcon(R.drawable.common_share);
            this.f66616q.setActionIconOnClickListener(new a());
        }
        b bVar = new b(getSupportFragmentManager());
        this.Q = bVar;
        this.O.setAdapter(bVar);
        this.O.c(new c());
        this.f66617r.setVisibility(0);
        Y1();
        int i10 = this.N;
        if (i10 > 0) {
            this.O.setCurrentItem(i10);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 24393, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this.f66601b).onActivityResult(i10, i11, intent);
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 24387, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        if (bundle != null) {
            if (bundle.containsKey(Y)) {
                this.R = (ArrayList) bundle.getSerializable(Y);
            }
            if (bundle.containsKey(Z)) {
                this.N = bundle.getInt(Z);
            }
        }
        super.onCreate(bundle);
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24394, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        UMShareAPI.get(this).release();
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 24389, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onSaveInstanceState(bundle);
        if (this.Q != null) {
            bundle.putSerializable(Y, this.R);
            bundle.putInt(Z, this.O.getCurrentItem());
        }
    }
}
