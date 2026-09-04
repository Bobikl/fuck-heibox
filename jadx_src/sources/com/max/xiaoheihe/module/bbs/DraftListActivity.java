package com.max.xiaoheihe.module.bbs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.bbs.BBSLinkListResultObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.GamesInfoResultObj;
import com.max.xiaoheihe.bean.bbs.HtmlLinkContentObj;
import com.max.xiaoheihe.bean.bbs.LinkDraftObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragment;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.utils.imageviewer.ImageViewerHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.umeng.analytics.MobclickAgent;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
@ig.d(path = {lb.d.Q1})
public class DraftListActivity extends BaseActivity {
    private static Pattern P = Pattern.compile("<max_tag_img> url=(.*?)</max_tag_img>");
    public static final int Q = 1000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private com.max.hbcommon.base.adapter.s<LinkDraftObj> M;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mSmartRefreshLayout;
    private List<LinkDraftObj> L = new ArrayList();
    private int N = 0;
    private long O = 0;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f79764b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f79765c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f79766d;

        a(ImageView imageView, int i10, String str) {
            this.f79764b = imageView;
            this.f79765c = i10;
            this.f79766d = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26216, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageViewerHelper.a(((BaseActivity) DraftListActivity.this).f66601b).m(ImageViewerHelper.d(this.f79764b, this.f79765c), this.f79766d.split(";")).d(this.f79765c).p();
        }
    }

    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 26215, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            DraftListActivity.N1(DraftListActivity.this);
        }
    }

    public class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public void f(@androidx.annotation.n0 ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 26217, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            DraftListActivity.R1(DraftListActivity.this, 30);
            DraftListActivity.c2(DraftListActivity.this);
        }
    }

    public class d extends com.max.hbcommon.base.adapter.s<LinkDraftObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ LinkDraftObj f79771b;

            a(LinkDraftObj linkDraftObj) {
                this.f79771b = linkDraftObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26220, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                JsonObject jsonObject = new JsonObject();
                if (DraftListActivity.this.getIntent() != null) {
                    String stringExtra = DraftListActivity.this.getIntent().getStringExtra("h_src");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    jsonObject.addProperty("h_src", stringExtra);
                }
                jsonObject.addProperty("post_type", this.f79771b.getPost_type() != null ? this.f79771b.getPost_type() : "");
                com.max.hbcommon.analytics.d.d("4", lb.d.S1, null, jsonObject);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - DraftListActivity.this.O > 1000) {
                    DraftListActivity.this.O = jCurrentTimeMillis;
                    if (this.f79771b.isSynced()) {
                        DraftListActivity.p2(DraftListActivity.this, this.f79771b);
                    } else {
                        DraftListActivity.q2(DraftListActivity.this, this.f79771b, null);
                    }
                }
            }
        }

        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ LinkDraftObj f79773b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.base.adapter.s.e f79774c;

            public class a implements DialogInterface.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                a() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 26222, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    dialogInterface.dismiss();
                }
            }

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.DraftListActivity$d$b$b, reason: collision with other inner class name */
            public class DialogInterfaceOnClickListenerC0667b implements DialogInterface.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                DialogInterfaceOnClickListenerC0667b() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 26223, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    androidx.localbroadcastmanager.content.a.b(((BaseActivity) DraftListActivity.this).f66601b).d(new Intent(lb.a.Z));
                    JsonObject jsonObject = new JsonObject();
                    if (DraftListActivity.this.getIntent() != null) {
                        String stringExtra = DraftListActivity.this.getIntent().getStringExtra("h_src");
                        if (stringExtra == null) {
                            stringExtra = "";
                        }
                        jsonObject.addProperty("h_src", stringExtra);
                    }
                    jsonObject.addProperty("post_type", b.this.f79773b.getPost_type() != null ? b.this.f79773b.getPost_type() : "");
                    com.max.hbcommon.analytics.d.d("4", lb.d.T1, null, jsonObject);
                    if (com.max.hbcommon.utils.c.u(b.this.f79773b.getLink_id())) {
                        com.max.xiaoheihe.module.bbs.utils.c.a(b.this.f79773b.getLocal_link_id());
                    } else {
                        com.max.xiaoheihe.module.bbs.utils.c.i(b.this.f79773b.getLink_id());
                    }
                    DraftListActivity.this.L.remove(b.this.f79773b);
                    b bVar = b.this;
                    d.this.notifyItemRemoved(bVar.f79774c.getAdapterPosition());
                    dialogInterface.dismiss();
                }
            }

            b(LinkDraftObj linkDraftObj, com.max.hbcommon.base.adapter.s.e eVar) {
                this.f79773b = linkDraftObj;
                this.f79774c = eVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26221, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                new com.max.hbcommon.view.a.f(((BaseActivity) DraftListActivity.this).f66601b).y(com.max.xiaoheihe.utils.d.n0(R.string.confirm_dlt)).u(((BaseActivity) DraftListActivity.this).f66601b.getResources().getString(R.string.confirm), new DialogInterfaceOnClickListenerC0667b()).o(((BaseActivity) DraftListActivity.this).f66601b.getResources().getString(R.string.cancel), new a()).F();
            }
        }

        d(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, LinkDraftObj linkDraftObj) {
            List<String> imgs;
            if (PatchProxy.proxy(new Object[]{eVar, linkDraftObj}, this, changeQuickRedirect, false, 26218, new Class[]{com.max.hbcommon.base.adapter.s.e.class, LinkDraftObj.class}, Void.TYPE).isSupported) {
                return;
            }
            View viewI = eVar.i(R.id.cv_link);
            TextView textView = (TextView) eVar.i(R.id.tv_del);
            TextView textView2 = (TextView) eVar.i(R.id.tv_type);
            TextView textView3 = (TextView) eVar.i(R.id.tv_edit_time);
            TextView textView4 = (TextView) eVar.i(R.id.tv_title);
            ExpressionTextView expressionTextView = (ExpressionTextView) eVar.i(R.id.tv_content);
            View viewI2 = eVar.i(R.id.ll_img);
            ImageView imageView = (ImageView) eVar.i(R.id.iv_img0);
            ImageView imageView2 = (ImageView) eVar.i(R.id.iv_img1);
            ImageView imageView3 = (ImageView) eVar.i(R.id.iv_img2);
            View viewI3 = eVar.i(R.id.vg_img2);
            TextView textView5 = (TextView) eVar.i(R.id.tv_img_cnt);
            String strN0 = com.max.xiaoheihe.utils.d.n0(R.string.links_or_timelines);
            if ("1".equals(linkDraftObj.getIs_article())) {
                strN0 = com.max.xiaoheihe.utils.d.n0(R.string.contribute_post);
            }
            textView2.setText(strN0);
            textView3.setText(com.max.xiaoheihe.utils.d.n0(R.string.last_edit) + " " + com.max.hbutils.utils.w.p(((BaseActivity) DraftListActivity.this).f66601b, com.max.hbutils.utils.n.r(linkDraftObj.getCreat_time()) / 1000));
            if (com.max.hbcommon.utils.c.u(linkDraftObj.getTitle())) {
                textView4.setVisibility(8);
            } else {
                textView4.setVisibility(0);
                textView4.setText(linkDraftObj.getTitle());
            }
            if ("native".equals(linkDraftObj.getType())) {
                BBSLinkObj bBSLinkObj = new BBSLinkObj();
                DraftListActivity.k2(DraftListActivity.this, bBSLinkObj, linkDraftObj.getContent());
                expressionTextView.setText(bBSLinkObj.getDescription());
                imgs = bBSLinkObj.getImgs();
            } else {
                HtmlLinkContentObj htmlLinkContentObj = (HtmlLinkContentObj) com.max.hbutils.utils.k.a(linkDraftObj.getContent(), HtmlLinkContentObj.class);
                expressionTextView.setText(htmlLinkContentObj.getDesc());
                ArrayList arrayList = new ArrayList();
                if (!com.max.hbcommon.utils.c.w(htmlLinkContentObj.getImgs())) {
                    Iterator<BBSTextObj> it = htmlLinkContentObj.getImgs().iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getUrl());
                    }
                }
                imgs = arrayList;
            }
            String str = "";
            if (imgs != null) {
                for (int i10 = 0; i10 < imgs.size(); i10++) {
                    str = str + imgs.get(i10) + ";";
                }
            }
            if (imgs == null || imgs.size() <= 0) {
                viewI2.setVisibility(8);
            } else {
                int size = imgs.size();
                viewI2.setVisibility(0);
                DraftListActivity.this.C2(imgs.get(0), imageView, str, 0, R.id.iv_img0);
                if (size > 1) {
                    imageView2.setVisibility(0);
                    DraftListActivity.this.C2(imgs.get(1), imageView2, str, 1, R.id.iv_img1);
                    if (size > 2) {
                        viewI3.setVisibility(0);
                        DraftListActivity.this.C2(imgs.get(2), imageView3, str, 2, R.id.iv_img2);
                        if (size > 3) {
                            textView5.setVisibility(0);
                            if (size > 10) {
                                textView5.setText(((BaseActivity) DraftListActivity.this).f66601b.getResources().getString(R.string.more_than_ten_images));
                            } else {
                                textView5.setText(String.format(((BaseActivity) DraftListActivity.this).f66601b.getResources().getString(R.string.img_count_format), size + ""));
                            }
                        } else {
                            textView5.setVisibility(8);
                        }
                    } else {
                        viewI3.setVisibility(8);
                    }
                } else {
                    imageView2.setVisibility(8);
                    viewI3.setVisibility(8);
                }
            }
            eVar.p(R.id.tv_title, linkDraftObj.getTitle());
            viewI.setOnClickListener(new a(linkDraftObj));
            textView.setOnClickListener(new b(linkDraftObj, eVar));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, LinkDraftObj linkDraftObj) {
            if (PatchProxy.proxy(new Object[]{eVar, linkDraftObj}, this, changeQuickRedirect, false, 26219, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, linkDraftObj);
        }
    }

    public class e extends com.max.hbcommon.network.d<Result<GamesInfoResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkDraftObj f79778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Result f79779c;

        e(LinkDraftObj linkDraftObj, Result result) {
            this.f79778b = linkDraftObj;
            this.f79779c = result;
        }

        public void onNext(Result<GamesInfoResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26224, new Class[]{Result.class}, Void.TYPE).isSupported && DraftListActivity.this.isActive()) {
                if ("1".equals(this.f79778b.getIs_article())) {
                    com.max.xiaoheihe.base.router.b.i(((BaseActivity) DraftListActivity.this).f66601b, this.f79779c, com.max.hbutils.utils.k.p(result.getResult().getBase_infos())).U("source", "draft_box").A();
                } else {
                    com.max.xiaoheihe.base.router.b.j(((BaseActivity) DraftListActivity.this).f66601b, this.f79779c, com.max.hbutils.utils.k.p(result.getResult().getBase_infos())).U("source", "draft_box").A();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26225, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GamesInfoResultObj>) obj);
        }
    }

    public class f extends com.max.hbcommon.network.d<Result<GamesInfoResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkDraftObj f79781b;

        f(LinkDraftObj linkDraftObj) {
            this.f79781b = linkDraftObj;
        }

        public void onNext(Result<GamesInfoResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26226, new Class[]{Result.class}, Void.TYPE).isSupported && DraftListActivity.this.isActive()) {
                if ("21".equals(this.f79781b.getLink_tag())) {
                    com.max.xiaoheihe.base.router.b.s(((BaseActivity) DraftListActivity.this).f66601b, this.f79781b, com.max.hbutils.utils.k.p(result.getResult().getBase_infos())).A();
                } else if ("3".equals(this.f79781b.getPost_type())) {
                    com.max.xiaoheihe.base.router.b.c(((BaseActivity) DraftListActivity.this).f66601b, this.f79781b, com.max.hbutils.utils.k.p(result.getResult().getBase_infos())).A();
                } else {
                    com.max.xiaoheihe.base.router.b.o(((BaseActivity) DraftListActivity.this).f66601b, this.f79781b, com.max.hbutils.utils.k.p(result.getResult().getBase_infos())).A();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26227, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GamesInfoResultObj>) obj);
        }
    }

    public class g extends com.max.hbcommon.network.d<Result<BBSLinkListResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26229, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            DraftListActivity.this.mSmartRefreshLayout.A(0);
            DraftListActivity.this.mSmartRefreshLayout.p(0);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26228, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            DraftListActivity.e2(DraftListActivity.this);
            DraftListActivity.this.mSmartRefreshLayout.A(0);
            DraftListActivity.this.mSmartRefreshLayout.p(0);
        }

        public void onNext(Result<BBSLinkListResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26230, new Class[]{Result.class}, Void.TYPE).isSupported && DraftListActivity.this.isActive()) {
                DraftListActivity.this.L.addAll(DraftListActivity.f2(DraftListActivity.this, result.getResult().getLinks()));
                DraftListActivity.h2(DraftListActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26231, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSLinkListResultObj>) obj);
        }
    }

    public class h extends com.max.hbcommon.network.d<List<LinkDraftObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        public void a(List<LinkDraftObj> list) {
            if (!PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 26233, new Class[]{List.class}, Void.TYPE).isSupported && DraftListActivity.this.isActive()) {
                DraftListActivity.this.L.addAll(list);
                DraftListActivity.c2(DraftListActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26232, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            DraftListActivity.c2(DraftListActivity.this);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26234, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((List) obj);
        }
    }

    public class i extends com.max.hbcommon.network.d<Result<BBSLinkTreeObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkDraftObj f79785b;

        i(LinkDraftObj linkDraftObj) {
            this.f79785b = linkDraftObj;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26235, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            if (th2 != null && th2.getMessage() != null) {
                super.onError(th2);
            } else {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f("请求失败，请重试");
            }
        }

        public void onNext(Result<BBSLinkTreeObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26236, new Class[]{Result.class}, Void.TYPE).isSupported || !DraftListActivity.this.isActive() || result.getResult() == null) {
                return;
            }
            DraftListActivity.q2(DraftListActivity.this, this.f79785b, result);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26237, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSLinkTreeObj>) obj);
        }
    }

    public class j implements Comparator<LinkDraftObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        public int a(LinkDraftObj linkDraftObj, LinkDraftObj linkDraftObj2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{linkDraftObj, linkDraftObj2}, this, changeQuickRedirect, false, 26238, new Class[]{LinkDraftObj.class, LinkDraftObj.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            try {
                if (Long.parseLong(linkDraftObj.getCreat_time()) < Long.parseLong(linkDraftObj2.getCreat_time())) {
                    return 1;
                }
                return Long.parseLong(linkDraftObj.getCreat_time()) == Long.parseLong(linkDraftObj2.getCreat_time()) ? 0 : -1;
            } catch (Exception e10) {
                e10.printStackTrace();
                return 0;
            }
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(LinkDraftObj linkDraftObj, LinkDraftObj linkDraftObj2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{linkDraftObj, linkDraftObj2}, this, changeQuickRedirect, false, 26239, new Class[]{Object.class, Object.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : a(linkDraftObj, linkDraftObj2);
        }
    }

    private String A2(List<String> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 26202, new Class[]{List.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            arrayList.addAll(list);
        }
        return com.max.hbutils.utils.k.r(arrayList);
    }

    private void B2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26199, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().P8(this.N, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    private void D2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26204, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        List<LinkDraftObj> list = this.L;
        if (list != null) {
            Collections.sort(list, new j());
            this.M.notifyDataSetChanged();
        }
        if (com.max.hbcommon.utils.c.w(this.L)) {
            A1(R.drawable.common_tag_common_45x45, R.string.no_draft);
        } else {
            x1();
        }
    }

    private void M1(BBSLinkObj bBSLinkObj, String str) {
        if (PatchProxy.proxy(new Object[]{bBSLinkObj, str}, this, changeQuickRedirect, false, 26205, new Class[]{BBSLinkObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        String strReplaceAll = str.replaceAll("\n<max_tag_img>", "<max_tag_img>").replaceAll("</max_tag_img>\n", "</max_tag_img>");
        while (strReplaceAll.contains("<max_tag_")) {
            String str2 = "</max_tag_";
            if (!strReplaceAll.contains("</max_tag_")) {
                break;
            }
            int iIndexOf = strReplaceAll.indexOf("<max_tag_");
            int iIndexOf2 = strReplaceAll.indexOf("</max_tag_");
            if (iIndexOf < 0 || iIndexOf2 < 0) {
                MobclickAgent.reportError(HeyBoxApplication.C(), strReplaceAll);
                break;
            }
            String strSubstring = strReplaceAll.substring(iIndexOf, iIndexOf2);
            if (strSubstring.contains("<max_tag_img>")) {
                str2 = "</max_tag_img>";
            } else if (strSubstring.contains("<max_tag_video>")) {
                str2 = "</max_tag_video>";
            } else if (strSubstring.contains("<max_tag_url>")) {
                str2 = "</max_tag_url>";
            } else if (strSubstring.contains("<max_tag_game>")) {
                str2 = "</max_tag_game>";
            }
            String strSubstring2 = strReplaceAll.substring(iIndexOf, str2.length() + iIndexOf2);
            if (iIndexOf > 0) {
                sb2.append(strReplaceAll.substring(0, iIndexOf));
            }
            if (strSubstring2.contains("<max_tag_img>") && strSubstring2.contains("</max_tag_img>")) {
                Matcher matcher = P.matcher(strSubstring2);
                if (matcher.find()) {
                    arrayList.add(matcher.group(1));
                }
            }
            strReplaceAll = strReplaceAll.substring(iIndexOf2 + str2.length());
        }
        sb2.append(strReplaceAll);
        bBSLinkObj.setDescription(sb2.toString());
        if (com.max.hbcommon.utils.c.w(arrayList)) {
            return;
        }
        bBSLinkObj.setImgs(arrayList);
    }

    static /* synthetic */ void N1(DraftListActivity draftListActivity) {
        if (PatchProxy.proxy(new Object[]{draftListActivity}, null, changeQuickRedirect, true, 26207, new Class[]{DraftListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        draftListActivity.x2();
    }

    static /* synthetic */ int R1(DraftListActivity draftListActivity, int i10) {
        int i11 = draftListActivity.N + i10;
        draftListActivity.N = i11;
        return i11;
    }

    static /* synthetic */ void c2(DraftListActivity draftListActivity) {
        if (PatchProxy.proxy(new Object[]{draftListActivity}, null, changeQuickRedirect, true, 26208, new Class[]{DraftListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        draftListActivity.B2();
    }

    static /* synthetic */ void e2(DraftListActivity draftListActivity) {
        if (PatchProxy.proxy(new Object[]{draftListActivity}, null, changeQuickRedirect, true, 26212, new Class[]{DraftListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        draftListActivity.C1();
    }

    static /* synthetic */ List f2(DraftListActivity draftListActivity, List list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{draftListActivity, list}, null, changeQuickRedirect, true, 26213, new Class[]{DraftListActivity.class, List.class}, List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : draftListActivity.r2(list);
    }

    static /* synthetic */ void h2(DraftListActivity draftListActivity) {
        if (PatchProxy.proxy(new Object[]{draftListActivity}, null, changeQuickRedirect, true, 26214, new Class[]{DraftListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        draftListActivity.D2();
    }

    static /* synthetic */ void k2(DraftListActivity draftListActivity, BBSLinkObj bBSLinkObj, String str) {
        if (PatchProxy.proxy(new Object[]{draftListActivity, bBSLinkObj, str}, null, changeQuickRedirect, true, 26209, new Class[]{DraftListActivity.class, BBSLinkObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        draftListActivity.M1(bBSLinkObj, str);
    }

    static /* synthetic */ void p2(DraftListActivity draftListActivity, LinkDraftObj linkDraftObj) {
        if (PatchProxy.proxy(new Object[]{draftListActivity, linkDraftObj}, null, changeQuickRedirect, true, 26210, new Class[]{DraftListActivity.class, LinkDraftObj.class}, Void.TYPE).isSupported) {
            return;
        }
        draftListActivity.v2(linkDraftObj);
    }

    static /* synthetic */ void q2(DraftListActivity draftListActivity, LinkDraftObj linkDraftObj, Result result) {
        if (PatchProxy.proxy(new Object[]{draftListActivity, linkDraftObj, result}, null, changeQuickRedirect, true, 26211, new Class[]{DraftListActivity.class, LinkDraftObj.class, Result.class}, Void.TYPE).isSupported) {
            return;
        }
        draftListActivity.u2(linkDraftObj, result);
    }

    private List<LinkDraftObj> r2(List<BBSLinkObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 26198, new Class[]{List.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        for (BBSLinkObj bBSLinkObj : list) {
            LinkDraftObj linkDraftObj = new LinkDraftObj(bBSLinkObj.getCreate_at(), LinkDraftObj.DRAFT_TYPE_HTML);
            linkDraftObj.setSynced(true);
            linkDraftObj.setLink_id(bBSLinkObj.getLinkid());
            linkDraftObj.setLink_tag(bBSLinkObj.getLink_tag());
            linkDraftObj.setPost_type(bBSLinkObj.getPost_type());
            linkDraftObj.setIs_article(bBSLinkObj.getIs_article());
            linkDraftObj.setCreat_time(String.valueOf(com.max.hbutils.utils.n.r(bBSLinkObj.getCreate_at()) * 1000));
            HtmlLinkContentObj htmlLinkContentObj = new HtmlLinkContentObj();
            htmlLinkContentObj.setDesc(bBSLinkObj.getDescription());
            ArrayList arrayList2 = new ArrayList();
            for (String str : bBSLinkObj.getImgs()) {
                BBSTextObj bBSTextObj = new BBSTextObj();
                bBSTextObj.setUrl(str);
                arrayList2.add(bBSTextObj);
            }
            htmlLinkContentObj.setImgs(arrayList2);
            htmlLinkContentObj.setTitle(bBSLinkObj.getTitle());
            linkDraftObj.setContent(com.max.hbutils.utils.k.p(htmlLinkContentObj));
            if (bBSLinkObj.getTitle() != null) {
                linkDraftObj.setTitle(bBSLinkObj.getTitle());
            }
            arrayList.add(linkDraftObj);
        }
        return arrayList;
    }

    @SuppressLint({"AutoDispose"})
    private void u2(LinkDraftObj linkDraftObj, Result<BBSLinkTreeObj> result) {
        if (PatchProxy.proxy(new Object[]{linkDraftObj, result}, this, changeQuickRedirect, false, 26195, new Class[]{LinkDraftObj.class, Result.class}, Void.TYPE).isSupported) {
            return;
        }
        if (result == null) {
            if ("native".equals(linkDraftObj.getType())) {
                if ("21".equals(linkDraftObj.getLink_tag())) {
                    com.max.xiaoheihe.base.router.b.t(this.f66601b, linkDraftObj, null, null).U("source", "draft_box").A();
                    return;
                } else if ("3".equals(linkDraftObj.getPost_type())) {
                    com.max.xiaoheihe.base.router.b.d(this.f66601b, linkDraftObj, null, null, null, null).U("source", "draft_box").A();
                    return;
                } else {
                    com.max.xiaoheihe.base.router.b.n(this.f66601b, linkDraftObj).U("source", "draft_box").A();
                    return;
                }
            }
            HtmlLinkContentObj htmlLinkContentObj = (HtmlLinkContentObj) com.max.hbutils.utils.k.a(linkDraftObj.getContent(), HtmlLinkContentObj.class);
            StringBuilder sb2 = new StringBuilder();
            Matcher matcher = NewLinkEditFragment.L4.e().matcher(htmlLinkContentObj.getContent());
            while (matcher.find()) {
                matcher.group(1);
                if (sb2.length() > 0) {
                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb2.append(matcher.group(1));
            }
            if (!com.max.hbcommon.utils.c.u(sb2.toString())) {
                y2(linkDraftObj, sb2.toString());
                return;
            }
            if ("21".equals(linkDraftObj.getLink_tag())) {
                com.max.xiaoheihe.base.router.b.s(this.f66601b, linkDraftObj, null).U("source", "draft_box").A();
                return;
            } else if ("3".equals(linkDraftObj.getPost_type())) {
                com.max.xiaoheihe.base.router.b.c(this.f66601b, linkDraftObj, null).U("source", "draft_box").A();
                return;
            } else {
                com.max.xiaoheihe.base.router.b.o(this.f66601b, linkDraftObj, null).U("source", "draft_box").A();
                return;
            }
        }
        if (result.getResult().getLink() == null) {
            return;
        }
        LinkInfoObj link = result.getResult().getLink();
        if ("1".equals(link.getLink_tag()) && com.max.hbcommon.utils.c.x(link.getHas_video())) {
            com.max.xiaoheihe.module.bbs.utils.c.f(this.f66601b, V0(), link, false, PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_VIDEO, link.getTopics());
            return;
        }
        if ("27".equals(link.getLink_tag()) || "28".equals(link.getLink_tag())) {
            com.max.xiaoheihe.module.bbs.utils.c.f(this.f66601b, V0(), link, false, PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_PICTURE, link.getTopics());
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        List listB = com.max.hbutils.utils.k.b(link.getText(), BBSTextObj.class);
        if (!com.max.hbcommon.utils.c.w(listB) && ((BBSTextObj) listB.get(0)).getType().equals(LinkDraftObj.DRAFT_TYPE_HTML)) {
            Matcher matcher2 = NewLinkEditFragment.L4.e().matcher(((BBSTextObj) listB.get(0)).getText());
            while (matcher2.find()) {
                if (sb3.length() > 0) {
                    sb3.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb3.append(matcher2.group(1));
            }
        }
        if (!com.max.hbcommon.utils.c.u(sb3.toString())) {
            V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().O2(sb3.toString()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e(linkDraftObj, result)));
        } else if ("1".equals(linkDraftObj.getIs_article())) {
            com.max.xiaoheihe.base.router.b.i(this.f66601b, result, null).U("source", "draft_box").A();
        } else {
            com.max.xiaoheihe.base.router.b.j(this.f66601b, result, null).U("source", "draft_box").A();
        }
    }

    private void v2(LinkDraftObj linkDraftObj) {
        if (PatchProxy.proxy(new Object[]{linkDraftObj}, this, changeQuickRedirect, false, 26201, new Class[]{LinkDraftObj.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().D0(linkDraftObj.getLink_id()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i(linkDraftObj)));
    }

    private void x2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26200, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.L.clear();
        this.N = 0;
        V((io.reactivex.disposables.b) com.max.xiaoheihe.module.bbs.utils.c.c().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h()));
    }

    private void y2(LinkDraftObj linkDraftObj, String str) {
        if (PatchProxy.proxy(new Object[]{linkDraftObj, str}, this, changeQuickRedirect, false, 26196, new Class[]{LinkDraftObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().O2(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f(linkDraftObj)));
    }

    public static Intent z2(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 26193, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent(context, (Class<?>) DraftListActivity.class);
    }

    public void C2(@androidx.annotation.n0 String str, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 String str2, int i10, int i11) {
        Object[] objArr = {str, imageView, str2, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26206, new Class[]{String.class, ImageView.class, String.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbimage.b.P(str, imageView, R.drawable.common_default_placeholder_375x210, -1, -1, 1.0f, false, ViewUtils.p(this.f66601b, imageView, ViewUtils.ViewType.IMAGE), false, true);
        imageView.setOnClickListener(new a(imageView, i10, str2));
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26194, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        this.f66620u = ButterKnife.a(this);
        this.f66616q.setTitle(R.string.draft_box);
        this.f66617r.setVisibility(8);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.f66601b));
        this.mSmartRefreshLayout.S(new b());
        this.mSmartRefreshLayout.f0(new c());
        d dVar = new d(this.f66601b, this.L, R.layout.item_draft_list);
        this.M = dVar;
        this.mRecyclerView.setAdapter(dVar);
        com.max.xiaoheihe.utils.d.b1(this.f66601b);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26203, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        x2();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26197, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        if (com.max.xiaoheihe.utils.i0.s()) {
            x2();
        }
    }
}
