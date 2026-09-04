package org.apache.tools.ant.util;

import java.util.Enumeration;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class LazyHashtable<K, V> extends Hashtable<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f136715b = false;

    protected void a() {
        if (this.f136715b) {
            return;
        }
        this.f136715b = true;
    }

    @Override // java.util.Hashtable
    public boolean contains(Object obj) {
        a();
        return super.contains(obj);
    }

    @Override // java.util.Hashtable, java.util.Map
    public boolean containsKey(Object obj) {
        a();
        return super.containsKey(obj);
    }

    @Override // java.util.Hashtable, java.util.Map
    public boolean containsValue(Object obj) {
        return contains(obj);
    }

    @Override // java.util.Hashtable, java.util.Dictionary
    public Enumeration<V> elements() {
        a();
        return super.elements();
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public boolean isEmpty() {
        a();
        return super.isEmpty();
    }

    @Override // java.util.Hashtable, java.util.Dictionary
    public Enumeration<K> keys() {
        a();
        return super.keys();
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public int size() {
        a();
        return super.size();
    }
}
