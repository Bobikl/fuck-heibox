package com.max.xiaoheihe.module.webview;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbexpression.bean.ExpressionObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.bbs.BBSCreateCommentResult;
import com.max.xiaoheihe.bean.bbs.BBSFloorCommentObj;
import com.max.xiaoheihe.module.bbs.ReportReasonFragment;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BaseBottomEditorBar;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBar;
import com.max.xiaoheihe.module.webview.component.TargetComment;
import com.max.xiaoheihe.module.webview.component.WebviewBottomEditorBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;

/* JADX INFO: compiled from: WebviewBottomEditorDelegate.kt */
/* JADX INFO: loaded from: classes12.dex */
@kotlin.jvm.internal.t0({"SMAP\nWebviewBottomEditorDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebviewBottomEditorDelegate.kt\ncom/max/xiaoheihe/module/webview/WebviewBottomEditorDelegate\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,184:1\n29#2:185\n5#2,2:186\n22#2:188\n7#2:189\n29#2:190\n5#2,2:191\n22#2:193\n7#2:194\n29#2:195\n5#2,2:196\n22#2:198\n7#2:199\n*S KotlinDebug\n*F\n+ 1 WebviewBottomEditorDelegate.kt\ncom/max/xiaoheihe/module/webview/WebviewBottomEditorDelegate\n*L\n90#1:185\n90#1:186,2\n90#1:188\n90#1:189\n125#1:190\n125#1:191,2\n125#1:193\n125#1:194\n159#1:195\n159#1:196,2\n159#1:198\n159#1:199\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class WebviewBottomEditorDelegate implements com.max.hbexpression.q.a, com.max.hbexpression.q.b {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f94333k = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f94334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final com.max.xiaoheihe.module.webview.component.b f94335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final WebviewFragment f94336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final ViewStub f94337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f94338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private BottomEditorBar f94339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private WebviewBottomEditorBar f94340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private LoadingDialog f94341i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private LoadingDialog f94342j;

    /* JADX INFO: compiled from: WebviewBottomEditorDelegate.kt */
    public static final class a implements ViewStub.OnInflateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.ViewStub.OnInflateListener
        public final void onInflate(ViewStub viewStub, View view) {
            if (PatchProxy.proxy(new Object[]{viewStub, view}, this, changeQuickRedirect, false, 47228, new Class[]{ViewStub.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (view instanceof BottomEditorBar) {
                BottomEditorBar bottomEditorBar = (BottomEditorBar) view;
                if (bottomEditorBar.getInstance() instanceof WebviewBottomEditorBar) {
                    WebviewBottomEditorDelegate.this.f94339g = bottomEditorBar;
                    WebviewBottomEditorDelegate webviewBottomEditorDelegate = WebviewBottomEditorDelegate.this;
                    BaseBottomEditorBar bottomEditorBar2 = bottomEditorBar.getInstance();
                    kotlin.jvm.internal.f0.n(bottomEditorBar2, "null cannot be cast to non-null type com.max.xiaoheihe.module.webview.component.WebviewBottomEditorBar");
                    webviewBottomEditorDelegate.f94340h = (WebviewBottomEditorBar) bottomEditorBar2;
                    WebviewBottomEditorBar webviewBottomEditorBar = WebviewBottomEditorDelegate.this.f94340h;
                    if (webviewBottomEditorBar != null) {
                        webviewBottomEditorBar.setFragmentManager(WebviewBottomEditorDelegate.this.f94336d.getChildFragmentManager());
                    }
                }
            }
            WebviewBottomEditorDelegate.this.o(true);
        }
    }

    /* JADX INFO: compiled from: WebviewBottomEditorDelegate.kt */
    public static final class b implements androidx.lifecycle.j0<com.max.hbcommon.base.l<? extends Boolean>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(com.max.hbcommon.base.l<? extends Boolean> lVar) {
            if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, 47230, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(lVar);
        }

        public final void b(com.max.hbcommon.base.l<Boolean> lVar) {
            Boolean boolA;
            LoadingDialog loadingDialogJ;
            if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, 47229, new Class[]{com.max.hbcommon.base.l.class}, Void.TYPE).isSupported || (boolA = lVar.a()) == null) {
                return;
            }
            WebviewBottomEditorDelegate webviewBottomEditorDelegate = WebviewBottomEditorDelegate.this;
            if (!boolA.booleanValue()) {
                LoadingDialog loadingDialogJ2 = webviewBottomEditorDelegate.j();
                if (loadingDialogJ2 != null) {
                    loadingDialogJ2.c();
                    return;
                }
                return;
            }
            if (webviewBottomEditorDelegate.j() == null) {
                webviewBottomEditorDelegate.q(new LoadingDialog(webviewBottomEditorDelegate.f94334b, webviewBottomEditorDelegate.f94334b.getString(R.string.commiting), true));
            }
            LoadingDialog loadingDialogJ3 = webviewBottomEditorDelegate.j();
            kotlin.jvm.internal.f0.m(loadingDialogJ3);
            if (loadingDialogJ3.i() || (loadingDialogJ = webviewBottomEditorDelegate.j()) == null) {
                return;
            }
            loadingDialogJ.r();
        }
    }

    /* JADX INFO: compiled from: WebviewBottomEditorDelegate.kt */
    public static final class c implements androidx.lifecycle.j0<com.max.hbcommon.base.l<? extends BBSCreateCommentResult<BBSFloorCommentObj>>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(com.max.hbcommon.base.l<? extends BBSCreateCommentResult<BBSFloorCommentObj>> lVar) {
            if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, 47232, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(lVar);
        }

        public final void b(com.max.hbcommon.base.l<? extends BBSCreateCommentResult<BBSFloorCommentObj>> lVar) {
            BBSCreateCommentResult<BBSFloorCommentObj> bBSCreateCommentResultA;
            if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, 47231, new Class[]{com.max.hbcommon.base.l.class}, Void.TYPE).isSupported || (bBSCreateCommentResultA = lVar.a()) == null) {
                return;
            }
            WebviewBottomEditorDelegate webviewBottomEditorDelegate = WebviewBottomEditorDelegate.this;
            if (com.max.hbcommon.utils.c.u(bBSCreateCommentResultA.getMsg())) {
                com.max.hbutils.utils.c.f(webviewBottomEditorDelegate.f94334b.getString(R.string.comment_success));
            } else {
                com.max.hbutils.utils.c.f73533a.c(bBSCreateCommentResultA.getMsg());
            }
            WebviewBottomEditorBar webviewBottomEditorBar = webviewBottomEditorDelegate.f94340h;
            if (webviewBottomEditorBar != null) {
                webviewBottomEditorBar.y0(bBSCreateCommentResultA.getResult());
            }
            WebviewBottomEditorBar webviewBottomEditorBar2 = webviewBottomEditorDelegate.f94340h;
            if (webviewBottomEditorBar2 != null) {
                webviewBottomEditorBar2.t0();
            }
        }
    }

    /* JADX INFO: compiled from: WebviewBottomEditorDelegate.kt */
    public static final class d implements androidx.lifecycle.j0<com.max.hbcommon.base.l<? extends String>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(com.max.hbcommon.base.l<? extends String> lVar) {
            if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, 47234, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(lVar);
        }

        public final void b(com.max.hbcommon.base.l<String> lVar) {
            String strA;
            if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, 47233, new Class[]{com.max.hbcommon.base.l.class}, Void.TYPE).isSupported || (strA = lVar.a()) == null) {
                return;
            }
            WebviewBottomEditorDelegate.this.f94336d.H6(strA, null);
        }
    }

    /* JADX INFO: compiled from: WebviewBottomEditorDelegate.kt */
    public static final class e implements ReportReasonFragment.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f94347a;

        e(String str) {
            this.f94347a = str;
        }

        @Override // com.max.xiaoheihe.module.bbs.ReportReasonFragment.b
        public void a(@dl.d String report_reason, @dl.e String str) {
            if (PatchProxy.proxy(new Object[]{report_reason, str}, this, changeQuickRedirect, false, 47235, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(report_reason, "report_reason");
            com.max.xiaoheihe.module.bbs.utils.b.S(this.f94347a, report_reason, str, null);
        }
    }

    public WebviewBottomEditorDelegate(@dl.d Context context, @dl.d com.max.xiaoheihe.module.webview.component.b viewModel, @dl.d WebviewFragment webviewFragment, @dl.d ViewStub inputViewStub) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(viewModel, "viewModel");
        kotlin.jvm.internal.f0.p(webviewFragment, "webviewFragment");
        kotlin.jvm.internal.f0.p(inputViewStub, "inputViewStub");
        this.f94334b = context;
        this.f94335c = viewModel;
        this.f94336d = webviewFragment;
        this.f94337e = inputViewStub;
        inputViewStub.setOnInflateListener(new a());
        viewModel.u().k(webviewFragment, new b());
        viewModel.p().k(webviewFragment, new c());
        viewModel.r().k(webviewFragment, new d());
    }

    public static final /* synthetic */ void f(WebviewBottomEditorDelegate webviewBottomEditorDelegate) {
        if (PatchProxy.proxy(new Object[]{webviewBottomEditorDelegate}, null, changeQuickRedirect, true, 47227, new Class[]{WebviewBottomEditorDelegate.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewBottomEditorDelegate.k();
    }

    private final void k() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47222, new Class[0], Void.TYPE).isSupported || this.f94338f) {
            return;
        }
        this.f94337e.inflate();
    }

    @Override // com.max.hbexpression.q.b
    public void expressionDeleteClick(@dl.e View view) {
        WebviewBottomEditorBar webviewBottomEditorBar;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47226, new Class[]{View.class}, Void.TYPE).isSupported || (webviewBottomEditorBar = this.f94340h) == null) {
            return;
        }
        webviewBottomEditorBar.expressionDeleteClick(view);
    }

    @dl.e
    public final LoadingDialog i() {
        return this.f94342j;
    }

    @dl.e
    public final LoadingDialog j() {
        return this.f94341i;
    }

    public final boolean l() {
        return this.f94338f;
    }

    public final void m(@dl.d WebProtocolObj webProtocolObj) {
        String name;
        if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 47224, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(webProtocolObj, "webProtocolObj");
        String param = webProtocolObj.getParam("target");
        String str = "openCommentReportDialog, targetStr = " + param;
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (WebviewBottomEditorDelegate.class.isAnonymousClass()) {
            name = WebviewBottomEditorDelegate.class.getName();
            kotlin.jvm.internal.f0.m(name);
        } else {
            name = WebviewBottomEditorDelegate.class.getSimpleName();
            kotlin.jvm.internal.f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        JsonElement jsonElement = ((JsonObject) com.max.hbutils.utils.k.a(param, JsonObject.class)).get("comment_id");
        String asString = jsonElement != null ? jsonElement.getAsString() : null;
        if (asString == null) {
            com.max.hbutils.utils.c.f("id有误");
        } else {
            ReportReasonFragment.f80025u.a(new e(asString), ReportReasonFragment.ObjectType.comment, null, null, asString).show(this.f94336d.getChildFragmentManager(), "ForbidReasonFragment");
        }
    }

    public final void n(@dl.d WebProtocolObj webProtocolObj) {
        String name;
        WebviewBottomEditorBar webviewBottomEditorBar;
        if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 47223, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(webProtocolObj, "webProtocolObj");
        String param = webProtocolObj.getParam("target");
        final String param2 = webProtocolObj.getParam("jsCallbackFunc");
        String str = "replyLinkComment, targetStr = " + param;
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (WebviewBottomEditorDelegate.class.isAnonymousClass()) {
            name = WebviewBottomEditorDelegate.class.getName();
            kotlin.jvm.internal.f0.m(name);
        } else {
            name = WebviewBottomEditorDelegate.class.getSimpleName();
            kotlin.jvm.internal.f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        final TargetComment targetComment = (TargetComment) com.max.hbutils.utils.k.a(param, TargetComment.class);
        if ((targetComment != null ? targetComment.k() : null) == null) {
            com.max.hbutils.utils.c.f("id有误");
        } else {
            if (com.max.hbcommon.utils.c.u(param2) || (webviewBottomEditorBar = this.f94340h) == null || webviewBottomEditorBar == null) {
                return;
            }
            webviewBottomEditorBar.post(new Runnable() { // from class: com.max.xiaoheihe.module.webview.WebviewBottomEditorDelegate$replyLinkComment$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    WebviewBottomEditorBar webviewBottomEditorBar2;
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47236, new Class[0], Void.TYPE).isSupported || (webviewBottomEditorBar2 = this.f94348b.f94340h) == null) {
                        return;
                    }
                    TargetComment targetComment2 = targetComment;
                    kotlin.jvm.internal.f0.o(targetComment2, "targetComment");
                    final String str2 = param2;
                    final WebviewBottomEditorDelegate webviewBottomEditorDelegate = this.f94348b;
                    webviewBottomEditorBar2.E0(targetComment2, str2, new yh.p<t.b, t.a, b2>() { // from class: com.max.xiaoheihe.module.webview.WebviewBottomEditorDelegate$replyLinkComment$1.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void a(@dl.d t.b dataHandler, @dl.d t.a backupHandler) {
                            if (PatchProxy.proxy(new Object[]{dataHandler, backupHandler}, this, changeQuickRedirect, false, 47237, new Class[]{t.b.class, t.a.class}, Void.TYPE).isSupported) {
                                return;
                            }
                            kotlin.jvm.internal.f0.p(dataHandler, "dataHandler");
                            kotlin.jvm.internal.f0.p(backupHandler, "backupHandler");
                            com.max.xiaoheihe.accelworld.j.e(com.max.xiaoheihe.accelworld.j.h(str2), webviewBottomEditorDelegate.f94336d, dataHandler, backupHandler, null);
                        }

                        /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(t.b bVar, t.a aVar2) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar, aVar2}, this, changeQuickRedirect, false, 47238, new Class[]{Object.class, Object.class}, Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            a(bVar, aVar2);
                            return b2.f124493a;
                        }
                    });
                }
            });
        }
    }

    public final void o(boolean z10) {
        this.f94338f = z10;
    }

    @Override // com.max.hbexpression.q.a
    public void o0(@dl.e ExpressionObj expressionObj) {
        WebviewBottomEditorBar webviewBottomEditorBar;
        if (PatchProxy.proxy(new Object[]{expressionObj}, this, changeQuickRedirect, false, 47225, new Class[]{ExpressionObj.class}, Void.TYPE).isSupported || (webviewBottomEditorBar = this.f94340h) == null) {
            return;
        }
        webviewBottomEditorBar.o0(expressionObj);
    }

    public final void p(@dl.e LoadingDialog loadingDialog) {
        this.f94342j = loadingDialog;
    }

    public final void q(@dl.e LoadingDialog loadingDialog) {
        this.f94341i = loadingDialog;
    }

    public final void r(@dl.d WebProtocolObj webProtocolObj) {
        String name;
        if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 47221, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(webProtocolObj, "webProtocolObj");
        String param = webProtocolObj.getParam("target");
        final String param2 = webProtocolObj.getParam("jsCallbackFunc");
        final boolean zG = kotlin.jvm.internal.f0.g(webProtocolObj.getParam("show"), "true");
        JsonObject jsonObject = (JsonObject) com.max.hbutils.utils.k.a(param, JsonObject.class);
        if (jsonObject == null) {
            return;
        }
        JsonElement jsonElement = jsonObject.get("link_id");
        final String asString = jsonElement != null ? jsonElement.getAsString() : null;
        String str = "showInput, linkId = " + asString + ", jsCallbackFunc = " + param2 + ", show = " + zG + ", inputViewStub = " + this.f94337e + ", webBottomBar = " + this.f94340h + ' ' + this.f94336d + ", isInflate = " + this.f94338f;
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (WebviewBottomEditorDelegate.class.isAnonymousClass()) {
            name = WebviewBottomEditorDelegate.class.getName();
            kotlin.jvm.internal.f0.m(name);
        } else {
            name = WebviewBottomEditorDelegate.class.getSimpleName();
            kotlin.jvm.internal.f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        if (com.max.hbcommon.utils.c.u(asString)) {
            com.max.hbutils.utils.c.f("id有误");
        } else {
            if (com.max.hbcommon.utils.c.u(param2)) {
                return;
            }
            this.f94336d.getContentView().post(new Runnable() { // from class: com.max.xiaoheihe.module.webview.WebviewBottomEditorDelegate$showInput$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47239, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    WebviewBottomEditorDelegate.f(this.f94353b);
                    this.f94353b.f94337e.setVisibility(zG ? 0 : 8);
                    String str2 = asString;
                    if (str2 != null) {
                        final WebviewBottomEditorDelegate webviewBottomEditorDelegate = this.f94353b;
                        final String jsCallbackFunc = param2;
                        com.max.xiaoheihe.module.webview.component.b bVar = webviewBottomEditorDelegate.f94335c;
                        kotlin.jvm.internal.f0.o(jsCallbackFunc, "jsCallbackFunc");
                        bVar.x(str2, jsCallbackFunc, new yh.p<t.b, t.a, b2>() { // from class: com.max.xiaoheihe.module.webview.WebviewBottomEditorDelegate$showInput$1$1$1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void a(@dl.d t.b dataHandler, @dl.d t.a backupHandler) {
                                if (PatchProxy.proxy(new Object[]{dataHandler, backupHandler}, this, changeQuickRedirect, false, 47240, new Class[]{t.b.class, t.a.class}, Void.TYPE).isSupported) {
                                    return;
                                }
                                kotlin.jvm.internal.f0.p(dataHandler, "dataHandler");
                                kotlin.jvm.internal.f0.p(backupHandler, "backupHandler");
                                com.max.xiaoheihe.accelworld.j.e(com.max.xiaoheihe.accelworld.j.h(jsCallbackFunc), webviewBottomEditorDelegate.f94336d, dataHandler, backupHandler, null);
                            }

                            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.b2] */
                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(t.b bVar2, t.a aVar2) {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar2, aVar2}, this, changeQuickRedirect, false, 47241, new Class[]{Object.class, Object.class}, Object.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return patchProxyResultProxy.result;
                                }
                                a(bVar2, aVar2);
                                return b2.f124493a;
                            }
                        });
                    }
                }
            });
        }
    }
}
