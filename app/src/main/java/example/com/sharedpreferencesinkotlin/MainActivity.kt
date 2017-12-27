package example.com.sharedpreferencesinkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txt_result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_result = findViewById(R.id.txt_result) as TextView

        val preference = MyPreference(this@MainActivity)
        var loginCount = preference.getLoginCount()
        loginCount++
        preference.setLoginCount(loginCount)
        txt_result.text = loginCount.toString()
    }
}
