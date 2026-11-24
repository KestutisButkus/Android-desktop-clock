package lt.laikrodis.widget

import android.app.Activity
import android.appwidget.AppWidgetManager
import android.content.ComponentName
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val statusText = findViewById<TextView>(R.id.status_text)
        val pinButton = findViewById<Button>(R.id.pin_widget_button)

        pinButton.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val appWidgetManager = AppWidgetManager.getInstance(this)
                val provider = ComponentName(this, ClockWidgetProvider::class.java)
                if (appWidgetManager.isRequestPinAppWidgetSupported) {
                    appWidgetManager.requestPinAppWidget(provider, null, null)
                    statusText.text = getString(R.string.pin_requested)
                } else {
                    statusText.text = getString(R.string.manual_instructions)
                }
            } else {
                statusText.text = getString(R.string.manual_instructions)
            }
        }
    }
}
