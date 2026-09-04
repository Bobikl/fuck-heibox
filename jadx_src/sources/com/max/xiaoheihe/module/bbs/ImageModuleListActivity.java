package com.max.xiaoheihe.module.bbs;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.utils.ViewUtils;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.style.SelectMainStyle;
import com.max.mediaselector.lib.widget.CompleteSelectView;
import com.max.mediaselector.lib.widget.MediumBoldTextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.GameShotPictureSelectorFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.UCrop;
import com.starlightc.ucropplus.model.Draft;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.tencent.qcloud.core.util.IOUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: ImageModuleListActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@com.max.hbcommon.analytics.m(path = lb.d.N0)
@androidx.compose.runtime.internal.o(parameters = 0)
public final class ImageModuleListActivity extends BaseActivity implements com.max.mediaselector.lib.basic.k {

    @dl.d
    public static final String G2 = "ARG_PICTURE_SELECT_HIDE_EDIT";
    public static final int G3 = 1;
    public static final int J3 = 2;
    public static final int K3 = 3;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f79941p2 = 9;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @dl.d
    public static final String f79942p3 = "ARG_DEFAULT_TAB";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dl.d
    public static final String f79944x2 = "ARG_MAX_NUM";

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    @dl.d
    public static final String f79946y2 = "ARG_SHOW_GIF";
    private ViewPager2 L;
    private TabLayout M;
    private ViewGroup N;
    private TextView O;
    private TextView P;
    private TextView Q;
    private LinearLayout R;
    private MediumBoldTextView S;
    private String[] T;

    @dl.e
    private com.max.mediaselector.lib.c U;

    @dl.e
    private GameShotPictureSelectorFragment V;
    private boolean W;
    private boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.e
    private String f79947a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.e
    private String f79948b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f79949c0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @dl.d
    public static final a f79943x1 = new a(null);

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final int f79945y1 = 8;
    private long X = -1;
    private int Y = 9;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @dl.e
    private Integer f79950p1 = 1;

    /* JADX INFO: compiled from: ImageModuleListActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.d Context context, int i10, boolean z10, @dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, 26633, new Class[]{Context.class, Integer.TYPE, Boolean.TYPE, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) ImageModuleListActivity.class);
            intent.putExtra(ImageModuleListActivity.f79944x2, i10);
            intent.putExtra(ImageModuleListActivity.f79946y2, z10);
            intent.putExtra(ImageModuleListActivity.G2, str);
            return intent;
        }
    }

    /* JADX INFO: compiled from: ImageModuleListActivity.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26634, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MediumBoldTextView mediumBoldTextView = ImageModuleListActivity.this.S;
            MediumBoldTextView mediumBoldTextView2 = null;
            if (mediumBoldTextView == null) {
                kotlin.jvm.internal.f0.S("tv_selected_original");
                mediumBoldTextView = null;
            }
            MediumBoldTextView mediumBoldTextView3 = ImageModuleListActivity.this.S;
            if (mediumBoldTextView3 == null) {
                kotlin.jvm.internal.f0.S("tv_selected_original");
                mediumBoldTextView3 = null;
            }
            mediumBoldTextView.setSelected(true ^ mediumBoldTextView3.isSelected());
            PictureSelectionConfig pictureSelectionConfigC = PictureSelectionConfig.c();
            MediumBoldTextView mediumBoldTextView4 = ImageModuleListActivity.this.S;
            if (mediumBoldTextView4 == null) {
                kotlin.jvm.internal.f0.S("tv_selected_original");
                mediumBoldTextView4 = null;
            }
            pictureSelectionConfigC.S = mediumBoldTextView4.isSelected();
            MediumBoldTextView mediumBoldTextView5 = ImageModuleListActivity.this.S;
            if (mediumBoldTextView5 == null) {
                kotlin.jvm.internal.f0.S("tv_selected_original");
            } else {
                mediumBoldTextView2 = mediumBoldTextView5;
            }
            mediumBoldTextView2.startAnimation(AnimationUtils.loadAnimation(ImageModuleListActivity.this, R.anim.ps_anim_modal_in));
        }
    }

    /* JADX INFO: compiled from: ImageModuleListActivity.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CompleteSelectView completeSelectView;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26635, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ViewPager2 viewPager2 = ImageModuleListActivity.this.L;
            if (viewPager2 == null) {
                kotlin.jvm.internal.f0.S("vp2");
                viewPager2 = null;
            }
            if (viewPager2.getCurrentItem() != 0) {
                GameShotPictureSelectorFragment gameShotPictureSelectorFragment = ImageModuleListActivity.this.V;
                if (gameShotPictureSelectorFragment != null) {
                    gameShotPictureSelectorFragment.x4();
                    return;
                }
                return;
            }
            com.max.mediaselector.lib.c cVar = ImageModuleListActivity.this.U;
            if (cVar == null || (completeSelectView = cVar.f74979r) == null) {
                return;
            }
            completeSelectView.performClick();
        }
    }

    /* JADX INFO: compiled from: ImageModuleListActivity.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26636, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ViewPager2 viewPager2 = ImageModuleListActivity.this.L;
            if (viewPager2 == null) {
                kotlin.jvm.internal.f0.S("vp2");
                viewPager2 = null;
            }
            if (viewPager2.getCurrentItem() == 0) {
                com.max.mediaselector.lib.c cVar = ImageModuleListActivity.this.U;
                if (cVar != null) {
                    cVar.y4();
                    return;
                }
                return;
            }
            GameShotPictureSelectorFragment gameShotPictureSelectorFragment = ImageModuleListActivity.this.V;
            if (gameShotPictureSelectorFragment != null) {
                gameShotPictureSelectorFragment.m4();
            }
        }
    }

    /* JADX INFO: compiled from: ImageModuleListActivity.kt */
    public static final class e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f79954b = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* JADX INFO: compiled from: ImageModuleListActivity.kt */
    public static final class f extends FragmentStateAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: ImageModuleListActivity.kt */
        public static final class a implements com.max.mediaselector.lib.c.y {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ImageModuleListActivity f79956a;

            a(ImageModuleListActivity imageModuleListActivity) {
                this.f79956a = imageModuleListActivity;
            }

            @Override // com.max.mediaselector.lib.c.y
            public final void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26639, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                this.f79956a.f2(qe.a.g());
                this.f79956a.e2(qe.a.g() > 0);
            }
        }

        f() {
            super(ImageModuleListActivity.this);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @dl.d
        public Fragment createFragment(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 26638, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            if (i10 != 0) {
                ImageModuleListActivity.this.V = new GameShotPictureSelectorFragment();
                GameShotPictureSelectorFragment gameShotPictureSelectorFragment = ImageModuleListActivity.this.V;
                kotlin.jvm.internal.f0.m(gameShotPictureSelectorFragment);
                return gameShotPictureSelectorFragment;
            }
            ImageModuleListActivity.this.U = com.max.mediaselector.lib.c.g6();
            com.max.mediaselector.lib.c cVar = ImageModuleListActivity.this.U;
            if (cVar != null) {
                cVar.F = true;
            }
            com.max.mediaselector.lib.c cVar2 = ImageModuleListActivity.this.U;
            if (cVar2 != null) {
                cVar2.E = new a(ImageModuleListActivity.this);
            }
            com.max.mediaselector.lib.c cVar3 = ImageModuleListActivity.this.U;
            kotlin.jvm.internal.f0.m(cVar3);
            return cVar3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26637, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            String[] strArr = ImageModuleListActivity.this.T;
            if (strArr == null) {
                kotlin.jvm.internal.f0.S("mTabTitleList");
                strArr = null;
            }
            return strArr.length;
        }
    }

    /* JADX INFO: compiled from: ImageModuleListActivity.kt */
    public static final class g implements com.google.android.material.tabs.d.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.google.android.material.tabs.d.b
        public final void a(@dl.d TabLayout.h tab, int i10) {
            if (PatchProxy.proxy(new Object[]{tab, new Integer(i10)}, this, changeQuickRedirect, false, 26640, new Class[]{TabLayout.h.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(tab, "tab");
            String[] strArr = ImageModuleListActivity.this.T;
            if (strArr == null) {
                kotlin.jvm.internal.f0.S("mTabTitleList");
                strArr = null;
            }
            tab.D(strArr[i10]);
        }
    }

    /* JADX INFO: compiled from: ImageModuleListActivity.kt */
    public static final class h implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator p10) {
            if (PatchProxy.proxy(new Object[]{p10}, this, changeQuickRedirect, false, 26641, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(p10, "p0");
            if (ImageModuleListActivity.this.isActive()) {
                Object animatedValue = p10.getAnimatedValue();
                kotlin.jvm.internal.f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue = ((Float) animatedValue).floatValue();
                ViewGroup viewGroup = ImageModuleListActivity.this.N;
                if (viewGroup == null) {
                    kotlin.jvm.internal.f0.S("vg_select");
                    viewGroup = null;
                }
                viewGroup.setTranslationY(ViewUtils.f(ImageModuleListActivity.this.getViewContext(), fFloatValue));
            }
        }
    }

    /* JADX INFO: compiled from: ImageModuleListActivity.kt */
    public static final class i implements me.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // me.b
        public final void a(Fragment fragment, LocalMedia localMedia, ArrayList<LocalMedia> dataSource, int i10) {
            if (PatchProxy.proxy(new Object[]{fragment, localMedia, dataSource, new Integer(i10)}, this, changeQuickRedirect, false, 26642, new Class[]{Fragment.class, LocalMedia.class, ArrayList.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ImageModuleListActivity imageModuleListActivity = ImageModuleListActivity.this;
            kotlin.jvm.internal.f0.o(dataSource, "dataSource");
            ImageModuleListActivity.X1(imageModuleListActivity, dataSource, i10);
        }
    }

    /* JADX INFO: compiled from: ImageModuleListActivity.kt */
    public static final class j implements oe.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // oe.i
        public final void a(Fragment fragment, LocalMedia localMedia, ArrayList<LocalMedia> list, int i10) {
            if (PatchProxy.proxy(new Object[]{fragment, localMedia, list, new Integer(i10)}, this, changeQuickRedirect, false, 26643, new Class[]{Fragment.class, LocalMedia.class, ArrayList.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ImageModuleListActivity imageModuleListActivity = ImageModuleListActivity.this;
            kotlin.jvm.internal.f0.o(list, "list");
            ImageModuleListActivity.X1(imageModuleListActivity, list, i10);
        }
    }

    /* JADX INFO: compiled from: ImageModuleListActivity.kt */
    public static final class k implements oe.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // oe.f
        public void a(@dl.e Context context, @dl.d ArrayList<LocalMedia> result, @dl.e oe.v vVar) {
            if (PatchProxy.proxy(new Object[]{context, result, vVar}, this, changeQuickRedirect, false, 26644, new Class[]{Context.class, ArrayList.class, oe.v.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            ImageModuleListActivity imageModuleListActivity = ImageModuleListActivity.this;
            if (result.size() > 0) {
                ArrayList<Uri> arrayList = new ArrayList<>();
                Iterator<LocalMedia> it = result.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().I());
                }
                imageModuleListActivity.c2(arrayList, null, null, null);
            }
        }
    }

    /* JADX INFO: compiled from: ImageModuleListActivity.kt */
    public static final class l implements oe.t<LocalMedia> {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // oe.t
        public void onCancel() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26645, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ImageModuleListActivity.this.onBackPressed();
        }

        @Override // oe.t
        public void onResult(@dl.e ArrayList<LocalMedia> arrayList) {
        }
    }

    public static final /* synthetic */ void X1(ImageModuleListActivity imageModuleListActivity, ArrayList arrayList, int i10) {
        if (PatchProxy.proxy(new Object[]{imageModuleListActivity, arrayList, new Integer(i10)}, null, changeQuickRedirect, true, 26632, new Class[]{ImageModuleListActivity.class, ArrayList.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        imageModuleListActivity.h2(arrayList, i10);
    }

    private final void a2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26623, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.f75017b4.c();
        int iE0 = selectMainStyleC.e0();
        int iH = selectMainStyleC.H();
        boolean zJ0 = selectMainStyleC.j0();
        if (!com.max.mediaselector.lib.utils.s.c(iE0)) {
            iE0 = androidx.core.content.d.f(this, R.color.ps_color_grey);
        }
        if (!com.max.mediaselector.lib.utils.s.c(iH)) {
            iH = androidx.core.content.d.f(this, R.color.ps_color_grey);
        }
        ne.a.a(this, iE0, iH, zJ0);
    }

    private final void h2(ArrayList<LocalMedia> arrayList, int i10) {
        if (PatchProxy.proxy(new Object[]{arrayList, new Integer(i10)}, this, changeQuickRedirect, false, 26619, new Class[]{ArrayList.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        for (LocalMedia localMedia : arrayList) {
            if (com.max.mediaselector.lib.config.f.i(localMedia.A()) || com.max.mediaselector.lib.config.f.f(localMedia.A())) {
                com.max.hbutils.utils.c.f("当前只支持编辑静态图片");
                return;
            }
        }
        com.max.xiaoheihe.module.bbs.adapter.l.a aVar = com.max.xiaoheihe.module.bbs.adapter.l.f80533a;
        Activity mContext = this.f66601b;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        Activity mContext2 = this.f66601b;
        kotlin.jvm.internal.f0.o(mContext2, "mContext");
        aVar.a(mContext, mContext2, null, arrayList, null, i10);
    }

    private final void i2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26620, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PictureSelectionConfig.a();
        com.max.mediaselector.lib.basic.m mVarE = com.max.mediaselector.e.e(this, this.Y, true, this.f79949c0, false);
        if (this.Z) {
            mVarE.M(new i());
        }
        mVarE.N(new j());
        mVarE.d0(new k());
        PictureSelectionConfig.f75020e4 = new l();
        this.X = com.max.mediaselector.lib.basic.m.f74958c;
    }

    @dl.e
    public final String Y1() {
        return this.f79947a0;
    }

    @dl.e
    public final String Z1() {
        return this.f79948b0;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@dl.e Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 26626, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.attachBaseContext(com.max.mediaselector.lib.basic.i.a(context, PictureSelectionConfig.c().C));
    }

    public final void b2() {
        PictureSelectionConfig pictureSelectionConfigC;
        int i10;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26624, new Class[0], Void.TYPE).isSupported || (i10 = (pictureSelectionConfigC = PictureSelectionConfig.c()).C) == -2 || pictureSelectionConfigC.f75031c) {
            return;
        }
        pe.c.e(this, i10);
    }

    public final void c2(@dl.e ArrayList<Uri> arrayList, @dl.e ArrayList<Draft> arrayList2, @dl.e String str, @dl.e boolean[] zArr) {
        if (PatchProxy.proxy(new Object[]{arrayList, arrayList2, str, zArr}, this, changeQuickRedirect, false, 26628, new Class[]{ArrayList.class, ArrayList.class, String.class, boolean[].class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("HEYBOX_UCROP.Multi_OutputUri", arrayList);
        intent.putExtra(UCrop.EXTRA_MULTI_DRAFT, arrayList2);
        intent.putExtra(UCrop.EXTRA_MULTI_HAS_EDITED_FLAG, zArr);
        if (str != null) {
            intent.putExtra(UCropPlusActivity.ARG_EXTRA, str);
        }
        setResult(-1, intent);
        finish();
    }

    public final void e2(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 26622, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || this.W == z10) {
            return;
        }
        this.W = z10;
        ValueAnimator valueAnimatorOfFloat = z10 ? ValueAnimator.ofFloat(54.0f, 0.0f) : ValueAnimator.ofFloat(0.0f, 54.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new h());
        valueAnimatorOfFloat.start();
    }

    public final void f2(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 26621, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String str = "已选 " + i10 + IOUtils.DIR_SEPARATOR_UNIX + this.Y;
        TextView textView = this.O;
        if (textView == null) {
            kotlin.jvm.internal.f0.S("tv_select");
            textView = null;
        }
        textView.setText(str);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        Integer num;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26618, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_image_module_list);
        String strN0 = com.max.xiaoheihe.utils.d.n0(R.string.photo_album);
        kotlin.jvm.internal.f0.o(strN0, "getString(R.string.photo_album)");
        String strN1 = com.max.xiaoheihe.utils.d.n0(R.string.game_screen_shot);
        kotlin.jvm.internal.f0.o(strN1, "getString(R.string.game_screen_shot)");
        this.T = new String[]{strN0, strN1};
        Intent intent = getIntent();
        ViewPager2 viewPager2 = null;
        this.Z = com.max.hbcommon.utils.c.x(intent != null ? intent.getStringExtra(G2) : null);
        Intent intent2 = getIntent();
        this.Y = intent2 != null ? intent2.getIntExtra(f79944x2, 9) : 9;
        Intent intent3 = getIntent();
        this.f79949c0 = intent3 != null && intent3.getBooleanExtra(f79946y2, this.f79949c0);
        Intent intent4 = getIntent();
        this.f79947a0 = intent4 != null ? intent4.getStringExtra(UCropPlusActivity.ARG_SOURCE_PATH) : null;
        Intent intent5 = getIntent();
        this.f79948b0 = intent5 != null ? intent5.getStringExtra(UCropPlusActivity.ARG_SOURCE_PATH_ADDITIONAL) : null;
        Intent intent6 = getIntent();
        this.f79950p1 = intent6 != null ? Integer.valueOf(intent6.getIntExtra(f79942p3, 1)) : null;
        View viewFindViewById = findViewById(R.id.vp2);
        kotlin.jvm.internal.f0.o(viewFindViewById, "findViewById(R.id.vp2)");
        this.L = (ViewPager2) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.tab);
        kotlin.jvm.internal.f0.o(viewFindViewById2, "findViewById(R.id.tab)");
        this.M = (TabLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.vg_select);
        kotlin.jvm.internal.f0.o(viewFindViewById3, "findViewById(R.id.vg_select)");
        this.N = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.tv_select);
        kotlin.jvm.internal.f0.o(viewFindViewById4, "findViewById(R.id.tv_select)");
        this.O = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.ll_select_click_area);
        kotlin.jvm.internal.f0.o(viewFindViewById5, "findViewById(R.id.ll_select_click_area)");
        this.R = (LinearLayout) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.tv_selected_original);
        kotlin.jvm.internal.f0.o(viewFindViewById6, "findViewById(R.id.tv_selected_original)");
        this.S = (MediumBoldTextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.tv_next);
        kotlin.jvm.internal.f0.o(viewFindViewById7, "findViewById(R.id.tv_next)");
        this.P = (TextView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.tv_edit);
        kotlin.jvm.internal.f0.o(viewFindViewById8, "findViewById(R.id.tv_edit)");
        this.Q = (TextView) viewFindViewById8;
        com.max.hbutils.utils.t.M(this, false);
        com.max.hbutils.utils.t.Y(this, null);
        a2();
        i2();
        ViewPager2 viewPager3 = this.L;
        if (viewPager3 == null) {
            kotlin.jvm.internal.f0.S("vp2");
            viewPager3 = null;
        }
        String[] strArr = this.T;
        if (strArr == null) {
            kotlin.jvm.internal.f0.S("mTabTitleList");
            strArr = null;
        }
        viewPager3.setOffscreenPageLimit(strArr.length);
        LinearLayout linearLayout = this.R;
        if (linearLayout == null) {
            kotlin.jvm.internal.f0.S("ll_select_click_area");
            linearLayout = null;
        }
        linearLayout.setOnClickListener(new b());
        TextView textView = this.P;
        if (textView == null) {
            kotlin.jvm.internal.f0.S("tv_next");
            textView = null;
        }
        textView.setOnClickListener(new c());
        if (this.Z) {
            TextView textView2 = this.Q;
            if (textView2 == null) {
                kotlin.jvm.internal.f0.S("tv_edit");
                textView2 = null;
            }
            textView2.setVisibility(8);
        } else {
            TextView textView3 = this.Q;
            if (textView3 == null) {
                kotlin.jvm.internal.f0.S("tv_edit");
                textView3 = null;
            }
            textView3.setVisibility(0);
            TextView textView4 = this.Q;
            if (textView4 == null) {
                kotlin.jvm.internal.f0.S("tv_edit");
                textView4 = null;
            }
            textView4.setOnClickListener(new d());
        }
        ViewGroup viewGroup = this.N;
        if (viewGroup == null) {
            kotlin.jvm.internal.f0.S("vg_select");
            viewGroup = null;
        }
        viewGroup.setOnClickListener(e.f79954b);
        ViewPager2 viewPager4 = this.L;
        if (viewPager4 == null) {
            kotlin.jvm.internal.f0.S("vp2");
            viewPager4 = null;
        }
        viewPager4.setAdapter(new f());
        ViewPager2 viewPager5 = this.L;
        if (viewPager5 == null) {
            kotlin.jvm.internal.f0.S("vp2");
            viewPager5 = null;
        }
        viewPager5.setUserInputEnabled(false);
        TabLayout tabLayout = this.M;
        if (tabLayout == null) {
            kotlin.jvm.internal.f0.S("tabLayout");
            tabLayout = null;
        }
        ViewPager2 viewPager6 = this.L;
        if (viewPager6 == null) {
            kotlin.jvm.internal.f0.S("vp2");
            viewPager6 = null;
        }
        new com.google.android.material.tabs.d(tabLayout, viewPager6, new g()).a();
        Integer num2 = this.f79950p1;
        if (num2 != null && num2.intValue() == 3) {
            ViewPager2 viewPager7 = this.L;
            if (viewPager7 == null) {
                kotlin.jvm.internal.f0.S("vp2");
            } else {
                viewPager2 = viewPager7;
            }
            viewPager2.setCurrentItem(0, false);
            return;
        }
        if (!((com.max.xiaoheihe.utils.i0.s() && !com.max.hbcommon.utils.c.u(com.max.xiaoheihe.utils.i0.m())) && com.max.hbcommon.utils.c.x(com.max.hbcache.c.o(com.max.hbcache.c.f66151u0, "1"))) && ((num = this.f79950p1) == null || num.intValue() != 2)) {
            return;
        }
        com.max.hbcache.c.C(com.max.hbcache.c.f66151u0, "0");
        ViewPager2 viewPager8 = this.L;
        if (viewPager8 == null) {
            kotlin.jvm.internal.f0.S("vp2");
        } else {
            viewPager2 = viewPager8;
        }
        viewPager2.setCurrentItem(1, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        ArrayList<Draft> arrayList;
        String stringExtra;
        boolean[] booleanArrayExtra;
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26627, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 69 && i11 == -1) {
            ArrayList<Uri> parcelableArrayListExtra = null;
            if (intent != null) {
                parcelableArrayListExtra = intent.getParcelableArrayListExtra("HEYBOX_UCROP.Multi_OutputUri");
                arrayList = (ArrayList) intent.getSerializableExtra(UCrop.EXTRA_MULTI_DRAFT);
                stringExtra = intent.getStringExtra(UCropPlusActivity.ARG_EXTRA);
                booleanArrayExtra = intent.getBooleanArrayExtra(UCrop.EXTRA_MULTI_HAS_EDITED_FLAG);
            } else {
                arrayList = null;
                stringExtra = null;
                booleanArrayExtra = null;
            }
            c2(parcelableArrayListExtra, arrayList, stringExtra, booleanArrayExtra);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26630, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setResult(-1, new Intent());
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@dl.d Configuration newConfig) {
        if (PatchProxy.proxy(new Object[]{newConfig}, this, changeQuickRedirect, false, 26625, new Class[]{Configuration.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        b2();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26631, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        PictureSelectionConfig.a();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26629, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        long j10 = this.X;
        if (j10 <= 0 || j10 == com.max.mediaselector.lib.basic.m.f74958c) {
            return;
        }
        com.max.mediaselector.lib.c cVar = this.U;
        if (cVar != null && cVar.isAdded()) {
            com.max.mediaselector.lib.c cVar2 = this.U;
            if (cVar2 != null && cVar2.L0()) {
                z10 = true;
            }
            if (z10) {
                i2();
                com.max.mediaselector.lib.c cVar3 = this.U;
                if (cVar3 != null) {
                    cVar3.j6();
                }
            }
        }
    }
}
