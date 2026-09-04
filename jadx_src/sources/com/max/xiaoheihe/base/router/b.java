package com.max.xiaoheihe.base.router;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import bb.c;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hblogistics.AddressListActivity;
import com.max.hbutils.bean.Result;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.account.InterestProfileObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.LinkDraftObj;
import com.max.xiaoheihe.bean.bbs.PostBtnObj;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.module.account.InviteCodeActivity;
import com.max.xiaoheihe.module.account.MeHomeActivity;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.max.xiaoheihe.module.bbs.post.PostPageFactory;
import com.max.xiaoheihe.module.bbs.post.PostPageParam;
import com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.module.game.pubg.MatchesFragment;
import com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2GameDetailFragment;
import com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2HeroDetailFragment;
import com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2MatchDetailFragment;
import com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2TeammateFragment;
import com.max.xiaoheihe.module.littleprogram.fragment.pubg.PUBGCommonContainerFragment;
import com.max.xiaoheihe.module.webview.InjectJsV2Activity;
import com.max.xiaoheihe.module.webview.t;
import com.max.xiaoheihe.router.protocol.HeyboxWebProtocolHandler;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.sankuai.waimai.router.core.i;
import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import xh.m;

/* JADX INFO: compiled from: RouterRequestTemplate.kt */
/* JADX INFO: loaded from: classes3.dex */
@t0({"SMAP\nRouterRequestTemplate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouterRequestTemplate.kt\ncom/max/xiaoheihe/base/router/RouterRequestTemplate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,900:1\n1#2:901\n*E\n"})
@o(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final b f76931a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f76932b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: RouterRequestTemplate.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76933a;

        static {
            int[] iArr = new int[PostPageFactory.PostType.valuesCustom().length];
            try {
                iArr[PostPageFactory.PostType.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostPageFactory.PostType.WIKI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostPageFactory.PostType.WEB_NEWS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PostPageFactory.PostType.CONCEPT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PostPageFactory.PostType.PICTURE_TEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f76933a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.base.router.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RouterRequestTemplate.kt */
    public static final class RunnableC0624b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f76934b;

        RunnableC0624b(i iVar) {
            this.f76934b = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.fL, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f76934b.A();
        }
    }

    private b() {
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c A(@d Context context, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, c.m.TJ, new Class[]{Context.class, Boolean.TYPE}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        return z(context, "2", null, z10);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c A0(@d Context context, @d String url, @e WebView webView, @e String str, @e t tVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, url, webView, str, tVar}, null, changeQuickRedirect, true, c.m.MJ, new Class[]{Context.class, String.class, WebView.class, String.class, t.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(url, "url");
        com.sankuai.waimai.router.common.c cVar = new com.sankuai.waimai.router.common.c(context, url);
        cVar.s(com.max.xiaoheihe.router.c.f94907m, webView).s(com.max.xiaoheihe.router.c.f94905k, tVar).s(com.max.xiaoheihe.router.c.f94906l, str);
        return cVar;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c B(@d PostPageParam param, @d PostPageFactory.PostType type) {
        com.sankuai.waimai.router.common.c cVarF;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{param, type}, null, changeQuickRedirect, true, c.m.XJ, new Class[]{PostPageParam.class, PostPageFactory.PostType.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(param, "param");
        f0.p(type, "type");
        Context contextS = param.s();
        int i10 = a.f76933a[type.ordinal()];
        if (i10 == 1) {
            cVarF = f(contextS, lb.d.f131128b0);
        } else if (i10 == 2) {
            cVarF = f(contextS, lb.d.f131135c0);
        } else if (i10 == 3) {
            cVarF = f(contextS, lb.d.f131142d0);
        } else if (i10 == 4) {
            cVarF = f(contextS, lb.d.f131149e0);
        } else {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            cVarF = f(contextS, lb.d.f131156f0);
        }
        com.sankuai.waimai.router.common.c cVarU = cVarF.U("h_src", param.t()).U("link_id", param.v()).U("link_tag", param.w()).U(PostPageFactory.f81471g, param.z()).U("comment_id", param.r()).S(PostPageFactory.f81473i, param.A()).S(PostPageFactory.f81474j, param.y()).S(PostPageFactory.f81475k, param.B()).P(PostPageFactory.f81476l, param.E()).S("wiki", param.F()).S(PostPageFactory.f81482r, param.u()).U(PostPageFactory.f81483s, param.x());
        f0.o(cVarU, "when (type) {\n          …_PAGE_URL, param.pageUrl)");
        return cVarU;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c C(@d Context context, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, c.m.vK, new Class[]{Context.class, Boolean.TYPE}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarW = f(context, lb.d.f131179i2).W(AddressListActivity.N, z10);
        f0.o(cVarW, "getDefaultUriRequest(con…y.ARG_SELECT, chooseMode)");
        return cVarW;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c D(@d Context context, @d String orderId) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, orderId}, null, changeQuickRedirect, true, c.m.EK, new Class[]{Context.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(orderId, "orderId");
        com.sankuai.waimai.router.common.c cVarF = f(context, lb.d.Y1);
        Bundle bundle = new Bundle();
        bundle.putString("order_id", orderId);
        b2 b2Var = b2.f124493a;
        com.sankuai.waimai.router.common.c cVarQ = cVarF.Q("arg_bundle", bundle);
        f0.o(cVarQ, "getDefaultUriRequest(con…g(\"order_id\", orderId) })");
        return cVarQ;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c E(@d Context context, @d String orderId) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, orderId}, null, changeQuickRedirect, true, c.m.FK, new Class[]{Context.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(orderId, "orderId");
        com.sankuai.waimai.router.common.c cVarF = f(context, lb.d.Y1);
        Bundle bundle = new Bundle();
        bundle.putString("order_id", orderId);
        bundle.putBoolean("share_when_succeed", true);
        b2 b2Var = b2.f124493a;
        com.sankuai.waimai.router.common.c cVarQ = cVarF.Q("arg_bundle", bundle);
        f0.o(cVarQ, "getDefaultUriRequest(con…          }\n            )");
        return cVarQ;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c F(@d Context context, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, c.m.IK, new Class[]{Context.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarW = f(context, lb.d.X2).U("app_id", str).U("steam_id", i0.m()).U("user_id", i0.j()).W(ChannelsDetailActivity.f79595e4, true);
        f0.o(cVarW, "getDefaultUriRequest(con…ivity.ARG_DOWNLOAD, true)");
        return cVarW;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c G(@d Context context, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, null, changeQuickRedirect, true, c.m.BK, new Class[]{Context.class, Integer.TYPE}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarO = f(context, lb.d.f131195k4).O("page_index", i10);
        f0.o(cVarO, "getDefaultUriRequest(con…(\"page_index\", pageIndex)");
        return cVarO;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c H(@d Context context, @d SteamWalletJsObj data) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, data}, null, changeQuickRedirect, true, c.m.UK, new Class[]{Context.class, SteamWalletJsObj.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(data, "data");
        com.sankuai.waimai.router.common.c cVarS = f(context, lb.d.f131120a).S(lb.c.f131105a, data);
        f0.o(cVarS, "getDefaultUriRequest(con…rArgMap.EXTRA_DATA, data)");
        return cVarS;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c I(@d Context context, @e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3}, null, changeQuickRedirect, true, c.m.qK, new Class[]{Context.class, String.class, String.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarU = f(context, lb.d.f131276w1).U("userid", str).U("key", str2).U("from", str3);
        f0.o(cVarU, "getDefaultUriRequest(con…sActivity.ARG_FROM, from)");
        return cVarU;
    }

    public static /* synthetic */ com.sankuai.waimai.router.common.c J(Context context, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.rK, new Class[]{Context.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        return I(context, str, str2, str3);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c K(@d Context context, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, c.m.RK, new Class[]{Context.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarU = f(context, lb.d.f131173h3).U("app_id", str);
        f0.o(cVarU, "getDefaultUriRequest(con…uterArgMap.APP_ID, appId)");
        return cVarU;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c L(@d Context context, @e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3, str4}, null, changeQuickRedirect, true, c.m.JK, new Class[]{Context.class, String.class, String.class, String.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarU = f(context, lb.d.X2).U("h_src", str).U("app_id", str2).U(ChannelsDetailActivity.V3, str3).U("steam_id", i0.m()).U("user_id", i0.j()).U(ChannelsDetailActivity.f79598h4, str4);
        f0.o(cVarU, "getDefaultUriRequest(con…COMMENT_ID, topCommentId)");
        return cVarU;
    }

    public static /* synthetic */ com.sankuai.waimai.router.common.c M(Context context, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.KK, new Class[]{Context.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        return L(context, str, str2, str3, (i10 & 16) != 0 ? null : str4);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c N(@d Context context, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, c.m.SK, new Class[]{Context.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarU = f(context, lb.d.f131145d3).U("app_id", str);
        f0.o(cVarU, "getDefaultUriRequest(con…uterArgMap.APP_ID, appId)");
        return cVarU;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c O(@d Context context, @e String str, @e HashMap<String, Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, map}, null, changeQuickRedirect, true, c.m.eL, new Class[]{Context.class, String.class, HashMap.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarF = f(context, lb.d.N5);
        InjectJsV2Activity.a aVar = InjectJsV2Activity.f94204v4;
        com.sankuai.waimai.router.common.c cVarS = cVarF.U(aVar.a(), str).S(aVar.b(), map);
        f0.o(cVarS, "getDefaultUriRequest(con…RG_POST_PARAMS, postData)");
        return cVarS;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c P(@d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, c.m.yK, new Class[]{Context.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarW = f(context, lb.d.f131221o2).W("is_mall_trade", true);
        f0.o(cVarW, "getDefaultUriRequest(con…ra(\"is_mall_trade\", true)");
        return cVarW;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c Q(@d Context context, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, c.m.TK, new Class[]{Context.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarU = f(context, lb.d.f131152e3).U("app_id", str);
        f0.o(cVarU, "getDefaultUriRequest(con…uterArgMap.APP_ID, appId)");
        return cVarU;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c R(@d Context context, @d String orderId, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, orderId, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, c.m.CK, new Class[]{Context.class, String.class, Boolean.TYPE}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(orderId, "orderId");
        com.sankuai.waimai.router.common.c cVarW = f(context, lb.d.X1).U("order_id", orderId).W("definite_type", z10);
        f0.o(cVarW, "getDefaultUriRequest(con…ite_type\", definite_type)");
        return cVarW;
    }

    public static /* synthetic */ com.sankuai.waimai.router.common.c S(Context context, String str, boolean z10, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.DK, new Class[]{Context.class, String.class, Boolean.TYPE, Integer.TYPE, Object.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return R(context, str, z10);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c T(@d Context context, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, c.m.tK, new Class[]{Context.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarU = f(context, lb.d.U1).U(MeHomeActivity.L, str);
        f0.o(cVarU, "getDefaultUriRequest(con…vity.HEYBOX_ID, heyboxId)");
        return cVarU;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c U(@d Context context, @d String heyboxId, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, heyboxId, str}, null, changeQuickRedirect, true, c.m.uK, new Class[]{Context.class, String.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(heyboxId, "heyboxId");
        com.sankuai.waimai.router.common.c cVarU = f(context, lb.d.U1).U(MeHomeActivity.L, heyboxId).U(MeHomeActivity.M, str);
        f0.o(cVarU, "getDefaultUriRequest(con…tivity.STEAM_ID, steamId)");
        return cVarU;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c V(@d Context context, @e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3, str4, str5, str6}, null, changeQuickRedirect, true, c.m.QK, new Class[]{Context.class, String.class, String.class, String.class, String.class, String.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarU = f(context, lb.d.K3).U(PUBGCommonContainerFragment.A, "friend").U(PUBGCommonContainerFragment.B, str5 == null ? "" : str5).U(PUBGCommonContainerFragment.C, str6 == null ? "" : str6).U("nickname", str == null ? "" : str).U("season", str2 == null ? "" : str2).U("region", str3 == null ? "" : str3).U("player_id", str4 != null ? str4 : "");
        f0.o(cVarU, "getDefaultUriRequest(con…LAYER_ID, playerId ?: \"\")");
        return cVarU;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c W(@d Context context, @e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3, str4, str5, str6, str7}, null, changeQuickRedirect, true, c.m.OK, new Class[]{Context.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarU = f(context, lb.d.K3).U(PUBGCommonContainerFragment.A, str).U(PUBGCommonContainerFragment.B, str6).U(PUBGCommonContainerFragment.C, str7).U(MatchesFragment.C, str2).U(MatchesFragment.B, str3).U(MatchesFragment.D, str4).U(MatchesFragment.E, str5);
        f0.o(cVarU, "getDefaultUriRequest(con…gment.ARG_REGION, region)");
        return cVarU;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c X(@d Context context, @e ArrayList<KeyDescObj> arrayList, @e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, arrayList, str, str2, str3, str4, str5, str6, str7, str8}, null, changeQuickRedirect, true, c.m.PK, new Class[]{Context.class, ArrayList.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarU = f(context, "/game/pubg/detail_container_v2").U(PUBGCommonContainerFragment.B, str7).U(PUBGCommonContainerFragment.C, str8).S("region_filter", arrayList).U("nickname", str).U("mode", str2).U("season", str3).U("region", str4).U("fpp", str5).U("player_id", str6);
        f0.o(cVarU, "getDefaultUriRequest(con…ra(\"player_id\", playerID)");
        return cVarU;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c Y(@d Context context, @e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3, str4, str5}, null, changeQuickRedirect, true, c.m.NK, new Class[]{Context.class, String.class, String.class, String.class, String.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarU = f(context, lb.d.K3).U(PUBGCommonContainerFragment.A, PUBGCommonContainerFragment.f89170y).U(PUBGCommonContainerFragment.B, str4).U(PUBGCommonContainerFragment.C, str5).U("player_id", str).U("mode", str2).U("season", str3);
        f0.o(cVarU, "getDefaultUriRequest(con…ivity.ARG_SEASON, season)");
        return cVarU;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c Z(@d Context context, @e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, c.m.MK, new Class[]{Context.class, String.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarU = f(context, lb.d.J3).U("user_id", str).U("player_id", str2);
        f0.o(cVarU, "getDefaultUriRequest(con….ARG_PLAYER_ID, playerId)");
        return cVarU;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c a(@d Context context, @e Result<BBSLinkTreeObj> result, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, result, str}, null, changeQuickRedirect, true, c.m.cK, new Class[]{Context.class, Result.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarO = com.max.hbutils.utils.a.h(f(context, lb.d.f131129b1), "edit", result).O("page_type", 12);
        f0.o(cVarO, "getDefaultUriRequest(con…agment.TYPE_ARTICLE_EDIT)");
        return com.max.hbutils.utils.a.h(cVarO, NewLinkEditFragment.f82060c5, str);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c a0(@d Context context, @d String orderId) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, orderId}, null, changeQuickRedirect, true, c.m.GK, new Class[]{Context.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(orderId, "orderId");
        com.sankuai.waimai.router.common.c cVarF = f(context, lb.d.f131137c2);
        Bundle bundle = new Bundle();
        bundle.putString("order_id", orderId);
        b2 b2Var = b2.f124493a;
        com.sankuai.waimai.router.common.c cVarQ = cVarF.Q("arg_bundle", bundle);
        f0.o(cVarQ, "getDefaultUriRequest(con…g(\"order_id\", orderId) })");
        return cVarQ;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c b0(@d Context context, @d String orderId) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, orderId}, null, changeQuickRedirect, true, c.m.HK, new Class[]{Context.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(orderId, "orderId");
        com.sankuai.waimai.router.common.c cVarF = f(context, lb.d.f131144d2);
        Bundle bundle = new Bundle();
        bundle.putString("order_id", orderId);
        b2 b2Var = b2.f124493a;
        com.sankuai.waimai.router.common.c cVarQ = cVarF.Q("arg_bundle", bundle);
        f0.o(cVarQ, "getDefaultUriRequest(con…g(\"order_id\", orderId) })");
        return cVarQ;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c c(@d Context context, @e LinkDraftObj linkDraftObj, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, linkDraftObj, str}, null, changeQuickRedirect, true, c.m.oK, new Class[]{Context.class, LinkDraftObj.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarU = f(context, lb.d.f131129b1).U("link_tag", "1");
        f0.o(cVarU, "getDefaultUriRequest(con…Obj.LINK_TAG_COMMON_LINK)");
        com.sankuai.waimai.router.common.c cVarO = com.max.hbutils.utils.a.h(cVarU, "draft_info", linkDraftObj).O("page_type", 11);
        f0.o(cVarO, "getDefaultUriRequest(con…ent.TYPE_CONTRIBUTE_POST)");
        return com.max.hbutils.utils.a.h(cVarO, NewLinkEditFragment.f82060c5, str);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c c0(@d Context context, @d String userId, @e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, userId, str, str2}, null, changeQuickRedirect, true, c.m.LK, new Class[]{Context.class, String.class, String.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(userId, "userId");
        com.sankuai.waimai.router.common.c cVarU = f(context, lb.d.B3).U("user_id", userId).U("type", str).U(SwitchDetailActivity.P, str2);
        f0.o(cVarU, "getDefaultUriRequest(con…y.ARG_PROTOCOL, protocol)");
        return cVarU;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c d(@d Context context, @e LinkDraftObj linkDraftObj, @e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, linkDraftObj, str, str2, str3, str4}, null, changeQuickRedirect, true, c.m.jK, new Class[]{Context.class, LinkDraftObj.class, String.class, String.class, String.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarO = f(context, lb.d.f131129b1).U("link_tag", "1").U(NewLinkEditFragment.O4, str).O("page_type", 11);
        f0.o(cVarO, "getDefaultUriRequest(con…ent.TYPE_CONTRIBUTE_POST)");
        com.sankuai.waimai.router.common.c cVarU = com.max.hbutils.utils.a.h(com.max.hbutils.utils.a.h(cVarO, "draft_info", linkDraftObj), NewLinkEditFragment.f82064g5, str2).U("hashtag", str3).U("h_src", str4);
        f0.o(cVarU, "getDefaultUriRequest(con…a(RouterArgMap.SRC, hSrc)");
        return cVarU;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c d0(@d Context context, @e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, c.m.sK, new Class[]{Context.class, String.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarU = f(context, lb.d.G1).U("userid", str).U("key", str2);
        f0.o(cVarU, "getDefaultUriRequest(con…terArgMap.KEY, pageIndex)");
        return cVarU;
    }

    public static /* synthetic */ com.sankuai.waimai.router.common.c e(Context context, LinkDraftObj linkDraftObj, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, linkDraftObj, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.kK, new Class[]{Context.class, LinkDraftObj.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        return d(context, linkDraftObj, str, str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c e0(@d Context context, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, null, changeQuickRedirect, true, c.m.wK, new Class[]{Context.class, Integer.TYPE}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarO = f(context, lb.d.f131221o2).O("exchange_type", i10);
        f0.o(cVarO, "getDefaultUriRequest(con…ange_type\", exchangeType)");
        return cVarO;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c f(@d Context context, @d String path) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, path}, null, changeQuickRedirect, true, c.m.EJ, new Class[]{Context.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(path, "path");
        return new com.sankuai.waimai.router.common.c(context, hg.b.f119171c + path);
    }

    public static /* synthetic */ com.sankuai.waimai.router.common.c f0(Context context, int i10, int i11, Object obj) {
        Object[] objArr = {context, new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.m.xK, new Class[]{Context.class, cls, cls, Object.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return e0(context, i10);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.d g(@d Fragment fragment, @d String path) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fragment, path}, null, changeQuickRedirect, true, c.m.FJ, new Class[]{Fragment.class, String.class}, com.sankuai.waimai.router.common.d.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.d) patchProxyResultProxy.result;
        }
        f0.p(fragment, "fragment");
        f0.p(path, "path");
        return new com.sankuai.waimai.router.common.d(fragment, hg.b.f119171c + path);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c g0(@d Context context, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, null, changeQuickRedirect, true, c.m.zK, new Class[]{Context.class, Integer.TYPE}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarO = f(context, lb.d.f131228p2).O("page_index", i10);
        f0.o(cVarO, "getDefaultUriRequest(con…(\"page_index\", pageIndex)");
        return cVarO;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c h(@d Context context, @e Result<BBSLinkTreeObj> result, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, result, str}, null, changeQuickRedirect, true, c.m.aK, new Class[]{Context.class, Result.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarO = com.max.hbutils.utils.a.h(f(context, lb.d.f131129b1), "edit", result).O("page_type", 10);
        f0.o(cVarO, "getDefaultUriRequest(con…tFragment.TYPE_LINK_EDIT)");
        return com.max.hbutils.utils.a.h(cVarO, NewLinkEditFragment.f82060c5, str);
    }

    public static /* synthetic */ com.sankuai.waimai.router.common.c h0(Context context, int i10, int i11, Object obj) {
        Object[] objArr = {context, new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.m.AK, new Class[]{Context.class, cls, cls, Object.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return g0(context, i10);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c i(@d Context context, @e Result<BBSLinkTreeObj> result, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, result, str}, null, changeQuickRedirect, true, c.m.pK, new Class[]{Context.class, Result.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarO = com.max.hbutils.utils.a.h(f(context, lb.d.f131129b1), "edit", result).O("page_type", 14);
        f0.o(cVarO, "getDefaultUriRequest(con…_POST_DRAFT\n            )");
        return com.max.hbutils.utils.a.h(cVarO, NewLinkEditFragment.f82060c5, str);
    }

    @m
    public static final void i0(@d Context context, @d String path) {
        if (PatchProxy.proxy(new Object[]{context, path}, null, changeQuickRedirect, true, c.m.HJ, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(path, "path");
        hg.b.q(context, path);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c j(@d Context context, @e Result<BBSLinkTreeObj> result, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, result, str}, null, changeQuickRedirect, true, c.m.bK, new Class[]{Context.class, Result.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarO = com.max.hbutils.utils.a.h(f(context, lb.d.f131129b1), "edit", result).O("page_type", 13);
        f0.o(cVarO, "getDefaultUriRequest(con…nt.TYPE_WRITE_POST_DRAFT)");
        return com.max.hbutils.utils.a.h(cVarO, NewLinkEditFragment.f82060c5, str);
    }

    @m
    public static final void j0(@d Context context, @e String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, c.m.KJ, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        if (str == null || str.length() == 0) {
            return;
        }
        A0(context, str, null, null, null).A();
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c k(@d Context context, @e String str, int i10, @e String str2, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, new Integer(i10), str2, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, c.m.fK, new Class[]{Context.class, String.class, Integer.TYPE, String.class, Boolean.TYPE}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarW = f(context, lb.d.f131143d1).O("appid", str != null ? Integer.parseInt(str) : -1).O("rating", i10).U("game_platf", str2).W("game_impression", z10);
        f0.o(cVarW, "getDefaultUriRequest(con…ON, selectGameImpression)");
        return cVarW;
    }

    @m
    public static final void k0(@d Context context, @e String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, c.m.JJ, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        g.f74531b.q("RouterRequestTemplate, url = " + str);
        if (str == null || str.length() == 0) {
            return;
        }
        A0(context, str, null, null, null).A();
    }

    public static /* synthetic */ com.sankuai.waimai.router.common.c l(Context context, String str, int i10, String str2, boolean z10, int i11, Object obj) {
        int i12 = i10;
        Object[] objArr = {context, str, new Integer(i12), str2, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.m.gK, new Class[]{Context.class, String.class, cls, String.class, Boolean.TYPE, cls, Object.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        if ((i11 & 4) != 0) {
            i12 = 0;
        }
        return k(context, str, i12, (i11 & 8) != 0 ? null : str2, (i11 & 16) == 0 ? z10 ? 1 : 0 : false);
    }

    @m
    public static final void l0(@d Context context, @d String url, @e WebView webView, @e String str, @e t tVar) {
        if (PatchProxy.proxy(new Object[]{context, url, webView, str, tVar}, null, changeQuickRedirect, true, c.m.LJ, new Class[]{Context.class, String.class, WebView.class, String.class, t.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(url, "url");
        A0(context, url, webView, str, tVar).A();
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c m(@d Context context, @e BBSTopicObj bBSTopicObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, bBSTopicObj}, null, changeQuickRedirect, true, c.m.dK, new Class[]{Context.class, BBSTopicObj.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarO = f(context, lb.d.f131129b1).U("link_tag", "1").S(NewLinkEditFragment.Q4, bBSTopicObj).O("page_type", 0);
        f0.o(cVarO, "getDefaultUriRequest(con…Fragment.TYPE_WRITE_POST)");
        return cVarO;
    }

    @m
    public static final void m0(@d Context context, @d String title, @d String pageUrl) {
        if (PatchProxy.proxy(new Object[]{context, title, pageUrl}, null, changeQuickRedirect, true, c.m.IJ, new Class[]{Context.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(title, "title");
        f0.p(pageUrl, "pageUrl");
        f(context, lb.d.f131251s4).U("title", title).U("pageurl", pageUrl).A();
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c n(@d Context context, @e LinkDraftObj linkDraftObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, linkDraftObj}, null, changeQuickRedirect, true, c.m.eK, new Class[]{Context.class, LinkDraftObj.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarU = f(context, lb.d.f131129b1).U("link_tag", "1");
        f0.o(cVarU, "getDefaultUriRequest(con…Obj.LINK_TAG_COMMON_LINK)");
        com.sankuai.waimai.router.common.c cVarO = com.max.hbutils.utils.a.h(cVarU, "draft_info", linkDraftObj).O("page_type", 0);
        f0.o(cVarO, "getDefaultUriRequest(con…Fragment.TYPE_WRITE_POST)");
        return cVarO;
    }

    @m
    public static final void n0(@d Context context, @e String str, @e String str2) {
        if (PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, c.m.ZK, new Class[]{Context.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        HashMap map = new HashMap();
        if (str != null) {
            map.put(Dota2GameDetailFragment.C.b(), str);
        }
        if (str2 != null) {
            map.put(Dota2GameDetailFragment.C.a(), str2);
        }
        HeyboxWebProtocolHandler heyboxWebProtocolHandler = l0.f95687b;
        WebProtocolObj webProtocolObjZ = l0.z(lb.d.X3, map);
        f0.o(webProtocolObjZ, "getOpenRouterPathProtoco…DOTA2_CALENDAR_LIST, map)");
        heyboxWebProtocolHandler.C(context, null, webProtocolObjZ, null);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c o(@d Context context, @e LinkDraftObj linkDraftObj, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, linkDraftObj, str}, null, changeQuickRedirect, true, c.m.YJ, new Class[]{Context.class, LinkDraftObj.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarU = f(context, lb.d.f131129b1).U("link_tag", "1");
        f0.o(cVarU, "getDefaultUriRequest(con…Obj.LINK_TAG_COMMON_LINK)");
        com.sankuai.waimai.router.common.c cVarO = com.max.hbutils.utils.a.h(cVarU, "draft_info", linkDraftObj).O("page_type", 0);
        f0.o(cVarO, "getDefaultUriRequest(con…Fragment.TYPE_WRITE_POST)");
        return com.max.hbutils.utils.a.h(cVarO, NewLinkEditFragment.f82060c5, str);
    }

    @m
    public static final void o0(@d Context context, @e String str, @e String str2) {
        if (PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, c.m.YK, new Class[]{Context.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        HashMap map = new HashMap();
        if (str != null) {
            map.put(Dota2GameDetailFragment.C.b(), str);
        }
        if (str2 != null) {
            map.put(Dota2GameDetailFragment.C.a(), str2);
        }
        HeyboxWebProtocolHandler heyboxWebProtocolHandler = l0.f95687b;
        WebProtocolObj webProtocolObjZ = l0.z(lb.d.W3, map);
        f0.o(webProtocolObjZ, "getOpenRouterPathProtoco…2_FOLLOW_MATCH_LIST, map)");
        heyboxWebProtocolHandler.C(context, null, webProtocolObjZ, null);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c p(@d Context context, @e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, c.m.nK, new Class[]{Context.class, String.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarO = f(context, lb.d.f131129b1).U("link_tag", "1").U(NewLinkEditFragment.O4, str).O("page_type", 0);
        f0.o(cVarO, "getDefaultUriRequest(con…Fragment.TYPE_WRITE_POST)");
        return com.max.hbutils.utils.a.h(cVarO, NewLinkEditFragment.f82064g5, str2);
    }

    @m
    public static final void p0(@d Context context, @e String str, @e String str2) {
        if (PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, c.m.VK, new Class[]{Context.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        HashMap map = new HashMap();
        if (str != null) {
            map.put(Dota2GameDetailFragment.C.b(), str);
        }
        if (str2 != null) {
            map.put(Dota2GameDetailFragment.C.a(), str2);
        }
        HeyboxWebProtocolHandler heyboxWebProtocolHandler = l0.f95687b;
        WebProtocolObj webProtocolObjZ = l0.z(lb.d.T3, map);
        f0.o(webProtocolObjZ, "getOpenRouterPathProtoco…RouterPathMap.DOTA2, map)");
        heyboxWebProtocolHandler.C(context, null, webProtocolObjZ, null);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c q(@d Context context, @e String str, @e String str2, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, c.m.mK, new Class[]{Context.class, String.class, String.class, Boolean.TYPE}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarW = f(context, lb.d.f131129b1).U("link_tag", "1").U(NewLinkEditFragment.O4, str).U("hashtag", str2).O("page_type", 0).W(NewLinkEditFragment.f82065h5, z10);
        f0.o(cVarW, "getDefaultUriRequest(con…t.ARG_FIXED_TOPIC, fixed)");
        return cVarW;
    }

    @m
    public static final void q0(@d Context context, @e String str, @e String str2, @e String str3) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, str3}, null, changeQuickRedirect, true, c.m.dL, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        HashMap map = new HashMap();
        if (str != null) {
            map.put(Dota2HeroDetailFragment.F.a(), str);
        }
        if (str2 != null) {
            map.put(Dota2GameDetailFragment.C.b(), str2);
        }
        if (str3 != null) {
            map.put(Dota2GameDetailFragment.C.a(), str3);
        }
        HeyboxWebProtocolHandler heyboxWebProtocolHandler = l0.f95687b;
        WebProtocolObj webProtocolObjZ = l0.z(lb.d.f131132b4, map);
        f0.o(webProtocolObjZ, "getOpenRouterPathProtoco…p.DOTA2_HERO_DETAIL, map)");
        heyboxWebProtocolHandler.C(context, null, webProtocolObjZ, null);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c r(@d Context context, @e String str, @e PostBtnObj postBtnObj, @e HashMap<String, String> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, postBtnObj, map}, null, changeQuickRedirect, true, c.m.iK, new Class[]{Context.class, String.class, PostBtnObj.class, HashMap.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarO = f(context, lb.d.f131129b1).U("link_tag", "1").U(NewLinkEditFragment.O4, str).S(NewLinkEditFragment.f82063f5, postBtnObj).S("extra_params", map).O("page_type", 0);
        f0.o(cVarO, "getDefaultUriRequest(con…Fragment.TYPE_WRITE_POST)");
        return cVarO;
    }

    @m
    public static final void r0(@d Context context, @e String str, @e String str2) {
        if (PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, c.m.bL, new Class[]{Context.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        HashMap map = new HashMap();
        if (str != null) {
            map.put(Dota2GameDetailFragment.C.b(), str);
        }
        if (str2 != null) {
            map.put(Dota2GameDetailFragment.C.a(), str2);
        }
        HeyboxWebProtocolHandler heyboxWebProtocolHandler = l0.f95687b;
        WebProtocolObj webProtocolObjZ = l0.z(lb.d.Z3, map);
        f0.o(webProtocolObjZ, "getOpenRouterPathProtoco…Map.DOTA2_HERO_LIST, map)");
        heyboxWebProtocolHandler.C(context, null, webProtocolObjZ, null);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c s(@d Context context, @e LinkDraftObj linkDraftObj, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, linkDraftObj, str}, null, changeQuickRedirect, true, c.m.ZJ, new Class[]{Context.class, LinkDraftObj.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarO = f(context, lb.d.f131129b1).U("link_tag", "21").U(NewLinkEditFragment.O4, BBSTopicObj.TOPIC_ID_TIMELINE).O("page_type", 9);
        f0.o(cVarO, "getDefaultUriRequest(con…ment.TYPE_WRITE_TIMELINE)");
        return com.max.hbutils.utils.a.h(com.max.hbutils.utils.a.h(cVarO, "draft_info", linkDraftObj), NewLinkEditFragment.f82060c5, str);
    }

    @m
    public static final void s0(@d Context context, @e String str, @e String str2, @e String str3) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, str3}, null, changeQuickRedirect, true, c.m.WK, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        HashMap map = new HashMap();
        if (str != null) {
            map.put(Dota2MatchDetailFragment.F, str);
        }
        if (str2 != null) {
            map.put(Dota2GameDetailFragment.C.b(), str2);
        }
        if (str3 != null) {
            map.put(Dota2GameDetailFragment.C.a(), str3);
        }
        HeyboxWebProtocolHandler heyboxWebProtocolHandler = l0.f95687b;
        WebProtocolObj webProtocolObjZ = l0.z(lb.d.U3, map);
        f0.o(webProtocolObjZ, "getOpenRouterPathProtoco….DOTA2_MATCH_DETAIL, map)");
        heyboxWebProtocolHandler.C(context, null, webProtocolObjZ, null);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c t(@d Context context, @e LinkDraftObj linkDraftObj, @e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, linkDraftObj, str, str2}, null, changeQuickRedirect, true, c.m.hK, new Class[]{Context.class, LinkDraftObj.class, String.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarU = f(context, lb.d.f131129b1).U("link_tag", "21").U(NewLinkEditFragment.O4, BBSTopicObj.TOPIC_ID_TIMELINE).O("page_type", 9).U("hashtag", str);
        f0.o(cVarU, "getDefaultUriRequest(con…nt.ARG_HASH_TAG, hashtag)");
        return com.max.hbutils.utils.a.h(com.max.hbutils.utils.a.h(cVarU, "draft_info", linkDraftObj), NewLinkEditFragment.f82064g5, str2);
    }

    @m
    public static final void t0(@d Context context, @e String str, @e String str2) {
        if (PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, c.m.XK, new Class[]{Context.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        HashMap map = new HashMap();
        if (str != null) {
            map.put(Dota2GameDetailFragment.C.b(), str);
        }
        if (str2 != null) {
            map.put(Dota2GameDetailFragment.C.a(), str2);
        }
        HeyboxWebProtocolHandler heyboxWebProtocolHandler = l0.f95687b;
        WebProtocolObj webProtocolObjZ = l0.z(lb.d.V3, map);
        f0.o(webProtocolObjZ, "getOpenRouterPathProtoco…ap.DOTA2_MATCH_LIST, map)");
        heyboxWebProtocolHandler.C(context, null, webProtocolObjZ, null);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c u(@d Context context, @d String account, @d String rules, @e InterestProfileObj interestProfileObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, account, rules, interestProfileObj}, null, changeQuickRedirect, true, c.m.OJ, new Class[]{Context.class, String.class, String.class, InterestProfileObj.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(account, "account");
        f0.p(rules, "rules");
        com.sankuai.waimai.router.common.c cVarS = f(context, lb.d.f131230p4).U(InviteCodeActivity.P, account).U(InviteCodeActivity.Q, rules).S(InviteCodeActivity.R, interestProfileObj);
        f0.o(cVarS, "getDefaultUriRequest(con…ctivity.ARG_PROFILE, obj)");
        return cVarS;
    }

    @m
    public static final void u0(@d Context context, @e String str, @e String str2) {
        if (PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, c.m.aL, new Class[]{Context.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        HashMap map = new HashMap();
        if (str != null) {
            map.put(Dota2GameDetailFragment.C.b(), str);
        }
        if (str2 != null) {
            map.put(Dota2GameDetailFragment.C.a(), str2);
        }
        HeyboxWebProtocolHandler heyboxWebProtocolHandler = l0.f95687b;
        WebProtocolObj webProtocolObjZ = l0.z(lb.d.Y3, map);
        f0.o(webProtocolObjZ, "getOpenRouterPathProtoco…p.DOTA2_RECORD_LIST, map)");
        heyboxWebProtocolHandler.C(context, null, webProtocolObjZ, null);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c v(@d Context context, @d Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, uri}, null, changeQuickRedirect, true, c.m.NJ, new Class[]{Context.class, Uri.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(uri, "uri");
        com.sankuai.waimai.router.common.c cVarP0 = new com.sankuai.waimai.router.common.c(context, uri).p0(268435456);
        f0.o(cVarP0, "DefaultUriRequest(contex…t.FLAG_ACTIVITY_NEW_TASK)");
        return cVarP0;
    }

    @m
    public static final void v0(@d Context context, @e String str, @e String str2, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, c.m.cL, new Class[]{Context.class, String.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        HashMap map = new HashMap();
        if (str != null) {
            map.put(Dota2GameDetailFragment.C.b(), str);
        }
        if (str2 != null) {
            map.put(Dota2GameDetailFragment.C.a(), str2);
        }
        map.put(Dota2TeammateFragment.A, z10 ? "1" : "0");
        HeyboxWebProtocolHandler heyboxWebProtocolHandler = l0.f95687b;
        WebProtocolObj webProtocolObjZ = l0.z(lb.d.f131125a4, map);
        f0.o(webProtocolObjZ, "getOpenRouterPathProtoco…hMap.DOTA2_TEAMMATE, map)");
        heyboxWebProtocolHandler.C(context, null, webProtocolObjZ, null);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c w(@d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, c.m.SJ, new Class[]{Context.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        return A(context, false);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c w0(@d Context context, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, null, changeQuickRedirect, true, c.m.RJ, new Class[]{Context.class, Integer.TYPE}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        Bundle bundle = new Bundle();
        bundle.putInt(com.max.xiaoheihe.module.search.b.f91614a.e(), i10);
        return x0(context, bundle);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c x(@d Context context, @d String listType, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, listType, str}, null, changeQuickRedirect, true, c.m.UJ, new Class[]{Context.class, String.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(listType, "listType");
        return z(context, listType, str, false);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c x0(@d Context context, @e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, bundle}, null, changeQuickRedirect, true, c.m.QJ, new Class[]{Context.class, Bundle.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        return y0(context, null, bundle);
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c y(@d Context context, @d String listType, @e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, listType, str, str2}, null, changeQuickRedirect, true, c.m.WJ, new Class[]{Context.class, String.class, String.class, String.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(listType, "listType");
        com.sankuai.waimai.router.common.c cVarU = f(context, lb.d.f131279w4).U("list_type", listType).U("message_type", str).W("prefer_friend_list", false).U("sender_id", str2);
        f0.o(cVarU, "getDefaultUriRequest(con….ARG_SENDER_ID, senderID)");
        return cVarU;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c y0(@d Context context, @e String str, @e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, bundle}, null, changeQuickRedirect, true, c.m.PJ, new Class[]{Context.class, String.class, Bundle.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarF = f(context, lb.d.f131253t);
        if (str != null) {
            cVarF.U("q", str);
        }
        if (bundle != null) {
            cVarF.i0(bundle);
        }
        return cVarF;
    }

    @d
    @m
    public static final com.sankuai.waimai.router.common.c z(@d Context context, @d String listType, @e String str, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, listType, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, c.m.VJ, new Class[]{Context.class, String.class, String.class, Boolean.TYPE}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(listType, "listType");
        com.sankuai.waimai.router.common.c cVarW = f(context, lb.d.f131279w4).U("list_type", listType).U("message_type", str).W("prefer_friend_list", z10);
        f0.o(cVarW, "getDefaultUriRequest(con…D_LIST, preferFriendList)");
        return cVarW;
    }

    @m
    public static final void z0(@d i request) {
        if (PatchProxy.proxy(new Object[]{request}, null, changeQuickRedirect, true, c.m.GJ, new Class[]{i.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(request, "request");
        if (!(request.b() instanceof Activity)) {
            com.max.xiaoheihe.router.interceptors.m.x(request, 268435456).A();
            return;
        }
        Context contextB = request.b();
        f0.n(contextB, "null cannot be cast to non-null type android.app.Activity");
        ((Activity) contextB).runOnUiThread(new RunnableC0624b(request));
    }

    @d
    public final com.sankuai.waimai.router.common.c b(@d Context context, @e LinkDraftObj linkDraftObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, linkDraftObj}, this, changeQuickRedirect, false, c.m.lK, new Class[]{Context.class, LinkDraftObj.class}, com.sankuai.waimai.router.common.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        com.sankuai.waimai.router.common.c cVarO = f(context, lb.d.f131129b1).U("link_tag", "1").O("page_type", 11);
        f0.o(cVarO, "getDefaultUriRequest(con…ent.TYPE_CONTRIBUTE_POST)");
        return com.max.hbutils.utils.a.h(cVarO, "draft_info", linkDraftObj);
    }
}
