package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: TransitionInflater.java */
/* JADX INFO: loaded from: classes6.dex */
public class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f27941b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final androidx.collection.a<String, Constructor<?>> f27942c = new androidx.collection.a<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27943a;

    private t(@androidx.annotation.n0 Context context) {
        this.f27943a = context;
    }

    private Object a(AttributeSet attributeSet, Class<?> cls, String str) {
        Object objNewInstance;
        Class<? extends U> clsAsSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        if (attributeValue == null) {
            throw new InflateException(str + " tag must have a 'class' attribute");
        }
        try {
            androidx.collection.a<String, Constructor<?>> aVar = f27942c;
            synchronized (aVar) {
                Constructor<?> constructor = aVar.get(attributeValue);
                if (constructor == null && (clsAsSubclass = Class.forName(attributeValue, false, this.f27943a.getClassLoader()).asSubclass(cls)) != 0) {
                    constructor = clsAsSubclass.getConstructor(f27941b);
                    constructor.setAccessible(true);
                    aVar.put(attributeValue, constructor);
                }
                objNewInstance = constructor.newInstance(this.f27943a, attributeSet);
            }
            return objNewInstance;
        } catch (Exception e10) {
            throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e10);
        }
    }

    private Transition b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Transition transition) throws XmlPullParserException, IOException {
        Transition transitionSet;
        int depth = xmlPullParser.getDepth();
        TransitionSet transitionSet2 = transition instanceof TransitionSet ? (TransitionSet) transition : null;
        loop0: while (true) {
            transitionSet = null;
            while (true) {
                int next = xmlPullParser.next();
                if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                    break loop0;
                }
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if ("fade".equals(name)) {
                        transitionSet = new Fade(this.f27943a, attributeSet);
                    } else if ("changeBounds".equals(name)) {
                        transitionSet = new ChangeBounds(this.f27943a, attributeSet);
                    } else if ("slide".equals(name)) {
                        transitionSet = new Slide(this.f27943a, attributeSet);
                    } else if ("explode".equals(name)) {
                        transitionSet = new Explode(this.f27943a, attributeSet);
                    } else if ("changeImageTransform".equals(name)) {
                        transitionSet = new ChangeImageTransform(this.f27943a, attributeSet);
                    } else if ("changeTransform".equals(name)) {
                        transitionSet = new ChangeTransform(this.f27943a, attributeSet);
                    } else if ("changeClipBounds".equals(name)) {
                        transitionSet = new ChangeClipBounds(this.f27943a, attributeSet);
                    } else if (androidx.constraintlayout.core.motion.utils.w.h.f18012f.equals(name)) {
                        transitionSet = new AutoTransition(this.f27943a, attributeSet);
                    } else if ("changeScroll".equals(name)) {
                        transitionSet = new ChangeScroll(this.f27943a, attributeSet);
                    } else if ("transitionSet".equals(name)) {
                        transitionSet = new TransitionSet(this.f27943a, attributeSet);
                    } else if ("transition".equals(name)) {
                        transitionSet = (Transition) a(attributeSet, Transition.class, "transition");
                    } else if ("targets".equals(name)) {
                        e(xmlPullParser, attributeSet, transition);
                    } else if ("arcMotion".equals(name)) {
                        if (transition == null) {
                            throw new RuntimeException("Invalid use of arcMotion element");
                        }
                        transition.A0(new ArcMotion(this.f27943a, attributeSet));
                    } else if ("pathMotion".equals(name)) {
                        if (transition == null) {
                            throw new RuntimeException("Invalid use of pathMotion element");
                        }
                        transition.A0((PathMotion) a(attributeSet, PathMotion.class, "pathMotion"));
                    } else {
                        if (!"patternPathMotion".equals(name)) {
                            throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                        }
                        if (transition == null) {
                            throw new RuntimeException("Invalid use of patternPathMotion element");
                        }
                        transition.A0(new PatternPathMotion(this.f27943a, attributeSet));
                    }
                    if (transitionSet == null) {
                        continue;
                    } else {
                        if (!xmlPullParser.isEmptyElementTag()) {
                            b(xmlPullParser, attributeSet, transitionSet);
                        }
                        if (transitionSet2 != null) {
                            break;
                        }
                        if (transition != null) {
                            throw new InflateException("Could not add transition to another transition.");
                        }
                    }
                }
            }
            transitionSet2.N0(transitionSet);
        }
        return transitionSet;
    }

    private v c(XmlPullParser xmlPullParser, AttributeSet attributeSet, ViewGroup viewGroup) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        v vVar = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                break;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("transitionManager")) {
                    vVar = new v();
                } else {
                    if (!name.equals("transition") || vVar == null) {
                        throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                    }
                    h(attributeSet, xmlPullParser, viewGroup, vVar);
                }
            }
        }
        return vVar;
    }

    @androidx.annotation.n0
    public static t d(@androidx.annotation.n0 Context context) {
        return new t(context);
    }

    @SuppressLint({"RestrictedApi"})
    private void e(XmlPullParser xmlPullParser, AttributeSet attributeSet, Transition transition) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                if (!xmlPullParser.getName().equals("target")) {
                    throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                }
                TypedArray typedArrayObtainStyledAttributes = this.f27943a.obtainStyledAttributes(attributeSet, s.f27906a);
                int iL = androidx.core.content.res.q.l(typedArrayObtainStyledAttributes, xmlPullParser, "targetId", 1, 0);
                if (iL != 0) {
                    transition.b(iL);
                } else {
                    int iL2 = androidx.core.content.res.q.l(typedArrayObtainStyledAttributes, xmlPullParser, "excludeId", 2, 0);
                    if (iL2 != 0) {
                        transition.y(iL2, true);
                    } else {
                        String strM = androidx.core.content.res.q.m(typedArrayObtainStyledAttributes, xmlPullParser, "targetName", 4);
                        if (strM != null) {
                            transition.e(strM);
                        } else {
                            String strM2 = androidx.core.content.res.q.m(typedArrayObtainStyledAttributes, xmlPullParser, "excludeName", 5);
                            if (strM2 != null) {
                                transition.C(strM2, true);
                            } else {
                                String strM3 = androidx.core.content.res.q.m(typedArrayObtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                if (strM3 != null) {
                                    try {
                                        transition.B(Class.forName(strM3), true);
                                    } catch (ClassNotFoundException e10) {
                                        typedArrayObtainStyledAttributes.recycle();
                                        throw new RuntimeException("Could not create " + strM3, e10);
                                    }
                                } else {
                                    String strM4 = androidx.core.content.res.q.m(typedArrayObtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                    if (strM4 != null) {
                                        transition.d(Class.forName(strM4));
                                    }
                                }
                            }
                        }
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    private void h(AttributeSet attributeSet, XmlPullParser xmlPullParser, ViewGroup viewGroup, v vVar) throws Resources.NotFoundException {
        Transition transitionF;
        TypedArray typedArrayObtainStyledAttributes = this.f27943a.obtainStyledAttributes(attributeSet, s.f27907b);
        int iL = androidx.core.content.res.q.l(typedArrayObtainStyledAttributes, xmlPullParser, "transition", 2, -1);
        int iL2 = androidx.core.content.res.q.l(typedArrayObtainStyledAttributes, xmlPullParser, "fromScene", 0, -1);
        p pVarD = iL2 < 0 ? null : p.d(viewGroup, iL2, this.f27943a);
        int iL3 = androidx.core.content.res.q.l(typedArrayObtainStyledAttributes, xmlPullParser, "toScene", 1, -1);
        p pVarD2 = iL3 >= 0 ? p.d(viewGroup, iL3, this.f27943a) : null;
        if (iL >= 0 && (transitionF = f(iL)) != null) {
            if (pVarD2 == null) {
                throw new RuntimeException("No toScene for transition ID " + iL);
            }
            if (pVarD == null) {
                vVar.l(pVarD2, transitionF);
            } else {
                vVar.k(pVarD, pVarD2, transitionF);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public Transition f(int i10) {
        XmlResourceParser xml = this.f27943a.getResources().getXml(i10);
        try {
            try {
                Transition transitionB = b(xml, Xml.asAttributeSet(xml), null);
                xml.close();
                return transitionB;
            } catch (IOException e10) {
                throw new InflateException(xml.getPositionDescription() + ": " + e10.getMessage(), e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException(e11.getMessage(), e11);
            }
        } catch (Throwable th2) {
            xml.close();
            throw th2;
        }
    }

    public v g(int i10, ViewGroup viewGroup) {
        XmlResourceParser xml = this.f27943a.getResources().getXml(i10);
        try {
            try {
                v vVarC = c(xml, Xml.asAttributeSet(xml), viewGroup);
                xml.close();
                return vVarC;
            } catch (IOException e10) {
                InflateException inflateException = new InflateException(xml.getPositionDescription() + ": " + e10.getMessage());
                inflateException.initCause(e10);
                throw inflateException;
            } catch (XmlPullParserException e11) {
                InflateException inflateException2 = new InflateException(e11.getMessage());
                inflateException2.initCause(e11);
                throw inflateException2;
            }
        } catch (Throwable th2) {
            xml.close();
            throw th2;
        }
    }
}
