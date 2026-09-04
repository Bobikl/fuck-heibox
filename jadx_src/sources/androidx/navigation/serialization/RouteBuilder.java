package androidx.navigation.serialization;

import androidx.navigation.m0;
import com.tencent.qcloud.core.util.IOUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: RouteBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nRouteBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteBuilder.kt\nandroidx/navigation/serialization/RouteBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n1855#2,2:112\n*S KotlinDebug\n*F\n+ 1 RouteBuilder.kt\nandroidx/navigation/serialization/RouteBuilder\n*L\n88#1:112,2\n*E\n"})
public final class RouteBuilder<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.g<T> f25240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final String f25241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private String f25242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private String f25243d;

    /* JADX INFO: compiled from: RouteBuilder.kt */
    public enum ParamType {
        PATH,
        QUERY
    }

    /* JADX INFO: compiled from: RouteBuilder.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25244a;

        static {
            int[] iArr = new int[ParamType.values().length];
            try {
                iArr[ParamType.PATH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ParamType.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25244a = iArr;
        }
    }

    public RouteBuilder(@dl.d String path, @dl.d kotlinx.serialization.g<T> serializer) {
        f0.p(path, "path");
        f0.p(serializer, "serializer");
        this.f25242c = "";
        this.f25243d = "";
        this.f25240a = serializer;
        this.f25241b = path;
    }

    public RouteBuilder(@dl.d kotlinx.serialization.g<T> serializer) {
        f0.p(serializer, "serializer");
        this.f25242c = "";
        this.f25243d = "";
        this.f25240a = serializer;
        this.f25241b = serializer.a().j();
    }

    private final void a(String str) {
        this.f25242c += IOUtils.DIR_SEPARATOR_UNIX + str;
    }

    private final void b(String str, String str2) {
        this.f25243d += (this.f25243d.length() == 0 ? "?" : "&") + str + n5.a.f132013h + str2;
    }

    private final ParamType f(int i10, m0<Object> m0Var) {
        return ((m0Var instanceof androidx.navigation.g) || this.f25240a.a().k(i10)) ? ParamType.QUERY : ParamType.PATH;
    }

    public final void c(int i10, @dl.d String name, @dl.d m0<Object> type, @dl.d List<String> value) {
        f0.p(name, "name");
        f0.p(type, "type");
        f0.p(value, "value");
        int i11 = a.f25244a[f(i10, type).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                b(name, (String) it.next());
            }
            return;
        }
        if (value.size() == 1) {
            a((String) CollectionsKt___CollectionsKt.w2(value));
            return;
        }
        throw new IllegalArgumentException(("Expected one value for argument " + name + ", found " + value.size() + "values instead.").toString());
    }

    public final void d(int i10, @dl.d String name, @dl.d m0<Object> type) {
        f0.p(name, "name");
        f0.p(type, "type");
        int i11 = a.f25244a[f(i10, type).ordinal()];
        if (i11 == 1) {
            a('{' + name + '}');
            return;
        }
        if (i11 != 2) {
            return;
        }
        b(name, '{' + name + '}');
    }

    @dl.d
    public final String e() {
        return this.f25241b + this.f25242c + this.f25243d;
    }
}
