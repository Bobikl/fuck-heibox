package org.apache.tools.ant.property;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: ResolvePropertyMap.java */
/* JADX INFO: loaded from: classes5.dex */
public class o implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f133588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f133589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Object> f133590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f133591e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<String> f133587a = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f133592f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f133593g = true;

    public o(Project project, a aVar, Collection<n> collection) {
        this.f133589c = aVar;
        this.f133588b = new m(project, collection, this);
    }

    @Deprecated
    public void a(Map<String, Object> map) {
        c(map, null, false);
    }

    @Deprecated
    public void b(Map<String, Object> map, String str) {
        c(map, null, false);
    }

    public void c(Map<String, Object> map, String str, boolean z10) {
        this.f133590d = map;
        this.f133591e = str;
        this.f133592f = z10;
        for (String str2 : map.keySet()) {
            this.f133593g = true;
            Object property = getProperty(str2);
            map.put(str2, property == null ? "" : property.toString());
        }
    }

    @Override // org.apache.tools.ant.property.a
    public Object getProperty(String str) {
        String str2;
        String str3;
        if (this.f133587a.contains(str)) {
            throw new BuildException("Property %s was circularly defined.", str);
        }
        try {
            if (this.f133591e == null || !(this.f133593g || this.f133592f)) {
                str2 = str;
            } else {
                str2 = this.f133591e + str;
            }
            Object property = this.f133589c.getProperty(str2);
            if (property == null) {
                this.f133587a.add(str);
                if (this.f133591e == null || this.f133593g || this.f133592f) {
                    str3 = str;
                } else {
                    str3 = this.f133591e + str;
                }
                this.f133593g = false;
                property = this.f133588b.g((String) this.f133590d.get(str3));
            }
            return property;
        } finally {
            this.f133587a.remove(str);
        }
    }
}
