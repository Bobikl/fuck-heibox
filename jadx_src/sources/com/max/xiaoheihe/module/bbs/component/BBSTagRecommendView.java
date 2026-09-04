package com.max.xiaoheihe.module.bbs.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.hbcommon.component.card.CardParam;
import com.max.hbcommon.component.card.CardViewGenerator;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.HashtagObj;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kb.c;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BBSTagRecommendView.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class BBSTagRecommendView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f80833e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListSectionHeader f80834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f80835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f80836d;

    public BBSTagRecommendView(@e Context context) {
        this(context, null);
    }

    public BBSTagRecommendView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BBSTagRecommendView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public BBSTagRecommendView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27658, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(1);
        setLsh(new ListSectionHeader(getContext()));
        getLsh().setMoreButtonVisible(false);
        getLsh().setTitleText(getContext().getResources().getString(R.string.trending_hashtag));
        getLsh().setTopPadding(0);
        getLsh().setBottomPadding(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, ViewUtils.f(getContext(), 20.0f));
        layoutParams.topMargin = ViewUtils.f(getContext(), 16.0f);
        addView(getLsh(), layoutParams);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f80835c = linearLayout;
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = ViewUtils.f(getContext(), 6.0f);
        layoutParams2.rightMargin = ViewUtils.f(getContext(), 12.0f);
        layoutParams2.bottomMargin = ViewUtils.f(getContext(), 16.0f);
        View view = this.f80835c;
        if (view == null) {
            f0.S("ll_recommend_hashtags");
            view = null;
        }
        addView(view, layoutParams2);
        Context context = getContext();
        f0.o(context, "context");
        View viewInflate = c.d(context).inflate(R.layout.search_divider_4dp, (ViewGroup) null);
        f0.o(viewInflate, "context.layoutInflater()…search_divider_4dp, null)");
        setDivider(viewInflate);
        getDivider().setId(R.id.divider);
        addView(getDivider(), new LinearLayout.LayoutParams(-1, ViewUtils.f(getContext(), 4.0f)));
    }

    public final void b(@e List<HashtagObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 27659, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        LinearLayout linearLayout = this.f80835c;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            f0.S("ll_recommend_hashtags");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<HashtagObj> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toConceptPostTagObj());
            }
            CardViewGenerator cardViewGeneratorA = CardViewGenerator.f67433b.a();
            LinearLayout linearLayout3 = this.f80835c;
            if (linearLayout3 == null) {
                f0.S("ll_recommend_hashtags");
            } else {
                linearLayout2 = linearLayout3;
            }
            Context context = getContext();
            f0.o(context, "context");
            cardViewGeneratorA.c(linearLayout2, new CardParam.a(context).j(arrayList).r(R.color.click_blue).s(10).p(2).c());
        }
    }

    @d
    public final View getDivider() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27656, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f80836d;
        if (view != null) {
            return view;
        }
        f0.S(SearchHelper.E);
        return null;
    }

    @d
    public final ListSectionHeader getLsh() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27654, new Class[0], ListSectionHeader.class);
        if (patchProxyResultProxy.isSupported) {
            return (ListSectionHeader) patchProxyResultProxy.result;
        }
        ListSectionHeader listSectionHeader = this.f80834b;
        if (listSectionHeader != null) {
            return listSectionHeader;
        }
        f0.S("lsh");
        return null;
    }

    public final void setDivider(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27657, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f80836d = view;
    }

    public final void setLsh(@d ListSectionHeader listSectionHeader) {
        if (PatchProxy.proxy(new Object[]{listSectionHeader}, this, changeQuickRedirect, false, 27655, new Class[]{ListSectionHeader.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(listSectionHeader, "<set-?>");
        this.f80834b = listSectionHeader;
    }
}
