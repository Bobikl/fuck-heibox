package com.jd.jdcache.service.base;

import androidx.annotation.Keep;
import androidx.collection.k;
import com.tencent.qcloud.core.util.IOUtils;
import dl.d;
import dl.e;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: JDCacheFileRepoDelegate.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public abstract class FileState {

    /* JADX INFO: compiled from: JDCacheFileRepoDelegate.kt */
    @Keep
    public static final class Complete extends FileState {
        private final int code;

        @d
        private final File data;

        @e
        private final Map<String, List<String>> headers;
        private final long length;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Complete(int i10, long j10, @e Map<String, ? extends List<String>> map, @d File data) {
            super(null);
            f0.p(data, "data");
            this.code = i10;
            this.length = j10;
            this.headers = map;
            this.data = data;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Complete copy$default(Complete complete, int i10, long j10, Map map, File file, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = complete.code;
            }
            if ((i11 & 2) != 0) {
                j10 = complete.length;
            }
            long j11 = j10;
            if ((i11 & 4) != 0) {
                map = complete.headers;
            }
            Map map2 = map;
            if ((i11 & 8) != 0) {
                file = complete.data;
            }
            return complete.copy(i10, j11, map2, file);
        }

        public final int component1() {
            return this.code;
        }

        public final long component2() {
            return this.length;
        }

        @e
        public final Map<String, List<String>> component3() {
            return this.headers;
        }

        @d
        public final File component4() {
            return this.data;
        }

        @d
        public final Complete copy(int i10, long j10, @e Map<String, ? extends List<String>> map, @d File data) {
            f0.p(data, "data");
            return new Complete(i10, j10, map, data);
        }

        public boolean equals(@e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Complete)) {
                return false;
            }
            Complete complete = (Complete) obj;
            return this.code == complete.code && this.length == complete.length && f0.g(this.headers, complete.headers) && f0.g(this.data, complete.data);
        }

        public final int getCode() {
            return this.code;
        }

        @d
        public final File getData() {
            return this.data;
        }

        @e
        public final Map<String, List<String>> getHeaders() {
            return this.headers;
        }

        public final long getLength() {
            return this.length;
        }

        public int hashCode() {
            int iA = ((this.code * 31) + k.a(this.length)) * 31;
            Map<String, List<String>> map = this.headers;
            return ((iA + (map == null ? 0 : map.hashCode())) * 31) + this.data.hashCode();
        }

        @Override // com.jd.jdcache.service.base.FileState
        @d
        public String toString() {
            return "Complete(code=" + this.code + ", length=" + this.length + ", headers=" + this.headers + ", data=" + this.data + ')';
        }
    }

    /* JADX INFO: compiled from: JDCacheFileRepoDelegate.kt */
    @Keep
    public static final class Error extends FileState {
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

        @Override // com.jd.jdcache.service.base.FileState
        @d
        public String toString() {
            return "Error(code=" + this.code + ", throwable=" + this.throwable + ')';
        }
    }

    /* JADX INFO: compiled from: JDCacheFileRepoDelegate.kt */
    @Keep
    public static final class OnProgress extends FileState {
        private final long max;
        private final long progress;

        public OnProgress(long j10, long j11) {
            super(null);
            this.progress = j10;
            this.max = j11;
        }

        public static /* synthetic */ OnProgress copy$default(OnProgress onProgress, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = onProgress.progress;
            }
            if ((i10 & 2) != 0) {
                j11 = onProgress.max;
            }
            return onProgress.copy(j10, j11);
        }

        public final long component1() {
            return this.progress;
        }

        public final long component2() {
            return this.max;
        }

        @d
        public final OnProgress copy(long j10, long j11) {
            return new OnProgress(j10, j11);
        }

        public boolean equals(@e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProgress)) {
                return false;
            }
            OnProgress onProgress = (OnProgress) obj;
            return this.progress == onProgress.progress && this.max == onProgress.max;
        }

        public final long getMax() {
            return this.max;
        }

        public final long getProgress() {
            return this.progress;
        }

        public int hashCode() {
            return (k.a(this.progress) * 31) + k.a(this.max);
        }

        @Override // com.jd.jdcache.service.base.FileState
        @d
        public String toString() {
            return "OnProgress(progress=" + this.progress + ", max=" + this.max + ')';
        }
    }

    /* JADX INFO: compiled from: JDCacheFileRepoDelegate.kt */
    @Keep
    public static final class OnStart extends FileState {

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

        @Override // com.jd.jdcache.service.base.FileState
        @d
        public String toString() {
            return "OnStart(url=" + this.url + ')';
        }
    }

    private FileState() {
    }

    public /* synthetic */ FileState(u uVar) {
        this();
    }

    @d
    public String toString() {
        if (this instanceof OnStart) {
            return "FileState[OnStart] url: " + ((OnStart) this).getUrl();
        }
        if (this instanceof OnProgress) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("FileState[OnProgress] ");
            OnProgress onProgress = (OnProgress) this;
            sb2.append(onProgress.getProgress());
            sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb2.append(onProgress.getMax());
            return sb2.toString();
        }
        if (this instanceof Complete) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("FileState[Complete, code=");
            Complete complete = (Complete) this;
            sb3.append(complete.getCode());
            sb3.append("] path: ");
            sb3.append(complete.getData().getPath());
            return sb3.toString();
        }
        if (!(this instanceof Error)) {
            throw new NoWhenBranchMatchedException();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("FileState[Error, code=");
        Error error = (Error) this;
        sb4.append(error.getCode());
        sb4.append("] exception: ");
        Throwable throwable = error.getThrowable();
        sb4.append(throwable != null ? throwable.getMessage() : null);
        sb4.append(']');
        return sb4.toString();
    }
}
