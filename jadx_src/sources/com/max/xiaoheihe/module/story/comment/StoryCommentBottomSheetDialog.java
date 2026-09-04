package com.max.xiaoheihe.module.story.comment;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.max.basebbs.bean.BBSLinkRecObj;
import com.max.hbcustomview.SlideExpandView;
import com.max.hbstory.bean.StoryCardIdInfoObj;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.g;
import com.max.hbstory.utils.StoryUtilsKt;
import com.max.hbutils.utils.t;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSCommentObj;
import com.max.xiaoheihe.bean.bbs.BBSCommentsObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.module.account.ShareImageDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.ab0;
import dl.d;
import dl.e;
import java.util.HashMap;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.u;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: StoryCommentBottomSheetDialog.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nStoryCommentBottomSheetDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoryCommentBottomSheetDialog.kt\ncom/max/xiaoheihe/module/story/comment/StoryCommentBottomSheetDialog\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,310:1\n162#2,8:311\n*S KotlinDebug\n*F\n+ 1 StoryCommentBottomSheetDialog.kt\ncom/max/xiaoheihe/module/story/comment/StoryCommentBottomSheetDialog\n*L\n79#1:311,8\n*E\n"})
@o(parameters = 0)
public final class StoryCommentBottomSheetDialog extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f91961u = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final com.max.hbstory.d f91962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f91963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f91964l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private io.reactivex.disposables.a f91965m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private StoryPostCommentFragment f91966n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.story.comment.b f91967o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private BottomSheetBehavior<View> f91968p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ab0 f91969q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.e
    private String f91970r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f91971s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.e
    private String f91972t;

    /* JADX INFO: compiled from: StoryCommentBottomSheetDialog.kt */
    public static final class a implements com.max.xiaoheihe.module.story.comment.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.xiaoheihe.module.story.comment.a
        public void a(@dl.e String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43561, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            StoryCommentBottomSheetDialog.this.f91972t = str;
            StoryCommentBottomSheetDialog.this.f91971s = true;
            StoryCommentBottomSheetDialog.this.k4().f108483f.performClick();
        }

        @Override // com.max.xiaoheihe.module.story.comment.a
        public void b(@dl.e String str) {
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43560, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            StoryCommentBottomSheetDialog.this.f91970r = str;
            String str2 = StoryCommentBottomSheetDialog.this.f91970r;
            if (str2 != null && !u.V1(str2)) {
                z10 = false;
            }
            if (z10) {
                return;
            }
            StoryCommentBottomSheetDialog.this.k4().f108484g.setText(StoryCommentBottomSheetDialog.this.f91970r);
        }
    }

    /* JADX INFO: compiled from: StoryCommentBottomSheetDialog.kt */
    public static final class b implements j0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 43571, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bool);
        }

        public final void b(Boolean isDraggable) {
            BottomSheetBehavior bottomSheetBehavior;
            if (PatchProxy.proxy(new Object[]{isDraggable}, this, changeQuickRedirect, false, 43570, new Class[]{Boolean.class}, Void.TYPE).isSupported || (bottomSheetBehavior = StoryCommentBottomSheetDialog.this.f91968p) == null) {
                return;
            }
            f0.o(isDraggable, "isDraggable");
            bottomSheetBehavior.W0(isDraggable.booleanValue());
        }
    }

    /* JADX INFO: compiled from: StoryCommentBottomSheetDialog.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43572, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            StoryCommentBottomSheetDialog.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: StoryCommentBottomSheetDialog.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43573, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.story.comment.b bVarG4 = StoryCommentBottomSheetDialog.g4(StoryCommentBottomSheetDialog.this);
            StoryCommentBottomSheetDialog storyCommentBottomSheetDialog = StoryCommentBottomSheetDialog.this;
            String str = storyCommentBottomSheetDialog.f91972t;
            if (!(!(str == null || u.V1(str)) && storyCommentBottomSheetDialog.f91971s)) {
                str = null;
            }
            if (str != null) {
                storyCommentBottomSheetDialog.f91971s = false;
                bVarG4.R4(str);
            }
        }
    }

    /* JADX INFO: compiled from: StoryCommentBottomSheetDialog.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43574, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Dialog dialog = StoryCommentBottomSheetDialog.this.getDialog();
            if (dialog != null && dialog.isShowing()) {
                StoryCommentBottomSheetDialog.this.dismiss();
            }
        }
    }

    public StoryCommentBottomSheetDialog(@dl.d com.max.hbstory.d storyContext, int i10, boolean z10) {
        f0.p(storyContext, "storyContext");
        this.f91962j = storyContext;
        this.f91963k = i10;
        this.f91964l = z10;
    }

    public /* synthetic */ StoryCommentBottomSheetDialog(com.max.hbstory.d dVar, int i10, boolean z10, int i11, kotlin.jvm.internal.u uVar) {
        this(dVar, i10, (i11 & 4) != 0 ? false : z10);
    }

    public static final /* synthetic */ String V3(StoryCommentBottomSheetDialog storyCommentBottomSheetDialog) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyCommentBottomSheetDialog}, null, changeQuickRedirect, true, 43558, new Class[]{StoryCommentBottomSheetDialog.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : storyCommentBottomSheetDialog.i4();
    }

    public static final /* synthetic */ String W3(StoryCommentBottomSheetDialog storyCommentBottomSheetDialog) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyCommentBottomSheetDialog}, null, changeQuickRedirect, true, 43559, new Class[]{StoryCommentBottomSheetDialog.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : storyCommentBottomSheetDialog.j4();
    }

    public static final /* synthetic */ com.max.xiaoheihe.module.story.comment.b g4(StoryCommentBottomSheetDialog storyCommentBottomSheetDialog) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyCommentBottomSheetDialog}, null, changeQuickRedirect, true, 43557, new Class[]{StoryCommentBottomSheetDialog.class}, com.max.xiaoheihe.module.story.comment.b.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.story.comment.b) patchProxyResultProxy.result : storyCommentBottomSheetDialog.p4();
    }

    @SuppressLint({"CommitTransaction", "AutoDispose"})
    private final void h4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43551, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        StoryPostCommentFragment storyPostCommentFragment = new StoryPostCommentFragment(this.f91962j, this.f91963k, this.f91964l, new a(), new kf.a() { // from class: com.max.xiaoheihe.module.story.comment.StoryCommentBottomSheetDialog$addPostCommentFragment$postCommentFragment$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // kf.a
            @e
            public String A() {
                return null;
            }

            @Override // kf.a
            public void I1() {
            }

            @Override // kf.a
            public void M2(@e String str, @e String str2) {
            }

            @Override // kf.a
            public void R2(int i10) {
                if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 43566, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                kf.a.C1123a.c(this, i10);
            }

            @Override // kf.a
            @e
            public String X() {
                return null;
            }

            @Override // kf.a
            public void b3(@e String str, int i10) {
            }

            @Override // kf.a
            @e
            public String c3() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43563, new Class[0], String.class);
                return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : StoryCommentBottomSheetDialog.V3(this.f91974b);
            }

            @Override // kf.a
            public void d(@e ShareImageDialogFragment shareImageDialogFragment) {
            }

            @Override // kf.a
            public void d1(@e Fragment fragment, int i10, @e String str, @e String str2) {
            }

            @Override // kf.a
            public void d3(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7) {
            }

            @Override // kf.a
            @e
            public String getLinkId() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43564, new Class[0], String.class);
                return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : StoryCommentBottomSheetDialog.W3(this.f91974b);
            }

            @Override // kf.a
            public void h0(@d LinkInfoObj linkInfoObj, @d Map<String, String> map, @d l<? super Boolean, b2> lVar) {
                if (PatchProxy.proxy(new Object[]{linkInfoObj, map, lVar}, this, changeQuickRedirect, false, 43567, new Class[]{LinkInfoObj.class, Map.class, l.class}, Void.TYPE).isSupported) {
                    return;
                }
                kf.a.C1123a.a(this, linkInfoObj, map, lVar);
            }

            @Override // kf.a
            @e
            public BBSLinkRecObj i() {
                return null;
            }

            @Override // kf.a
            public void k(@e String str) {
            }

            @Override // kf.a
            public void l(@e String str, boolean z10) {
            }

            @Override // kf.a
            public void m(@e BBSCommentObj bBSCommentObj, @e BBSCommentObj bBSCommentObj2) {
                if (PatchProxy.proxy(new Object[]{bBSCommentObj, bBSCommentObj2}, this, changeQuickRedirect, false, 43562, new Class[]{BBSCommentObj.class, BBSCommentObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                g gVarD = this.f91974b.f91962j.d();
                final HashMap<String, String> mapY = gVarD != null ? gVarD.y() : null;
                if (bBSCommentObj2 == null || bBSCommentObj == null) {
                    return;
                }
                final String replyID = bBSCommentObj2.getCommentid();
                String rootCommentId = bBSCommentObj.getCommentid();
                final b bVarG4 = StoryCommentBottomSheetDialog.g4(this.f91974b);
                String str = mapY != null ? mapY.get(replyID) : null;
                if (str == null || u.V1(str)) {
                    str = "";
                }
                bVarG4.R4(str);
                f0.o(rootCommentId, "rootCommentId");
                f0.o(replyID, "replyID");
                bVarG4.b5(rootCommentId, replyID);
                bVarG4.W4(new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.comment.StoryCommentBottomSheetDialog$addPostCommentFragment$postCommentFragment$1$onCommentClicked$1$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43569, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        HashMap<String, String> map;
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43568, new Class[0], Void.TYPE).isSupported || (map = mapY) == null) {
                            return;
                        }
                        map.put(replyID, String.valueOf(bVarG4.v4()));
                    }
                });
                bVarG4.X4(bBSCommentObj2.getText(), bBSCommentObj2.getUser().getAvartar(), bBSCommentObj2.getUser().getUsername());
            }

            @Override // kf.a
            public boolean m0(@e String str) {
                return false;
            }

            @Override // kf.a
            public void p1() {
            }

            @Override // kf.a
            public void r1(@e BBSUserInfoObj bBSUserInfoObj, @e String str) {
            }

            @Override // kf.a
            public void v(@e String str, @e String str2) {
            }

            @Override // kf.a
            public boolean v0() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43565, new Class[0], Boolean.TYPE);
                return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : kf.a.C1123a.b(this);
            }

            @Override // kf.a
            public boolean w0() {
                return false;
            }

            @Override // kf.a
            public void y(@e String str) {
            }
        });
        this.f91966n = storyPostCommentFragment;
        getChildFragmentManager().u().y(R.id.comment_fragment_container, storyPostCommentFragment).n();
    }

    private final String i4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43552, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StoryItemsObj storyItemsObjM = StoryUtilsKt.m(this.f91962j, this.f91963k);
        if (storyItemsObjM != null) {
            return storyItemsObjM.getH_src();
        }
        return null;
    }

    private final String j4() {
        StoryCardIdInfoObj card_id_info;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43553, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StoryItemsObj storyItemsObjM = StoryUtilsKt.m(this.f91962j, this.f91963k);
        if (storyItemsObjM == null || (card_id_info = storyItemsObjM.getCard_id_info()) == null) {
            return null;
        }
        return card_id_info.getItem_id();
    }

    private final void l4() {
        g gVarD;
        LiveData<Boolean> liveDataJ;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43546, new Class[0], Void.TYPE).isSupported || (gVarD = this.f91962j.d()) == null || (liveDataJ = gVarD.J()) == null) {
            return;
        }
        liveDataJ.k(this, new b());
    }

    private final com.max.xiaoheihe.module.story.comment.b p4() {
        com.max.xiaoheihe.module.story.comment.b bVar;
        FragmentManager supportFragmentManager;
        com.max.xiaoheihe.module.story.comment.b bVar2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43549, new Class[0], com.max.xiaoheihe.module.story.comment.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.xiaoheihe.module.story.comment.b) patchProxyResultProxy.result;
        }
        if (this.f91967o == null) {
            this.f91967o = new com.max.xiaoheihe.module.story.comment.b(this.f91962j, this.f91963k, new l<BBSCommentsObj, b2>() { // from class: com.max.xiaoheihe.module.story.comment.StoryCommentBottomSheetDialog$showEditorDialog$1
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(1);
                }

                public final void a(@e BBSCommentsObj bBSCommentsObj) {
                    StoryPostCommentFragment storyPostCommentFragment;
                    if (PatchProxy.proxy(new Object[]{bBSCommentsObj}, this, changeQuickRedirect, false, 43577, new Class[]{BBSCommentsObj.class}, Void.TYPE).isSupported || (storyPostCommentFragment = this.f91983b.f91966n) == null) {
                        return;
                    }
                    storyPostCommentFragment.f6(bBSCommentsObj);
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(BBSCommentsObj bBSCommentsObj) {
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{bBSCommentsObj}, this, changeQuickRedirect, false, 43578, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy2.isSupported) {
                        return patchProxyResultProxy2.result;
                    }
                    a(bBSCommentsObj);
                    return b2.f124493a;
                }
            }, new p<String, BBSCommentsObj, b2>() { // from class: com.max.xiaoheihe.module.story.comment.StoryCommentBottomSheetDialog$showEditorDialog$2
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(2);
                }

                public final void a(@e String str, @e BBSCommentsObj bBSCommentsObj) {
                    StoryPostCommentFragment storyPostCommentFragment;
                    if (PatchProxy.proxy(new Object[]{str, bBSCommentsObj}, this, changeQuickRedirect, false, 43579, new Class[]{String.class, BBSCommentsObj.class}, Void.TYPE).isSupported || (storyPostCommentFragment = this.f91984b.f91966n) == null) {
                        return;
                    }
                    storyPostCommentFragment.g6(str, bBSCommentsObj);
                }

                /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(String str, BBSCommentsObj bBSCommentsObj) {
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{str, bBSCommentsObj}, this, changeQuickRedirect, false, 43580, new Class[]{Object.class, Object.class}, Object.class);
                    if (patchProxyResultProxy2.isSupported) {
                        return patchProxyResultProxy2.result;
                    }
                    a(str, bBSCommentsObj);
                    return b2.f124493a;
                }
            });
        }
        FragmentActivity activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (bVar2 = this.f91967o) != null) {
            bVar2.M3(supportFragmentManager, "bottomDialogTag");
        }
        String str = this.f91970r;
        if (!(str == null || u.V1(str)) && (bVar = this.f91967o) != null) {
            bVar.S4(this.f91970r);
        }
        com.max.xiaoheihe.module.story.comment.b bVar3 = this.f91967o;
        f0.m(bVar3);
        return bVar3;
    }

    @Override // com.max.hbcommon.base.swipeback.a
    public boolean R3() {
        return false;
    }

    @Override // com.max.hbcommon.base.swipeback.a
    public /* bridge */ /* synthetic */ void S3(Float f10) {
        if (PatchProxy.proxy(new Object[]{f10}, this, changeQuickRedirect, false, 43556, new Class[]{Float.class}, Void.TYPE).isSupported) {
            return;
        }
        m4(f10.floatValue());
    }

    @Override // com.max.hbcommon.base.swipeback.a
    public /* bridge */ /* synthetic */ void T3(Float f10) {
        if (PatchProxy.proxy(new Object[]{f10}, this, changeQuickRedirect, false, 43555, new Class[]{Float.class}, Void.TYPE).isSupported) {
            return;
        }
        n4(f10.floatValue());
    }

    @dl.d
    public final ab0 k4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43542, new Class[0], ab0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ab0) patchProxyResultProxy.result;
        }
        ab0 ab0Var = this.f91969q;
        if (ab0Var != null) {
            return ab0Var;
        }
        f0.S("binding");
        return null;
    }

    public void m4(float f10) {
        int measuredHeight;
        g gVarD;
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 43548, new Class[]{Float.TYPE}, Void.TYPE).isSupported || (measuredHeight = k4().f108479b.getMeasuredHeight()) <= 0 || (gVarD = this.f91962j.d()) == null) {
            return;
        }
        gVarD.q0(new g.d(1.0f - f10, measuredHeight));
    }

    public void n4(float f10) {
        int measuredHeight;
        g gVarD;
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 43547, new Class[]{Float.TYPE}, Void.TYPE).isSupported || (measuredHeight = k4().f108479b.getMeasuredHeight()) <= 0 || (gVarD = this.f91962j.d()) == null) {
            return;
        }
        gVarD.q0(new g.d(1.0f - f10, measuredHeight));
    }

    public final void o4(@dl.d ab0 ab0Var) {
        if (PatchProxy.proxy(new Object[]{ab0Var}, this, changeQuickRedirect, false, 43543, new Class[]{ab0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(ab0Var, "<set-?>");
        this.f91969q = ab0Var;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.d
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        int iC = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 43544, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        ab0 ab0VarC = ab0.c(LayoutInflater.from(getContext()));
        f0.o(ab0VarC, "inflate(LayoutInflater.from(context))");
        o4(ab0VarC);
        ic.a aVar = ic.a.f119343a;
        Context contextRequireContext = requireContext();
        f0.o(contextRequireContext, "requireContext()");
        int iC2 = (aVar.c(contextRequireContext) * 2) / 3;
        SlideExpandView slideExpandView = k4().f108482e;
        slideExpandView.setAnchorView(k4().f108485h);
        slideExpandView.setChangeView(k4().f108480c);
        Context contextRequireContext2 = requireContext();
        f0.o(contextRequireContext2, "requireContext()");
        int iC3 = aVar.c(contextRequireContext2);
        Context contextRequireContext3 = requireContext();
        f0.o(contextRequireContext3, "requireContext()");
        slideExpandView.setMaxHeight(iC3 - aVar.b(contextRequireContext3, 80));
        slideExpandView.setNormalHeight(iC2);
        k4().f108487j.setOnClickListener(new c());
        k4().f108480c.getLayoutParams().height = iC2;
        SlideExpandView slideExpandViewB = k4().b();
        f0.o(slideExpandViewB, "binding.root");
        k4().f108483f.setOnClickListener(new d());
        slideExpandViewB.setOnClickListener(new e());
        ConstraintLayout constraintLayout = k4().f108479b;
        f0.o(constraintLayout, "binding.commentDialogRoot");
        if (t.f73585f == 0) {
            Context contextRequireContext4 = requireContext();
            f0.o(contextRequireContext4, "requireContext()");
            iC = com.max.xiaoheihe.accelworld.l.c(10.0f, contextRequireContext4);
        }
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), iC);
        com.max.xiaoheihe.accelworld.l.q(k4().f108486i, R.color.divider_primary_1_color, 2.0f);
        return slideExpandViewB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43554, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        io.reactivex.disposables.a aVar = this.f91965m;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43545, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        this.f66927e.f69560p.a(new l<Float, b2>() { // from class: com.max.xiaoheihe.module.story.comment.StoryCommentBottomSheetDialog.onStart.1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(float f10) {
                g gVarD;
                if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 43575, new Class[]{Float.TYPE}, Void.TYPE).isSupported || (gVarD = StoryCommentBottomSheetDialog.this.f91962j.d()) == null) {
                    return;
                }
                gVarD.q0(new g.d(1.0f - f10, StoryCommentBottomSheetDialog.this.k4().f108479b.getMeasuredHeight()));
            }

            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Float f10) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{f10}, this, changeQuickRedirect, false, 43576, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(f10.floatValue());
                return b2.f124493a;
            }
        });
        l4();
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 43550, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        h4();
    }
}
