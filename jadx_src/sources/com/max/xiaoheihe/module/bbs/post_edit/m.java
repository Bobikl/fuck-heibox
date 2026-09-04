package com.max.xiaoheihe.module.bbs.post_edit;

import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f83003a = 0;

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class a extends m {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f83004d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final String f83005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f83006c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d String hashtagName, boolean z10) {
            super(null);
            kotlin.jvm.internal.f0.p(hashtagName, "hashtagName");
            this.f83005b = hashtagName;
            this.f83006c = z10;
        }

        public static /* synthetic */ a d(a aVar, String str, boolean z10, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, str, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 30115, new Class[]{a.class, String.class, Boolean.TYPE, Integer.TYPE, Object.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            if ((i10 & 1) != 0) {
                str = aVar.f83005b;
            }
            if ((i10 & 2) != 0) {
                z10 = aVar.f83006c;
            }
            return aVar.c(str, z10);
        }

        @dl.d
        public final String a() {
            return this.f83005b;
        }

        public final boolean b() {
            return this.f83006c;
        }

        @dl.d
        public final a c(@dl.d String hashtagName, boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hashtagName, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30114, new Class[]{String.class, Boolean.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(hashtagName, "hashtagName");
            return new a(hashtagName, z10);
        }

        @dl.d
        public final String e() {
            return this.f83005b;
        }

        public boolean equals(@dl.e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30118, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f0.g(this.f83005b, aVar.f83005b) && this.f83006c == aVar.f83006c;
        }

        public final boolean f() {
            return this.f83006c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        public int hashCode() {
            ?? r10;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30117, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            int iHashCode = this.f83005b.hashCode() * 31;
            boolean z10 = this.f83006c;
            if (z10) {
                r10 = z10;
                r10 = 1;
            }
            r10 = z10;
            return iHashCode + r10;
        }

        @dl.d
        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30116, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "HashtagSelectAction(hashtagName=" + this.f83005b + ", isChecked=" + this.f83006c + ')';
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class b extends m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final b f83007b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f83008c = 0;

        private b() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class c extends m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final c f83009b = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f83010c = 0;

        private c() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class d extends m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final d f83011b = new d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f83012c = 0;

        private d() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class e extends m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final e f83013b = new e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f83014c = 0;

        private e() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class f extends m {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f83015d = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final BBSTopicObj f83016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f83017c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@dl.d BBSTopicObj topicObj, boolean z10) {
            super(null);
            kotlin.jvm.internal.f0.p(topicObj, "topicObj");
            this.f83016b = topicObj;
            this.f83017c = z10;
        }

        public static /* synthetic */ f d(f fVar, BBSTopicObj bBSTopicObj, boolean z10, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, bBSTopicObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 30120, new Class[]{f.class, BBSTopicObj.class, Boolean.TYPE, Integer.TYPE, Object.class}, f.class);
            if (patchProxyResultProxy.isSupported) {
                return (f) patchProxyResultProxy.result;
            }
            if ((i10 & 1) != 0) {
                bBSTopicObj = fVar.f83016b;
            }
            if ((i10 & 2) != 0) {
                z10 = fVar.f83017c;
            }
            return fVar.c(bBSTopicObj, z10);
        }

        @dl.d
        public final BBSTopicObj a() {
            return this.f83016b;
        }

        public final boolean b() {
            return this.f83017c;
        }

        @dl.d
        public final f c(@dl.d BBSTopicObj topicObj, boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{topicObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30119, new Class[]{BBSTopicObj.class, Boolean.TYPE}, f.class);
            if (patchProxyResultProxy.isSupported) {
                return (f) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(topicObj, "topicObj");
            return new f(topicObj, z10);
        }

        @dl.d
        public final BBSTopicObj e() {
            return this.f83016b;
        }

        public boolean equals(@dl.e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30123, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return kotlin.jvm.internal.f0.g(this.f83016b, fVar.f83016b) && this.f83017c == fVar.f83017c;
        }

        public final boolean f() {
            return this.f83017c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        public int hashCode() {
            ?? r10;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30122, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            int iHashCode = this.f83016b.hashCode() * 31;
            boolean z10 = this.f83017c;
            if (z10) {
                r10 = z10;
                r10 = 1;
            }
            r10 = z10;
            return iHashCode + r10;
        }

        @dl.d
        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30121, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "TopicSelectAction(topicObj=" + this.f83016b + ", isChecked=" + this.f83017c + ')';
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class g extends m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final g f83018b = new g();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f83019c = 0;

        private g() {
            super(null);
        }
    }

    private m() {
    }

    public /* synthetic */ m(kotlin.jvm.internal.u uVar) {
        this();
    }
}
