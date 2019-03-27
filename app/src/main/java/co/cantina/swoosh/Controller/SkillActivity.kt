package co.cantina.swoosh.Controller

import android.os.Bundle
import co.cantina.swoosh.Utilities.EXTRA_LEAGUE
import co.cantina.swoosh.R

class SkillActivity : BaseActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }
}
