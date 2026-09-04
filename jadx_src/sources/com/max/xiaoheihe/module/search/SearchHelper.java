package com.max.xiaoheihe.module.search;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.t;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.analytics.RvVisiableRangeObj;
import com.max.hbcommon.utils.k;
import com.max.hbcommon.utils.l;
import com.max.hbminiprogram.bean.MiniProgramObj;
import com.max.hbsearch.SearchNewFragment;
import com.max.hbsearch.config.HotHashtagType;
import com.max.hbsearch.config.HotWordTypeV2;
import com.max.hbsearch.config.SearchTabType;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.WikiArticelObj;
import com.max.xiaoheihe.bean.bbs.WikiListObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.search.RelevantSearchListObj;
import com.max.xiaoheihe.bean.search.RelevantSearchObj;
import com.max.xiaoheihe.bean.search.SearchTagObj;
import com.max.xiaoheihe.module.game.GameParticularTagListActivity;
import com.max.xiaoheihe.module.game.adapter.ReportItem;
import com.max.xiaoheihe.module.game.adapter.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.z;
import xh.m;

/* JADX INFO: compiled from: SearchHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class SearchHelper {

    @dl.d
    public static final String A = "mall";

    @dl.d
    public static final String B = "user";

    @dl.d
    public static final String C = "wiki";

    @dl.d
    public static final String D = "wiki_article";

    @dl.d
    public static final String E = "divider";

    @dl.d
    public static final String F = "feeds_style";

    @dl.d
    public static final String G = "feedback_v2";

    @dl.d
    public static final String H = "relevant_search";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f91574b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final String f91575c = "add_data";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final String f91576d = "steam_user";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final String f91577e = "dota2_match";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final String f91578f = "banner";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    public static final String f91579g = "filter_tag";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final String f91580h = "space";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final String f91581i = "header";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final String f91582j = "tool";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    public static final String f91583k = "game_list";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    public static final String f91584l = "new_game_list";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    public static final String f91585m = "mall_list";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    public static final String f91586n = "mall_list_v2";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    public static final String f91587o = "topic_link_list";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    public static final String f91588p = "big_game_card";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    public static final String f91589q = "middle_game_card";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    public static final String f91590r = "search_tips";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    public static final String f91591s = "feedback";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    public static final String f91592t = "tips";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    public static final String f91593u = "hashtag";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    public static final String f91594v = "game";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    public static final String f91595w = "topic";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    public static final String f91596x = "mini_app";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    public static final String f91597y = "mini_app_v2";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    public static final String f91598z = "link";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f91573a = new a(null);

    @dl.d
    private static final z<SearchHelper> I = b0.b(LazyThreadSafetyMode.SYNCHRONIZED, new yh.a<SearchHelper>() { // from class: com.max.xiaoheihe.module.search.SearchHelper$Companion$instance$2
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        public final SearchHelper a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42899, new Class[0], SearchHelper.class);
            return patchProxyResultProxy.isSupported ? (SearchHelper) patchProxyResultProxy.result : new SearchHelper(null);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.search.SearchHelper, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ SearchHelper invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42900, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: compiled from: SearchHelper.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @m
        public static /* synthetic */ void b() {
        }

        @dl.d
        public final SearchHelper a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42898, new Class[0], SearchHelper.class);
            return patchProxyResultProxy.isSupported ? (SearchHelper) patchProxyResultProxy.result : (SearchHelper) SearchHelper.I.getValue();
        }
    }

    /* JADX INFO: compiled from: SearchHelper.kt */
    public static final class b extends t {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f91600f;

        /* JADX INFO: compiled from: SearchHelper.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f91601b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ KeyDescObj f91602c;

            a(Context context, KeyDescObj keyDescObj) {
                this.f91601b = context;
                this.f91602c = keyDescObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42902, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Context context = this.f91601b;
                context.startActivity(GameParticularTagListActivity.M1(context, this.f91602c));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.max.xiaoheihe.module.game.adapter.u uVar, Context context) {
            super(uVar);
            this.f91600f = context;
        }

        @Override // com.max.hbcommon.base.adapter.t
        public void C(@dl.d s.e viewHolder, @dl.e Object obj) {
            if (PatchProxy.proxy(new Object[]{viewHolder, obj}, this, changeQuickRedirect, false, 42901, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            if (viewHolder.d() == R.layout.item_game_search_taginfo) {
                f0.n(obj, "null cannot be cast to non-null type com.max.hbcommon.bean.KeyDescObj");
                KeyDescObj keyDescObj = (KeyDescObj) obj;
                viewHolder.p(R.id.tv_tag_name, keyDescObj.getDesc());
                viewHolder.itemView.setOnClickListener(new a(this.f91600f, keyDescObj));
            }
        }
    }

    private SearchHelper() {
    }

    public /* synthetic */ SearchHelper(u uVar) {
        this();
    }

    @dl.d
    public static final SearchHelper c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 42897, new Class[0], SearchHelper.class);
        return patchProxyResultProxy.isSupported ? (SearchHelper) patchProxyResultProxy.result : f91573a.a();
    }

    @dl.d
    public final t b(@dl.d Context mContext, @dl.d com.max.xiaoheihe.module.game.adapter.u adapter) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mContext, adapter}, this, changeQuickRedirect, false, 42894, new Class[]{Context.class, com.max.xiaoheihe.module.game.adapter.u.class}, t.class);
        if (patchProxyResultProxy.isSupported) {
            return (t) patchProxyResultProxy.result;
        }
        f0.p(mContext, "mContext");
        f0.p(adapter, "adapter");
        return new b(adapter, mContext);
    }

    @dl.d
    public final Bundle d(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 42892, new Class[]{Integer.TYPE}, Bundle.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bundle) patchProxyResultProxy.result;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(com.max.xiaoheihe.module.search.b.f91614a.e(), i10);
        bundle.putParcelable(SearchNewFragment.f72183g4, new SearchNewFragment.ContainerConfig(SearchTabType.MALL, HotWordTypeV2.MALL, HotHashtagType.MALL, true, true, false));
        return bundle;
    }

    @dl.d
    public final Bundle e(@dl.d String src) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{src}, this, changeQuickRedirect, false, 42891, new Class[]{String.class}, Bundle.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bundle) patchProxyResultProxy.result;
        }
        f0.p(src, "src");
        Bundle bundle = new Bundle();
        com.max.xiaoheihe.module.search.b bVar = com.max.xiaoheihe.module.search.b.f91614a;
        bundle.putString(bVar.i(), src);
        bundle.putInt(bVar.e(), 37);
        return bundle;
    }

    @dl.d
    public final Bundle f(@dl.d String src, @dl.e String str, @dl.d SearchNewFragment.ContainerConfig containerConfig) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{src, str, containerConfig}, this, changeQuickRedirect, false, 42893, new Class[]{String.class, String.class, SearchNewFragment.ContainerConfig.class}, Bundle.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bundle) patchProxyResultProxy.result;
        }
        f0.p(src, "src");
        f0.p(containerConfig, "containerConfig");
        Bundle bundle = new Bundle();
        com.max.xiaoheihe.module.search.b bVar = com.max.xiaoheihe.module.search.b.f91614a;
        bundle.putString(bVar.i(), src);
        bundle.putInt(bVar.e(), 37);
        if (str != null) {
            bundle.putString(bVar.j(), str);
        }
        bundle.putParcelable(SearchNewFragment.f72183g4, containerConfig);
        return bundle;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:126:0x023c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0256 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0091 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:150:?, code lost:
    
        return r0.c(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r0.equals(com.max.xiaoheihe.module.search.SearchHelper.F) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0139, code lost:
    
        if (r0.equals("link") == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013d, code lost:
    
        r10 = (com.max.xiaoheihe.bean.news.FeedsContentBaseObj) com.max.hbutils.utils.k.a(r10.getInfo(), com.max.xiaoheihe.bean.news.FeedsContentBaseObj.class);
        r0 = com.max.xiaoheihe.module.news.NewsHelper.f91207a.a();
        kotlin.jvm.internal.f0.o(r10, "info");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(@dl.d com.max.xiaoheihe.bean.GeneralSearchInfo r10) {
        /*
            Method dump skipped, instruction units count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.max.xiaoheihe.module.search.SearchHelper.g(com.max.xiaoheihe.bean.GeneralSearchInfo):int");
    }

    public final void h(@dl.d SpannableStringBuilder builder) {
        if (PatchProxy.proxy(new Object[]{builder}, this, changeQuickRedirect, false, 42896, new Class[]{SpannableStringBuilder.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(builder, "builder");
        Pattern patternCompile = Pattern.compile("(<em>(.*?)</em>)");
        Matcher matcher = patternCompile.matcher(builder);
        while (matcher.find()) {
            String strGroup = matcher.group(2);
            builder.replace(matcher.start(), matcher.end(), (CharSequence) strGroup);
            builder.setSpan(new ForegroundColorSpan(l.a(R.color.click_blue)), matcher.start(), matcher.start() + strGroup.length(), 33);
            matcher = patternCompile.matcher(builder);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0206 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final void i(@dl.d RecyclerView recyclerView, @dl.d List<String> shownList, @dl.d String searchType) {
        Object tag;
        String suggested_from;
        String report_idx;
        List<RelevantSearchObj> items;
        String report_id;
        String custom_index;
        boolean z10 = false;
        boolean z11 = true;
        if (PatchProxy.proxy(new Object[]{recyclerView, shownList, searchType}, this, changeQuickRedirect, false, 42895, new Class[]{RecyclerView.class, List.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recyclerView, "recyclerView");
        f0.p(shownList, "shownList");
        f0.p(searchType, "searchType");
        RvVisiableRangeObj rvVisiableRangeObjJ0 = com.max.xiaoheihe.utils.d.j0(recyclerView);
        if (((rvVisiableRangeObjJ0.getFirst() == -1 || rvVisiableRangeObjJ0.getLast() == -1) ? 0 : (rvVisiableRangeObjJ0.getLast() - rvVisiableRangeObjJ0.getFirst()) + 1) > 0) {
            int first = rvVisiableRangeObjJ0.getFirst();
            int last = rvVisiableRangeObjJ0.getLast() + 1;
            while (first < last) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                f0.m(layoutManager);
                View viewFindViewByPosition = layoutManager.findViewByPosition(first);
                if (!((viewFindViewByPosition == null || viewFindViewByPosition.getId() != R.id.rv_item) ? z10 : z11)) {
                    if (!((viewFindViewByPosition == null || viewFindViewByPosition.getId() != R.id.rv_game) ? z10 : z11)) {
                        String report_id2 = null;
                        if (viewFindViewByPosition != null) {
                            if (viewFindViewByPosition != null) {
                                tag = viewFindViewByPosition.getTag();
                            } else {
                                tag = null;
                            }
                        } else if (viewFindViewByPosition != null) {
                            tag = viewFindViewByPosition.getTag();
                        } else {
                            tag = null;
                        }
                        if (viewFindViewByPosition == null) {
                        }
                    } else if (viewFindViewByPosition instanceof RecyclerView) {
                        i((RecyclerView) viewFindViewByPosition, shownList, searchType);
                    } else {
                        String report_id3 = null;
                        if (viewFindViewByPosition != null) {
                            if (viewFindViewByPosition != null) {
                                tag = viewFindViewByPosition.getTag();
                            } else {
                                tag = null;
                            }
                        } else if (viewFindViewByPosition != null) {
                            tag = viewFindViewByPosition.getTag();
                        } else {
                            tag = null;
                        }
                        if (viewFindViewByPosition == null) {
                        }
                    }
                } else if (viewFindViewByPosition instanceof RecyclerView) {
                    i((RecyclerView) viewFindViewByPosition, shownList, searchType);
                } else {
                    String report_id4 = null;
                    if (viewFindViewByPosition != null || (tag = viewFindViewByPosition.getTag(R.id.search_report_data)) == null) {
                        if (viewFindViewByPosition != null) {
                            tag = viewFindViewByPosition.getTag();
                        } else {
                            tag = null;
                        }
                    }
                    if (viewFindViewByPosition == null && tag != null && ViewUtils.f0(viewFindViewByPosition)) {
                        if (tag instanceof BBSLinkObj) {
                            BBSLinkObj bBSLinkObj = (BBSLinkObj) tag;
                            report_id4 = bBSLinkObj.getReport_id();
                            report_idx = bBSLinkObj.getCustom_index();
                            suggested_from = bBSLinkObj.getCustom_suggested_from();
                        } else if (tag instanceof GameObj) {
                            GameObj gameObj = (GameObj) tag;
                            report_id4 = gameObj.getReport_id();
                            report_idx = gameObj.getCustom_index();
                            suggested_from = gameObj.getCustom_suggested_from();
                        } else if (tag instanceof FeedsContentBaseObj) {
                            FeedsContentBaseObj feedsContentBaseObj = (FeedsContentBaseObj) tag;
                            report_id4 = feedsContentBaseObj.getReport_id();
                            report_idx = feedsContentBaseObj.getCustom_index();
                            suggested_from = feedsContentBaseObj.getCustom_suggested_from();
                        } else if (tag instanceof WikiListObj) {
                            WikiListObj wikiListObj = (WikiListObj) tag;
                            report_id4 = wikiListObj.getReport_id();
                            report_idx = wikiListObj.getCustom_index();
                            suggested_from = wikiListObj.getCustom_suggested_from();
                        } else if (tag instanceof WikiArticelObj) {
                            WikiArticelObj wikiArticelObj = (WikiArticelObj) tag;
                            report_id4 = wikiArticelObj.getReport_id();
                            report_idx = wikiArticelObj.getCustom_index();
                            suggested_from = wikiArticelObj.getCustom_suggested_from();
                        } else if (tag instanceof MallProductObj) {
                            MallProductObj mallProductObj = (MallProductObj) tag;
                            report_id4 = mallProductObj.getReport_id();
                            report_idx = mallProductObj.getCustom_index();
                            suggested_from = mallProductObj.getCustom_suggested_from();
                        } else if (tag instanceof GeneralSearchInfo) {
                            GeneralSearchInfo generalSearchInfo = (GeneralSearchInfo) tag;
                            report_id4 = generalSearchInfo.getReport_id();
                            report_idx = generalSearchInfo.getReport_idx();
                            suggested_from = generalSearchInfo.getSuggested_from();
                        } else {
                            if (tag instanceof MiniProgramObj) {
                                MiniProgramObj miniProgramObj = (MiniProgramObj) tag;
                                report_id = miniProgramObj.getReport_id();
                                custom_index = miniProgramObj.getCustom_index();
                            } else if (tag instanceof SearchTagObj) {
                                SearchTagObj searchTagObj = (SearchTagObj) tag;
                                report_id = searchTagObj.getReport_id();
                                custom_index = searchTagObj.getCustom_index();
                            } else {
                                if ((tag instanceof RelevantSearchListObj) && (items = ((RelevantSearchListObj) tag).getItems()) != null) {
                                    for (RelevantSearchObj relevantSearchObj : items) {
                                        String report_id5 = relevantSearchObj.getReport_id();
                                        if (report_id5 != null && !shownList.contains(report_id5)) {
                                            shownList.add(report_id5);
                                            k.f(relevantSearchObj.getReport_id(), sd.b.f139384b, String.valueOf(items.indexOf(relevantSearchObj)), null);
                                        }
                                    }
                                }
                                suggested_from = null;
                                report_idx = null;
                            }
                            String str = report_id;
                            report_idx = custom_index;
                            suggested_from = null;
                            report_id4 = str;
                        }
                        if (report_id4 != null && !shownList.contains(report_id4)) {
                            if (tag instanceof GameObj) {
                                GameObj gameObj2 = (GameObj) tag;
                                String name = gameObj2.getName();
                                w.b(new ReportItem(gameObj2.getAppid(), null, name, gameObj2.getH_src(), "" + com.max.hbutils.utils.w.C(), null, null, 98, null), first);
                            }
                            shownList.add(report_id4);
                            k.f(report_id4, sd.b.f139384b, report_idx, suggested_from);
                        }
                    }
                }
                first++;
                z10 = false;
                z11 = true;
            }
        }
    }
}
