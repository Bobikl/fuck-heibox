package com.max.xiaoheihe.module.account.mine;

import androidx.lifecycle.j0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.f0;
import kotlin.u;

/* JADX INFO: compiled from: AvatarDecorListContainer.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f79058a = "AvatarDecorListContainer";

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.mine.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AvatarDecorListContainer.kt */
    public static final /* synthetic */ class C0657a implements j0, a0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ yh.l f79059a;

        C0657a(yh.l function) {
            f0.p(function, "function");
            this.f79059a = function;
        }

        @Override // androidx.lifecycle.j0
        public final /* synthetic */ void a(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25031, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f79059a.invoke(obj);
        }

        @Override // kotlin.jvm.internal.a0
        @dl.d
        public final u<?> b() {
            return this.f79059a;
        }

        public final boolean equals(@dl.e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25032, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if ((obj instanceof j0) && (obj instanceof a0)) {
                return f0.g(b(), ((a0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25033, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : b().hashCode();
        }
    }
}
