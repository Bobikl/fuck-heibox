package j1;

import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.runtime.internal.o;
import com.umeng.analytics.pro.ak;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: VectorResources.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\u0005B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0019\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0086\u0002J\u0006\u0010\f\u001a\u00020\b¨\u0006\u000f"}, d2 = {"Lj1/e;", "", "Lj1/e$b;", "key", "Lj1/e$a;", "b", "", "configChanges", "Lkotlin/b2;", ak.aF, "imageVectorEntry", "d", ak.av, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final HashMap<Key, WeakReference<ImageVectorEntry>> f124195a = new HashMap<>();

    /* JADX INFO: renamed from: j1.e$a, reason: from toString */
    /* JADX INFO: compiled from: VectorResources.android.kt */
    @o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lj1/e$a;", "", "Landroidx/compose/ui/graphics/vector/c;", ak.av, "", "b", "imageVector", "configFlags", ak.aF, "", "toString", "hashCode", "other", "", "equals", "Landroidx/compose/ui/graphics/vector/c;", "f", "()Landroidx/compose/ui/graphics/vector/c;", "I", "e", "()I", "<init>", "(Landroidx/compose/ui/graphics/vector/c;I)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class ImageVectorEntry {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f124196c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
        @dl.d
        private final androidx.compose.ui.graphics.vector.c imageVector;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
        private final int configFlags;

        public ImageVectorEntry(@dl.d androidx.compose.ui.graphics.vector.c imageVector, int i10) {
            f0.p(imageVector, "imageVector");
            this.imageVector = imageVector;
            this.configFlags = i10;
        }

        public static /* synthetic */ ImageVectorEntry d(ImageVectorEntry imageVectorEntry, androidx.compose.ui.graphics.vector.c cVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cVar = imageVectorEntry.imageVector;
            }
            if ((i11 & 2) != 0) {
                i10 = imageVectorEntry.configFlags;
            }
            return imageVectorEntry.c(cVar, i10);
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final androidx.compose.ui.graphics.vector.c getImageVector() {
            return this.imageVector;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getConfigFlags() {
            return this.configFlags;
        }

        @dl.d
        public final ImageVectorEntry c(@dl.d androidx.compose.ui.graphics.vector.c imageVector, int configFlags) {
            f0.p(imageVector, "imageVector");
            return new ImageVectorEntry(imageVector, configFlags);
        }

        public final int e() {
            return this.configFlags;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageVectorEntry)) {
                return false;
            }
            ImageVectorEntry imageVectorEntry = (ImageVectorEntry) other;
            return f0.g(this.imageVector, imageVectorEntry.imageVector) && this.configFlags == imageVectorEntry.configFlags;
        }

        @dl.d
        public final androidx.compose.ui.graphics.vector.c f() {
            return this.imageVector;
        }

        public int hashCode() {
            return (this.imageVector.hashCode() * 31) + this.configFlags;
        }

        @dl.d
        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.imageVector + ", configFlags=" + this.configFlags + ')';
        }
    }

    /* JADX INFO: renamed from: j1.e$b, reason: from toString */
    /* JADX INFO: compiled from: VectorResources.android.kt */
    @o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0007\u001a\u00060\u0002R\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0004\u001a\u00060\u0002R\u00020\u0003HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J!\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0007\u001a\u00060\u0002R\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0007\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lj1/e$b;", "", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", ak.av, "", "b", "theme", "id", ak.aF, "", "toString", "hashCode", "other", "", "equals", "Landroid/content/res/Resources$Theme;", "f", "()Landroid/content/res/Resources$Theme;", "I", "e", "()I", "<init>", "(Landroid/content/res/Resources$Theme;I)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Key {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f124199c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
        @dl.d
        private final Resources.Theme theme;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
        private final int id;

        public Key(@dl.d Resources.Theme theme, int i10) {
            f0.p(theme, "theme");
            this.theme = theme;
            this.id = i10;
        }

        public static /* synthetic */ Key d(Key key, Resources.Theme theme, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                theme = key.theme;
            }
            if ((i11 & 2) != 0) {
                i10 = key.id;
            }
            return key.c(theme, i10);
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Resources.Theme getTheme() {
            return this.theme;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @dl.d
        public final Key c(@dl.d Resources.Theme theme, int id2) {
            f0.p(theme, "theme");
            return new Key(theme, id2);
        }

        public final int e() {
            return this.id;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return f0.g(this.theme, key.theme) && this.id == key.id;
        }

        @dl.d
        public final Resources.Theme f() {
            return this.theme;
        }

        public int hashCode() {
            return (this.theme.hashCode() * 31) + this.id;
        }

        @dl.d
        public String toString() {
            return "Key(theme=" + this.theme + ", id=" + this.id + ')';
        }
    }

    public final void a() {
        this.f124195a.clear();
    }

    @dl.e
    public final ImageVectorEntry b(@dl.d Key key) {
        f0.p(key, "key");
        WeakReference<ImageVectorEntry> weakReference = this.f124195a.get(key);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void c(int i10) {
        Iterator<Map.Entry<Key, WeakReference<ImageVectorEntry>>> it = this.f124195a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Key, WeakReference<ImageVectorEntry>> next = it.next();
            f0.o(next, "it.next()");
            ImageVectorEntry imageVectorEntry = next.getValue().get();
            if (imageVectorEntry == null || Configuration.needNewResources(i10, imageVectorEntry.e())) {
                it.remove();
            }
        }
    }

    public final void d(@dl.d Key key, @dl.d ImageVectorEntry imageVectorEntry) {
        f0.p(key, "key");
        f0.p(imageVectorEntry, "imageVectorEntry");
        this.f124195a.put(key, new WeakReference<>(imageVectorEntry));
    }
}
