package com.max.xiaoheihe.module.news;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbshare.bean.HBShareData;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.news.NewsSubjectObj;
import com.max.xiaoheihe.bean.news.SubjectComponentObj;
import com.max.xiaoheihe.bean.news.SubjectDetailResultOjb;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.module.webview.u;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class SubjectDetailActivity extends BaseActivity {
    private static final String P = "news_subject";
    private static final String Q = "news_subject_id";
    public static ChangeQuickRedirect changeQuickRedirect;
    private NewsSubjectObj L;
    private String M;
    private ArrayList<Fragment> N = new ArrayList<>();
    private UMShareListener O = new d();

    @BindView(R.id.tab)
    SlidingTabLayout tabSubject;

    @BindView(R.id.vp)
    ViewPager vpComponent;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42527, new Class[]{View.class}, Void.TYPE).isSupported || SubjectDetailActivity.this.L == null) {
                return;
            }
            com.max.hbshare.d.E(((BaseActivity) SubjectDetailActivity.this).f66601b, new HBShareData(false, true, SubjectDetailActivity.this.L.getInner_title(), SubjectDetailActivity.this.L.getDescription(), SubjectDetailActivity.this.L.getShare_url(), null, !com.max.hbcommon.utils.c.u(SubjectDetailActivity.this.L.getInner_img()) ? new UMImage(((BaseActivity) SubjectDetailActivity.this).f66601b, SubjectDetailActivity.this.L.getInner_img()) : new UMImage(((BaseActivity) SubjectDetailActivity.this).f66601b, R.drawable.share_thumbnail), SubjectDetailActivity.this.O));
        }
    }

    public class b extends com.max.hbcommon.network.d<Result<SubjectDetailResultOjb>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 42528, new Class[]{Throwable.class}, Void.TYPE).isSupported && SubjectDetailActivity.this.isActive()) {
                super.onError(th2);
                th2.printStackTrace();
                SubjectDetailActivity.V1(SubjectDetailActivity.this);
            }
        }

        public void onNext(Result<SubjectDetailResultOjb> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42529, new Class[]{Result.class}, Void.TYPE).isSupported && SubjectDetailActivity.this.isActive()) {
                SubjectDetailActivity.W1(SubjectDetailActivity.this);
                SubjectDetailActivity.this.L = result.getResult().getNews_topic();
                SubjectDetailActivity.X1(SubjectDetailActivity.this);
                SubjectDetailActivity.Y1(SubjectDetailActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42530, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SubjectDetailResultOjb>) obj);
        }
    }

    public class c extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        c(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42532, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : SubjectDetailActivity.this.N.size();
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 42531, new Class[]{Integer.TYPE}, Fragment.class);
            return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : (Fragment) SubjectDetailActivity.this.N.get(i10);
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
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 42534, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(SubjectDetailActivity.this.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 42533, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(SubjectDetailActivity.this.getString(R.string.share_success));
            com.max.hbshare.d.F(SubjectDetailActivity.this.S0(), null, "normal", null, null);
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
        }
    }

    static /* synthetic */ void V1(SubjectDetailActivity subjectDetailActivity) {
        if (PatchProxy.proxy(new Object[]{subjectDetailActivity}, null, changeQuickRedirect, true, 42523, new Class[]{SubjectDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        subjectDetailActivity.C1();
    }

    static /* synthetic */ void W1(SubjectDetailActivity subjectDetailActivity) {
        if (PatchProxy.proxy(new Object[]{subjectDetailActivity}, null, changeQuickRedirect, true, 42524, new Class[]{SubjectDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        subjectDetailActivity.x1();
    }

    static /* synthetic */ void X1(SubjectDetailActivity subjectDetailActivity) {
        if (PatchProxy.proxy(new Object[]{subjectDetailActivity}, null, changeQuickRedirect, true, 42525, new Class[]{SubjectDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        subjectDetailActivity.e2();
    }

    static /* synthetic */ void Y1(SubjectDetailActivity subjectDetailActivity) {
        if (PatchProxy.proxy(new Object[]{subjectDetailActivity}, null, changeQuickRedirect, true, 42526, new Class[]{SubjectDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        subjectDetailActivity.f2();
    }

    public static Intent a2(Context context, NewsSubjectObj newsSubjectObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, newsSubjectObj}, null, changeQuickRedirect, true, 42515, new Class[]{Context.class, NewsSubjectObj.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) SubjectDetailActivity.class);
        intent.putExtra(P, newsSubjectObj);
        return intent;
    }

    public static Intent b2(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 42516, new Class[]{Context.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) SubjectDetailActivity.class);
        intent.putExtra(Q, str);
        return intent;
    }

    private void c2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42519, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) i.a().aa(this.M, null, 0, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private void e2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42521, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.N.clear();
        if (!com.max.hbcommon.utils.c.w(this.L.getComponents())) {
            String[] strArr = new String[this.L.getComponents().size()];
            for (SubjectComponentObj subjectComponentObj : this.L.getComponents()) {
                if ("web".equals(subjectComponentObj.getType())) {
                    WebviewFragment webviewFragmentA = new u(subjectComponentObj.getWebview().getUrl()).p(WebviewFragment.U4).u(true).a();
                    webviewFragmentA.P7(true);
                    this.N.add(webviewFragmentA);
                } else {
                    if (com.max.hbcommon.utils.c.u(this.L.getClick()) && !com.max.hbcommon.utils.c.u(subjectComponentObj.getParams().getClick())) {
                        this.L.setClick(subjectComponentObj.getParams().getClick());
                    }
                    if (com.max.hbcommon.utils.c.u(this.L.getId()) && !com.max.hbcommon.utils.c.u(subjectComponentObj.getParams().getId())) {
                        this.L.setId(subjectComponentObj.getParams().getId());
                    }
                    if (com.max.hbcommon.utils.c.u(this.L.getInner_img()) && !com.max.hbcommon.utils.c.u(subjectComponentObj.getParams().getInner_img())) {
                        this.L.setInner_img(subjectComponentObj.getParams().getInner_img());
                    }
                    if (com.max.hbcommon.utils.c.u(this.L.getInner_title()) && !com.max.hbcommon.utils.c.u(subjectComponentObj.getParams().getInner_title())) {
                        this.L.setInner_title(subjectComponentObj.getParams().getInner_title());
                    }
                    if (com.max.hbcommon.utils.c.u(this.L.getDescription()) && !com.max.hbcommon.utils.c.u(subjectComponentObj.getParams().getDescription())) {
                        this.L.setDescription(subjectComponentObj.getParams().getDescription());
                    }
                    if (com.max.hbcommon.utils.c.u(this.L.getNews_num()) && !com.max.hbcommon.utils.c.u(subjectComponentObj.getParams().getNews_num())) {
                        this.L.setNews_num(subjectComponentObj.getParams().getNews_num());
                    }
                    this.N.add(NewsSubjectFragment.U3(this.L));
                }
                strArr[this.L.getComponents().indexOf(subjectComponentObj)] = subjectComponentObj.getTitle();
            }
            this.vpComponent.setAdapter(new c(getSupportFragmentManager()));
            this.tabSubject.setViewPager(this.vpComponent, strArr);
        }
        if (this.N.size() > 1) {
            this.tabSubject.setVisibility(0);
        } else {
            this.tabSubject.setVisibility(8);
        }
    }

    private void f2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42518, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.setTitle(this.L.getInner_title());
        this.f66616q.setActionIcon(R.drawable.common_share);
        this.f66616q.setActionIconOnClickListener(new a());
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42517, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_vp_with_title);
        this.f66620u = ButterKnife.a(this);
        this.L = (NewsSubjectObj) getIntent().getSerializableExtra(P);
        this.M = getIntent().getStringExtra(Q);
        if (this.L != null) {
            e2();
            f2();
        } else {
            E1();
            c2();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42520, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        c2();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42522, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this.f66601b).onActivityResult(i10, i11, intent);
    }
}
