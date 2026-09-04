package com.max.xiaoheihe.module.account.specificsearch;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.hbsearch.SearchNewFragment;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.WikiArticelObj;
import com.max.xiaoheihe.bean.favour.HistoryContentObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.favour.j;
import com.max.xiaoheihe.module.game.component.GamePriceView;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.game.z;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: SearchUserHistoryAdapter.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nSearchUserHistoryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchUserHistoryAdapter.kt\ncom/max/xiaoheihe/module/account/specificsearch/SearchUserHistoryAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,203:1\n262#2,2:204\n*S KotlinDebug\n*F\n+ 1 SearchUserHistoryAdapter.kt\ncom/max/xiaoheihe/module/account/specificsearch/SearchUserHistoryAdapter\n*L\n180#1:204,2\n*E\n"})
@o(parameters = 0)
public final class b extends u<HistoryContentObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f79251d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f79252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final yh.a<String> f79253c;

    /* JADX INFO: compiled from: SearchUserHistoryAdapter.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f79255c;

        a(String str) {
            this.f79255c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25220, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = b.this.f79252b;
            String str = this.f79255c;
            Bundle bundleE = SearchHelper.f91573a.a().e("main");
            bundleE.putString("quick_from", SearchNewFragment.f72186j4);
            b2 b2Var = b2.f124493a;
            com.max.xiaoheihe.base.router.b.y0(context, str, bundleE).A();
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.specificsearch.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SearchUserHistoryAdapter.kt */
    public static final class ViewOnClickListenerC0660b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f79257c;

        ViewOnClickListenerC0660b(BBSLinkObj bBSLinkObj) {
            this.f79257c = bBSLinkObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25221, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.bbs.utils.b.E(b.this.f79252b, this.f79257c);
        }
    }

    /* JADX INFO: compiled from: SearchUserHistoryAdapter.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Intent f79259c;

        c(Intent intent) {
            this.f79259c = intent;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25222, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            b.this.f79252b.startActivity(this.f79259c);
        }
    }

    /* JADX INFO: compiled from: SearchUserHistoryAdapter.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f79260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f79261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f79262d;

        d(String str, b bVar, String str2) {
            this.f79260b = str;
            this.f79261c = bVar;
            this.f79262d = str2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25223, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f79260b)) {
                return;
            }
            String url = this.f79260b;
            f0.o(url, "url");
            if (!kotlin.text.u.v2(url, "http", false, 2, null)) {
                com.max.xiaoheihe.base.router.b.k0(this.f79261c.f79252b, this.f79260b);
                return;
            }
            Intent intent = new Intent(this.f79261c.f79252b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", this.f79260b);
            intent.putExtra("title", this.f79262d);
            this.f79261c.f79252b.startActivity(intent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@dl.d Context context, @dl.d List<? extends HistoryContentObj> dataList, @dl.d yh.a<String> searchQueryGetter) {
        super(context, dataList);
        f0.p(context, "context");
        f0.p(dataList, "dataList");
        f0.p(searchQueryGetter, "searchQueryGetter");
        this.f79252b = context;
        this.f79253c = searchQueryGetter;
    }

    private final boolean o(s.e eVar, HistoryContentObj historyContentObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar, historyContentObj}, this, changeQuickRedirect, false, 25216, new Class[]{s.e.class, HistoryContentObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!(eVar != null && eVar.d() == R.layout.item_go_to_general_search_tip)) {
            return false;
        }
        if (!f0.g(historyContentObj != null ? historyContentObj.getWrapper_type() : null, "search_tips")) {
            return false;
        }
        String strInvoke = this.f79253c.invoke();
        View viewI = eVar.i(R.id.top_divider);
        if (viewI != null) {
            viewI.setVisibility(0);
        }
        TextView textView = (TextView) eVar.i(R.id.tv_search_content);
        if (textView != null) {
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            textView.setText(strInvoke);
        }
        View viewB = eVar.b();
        if (viewB != null) {
            viewB.setOnClickListener(new a(strInvoke));
        }
        return true;
    }

    private final void p(s.e eVar, HistoryContentObj historyContentObj) {
        if (PatchProxy.proxy(new Object[]{eVar, historyContentObj}, this, changeQuickRedirect, false, 25215, new Class[]{s.e.class, HistoryContentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = (TextView) eVar.i(R.id.tv_tag);
        View viewI = eVar.i(R.id.vg_tag);
        TextView textView2 = (TextView) eVar.i(R.id.tv_title);
        ImageView imageView = (ImageView) eVar.i(R.id.iv_check);
        ImageView imageView2 = (ImageView) eVar.i(R.id.iv_img);
        TextView textView3 = (TextView) eVar.i(R.id.tv_extra_tag);
        GamePriceView gamePriceView = (GamePriceView) eVar.i(R.id.gpv);
        View viewI2 = eVar.i(R.id.vg_score);
        int iW = ViewUtils.W(imageView2);
        int iV = ViewUtils.V(imageView2);
        Drawable drawableL = q.l(this.f79252b, iW, iV, iV);
        imageView.setVisibility(8);
        viewI.setBackground(j.f83928j.a(this.f79252b, historyContentObj));
        if (f0.g(historyContentObj.getIs_invalid(), "1")) {
            imageView2.setImageDrawable(drawableL);
            viewI.setVisibility(8);
            textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView2.setText("内容已失效");
            viewI2.setVisibility(8);
            gamePriceView.setVisibility(8);
            textView3.setVisibility(8);
            eVar.itemView.setOnClickListener(null);
            if (com.max.hbcommon.utils.c.u(historyContentObj.getTag_text())) {
                return;
            }
            textView.setText(historyContentObj.getTag_text());
            return;
        }
        viewI.setVisibility(0);
        textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String type = historyContentObj.getType();
        if (type != null) {
            int iHashCode = type.hashCode();
            if (iHashCode != -250776729) {
                if (iHashCode != 3165170) {
                    if (iHashCode == 3321850 && type.equals("link")) {
                        textView.setText("内容");
                        Object content = historyContentObj.getContent();
                        BBSLinkObj bBSLinkObj = content instanceof BBSLinkObj ? (BBSLinkObj) content : null;
                        if (bBSLinkObj != null) {
                            SearchHelper searchHelperA = SearchHelper.f91573a.a();
                            SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append((CharSequence) bBSLinkObj.getTitle());
                            f0.o(spannableStringBuilderAppend, "titleTextSsb.append(linkObj.title)");
                            searchHelperA.h(spannableStringBuilderAppend);
                            textView2.setText(spannableStringBuilder);
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
                            eVar.itemView.setOnClickListener(new ViewOnClickListenerC0660b(bBSLinkObj));
                        }
                    }
                } else if (type.equals("game")) {
                    textView.setText(R.string.game);
                    Object content2 = historyContentObj.getContent();
                    GameObj gameObj = content2 instanceof GameObj ? (GameObj) content2 : null;
                    if (gameObj != null) {
                        SearchHelper searchHelperA2 = SearchHelper.f91573a.a();
                        SpannableStringBuilder spannableStringBuilderAppend2 = spannableStringBuilder.append((CharSequence) gameObj.getName());
                        f0.o(spannableStringBuilderAppend2, "titleTextSsb.append(gameObj.name)");
                        searchHelperA2.h(spannableStringBuilderAppend2);
                        textView2.setText(spannableStringBuilder);
                        com.max.hbimage.b.U(gameObj.getImage(), imageView2, drawableL);
                        textView3.setVisibility(8);
                        r1.C(gamePriceView, gameObj, false, true);
                        r1.S1(new s.e(R.layout.game_score, viewI2), gameObj.getScore_desc(), gameObj.getScore(), gameObj.getExpect_num());
                        eVar.itemView.setOnClickListener(new c(z.b(this.f79252b, gameObj.getH_src(), gameObj.getAppid(), gameObj.getGame_type(), null, i0.m(), i0.j(), null)));
                    }
                }
            } else if (type.equals("wiki_article")) {
                textView.setText("数据库");
                Object content3 = historyContentObj.getContent();
                WikiArticelObj wikiArticelObj = content3 instanceof WikiArticelObj ? (WikiArticelObj) content3 : null;
                if (wikiArticelObj != null) {
                    String article_url = wikiArticelObj.getArticle_url();
                    String article_name = wikiArticelObj.getArticle_name();
                    SearchHelper searchHelperA3 = SearchHelper.f91573a.a();
                    SpannableStringBuilder spannableStringBuilderAppend3 = spannableStringBuilder.append((CharSequence) article_name);
                    f0.o(spannableStringBuilderAppend3, "titleTextSsb.append(title)");
                    searchHelperA3.h(spannableStringBuilderAppend3);
                    textView2.setText(spannableStringBuilder);
                    com.max.hbimage.b.U(wikiArticelObj.getImage(), imageView2, drawableL);
                    viewI2.setVisibility(8);
                    gamePriceView.setVisibility(8);
                    String extra_tag2 = wikiArticelObj.getExtra_tag();
                    if (extra_tag2 == null || extra_tag2.length() == 0) {
                        textView3.setVisibility(8);
                    } else {
                        textView3.setText(wikiArticelObj.getExtra_tag());
                        textView3.setVisibility(0);
                    }
                    eVar.itemView.setOnClickListener(new d(article_url, this, article_name));
                }
            }
        }
        if (com.max.hbcommon.utils.c.u(historyContentObj.getTag_text())) {
            return;
        }
        textView.setText(historyContentObj.getTag_text());
    }

    @Override // com.max.hbcommon.base.adapter.u
    public /* bridge */ /* synthetic */ int m(int i10, HistoryContentObj historyContentObj) {
        Object[] objArr = {new Integer(i10), historyContentObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 25219, new Class[]{cls, Object.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : q(i10, historyContentObj);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
        if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 25218, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        r(eVar, (HistoryContentObj) obj);
    }

    public int q(int i10, @e HistoryContentObj historyContentObj) {
        Object[] objArr = {new Integer(i10), historyContentObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 25217, new Class[]{cls, HistoryContentObj.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return f0.g(historyContentObj != null ? historyContentObj.getWrapper_type() : null, "search_tips") ? R.layout.item_go_to_general_search_tip : R.layout.item_visited_history;
    }

    public void r(@dl.d s.e viewHolder, @e HistoryContentObj historyContentObj) {
        if (PatchProxy.proxy(new Object[]{viewHolder, historyContentObj}, this, changeQuickRedirect, false, 25214, new Class[]{s.e.class, HistoryContentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        if (historyContentObj == null || o(viewHolder, historyContentObj)) {
            return;
        }
        p(viewHolder, historyContentObj);
    }
}
