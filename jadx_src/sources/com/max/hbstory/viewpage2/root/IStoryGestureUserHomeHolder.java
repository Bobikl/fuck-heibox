package com.max.hbstory.viewpage2.root;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import bb.c;
import com.max.hbstory.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: IStoryGestureUserHomeHolder.kt */
/* JADX INFO: loaded from: classes13.dex */
public interface IStoryGestureUserHomeHolder {

    /* JADX INFO: compiled from: IStoryGestureUserHomeHolder.kt */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        public static void b(@d final IStoryGestureUserHomeHolder iStoryGestureUserHomeHolder, @e com.max.hbstory.d dVar) {
            Fragment fragmentB;
            com.max.hbstory.d mStoryContext;
            g gVarD;
            LiveData<Integer> liveDataN;
            if (PatchProxy.proxy(new Object[]{iStoryGestureUserHomeHolder, dVar}, null, changeQuickRedirect, true, c.k.Li, new Class[]{IStoryGestureUserHomeHolder.class, com.max.hbstory.d.class}, Void.TYPE).isSupported) {
                return;
            }
            iStoryGestureUserHomeHolder.setMStoryContext(dVar);
            com.max.hbstory.d mStoryContext2 = iStoryGestureUserHomeHolder.getMStoryContext();
            if (mStoryContext2 == null || (fragmentB = mStoryContext2.b()) == null || (mStoryContext = iStoryGestureUserHomeHolder.getMStoryContext()) == null || (gVarD = mStoryContext.d()) == null || (liveDataN = gVarD.n()) == null) {
                return;
            }
            final l<Integer, b2> lVar = new l<Integer, b2>() { // from class: com.max.hbstory.viewpage2.root.IStoryGestureUserHomeHolder$initContext$1
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(1);
                }

                public final void a(Integer num) {
                    if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, c.k.Ni, new Class[]{Integer.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    IStoryGestureUserHomeHolder iStoryGestureUserHomeHolder2 = iStoryGestureUserHomeHolder;
                    f0.m(num);
                    iStoryGestureUserHomeHolder2.setMPosition(num.intValue());
                    IStoryGestureUserHomeHolder iStoryGestureUserHomeHolder3 = iStoryGestureUserHomeHolder;
                    iStoryGestureUserHomeHolder3.a(iStoryGestureUserHomeHolder3.getMPosition());
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Integer num) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, c.k.Oi, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    a(num);
                    return b2.f124493a;
                }
            };
            liveDataN.k(fragmentB, new j0() { // from class: com.max.hbstory.viewpage2.root.a
                @Override // androidx.lifecycle.j0
                public final void a(Object obj) {
                    IStoryGestureUserHomeHolder.DefaultImpls.c(lVar, obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(l tmp0, Object obj) {
            if (PatchProxy.proxy(new Object[]{tmp0, obj}, null, changeQuickRedirect, true, c.k.Mi, new Class[]{l.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }
    }

    void a(int i10);

    void b(@e com.max.hbstory.d dVar);

    int getMPosition();

    @e
    com.max.hbstory.d getMStoryContext();

    void setMPosition(int i10);

    void setMStoryContext(@e com.max.hbstory.d dVar);
}
