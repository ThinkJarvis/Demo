package com.app.demo;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceFragmentCompat;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SettingsFragment extends PreferenceFragmentCompat implements Preference.OnPreferenceClickListener {

    public static final String FRAGMENT_TAG = SettingsFragment.class.getSimpleName();

    private HashMap mPreferences = new HashMap();

    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        getPreferenceManager().setSharedPreferencesName("mysetting");
        addPreferencesFromResource(R.xml.settingsfragment);
        MenuPreference networkPreference = (MenuPreference) findPreference("network");
        MenuPreference displayPreference = (MenuPreference) findPreference("display");
        MenuPreference remindPreference = (MenuPreference) findPreference("remind");
        MenuPreference soundPreference = (MenuPreference) findPreference("sound");
        MenuPreference vehiclePreference = (MenuPreference) findPreference("vehicle");
        MenuPreference systemPreference = (MenuPreference) findPreference("system");

        networkPreference.setOnPreferenceClickListener(this);
        displayPreference.setOnPreferenceClickListener(this);
        remindPreference.setOnPreferenceClickListener(this);
        soundPreference.setOnPreferenceClickListener(this);
        vehiclePreference.setOnPreferenceClickListener(this);
        systemPreference.setOnPreferenceClickListener(this);


        networkPreference.performClick();

        mPreferences.put("network", networkPreference);
        mPreferences.put("display", displayPreference);
        mPreferences.put("remind", remindPreference);
        mPreferences.put("sound", soundPreference);
        mPreferences.put("vehicle", vehiclePreference);
        mPreferences.put("system", systemPreference);


    }

    @Override
    public boolean onPreferenceClick(Preference preference) {
        if (preference.getFragment() == null)
            return false;
        Fragment fragment = Fragment.instantiate(getContext(), preference.getFragment());
        if (fragment != null) {
            Iterator iterator = mPreferences.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry) iterator.next();
                MenuPreference normalPreference = (MenuPreference) entry.getValue();
                if (normalPreference.getItemView() != null) {
                    normalPreference.getItemView().setBackgroundColor(Color.TRANSPARENT);
                }
            }

            if (((MenuPreference) preference).getItemView() != null) {
                ((MenuPreference) preference).getItemView().setBackgroundColor(Color.RED);
            }
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment, preference.getFragment()).commit();
        }
        return true;
    }


}
