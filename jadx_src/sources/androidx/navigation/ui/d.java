package androidx.navigation.ui;

import android.view.Menu;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: AppBarConfiguration.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nAppBarConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfiguration\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,306:1\n1247#2,2:307\n*S KotlinDebug\n*F\n+ 1 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfiguration\n*L\n103#1:307,2\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Set<Integer> f25297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final androidx.customview.widget.c f25298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final b f25299c;

    /* JADX INFO: compiled from: AppBarConfiguration.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final Set<Integer> f25300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private androidx.customview.widget.c f25301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        private b f25302c;

        public a(@dl.d Menu topLevelMenu) {
            f0.p(topLevelMenu, "topLevelMenu");
            this.f25300a = new HashSet();
            int size = topLevelMenu.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f25300a.add(Integer.valueOf(topLevelMenu.getItem(i10).getItemId()));
            }
        }

        public a(@dl.d NavGraph navGraph) {
            f0.p(navGraph, "navGraph");
            HashSet hashSet = new HashSet();
            this.f25300a = hashSet;
            hashSet.add(Integer.valueOf(NavGraph.f24890r.b(navGraph).A()));
        }

        public a(@dl.d Set<Integer> topLevelDestinationIds) {
            f0.p(topLevelDestinationIds, "topLevelDestinationIds");
            HashSet hashSet = new HashSet();
            this.f25300a = hashSet;
            hashSet.addAll(topLevelDestinationIds);
        }

        public a(@dl.d int... topLevelDestinationIds) {
            f0.p(topLevelDestinationIds, "topLevelDestinationIds");
            this.f25300a = new HashSet();
            for (int i10 : topLevelDestinationIds) {
                this.f25300a.add(Integer.valueOf(i10));
            }
        }

        @dl.d
        public final d a() {
            return new d(this.f25300a, this.f25301b, this.f25302c, null);
        }

        @dl.d
        @kotlin.k(message = "Use {@link #setOpenableLayout(Openable)}.")
        public final a b(@dl.e DrawerLayout drawerLayout) {
            this.f25301b = drawerLayout;
            return this;
        }

        @dl.d
        public final a c(@dl.e b bVar) {
            this.f25302c = bVar;
            return this;
        }

        @dl.d
        public final a d(@dl.e androidx.customview.widget.c cVar) {
            this.f25301b = cVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: AppBarConfiguration.kt */
    public interface b {
        boolean a();
    }

    private d(Set<Integer> set, androidx.customview.widget.c cVar, b bVar) {
        this.f25297a = set;
        this.f25298b = cVar;
        this.f25299c = bVar;
    }

    public /* synthetic */ d(Set set, androidx.customview.widget.c cVar, b bVar, kotlin.jvm.internal.u uVar) {
        this(set, cVar, bVar);
    }

    @kotlin.k(message = "Use {@link #getOpenableLayout()}.")
    @dl.e
    public final DrawerLayout a() {
        androidx.customview.widget.c cVar = this.f25298b;
        if (cVar instanceof DrawerLayout) {
            return (DrawerLayout) cVar;
        }
        return null;
    }

    @dl.e
    public final b b() {
        return this.f25299c;
    }

    @dl.e
    public final androidx.customview.widget.c c() {
        return this.f25298b;
    }

    @dl.d
    public final Set<Integer> d() {
        return this.f25297a;
    }

    public final boolean e(@dl.d NavDestination destination) {
        boolean z10;
        f0.p(destination, "destination");
        Iterator<NavDestination> it = NavDestination.f24858l.c(destination).iterator();
        do {
            z10 = false;
            if (!it.hasNext()) {
                return false;
            }
            NavDestination next = it.next();
            if (this.f25297a.contains(Integer.valueOf(next.A())) && (!(next instanceof NavGraph) || destination.A() == NavGraph.f24890r.b((NavGraph) next).A())) {
                z10 = true;
            }
        } while (!z10);
        return true;
    }
}
