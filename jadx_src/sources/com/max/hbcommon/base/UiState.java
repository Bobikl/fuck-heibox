package com.max.hbcommon.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: BaseViewModel.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class UiState<T> implements Serializable {

    /* JADX INFO: compiled from: BaseViewModel.kt */
    public static final class Error extends UiState {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final Throwable f66631b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@dl.d Throwable throwable) {
            super(null);
            f0.p(throwable, "throwable");
            this.f66631b = throwable;
        }

        public static /* synthetic */ Error c(Error error, Throwable th2, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{error, th2, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.b.Aw, new Class[]{Error.class, Throwable.class, Integer.TYPE, Object.class}, Error.class);
            if (patchProxyResultProxy.isSupported) {
                return (Error) patchProxyResultProxy.result;
            }
            if ((i10 & 1) != 0) {
                th2 = error.f66631b;
            }
            return error.b(th2);
        }

        @dl.d
        public final Throwable a() {
            return this.f66631b;
        }

        @dl.d
        public final Error b(@dl.d Throwable throwable) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{throwable}, this, changeQuickRedirect, false, bb.c.b.zw, new Class[]{Throwable.class}, Error.class);
            if (patchProxyResultProxy.isSupported) {
                return (Error) patchProxyResultProxy.result;
            }
            f0.p(throwable, "throwable");
            return new Error(throwable);
        }

        @dl.d
        public final Throwable d() {
            return this.f66631b;
        }

        public boolean equals(@dl.e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.b.Dw, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && f0.g(this.f66631b, ((Error) obj).f66631b);
        }

        public int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Cw, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f66631b.hashCode();
        }

        @dl.d
        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Bw, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "Error(throwable=" + this.f66631b + ')';
        }
    }

    /* JADX INFO: compiled from: BaseViewModel.kt */
    public static final class Loading extends UiState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final Loading f66632b = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: BaseViewModel.kt */
    public static final class Success<T> extends UiState<T> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f66633b;

        public Success(T t10) {
            super(null);
            this.f66633b = t10;
        }

        public static /* synthetic */ Success c(Success success, Object obj, int i10, Object obj2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{success, obj, new Integer(i10), obj2}, null, changeQuickRedirect, true, bb.c.b.Fw, new Class[]{Success.class, Object.class, Integer.TYPE, Object.class}, Success.class);
            if (patchProxyResultProxy.isSupported) {
                return (Success) patchProxyResultProxy.result;
            }
            if ((i10 & 1) != 0) {
                obj = success.f66633b;
            }
            return success.b(obj);
        }

        public final T a() {
            return this.f66633b;
        }

        @dl.d
        public final Success<T> b(T t10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, bb.c.b.Ew, new Class[]{Object.class}, Success.class);
            return patchProxyResultProxy.isSupported ? (Success) patchProxyResultProxy.result : new Success<>(t10);
        }

        public final T d() {
            return this.f66633b;
        }

        public boolean equals(@dl.e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.b.Iw, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && f0.g(this.f66633b, ((Success) obj).f66633b);
        }

        public int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Hw, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            T t10 = this.f66633b;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        @dl.d
        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Gw, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "Success(data=" + this.f66633b + ')';
        }
    }

    private UiState() {
    }

    public /* synthetic */ UiState(u uVar) {
        this();
    }
}
