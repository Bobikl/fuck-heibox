package androidx.core.animation;

import android.animation.Animator;
import androidx.annotation.w0;
import dl.d;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import yh.l;

/* JADX INFO: compiled from: Animator.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,136:1\n95#1,14:137\n95#1,14:151\n95#1,14:165\n95#1,14:179\n*S KotlinDebug\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n32#1:137,14\n43#1:151,14\n54#1:165,14\n64#1:179,14\n*E\n"})
public final class AnimatorKt {

    /* JADX INFO: compiled from: Animator.kt */
    @t0({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n*L\n1#1,136:1\n*E\n"})
    public static final class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Animator, b2> f19832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<Animator, b2> f19833c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<Animator, b2> f19834d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l<Animator, b2> f19835e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Animator, b2> lVar, l<? super Animator, b2> lVar2, l<? super Animator, b2> lVar3, l<? super Animator, b2> lVar4) {
            this.f19832b = lVar;
            this.f19833c = lVar2;
            this.f19834d = lVar3;
            this.f19835e = lVar4;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@dl.d Animator animator) {
            f0.p(animator, "animator");
            this.f19834d.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animator) {
            f0.p(animator, "animator");
            this.f19833c.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@dl.d Animator animator) {
            f0.p(animator, "animator");
            this.f19832b.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animator) {
            f0.p(animator, "animator");
            this.f19835e.invoke(animator);
        }
    }

    /* JADX INFO: compiled from: Animator.kt */
    public static final class b implements Animator.AnimatorPauseListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Animator, b2> f19842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<Animator, b2> f19843c;

        /* JADX WARN: Multi-variable type inference failed */
        b(l<? super Animator, b2> lVar, l<? super Animator, b2> lVar2) {
            this.f19842b = lVar;
            this.f19843c = lVar2;
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(@dl.d Animator animator) {
            f0.p(animator, "animator");
            this.f19842b.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(@dl.d Animator animator) {
            f0.p(animator, "animator");
            this.f19843c.invoke(animator);
        }
    }

    /* JADX INFO: compiled from: Animator.kt */
    @t0({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,136:1\n99#2:137\n96#3:138\n97#4:139\n*E\n"})
    public static final class c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f19844b;

        public c(l lVar) {
            this.f19844b = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@dl.d Animator animator) {
            f0.p(animator, "animator");
            this.f19844b.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animator) {
            f0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@dl.d Animator animator) {
            f0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animator) {
            f0.p(animator, "animator");
        }
    }

    /* JADX INFO: compiled from: Animator.kt */
    @t0({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,136:1\n99#2:137\n98#3:138\n97#4:139\n*E\n"})
    public static final class d implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f19845b;

        public d(l lVar) {
            this.f19845b = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@dl.d Animator animator) {
            f0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animator) {
            f0.p(animator, "animator");
            this.f19845b.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@dl.d Animator animator) {
            f0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animator) {
            f0.p(animator, "animator");
        }
    }

    /* JADX INFO: compiled from: Animator.kt */
    @t0({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,136:1\n96#2:137\n98#3:138\n97#4:139\n*E\n"})
    public static final class e implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f19846b;

        public e(l lVar) {
            this.f19846b = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@dl.d Animator animator) {
            f0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animator) {
            f0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@dl.d Animator animator) {
            f0.p(animator, "animator");
            this.f19846b.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animator) {
            f0.p(animator, "animator");
        }
    }

    /* JADX INFO: compiled from: Animator.kt */
    @t0({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n*L\n1#1,136:1\n99#2:137\n96#3:138\n98#4:139\n*E\n"})
    public static final class f implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f19847b;

        public f(l lVar) {
            this.f19847b = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@dl.d Animator animator) {
            f0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animator) {
            f0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@dl.d Animator animator) {
            f0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animator) {
            f0.p(animator, "animator");
            this.f19847b.invoke(animator);
        }
    }

    @dl.d
    public static final Animator.AnimatorListener a(@dl.d Animator animator, @dl.d l<? super Animator, b2> onEnd, @dl.d l<? super Animator, b2> onStart, @dl.d l<? super Animator, b2> onCancel, @dl.d l<? super Animator, b2> onRepeat) {
        f0.p(animator, "<this>");
        f0.p(onEnd, "onEnd");
        f0.p(onStart, "onStart");
        f0.p(onCancel, "onCancel");
        f0.p(onRepeat, "onRepeat");
        a aVar = new a(onRepeat, onEnd, onCancel, onStart);
        animator.addListener(aVar);
        return aVar;
    }

    public static /* synthetic */ Animator.AnimatorListener b(Animator animator, l onEnd, l onStart, l onCancel, l onRepeat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            onEnd = new l<Animator, b2>() { // from class: androidx.core.animation.AnimatorKt$addListener$1
                public final void a(@d Animator it) {
                    f0.p(it, "it");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Animator animator2) {
                    a(animator2);
                    return b2.f124493a;
                }
            };
        }
        if ((i10 & 2) != 0) {
            onStart = new l<Animator, b2>() { // from class: androidx.core.animation.AnimatorKt$addListener$2
                public final void a(@d Animator it) {
                    f0.p(it, "it");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Animator animator2) {
                    a(animator2);
                    return b2.f124493a;
                }
            };
        }
        if ((i10 & 4) != 0) {
            onCancel = new l<Animator, b2>() { // from class: androidx.core.animation.AnimatorKt$addListener$3
                public final void a(@d Animator it) {
                    f0.p(it, "it");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Animator animator2) {
                    a(animator2);
                    return b2.f124493a;
                }
            };
        }
        if ((i10 & 8) != 0) {
            onRepeat = new l<Animator, b2>() { // from class: androidx.core.animation.AnimatorKt$addListener$4
                public final void a(@d Animator it) {
                    f0.p(it, "it");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Animator animator2) {
                    a(animator2);
                    return b2.f124493a;
                }
            };
        }
        f0.p(animator, "<this>");
        f0.p(onEnd, "onEnd");
        f0.p(onStart, "onStart");
        f0.p(onCancel, "onCancel");
        f0.p(onRepeat, "onRepeat");
        a aVar = new a(onRepeat, onEnd, onCancel, onStart);
        animator.addListener(aVar);
        return aVar;
    }

    @dl.d
    @w0(19)
    public static final Animator.AnimatorPauseListener c(@dl.d Animator animator, @dl.d l<? super Animator, b2> onResume, @dl.d l<? super Animator, b2> onPause) {
        f0.p(animator, "<this>");
        f0.p(onResume, "onResume");
        f0.p(onPause, "onPause");
        b bVar = new b(onPause, onResume);
        androidx.core.animation.a.a(animator, bVar);
        return bVar;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener d(Animator animator, l lVar, l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = new l<Animator, b2>() { // from class: androidx.core.animation.AnimatorKt$addPauseListener$1
                public final void a(@d Animator it) {
                    f0.p(it, "it");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Animator animator2) {
                    a(animator2);
                    return b2.f124493a;
                }
            };
        }
        if ((i10 & 2) != 0) {
            lVar2 = new l<Animator, b2>() { // from class: androidx.core.animation.AnimatorKt$addPauseListener$2
                public final void a(@d Animator it) {
                    f0.p(it, "it");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Animator animator2) {
                    a(animator2);
                    return b2.f124493a;
                }
            };
        }
        return c(animator, lVar, lVar2);
    }

    @dl.d
    public static final Animator.AnimatorListener e(@dl.d Animator animator, @dl.d l<? super Animator, b2> action) {
        f0.p(animator, "<this>");
        f0.p(action, "action");
        c cVar = new c(action);
        animator.addListener(cVar);
        return cVar;
    }

    @dl.d
    public static final Animator.AnimatorListener f(@dl.d Animator animator, @dl.d l<? super Animator, b2> action) {
        f0.p(animator, "<this>");
        f0.p(action, "action");
        d dVar = new d(action);
        animator.addListener(dVar);
        return dVar;
    }

    @dl.d
    @w0(19)
    public static final Animator.AnimatorPauseListener g(@dl.d Animator animator, @dl.d l<? super Animator, b2> action) {
        f0.p(animator, "<this>");
        f0.p(action, "action");
        return d(animator, null, action, 1, null);
    }

    @dl.d
    public static final Animator.AnimatorListener h(@dl.d Animator animator, @dl.d l<? super Animator, b2> action) {
        f0.p(animator, "<this>");
        f0.p(action, "action");
        e eVar = new e(action);
        animator.addListener(eVar);
        return eVar;
    }

    @dl.d
    @w0(19)
    public static final Animator.AnimatorPauseListener i(@dl.d Animator animator, @dl.d l<? super Animator, b2> action) {
        f0.p(animator, "<this>");
        f0.p(action, "action");
        return d(animator, action, null, 2, null);
    }

    @dl.d
    public static final Animator.AnimatorListener j(@dl.d Animator animator, @dl.d l<? super Animator, b2> action) {
        f0.p(animator, "<this>");
        f0.p(action, "action");
        f fVar = new f(action);
        animator.addListener(fVar);
        return fVar;
    }
}
