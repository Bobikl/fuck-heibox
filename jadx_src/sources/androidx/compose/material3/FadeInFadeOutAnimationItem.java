package androidx.compose.material3;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.material3.a0, reason: from toString */
/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BF\u0012\u0006\u0010\u000f\u001a\u00028\u0000\u00125\u0010\u0010\u001a1\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\f¢\u0006\u0002\b\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0003\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J?\u0010\r\u001a1\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\f¢\u0006\u0002\b\bHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJY\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u000f\u001a\u00028\u000027\b\u0002\u0010\u0010\u001a1\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\f¢\u0006\u0002\b\bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u000f\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004RF\u0010\u0010\u001a1\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\f¢\u0006\u0002\b\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e¨\u0006 "}, d2 = {"Landroidx/compose/material3/a0;", androidx.exifinterface.media.a.f23244d5, "", ak.av, "()Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "Lkotlin/m0;", "name", "content", "Landroidx/compose/material3/FadeInFadeOutTransition;", "b", "()Lyh/q;", "key", "transition", ak.aF, "(Ljava/lang/Object;Lyh/q;)Landroidx/compose/material3/a0;", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Object;", "e", "Lyh/q;", "f", "<init>", "(Ljava/lang/Object;Lyh/q;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class FadeInFadeOutAnimationItem<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final T key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @dl.d
    private final yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2> transition;

    /* JADX WARN: Multi-variable type inference failed */
    public FadeInFadeOutAnimationItem(T t10, @dl.d yh.q<? super yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> transition) {
        kotlin.jvm.internal.f0.p(transition, "transition");
        this.key = t10;
        this.transition = transition;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FadeInFadeOutAnimationItem d(FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem, Object obj, yh.q qVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = fadeInFadeOutAnimationItem.key;
        }
        if ((i10 & 2) != 0) {
            qVar = fadeInFadeOutAnimationItem.transition;
        }
        return fadeInFadeOutAnimationItem.c(obj, qVar);
    }

    public final T a() {
        return this.key;
    }

    @dl.d
    public final yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2> b() {
        return this.transition;
    }

    @dl.d
    public final FadeInFadeOutAnimationItem<T> c(T key, @dl.d yh.q<? super yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> transition) {
        kotlin.jvm.internal.f0.p(transition, "transition");
        return new FadeInFadeOutAnimationItem<>(key, transition);
    }

    public final T e() {
        return this.key;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) other;
        return kotlin.jvm.internal.f0.g(this.key, fadeInFadeOutAnimationItem.key) && kotlin.jvm.internal.f0.g(this.transition, fadeInFadeOutAnimationItem.transition);
    }

    @dl.d
    public final yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2> f() {
        return this.transition;
    }

    public int hashCode() {
        T t10 = this.key;
        return ((t10 == null ? 0 : t10.hashCode()) * 31) + this.transition.hashCode();
    }

    @dl.d
    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.key + ", transition=" + this.transition + ')';
    }
}
