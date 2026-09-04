package com.jd.jdcache.service.base;

import androidx.annotation.Keep;
import dl.d;
import dl.e;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: JDCacheFileRepoDelegate.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public abstract class InputStreamState {

    /* JADX INFO: compiled from: JDCacheFileRepoDelegate.kt */
    @Keep
    public static final class Connected extends InputStreamState {
        private final int code;

        @e
        private final InputStream data;

        @e
        private final Map<String, List<String>> headers;

        /* JADX WARN: Multi-variable type inference failed */
        public Connected(int i10, @e Map<String, ? extends List<String>> map, @e InputStream inputStream) {
            super(null);
            this.code = i10;
            this.headers = map;
            this.data = inputStream;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Connected copy$default(Connected connected, int i10, Map map, InputStream inputStream, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = connected.code;
            }
            if ((i11 & 2) != 0) {
                map = connected.headers;
            }
            if ((i11 & 4) != 0) {
                inputStream = connected.data;
            }
            return connected.copy(i10, map, inputStream);
        }

        public final int component1() {
            return this.code;
        }

        @e
        public final Map<String, List<String>> component2() {
            return this.headers;
        }

        @e
        public final InputStream component3() {
            return this.data;
        }

        @d
        public final Connected copy(int i10, @e Map<String, ? extends List<String>> map, @e InputStream inputStream) {
            return new Connected(i10, map, inputStream);
        }

        public boolean equals(@e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Connected)) {
                return false;
            }
            Connected connected = (Connected) obj;
            return this.code == connected.code && f0.g(this.headers, connected.headers) && f0.g(this.data, connected.data);
        }

        public final int getCode() {
            return this.code;
        }

        @e
        public final InputStream getData() {
            return this.data;
        }

        @e
        public final Map<String, List<String>> getHeaders() {
            return this.headers;
        }

        public int hashCode() {
            int i10 = this.code * 31;
            Map<String, List<String>> map = this.headers;
            int iHashCode = (i10 + (map == null ? 0 : map.hashCode())) * 31;
            InputStream inputStream = this.data;
            return iHashCode + (inputStream != null ? inputStream.hashCode() : 0);
        }

        @Override // com.jd.jdcache.service.base.InputStreamState
        @d
        public String toString() {
            return "Connected(code=" + this.code + ", headers=" + this.headers + ", data=" + this.data + ')';
        }
    }

    /* JADX INFO: compiled from: JDCacheFileRepoDelegate.kt */
    @Keep
    public static final class Error extends InputStreamState {
        private final int code;

        @e
        private final Throwable throwable;

        public Error(int i10, @e Throwable th2) {
            super(null);
            this.code = i10;
            this.throwable = th2;
        }

        public static /* synthetic */ Error copy$default(Error error, int i10, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = error.code;
            }
            if ((i11 & 2) != 0) {
                th2 = error.throwable;
            }
            return error.copy(i10, th2);
        }

        public final int component1() {
            return this.code;
        }

        @e
        public final Throwable component2() {
            return this.throwable;
        }

        @d
        public final Error copy(int i10, @e Throwable th2) {
            return new Error(i10, th2);
        }

        public boolean equals(@e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.code == error.code && f0.g(this.throwable, error.throwable);
        }

        public final int getCode() {
            return this.code;
        }

        @e
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            int i10 = this.code * 31;
            Throwable th2 = this.throwable;
            return i10 + (th2 == null ? 0 : th2.hashCode());
        }

        @Override // com.jd.jdcache.service.base.InputStreamState
        @d
        public String toString() {
            return "Error(code=" + this.code + ", throwable=" + this.throwable + ')';
        }
    }

    /* JADX INFO: compiled from: JDCacheFileRepoDelegate.kt */
    @Keep
    public static final class OnStart extends InputStreamState {

        @d
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnStart(@d String url) {
            super(null);
            f0.p(url, "url");
            this.url = url;
        }

        public static /* synthetic */ OnStart copy$default(OnStart onStart, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = onStart.url;
            }
            return onStart.copy(str);
        }

        @d
        public final String component1() {
            return this.url;
        }

        @d
        public final OnStart copy(@d String url) {
            f0.p(url, "url");
            return new OnStart(url);
        }

        public boolean equals(@e Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnStart) && f0.g(this.url, ((OnStart) obj).url);
        }

        @d
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        @Override // com.jd.jdcache.service.base.InputStreamState
        @d
        public String toString() {
            return "OnStart(url=" + this.url + ')';
        }
    }

    private InputStreamState() {
    }

    public /* synthetic */ InputStreamState(u uVar) {
        this();
    }

    @d
    public String toString() {
        if (this instanceof Connected) {
            return "InputStreamState[Connected, code=" + ((Connected) this).getCode() + ']';
        }
        if (!(this instanceof Error)) {
            if (this instanceof OnStart) {
                return "InputStreamState[OnStart]";
            }
            throw new NoWhenBranchMatchedException();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("InputStreamState[Error, code=");
        Error error = (Error) this;
        sb2.append(error.getCode());
        sb2.append("] exception: ");
        Throwable throwable = error.getThrowable();
        sb2.append(throwable != null ? throwable.getMessage() : null);
        sb2.append(']');
        return sb2.toString();
    }
}
