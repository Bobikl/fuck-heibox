package androidx.navigation;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.RestrictTo;
import kotlin.text.Regex;

/* JADX INFO: compiled from: NavDeepLinkRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final Uri f25337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final String f25338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final String f25339c;

    /* JADX INFO: compiled from: NavDeepLinkRequest.kt */
    @kotlin.jvm.internal.t0({"SMAP\nNavDeepLinkRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLinkRequest.kt\nandroidx/navigation/NavDeepLinkRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        public static final C0193a f25340d = new C0193a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.e
        private Uri f25341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private String f25342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        private String f25343c;

        /* JADX INFO: renamed from: androidx.navigation.z$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NavDeepLinkRequest.kt */
        public static final class C0193a {
            private C0193a() {
            }

            public /* synthetic */ C0193a(kotlin.jvm.internal.u uVar) {
                this();
            }

            @dl.d
            @xh.m
            public final a a(@dl.d String action) {
                kotlin.jvm.internal.f0.p(action, "action");
                if (!(action.length() > 0)) {
                    throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.".toString());
                }
                a aVar = new a(null);
                aVar.e(action);
                return aVar;
            }

            @dl.d
            @xh.m
            public final a b(@dl.d String mimeType) {
                kotlin.jvm.internal.f0.p(mimeType, "mimeType");
                a aVar = new a(null);
                aVar.f(mimeType);
                return aVar;
            }

            @dl.d
            @xh.m
            public final a c(@dl.d Uri uri) {
                kotlin.jvm.internal.f0.p(uri, "uri");
                a aVar = new a(null);
                aVar.g(uri);
                return aVar;
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public static final a b(@dl.d String str) {
            return f25340d.a(str);
        }

        @dl.d
        @xh.m
        public static final a c(@dl.d String str) {
            return f25340d.b(str);
        }

        @dl.d
        @xh.m
        public static final a d(@dl.d Uri uri) {
            return f25340d.c(uri);
        }

        @dl.d
        public final z a() {
            return new z(this.f25341a, this.f25342b, this.f25343c);
        }

        @dl.d
        public final a e(@dl.d String action) {
            kotlin.jvm.internal.f0.p(action, "action");
            if (!(action.length() > 0)) {
                throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.".toString());
            }
            this.f25342b = action;
            return this;
        }

        @dl.d
        public final a f(@dl.d String mimeType) {
            kotlin.jvm.internal.f0.p(mimeType, "mimeType");
            if (new Regex("^[-\\w*.]+/[-\\w+*.]+$").k(mimeType)) {
                this.f25343c = mimeType;
                return this;
            }
            throw new IllegalArgumentException(("The given mimeType " + mimeType + " does not match to required \"type/subtype\" format").toString());
        }

        @dl.d
        public final a g(@dl.d Uri uri) {
            kotlin.jvm.internal.f0.p(uri, "uri");
            this.f25341a = uri;
            return this;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public z(@dl.d Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        kotlin.jvm.internal.f0.p(intent, "intent");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public z(@dl.e Uri uri, @dl.e String str, @dl.e String str2) {
        this.f25337a = uri;
        this.f25338b = str;
        this.f25339c = str2;
    }

    @dl.e
    public String a() {
        return this.f25338b;
    }

    @dl.e
    public String b() {
        return this.f25339c;
    }

    @dl.e
    public Uri c() {
        return this.f25337a;
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NavDeepLinkRequest");
        sb2.append("{");
        if (c() != null) {
            sb2.append(" uri=");
            sb2.append(String.valueOf(c()));
        }
        if (a() != null) {
            sb2.append(" action=");
            sb2.append(a());
        }
        if (b() != null) {
            sb2.append(" mimetype=");
            sb2.append(b());
        }
        sb2.append(" }");
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "sb.toString()");
        return string;
    }
}
