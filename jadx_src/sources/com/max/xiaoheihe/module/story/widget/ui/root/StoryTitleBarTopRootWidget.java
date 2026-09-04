package com.max.xiaoheihe.module.story.widget.ui.root;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.z;
import com.max.basebbs.bean.BBSLinkRecObj;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcommon.utils.c;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbstory.bean.StoryCardIdInfoObj;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.d;
import com.max.hbstory.g;
import com.max.hbstory.utils.StoryUtilsKt;
import com.max.hbstory.viewpage2.root.IStoryTitleBarHolder;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.BBSShareDialogManager;
import com.max.xiaoheihe.accelworld.l;
import com.max.xiaoheihe.accelworld.w;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.media.UMImage;
import dl.e;
import io.reactivex.disposables.b;
import java.util.HashMap;
import kotlin.b2;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.k;
import xh.i;

/* JADX INFO: compiled from: StoryTitleBarTopRootWidget.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class StoryTitleBarTopRootWidget extends TitleBar implements IStoryTitleBarHolder {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public static final int f92156g4 = 8;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    @e
    private d f92157a4;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private int f92158b4;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    @e
    private io.reactivex.disposables.a f92159c4;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    @dl.d
    private final HashMap<String, Result<BBSLinkTreeObj>> f92160d4;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    @dl.d
    private final HashMap<String, BBSShareDialogManager> f92161e4;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    @e
    private LoadingDialog f92162f4;

    /* JADX INFO: compiled from: StoryTitleBarTopRootWidget.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43927, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Log.d("IconOnClickListener", "id: " + StoryTitleBarTopRootWidget.e0(StoryTitleBarTopRootWidget.this));
            String strE0 = StoryTitleBarTopRootWidget.e0(StoryTitleBarTopRootWidget.this);
            if (strE0 != null) {
                StoryTitleBarTopRootWidget storyTitleBarTopRootWidget = StoryTitleBarTopRootWidget.this;
                Result result = (Result) storyTitleBarTopRootWidget.f92160d4.get(strE0);
                if (result != null) {
                    StoryTitleBarTopRootWidget.k0(storyTitleBarTopRootWidget, result);
                } else {
                    StoryTitleBarTopRootWidget.j0(storyTitleBarTopRootWidget);
                    StoryTitleBarTopRootWidget.h0(storyTitleBarTopRootWidget);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.story.widget.ui.root.StoryTitleBarTopRootWidget$getLinkTree$1, reason: invalid class name */
    /* JADX INFO: compiled from: StoryTitleBarTopRootWidget.kt */
    public static final class AnonymousClass1 extends com.max.hbcommon.network.d<Result<BBSLinkTreeObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        AnonymousClass1() {
        }

        public static final /* synthetic */ void a(AnonymousClass1 anonymousClass1, Throwable th2) {
            if (PatchProxy.proxy(new Object[]{anonymousClass1, th2}, null, changeQuickRedirect, true, 43917, new Class[]{AnonymousClass1.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
        }

        public static final /* synthetic */ void b(AnonymousClass1 anonymousClass1, Object obj) {
            if (PatchProxy.proxy(new Object[]{anonymousClass1, obj}, null, changeQuickRedirect, true, 43918, new Class[]{AnonymousClass1.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(obj);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            Fragment fragmentB;
            LifecycleCoroutineScope lifecycleCoroutineScopeA;
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 43914, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            d mStoryContext = StoryTitleBarTopRootWidget.this.getMStoryContext();
            if (mStoryContext == null || (fragmentB = mStoryContext.b()) == null || (lifecycleCoroutineScopeA = z.a(fragmentB)) == null) {
                return;
            }
            k.f(lifecycleCoroutineScopeA, null, null, new StoryTitleBarTopRootWidget$getLinkTree$1$onError$1(this, e10, StoryTitleBarTopRootWidget.this, null), 3, null);
        }

        public void onNext(@dl.d Result<BBSLinkTreeObj> result) {
            Fragment fragmentB;
            LifecycleCoroutineScope lifecycleCoroutineScopeA;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43915, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            d mStoryContext = StoryTitleBarTopRootWidget.this.getMStoryContext();
            if (mStoryContext == null || (fragmentB = mStoryContext.b()) == null || (lifecycleCoroutineScopeA = z.a(fragmentB)) == null) {
                return;
            }
            k.f(lifecycleCoroutineScopeA, null, null, new StoryTitleBarTopRootWidget$getLinkTree$1$onNext$1(this, result, StoryTitleBarTopRootWidget.this, null), 3, null);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43916, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSLinkTreeObj>) obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryTitleBarTopRootWidget(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryTitleBarTopRootWidget(@dl.d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public StoryTitleBarTopRootWidget(@dl.d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f92158b4 = -1;
        this.f92160d4 = new HashMap<>();
        this.f92161e4 = new HashMap<>();
    }

    public /* synthetic */ StoryTitleBarTopRootWidget(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final /* synthetic */ String e0(StoryTitleBarTopRootWidget storyTitleBarTopRootWidget) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyTitleBarTopRootWidget}, null, changeQuickRedirect, true, 43909, new Class[]{StoryTitleBarTopRootWidget.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : storyTitleBarTopRootWidget.n0();
    }

    private final void getLinkTree() {
        io.reactivex.disposables.a aVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43902, new Class[0], Void.TYPE).isSupported || (aVar = this.f92159c4) == null) {
            return;
        }
        aVar.c((b) com.max.xiaoheihe.network.i.a().s(l0(), n0(), "1", BBSLinkObj.CONTENT_TYPE_EXPRESS_NEWS, "1", null, "0", "0", null, s0.z()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new AnonymousClass1()));
    }

    public static final /* synthetic */ void h0(StoryTitleBarTopRootWidget storyTitleBarTopRootWidget) {
        if (PatchProxy.proxy(new Object[]{storyTitleBarTopRootWidget}, null, changeQuickRedirect, true, 43912, new Class[]{StoryTitleBarTopRootWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyTitleBarTopRootWidget.getLinkTree();
    }

    public static final /* synthetic */ void i0(StoryTitleBarTopRootWidget storyTitleBarTopRootWidget) {
        if (PatchProxy.proxy(new Object[]{storyTitleBarTopRootWidget}, null, changeQuickRedirect, true, 43913, new Class[]{StoryTitleBarTopRootWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyTitleBarTopRootWidget.o0();
    }

    public static final /* synthetic */ void j0(StoryTitleBarTopRootWidget storyTitleBarTopRootWidget) {
        if (PatchProxy.proxy(new Object[]{storyTitleBarTopRootWidget}, null, changeQuickRedirect, true, 43911, new Class[]{StoryTitleBarTopRootWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyTitleBarTopRootWidget.p0();
    }

    public static final /* synthetic */ void k0(StoryTitleBarTopRootWidget storyTitleBarTopRootWidget, Result result) {
        if (PatchProxy.proxy(new Object[]{storyTitleBarTopRootWidget, result}, null, changeQuickRedirect, true, 43910, new Class[]{StoryTitleBarTopRootWidget.class, Result.class}, Void.TYPE).isSupported) {
            return;
        }
        storyTitleBarTopRootWidget.q0(result);
    }

    private final String l0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43904, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StoryItemsObj storyItemsObjM0 = m0();
        if (storyItemsObjM0 != null) {
            return storyItemsObjM0.getH_src();
        }
        return null;
    }

    private final StoryItemsObj m0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43903, new Class[0], StoryItemsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (StoryItemsObj) patchProxyResultProxy.result;
        }
        d mStoryContext = getMStoryContext();
        if (mStoryContext != null) {
            return StoryUtilsKt.m(mStoryContext, getMPosition());
        }
        return null;
    }

    private final String n0() {
        StoryCardIdInfoObj card_id_info;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43905, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StoryItemsObj storyItemsObjM0 = m0();
        if (storyItemsObjM0 == null || (card_id_info = storyItemsObjM0.getCard_id_info()) == null) {
            return null;
        }
        return card_id_info.getItem_id();
    }

    private final void o0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43901, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.f92162f4;
        if (loadingDialog != null) {
            loadingDialog.c();
        }
        this.f92162f4 = null;
    }

    private final void p0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43900, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f92162f4 == null) {
            Context context = getContext();
            f0.o(context, "context");
            this.f92162f4 = new LoadingDialog(context, "");
        }
        LoadingDialog loadingDialog = this.f92162f4;
        if (loadingDialog != null) {
            loadingDialog.r();
        }
    }

    private final void q0(Result<BBSLinkTreeObj> result) {
        LinkInfoObj link;
        g gVarD;
        LiveData<Boolean> liveDataK;
        LinkInfoObj link2;
        LinkInfoObj link3;
        LinkInfoObj link4;
        boolean zG = false;
        if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43899, new Class[]{Result.class}, Void.TYPE).isSupported) {
            return;
        }
        d mStoryContext = getMStoryContext();
        String link_tag = null;
        Context contextA = mStoryContext != null ? mStoryContext.a() : null;
        Activity activity = contextA instanceof Activity ? (Activity) contextA : null;
        if (activity == null) {
            return;
        }
        BBSLinkTreeObj result2 = result.getResult();
        String linkid = (result2 == null || (link4 = result2.getLink()) == null) ? null : link4.getLinkid();
        if (linkid == null) {
            return;
        }
        BBSLinkTreeObj result3 = result.getResult();
        String strQ = com.max.xiaoheihe.module.bbs.utils.b.q(activity, result3 != null ? result3.getLink() : null, false);
        BBSLinkTreeObj result4 = result.getResult();
        UMImage uMImageS = com.max.xiaoheihe.module.bbs.utils.b.s(activity, result4 != null ? result4.getLink() : null);
        BBSLinkTreeObj result5 = result.getResult();
        String title = (result5 == null || (link3 = result5.getLink()) == null) ? null : link3.getTitle();
        BBSLinkTreeObj result6 = result.getResult();
        String share_url = (result6 == null || (link2 = result6.getLink()) == null) ? null : link2.getShare_url();
        BBSLinkTreeObj result7 = result.getResult();
        LinkInfoObj link5 = result7 != null ? result7.getLink() : null;
        if (link5 != null) {
            d mStoryContext2 = getMStoryContext();
            if (mStoryContext2 != null && (gVarD = mStoryContext2.d()) != null && (liveDataK = gVarD.K()) != null) {
                zG = f0.g(liveDataK.f(), Boolean.TRUE);
            }
            link5.setIs_favour(zG ? "1" : "0");
        }
        BBSShareDialogManager bBSShareDialogManager = this.f92161e4.get(linkid);
        if (bBSShareDialogManager == null) {
            BBSLinkTreeObj result8 = result.getResult();
            if (result8 != null && (link = result8.getLink()) != null) {
                link_tag = link.getLink_tag();
            }
            bBSShareDialogManager = new BBSShareDialogManager(activity, result, link_tag, uMImageS, strQ, l0(), false, new w() { // from class: com.max.xiaoheihe.module.story.widget.ui.root.StoryTitleBarTopRootWidget$showShareDialog$bbsShareManager$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.max.xiaoheihe.accelworld.w
                @e
                public io.reactivex.disposables.a a() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43929, new Class[0], io.reactivex.disposables.a.class);
                    return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.a) patchProxyResultProxy.result : this.f92173a.f92159c4;
                }

                @Override // com.max.xiaoheihe.accelworld.w
                @e
                public BBSLinkRecObj i() {
                    return null;
                }

                @Override // com.max.xiaoheihe.accelworld.w
                public boolean isActive() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43930, new Class[0], Boolean.TYPE);
                    if (patchProxyResultProxy.isSupported) {
                        return ((Boolean) patchProxyResultProxy.result).booleanValue();
                    }
                    d mStoryContext3 = this.f92173a.getMStoryContext();
                    Context contextA2 = mStoryContext3 != null ? mStoryContext3.a() : null;
                    Activity activity2 = contextA2 instanceof Activity ? (Activity) contextA2 : null;
                    if (activity2 == null) {
                        return false;
                    }
                    return !activity2.isFinishing();
                }

                @Override // com.max.xiaoheihe.accelworld.w
                public void k(@e final String str) {
                    d mStoryContext3;
                    if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43933, new Class[]{String.class}, Void.TYPE).isSupported || (mStoryContext3 = this.f92173a.getMStoryContext()) == null) {
                        return;
                    }
                    int mPosition = this.f92173a.getMPosition();
                    final StoryTitleBarTopRootWidget storyTitleBarTopRootWidget = this.f92173a;
                    StoryUtilsKt.e(mStoryContext3, mPosition, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.root.StoryTitleBarTopRootWidget$showShareDialog$bbsShareManager$1$onCommentStateChanged$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43935, new Class[0], Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            d mStoryContext4;
                            g gVarD2;
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43934, new Class[0], Void.TYPE).isSupported || (mStoryContext4 = storyTitleBarTopRootWidget.getMStoryContext()) == null || (gVarD2 = mStoryContext4.d()) == null) {
                                return;
                            }
                            gVarD2.c(!f0.g("1", str));
                        }
                    });
                }

                @Override // com.max.xiaoheihe.accelworld.w
                public void l(@e String str, boolean z10) {
                }

                @Override // com.max.xiaoheihe.accelworld.w
                public void m() {
                }

                @Override // com.max.xiaoheihe.accelworld.w
                public void n(@e String str) {
                    d mStoryContext3;
                    g gVarD2;
                    if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43928, new Class[]{String.class}, Void.TYPE).isSupported || (mStoryContext3 = this.f92173a.getMStoryContext()) == null || (gVarD2 = mStoryContext3.d()) == null) {
                        return;
                    }
                    gVarD2.Z(c.x(str));
                }

                @Override // com.max.xiaoheihe.accelworld.w
                @e
                public FragmentManager o() {
                    Fragment fragmentB;
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43931, new Class[0], FragmentManager.class);
                    if (patchProxyResultProxy.isSupported) {
                        return (FragmentManager) patchProxyResultProxy.result;
                    }
                    d mStoryContext3 = this.f92173a.getMStoryContext();
                    if (mStoryContext3 == null || (fragmentB = mStoryContext3.b()) == null) {
                        return null;
                    }
                    return fragmentB.getChildFragmentManager();
                }

                @Override // com.max.xiaoheihe.accelworld.w
                public boolean p() {
                    return false;
                }

                @Override // com.max.xiaoheihe.accelworld.w
                public void q(@e String str) {
                }

                @Override // com.max.xiaoheihe.accelworld.w
                public void r(@e String str) {
                }

                @Override // com.max.xiaoheihe.accelworld.w
                public void startActivityForResult(@dl.d Intent intent, int i10) {
                    Fragment fragmentB;
                    if (PatchProxy.proxy(new Object[]{intent, new Integer(i10)}, this, changeQuickRedirect, false, 43932, new Class[]{Intent.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(intent, "intent");
                    d mStoryContext3 = this.f92173a.getMStoryContext();
                    if (mStoryContext3 == null || (fragmentB = mStoryContext3.b()) == null) {
                        return;
                    }
                    fragmentB.startActivityForResult(intent, i10);
                }
            });
        }
        BBSShareDialogManager bBSShareDialogManager2 = bBSShareDialogManager;
        this.f92161e4.put(linkid, bBSShareDialogManager2);
        BBSShareDialogManager.M0(bBSShareDialogManager2, title, strQ, share_url, uMImageS, null, 16, null);
    }

    @Override // com.max.hbcommon.component.TitleBar
    public void W(@e Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 43898, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.W(context);
        a0();
        setActionIcon(R.drawable.common_share);
        setActionIconOnClickListener(new a());
        int iE = androidx.core.content.res.i.e(getResources(), R.color.white, null);
        ImageView imageView = this.f67181a0;
        if (imageView != null) {
            imageView.setColorFilter(iE);
        }
        this.f67186p3.setColorFilter(iE);
        setBackground(ViewUtils.w(0, l.h(context, R.color.black_alpha30), l.h(context, R.color.black_alpha0), GradientDrawable.Orientation.TOP_BOTTOM));
    }

    @Override // com.max.hbstory.viewpage2.root.IStoryTitleBarHolder
    public void a(int i10) {
    }

    @Override // com.max.hbstory.viewpage2.root.IStoryTitleBarHolder
    public void b(@e d dVar) {
        if (PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, 43908, new Class[]{d.class}, Void.TYPE).isSupported) {
            return;
        }
        IStoryTitleBarHolder.DefaultImpls.b(this, dVar);
    }

    @Override // com.max.hbstory.viewpage2.root.IStoryTitleBarHolder
    public int getMPosition() {
        return this.f92158b4;
    }

    @Override // com.max.hbstory.viewpage2.root.IStoryTitleBarHolder
    @e
    public d getMStoryContext() {
        return this.f92157a4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43906, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        this.f92159c4 = new io.reactivex.disposables.a();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43907, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        io.reactivex.disposables.a aVar = this.f92159c4;
        if (aVar != null) {
            aVar.dispose();
        }
        io.reactivex.disposables.a aVar2 = this.f92159c4;
        if (aVar2 != null) {
            aVar2.f();
        }
        this.f92159c4 = null;
        o0();
    }

    @Override // com.max.hbstory.viewpage2.root.IStoryTitleBarHolder
    public void setMPosition(int i10) {
        this.f92158b4 = i10;
    }

    @Override // com.max.hbstory.viewpage2.root.IStoryTitleBarHolder
    public void setMStoryContext(@e d dVar) {
        this.f92157a4 = dVar;
    }
}
