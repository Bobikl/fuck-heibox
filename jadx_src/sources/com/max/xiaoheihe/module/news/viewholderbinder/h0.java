package com.max.xiaoheihe.module.news.viewholderbinder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.video.AbsVideoView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.game.a2;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.open.SocialConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: NewsViewHolderBinder.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public abstract class h0 extends cb.c<FeedsContentBaseObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final a f91435i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f91436j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private g0 f91437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private Context f91438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private com.max.hbcommon.base.adapter.u<?> f91439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.news.adapter.a.b f91440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f91441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private a2 f91442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private AbsVideoView f91443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private WeakReference<com.max.hbcommon.base.adapter.s.e> f91444h;

    /* JADX INFO: compiled from: NewsViewHolderBinder.kt */
    @t0({"SMAP\nNewsViewHolderBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewsViewHolderBinder.kt\ncom/max/xiaoheihe/module/news/viewholderbinder/NewsViewHolderBinder$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,360:1\n766#2:361\n857#2,2:362\n1855#2,2:364\n*S KotlinDebug\n*F\n+ 1 NewsViewHolderBinder.kt\ncom/max/xiaoheihe/module/news/viewholderbinder/NewsViewHolderBinder$Companion\n*L\n90#1:361\n90#1:362,2\n92#1:364,2\n*E\n"})
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private final void a(String str, int i10, SpannableStringBuilder spannableStringBuilder, Context context) {
            if (PatchProxy.proxy(new Object[]{str, new Integer(i10), spannableStringBuilder, context}, this, changeQuickRedirect, false, 42794, new Class[]{String.class, Integer.TYPE, SpannableStringBuilder.class, Context.class}, Void.TYPE).isSupported || str == null) {
                return;
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.text_size_10);
            int color = context.getResources().getColor(R.color.white);
            int iF = ViewUtils.f(context, 2.0f);
            spannableStringBuilder.append((CharSequence) str).append(" ");
            spannableStringBuilder.setSpan(new com.max.hbcustomview.spans.b(new com.max.hbcustomview.f(str, dimensionPixelSize, color, i10, i10, iF, ViewUtils.f(context, 4.0f), ViewUtils.f(context, 2.0f)), 0), 0, str.length(), 33);
        }

        @xh.m
        public final void b(@dl.d BBSLinkObj data) {
            if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 42792, new Class[]{BBSLinkObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(data, "data");
            if (com.max.xiaoheihe.module.bbs.utils.b.x(data.getLink_tag())) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (data.getNews_thumb() != null) {
                com.max.hbcommon.utils.d.b("zzzznewsthumes", "data.news_thumb==" + data.getNews_thumb());
                String news_thumb = data.getNews_thumb();
                kotlin.jvm.internal.f0.o(news_thumb, "data.news_thumb");
                arrayList.add(news_thumb);
            }
            if (!com.max.hbcommon.utils.c.u(data.getText())) {
                List<BBSTextObj> listB = com.max.hbutils.utils.k.b(data.getText(), BBSTextObj.class);
                if (!com.max.hbcommon.utils.c.w(listB)) {
                    for (BBSTextObj bBSTextObj : listB) {
                        if (arrayList.size() >= 2) {
                            break;
                        }
                        if (bBSTextObj != null && kotlin.jvm.internal.f0.g(SocialConstants.PARAM_IMG_URL, bBSTextObj.getType())) {
                            com.max.hbcommon.utils.d.b("zzzznewsthumes", " it.url==" + bBSTextObj.getUrl());
                            String url = bBSTextObj.getUrl();
                            kotlin.jvm.internal.f0.o(url, "it.url");
                            arrayList.add(url);
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String str = (String) obj;
                List<String> thumbs = data.getThumbs();
                if (!(thumbs != null ? thumbs.contains(str) : false)) {
                    arrayList2.add(obj);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                com.max.hbimage.b.j0((String) it.next());
            }
        }

        public final void c(@dl.d BBSLinkObj data, @dl.d SpannableStringBuilder builder, @dl.d Context context) {
            KeyDescObj special_tag;
            if (PatchProxy.proxy(new Object[]{data, builder, context}, this, changeQuickRedirect, false, 42793, new Class[]{BBSLinkObj.class, SpannableStringBuilder.class, Context.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(data, "data");
            kotlin.jvm.internal.f0.p(builder, "builder");
            kotlin.jvm.internal.f0.p(context, "context");
            if (com.max.hbcommon.utils.c.u(data.getTitle()) && (special_tag = data.getSpecial_tag()) != null) {
                h0.f91435i.a(special_tag.getName(), com.max.xiaoheihe.utils.d.e1(special_tag.getColor()), builder, context);
            }
            builder.append((CharSequence) data.getDescription());
            SearchHelper.f91573a.a().h(builder);
        }

        @xh.m
        public final void d(@dl.e TextView textView, @dl.e String str, @dl.e String str2, int i10) {
            if (PatchProxy.proxy(new Object[]{textView, str, str2, new Integer(i10)}, this, changeQuickRedirect, false, 42791, new Class[]{TextView.class, String.class, String.class, Integer.TYPE}, Void.TYPE).isSupported || textView == null) {
                return;
            }
            Context context = textView.getContext();
            if (com.max.hbcommon.utils.c.u(str)) {
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
            a aVar = h0.f91435i;
            kotlin.jvm.internal.f0.o(context, "context");
            aVar.a(str2, i10, spannableStringBuilder, context);
            spannableStringBuilder.append((CharSequence) str);
            SearchHelper.f91573a.a().h(spannableStringBuilder);
            textView.setText(spannableStringBuilder);
        }
    }

    /* JADX INFO: compiled from: NewsViewHolderBinder.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FeedsContentBaseObj f91446c;

        b(FeedsContentBaseObj feedsContentBaseObj) {
            this.f91446c = feedsContentBaseObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42795, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (h0.this.o() != null) {
                com.max.xiaoheihe.module.news.adapter.a.b bVarO = h0.this.o();
                kotlin.jvm.internal.f0.m(bVarO);
                List<?> dataList = h0.this.k().getDataList();
                kotlin.jvm.internal.f0.o(dataList, "adapter.dataList");
                bVarO.G2(CollectionsKt___CollectionsKt.Y2(dataList, this.f91446c));
            }
            com.max.hbcommon.utils.k.b(this.f91446c.getAd_report());
            com.max.xiaoheihe.module.bbs.utils.b.C(h0.this.m(), this.f91446c);
        }
    }

    /* JADX INFO: compiled from: NewsViewHolderBinder.kt */
    public static final class c implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f91447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0 f91448c;

        c(BBSLinkObj bBSLinkObj, h0 h0Var) {
            this.f91447b = bBSLinkObj;
            this.f91448c = h0Var;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View it) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 42796, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            BBSLinkObj bBSLinkObj = this.f91447b;
            h0 h0Var = this.f91448c;
            kotlin.jvm.internal.f0.o(it, "it");
            h0.f(bBSLinkObj, h0Var, it);
            return true;
        }
    }

    /* JADX INFO: compiled from: NewsViewHolderBinder.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f91449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0 f91450c;

        d(BBSLinkObj bBSLinkObj, h0 h0Var) {
            this.f91449b = bBSLinkObj;
            this.f91450c = h0Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 42797, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BBSLinkObj bBSLinkObj = this.f91449b;
            h0 h0Var = this.f91450c;
            kotlin.jvm.internal.f0.o(it, "it");
            h0.f(bBSLinkObj, h0Var, it);
        }
    }

    /* JADX INFO: compiled from: NewsViewHolderBinder.kt */
    public static final class e implements com.max.xiaoheihe.module.news.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f91452b;

        e(BBSLinkObj bBSLinkObj) {
            this.f91452b = bBSLinkObj;
        }

        @Override // com.max.xiaoheihe.module.news.g.e
        public final void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42798, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            h0.this.j(this.f91452b);
        }
    }

    /* JADX INFO: compiled from: NewsViewHolderBinder.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f91453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f91454c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h0 f91455d;

        /* JADX INFO: compiled from: NewsViewHolderBinder.kt */
        public static final class a implements com.max.xiaoheihe.module.news.g.e {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f91456a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSLinkObj f91457b;

            a(h0 h0Var, BBSLinkObj bBSLinkObj) {
                this.f91456a = h0Var;
                this.f91457b = bBSLinkObj;
            }

            @Override // com.max.xiaoheihe.module.news.g.e
            public final void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42800, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                this.f91456a.j(this.f91457b);
            }
        }

        f(View view, BBSLinkObj bBSLinkObj, h0 h0Var) {
            this.f91453b = view;
            this.f91454c = bBSLinkObj;
            this.f91455d = h0Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42799, new Class[]{View.class}, Void.TYPE).isSupported && (this.f91453b.getContext() instanceof FragmentActivity)) {
                Context context = this.f91453b.getContext();
                kotlin.jvm.internal.f0.n(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                com.max.xiaoheihe.module.news.g gVarC4 = com.max.xiaoheihe.module.news.g.c4(this.f91454c.getLinkid(), this.f91454c.getFeedback(), this.f91454c.getH_src(), "2");
                gVarC4.g4(new a(this.f91455d, this.f91454c));
                gVarC4.show(((FragmentActivity) context).getSupportFragmentManager(), "NegativeFeedback");
            }
        }
    }

    public h0(@dl.d g0 param) {
        kotlin.jvm.internal.f0.p(param, "param");
        this.f91437a = param;
        this.f91438b = param.c();
        this.f91439c = this.f91437a.a();
        this.f91440d = this.f91437a.e();
        this.f91441e = this.f91437a.g();
        this.f91442f = this.f91437a.b();
        this.f91443g = this.f91437a.d();
    }

    @xh.m
    public static final void H(@dl.e TextView textView, @dl.e String str, @dl.e String str2, int i10) {
        if (PatchProxy.proxy(new Object[]{textView, str, str2, new Integer(i10)}, null, changeQuickRedirect, true, 42787, new Class[]{TextView.class, String.class, String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f91435i.d(textView, str, str2, i10);
    }

    private static final void J(BBSLinkObj bBSLinkObj, h0 h0Var, View view) {
        if (PatchProxy.proxy(new Object[]{bBSLinkObj, h0Var, view}, null, changeQuickRedirect, true, 42786, new Class[]{BBSLinkObj.class, h0.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = view.getContext();
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity != null) {
            com.max.xiaoheihe.module.news.g gVarC4 = com.max.xiaoheihe.module.news.g.c4(bBSLinkObj.getLinkid(), bBSLinkObj.getFeedback(), bBSLinkObj.getH_src(), "2");
            gVarC4.g4(h0Var.new e(bBSLinkObj));
            gVarC4.show(fragmentActivity.getSupportFragmentManager(), "NegativeFeedback");
        }
    }

    private final boolean L() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42780, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : ad.a.a(ad.a.f1198e, false);
    }

    public static final /* synthetic */ void f(BBSLinkObj bBSLinkObj, h0 h0Var, View view) {
        if (PatchProxy.proxy(new Object[]{bBSLinkObj, h0Var, view}, null, changeQuickRedirect, true, 42790, new Class[]{BBSLinkObj.class, h0.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        J(bBSLinkObj, h0Var, view);
    }

    private final void h(com.max.hbcommon.base.adapter.s.e eVar, FeedsContentBaseObj feedsContentBaseObj) {
        if (PatchProxy.proxy(new Object[]{eVar, feedsContentBaseObj}, this, changeQuickRedirect, false, 42774, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewI = eVar.i(R.id.div);
        if (viewI == null) {
            viewI = eVar.i(R.id.divider);
        }
        if (viewI != null) {
            if (feedsContentBaseObj.isShowDivider()) {
                viewI.setVisibility(0);
            } else {
                viewI.setVisibility(8);
            }
        }
    }

    @xh.m
    public static final void v(@dl.d BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{bBSLinkObj}, null, changeQuickRedirect, true, 42788, new Class[]{BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f91435i.b(bBSLinkObj);
    }

    public final void A(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 42771, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "<set-?>");
        this.f91438b = context;
    }

    public final void B(@dl.e AbsVideoView absVideoView) {
        this.f91443g = absVideoView;
    }

    public final void C(@dl.e com.max.xiaoheihe.module.news.adapter.a.b bVar) {
        this.f91440d = bVar;
    }

    public final void D(@dl.d g0 g0Var) {
        if (PatchProxy.proxy(new Object[]{g0Var}, this, changeQuickRedirect, false, 42770, new Class[]{g0.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(g0Var, "<set-?>");
        this.f91437a = g0Var;
    }

    public final void E(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42776, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        if (data.getAd_report() != null && !kotlin.jvm.internal.f0.g("1", data.getIsReported())) {
            com.max.hbcommon.utils.k.c(data.getAd_report());
            data.setIsReported("1");
        }
        View viewB = viewHolder.b();
        kotlin.jvm.internal.f0.o(viewB, "viewHolder.getItemView()");
        viewB.setTag(data);
        viewB.setOnClickListener(new b(data));
    }

    public final void F(boolean z10) {
        this.f91441e = z10;
    }

    public final void G(@dl.d TextView tv_title, @dl.d BBSLinkObj data, @dl.e String str) {
        int iE1 = 0;
        if (PatchProxy.proxy(new Object[]{tv_title, data, str}, this, changeQuickRedirect, false, 42782, new Class[]{TextView.class, BBSLinkObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(tv_title, "tv_title");
        kotlin.jvm.internal.f0.p(data, "data");
        String name = null;
        KeyDescObj special_tag = data.getSpecial_tag();
        if (special_tag != null) {
            name = special_tag.getName();
            iE1 = com.max.xiaoheihe.utils.d.e1(special_tag.getColor());
        }
        f91435i.d(tv_title, str, name, iE1);
    }

    public final void I(@dl.d View contentView, @dl.d View notInterestedImageView, @dl.d BBSLinkObj data, boolean z10) {
        if (PatchProxy.proxy(new Object[]{contentView, notInterestedImageView, data, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42779, new Class[]{View.class, View.class, BBSLinkObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(contentView, "contentView");
        kotlin.jvm.internal.f0.p(notInterestedImageView, "notInterestedImageView");
        kotlin.jvm.internal.f0.p(data, "data");
        if (L()) {
            K(notInterestedImageView, data, z10);
            return;
        }
        if (data.getFeedback() == null || data.getFeedback().size() <= 0 || !z10) {
            contentView.setOnLongClickListener(null);
            notInterestedImageView.setVisibility(8);
        } else {
            contentView.setOnLongClickListener(new c(data, this));
            notInterestedImageView.setVisibility(0);
            notInterestedImageView.setOnClickListener(new d(data, this));
        }
    }

    public final void K(@dl.d View notInterestedImageView, @dl.d BBSLinkObj data, boolean z10) {
        if (PatchProxy.proxy(new Object[]{notInterestedImageView, data, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42778, new Class[]{View.class, BBSLinkObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(notInterestedImageView, "notInterestedImageView");
        kotlin.jvm.internal.f0.p(data, "data");
        if (data.getFeedback() == null || data.getFeedback().size() <= 0 || !z10) {
            notInterestedImageView.setVisibility(8);
        } else {
            notInterestedImageView.setVisibility(0);
            notInterestedImageView.setOnClickListener(new f(notInterestedImageView, data, this));
        }
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, FeedsContentBaseObj feedsContentBaseObj) {
        if (PatchProxy.proxy(new Object[]{eVar, feedsContentBaseObj}, this, changeQuickRedirect, false, 42789, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        g(eVar, feedsContentBaseObj);
    }

    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42773, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        this.f91444h = new WeakReference<>(viewHolder);
        data.setIndex(String.valueOf(viewHolder.getAbsoluteAdapterPosition()));
        u(viewHolder, data);
        i(viewHolder, data);
        h(viewHolder, data);
    }

    public abstract void i(@dl.d com.max.hbcommon.base.adapter.s.e eVar, @dl.d FeedsContentBaseObj feedsContentBaseObj);

    public void j(@dl.d BBSLinkObj data) {
        com.max.hbcommon.base.adapter.s.e eVar;
        if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 42781, new Class[]{BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(data, "data");
        int absoluteAdapterPosition = -1;
        if (L()) {
            List<?> dataList = this.f91439c.getDataList();
            kotlin.jvm.internal.f0.o(dataList, "adapter.dataList");
            absoluteAdapterPosition = CollectionsKt___CollectionsKt.Y2(dataList, data);
        } else {
            WeakReference<com.max.hbcommon.base.adapter.s.e> weakReference = this.f91444h;
            if (weakReference != null && (eVar = weakReference.get()) != null) {
                absoluteAdapterPosition = eVar.getAbsoluteAdapterPosition();
            }
        }
        if (absoluteAdapterPosition < 0 || absoluteAdapterPosition >= this.f91439c.getDataList().size()) {
            return;
        }
        this.f91439c.getDataList().remove(absoluteAdapterPosition);
        this.f91439c.notifyItemRemoved(absoluteAdapterPosition);
        com.max.xiaoheihe.module.news.adapter.a.b bVar = this.f91440d;
        if (bVar != null) {
            bVar.B3(absoluteAdapterPosition);
        }
    }

    @dl.d
    public final com.max.hbcommon.base.adapter.u<?> k() {
        return this.f91439c;
    }

    @dl.e
    public final a2 l() {
        return this.f91442f;
    }

    @dl.d
    public final Context m() {
        return this.f91438b;
    }

    @dl.e
    public final AbsVideoView n() {
        return this.f91443g;
    }

    @dl.e
    public final com.max.xiaoheihe.module.news.adapter.a.b o() {
        return this.f91440d;
    }

    @dl.d
    public final g0 p() {
        return this.f91437a;
    }

    public final boolean q() {
        return this.f91441e;
    }

    public final void r(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj basedata) {
        if (PatchProxy.proxy(new Object[]{viewHolder, basedata}, this, changeQuickRedirect, false, 42783, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(basedata, "basedata");
        BBSLinkObj bBSLinkObj = (BBSLinkObj) basedata;
        TextView textView = (TextView) viewHolder.i(R.id.tv_desc);
        if (bBSLinkObj.getLabel() == null || !kotlin.jvm.internal.f0.g(bBSLinkObj.getLabel(), "advertise")) {
            textView.setText(bBSLinkObj.getSource());
        } else {
            textView.setText(bBSLinkObj.getSource() + this.f91438b.getString(R.string.item_ad_text));
        }
        t(viewHolder, basedata);
    }

    public final void s(@dl.d BBSUserSectionView bbsUserSection, @dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj basedata) {
        if (PatchProxy.proxy(new Object[]{bbsUserSection, viewHolder, basedata}, this, changeQuickRedirect, false, 42784, new Class[]{BBSUserSectionView.class, com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(bbsUserSection, "bbsUserSection");
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(basedata, "basedata");
        BBSLinkObj bBSLinkObj = (BBSLinkObj) basedata;
        if (bBSLinkObj.getLabel() == null || !kotlin.jvm.internal.f0.g(bBSLinkObj.getLabel(), "advertise")) {
            bbsUserSection.setDesc(bBSLinkObj.getSource());
        } else {
            bbsUserSection.setDesc(bBSLinkObj.getSource() + this.f91438b.getString(R.string.item_ad_text));
        }
        t(viewHolder, basedata);
    }

    public final void t(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj basedata) {
        if (PatchProxy.proxy(new Object[]{viewHolder, basedata}, this, changeQuickRedirect, false, 42785, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(basedata, "basedata");
        BBSLinkObj bBSLinkObj = (BBSLinkObj) basedata;
        String img = bBSLinkObj.getImg();
        ImageView imageView = (ImageView) viewHolder.i(R.id.iv_img);
        TextView textView = (TextView) viewHolder.i(R.id.tv_title);
        if (bBSLinkObj.getAd_report() != null && !kotlin.jvm.internal.f0.g("1", bBSLinkObj.getIsReported())) {
            com.max.hbcommon.utils.k.c(bBSLinkObj.getAd_report());
            bBSLinkObj.setIsReported("1");
        }
        if (textView != null) {
            if (com.max.hbcommon.utils.c.u(bBSLinkObj.getTitle())) {
                textView.setVisibility(8);
            } else {
                textView.setText(bBSLinkObj.getTitle());
                textView.setVisibility(0);
            }
        }
        w(viewHolder, bBSLinkObj);
        E(viewHolder, bBSLinkObj);
        if (imageView != null) {
            com.max.hbimage.b.K(img, imageView);
        }
    }

    public void u(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42775, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        StringBuilder sb2 = new StringBuilder();
        List<?> dataList = this.f91439c.getDataList();
        kotlin.jvm.internal.f0.o(dataList, "adapter.dataList");
        sb2.append(CollectionsKt___CollectionsKt.Y2(dataList, data));
        sb2.append("");
        data.setIndex(sb2.toString());
        viewHolder.n(99, this);
    }

    public abstract void w(@dl.d com.max.hbcommon.base.adapter.s.e eVar, @dl.d BBSLinkObj bBSLinkObj);

    public final void x(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42777, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        String strT = com.max.xiaoheihe.module.bbs.utils.b.t(this.f91438b, data);
        if (com.max.hbcommon.utils.c.u(strT)) {
            viewHolder.i(R.id.tv_desc).setVisibility(8);
        } else {
            viewHolder.p(R.id.tv_desc, strT);
            viewHolder.i(R.id.tv_desc).setVisibility(0);
        }
        if (com.max.hbcommon.utils.c.u(data.getComment_num())) {
            viewHolder.i(R.id.ll_comment).setVisibility(8);
            return;
        }
        viewHolder.p(R.id.tv_comment, data.getComment_num());
        View viewI = viewHolder.i(R.id.tv_comment);
        kotlin.jvm.internal.f0.n(viewI, "null cannot be cast to non-null type android.widget.TextView");
        bb.d.d((TextView) viewI, 2);
        viewHolder.i(R.id.ll_comment).setVisibility(0);
    }

    public final void y(@dl.d com.max.hbcommon.base.adapter.u<?> uVar) {
        if (PatchProxy.proxy(new Object[]{uVar}, this, changeQuickRedirect, false, 42772, new Class[]{com.max.hbcommon.base.adapter.u.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(uVar, "<set-?>");
        this.f91439c = uVar;
    }

    public final void z(@dl.e a2 a2Var) {
        this.f91442f = a2Var;
    }
}
