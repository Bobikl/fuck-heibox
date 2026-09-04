package com.max.xiaoheihe.module.video.action;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.vd0;
import dl.e;
import kotlin.KotlinNothingValueException;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: VideoFollowAction.kt */
/* JADX INFO: loaded from: classes12.dex */
@d(c = "com.max.xiaoheihe.module.video.action.VideoFollowAction$initExtView$1", f = "VideoFollowAction.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
public final class VideoFollowAction$initExtView$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f93676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ VideoFollowAction f93677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f93678d;

    /* JADX INFO: compiled from: VideoFollowAction.kt */
    public static final class a implements f<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoFollowAction f93679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f93680c;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.video.action.VideoFollowAction$initExtView$1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: VideoFollowAction.kt */
        public static final class ViewOnClickListenerC0879a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ VideoFollowAction f93681b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f93682c;

            ViewOnClickListenerC0879a(VideoFollowAction videoFollowAction, Context context) {
                this.f93681b = videoFollowAction;
                this.f93682c = context;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String strK;
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46344, new Class[]{View.class}, Void.TYPE).isSupported || (strK = this.f93681b.k()) == null) {
                    return;
                }
                com.sankuai.waimai.router.common.c cVarC = com.max.xiaoheihe.base.router.b.T(this.f93682c, strK).C(2);
                f0.o(cVarC, "requestOtherHome(context…                        )");
                com.max.xiaoheihe.base.router.b.z0(cVarC);
            }
        }

        /* JADX INFO: compiled from: VideoFollowAction.kt */
        public static final class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ VideoFollowAction f93683b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f93684c;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.video.action.VideoFollowAction$initExtView$1$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: VideoFollowAction.kt */
            public static final class RunnableC0880a implements Runnable {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ VideoFollowAction f93685b;

                /* JADX INFO: renamed from: com.max.xiaoheihe.module.video.action.VideoFollowAction$initExtView$1$a$b$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: VideoFollowAction.kt */
                public static final class C0881a implements Animator.AnimatorListener {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ VideoFollowAction f93686b;

                    C0881a(VideoFollowAction videoFollowAction) {
                        this.f93686b = videoFollowAction;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(@dl.d Animator p10) {
                        if (PatchProxy.proxy(new Object[]{p10}, this, changeQuickRedirect, false, 46349, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(p10, "p0");
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(@dl.d Animator p10) {
                        if (PatchProxy.proxy(new Object[]{p10}, this, changeQuickRedirect, false, 46348, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(p10, "p0");
                        vd0 vd0Var = this.f93686b.f93673f;
                        vd0 vd0Var2 = null;
                        if (vd0Var == null) {
                            f0.S("binding");
                            vd0Var = null;
                        }
                        vd0Var.f116823d.setVisibility(8);
                        vd0 vd0Var3 = this.f93686b.f93673f;
                        if (vd0Var3 == null) {
                            f0.S("binding");
                        } else {
                            vd0Var2 = vd0Var3;
                        }
                        vd0Var2.f116822c.setVisibility(8);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(@dl.d Animator p10) {
                        if (PatchProxy.proxy(new Object[]{p10}, this, changeQuickRedirect, false, 46350, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(p10, "p0");
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(@dl.d Animator p10) {
                        if (PatchProxy.proxy(new Object[]{p10}, this, changeQuickRedirect, false, 46347, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(p10, "p0");
                    }
                }

                RunnableC0880a(VideoFollowAction videoFollowAction) {
                    this.f93685b = videoFollowAction;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46346, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    vd0 vd0Var = this.f93685b.f93673f;
                    if (vd0Var == null) {
                        f0.S("binding");
                        vd0Var = null;
                    }
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vd0Var.f116823d, "alpha", 1.0f, 0.0f);
                    objectAnimatorOfFloat.addListener(new C0881a(this.f93685b));
                    objectAnimatorOfFloat.setDuration(200L);
                    objectAnimatorOfFloat.start();
                }
            }

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.video.action.VideoFollowAction$initExtView$1$a$b$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: VideoFollowAction.kt */
            public static final class ViewOnClickListenerC0882b implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ VideoFollowAction f93687b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Context f93688c;

                ViewOnClickListenerC0882b(VideoFollowAction videoFollowAction, Context context) {
                    this.f93687b = videoFollowAction;
                    this.f93688c = context;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String strK;
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46351, new Class[]{View.class}, Void.TYPE).isSupported || (strK = this.f93687b.k()) == null) {
                        return;
                    }
                    com.sankuai.waimai.router.common.c cVarC = com.max.xiaoheihe.base.router.b.T(this.f93688c, strK).C(2);
                    f0.o(cVarC, "requestOtherHome(context…                        )");
                    com.max.xiaoheihe.base.router.b.z0(cVarC);
                }
            }

            b(VideoFollowAction videoFollowAction, Context context) {
                this.f93683b = videoFollowAction;
                this.f93684c = context;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46345, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f93683b.i().invoke();
                vd0 vd0Var = this.f93683b.f93673f;
                vd0 vd0Var2 = null;
                if (vd0Var == null) {
                    f0.S("binding");
                    vd0Var = null;
                }
                vd0Var.f116822c.setVisibility(8);
                vd0 vd0Var3 = this.f93683b.f93673f;
                if (vd0Var3 == null) {
                    f0.S("binding");
                    vd0Var3 = null;
                }
                vd0Var3.f116823d.setText(this.f93684c.getString(R.string.subscribed));
                this.f93683b.f93668a.setValue(Boolean.TRUE);
                Handler handler = this.f93683b.f93674g;
                if (handler == null) {
                    f0.S("eventHandler");
                    handler = null;
                }
                handler.postDelayed(new RunnableC0880a(this.f93683b), 1000L);
                vd0 vd0Var4 = this.f93683b.f93673f;
                if (vd0Var4 == null) {
                    f0.S("binding");
                } else {
                    vd0Var2 = vd0Var4;
                }
                vd0Var2.f116824e.setOnClickListener(new ViewOnClickListenerC0882b(this.f93683b, this.f93684c));
            }
        }

        a(VideoFollowAction videoFollowAction, Context context) {
            this.f93679b = videoFollowAction;
            this.f93680c = context;
        }

        @e
        public final Object a(boolean z10, @dl.d c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, this, changeQuickRedirect, false, 46342, new Class[]{Boolean.TYPE, c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            vd0 vd0Var = null;
            if (z10) {
                vd0 vd0Var2 = this.f93679b.f93673f;
                if (vd0Var2 == null) {
                    f0.S("binding");
                    vd0Var2 = null;
                }
                vd0Var2.f116822c.setVisibility(8);
                vd0 vd0Var3 = this.f93679b.f93673f;
                if (vd0Var3 == null) {
                    f0.S("binding");
                    vd0Var3 = null;
                }
                vd0Var3.f116823d.setVisibility(8);
                vd0 vd0Var4 = this.f93679b.f93673f;
                if (vd0Var4 == null) {
                    f0.S("binding");
                } else {
                    vd0Var = vd0Var4;
                }
                vd0Var.f116824e.setOnClickListener(new ViewOnClickListenerC0879a(this.f93679b, this.f93680c));
            } else {
                vd0 vd0Var5 = this.f93679b.f93673f;
                if (vd0Var5 == null) {
                    f0.S("binding");
                    vd0Var5 = null;
                }
                vd0Var5.f116822c.setVisibility(0);
                vd0 vd0Var6 = this.f93679b.f93673f;
                if (vd0Var6 == null) {
                    f0.S("binding");
                    vd0Var6 = null;
                }
                vd0Var6.f116823d.setText(this.f93680c.getString(R.string.subscribe));
                vd0 vd0Var7 = this.f93679b.f93673f;
                if (vd0Var7 == null) {
                    f0.S("binding");
                    vd0Var7 = null;
                }
                vd0Var7.f116823d.setVisibility(0);
                vd0 vd0Var8 = this.f93679b.f93673f;
                if (vd0Var8 == null) {
                    f0.S("binding");
                } else {
                    vd0Var = vd0Var8;
                }
                vd0Var.f116824e.setOnClickListener(new b(this.f93679b, this.f93680c));
            }
            return b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Boolean bool, c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool, cVar}, this, changeQuickRedirect, false, 46343, new Class[]{Object.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(bool.booleanValue(), cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoFollowAction$initExtView$1(VideoFollowAction videoFollowAction, Context context, c<? super VideoFollowAction$initExtView$1> cVar) {
        super(2, cVar);
        this.f93677c = videoFollowAction;
        this.f93678d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46339, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new VideoFollowAction$initExtView$1(this.f93677c, this.f93678d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46341, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46340, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((VideoFollowAction$initExtView$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46338, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = b.h();
        int i10 = this.f93676b;
        if (i10 == 0) {
            t0.n(obj);
            u<Boolean> uVarJ = this.f93677c.j();
            a aVar = new a(this.f93677c, this.f93678d);
            this.f93676b = 1;
            if (uVarJ.a(aVar, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        throw new KotlinNothingValueException();
    }
}
