package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: GameCardVideoMovieObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameCardVideoMovieObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isCompleted;
    private boolean isPlaying;

    @e
    private String movie_end_time;

    @e
    private String movie_start_time;

    @e
    private String movie_url;

    @e
    private String source_movie;

    public GameCardVideoMovieObj(@e String str, @e String str2, @e String str3, boolean z10, boolean z11, @e String str4) {
        this.movie_url = str;
        this.movie_start_time = str2;
        this.movie_end_time = str3;
        this.isCompleted = z10;
        this.isPlaying = z11;
        this.source_movie = str4;
    }

    public /* synthetic */ GameCardVideoMovieObj(String str, String str2, String str3, boolean z10, boolean z11, String str4, int i10, u uVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11, str4);
    }

    public static /* synthetic */ GameCardVideoMovieObj copy$default(GameCardVideoMovieObj gameCardVideoMovieObj, String str, String str2, String str3, boolean z10, boolean z11, String str4, int i10, Object obj) {
        boolean z12 = z10;
        boolean z13 = z11;
        Object[] objArr = {gameCardVideoMovieObj, str, str2, str3, new Byte(z12 ? (byte) 1 : (byte) 0), new Byte(z13 ? (byte) 1 : (byte) 0), str4, new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 15357, new Class[]{GameCardVideoMovieObj.class, String.class, String.class, String.class, cls, cls, String.class, Integer.TYPE, Object.class}, GameCardVideoMovieObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameCardVideoMovieObj) patchProxyResultProxy.result;
        }
        String str5 = (i10 & 1) != 0 ? gameCardVideoMovieObj.movie_url : str;
        String str6 = (i10 & 2) != 0 ? gameCardVideoMovieObj.movie_start_time : str2;
        String str7 = (i10 & 4) != 0 ? gameCardVideoMovieObj.movie_end_time : str3;
        if ((i10 & 8) != 0) {
            z12 = gameCardVideoMovieObj.isCompleted;
        }
        if ((i10 & 16) != 0) {
            z13 = gameCardVideoMovieObj.isPlaying;
        }
        return gameCardVideoMovieObj.copy(str5, str6, str7, z12, z13, (i10 & 32) != 0 ? gameCardVideoMovieObj.source_movie : str4);
    }

    @e
    public final String component1() {
        return this.movie_url;
    }

    @e
    public final String component2() {
        return this.movie_start_time;
    }

    @e
    public final String component3() {
        return this.movie_end_time;
    }

    public final boolean component4() {
        return this.isCompleted;
    }

    public final boolean component5() {
        return this.isPlaying;
    }

    @e
    public final String component6() {
        return this.source_movie;
    }

    @d
    public final GameCardVideoMovieObj copy(@e String str, @e String str2, @e String str3, boolean z10, boolean z11, @e String str4) {
        Object[] objArr = {str, str2, str3, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 15356, new Class[]{String.class, String.class, String.class, cls, cls, String.class}, GameCardVideoMovieObj.class);
        return patchProxyResultProxy.isSupported ? (GameCardVideoMovieObj) patchProxyResultProxy.result : new GameCardVideoMovieObj(str, str2, str3, z10, z11, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15360, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameCardVideoMovieObj)) {
            return false;
        }
        GameCardVideoMovieObj gameCardVideoMovieObj = (GameCardVideoMovieObj) obj;
        return f0.g(this.movie_url, gameCardVideoMovieObj.movie_url) && f0.g(this.movie_start_time, gameCardVideoMovieObj.movie_start_time) && f0.g(this.movie_end_time, gameCardVideoMovieObj.movie_end_time) && this.isCompleted == gameCardVideoMovieObj.isCompleted && this.isPlaying == gameCardVideoMovieObj.isPlaying && f0.g(this.source_movie, gameCardVideoMovieObj.source_movie);
    }

    @e
    public final String getMovie_end_time() {
        return this.movie_end_time;
    }

    @e
    public final String getMovie_start_time() {
        return this.movie_start_time;
    }

    @e
    public final String getMovie_url() {
        return this.movie_url;
    }

    @e
    public final String getSource_movie() {
        return this.source_movie;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15359, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.movie_url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.movie_start_time;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.movie_end_time;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z10 = this.isCompleted;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode3 + r10) * 31;
        boolean z11 = this.isPlaying;
        int i11 = (i10 + (z11 ? 1 : z11)) * 31;
        String str4 = this.source_movie;
        return i11 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public final void setCompleted(boolean z10) {
        this.isCompleted = z10;
    }

    public final void setMovie_end_time(@e String str) {
        this.movie_end_time = str;
    }

    public final void setMovie_start_time(@e String str) {
        this.movie_start_time = str;
    }

    public final void setMovie_url(@e String str) {
        this.movie_url = str;
    }

    public final void setPlaying(boolean z10) {
        this.isPlaying = z10;
    }

    public final void setSource_movie(@e String str) {
        this.source_movie = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15358, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameCardVideoMovieObj(movie_url=" + this.movie_url + ", movie_start_time=" + this.movie_start_time + ", movie_end_time=" + this.movie_end_time + ", isCompleted=" + this.isCompleted + ", isPlaying=" + this.isPlaying + ", source_movie=" + this.source_movie + ')';
    }
}
