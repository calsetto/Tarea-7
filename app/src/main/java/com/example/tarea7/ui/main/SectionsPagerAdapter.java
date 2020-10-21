package com.example.tarea7.ui.main;

import android.content.Context;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tarea7.Canciones;
import com.example.tarea7.Contacto;
import com.example.tarea7.Inicio;
import com.example.tarea7.R;
import com.example.tarea7.Registro;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2,R.string.tab_text_3,
    R.string.tab_text_4};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position){
            case 0:
                Inicio inicio = new Inicio();
                //Toast.makeText(mContext, "Has pasado al tab de inicio ", Toast.LENGTH_SHORT).show();
                return inicio;
            case 1:
                Registro registro = new Registro();
                //Toast.makeText(mContext, "Has pasado al tab de registro ", Toast.LENGTH_SHORT).show();
                return registro;
            case 2:
                Contacto contacto = new Contacto();
                //Toast.makeText(mContext, "Has pasado al tab de contacto ", Toast.LENGTH_SHORT).show();
                return contacto;
            case 3:
                Canciones canciones = new Canciones();
                //Toast.makeText(mContext, "Has pasado al tab de canciones ", Toast.LENGTH_SHORT).show();
                return canciones;

        }
        return PlaceholderFragment.newInstance(position + 1);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 4;
    }
}