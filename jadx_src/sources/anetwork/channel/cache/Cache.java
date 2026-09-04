package anetwork.channel.cache;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public interface Cache {

    /* JADX INFO: compiled from: Taobao */
    public static class Entry implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f30149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f30150c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f30151d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f30152e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f30153f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Map<String, List<String>> f30154g = Collections.EMPTY_MAP;

        public boolean a() {
            return System.currentTimeMillis() <= this.f30153f;
        }
    }

    void clear();

    Entry get(String str);

    void put(String str, Entry entry);

    void remove(String str);
}
