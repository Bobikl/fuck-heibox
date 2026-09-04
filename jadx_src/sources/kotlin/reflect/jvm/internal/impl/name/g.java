package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.f0;
import kotlin.text.Regex;
import xh.m;

/* JADX INFO: compiled from: NameUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final g f127207a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final Regex f127208b = new Regex("[^\\p{L}\\p{Digit}]");

    private g() {
    }

    @dl.d
    @m
    public static final String a(@dl.d String name) {
        f0.p(name, "name");
        return f127208b.m(name, lg.a.f131412e);
    }
}
