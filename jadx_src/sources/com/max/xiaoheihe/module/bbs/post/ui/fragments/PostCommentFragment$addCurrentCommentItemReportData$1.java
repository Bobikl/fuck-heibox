package com.max.xiaoheihe.module.bbs.post.ui.fragments;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.k;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSCommentObj;
import com.max.xiaoheihe.bean.bbs.BBSCommentsObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: PostCommentFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@d(c = "com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment$addCurrentCommentItemReportData$1", f = "PostCommentFragment.kt", i = {}, l = {540}, m = "invokeSuspend", n = {}, s = {})
public final class PostCommentFragment$addCurrentCommentItemReportData$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f81795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ PostCommentFragment f81796c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostCommentFragment$addCurrentCommentItemReportData$1(PostCommentFragment postCommentFragment, c<? super PostCommentFragment$addCurrentCommentItemReportData$1> cVar) {
        super(2, cVar);
        this.f81796c = postCommentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 29089, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new PostCommentFragment$addCurrentCommentItemReportData$1(this.f81796c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 29091, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 29090, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((PostCommentFragment$addCurrentCommentItemReportData$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object tag;
        BBSCommentObj bBSCommentObj;
        String commentid;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29088, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f81795b;
        if (i10 == 0) {
            t0.n(obj);
            this.f81795b = 1;
            if (DelayKt.b(50L, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        if (!this.f81796c.isActive()) {
            return b2.f124493a;
        }
        RecyclerView.LayoutManager layoutManager = this.f81796c.E5().f112950k.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            PostCommentFragment postCommentFragment = this.f81796c;
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            int i11 = (iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition == -1) ? 0 : (iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition) + 1;
            int[] iArr = new int[2];
            postCommentFragment.E5().C.getLocationInWindow(iArr);
            int measuredHeight = iArr[1] + postCommentFragment.E5().C.getMeasuredHeight();
            if (i11 > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                    int i12 = iFindFirstVisibleItemPosition;
                    while (true) {
                        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(i12);
                        if (viewFindViewByPosition == null) {
                            tag = null;
                        } else {
                            if (!ic.a.f119343a.g(viewFindViewByPosition, measuredHeight)) {
                                viewFindViewByPosition = null;
                            }
                            if (viewFindViewByPosition != null) {
                                tag = viewFindViewByPosition.getTag(R.id.comment);
                            } else {
                                tag = null;
                            }
                        }
                        BBSCommentsObj bBSCommentsObj = tag instanceof BBSCommentsObj ? (BBSCommentsObj) tag : null;
                        if (bBSCommentsObj != null && !com.max.hbcommon.utils.c.w(bBSCommentsObj.getComment()) && (bBSCommentObj = bBSCommentsObj.getComment().get(0)) != null && (commentid = bBSCommentObj.getCommentid()) != null) {
                            f0.o(commentid, "commentid");
                            if (!postCommentFragment.S.containsKey(commentid)) {
                                postCommentFragment.S.put(commentid, kotlin.coroutines.jvm.internal.a.g(jCurrentTimeMillis));
                            }
                        }
                        if (i12 == iFindLastVisibleItemPosition) {
                            break;
                        }
                        i12++;
                    }
                }
            }
            g.f74531b.q("reportItem addCurrentCommentItemReportData " + k.p(postCommentFragment.S) + ' ' + n0.d(postCommentFragment.getClass()).F() + "  firstVisibleItemPosition: " + iFindFirstVisibleItemPosition + "  lastVisibleItemPosition: " + iFindLastVisibleItemPosition);
        }
        return b2.f124493a;
    }
}
