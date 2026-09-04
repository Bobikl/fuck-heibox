package com.max.xiaoheihe.module.webview.component;

import android.content.Context;
import android.view.DragEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.c1;
import androidx.lifecycle.y0;
import com.max.hbexpression.q;
import com.max.hbpermission.PermissionManager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.n;
import com.max.heybox.hblog.g;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSFloorCommentObj;
import com.max.xiaoheihe.bean.bbs.UserPostLimitsObj;
import com.max.xiaoheihe.module.bbs.adapter.x;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BaseBottomEditorBar;
import com.max.xiaoheihe.module.webview.t;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.b0;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.z;
import yh.p;

/* JADX INFO: compiled from: WebviewBottomEditorBar.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nWebviewBottomEditorBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebviewBottomEditorBar.kt\ncom/max/xiaoheihe/module/webview/component/WebviewBottomEditorBar\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,286:1\n29#2:287\n5#2,2:288\n22#2:290\n7#2:291\n*S KotlinDebug\n*F\n+ 1 WebviewBottomEditorBar.kt\ncom/max/xiaoheihe/module/webview/component/WebviewBottomEditorBar\n*L\n114#1:287\n114#1:288,2\n114#1:290\n114#1:291\n*E\n"})
@o(parameters = 0)
public final class WebviewBottomEditorBar extends BaseBottomEditorBar implements x.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final int f94628x1 = 8;

    @dl.d
    private final z T;

    @dl.e
    private String U;

    @dl.e
    private String V;

    @dl.e
    private String W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.e
    private String f94629a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.e
    private p<? super t.b, ? super t.a, b2> f94630b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.d
    private HashMap<String, String> f94631c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f94632p1;

    /* JADX INFO: compiled from: WebviewBottomEditorBar.kt */
    @t0({"SMAP\nWebviewBottomEditorBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebviewBottomEditorBar.kt\ncom/max/xiaoheihe/module/webview/component/WebviewBottomEditorBar$doPickAction$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,286:1\n1#2:287\n*E\n"})
    public static final class a implements oe.t<LocalMedia> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // oe.t
        public void onCancel() {
        }

        @Override // oe.t
        public void onResult(@dl.e ArrayList<LocalMedia> arrayList) {
            if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 47545, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
                return;
            }
            if (arrayList != null && (arrayList.isEmpty() ^ true)) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    LocalMedia localMedia = arrayList.get(i10);
                    if (localMedia != null) {
                        WebviewBottomEditorBar.this.getImgPathList().add(localMedia.G());
                    }
                }
            }
            x mUploadImgShowerAdapter = WebviewBottomEditorBar.this.getMUploadImgShowerAdapter();
            if (mUploadImgShowerAdapter != null) {
                mUploadImgShowerAdapter.r(WebviewBottomEditorBar.this.getImgPathList());
            }
        }
    }

    /* JADX INFO: compiled from: WebviewBottomEditorBar.kt */
    @t0({"SMAP\nWebviewBottomEditorBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebviewBottomEditorBar.kt\ncom/max/xiaoheihe/module/webview/component/WebviewBottomEditorBar$expandEditText$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,286:1\n260#2:287\n*S KotlinDebug\n*F\n+ 1 WebviewBottomEditorBar.kt\ncom/max/xiaoheihe/module/webview/component/WebviewBottomEditorBar$expandEditText$1\n*L\n166#1:287\n*E\n"})
    public static final class b extends com.max.hbcommon.network.d<Result<UserPostLimitsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void onNext(@dl.d Result<UserPostLimitsObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 47546, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (WebviewBottomEditorBar.this.isAttachedToWindow()) {
                if (WebviewBottomEditorBar.this.getVisibility() == 0) {
                    super.onNext(result);
                    WebviewBottomEditorBar.this.f94632p1 = true;
                    UserPostLimitsObj result2 = result.getResult();
                    if (result2 == null) {
                        return;
                    }
                    Integer numValueOf = Integer.valueOf(n.q(result2.getMax_input_limit_post_comment()));
                    if (!(numValueOf.intValue() > 0)) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        WebviewBottomEditorBar.this.setPostCommentTextNumMaxLimit(numValueOf.intValue());
                    }
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 47547, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<UserPostLimitsObj>) obj);
        }
    }

    /* JADX INFO: compiled from: WebviewBottomEditorBar.kt */
    public static final class c implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47548, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            WebviewBottomEditorBar.this.v0();
        }
    }

    /* JADX INFO: compiled from: WebviewBottomEditorBar.kt */
    public static final class d implements View.OnDragListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f94636a = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnDragListener
        public final boolean onDrag(View view, DragEvent dragEvent) {
            return true;
        }
    }

    /* JADX INFO: compiled from: WebviewBottomEditorBar.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47549, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            WebviewBottomEditorBar.this.A0();
        }
    }

    /* JADX INFO: compiled from: WebviewBottomEditorBar.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47550, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(WebviewBottomEditorBar.this.getContext())) {
                WebviewBottomEditorBar webviewBottomEditorBar = WebviewBottomEditorBar.this;
                WebviewBottomEditorBar.s0(webviewBottomEditorBar, webviewBottomEditorBar.getEditor());
                boolean z10 = !WebviewBottomEditorBar.this.P();
                WebviewBottomEditorBar.n0(WebviewBottomEditorBar.this);
                if (z10) {
                    if (com.max.hbcommon.utils.c.u(WebviewBottomEditorBar.this.getReplyOwnerContent())) {
                        WebviewBottomEditorBar.this.setContentText("");
                    } else {
                        WebviewBottomEditorBar webviewBottomEditorBar2 = WebviewBottomEditorBar.this;
                        webviewBottomEditorBar2.setContentText(webviewBottomEditorBar2.getReplyOwnerContent());
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: WebviewBottomEditorBar.kt */
    public static final class g implements View.OnFocusChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z10) {
            View.OnClickListener editorClickListener;
            if (!PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47551, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported && z10 && WebviewBottomEditorBar.this.w0() && (editorClickListener = WebviewBottomEditorBar.this.getEditorClickListener()) != null) {
                editorClickListener.onClick(view);
            }
        }
    }

    /* JADX INFO: compiled from: WebviewBottomEditorBar.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47552, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (WebviewBottomEditorBar.this.O()) {
                WebviewBottomEditorBar.this.setEmojiShowing(false);
                if (WebviewBottomEditorBar.this.getExpressionShowFragment() != null) {
                    WebviewBottomEditorBar.this.setExpressionImageResource(R.drawable.bbs_emoji_filled_24x24);
                    q expressionShowFragment = WebviewBottomEditorBar.this.getExpressionShowFragment();
                    f0.m(expressionShowFragment);
                    expressionShowFragment.C();
                }
                WebviewBottomEditorBar webviewBottomEditorBar = WebviewBottomEditorBar.this;
                WebviewBottomEditorBar.s0(webviewBottomEditorBar, webviewBottomEditorBar.getEditor());
            } else {
                WebviewBottomEditorBar webviewBottomEditorBar2 = WebviewBottomEditorBar.this;
                WebviewBottomEditorBar.p0(webviewBottomEditorBar2, webviewBottomEditorBar2.getEditor());
                WebviewBottomEditorBar.this.D0();
            }
            WebviewBottomEditorBar.this.h0();
        }
    }

    /* JADX INFO: compiled from: WebviewBottomEditorBar.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47553, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            WebviewBottomEditorBar.this.i0();
        }
    }

    /* JADX INFO: compiled from: WebviewBottomEditorBar.kt */
    public static final class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47554, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            WebviewBottomEditorBar.q0(WebviewBottomEditorBar.this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebviewBottomEditorBar(@dl.d Context context) {
        super(context, null, 0, 6, null);
        f0.p(context, "context");
        this.T = b0.c(new yh.a<com.max.xiaoheihe.module.webview.component.b>() { // from class: com.max.xiaoheihe.module.webview.component.WebviewBottomEditorBar$webviewFragmentViewModel$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @e
            public final b a() {
                b bVar;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47555, new Class[0], b.class);
                if (patchProxyResultProxy.isSupported) {
                    return (b) patchProxyResultProxy.result;
                }
                c1 c1VarA = ViewTreeViewModelStoreOwner.a(this.f94643b);
                if (c1VarA != null && (bVar = (b) new y0(c1VarA).a(b.class)) != null) {
                    return bVar;
                }
                g.f74531b.v("[WebviewBottomEditorBar][vmByLazyInit] vmOwner is null");
                return null;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.webview.component.b, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47556, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f94631c0 = new HashMap<>();
        B0();
    }

    private final void B0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47525, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getEditor().setOnDragListener(d.f94636a);
        getEditor().setHint("评论");
        getMask().setOnClickListener(new e());
        setEditorClickListener(new f());
        setEditorOnFocusChangeListener(new g());
        setExpressionOnClickListener(new h());
        getMBinding().b().setVisibility(0);
        setAddOnClickListener(new i());
        setIvCYVisible(false);
        setIvAtVisible(false);
        setIvAddGameVisible(false);
        setAddImgVisible(true);
        I(this);
        setSendOnClickListener(new j());
    }

    private final void G0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47531, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!R()) {
            this.U = getEditor().getContentText();
            return;
        }
        String str = this.V;
        if (str == null || f0.g("-1", str)) {
            return;
        }
        HashMap<String, String> map = this.f94631c0;
        String str2 = this.V;
        f0.m(str2);
        String contentText = getEditor().getContentText();
        f0.o(contentText, "editor.contentText");
        map.put(str2, contentText);
    }

    private final com.max.xiaoheihe.module.webview.component.b getWebviewFragmentViewModel() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47523, new Class[0], com.max.xiaoheihe.module.webview.component.b.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.webview.component.b) patchProxyResultProxy.result : (com.max.xiaoheihe.module.webview.component.b) this.T.getValue();
    }

    public static final /* synthetic */ void n0(WebviewBottomEditorBar webviewBottomEditorBar) {
        if (PatchProxy.proxy(new Object[]{webviewBottomEditorBar}, null, changeQuickRedirect, true, 47542, new Class[]{WebviewBottomEditorBar.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewBottomEditorBar.x0();
    }

    public static final /* synthetic */ void p0(WebviewBottomEditorBar webviewBottomEditorBar, View view) {
        if (PatchProxy.proxy(new Object[]{webviewBottomEditorBar, view}, null, changeQuickRedirect, true, 47543, new Class[]{WebviewBottomEditorBar.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewBottomEditorBar.C(view);
    }

    public static final /* synthetic */ void q0(WebviewBottomEditorBar webviewBottomEditorBar) {
        if (PatchProxy.proxy(new Object[]{webviewBottomEditorBar}, null, changeQuickRedirect, true, 47544, new Class[]{WebviewBottomEditorBar.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewBottomEditorBar.z0();
    }

    public static final /* synthetic */ void s0(WebviewBottomEditorBar webviewBottomEditorBar, View view) {
        if (PatchProxy.proxy(new Object[]{webviewBottomEditorBar, view}, null, changeQuickRedirect, true, 47541, new Class[]{WebviewBottomEditorBar.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewBottomEditorBar.f0(view);
    }

    private final void x0() {
        com.max.xiaoheihe.module.webview.component.b webviewFragmentViewModel;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47528, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (i0.s() && !Q() && !this.f94632p1 && (webviewFragmentViewModel = getWebviewFragmentViewModel()) != null) {
            webviewFragmentViewModel.t(new b());
        }
        B();
    }

    private final void z0() {
        com.max.xiaoheihe.module.webview.component.b webviewFragmentViewModel;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47527, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String contentText = getEditor().getContentText();
        f0.o(contentText, "editor.contentText");
        if (i0.e(getContext()) && i0.d(getContext())) {
            if (!R()) {
                com.max.xiaoheihe.module.webview.component.b webviewFragmentViewModel2 = getWebviewFragmentViewModel();
                if (webviewFragmentViewModel2 != null) {
                    Context context = getContext();
                    f0.o(context, "context");
                    webviewFragmentViewModel2.w(context, getImgPathList(), contentText);
                    return;
                }
                return;
            }
            if (com.max.hbcommon.utils.c.u(contentText) && !N()) {
                com.max.hbutils.utils.c.d(getContext().getString(R.string.content_empty_msg));
                return;
            }
            if (this.V == null || this.W == null || this.f94629a0 == null || (webviewFragmentViewModel = getWebviewFragmentViewModel()) == null) {
                return;
            }
            String str = this.W;
            f0.m(str);
            String str2 = this.V;
            f0.m(str2);
            String str3 = this.f94629a0;
            f0.m(str3);
            webviewFragmentViewModel.v(str, str2, contentText, str3, this.f94630b0);
        }
    }

    public final void A0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47529, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        C(getEditor());
        getEditor().clearFocus();
        u0();
    }

    public final void C0() {
        FragmentManager fragmentManager;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47534, new Class[0], Void.TYPE).isSupported || (fragmentManager = getFragmentManager()) == null) {
            return;
        }
        setVgExpressionVisible(fragmentManager, true);
    }

    public final void D0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47533, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setEmojiShowing(true);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            setVgExpressionVisible(fragmentManager, true);
        }
    }

    public final void E0(@dl.d TargetComment targetComment, @dl.e String str, @dl.e p<? super t.b, ? super t.a, b2> pVar) {
        String name;
        if (PatchProxy.proxy(new Object[]{targetComment, str, pVar}, this, changeQuickRedirect, false, 47526, new Class[]{TargetComment.class, String.class, p.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(targetComment, "targetComment");
        String str2 = "replyLinkComment, target = " + targetComment + ", jsCallbackFunc = " + str;
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (WebviewBottomEditorBar.class.isAnonymousClass()) {
            name = WebviewBottomEditorBar.class.getName();
            f0.m(name);
        } else {
            name = WebviewBottomEditorBar.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str2);
        aVar.q(sb2.toString());
        if (com.max.hbcommon.utils.c.u(str) || targetComment.k() == null) {
            return;
        }
        this.V = targetComment.k();
        this.W = targetComment.n();
        this.f94629a0 = str;
        this.f94630b0 = pVar;
        f0(getEditor());
        if (com.max.hbcommon.utils.c.u(this.f94631c0.get(this.V))) {
            setContentText("");
        } else {
            setContentText(this.f94631c0.get(this.V));
        }
        c0(targetComment.j(), targetComment.l(), targetComment.m());
    }

    public final void F0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47539, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        A0();
    }

    @dl.d
    public final HashMap<String, String> getReplyFloorMap() {
        return this.f94631c0;
    }

    @dl.e
    public final String getReplyID() {
        return this.V;
    }

    @dl.e
    public final String getReplyJsCallbackFuncString() {
        return this.f94629a0;
    }

    @dl.e
    public final String getReplyOwnerContent() {
        return this.U;
    }

    @dl.e
    public final String getRootID() {
        return this.W;
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.x.a
    public void i0() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47535, new Class[0], Void.TYPE).isSupported && (getContext() instanceof AppCompatActivity)) {
            PermissionManager permissionManager = PermissionManager.f71603a;
            Context context = getContext();
            f0.n(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            permissionManager.S((AppCompatActivity) context, new c());
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.x.a
    public void m3(int i10) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 47537, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && getImgPathList().size() > 0 && i10 >= 0 && i10 < getImgPathList().size()) {
            getImgPathList().remove(i10);
            x mUploadImgShowerAdapter = getMUploadImgShowerAdapter();
            if (mUploadImgShowerAdapter != null) {
                mUploadImgShowerAdapter.notifyItemRemoved(i10);
            }
        }
    }

    public final void setReplyFloorMap(@dl.d HashMap<String, String> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 47524, new Class[]{HashMap.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(map, "<set-?>");
        this.f94631c0 = map;
    }

    public final void setReplyID(@dl.e String str) {
        this.V = str;
    }

    public final void setReplyJsCallbackFuncString(@dl.e String str) {
        this.f94629a0 = str;
    }

    public final void setReplyOwnerContent(@dl.e String str) {
        this.U = str;
    }

    public final void setRootID(@dl.e String str) {
        this.W = str;
    }

    public final void t0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47540, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f94631c0.clear();
        this.U = null;
    }

    public final void u0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47530, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        G0();
        w();
        this.W = null;
        this.V = null;
        this.f94629a0 = null;
        b0();
    }

    public final void v0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47536, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.mediaselector.e.i(getContext(), getImgPathList().size() > 0 ? 9 - getImgPathList().size() : 9, new a());
    }

    public final boolean w0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47532, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return i0.e(getContext()) && isAttachedToWindow();
    }

    public final void y0(@dl.e BBSFloorCommentObj bBSFloorCommentObj) {
        if (PatchProxy.proxy(new Object[]{bBSFloorCommentObj}, this, changeQuickRedirect, false, 47538, new Class[]{BBSFloorCommentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        setEditAddCY(false);
        getImgPathList().clear();
        x mUploadImgShowerAdapter = getMUploadImgShowerAdapter();
        if (mUploadImgShowerAdapter != null) {
            mUploadImgShowerAdapter.r(getImgPathList());
        }
        A0();
        if ((bBSFloorCommentObj == null || bBSFloorCommentObj.getReply_push_state() == null || !f0.g("1", bBSFloorCommentObj.getReply_push_state().getPush_state())) ? false : true) {
            v.a(getContext(), v.f95761b, null);
        }
    }
}
