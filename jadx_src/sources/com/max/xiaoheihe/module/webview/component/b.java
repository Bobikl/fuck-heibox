package com.max.xiaoheihe.module.webview.component;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.internal.o;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i0;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseViewModel;
import com.max.hbcommon.base.l;
import com.max.hbcommon.utils.c;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.k;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.bean.bbs.BBSCreateCommentResult;
import com.max.xiaoheihe.bean.bbs.BBSFloorCommentObj;
import com.max.xiaoheihe.bean.bbs.UserPostLimitsObj;
import com.max.xiaoheihe.module.upload.h;
import com.max.xiaoheihe.module.webview.t;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.router.protocol.HeyboxWebProtocolHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import java.util.HashMap;
import java.util.List;
import kotlin.b2;
import kotlin.collections.s0;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import yh.p;

/* JADX INFO: compiled from: WebviewFragmentViewModel.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nWebviewFragmentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebviewFragmentViewModel.kt\ncom/max/xiaoheihe/module/webview/component/WebviewFragmentViewModel\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,215:1\n29#2:216\n5#2,2:217\n22#2:219\n7#2:220\n29#2:221\n5#2,2:222\n22#2:224\n7#2:225\n*S KotlinDebug\n*F\n+ 1 WebviewFragmentViewModel.kt\ncom/max/xiaoheihe/module/webview/component/WebviewFragmentViewModel\n*L\n86#1:216\n86#1:217,2\n86#1:219\n86#1:220\n140#1:221\n140#1:222,2\n140#1:224\n140#1:225\n*E\n"})
@o(parameters = 0)
public class b extends BaseViewModel {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f94647n = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private String f94648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private p<? super t.b, ? super t.a, b2> f94649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private final i0<l<Boolean>> f94650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private final LiveData<l<Boolean>> f94651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d
    private final i0<l<BBSCreateCommentResult<BBSFloorCommentObj>>> f94652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d
    private final LiveData<l<BBSCreateCommentResult<BBSFloorCommentObj>>> f94653i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @d
    private final i0<l<String>> f94654j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @d
    private final LiveData<l<String>> f94655k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @d
    private i0<String> f94656l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @d
    private i0<String> f94657m;

    /* JADX INFO: compiled from: WebviewFragmentViewModel.kt */
    public static final class a extends com.max.hbcommon.network.d<BBSCreateCommentResult<BBSFloorCommentObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<t.b, t.a, b2> f94659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f94660d;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.webview.component.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: WebviewFragmentViewModel.kt */
        public static final class C0893a implements t.b {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ BBSFloorCommentObj f94661a;

            C0893a(BBSFloorCommentObj bBSFloorCommentObj) {
                this.f94661a = bBSFloorCommentObj;
            }

            @Override // com.max.xiaoheihe.module.webview.t.b
            public final void a(@d JsonObject message) {
                if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 47568, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(message, "message");
                Gson gson = new Gson();
                JsonArray jsonArray = new JsonArray();
                jsonArray.add(gson.toJsonTree(this.f94661a));
                message.add("data", jsonArray);
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.webview.component.b$a$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: WebviewFragmentViewModel.kt */
        public static final class C0894b implements t.a {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f94662a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSFloorCommentObj f94663b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f94664c;

            C0894b(String str, BBSFloorCommentObj bBSFloorCommentObj, b bVar) {
                this.f94662a = str;
                this.f94663b = bBSFloorCommentObj;
                this.f94664c = bVar;
            }

            @Override // com.max.xiaoheihe.module.webview.t.a
            public final void a() {
                String strA;
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47569, new Class[0], Void.TYPE).isSupported || (strA = HeyboxWebProtocolHandler.f95003a.a(this.f94662a, k.p(this.f94663b))) == null) {
                    return;
                }
                this.f94664c.f94654j.o(new l(strA));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super t.b, ? super t.a, b2> pVar, String str) {
            this.f94659c = pVar;
            this.f94660d = str;
        }

        public void a(@d BBSCreateCommentResult<BBSFloorCommentObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 47566, new Class[]{BBSCreateCommentResult.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            g.f74531b.q("WebviewFragmentViewModel, onNext");
            b.this.f94650f.r(new l(Boolean.FALSE));
            b.this.f94652h.r(new l(result));
            BBSFloorCommentObj result2 = result.getResult();
            if (result2 != null) {
                p<t.b, t.a, b2> pVar = this.f94659c;
                String str = this.f94660d;
                b bVar = b.this;
                if (pVar != null) {
                    pVar.invoke(new C0893a(result2), new C0894b(str, result2, bVar));
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47564, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.onComplete();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 47565, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            e10.printStackTrace();
            Log.d("WebviewFragmentViewModel", "WebviewFragmentViewModel, onError " + Log.getStackTraceString(e10));
            b.this.f94650f.r(new l(Boolean.FALSE));
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 47567, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((BBSCreateCommentResult) obj);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.webview.component.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WebviewFragmentViewModel.kt */
    public static final class C0895b implements com.max.xiaoheihe.module.upload.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<String> f94665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f94666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f94667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f94668d;

        C0895b(Ref.ObjectRef<String> objectRef, String str, b bVar, String str2) {
            this.f94665a = objectRef;
            this.f94666b = str;
            this.f94667c = bVar;
            this.f94668d = str2;
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ void a(float f10) {
            h.b(this, f10);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean b() {
            return h.a(this);
        }

        /* JADX WARN: Type inference failed for: r9v1, types: [T, java.lang.Object, java.lang.String] */
        @Override // com.max.xiaoheihe.module.upload.g.e
        public void c(@e String[] strArr, @e String str) {
            String str2;
            if (PatchProxy.proxy(new Object[]{strArr, str}, this, changeQuickRedirect, false, 47570, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            Ref.ObjectRef<String> objectRef = this.f94665a;
            ?? P0 = com.max.xiaoheihe.utils.d.p0(strArr);
            f0.o(P0, "getStringFromArray(urls)");
            objectRef.f124891b = P0;
            if ((c.u(this.f94665a.f124891b) && c.u(this.f94666b)) || (str2 = this.f94667c.f94648d) == null) {
                return;
            }
            b bVar = this.f94667c;
            String it = this.f94668d;
            String str3 = this.f94666b;
            Ref.ObjectRef<String> objectRef2 = this.f94665a;
            f0.o(it, "it");
            b.g(bVar, it, "", "", str3, objectRef2.f124891b, str2, bVar.f94649e);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(@e String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47571, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f94667c.f94650f.r(new l(Boolean.FALSE));
        }
    }

    public b() {
        i0<l<Boolean>> i0Var = new i0<>();
        this.f94650f = i0Var;
        this.f94651g = i0Var;
        i0<l<BBSCreateCommentResult<BBSFloorCommentObj>>> i0Var2 = new i0<>();
        this.f94652h = i0Var2;
        this.f94653i = i0Var2;
        i0<l<String>> i0Var3 = new i0<>();
        this.f94654j = i0Var3;
        this.f94655k = i0Var3;
        i0<String> i0Var4 = new i0<>();
        this.f94656l = i0Var4;
        this.f94657m = i0Var4;
    }

    public static final /* synthetic */ void g(b bVar, String str, String str2, String str3, String str4, String str5, String str6, p pVar) {
        if (PatchProxy.proxy(new Object[]{bVar, str, str2, str3, str4, str5, str6, pVar}, null, changeQuickRedirect, true, 47563, new Class[]{b.class, String.class, String.class, String.class, String.class, String.class, String.class, p.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.o(str, str2, str3, str4, str5, str6, pVar);
    }

    private final void o(String str, String str2, String str3, String str4, String str5, String str6, p<? super t.b, ? super t.a, b2> pVar) {
        String name;
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, pVar}, this, changeQuickRedirect, false, 47561, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, p.class}, Void.TYPE).isSupported) {
            return;
        }
        String str7 = "createComment, linkId = " + str + ", rootId = " + str2 + ", replyID = " + str3 + ", text = " + str4 + ", imgUrl = " + str5 + ", jsCallbackFunc = " + str6;
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (b.class.isAnonymousClass()) {
            name = b.class.getName();
            f0.m(name);
        } else {
            name = b.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str7);
        aVar.q(sb2.toString());
        c((io.reactivex.disposables.b) i.a().V4("", new HashMap(), str, str4, str2, str3, str5, "0", null, null, s0.z()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(pVar, str6)));
    }

    @d
    public final LiveData<l<BBSCreateCommentResult<BBSFloorCommentObj>>> p() {
        return this.f94653i;
    }

    @d
    public final LiveData<l<String>> r() {
        return this.f94655k;
    }

    @d
    public final i0<String> s() {
        return this.f94657m;
    }

    public final void t(@d com.max.hbcommon.network.d<Result<UserPostLimitsObj>> observer) {
        if (PatchProxy.proxy(new Object[]{observer}, this, changeQuickRedirect, false, 47562, new Class[]{com.max.hbcommon.network.d.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(observer, "observer");
        c((io.reactivex.disposables.b) i.a().b6(s0.z()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(observer));
    }

    @d
    public final LiveData<l<Boolean>> u() {
        return this.f94651g;
    }

    public final void v(@d String rootId, @d String replyID, @d String text, @d String replyJsCallbackFuncString, @e p<? super t.b, ? super t.a, b2> pVar) {
        if (PatchProxy.proxy(new Object[]{rootId, replyID, text, replyJsCallbackFuncString, pVar}, this, changeQuickRedirect, false, 47559, new Class[]{String.class, String.class, String.class, String.class, p.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rootId, "rootId");
        f0.p(replyID, "replyID");
        f0.p(text, "text");
        f0.p(replyJsCallbackFuncString, "replyJsCallbackFuncString");
        String strF = this.f94656l.f();
        if (strF != null) {
            o(strF, rootId, replyID, text, "", replyJsCallbackFuncString, pVar);
        }
    }

    public final void w(@d Context context, @d List<String> imgPathList, @d String contentText) {
        String name;
        if (PatchProxy.proxy(new Object[]{context, imgPathList, contentText}, this, changeQuickRedirect, false, 47560, new Class[]{Context.class, List.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(imgPathList, "imgPathList");
        f0.p(contentText, "contentText");
        String str = "replyLink, contentText = " + contentText + ", UserManager.checkUsername(context) = " + com.max.xiaoheihe.utils.i0.g(context);
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (b.class.isAnonymousClass()) {
            name = b.class.getName();
            f0.m(name);
        } else {
            name = b.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        if (com.max.xiaoheihe.utils.i0.g(context)) {
            this.f94650f.r(new l<>(Boolean.TRUE));
            String strF = this.f94656l.f();
            if (strF != null) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.f124891b = "";
                if (!imgPathList.isEmpty()) {
                    objectRef.f124891b = "";
                    com.max.xiaoheihe.module.upload.g.h(context, e(), imgPathList, "bbs", new C0895b(objectRef, contentText, this, strF));
                    return;
                }
                objectRef.f124891b = "";
                String str2 = this.f94648d;
                if (str2 != null) {
                    o(strF, "", "", contentText, "", str2, this.f94649e);
                }
            }
        }
    }

    public final void x(@d String linkId, @d String jsCallbackFuncName, @d p<? super t.b, ? super t.a, b2> jsCallbackFunc) {
        if (PatchProxy.proxy(new Object[]{linkId, jsCallbackFuncName, jsCallbackFunc}, this, changeQuickRedirect, false, 47558, new Class[]{String.class, String.class, p.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linkId, "linkId");
        f0.p(jsCallbackFuncName, "jsCallbackFuncName");
        f0.p(jsCallbackFunc, "jsCallbackFunc");
        this.f94656l.o(linkId);
        this.f94648d = jsCallbackFuncName;
        this.f94649e = jsCallbackFunc;
    }

    public final void y(@d i0<String> i0Var) {
        if (PatchProxy.proxy(new Object[]{i0Var}, this, changeQuickRedirect, false, 47557, new Class[]{i0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(i0Var, "<set-?>");
        this.f94657m = i0Var;
    }
}
