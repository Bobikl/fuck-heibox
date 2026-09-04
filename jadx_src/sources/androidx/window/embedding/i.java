package androidx.window.embedding;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitInfo;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: EmbeddingAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.window.core.d
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J,\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0082\u0002¢\u0006\u0004\b\t\u0010\nJ,\u0010\u000b\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0082\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fJ(\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\b0\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007J(\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00150\b0\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0007J\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000fH\u0007J\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000fH\u0007J\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000f¨\u0006%"}, d2 = {"Landroidx/window/embedding/i;", "", "Landroidx/window/extensions/embedding/SplitInfo;", "splitInfo", "Landroidx/window/embedding/t;", RXScreenCaptureService.KEY_HEIGHT, "F", androidx.exifinterface.media.a.R4, "Landroid/util/Pair;", "f", "(Landroid/util/Pair;)Ljava/lang/Object;", "g", "", "splitInfoList", "i", "", "Landroidx/window/embedding/u;", "splitPairFilters", "Ljava/util/function/Predicate;", "Landroid/app/Activity;", "m", "Landroid/content/Intent;", "k", "Landroidx/window/embedding/x;", "splitRule", "Landroid/view/WindowMetrics;", ak.aB, "Landroidx/window/embedding/a;", "activityFilters", "o", "q", "Landroidx/window/embedding/m;", "rules", "Landroidx/window/extensions/embedding/EmbeddingRule;", "j", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class i {
    private final <F, S> F f(Pair<F, S> pair) {
        f0.p(pair, "<this>");
        return (F) pair.first;
    }

    private final <F, S> S g(Pair<F, S> pair) {
        f0.p(pair, "<this>");
        return (S) pair.second;
    }

    private final t h(SplitInfo splitInfo) {
        boolean zIsEmpty;
        ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        f0.o(primaryActivityStack, "splitInfo.primaryActivityStack");
        boolean zIsEmpty2 = false;
        try {
            zIsEmpty = primaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused) {
            zIsEmpty = false;
        }
        List activities = primaryActivityStack.getActivities();
        f0.o(activities, "primaryActivityStack.activities");
        c cVar = new c(activities, zIsEmpty);
        ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        f0.o(secondaryActivityStack, "splitInfo.secondaryActivityStack");
        try {
            zIsEmpty2 = secondaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused2) {
        }
        List activities2 = secondaryActivityStack.getActivities();
        f0.o(activities2, "secondaryActivityStack.activities");
        return new t(cVar, new c(activities2, zIsEmpty2), splitInfo.getSplitRatio());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(i this$0, Set splitPairFilters, Pair pair) {
        f0.p(this$0, "this$0");
        f0.p(splitPairFilters, "$splitPairFilters");
        f0.o(pair, "(first, second)");
        Activity activity = (Activity) this$0.f(pair);
        Intent intent = (Intent) this$0.g(pair);
        if ((splitPairFilters instanceof Collection) && splitPairFilters.isEmpty()) {
            return false;
        }
        Iterator it = splitPairFilters.iterator();
        while (it.hasNext()) {
            if (((u) it.next()).d(activity, intent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(i this$0, Set splitPairFilters, Pair pair) {
        f0.p(this$0, "this$0");
        f0.p(splitPairFilters, "$splitPairFilters");
        f0.o(pair, "(first, second)");
        Activity activity = (Activity) this$0.f(pair);
        Activity activity2 = (Activity) this$0.g(pair);
        if ((splitPairFilters instanceof Collection) && splitPairFilters.isEmpty()) {
            return false;
        }
        Iterator it = splitPairFilters.iterator();
        while (it.hasNext()) {
            if (((u) it.next()).e(activity, activity2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(Set activityFilters, Activity activity) {
        f0.p(activityFilters, "$activityFilters");
        if ((activityFilters instanceof Collection) && activityFilters.isEmpty()) {
            return false;
        }
        Iterator it = activityFilters.iterator();
        while (it.hasNext()) {
            ActivityFilter activityFilter = (ActivityFilter) it.next();
            f0.o(activity, "activity");
            if (activityFilter.c(activity)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(Set activityFilters, Intent intent) {
        f0.p(activityFilters, "$activityFilters");
        if ((activityFilters instanceof Collection) && activityFilters.isEmpty()) {
            return false;
        }
        Iterator it = activityFilters.iterator();
        while (it.hasNext()) {
            ActivityFilter activityFilter = (ActivityFilter) it.next();
            f0.o(intent, "intent");
            if (activityFilter.d(intent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(x splitRule, WindowMetrics windowMetrics) {
        f0.p(splitRule, "$splitRule");
        f0.o(windowMetrics, "windowMetrics");
        return splitRule.a(windowMetrics);
    }

    @dl.d
    public final List<t> i(@dl.d List<? extends SplitInfo> splitInfoList) {
        f0.p(splitInfoList, "splitInfoList");
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(splitInfoList, 10));
        Iterator<T> it = splitInfoList.iterator();
        while (it.hasNext()) {
            arrayList.add(h((SplitInfo) it.next()));
        }
        return arrayList;
    }

    @dl.d
    public final Set<EmbeddingRule> j(@dl.d Set<? extends m> rules) {
        SplitPairRule splitPairRuleBuild;
        f0.p(rules, "rules");
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(rules, 10));
        for (m mVar : rules) {
            if (mVar instanceof v) {
                v vVar = (v) mVar;
                splitPairRuleBuild = new SplitPairRule.Builder(m(vVar.g()), k(vVar.g()), s((x) mVar)).setSplitRatio(vVar.getSplitRatio()).setLayoutDirection(vVar.getLayoutDirection()).setShouldFinishPrimaryWithSecondary(vVar.getFinishPrimaryWithSecondary()).setShouldFinishSecondaryWithPrimary(vVar.getFinishSecondaryWithPrimary()).setShouldClearTop(vVar.getClearTop()).build();
                f0.o(splitPairRuleBuild, "SplitPairRuleBuilder(\n  …                 .build()");
            } else if (mVar instanceof w) {
                w wVar = (w) mVar;
                splitPairRuleBuild = new SplitPlaceholderRule.Builder(wVar.getPlaceholderIntent(), o(wVar.f()), q(wVar.f()), s((x) mVar)).setSplitRatio(wVar.getSplitRatio()).setLayoutDirection(wVar.getLayoutDirection()).build();
                f0.o(splitPairRuleBuild, "SplitPlaceholderRuleBuil…                 .build()");
            } else {
                if (!(mVar instanceof b)) {
                    throw new IllegalArgumentException("Unsupported rule type");
                }
                b bVar = (b) mVar;
                splitPairRuleBuild = new ActivityRule.Builder(o(bVar.b()), q(bVar.b())).setShouldAlwaysExpand(bVar.getAlwaysExpand()).build();
                f0.o(splitPairRuleBuild, "ActivityRuleBuilder(\n   …                 .build()");
            }
            arrayList.add((EmbeddingRule) splitPairRuleBuild);
        }
        return CollectionsKt___CollectionsKt.V5(arrayList);
    }

    @dl.d
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Pair<Activity, Intent>> k(@dl.d final Set<u> splitPairFilters) {
        f0.p(splitPairFilters, "splitPairFilters");
        return new Predicate() { // from class: androidx.window.embedding.d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return i.l(this.f28509a, splitPairFilters, (Pair) obj);
            }
        };
    }

    @dl.d
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Pair<Activity, Activity>> m(@dl.d final Set<u> splitPairFilters) {
        f0.p(splitPairFilters, "splitPairFilters");
        return new Predicate() { // from class: androidx.window.embedding.h
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return i.n(this.f28514a, splitPairFilters, (Pair) obj);
            }
        };
    }

    @dl.d
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Activity> o(@dl.d final Set<ActivityFilter> activityFilters) {
        f0.p(activityFilters, "activityFilters");
        return new Predicate() { // from class: androidx.window.embedding.e
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return i.p(activityFilters, (Activity) obj);
            }
        };
    }

    @dl.d
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Intent> q(@dl.d final Set<ActivityFilter> activityFilters) {
        f0.p(activityFilters, "activityFilters");
        return new Predicate() { // from class: androidx.window.embedding.g
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return i.r(activityFilters, (Intent) obj);
            }
        };
    }

    @dl.d
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<WindowMetrics> s(@dl.d final x splitRule) {
        f0.p(splitRule, "splitRule");
        return new Predicate() { // from class: androidx.window.embedding.f
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return i.t(splitRule, (WindowMetrics) obj);
            }
        };
    }
}
