package com.max.xiaoheihe.module.favour;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.hbutils.utils.w;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.WikiArticelObj;
import com.max.xiaoheihe.bean.favour.HistoryContentObj;
import com.max.xiaoheihe.bean.favour.HistoryVisitedResult;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.game.component.GamePriceView;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.game.z;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import df.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: HistoryTypeFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class j extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final a f83928j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f83929k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    public static final String f83930l = "arg_filter_type";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    public static final String f83931m = "all";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    public static final String f83932n = "link";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    public static final String f83933o = "game";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    public static final String f83934p = "wiki_article";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f83935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f83936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f83937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final ArrayList<HistoryContentObj> f83938e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f83939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f83940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s0 f83941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private l f83942i;

    /* JADX INFO: compiled from: HistoryTypeFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Drawable a(@dl.e Context context, @dl.d HistoryContentObj data) {
            GradientDrawable gradientDrawable;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, data}, this, changeQuickRedirect, false, 32035, new Class[]{Context.class, HistoryContentObj.class}, Drawable.class);
            if (patchProxyResultProxy.isSupported) {
                return (Drawable) patchProxyResultProxy.result;
            }
            f0.p(data, "data");
            String type = data.getType();
            if (f0.g("game", type)) {
                gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{com.max.hbcommon.utils.l.a(R.color.orange_start), com.max.hbcommon.utils.l.a(R.color.orange_end)});
            } else {
                gradientDrawable = f0.g("wiki_article", type) ? new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{com.max.hbcommon.utils.l.a(R.color.red_start), com.max.hbcommon.utils.l.a(R.color.red_end)}) : new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{com.max.hbcommon.utils.l.a(R.color.purple_start), com.max.hbcommon.utils.l.a(R.color.purple_end)});
            }
            if (context != null) {
                gradientDrawable.setCornerRadii(q.I(ViewUtils.f(context, 5.0f), 6));
            }
            return gradientDrawable;
        }

        @dl.d
        public final j b(@dl.d String listType) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{listType}, this, changeQuickRedirect, false, 32034, new Class[]{String.class}, j.class);
            if (patchProxyResultProxy.isSupported) {
                return (j) patchProxyResultProxy.result;
            }
            f0.p(listType, "listType");
            j jVar = new j();
            Bundle bundle = new Bundle();
            bundle.putString(j.f83930l, listType);
            jVar.setArguments(bundle);
            return jVar;
        }
    }

    /* JADX INFO: compiled from: HistoryTypeFragment.kt */
    public final class b extends s<HistoryContentObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: HistoryTypeFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ HistoryContentObj f83944b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ImageView f83945c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ j f83946d;

            a(HistoryContentObj historyContentObj, ImageView imageView, j jVar) {
                this.f83944b = historyContentObj;
                this.f83945c = imageView;
                this.f83946d = jVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32038, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbcommon.utils.d.b("zzzzhistory", "itemView click");
                HistoryContentObj historyContentObj = this.f83944b;
                historyContentObj.setChecked(!historyContentObj.isChecked());
                if (this.f83944b.isChecked()) {
                    this.f83945c.setImageResource(R.drawable.common_select_filled_24x24);
                } else {
                    this.f83945c.setImageResource(R.drawable.common_cb_unchecked_16);
                }
                s0 s0Var = null;
                if (j.W3(this.f83946d)) {
                    s0 s0Var2 = this.f83946d.f83941h;
                    if (s0Var2 == null) {
                        f0.S("mBinding");
                    } else {
                        s0Var = s0Var2;
                    }
                    s0Var.f115354b.setChecked(true, false);
                    return;
                }
                s0 s0Var3 = this.f83946d.f83941h;
                if (s0Var3 == null) {
                    f0.S("mBinding");
                } else {
                    s0Var = s0Var3;
                }
                s0Var.f115354b.setChecked(false, false);
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.favour.j$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: HistoryTypeFragment.kt */
        public static final class ViewOnClickListenerC0741b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f83947b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ BBSLinkObj f83948c;

            ViewOnClickListenerC0741b(j jVar, BBSLinkObj bBSLinkObj) {
                this.f83947b = jVar;
                this.f83948c = bBSLinkObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32039, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.module.bbs.utils.b.E(((com.max.hbcommon.base.d) this.f83947b).mContext, this.f83948c);
            }
        }

        /* JADX INFO: compiled from: HistoryTypeFragment.kt */
        public static final class c implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f83949b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f83950c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f83951d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f83952e;

            c(j jVar, String str, String str2, String str3) {
                this.f83949b = jVar;
                this.f83950c = str;
                this.f83951d = str2;
                this.f83952e = str3;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32040, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                ((com.max.hbcommon.base.d) this.f83949b).mContext.startActivity(z.b(((com.max.hbcommon.base.d) this.f83949b).mContext, this.f83950c, this.f83951d, this.f83952e, null, i0.m(), i0.j(), null));
            }
        }

        /* JADX INFO: compiled from: HistoryTypeFragment.kt */
        public static final class d implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f83953b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ j f83954c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f83955d;

            d(String str, j jVar, String str2) {
                this.f83953b = str;
                this.f83954c = jVar;
                this.f83955d = str2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32041, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f83953b)) {
                    return;
                }
                String url = this.f83953b;
                f0.o(url, "url");
                if (!kotlin.text.u.v2(url, "http", false, 2, null)) {
                    Activity mContext = ((com.max.hbcommon.base.d) this.f83954c).mContext;
                    f0.o(mContext, "mContext");
                    com.max.xiaoheihe.base.router.b.k0(mContext, this.f83953b);
                } else {
                    Intent intent = new Intent(((com.max.hbcommon.base.d) this.f83954c).mContext, (Class<?>) WebActionActivity.class);
                    intent.putExtra("pageurl", this.f83953b);
                    intent.putExtra("title", this.f83955d);
                    ((com.max.hbcommon.base.d) this.f83954c).mContext.startActivity(intent);
                }
            }
        }

        public b(@dl.e Context context, List<? extends HistoryContentObj> list, int i10) {
            super(context, list, i10);
        }

        public void m(@dl.d s.e viewHolder, @dl.d HistoryContentObj data) {
            l lVar;
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 32036, new Class[]{s.e.class, HistoryContentObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            TextView textView = (TextView) viewHolder.i(R.id.tv_tag);
            View viewI = viewHolder.i(R.id.vg_tag);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_title);
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_check);
            ImageView imageView2 = (ImageView) viewHolder.i(R.id.iv_img);
            TextView textView3 = (TextView) viewHolder.i(R.id.tv_extra_tag);
            viewHolder.i(R.id.vg_extra_info);
            GamePriceView gamePriceView = (GamePriceView) viewHolder.i(R.id.gpv);
            View viewI2 = viewHolder.i(R.id.vg_score);
            int iW = ViewUtils.W(imageView2);
            int iV = ViewUtils.V(imageView2);
            Drawable drawableL = q.l(j.this.getContext(), iW, iV, iV);
            l lVar2 = j.this.f83942i;
            if (lVar2 == null) {
                f0.S("mEditListener");
                lVar2 = null;
            }
            if (lVar2.R0()) {
                imageView.setVisibility(0);
                if (data.isChecked()) {
                    imageView.setImageResource(R.drawable.common_select_filled_24x24);
                } else {
                    imageView.setImageResource(R.drawable.common_cb_unchecked_16);
                }
                viewHolder.itemView.setOnClickListener(new a(data, imageView, j.this));
            } else {
                imageView.setVisibility(8);
            }
            viewI.setBackgroundDrawable(j.f83928j.a(((com.max.hbcommon.base.d) j.this).mContext, data));
            if (f0.g(data.getIs_invalid(), "1")) {
                imageView2.setImageDrawable(drawableL);
                viewI.setVisibility(8);
                textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
                textView2.setText("内容已失效");
                viewI2.setVisibility(8);
                gamePriceView.setVisibility(8);
                textView3.setVisibility(8);
                l lVar3 = j.this.f83942i;
                if (lVar3 == null) {
                    f0.S("mEditListener");
                    lVar3 = null;
                }
                if (!lVar3.R0()) {
                    viewHolder.itemView.setOnClickListener(null);
                }
            } else {
                viewI.setVisibility(0);
                textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                if (f0.g("link", data.getType())) {
                    textView.setText("内容");
                    Object content = data.getContent();
                    f0.n(content, "null cannot be cast to non-null type com.max.xiaoheihe.bean.bbs.BBSLinkObj");
                    BBSLinkObj bBSLinkObj = (BBSLinkObj) content;
                    textView2.setText(bBSLinkObj.getTitle());
                    com.max.hbimage.b.U(bBSLinkObj.getImg(), imageView2, drawableL);
                    viewI2.setVisibility(8);
                    gamePriceView.setVisibility(8);
                    String extra_tag = bBSLinkObj.getExtra_tag();
                    if (extra_tag == null || extra_tag.length() == 0) {
                        textView3.setVisibility(8);
                    } else {
                        textView3.setText(bBSLinkObj.getExtra_tag());
                        textView3.setVisibility(0);
                    }
                    l lVar4 = j.this.f83942i;
                    if (lVar4 == null) {
                        f0.S("mEditListener");
                        lVar = null;
                    } else {
                        lVar = lVar4;
                    }
                    if (!lVar.R0()) {
                        viewHolder.itemView.setOnClickListener(new ViewOnClickListenerC0741b(j.this, bBSLinkObj));
                    }
                } else if (f0.g("game", data.getType())) {
                    textView.setText(R.string.game);
                    Object content2 = data.getContent();
                    f0.n(content2, "null cannot be cast to non-null type com.max.xiaoheihe.bean.game.GameObj");
                    GameObj gameObj = (GameObj) content2;
                    textView2.setText(gameObj.getName());
                    String h_src = gameObj.getH_src();
                    String appid = gameObj.getAppid();
                    String game_type = gameObj.getGame_type();
                    com.max.hbimage.b.U(gameObj.getImage(), imageView2, drawableL);
                    textView3.setVisibility(8);
                    r1.C(gamePriceView, gameObj, false, true);
                    r1.S1(new s.e(R.layout.game_score, viewI2), gameObj.getScore_desc(), gameObj.getScore(), gameObj.getExpect_num());
                    l lVar5 = j.this.f83942i;
                    if (lVar5 == null) {
                        f0.S("mEditListener");
                        lVar5 = null;
                    }
                    if (!lVar5.R0()) {
                        viewHolder.itemView.setOnClickListener(new c(j.this, h_src, appid, game_type));
                    }
                } else {
                    boolean z10 = true;
                    if (f0.g("wiki_article", data.getType())) {
                        textView.setText("数据库");
                        Object content3 = data.getContent();
                        f0.n(content3, "null cannot be cast to non-null type com.max.xiaoheihe.bean.bbs.WikiArticelObj");
                        WikiArticelObj wikiArticelObj = (WikiArticelObj) content3;
                        String article_url = wikiArticelObj.getArticle_url();
                        String article_name = wikiArticelObj.getArticle_name();
                        textView2.setText(article_name);
                        com.max.hbimage.b.U(wikiArticelObj.getImage(), imageView2, drawableL);
                        viewI2.setVisibility(8);
                        gamePriceView.setVisibility(8);
                        String extra_tag2 = wikiArticelObj.getExtra_tag();
                        if (extra_tag2 != null && extra_tag2.length() != 0) {
                            z10 = false;
                        }
                        if (z10) {
                            textView3.setVisibility(8);
                        } else {
                            textView3.setText(wikiArticelObj.getExtra_tag());
                            textView3.setVisibility(0);
                        }
                        l lVar6 = j.this.f83942i;
                        if (lVar6 == null) {
                            f0.S("mEditListener");
                            lVar6 = null;
                        }
                        if (!lVar6.R0()) {
                            viewHolder.itemView.setOnClickListener(new d(article_url, j.this, article_name));
                        }
                    }
                }
            }
            if (com.max.hbcommon.utils.c.u(data.getTag_text())) {
                return;
            }
            textView.setText(data.getTag_text());
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, HistoryContentObj historyContentObj) {
            if (PatchProxy.proxy(new Object[]{eVar, historyContentObj}, this, changeQuickRedirect, false, 32037, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, historyContentObj);
        }
    }

    /* JADX INFO: compiled from: HistoryTypeFragment.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32042, new Class[0], Void.TYPE).isSupported && j.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 32043, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (j.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<?> listResult) {
            if (PatchProxy.proxy(new Object[]{listResult}, this, changeQuickRedirect, false, 32044, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(listResult, "listResult");
            if (j.this.isActive()) {
                j.this.onRefresh();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32045, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: HistoryTypeFragment.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<HistoryVisitedResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32046, new Class[0], Void.TYPE).isSupported && j.this.isActive()) {
                super.onComplete();
                s0 s0Var = j.this.f83941h;
                s0 s0Var2 = null;
                if (s0Var == null) {
                    f0.S("mBinding");
                    s0Var = null;
                }
                s0Var.f115356d.A(0);
                s0 s0Var3 = j.this.f83941h;
                if (s0Var3 == null) {
                    f0.S("mBinding");
                } else {
                    s0Var2 = s0Var3;
                }
                s0Var2.f115356d.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 32047, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (j.this.isActive()) {
                super.onError(e10);
                j.Z3(j.this);
                s0 s0Var = j.this.f83941h;
                s0 s0Var2 = null;
                if (s0Var == null) {
                    f0.S("mBinding");
                    s0Var = null;
                }
                s0Var.f115356d.A(0);
                s0 s0Var3 = j.this.f83941h;
                if (s0Var3 == null) {
                    f0.S("mBinding");
                } else {
                    s0Var2 = s0Var3;
                }
                s0Var2.f115356d.p(0);
            }
        }

        public void onNext(@dl.d Result<HistoryVisitedResult> listResult) {
            HistoryVisitedResult result;
            ArrayList<HistoryContentObj> history_visit;
            if (PatchProxy.proxy(new Object[]{listResult}, this, changeQuickRedirect, false, 32048, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(listResult, "listResult");
            if (!j.this.isActive() || (result = listResult.getResult()) == null || (history_visit = result.getHistory_visit()) == null) {
                return;
            }
            j.a4(j.this, history_visit);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32049, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<HistoryVisitedResult>) obj);
        }
    }

    /* JADX INFO: compiled from: HistoryTypeFragment.kt */
    public static final class e extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 32052, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(outRect, "outRect");
            f0.p(view, "view");
            f0.p(parent, "parent");
            f0.p(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int viewLayoutPosition = ((RecyclerView.LayoutParams) layoutParams).getViewLayoutPosition();
            if (viewLayoutPosition < 0) {
                outRect.set(0, 0, 0, 0);
                return;
            }
            if (viewLayoutPosition == 0) {
                outRect.set(0, j.this.f83939f, 0, 0);
                return;
            }
            if (viewLayoutPosition > 0 && j.this.f83938e.get(viewLayoutPosition) != null) {
                long j10 = 1000;
                if (!w.J(n.r(((HistoryContentObj) j.this.f83938e.get(viewLayoutPosition - 1)).getTimestamp()) * j10, n.r(((HistoryContentObj) j.this.f83938e.get(viewLayoutPosition)).getTimestamp()) * j10)) {
                    outRect.set(0, j.this.f83939f, 0, 0);
                    return;
                }
            }
            outRect.set(0, 0, 0, 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(@dl.d Canvas c10, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{c10, parent, state}, this, changeQuickRedirect, false, 32050, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(c10, "c");
            f0.p(parent, "parent");
            f0.p(state, "state");
            super.onDraw(c10, parent, state);
            int paddingLeft = parent.getPaddingLeft();
            int width = parent.getWidth() - parent.getPaddingRight();
            int childCount = parent.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = parent.getChildAt(i10);
                ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                f0.n(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                int viewLayoutPosition = layoutParams2.getViewLayoutPosition();
                if (viewLayoutPosition >= 0) {
                    if (viewLayoutPosition == 0) {
                        j jVar = j.this;
                        f0.o(child, "child");
                        j.N3(jVar, c10, paddingLeft, width, child, layoutParams2, 0);
                    } else if (viewLayoutPosition > 0 && j.this.f83938e.get(viewLayoutPosition) != null) {
                        long j10 = 1000;
                        if (!w.J(n.r(((HistoryContentObj) j.this.f83938e.get(viewLayoutPosition - 1)).getTimestamp()) * j10, j10 * n.r(((HistoryContentObj) j.this.f83938e.get(viewLayoutPosition)).getTimestamp()))) {
                            j jVar2 = j.this;
                            f0.o(child, "child");
                            j.N3(jVar2, c10, paddingLeft, width, child, layoutParams2, viewLayoutPosition);
                        }
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(@dl.d Canvas c10, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{c10, parent, state}, this, changeQuickRedirect, false, 32051, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(c10, "c");
            f0.p(parent, "parent");
            f0.p(state, "state");
            super.onDrawOver(c10, parent, state);
            RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
            f0.n(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int iFindFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
            if (iFindFirstVisibleItemPosition <= -1 || iFindFirstVisibleItemPosition >= j.this.f83938e.size() - 1) {
                return;
            }
            String time = w.o(((com.max.hbcommon.base.d) j.this).mContext, ((HistoryContentObj) j.this.f83938e.get(iFindFirstVisibleItemPosition)).getTimestamp());
            RecyclerView.LayoutManager layoutManager2 = parent.getLayoutManager();
            f0.n(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            View viewFindViewByPosition = ((LinearLayoutManager) layoutManager2).findViewByPosition(iFindFirstVisibleItemPosition);
            int paddingLeft = parent.getPaddingLeft();
            int width = parent.getWidth() - parent.getPaddingRight();
            int i10 = iFindFirstVisibleItemPosition + 1;
            if (i10 < j.this.f83938e.size()) {
                long j10 = 1000;
                if (!w.J(n.r(((HistoryContentObj) j.this.f83938e.get(i10)).getTimestamp()) * j10, n.r(((HistoryContentObj) j.this.f83938e.get(iFindFirstVisibleItemPosition)).getTimestamp()) * j10) && viewFindViewByPosition != null && viewFindViewByPosition.getBottom() < j.this.f83939f) {
                    j jVar = j.this;
                    int bottom = viewFindViewByPosition.getBottom() - j.this.f83939f;
                    int bottom2 = viewFindViewByPosition.getBottom();
                    f0.o(time, "time");
                    j.M3(jVar, c10, paddingLeft, width, bottom, bottom2, time);
                    return;
                }
            }
            j jVar2 = j.this;
            int top = parent.getTop();
            int top2 = parent.getTop() + j.this.f83939f;
            f0.o(time, "time");
            j.M3(jVar2, c10, paddingLeft, width, top, top2, time);
        }
    }

    /* JADX INFO: compiled from: HistoryTypeFragment.kt */
    public static final class f implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 32053, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            j.this.f83936c = 0;
            j.this.e4();
        }
    }

    /* JADX INFO: compiled from: HistoryTypeFragment.kt */
    public static final class g implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 32054, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            j.this.f83936c += 30;
            j.this.e4();
        }
    }

    /* JADX INFO: compiled from: HistoryTypeFragment.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: HistoryTypeFragment.kt */
        public static final class a implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f83962a;

            a(j jVar) {
                this.f83962a = jVar;
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(@dl.d Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 32057, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(dialog, "dialog");
                j jVar = this.f83962a;
                j.L3(jVar, j.W3(jVar));
                l lVar = this.f83962a.f83942i;
                if (lVar == null) {
                    f0.S("mEditListener");
                    lVar = null;
                }
                lVar.Z(false);
                this.f83962a.j4();
                dialog.dismiss();
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(@dl.d Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 32056, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(dialog, "dialog");
                dialog.dismiss();
            }
        }

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32055, new Class[]{View.class}, Void.TYPE).isSupported && j.V3(j.this)) {
                com.max.xiaoheihe.view.l.D(((com.max.hbcommon.base.d) j.this).mContext, "", ((com.max.hbcommon.base.d) j.this).mContext.getString(R.string.confirm_dlt), ((com.max.hbcommon.base.d) j.this).mContext.getString(R.string.confirm), ((com.max.hbcommon.base.d) j.this).mContext.getString(R.string.cancel), new a(j.this));
            }
        }
    }

    /* JADX INFO: compiled from: HistoryTypeFragment.kt */
    public static final class i implements BottomButtonLeftItemView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView.a
        public void a(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32058, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (z10) {
                j.X3(j.this, true);
            } else {
                j.X3(j.this, false);
            }
            b bVar = j.this.f83937d;
            if (bVar == null) {
                f0.S("mAdapter");
                bVar = null;
            }
            bVar.notifyDataSetChanged();
        }
    }

    public static final /* synthetic */ void L3(j jVar, boolean z10) {
        if (PatchProxy.proxy(new Object[]{jVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 32027, new Class[]{j.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        jVar.b4(z10);
    }

    public static final /* synthetic */ void M3(j jVar, Canvas canvas, int i10, int i11, int i12, int i13, String str) {
        Object[] objArr = {jVar, canvas, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 32031, new Class[]{j.class, Canvas.class, cls, cls, cls, cls, String.class}, Void.TYPE).isSupported) {
            return;
        }
        jVar.c4(canvas, i10, i11, i12, i13, str);
    }

    public static final /* synthetic */ void N3(j jVar, Canvas canvas, int i10, int i11, View view, RecyclerView.LayoutParams layoutParams, int i12) {
        Object[] objArr = {jVar, canvas, new Integer(i10), new Integer(i11), view, layoutParams, new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 32030, new Class[]{j.class, Canvas.class, cls, cls, View.class, RecyclerView.LayoutParams.class, cls}, Void.TYPE).isSupported) {
            return;
        }
        jVar.d4(canvas, i10, i11, view, layoutParams, i12);
    }

    public static final /* synthetic */ boolean V3(j jVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jVar}, null, changeQuickRedirect, true, 32026, new Class[]{j.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : jVar.f4();
    }

    public static final /* synthetic */ boolean W3(j jVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jVar}, null, changeQuickRedirect, true, 32028, new Class[]{j.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : jVar.h4();
    }

    public static final /* synthetic */ void X3(j jVar, boolean z10) {
        if (PatchProxy.proxy(new Object[]{jVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 32029, new Class[]{j.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        jVar.i4(z10);
    }

    public static final /* synthetic */ void Z3(j jVar) {
        if (PatchProxy.proxy(new Object[]{jVar}, null, changeQuickRedirect, true, 32032, new Class[]{j.class}, Void.TYPE).isSupported) {
            return;
        }
        jVar.showError();
    }

    public static final /* synthetic */ void a4(j jVar, ArrayList arrayList) {
        if (PatchProxy.proxy(new Object[]{jVar, arrayList}, null, changeQuickRedirect, true, 32033, new Class[]{j.class, ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        jVar.k4(arrayList);
    }

    @SuppressLint({"AutoDispose"})
    private final void b4(boolean z10) {
        String string;
        String str;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32023, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String str2 = null;
        if (z10) {
            String str3 = this.f83935b;
            if (str3 == null) {
                f0.S("page_type");
                str3 = null;
            }
            if (f0.g(str3, "all")) {
                str = "delete_all";
            } else {
                str = this.f83935b;
                if (str == null) {
                    f0.S("page_type");
                    str = null;
                }
            }
            string = null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            for (HistoryContentObj historyContentObj : this.f83938e) {
                if (historyContentObj.isChecked()) {
                    if (sb2.length() > 0) {
                        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                    sb2.append(historyContentObj.getId());
                    if (sb3.length() > 0) {
                        sb3.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                    sb3.append(historyContentObj.getType());
                }
            }
            String string2 = sb2.toString();
            string = sb3.toString();
            str2 = string2;
            str = null;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().N9(str2, string, str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private final void c4(Canvas canvas, int i10, int i11, int i12, int i13, String str) {
        Object[] objArr = {canvas, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 32018, new Class[]{Canvas.class, cls, cls, cls, cls, String.class}, Void.TYPE).isSupported) {
            return;
        }
        int iF = ViewUtils.f(this.mContext, 12.0f);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color));
        canvas.drawRect(i10, i12, i11, i13, paint);
        paint.setColor(com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_1_color));
        paint.setStrokeWidth(this.mContext.getResources().getDimension(R.dimen.divider_height));
        paint.setFakeBoldText(true);
        paint.setColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
        paint.setTextSize(com.max.xiaoheihe.utils.d.V(R.dimen.text_size_14));
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, i10 + iF, i13 - ((this.f83939f / 2) - (rect.height() / 2)), paint);
    }

    private final void d4(Canvas canvas, int i10, int i11, View view, RecyclerView.LayoutParams layoutParams, int i12) {
        Object[] objArr = {canvas, new Integer(i10), new Integer(i11), view, layoutParams, new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 32017, new Class[]{Canvas.class, cls, cls, View.class, RecyclerView.LayoutParams.class, cls}, Void.TYPE).isSupported) {
            return;
        }
        int iF = ViewUtils.f(this.mContext, 12.0f);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color));
        canvas.drawRect(i10, (view.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f83939f, i11, view.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, paint);
        paint.setColor(com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_1_color));
        paint.setStrokeWidth(this.mContext.getResources().getDimension(R.dimen.divider_height));
        paint.setFakeBoldText(true);
        paint.setColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
        paint.setTextSize(com.max.xiaoheihe.utils.d.V(R.dimen.text_size_14));
        Rect rect = new Rect();
        String strO = w.o(this.mContext, this.f83938e.get(i12).getTimestamp());
        paint.getTextBounds(strO, 0, strO.length(), rect);
        canvas.drawText(strO, view.getPaddingLeft() + iF, (view.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((this.f83939f / 2) - (rect.height() / 2)), paint);
    }

    private final boolean f4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32020, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (com.max.hbcommon.utils.c.w(this.f83938e)) {
            return false;
        }
        Iterator<HistoryContentObj> it = this.f83938e.iterator();
        while (it.hasNext()) {
            if (it.next().isChecked()) {
                return true;
            }
        }
        return false;
    }

    private final void g4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32016, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        s0 s0Var = this.f83941h;
        b bVar = null;
        if (s0Var == null) {
            f0.S("mBinding");
            s0Var = null;
        }
        s0Var.f115355c.setClipToPadding(false);
        s0 s0Var2 = this.f83941h;
        if (s0Var2 == null) {
            f0.S("mBinding");
            s0Var2 = null;
        }
        s0Var2.f115355c.setClipChildren(false);
        s0 s0Var3 = this.f83941h;
        if (s0Var3 == null) {
            f0.S("mBinding");
            s0Var3 = null;
        }
        s0Var3.f115355c.setPadding(0, 0, 0, ViewUtils.f(this.mContext, 54.0f));
        s0 s0Var4 = this.f83941h;
        if (s0Var4 == null) {
            f0.S("mBinding");
            s0Var4 = null;
        }
        s0Var4.f115355c.setLayoutManager(new LinearLayoutManager(this.mContext));
        s0 s0Var5 = this.f83941h;
        if (s0Var5 == null) {
            f0.S("mBinding");
            s0Var5 = null;
        }
        s0Var5.f115355c.addItemDecoration(new e());
        s0 s0Var6 = this.f83941h;
        if (s0Var6 == null) {
            f0.S("mBinding");
            s0Var6 = null;
        }
        RecyclerView recyclerView = s0Var6.f115355c;
        b bVar2 = this.f83937d;
        if (bVar2 == null) {
            f0.S("mAdapter");
        } else {
            bVar = bVar2;
        }
        recyclerView.setAdapter(bVar);
    }

    private final boolean h4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32019, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (com.max.hbcommon.utils.c.w(this.f83938e)) {
            return false;
        }
        Iterator<HistoryContentObj> it = this.f83938e.iterator();
        while (it.hasNext()) {
            if (!it.next().isChecked()) {
                return false;
            }
        }
        return true;
    }

    private final void i4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32021, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(this.f83938e)) {
            return;
        }
        Iterator<HistoryContentObj> it = this.f83938e.iterator();
        while (it.hasNext()) {
            it.next().setChecked(z10);
        }
    }

    private final void k4(ArrayList<HistoryContentObj> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 32024, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (this.f83936c == 0) {
            this.f83938e.clear();
        }
        if (!com.max.hbcommon.utils.c.w(arrayList)) {
            this.f83938e.addAll(arrayList);
        }
        b bVar = this.f83937d;
        if (bVar == null) {
            f0.S("mAdapter");
            bVar = null;
        }
        bVar.notifyDataSetChanged();
        if (com.max.hbcommon.utils.c.w(this.f83938e)) {
            showEmpty(R.drawable.common_tag_history_32x38, R.string.no_history);
        }
    }

    @SuppressLint({"AutoDispose"})
    public final void e4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32022, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.f83935b;
        if (str == null) {
            f0.S("page_type");
            str = null;
        }
        addDisposable((io.reactivex.disposables.b) eVarA.F0(str, this.f83936c, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32012, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        s0 s0VarC = s0.c(this.mInflater);
        f0.o(s0VarC, "inflate(mInflater)");
        this.f83941h = s0VarC;
        s0 s0Var = null;
        if (s0VarC == null) {
            f0.S("mBinding");
            s0VarC = null;
        }
        setContentView(s0VarC);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(f83930l) : null;
        if (string == null) {
            string = "all";
        }
        this.f83935b = string;
        this.f83939f = ViewUtils.f(this.mContext, 32.0f);
        this.f83940g = ViewUtils.f(this.mContext, 4.0f);
        this.f83937d = new b(this.mContext, this.f83938e, R.layout.item_visited_history);
        j4();
        g4();
        s0 s0Var2 = this.f83941h;
        if (s0Var2 == null) {
            f0.S("mBinding");
            s0Var2 = null;
        }
        s0Var2.f115356d.S(new f());
        s0 s0Var3 = this.f83941h;
        if (s0Var3 == null) {
            f0.S("mBinding");
        } else {
            s0Var = s0Var3;
        }
        s0Var.f115356d.f0(new g());
        showLoading();
        e4();
    }

    public final void j4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32015, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        l lVar = this.f83942i;
        b bVar = null;
        if (lVar == null) {
            f0.S("mEditListener");
            lVar = null;
        }
        if (lVar.R0()) {
            s0 s0Var = this.f83941h;
            if (s0Var == null) {
                f0.S("mBinding");
                s0Var = null;
            }
            s0Var.f115354b.setVisibility(0);
            s0 s0Var2 = this.f83941h;
            if (s0Var2 == null) {
                f0.S("mBinding");
                s0Var2 = null;
            }
            s0Var2.f115357e.setVisibility(0);
            s0 s0Var3 = this.f83941h;
            if (s0Var3 == null) {
                f0.S("mBinding");
                s0Var3 = null;
            }
            s0Var3.f115356d.b0(false);
            s0 s0Var4 = this.f83941h;
            if (s0Var4 == null) {
                f0.S("mBinding");
                s0Var4 = null;
            }
            s0Var4.f115356d.i0(false);
        } else {
            s0 s0Var5 = this.f83941h;
            if (s0Var5 == null) {
                f0.S("mBinding");
                s0Var5 = null;
            }
            s0Var5.f115354b.setVisibility(8);
            s0 s0Var6 = this.f83941h;
            if (s0Var6 == null) {
                f0.S("mBinding");
                s0Var6 = null;
            }
            s0Var6.f115357e.setVisibility(8);
            s0 s0Var7 = this.f83941h;
            if (s0Var7 == null) {
                f0.S("mBinding");
                s0Var7 = null;
            }
            s0Var7.f115356d.b0(true);
            s0 s0Var8 = this.f83941h;
            if (s0Var8 == null) {
                f0.S("mBinding");
                s0Var8 = null;
            }
            s0Var8.f115356d.i0(true);
        }
        b bVar2 = this.f83937d;
        if (bVar2 == null) {
            f0.S("mAdapter");
        } else {
            bVar = bVar2;
        }
        bVar.notifyDataSetChanged();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 32013, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        super.onAttach(context);
        if (getParentFragment() instanceof l) {
            androidx.activity.result.b parentFragment = getParentFragment();
            f0.n(parentFragment, "null cannot be cast to non-null type com.max.xiaoheihe.module.favour.OnEditStateChangeListener");
            this.f83942i = (l) parentFragment;
        } else {
            throw new RuntimeException(getParentFragment() + " or " + context + " must implement OnEditStateChangeListener");
        }
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32025, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        this.f83936c = 0;
        e4();
    }

    @Override // com.max.hbcommon.base.d
    public void registerEvents() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32014, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        s0 s0Var = this.f83941h;
        s0 s0Var2 = null;
        if (s0Var == null) {
            f0.S("mBinding");
            s0Var = null;
        }
        s0Var.f115354b.setRightClickListener(new h());
        s0 s0Var3 = this.f83941h;
        if (s0Var3 == null) {
            f0.S("mBinding");
        } else {
            s0Var2 = s0Var3;
        }
        s0Var2.f115354b.setCheckboxListener(new i());
    }
}
