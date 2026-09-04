package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: StateSet.java */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f19746h = "ConstraintLayoutStates";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final boolean f19747i = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    c f19749b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f19748a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f19750c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f19751d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SparseArray<a> f19752e = new SparseArray<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SparseArray<c> f19753f = new SparseArray<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f19754g = null;

    /* JADX INFO: compiled from: StateSet.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList<b> f19756b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f19757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f19758d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f19757c = -1;
            this.f19758d = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.f19412l0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.State_android_id) {
                    this.f19755a = typedArrayObtainStyledAttributes.getResourceId(index, this.f19755a);
                } else if (index == R.styleable.State_constraints) {
                    this.f19757c = typedArrayObtainStyledAttributes.getResourceId(index, this.f19757c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f19757c);
                    context.getResources().getResourceName(this.f19757c);
                    if (com.google.android.exoplayer2.text.ttml.d.f49813w.equals(resourceTypeName)) {
                        this.f19758d = true;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f19756b.add(bVar);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f19756b.size(); i10++) {
                if (this.f19756b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: StateSet.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f19760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f19761c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f19762d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f19763e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f19764f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f19765g;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f19760b = Float.NaN;
            this.f19761c = Float.NaN;
            this.f19762d = Float.NaN;
            this.f19763e = Float.NaN;
            this.f19764f = -1;
            this.f19765g = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.f19432v0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.Variant_constraints) {
                    this.f19764f = typedArrayObtainStyledAttributes.getResourceId(index, this.f19764f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f19764f);
                    context.getResources().getResourceName(this.f19764f);
                    if (com.google.android.exoplayer2.text.ttml.d.f49813w.equals(resourceTypeName)) {
                        this.f19765g = true;
                    }
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.f19763e = typedArrayObtainStyledAttributes.getDimension(index, this.f19763e);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.f19761c = typedArrayObtainStyledAttributes.getDimension(index, this.f19761c);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.f19762d = typedArrayObtainStyledAttributes.getDimension(index, this.f19762d);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.f19760b = typedArrayObtainStyledAttributes.getDimension(index, this.f19760b);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f19760b) && f10 < this.f19760b) {
                return false;
            }
            if (!Float.isNaN(this.f19761c) && f11 < this.f19761c) {
                return false;
            }
            if (Float.isNaN(this.f19762d) || f10 <= this.f19762d) {
                return Float.isNaN(this.f19763e) || f11 <= this.f19763e;
            }
            return false;
        }
    }

    public f(Context context, XmlPullParser xmlPullParser) {
        b(context, xmlPullParser);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void b(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.f19418o0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == R.styleable.StateSet_defaultState) {
                this.f19748a = typedArrayObtainStyledAttributes.getResourceId(index, this.f19748a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        a aVar = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (true) {
                byte b10 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                b10 = 2;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                b10 = 0;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                b10 = -1;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b10 = 3;
                            } else {
                                b10 = -1;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if (b10 == 2) {
                        aVar = new a(context, xmlPullParser);
                        this.f19752e.put(aVar.f19755a, aVar);
                    } else if (b10 == 3) {
                        b bVar = new b(context, xmlPullParser);
                        if (aVar != null) {
                            aVar.a(bVar);
                        }
                    }
                } else if (eventType == 3 && "StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    public int a(int i10, int i11, float f10, float f11) {
        a aVar = this.f19752e.get(i11);
        if (aVar == null) {
            return i11;
        }
        if (f10 == -1.0f || f11 == -1.0f) {
            if (aVar.f19757c == i10) {
                return i10;
            }
            Iterator<b> it = aVar.f19756b.iterator();
            while (it.hasNext()) {
                if (i10 == it.next().f19764f) {
                    return i10;
                }
            }
            return aVar.f19757c;
        }
        b bVar = null;
        for (b bVar2 : aVar.f19756b) {
            if (bVar2.a(f10, f11)) {
                if (i10 == bVar2.f19764f) {
                    return i10;
                }
                bVar = bVar2;
            }
        }
        return bVar != null ? bVar.f19764f : aVar.f19757c;
    }

    public boolean c(int i10, float f10, float f11) {
        int i11 = this.f19750c;
        if (i11 != i10) {
            return true;
        }
        a aVarValueAt = i10 == -1 ? this.f19752e.valueAt(0) : this.f19752e.get(i11);
        int i12 = this.f19751d;
        return (i12 == -1 || !aVarValueAt.f19756b.get(i12).a(f10, f11)) && this.f19751d != aVarValueAt.b(f10, f11);
    }

    public void d(d dVar) {
        this.f19754g = dVar;
    }

    public int e(int i10, int i11, int i12) {
        return f(-1, i10, i11, i12);
    }

    public int f(int i10, int i11, float f10, float f11) {
        int iB;
        if (i10 != i11) {
            a aVar = this.f19752e.get(i11);
            if (aVar == null) {
                return -1;
            }
            int iB2 = aVar.b(f10, f11);
            return iB2 == -1 ? aVar.f19757c : aVar.f19756b.get(iB2).f19764f;
        }
        a aVarValueAt = i11 == -1 ? this.f19752e.valueAt(0) : this.f19752e.get(this.f19750c);
        if (aVarValueAt == null) {
            return -1;
        }
        if ((this.f19751d == -1 || !aVarValueAt.f19756b.get(i10).a(f10, f11)) && i10 != (iB = aVarValueAt.b(f10, f11))) {
            return iB == -1 ? aVarValueAt.f19757c : aVarValueAt.f19756b.get(iB).f19764f;
        }
        return i10;
    }
}
