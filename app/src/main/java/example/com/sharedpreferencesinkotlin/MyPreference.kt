package example.com.sharedpreferencesinkotlin

import android.content.Context

/**
 * Created by User on 12/22/2017.
 */
class MyPreference(context: Context) {

    val PREFERENCE_NAME = "SharedPreference"
    val LOGIN_COUNT = "login_count"

    val preference = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)

    fun getLoginCount(): Int {
        return preference.getInt(LOGIN_COUNT, 0)
    }

    fun setLoginCount(count: Int) {

        val editor = preference.edit()
        editor.putInt(LOGIN_COUNT, count)
        editor.apply()

    }

}