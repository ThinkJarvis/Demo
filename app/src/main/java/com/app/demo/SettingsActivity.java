package com.app.demo;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        List<Preference> preferences = getPreferences(this, R.xml.menupreference);
//        for (int i = 0; i < preferences.size(); i++) {
//            Log.e("wjq", preferences.get(i).getFragment());
//        }

    }


    private List<Preference> getPreferences(Context context, int xmlId) {
        XmlResourceParser xmlResourceParser = context.getResources().getXml(xmlId);
        if (xmlResourceParser == null) return null;
        List<Preference> preferences = null;
        Preference preference = null;
        try {
            int root = xmlResourceParser.getEventType();
            Log.e("wjq", "root = " + root);
            while (root != XmlResourceParser.END_DOCUMENT) {
                switch (root) {
                    case XmlResourceParser.START_DOCUMENT:
                        preferences = new ArrayList<Preference>();
                        break;
                    case XmlResourceParser.START_TAG:
                        if ("PreferenceScreen".equals(xmlResourceParser.getName())) {
                            preferences.clear();
                        } else if ("Preference".equals(xmlResourceParser.getName())) {
                            preference = new Preference();
//                            String fragment = xmlResourceParser.getAttributeValue(null, "android:fragment");
//                            String icon = xmlResourceParser.getAttributeValue(null, "android:icon");
//                            String key = xmlResourceParser.getAttributeValue(null, "android:key");
//                            String title = xmlResourceParser.getAttributeValue(null, "android:title");\

                            String fragment = xmlResourceParser.getAttributeValue("android", "fragment");
                            Log.e("wjq", "fragment = " + fragment);


                        }
                        break;
                    case XmlResourceParser.END_TAG:
                        if ("Preference".equals(xmlResourceParser.getName())) {
                            Log.e("wjq", "111111111111111111111111");
                            preferences.add(preference);
                            preference = null;
                        } else if ("PreferenceScreen".equals(xmlResourceParser.getName())) {
                        }
                        break;
                    default:
                        break;
                }
                root = xmlResourceParser.next();
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return preferences;
    }
}
