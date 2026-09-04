package com.max.basebbs.utils;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import bb.c;
import com.max.basebbs.bean.BBSLinkRecObj;
import com.max.basebbs.bean.video.VideoInfoObj;
import com.max.basebbs.bean.video.VideoInfoResult;
import com.max.hbcommon.network.d;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import dl.e;
import io.reactivex.e0;
import io.reactivex.z;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kh.o;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.text.u;
import oa.b;
import okhttp3.d0;
import yh.l;

/* JADX INFO: compiled from: AccelWorldBBS.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class AccelWorldBBSKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: AccelWorldBBS.kt */
    public static final class a extends d<VideoInfoResult<String>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Throwable, b2> f65080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ io.reactivex.disposables.a f65081c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f65082d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l<VideoInfoObj, b2> f65083e;

        /* JADX WARN: Multi-variable type inference failed */
        a(l<? super Throwable, b2> lVar, io.reactivex.disposables.a aVar, String str, l<? super VideoInfoObj, b2> lVar2) {
            this.f65080b = lVar;
            this.f65081c = aVar;
            this.f65082d = str;
            this.f65083e = lVar2;
        }

        public void a(@dl.d VideoInfoResult<String> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, c.b.f30752kg, new Class[]{VideoInfoResult.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext(result);
            if (result.getUrl_info() != null) {
                io.reactivex.disposables.a aVar = this.f65081c;
                Map<String, String> url_info = result.getUrl_info();
                f0.o(url_info, "getUrl_info(...)");
                AccelWorldBBSKt.e(aVar, url_info, this.f65082d, this.f65083e, this.f65080b);
                return;
            }
            if (result.getVideo_url() == null) {
                this.f65080b.invoke(new Throwable("未获取到有效视频链接"));
                return;
            }
            VideoInfoObj videoInfoObj = new VideoInfoObj();
            videoInfoObj.setVideo_url(result.getVideo_url());
            this.f65083e.invoke(videoInfoObj);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, c.b.f30729jg, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            this.f65080b.invoke(e10);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 999, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((VideoInfoResult) obj);
        }
    }

    /* JADX INFO: compiled from: AccelWorldBBS.kt */
    public static final class b extends d<Result<VideoInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Throwable, b2> f65084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<VideoInfoObj, b2> f65085c;

        /* JADX WARN: Multi-variable type inference failed */
        b(l<? super Throwable, b2> lVar, l<? super VideoInfoObj, b2> lVar2) {
            this.f65084b = lVar;
            this.f65085c = lVar2;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 1002, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            this.f65084b.invoke(e10);
        }

        public void onNext(@dl.d Result<VideoInfoObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 1003, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            VideoInfoObj result2 = result.getResult();
            if (com.max.hbcommon.utils.c.u(result2 != null ? result2.getVideo_url() : null)) {
                this.f65084b.invoke(new Throwable("未获取到有效视频链接"));
                return;
            }
            l<VideoInfoObj, b2> lVar = this.f65085c;
            VideoInfoObj result3 = result.getResult();
            f0.m(result3);
            lVar.invoke(result3);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1004, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<VideoInfoObj>) obj);
        }
    }

    public static final void b(@e io.reactivex.disposables.a aVar, @e String str, @dl.d l<? super VideoInfoObj, b2> onSuccessFoo, @dl.d l<? super Throwable, b2> onErrorFoo) {
        if (PatchProxy.proxy(new Object[]{aVar, str, onSuccessFoo, onErrorFoo}, null, changeQuickRedirect, true, c.b.f30660gg, new Class[]{io.reactivex.disposables.a.class, String.class, l.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(onSuccessFoo, "onSuccessFoo");
        f0.p(onErrorFoo, "onErrorFoo");
        if (str == null || aVar == null) {
            return;
        }
        aVar.c((io.reactivex.disposables.b) oa.b.a(true).c(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(onErrorFoo, aVar, str, onSuccessFoo)));
    }

    public static final boolean c(@e String str) {
        String queryParameter;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.b.f30637fg, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (str == null || (queryParameter = Uri.parse(str).getQueryParameter("et")) == null) {
            return false;
        }
        return ((long) Integer.parseInt(queryParameter)) - (System.currentTimeMillis() / ((long) 1000)) <= 5;
    }

    public static final void d(@e Context context, @e View view, int i10, int i11) {
        int iL;
        int iF;
        Object[] objArr = {context, view, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.b.f30614eg, new Class[]{Context.class, View.class, cls, cls}, Void.TYPE).isSupported || context == null || view == null) {
            return;
        }
        if (i10 <= 0 || i11 <= 0) {
            iL = ViewUtils.L(context) - ViewUtils.f(context, 24.0f);
            iF = (int) ((iL * 187.0f) / 351.0f);
        } else if (i11 > i10) {
            iL = ViewUtils.f(context, 172.0f);
            iF = ViewUtils.f(context, 230.0f);
        } else {
            iL = ViewUtils.f(context, 230.0f);
            iF = ViewUtils.f(context, 172.0f);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(0, 0);
        } else {
            f0.m(layoutParams);
        }
        layoutParams.width = iL;
        layoutParams.height = iF;
        view.setLayoutParams(layoutParams);
    }

    public static final void e(@e io.reactivex.disposables.a aVar, @dl.d Map<String, String> urlInfo, @e final String str, @dl.d l<? super VideoInfoObj, b2> onSuccessFoo, @dl.d l<? super Throwable, b2> onErrorFoo) {
        if (PatchProxy.proxy(new Object[]{aVar, urlInfo, str, onSuccessFoo, onErrorFoo}, null, changeQuickRedirect, true, c.b.f30683hg, new Class[]{io.reactivex.disposables.a.class, Map.class, String.class, l.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(urlInfo, "urlInfo");
        f0.p(onSuccessFoo, "onSuccessFoo");
        f0.p(onErrorFoo, "onErrorFoo");
        if (str == null) {
            return;
        }
        HashMap map = new HashMap();
        String str2 = "";
        for (Map.Entry<String, String> entry : urlInfo.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (u.L1("url", key, true)) {
                str2 = value;
            } else {
                map.put(key, ' ' + value);
            }
        }
        if (com.max.hbcommon.utils.c.u(str2)) {
            onErrorFoo.invoke(new Throwable("未获取到有效视频链接"));
        } else if (aVar != null) {
            z<d0> zVarA = oa.b.a(false).a(map, str2, new HashMap(16));
            final l<d0, e0<? extends Result<VideoInfoObj>>> lVar = new l<d0, e0<? extends Result<VideoInfoObj>>>() { // from class: com.max.basebbs.utils.AccelWorldBBSKt$fastUploadVideoInfo$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final e0<? extends Result<VideoInfoObj>> a(@dl.d d0 responseBody) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{responseBody}, this, changeQuickRedirect, false, 1000, new Class[]{d0.class}, e0.class);
                    if (patchProxyResultProxy.isSupported) {
                        return (e0) patchProxyResultProxy.result;
                    }
                    f0.p(responseBody, "responseBody");
                    return b.a(true).b(str, responseBody.string());
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [io.reactivex.e0<? extends com.max.hbutils.bean.Result<com.max.basebbs.bean.video.VideoInfoObj>>, java.lang.Object] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ e0<? extends Result<VideoInfoObj>> invoke(d0 d0Var) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{d0Var}, this, changeQuickRedirect, false, 1001, new Class[]{Object.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(d0Var);
                }
            };
            aVar.c((io.reactivex.disposables.b) zVarA.k2(new o() { // from class: com.max.basebbs.utils.a
                @Override // kh.o
                public final Object apply(Object obj) {
                    return AccelWorldBBSKt.f(lVar, obj);
                }
            }).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(onErrorFoo, onSuccessFoo)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e0 f(l tmp0, Object p10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tmp0, p10}, null, changeQuickRedirect, true, c.b.f30705ig, new Class[]{l.class, Object.class}, e0.class);
        if (patchProxyResultProxy.isSupported) {
            return (e0) patchProxyResultProxy.result;
        }
        f0.p(tmp0, "$tmp0");
        f0.p(p10, "p0");
        return (e0) tmp0.invoke(p10);
    }

    @dl.d
    public static final HashMap<String, String> g(@e BBSLinkRecObj bBSLinkRecObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSLinkRecObj}, null, changeQuickRedirect, true, c.b.f30544bg, new Class[]{BBSLinkRecObj.class}, HashMap.class);
        if (patchProxyResultProxy.isSupported) {
            return (HashMap) patchProxyResultProxy.result;
        }
        HashMap<String, String> mapH = bBSLinkRecObj != null ? h(bBSLinkRecObj.getFrom(), bBSLinkRecObj.getAl(), bBSLinkRecObj.getIndex(), bBSLinkRecObj.getPage_tab(), bBSLinkRecObj.getRec_mark(), bBSLinkRecObj.getRecTags(), bBSLinkRecObj.getImpressionID(), bBSLinkRecObj.getSessionID(), bBSLinkRecObj.getPos(), bBSLinkRecObj.getNewsid()) : null;
        return mapH == null ? new HashMap<>(16) : mapH;
    }

    @dl.d
    public static final HashMap<String, String> h(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9, str10}, null, changeQuickRedirect, true, c.b.f30567cg, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, HashMap.class);
        if (patchProxyResultProxy.isSupported) {
            return (HashMap) patchProxyResultProxy.result;
        }
        HashMap<String, String> map = new HashMap<>(16);
        if (str != null) {
            map.put("from_recommend_list", str);
        }
        if (str2 != null) {
            map.put("al", str2);
        }
        if (str3 != null) {
            map.put(UCropPlusActivity.ARG_INDEX, str3);
        }
        if (str4 != null) {
            map.put("page_tab", str4);
        }
        if (str5 != null) {
            map.put("rec_mark", str5);
        }
        if (str6 != null) {
            map.put("recTags", str6);
        }
        if (str7 != null) {
            map.put("impressionID", str7);
        }
        if (str8 != null) {
            map.put("sessionID", str8);
        }
        if (str9 != null) {
            map.put("pos", str9);
        }
        if (str10 != null) {
            map.put("newsid", str10);
        }
        return map;
    }

    @e
    public static final String i(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.b.f30591dg, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Pattern patternCompile = Pattern.compile("(<em>(.*?)</em>)");
        for (Matcher matcher = patternCompile.matcher(spannableStringBuilder); matcher.find(); matcher = patternCompile.matcher(spannableStringBuilder)) {
            spannableStringBuilder.replace(matcher.start(), matcher.end(), (CharSequence) matcher.group(2));
        }
        return spannableStringBuilder.toString();
    }
}
