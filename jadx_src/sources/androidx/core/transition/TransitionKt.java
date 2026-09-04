package androidx.core.transition;

import android.annotation.SuppressLint;
import android.transition.Transition;
import androidx.annotation.w0;
import dl.d;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import yh.l;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt\n*L\n1#1,86:1\n69#1,16:87\n69#1,16:103\n69#1,16:119\n69#1,16:135\n69#1,16:151\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt\n*L\n31#1:87,16\n39#1:103,16\n47#1:119,16\n55#1:135,16\n63#1:151,16\n*E\n"})
@SuppressLint({"ClassVerificationFailure"})
public final class TransitionKt {

    /* JADX INFO: compiled from: Transition.kt */
    @t0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n*L\n1#1,86:1\n*E\n"})
    public static final class a implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l<Transition, b2> f21207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Transition, b2> f21208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<Transition, b2> f21209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<Transition, b2> f21210d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l<Transition, b2> f21211e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Transition, b2> lVar, l<? super Transition, b2> lVar2, l<? super Transition, b2> lVar3, l<? super Transition, b2> lVar4, l<? super Transition, b2> lVar5) {
            this.f21207a = lVar;
            this.f21208b = lVar2;
            this.f21209c = lVar3;
            this.f21210d = lVar4;
            this.f21211e = lVar5;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@dl.d Transition transition) {
            f0.p(transition, "transition");
            this.f21210d.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@dl.d Transition transition) {
            f0.p(transition, "transition");
            this.f21207a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@dl.d Transition transition) {
            f0.p(transition, "transition");
            this.f21209c.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@dl.d Transition transition) {
            f0.p(transition, "transition");
            this.f21208b.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@dl.d Transition transition) {
            f0.p(transition, "transition");
            this.f21211e.invoke(transition);
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @t0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$1\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$4\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$5\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$2\n*L\n1#1,86:1\n70#2:87\n73#3:88\n74#4:89\n71#5:90\n*E\n"})
    public static final class b implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f21217a;

        public b(l lVar) {
            this.f21217a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@dl.d Transition transition) {
            f0.p(transition, "transition");
            this.f21217a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@dl.d Transition transition) {
            f0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@dl.d Transition transition) {
            f0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@dl.d Transition transition) {
            f0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@dl.d Transition transition) {
            f0.p(transition, "transition");
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @t0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$4\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$5\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$3\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$2\n*L\n1#1,86:1\n73#2:87\n74#3:88\n72#4:89\n71#5:90\n*E\n"})
    public static final class c implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f21218a;

        public c(l lVar) {
            this.f21218a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@dl.d Transition transition) {
            f0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@dl.d Transition transition) {
            f0.p(transition, "transition");
            this.f21218a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@dl.d Transition transition) {
            f0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@dl.d Transition transition) {
            f0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@dl.d Transition transition) {
            f0.p(transition, "transition");
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @t0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$1\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$4\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$3\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$2\n*L\n1#1,86:1\n70#2:87\n73#3:88\n72#4:89\n71#5:90\n*E\n"})
    public static final class d implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f21219a;

        public d(l lVar) {
            this.f21219a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@dl.d Transition transition) {
            f0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@dl.d Transition transition) {
            f0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@dl.d Transition transition) {
            f0.p(transition, "transition");
            this.f21219a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@dl.d Transition transition) {
            f0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@dl.d Transition transition) {
            f0.p(transition, "transition");
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @t0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$1\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$5\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$3\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$2\n*L\n1#1,86:1\n70#2:87\n74#3:88\n72#4:89\n71#5:90\n*E\n"})
    public static final class e implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f21220a;

        public e(l lVar) {
            this.f21220a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@dl.d Transition transition) {
            f0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@dl.d Transition transition) {
            f0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@dl.d Transition transition) {
            f0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@dl.d Transition transition) {
            f0.p(transition, "transition");
            this.f21220a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@dl.d Transition transition) {
            f0.p(transition, "transition");
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @t0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$1\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$4\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$5\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$3\n*L\n1#1,86:1\n70#2:87\n73#3:88\n74#4:89\n72#5:90\n*E\n"})
    public static final class f implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f21221a;

        public f(l lVar) {
            this.f21221a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@dl.d Transition transition) {
            f0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@dl.d Transition transition) {
            f0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@dl.d Transition transition) {
            f0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@dl.d Transition transition) {
            f0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@dl.d Transition transition) {
            f0.p(transition, "transition");
            this.f21221a.invoke(transition);
        }
    }

    @dl.d
    @w0(19)
    public static final Transition.TransitionListener a(@dl.d Transition transition, @dl.d l<? super Transition, b2> onEnd, @dl.d l<? super Transition, b2> onStart, @dl.d l<? super Transition, b2> onCancel, @dl.d l<? super Transition, b2> onResume, @dl.d l<? super Transition, b2> onPause) {
        f0.p(transition, "<this>");
        f0.p(onEnd, "onEnd");
        f0.p(onStart, "onStart");
        f0.p(onCancel, "onCancel");
        f0.p(onResume, "onResume");
        f0.p(onPause, "onPause");
        a aVar = new a(onEnd, onResume, onPause, onCancel, onStart);
        transition.addListener(aVar);
        return aVar;
    }

    public static /* synthetic */ Transition.TransitionListener b(Transition transition, l onEnd, l lVar, l lVar2, l onResume, l onPause, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            onEnd = new l<Transition, b2>() { // from class: androidx.core.transition.TransitionKt$addListener$1
                public final void a(@d Transition it) {
                    f0.p(it, "it");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Transition transition2) {
                    a(transition2);
                    return b2.f124493a;
                }
            };
        }
        if ((i10 & 2) != 0) {
            lVar = new l<Transition, b2>() { // from class: androidx.core.transition.TransitionKt$addListener$2
                public final void a(@d Transition it) {
                    f0.p(it, "it");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Transition transition2) {
                    a(transition2);
                    return b2.f124493a;
                }
            };
        }
        l onStart = lVar;
        if ((i10 & 4) != 0) {
            lVar2 = new l<Transition, b2>() { // from class: androidx.core.transition.TransitionKt$addListener$3
                public final void a(@d Transition it) {
                    f0.p(it, "it");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Transition transition2) {
                    a(transition2);
                    return b2.f124493a;
                }
            };
        }
        l onCancel = lVar2;
        if ((i10 & 8) != 0) {
            onResume = new l<Transition, b2>() { // from class: androidx.core.transition.TransitionKt$addListener$4
                public final void a(@d Transition it) {
                    f0.p(it, "it");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Transition transition2) {
                    a(transition2);
                    return b2.f124493a;
                }
            };
        }
        if ((i10 & 16) != 0) {
            onPause = new l<Transition, b2>() { // from class: androidx.core.transition.TransitionKt$addListener$5
                public final void a(@d Transition it) {
                    f0.p(it, "it");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Transition transition2) {
                    a(transition2);
                    return b2.f124493a;
                }
            };
        }
        f0.p(transition, "<this>");
        f0.p(onEnd, "onEnd");
        f0.p(onStart, "onStart");
        f0.p(onCancel, "onCancel");
        f0.p(onResume, "onResume");
        f0.p(onPause, "onPause");
        a aVar = new a(onEnd, onResume, onPause, onCancel, onStart);
        transition.addListener(aVar);
        return aVar;
    }

    @dl.d
    @w0(19)
    public static final Transition.TransitionListener c(@dl.d Transition transition, @dl.d l<? super Transition, b2> action) {
        f0.p(transition, "<this>");
        f0.p(action, "action");
        b bVar = new b(action);
        transition.addListener(bVar);
        return bVar;
    }

    @dl.d
    @w0(19)
    public static final Transition.TransitionListener d(@dl.d Transition transition, @dl.d l<? super Transition, b2> action) {
        f0.p(transition, "<this>");
        f0.p(action, "action");
        c cVar = new c(action);
        transition.addListener(cVar);
        return cVar;
    }

    @dl.d
    @w0(19)
    public static final Transition.TransitionListener e(@dl.d Transition transition, @dl.d l<? super Transition, b2> action) {
        f0.p(transition, "<this>");
        f0.p(action, "action");
        d dVar = new d(action);
        transition.addListener(dVar);
        return dVar;
    }

    @dl.d
    @w0(19)
    public static final Transition.TransitionListener f(@dl.d Transition transition, @dl.d l<? super Transition, b2> action) {
        f0.p(transition, "<this>");
        f0.p(action, "action");
        e eVar = new e(action);
        transition.addListener(eVar);
        return eVar;
    }

    @dl.d
    @w0(19)
    public static final Transition.TransitionListener g(@dl.d Transition transition, @dl.d l<? super Transition, b2> action) {
        f0.p(transition, "<this>");
        f0.p(action, "action");
        f fVar = new f(action);
        transition.addListener(fVar);
        return fVar;
    }
}
