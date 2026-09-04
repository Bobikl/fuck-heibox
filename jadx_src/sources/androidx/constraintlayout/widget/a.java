package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: ConstraintLayoutStates.java */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f19447h = "ConstraintLayoutStates";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final boolean f19448i = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f19449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    c f19450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f19451c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f19452d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SparseArray<C0115a> f19453e = new SparseArray<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SparseArray<c> f19454f = new SparseArray<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f19455g = null;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConstraintLayoutStates.java */
    public static class C0115a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList<b> f19457b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f19458c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        c f19459d;

        public C0115a(Context context, XmlPullParser xmlPullParser) {
            this.f19458c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.f19412l0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.State_android_id) {
                    this.f19456a = typedArrayObtainStyledAttributes.getResourceId(index, this.f19456a);
                } else if (index == R.styleable.State_constraints) {
                    this.f19458c = typedArrayObtainStyledAttributes.getResourceId(index, this.f19458c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f19458c);
                    context.getResources().getResourceName(this.f19458c);
                    if (com.google.android.exoplayer2.text.ttml.d.f49813w.equals(resourceTypeName)) {
                        c cVar = new c();
                        this.f19459d = cVar;
                        cVar.G(context, this.f19458c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f19457b.add(bVar);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f19457b.size(); i10++) {
                if (this.f19457b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: ConstraintLayoutStates.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f19461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f19462c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f19463d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f19464e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f19465f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        c f19466g;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f19461b = Float.NaN;
            this.f19462c = Float.NaN;
            this.f19463d = Float.NaN;
            this.f19464e = Float.NaN;
            this.f19465f = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.f19432v0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.Variant_constraints) {
                    this.f19465f = typedArrayObtainStyledAttributes.getResourceId(index, this.f19465f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f19465f);
                    context.getResources().getResourceName(this.f19465f);
                    if (com.google.android.exoplayer2.text.ttml.d.f49813w.equals(resourceTypeName)) {
                        c cVar = new c();
                        this.f19466g = cVar;
                        cVar.G(context, this.f19465f);
                    }
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.f19464e = typedArrayObtainStyledAttributes.getDimension(index, this.f19464e);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.f19462c = typedArrayObtainStyledAttributes.getDimension(index, this.f19462c);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.f19463d = typedArrayObtainStyledAttributes.getDimension(index, this.f19463d);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.f19461b = typedArrayObtainStyledAttributes.getDimension(index, this.f19461b);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f19461b) && f10 < this.f19461b) {
                return false;
            }
            if (!Float.isNaN(this.f19462c) && f11 < this.f19462c) {
                return false;
            }
            if (Float.isNaN(this.f19463d) || f10 <= this.f19463d) {
                return Float.isNaN(this.f19464e) || f11 <= this.f19464e;
            }
            return false;
        }
    }

    a(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f19449a = constraintLayout;
        a(context, i10);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void a(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        C0115a c0115a = null;
        try {
            int eventType = xml.getEventType();
            while (true) {
                byte b10 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (!name.equals("ConstraintSet")) {
                                b10 = -1;
                            } else {
                                b10 = 4;
                            }
                            break;
                        case 80204913:
                            if (!name.equals("State")) {
                                b10 = -1;
                            } else {
                                b10 = 2;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                b10 = -1;
                            }
                            break;
                        case 1657696882:
                            if (!name.equals("layoutDescription")) {
                                b10 = -1;
                            } else {
                                b10 = 0;
                            }
                            break;
                        case 1901439077:
                            if (!name.equals("Variant")) {
                                b10 = -1;
                            } else {
                                b10 = 3;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if (b10 == 2) {
                        c0115a = new C0115a(context, xml);
                        this.f19453e.put(c0115a.f19456a, c0115a);
                    } else if (b10 == 3) {
                        b bVar = new b(context, xml);
                        if (c0115a != null) {
                            c0115a.a(bVar);
                        }
                    } else if (b10 == 4) {
                        c(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    private void c(Context context, XmlPullParser xmlPullParser) {
        c cVar = new c();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                cVar.x0(context, xmlPullParser);
                this.f19454f.put(identifier, cVar);
                return;
            }
        }
    }

    public boolean b(int i10, float f10, float f11) {
        int i11 = this.f19451c;
        if (i11 != i10) {
            return true;
        }
        C0115a c0115aValueAt = i10 == -1 ? this.f19453e.valueAt(0) : this.f19453e.get(i11);
        int i12 = this.f19452d;
        return (i12 == -1 || !c0115aValueAt.f19457b.get(i12).a(f10, f11)) && this.f19452d != c0115aValueAt.b(f10, f11);
    }

    public void d(d dVar) {
        this.f19455g = dVar;
    }

    public void e(int i10, float f10, float f11) {
        int iB;
        int i11 = this.f19451c;
        if (i11 == i10) {
            C0115a c0115aValueAt = i10 == -1 ? this.f19453e.valueAt(0) : this.f19453e.get(i11);
            int i12 = this.f19452d;
            if ((i12 == -1 || !c0115aValueAt.f19457b.get(i12).a(f10, f11)) && this.f19452d != (iB = c0115aValueAt.b(f10, f11))) {
                c cVar = iB == -1 ? this.f19450b : c0115aValueAt.f19457b.get(iB).f19466g;
                int i13 = iB == -1 ? c0115aValueAt.f19458c : c0115aValueAt.f19457b.get(iB).f19465f;
                if (cVar == null) {
                    return;
                }
                this.f19452d = iB;
                d dVar = this.f19455g;
                if (dVar != null) {
                    dVar.b(-1, i13);
                }
                cVar.r(this.f19449a);
                d dVar2 = this.f19455g;
                if (dVar2 != null) {
                    dVar2.a(-1, i13);
                    return;
                }
                return;
            }
            return;
        }
        this.f19451c = i10;
        C0115a c0115a = this.f19453e.get(i10);
        int iB2 = c0115a.b(f10, f11);
        c cVar2 = iB2 == -1 ? c0115a.f19459d : c0115a.f19457b.get(iB2).f19466g;
        int i14 = iB2 == -1 ? c0115a.f19458c : c0115a.f19457b.get(iB2).f19465f;
        if (cVar2 == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f11);
            return;
        }
        this.f19452d = iB2;
        d dVar3 = this.f19455g;
        if (dVar3 != null) {
            dVar3.b(i10, i14);
        }
        cVar2.r(this.f19449a);
        d dVar4 = this.f19455g;
        if (dVar4 != null) {
            dVar4.a(i10, i14);
        }
    }
}
