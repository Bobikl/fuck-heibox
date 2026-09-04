package com.max.xiaoheihe.module.search.viewholderbinder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbsearch.SearchNewActivity;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.bean.search.SearchCorrectionInfo;
import com.max.xiaoheihe.bean.search.SearchCorrectionObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: SearchCorrectionVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nSearchCorrectionVHB.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchCorrectionVHB.kt\ncom/max/xiaoheihe/module/search/viewholderbinder/SearchCorrectionVHB\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,139:1\n1855#2,2:140\n1855#2,2:142\n*S KotlinDebug\n*F\n+ 1 SearchCorrectionVHB.kt\ncom/max/xiaoheihe/module/search/viewholderbinder/SearchCorrectionVHB\n*L\n46#1:140,2\n57#1:142,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class e extends a0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91776l = 0;

    /* JADX INFO: compiled from: SearchCorrectionVHB.kt */
    public static final class a extends com.max.hbcustomview.spans.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f91777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SearchCorrectionInfo f91778c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GeneralSearchInfo f91779d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Ref.ObjectRef<Drawable> objectRef, e eVar, SearchCorrectionInfo searchCorrectionInfo, GeneralSearchInfo generalSearchInfo) {
            super(objectRef.f124891b);
            this.f91777b = eVar;
            this.f91778c = searchCorrectionInfo;
            this.f91779d = generalSearchInfo;
        }

        @Override // com.max.hbcustomview.spans.e
        public void a(@dl.d View arg0) {
            if (PatchProxy.proxy(new Object[]{arg0}, this, changeQuickRedirect, false, 43306, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(arg0, "arg0");
            if (this.f91777b.m() instanceof SearchNewActivity) {
                Context contextM = this.f91777b.m();
                f0.n(contextM, "null cannot be cast to non-null type com.max.hbsearch.SearchNewActivity");
                ((SearchNewActivity) contextM).s1(new KeyDescObj(this.f91778c.getText()), com.max.hbsearch.l.S);
            }
            com.max.hbcommon.utils.k.f(this.f91778c.getReport_id(), UiKitSpanObj.TYPE_CLICK, this.f91778c.getCustom_idx(), this.f91779d.getSuggested_from());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@dl.d z param) {
        super(param);
        f0.p(param, "param");
    }

    private final void B(SpannableStringBuilder spannableStringBuilder, int i10) {
        if (PatchProxy.proxy(new Object[]{spannableStringBuilder, new Integer(i10)}, this, changeQuickRedirect, false, 43304, new Class[]{SpannableStringBuilder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(" ");
        Drawable drawableX = com.max.xiaoheihe.utils.d.X(R.color.transparent);
        f0.o(drawableX, "getDrawable(R.color.transparent)");
        drawableX.setBounds(0, 0, i10, ViewUtils.f(m(), 1.0f));
        spannableStringBuilder.setSpan(new com.max.hbcustomview.spans.b(drawableX, 0), length, length + 1, 33);
    }

    private final Drawable C(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43303, new Class[]{String.class}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        int color = m().getResources().getColor(R.color.divider_secondary_1_color);
        int iF = ViewUtils.f(m(), 2.0f);
        TextView textView = new TextView(m());
        textView.setIncludeFontPadding(false);
        textView.setTextSize(1, 12.0f);
        return new com.max.hbcustomview.g(str, textView.getPaint(), com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color), color, color, iF, ViewUtils.f(m(), 6.0f), ViewUtils.f(m(), 4.0f));
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0, cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, GeneralSearchInfo generalSearchInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, generalSearchInfo}, this, changeQuickRedirect, false, 43305, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, generalSearchInfo);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r7v9, types: [T, android.graphics.drawable.Drawable] */
    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0
    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GeneralSearchInfo data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43302, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        viewHolder.itemView.setTag(data);
        SearchCorrectionObj searchCorrectionObj = (SearchCorrectionObj) com.max.hbutils.utils.k.a(data.getInfo(), SearchCorrectionObj.class);
        TextView textView = (TextView) viewHolder.i(R.id.tv_desc);
        textView.setMovementMethod(com.max.hbcustomview.spans.f.a());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<SearchCorrectionInfo> arrayList = new ArrayList();
        List<SearchCorrectionInfo> item_list = searchCorrectionObj.getItem_list();
        if (item_list != null) {
            int size = item_list.size();
            for (int i10 = 0; i10 < size; i10++) {
                item_list.get(i10).setCustom_idx(String.valueOf(i10));
            }
        }
        List<SearchCorrectionInfo> item_list2 = searchCorrectionObj.getItem_list();
        if (item_list2 != null) {
            String type = null;
            for (SearchCorrectionInfo searchCorrectionInfo : item_list2) {
                if (type != null && !f0.g(type, searchCorrectionInfo.getType())) {
                    if (f0.g(com.google.android.exoplayer2.text.ttml.d.f49792k0, type) || f0.g(com.google.android.exoplayer2.text.ttml.d.f49792k0, searchCorrectionInfo.getType())) {
                        arrayList.add(new SearchCorrectionInfo("space", com.google.android.exoplayer2.text.ttml.d.f49792k0, null, null));
                    } else {
                        arrayList.add(new SearchCorrectionInfo("space", BasePuzzleInfo.PUZZLE_TYPE_LABEL, null, null));
                    }
                }
                type = searchCorrectionInfo.getType();
                arrayList.add(searchCorrectionInfo);
            }
        }
        for (SearchCorrectionInfo searchCorrectionInfo2 : arrayList) {
            String type2 = searchCorrectionInfo2.getType();
            if (type2 != null) {
                switch (type2.hashCode()) {
                    case 3029637:
                        if (type2.equals(com.google.android.exoplayer2.text.ttml.d.f49792k0)) {
                            spannableStringBuilder.append((CharSequence) searchCorrectionInfo2.getText());
                            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(m().getResources().getColor(R.color.text_primary_1_color));
                            int length = spannableStringBuilder.length();
                            String text = searchCorrectionInfo2.getText();
                            f0.m(text);
                            spannableStringBuilder.setSpan(foregroundColorSpan, length - text.length(), spannableStringBuilder.length(), 33);
                        }
                        break;
                    case 3556653:
                        if (type2.equals("text")) {
                            spannableStringBuilder.append((CharSequence) searchCorrectionInfo2.getText());
                        }
                        break;
                    case 102727412:
                        if (type2.equals(BasePuzzleInfo.PUZZLE_TYPE_LABEL)) {
                            spannableStringBuilder.append((CharSequence) searchCorrectionInfo2.getText());
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            String text2 = searchCorrectionInfo2.getText();
                            f0.m(text2);
                            objectRef.f124891b = C(text2);
                            a aVar = new a(objectRef, this, searchCorrectionInfo2, data);
                            int length2 = spannableStringBuilder.length();
                            String text3 = searchCorrectionInfo2.getText();
                            f0.m(text3);
                            spannableStringBuilder.setSpan(aVar, length2 - text3.length(), spannableStringBuilder.length(), 33);
                        }
                        break;
                    case 109637894:
                        if (type2.equals("space")) {
                            if (f0.g(searchCorrectionInfo2.getText(), com.google.android.exoplayer2.text.ttml.d.f49792k0)) {
                                B(spannableStringBuilder, ViewUtils.f(m(), 3.0f));
                            } else {
                                B(spannableStringBuilder, ViewUtils.f(m(), 6.0f));
                            }
                        }
                        break;
                }
            }
        }
        textView.setText(spannableStringBuilder);
    }
}
