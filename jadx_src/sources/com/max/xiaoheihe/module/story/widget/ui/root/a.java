package com.max.xiaoheihe.module.story.widget.ui.root;

import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.max.hbstory.bean.StoryBBSUserInfoObj;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.bean.StoryLinkCardInfoObj;
import com.max.hbstory.d;
import com.max.hbstory.utils.StoryUtilsKt;
import com.max.hbstory.viewpage2.root.IStoryGestureUserHomeHolder;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.q0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;

/* JADX INFO: compiled from: StoryGestureUserHomeWidget.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class a implements IStoryGestureUserHomeHolder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f92176c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e
    private d f92177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f92178b = -1;

    private final q0 c() {
        Fragment fragmentB;
        FragmentManager parentFragmentManager;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43879, new Class[0], q0.class);
        if (patchProxyResultProxy.isSupported) {
            return (q0) patchProxyResultProxy.result;
        }
        d mStoryContext = getMStoryContext();
        Fragment fragmentR0 = (mStoryContext == null || (fragmentB = mStoryContext.b()) == null || (parentFragmentManager = fragmentB.getParentFragmentManager()) == null) ? null : parentFragmentManager.r0(R.id.base_fragment_container);
        if (fragmentR0 instanceof q0) {
            return (q0) fragmentR0;
        }
        return null;
    }

    private final void d() {
        d mStoryContext;
        Fragment fragmentB;
        FragmentManager parentFragmentManager;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43877, new Class[0], Void.TYPE).isSupported || ad.a.b(ad.a.f1209p, false, 2, null) || (mStoryContext = getMStoryContext()) == null || (fragmentB = mStoryContext.b()) == null || (parentFragmentManager = fragmentB.getParentFragmentManager()) == null || c() != null) {
            return;
        }
        parentFragmentManager.u().y(R.id.base_fragment_container, q0.f79171d.a(null, null, null, null, true)).n();
    }

    @Override // com.max.hbstory.viewpage2.root.IStoryGestureUserHomeHolder
    public void a(int i10) {
        d mStoryContext;
        StoryItemsObj storyItemsObjM;
        StoryLinkCardInfoObj link_card_info;
        StoryBBSUserInfoObj user_info;
        q0 q0VarC;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 43878, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (mStoryContext = getMStoryContext()) == null || (storyItemsObjM = StoryUtilsKt.m(mStoryContext, i10)) == null || (link_card_info = storyItemsObjM.getLink_card_info()) == null || (user_info = link_card_info.getUser_info()) == null || (q0VarC = c()) == null) {
            return;
        }
        q0VarC.N3(user_info.getUserid(), user_info.getSteamid());
    }

    @Override // com.max.hbstory.viewpage2.root.IStoryGestureUserHomeHolder
    public void b(@e d dVar) {
        if (PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, 43876, new Class[]{d.class}, Void.TYPE).isSupported) {
            return;
        }
        IStoryGestureUserHomeHolder.DefaultImpls.b(this, dVar);
        d();
    }

    @Override // com.max.hbstory.viewpage2.root.IStoryGestureUserHomeHolder
    public int getMPosition() {
        return this.f92178b;
    }

    @Override // com.max.hbstory.viewpage2.root.IStoryGestureUserHomeHolder
    @e
    public d getMStoryContext() {
        return this.f92177a;
    }

    @Override // com.max.hbstory.viewpage2.root.IStoryGestureUserHomeHolder
    public void setMPosition(int i10) {
        this.f92178b = i10;
    }

    @Override // com.max.hbstory.viewpage2.root.IStoryGestureUserHomeHolder
    public void setMStoryContext(@e d dVar) {
        this.f92177a = dVar;
    }
}
