package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: ViewModel.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class w0 {

    @androidx.annotation.p0
    private final Map<String, Object> mBagOfTags;
    private volatile boolean mCleared;

    @androidx.annotation.p0
    private final Set<Closeable> mCloseables;

    public w0() {
        this.mBagOfTags = new HashMap();
        this.mCloseables = new LinkedHashSet();
        this.mCleared = false;
    }

    public w0(@androidx.annotation.n0 Closeable... closeableArr) {
        this.mBagOfTags = new HashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.mCloseables = linkedHashSet;
        this.mCleared = false;
        linkedHashSet.addAll(Arrays.asList(closeableArr));
    }

    private static void closeWithRuntimeException(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public void addCloseable(@androidx.annotation.n0 Closeable closeable) {
        Set<Closeable> set = this.mCloseables;
        if (set != null) {
            synchronized (set) {
                this.mCloseables.add(closeable);
            }
        }
    }

    @androidx.annotation.k0
    final void clear() {
        this.mCleared = true;
        Map<String, Object> map = this.mBagOfTags;
        if (map != null) {
            synchronized (map) {
                Iterator<Object> it = this.mBagOfTags.values().iterator();
                while (it.hasNext()) {
                    closeWithRuntimeException(it.next());
                }
            }
        }
        Set<Closeable> set = this.mCloseables;
        if (set != null) {
            synchronized (set) {
                Iterator<Closeable> it2 = this.mCloseables.iterator();
                while (it2.hasNext()) {
                    closeWithRuntimeException(it2.next());
                }
            }
        }
        onCleared();
    }

    <T> T getTag(String str) {
        T t10;
        Map<String, Object> map = this.mBagOfTags;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t10 = (T) this.mBagOfTags.get(str);
        }
        return t10;
    }

    protected void onCleared() {
    }

    <T> T setTagIfAbsent(String str, T t10) {
        Object obj;
        synchronized (this.mBagOfTags) {
            obj = this.mBagOfTags.get(str);
            if (obj == null) {
                this.mBagOfTags.put(str, t10);
            }
        }
        if (obj != null) {
            t10 = (T) obj;
        }
        if (this.mCleared) {
            closeWithRuntimeException(t10);
        }
        return t10;
    }
}
