package com.max.xiaoheihe.module.news;

import android.net.Uri;
import androidx.compose.runtime.internal.o;
import com.max.hbstory.bean.KeyDescObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.news.FeedsContentTopicEntryObj;
import com.max.xiaoheihe.module.bbs.LikeAnimResourceManager;
import com.max.xiaoheihe.module.bbs.component.BBSLinkListBottomBar;
import com.max.xiaoheihe.module.bbs.component.likecomment.BBSLinkListLikeCommentBase;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.z;
import xh.m;

/* JADX INFO: compiled from: NewsHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class NewsHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f91208b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f91207a = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final z<NewsHelper> f91209c = b0.b(LazyThreadSafetyMode.SYNCHRONIZED, new yh.a<NewsHelper>() { // from class: com.max.xiaoheihe.module.news.NewsHelper$Companion$instance$2
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        public final NewsHelper a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42466, new Class[0], NewsHelper.class);
            return patchProxyResultProxy.isSupported ? (NewsHelper) patchProxyResultProxy.result : new NewsHelper(null);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.news.NewsHelper, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ NewsHelper invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42467, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: compiled from: NewsHelper.kt */
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
        public final NewsHelper a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42465, new Class[0], NewsHelper.class);
            return patchProxyResultProxy.isSupported ? (NewsHelper) patchProxyResultProxy.result : (NewsHelper) NewsHelper.f91209c.getValue();
        }
    }

    private NewsHelper() {
    }

    public /* synthetic */ NewsHelper(u uVar) {
        this();
    }

    @dl.d
    public static final NewsHelper b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 42464, new Class[0], NewsHelper.class);
        return patchProxyResultProxy.isSupported ? (NewsHelper) patchProxyResultProxy.result : f91207a.a();
    }

    public final int c(@dl.d FeedsContentBaseObj data) {
        String content_type;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 42461, new Class[]{FeedsContentBaseObj.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(data, "data");
        if (f0.g("1", data.getIs_update())) {
            return R.layout.item_concept_update;
        }
        if (f0.g("1", data.getCustom_previous_tips())) {
            return R.layout.item_feeds_previous_tips;
        }
        if (data.getContent_type() == null || (content_type = data.getContent_type()) == null) {
            return R.layout.item_concept_feeds_not_support;
        }
        int iHashCode = content_type.hashCode();
        if (iHashCode == 49) {
            return !content_type.equals("1") ? R.layout.item_concept_feeds_not_support : R.layout.item_concept_feeds_news_normal;
        }
        if (iHashCode == 52) {
            return !content_type.equals("4") ? R.layout.item_concept_feeds_not_support : R.layout.item_concept_feeds_link;
        }
        if (iHashCode == 55) {
            return !content_type.equals("7") ? R.layout.item_concept_feeds_not_support : R.layout.item_news_list_hsv;
        }
        if (iHashCode == 1567) {
            return !content_type.equals("10") ? R.layout.item_concept_feeds_not_support : R.layout.item_concept_channel_entry;
        }
        if (iHashCode == 1575) {
            return (content_type.equals("18") && !i0.s()) ? R.layout.item_concept_feeds_login : R.layout.item_concept_feeds_not_support;
        }
        if (iHashCode == 1576) {
            return !content_type.equals("19") ? R.layout.item_concept_feeds_not_support : R.layout.item_concept_feeds_hot_comment;
        }
        switch (iHashCode) {
            case bb.c.b.jr /* 1569 */:
                return !content_type.equals("12") ? R.layout.item_concept_feeds_not_support : R.layout.item_concept_feeds_mobile_video;
            case bb.c.b.kr /* 1570 */:
                return !content_type.equals("13") ? R.layout.item_concept_feeds_not_support : R.layout.item_concept_feeds_mobile_img;
            case bb.c.b.lr /* 1571 */:
                return !content_type.equals("14") ? R.layout.item_concept_feeds_not_support : R.layout.item_concept_feeds_news_wide;
            case bb.c.b.mr /* 1572 */:
                return !content_type.equals("15") ? R.layout.item_concept_feeds_not_support : R.layout.item_concept_feeds_news_wide;
            case bb.c.b.nr /* 1573 */:
                return !content_type.equals("16") ? R.layout.item_concept_feeds_not_support : R.layout.item_concept_feeds_news_wide;
            default:
                switch (iHashCode) {
                    case bb.c.b.Mr /* 1598 */:
                        return !content_type.equals("20") ? R.layout.item_concept_feeds_not_support : R.layout.item_news_large;
                    case bb.c.b.Nr /* 1599 */:
                        return !content_type.equals("21") ? R.layout.item_concept_feeds_not_support : R.layout.item_concept_rec_news;
                    case 1600:
                        return !content_type.equals("22") ? R.layout.item_concept_feeds_not_support : R.layout.item_concept_rec_switch;
                    case bb.c.b.Pr /* 1601 */:
                        return !content_type.equals("23") ? R.layout.item_concept_feeds_not_support : R.layout.item_banner_large;
                    case bb.c.b.Qr /* 1602 */:
                        return !content_type.equals("24") ? R.layout.item_concept_feeds_not_support : R.layout.item_concept_rec_hashtag;
                    default:
                        switch (iHashCode) {
                            case bb.c.b.Sr /* 1604 */:
                                return !content_type.equals("26") ? R.layout.item_concept_feeds_not_support : R.layout.item_concept_feeds_news_normal;
                            case bb.c.b.Tr /* 1605 */:
                                return !content_type.equals("27") ? R.layout.item_concept_feeds_not_support : R.layout.item_concept_feeds_news_wide;
                            case bb.c.b.Ur /* 1606 */:
                                return !content_type.equals("28") ? R.layout.item_concept_feeds_not_support : R.layout.item_concept_feeds_link;
                            case bb.c.b.Vr /* 1607 */:
                                return !content_type.equals("29") ? R.layout.item_concept_feeds_not_support : R.layout.item_concept_feeds_mobile_img;
                            default:
                                switch (iHashCode) {
                                    case bb.c.b.rs /* 1629 */:
                                        return !content_type.equals(BBSLinkObj.CONTENT_TYPE_EXPRESS_NEWS) ? R.layout.item_concept_feeds_not_support : R.layout.item_feeds_express_news;
                                    case bb.c.b.ss /* 1630 */:
                                        return !content_type.equals(BBSLinkObj.CONTENT_TYPE_REC_WRITE_ARTICLE) ? R.layout.item_concept_feeds_not_support : R.layout.item_bbs_rec_write_article;
                                    case bb.c.b.ts /* 1631 */:
                                        return !content_type.equals(BBSLinkObj.CONTENT_TYPE_REC_LINK) ? R.layout.item_concept_feeds_not_support : R.layout.item_link_list_hsv;
                                    case bb.c.b.us /* 1632 */:
                                        return !content_type.equals(BBSLinkObj.CONTENT_TYPE_NEWS_LINK_V2) ? R.layout.item_concept_feeds_not_support : R.layout.item_news_link_v2;
                                    default:
                                        switch (iHashCode) {
                                            case bb.c.b.ws /* 1634 */:
                                                return !content_type.equals(BBSLinkObj.CONTENT_TYPE_NEWS_V2) ? R.layout.item_concept_feeds_not_support : R.layout.item_news_v2;
                                            case bb.c.b.xs /* 1635 */:
                                                return !content_type.equals(BBSLinkObj.CONTENT_TYPE_NEWS_LINK_V3) ? R.layout.item_concept_feeds_not_support : R.layout.item_news_link_v3;
                                            case bb.c.b.ys /* 1636 */:
                                                return !content_type.equals(BBSLinkObj.CONTENT_TYPE_NEWS_V3) ? R.layout.item_concept_feeds_not_support : R.layout.item_news_v3;
                                            case bb.c.b.zs /* 1637 */:
                                                return !content_type.equals(BBSLinkObj.CONTENT_TYPE_NEWS_LINK_V4) ? R.layout.item_concept_feeds_not_support : R.layout.item_news_link_v4;
                                            case bb.c.b.As /* 1638 */:
                                                return !content_type.equals(BBSLinkObj.CONTENT_TYPE_NEWS_V4) ? R.layout.item_concept_feeds_not_support : R.layout.item_news_v4;
                                            default:
                                                switch (iHashCode) {
                                                    case bb.c.b.Ws /* 1660 */:
                                                        return !content_type.equals("40") ? R.layout.item_concept_feeds_not_support : R.layout.item_concept_moments_link;
                                                    case bb.c.b.Xs /* 1661 */:
                                                        return !content_type.equals(BBSLinkObj.CONTENT_TYPE_REC_USERS) ? R.layout.item_concept_feeds_not_support : R.layout.item_recommend_user_hsv;
                                                    case bb.c.b.Ys /* 1662 */:
                                                        return !content_type.equals("42") ? R.layout.item_concept_feeds_not_support : R.layout.item_moments_game_comment;
                                                    case bb.c.b.Zs /* 1663 */:
                                                        return !content_type.equals(BBSLinkObj.CONTENT_TYPE_NEWS_TOP) ? R.layout.item_concept_feeds_not_support : R.layout.item_channels_link_top;
                                                    case bb.c.b.at /* 1664 */:
                                                        return !content_type.equals(BBSLinkObj.CONTENT_TYPE_NEWS_CONFIG) ? R.layout.item_concept_feeds_not_support : R.layout.item_news_config;
                                                    case bb.c.b.bt /* 1665 */:
                                                        return !content_type.equals(BBSLinkObj.CONTENT_TYPE_UI_KIT) ? R.layout.item_concept_feeds_not_support : R.layout.item_news_feeds_ui_kit;
                                                    case bb.c.b.ct /* 1666 */:
                                                        if (!content_type.equals(BBSLinkObj.CONTENT_TYPE_TOPIC_ENTRY)) {
                                                            return R.layout.item_concept_feeds_not_support;
                                                        }
                                                        if (!(data instanceof FeedsContentTopicEntryObj)) {
                                                            return R.layout.item_topic_entry;
                                                        }
                                                        List<KeyDescObj> topic_list = ((FeedsContentTopicEntryObj) data).getTopic_list();
                                                        return (topic_list != null ? topic_list.size() : 0) > 1 ? R.layout.item_topic_entry_list : R.layout.item_topic_entry;
                                                    case bb.c.b.dt /* 1667 */:
                                                        return !content_type.equals(BBSLinkObj.CONTENT_TYPE_LINK_COLLECTION) ? R.layout.item_concept_feeds_not_support : R.layout.item_link_collection;
                                                    default:
                                                        switch (iHashCode) {
                                                            case bb.c.b.Ct /* 1691 */:
                                                                return !content_type.equals(BBSLinkObj.CONTENT_TYPE_LINK_NEWS_WITH_TOP_USER) ? R.layout.item_concept_feeds_not_support : R.layout.item_news_with_top_user;
                                                            case bb.c.b.Dt /* 1692 */:
                                                                return !content_type.equals(BBSLinkObj.CONTENT_TYPE_HOR_LINK_LIST) ? R.layout.item_concept_feeds_not_support : R.layout.item_feeds_hor_link_list;
                                                            case bb.c.b.Et /* 1693 */:
                                                                return !content_type.equals(BBSLinkObj.CONTENT_TYPE_EVENT_LIST) ? R.layout.item_concept_feeds_not_support : R.layout.item_event_list;
                                                            case bb.c.b.Ft /* 1694 */:
                                                                return !content_type.equals(BBSLinkObj.CONTENT_TYPE_HOR_EVENT) ? R.layout.item_concept_feeds_not_support : R.layout.item_feeds_hor_event;
                                                            default:
                                                                return R.layout.item_concept_feeds_not_support;
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public final void d(@dl.d BBSLinkListLikeCommentBase likeView, @dl.d BBSLinkObj link) {
        if (PatchProxy.proxy(new Object[]{likeView, link}, this, changeQuickRedirect, false, 42463, new Class[]{BBSLinkListLikeCommentBase.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(likeView, "likeView");
        f0.p(link, "link");
        if (!com.max.hbcommon.utils.c.u(link.getSp_like_key())) {
            LikeAnimResourceManager likeAnimResourceManager = LikeAnimResourceManager.f79963a;
            String sp_like_key = link.getSp_like_key();
            f0.o(sp_like_key, "link.sp_like_key");
            if (likeAnimResourceManager.l(sp_like_key)) {
                likeView.c(true);
                if (f0.g("1", link.getIs_award_link())) {
                    likeView.setNormalIconState(true);
                    String sp_like_key2 = link.getSp_like_key();
                    f0.o(sp_like_key2, "link.sp_like_key");
                    com.max.hbimage.b.K(Uri.fromFile(likeAnimResourceManager.f(sp_like_key2)).toString(), likeView.getNormalImageView());
                    return;
                }
                likeView.setNormalIconState(false);
                String sp_like_key3 = link.getSp_like_key();
                f0.o(sp_like_key3, "link.sp_like_key");
                com.max.hbimage.b.K(Uri.fromFile(likeAnimResourceManager.g(sp_like_key3)).toString(), likeView.getNormalImageView());
                return;
            }
        }
        likeView.setChecked(f0.g("1", link.getIs_award_link()));
    }

    public final void e(@dl.d BBSLinkListBottomBar vg_bottom_bar, @dl.d BBSLinkObj link) {
        if (PatchProxy.proxy(new Object[]{vg_bottom_bar, link}, this, changeQuickRedirect, false, 42462, new Class[]{BBSLinkListBottomBar.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(vg_bottom_bar, "vg_bottom_bar");
        f0.p(link, "link");
        vg_bottom_bar.getLikeComment().getBll_comment().setNum(link.getComment_num());
        vg_bottom_bar.getLikeComment().getBll_like().setNum(link.getLink_award_num());
        d(vg_bottom_bar.getLikeComment().getBll_like(), link);
    }
}
