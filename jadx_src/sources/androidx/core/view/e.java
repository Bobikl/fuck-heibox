package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: compiled from: ContentInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f21515b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21516c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21517d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f21518e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f21519f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f21520g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f21521h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final g f21522a;

    /* JADX INFO: compiled from: ContentInfoCompat.java */
    @androidx.annotation.w0(31)
    public static final class a {
        private a() {
        }

        @androidx.annotation.n0
        @androidx.annotation.u
        public static Pair<ContentInfo, ContentInfo> a(@androidx.annotation.n0 ContentInfo contentInfo, @androidx.annotation.n0 final Predicate<ClipData.Item> predicate) {
            ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() == 1) {
                boolean zTest = predicate.test(clip.getItemAt(0));
                ContentInfo contentInfo2 = zTest ? contentInfo : null;
                if (zTest) {
                    contentInfo = null;
                }
                return Pair.create(contentInfo2, contentInfo);
            }
            Objects.requireNonNull(predicate);
            Pair<ClipData, ClipData> pairH = e.h(clip, new androidx.core.util.w() { // from class: androidx.core.view.d
                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w a(androidx.core.util.w wVar) {
                    return androidx.core.util.v.a(this, wVar);
                }

                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w b(androidx.core.util.w wVar) {
                    return androidx.core.util.v.c(this, wVar);
                }

                @Override // androidx.core.util.w
                public /* synthetic */ androidx.core.util.w negate() {
                    return androidx.core.util.v.b(this);
                }

                @Override // androidx.core.util.w
                public final boolean test(Object obj) {
                    return predicate.test((ClipData.Item) obj);
                }
            });
            if (pairH.first == null) {
                return Pair.create(null, contentInfo);
            }
            return pairH.second == null ? Pair.create(contentInfo, null) : Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) pairH.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) pairH.second).build());
        }
    }

    /* JADX INFO: compiled from: ContentInfoCompat.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.n0
        private final d f21523a;

        public b(@androidx.annotation.n0 ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f21523a = new c(clipData, i10);
            } else {
                this.f21523a = new C0148e(clipData, i10);
            }
        }

        public b(@androidx.annotation.n0 e eVar) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f21523a = new c(eVar);
            } else {
                this.f21523a = new C0148e(eVar);
            }
        }

        @androidx.annotation.n0
        public e a() {
            return this.f21523a.build();
        }

        @androidx.annotation.n0
        public b b(@androidx.annotation.n0 ClipData clipData) {
            this.f21523a.b(clipData);
            return this;
        }

        @androidx.annotation.n0
        public b c(@androidx.annotation.p0 Bundle bundle) {
            this.f21523a.setExtras(bundle);
            return this;
        }

        @androidx.annotation.n0
        public b d(int i10) {
            this.f21523a.setFlags(i10);
            return this;
        }

        @androidx.annotation.n0
        public b e(@androidx.annotation.p0 Uri uri) {
            this.f21523a.a(uri);
            return this;
        }

        @androidx.annotation.n0
        public b f(int i10) {
            this.f21523a.c(i10);
            return this;
        }
    }

    /* JADX INFO: compiled from: ContentInfoCompat.java */
    @androidx.annotation.w0(31)
    public static final class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.n0
        private final ContentInfo.Builder f21524a;

        c(@androidx.annotation.n0 ClipData clipData, int i10) {
            this.f21524a = new ContentInfo.Builder(clipData, i10);
        }

        c(@androidx.annotation.n0 e eVar) {
            this.f21524a = new ContentInfo.Builder(eVar.l());
        }

        @Override // androidx.core.view.e.d
        public void a(@androidx.annotation.p0 Uri uri) {
            this.f21524a.setLinkUri(uri);
        }

        @Override // androidx.core.view.e.d
        public void b(@androidx.annotation.n0 ClipData clipData) {
            this.f21524a.setClip(clipData);
        }

        @Override // androidx.core.view.e.d
        @androidx.annotation.n0
        public e build() {
            return new e(new f(this.f21524a.build()));
        }

        @Override // androidx.core.view.e.d
        public void c(int i10) {
            this.f21524a.setSource(i10);
        }

        @Override // androidx.core.view.e.d
        public void setExtras(@androidx.annotation.p0 Bundle bundle) {
            this.f21524a.setExtras(bundle);
        }

        @Override // androidx.core.view.e.d
        public void setFlags(int i10) {
            this.f21524a.setFlags(i10);
        }
    }

    /* JADX INFO: compiled from: ContentInfoCompat.java */
    public interface d {
        void a(@androidx.annotation.p0 Uri uri);

        void b(@androidx.annotation.n0 ClipData clipData);

        @androidx.annotation.n0
        e build();

        void c(int i10);

        void setExtras(@androidx.annotation.p0 Bundle bundle);

        void setFlags(int i10);
    }

    /* JADX INFO: renamed from: androidx.core.view.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ContentInfoCompat.java */
    public static final class C0148e implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.n0
        ClipData f21525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f21526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f21527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        Uri f21528d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        Bundle f21529e;

        C0148e(@androidx.annotation.n0 ClipData clipData, int i10) {
            this.f21525a = clipData;
            this.f21526b = i10;
        }

        C0148e(@androidx.annotation.n0 e eVar) {
            this.f21525a = eVar.c();
            this.f21526b = eVar.g();
            this.f21527c = eVar.e();
            this.f21528d = eVar.f();
            this.f21529e = eVar.d();
        }

        @Override // androidx.core.view.e.d
        public void a(@androidx.annotation.p0 Uri uri) {
            this.f21528d = uri;
        }

        @Override // androidx.core.view.e.d
        public void b(@androidx.annotation.n0 ClipData clipData) {
            this.f21525a = clipData;
        }

        @Override // androidx.core.view.e.d
        @androidx.annotation.n0
        public e build() {
            return new e(new h(this));
        }

        @Override // androidx.core.view.e.d
        public void c(int i10) {
            this.f21526b = i10;
        }

        @Override // androidx.core.view.e.d
        public void setExtras(@androidx.annotation.p0 Bundle bundle) {
            this.f21529e = bundle;
        }

        @Override // androidx.core.view.e.d
        public void setFlags(int i10) {
            this.f21527c = i10;
        }
    }

    /* JADX INFO: compiled from: ContentInfoCompat.java */
    @androidx.annotation.w0(31)
    public static final class f implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.n0
        private final ContentInfo f21530a;

        f(@androidx.annotation.n0 ContentInfo contentInfo) {
            this.f21530a = (ContentInfo) androidx.core.util.o.l(contentInfo);
        }

        @Override // androidx.core.view.e.g
        @androidx.annotation.n0
        public ClipData e() {
            return this.f21530a.getClip();
        }

        @Override // androidx.core.view.e.g
        @androidx.annotation.p0
        public Bundle getExtras() {
            return this.f21530a.getExtras();
        }

        @Override // androidx.core.view.e.g
        public int getFlags() {
            return this.f21530a.getFlags();
        }

        @Override // androidx.core.view.e.g
        public int j() {
            return this.f21530a.getSource();
        }

        @Override // androidx.core.view.e.g
        @androidx.annotation.p0
        public Uri k() {
            return this.f21530a.getLinkUri();
        }

        @Override // androidx.core.view.e.g
        @androidx.annotation.n0
        public ContentInfo l() {
            return this.f21530a;
        }

        @androidx.annotation.n0
        public String toString() {
            return "ContentInfoCompat{" + this.f21530a + z5.g.f141884d;
        }
    }

    /* JADX INFO: compiled from: ContentInfoCompat.java */
    public interface g {
        @androidx.annotation.n0
        ClipData e();

        @androidx.annotation.p0
        Bundle getExtras();

        int getFlags();

        int j();

        @androidx.annotation.p0
        Uri k();

        @androidx.annotation.p0
        ContentInfo l();
    }

    /* JADX INFO: compiled from: ContentInfoCompat.java */
    public static final class h implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.n0
        private final ClipData f21531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f21533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private final Uri f21534d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        private final Bundle f21535e;

        h(C0148e c0148e) {
            this.f21531a = (ClipData) androidx.core.util.o.l(c0148e.f21525a);
            this.f21532b = androidx.core.util.o.g(c0148e.f21526b, 0, 5, "source");
            this.f21533c = androidx.core.util.o.k(c0148e.f21527c, 1);
            this.f21534d = c0148e.f21528d;
            this.f21535e = c0148e.f21529e;
        }

        @Override // androidx.core.view.e.g
        @androidx.annotation.n0
        public ClipData e() {
            return this.f21531a;
        }

        @Override // androidx.core.view.e.g
        @androidx.annotation.p0
        public Bundle getExtras() {
            return this.f21535e;
        }

        @Override // androidx.core.view.e.g
        public int getFlags() {
            return this.f21533c;
        }

        @Override // androidx.core.view.e.g
        public int j() {
            return this.f21532b;
        }

        @Override // androidx.core.view.e.g
        @androidx.annotation.p0
        public Uri k() {
            return this.f21534d;
        }

        @Override // androidx.core.view.e.g
        @androidx.annotation.p0
        public ContentInfo l() {
            return null;
        }

        @androidx.annotation.n0
        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f21531a.getDescription());
            sb2.append(", source=");
            sb2.append(e.k(this.f21532b));
            sb2.append(", flags=");
            sb2.append(e.b(this.f21533c));
            if (this.f21534d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f21534d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f21535e != null ? ", hasExtras" : "");
            sb2.append(z5.g.f141884d);
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: ContentInfoCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface i {
    }

    /* JADX INFO: compiled from: ContentInfoCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface j {
    }

    e(@androidx.annotation.n0 g gVar) {
        this.f21522a = gVar;
    }

    @androidx.annotation.n0
    static ClipData a(@androidx.annotation.n0 ClipDescription clipDescription, @androidx.annotation.n0 List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i10 = 1; i10 < list.size(); i10++) {
            clipData.addItem(list.get(i10));
        }
        return clipData;
    }

    @androidx.annotation.n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    static String b(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    @androidx.annotation.n0
    static Pair<ClipData, ClipData> h(@androidx.annotation.n0 ClipData clipData, @androidx.annotation.n0 androidx.core.util.w<ClipData.Item> wVar) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i10 = 0; i10 < clipData.getItemCount(); i10++) {
            ClipData.Item itemAt = clipData.getItemAt(i10);
            if (wVar.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        if (arrayList == null) {
            return Pair.create(null, clipData);
        }
        return arrayList2 == null ? Pair.create(clipData, null) : Pair.create(a(clipData.getDescription(), arrayList), a(clipData.getDescription(), arrayList2));
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(31)
    public static Pair<ContentInfo, ContentInfo> i(@androidx.annotation.n0 ContentInfo contentInfo, @androidx.annotation.n0 Predicate<ClipData.Item> predicate) {
        return a.a(contentInfo, predicate);
    }

    @androidx.annotation.n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    static String k(int i10) {
        if (i10 == 0) {
            return "SOURCE_APP";
        }
        if (i10 == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i10 == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i10 == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i10 != 4) {
            return i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT";
        }
        return "SOURCE_AUTOFILL";
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(31)
    public static e m(@androidx.annotation.n0 ContentInfo contentInfo) {
        return new e(new f(contentInfo));
    }

    @androidx.annotation.n0
    public ClipData c() {
        return this.f21522a.e();
    }

    @androidx.annotation.p0
    public Bundle d() {
        return this.f21522a.getExtras();
    }

    public int e() {
        return this.f21522a.getFlags();
    }

    @androidx.annotation.p0
    public Uri f() {
        return this.f21522a.k();
    }

    public int g() {
        return this.f21522a.j();
    }

    @androidx.annotation.n0
    public Pair<e, e> j(@androidx.annotation.n0 androidx.core.util.w<ClipData.Item> wVar) {
        ClipData clipDataE = this.f21522a.e();
        if (clipDataE.getItemCount() == 1) {
            boolean zTest = wVar.test(clipDataE.getItemAt(0));
            return Pair.create(zTest ? this : null, zTest ? null : this);
        }
        Pair<ClipData, ClipData> pairH = h(clipDataE, wVar);
        if (pairH.first == null) {
            return Pair.create(null, this);
        }
        return pairH.second == null ? Pair.create(this, null) : Pair.create(new b(this).b((ClipData) pairH.first).a(), new b(this).b((ClipData) pairH.second).a());
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(31)
    public ContentInfo l() {
        ContentInfo contentInfoL = this.f21522a.l();
        Objects.requireNonNull(contentInfoL);
        return contentInfoL;
    }

    @androidx.annotation.n0
    public String toString() {
        return this.f21522a.toString();
    }
}
