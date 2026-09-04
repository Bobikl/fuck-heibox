package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import dl.d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.r0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e;
import xh.m;

/* JADX INFO: compiled from: KotlinClassHeader.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class KotlinClassHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final Kind f126499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final e f126500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final String[] f126501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final String[] f126502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private final String[] f126503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private final String f126504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f126505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private final String f126506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private final byte[] f126507i;

    /* JADX INFO: compiled from: KotlinClassHeader.kt */
    public enum Kind {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);


        @d
        public static final a Companion = new a(null);

        @d
        private static final Map<Integer, Kind> entryById;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final int f126508id;

        /* JADX INFO: compiled from: KotlinClassHeader.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(u uVar) {
                this();
            }

            @d
            @m
            public final Kind a(int i10) {
                Kind kind = (Kind) Kind.entryById.get(Integer.valueOf(i10));
                return kind == null ? Kind.UNKNOWN : kind;
            }
        }

        static {
            Kind[] kindArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(kindArrValues.length), 16));
            for (Kind kind : kindArrValues) {
                linkedHashMap.put(Integer.valueOf(kind.f126508id), kind);
            }
            entryById = linkedHashMap;
        }

        Kind(int i10) {
            this.f126508id = i10;
        }

        @d
        @m
        public static final Kind getById(int i10) {
            return Companion.a(i10);
        }
    }

    public KotlinClassHeader(@d Kind kind, @d e metadataVersion, @dl.e String[] strArr, @dl.e String[] strArr2, @dl.e String[] strArr3, @dl.e String str, int i10, @dl.e String str2, @dl.e byte[] bArr) {
        f0.p(kind, "kind");
        f0.p(metadataVersion, "metadataVersion");
        this.f126499a = kind;
        this.f126500b = metadataVersion;
        this.f126501c = strArr;
        this.f126502d = strArr2;
        this.f126503e = strArr3;
        this.f126504f = str;
        this.f126505g = i10;
        this.f126506h = str2;
        this.f126507i = bArr;
    }

    private final boolean h(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    @dl.e
    public final String[] a() {
        return this.f126501c;
    }

    @dl.e
    public final String[] b() {
        return this.f126502d;
    }

    @d
    public final Kind c() {
        return this.f126499a;
    }

    @d
    public final e d() {
        return this.f126500b;
    }

    @dl.e
    public final String e() {
        String str = this.f126504f;
        if (this.f126499a == Kind.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    @d
    public final List<String> f() {
        String[] strArr = this.f126501c;
        if (!(this.f126499a == Kind.MULTIFILE_CLASS)) {
            strArr = null;
        }
        List<String> listT = strArr != null ? kotlin.collections.m.t(strArr) : null;
        return listT == null ? CollectionsKt__CollectionsKt.E() : listT;
    }

    @dl.e
    public final String[] g() {
        return this.f126503e;
    }

    public final boolean i() {
        return h(this.f126505g, 2);
    }

    public final boolean j() {
        return h(this.f126505g, 64) && !h(this.f126505g, 32);
    }

    public final boolean k() {
        return h(this.f126505g, 16) && !h(this.f126505g, 32);
    }

    @d
    public String toString() {
        return this.f126499a + " version=" + this.f126500b;
    }
}
