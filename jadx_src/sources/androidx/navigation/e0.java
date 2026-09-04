package androidx.navigation;

import androidx.navigation.serialization.RouteSerializerKt;

/* JADX INFO: compiled from: NavGraph.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraphKt\n+ 2 NavGraph.kt\nandroidx/navigation/NavGraph\n*L\n1#1,677:1\n306#2:678\n306#2:679\n*S KotlinDebug\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraphKt\n*L\n621#1:678\n642#1:679\n*E\n"})
public final class e0 {
    public static final boolean a(@dl.d NavGraph navGraph, @androidx.annotation.d0 int i10) {
        kotlin.jvm.internal.f0.p(navGraph, "<this>");
        return navGraph.r0(i10) != null;
    }

    public static final <T> boolean b(@dl.d NavGraph navGraph, @dl.d T route) {
        kotlin.jvm.internal.f0.p(navGraph, "<this>");
        kotlin.jvm.internal.f0.p(route, "route");
        return navGraph.s0(route) != null;
    }

    public static final boolean c(@dl.d NavGraph navGraph, @dl.d String route) {
        kotlin.jvm.internal.f0.p(navGraph, "<this>");
        kotlin.jvm.internal.f0.p(route, "route");
        return navGraph.t0(route) != null;
    }

    public static final /* synthetic */ <T> boolean d(NavGraph navGraph, kotlin.reflect.d<T> route) {
        kotlin.jvm.internal.f0.p(navGraph, "<this>");
        kotlin.jvm.internal.f0.p(route, "route");
        kotlin.jvm.internal.f0.y(6, androidx.exifinterface.media.a.f23244d5);
        kotlin.jvm.internal.k0.n("kotlinx.serialization.serializer.simple");
        return navGraph.r0(RouteSerializerKt.h(kotlinx.serialization.t.i(null))) != null;
    }

    @dl.d
    public static final NavDestination e(@dl.d NavGraph navGraph, @androidx.annotation.d0 int i10) {
        kotlin.jvm.internal.f0.p(navGraph, "<this>");
        NavDestination navDestinationR0 = navGraph.r0(i10);
        if (navDestinationR0 != null) {
            return navDestinationR0;
        }
        throw new IllegalArgumentException("No destination for " + i10 + " was found in " + navGraph);
    }

    @dl.d
    public static final <T> NavDestination f(@dl.d NavGraph navGraph, @dl.d T route) {
        kotlin.jvm.internal.f0.p(navGraph, "<this>");
        kotlin.jvm.internal.f0.p(route, "route");
        NavDestination navDestinationS0 = navGraph.s0(route);
        if (navDestinationS0 != null) {
            return navDestinationS0;
        }
        throw new IllegalArgumentException("No destination for " + route + " was found in " + navGraph);
    }

    @dl.d
    public static final NavDestination g(@dl.d NavGraph navGraph, @dl.d String route) {
        kotlin.jvm.internal.f0.p(navGraph, "<this>");
        kotlin.jvm.internal.f0.p(route, "route");
        NavDestination navDestinationT0 = navGraph.t0(route);
        if (navDestinationT0 != null) {
            return navDestinationT0;
        }
        throw new IllegalArgumentException("No destination for " + route + " was found in " + navGraph);
    }

    public static final /* synthetic */ <T> NavDestination h(NavGraph navGraph, kotlin.reflect.d<T> route) {
        kotlin.jvm.internal.f0.p(navGraph, "<this>");
        kotlin.jvm.internal.f0.p(route, "route");
        kotlin.jvm.internal.f0.y(6, androidx.exifinterface.media.a.f23244d5);
        kotlin.jvm.internal.k0.n("kotlinx.serialization.serializer.simple");
        NavDestination navDestinationR0 = navGraph.r0(RouteSerializerKt.h(kotlinx.serialization.t.i(null)));
        if (navDestinationR0 != null) {
            return navDestinationR0;
        }
        throw new IllegalArgumentException("No destination for " + route + " was found in " + navGraph);
    }

    public static final void i(@dl.d NavGraph navGraph, @dl.d NavDestination node) {
        kotlin.jvm.internal.f0.p(navGraph, "<this>");
        kotlin.jvm.internal.f0.p(node, "node");
        navGraph.J0(node);
    }

    public static final void j(@dl.d NavGraph navGraph, @dl.d NavDestination node) {
        kotlin.jvm.internal.f0.p(navGraph, "<this>");
        kotlin.jvm.internal.f0.p(node, "node");
        navGraph.k0(node);
    }

    public static final void k(@dl.d NavGraph navGraph, @dl.d NavGraph other) {
        kotlin.jvm.internal.f0.p(navGraph, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        navGraph.i0(other);
    }
}
