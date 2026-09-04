package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: KeyFrames.java */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f18796b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f18797c = "CustomMethod";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f18798d = "CustomAttribute";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static HashMap<String, Constructor<? extends f>> f18799e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f18800f = "KeyFrames";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<Integer, ArrayList<f>> f18801a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends f>> map = new HashMap<>();
        f18799e = map;
        try {
            map.put("KeyAttribute", g.class.getConstructor(new Class[0]));
            f18799e.put("KeyPosition", j.class.getConstructor(new Class[0]));
            f18799e.put("KeyCycle", h.class.getConstructor(new Class[0]));
            f18799e.put("KeyTimeCycle", l.class.getConstructor(new Class[0]));
            f18799e.put("KeyTrigger", m.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e10) {
            Log.e(f18800f, "unable to load", e10);
        }
    }

    public i() {
    }

    public i(Context context, XmlPullParser xmlPullParser) {
        f fVarNewInstance;
        Exception e10;
        HashMap<String, ConstraintAttribute> map;
        HashMap<String, ConstraintAttribute> map2;
        f fVar = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (f18799e.containsKey(name)) {
                        try {
                            Constructor<? extends f> constructor = f18799e.get(name);
                            if (constructor == null) {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                            }
                            fVarNewInstance = constructor.newInstance(new Object[0]);
                            try {
                                fVarNewInstance.f(context, Xml.asAttributeSet(xmlPullParser));
                                c(fVarNewInstance);
                            } catch (Exception e11) {
                                e10 = e11;
                                Log.e(f18800f, "unable to create ", e10);
                            }
                            fVar = fVarNewInstance;
                        } catch (Exception e12) {
                            fVarNewInstance = fVar;
                            e10 = e12;
                        }
                        Log.e(f18800f, "unable to create ", e10);
                        fVar = fVarNewInstance;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (fVar != null && (map2 = fVar.f18743e) != null) {
                            ConstraintAttribute.j(context, xmlPullParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && fVar != null && (map = fVar.f18743e) != null) {
                        ConstraintAttribute.j(context, xmlPullParser, map);
                    }
                } else if (eventType == 3 && z.f19088z.equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e13) {
            e13.printStackTrace();
        } catch (XmlPullParserException e14) {
            e14.printStackTrace();
        }
    }

    static String f(int i10, Context context) {
        return context.getResources().getResourceEntryName(i10);
    }

    public void a(o oVar) {
        ArrayList<f> arrayList = this.f18801a.get(-1);
        if (arrayList != null) {
            oVar.b(arrayList);
        }
    }

    public void b(o oVar) {
        ArrayList<f> arrayList = this.f18801a.get(Integer.valueOf(oVar.f18914c));
        if (arrayList != null) {
            oVar.b(arrayList);
        }
        ArrayList<f> arrayList2 = this.f18801a.get(-1);
        if (arrayList2 != null) {
            for (f fVar : arrayList2) {
                if (fVar.g(((ConstraintLayout.LayoutParams) oVar.f18913b.getLayoutParams()).f19289b0)) {
                    oVar.a(fVar);
                }
            }
        }
    }

    public void c(f fVar) {
        if (!this.f18801a.containsKey(Integer.valueOf(fVar.f18740b))) {
            this.f18801a.put(Integer.valueOf(fVar.f18740b), new ArrayList<>());
        }
        ArrayList<f> arrayList = this.f18801a.get(Integer.valueOf(fVar.f18740b));
        if (arrayList != null) {
            arrayList.add(fVar);
        }
    }

    public ArrayList<f> d(int i10) {
        return this.f18801a.get(Integer.valueOf(i10));
    }

    public Set<Integer> e() {
        return this.f18801a.keySet();
    }
}
