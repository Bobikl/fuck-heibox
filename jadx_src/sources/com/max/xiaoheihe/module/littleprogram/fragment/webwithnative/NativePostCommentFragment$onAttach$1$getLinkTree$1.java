package com.max.xiaoheihe.module.littleprogram.fragment.webwithnative;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.network.d;
import com.max.hbcommon.utils.c;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.max.xiaoheihe.bean.bbs.webwithnative.RecommendStateList;
import com.max.xiaoheihe.bean.bbs.webwithnative.RecommendStateObj;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBarPostPageImpl;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: NativePostCommentFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class NativePostCommentFragment$onAttach$1$getLinkTree$1 extends d<Result<BBSLinkTreeObj>> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ NativePostCommentFragment f89343b;

    /* JADX INFO: compiled from: NativePostCommentFragment.kt */
    public static final class a extends d<Result<RecommendStateList>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ NativePostCommentFragment f89344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f89345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Result<BBSLinkTreeObj> f89346d;

        a(NativePostCommentFragment nativePostCommentFragment, yh.a<b2> aVar, Result<BBSLinkTreeObj> result) {
            this.f89344b = nativePostCommentFragment;
            this.f89345c = aVar;
            this.f89346d = result;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 39716, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (this.f89344b.isActive()) {
                this.f89345c.invoke();
            }
        }

        public void onNext(@dl.d Result<RecommendStateList> stateListResult) {
            List<RecommendStateObj> state_list;
            if (PatchProxy.proxy(new Object[]{stateListResult}, this, changeQuickRedirect, false, 39717, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(stateListResult, "stateListResult");
            if (this.f89344b.isActive()) {
                RecommendStateList result = stateListResult.getResult();
                if (result != null && (state_list = result.getState_list()) != null) {
                    this.f89344b.Q3.addAll(state_list);
                }
                BBSLinkTreeObj result2 = this.f89346d.getResult();
                if (result2 != null) {
                    result2.setStateList(this.f89344b.Q3);
                }
                this.f89345c.invoke();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39718, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<RecommendStateList>) obj);
        }
    }

    NativePostCommentFragment$onAttach$1$getLinkTree$1(NativePostCommentFragment nativePostCommentFragment) {
        this.f89343b = nativePostCommentFragment;
    }

    public static final /* synthetic */ void a(NativePostCommentFragment$onAttach$1$getLinkTree$1 nativePostCommentFragment$onAttach$1$getLinkTree$1, Object obj) {
        if (PatchProxy.proxy(new Object[]{nativePostCommentFragment$onAttach$1$getLinkTree$1, obj}, null, changeQuickRedirect, true, 39715, new Class[]{NativePostCommentFragment$onAttach$1$getLinkTree$1.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onNext(obj);
    }

    @Override // com.max.hbcommon.network.d, io.reactivex.g0
    public void onError(@dl.d Throwable e10) {
        if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 39712, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(e10, "e");
        if (this.f89343b.isActive()) {
            super.onError(e10);
            this.f89343b.A4(null);
            NativePostCommentFragment.W7(this.f89343b);
        }
    }

    public void onNext(@dl.d final Result<BBSLinkTreeObj> result) {
        if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 39713, new Class[]{Result.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(result, "result");
        if (this.f89343b.isActive()) {
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = this.f89343b.f89326y1;
            if (bottomEditorBarPostPageImpl == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl = null;
            }
            BBSLinkTreeObj result2 = result.getResult();
            bottomEditorBarPostPageImpl.setLikeLottieV2Key(result2 != null ? result2.getLike_lottie_key() : null);
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = this.f89343b.f89326y1;
            if (bottomEditorBarPostPageImpl2 == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl2 = null;
            }
            bottomEditorBarPostPageImpl2.setLottieAnimContextRef(new WeakReference<>(((com.max.hbcommon.base.d) this.f89343b).mContext));
            final NativePostCommentFragment nativePostCommentFragment = this.f89343b;
            yh.a<b2> aVar = new yh.a<b2>() { // from class: com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.NativePostCommentFragment$onAttach$1$getLinkTree$1$onNext$onGetCompleted$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @e
                public final b2 a() {
                    KeyDescObj bottom_toast;
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39719, new Class[0], b2.class);
                    if (patchProxyResultProxy.isSupported) {
                        return (b2) patchProxyResultProxy.result;
                    }
                    NativePostCommentFragment$onAttach$1$getLinkTree$1.a(this.f89347b, result);
                    nativePostCommentFragment.A4(result);
                    NativePostCommentFragment.W7(nativePostCommentFragment);
                    BBSLinkTreeObj result3 = result.getResult();
                    if (result3 == null || (bottom_toast = result3.getBottom_toast()) == null) {
                        return null;
                    }
                    NativePostCommentFragment nativePostCommentFragment2 = nativePostCommentFragment;
                    if (!nativePostCommentFragment2.f89319b0) {
                        s.f95742a.a(bottom_toast.getDesc(), bottom_toast.getProtocol());
                        nativePostCommentFragment2.f89319b0 = true;
                    }
                    return b2.f124493a;
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39720, new Class[0], Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
                }
            };
            if (this.f89343b.N3 == null) {
                aVar.invoke();
                return;
            }
            BBSLinkTreeObj result3 = result.getResult();
            List<String> noStateIds = result3 != null ? result3.getNoStateIds(this.f89343b.Q3) : null;
            if (noStateIds == null) {
                noStateIds = new ArrayList<>();
            }
            if (NativePostCommentFragment.A7(this.f89343b) == 1 && i0.s() && !noStateIds.contains(i0.j())) {
                noStateIds.add(i0.j());
            }
            if (c.w(noStateIds)) {
                aVar.invoke();
            } else {
                this.f89343b.addDisposable((io.reactivex.disposables.b) i.a().E6(this.f89343b.c4(), com.max.xiaoheihe.utils.d.b0(noStateIds)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(this.f89343b, aVar, result)));
            }
        }
    }

    @Override // com.max.hbcommon.network.d, io.reactivex.g0
    public /* bridge */ /* synthetic */ void onNext(Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39714, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        onNext((Result<BBSLinkTreeObj>) obj);
    }
}
