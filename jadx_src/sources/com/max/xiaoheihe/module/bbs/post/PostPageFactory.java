package com.max.xiaoheihe.module.bbs.post;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.utils.c;
import com.max.xiaoheihe.base.router.b;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.module.bbs.post.ui.activitys.ConceptPostPageActivity;
import com.max.xiaoheihe.module.bbs.post.ui.activitys.NormalPostPageActivity;
import com.max.xiaoheihe.module.bbs.post.ui.activitys.WebNewsPostPageActivity;
import com.max.xiaoheihe.module.bbs.post.ui.activitys.WikiPostPageActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: PostPageFactory.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class PostPageFactory {

    @d
    public static final String A = "page_video_content";

    @d
    public static final String B = "page_video_comments";

    @d
    public static final String C = "page_wiki_content";

    @d
    public static final String D = "page_wiki_comments";

    @d
    public static final String E = "page_post";

    @d
    public static final String F = "page_picture";

    @d
    public static final String G = "page_screenshot_comments";

    @d
    public static final String H = "page_screenshot_content";

    @d
    public static final String I = "title_mode_content";

    @d
    public static final String J = "title_mode_comment";

    @d
    public static final String K = "title_mode_navigation";

    @d
    public static final String L = "game_purchase";

    @d
    public static final String M = "share_image";
    public static final int N = 123;
    public static final int O = 124;

    @d
    public static final String P = "extra_data_current_position";

    @d
    public static final String Q = "extra_data_duration";
    public static final int R = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final a f81465a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f81466b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f81467c = 9;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    public static final String f81468d = "h_src";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    public static final String f81469e = "link_id";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    public static final String f81470f = "link_tag";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    public static final String f81471g = "root_comment_id";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d
    public static final String f81472h = "comment_id";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d
    public static final String f81473i = "comment_page";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @d
    public static final String f81474j = "rec_obj";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @d
    public static final String f81475k = "show_topic";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @d
    public static final String f81476l = "video_position";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @d
    public static final String f81477m = "wiki";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @d
    public static final String f81478n = "post_style";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @d
    public static final String f81479o = "vertical_video";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @d
    public static final String f81480p = "video_info";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @d
    public static final String f81481q = "image_info";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @d
    public static final String f81482r = "link_info";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @d
    public static final String f81483s = "page_url";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @d
    public static final String f81484t = "has_video";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @d
    public static final String f81485u = "need_story_mode_report";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @d
    public static final String f81486v = "post_style_news";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @d
    public static final String f81487w = "post_style_wiki";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @d
    public static final String f81488x = "post_style_post";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @d
    public static final String f81489y = "page_news_content";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @d
    public static final String f81490z = "page_news_comments";

    /* JADX INFO: compiled from: PostPageFactory.kt */
    public enum PostType {
        NORMAL,
        WIKI,
        WEB_NEWS,
        CONCEPT,
        PICTURE_TEXT;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static PostType valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 28495, new Class[]{String.class}, PostType.class);
            return (PostType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(PostType.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static PostType[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 28494, new Class[0], PostType[].class);
            return (PostType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: PostPageFactory.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post.PostPageFactory$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PostPageFactory.kt */
        public final /* synthetic */ class C0702a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f81491a;

            static {
                int[] iArr = new int[PostType.valuesCustom().length];
                try {
                    iArr[PostType.NORMAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PostType.WIKI.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PostType.WEB_NEWS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PostType.CONCEPT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[PostType.PICTURE_TEXT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f81491a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @d
        public final PostPageParam a(@e Context context, @d LinkInfoObj linkInfoObj, boolean z10) {
            LinkInfoObj data = linkInfoObj;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, data, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28493, new Class[]{Context.class, LinkInfoObj.class, Boolean.TYPE}, PostPageParam.class);
            if (patchProxyResultProxy.isSupported) {
                return (PostPageParam) patchProxyResultProxy.result;
            }
            f0.p(data, "data");
            f0.m(context);
            String h_src = linkInfoObj.getH_src();
            String linkid = linkInfoObj.getLinkid();
            String link_tag = linkInfoObj.getLink_tag();
            Boolean boolValueOf = Boolean.valueOf(z10);
            int vertical = linkInfoObj.getVertical();
            if (c.u(linkInfoObj.getText())) {
                data = null;
            }
            return new PostPageParam(context, h_src, linkid, link_tag, null, boolValueOf, null, null, 0L, null, vertical, data, null, null, null, 28672, null);
        }

        @d
        @m
        public final Intent b(@d PostPageParam param, @d PostType type) {
            Intent intent;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{param, type}, this, changeQuickRedirect, false, 28491, new Class[]{PostPageParam.class, PostType.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(param, "param");
            f0.p(type, "type");
            int i10 = C0702a.f81491a[type.ordinal()];
            if (i10 == 1) {
                intent = new Intent(param.s(), (Class<?>) NormalPostPageActivity.class);
            } else if (i10 == 2) {
                intent = new Intent(param.s(), (Class<?>) WikiPostPageActivity.class);
            } else if (i10 == 3) {
                intent = new Intent(param.s(), (Class<?>) WebNewsPostPageActivity.class);
            } else {
                if (i10 != 4 && i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                intent = new Intent(param.s(), (Class<?>) ConceptPostPageActivity.class);
            }
            intent.putExtra("h_src", param.t());
            intent.putExtra("link_id", param.v());
            intent.putExtra("link_tag", param.w());
            intent.putExtra(PostPageFactory.f81471g, param.z());
            intent.putExtra("comment_id", param.r());
            intent.putExtra(PostPageFactory.f81473i, param.A());
            intent.putExtra(PostPageFactory.f81474j, param.y());
            intent.putExtra(PostPageFactory.f81475k, param.B());
            intent.putExtra(PostPageFactory.f81476l, param.E());
            intent.putExtra("wiki", param.F());
            intent.putExtra(PostPageFactory.f81482r, param.u());
            return intent;
        }

        public final void c(@d Context context, @d PostType type, @d LinkInfoObj info, boolean z10) {
            if (PatchProxy.proxy(new Object[]{context, type, info, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28492, new Class[]{Context.class, PostType.class, LinkInfoObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(type, "type");
            f0.p(info, "info");
            b.B(a(context, info, z10), type).A();
        }
    }

    @d
    @m
    public static final Intent a(@d PostPageParam postPageParam, @d PostType postType) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postPageParam, postType}, null, changeQuickRedirect, true, 28490, new Class[]{PostPageParam.class, PostType.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : f81465a.b(postPageParam, postType);
    }
}
