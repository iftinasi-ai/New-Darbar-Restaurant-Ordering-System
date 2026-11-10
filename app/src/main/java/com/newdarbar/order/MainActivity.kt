
package com.newdarbar.order

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this)
        root.orientation = LinearLayout.VERTICAL
        root.setPadding(20, 30, 20, 20)
        root.setBackgroundColor(Color.rgb(50, 20, 85))

        val title = TextView(this)
        title.text = "NEW DARBAR"
        title.textSize = 28f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER
        root.addView(title)

        val subtitle = TextView(this)
        subtitle.text = "SELECT YOUR TABLE"
        subtitle.textSize = 20f
        subtitle.setTextColor(Color.YELLOW)
        subtitle.gravity = Gravity.CENTER
        subtitle.setPadding(0, 25, 0, 25)
        root.addView(subtitle)

        val scroll = ScrollView(this)
        val grid = GridLayout(this)
        grid.columnCount = 2

        for (i in 1..16) {
            val button = Button(this)
            button.text = "TABLE $i"

            button.setOnClickListener {
                Toast.makeText(
                    this,
                    "Table $i Selected",
                    Toast.LENGTH_SHORT
                ).show()
            }

            grid.addView(button)
        }

        scroll.addView(grid)
        root.addView(
            scroll,
            LinearLayout.LayoutParams(
                -1, 0, 1f
            )
        )

        setContentView(root)
    }
}
