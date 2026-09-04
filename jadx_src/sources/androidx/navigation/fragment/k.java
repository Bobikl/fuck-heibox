package androidx.navigation.fragment;

import android.view.View;
import kotlin.Pair;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: FragmentNavigatorExtras.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nFragmentNavigatorExtras.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigatorExtras.kt\nandroidx/navigation/fragment/FragmentNavigatorExtrasKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,34:1\n1#2:35\n13309#3,2:36\n*S KotlinDebug\n*F\n+ 1 FragmentNavigatorExtras.kt\nandroidx/navigation/fragment/FragmentNavigatorExtrasKt\n*L\n32#1:36,2\n*E\n"})
public final class k {
    @dl.d
    public static final FragmentNavigator.d a(@dl.d Pair<? extends View, String>... sharedElements) {
        f0.p(sharedElements, "sharedElements");
        FragmentNavigator.d.a aVar = new FragmentNavigator.d.a();
        for (Pair<? extends View, String> pair : sharedElements) {
            aVar.a(pair.a(), pair.b());
        }
        return aVar.c();
    }
}
