package com.max.xiaoheihe.module.favour;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.adapter.s;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.CollectionFolder;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.module.report.RecyclerViewReportManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import df.bj;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.u;

/* JADX INFO: compiled from: CollectionGroupRVAdapterV2.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nCollectionGroupRVAdapterV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionGroupRVAdapterV2.kt\ncom/max/xiaoheihe/module/favour/CollectionGroupRVAdapterV2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,149:1\n1603#2,9:150\n1855#2:159\n1856#2:161\n1612#2:162\n1#3:160\n262#4,2:163\n262#4,2:165\n262#4,2:167\n262#4,2:169\n262#4,2:171\n262#4,2:173\n262#4,2:175\n262#4,2:177\n262#4,2:179\n*S KotlinDebug\n*F\n+ 1 CollectionGroupRVAdapterV2.kt\ncom/max/xiaoheihe/module/favour/CollectionGroupRVAdapterV2\n*L\n41#1:150,9\n41#1:159\n41#1:161\n41#1:162\n41#1:160\n45#1:163,2\n47#1:165,2\n49#1:167,2\n77#1:169,2\n94#1:171,2\n101#1:173,2\n118#1:175,2\n125#1:177,2\n142#1:179,2\n*E\n"})
@o(parameters = 0)
public final class g extends s<CollectionFolder> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f83905d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f83906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final RecyclerViewReportManager<CollectionFolder> f83907c;

    /* JADX INFO: compiled from: CollectionGroupRVAdapterV2.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CollectionFolder f83909c;

        a(CollectionFolder collectionFolder) {
            this.f83909c = collectionFolder;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31631, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            JsonObject jsonObject = new JsonObject();
            CollectionFolder collectionFolder = this.f83909c;
            jsonObject.addProperty(FavourCollectionContentFragment.f83664o, collectionFolder != null ? collectionFolder.getId() : null);
            com.max.hbcommon.analytics.d.d("4", lb.d.D1, null, jsonObject);
            Context contextN = g.this.n();
            FavourLinkFolderActivity.a aVar = FavourLinkFolderActivity.T;
            Context contextN2 = g.this.n();
            CollectionFolder collectionFolder2 = this.f83909c;
            contextN.startActivity(aVar.e(contextN2, String.valueOf(collectionFolder2 != null ? collectionFolder2.getId() : null), "0"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@dl.d Context context, @dl.d ArrayList<CollectionFolder> dataList, @dl.e RecyclerViewReportManager<CollectionFolder> recyclerViewReportManager) {
        super(context, dataList, R.layout.item_favour_folder_v2);
        f0.p(context, "context");
        f0.p(dataList, "dataList");
        this.f83906b = context;
        this.f83907c = recyclerViewReportManager;
    }

    private final void m(bj bjVar, BBSLinkObj bBSLinkObj, int i10) {
        if (PatchProxy.proxy(new Object[]{bjVar, bBSLinkObj, new Integer(i10)}, this, changeQuickRedirect, false, 31629, new Class[]{bj.class, BBSLinkObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 0) {
            if (bBSLinkObj == null) {
                TextView textView = bjVar.f108983j;
                f0.o(textView, "binding.tvStart");
                textView.setVisibility(8);
                bjVar.f108977d.setImageDrawable(new ColorDrawable(this.f83906b.getColor(R.color.divider_color)));
                return;
            }
            List<String> thumbs = bBSLinkObj.getThumbs();
            String str = thumbs != null ? (String) CollectionsKt___CollectionsKt.R2(thumbs, 0) : null;
            if (str == null || u.V1(str)) {
                ImageView imageView = bjVar.f108977d;
                imageView.setImageDrawable(androidx.core.content.d.i(imageView.getContext(), R.drawable.game_heybox_platform_filled_v_40x40));
                imageView.setBackgroundColor(imageView.getContext().getColor(R.color.background_layer_1_color));
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView.setColorFilter(imageView.getContext().getColor(R.color.divider_primary_1_color));
            } else {
                ImageView imageView2 = bjVar.f108977d;
                imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView2.setColorFilter((ColorFilter) null);
                List<String> thumbs2 = bBSLinkObj.getThumbs();
                com.max.hbimage.b.L(thumbs2 != null ? (String) CollectionsKt___CollectionsKt.R2(thumbs2, 0) : null, bjVar.f108977d, R.drawable.common_default_placeholder_375x210);
            }
            TextView textView2 = bjVar.f108983j;
            f0.o(textView2, "binding.tvStart");
            String title = bBSLinkObj.getTitle();
            textView2.setVisibility((title == null || title.length() == 0) ^ true ? 0 : 8);
            bjVar.f108983j.setText(bBSLinkObj.getTitle());
            bjVar.f108983j.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            return;
        }
        if (i10 == 1) {
            if (bBSLinkObj == null) {
                TextView textView3 = bjVar.f108982i;
                f0.o(textView3, "binding.tvMid");
                textView3.setVisibility(8);
                bjVar.f108976c.setImageDrawable(new ColorDrawable(this.f83906b.getColor(R.color.divider_color)));
                return;
            }
            List<String> thumbs3 = bBSLinkObj.getThumbs();
            String str2 = thumbs3 != null ? (String) CollectionsKt___CollectionsKt.R2(thumbs3, 0) : null;
            if (str2 == null || u.V1(str2)) {
                ImageView imageView3 = bjVar.f108976c;
                imageView3.setImageDrawable(androidx.core.content.d.i(imageView3.getContext(), R.drawable.game_heybox_platform_filled_v_40x40));
                imageView3.setBackgroundColor(imageView3.getContext().getColor(R.color.background_layer_1_color));
                imageView3.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView3.setColorFilter(imageView3.getContext().getColor(R.color.divider_primary_1_color));
            } else {
                ImageView imageView4 = bjVar.f108976c;
                imageView4.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView4.setColorFilter((ColorFilter) null);
                List<String> thumbs4 = bBSLinkObj.getThumbs();
                com.max.hbimage.b.L(thumbs4 != null ? (String) CollectionsKt___CollectionsKt.R2(thumbs4, 0) : null, bjVar.f108976c, R.drawable.common_default_placeholder_375x210);
            }
            TextView textView4 = bjVar.f108982i;
            f0.o(textView4, "binding.tvMid");
            String title2 = bBSLinkObj.getTitle();
            textView4.setVisibility((title2 == null || title2.length() == 0) ^ true ? 0 : 8);
            bjVar.f108982i.setText(bBSLinkObj.getTitle());
            bjVar.f108982i.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            return;
        }
        if (i10 != 2) {
            return;
        }
        if (bBSLinkObj == null) {
            TextView textView5 = bjVar.f108981h;
            f0.o(textView5, "binding.tvEnd");
            textView5.setVisibility(8);
            bjVar.f108975b.setImageDrawable(new ColorDrawable(this.f83906b.getColor(R.color.divider_color)));
            return;
        }
        List<String> thumbs5 = bBSLinkObj.getThumbs();
        String str3 = thumbs5 != null ? (String) CollectionsKt___CollectionsKt.R2(thumbs5, 0) : null;
        if (str3 == null || u.V1(str3)) {
            ImageView imageView5 = bjVar.f108975b;
            imageView5.setImageDrawable(androidx.core.content.d.i(imageView5.getContext(), R.drawable.game_heybox_platform_filled_v_40x40));
            imageView5.setBackgroundColor(imageView5.getContext().getColor(R.color.background_layer_1_color));
            imageView5.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView5.setColorFilter(imageView5.getContext().getColor(R.color.divider_primary_1_color));
        } else {
            ImageView imageView6 = bjVar.f108975b;
            imageView6.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView6.setColorFilter((ColorFilter) null);
            List<String> thumbs6 = bBSLinkObj.getThumbs();
            com.max.hbimage.b.L(thumbs6 != null ? (String) CollectionsKt___CollectionsKt.R2(thumbs6, 0) : null, bjVar.f108975b, R.drawable.common_default_placeholder_375x210);
        }
        TextView textView6 = bjVar.f108981h;
        f0.o(textView6, "binding.tvEnd");
        String title3 = bBSLinkObj.getTitle();
        textView6.setVisibility((title3 == null || title3.length() == 0) ^ true ? 0 : 8);
        bjVar.f108981h.setText(bBSLinkObj.getTitle());
        bjVar.f108981h.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
    }

    @dl.d
    public final Context n() {
        return this.f83906b;
    }

    public void o(@dl.e s.e eVar, @dl.e CollectionFolder collectionFolder) {
        RecyclerViewReportManager<CollectionFolder> recyclerViewReportManager;
        List<FeedsContentBaseObj> links;
        List<FeedsContentBaseObj> listN2;
        Integer count;
        if (PatchProxy.proxy(new Object[]{eVar, collectionFolder}, this, changeQuickRedirect, false, 31628, new Class[]{s.e.class, CollectionFolder.class}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = null;
        View viewB = eVar != null ? eVar.b() : null;
        if (viewB == null) {
            return;
        }
        bj bjVarA = bj.a(viewB);
        f0.o(bjVarA, "bind(itemView)");
        TextView textView = bjVarA.f108984k;
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        textView.setText(collectionFolder != null ? collectionFolder.getName() : null);
        TextView textView2 = bjVarA.f108980g;
        textView2.setText(textView2.getContext().getString(R.string.favour_folder_content_num_desc, Integer.valueOf((collectionFolder == null || (count = collectionFolder.getCount()) == null) ? 0 : count.intValue())));
        if (collectionFolder != null && (links = collectionFolder.getLinks()) != null && (listN2 = CollectionsKt___CollectionsKt.n2(links)) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (FeedsContentBaseObj feedsContentBaseObj : listN2) {
                BBSLinkObj bBSLinkObj = feedsContentBaseObj instanceof BBSLinkObj ? (BBSLinkObj) feedsContentBaseObj : null;
                if (bBSLinkObj != null) {
                    arrayList2.add(bBSLinkObj);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            TextView tvStart = bjVarA.f108983j;
            f0.o(tvStart, "tvStart");
            tvStart.setVisibility(8);
            bjVarA.f108977d.setImageDrawable(new ColorDrawable(this.f83906b.getColor(R.color.divider_color)));
            TextView tvMid = bjVarA.f108982i;
            f0.o(tvMid, "tvMid");
            tvMid.setVisibility(8);
            bjVarA.f108976c.setImageDrawable(new ColorDrawable(this.f83906b.getColor(R.color.divider_color)));
            TextView tvEnd = bjVarA.f108981h;
            f0.o(tvEnd, "tvEnd");
            tvEnd.setVisibility(8);
            bjVarA.f108975b.setImageDrawable(new ColorDrawable(this.f83906b.getColor(R.color.divider_color)));
        } else {
            m(bjVarA, (BBSLinkObj) CollectionsKt___CollectionsKt.R2(arrayList, 0), 0);
            m(bjVarA, (BBSLinkObj) CollectionsKt___CollectionsKt.R2(arrayList, 1), 1);
            m(bjVarA, (BBSLinkObj) CollectionsKt___CollectionsKt.R2(arrayList, 2), 2);
        }
        bjVarA.b().setOnClickListener(new a(collectionFolder));
        if (collectionFolder == null || (recyclerViewReportManager = this.f83907c) == null) {
            return;
        }
        recyclerViewReportManager.a(eVar.b(), collectionFolder);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, CollectionFolder collectionFolder) {
        if (PatchProxy.proxy(new Object[]{eVar, collectionFolder}, this, changeQuickRedirect, false, 31630, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        o(eVar, collectionFolder);
    }
}
