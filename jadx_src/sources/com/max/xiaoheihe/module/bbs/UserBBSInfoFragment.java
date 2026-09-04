package com.max.xiaoheihe.module.bbs;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.ButterKnife;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.adapter.OneTimeValidExposureWatcher;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.hbmmkv.MMKVManager;
import com.max.hbshare.bean.HBShareData;
import com.max.hbshare.bean.PostOptionObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.ImageConfigObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.BBSUserLinkListResult;
import com.max.xiaoheihe.bean.bbs.FollowedMomentsWrapperObj;
import com.max.xiaoheihe.bean.bbs.PostRecommendDetailObj;
import com.max.xiaoheihe.bean.bbs.PostRecommendDetailObjV2;
import com.max.xiaoheihe.bean.bbs.ProfileEventResult;
import com.max.xiaoheihe.bean.bbs.UserMedalObj;
import com.max.xiaoheihe.bean.bbs.post_edit.PostCompilationItemObj;
import com.max.xiaoheihe.bean.bbs.post_edit.PostCompilationsObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.upload.UploadInfoObj;
import com.max.xiaoheihe.module.bbs.component.BBSNewsItemView;
import com.max.xiaoheihe.module.bbs.utils.UserBannerUtils;
import com.max.xiaoheihe.module.report.RecyclerViewReportManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import df.wb;
import df.z80;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class UserBBSInfoFragment extends com.max.hbcommon.base.d implements com.max.xiaoheihe.module.bbs.adapter.g.q {
    private static final String K = "user_id";
    private static final String L = "extra_bundle";
    public static final String M = "route_sub_tab";
    public static final String N = "page_type_moments";
    public static final String O = "page_type_article";
    private static final int P = 6;
    private static final String Q = "has_closed_user_banner";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private wb f80158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private UploadVideoBroadcastReceiver f80159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RefreshDraftBoxBroadcastReceiver f80160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f80161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f80162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f80163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f80164h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f80166j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.t f80167k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.max.xiaoheihe.module.news.adapter.a f80168l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private m f80169m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private PostRecommendDetailObj f80172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PostRecommendDetailObjV2 f80173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private PostRecommendDetailObj f80174r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private PostRecommendDetailObjV2 f80175s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f80176t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f80177u;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f80165i = N;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<FeedsContentBaseObj> f80170n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<BBSLinkObj> f80171o = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.p0
    private String f80178v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.p0
    private String f80179w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.p0
    private String f80180x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private SegmentFilterView f80181y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f80182z = false;
    private boolean A = true;
    private RecyclerView B = null;
    private RecyclerViewReportManager<PostCompilationItemObj> C = null;
    private final ArrayList<PostCompilationItemObj> D = new ArrayList<>();
    private com.max.hbcommon.base.adapter.w E = null;
    private String F = null;
    private boolean G = true;
    private float H = 0.0f;
    private boolean I = false;
    private UMShareListener J = new b();

    public class RefreshDraftBoxBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private RefreshDraftBoxBroadcastReceiver() {
        }

        /* synthetic */ RefreshDraftBoxBroadcastReceiver(UserBBSInfoFragment userBBSInfoFragment, d dVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 27054, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && UserBBSInfoFragment.this.f80177u) {
                String action = intent.getAction();
                if (lb.a.Z.equals(action)) {
                    UserBBSInfoFragment.this.f80182z = true;
                }
                Log.d("RefreshDraftBox-dbg", "[onReceive] action: " + action);
            }
        }
    }

    public class UploadVideoBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private UploadVideoBroadcastReceiver() {
        }

        /* synthetic */ UploadVideoBroadcastReceiver(UserBBSInfoFragment userBBSInfoFragment, d dVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 27055, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && UserBBSInfoFragment.this.f80177u && lb.a.Y.equals(intent.getAction())) {
                UserBBSInfoFragment.U4(UserBBSInfoFragment.this);
            }
        }
    }

    public class a extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27016, new Class[0], Void.TYPE).isSupported && UserBBSInfoFragment.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 27017, new Class[]{Throwable.class}, Void.TYPE).isSupported && UserBBSInfoFragment.this.isActive()) {
                super.onError(th2);
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 27018, new Class[]{Result.class}, Void.TYPE).isSupported && UserBBSInfoFragment.this.isActive()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(UserBBSInfoFragment.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                UserBBSInfoFragment.this.onRefresh();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 27019, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class b implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(SHARE_MEDIA share_media, Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 27021, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(UserBBSInfoFragment.this.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 27020, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(UserBBSInfoFragment.this.getString(R.string.share_success));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
        }
    }

    public class c extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 27022, new Class[]{Throwable.class}, Void.TYPE).isSupported && UserBBSInfoFragment.this.isActive()) {
                super.onError(th2);
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 27023, new Class[]{Result.class}, Void.TYPE).isSupported && UserBBSInfoFragment.this.isActive()) {
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.d("已设置为仅自己可见");
                } else {
                    com.max.hbutils.utils.x.m(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 27024, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class d implements SegmentFilterView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.component.segmentfilters.SegmentFilterView.a
        public void a(@androidx.annotation.n0 KeyDescObj keyDescObj, int i10) {
            if (PatchProxy.proxy(new Object[]{keyDescObj, new Integer(i10)}, this, changeQuickRedirect, false, 27015, new Class[]{KeyDescObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            UserBBSInfoFragment.this.f80165i = keyDescObj.getKey();
            UserBBSInfoFragment.e4(UserBBSInfoFragment.this);
        }
    }

    public class e implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 27025, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            UserBBSInfoFragment.q4(UserBBSInfoFragment.this, false);
            UserBBSInfoFragment.B4(UserBBSInfoFragment.this);
        }
    }

    public class f implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 27026, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            UserBBSInfoFragment.q4(UserBBSInfoFragment.this, true);
        }
    }

    public class g extends com.max.hbcommon.base.adapter.s<PostCompilationItemObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g(Context context, List list, int i10) {
            super(context, list, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(PostCompilationItemObj postCompilationItemObj, View view) {
            if (PatchProxy.proxy(new Object[]{postCompilationItemObj, view}, this, changeQuickRedirect, false, 27030, new Class[]{PostCompilationItemObj.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.j0(((com.max.hbcommon.base.d) UserBBSInfoFragment.this).mContext, postCompilationItemObj.getProtocol());
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("compilation_id", postCompilationItemObj.getObj_id());
            jsonObject.addProperty("compilation_title", postCompilationItemObj.getTitle());
            if (UserBBSInfoFragment.this.f80177u) {
                jsonObject.addProperty("origin", lb.d.K1);
            } else {
                jsonObject.addProperty("origin", lb.d.U1);
            }
            com.max.hbcommon.analytics.d.d("4", lb.d.O1, null, jsonObject);
        }

        private void p(View view, PostCompilationItemObj postCompilationItemObj, TextPaint textPaint) {
            int itemCount;
            if (!PatchProxy.proxy(new Object[]{view, postCompilationItemObj, textPaint}, this, changeQuickRedirect, false, 27028, new Class[]{View.class, PostCompilationItemObj.class, TextPaint.class}, Void.TYPE).isSupported && (itemCount = getItemCount()) > 0) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (UserBBSInfoFragment.this.G) {
                    layoutParams.width = ((ViewUtils.L(((com.max.hbcommon.base.d) UserBBSInfoFragment.this).mContext) - ViewUtils.f(((com.max.hbcommon.base.d) UserBBSInfoFragment.this).mContext, 24.0f)) - (ViewUtils.f(((com.max.hbcommon.base.d) UserBBSInfoFragment.this).mContext, 6.0f) * (itemCount - 1))) / itemCount;
                } else {
                    float fL = (ViewUtils.L(((com.max.hbcommon.base.d) UserBBSInfoFragment.this).mContext) - ViewUtils.f(((com.max.hbcommon.base.d) UserBBSInfoFragment.this).mContext, 12.0f)) - (ViewUtils.f(((com.max.hbcommon.base.d) UserBBSInfoFragment.this).mContext, 6.0f) * (itemCount - 1));
                    if (fL < UserBBSInfoFragment.this.H) {
                        layoutParams.width = (int) UserBBSInfoFragment.Z3(UserBBSInfoFragment.this, postCompilationItemObj, textPaint);
                    } else {
                        layoutParams.width = (int) (UserBBSInfoFragment.Z3(UserBBSInfoFragment.this, postCompilationItemObj, textPaint) + ((fL - UserBBSInfoFragment.this.H) / itemCount));
                    }
                }
                view.setLayoutParams(layoutParams);
            }
        }

        public void o(com.max.hbcommon.base.adapter.s.e eVar, final PostCompilationItemObj postCompilationItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, postCompilationItemObj}, this, changeQuickRedirect, false, 27027, new Class[]{com.max.hbcommon.base.adapter.s.e.class, PostCompilationItemObj.class}, Void.TYPE).isSupported || eVar == null || postCompilationItemObj == null) {
                return;
            }
            TextView textView = (TextView) eVar.i(R.id.tv_compilation_title);
            textView.setText(postCompilationItemObj.getTitle());
            View view = eVar.itemView;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f81217b.n(postCompilationItemObj, view2);
                }
            });
            p(view, postCompilationItemObj, textView.getPaint());
            if (UserBBSInfoFragment.this.C != null) {
                UserBBSInfoFragment.this.C.a(view, postCompilationItemObj);
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, PostCompilationItemObj postCompilationItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, postCompilationItemObj}, this, changeQuickRedirect, false, 27029, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, postCompilationItemObj);
        }
    }

    public class h extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Paint f80192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f80193c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f80194d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ double f80195e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Path f80196f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Paint f80197g;

        h(Paint paint, Rect rect, int i10, double d10, Path path, Paint paint2) {
            this.f80192b = paint;
            this.f80193c = rect;
            this.f80194d = i10;
            this.f80195e = d10;
            this.f80196f = path;
            this.f80197g = paint2;
        }

        private void a(Canvas canvas, View view) {
            if (PatchProxy.proxy(new Object[]{canvas, view}, this, changeQuickRedirect, false, 27032, new Class[]{Canvas.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            float top = view.getTop();
            this.f80192b.getTextBounds("置顶", 0, 2, this.f80193c);
            canvas.save();
            canvas.translate(0.0f, top);
            canvas.rotate(-45.0f);
            canvas.translate((float) (((double) (-this.f80194d)) / this.f80195e), 0.0f);
            int i10 = this.f80194d;
            double d10 = this.f80195e;
            canvas.drawText("置顶", ((((float) (((double) i10) * d10)) / 2.0f) - (this.f80193c.width() / 2.0f)) - 3.0f, (((float) (((double) i10) / d10)) / 2.0f) + (this.f80193c.height() / 2.0f) + 4.0f, this.f80192b);
            canvas.restore();
        }

        private void b(Canvas canvas, View view) {
            if (PatchProxy.proxy(new Object[]{canvas, view}, this, changeQuickRedirect, false, 27033, new Class[]{Canvas.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f80196f.reset();
            float left = view.getLeft();
            float top = view.getTop();
            this.f80196f.moveTo(left, top);
            this.f80196f.lineTo(this.f80194d + left, top);
            this.f80196f.lineTo(left, this.f80194d + top);
            this.f80196f.close();
            canvas.drawPath(this.f80196f, this.f80197g);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{canvas, recyclerView, state}, this, changeQuickRedirect, false, 27031, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onDrawOver(canvas, recyclerView, state);
            int childCount = recyclerView.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
                if (childViewHolder == null || UserBBSInfoFragment.this.f80167k == null) {
                    return;
                }
                Object itemData = UserBBSInfoFragment.this.f80167k.getItemData(childViewHolder.getAbsoluteAdapterPosition());
                if ((itemData instanceof FeedsContentBaseObj) && com.max.hbcommon.utils.c.x(((FeedsContentBaseObj) itemData).getIs_top_link())) {
                    b(canvas, childAt);
                    a(canvas, childAt);
                }
            }
        }
    }

    public class i extends com.max.hbcommon.network.d<BBSUserLinkListResult> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        public void a(BBSUserLinkListResult bBSUserLinkListResult) {
            if (!PatchProxy.proxy(new Object[]{bBSUserLinkListResult}, this, changeQuickRedirect, false, 27036, new Class[]{BBSUserLinkListResult.class}, Void.TYPE).isSupported && UserBBSInfoFragment.this.isActive()) {
                super.onNext(bBSUserLinkListResult);
                List<BBSLinkObj> post_links = bBSUserLinkListResult.getPost_links();
                if (bBSUserLinkListResult.getUser() != null && !com.max.hbcommon.utils.c.w(bBSUserLinkListResult.getUser().getMedal())) {
                    Iterator<UserMedalObj> it = bBSUserLinkListResult.getUser().getMedal().iterator();
                    while (it.hasNext()) {
                        if (!"1".equals(it.next().getWear())) {
                            it.remove();
                        }
                    }
                }
                if (post_links != null) {
                    Iterator<BBSLinkObj> it2 = post_links.iterator();
                    while (it2.hasNext()) {
                        it2.next().setUser(bBSUserLinkListResult.getUser());
                    }
                }
                if (UserBBSInfoFragment.this.f80164h == 0 && bBSUserLinkListResult.getUser() != null) {
                    PostRecommendDetailObjV2 empty_detail_v2 = bBSUserLinkListResult.getEmpty_detail_v2();
                    UserBBSInfoFragment.this.f80173q = empty_detail_v2;
                    if (empty_detail_v2 == null) {
                        UserBBSInfoFragment.this.f80172p = bBSUserLinkListResult.getEmpty_detail();
                    } else {
                        UserBBSInfoFragment.this.f80172p = null;
                    }
                    UserBBSInfoFragment.this.f80176t = com.max.hbutils.utils.n.q(bBSUserLinkListResult.getUser().getPost_article_num());
                    UserBBSInfoFragment.k4(UserBBSInfoFragment.this, bBSUserLinkListResult.getUser());
                    UserBBSInfoFragment.l4(UserBBSInfoFragment.this);
                }
                UserBBSInfoFragment.m4(UserBBSInfoFragment.this, post_links);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27035, new Class[0], Void.TYPE).isSupported && UserBBSInfoFragment.this.isActive()) {
                super.onComplete();
                UserBBSInfoFragment.this.f80158b.f117114f.f131496c.A(0);
                UserBBSInfoFragment.this.f80158b.f117114f.f131496c.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 27034, new Class[]{Throwable.class}, Void.TYPE).isSupported && UserBBSInfoFragment.this.isActive()) {
                super.onError(th2);
                UserBBSInfoFragment.d4(UserBBSInfoFragment.this);
                UserBBSInfoFragment.this.f80158b.f117114f.f131496c.A(0);
                UserBBSInfoFragment.this.f80158b.f117114f.f131496c.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 27037, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((BBSUserLinkListResult) obj);
        }
    }

    public class j extends com.max.hbcommon.network.d<Result<ProfileEventResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27039, new Class[0], Void.TYPE).isSupported && UserBBSInfoFragment.this.isActive()) {
                super.onComplete();
                UserBBSInfoFragment.this.f80158b.f117114f.f131496c.A(0);
                UserBBSInfoFragment.this.f80158b.f117114f.f131496c.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 27038, new Class[]{Throwable.class}, Void.TYPE).isSupported && UserBBSInfoFragment.this.isActive()) {
                super.onError(th2);
                UserBBSInfoFragment.n4(UserBBSInfoFragment.this);
                UserBBSInfoFragment.this.f80158b.f117114f.f131496c.A(0);
                UserBBSInfoFragment.this.f80158b.f117114f.f131496c.p(0);
            }
        }

        public void onNext(Result<ProfileEventResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 27040, new Class[]{Result.class}, Void.TYPE).isSupported || !UserBBSInfoFragment.this.isActive() || result == null) {
                return;
            }
            ProfileEventResult result2 = result.getResult();
            if (UserBBSInfoFragment.this.f80162f == null && result2.getUser() != null) {
                if (UserBBSInfoFragment.this.f80163g == 0) {
                    PostRecommendDetailObjV2 empty_detail_v2 = result2.getEmpty_detail_v2();
                    UserBBSInfoFragment.this.f80175s = empty_detail_v2;
                    if (empty_detail_v2 == null) {
                        UserBBSInfoFragment.this.f80174r = result2.getEmpty_detail();
                    } else {
                        UserBBSInfoFragment.this.f80174r = null;
                    }
                }
                UserBBSInfoFragment.this.f80176t = com.max.hbutils.utils.n.q(result2.getUser().getPost_article_num());
                UserBBSInfoFragment.k4(UserBBSInfoFragment.this, result2.getUser());
                UserBBSInfoFragment.l4(UserBBSInfoFragment.this);
            }
            if (!com.max.hbcommon.utils.c.u(result2.getLastval())) {
                UserBBSInfoFragment.this.f80162f = result2.getLastval();
            }
            UserBBSInfoFragment.u4(UserBBSInfoFragment.this, result2.getMoments());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 27041, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ProfileEventResult>) obj);
        }
    }

    public class k extends com.max.hbcommon.network.d<Result<PostCompilationsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27045, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            UserBBSInfoFragment.this.B.scrollToPosition(0);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 27042, new Class[]{Throwable.class}, Void.TYPE).isSupported && UserBBSInfoFragment.this.isActive()) {
                super.onError(th2);
            }
        }

        @SuppressLint({"NotifyDataSetChanged"})
        public void onNext(Result<PostCompilationsObj> result) {
            PostCompilationsObj result2;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 27043, new Class[]{Result.class}, Void.TYPE).isSupported || !UserBBSInfoFragment.this.isActive() || UserBBSInfoFragment.this.B == null || UserBBSInfoFragment.this.E == null || (result2 = result.getResult()) == null) {
                return;
            }
            UserBBSInfoFragment.this.F = result2.getProtocol();
            UserBBSInfoFragment.this.D.clear();
            List<PostCompilationItemObj> listTakeCompilationItems = result2.takeCompilationItems(4);
            if (listTakeCompilationItems.isEmpty()) {
                UserBBSInfoFragment.this.B.setVisibility(8);
                return;
            }
            UserBBSInfoFragment.this.B.setVisibility(0);
            UserBBSInfoFragment.this.D.addAll(listTakeCompilationItems);
            UserBBSInfoFragment.z4(UserBBSInfoFragment.this);
            ViewGroup.LayoutParams layoutParams = UserBBSInfoFragment.this.B.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(ViewUtils.f(((com.max.hbcommon.base.d) UserBBSInfoFragment.this).mContext, 12.0f), ViewUtils.f(((com.max.hbcommon.base.d) UserBBSInfoFragment.this).mContext, 10.0f), UserBBSInfoFragment.this.G ? ViewUtils.f(((com.max.hbcommon.base.d) UserBBSInfoFragment.this).mContext, 12.0f) : 0, 0);
            if (UserBBSInfoFragment.this.G) {
                layoutParams.width = ViewUtils.L(((com.max.hbcommon.base.d) UserBBSInfoFragment.this).mContext) - ViewUtils.f(((com.max.hbcommon.base.d) UserBBSInfoFragment.this).mContext, 24.0f);
            } else {
                layoutParams.width = ViewUtils.L(((com.max.hbcommon.base.d) UserBBSInfoFragment.this).mContext) - ViewUtils.f(((com.max.hbcommon.base.d) UserBBSInfoFragment.this).mContext, 12.0f);
            }
            UserBBSInfoFragment.this.B.setLayoutParams(layoutParams);
            UserBBSInfoFragment.this.B.post(new Runnable() { // from class: com.max.xiaoheihe.module.bbs.m0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f81230b.b();
                }
            });
            UserBBSInfoFragment.this.E.notifyDataSetChanged();
            if (UserBBSInfoFragment.this.C != null) {
                UserBBSInfoFragment.this.C.f(100L);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        @SuppressLint({"NotifyDataSetChanged"})
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 27044, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PostCompilationsObj>) obj);
        }
    }

    public class l implements com.max.xiaoheihe.utils.l0.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f80202a;

        l(View view) {
            this.f80202a = view;
        }

        @Override // com.max.xiaoheihe.utils.l0.g
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27046, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MMKVManager.f71329a.n(ad.c.f1239s, ad.c.f1242v, System.currentTimeMillis() / 1000, false);
            this.f80202a.setVisibility(8);
        }
    }

    public class m extends com.max.hbcommon.base.adapter.s<BBSLinkObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSLinkObj f80205b;

            a(BBSLinkObj bBSLinkObj) {
                this.f80205b = bBSLinkObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27052, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                m.n(m.this, this.f80205b);
            }
        }

        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSLinkObj f80207b;

            b(BBSLinkObj bBSLinkObj) {
                this.f80207b = bBSLinkObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27053, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.module.bbs.utils.b.E(((com.max.hbcommon.base.d) UserBBSInfoFragment.this).mContext, this.f80207b);
            }
        }

        public m() {
            super(((com.max.hbcommon.base.d) UserBBSInfoFragment.this).mContext, UserBBSInfoFragment.this.f80171o, R.layout.item_article);
        }

        static /* synthetic */ void n(m mVar, BBSLinkObj bBSLinkObj) {
            if (PatchProxy.proxy(new Object[]{mVar, bBSLinkObj}, null, changeQuickRedirect, true, 27051, new Class[]{m.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
                return;
            }
            mVar.q(bBSLinkObj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(BBSLinkObj bBSLinkObj, Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{bBSLinkObj, dialog, view, imageView, textView}, this, changeQuickRedirect, false, 27050, new Class[]{BBSLinkObj.class, Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("link_id", bBSLinkObj.getLinkid());
            com.max.hbcommon.analytics.d.d("4", lb.d.f131226p0, null, jsonObject);
            UserBBSInfoFragment.S4(UserBBSInfoFragment.this, bBSLinkObj);
            com.max.hbshare.d.n(((com.max.hbcommon.base.d) UserBBSInfoFragment.this).mContext, dialog);
        }

        private void q(final BBSLinkObj bBSLinkObj) {
            if (PatchProxy.proxy(new Object[]{bBSLinkObj}, this, changeQuickRedirect, false, 27048, new Class[]{BBSLinkObj.class}, Void.TYPE).isSupported || bBSLinkObj == null) {
                return;
            }
            UMImage uMImage = !com.max.hbcommon.utils.c.w(bBSLinkObj.getImgs()) ? new UMImage(((com.max.hbcommon.base.d) UserBBSInfoFragment.this).mContext, bBSLinkObj.getImgs().get(0)) : new UMImage(((com.max.hbcommon.base.d) UserBBSInfoFragment.this).mContext, R.drawable.share_thumbnail);
            Bundle bundle = new Bundle();
            ArrayList arrayList = new ArrayList();
            PostOptionObj postOptionObj = new PostOptionObj();
            postOptionObj.setName(UserBBSInfoFragment.this.getString(R.string.delete));
            postOptionObj.setImage_resource_id(R.drawable.bbs_sharebutton_delete_46x46);
            postOptionObj.setClick_listener(new PostOptionObj.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.n0
                @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
                public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
                    this.f81427a.o(bBSLinkObj, dialog, view, imageView, textView);
                }
            });
            arrayList.add(postOptionObj);
            bundle.putSerializable(com.max.hbshare.d.f72592n, arrayList);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("link_id", bBSLinkObj.getLinkid());
            com.max.hbshare.d.E(((com.max.hbcommon.base.d) UserBBSInfoFragment.this).mContext, new HBShareData(false, true, bBSLinkObj.getTitle(), bBSLinkObj.getDescription(), bBSLinkObj.getShare_url(), bundle, uMImage, new com.max.hbshare.c.b("link", UserBBSInfoFragment.this.J, jsonObject)));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj}, this, changeQuickRedirect, false, 27049, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            p(eVar, bBSLinkObj);
        }

        public void p(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj) {
            String str;
            String name;
            int iE1;
            if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj}, this, changeQuickRedirect, false, 27047, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
                return;
            }
            BBSNewsItemView bBSNewsItemView = (BBSNewsItemView) eVar.i(R.id.news_item);
            View viewI = eVar.i(R.id.vg_option_bar);
            ImageView imageView = (ImageView) eVar.i(R.id.iv_more);
            ImageView imageView2 = (ImageView) eVar.i(R.id.iv_video_play);
            if (bBSLinkObj.getThumbs() == null || bBSLinkObj.getThumbs().size() <= 0) {
                str = (bBSLinkObj.getImgs() == null || bBSLinkObj.getImgs().size() <= 0) ? null : bBSLinkObj.getImgs().get(0);
            } else {
                str = bBSLinkObj.getThumbs().get(0);
            }
            com.max.hbimage.b.L(str, bBSNewsItemView.f80814b, R.drawable.common_default_placeholder_375x210);
            if (com.max.hbcommon.utils.c.x(bBSLinkObj.getHas_video())) {
                imageView2.setVisibility(0);
            } else {
                imageView2.setVisibility(8);
            }
            if (bBSLinkObj.getSpecial_tag() != null) {
                name = bBSLinkObj.getSpecial_tag().getName();
                iE1 = com.max.xiaoheihe.utils.d.e1(bBSLinkObj.getSpecial_tag().getColor());
            } else {
                name = null;
                iE1 = 0;
            }
            bBSNewsItemView.setTagTitle(bBSLinkObj.getTitle(), name, iE1);
            bBSNewsItemView.f80818f.setVisibility(8);
            bBSNewsItemView.b(bBSLinkObj.getHb_rich_texts());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ad.a.a(ad.a.G, false) ? com.max.hbutils.utils.w.q(((com.max.hbcommon.base.d) UserBBSInfoFragment.this).mContext, bBSLinkObj.getCreate_at()) : com.max.hbutils.utils.w.t(((com.max.hbcommon.base.d) UserBBSInfoFragment.this).mContext, bBSLinkObj.getCreate_at()));
            if (bBSLinkObj.getTopics() != null && bBSLinkObj.getTopics().size() > 0) {
                sb2.append("·");
                sb2.append(bBSLinkObj.getTopics().get(0).getName());
            }
            bBSNewsItemView.setDesc(sb2.toString());
            if (UserBBSInfoFragment.this.f80177u) {
                bBSNewsItemView.f80819g.setVisibility(0);
                bBSNewsItemView.f80820h.setVisibility(8);
                KeyDescObj review_state_v2 = bBSLinkObj.getReview_state_v2();
                bBSNewsItemView.f80821i.setTextColor(review_state_v2 != null ? com.max.xiaoheihe.utils.d.e1(review_state_v2.getColor()) : UserBBSInfoFragment.this.getResources().getColor(R.color.text_primary_1_color));
                bBSNewsItemView.f80821i.setText(review_state_v2 != null ? review_state_v2.getText() : null);
                viewI.setVisibility(0);
                eVar.p(R.id.tv_click, bBSLinkObj.getClick());
                eVar.p(R.id.tv_link_award_num, bBSLinkObj.getLink_award_num());
                eVar.p(R.id.tv_comment_num, bBSLinkObj.getComment_num());
                imageView.setOnClickListener(new a(bBSLinkObj));
            } else {
                bBSNewsItemView.f80819g.setVisibility("1".equals(bBSLinkObj.getHide_comment()) ? 8 : 0);
                bBSNewsItemView.f80820h.setVisibility(0);
                bBSNewsItemView.f80821i.setTextColor(UserBBSInfoFragment.this.getResources().getColor(R.color.text_secondary_2_color));
                bBSNewsItemView.f80821i.setText(bBSLinkObj.getComment_num());
                viewI.setVisibility(8);
            }
            eVar.b().setOnClickListener(new b(bBSLinkObj));
        }
    }

    private void A5(List<FeedsContentBaseObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 26983, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (list != null) {
            if (this.f80163g == 0) {
                this.f80170n.clear();
            }
            List<FeedsContentBaseObj> list2 = this.f80170n;
            if (list2 != null) {
                list2.addAll(list);
            }
            this.f80167k.notifyDataSetChanged();
        }
        G5(this.f80170n, R.drawable.common_tag_post_46x45, R.string.not_available, N);
    }

    static /* synthetic */ void B4(UserBBSInfoFragment userBBSInfoFragment) {
        if (PatchProxy.proxy(new Object[]{userBBSInfoFragment}, null, changeQuickRedirect, true, 27004, new Class[]{UserBBSInfoFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        userBBSInfoFragment.h5();
    }

    private void B5() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26968, new Class[0], Void.TYPE).isSupported && isActive()) {
            UploadInfoObj uploadInfoObj = null;
            int i10 = 0;
            for (UploadInfoObj uploadInfoObj2 : com.max.xiaoheihe.module.upload.c.g().k()) {
                if (uploadInfoObj2 != null && uploadInfoObj2.getVideoPostData() != null) {
                    i10++;
                    if (uploadInfoObj == null) {
                        uploadInfoObj = uploadInfoObj2;
                    }
                }
            }
            if (i10 <= 0) {
                this.f80158b.f117120l.setVisibility(8);
                this.f80158b.f117114f.f131495b.postDelayed(new Runnable() { // from class: com.max.xiaoheihe.module.bbs.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f81209b.r5();
                    }
                }, 1000L);
                return;
            }
            int progressPercent = (int) (uploadInfoObj.getProgressPercent() * 100.0f);
            this.f80158b.f117120l.setVisibility(0);
            com.max.hbimage.b.K(uploadInfoObj.getVideoThumbUrl(), this.f80158b.f117111c);
            this.f80158b.f117116h.setText(String.format("视频上传中 0/%d", Integer.valueOf(i10)));
            this.f80158b.f117117i.setText(String.format("%d%%", Integer.valueOf(progressPercent)));
            this.f80158b.f117112d.setProgress(progressPercent);
        }
    }

    private void C5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26966, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SegmentFilterView segmentFilterView = (SegmentFilterView) this.f80166j.findViewById(R.id.ll_tab);
        int childCount = segmentFilterView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = segmentFilterView.getChildAt(i10);
            if (childAt instanceof LinearLayout) {
                TextView textView = (TextView) childAt.findViewById(R.id.tv_tab_title);
                if (O.equals(((KeyDescObj) childAt.getTag()).getKey())) {
                    textView.setText(String.format(Locale.US, "%s %d", getString(R.string.contribute_post), Integer.valueOf(this.f80176t)));
                }
            }
        }
    }

    private View D5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26979, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        try {
            ViewStub viewStub = (ViewStub) this.f80166j.findViewById(R.id.stub_author_banner);
            View viewInflate = viewStub != null ? viewStub.inflate() : this.f80166j.findViewById(R.id.user_author_banner);
            if (viewInflate != null) {
                viewInflate.setVisibility(0);
            }
            return viewInflate;
        } catch (Exception e10) {
            com.max.heybox.hblog.g.G("[UserBBSInfoFragment][retrieveAuthorBanner]\nerror: " + e10);
            return null;
        }
    }

    @SuppressLint({"AutoDispose"})
    private void E5(@androidx.annotation.n0 final BBSLinkObj bBSLinkObj) {
        Activity activity;
        if (PatchProxy.proxy(new Object[]{bBSLinkObj}, this, changeQuickRedirect, false, 26992, new Class[]{BBSLinkObj.class}, Void.TYPE).isSupported || (activity = this.mContext) == null || activity.isFinishing()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!Objects.equals(bBSLinkObj.getView_limit(), "3")) {
            KeyDescObj keyDescObj = new KeyDescObj();
            keyDescObj.setText("设置为仅自己可见");
            keyDescObj.setDesc("可保留内容并仅自己可见");
            keyDescObj.setId("0");
            arrayList.add(keyDescObj);
        }
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setText("删除内容");
        keyDescObj2.setDesc("内容将被永久删除");
        keyDescObj2.setId("1");
        arrayList.add(keyDescObj2);
        final HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(this.mContext, arrayList, true);
        heyBoxPopupMenu.O(false);
        heyBoxPopupMenu.Q(HeyBoxPopupMenu.MenuItemTextSource.DATA_TEXT);
        heyBoxPopupMenu.U(true);
        heyBoxPopupMenu.T(true);
        heyBoxPopupMenu.P(new HeyBoxPopupMenu.e(this.mContext.getColor(R.color.text_primary_1_color_day_night), 0.06f));
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("link_id", bBSLinkObj.getLinkid());
        heyBoxPopupMenu.R(new HeyBoxPopupMenu.h() { // from class: com.max.xiaoheihe.module.bbs.k0
            @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
            public final void a(View view, KeyDescObj keyDescObj3) {
                this.f81211a.s5(jsonObject, bBSLinkObj, heyBoxPopupMenu, view, keyDescObj3);
            }
        });
        heyBoxPopupMenu.show();
    }

    private void G5(List list, int i10, int i11, String str) {
        Object[] objArr = {list, new Integer(i10), new Integer(i11), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26981, new Class[]{List.class, cls, cls, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.w(list)) {
            this.f80158b.f117113e.b().setVisibility(8);
            this.f80158b.f117118j.b().setVisibility(8);
            this.f80158b.f117119k.b().setVisibility(8);
            this.f80158b.f117114f.f131496c.i0(true);
            this.f80158b.f117114f.f131496c.b0(true);
            return;
        }
        this.f80158b.f117114f.f131496c.i0(false);
        this.f80158b.f117114f.f131496c.b0(false);
        boolean zEquals = O.equals(str);
        o0.a(this.f80158b, zEquals ? this.f80173q : this.f80175s, this.f80166j);
        PostRecommendDetailObj postRecommendDetailObj = zEquals ? this.f80172p : this.f80174r;
        if (postRecommendDetailObj == null || com.max.hbcommon.utils.c.w(postRecommendDetailObj.getList())) {
            this.f80158b.f117113e.b().setVisibility(0);
            this.f80158b.f117118j.b().setVisibility(8);
            this.f80158b.f117113e.f131708c.setImageResource(i10);
            this.f80158b.f117113e.f131709d.setText(i11);
            if (this.f80166j != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f80158b.f117113e.b().getLayoutParams();
                layoutParams.setMargins(0, ViewUtils.V(this.f80166j) + ViewUtils.f(this.mContext, 4.0f), 0, 0);
                this.f80158b.f117113e.b().setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f80158b.f117113e.b().setVisibility(8);
        this.f80158b.f117118j.b().setVisibility(0);
        z80 z80Var = this.f80158b.f117118j;
        z80Var.f118258e.setBackground(ViewUtils.G(ViewUtils.o(this.mContext, z80Var.b()), com.max.xiaoheihe.utils.d.F(this.mContext, R.color.divider_secondary_2_color)));
        this.f80158b.f117118j.f118257d.setText(postRecommendDetailObj.getTitle());
        this.f80158b.f117118j.f118256c.setText(postRecommendDetailObj.getText());
        this.f80158b.f117118j.f118255b.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.f80158b.f117118j.f118255b.setAdapter(new com.max.xiaoheihe.module.bbs.adapter.q(this.mContext, postRecommendDetailObj.getList()));
        this.f80158b.f117118j.f118255b.getAdapter().notifyDataSetChanged();
        if (this.f80166j != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f80158b.f117118j.b().getLayoutParams();
            layoutParams2.setMargins(0, ViewUtils.V(this.f80166j) + ViewUtils.f(this.mContext, 4.0f), 0, 0);
            this.f80158b.f117118j.b().setLayoutParams(layoutParams2);
        }
    }

    private void H5(@androidx.annotation.n0 Bundle bundle) {
        String string;
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 26971, new Class[]{Bundle.class}, Void.TYPE).isSupported || (string = bundle.getString(M, "")) == null || string.isEmpty()) {
            return;
        }
        this.f80165i = string;
        SegmentFilterView segmentFilterView = this.f80181y;
        if (segmentFilterView != null) {
            List<KeyDescObj> list = segmentFilterView.getList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (string.equals(list.get(i10).getKey())) {
                    this.f80181y.c(i10);
                    showLoading();
                    this.f80158b.f117114f.f131495b.postDelayed(new Runnable() { // from class: com.max.xiaoheihe.module.bbs.i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f81207b.t5();
                        }
                    }, 1000L);
                }
            }
        }
    }

    private void I5(BBSUserInfoObj bBSUserInfoObj) {
        String str;
        Boolean bool;
        String title;
        if (PatchProxy.proxy(new Object[]{bBSUserInfoObj}, this, changeQuickRedirect, false, 26977, new Class[]{BBSUserInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = this.f80166j.findViewById(R.id.vg_home_menu);
        View viewFindViewById2 = this.f80166j.findViewById(R.id.vg_menu_creator_studio);
        View viewFindViewById3 = this.f80166j.findViewById(R.id.vg_menu_right);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.iv_menu_red_point);
        if (!this.f80177u) {
            viewFindViewById.setVisibility(8);
            return;
        }
        if (bBSUserInfoObj == null) {
            com.max.heybox.hblog.g.G("[updateUserOverView] update failed, cause user is null");
            return;
        }
        viewFindViewById.setVisibility(0);
        int iB = com.max.xiaoheihe.module.bbs.utils.c.b();
        viewFindViewById4.setVisibility(8);
        if (bBSUserInfoObj.getAuthor_center() != null && com.max.hbutils.utils.n.r(bBSUserInfoObj.getAuthor_center().getAlert_at()) > MMKVManager.f71329a.g(ad.c.f1239s, ad.c.f1242v, 0L, false)) {
            viewFindViewById4.setVisibility(0);
        }
        String desc = bBSUserInfoObj.getAuthor_center() != null ? bBSUserInfoObj.getAuthor_center().getDesc() : "";
        String str2 = this.f80178v;
        String protocol = bBSUserInfoObj.getAuthor_center() != null ? bBSUserInfoObj.getAuthor_center().getProtocol() : null;
        Boolean bool2 = Boolean.FALSE;
        com.max.xiaoheihe.module.account.utils.f.e(viewFindViewById2, com.max.xiaoheihe.module.account.utils.f.f79304c, desc, str2, protocol, false, null, bool2, new l(viewFindViewById4));
        String thumb = this.f80179w;
        String description = iB > 0 ? String.format(getString(R.string.draft_count_format), Integer.valueOf(iB)) : null;
        if (bBSUserInfoObj.getAuthor_center_draft_box() != null) {
            if (!com.max.hbcommon.utils.c.u(bBSUserInfoObj.getAuthor_center_draft_box().getThumb())) {
                thumb = bBSUserInfoObj.getAuthor_center_draft_box().getThumb();
                bool2 = Boolean.TRUE;
            }
            if (!com.max.hbcommon.utils.c.u(bBSUserInfoObj.getAuthor_center_draft_box().getDescription())) {
                description = bBSUserInfoObj.getAuthor_center_draft_box().getDescription();
            }
            title = bBSUserInfoObj.getAuthor_center_draft_box().getTitle();
            str = thumb;
            bool = bool2;
        } else {
            str = thumb;
            bool = bool2;
            title = "";
        }
        com.max.xiaoheihe.module.account.utils.f.e(viewFindViewById3, com.max.xiaoheihe.module.account.utils.f.f79305d, description, str, null, false, title, bool, null);
        z5(bBSUserInfoObj.getAuthor_center_banner());
    }

    static /* synthetic */ void S4(UserBBSInfoFragment userBBSInfoFragment, BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{userBBSInfoFragment, bBSLinkObj}, null, changeQuickRedirect, true, 27013, new Class[]{UserBBSInfoFragment.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        userBBSInfoFragment.E5(bBSLinkObj);
    }

    static /* synthetic */ void U4(UserBBSInfoFragment userBBSInfoFragment) {
        if (PatchProxy.proxy(new Object[]{userBBSInfoFragment}, null, changeQuickRedirect, true, 27014, new Class[]{UserBBSInfoFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        userBBSInfoFragment.B5();
    }

    static /* synthetic */ float Z3(UserBBSInfoFragment userBBSInfoFragment, PostCompilationItemObj postCompilationItemObj, TextPaint textPaint) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{userBBSInfoFragment, postCompilationItemObj, textPaint}, null, changeQuickRedirect, true, 27005, new Class[]{UserBBSInfoFragment.class, PostCompilationItemObj.class, TextPaint.class}, Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : userBBSInfoFragment.b5(postCompilationItemObj, textPaint);
    }

    private float b5(PostCompilationItemObj postCompilationItemObj, TextPaint textPaint) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postCompilationItemObj, textPaint}, this, changeQuickRedirect, false, 26962, new Class[]{PostCompilationItemObj.class, TextPaint.class}, Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : ViewUtils.f(this.mContext, 34.0f) + ViewUtils.S(textPaint, postCompilationItemObj.getTitle());
    }

    private void c5() {
        int size;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26961, new Class[0], Void.TYPE).isSupported || (size = this.D.size()) == 0) {
            return;
        }
        int iL = (ViewUtils.L(this.mContext) - ViewUtils.f(this.mContext, 24.0f)) - (ViewUtils.f(this.mContext, 6.0f) * (size - 1));
        TextView textView = new TextView(this.mContext);
        textView.setTextSize(1, 11.0f);
        this.H = 0.0f;
        this.G = true;
        Iterator<PostCompilationItemObj> it = this.D.iterator();
        while (it.hasNext()) {
            float fB5 = b5(it.next(), textView.getPaint());
            if (fB5 > iL / size) {
                this.G = false;
            }
            this.H += fB5;
        }
        if (this.H > iL) {
            this.G = false;
        }
    }

    static /* synthetic */ void d4(UserBBSInfoFragment userBBSInfoFragment) {
        if (PatchProxy.proxy(new Object[]{userBBSInfoFragment}, null, changeQuickRedirect, true, 27006, new Class[]{UserBBSInfoFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        userBBSInfoFragment.showError();
    }

    private void d5(View view, String str, View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{view, str, onClickListener}, this, changeQuickRedirect, false, 26980, new Class[]{View.class, String.class, View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        final TextView textView = (TextView) view.findViewById(R.id.tv_banner_action);
        textView.setBackground(com.max.hbutils.utils.q.k(this.mContext, this.mContext.getColor(R.color.black_start), this.mContext.getColor(R.color.black_end), GradientDrawable.Orientation.TL_BR, new float[]{3.0f, 3.0f, 3.0f, 3.0f, 3.0f, 3.0f, 3.0f, 3.0f}));
        textView.setText(str);
        textView.setOnClickListener(onClickListener);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UserBBSInfoFragment.l5(textView, view2);
            }
        });
    }

    static /* synthetic */ void e4(UserBBSInfoFragment userBBSInfoFragment) {
        if (PatchProxy.proxy(new Object[]{userBBSInfoFragment}, null, changeQuickRedirect, true, 27002, new Class[]{UserBBSInfoFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        userBBSInfoFragment.w5();
    }

    @SuppressLint({"AutoDispose"})
    private void e5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26984, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().b3(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a()));
    }

    @SuppressLint({"AutoDispose"})
    private void f5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26972, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().U6(this.f80161e, this.f80164h, 30, null, BBSLinkObj.LIST_TYPE_ARTICLE, null, (this.I || UserBannerUtils.a()) ? 1 : 0).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i()));
    }

    @SuppressLint({"AutoDispose"})
    private void g5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26973, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().W2(this.f80161e, this.f80163g, 30, this.f80162f, (this.I || UserBannerUtils.a()) ? 1 : 0).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j()));
    }

    @SuppressLint({"AutoDispose"})
    private void h5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26975, new Class[0], Void.TYPE).isSupported || !isActive() || this.E == null) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().U1(this.f80161e, 0, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new k()));
    }

    private void i5(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 26974, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || !isActive() || this.f80167k == null) {
            return;
        }
        String str = this.f80165i;
        str.hashCode();
        if (str.equals(N)) {
            if (z10) {
                this.f80163g += 30;
            } else {
                this.f80163g = 0;
                this.f80162f = null;
            }
            g5();
            return;
        }
        if (str.equals(O)) {
            if (z10) {
                this.f80164h += 30;
            } else {
                this.f80164h = 0;
            }
            f5();
        }
    }

    private void j5(wb wbVar) {
        if (PatchProxy.proxy(new Object[]{wbVar}, this, changeQuickRedirect, false, 26963, new Class[]{wb.class}, Void.TYPE).isSupported) {
            return;
        }
        Path path = new Path();
        int iF = ViewUtils.f(this.mContext, 32.0f);
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(0.0f, 0.0f, iF, 0.0f, this.mContext.getColor(R.color.black_start), this.mContext.getColor(R.color.black_end), Shader.TileMode.CLAMP));
        Paint paint2 = new Paint();
        paint2.setColor(this.mContext.getColor(R.color.background_layer_2_color));
        paint2.setTextSize(ViewUtils.f(this.mContext, 9.0f));
        paint2.setTextAlign(Paint.Align.LEFT);
        h hVar = new h(paint2, new Rect(), iF, Math.sqrt(2.0d), path, paint);
        if (wbVar.f117114f.f131495b.getItemDecorationCount() == 0) {
            wbVar.f117114f.f131495b.addItemDecoration(hVar);
        }
    }

    static /* synthetic */ void k4(UserBBSInfoFragment userBBSInfoFragment, BBSUserInfoObj bBSUserInfoObj) {
        if (PatchProxy.proxy(new Object[]{userBBSInfoFragment, bBSUserInfoObj}, null, changeQuickRedirect, true, 27007, new Class[]{UserBBSInfoFragment.class, BBSUserInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        userBBSInfoFragment.I5(bBSUserInfoObj);
    }

    private void k5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26960, new Class[0], Void.TYPE).isSupported || this.B == null || ad.a.a(ad.a.I, false)) {
            return;
        }
        this.B.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
        if (this.B.getItemDecorationCount() == 0) {
            this.B.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(this.mContext, 6.0f), 0));
        }
        com.max.hbcommon.base.adapter.w wVar = new com.max.hbcommon.base.adapter.w(this.mContext, new g(this.mContext, this.D, R.layout.item_post_compilation_simple), new View.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81163b.m5(view);
            }
        });
        this.E = wVar;
        wVar.H(R.color.transparent);
        this.E.I(com.max.xiaoheihe.module.game.d0.f87251w, com.max.xiaoheihe.module.game.d0.f87251w);
        this.E.J(30);
        this.B.setAdapter(this.E);
        RecyclerViewReportManager<PostCompilationItemObj> recyclerViewReportManager = new RecyclerViewReportManager<>(this.B);
        this.C = recyclerViewReportManager;
        recyclerViewReportManager.h(new RecyclerViewReportManager.b() { // from class: com.max.xiaoheihe.module.bbs.e0
            @Override // com.max.xiaoheihe.module.report.RecyclerViewReportManager.b
            public final void a(Object obj) {
                this.f81165a.n5((PostCompilationItemObj) obj);
            }
        });
    }

    static /* synthetic */ void l4(UserBBSInfoFragment userBBSInfoFragment) {
        if (PatchProxy.proxy(new Object[]{userBBSInfoFragment}, null, changeQuickRedirect, true, 27008, new Class[]{UserBBSInfoFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        userBBSInfoFragment.C5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l5(TextView textView, View view) {
        if (PatchProxy.proxy(new Object[]{textView, view}, null, changeQuickRedirect, true, 26994, new Class[]{TextView.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        textView.performClick();
    }

    static /* synthetic */ void m4(UserBBSInfoFragment userBBSInfoFragment, List list) {
        if (PatchProxy.proxy(new Object[]{userBBSInfoFragment, list}, null, changeQuickRedirect, true, 27009, new Class[]{UserBBSInfoFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        userBBSInfoFragment.y5(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m5(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27001, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.base.router.b.j0(this.mContext, this.F);
        JsonObject jsonObject = new JsonObject();
        if (this.f80177u) {
            jsonObject.addProperty("origin", lb.d.K1);
        } else {
            jsonObject.addProperty("origin", lb.d.U1);
        }
        com.max.hbcommon.analytics.d.d("1", lb.d.P1, null, jsonObject);
    }

    static /* synthetic */ void n4(UserBBSInfoFragment userBBSInfoFragment) {
        if (PatchProxy.proxy(new Object[]{userBBSInfoFragment}, null, changeQuickRedirect, true, 27010, new Class[]{UserBBSInfoFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        userBBSInfoFragment.showError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n5(PostCompilationItemObj postCompilationItemObj) {
        if (PatchProxy.proxy(new Object[]{postCompilationItemObj}, this, changeQuickRedirect, false, 27000, new Class[]{PostCompilationItemObj.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("compilation_id", postCompilationItemObj.getObj_id());
        jsonObject.addProperty("compilation_title", postCompilationItemObj.getTitle());
        if (this.f80177u) {
            jsonObject.addProperty("origin", lb.d.K1);
        } else {
            jsonObject.addProperty("origin", lb.d.U1);
        }
        com.max.hbcommon.analytics.d.d("3", lb.d.O1, null, jsonObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o5(BBSUserInfoObj.AuthorCenterBannerObj authorCenterBannerObj, String str, View view) {
        if (PatchProxy.proxy(new Object[]{authorCenterBannerObj, str, view}, this, changeQuickRedirect, false, 26997, new Class[]{BBSUserInfoObj.AuthorCenterBannerObj.class, String.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f80182z = true;
        JsonObject jsonObject = new JsonObject();
        if (authorCenterBannerObj.getBanner_id() != null) {
            jsonObject.addProperty("banner_id", authorCenterBannerObj.getBanner_id());
        }
        com.max.hbcommon.analytics.d.d("4", lb.d.N1, null, jsonObject);
        com.max.xiaoheihe.base.router.b.j0(this.mContext, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p5(BBSUserInfoObj.AuthorCenterBannerObj authorCenterBannerObj, View view, View view2) {
        if (PatchProxy.proxy(new Object[]{authorCenterBannerObj, view, view2}, this, changeQuickRedirect, false, 26996, new Class[]{BBSUserInfoObj.AuthorCenterBannerObj.class, View.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        if (authorCenterBannerObj.getBanner_id() != null) {
            jsonObject.addProperty("banner_id", authorCenterBannerObj.getBanner_id());
        }
        com.max.hbcommon.analytics.d.d("4", lb.d.M1, null, jsonObject);
        view.setVisibility(8);
        UserBannerUtils.b();
        this.I = true;
        RecyclerView recyclerView = this.B;
        if (recyclerView != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(ViewUtils.f(this.mContext, 12.0f), ViewUtils.f(this.mContext, 10.0f), this.G ? ViewUtils.f(this.mContext, 12.0f) : 0, 0);
            if (this.G) {
                layoutParams.width = ViewUtils.L(this.mContext) - ViewUtils.f(this.mContext, 24.0f);
            } else {
                layoutParams.width = ViewUtils.L(this.mContext) - ViewUtils.f(this.mContext, 12.0f);
            }
            this.B.setLayoutParams(layoutParams);
        }
    }

    static /* synthetic */ void q4(UserBBSInfoFragment userBBSInfoFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{userBBSInfoFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 27003, new Class[]{UserBBSInfoFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        userBBSInfoFragment.i5(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q5(ImageView imageView, View view) {
        if (PatchProxy.proxy(new Object[]{imageView, view}, null, changeQuickRedirect, true, 26995, new Class[]{ImageView.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        imageView.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26999, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        i5(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s5(JsonObject jsonObject, BBSLinkObj bBSLinkObj, HeyBoxPopupMenu heyBoxPopupMenu, View view, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{jsonObject, bBSLinkObj, heyBoxPopupMenu, view, keyDescObj}, this, changeQuickRedirect, false, 26993, new Class[]{JsonObject.class, BBSLinkObj.class, HeyBoxPopupMenu.class, View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (Objects.equals(keyDescObj.getId(), "1")) {
            com.max.hbcommon.analytics.d.d("4", lb.d.f131240r0, null, jsonObject);
            e5(bBSLinkObj.getLinkid());
        } else {
            com.max.hbcommon.analytics.d.d("4", lb.d.f131233q0, null, jsonObject);
            addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().X9(bBSLinkObj.getLinkid(), "3").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
        }
        heyBoxPopupMenu.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26998, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        i5(false);
    }

    static /* synthetic */ void u4(UserBBSInfoFragment userBBSInfoFragment, List list) {
        if (PatchProxy.proxy(new Object[]{userBBSInfoFragment, list}, null, changeQuickRedirect, true, 27011, new Class[]{UserBBSInfoFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        userBBSInfoFragment.A5(list);
    }

    private void u5() {
        ImageConfigObj imageConfigObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26964, new Class[0], Void.TYPE).isSupported || !this.f80177u || (imageConfigObj = (ImageConfigObj) com.max.hbutils.utils.k.a(MMKVManager.f71329a.i(ad.c.f1235o, ad.c.f1237q, "", false), ImageConfigObj.class)) == null) {
            return;
        }
        this.f80178v = imageConfigObj.getImg_author();
        this.f80179w = imageConfigObj.getImg_draft();
        this.f80180x = imageConfigObj.getImg_inspiration();
    }

    public static UserBBSInfoFragment v5(String str, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, bundle}, null, changeQuickRedirect, true, 26957, new Class[]{String.class, Bundle.class}, UserBBSInfoFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (UserBBSInfoFragment) patchProxyResultProxy.result;
        }
        UserBBSInfoFragment userBBSInfoFragment = new UserBBSInfoFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("user_id", str);
        if (bundle != null) {
            bundle2.putBundle(L, bundle);
        }
        userBBSInfoFragment.setArguments(bundle2);
        return userBBSInfoFragment;
    }

    private void w5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26976, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = this.f80165i;
        str.hashCode();
        if (str.equals(N)) {
            this.f80158b.f117114f.f131495b.setLayoutManager(new LinearLayoutManager(this.mContext));
            com.max.hbcommon.base.adapter.t tVar = new com.max.hbcommon.base.adapter.t(this.f80168l);
            this.f80167k = tVar;
            tVar.p(R.layout.layout_user_bbs_info_header, this.f80166j);
            this.f80158b.f117115g.getLayoutParams().height = 0;
            this.f80158b.f117114f.f131495b.setAdapter(this.f80167k);
            if (this.f80170n.isEmpty()) {
                i5(false);
                return;
            } else {
                G5(this.f80170n, R.drawable.common_tag_common_45x45, R.string.no_game_moment, N);
                return;
            }
        }
        if (str.equals(O)) {
            this.f80158b.f117114f.f131495b.setLayoutManager(new LinearLayoutManager(this.mContext));
            com.max.hbcommon.base.adapter.t tVar2 = new com.max.hbcommon.base.adapter.t(this.f80169m);
            this.f80167k = tVar2;
            tVar2.p(R.layout.layout_user_bbs_info_header, this.f80166j);
            this.f80158b.f117115g.getLayoutParams().height = 0;
            this.f80158b.f117114f.f131495b.setAdapter(this.f80167k);
            if (this.f80171o.isEmpty()) {
                i5(false);
            } else {
                G5(this.f80171o, R.drawable.common_tag_post_46x45, R.string.no_contribute_post, O);
            }
        }
    }

    private void y5(List<BBSLinkObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 26982, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (list != null) {
            if (this.f80164h == 0) {
                this.f80171o.clear();
            }
            this.f80171o.addAll(list);
            this.f80167k.notifyDataSetChanged();
        }
        G5(this.f80171o, R.drawable.common_tag_post_46x45, R.string.no_contribute_post, O);
    }

    static /* synthetic */ void z4(UserBBSInfoFragment userBBSInfoFragment) {
        if (PatchProxy.proxy(new Object[]{userBBSInfoFragment}, null, changeQuickRedirect, true, 27012, new Class[]{UserBBSInfoFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        userBBSInfoFragment.c5();
    }

    private void z5(final BBSUserInfoObj.AuthorCenterBannerObj authorCenterBannerObj) {
        final View viewD5;
        if (PatchProxy.proxy(new Object[]{authorCenterBannerObj}, this, changeQuickRedirect, false, 26978, new Class[]{BBSUserInfoObj.AuthorCenterBannerObj.class}, Void.TYPE).isSupported || (viewD5 = D5()) == null) {
            return;
        }
        if (this.I) {
            viewD5.setVisibility(8);
            return;
        }
        if (UserBannerUtils.a()) {
            viewD5.setVisibility(8);
            return;
        }
        if (authorCenterBannerObj == null || authorCenterBannerObj.getPublish_button() == null) {
            viewD5.setVisibility(8);
            return;
        }
        String description = authorCenterBannerObj.getDescription();
        String thumb = authorCenterBannerObj.getThumb();
        String title = authorCenterBannerObj.getTitle();
        final String protocol = authorCenterBannerObj.getPublish_button().getProtocol();
        String button_name = authorCenterBannerObj.getPublish_button().getButton_name();
        if (com.max.hbcommon.utils.c.u(thumb) || com.max.hbcommon.utils.c.u(title) || com.max.hbcommon.utils.c.u(protocol) || com.max.hbcommon.utils.c.u(button_name)) {
            viewD5.setVisibility(8);
            return;
        }
        viewD5.findViewById(R.id.v_bg).setBackground(com.max.hbutils.utils.q.o(this.mContext, R.color.background_card_1_color, 8.0f));
        TextView textView = (TextView) viewD5.findViewById(R.id.tv_banner_desc);
        if (com.max.hbcommon.utils.c.u(description)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(description);
        }
        com.max.hbimage.b.K(thumb, (ImageView) viewD5.findViewById(R.id.iv_banner_icon));
        TextView textView2 = (TextView) viewD5.findViewById(R.id.tv_banner_title);
        textView2.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        textView2.setText(title);
        d5(viewD5, button_name, new View.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81169b.o5(authorCenterBannerObj, protocol, view);
            }
        });
        ((Group) viewD5.findViewById(R.id.group_close)).setVisibility(0);
        final ImageView imageView = (ImageView) viewD5.findViewById(R.id.iv_banner_close);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81196b.p5(authorCenterBannerObj, viewD5, view);
            }
        });
        viewD5.findViewById(R.id.v_banner_close).setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserBBSInfoFragment.q5(imageView, view);
            }
        });
        RecyclerView recyclerView = this.B;
        if (recyclerView != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(ViewUtils.f(this.mContext, 12.0f), ViewUtils.f(this.mContext, 8.0f), this.G ? ViewUtils.f(this.mContext, 12.0f) : 0, 0);
            if (this.G) {
                layoutParams.width = ViewUtils.L(this.mContext) - ViewUtils.f(this.mContext, 24.0f);
            } else {
                layoutParams.width = ViewUtils.L(this.mContext) - ViewUtils.f(this.mContext, 12.0f);
            }
            this.B.setLayoutParams(layoutParams);
        }
    }

    public void F5(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 26970, new Class[]{Bundle.class}, Void.TYPE).isSupported || bundle == null) {
            return;
        }
        H5(bundle);
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.g.q
    public void O(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26987, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.base.adapter.t tVar = this.f80167k;
        tVar.notifyItemRangeInserted(i10 + tVar.u(), i11);
    }

    public void a5(int i10) {
        Activity activity;
        wb wbVar;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 26967, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (activity = this.mContext) == null || (wbVar = this.f80158b) == null) {
            return;
        }
        wbVar.f117120l.setTranslationY(-(ViewUtils.f(activity, 140.0f) + i10));
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPagePath() {
        if (this.mContext instanceof MainActivity) {
            return lb.d.K1;
        }
        return null;
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26969, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        w5();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        Activity activity;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26959, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        wb wbVarC = wb.c(this.mInflater);
        this.f80158b = wbVarC;
        setContentView(wbVarC);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f80161e = getArguments().getString("user_id");
        }
        this.f80177u = com.max.xiaoheihe.module.account.utils.c.c(this.f80161e) == 1;
        u5();
        this.f80168l = new com.max.xiaoheihe.module.news.adapter.a(this.mContext, this.f80170n);
        this.f80169m = new m();
        this.f80158b.f117114f.f131495b.setClipToPadding(false);
        this.f80158b.f117114f.f131495b.setClipChildren(false);
        this.f80158b.f117114f.f131495b.setPadding(0, ViewUtils.f(this.mContext, 4.0f), 0, ViewUtils.f(this.mContext, 4.0f));
        this.f80158b.f117114f.f131495b.setLayoutManager(new LinearLayoutManager(this.mContext));
        j5(this.f80158b);
        View viewInflate = this.mInflater.inflate(R.layout.layout_user_bbs_info_header, (ViewGroup) this.f80158b.f117114f.f131495b, false);
        this.f80166j = viewInflate;
        this.f80181y = (SegmentFilterView) viewInflate.findViewById(R.id.ll_tab);
        this.B = (RecyclerView) this.f80166j.findViewById(R.id.rv_post_compilation);
        k5();
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setDesc(getString(R.string.bbs_timeline));
        keyDescObj.setKey(N);
        arrayList.add(keyDescObj);
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setDesc(getString(R.string.contribute_post));
        keyDescObj2.setKey(O);
        arrayList.add(keyDescObj2);
        this.f80181y.setData(arrayList);
        this.f80181y.setMOnTabCheckedListener(new d());
        this.f80181y.d();
        this.f80158b.f117114f.f131496c.S(new e());
        this.f80158b.f117114f.f131496c.f0(new f());
        new OneTimeValidExposureWatcher(this, this.f80158b.f117114f.f131495b);
        if (this.mIsFirst && (activity = this.mContext) != null) {
            showTopLoading(ViewUtils.h0(this.mContext, ViewUtils.J(activity) / 2) - 200);
        }
        if (getArguments() != null) {
            F5(getArguments().getBundle(L));
        }
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    public boolean o3() {
        return !(this.mContext instanceof MainActivity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, @androidx.annotation.p0 Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26988, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this.mContext).onActivityResult(i10, i11, intent);
        if (i10 == 6) {
            onRefresh();
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onCreate(@androidx.annotation.p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 26958, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        if (bundle != null) {
            this.I = bundle.getBoolean(Q, false);
        }
        RefreshDraftBoxBroadcastReceiver refreshDraftBoxBroadcastReceiver = new RefreshDraftBoxBroadcastReceiver(this, null);
        this.f80160d = refreshDraftBoxBroadcastReceiver;
        registerReceiver(refreshDraftBoxBroadcastReceiver, lb.a.Z);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26989, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        unregisterReceiver(this.f80160d);
        UMShareAPI.get(this.mContext).release();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26985, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        i5(false);
        h5();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@androidx.annotation.n0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 26990, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(Q, this.I);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26965, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        UploadVideoBroadcastReceiver uploadVideoBroadcastReceiver = new UploadVideoBroadcastReceiver(this, null);
        this.f80159c = uploadVideoBroadcastReceiver;
        registerReceiver(uploadVideoBroadcastReceiver, lb.a.Y);
        if (this.f80182z && !this.A) {
            i5(false);
            this.f80182z = false;
        }
        this.A = false;
        if (ad.a.a(ad.a.I, false)) {
            return;
        }
        h5();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26991, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
        unregisterReceiver(this.f80159c);
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.g.q
    public void t1(com.max.hbcommon.base.adapter.s.e eVar, FollowedMomentsWrapperObj followedMomentsWrapperObj) {
    }

    public void x5() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26986, new Class[0], Void.TYPE).isSupported && isActive()) {
            i5(false);
        }
    }
}
