package com.max.xiaoheihe.module.bbs.post_edit;

import com.max.mediaselector.lib.entity.LocalMedia;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: PostTabActivityViewModel.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f82948a = 0;

    /* JADX INFO: compiled from: PostTabActivityViewModel.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class a extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final a f82949b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f82950c = 0;

        private a() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PostTabActivityViewModel.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class b extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final b f82951b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f82952c = 0;

        private b() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PostTabActivityViewModel.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class c extends e {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f82953d = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final LocalMedia f82954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f82955c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@dl.d LocalMedia mediaData, int i10) {
            super(null);
            kotlin.jvm.internal.f0.p(mediaData, "mediaData");
            this.f82954b = mediaData;
            this.f82955c = i10;
        }

        public static /* synthetic */ c d(c cVar, LocalMedia localMedia, int i10, int i11, Object obj) {
            Object[] objArr = {cVar, localMedia, new Integer(i10), new Integer(i11), obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 29648, new Class[]{c.class, LocalMedia.class, cls, cls, Object.class}, c.class);
            if (patchProxyResultProxy.isSupported) {
                return (c) patchProxyResultProxy.result;
            }
            if ((i11 & 1) != 0) {
                localMedia = cVar.f82954b;
            }
            if ((i11 & 2) != 0) {
                i10 = cVar.f82955c;
            }
            return cVar.c(localMedia, i10);
        }

        @dl.d
        public final LocalMedia a() {
            return this.f82954b;
        }

        public final int b() {
            return this.f82955c;
        }

        @dl.d
        public final c c(@dl.d LocalMedia mediaData, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mediaData, new Integer(i10)}, this, changeQuickRedirect, false, 29647, new Class[]{LocalMedia.class, Integer.TYPE}, c.class);
            if (patchProxyResultProxy.isSupported) {
                return (c) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(mediaData, "mediaData");
            return new c(mediaData, i10);
        }

        @dl.d
        public final LocalMedia e() {
            return this.f82954b;
        }

        public boolean equals(@dl.e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29651, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.f0.g(this.f82954b, cVar.f82954b) && this.f82955c == cVar.f82955c;
        }

        public final int f() {
            return this.f82955c;
        }

        public int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29650, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (this.f82954b.hashCode() * 31) + this.f82955c;
        }

        @dl.d
        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29649, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "SelectMediaItemEvent(mediaData=" + this.f82954b + ", selectResult=" + this.f82955c + ')';
        }
    }

    private e() {
    }

    public /* synthetic */ e(kotlin.jvm.internal.u uVar) {
        this();
    }
}
